package ru.ozon.app.android.videomoleculecompose;

import B1.InterfaceC2547p;
import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6512o;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.BasePlayerComposableController;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VideoMoleculeKt$PlayerSurfaceLayer$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC2547p $contentScale;
    final /* synthetic */ boolean $isPreviewVisible;
    final /* synthetic */ e $modifier;
    final /* synthetic */ BasePlayerComposableController $playerComposableController;
    final /* synthetic */ InterfaceC6512o<Boolean, e, InterfaceC3967k, Integer, Unit> $preview;
    final /* synthetic */ C7464j $sourceSizeDp;
    final /* synthetic */ int $surfaceType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    VideoMoleculeKt$PlayerSurfaceLayer$2(BasePlayerComposableController basePlayerComposableController, InterfaceC2547p interfaceC2547p, int i11, C7464j c7464j, boolean z11, InterfaceC6512o<? super Boolean, ? super e, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6512o, e eVar, int i12, int i13) {
        super(2);
        this.$playerComposableController = basePlayerComposableController;
        this.$contentScale = interfaceC2547p;
        this.$surfaceType = i11;
        this.$sourceSizeDp = c7464j;
        this.$isPreviewVisible = z11;
        this.$preview = interfaceC6512o;
        this.$modifier = eVar;
        this.$$changed = i12;
        this.$$default = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        VideoMoleculeKt.m1548PlayerSurfaceLayervrY8oc(this.$playerComposableController, this.$contentScale, this.$surfaceType, this.$sourceSizeDp, this.$isPreviewVisible, this.$preview, this.$modifier, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
