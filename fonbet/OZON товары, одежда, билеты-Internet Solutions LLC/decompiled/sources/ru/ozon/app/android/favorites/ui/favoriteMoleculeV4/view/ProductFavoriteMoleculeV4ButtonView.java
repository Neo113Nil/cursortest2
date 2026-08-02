package ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view;

import Bl.b;
import Ey.ViewOnClickListenerC2975b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModelKt;
import ru.ozon.app.android.favorites.ui.R$id;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView;
import ru.ozon.app.android.uikit.R$anim;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010J/\u0010\u0015\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0004¢\u0006\u0004\b\u001c\u0010\u000eR6\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R6\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\"\u0010'\u001a\u00020\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0017\u0010.\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R$\u00102\u001a\u0004\u0018\u00010\n8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u0010\u000eR0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f\u0018\u00010\u00128\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0014\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "model", "", "bindFavoriteOrGone", "(Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;)V", "revertAndRebindViewState", "()V", "shake", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bindDataOrGone", "(Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", "", "processLongClick", "(Landroid/view/View;)Z", "item", "setContentDescription", "Lkotlin/Function2;", "onClick", "Lkotlin/jvm/functions/Function2;", "getOnClick", "()Lkotlin/jvm/functions/Function2;", "setOnClick", "(Lkotlin/jvm/functions/Function2;)V", "onLongLick", "getOnLongLick", "setOnLongLick", "needVibrate", "Z", "getNeedVibrate", "()Z", "setNeedVibrate", "(Z)V", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "favIcon", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getFavIcon", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "currentModel", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "getCurrentModel", "()Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "setCurrentModel", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "setActionHandler", "(Lkotlin/jvm/functions/Function1;)V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public class ProductFavoriteMoleculeV4ButtonView extends FrameLayout {
    public static final int $stable = 8;
    private Function1<? super AtomAction, Unit> actionHandler;
    private FavoriteProductModel currentModel;

    @NotNull
    private final IconButtonV3View favIcon;
    private boolean needVibrate;
    private Function2<? super FavoriteProductModel, ? super View, Unit> onClick;
    private Function2<? super FavoriteProductModel, ? super View, Unit> onLongLick;

    public /* synthetic */ ProductFavoriteMoleculeV4ButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ProductFavoriteMoleculeV4ButtonView productFavoriteMoleculeV4ButtonView, View view) {
        productFavoriteMoleculeV4ButtonView.favIcon.callOnClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(ProductFavoriteMoleculeV4ButtonView productFavoriteMoleculeV4ButtonView, View view) {
        return productFavoriteMoleculeV4ButtonView.processLongClick(productFavoriteMoleculeV4ButtonView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$3(ProductFavoriteMoleculeV4ButtonView productFavoriteMoleculeV4ButtonView, View view) {
        return productFavoriteMoleculeV4ButtonView.processLongClick(productFavoriteMoleculeV4ButtonView);
    }

    protected void bindDataOrGone(FavoriteProductModel model, Function1<? super AtomAction, Unit> actionHandler) {
        IconButtonV3View iconButtonV3View = this.favIcon;
        IconButtonV3HolderKt.bindOrGone(iconButtonV3View, model != null ? FavoriteProductModelKt.getButton(model) : null, actionHandler);
        setContentDescription(model);
        iconButtonV3View.setSelected(model != null ? model.getIsFavorite() : false);
    }

    public void bindFavoriteOrGone(FavoriteProductModel model) {
        this.currentModel = model;
        ProductFavoriteMoleculeV4ButtonView$bindFavoriteOrGone$1 productFavoriteMoleculeV4ButtonView$bindFavoriteOrGone$1 = new ProductFavoriteMoleculeV4ButtonView$bindFavoriteOrGone$1(this);
        this.actionHandler = productFavoriteMoleculeV4ButtonView$bindFavoriteOrGone$1;
        bindDataOrGone(model, productFavoriteMoleculeV4ButtonView$bindFavoriteOrGone$1);
    }

    protected final Function1<AtomAction, Unit> getActionHandler() {
        return this.actionHandler;
    }

    protected final FavoriteProductModel getCurrentModel() {
        return this.currentModel;
    }

    @NotNull
    public final IconButtonV3View getFavIcon() {
        return this.favIcon;
    }

    public boolean getNeedVibrate() {
        return this.needVibrate;
    }

    public final Function2<FavoriteProductModel, View, Unit> getOnClick() {
        return this.onClick;
    }

    protected final boolean processLongClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        FavoriteProductModel favoriteProductModel = this.currentModel;
        if (favoriteProductModel == null) {
            return false;
        }
        Function2<? super FavoriteProductModel, ? super View, Unit> function2 = this.onLongLick;
        if (function2 == null) {
            return true;
        }
        function2.invoke(favoriteProductModel, view);
        return true;
    }

    public void revertAndRebindViewState() {
        FavoriteProductModel favoriteProductModel;
        FavoriteProductModel favoriteProductModel2 = this.currentModel;
        if (favoriteProductModel2 != null) {
            favoriteProductModel = FavoriteProductModel.copy$default(favoriteProductModel2, 0L, !favoriteProductModel2.getIsFavorite(), null, null, null, null, 61, null);
            bindDataOrGone(favoriteProductModel, this.actionHandler);
        } else {
            favoriteProductModel = null;
        }
        this.currentModel = favoriteProductModel;
    }

    protected final void setActionHandler(Function1<? super AtomAction, Unit> function1) {
        this.actionHandler = function1;
    }

    protected final void setContentDescription(FavoriteProductModel item) {
        String str;
        TestInfo testInfo;
        if (item != null) {
            CommonControlSettings common = FavoriteProductModelKt.getButton(item).getCommon();
            if (common == null || (testInfo = common.getTestInfo()) == null || (str = testInfo.getAutomatizationId()) == null) {
                str = item.getIsFavorite() ? "favorite" : "not-favorite";
            }
        } else {
            str = null;
        }
        setContentDescription(str);
    }

    protected final void setCurrentModel(FavoriteProductModel favoriteProductModel) {
        this.currentModel = favoriteProductModel;
    }

    public final void setOnClick(Function2<? super FavoriteProductModel, ? super View, Unit> function2) {
        this.onClick = function2;
    }

    public final void setOnLongLick(Function2<? super FavoriteProductModel, ? super View, Unit> function2) {
        this.onLongLick = function2;
    }

    public final void shake() {
        this.favIcon.startAnimation(AnimationUtils.loadAnimation(getContext(), R$anim.shake));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductFavoriteMoleculeV4ButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        IconButtonV3View iconButtonV3View = (IconButtonV3View) b.a(IconButtonV3View.class, "type", q.f64554a, null);
        if (iconButtonV3View == null) {
            iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        }
        iconButtonV3View.setId(R$id.favIcon);
        addView(iconButtonV3View, new ViewGroup.LayoutParams(-1, -1));
        this.favIcon = iconButtonV3View;
        setOnClickListener(new ViewOnClickListenerC2975b(this, 13));
        setOnLongClickListener(new View.OnLongClickListener() { // from class: vt.a
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean _init_$lambda$2;
                _init_$lambda$2 = ProductFavoriteMoleculeV4ButtonView._init_$lambda$2(ProductFavoriteMoleculeV4ButtonView.this, view);
                return _init_$lambda$2;
            }
        });
        iconButtonV3View.setOnLongClickListener(new View.OnLongClickListener() { // from class: vt.b
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean _init_$lambda$3;
                _init_$lambda$3 = ProductFavoriteMoleculeV4ButtonView._init_$lambda$3(ProductFavoriteMoleculeV4ButtonView.this, view);
                return _init_$lambda$3;
            }
        });
    }
}
