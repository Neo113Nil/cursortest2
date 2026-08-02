package com.google.android.material.badge;

import Ca.c;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import ia.e;
import ia.j;
import ia.k;
import ia.l;
import ia.m;
import java.util.Locale;
import ua.d;

/* loaded from: classes3.dex */
public final class BadgeState {

    /* renamed from: a, reason: collision with root package name */
    public final State f34794a;

    /* renamed from: b, reason: collision with root package name */
    public final State f34795b;

    /* renamed from: c, reason: collision with root package name */
    public final float f34796c;

    /* renamed from: d, reason: collision with root package name */
    public final float f34797d;

    /* renamed from: e, reason: collision with root package name */
    public final float f34798e;

    /* renamed from: f, reason: collision with root package name */
    public final float f34799f;

    /* renamed from: g, reason: collision with root package name */
    public final float f34800g;

    /* renamed from: h, reason: collision with root package name */
    public final float f34801h;

    /* renamed from: i, reason: collision with root package name */
    public final int f34802i;

    /* renamed from: j, reason: collision with root package name */
    public final int f34803j;

    /* renamed from: k, reason: collision with root package name */
    public int f34804k;

    /* renamed from: l, reason: collision with root package name */
    public int f34805l;

    public BadgeState(Context context, int i10, int i11, int i12, State state) {
        State state2 = new State();
        this.f34795b = state2;
        state = state == null ? new State() : state;
        if (i10 != 0) {
            state.f34811a = i10;
        }
        TypedArray c10 = c(context, state.f34811a, i11, i12);
        Resources resources = context.getResources();
        this.f34796c = c10.getDimensionPixelSize(m.f49010r, -1);
        this.f34802i = context.getResources().getDimensionPixelSize(e.f48339e0);
        this.f34803j = context.getResources().getDimensionPixelSize(e.f48343g0);
        this.f34797d = c10.getDimensionPixelSize(m.f48598B, -1);
        this.f34798e = c10.getDimension(m.f49090z, resources.getDimension(e.f48376x));
        this.f34800g = c10.getDimension(m.f48628E, resources.getDimension(e.f48378y));
        this.f34799f = c10.getDimension(m.f49000q, resources.getDimension(e.f48376x));
        this.f34801h = c10.getDimension(m.f48588A, resources.getDimension(e.f48378y));
        boolean z10 = true;
        this.f34804k = c10.getInt(m.f48698L, 1);
        this.f34805l = c10.getInt(m.f48980o, 0);
        state2.f34819i = state.f34819i == -2 ? 255 : state.f34819i;
        if (state.f34821k != -2) {
            state2.f34821k = state.f34821k;
        } else if (c10.hasValue(m.f48688K)) {
            state2.f34821k = c10.getInt(m.f48688K, 0);
        } else {
            state2.f34821k = -1;
        }
        if (state.f34820j != null) {
            state2.f34820j = state.f34820j;
        } else if (c10.hasValue(m.f49040u)) {
            state2.f34820j = c10.getString(m.f49040u);
        }
        state2.f34825o = state.f34825o;
        state2.f34826p = state.f34826p == null ? context.getString(k.f48544v) : state.f34826p;
        state2.f34827q = state.f34827q == 0 ? j.f48494a : state.f34827q;
        state2.f34828r = state.f34828r == 0 ? k.f48495A : state.f34828r;
        if (state.f34830t != null && !state.f34830t.booleanValue()) {
            z10 = false;
        }
        state2.f34830t = Boolean.valueOf(z10);
        state2.f34822l = state.f34822l == -2 ? c10.getInt(m.f48668I, -2) : state.f34822l;
        state2.f34823m = state.f34823m == -2 ? c10.getInt(m.f48678J, -2) : state.f34823m;
        state2.f34815e = Integer.valueOf(state.f34815e == null ? c10.getResourceId(m.f49020s, l.f48564c) : state.f34815e.intValue());
        state2.f34816f = Integer.valueOf(state.f34816f == null ? c10.getResourceId(m.f49030t, 0) : state.f34816f.intValue());
        state2.f34817g = Integer.valueOf(state.f34817g == null ? c10.getResourceId(m.f48608C, l.f48564c) : state.f34817g.intValue());
        state2.f34818h = Integer.valueOf(state.f34818h == null ? c10.getResourceId(m.f48618D, 0) : state.f34818h.intValue());
        state2.f34812b = Integer.valueOf(state.f34812b == null ? J(context, c10, m.f48970n) : state.f34812b.intValue());
        state2.f34814d = Integer.valueOf(state.f34814d == null ? c10.getResourceId(m.f49050v, l.f48568g) : state.f34814d.intValue());
        if (state.f34813c != null) {
            state2.f34813c = state.f34813c;
        } else if (c10.hasValue(m.f49060w)) {
            state2.f34813c = Integer.valueOf(J(context, c10, m.f49060w));
        } else {
            state2.f34813c = Integer.valueOf(new Ca.e(context, state2.f34814d.intValue()).j().getDefaultColor());
        }
        state2.f34829s = Integer.valueOf(state.f34829s == null ? c10.getInt(m.f48990p, 8388661) : state.f34829s.intValue());
        state2.f34831u = Integer.valueOf(state.f34831u == null ? c10.getDimensionPixelSize(m.f49080y, resources.getDimensionPixelSize(e.f48341f0)) : state.f34831u.intValue());
        state2.f34832v = Integer.valueOf(state.f34832v == null ? c10.getDimensionPixelSize(m.f49070x, resources.getDimensionPixelSize(e.f48380z)) : state.f34832v.intValue());
        state2.f34833w = Integer.valueOf(state.f34833w == null ? c10.getDimensionPixelOffset(m.f48638F, 0) : state.f34833w.intValue());
        state2.f34834x = Integer.valueOf(state.f34834x == null ? c10.getDimensionPixelOffset(m.f48708M, 0) : state.f34834x.intValue());
        state2.f34835y = Integer.valueOf(state.f34835y == null ? c10.getDimensionPixelOffset(m.f48648G, state2.f34833w.intValue()) : state.f34835y.intValue());
        state2.f34836z = Integer.valueOf(state.f34836z == null ? c10.getDimensionPixelOffset(m.f48718N, state2.f34834x.intValue()) : state.f34836z.intValue());
        state2.f34808C = Integer.valueOf(state.f34808C == null ? c10.getDimensionPixelOffset(m.f48658H, 0) : state.f34808C.intValue());
        state2.f34806A = Integer.valueOf(state.f34806A == null ? 0 : state.f34806A.intValue());
        state2.f34807B = Integer.valueOf(state.f34807B == null ? 0 : state.f34807B.intValue());
        state2.f34809D = Boolean.valueOf(state.f34809D == null ? c10.getBoolean(m.f48960m, false) : state.f34809D.booleanValue());
        c10.recycle();
        if (state.f34824n == null) {
            state2.f34824n = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            state2.f34824n = state.f34824n;
        }
        this.f34794a = state;
    }

