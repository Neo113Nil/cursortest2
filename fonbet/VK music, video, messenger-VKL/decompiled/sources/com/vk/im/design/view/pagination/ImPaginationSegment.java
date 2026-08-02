package com.vk.im.design.view.pagination;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.design.view.R$styleable;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.bpn0;
import xsna.cvs;
import xsna.e3m;
import xsna.iah0;
import xsna.ip10;
import xsna.j5g;
import xsna.xq;
import xsna.zrp;

/* compiled from: ImPaginationSegment.kt */
/* loaded from: classes2.dex */
public final class ImPaginationSegment extends View {
    public static final /* synthetic */ int A = 0;
    public b b;
    public c c;
    public final ArrayList d;
    public a e;
    public float f;
    public float g;
    public float h;
    public final HashMap<Integer, Float> i;
    public final HashMap<Integer, Float> j;
    public e k;
    public int l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public float u;
    public float v;
    public float w;
    public final Paint x;
    public final f y;
    public final d z;

    /* compiled from: ImPaginationSegment.kt */
    public static final class a {
        public float a;
        public float b;
        public float c;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c) + io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Indicator(height=");
            sb.append(this.a);
            sb.append(", positionY=");
            sb.append(this.b);
            sb.append(", alpha=");
            return xq.c(')', this.c, sb);
        }

