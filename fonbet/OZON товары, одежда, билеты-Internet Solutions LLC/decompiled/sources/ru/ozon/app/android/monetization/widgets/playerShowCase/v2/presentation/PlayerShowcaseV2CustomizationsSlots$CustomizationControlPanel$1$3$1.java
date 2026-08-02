package ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.videomoleculecompose.intent.VideoMoleculeIntent;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "positionMs", "", "canceled", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PlayerShowcaseV2CustomizationsSlots$CustomizationControlPanel$1$3$1 extends AbstractC7737t implements Function2<Long, Boolean, Unit> {
    final /* synthetic */ Function1<VideoMoleculeIntent, Unit> $onIntent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PlayerShowcaseV2CustomizationsSlots$CustomizationControlPanel$1$3$1(Function1<? super VideoMoleculeIntent, Unit> function1) {
        super(2);
        this.$onIntent = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Long l11, Boolean bool) {
        invoke(l11.longValue(), bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(long j11, boolean z11) {
        this.$onIntent.invoke(new VideoMoleculeIntent.ScrubEnd(j11, z11));
    }
}
