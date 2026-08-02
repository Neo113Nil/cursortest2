package com.vk.topics.impl.fragments;

import com.vk.comments.core.BoardComment;
import com.vk.topics.impl.fragments.BoardTopicViewFragment;
import com.vk.topics.impl.view.PaginationView;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.yh7;

/* compiled from: BoardTopicViewFragment.kt */
/* loaded from: classes6.dex */
public final class a implements UsableRecyclerView.l {
    public final /* synthetic */ BoardTopicViewFragment b;

    public a(BoardTopicViewFragment boardTopicViewFragment) {
        this.b = boardTopicViewFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // me.grishka.appkit.views.UsableRecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Zd(int i, int i2, int i3) {
        yh7 yh7Var;
        int i4;
        BoardTopicViewFragment boardTopicViewFragment = this.b;
        if (i < 6) {
            yh7 yh7Var2 = boardTopicViewFragment.r0;
            if (yh7Var2 != null) {
                boardTopicViewFragment.getActivity();
                yh7Var2.f();
            }
        } else if (i + i2 > i3 - 6 && (yh7Var = boardTopicViewFragment.r0) != null) {
            yh7Var.e(boardTopicViewFragment.getActivity());
        }
        PaginationView paginationView = boardTopicViewFragment.l0;
        if (paginationView == null) {
            return;
        }
        BoardTopicViewFragment.b bVar = boardTopicViewFragment.o0;
        int i5 = i + i2;
        if (i5 < 0) {
            bVar.getClass();
        } else if (i5 < bVar.d.size()) {
            i4 = ((BoardComment) bVar.d.get(i5).a).n;
            if (i4 < 0) {
                paginationView.setCurrentPage((i4 == 0 ? 0 : i4 / 20) + 1);
                return;
            }
            return;
        }
        i4 = -1;
        if (i4 < 0) {
        }
    }

    @Override // me.grishka.appkit.views.UsableRecyclerView.p
    public final void M() {
    }

    @Override // me.grishka.appkit.views.UsableRecyclerView.p
    public final void N0() {
    }
}
