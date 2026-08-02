package com.vk.voip.ui.groupcalls.grid.dots;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.voip.ui.R$styleable;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.e3m;
import xsna.iah0;
import xsna.j5g;
import xsna.swe0;
import xsna.u11;
import xsna.zrp;

/* compiled from: GridPaginationDotsView.kt */
/* loaded from: classes7.dex */
public final class GridPaginationDotsView extends View {
    public static final /* synthetic */ int e = 0;
    public final Paint b;
    public final d c;
    public e d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GridPaginationDotsView.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ALL_DOTS_TO_LEFT;
        public static final a ALL_DOTS_TO_RIGHT;
        public static final a BIG_DOTS_CHANGE;
        public static final a NONE;

        static {
            a aVar = new a("NONE", 0);
            NONE = aVar;
            a aVar2 = new a("BIG_DOTS_CHANGE", 1);
            BIG_DOTS_CHANGE = aVar2;
            a aVar3 = new a("ALL_DOTS_TO_LEFT", 2);
            ALL_DOTS_TO_LEFT = aVar3;
            a aVar4 = new a("ALL_DOTS_TO_RIGHT", 3);
            ALL_DOTS_TO_RIGHT = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: GridPaginationDotsView.kt */
    public static final class b {
        public static final e a() {
            int i = GridPaginationDotsView.e;
            a aVar = a.NONE;
            e eVar = new e();
            eVar.a = 0;
            eVar.b = 0;
            eVar.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            eVar.d = 0;
            eVar.e = false;
            eVar.f = aVar;
            return eVar;
        }
    }

    /* compiled from: GridPaginationDotsView.kt */
    public static final class c {
        public final float a;
        public final int b;

        public c(float f, int i) {
            this.a = f;
            this.b = i;
        }
    }

    /* compiled from: GridPaginationDotsView.kt */
    public static final class d {
        public final float a;
        public final float b;
        public final float c;
        public final int d;
        public final int e;
        public final int f;

        public d(float f, float f2, float f3, int i, int i2, int i3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = i;
            this.e = i2;
            this.f = i3;
        }
    }

    /* compiled from: GridPaginationDotsView.kt */
    public static final class e {
        public int a;
        public int b;
        public float c;
        public int d;
        public boolean e;
        public a f;
    }

    /* compiled from: GridPaginationDotsView.kt */
    public static final /* synthetic */ class f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.BIG_DOTS_CHANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.ALL_DOTS_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.ALL_DOTS_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public GridPaginationDotsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        this.b = paint;
        this.d = b.a();
        paint.setStyle(Paint.Style.FILL);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
        float b2 = iah0.b(3.5f);
        float b3 = iah0.b(2.5f);
        float b4 = iah0.b(1.5f);
        int a2 = iah0.a(18);
        Context context2 = getContext();
        e3m.a aVar = e3m.a;
        this.c = new d(b2, b3, b4, a2, obtainStyledAttributes.getColor(0, context2.getColor(R.color.white_alpha30)), obtainStyledAttributes.getColor(1, getContext().getColor(R.color.vk_white)));
        obtainStyledAttributes.recycle();
    }

