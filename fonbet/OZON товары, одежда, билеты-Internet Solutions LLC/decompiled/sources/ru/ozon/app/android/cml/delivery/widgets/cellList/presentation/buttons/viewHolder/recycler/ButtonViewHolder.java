package ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.buttons.viewHolder.recycler;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/buttons/viewHolder/recycler/ButtonViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonView", "<init>", "(Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lkotlin/jvm/functions/Function1;)V", "", "isLoading", "setLoading", "(Z)V", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ButtonViewHolder extends RecyclerView.C {

    @NotNull
    private final ButtonV3View buttonView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonViewHolder(@NotNull ButtonV3View buttonView) {
        super(buttonView);
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        this.buttonView = buttonView;
    }

    public final void bind(@NotNull ButtonV3DTO button, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        ButtonV3HolderKt.bind(this.buttonView, button, onAction);
    }

    public final void setLoading(boolean isLoading) {
        if (isLoading) {
            this.buttonView.showLoader();
        } else {
            this.buttonView.hideLoader();
        }
    }
}
