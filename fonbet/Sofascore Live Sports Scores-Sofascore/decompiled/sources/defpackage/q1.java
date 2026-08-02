package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.sofascore.results.chat.fragment.AbstractChatFragment;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q1 extends RecyclerView.OnScrollListener {
    public final /* synthetic */ AbstractChatFragment a;

    public q1(AbstractChatFragment abstractChatFragment) {
        this.a = abstractChatFragment;
    }

    public final boolean b(RecyclerView recyclerView) {
        n layoutManager = recyclerView.getLayoutManager();
        layoutManager.getClass();
        int findLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        int itemCount = this.a.F().getItemCount();
        return findLastVisibleItemPosition >= 0 && itemCount + (-1) >= 0 && findLastVisibleItemPosition > itemCount + (-3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        recyclerView.getClass();
        AbstractChatFragment abstractChatFragment = this.a;
        if (i == 1) {
            abstractChatFragment.H = false;
        } else if (!abstractChatFragment.H) {
            abstractChatFragment.H = b(recyclerView);
        }
        n layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            abstractChatFragment.I = linearLayoutManager.findLastVisibleItemPosition();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        recyclerView.getClass();
        super.onScrolled(recyclerView, i, i2);
        AbstractChatFragment abstractChatFragment = this.a;
        sj4 sj4Var = abstractChatFragment.w;
        if (sj4Var == null) {
            Intrinsics.i("stickyHeaderDecoration");
            throw null;
        }
        sj4Var.e = b(recyclerView);
        boolean b = b(recyclerView);
        if (!b) {
            krk krkVar = abstractChatFragment.l;
            krkVar.getClass();
            if (!((yn8) krkVar).n.e()) {
                krk krkVar2 = abstractChatFragment.l;
                krkVar2.getClass();
                abstractChatFragment.t(((yn8) krkVar2).n, new h1(abstractChatFragment, 11));
                return;
            }
        }
        if (b) {
            krk krkVar3 = abstractChatFragment.l;
            krkVar3.getClass();
            if (((yn8) krkVar3).n.e()) {
                krk krkVar4 = abstractChatFragment.l;
                krkVar4.getClass();
                ((yn8) krkVar4).n.d(true);
                krk krkVar5 = abstractChatFragment.l;
                krkVar5.getClass();
                if (((yn8) krkVar5).k.getVisibility() == 0) {
                    krk krkVar6 = abstractChatFragment.l;
                    krkVar6.getClass();
                    tgj.q(((yn8) krkVar6).k, null, 15);
                }
            }
        }
    }
}
