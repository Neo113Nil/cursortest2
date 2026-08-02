package com.google.android.play.core.integrity;

import Qa.G;
import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes3.dex */
abstract class y {

    /* renamed from: b, reason: collision with root package name */
    private final String f36653b;

    /* renamed from: c, reason: collision with root package name */
    private final long f36654c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f36656e;

    /* renamed from: a, reason: collision with root package name */
    private final G f36652a = new G("IntegrityDialogWrapper");

    /* renamed from: d, reason: collision with root package name */
    private final Object f36655d = new Object();

    public y(String str, long j10) {
        this.f36653b = str;
        this.f36654c = j10;
    }

    public final Task a(Activity activity, int i10) {
        synchronized (this.f36655d) {
            try {
                if (this.f36656e) {
                    return Tasks.forResult(0);
                }
                this.f36656e = true;
                this.f36652a.a("checkAndShowDialog(%s)", Integer.valueOf(i10));
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i10);
                bundle.putString("package.name", this.f36653b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 3);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.f36654c);
                return b(activity, bundle);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
