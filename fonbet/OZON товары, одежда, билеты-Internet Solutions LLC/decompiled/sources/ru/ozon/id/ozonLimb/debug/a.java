package ru.ozon.id.ozonLimb.debug;

import androidx.activity.C;
import androidx.fragment.app.G;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class a extends AbstractC7737t implements Function1<C, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ OzonIdDebugActivity f97525b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(OzonIdDebugActivity ozonIdDebugActivity) {
        super(1);
        this.f97525b = ozonIdDebugActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C c11) {
        C addCallback = c11;
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        OzonIdDebugActivity ozonIdDebugActivity = this.f97525b;
        int i11 = OzonIdDebugActivity.f97514l;
        G supportFragmentManager = ozonIdDebugActivity.getSupportFragmentManager();
        if (ozonIdDebugActivity.getSupportFragmentManager().l0() > 0) {
            supportFragmentManager.P0();
        } else {
            ozonIdDebugActivity.finish();
        }
        return Unit.f71690a;
    }
}
