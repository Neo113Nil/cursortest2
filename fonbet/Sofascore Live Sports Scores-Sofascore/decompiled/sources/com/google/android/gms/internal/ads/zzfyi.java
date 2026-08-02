package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.j4n;
import defpackage.jle;
import defpackage.wjn;
import defpackage.yz1;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzfyi {
    public static volatile int e = 1;
    public final Context a;
    public final Executor b;
    public final Task c;
    public final boolean d;

    public zzfyi(Context context, Executor executor, Task task, boolean z) {
        this.a = context;
        this.b = executor;
        this.c = task;
        this.d = z;
    }

    public static zzfyi a(Context context, Executor executor, boolean z) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z) {
            executor.execute(new wjn(23, context, taskCompletionSource));
        } else {
            executor.execute(new j4n(2, taskCompletionSource));
        }
        return new zzfyi(context, executor, taskCompletionSource.getTask(), z);
    }

    public void b(int i, long j) {
        e(i, j, null, null, null);
    }

    public void c(int i, long j, Exception exc) {
        e(i, j, exc, null, null);
    }

    public void d(int i, String str) {
        e(i, 0L, null, null, str);
    }

    public final Task e(int i, long j, Exception exc, String str, String str2) {
        if (!this.d) {
            return this.c.continueWith(this.b, jle.h);
        }
        Context context = this.a;
        zzaxg D = zzaxk.D();
        String packageName = context.getPackageName();
        D.n();
        ((zzaxk) D.b).E(packageName);
        D.n();
        ((zzaxk) D.b).F(j);
        int i2 = e;
        D.n();
        ((zzaxk) D.b).K(i2);
        if (exc != null) {
            Object obj = zzgvg.a;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            D.n();
            ((zzaxk) D.b).G(stringWriter2);
            String name = exc.getClass().getName();
            D.n();
            ((zzaxk) D.b).H(name);
        }
        if (str2 != null) {
            D.n();
            ((zzaxk) D.b).I(str2);
        }
        if (str != null) {
            D.n();
            ((zzaxk) D.b).J(str);
        }
        return this.c.continueWith(this.b, new yz1(D, i, 21));
    }
}
