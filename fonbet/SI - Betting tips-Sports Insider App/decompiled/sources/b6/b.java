package b6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.appcompat.app.v0;
import com.google.android.gms.cloudmessaging.zzd;
import io.sentry.android.core.w0;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static int f3032h;

    /* renamed from: i, reason: collision with root package name */
    public static PendingIntent f3033i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    public final Context f3035b;

    /* renamed from: c, reason: collision with root package name */
    public final q f3036c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f3037d;

    /* renamed from: f, reason: collision with root package name */
    public Messenger f3039f;

    /* renamed from: g, reason: collision with root package name */
    public zzd f3040g;

    /* renamed from: a, reason: collision with root package name */
    public final s.n f3034a = new s.n(0);

    /* renamed from: e, reason: collision with root package name */
    public final Messenger f3038e = new Messenger(new e(this, Looper.getMainLooper()));

    public b(Context context) {
        this.f3035b = context;
        this.f3036c = new q(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f3037d = scheduledThreadPoolExecutor;
    }

    public static synchronized String b() {
        String num;
        synchronized (b.class) {
            int i5 = f3032h;
            f3032h = i5 + 1;
            num = Integer.toString(i5);
        }
        return num;
    }

    public static synchronized void c(Context context, Intent intent) {
        synchronized (b.class) {
            try {
                if (f3033i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f3033i = PendingIntent.getBroadcast(context, 0, intent2, i7.a.f11000a);
                }
                intent.putExtra("app", f3033i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final w7.m a(Bundle bundle) {
        String b10 = b();
        w7.g gVar = new w7.g();
        synchronized (this.f3034a) {
            this.f3034a.put(b10, gVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f3036c.c() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        c(this.f3035b, intent);
        intent.putExtra("kid", "|ID|" + b10 + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f3038e);
        if (this.f3039f != null || this.f3040g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f3039f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f3040g.f4438a;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            gVar.f24979a.b(g.f3048c, new v0(this, b10, this.f3037d.schedule(new androidx.core.widget.b(2, gVar), 30L, TimeUnit.SECONDS), 2));
            return gVar.f24979a;
        }
        if (this.f3036c.c() == 2) {
            this.f3035b.sendBroadcast(intent);
        } else {
            this.f3035b.startService(intent);
        }
        gVar.f24979a.b(g.f3048c, new v0(this, b10, this.f3037d.schedule(new androidx.core.widget.b(2, gVar), 30L, TimeUnit.SECONDS), 2));
        return gVar.f24979a;
    }

    public final void d(Bundle bundle, String str) {
        synchronized (this.f3034a) {
            try {
                w7.g gVar = (w7.g) this.f3034a.remove(str);
                if (gVar != null) {
                    gVar.b(bundle);
                    return;
                }
                w0.m("Rpc", "Missing callback for " + str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
