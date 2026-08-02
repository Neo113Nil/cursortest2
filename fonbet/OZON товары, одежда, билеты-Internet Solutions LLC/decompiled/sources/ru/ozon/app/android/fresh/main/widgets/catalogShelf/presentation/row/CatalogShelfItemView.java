package ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row;

import EE.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.databinding.ItemCatalogShelfBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ$\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0012J&\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0012H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/CatalogShelfItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lru/ozon/app/android/fresh/main/databinding/ItemCatalogShelfBinding;", "bindOrGone", "", "item", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/CatalogShelfItemVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "bindBadgeV2", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogShelfItemView extends ConstraintLayout {

    @NotNull
    private final ItemCatalogShelfBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CatalogShelfItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void bindBadgeV2(BadgeDTO badge, Function1<? super AtomAction, Unit> actionHandler) {
        if (badge != null && this.binding.advBadgeV2.getRotation() == 0.0f) {
            final BadgeView badgeView = this.binding.advBadgeV2;
            badgeView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row.CatalogShelfItemView$bindBadgeV2$1$1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    BadgeView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                    BadgeView.this.setPivotY(0.0f);
                    BadgeView.this.setPivotX(r0.getWidth());
                    BadgeView.this.setRotation(-90.0f);
                    BadgeView badgeView2 = BadgeView.this;
                    badgeView2.setTranslationX(badgeView2.getTranslationX() - BadgeView.this.getWidth());
                    return true;
                }
            });
        }
        BadgeView advBadgeV2 = this.binding.advBadgeV2;
        Intrinsics.checkNotNullExpressionValue(advBadgeV2, "advBadgeV2");
        BadgeHolderKt.bindOrGone(advBadgeV2, badge, actionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindOrGone$lambda$3(CatalogShelfItemVO catalogShelfItemVO, Function1 function1, View view) {
        AtomAction action = catalogShelfItemVO.getAction();
        if (action != null) {
            function1.invoke(action);
        }
    }

    public final void bindOrGone(CatalogShelfItemVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (item == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        ImageView productIv = this.binding.productIv;
        Intrinsics.checkNotNullExpressionValue(productIv, "productIv");
        ImageViewExtKt.load$default(productIv, item.getImage(), null, null, null, null, false, null, 126, null);
        TextAtomView productTitleTv = this.binding.productTitleTv;
        Intrinsics.checkNotNullExpressionValue(productTitleTv, "productTitleTv");
        TextAtomHolderKt.bind$default(productTitleTv, TextAtom.copy$default(item.getTitle(), null, null, null, 2, null, null, null, 119, null), null, 2, null);
        BadgeView soldBadge = this.binding.soldBadge;
        Intrinsics.checkNotNullExpressionValue(soldBadge, "soldBadge");
        BadgeHolderKt.bindOrGone$default(soldBadge, item.getSoldOut(), (Function1) null, 2, (Object) null);
        bindBadgeV2(item.getAdvBadgeV2(), actionHandler);
        if (item.getSoldOut() != null) {
            this.binding.productIv.setAlpha(0.5f);
            setEnabled(false);
            this.binding.soldBadge.setEnabled(false);
        } else {
            this.binding.productIv.setAlpha(1.0f);
            setEnabled(true);
        }
        setOnClickListener(new a(3, item, actionHandler));
    }

    public /* synthetic */ CatalogShelfItemView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogShelfItemView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ItemCatalogShelfBinding inflate = ItemCatalogShelfBinding.inflate(LayoutInflater.from(context), this, true);
        this.binding = inflate;
        int i13 = context.getResources().getDisplayMetrics().widthPixels;
        if (i13 >= 0 && i13 < 360) {
            inflate.productIv.setMaxWidth(ResourceExtKt.toPx(82));
            return;
        }
        if (360 <= i13 && i13 < 376) {
            inflate.productIv.setMaxWidth(ResourceExtKt.toPx(96));
        } else if (376 <= i13 && i13 < 415) {
            inflate.productIv.setMaxWidth(ResourceExtKt.toPx(101));
        } else {
            inflate.productIv.setMaxWidth(ResourceExtKt.toPx(114));
        }
    }
}