    public static int J(Context context, TypedArray typedArray, int i10) {
        return c.a(context, typedArray, i10).getDefaultColor();
    }

    public State A() {
        return this.f34794a;
    }

    public String B() {
        return this.f34795b.f34820j;
    }

    public int C() {
        return this.f34795b.f34814d.intValue();
    }

    public int D() {
        return this.f34795b.f34836z.intValue();
    }

    public int E() {
        return this.f34795b.f34834x.intValue();
    }

    public boolean F() {
        return this.f34795b.f34821k != -1;
    }

    public boolean G() {
        return this.f34795b.f34820j != null;
    }

    public boolean H() {
        return this.f34795b.f34809D.booleanValue();
    }

    public boolean I() {
        return this.f34795b.f34830t.booleanValue();
    }

    public void K(int i10) {
        this.f34794a.f34819i = i10;
        this.f34795b.f34819i = i10;
    }

    public void L(int i10) {
        this.f34794a.f34812b = Integer.valueOf(i10);
        this.f34795b.f34812b = Integer.valueOf(i10);
    }

    public void M(int i10) {
        this.f34794a.f34813c = Integer.valueOf(i10);
        this.f34795b.f34813c = Integer.valueOf(i10);
    }

    public void N(int i10) {
        this.f34794a.f34821k = i10;
        this.f34795b.f34821k = i10;
    }

