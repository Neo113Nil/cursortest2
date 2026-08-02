package ru.ozon.app.android.cart.common.dynamicElement.badges;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.flexbox.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.UtilsKt;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementVO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tB%\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cart/common/dynamicElement/badges/BadgesViewVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroidx/recyclerview/widget/RecyclerView;", "badges", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementVO$Badges;", "item", "bind", "(Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementVO$Badges;)V", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/cart/common/dynamicElement/badges/BadgesAdapter;", "atomAdapter", "Lru/ozon/app/android/cart/common/dynamicElement/badges/BadgesAdapter;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BadgesViewVH extends RecyclerView.C {

    @NotNull
    private final BadgesAdapter atomAdapter;

    @NotNull
    private final RecyclerView badges;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int BADGES_ITEM_PADDING = UiExtKt.toPx(8);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/cart/common/dynamicElement/badges/BadgesViewVH$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/google/android/flexbox/e;", "createItemDecorator", "(Landroid/content/Context;)Lcom/google/android/flexbox/e;", "", "BADGES_ITEM_PADDING", "I", "getBADGES_ITEM_PADDING", "()I", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final e createItemDecorator(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            e eVar = new e(context);
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            shapeDrawable.getPaint().setColor(0);
            shapeDrawable.setIntrinsicHeight(BadgesViewVH.Companion.getBADGES_ITEM_PADDING());
            shapeDrawable.setIntrinsicWidth(BadgesViewVH.Companion.getBADGES_ITEM_PADDING());
            eVar.setDrawable(shapeDrawable);
            return eVar;
        }

        public final int getBADGES_ITEM_PADDING() {
            return BadgesViewVH.BADGES_ITEM_PADDING;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgesViewVH(@NotNull RecyclerView badges, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(badges);
        Intrinsics.checkNotNullParameter(badges, "badges");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.badges = badges;
        BadgesAdapter badgesAdapter = new BadgesAdapter(actionHandler);
        this.atomAdapter = badgesAdapter;
        badges.setAdapter(badgesAdapter);
    }

    public final void bind(@NotNull DynamicElementVO.Badges item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.atomAdapter.submitList(item.getElements());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BadgesViewVH(@NotNull Context context, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        this(r0, actionHandler);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(UtilsKt.createDefaultMarginLayoutParams());
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new FlexboxLayoutManager(context));
        recyclerView.setItemAnimator(null);
        recyclerView.setOverScrollMode(2);
        recyclerView.setClipChildren(false);
        recyclerView.addItemDecoration(Companion.createItemDecorator(context));
    }
}
