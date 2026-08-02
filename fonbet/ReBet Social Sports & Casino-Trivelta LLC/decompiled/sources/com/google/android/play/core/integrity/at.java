package com.google.android.play.core.integrity;

import Qa.C1516f;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class at {

    /* renamed from: a, reason: collision with root package name */
    private final Qa.o f36569a;

    /* renamed from: b, reason: collision with root package name */
    private final Qa.o f36570b;

    public at(Qa.o oVar, Qa.o oVar2) {
        this.f36569a = oVar;
        this.f36570b = oVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, C1516f c1516f) {
        Object a10 = this.f36569a.a();
        a10.getClass();
        k kVar = (k) this.f36570b.a();
        kVar.getClass();
        activity.getClass();
        c1516f.getClass();
        return new as((Context) a10, kVar, activity, taskCompletionSource, c1516f);
    }
}
