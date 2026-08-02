package ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.videomoleculecompose.intent.VideoMoleculeIntent;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "intent", "Lru/ozon/app/android/videomoleculecompose/intent/VideoMoleculeIntent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$customOnIntent$1$1 extends AbstractC7737t implements Function1<VideoMoleculeIntent, Unit> {
    final /* synthetic */ Function1<VideoMoleculeIntent, Unit> $onIntent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$customOnIntent$1$1(Function1<? super VideoMoleculeIntent, Unit> function1) {
        super(1);
        this.$onIntent = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(VideoMoleculeIntent videoMoleculeIntent) {
        invoke2(videoMoleculeIntent);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(VideoMoleculeIntent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        boolean z11 = intent instanceof VideoMoleculeIntent.Replay;
        this.$onIntent.invoke(intent);
    }
}
