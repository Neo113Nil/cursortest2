package ru.ozon.uni.ozi.components.heading;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OziHeadingKt$OziHeading$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC6511n<OziHeadingEndScope, InterfaceC3967k, Integer, Unit> $endContent;
    final /* synthetic */ e $modifier;
    final /* synthetic */ OziHeadingStatus $status;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ boolean $subtitleExpandable;
    final /* synthetic */ int $subtitleLineLimit;
    final /* synthetic */ String $title;
    final /* synthetic */ boolean $titleExpandable;
    final /* synthetic */ int $titleLineLimit;
    final /* synthetic */ InterfaceC6511n<OziHeadingTopScope, InterfaceC3967k, Integer, Unit> $topContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OziHeadingKt$OziHeading$2(e eVar, String str, InterfaceC6511n<? super OziHeadingTopScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, InterfaceC6511n<? super OziHeadingEndScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n2, int i11, boolean z11, String str2, int i12, boolean z12, OziHeadingStatus oziHeadingStatus, int i13, int i14) {
        super(2);
        this.$modifier = eVar;
        this.$title = str;
        this.$topContent = interfaceC6511n;
        this.$endContent = interfaceC6511n2;
        this.$titleLineLimit = i11;
        this.$titleExpandable = z11;
        this.$subtitle = str2;
        this.$subtitleLineLimit = i12;
        this.$subtitleExpandable = z12;
        this.$status = oziHeadingStatus;
        this.$$changed = i13;
        this.$$default = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        OziHeadingKt.OziHeading(this.$modifier, this.$title, this.$topContent, this.$endContent, this.$titleLineLimit, this.$titleExpandable, this.$subtitle, this.$subtitleLineLimit, this.$subtitleExpandable, this.$status, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
