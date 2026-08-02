package ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.presentation.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/presentation/adapter/ButtonV3ItemViewHolder;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/presentation/adapter/ItemViewHolder;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;Lkotlin/jvm/functions/Function1;)V", "bind", "item", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ButtonV3ItemViewHolder extends ItemViewHolder<ButtonV3DTO> {
    public static final int $stable = ButtonV3View.$stable;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ButtonV3View buttonView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ButtonV3ItemViewHolder(@NotNull ButtonV3View buttonView, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(buttonView);
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.buttonView = buttonView;
        this.actionHandler = actionHandler;
    }

    public void bind(@NotNull ButtonV3DTO item) {
        String id2;
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(item, "item");
        ButtonV3HolderKt.bindOrGone(this.buttonView, item, this.actionHandler);
        ButtonV3View buttonV3View = this.buttonView;
        TestInfo testInfo = item.getTestInfo();
        if (testInfo == null || (id2 = testInfo.getAutomatizationId()) == null) {
            CommonControlSettings common = item.getCommon();
            id2 = (common == null || (action = common.getAction()) == null) ? null : action.getId();
            if (id2 == null) {
                id2 = item.getTitle();
            }
        }
        buttonV3View.setContentDescription(id2);
    }
}
