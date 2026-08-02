package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.holders;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.TileGrid2Constants;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.decoration.OffsetsItemDecoration;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.utils.TouchDelegateComposite;
import ru.ozon.app.android.universalwidgets.widgets.uw.utils.ViewExtensionsKt;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B#\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/holders/TopRightIconButtonViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/decoration/OffsetsItemDecoration$OffsetsAwareItem;", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "iconButton", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/utils/TouchDelegateComposite;", "touchDelegateComposite", "<init>", "(Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;Landroid/view/ViewGroup;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/utils/TouchDelegateComposite;)V", "", "sizePx", "", "updateDecorationOffset", "(Ljava/lang/Integer;)V", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "Landroid/view/ViewGroup;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/utils/TouchDelegateComposite;", "Landroid/graphics/Rect;", "outRect", "Landroid/graphics/Rect;", "getOutRect", "()Landroid/graphics/Rect;", "setOutRect", "(Landroid/graphics/Rect;)V", "buttonSizePx", "Ljava/lang/Integer;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TopRightIconButtonViewHolder extends j implements OffsetsItemDecoration.OffsetsAwareItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private Integer buttonSizePx;

    @NotNull
    private final IconButtonV3View iconButton;

    @NotNull
    private Rect outRect;

    @NotNull
    private final ViewGroup parent;
    private final TouchDelegateComposite touchDelegateComposite;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/holders/TopRightIconButtonViewHolder$Companion;", "", "<init>", "()V", "LAYOUT_ID", "", "create", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/holders/TopRightIconButtonViewHolder;", "parent", "Landroid/view/ViewGroup;", "touchDelegateComposite", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/utils/TouchDelegateComposite;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TopRightIconButtonViewHolder create(@NotNull ViewGroup parent, TouchDelegateComposite touchDelegateComposite) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new TopRightIconButtonViewHolder(new IconButtonV3View(context, null, 0, 0, 14, null), parent, touchDelegateComposite, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ TopRightIconButtonViewHolder(IconButtonV3View iconButtonV3View, ViewGroup viewGroup, TouchDelegateComposite touchDelegateComposite, DefaultConstructorMarker defaultConstructorMarker) {
        this(iconButtonV3View, viewGroup, touchDelegateComposite);
    }

    private final void updateDecorationOffset(Integer sizePx) {
        if (Intrinsics.d(this.buttonSizePx, sizePx)) {
            return;
        }
        TileGrid2Constants tileGrid2Constants = TileGrid2Constants.INSTANCE;
        int topRightBtnsWidth = (tileGrid2Constants.getTopRightBtnsWidth() - (sizePx != null ? sizePx.intValue() : 0)) / 2;
        int i11 = topRightBtnsWidth >= 0 ? topRightBtnsWidth : 0;
        getOutRect().set(i11, tileGrid2Constants.getTopRightBtnsIconVerticalMargin(), i11, tileGrid2Constants.getTopRightBtnsIconVerticalMargin());
    }

    public final void bind(@NotNull IconButtonV3DTO item, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        IconButtonV3DTO.Sizes size = item.getSize();
        Integer valueOf = size != null ? Integer.valueOf(ResourceExtKt.toPx(size.getSize())) : null;
        updateDecorationOffset(valueOf);
        this.iconButton.setContentDescription(item.getIcon());
        IconButtonV3HolderKt.bind(this.iconButton, item, actionHandler);
        this.buttonSizePx = valueOf;
        ViewGroup viewGroup = this.parent;
        if (!viewGroup.isLaidOut() || viewGroup.isLayoutRequested()) {
            viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.holders.TopRightIconButtonViewHolder$bind$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    TouchDelegateComposite touchDelegateComposite = TopRightIconButtonViewHolder.this.touchDelegateComposite;
                    if (touchDelegateComposite != null) {
                        touchDelegateComposite.addDelegate(TopRightIconButtonViewHolder.this.hashCode(), ViewExtensionsKt.getIncreasedTouchDelegate(TopRightIconButtonViewHolder.this.iconButton, TileGrid2Constants.INSTANCE.getDP_4()));
                    }
                }
            });
            return;
        }
        TouchDelegateComposite touchDelegateComposite = this.touchDelegateComposite;
        if (touchDelegateComposite != null) {
            touchDelegateComposite.addDelegate(hashCode(), ViewExtensionsKt.getIncreasedTouchDelegate(this.iconButton, TileGrid2Constants.INSTANCE.getDP_4()));
        }
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.decoration.OffsetsItemDecoration.OffsetsAwareItem
    @NotNull
    public Rect getOutRect() {
        return this.outRect;
    }

    private TopRightIconButtonViewHolder(IconButtonV3View iconButtonV3View, ViewGroup viewGroup, TouchDelegateComposite touchDelegateComposite) {
        super(iconButtonV3View);
        this.iconButton = iconButtonV3View;
        this.parent = viewGroup;
        this.touchDelegateComposite = touchDelegateComposite;
        this.outRect = new Rect();
    }
}
