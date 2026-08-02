package com.socure.idplus.device.internal;

import android.content.Context;
import com.socure.idplus.device.context.SigmaDeviceContext;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes8.dex */
public final class g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f856a;
    public final /* synthetic */ Ref.BooleanRef b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, Ref.BooleanRef booleanRef) {
        super(0);
        this.f856a = jVar;
        this.b = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context;
        WeakReference weakReference = this.f856a.g;
        if (weakReference != null && (context = (Context) weakReference.get()) != null) {
            this.f856a.a(context, new SigmaDeviceContext.Default(), new e(this.f856a, context, this.b), new f(this.f856a));
        }
        return Unit.INSTANCE;
    }
}
