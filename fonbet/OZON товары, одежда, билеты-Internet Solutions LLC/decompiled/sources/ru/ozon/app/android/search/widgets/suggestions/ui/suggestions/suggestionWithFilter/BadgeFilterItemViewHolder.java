package ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/BadgeFilterItemViewHolder;", "Ljk0/j;", "Landroid/view/ViewGroup;", "parent", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "item", "bind", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BadgeFilterItemViewHolder extends j {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final BadgeView badgeView;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BadgeView.$stable;
    private static final int dp8 = UiExtKt.toPx(8);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/BadgeFilterItemViewHolder$Companion;", "", "<init>", "()V", "dp8", "", "createView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "parent", "Landroid/view/ViewGroup;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final BadgeView createView(ViewGroup parent) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
            badgeView.setId(R$id.badgeView);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams.setMargins(0, BadgeFilterItemViewHolder.dp8, 0, 0);
            badgeView.setLayoutParams(marginLayoutParams);
            return badgeView;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BadgeFilterItemViewHolder(@NotNull ViewGroup parent, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(INSTANCE.createView(parent));
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        View view = this.itemView;
        this.badgeView = view instanceof BadgeView ? (BadgeView) view : null;
    }

    public final void bind(@NotNull BadgeDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        BadgeView badgeView = this.badgeView;
        if (badgeView != null) {
            BadgeHolderKt.bind(badgeView, item, this.actionHandler);
        }
        BadgeView badgeView2 = this.badgeView;
        if (badgeView2 != null) {
            badgeView2.setContentDescription(item.getText());
        }
    }
}
