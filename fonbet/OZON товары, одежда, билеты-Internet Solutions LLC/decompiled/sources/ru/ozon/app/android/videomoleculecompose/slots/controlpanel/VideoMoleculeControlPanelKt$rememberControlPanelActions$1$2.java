package ru.ozon.app.android.videomoleculecompose.slots.controlpanel;

import S0.A1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.videomoleculecompose.intent.VideoMoleculeIntent;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VideoMoleculeControlPanelKt$rememberControlPanelActions$1$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ A1<Boolean> $currentIsFullscreen$delegate;
    final /* synthetic */ A1<Function1<VideoMoleculeIntent, Unit>> $currentOnIntent$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    VideoMoleculeControlPanelKt$rememberControlPanelActions$1$2(A1<? extends Function1<? super VideoMoleculeIntent, Unit>> a12, A1<Boolean> a13) {
        super(0);
        this.$currentOnIntent$delegate = a12;
        this.$currentIsFullscreen$delegate = a13;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function1 rememberControlPanelActions$lambda$15;
        boolean rememberControlPanelActions$lambda$14;
        rememberControlPanelActions$lambda$15 = VideoMoleculeControlPanelKt.rememberControlPanelActions$lambda$15(this.$currentOnIntent$delegate);
        rememberControlPanelActions$lambda$14 = VideoMoleculeControlPanelKt.rememberControlPanelActions$lambda$14(this.$currentIsFullscreen$delegate);
        rememberControlPanelActions$lambda$15.invoke(new VideoMoleculeIntent.SwitchFullscreen(!rememberControlPanelActions$lambda$14));
    }
}
