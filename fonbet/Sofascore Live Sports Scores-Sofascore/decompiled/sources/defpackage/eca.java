package defpackage;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.recyclerview.R;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.u;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class eca extends erf implements irf {
    public Rect A;
    public long B;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public final bca m;
    public int o;
    public int q;
    public RecyclerView r;
    public VelocityTracker t;
    public ArrayList u;
    public ArrayList v;
    public GestureDetector x;
    public cca y;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public u c = null;
    public int l = -1;
    public int n = 0;
    public final ArrayList p = new ArrayList();
    public final b8 s = new b8(this, 20);
    public View w = null;
    public final yba z = new yba(this, 0);

    public eca(bca bcaVar) {
        this.m = bcaVar;
    }

    public static boolean m(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // defpackage.irf
    public final void b(View view) {
        if (view == this.w) {
            this.w = null;
        }
        u childViewHolder = this.r.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        u uVar = this.c;
        if (uVar != null && childViewHolder == uVar) {
            o(null, 0);
            return;
        }
        j(childViewHolder, false);
        if (this.a.remove(childViewHolder.itemView)) {
            this.m.c(this.r, childViewHolder);
        }
    }

    public final void f(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        yba ybaVar = this.z;
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.r.removeOnItemTouchListener(ybaVar);
            this.r.removeOnChildAttachStateChangeListener(this);
            ArrayList arrayList = this.p;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                zba zbaVar = (zba) arrayList.get(0);
                zbaVar.g.cancel();
                this.m.c(this.r, zbaVar.e);
            }
            arrayList.clear();
            this.w = null;
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.t = null;
            }
            cca ccaVar = this.y;
            if (ccaVar != null) {
                ccaVar.a = false;
                this.y = null;
            }
            if (this.x != null) {
                this.x = null;
            }
        }
        this.r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.q = ViewConfiguration.get(this.r.getContext()).getScaledTouchSlop();
            this.r.addItemDecoration(this);
            this.r.addOnItemTouchListener(ybaVar);
            this.r.addOnChildAttachStateChangeListener(this);
            this.y = new cca(this);
            this.x = new GestureDetector(this.r.getContext(), this.y);
        }
    }

    public final int g(u uVar, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.h > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 8 : 4;
        VelocityTracker velocityTracker = this.t;
        bca bcaVar = this.m;
        if (velocityTracker != null && this.l > -1) {
            float f = this.g;
            bcaVar.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            int i3 = xVelocity > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3) {
                float f2 = this.f;
                bcaVar.getClass();
                if (abs >= f2 && abs > Math.abs(yVelocity)) {
                    return i3;
                }
            }
        }
        float j = bcaVar.j(uVar) * this.r.getWidth();
        if ((i & i2) == 0 || Math.abs(this.h) <= j) {
            return 0;
        }
        return i2;
    }

    @Override // defpackage.erf
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, qrf qrfVar) {
        rect.setEmpty();
    }

    public final void h(int i, int i2, MotionEvent motionEvent) {
        View k;
        if (this.c == null && i == 2 && this.n != 2) {
            bca bcaVar = this.m;
            if (bcaVar.l() && this.r.getScrollState() != 1) {
                n layoutManager = this.r.getLayoutManager();
                int i3 = this.l;
                u uVar = null;
                if (i3 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i3);
                    float x = motionEvent.getX(findPointerIndex) - this.d;
                    float y = motionEvent.getY(findPointerIndex) - this.e;
                    float abs = Math.abs(x);
                    float abs2 = Math.abs(y);
                    float f = this.q;
                    if ((abs >= f || abs2 >= f) && ((abs <= abs2 || !layoutManager.canScrollHorizontally()) && ((abs2 <= abs || !layoutManager.canScrollVertically()) && (k = k(motionEvent)) != null))) {
                        uVar = this.r.getChildViewHolder(k);
                    }
                }
                if (uVar == null) {
                    return;
                }
                RecyclerView recyclerView = this.r;
                int d = (bcaVar.d(bcaVar.i(recyclerView, uVar), recyclerView.getLayoutDirection()) & 65280) >> 8;
                if (d == 0) {
                    return;
                }
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                float f2 = x2 - this.d;
                float f3 = y2 - this.e;
                float abs3 = Math.abs(f2);
                float abs4 = Math.abs(f3);
                float f4 = this.q;
                if (abs3 >= f4 || abs4 >= f4) {
                    if (abs3 > abs4) {
                        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (d & 4) == 0) {
                            return;
                        }
                        if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (d & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (d & 1) == 0) {
                            return;
                        }
                        if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (d & 2) == 0) {
                            return;
                        }
                    }
                    this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    this.l = motionEvent.getPointerId(0);
                    o(uVar, 1);
                }
            }
        }
    }

    public final int i(u uVar, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.i > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 2 : 1;
        VelocityTracker velocityTracker = this.t;
        bca bcaVar = this.m;
        if (velocityTracker != null && this.l > -1) {
            float f = this.g;
            bcaVar.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            int i3 = yVelocity > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2) {
                float f2 = this.f;
                bcaVar.getClass();
                if (abs >= f2 && abs > Math.abs(xVelocity)) {
                    return i3;
                }
            }
        }
        float j = bcaVar.j(uVar) * this.r.getHeight();
        if ((i & i2) == 0 || Math.abs(this.i) <= j) {
            return 0;
        }
        return i2;
    }

    public final void j(u uVar, boolean z) {
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            zba zbaVar = (zba) arrayList.get(size);
            if (zbaVar.e == uVar) {
                zbaVar.k |= z;
                if (!zbaVar.l) {
                    zbaVar.g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View k(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        u uVar = this.c;
        if (uVar != null) {
            View view = uVar.itemView;
            if (m(view, x, y, this.j + this.h, this.k + this.i)) {
                return view;
            }
        }
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            zba zbaVar = (zba) arrayList.get(size);
            View view2 = zbaVar.e.itemView;
            if (m(view2, x, y, zbaVar.i, zbaVar.j)) {
                return view2;
            }
        }
        return this.r.findChildViewUnder(x, y);
    }

    public final void l(float[] fArr) {
        if ((this.o & 12) != 0) {
            fArr[0] = (this.j + this.h) - this.c.itemView.getLeft();
        } else {
            fArr[0] = this.c.itemView.getTranslationX();
        }
        if ((this.o & 3) != 0) {
            fArr[1] = (this.k + this.i) - this.c.itemView.getTop();
        } else {
            fArr[1] = this.c.itemView.getTranslationY();
        }
    }

    public final void n(u uVar) {
        int i;
        int i2;
        int i3;
        if (this.r.isLayoutRequested()) {
            return;
        }
        char c = 2;
        if (this.n != 2) {
            return;
        }
        bca bcaVar = this.m;
        float h = bcaVar.h(uVar);
        int i4 = (int) (this.j + this.h);
        int i5 = (int) (this.k + this.i);
        if (Math.abs(i5 - uVar.itemView.getTop()) >= uVar.itemView.getHeight() * h || Math.abs(i4 - uVar.itemView.getLeft()) >= uVar.itemView.getWidth() * h) {
            ArrayList arrayList = this.u;
            if (arrayList == null) {
                this.u = new ArrayList();
                this.v = new ArrayList();
            } else {
                arrayList.clear();
                this.v.clear();
            }
            int g = bcaVar.g();
            int round = Math.round(this.j + this.h) - g;
            int round2 = Math.round(this.k + this.i) - g;
            int i6 = g * 2;
            int width = uVar.itemView.getWidth() + round + i6;
            int height = uVar.itemView.getHeight() + round2 + i6;
            int i7 = (round + width) / 2;
            int i8 = (round2 + height) / 2;
            n layoutManager = this.r.getLayoutManager();
            int childCount = layoutManager.getChildCount();
            int i9 = 0;
            while (i9 < childCount) {
                char c2 = c;
                View childAt = layoutManager.getChildAt(i9);
                if (childAt != uVar.itemView && childAt.getBottom() >= round2 && childAt.getTop() <= height && childAt.getRight() >= round && childAt.getLeft() <= width) {
                    u childViewHolder = this.r.getChildViewHolder(childAt);
                    i = i7;
                    if (bcaVar.a(this.r, this.c, childViewHolder)) {
                        int abs = Math.abs(i - ((childAt.getRight() + childAt.getLeft()) / 2));
                        int abs2 = Math.abs(i8 - ((childAt.getBottom() + childAt.getTop()) / 2));
                        int i10 = (abs2 * abs2) + (abs * abs);
                        int size = this.u.size();
                        i2 = round;
                        i3 = round2;
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < size) {
                            int i13 = size;
                            if (i10 <= ((Integer) this.v.get(i11)).intValue()) {
                                break;
                            }
                            i12++;
                            i11++;
                            size = i13;
                        }
                        this.u.add(i12, childViewHolder);
                        this.v.add(i12, Integer.valueOf(i10));
                        i9++;
                        c = c2;
                        round = i2;
                        i7 = i;
                        round2 = i3;
                    }
                } else {
                    i = i7;
                }
                i2 = round;
                i3 = round2;
                i9++;
                c = c2;
                round = i2;
                i7 = i;
                round2 = i3;
            }
            ArrayList arrayList2 = this.u;
            if (arrayList2.size() == 0) {
                return;
            }
            u b = bcaVar.b(uVar, arrayList2, i4, i5);
            if (b == null) {
                this.u.clear();
                this.v.clear();
                return;
            }
            int absoluteAdapterPosition = b.getAbsoluteAdapterPosition();
            int absoluteAdapterPosition2 = uVar.getAbsoluteAdapterPosition();
            if (bcaVar.q(this.r, uVar, b)) {
                this.m.r(this.r, uVar, absoluteAdapterPosition2, b, absoluteAdapterPosition, i4, i5);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x008e, code lost:
    
        if (r8 > 0) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(u uVar, int i) {
        bca bcaVar;
        boolean z;
        boolean z2;
        u uVar2;
        int i2;
        VelocityTracker velocityTracker;
        ?? r16;
        float signum;
        if (uVar == this.c && i == this.n) {
            return;
        }
        this.B = Long.MIN_VALUE;
        int i3 = this.n;
        j(uVar, true);
        this.n = i;
        if (i == 2) {
            if (uVar == null) {
                a70.p("Must pass a ViewHolder when dragging");
                return;
            }
            this.w = uVar.itemView;
        }
        int i4 = (1 << ((i * 8) + 8)) - 1;
        u uVar3 = this.c;
        bca bcaVar2 = this.m;
        if (uVar3 != null) {
            if (uVar3.itemView.getParent() != null) {
                if (i3 != 2 && this.n != 2) {
                    int i5 = bcaVar2.i(this.r, uVar3);
                    int d = (bcaVar2.d(i5, this.r.getLayoutDirection()) & 65280) >> 8;
                    if (d != 0) {
                        int i6 = (i5 & 65280) >> 8;
                        if (Math.abs(this.h) > Math.abs(this.i)) {
                            i2 = g(uVar3, d);
                            if (i2 <= 0) {
                                i2 = i(uVar3, d);
                            } else if ((i6 & i2) == 0) {
                                i2 = bca.e(i2, this.r.getLayoutDirection());
                            }
                            velocityTracker = this.t;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.t = null;
                            }
                            int i7 = 4;
                            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            if (i2 != 1 || i2 == 2) {
                                r16 = 0;
                                signum = Math.signum(this.i) * this.r.getHeight();
                            } else if (i2 == 4 || i2 == 8 || i2 == 16 || i2 == 32) {
                                r16 = 0;
                                signum = 0.0f;
                                f = Math.signum(this.h) * this.r.getWidth();
                            } else {
                                signum = 0.0f;
                                r16 = 0;
                            }
                            if (i3 == 2) {
                                i7 = 8;
                            } else if (i2 > 0) {
                                i7 = 2;
                            }
                            float[] fArr = this.b;
                            l(fArr);
                            float f2 = f;
                            float f3 = signum;
                            float f4 = fArr[r16];
                            float f5 = fArr[1];
                            z = r16;
                            bcaVar = bcaVar2;
                            zba zbaVar = new zba(this, uVar3, i3, f4, f5, f2, f3, i2, uVar3);
                            long f6 = bcaVar.f(this.r, i7, f2 - f4, f3 - f5);
                            ValueAnimator valueAnimator = zbaVar.g;
                            valueAnimator.setDuration(f6);
                            this.p.add(zbaVar);
                            uVar3.setIsRecyclable(z);
                            valueAnimator.start();
                            uVar2 = null;
                            z2 = true;
                        } else {
                            i2 = i(uVar3, d);
                            if (i2 <= 0) {
                                i2 = g(uVar3, d);
                                if (i2 > 0) {
                                    if ((i6 & i2) == 0) {
                                        i2 = bca.e(i2, this.r.getLayoutDirection());
                                    }
                                }
                            }
                            velocityTracker = this.t;
                            if (velocityTracker != null) {
                            }
                            int i72 = 4;
                            float f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            if (i2 != 1) {
                            }
                            r16 = 0;
                            signum = Math.signum(this.i) * this.r.getHeight();
                            if (i3 == 2) {
                            }
                            float[] fArr2 = this.b;
                            l(fArr2);
                            float f22 = f7;
                            float f32 = signum;
                            float f42 = fArr2[r16];
                            float f52 = fArr2[1];
                            z = r16;
                            bcaVar = bcaVar2;
                            zba zbaVar2 = new zba(this, uVar3, i3, f42, f52, f22, f32, i2, uVar3);
                            long f62 = bcaVar.f(this.r, i72, f22 - f42, f32 - f52);
                            ValueAnimator valueAnimator2 = zbaVar2.g;
                            valueAnimator2.setDuration(f62);
                            this.p.add(zbaVar2);
                            uVar3.setIsRecyclable(z);
                            valueAnimator2.start();
                            uVar2 = null;
                            z2 = true;
                        }
                    }
                }
                i2 = 0;
                velocityTracker = this.t;
                if (velocityTracker != null) {
                }
                int i722 = 4;
                float f72 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (i2 != 1) {
                }
                r16 = 0;
                signum = Math.signum(this.i) * this.r.getHeight();
                if (i3 == 2) {
                }
                float[] fArr22 = this.b;
                l(fArr22);
                float f222 = f72;
                float f322 = signum;
                float f422 = fArr22[r16];
                float f522 = fArr22[1];
                z = r16;
                bcaVar = bcaVar2;
                zba zbaVar22 = new zba(this, uVar3, i3, f422, f522, f222, f322, i2, uVar3);
                long f622 = bcaVar.f(this.r, i722, f222 - f422, f322 - f522);
                ValueAnimator valueAnimator22 = zbaVar22.g;
                valueAnimator22.setDuration(f622);
                this.p.add(zbaVar22);
                uVar3.setIsRecyclable(z);
                valueAnimator22.start();
                uVar2 = null;
                z2 = true;
            } else {
                bcaVar = bcaVar2;
                z = false;
                if (uVar3.itemView == this.w) {
                    uVar2 = null;
                    this.w = null;
                } else {
                    uVar2 = null;
                }
                bcaVar.c(this.r, uVar3);
                z2 = false;
            }
            this.c = uVar2;
        } else {
            bcaVar = bcaVar2;
            z = false;
            z2 = false;
        }
        if (uVar != null) {
            RecyclerView recyclerView = this.r;
            this.o = (bcaVar.d(bcaVar.i(recyclerView, uVar), recyclerView.getLayoutDirection()) & i4) >> (this.n * 8);
            this.j = uVar.itemView.getLeft();
            this.k = uVar.itemView.getTop();
            this.c = uVar;
            if (i == 2) {
                uVar.itemView.performHapticFeedback(z ? 1 : 0);
            }
        }
        ViewParent parent = this.r.getParent();
        if (parent != null) {
            if (this.c != null) {
                z = true;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        if (!z2) {
            this.r.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        bcaVar.s(this.c, this.n);
        this.r.invalidate();
    }

    @Override // defpackage.erf
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, qrf qrfVar) {
        float f;
        float f2;
        if (this.c != null) {
            float[] fArr = this.b;
            l(fArr);
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        u uVar = this.c;
        int i = this.n;
        bca bcaVar = this.m;
        bcaVar.getClass();
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            zba zbaVar = (zba) arrayList.get(i2);
            u uVar2 = zbaVar.e;
            float f4 = zbaVar.a;
            float f5 = zbaVar.c;
            if (f4 == f5) {
                zbaVar.i = uVar2.itemView.getTranslationX();
            } else {
                zbaVar.i = me4.b(f5, f4, zbaVar.m, f4);
            }
            float f6 = zbaVar.b;
            float f7 = zbaVar.d;
            if (f6 == f7) {
                zbaVar.j = uVar2.itemView.getTranslationY();
            } else {
                zbaVar.j = me4.b(f7, f6, zbaVar.m, f6);
            }
            int save = canvas.save();
            u uVar3 = zbaVar.e;
            float f8 = zbaVar.i;
            float f9 = zbaVar.j;
            int i3 = zbaVar.f;
            bca bcaVar2 = bcaVar;
            bcaVar2.o(canvas, recyclerView, uVar3, f8, f9, i3, false);
            canvas.restoreToCount(save);
            i2++;
            bcaVar = bcaVar2;
        }
        bca bcaVar3 = bcaVar;
        if (uVar != null) {
            int save2 = canvas.save();
            bcaVar3.o(canvas, recyclerView, uVar, f2, f, i, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // defpackage.erf
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, qrf qrfVar) {
        float f;
        float f2;
        boolean z = true;
        boolean z2 = false;
        if (this.c != null) {
            float[] fArr = this.b;
            l(fArr);
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        u uVar = this.c;
        int i = this.n;
        bca bcaVar = this.m;
        bcaVar.getClass();
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            zba zbaVar = (zba) arrayList.get(i2);
            int save = canvas.save();
            int i3 = i2;
            bca bcaVar2 = bcaVar;
            bcaVar2.p(canvas, recyclerView, zbaVar.e, zbaVar.i, zbaVar.j, zbaVar.f, false);
            canvas.restoreToCount(save);
            z = z;
            bcaVar = bcaVar2;
            i2 = i3 + 1;
        }
        bca bcaVar3 = bcaVar;
        boolean z3 = z;
        if (uVar != null) {
            int save2 = canvas.save();
            bcaVar3.p(canvas, recyclerView, uVar, f2, f, i, true);
            canvas.restoreToCount(save2);
        }
        for (int i4 = size - 1; i4 >= 0; i4--) {
            zba zbaVar2 = (zba) arrayList.get(i4);
            boolean z4 = zbaVar2.l;
            if (z4 && !zbaVar2.h) {
                arrayList.remove(i4);
            } else if (!z4) {
                z2 = z3;
            }
        }
        if (z2) {
            recyclerView.invalidate();
        }
    }

    public final void p(u uVar) {
        RecyclerView recyclerView = this.r;
        bca bcaVar = this.m;
        if ((bcaVar.d(bcaVar.i(recyclerView, uVar), recyclerView.getLayoutDirection()) & 16711680) == 0 || uVar.itemView.getParent() != this.r) {
            return;
        }
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.t = VelocityTracker.obtain();
        this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        o(uVar, 2);
    }

    public final void q(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.d;
        this.h = f;
        this.i = y - this.e;
        if ((i & 4) == 0) {
            f = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
            this.h = f;
        }
        if ((i & 8) == 0) {
            this.h = Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
        }
        if ((i & 1) == 0) {
            this.i = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.i);
        }
        if ((i & 2) == 0) {
            this.i = Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.i);
        }
    }

    @Override // defpackage.irf
    public final void d(View view) {
    }
}
