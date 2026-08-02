package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.holders;

import Sc.InterfaceC4008j;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.universalwidgets.R$layout;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00112\u00060\u0001j\u0002`\u0002:\u0001\u0011B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/holders/TopRightSmallIconButtonViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "view", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "model", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/utils/BuildedActionHandler;", "actionHandler", "bind", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TopRightSmallIconButtonViewHolder extends j {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int LAYOUT_ID = R$layout.top_right_buttons_tile_grid_2_small_icon_button;

    @NotNull
    private static final InterfaceC4008j<Integer> iconViewPadding$delegate = LazyUtilsKt.unsafeLazy(TopRightSmallIconButtonViewHolder$Companion$iconViewPadding$2.INSTANCE);

    @NotNull
    private final SmallIconButtonView view;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/holders/TopRightSmallIconButtonViewHolder$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/holders/TopRightSmallIconButtonViewHolder;", "create", "(Landroid/content/Context;)Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/holders/TopRightSmallIconButtonViewHolder;", "", "iconViewPadding$delegate", "LSc/j;", "getIconViewPadding", "()I", "iconViewPadding", "LAYOUT_ID", "I", "getLAYOUT_ID", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getIconViewPadding() {
            return ((Number) TopRightSmallIconButtonViewHolder.iconViewPadding$delegate.getValue()).intValue();
        }

        @NotNull
        public final TopRightSmallIconButtonViewHolder create(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            SmallIconButtonView smallIconButtonView = (SmallIconButtonView) q.f64554a.g(N.b(SmallIconButtonView.class), context);
            smallIconButtonView.setLayoutParams(new RecyclerView.p(-1, -2));
            return new TopRightSmallIconButtonViewHolder(smallIconButtonView);
        }

        public final int getLAYOUT_ID() {
            return TopRightSmallIconButtonViewHolder.LAYOUT_ID;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopRightSmallIconButtonViewHolder(@NotNull SmallIconButtonView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    public final void bind(@NotNull ButtonV3Atom.SmallIconButton model, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(model, "model");
        SmallIconButtonView smallIconButtonView = this.view;
        bind(model, actionHandler);
        int iconViewPadding = INSTANCE.getIconViewPadding();
        smallIconButtonView.setPadding(iconViewPadding, iconViewPadding, iconViewPadding, iconViewPadding);
    }
}