    public void O(String str) {
        this.f34794a.f34820j = str;
        this.f34795b.f34820j = str;
    }

    public void P(boolean z10) {
        this.f34794a.f34830t = Boolean.valueOf(z10);
        this.f34795b.f34830t = Boolean.valueOf(z10);
    }

    public void a() {
        N(-1);
    }

    public void b() {
        O(null);
    }

    public final TypedArray c(Context context, int i10, int i11, int i12) {
        AttributeSet attributeSet;
        int i13;
        if (i10 != 0) {
            attributeSet = d.i(context, i10, "badge");
            i13 = attributeSet.getStyleAttribute();
        } else {
            attributeSet = null;
            i13 = 0;
        }
        return xa.l.i(context, attributeSet, m.Badge, i11, i13 == 0 ? i12 : i13, new int[0]);
    }

    public int d() {
        return this.f34795b.f34806A.intValue();
    }

    public int e() {
        return this.f34795b.f34807B.intValue();
    }

    public int f() {
        return this.f34795b.f34819i;
    }

    public int g() {
        return this.f34795b.f34812b.intValue();
    }

    public int h() {
        return this.f34795b.f34829s.intValue();
    }

    public int i() {
        return this.f34795b.f34831u.intValue();
    }

    public int j() {
        return this.f34795b.f34816f.intValue();
    }

    public int k() {
        return this.f34795b.f34815e.intValue();
    }

    public int l() {
        return this.f34795b.f34813c.intValue();
    }

    public int m() {
        return this.f34795b.f34832v.intValue();
    }

    public int n() {
        return this.f34795b.f34818h.intValue();
    }

    public int o() {
        return this.f34795b.f34817g.intValue();
    }

    public int p() {
        return this.f34795b.f34828r;
    }

    public CharSequence q() {
        return this.f34795b.f34825o;
    }

    public CharSequence r() {
        return this.f34795b.f34826p;
    }

    public int s() {
        return this.f34795b.f34827q;
    }

    public int t() {
        return this.f34795b.f34835y.intValue();
    }

    public int u() {
        return this.f34795b.f34833w.intValue();
    }

    public int v() {
        return this.f34795b.f34808C.intValue();
    }

    public int w() {
        return this.f34795b.f34822l;
    }

    public int x() {
        return this.f34795b.f34823m;
    }

    public int y() {
        return this.f34795b.f34821k;
    }

    public Locale z() {
        return this.f34795b.f34824n;
    }

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new a();

        /* renamed from: A, reason: collision with root package name */
        public Integer f34806A;

        /* renamed from: B, reason: collision with root package name */
        public Integer f34807B;

        /* renamed from: C, reason: collision with root package name */
        public Integer f34808C;

        /* renamed from: D, reason: collision with root package name */
        public Boolean f34809D;

        /* renamed from: E, reason: collision with root package name */
        public Integer f34810E;

        /* renamed from: a, reason: collision with root package name */
        public int f34811a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f34812b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f34813c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f34814d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f34815e;

        /* renamed from: f, reason: collision with root package name */
        public Integer f34816f;

        /* renamed from: g, reason: collision with root package name */
        public Integer f34817g;

        /* renamed from: h, reason: collision with root package name */
        public Integer f34818h;

        /* renamed from: i, reason: collision with root package name */
        public int f34819i;

        /* renamed from: j, reason: collision with root package name */
        public String f34820j;

        /* renamed from: k, reason: collision with root package name */
        public int f34821k;

        /* renamed from: l, reason: collision with root package name */
        public int f34822l;

        /* renamed from: m, reason: collision with root package name */
        public int f34823m;

        /* renamed from: n, reason: collision with root package name */
        public Locale f34824n;

        /* renamed from: o, reason: collision with root package name */
        public CharSequence f34825o;

        /* renamed from: p, reason: collision with root package name */
        public CharSequence f34826p;

        /* renamed from: q, reason: collision with root package name */
        public int f34827q;

        /* renamed from: r, reason: collision with root package name */
        public int f34828r;

