package ru.ozon.app.android.composer;

import B0.A0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/composer/ComposerViewPool;", "Landroidx/recyclerview/widget/RecyclerView$u;", "<init>", "()V", "", "viewType", "Landroidx/recyclerview/widget/RecyclerView$C;", "getRecycledView", "(I)Landroidx/recyclerview/widget/RecyclerView$C;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerViewPool extends RecyclerView.u {
    @Override // androidx.recyclerview.widget.RecyclerView.u
    public RecyclerView.C getRecycledView(int viewType) {
        RecyclerView.C recycledView = super.getRecycledView(viewType);
        if (viewType == 0) {
            throw new IllegalArgumentException(A0.b("You have to define viewType as id of your xml layout ", recycledView != null ? recycledView.getClass().getName() : null, " see https://gitlab.ozon.ru/mobileapps/ozon.ru_android/-/wikis/shared-recycler-view-pool for details"));
        }
        return recycledView;
    }
}
