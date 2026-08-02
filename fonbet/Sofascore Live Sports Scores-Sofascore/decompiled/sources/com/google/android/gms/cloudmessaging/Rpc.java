package com.google.android.gms.cloudmessaging;

import android.app.BroadcastOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.cloudmessaging.zzr;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.bdp;
import defpackage.fhh;
import defpackage.g35;
import defpackage.j4n;
import defpackage.wt3;
import defpackage.x6k;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class Rpc {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context b;
    public final zzw c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f;
    public zzd g;
    public final fhh a = new fhh(0);
    public final Messenger e = new Messenger(new bdp(this, Looper.getMainLooper()));

    public Rpc(Context context) {
        this.b = context;
        this.c = new zzw(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("fcm-rpc-timeout-executor"));
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public final void a(Bundle bundle, String str) {
        fhh fhhVar = this.a;
        synchronized (fhhVar) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) fhhVar.remove(str);
                if (taskCompletionSource == null) {
                    new StringBuilder(String.valueOf(str).length() + 21);
                } else {
                    taskCompletionSource.setResult(bundle);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Task b(Bundle bundle) {
        String num;
        int i2;
        synchronized (Rpc.class) {
            int i3 = h;
            h = i3 + 1;
            num = Integer.toString(i3);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        fhh fhhVar = this.a;
        synchronized (fhhVar) {
            fhhVar.put(num, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.a() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.b;
        synchronized (Rpc.class) {
            try {
                PendingIntent pendingIntent = i;
                i2 = 0;
                if (pendingIntent == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, zzr.a);
                    i = pendingIntent;
                }
                intent.putExtra("app", pendingIntent);
            } finally {
            }
        }
        intent.putExtra("kid", wt3.m("|ID|", num, new StringBuilder(String.valueOf(num).length() + 5), "|"));
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f != null || this.g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.g.a.send(obtain);
                }
            } catch (RemoteException unused) {
            }
            taskCompletionSource.getTask().addOnCompleteListener(g35.d, new x6k(22, this, num, this.d.schedule(new j4n(i2, taskCompletionSource), 30L, TimeUnit.SECONDS)));
            return taskCompletionSource.getTask();
        }
        int a = this.c.a();
        Context context2 = this.b;
        if (a != 2) {
            context2.startService(intent);
        } else if (Build.VERSION.SDK_INT < 34) {
            context2.sendBroadcast(intent);
        } else {
            context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
        taskCompletionSource.getTask().addOnCompleteListener(g35.d, new x6k(22, this, num, this.d.schedule(new j4n(i2, taskCompletionSource), 30L, TimeUnit.SECONDS)));
        return taskCompletionSource.getTask();
    }
}
