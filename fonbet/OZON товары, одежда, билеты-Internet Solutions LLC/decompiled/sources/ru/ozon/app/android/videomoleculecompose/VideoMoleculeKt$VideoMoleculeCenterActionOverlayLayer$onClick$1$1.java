package ru.ozon.app.android.videomoleculecompose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.videomoleculecompose.intent.VideoMoleculeIntent;
import ru.ozon.app.android.videomoleculecompose.slots.centeraction.VideoMoleculeCenterAction;
import ru.ozon.app.android.videomoleculecompose.slots.centeraction.VideoMoleculeCenterActionKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VideoMoleculeKt$VideoMoleculeCenterActionOverlayLayer$onClick$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ VideoMoleculeCenterAction $centerAction;
    final /* synthetic */ Function1<VideoMoleculeIntent, Unit> $onIntent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    VideoMoleculeKt$VideoMoleculeCenterActionOverlayLayer$onClick$1$1(Function1<? super VideoMoleculeIntent, Unit> function1, VideoMoleculeCenterAction videoMoleculeCenterAction) {
        super(0);
        this.$onIntent = function1;
        this.$centerAction = videoMoleculeCenterAction;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onIntent.invoke(VideoMoleculeCenterActionKt.toIntent(this.$centerAction));
    }
}
