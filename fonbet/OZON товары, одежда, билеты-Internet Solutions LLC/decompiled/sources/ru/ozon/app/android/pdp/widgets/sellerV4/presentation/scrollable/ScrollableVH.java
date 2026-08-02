package ru.ozon.app.android.pdp.widgets.sellerV4.presentation.scrollable;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.v3.holders.controls.button.ButtonHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/scrollable/ScrollableVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/uni/android/controls/button/ButtonView;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/uni/android/controls/button/ButtonView;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "buttonDTO", "setLocators", "(Lru/ozon/uni/android/controls/button/ButtonView;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;)V", "item", "bind", "(Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;)Lru/ozon/uni/android/controls/button/ButtonView;", "Lru/ozon/uni/android/controls/button/ButtonView;", "getView", "()Lru/ozon/uni/android/controls/button/ButtonView;", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScrollableVH extends RecyclerView.C {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ButtonView view;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = ButtonView.$stable;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/scrollable/ScrollableVH$Companion;", "", "<init>", "()V", "TITLE_LOCATOR", "", "SUBTITLE_LOCATOR", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScrollableVH(@NotNull ButtonView view, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.view = view;
        this.actionHandler = actionHandler;
    }

    private final void setLocators(ButtonView buttonView, ButtonDTO buttonDTO) {
        TestInfo testInfo = buttonDTO.getTestInfo();
        buttonView.setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
        buttonView.getMainView().getAddonView().setContentDescription("Seller.subtitle");
        buttonView.getMainView().getMainView().setContentDescription("Seller.title");
    }

    @NotNull
    public final ButtonView bind(@NotNull ButtonDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ButtonView buttonView = this.view;
        ButtonHolderKt.bind(buttonView, item, this.actionHandler);
        setLocators(buttonView, item);
        return buttonView;
    }
}
