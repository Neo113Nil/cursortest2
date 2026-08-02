package ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation;

import android.view.View;
import c3.C5739a;
import c3.C5741c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersAnimator;", "", "Landroid/view/View;", "stickyView", "", "height", "<init>", "(Landroid/view/View;F)V", "", "show", "()V", "hide", "Landroid/view/View;", "F", "Lc3/c;", "linearOutSlowInInterpolator", "Lc3/c;", "Lc3/a;", "fastOutLinearInInterpolator", "Lc3/a;", "", "isShown", "Z", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuickFiltersAnimator {

    @NotNull
    private final C5739a fastOutLinearInInterpolator;
    private final float height;
    private boolean isShown;

    @NotNull
    private final C5741c linearOutSlowInInterpolator;

    @NotNull
    private final View stickyView;

    public QuickFiltersAnimator(@NotNull View stickyView, float f7) {
        Intrinsics.checkNotNullParameter(stickyView, "stickyView");
        this.stickyView = stickyView;
        this.height = f7;
        this.linearOutSlowInInterpolator = new C5741c();
        this.fastOutLinearInInterpolator = new C5739a();
        this.isShown = true;
    }

    public final void hide() {
        if (this.isShown) {
            this.isShown = false;
            this.stickyView.animate().translationYBy(-this.height).setDuration(300L).setInterpolator(this.fastOutLinearInInterpolator).start();
        }
    }

    public final void show() {
        if (this.isShown) {
            return;
        }
        this.isShown = true;
        this.stickyView.animate().translationYBy(-this.stickyView.getTranslationY()).setDuration(300L).setInterpolator(this.linearOutSlowInInterpolator).start();
    }
}
