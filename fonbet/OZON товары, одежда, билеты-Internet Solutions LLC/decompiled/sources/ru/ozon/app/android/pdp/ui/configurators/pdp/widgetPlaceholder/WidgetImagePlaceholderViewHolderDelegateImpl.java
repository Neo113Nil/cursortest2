package ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder;

import CX.b;
import H.a;
import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetPlaceholderViewObject;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B[\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\n\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R&\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b!\u0010 R\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\"\u0010\"\u001a\u00020\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010#R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderViewHolderDelegateImpl;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetPlaceholderViewObject;", "T", "", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "adapter", "Landroid/view/ViewGroup;", "containerView", "Lkotlin/Function0;", "item", "LSc/j;", "Landroid/view/View;", "mainView", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/BaseWidgetPlaceholderBinder;", "binder", "", "hasClick", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;LSc/j;LSc/j;Lkotlin/jvm/functions/Function0;)V", "", "widgetKey", "stateId", "", "bind", "(Ljava/lang/String;Ljava/lang/String;)V", "onDetach", "()V", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "Landroid/view/ViewGroup;", "Lkotlin/jvm/functions/Function0;", "LSc/j;", "getMainView", "()LSc/j;", "getBinder", "isMainWidget", "Z", "()Z", "setMainWidget", "(Z)V", "", "tapX", "F", "tapY", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "hasMessage", "Ljava/lang/Runnable;", "clickViewRunnable", "Ljava/lang/Runnable;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes13.dex */
public final class WidgetImagePlaceholderViewHolderDelegateImpl<T extends WidgetPlaceholderViewObject> {

    @NotNull
    private final WidgetImagePlaceholderAdapter adapter;

    @NotNull
    private final InterfaceC4008j<BaseWidgetPlaceholderBinder<T>> binder;

    @NotNull
    private final Runnable clickViewRunnable;

    @NotNull
    private final ViewGroup containerView;

    @NotNull
    private final Handler handler;
    private final Function0<Boolean> hasClick;
    private boolean hasMessage;
    private boolean isMainWidget;

    @NotNull
    private final Function0<T> item;

    @NotNull
    private final InterfaceC4008j<View> mainView;
    private float tapX;
    private float tapY;

    /* JADX WARN: Multi-variable type inference failed */
    public WidgetImagePlaceholderViewHolderDelegateImpl(@NotNull WidgetImagePlaceholderAdapter adapter, @NotNull ViewGroup containerView, @NotNull Function0<? extends T> item, @NotNull InterfaceC4008j<? extends View> mainView, @NotNull InterfaceC4008j<? extends BaseWidgetPlaceholderBinder<T>> binder, Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        Intrinsics.checkNotNullParameter(binder, "binder");
        this.adapter = adapter;
        this.containerView = containerView;
        this.item = item;
        this.mainView = mainView;
        this.binder = binder;
        this.hasClick = function0;
        this.handler = new Handler(Looper.getMainLooper());
        this.clickViewRunnable = new a(this, 6);
        containerView.setOnTouchListener(new b(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(WidgetImagePlaceholderViewHolderDelegateImpl widgetImagePlaceholderViewHolderDelegateImpl, View view, MotionEvent motionEvent) {
        Function0<Boolean> function0 = widgetImagePlaceholderViewHolderDelegateImpl.hasClick;
        if ((function0 != null ? function0.invoke() : null) != null && !widgetImagePlaceholderViewHolderDelegateImpl.hasClick.invoke().booleanValue()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 1 && !widgetImagePlaceholderViewHolderDelegateImpl.getIsMainWidget()) {
            widgetImagePlaceholderViewHolderDelegateImpl.tapX = motionEvent.getX();
            widgetImagePlaceholderViewHolderDelegateImpl.tapY = motionEvent.getY();
            T invoke = widgetImagePlaceholderViewHolderDelegateImpl.item.invoke();
            if (invoke != null) {
                widgetImagePlaceholderViewHolderDelegateImpl.containerView.addView(widgetImagePlaceholderViewHolderDelegateImpl.getMainView().getValue(), 0);
                ViewExtKt.hide(widgetImagePlaceholderViewHolderDelegateImpl.getMainView().getValue());
                BaseWidgetPlaceholderBinder.bind$default(widgetImagePlaceholderViewHolderDelegateImpl.getBinder().getValue(), invoke, null, null, new WidgetImagePlaceholderViewHolderDelegateImpl$1$1$1(widgetImagePlaceholderViewHolderDelegateImpl), 6, null);
            }
            widgetImagePlaceholderViewHolderDelegateImpl.setMainWidget(true);
        }
        return !widgetImagePlaceholderViewHolderDelegateImpl.getIsMainWidget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickViewRunnable$lambda$0(WidgetImagePlaceholderViewHolderDelegateImpl widgetImagePlaceholderViewHolderDelegateImpl) {
        widgetImagePlaceholderViewHolderDelegateImpl.containerView.removeViewAt(1);
        ViewExtKt.show(widgetImagePlaceholderViewHolderDelegateImpl.getMainView().getValue());
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.onTapEvent(widgetImagePlaceholderViewHolderDelegateImpl.containerView, widgetImagePlaceholderViewHolderDelegateImpl.tapX, widgetImagePlaceholderViewHolderDelegateImpl.tapY);
        widgetImagePlaceholderViewHolderDelegateImpl.hasMessage = false;
    }

    public void bind(@NotNull String widgetKey, String stateId) {
        Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
        T invoke = this.item.invoke();
        if (invoke != null) {
            WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter = this.adapter;
            if (stateId == null) {
                return;
            }
            Bitmap image = widgetImagePlaceholderAdapter.getImage(widgetKey, stateId);
            if (image != null && !getIsMainWidget()) {
                View first = ViewGroupExtKt.first(this.containerView);
                ImageView imageView = first instanceof ImageView ? (ImageView) first : null;
                if (imageView != null) {
                    imageView.setImageBitmap(image);
                    return;
                }
                return;
            }
            if (getIsMainWidget()) {
                BaseWidgetPlaceholderBinder.bind$default(getBinder().getValue(), invoke, null, null, null, 14, null);
                return;
            }
            this.containerView.removeAllViews();
            this.containerView.addView(getMainView().getValue());
            BaseWidgetPlaceholderBinder.bind$default(getBinder().getValue(), invoke, null, null, null, 14, null);
            setMainWidget(true);
        }
    }

    @NotNull
    public InterfaceC4008j<BaseWidgetPlaceholderBinder<T>> getBinder() {
        return this.binder;
    }

    @NotNull
    public InterfaceC4008j<View> getMainView() {
        return this.mainView;
    }

    /* renamed from: isMainWidget, reason: from getter */
    public boolean getIsMainWidget() {
        return this.isMainWidget;
    }

    public void onDetach() {
        if (this.hasMessage) {
            this.handler.removeCallbacks(this.clickViewRunnable);
        }
    }

    public void setMainWidget(boolean z11) {
        this.isMainWidget = z11;
    }

    public /* synthetic */ WidgetImagePlaceholderViewHolderDelegateImpl(WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter, ViewGroup viewGroup, Function0 function0, InterfaceC4008j interfaceC4008j, InterfaceC4008j interfaceC4008j2, Function0 function02, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(widgetImagePlaceholderAdapter, viewGroup, function0, interfaceC4008j, interfaceC4008j2, (i11 & 32) != 0 ? null : function02);
    }
}
