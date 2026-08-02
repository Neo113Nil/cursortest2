package ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.badges;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.UtilsKt;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.DynamicElementVOV2;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tB%\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/badges/BadgesViewVHV2;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroidx/recyclerview/widget/RecyclerView;", "badges", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2$Badges;", "item", "bind", "(Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2$Badges;)V", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/badges/BadgesAdapterV2;", "atomAdapter", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/badges/BadgesAdapterV2;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BadgesViewVHV2 extends RecyclerView.C {
    private static final int BADGES_ITEM_MARGIN;
    private static final int BADGES_ITEM_PADDING;

    @NotNull
    private final BadgesAdapterV2 atomAdapter;

    @NotNull
    private final RecyclerView badges;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/badges/BadgesViewVHV2$Companion;", "", "<init>", "()V", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        int px = UiExtKt.toPx(8);
        BADGES_ITEM_MARGIN = px;
        BADGES_ITEM_PADDING = -px;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgesViewVHV2(@NotNull RecyclerView badges, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(badges);
        Intrinsics.checkNotNullParameter(badges, "badges");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.badges = badges;
        BadgesAdapterV2 badgesAdapterV2 = new BadgesAdapterV2(actionHandler, BADGES_ITEM_MARGIN);
        this.atomAdapter = badgesAdapterV2;
        badges.setAdapter(badgesAdapterV2);
    }

    public final void bind(@NotNull DynamicElementVOV2.Badges item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.atomAdapter.submitList(item.getElements());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BadgesViewVHV2(@NotNull Context context, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        this(r0, actionHandler);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        RecyclerView recyclerView = new RecyclerView(context);
        ViewGroup.MarginLayoutParams createDefaultMarginLayoutParams = UtilsKt.createDefaultMarginLayoutParams();
        int i11 = BADGES_ITEM_PADDING;
        recyclerView.setPadding(i11, i11, 0, 0);
        recyclerView.setLayoutParams(createDefaultMarginLayoutParams);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new FlexboxLayoutManager(context));
        recyclerView.setItemAnimator(null);
        recyclerView.setOverScrollMode(2);
        recyclerView.setClipChildren(false);
    }
}
