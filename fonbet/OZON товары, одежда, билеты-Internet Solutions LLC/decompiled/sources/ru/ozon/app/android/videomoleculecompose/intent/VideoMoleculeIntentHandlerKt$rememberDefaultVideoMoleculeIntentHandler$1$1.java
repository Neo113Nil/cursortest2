package ru.ozon.app.android.videomoleculecompose.intent;

import S0.A1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "intent", "Lru/ozon/app/android/videomoleculecompose/intent/VideoMoleculeIntent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VideoMoleculeIntentHandlerKt$rememberDefaultVideoMoleculeIntentHandler$1$1 extends AbstractC7737t implements Function1<VideoMoleculeIntent, Unit> {
    final /* synthetic */ A1<Function1<Boolean, Unit>> $currentOnFullscreenChange$delegate;
    final /* synthetic */ BasePlayerController $playerController;
    final /* synthetic */ DefaultVideoMoleculeScrubSession $scrubSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    VideoMoleculeIntentHandlerKt$rememberDefaultVideoMoleculeIntentHandler$1$1(BasePlayerController basePlayerController, DefaultVideoMoleculeScrubSession defaultVideoMoleculeScrubSession, A1<? extends Function1<? super Boolean, Unit>> a12) {
        super(1);
        this.$playerController = basePlayerController;
        this.$scrubSession = defaultVideoMoleculeScrubSession;
        this.$currentOnFullscreenChange$delegate = a12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(VideoMoleculeIntent videoMoleculeIntent) {
        invoke2(videoMoleculeIntent);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(VideoMoleculeIntent intent) {
        Function1 rememberDefaultVideoMoleculeIntentHandler$lambda$0;
        Intrinsics.checkNotNullParameter(intent, "intent");
        BasePlayerController basePlayerController = this.$playerController;
        rememberDefaultVideoMoleculeIntentHandler$lambda$0 = VideoMoleculeIntentHandlerKt.rememberDefaultVideoMoleculeIntentHandler$lambda$0(this.$currentOnFullscreenChange$delegate);
        VideoMoleculeIntentHandlerKt.handleDefaultVideoMoleculeIntent(basePlayerController, intent, rememberDefaultVideoMoleculeIntentHandler$lambda$0, this.$scrubSession);
    }
}
