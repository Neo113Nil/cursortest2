package com.sofascore.results.chat.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.n;
import defpackage.fhc;
import defpackage.nl2;
import defpackage.nq4;
import defpackage.qrf;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/chat/view/ChatRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ChatRecyclerView extends RecyclerView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRecyclerView(@NotNull final Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        context.getClass();
        setDescendantFocusability(131072);
        setHasFixedSize(true);
        m itemAnimator = getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.c = 0L;
        }
        nq4 nq4Var = (nq4) getItemAnimator();
        if (nq4Var != null) {
            nq4Var.g = false;
        }
        setLayoutManager(new LinearLayoutManager() { // from class: com.sofascore.results.chat.view.ChatRecyclerView.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.n
            public final void smoothScrollToPosition(RecyclerView recyclerView, qrf qrfVar, int i) {
                recyclerView.getClass();
                qrfVar.getClass();
                nl2 nl2Var = new nl2(context, 1);
                nl2Var.setTargetPosition(i);
                startSmoothScroll(nl2Var);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.n
            public final boolean supportsPredictiveItemAnimations() {
                return false;
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        l adapter = getAdapter();
        fhc fhcVar = adapter instanceof fhc ? (fhc) adapter : null;
        if (fhcVar == null) {
            return;
        }
        n layoutManager = getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        int itemCount = fhcVar.getItemCount() - 1;
        int max = Math.max(0, itemCount);
        if (Math.abs(itemCount - findLastVisibleItemPosition) <= 5) {
            smoothScrollToPosition(max);
        } else {
            scrollToPosition(max);
        }
    }
}
