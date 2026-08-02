package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui;

import A0.h;
import Ag0.e;
import B1.InterfaceC2547p;
import B1.z0;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5182e;
import androidx.compose.foundation.layout.a0;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingVI;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ContentKt$Page$1$1$imagePlaceable$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ ImageSizeHelper $imageSizeHelper;
    final /* synthetic */ AppOnboardingVI.Content.Page $state;
    final /* synthetic */ z0 $this_SubcomposeLayout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentKt$Page$1$1$imagePlaceable$1(AppOnboardingVI.Content.Page page, z0 z0Var, ImageSizeHelper imageSizeHelper) {
        super(2);
        this.$state = page;
        this.$this_SubcomposeLayout = z0Var;
        this.$imageSizeHelper = imageSizeHelper;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else {
            e.a(this.$state.getImage(), C5182e.a(a0.n(C6988h.a(androidx.compose.ui.e.f40358c0, h.b(DsSpacings.INSTANCE.m1853getDp32D9Ej5fM())), this.$this_SubcomposeLayout.B(this.$imageSizeHelper.getImageSizeState())), 1.0f, false), null, null, InterfaceC2547p.a.a(), 0.0f, null, interfaceC3967k, 199680, 212);
        }
    }
}
