package com.facebook.yoga;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class YogaValue {

    /* renamed from: c, reason: collision with root package name */
    public static final a f31648c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final YogaValue f31649d;

    /* renamed from: e, reason: collision with root package name */
    public static final YogaValue f31650e;

    /* renamed from: f, reason: collision with root package name */
    public static final YogaValue f31651f;

    /* renamed from: a, reason: collision with root package name */
    public final float f31652a;

    /* renamed from: b, reason: collision with root package name */
    public final w f31653b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final YogaValue a(String str) {
            if (str == null) {
                return null;
            }
            if (Intrinsics.areEqual("undefined", str)) {
                return YogaValue.f31649d;
            }
            if (Intrinsics.areEqual("auto", str)) {
                return YogaValue.f31651f;
            }
            if (!StringsKt.endsWith$default(str, "%", false, 2, (Object) null)) {
                return new YogaValue(Float.parseFloat(str), w.POINT);
            }
            String substring = str.substring(0, str.length() - 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return new YogaValue(Float.parseFloat(substring), w.PERCENT);
        }

        public a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[w.values().length];
            try {
                iArr[w.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w.PERCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[w.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f10 = g.f31669b;
        f31649d = new YogaValue(f10, w.UNDEFINED);
        f31650e = new YogaValue(0.0f, w.POINT);
        f31651f = new YogaValue(f10, w.AUTO);
    }

    public YogaValue(float f10, w unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f31652a = f10;
        this.f31653b = unit;
    }

    public boolean equals(Object obj) {
        if (obj instanceof YogaValue) {
            w wVar = this.f31653b;
            YogaValue yogaValue = (YogaValue) obj;
            if (wVar == yogaValue.f31653b) {
                return wVar == w.UNDEFINED || wVar == w.AUTO || Float.compare(this.f31652a, yogaValue.f31652a) == 0;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f31652a) + this.f31653b.c();
    }

    public String toString() {
        int i10 = b.$EnumSwitchMapping$0[this.f31653b.ordinal()];
        if (i10 == 1) {
            return "undefined";
        }
        if (i10 == 2) {
            return String.valueOf(this.f31652a);
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return "auto";
            }
            throw new IllegalStateException();
        }
        return this.f31652a + "%";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public YogaValue(float f10, int i10) {
        this(f10, r3);
        w b10 = w.b(i10);
        Intrinsics.checkNotNullExpressionValue(b10, "fromInt(...)");
    }
}
