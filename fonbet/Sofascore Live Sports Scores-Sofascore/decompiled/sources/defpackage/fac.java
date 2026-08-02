package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.mediarouter.app.OverlayListView;
import androidx.mediarouter.app.a;
import androidx.mediarouter.app.c;
import androidx.mediarouter.app.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fac implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ d b;

    public fac(d dVar, boolean z) {
        this.b = dVar;
        this.a = z;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        HashMap hashMap;
        HashMap hashMap2;
        Bitmap bitmap;
        d dVar = this.b;
        dVar.u.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (dVar.h0) {
            dVar.i0 = true;
            return;
        }
        obc obcVar = dVar.j;
        int i2 = dVar.C.getLayoutParams().height;
        d.o(-1, dVar.C);
        dVar.u(dVar.i());
        View decorView = dVar.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(dVar.getWindow().getAttributes().width, 1073741824), 0);
        d.o(i2, dVar.C);
        if (!(dVar.w.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) dVar.w.getDrawable()).getBitmap()) == null) {
            i = 0;
        } else {
            i = dVar.l(bitmap.getWidth(), bitmap.getHeight());
            dVar.w.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int m = dVar.m(dVar.i());
        int size = dVar.I.size();
        int size2 = dVar.n() ? Collections.unmodifiableList(obcVar.v).size() * dVar.Q : 0;
        if (size > 0) {
            size2 += dVar.S;
        }
        int min = Math.min(size2, dVar.R);
        if (!dVar.g0) {
            min = 0;
        }
        int max = Math.max(i, min) + m;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (dVar.t.getMeasuredHeight() - dVar.u.getMeasuredHeight());
        if (i <= 0 || max > height) {
            if (dVar.C.getMeasuredHeight() + dVar.G.getLayoutParams().height >= dVar.u.getMeasuredHeight()) {
                dVar.w.setVisibility(8);
            }
            max = min + m;
            i = 0;
        } else {
            dVar.w.setVisibility(0);
            d.o(i, dVar.w);
        }
        if (!dVar.i() || max > height) {
            dVar.D.setVisibility(8);
        } else {
            dVar.D.setVisibility(0);
        }
        dVar.u(dVar.D.getVisibility() == 0);
        int m2 = dVar.m(dVar.D.getVisibility() == 0);
        int max2 = Math.max(i, min) + m2;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        dVar.C.clearAnimation();
        dVar.G.clearAnimation();
        dVar.u.clearAnimation();
        LinearLayout linearLayout = dVar.C;
        boolean z = this.a;
        if (z) {
            dVar.h(m2, linearLayout);
            dVar.h(min, dVar.G);
            dVar.h(height, dVar.u);
        } else {
            d.o(m2, linearLayout);
            d.o(min, dVar.G);
            d.o(height, dVar.u);
        }
        d.o(rect.height(), dVar.s);
        List unmodifiableList = Collections.unmodifiableList(obcVar.v);
        boolean isEmpty = unmodifiableList.isEmpty();
        ArrayList arrayList = dVar.I;
        if (isEmpty) {
            arrayList.clear();
            dVar.H.notifyDataSetChanged();
            return;
        }
        if (new HashSet(arrayList).equals(new HashSet(unmodifiableList))) {
            dVar.H.notifyDataSetChanged();
            return;
        }
        if (z) {
            OverlayListView overlayListView = dVar.G;
            c cVar = dVar.H;
            hashMap = new HashMap();
            int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
            for (int i3 = 0; i3 < overlayListView.getChildCount(); i3++) {
                Object item = cVar.getItem(firstVisiblePosition + i3);
                View childAt = overlayListView.getChildAt(i3);
                hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
            }
        } else {
            hashMap = null;
        }
        if (z) {
            Context context = dVar.k;
            OverlayListView overlayListView2 = dVar.G;
            c cVar2 = dVar.H;
            hashMap2 = new HashMap();
            int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
            for (int i4 = 0; i4 < overlayListView2.getChildCount(); i4++) {
                Object item2 = cVar2.getItem(firstVisiblePosition2 + i4);
                View childAt2 = overlayListView2.getChildAt(i4);
                Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                childAt2.draw(new Canvas(createBitmap));
                hashMap2.put(item2, new BitmapDrawable(context.getResources(), createBitmap));
            }
        } else {
            hashMap2 = null;
        }
        ArrayList arrayList2 = dVar.I;
        HashSet hashSet = new HashSet(unmodifiableList);
        hashSet.removeAll(arrayList2);
        dVar.J = hashSet;
        HashSet hashSet2 = new HashSet(dVar.I);
        hashSet2.removeAll(unmodifiableList);
        dVar.K = hashSet2;
        dVar.I.addAll(0, dVar.J);
        dVar.I.removeAll(dVar.K);
        dVar.H.notifyDataSetChanged();
        if (z && dVar.g0) {
            if (dVar.K.size() + dVar.J.size() > 0) {
                dVar.G.setEnabled(false);
                dVar.G.requestLayout();
                dVar.h0 = true;
                dVar.G.getViewTreeObserver().addOnGlobalLayoutListener(new a(dVar, hashMap, hashMap2));
                return;
            }
        }
        dVar.J = null;
        dVar.K = null;
    }
}
