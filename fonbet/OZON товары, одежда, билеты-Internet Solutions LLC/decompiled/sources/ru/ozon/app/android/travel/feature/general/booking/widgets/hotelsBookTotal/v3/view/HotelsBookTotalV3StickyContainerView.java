package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.view;

import Am.C2438a;
import FN.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.vo.HotelsBookTotalV3StickyVO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011J\b\u0010\u0013\u001a\u00020\rH\u0002J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\rH\u0003J\b\u0010\u0018\u001a\u00020\rH\u0003R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/view/HotelsBookTotalV3StickyContainerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "button", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getButton", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "button$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3StickyVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "addViews", "toggleButtonLoader", "isLoading", "", "disableTouchAndShowLoader", "enableTouchAndHideLoader", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV3StickyContainerView extends FrameLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(HotelsBookTotalV3StickyContainerView.class, "button", "getButton()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", 0)};

    /* renamed from: button$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate button;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsBookTotalV3StickyContainerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.button = new PreCreationViewPoolDelegate(context2, N.b(ButtonV3View.class), new HotelsBookTotalV3StickyContainerView$special$$inlined$preCreationViewPool$default$1(this), new HotelsBookTotalV3StickyContainerView$special$$inlined$preCreationViewPool$default$2());
        addViews();
    }

    private final void addViews() {
        addView(getButton());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void disableTouchAndShowLoader() {
        getButton().setOnTouchListener(new c());
        getButton().showLoader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean disableTouchAndShowLoader$lambda$1(View view, MotionEvent motionEvent) {
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void enableTouchAndHideLoader() {
        getButton().setOnTouchListener(null);
        getButton().hideLoader();
    }

    private final ButtonV3View getButton() {
        return (ButtonV3View) this.button.getValue(this, $$delegatedProperties[0]);
    }

    private final void toggleButtonLoader(boolean isLoading) {
        if (isLoading) {
            disableTouchAndShowLoader();
        } else {
            enableTouchAndHideLoader();
        }
    }

    public final void bind(@NotNull HotelsBookTotalV3StickyVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ButtonV3HolderKt.bind(getButton(), item.getButton(), actionHandler);
        ViewExtKt.setOnClickListenerThrottle$default(getButton(), 0L, new HotelsBookTotalV3StickyContainerView$bind$1(item, actionHandler), 1, null);
        toggleButtonLoader(item.getIsLoading());
    }
}
