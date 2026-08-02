package ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.view;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class InsuranceCarouselHeaderKt$InsuranceCarouselHeader$6 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ ImageDTO $logoImage;
    final /* synthetic */ e $modifier;
    final /* synthetic */ TextDTO $subtitle;
    final /* synthetic */ TextDTO $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InsuranceCarouselHeaderKt$InsuranceCarouselHeader$6(e eVar, TextDTO textDTO, TextDTO textDTO2, ImageDTO imageDTO, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$title = textDTO;
        this.$subtitle = textDTO2;
        this.$logoImage = imageDTO;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        InsuranceCarouselHeaderKt.InsuranceCarouselHeader(this.$modifier, this.$title, this.$subtitle, this.$logoImage, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