        public a(int i) {
            this.a = -1.0f;
            this.b = -1.0f;
            this.c = -1.0f;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImPaginationSegment.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b ADDED;
        public static final b NOT_CHANGED;
        public static final b REMOVED;

        static {
            b bVar = new b("ADDED", 0);
            ADDED = bVar;
            b bVar2 = new b(SignalingProtocol.HUNGUP_REASON_REMOVED, 1);
            REMOVED = bVar2;
            b bVar3 = new b("NOT_CHANGED", 2);
            NOT_CHANGED = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final boolean h() {
            return this == ADDED;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImPaginationSegment.kt */
    public static final class c {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c DOWN;
        public static final c NONE;
        public static final c PART_DOWN;
        public static final c PART_UP;
        public static final c UP;

        static {
            c cVar = new c("UP", 0);
            UP = cVar;
            c cVar2 = new c("DOWN", 1);
            DOWN = cVar2;
            c cVar3 = new c("PART_UP", 2);
            PART_UP = cVar3;
            c cVar4 = new c("PART_DOWN", 3);
            PART_DOWN = cVar4;
            c cVar5 = new c("NONE", 4);
            NONE = cVar5;
            c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
            $VALUES = cVarArr;
            $ENTRIES = new asp(cVarArr);
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* compiled from: ImPaginationSegment.kt */
    public final class d {

        /* compiled from: ImPaginationSegment.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ADDED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.REMOVED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.NOT_CHANGED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public d() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImPaginationSegment.kt */
    public static final class e {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ e[] $VALUES;
        public static final e EXPANDING;
        public static final e NOT_CHANGE;
        public static final e REDUCING;

        static {
            e eVar = new e("REDUCING", 0);
            REDUCING = eVar;
            e eVar2 = new e("EXPANDING", 1);
            EXPANDING = eVar2;
            e eVar3 = new e("NOT_CHANGE", 2);
            NOT_CHANGE = eVar3;
            e[] eVarArr = {eVar, eVar2, eVar3};
            $VALUES = eVarArr;
            $ENTRIES = new asp(eVarArr);
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    /* compiled from: ImPaginationSegment.kt */
    public final class f {
        public final bpn0 b;
        public float d;
        public float e;
        public final HashMap<Integer, Float> a = new HashMap<>();
        public final float c = 0.6f;

        /* compiled from: ImPaginationSegment.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.UP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.DOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.PART_UP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[c.PART_DOWN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[c.NONE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[e.values().length];
                try {
                    iArr2[e.REDUCING.ordinal()] = 1;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[e.EXPANDING.ordinal()] = 2;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[e.NOT_CHANGE.ordinal()] = 3;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public f() {
            this.b = new bpn0(new cvs(ImPaginationSegment.this, 7));
        }

        public static float c(f fVar) {
            int i = ImPaginationSegment.this.l;
            HashMap<Integer, Float> hashMap = fVar.a;
            Integer valueOf = Integer.valueOf(i);
            ImPaginationSegment imPaginationSegment = ImPaginationSegment.this;
            Float f = hashMap.get(valueOf);
            if (f == null) {
                int i2 = ImPaginationSegment.A;
                f = Float.valueOf(imPaginationSegment.c(i) - imPaginationSegment.d(i));
                hashMap.put(valueOf, f);
            }
            return f.floatValue() * fVar.d;
        }

        public final void a(Float f, boolean z) {
            float f2;
            float floatValue;
            float f3;
            float f4;
            ImPaginationSegment imPaginationSegment = ImPaginationSegment.this;
            a aVar = imPaginationSegment.e;
            if (aVar != null) {
                aVar.a = imPaginationSegment.d(imPaginationSegment.l);
            }
            a aVar2 = imPaginationSegment.e;
            if (aVar2 != null) {
                if (f != null) {
                    f4 = f.floatValue();
                } else {
                    bpn0 bpn0Var = this.b;
                    if (z) {
                        f2 = imPaginationSegment.f;
                        floatValue = ((Number) bpn0Var.getValue()).floatValue();
                        f3 = this.d;
                    } else {
                        f2 = imPaginationSegment.f;
                        floatValue = ((Number) bpn0Var.getValue()).floatValue();
                        f3 = this.e;
                    }
                    f4 = f2 - (floatValue * f3);
                }
                aVar2.b = f4;
            }
            a aVar3 = imPaginationSegment.e;
            if (aVar3 != null) {
                aVar3.c = (z ? this.e : this.d) * 0.4f;
            }
        }

        public final Pair<Integer, Integer> b() {
            ImPaginationSegment imPaginationSegment = ImPaginationSegment.this;
            int i = a.$EnumSwitchMapping$0[imPaginationSegment.c.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return new Pair<>(Integer.valueOf(imPaginationSegment.n - 1), Integer.valueOf(imPaginationSegment.o - 1));
                }
                if (i != 3) {
                    if (i == 4) {
                        return imPaginationSegment.b.h() ? new Pair<>(Integer.valueOf(imPaginationSegment.n), Integer.valueOf(imPaginationSegment.o)) : new Pair<>(Integer.valueOf(imPaginationSegment.n - 1), Integer.valueOf(imPaginationSegment.o - 1));
                    }
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            return new Pair<>(Integer.valueOf(imPaginationSegment.n), Integer.valueOf(imPaginationSegment.o));
        }

        public final float d() {
            ImPaginationSegment imPaginationSegment = ImPaginationSegment.this;
            float d = (imPaginationSegment.d(imPaginationSegment.l) - imPaginationSegment.d(imPaginationSegment.l - 1)) * this.e;
            int i = a.$EnumSwitchMapping$1[imPaginationSegment.k.ordinal()];
            if (i == 1) {
                return imPaginationSegment.d(imPaginationSegment.l) - d;
            }
            if (i == 2) {
                return imPaginationSegment.d(imPaginationSegment.l - 1) + d;
            }
            if (i == 3) {
                return imPaginationSegment.d(imPaginationSegment.l);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public ImPaginationSegment(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = b.NOT_CHANGED;
        this.c = c.NONE;
        ArrayList arrayList = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            arrayList.add(new a(0));
        }
        this.d = arrayList;
        this.i = new HashMap<>();
        this.j = new HashMap<>();
        this.k = e.NOT_CHANGE;
        this.l = -1;
        this.p = -1;
        this.r = -1;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.x = paint;
        this.y = new f();
        this.z = new d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        setupAttrsStyle(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    private final void setIndicatorCount(int i) {
        if (this.m) {
            this.l = i;
            this.m = false;
            return;
        }
        if (this.l == -1) {
            this.k = e.NOT_CHANGE;
            this.l = i;
        }
        int i2 = this.l;
        if (i2 != i) {
            e eVar = i2 == -1 ? e.NOT_CHANGE : i2 < i ? e.REDUCING : i2 > i ? e.EXPANDING : e.NOT_CHANGE;
            this.k = eVar;
            eVar.getClass();
            if (eVar == e.EXPANDING) {
                this.m = true;
            } else {
                this.l = i;
            }
        }
    }

    private final void setIndicatorMove(c cVar) {
        this.e = cVar == c.NONE ? null : new a(0);
        this.c = cVar;
    }

    private final void setScroll(boolean z) {
        if (this.s != z) {
            if (!z) {
                if (this.m) {
                    setIndicatorCount(this.l - 1);
                }
                this.b = b.NOT_CHANGED;
                this.k = e.NOT_CHANGE;
            }
            this.s = z;
        }
    }

    private final void setupAttrsStyle(TypedArray typedArray) {
        this.x.setColor(typedArray.getColor(0, e3m.f(R.attr.vk_ui_icon_accent_themed, getContext())));
        this.v = typedArray.getDimension(1, iah0.b(2.0f));
        this.w = typedArray.getDimension(2, iah0.b(2.0f));
        this.f = typedArray.getDimension(3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void a() {
        int i;
        int i2 = this.r;
        if (i2 <= 5) {
            i = this.p;
        } else {
            int i3 = this.p;
            i = i3 <= 2 ? i3 : i2 - i3 <= 2 ? 5 - (i2 - i3) : 2;
        }
        this.n = i;
        this.o = this.p > this.q ? i - 1 : i + 1;
    }

    public final void b(Canvas canvas, a aVar) {
        float width = getWidth() / 2.0f;
        int i = (int) (aVar.c * 255);
        Paint paint = this.x;
        paint.setAlpha(i);
        float f2 = this.v;
        float f3 = f2 / 2;
        float f4 = aVar.b;
        float f5 = f2 / 2.0f;
        canvas.drawRoundRect(width - f3, f4, f3 + width, f4 + aVar.a, f5, f5, paint);
    }

    public final float c(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap<Integer, Float> hashMap = this.j;
        Float f2 = hashMap.get(valueOf);
        if (f2 == null) {
            f2 = Float.valueOf((d(i) * 2) + this.w);
            hashMap.put(valueOf, f2);
        }
        return f2.floatValue();
    }

    public final float d(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap<Integer, Float> hashMap = this.i;
        Float f2 = hashMap.get(valueOf);
        if (f2 == null) {
            f2 = Float.valueOf((this.h - (this.w * i)) / (i + 1));
            hashMap.put(valueOf, f2);
        }
        return f2.floatValue();
    }

    public final int getCurrentItemIndex() {
        return this.p;
    }

    public final int getItemCount() {
        return this.r;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.l == 0) {
            return;
        }
        a aVar = this.e;
        if (aVar != null) {
            b(canvas, aVar);
        }
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            b(canvas, (a) this.d.get(i2));
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float a2 = ip10.a(i2, getSuggestedMinimumHeight(), Integer.MAX_VALUE, getPaddingBottom() + getPaddingTop());
        this.g = a2;
        this.h = a2 - (this.f * 2);
        this.j.clear();
        this.i.clear();
        this.y.a.clear();
        super.onMeasure(i, i2);
    }

    public final void setCurrentItemIndex(int i) {
        c cVar;
        int i2;
        if (this.p == -1) {
            setIndicatorMove(c.NONE);
            this.p = i;
            a();
        }
        int i3 = this.p;
        boolean z = false;
        this.t = i3 > i;
        this.q = i3;
        this.p = i;
        ImPaginationSegment imPaginationSegment = ImPaginationSegment.this;
        b bVar = imPaginationSegment.b;
        bVar.getClass();
        if ((bVar == b.REMOVED ? imPaginationSegment.getItemCount() + 1 : imPaginationSegment.getItemCount()) <= 5) {
            cVar = c.NONE;
        } else if (imPaginationSegment.getCurrentItemIndex() <= 2) {
            int i4 = d.a.$EnumSwitchMapping$0[imPaginationSegment.b.ordinal()];
            if (i4 == 1) {
                cVar = imPaginationSegment.getCurrentItemIndex() == imPaginationSegment.q ? c.PART_DOWN : c.NONE;
            } else if (i4 == 2) {
                cVar = imPaginationSegment.getCurrentItemIndex() == imPaginationSegment.q + 1 ? c.PART_UP : c.NONE;
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = (imPaginationSegment.t && imPaginationSegment.getCurrentItemIndex() == 2) ? c.DOWN : c.NONE;
            }
        } else if ((imPaginationSegment.getItemCount() - imPaginationSegment.getCurrentItemIndex()) - 1 <= 2) {
            int i5 = d.a.$EnumSwitchMapping$0[imPaginationSegment.b.ordinal()];
            if (i5 == 1) {
                cVar = imPaginationSegment.getCurrentItemIndex() == imPaginationSegment.q + 1 ? c.PART_UP : c.NONE;
            } else if (i5 == 2) {
                cVar = imPaginationSegment.getCurrentItemIndex() == imPaginationSegment.q - 1 ? c.PART_DOWN : c.NONE;
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = (imPaginationSegment.t || (imPaginationSegment.getItemCount() - imPaginationSegment.getCurrentItemIndex()) - 1 != 2) ? c.NONE : c.UP;
            }
        } else if (imPaginationSegment.t) {
            cVar = (imPaginationSegment.getCurrentItemIndex() <= 1 || imPaginationSegment.getItemCount() - imPaginationSegment.getCurrentItemIndex() <= 3) ? c.NONE : c.DOWN;
        } else {
            boolean z2 = imPaginationSegment.getItemCount() > 5;
            boolean z3 = imPaginationSegment.b.h() && ((i2 = imPaginationSegment.n) == 0 || i2 == imPaginationSegment.l - 1);
            b bVar2 = imPaginationSegment.b;
            bVar2.getClass();
            if (bVar2 == b.NOT_CHANGED && imPaginationSegment.getCurrentItemIndex() > 2 && imPaginationSegment.getItemCount() - imPaginationSegment.getCurrentItemIndex() > 2) {
                z = true;
            }
            cVar = ((z3 && z2) || z) ? c.UP : c.NONE;
        }
        setIndicatorMove(cVar);
        a();
    }

    public final void setIndicatorColor(int i) {
        this.x.setColor(i);
        invalidate();
    }

    public final void setItemCount(int i) {
        if (this.r == -1) {
            this.b = b.NOT_CHANGED;
            this.r = i;
            setIndicatorCount((2 > i || i >= 6) ? i >= 5 ? 5 : 0 : i);
        }
        int i2 = this.r;
        if (i2 != i) {
            this.b = i2 < i ? b.ADDED : i2 > i ? b.REMOVED : b.NOT_CHANGED;
            this.r = i;
            if (2 > i || i >= 6) {
                i = i >= 5 ? 5 : 0;
            }
            setIndicatorCount(i);
        }
    }

    public final void setPageScrolled(float f2) {
        float f3;
        float f4;
        Float valueOf;
        float floatValue;
        float f5;
        float f6;
        float f7;
        float f8;
        float d2;
        float c2;
        float c3;
        float f9;
        float f10;
        float d3;
        float c4;
        this.u = f2;
        float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        setScroll(f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (this.l >= 2 && this.g != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f fVar = this.y;
            ImPaginationSegment imPaginationSegment = ImPaginationSegment.this;
            float f12 = imPaginationSegment.u;
            ArrayList arrayList = imPaginationSegment.d;
            fVar.d = f12;
            fVar.e = 1 - f12;
            Pair<Integer, Integer> b2 = fVar.b();
            int intValue = b2.d().intValue();
            int intValue2 = b2.g().intValue();
            int i = imPaginationSegment.l;
            int i2 = 0;
            while (true) {
                int i3 = 3;
                if (i2 < i) {
                    float f13 = f11;
                    a aVar = (a) arrayList.get(i2);
                    if (i2 == intValue) {
                        int i4 = f.a.$EnumSwitchMapping$0[imPaginationSegment.c.ordinal()];
                        if (i4 == 1 || i4 == 2) {
                            d3 = imPaginationSegment.d(imPaginationSegment.l);
                            c4 = f.c(fVar);
                        } else if (i4 != 3 && i4 != 4) {
                            if (i4 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            e eVar = imPaginationSegment.k;
                            eVar.getClass();
                            if (eVar == e.EXPANDING) {
                                d2 = ((imPaginationSegment.c(imPaginationSegment.l - 1) - imPaginationSegment.d(imPaginationSegment.l - 1)) * fVar.d) + fVar.d();
                                aVar.a = d2;
                                i2++;
                                f11 = f13;
                            } else {
                                d3 = imPaginationSegment.d(imPaginationSegment.l);
                                c4 = f.c(fVar);
                            }
                        } else if (imPaginationSegment.b.h()) {
                            c2 = imPaginationSegment.c(imPaginationSegment.l) * fVar.d;
                            f9 = imPaginationSegment.w;
                            f10 = fVar.e;
                            c3 = f9 * f10;
                        } else {
                            d3 = imPaginationSegment.d(imPaginationSegment.l);
                            c4 = f.c(fVar);
                        }
                        d2 = d3 + c4;
                        aVar.a = d2;
                        i2++;
                        f11 = f13;
                    } else if (i2 == intValue2) {
                        int i5 = f.a.$EnumSwitchMapping$0[imPaginationSegment.c.ordinal()];
                        if (i5 == 1 || i5 == 2) {
                            c2 = imPaginationSegment.c(imPaginationSegment.l);
                            c3 = f.c(fVar);
                        } else {
                            if (i5 != 3 && i5 != 4) {
                                if (i5 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                int i6 = f.a.$EnumSwitchMapping$1[imPaginationSegment.k.ordinal()];
                                if (i6 == 1) {
                                    c2 = imPaginationSegment.c(imPaginationSegment.l - 1);
                                    f9 = c2 - imPaginationSegment.d(imPaginationSegment.l);
                                    f10 = fVar.d;
                                    c3 = f9 * f10;
                                } else if (i6 == 2) {
                                    c2 = imPaginationSegment.c(imPaginationSegment.l);
                                    c3 = f.c(fVar);
                                } else {
                                    if (i6 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    c2 = imPaginationSegment.c(imPaginationSegment.l);
                                    c3 = f.c(fVar);
                                }
                            } else if (imPaginationSegment.b.h()) {
                                c2 = imPaginationSegment.c(imPaginationSegment.l);
                                c3 = f.c(fVar);
                            } else {
                                c2 = imPaginationSegment.c(imPaginationSegment.l) * fVar.e;
                                f9 = imPaginationSegment.w;
                                f10 = fVar.d;
                                c3 = f9 * f10;
                            }
                            aVar.a = d2;
                            i2++;
                            f11 = f13;
                        }
                    } else {
                        d2 = fVar.d();
                        aVar.a = d2;
                        i2++;
                        f11 = f13;
                    }
                    d2 = c2 - c3;
                    aVar.a = d2;
                    i2++;
                    f11 = f13;
                } else {
                    float f14 = f11;
                    int i7 = imPaginationSegment.l;
                    int i8 = 0;
                    while (i8 < i7) {
                        a aVar2 = (a) arrayList.get(i8);
                        int i9 = i8 - 1;
                        a aVar3 = (a) j5g.b0(i9, arrayList);
                        float f15 = aVar3 != null ? aVar3.a : f14;
                        int i10 = f.a.$EnumSwitchMapping$0[imPaginationSegment.c.ordinal()];
                        if (i10 == 1) {
                            if (i8 == 0) {
                                fVar.a(null, true);
                                a aVar4 = imPaginationSegment.e;
                                if (aVar4 != null) {
                                    f6 = aVar4.b + aVar4.a;
                                    f7 = imPaginationSegment.w;
                                    f8 = f7 + f6;
                                }
                            } else {
                                a aVar5 = (a) j5g.b0(i9, arrayList);
                                valueOf = aVar5 != null ? Float.valueOf(aVar5.b) : null;
                                if (valueOf != null && valueOf.floatValue() >= f14) {
                                    floatValue = valueOf.floatValue() + f15;
                                    f5 = imPaginationSegment.w;
                                    f8 = floatValue + f5;
                                }
                            }
                            f8 = f14;
                        } else if (i10 == 2) {
                            if (i8 == 0) {
                                fVar.a(null, false);
                                a aVar6 = imPaginationSegment.e;
                                if (aVar6 != null) {
                                    f6 = aVar6.b + aVar6.a;
                                    f7 = imPaginationSegment.w;
                                    f8 = f7 + f6;
                                }
                            } else {
                                a aVar7 = (a) j5g.b0(i9, arrayList);
                                valueOf = aVar7 != null ? Float.valueOf(aVar7.b) : null;
                                if (valueOf != null && valueOf.floatValue() >= f14) {
                                    floatValue = valueOf.floatValue() + f15;
                                    f5 = imPaginationSegment.w;
                                    f8 = floatValue + f5;
                                }
                            }
                            f8 = f14;
                        } else if (i10 == i3) {
                            if (i8 == 0) {
                                fVar.a(null, true);
                                a aVar8 = imPaginationSegment.e;
                                if (aVar8 != null) {
                                    f6 = aVar8.b + aVar8.a;
                                    f7 = imPaginationSegment.w;
                                    f8 = f7 + f6;
                                }
                            } else {
                                a aVar9 = (a) j5g.b0(i9, arrayList);
                                valueOf = aVar9 != null ? Float.valueOf(aVar9.b) : null;
                                if (valueOf != null && valueOf.floatValue() >= f14) {
                                    floatValue = valueOf.floatValue() + f15;
                                    f5 = imPaginationSegment.w;
                                    f8 = floatValue + f5;
                                }
                            }
                            f8 = f14;
                        } else if (i10 != 4) {
                            if (i10 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            a aVar10 = (a) j5g.b0(i9, arrayList);
                            valueOf = aVar10 != null ? Float.valueOf(aVar10.b) : null;
                            if (valueOf == null || valueOf.floatValue() < f14) {
                                f8 = imPaginationSegment.f;
                            } else {
                                floatValue = valueOf.floatValue() + f15;
                                f5 = imPaginationSegment.w;
                                f8 = floatValue + f5;
                            }
                        } else if (imPaginationSegment.b.h()) {
                            a aVar11 = (a) j5g.b0(i9, arrayList);
                            valueOf = aVar11 != null ? Float.valueOf(aVar11.b) : null;
                            f8 = (valueOf == null || valueOf.floatValue() < f14) ? imPaginationSegment.f : valueOf.floatValue() + f15 + imPaginationSegment.w;
                            if (i8 == 4) {
                                fVar.a(Float.valueOf(fVar.d() + f8 + imPaginationSegment.w), true);
                            }
                        } else {
                            if (i8 == 0) {
                                fVar.a(null, false);
                                a aVar12 = imPaginationSegment.e;
                                if (aVar12 != null) {
                                    f6 = aVar12.b + aVar12.a;
                                    f7 = imPaginationSegment.w;
                                    f8 = f7 + f6;
                                }
                            } else {
                                a aVar13 = (a) j5g.b0(i9, arrayList);
                                valueOf = aVar13 != null ? Float.valueOf(aVar13.b) : null;
                                if (valueOf != null && valueOf.floatValue() >= f14) {
                                    floatValue = valueOf.floatValue() + f15;
                                    f5 = imPaginationSegment.w;
                                    f8 = floatValue + f5;
                                }
                            }
                            f8 = f14;
                        }
                        aVar2.b = f8;
                        i8++;
                        i3 = 3;
                    }
                    int i11 = imPaginationSegment.l;
                    for (int i12 = 0; i12 < i11; i12++) {
                        a aVar14 = (a) arrayList.get(i12);
                        float f16 = fVar.c;
                        Pair<Integer, Integer> b3 = fVar.b();
                        int intValue3 = b3.d().intValue();
                        int intValue4 = b3.g().intValue();
                        float f17 = 0.4f;
                        if (i12 == intValue3) {
                            boolean z = intValue3 == 0 || intValue3 == imPaginationSegment.l - 1;
                            int i13 = f.a.$EnumSwitchMapping$1[imPaginationSegment.k.ordinal()];
                            if (i13 != 1) {
                                if (i13 == 2) {
                                    f4 = fVar.d;
                                } else {
                                    if (i13 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (imPaginationSegment.b.h()) {
                                        f17 = fVar.d;
                                    } else {
                                        f4 = fVar.d;
                                    }
                                }
                                f17 = 0.4f + (f16 * f4);
                            } else if (z) {
                                f17 = fVar.d;
                            } else {
                                f4 = fVar.d;
                                f17 = 0.4f + (f16 * f4);
                            }
                        } else if (i12 == intValue4) {
                            int i14 = f.a.$EnumSwitchMapping$1[imPaginationSegment.k.ordinal()];
                            if (i14 == 1) {
                                f4 = fVar.e;
                            } else if (i14 != 2) {
                                if (i14 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                c cVar = imPaginationSegment.c;
                                cVar.getClass();
                                if (cVar == c.PART_UP || cVar == c.PART_DOWN) {
                                    b bVar = imPaginationSegment.b;
                                    bVar.getClass();
                                    if (bVar == b.REMOVED) {
                                        f17 = fVar.e;
                                    }
                                }
                                f4 = fVar.e;
                            } else if (imPaginationSegment.o == imPaginationSegment.l - 1) {
                                f17 = fVar.e;
                            } else {
                                f4 = fVar.e;
                            }
                            f17 = 0.4f + (f16 * f4);
                        } else if (i12 == imPaginationSegment.l - 1) {
                            int i15 = f.a.$EnumSwitchMapping$0[imPaginationSegment.c.ordinal()];
                            if (i15 == 1) {
                                f3 = fVar.d;
                            } else if (i15 == 2) {
                                f3 = fVar.e;
                            } else if (i15 != 3 && i15 != 4) {
                                if (i15 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                int i16 = f.a.$EnumSwitchMapping$1[imPaginationSegment.k.ordinal()];
                                if (i16 == 1) {
                                    f3 = fVar.d;
                                } else if (i16 == 2) {
                                    f3 = fVar.e;
                                } else if (i16 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            f17 = 0.4f * f3;
                        }
                        aVar14.c = f17;
                    }
                    invalidate();
                }
            }
        }
        if (f2 == 1.0f) {
            setScroll(false);
        }
    }
}
