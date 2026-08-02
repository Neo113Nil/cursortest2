package ru.ozon.app.android.videomoleculecompose;

import S0.A1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.videomoleculecompose.intent.VideoMoleculeIntent;
import ru.ozon.app.android.videomoleculecompose.interaction.VideoMoleculeInteractionState;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "intent", "Lru/ozon/app/android/videomoleculecompose/intent/VideoMoleculeIntent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VideoMoleculeKt$rememberVideoMoleculeScrubIntentInterceptor$1$1 extends AbstractC7737t implements Function1<VideoMoleculeIntent, Unit> {
    final /* synthetic */ A1<Boolean> $currentIsPlaying$delegate;
    final /* synthetic */ A1<Function1<VideoMoleculeIntent, Unit>> $currentOnIntent$delegate;
    final /* synthetic */ VideoMoleculeInteractionState $interactionState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    VideoMoleculeKt$rememberVideoMoleculeScrubIntentInterceptor$1$1(VideoMoleculeInteractionState videoMoleculeInteractionState, A1<Boolean> a12, A1<? extends Function1<? super VideoMoleculeIntent, Unit>> a13) {
        super(1);
        this.$interactionState = videoMoleculeInteractionState;
        this.$currentIsPlaying$delegate = a12;
        this.$currentOnIntent$delegate = a13;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(VideoMoleculeIntent videoMoleculeIntent) {
        invoke2(videoMoleculeIntent);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(VideoMoleculeIntent intent) {
        Function1 rememberVideoMoleculeScrubIntentInterceptor$lambda$6;
        boolean rememberVideoMoleculeScrubIntentInterceptor$lambda$7;
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (intent instanceof VideoMoleculeIntent.ScrubStart) {
            VideoMoleculeInteractionState videoMoleculeInteractionState = this.$interactionState;
            long positionMs = ((VideoMoleculeIntent.ScrubStart) intent).getPositionMs();
            rememberVideoMoleculeScrubIntentInterceptor$lambda$7 = VideoMoleculeKt.rememberVideoMoleculeScrubIntentInterceptor$lambda$7(this.$currentIsPlaying$delegate);
            videoMoleculeInteractionState.startScrubbing$videomoleculecompose_prodGoogleAllVendorsRelease(positionMs, rememberVideoMoleculeScrubIntentInterceptor$lambda$7);
        } else if (intent instanceof VideoMoleculeIntent.ScrubMove) {
            this.$interactionState.updateScrubbing$videomoleculecompose_prodGoogleAllVendorsRelease(((VideoMoleculeIntent.ScrubMove) intent).getPositionMs());
        } else if (intent instanceof VideoMoleculeIntent.ScrubEnd) {
            VideoMoleculeIntent.ScrubEnd scrubEnd = (VideoMoleculeIntent.ScrubEnd) intent;
            this.$interactionState.endScrubbing$videomoleculecompose_prodGoogleAllVendorsRelease(scrubEnd.getPositionMs(), scrubEnd.getCanceled());
        }
        rememberVideoMoleculeScrubIntentInterceptor$lambda$6 = VideoMoleculeKt.rememberVideoMoleculeScrubIntentInterceptor$lambda$6(this.$currentOnIntent$delegate);
        rememberVideoMoleculeScrubIntentInterceptor$lambda$6.invoke(intent);
    }
}
