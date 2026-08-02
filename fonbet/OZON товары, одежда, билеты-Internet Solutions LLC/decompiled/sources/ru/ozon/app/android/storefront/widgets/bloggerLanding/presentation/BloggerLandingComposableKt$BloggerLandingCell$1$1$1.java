package ru.ozon.app.android.storefront.widgets.bloggerLanding.presentation;

import P9.a;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n1.InterfaceC8412e;
import ru.ozon.app.android.storefront.widgets.bloggerLanding.data.LandingCell;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/e;", "", "invoke", "(Ln1/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class BloggerLandingComposableKt$BloggerLandingCell$1$1$1 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
    final /* synthetic */ LandingCell $cell;
    final /* synthetic */ boolean $isLast;
    final /* synthetic */ long $lineColor;
    final /* synthetic */ float $lineWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BloggerLandingComposableKt$BloggerLandingCell$1$1$1(LandingCell landingCell, boolean z11, long j11, float f7) {
        super(1);
        this.$cell = landingCell;
        this.$isLast = z11;
        this.$lineColor = j11;
        this.$lineWidth = f7;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8412e interfaceC8412e) {
        invoke2(interfaceC8412e);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8412e drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        float f7 = C7464j.f(drawBehind.i()) / 2.0f;
        IconDTO.IconSize size = this.$cell.getIcon().getSize();
        float px = ResourceExtKt.toPx(size != null ? size.getSizeShape() : 32);
        float d11 = C7464j.d(drawBehind.i());
        if (this.$isLast) {
            return;
        }
        drawBehind.U(this.$lineColor, a.a(f7, px), a.a(f7, d11), drawBehind.v1(this.$lineWidth), (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? null : null);
    }
}
