package com.vk.profile.design.view.cover;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.random.Random;
import org.chromium.net.NetError;
import xsna.d9f0;
import xsna.epx;
import xsna.fnj;
import xsna.gg;
import xsna.iah0;
import xsna.izs;
import xsna.s3q0;

/* compiled from: SnowballsCoverView.kt */
/* loaded from: classes5.dex */
public final class SnowballsCoverView extends View {
    public final ArrayList b;
    public d9f0 c;
    public List<a> d;
    public izs<? super a, s3q0> e;

    /* compiled from: SnowballsCoverView.kt */
    public static final class a {
        public final Bitmap a;
        public final Rect b;
        public final d9f0.b c;

        public a(Bitmap bitmap, Rect rect, d9f0.b bVar) {
            this.a = bitmap;
            this.b = rect;
            this.c = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Snowball(bitmap=" + this.a + ", rect=" + this.b + ", asset=" + this.c + ')';
        }
    }

    /* compiled from: SnowballsCoverView.kt */
    public static final class b {
        public final Rect a;
        public final d9f0.b b;

        public b(Rect rect, d9f0.b bVar) {
            this.a = rect;
            this.b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SnowballData(rect=" + this.a + ", asset=" + this.b + ')';
        }
    }

    public SnowballsCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new ArrayList();
        this.d = EmptyList.b;
    }

    private final int getTabletPadding() {
        return iah0.a(Math.max(64.0f, (getResources().getConfiguration().screenWidthDp + NetError.ERR_DNS_MALFORMED_RESPONSE) / 2.0f));
    }

    public final void a(int i, Rect rect) {
        Context context = getContext();
        HashSet hashSet = iah0.a;
        if (fnj.d(context)) {
            float f = 20;
            rect.left -= iah0.a(f) + (getTabletPadding() * 2);
            float f2 = 48;
            rect.top -= iah0.a(f2) + (getTop() + i);
            rect.right -= iah0.a(f) + (getTabletPadding() * 2);
            rect.bottom -= iah0.a(f2) + (getTop() + i);
        } else {
            rect.top -= i;
            rect.bottom -= i;
        }
        this.b.add(rect);
    }

    public final Point b(int i, int i2) {
        Context context = getContext();
        HashSet hashSet = iah0.a;
        int left = fnj.d(context) ? i : getLeft() + i;
        int right = (fnj.d(getContext()) ? getRight() - getLeft() : getRight()) - i;
        if (!fnj.d(getContext())) {
            i2 += getTop();
        }
        int bottom = getBottom() - i;
        Random.b.getClass();
        gg ggVar = Random.c;
        return new Point(ggVar.l(left, right), ggVar.l(i2, bottom));
    }

    public final List<Rect> getForbiddenZones() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (a aVar : this.d) {
            canvas.drawBitmap(aVar.a, (Rect) null, aVar.b, (Paint) null);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action;
        Object obj;
        izs<? super a, s3q0> izsVar;
        d9f0 d9f0Var = this.c;
        if (d9f0Var != null && !d9f0Var.c && ((action = motionEvent.getAction()) == 1 || action == 3)) {
            Context context = getContext();
            HashSet hashSet = iah0.a;
            int x = fnj.d(context) ? ((int) motionEvent.getX()) - getLeft() : (int) motionEvent.getX();
            int y = fnj.d(getContext()) ? ((int) motionEvent.getY()) - getTop() : (int) motionEvent.getY();
            Iterator<T> it = this.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((a) obj).b.contains(x, y)) {
                    break;
                }
            }
            a aVar = (a) obj;
            if (aVar != null && (izsVar = this.e) != null) {
                izsVar.invoke(aVar);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setOnSnowballClick(izs<? super a, s3q0> izsVar) {
        this.e = izsVar;
    }
}