    public static void a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Pages number is negative");
        }
        if (i2 >= i) {
            throw new IllegalArgumentException("Selected page index is equal or bigger than pages number");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Selected page index is negative");
        }
    }

    private final int getBigDotsNumber() {
        return Math.min(4, this.d.a);
    }

    private static final e getDefaultPageState() {
        return b.a();
    }

    private final float getDotsAnimationShift() {
        int i = f.$EnumSwitchMapping$0[this.d.f.ordinal()];
        if (i == 1 || i == 2) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        d dVar = this.c;
        if (i == 3) {
            return (-this.d.c) * dVar.d;
        }
        if (i == 4) {
            return (1.0f - this.d.c) * dVar.d;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final float getSelectedBigDotAnimationShift() {
        int i = f.$EnumSwitchMapping$0[this.d.f.ordinal()];
        if (i == 1) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (i == 2) {
            return this.d.c * this.c.d;
        }
        if (i == 3 || i == 4) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void b(int i, int i2) {
        if (i == 0) {
            this.d = b.a();
            invalidate();
            return;
        }
        a(i, i2);
        e eVar = this.d;
        if (i == eVar.a) {
            c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2);
            return;
        }
        eVar.a = i;
        eVar.b = i2;
        eVar.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (eVar.d >= i) {
            eVar.d = Math.min(i - 1, 3);
        } else if (i <= 4) {
            eVar.d = i2;
        }
        e eVar2 = this.d;
        eVar2.f = a.NONE;
        eVar2.e = false;
        invalidate();
    }

    public final void c(float f2, int i) {
        e eVar = this.d;
        int i2 = eVar.b;
        eVar.b = i;
        int i3 = i - i2;
        int i4 = eVar.d;
        int i5 = i4 + i3;
        if (eVar.e && i3 == 1) {
            eVar.e = false;
            i3 = 0;
            i5 = 0;
        }
        if (i3 != 0) {
            eVar.e = i5 < 0;
        }
        eVar.d = swe0.g(i5, 0, 3);
        e eVar2 = this.d;
        a aVar = eVar2.f;
        int i6 = eVar2.b;
        int i7 = eVar2.d;
        if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            aVar = a.NONE;
        } else if (aVar == a.NONE || i6 != i2) {
            aVar = i6 < i2 ? (i4 == 0 && i7 == 0) ? a.ALL_DOTS_TO_RIGHT : a.BIG_DOTS_CHANGE : i7 == 3 ? a.ALL_DOTS_TO_LEFT : a.BIG_DOTS_CHANGE;
        }
        eVar2.f = aVar;
        eVar2.c = f2;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z = true;
        if (this.d.a <= 1) {
            return;
        }
        d dVar = this.c;
        int i = dVar.e;
        int i2 = dVar.d;
        float f2 = dVar.a;
        float f3 = dVar.b;
        float f4 = dVar.c;
        Paint paint = this.b;
        paint.setColor(i);
        ArrayList arrayList = new ArrayList();
        e eVar = this.d;
        int i3 = eVar.b - eVar.d;
        float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (i3 >= 2) {
            arrayList.add(new c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -3));
        }
        if (i3 >= 1) {
            arrayList.add(new c(f4, -2));
        }
        if (i3 >= 0) {
            arrayList.add(new c(f3, -1));
        }
        int min = Math.min(4, this.d.a);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(new c(f2, i4));
        }
        e eVar2 = this.d;
        int i5 = eVar2.a;
        int i6 = i5 <= 4 ? 0 : ((i5 - eVar2.b) - 1) - (3 - eVar2.d);
        if (i6 >= 0) {
            arrayList.add(new c(f3, 4));
        }
        if (i6 >= 1) {
            arrayList.add(new c(f4, 5));
        }
        if (i6 >= 2) {
            arrayList.add(new c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6));
        }
        int bigDotsNumber = getBigDotsNumber();
        float f6 = 2.0f;
        PointF pointF = new PointF(canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f);
        float dotsAnimationShift = getDotsAnimationShift();
        float f7 = (bigDotsNumber - 1) / 2.0f;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            c cVar = (c) arrayList.get(i7);
            boolean z2 = z;
            int i8 = cVar.b;
            float f8 = cVar.a;
            float f9 = f5;
            float f10 = pointF.x + ((i8 - f7) * i2) + dotsAnimationShift;
            c cVar2 = (c) j5g.b0(i7 - 1, arrayList);
            i7++;
            float f11 = f6;
            c cVar3 = (c) j5g.b0(i7, arrayList);
            ArrayList arrayList2 = arrayList;
            e eVar3 = this.d;
            float f12 = f7;
            a aVar = eVar3.f;
            float f13 = dotsAnimationShift;
            int i9 = size;
            if (aVar == a.ALL_DOTS_TO_LEFT && cVar2 != null) {
                float f14 = cVar2.a;
                float f15 = eVar3.c;
                f8 = u11.b(1.0f, f15, f8, f14 * f15);
            } else if (aVar == a.ALL_DOTS_TO_RIGHT && cVar3 != null) {
                float f16 = cVar3.a;
                float f17 = eVar3.c;
                f8 = u11.b(1.0f, f17, f16, f8 * f17);
            } else if (cVar2 == null || cVar3 == null) {
                f8 = f9;
            }
            if (f8 != f9) {
                canvas.drawCircle(f10, pointF.y, f8, paint);
            }
            z = z2;
            f5 = f9;
            arrayList = arrayList2;
            f6 = f11;
            f7 = f12;
            dotsAnimationShift = f13;
            size = i9;
        }
        float f18 = f6;
        paint.setColor(dVar.f);
        int bigDotsNumber2 = getBigDotsNumber();
        PointF pointF2 = new PointF(canvas.getWidth() / f18, canvas.getHeight() / f18);
        canvas.drawCircle(pointF2.x + ((this.d.d - ((bigDotsNumber2 - 1) / f18)) * i2) + getSelectedBigDotAnimationShift(), pointF2.y, f2, paint);
    }

    public final void setSelectedPageIndex(int i) {
        a(this.d.a, i);
        c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i);
    }
}
