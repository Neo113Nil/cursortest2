package ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.widget.LinearLayoutCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.domain.ProfileTilesVO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 &2\u00020\u0001:\u0001&B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/presentation/views/ProfileTilesView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "hasPurchases", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "organizeLayout", "(Z)Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/domain/ProfileTilesVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/domain/ProfileTilesVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/presentation/views/PurchasesTileView;", "purchases", "Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/presentation/views/PurchasesTileView;", "getPurchases", "()Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/presentation/views/PurchasesTileView;", "Landroid/widget/Space;", "spacer", "Landroid/widget/Space;", "getSpacer", "()Landroid/widget/Space;", "Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/presentation/views/BonusesTileView;", "bonuses", "Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/presentation/views/BonusesTileView;", "getBonuses", "()Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/presentation/views/BonusesTileView;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProfileTilesView extends LinearLayoutCompat {

    @NotNull
    private final BonusesTileView bonuses;

    @NotNull
    private final PurchasesTileView purchases;

    @NotNull
    private final Space spacer;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int horizontalPadding = UiExtKt.toPx(4);
    private static final int spacerWidth = UiExtKt.toPx(4);
    private static final int purchasesTileMaxSize = UiExtKt.toPx(212);
    private static final int minLayoutSize = UiExtKt.toPx(375);
    private static final int purchasesTileMinSize = UiExtKt.toPx(188);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/presentation/views/ProfileTilesView$Companion;", "", "<init>", "()V", "", "ZERO_WEIGHT", "F", "TILE_WEIGHT", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProfileTilesView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final ViewTreeObserver.OnGlobalLayoutListener organizeLayout(final boolean hasPurchases) {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.presentation.views.ProfileTilesView$organizeLayout$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int i11;
                int i12;
                int i13;
                int i14;
                if (this.getMeasuredWidth() <= 0 || this.getMeasuredHeight() <= 0) {
                    return;
                }
                this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ProfileTilesView profileTilesView = (ProfileTilesView) this;
                int measuredWidth = profileTilesView.getMeasuredWidth();
                i11 = ProfileTilesView.minLayoutSize;
                boolean z11 = measuredWidth >= i11;
                profileTilesView.getBonuses().setImageVisibility(z11 || hasPurchases);
                boolean z12 = hasPurchases;
                if (z12 && !z11) {
                    PurchasesTileView purchases = profileTilesView.getPurchases();
                    ViewGroup.LayoutParams layoutParams = purchases.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat.LayoutParams");
                    }
                    LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) layoutParams;
                    ((LinearLayout.LayoutParams) aVar).weight = 0.0f;
                    i14 = ProfileTilesView.purchasesTileMinSize;
                    ((LinearLayout.LayoutParams) aVar).width = i14;
                    purchases.setLayoutParams(aVar);
                    return;
                }
                if (!z12) {
                    int measuredWidth2 = profileTilesView.getMeasuredWidth();
                    i12 = ProfileTilesView.purchasesTileMaxSize;
                    if (measuredWidth2 < i12 * 2) {
                        PurchasesTileView purchases2 = profileTilesView.getPurchases();
                        ViewGroup.LayoutParams layoutParams2 = purchases2.getLayoutParams();
                        if (layoutParams2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat.LayoutParams");
                        }
                        LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) layoutParams2;
                        ((LinearLayout.LayoutParams) aVar2).weight = 0.0f;
                        i13 = ProfileTilesView.purchasesTileMaxSize;
                        ((LinearLayout.LayoutParams) aVar2).width = i13;
                        purchases2.setLayoutParams(aVar2);
                        return;
                    }
                }
                PurchasesTileView purchases3 = profileTilesView.getPurchases();
                ViewGroup.LayoutParams layoutParams3 = purchases3.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat.LayoutParams");
                }
                LinearLayoutCompat.a aVar3 = (LinearLayoutCompat.a) layoutParams3;
                ((LinearLayout.LayoutParams) aVar3).weight = 0.5f;
                purchases3.setLayoutParams(aVar3);
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        return onGlobalLayoutListener;
    }

    public final void bind(@NotNull ProfileTilesVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.purchases.bind(item.getPurchases(), actionHandler);
        this.bonuses.bind(item.getBonuses(), actionHandler);
        organizeLayout(item.getPurchases().getHasPurchases());
    }

    @NotNull
    public final BonusesTileView getBonuses() {
        return this.bonuses;
    }

    @NotNull
    public final PurchasesTileView getPurchases() {
        return this.purchases;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileTilesView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        PurchasesTileView purchasesTileView = new PurchasesTileView(context, null, 0, 6, null);
        purchasesTileView.setId(R$id.profileTilesPurchasesContainer);
        LinearLayoutCompat.a aVar = new LinearLayoutCompat.a(-1, -1);
        ((LinearLayout.LayoutParams) aVar).weight = 0.5f;
        purchasesTileView.setLayoutParams(aVar);
        addView(purchasesTileView);
        this.purchases = purchasesTileView;
        Space space = new Space(context);
        space.setLayoutParams(new LinearLayoutCompat.a(spacerWidth, -1));
        addView(space);
        this.spacer = space;
        BonusesTileView bonusesTileView = new BonusesTileView(context, null, 0, 6, null);
        bonusesTileView.setId(R$id.profileTilesBonusesContainer);
        LinearLayoutCompat.a aVar2 = new LinearLayoutCompat.a(-1, -1);
        ((LinearLayout.LayoutParams) aVar2).weight = 0.5f;
        bonusesTileView.setLayoutParams(aVar2);
        addView(bonusesTileView);
        this.bonuses = bonusesTileView;
        int i12 = horizontalPadding;
        setPadding(i12, getPaddingTop(), i12, getPaddingBottom());
    }
}
