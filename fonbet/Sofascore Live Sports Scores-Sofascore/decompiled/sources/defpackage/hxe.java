package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.sofascore.results.transfers.PlayerTransfersActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hxe extends RecyclerView.OnScrollListener {
    public final /* synthetic */ PlayerTransfersActivity a;

    public hxe(PlayerTransfersActivity playerTransfersActivity) {
        this.a = playerTransfersActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        recyclerView.getClass();
        super.onScrollStateChanged(recyclerView, i);
        n layoutManager = recyclerView.getLayoutManager();
        layoutManager.getClass();
        int findLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        if (findLastVisibleItemPosition >= 0) {
            int i2 = findLastVisibleItemPosition + 7;
            int i3 = PlayerTransfersActivity.R;
            PlayerTransfersActivity playerTransfersActivity = this.a;
            if (i2 > playerTransfersActivity.O().getItemCount()) {
                playerTransfersActivity.P().f(true);
            }
        }
    }
}
