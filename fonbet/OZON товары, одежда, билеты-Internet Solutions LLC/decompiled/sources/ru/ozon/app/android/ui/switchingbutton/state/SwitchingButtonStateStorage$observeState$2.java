package ru.ozon.app.android.ui.switchingbutton.state;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ui.switchingbutton.state.SwitchingButtonState;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ui/switchingbutton/state/SwitchingButtonState;", "kotlin.jvm.PlatformType", "it", "", "", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Ljava/util/Map;)Lru/ozon/app/android/ui/switchingbutton/state/SwitchingButtonState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SwitchingButtonStateStorage$observeState$2 extends AbstractC7737t implements Function1<Map<String, SwitchingButtonState>, SwitchingButtonState> {
    final /* synthetic */ String $id;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwitchingButtonStateStorage$observeState$2(String str) {
        super(1);
        this.$id = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final SwitchingButtonState invoke(Map<String, SwitchingButtonState> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SwitchingButtonState switchingButtonState = it.get(this.$id);
        return switchingButtonState == null ? SwitchingButtonState.Empty.INSTANCE : switchingButtonState;
    }
}
