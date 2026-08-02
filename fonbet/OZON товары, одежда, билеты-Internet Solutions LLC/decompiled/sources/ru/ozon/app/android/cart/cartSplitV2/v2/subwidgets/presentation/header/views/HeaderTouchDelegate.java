package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.header.views;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.header.views.HeaderTouchDelegate;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/views/HeaderTouchDelegate;", "", "viewGroup", "Landroid/view/ViewGroup;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Landroid/view/View;", "subtitle", "touchReceiverView", "<init>", "(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "touchRectViewGroup", "Landroid/graphics/Rect;", "touchRectTitle", "touchRectSubTitle", "onLayoutGroup", "Landroid/view/View$OnLayoutChangeListener;", "calculateArea", "", "view", "rect", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HeaderTouchDelegate {

    @NotNull
    private final View.OnLayoutChangeListener onLayoutGroup;

    @NotNull
    private final View subtitle;

    @NotNull
    private final View title;

    @NotNull
    private final Rect touchRectSubTitle;

    @NotNull
    private final Rect touchRectTitle;

    @NotNull
    private final Rect touchRectViewGroup;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int leftFromTouchReceiverView = ResourceExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/views/HeaderTouchDelegate$Companion;", "", "<init>", "()V", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public HeaderTouchDelegate(@NotNull ViewGroup viewGroup, @NotNull View title, @NotNull View subtitle, @NotNull final View touchReceiverView) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(touchReceiverView, "touchReceiverView");
        this.title = title;
        this.subtitle = subtitle;
        Rect rect = new Rect();
        this.touchRectViewGroup = rect;
        Rect rect2 = new Rect();
        this.touchRectTitle = rect2;
        Rect rect3 = new Rect();
        this.touchRectSubTitle = rect3;
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: pn.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                HeaderTouchDelegate.onLayoutGroup$lambda$0(HeaderTouchDelegate.this, touchReceiverView, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.onLayoutGroup = onLayoutChangeListener;
        viewGroup.setTouchDelegate(new TouchDelegate(rect, touchReceiverView));
        title.setTouchDelegate(new TouchDelegate(rect2, touchReceiverView));
        subtitle.setTouchDelegate(new TouchDelegate(rect3, touchReceiverView));
        viewGroup.addOnLayoutChangeListener(onLayoutChangeListener);
    }

    private final void calculateArea(View view, Rect rect) {
        rect.left = this.touchRectViewGroup.left - view.getLeft();
        rect.top = 0;
        rect.right = view.getWidth();
        rect.bottom = view.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLayoutGroup$lambda$0(HeaderTouchDelegate headerTouchDelegate, View view, View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        headerTouchDelegate.touchRectViewGroup.left = view.getLeft() - leftFromTouchReceiverView;
        Rect rect = headerTouchDelegate.touchRectViewGroup;
        rect.top = 0;
        rect.right = i13;
        rect.bottom = i14;
        headerTouchDelegate.calculateArea(headerTouchDelegate.title, headerTouchDelegate.touchRectTitle);
        headerTouchDelegate.calculateArea(headerTouchDelegate.subtitle, headerTouchDelegate.touchRectSubTitle);
    }
}
