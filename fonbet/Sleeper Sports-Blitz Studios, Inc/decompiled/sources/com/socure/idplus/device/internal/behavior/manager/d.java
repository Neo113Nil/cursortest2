package com.socure.idplus.device.internal.behavior.manager;

import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f848a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar) {
        super(0);
        this.f848a = fVar;
    }

    public final void a() {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            this.f848a.b();
        } else {
            final f fVar = this.f848a;
            fVar.j.post(new Runnable() { // from class: com.socure.idplus.device.internal.behavior.manager.d$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    d.a(f.this);
                }
            });
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        a();
        return Unit.INSTANCE;
    }

    public static final void a(f this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b();
    }
}
