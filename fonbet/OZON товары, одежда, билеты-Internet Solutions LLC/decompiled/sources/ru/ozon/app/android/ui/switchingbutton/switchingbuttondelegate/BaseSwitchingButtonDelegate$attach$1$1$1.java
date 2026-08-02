package ru.ozon.app.android.ui.switchingbutton.switchingbuttondelegate;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;
import ru.ozon.app.android.ui.switchingbutton.state.SwitchingButtonState;
import ru.ozon.app.android.ui.switchingbutton.state.SwitchingButtonStateStorage;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BaseSwitchingButtonDelegate$attach$1$1$1 extends AbstractC7737t implements Function1<FavoriteEvent, Unit> {
    final /* synthetic */ long $favId;
    final /* synthetic */ BaseSwitchingButtonDelegate<V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseSwitchingButtonDelegate$attach$1$1$1(BaseSwitchingButtonDelegate<V> baseSwitchingButtonDelegate, long j11) {
        super(1);
        this.this$0 = baseSwitchingButtonDelegate;
        this.$favId = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FavoriteEvent favoriteEvent) {
        invoke2(favoriteEvent);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FavoriteEvent favoriteEvent) {
        SwitchingButtonStateStorage switchingButtonStateStorage;
        SwitchingButtonState switchingButtonState;
        switchingButtonStateStorage = ((BaseSwitchingButtonDelegate) this.this$0).stateStorage;
        BaseSwitchingButtonDelegate<V> baseSwitchingButtonDelegate = this.this$0;
        Intrinsics.f(favoriteEvent);
        switchingButtonState = baseSwitchingButtonDelegate.toSwitchingButtonState(favoriteEvent, this.$favId);
        switchingButtonStateStorage.addState(switchingButtonState);
    }
}
