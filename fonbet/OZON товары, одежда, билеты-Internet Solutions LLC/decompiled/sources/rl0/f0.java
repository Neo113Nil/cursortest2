package rl0;

import android.content.Context;
import android.content.ServiceConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f0 extends AbstractC7737t implements Function1<lm0.e<Unit>, ServiceConnection> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f83679b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Y y11) {
        super(1);
        this.f83679b = y11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ServiceConnection invoke(lm0.e<Unit> eVar) {
        lm0.e<Unit> emitter = eVar;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        Context context = this.f83679b.f83656a;
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        return new S(context, packageName, new nm0.f(emitter, 1), new d0(emitter));
    }
}
