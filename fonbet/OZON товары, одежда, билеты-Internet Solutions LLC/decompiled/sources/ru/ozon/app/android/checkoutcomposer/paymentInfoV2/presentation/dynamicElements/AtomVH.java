package ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.dynamicElements;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/dynamicElements/AtomVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Lru/ozon/uni/atoms/v3/containers/SingleAtom;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/AtomDTO;", "item", "bind", "(Lru/ozon/uni/atoms/data/AtomDTO;)V", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AtomVH extends RecyclerView.C {
    public static final int $stable = SingleAtom.$stable;

    @NotNull
    private final SingleAtom view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtomVH(@NotNull SingleAtom view, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.view = view;
        view.setOnAction(onAction);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setDecorator(new AtomDecoration(context));
    }

    public final void bind(@NotNull AtomDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.view.bind(item, item instanceof CellAtom);
    }
}
