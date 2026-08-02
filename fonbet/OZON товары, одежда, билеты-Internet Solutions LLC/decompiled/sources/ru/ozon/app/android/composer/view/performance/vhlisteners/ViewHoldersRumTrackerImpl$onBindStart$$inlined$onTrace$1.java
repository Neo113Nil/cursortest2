package ru.ozon.app.android.composer.view.performance.vhlisteners;

import Qj0.A0;
import Qj0.B;
import Qj0.C3884d;
import Qj0.C3885e;
import Qj0.F;
import Qj0.L;
import Qj0.P;
import Qj0.U;
import Qj0.t0;
import Qj0.x0;
import Sg.a;
import T00.e;
import T00.m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.tracker.performance.MetricType;
import ru.ozon.tracker.performance.ObjectTypes;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQj0/U;", "", "invoke", "(LQj0/U;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
public final class ViewHoldersRumTrackerImpl$onBindStart$$inlined$onTrace$1 extends AbstractC7737t implements Function1<U, Unit> {
    final /* synthetic */ k $holder$inlined;
    final /* synthetic */ m $layout$inlined;
    final /* synthetic */ String $traceId;
    final /* synthetic */ d $widgetInfo$inlined;
    final /* synthetic */ ViewHoldersRumTrackerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewHoldersRumTrackerImpl$onBindStart$$inlined$onTrace$1(String str, ViewHoldersRumTrackerImpl viewHoldersRumTrackerImpl, k kVar, m mVar, d dVar) {
        super(1);
        this.$traceId = str;
        this.this$0 = viewHoldersRumTrackerImpl;
        this.$holder$inlined = kVar;
        this.$layout$inlined = mVar;
        this.$widgetInfo$inlined = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(U u11) {
        invoke2(u11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(U beginTrace) {
        String url;
        a aVar;
        a aVar2;
        String f7;
        String i11;
        Intrinsics.checkNotNullParameter(beginTrace, "$this$beginTrace");
        U.p(beginTrace, MetricType.BIND_TIME_START, 0L, false, 2);
        url = this.this$0.url(this.$holder$inlined);
        Intrinsics.checkNotNullExpressionValue(url, "access$url(...)");
        beginTrace.n(new t0(url), true);
        beginTrace.n(new B(ObjectTypes.WIDGET), true);
        aVar = this.this$0.analyticsScreenStorage;
        Rg.a a11 = aVar.a();
        beginTrace.n(new F(String.valueOf(a11 != null ? a11.g() : null)), true);
        beginTrace.n(new P(String.valueOf(this.$layout$inlined.c())), true);
        beginTrace.n(new A0(this.$layout$inlined.e()), true);
        aVar2 = this.this$0.analyticsScreenStorage;
        Rg.a a12 = aVar2.a();
        if (a12 != null && (i11 = a12.i()) != null) {
            beginTrace.n(new L(i11), true);
        }
        T00.a b11 = this.$widgetInfo$inlined.b();
        if (b11 != null) {
            e h11 = b11.h();
            if (h11 != null && (f7 = h11.f()) != null) {
                beginTrace.n(new C3884d(f7), true);
            }
            String c11 = b11.c();
            if (c11 != null) {
                beginTrace.n(new C3885e(c11), true);
            }
            String n11 = b11.n();
            if (n11 != null) {
                beginTrace.n(new x0(n11), true);
            }
        }
    }
}
