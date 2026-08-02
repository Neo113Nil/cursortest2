package com.vk.stickers.views;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import defpackage.i0;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.c;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import xsna.asu0;
import xsna.bpn0;
import xsna.enh;
import xsna.g1j;
import xsna.g600;
import xsna.iie;
import xsna.s3q0;
import xsna.t2l;

/* compiled from: LongtapRecyclerView.kt */
/* loaded from: classes6.dex */
public class LongtapRecyclerView extends RecyclerView {
    public static int n;
    public a b;
    public final bpn0 c;
    public final bpn0 d;
    public int e;
    public int f;
    public MotionEvent g;
    public c h;
    public c i;
    public boolean j;
    public View k;
    public final ArrayList l;
    public Rect m;

    /* compiled from: LongtapRecyclerView.kt */
    public interface a {
        void a();

        void b();

        void c(View view);
    }

    public LongtapRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public static int a(LongtapRecyclerView longtapRecyclerView) {
        return longtapRecyclerView.getConfig().getScaledTouchSlop();
    }

    public static s3q0 c(LongtapRecyclerView longtapRecyclerView) {
        a aVar;
        longtapRecyclerView.getParent().requestDisallowInterceptTouchEvent(true);
        longtapRecyclerView.m = null;
        ArrayList arrayList = longtapRecyclerView.l;
        arrayList.clear();
        int[] iArr = {0, 0};
        for (int i = 0; i < longtapRecyclerView.getChildCount(); i++) {
            Rect rect = new Rect();
            View childAt = longtapRecyclerView.getChildAt(i);
            childAt.getDrawingRect(rect);
            childAt.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            arrayList.add(rect);
        }
        if (longtapRecyclerView.d(longtapRecyclerView.e, longtapRecyclerView.f)) {
            longtapRecyclerView.j = true;
            longtapRecyclerView.performHapticFeedback(0);
            MotionEvent obtain = MotionEvent.obtain(longtapRecyclerView.g);
            obtain.setLocation(longtapRecyclerView.e, longtapRecyclerView.f);
            super.dispatchTouchEvent(obtain);
            View view = longtapRecyclerView.k;
            if (view != null && (aVar = longtapRecyclerView.b) != null) {
                aVar.c(view);
            }
            longtapRecyclerView.e();
        }
        return s3q0.a;
    }

    private final ViewConfiguration getConfig() {
        return (ViewConfiguration) this.c.getValue();
    }

    private final int getTouchSlop() {
        return ((Number) this.d.getValue()).intValue();
    }

    public final boolean d(int i, int i2) {
        Rect rect = this.m;
        if (rect == null || !rect.contains(i, i2)) {
            ArrayList arrayList = this.l;
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                Rect rect2 = (Rect) arrayList.get(i3);
                if (rect2.contains(i, i2)) {
                    this.m = rect2;
                    View childAt = getChildAt(i3);
                    if (childAt != null && childAt.getTag(R.id.id) != null) {
                        View view = this.k;
                        if (view != null) {
                            view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(300L).start();
                        }
                        this.k = childAt;
                        childAt.animate().scaleX(0.9f).scaleY(0.9f).setDuration(300L).start();
                        return true;
                    }
                } else {
                    i3++;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        c cVar;
        a aVar;
        int i = n;
        if (i != 0 && i != getId()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.e = (int) motionEvent.getRawX();
            this.f = (int) motionEvent.getRawY();
            this.g = motionEvent;
            this.h = q.B0(ViewConfiguration.getLongPressTimeout(), TimeUnit.MILLISECONDS).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new i0(new g1j(this, 21), 27));
            super.dispatchTouchEvent(motionEvent);
            n = getId();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if ((Math.abs(motionEvent.getRawX() - this.e) > getTouchSlop() || Math.abs(motionEvent.getRawY() - this.f) > getTouchSlop()) && (cVar = this.h) != null) {
                    cVar.dispose();
                }
                if (!this.j) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (d((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    View view = this.k;
                    if (view != null && (aVar = this.b) != null) {
                        aVar.c(view);
                    }
                    c cVar2 = this.i;
                    if (cVar2 != null) {
                        cVar2.dispose();
                    }
                    this.i = null;
                    e();
                }
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        if (this.j) {
            ArrayList arrayList = this.l;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Rect rect = (Rect) arrayList.get(i2);
                if (rect.contains(this.e, this.f)) {
                    this.m = rect;
                    View childAt = getChildAt(i2);
                    if (childAt != null) {
                        childAt.dispatchTouchEvent(motionEvent);
                    }
                }
            }
        } else {
            super.dispatchTouchEvent(motionEvent);
        }
        this.j = false;
        c cVar3 = this.h;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        this.h = null;
        c cVar4 = this.i;
        if (cVar4 != null) {
            cVar4.dispose();
        }
        this.i = null;
        a aVar2 = this.b;
        if (aVar2 != null) {
            aVar2.b();
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        View view2 = this.k;
        if (view2 != null) {
            view2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(300L).start();
        }
        n = 0;
        return false;
    }

    public final void e() {
        c cVar = this.i;
        if (cVar != null) {
            cVar.dispose();
        }
        this.i = null;
        this.i = q.B0(1000L, TimeUnit.MILLISECONDS).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new g600(new iie(this, 22), 0));
    }

    public final void setLongtapListener(a aVar) {
        this.b = aVar;
    }

    public /* synthetic */ LongtapRecyclerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public LongtapRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.c = new bpn0(new enh(context, 24));
        this.d = new bpn0(new t2l(this, 18));
        this.l = new ArrayList();
    }
}
