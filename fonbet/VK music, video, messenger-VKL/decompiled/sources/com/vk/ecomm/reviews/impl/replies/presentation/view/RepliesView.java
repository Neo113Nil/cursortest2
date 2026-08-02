package com.vk.ecomm.reviews.impl.replies.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.ecomm.reviews.impl.replies.presentation.view.RepliesView;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.bbb0;
import xsna.e43;
import xsna.ef90;
import xsna.eig0;
import xsna.epx;
import xsna.hfz;
import xsna.jf90;
import xsna.m2g0;
import xsna.r2g0;
import xsna.sy50;
import xsna.t2g0;
import xsna.tdg;

/* compiled from: RepliesView.kt */
/* loaded from: classes18.dex */
public final class RepliesView extends FrameLayout {
    public final SwipeRefreshLayout b;
    public final RecyclerView c;
    public final r2g0 d;
    public eig0<t2g0> e;
    public tdg f;

    public RepliesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        m2g0 m2g0Var = new m2g0(this);
        jf90 jf90Var = new jf90(new sy50(this, 25));
        View.inflate(context, R.layout.replies_view_layout, this);
        this.d = new r2g0(m2g0Var, new bbb0(this, 10));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.reviews_swipe_container);
        this.b = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: xsna.n2g0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void h() {
                eig0<t2g0> eig0Var = RepliesView.this.e;
                if (eig0Var != null) {
                    eig0Var.a(t2g0.f.a);
                }
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.replies_rv);
        this.c = recyclerView;
        recyclerView.addOnScrollListener(new ef90(jf90Var));
        RecyclerView recyclerView2 = this.c;
        recyclerView2 = recyclerView2 == null ? null : recyclerView2;
        r2g0 r2g0Var = this.d;
        recyclerView2.setAdapter(r2g0Var != null ? r2g0Var : null);
    }

    public final void a(RecyclerView.y yVar) {
        RecyclerView recyclerView = this.c;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.addOnItemTouchListener(yVar);
    }

    public final void b() {
        SwipeRefreshLayout swipeRefreshLayout = this.b;
        if (swipeRefreshLayout == null) {
            swipeRefreshLayout = null;
        }
        swipeRefreshLayout.setEnabled(false);
    }

    public final void c() {
        SwipeRefreshLayout swipeRefreshLayout = this.b;
        if (swipeRefreshLayout == null) {
            swipeRefreshLayout = null;
        }
        swipeRefreshLayout.setEnabled(true);
    }

    public final void d() {
        SwipeRefreshLayout swipeRefreshLayout = this.b;
        if (swipeRefreshLayout == null) {
            swipeRefreshLayout = null;
        }
        swipeRefreshLayout.setRefreshing(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r2 != (-1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r7 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        r7 = r7.intValue();
        r1 = r6.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (r1 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        r0.smoothScrollToPosition(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
    
        r7 = java.lang.Integer.valueOf(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(int i) {
        RecyclerView recyclerView = null;
        r2g0 r2g0Var = this.d;
        if (r2g0Var == null) {
            r2g0Var = null;
        }
        Iterator<T> it = r2g0Var.h.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            Object next = it.next();
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            if (epx.f(((hfz) next).getItemId(), Integer.valueOf(i))) {
                break;
            } else {
                i2++;
            }
        }
    }

    public final void f() {
        RecyclerView recyclerView = this.c;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.smoothScrollToPosition(0);
    }

    public final void g(List<? extends hfz> list) {
        r2g0 r2g0Var = this.d;
        if (r2g0Var == null) {
            r2g0Var = null;
        }
        r2g0Var.setItems(list);
    }

    public final void setEventSupplier(eig0<t2g0> eig0Var) {
        this.e = eig0Var;
    }

    public final void setStickerAttachmentClickListener(tdg tdgVar) {
        this.f = tdgVar;
    }
}
