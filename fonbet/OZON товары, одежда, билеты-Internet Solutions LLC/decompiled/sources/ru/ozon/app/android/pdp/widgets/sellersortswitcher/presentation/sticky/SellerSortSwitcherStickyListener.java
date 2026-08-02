package ru.ozon.app.android.pdp.widgets.sellersortswitcher.presentation.sticky;

import HC.a;
import Nc.C3667a;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R.\u0010\u0019\u001a\u0004\u0018\u00010\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/sticky/SellerSortSwitcherStickyListener;", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "Lkotlin/Function1;", "Landroid/view/ViewGroup;", "", "textViewVisibilityChecker", "", "onChangeStickyVisibilityStatus", "<init>", "(Landroidx/recyclerview/widget/LinearLayoutManager;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "subscribeDebounce", "()V", "perform", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lkotlin/jvm/functions/Function1;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "uiWidgetPosition", "Ljava/lang/Integer;", "getUiWidgetPosition", "()Ljava/lang/Integer;", "setUiWidgetPosition", "(Ljava/lang/Integer;)V", "isVisible", "Z", "LNc/a;", "debounce", "LNc/a;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SellerSortSwitcherStickyListener extends RecyclerView.t {

    @NotNull
    private final C3667a<Unit> debounce;
    private boolean isVisible;

    @NotNull
    private final LinearLayoutManager layoutManager;

    @NotNull
    private final Function1<Boolean, Unit> onChangeStickyVisibilityStatus;

    @NotNull
    private final Function1<ViewGroup, Boolean> textViewVisibilityChecker;
    private Integer uiWidgetPosition;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/sticky/SellerSortSwitcherStickyListener$Companion;", "", "<init>", "()V", "DELAY", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SellerSortSwitcherStickyListener(@NotNull LinearLayoutManager layoutManager, @NotNull Function1<? super ViewGroup, Boolean> textViewVisibilityChecker, @NotNull Function1<? super Boolean, Unit> onChangeStickyVisibilityStatus) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(textViewVisibilityChecker, "textViewVisibilityChecker");
        Intrinsics.checkNotNullParameter(onChangeStickyVisibilityStatus, "onChangeStickyVisibilityStatus");
        this.layoutManager = layoutManager;
        this.textViewVisibilityChecker = textViewVisibilityChecker;
        this.onChangeStickyVisibilityStatus = onChangeStickyVisibilityStatus;
        C3667a<Unit> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.debounce = d11;
        subscribeDebounce();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void perform() {
        Integer num = this.uiWidgetPosition;
        if (num != null) {
            int intValue = num.intValue();
            int findFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = this.layoutManager.findLastVisibleItemPosition();
            View findViewByPosition = this.layoutManager.findViewByPosition(intValue);
            ViewGroup viewGroup = findViewByPosition instanceof ViewGroup ? (ViewGroup) findViewByPosition : null;
            boolean z11 = false;
            if (viewGroup != null && findFirstVisibleItemPosition <= intValue && intValue <= findLastVisibleItemPosition && this.textViewVisibilityChecker.invoke(viewGroup).booleanValue()) {
                z11 = true;
            }
            if (this.isVisible != z11) {
                this.isVisible = z11;
                this.onChangeStickyVisibilityStatus.invoke(Boolean.valueOf(z11));
            }
        }
    }

    @SuppressLint({"CheckResult"})
    private final void subscribeDebounce() {
        this.debounce.throttleLatest(100L, TimeUnit.MILLISECONDS).observeOn(C8125a.a()).subscribe(new a(new SellerSortSwitcherStickyListener$subscribeDebounce$1(this), 3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.debounce.onNext(Unit.f71690a);
    }

    public final void setUiWidgetPosition(Integer num) {
        this.uiWidgetPosition = num;
        this.debounce.onNext(Unit.f71690a);
    }
}
