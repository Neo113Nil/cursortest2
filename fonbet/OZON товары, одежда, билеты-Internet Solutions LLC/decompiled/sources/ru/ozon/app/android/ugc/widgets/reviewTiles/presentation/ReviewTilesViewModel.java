package ru.ozon.app.android.ugc.widgets.reviewTiles.presentation;

import android.os.Parcelable;
import androidx.lifecycle.w0;
import h20.InterfaceC6786a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u0005R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesViewModel;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "<init>", "()V", "", "onCleared", "Landroid/os/Parcelable;", "scrollState", "Landroid/os/Parcelable;", "getScrollState", "()Landroid/os/Parcelable;", "setScrollState", "(Landroid/os/Parcelable;)V", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewTilesViewModel extends w0 implements InterfaceC6786a {
    private Parcelable scrollState;

    public final Parcelable getScrollState() {
        return this.scrollState;
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
    }

    public final void setScrollState(Parcelable parcelable) {
        this.scrollState = parcelable;
    }
}
