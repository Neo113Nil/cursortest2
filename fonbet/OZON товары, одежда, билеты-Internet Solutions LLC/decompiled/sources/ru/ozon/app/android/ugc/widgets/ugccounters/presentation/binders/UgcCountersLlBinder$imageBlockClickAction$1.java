package ru.ozon.app.android.ugc.widgets.ugccounters.presentation.binders;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "videoInfo", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class UgcCountersLlBinder$imageBlockClickAction$1 extends AbstractC7737t implements Function2<AtomAction, PreloadVideoInfo, Unit> {
    final /* synthetic */ PlayerPreloader $playerPreloader;
    final /* synthetic */ UgcCountersLlBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UgcCountersLlBinder$imageBlockClickAction$1(PlayerPreloader playerPreloader, UgcCountersLlBinder ugcCountersLlBinder) {
        super(2);
        this.$playerPreloader = playerPreloader;
        this.this$0 = ugcCountersLlBinder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction, PreloadVideoInfo preloadVideoInfo) {
        invoke2(atomAction, preloadVideoInfo);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action, PreloadVideoInfo preloadVideoInfo) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(action, "action");
        if ((action instanceof AtomAction.Move) && preloadVideoInfo != null) {
            PlayerPreloader.DefaultImpls.preCreatePlayer$default(this.$playerPreloader, preloadVideoInfo, null, 2, null);
        }
        function1 = this.this$0.actionHandler;
        function1.invoke(action);
    }
}
