package D9;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.internal.cloudmessaging.zza;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: D9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1134b {

    /* renamed from: h, reason: collision with root package name */
    public static int f2611h;

    /* renamed from: i, reason: collision with root package name */
    public static PendingIntent f2612i;

    /* renamed from: j, reason: collision with root package name */
    public static final Executor f2613j = new Executor() { // from class: D9.E
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f2614k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    public final Context f2616b;

    /* renamed from: c, reason: collision with root package name */
    public final C f2617c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f2618d;

    /* renamed from: f, reason: collision with root package name */
    public Messenger f2620f;

    /* renamed from: g, reason: collision with root package name */
    public zzd f2621g;

    /* renamed from: a, reason: collision with root package name */
    public final z.r f2615a = new z.r();

    /* renamed from: e, reason: collision with root package name */
    public final Messenger f2619e = new Messenger(new h(this, Looper.getMainLooper()));

    public C1134b(Context context) {
        this.f2616b = context;
        this.f2617c = new C(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f2618d = scheduledThreadPoolExecutor;
    }

    public static /* synthetic */ Task e(Bundle bundle) {
        return m(bundle) ? Tasks.forResult(null) : Tasks.forResult(bundle);
    }

    public static /* bridge */ /* synthetic */ void g(C1134b c1134b, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new j());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        c1134b.f2621g = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c1134b.f2620f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        "Unexpected response action: ".concat(String.valueOf(action));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = f2614k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            "Unexpected response string: ".concat(stringExtra);
                            return;
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        c1134b.l(group, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Received InstanceID error ".concat(stringExtra2);
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (c1134b.f2615a) {
                        for (int i10 = 0; i10 < c1134b.f2615a.size(); i10++) {
                            try {
                                c1134b.l((String) c1134b.f2615a.f(i10), intent2.getExtras());
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return;
                }
                String[] split = stringExtra2.split("\\|");
                if (split.length <= 2 || !Objects.equals(split[1], "ID")) {
                    Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(":")) {
                    str2 = str2.substring(1);
                }
                c1134b.l(str, intent2.putExtra("error", str2).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    public static synchronized String j() {
        String num;
        synchronized (C1134b.class) {
            int i10 = f2611h;
            f2611h = i10 + 1;
            num = Integer.toString(i10);
        }
        return num;
    }

    public static synchronized void k(Context context, Intent intent) {
        synchronized (C1134b.class) {
            try {
                if (f2612i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f2612i = PendingIntent.getBroadcast(context, 0, intent2, zza.zza);
                }
                intent.putExtra("app", f2612i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean m(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public Task a() {
        return this.f2617c.a() >= 241100000 ? B.b(this.f2616b).d(5, Bundle.EMPTY).continueWith(f2613j, new Continuation() { // from class: D9.e
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new CloudMessage(intent);
                }
                return null;
            }
        }) : Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    public Task b(CloudMessage cloudMessage) {
        if (this.f2617c.a() < 233700000) {
            return Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", cloudMessage.h());
        Integer i10 = cloudMessage.i();
        if (i10 != null) {
            bundle.putInt("google.product_id", i10.intValue());
        }
        return B.b(this.f2616b).c(3, bundle);
    }

    public Task c(final Bundle bundle) {
        return this.f2617c.a() < 12000000 ? this.f2617c.b() != 0 ? i(bundle).continueWithTask(f2613j, new Continuation() { // from class: D9.F
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return C1134b.this.f(bundle, task);
            }
        }) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE")) : B.b(this.f2616b).d(1, bundle).continueWith(f2613j, new Continuation() { // from class: D9.d
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                if (task.isSuccessful()) {
                    return (Bundle) task.getResult();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Error making request: ".concat(String.valueOf(task.getException()));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
            }
        });
    }

    public Task d(boolean z10) {
        if (this.f2617c.a() < 241100000) {
            return Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z10);
        return B.b(this.f2616b).c(4, bundle);
    }

    public final /* synthetic */ Task f(Bundle bundle, Task task) {
        return (task.isSuccessful() && m((Bundle) task.getResult())) ? i(bundle).onSuccessTask(f2613j, new SuccessContinuation() { // from class: D9.D
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return C1134b.e((Bundle) obj);
            }
        }) : task;
    }

    public final /* synthetic */ void h(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f2615a) {
            this.f2615a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public final Task i(Bundle bundle) {
        final String j10 = j();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f2615a) {
            this.f2615a.put(j10, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f2617c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        k(this.f2616b, intent);
        intent.putExtra("kid", "|ID|" + j10 + "|");
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.f2619e);
        if (this.f2620f != null || this.f2621g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f2620f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f2621g.b(obtain);
                }
            } catch (RemoteException unused) {
                Log.isLoggable("Rpc", 3);
            }
            final ScheduledFuture<?> schedule = this.f2618d.schedule(new Runnable() { // from class: D9.f
                @Override // java.lang.Runnable
                public final void run() {
                    if (TaskCompletionSource.this.trySetException(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            taskCompletionSource.getTask().addOnCompleteListener(f2613j, new OnCompleteListener() { // from class: D9.g
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1134b.this.h(j10, schedule, task);
                }
            });
            return taskCompletionSource.getTask();
        }
        if (this.f2617c.b() == 2) {
            this.f2616b.sendBroadcast(intent);
        } else {
            this.f2616b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f2618d.schedule(new Runnable() { // from class: D9.f
            @Override // java.lang.Runnable
            public final void run() {
                if (TaskCompletionSource.this.trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        taskCompletionSource.getTask().addOnCompleteListener(f2613j, new OnCompleteListener() { // from class: D9.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1134b.this.h(j10, schedule2, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    public final void l(String str, Bundle bundle) {
        synchronized (this.f2615a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f2615a.remove(str);
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
