package defpackage;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.sofascore.results.R;
import com.sofascore.results.main.favorites.FavoriteEventsFragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xr7 extends RecyclerView.OnScrollListener {
    public final /* synthetic */ FavoriteEventsFragment a;

    public xr7(FavoriteEventsFragment favoriteEventsFragment) {
        this.a = favoriteEventsFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        recyclerView.getClass();
        super.onScrolled(recyclerView, i, i2);
        FavoriteEventsFragment favoriteEventsFragment = this.a;
        krk krkVar = favoriteEventsFragment.l;
        krkVar.getClass();
        n layoutManager = ((go8) krkVar).c.getLayoutManager();
        layoutManager.getClass();
        int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        krk krkVar2 = favoriteEventsFragment.l;
        krkVar2.getClass();
        n layoutManager2 = ((go8) krkVar2).c.getLayoutManager();
        layoutManager2.getClass();
        boolean z = ((LinearLayoutManager) layoutManager2).findLastVisibleItemPosition() + 1 < favoriteEventsFragment.A;
        int i3 = favoriteEventsFragment.B;
        boolean z2 = 1 <= i3 && i3 < findFirstVisibleItemPosition;
        krk krkVar3 = favoriteEventsFragment.l;
        krkVar3.getClass();
        ExtendedFloatingActionButton extendedFloatingActionButton = ((go8) krkVar3).b;
        if (favoriteEventsFragment.A < 0 || !(z || z2)) {
            extendedFloatingActionButton.y(1);
        } else {
            extendedFloatingActionButton.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, favoriteEventsFragment.requireContext().getDrawable(z ? R.drawable.ic_chevron_down_large_16 : R.drawable.ic_chevron_up_large_16), (Drawable) null);
            extendedFloatingActionButton.y(0);
        }
    }
}
