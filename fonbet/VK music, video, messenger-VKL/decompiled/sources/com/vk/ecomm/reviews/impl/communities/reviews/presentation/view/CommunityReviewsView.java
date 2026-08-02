package com.vk.ecomm.reviews.impl.communities.reviews.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.view.CommunityReviewsView;
import com.vk.movika.sdk.base.logic.interactor.h;
import com.vkontakte.android.R;
import java.util.Iterator;
import xsna.a0i;
import xsna.azh;
import xsna.b0i;
import xsna.e43;
import xsna.ef90;
import xsna.epx;
import xsna.fyh;
import xsna.hfz;
import xsna.jf90;
import xsna.m3a;
import xsna.rj1;
import xsna.tdg;
import xsna.wm1;
import xsna.wzh;
import xsna.xy80;
import xsna.yzh;
import xsna.zzh;

/* compiled from: CommunityReviewsView.kt */
/* loaded from: classes18.dex */
public final class CommunityReviewsView extends FrameLayout {
    public final SwipeRefreshLayout b;
    public final RecyclerView c;
    public final fyh d;
    public a0i<? super zzh> e;
    public xy80 f;
    public boolean g;
    public tdg h;

    public CommunityReviewsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        rj1 rj1Var = new rj1(this, 28);
        m3a m3aVar = new m3a(this);
        jf90 jf90Var = new jf90(new wzh(this, 0));
        View.inflate(context, R.layout.community_reviews_view_layout, this);
        this.d = new fyh(m3aVar, rj1Var, new h(this, 26), new wm1(this, 29));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.reviews_swipe_container);
        this.b = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: xsna.xzh
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void h() {
                a0i<? super zzh> a0iVar = CommunityReviewsView.this.e;
                if (a0iVar != null) {
                    a0iVar.c(b0i.c.a);
                }
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.reviews_rv);
        this.c = recyclerView;
        recyclerView.addItemDecoration(new yzh(this));
        RecyclerView recyclerView2 = this.c;
        (recyclerView2 == null ? null : recyclerView2).addOnScrollListener(new ef90(jf90Var));
        RecyclerView recyclerView3 = this.c;
        recyclerView3 = recyclerView3 == null ? null : recyclerView3;
        fyh fyhVar = this.d;
        recyclerView3.setAdapter(fyhVar != null ? fyhVar : null);
    }

    public final void a(azh azhVar) {
        RecyclerView recyclerView = this.c;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.addOnItemTouchListener(azhVar);
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

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0072, code lost:
    
        if (r2 != (-1)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0075, code lost:
    
        r7 = java.lang.Integer.valueOf(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i, boolean z) {
        Integer valueOf;
        fyh fyhVar = this.d;
        if (fyhVar == null) {
            fyhVar = null;
        }
        int i2 = 0;
        if (!z) {
            Iterator<T> it = fyhVar.h.iterator();
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
        } else {
            Iterator<T> it2 = fyhVar.h.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                }
                Object next2 = it2.next();
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                if (epx.f(((hfz) next2).getItemId(), Long.valueOf(i))) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                valueOf = Integer.valueOf(i2);
                if (valueOf == null) {
                    int intValue = valueOf.intValue();
                    RecyclerView recyclerView = this.c;
                    (recyclerView != null ? recyclerView : null).smoothScrollToPosition(intValue);
                    return;
                }
                return;
            }
            valueOf = null;
            if (valueOf == null) {
            }
        }
    }

    public final void setCommunityReviewsViewSupplierEvents(a0i<? super zzh> a0iVar) {
        this.e = a0iVar;
    }

    public final void setEnableWrapToDisableable(boolean z) {
        this.g = z;
    }

    public final void setOrientationListener(xy80 xy80Var) {
        this.f = xy80Var;
    }

    public final void setStickerAttachmentClickListener(tdg tdgVar) {
        this.h = tdgVar;
    }
}
