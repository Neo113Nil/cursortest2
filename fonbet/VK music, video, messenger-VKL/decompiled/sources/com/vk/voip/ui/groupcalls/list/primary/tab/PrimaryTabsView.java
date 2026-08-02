package com.vk.voip.ui.groupcalls.list.primary.tab;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vk.voip.ui.groupcalls.list.primary.tab.a;
import com.vk.voip.ui.groupcalls.list.primary.tab.b;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.bwt0;
import xsna.cn70;
import xsna.f4m;
import xsna.j5g;
import xsna.jkm;

/* compiled from: PrimaryTabsView.kt */
/* loaded from: classes7.dex */
public final class PrimaryTabsView extends FrameLayout implements com.vk.voip.ui.groupcalls.list.primary.tab.a {
    public static final int k = cn70.b(4);
    public static final int l = cn70.b(8);
    public static final int m = cn70.b(16);
    public static final int n = cn70.b(4);
    public final Paint b;
    public final View c;
    public Object d;
    public List<a.C2055a> e;
    public a f;
    public int g;
    public a.b h;
    public boolean i;
    public boolean j;

    /* compiled from: PrimaryTabsView.kt */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public PrimaryTabsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        FontFamily fontFamily = FontFamily.MEDIUM;
        int i = a.C1933a.C1934a.$EnumSwitchMapping$0[TextSizeUnit.SP.ordinal()];
        float f = 13.0f;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = com.vk.typography.b.b(13.0f);
        }
        Font.Companion.getClass();
        paint.setTypeface(Font.a.a(fontFamily, f).k(context));
        paint.setTextSize(cn70.f(13));
        this.b = paint;
        EmptyList emptyList = EmptyList.b;
        this.d = emptyList;
        this.e = emptyList;
        setBackgroundResource(R.drawable.voip_primary_video_tabs_background);
        bwt0.m0(cn70.b(200), cn70.b(32), this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(cn70.b(48), cn70.b(24));
        layoutParams.gravity = 16;
        View view = new View(getContext());
        view.setLayoutParams(layoutParams);
        view.setBackgroundResource(R.drawable.voip_primary_video_tabs_selection_background);
        this.c = view;
        addView(view);
    }

    @Override // com.vk.voip.ui.groupcalls.list.primary.tab.a
    public final void a(float f, int i) {
        this.g = i;
        if (i >= this.e.size()) {
            return;
        }
        c(f, i);
    }

    public final int b(List<a.C2055a> list) {
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        String string = getContext().getString(((a.C2055a) it.next()).b);
        Paint paint = this.b;
        float measureText = paint.measureText(string);
        while (it.hasNext()) {
            measureText = Math.max(measureText, paint.measureText(getContext().getString(((a.C2055a) it.next()).b)));
        }
        return (l * 3) + m + ((int) measureText) + n;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.List] */
    public final void c(float f, int i) {
        a aVar = this.f;
        int i2 = k;
        if (aVar != null) {
            if (this.e.size() > 1) {
                View view = this.c;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                layoutParams.width = aVar.b;
                layoutParams.setMarginStart(((int) ((i + f) * (((aVar.a - (i2 * 2)) - r6) / (r2.size() - 1)))) + i2);
                view.setLayoutParams(layoutParams);
            }
        }
        for (int i3 = 0; i3 < i; i3++) {
            b bVar = (b) j5g.b0(i3, this.d);
            if (bVar != null) {
                bVar.setTabOpenProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        b bVar2 = (b) j5g.b0(i, this.d);
        if (bVar2 != null) {
            bVar2.setTabOpenProgress(1.0f - f);
        }
        b bVar3 = (b) j5g.b0(i + 1, this.d);
        if (bVar3 != null) {
            bVar3.setTabOpenProgress(f);
        }
        int size = this.e.size();
        for (int i4 = i + 2; i4 < size; i4++) {
            b bVar4 = (b) j5g.b0(i4, this.d);
            if (bVar4 != null) {
                bVar4.setTabOpenProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        for (b bVar5 : this.d) {
            f4m.s(i2, bVar5);
            i2 += bVar5.getLayoutParams().width;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r2.j != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        boolean z;
        if (this.i) {
            z = true;
            if (this.e.size() > 1) {
            }
        }
        z = false;
        bwt0.p0(this, z);
    }

    public void setControlsVisible(boolean z) {
        this.j = z;
        d();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // com.vk.voip.ui.groupcalls.list.primary.tab.a
    public void setItems(List<a.C2055a> list) {
        if (list.size() > 1) {
            this.e = list;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                removeView((b) it.next());
            }
            int b = b(list);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (a.C2055a c2055a : list) {
                b bVar = new b(getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 16;
                bVar.setLayoutParams(layoutParams);
                int i2 = l;
                int i3 = m;
                bVar.setConfiguration(new b.a((i2 * 2) + i3, b, i3, i2, c2055a.a, c2055a.b));
                addView(bVar);
                arrayList.add(bVar);
                bwt0.i0(bVar, new jkm(this, i, 2));
                i++;
            }
            this.d = arrayList;
            if (list.size() <= 1) {
                this.f = null;
            } else {
                int b2 = b(list);
                int size = ((list.size() - 1) * ((l * 2) + m)) + (k * 2) + b2;
                this.f = new a(size, b2);
                bwt0.r0(size, this);
            }
            c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.g);
        } else {
            this.e = EmptyList.b;
        }
        d();
    }

    @Override // com.vk.voip.ui.groupcalls.list.primary.tab.a
    public void setListener(a.b bVar) {
        this.h = bVar;
    }

    @Override // com.vk.voip.ui.groupcalls.list.primary.tab.a
    public void setSelectedPageIndex(int i) {
        this.g = i;
        if (i >= this.e.size()) {
            return;
        }
        c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i);
    }

    @Override // com.vk.voip.ui.groupcalls.list.primary.tab.a
    public void setTabsVisible(boolean z) {
        this.i = z;
        d();
    }
}