        /* renamed from: s, reason: collision with root package name */
        public Integer f34829s;

        /* renamed from: t, reason: collision with root package name */
        public Boolean f34830t;

        /* renamed from: u, reason: collision with root package name */
        public Integer f34831u;

        /* renamed from: v, reason: collision with root package name */
        public Integer f34832v;

        /* renamed from: w, reason: collision with root package name */
        public Integer f34833w;

        /* renamed from: x, reason: collision with root package name */
        public Integer f34834x;

        /* renamed from: y, reason: collision with root package name */
        public Integer f34835y;

        /* renamed from: z, reason: collision with root package name */
        public Integer f34836z;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public State[] newArray(int i10) {
                return new State[i10];
            }
        }

        public State() {
            this.f34819i = 255;
            this.f34821k = -2;
            this.f34822l = -2;
            this.f34823m = -2;
            this.f34830t = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f34811a);
            parcel.writeSerializable(this.f34812b);
            parcel.writeSerializable(this.f34813c);
            parcel.writeSerializable(this.f34814d);
            parcel.writeSerializable(this.f34815e);
            parcel.writeSerializable(this.f34816f);
            parcel.writeSerializable(this.f34817g);
            parcel.writeSerializable(this.f34818h);
            parcel.writeInt(this.f34819i);
            parcel.writeString(this.f34820j);
            parcel.writeInt(this.f34821k);
            parcel.writeInt(this.f34822l);
            parcel.writeInt(this.f34823m);
            CharSequence charSequence = this.f34825o;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.f34826p;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.f34827q);
            parcel.writeSerializable(this.f34829s);
            parcel.writeSerializable(this.f34831u);
            parcel.writeSerializable(this.f34832v);
            parcel.writeSerializable(this.f34833w);
            parcel.writeSerializable(this.f34834x);
            parcel.writeSerializable(this.f34835y);
            parcel.writeSerializable(this.f34836z);
            parcel.writeSerializable(this.f34808C);
            parcel.writeSerializable(this.f34806A);
            parcel.writeSerializable(this.f34807B);
            parcel.writeSerializable(this.f34830t);
            parcel.writeSerializable(this.f34824n);
            parcel.writeSerializable(this.f34809D);
            parcel.writeSerializable(this.f34810E);
        }

        public State(Parcel parcel) {
            this.f34819i = 255;
            this.f34821k = -2;
            this.f34822l = -2;
            this.f34823m = -2;
            this.f34830t = Boolean.TRUE;
            this.f34811a = parcel.readInt();
            this.f34812b = (Integer) parcel.readSerializable();
            this.f34813c = (Integer) parcel.readSerializable();
            this.f34814d = (Integer) parcel.readSerializable();
            this.f34815e = (Integer) parcel.readSerializable();
            this.f34816f = (Integer) parcel.readSerializable();
            this.f34817g = (Integer) parcel.readSerializable();
            this.f34818h = (Integer) parcel.readSerializable();
            this.f34819i = parcel.readInt();
            this.f34820j = parcel.readString();
            this.f34821k = parcel.readInt();
            this.f34822l = parcel.readInt();
            this.f34823m = parcel.readInt();
            this.f34825o = parcel.readString();
            this.f34826p = parcel.readString();
            this.f34827q = parcel.readInt();
            this.f34829s = (Integer) parcel.readSerializable();
            this.f34831u = (Integer) parcel.readSerializable();
            this.f34832v = (Integer) parcel.readSerializable();
            this.f34833w = (Integer) parcel.readSerializable();
            this.f34834x = (Integer) parcel.readSerializable();
            this.f34835y = (Integer) parcel.readSerializable();
            this.f34836z = (Integer) parcel.readSerializable();
            this.f34808C = (Integer) parcel.readSerializable();
            this.f34806A = (Integer) parcel.readSerializable();
            this.f34807B = (Integer) parcel.readSerializable();
            this.f34830t = (Boolean) parcel.readSerializable();
            this.f34824n = (Locale) parcel.readSerializable();
            this.f34809D = (Boolean) parcel.readSerializable();
            this.f34810E = (Integer) parcel.readSerializable();
        }
    }
}
