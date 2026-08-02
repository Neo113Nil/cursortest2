package io.sentry.android.replay;

import android.content.Context;
import io.sentry.H3;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: g, reason: collision with root package name */
    public static final a f51663g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f51664a;

    /* renamed from: b, reason: collision with root package name */
    public final int f51665b;

    /* renamed from: c, reason: collision with root package name */
    public final float f51666c;

    /* renamed from: d, reason: collision with root package name */
    public final float f51667d;

    /* renamed from: e, reason: collision with root package name */
    public final int f51668e;

    /* renamed from: f, reason: collision with root package name */
    public final int f51669f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(int i10) {
            int i11 = i10 % 16;
            return i11 <= 8 ? Math.max(16, i10 - i11) : i10 + (16 - i11);
        }

        public final s b(Context context, H3 sessionReplay, int i10, int i11) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sessionReplay, "sessionReplay");
            float f10 = i11;
            float f11 = i10;
            Pair pair = TuplesKt.to(Integer.valueOf(a(MathKt.roundToInt((f10 / context.getResources().getDisplayMetrics().density) * sessionReplay.v().sizeScale))), Integer.valueOf(a(MathKt.roundToInt((f11 / context.getResources().getDisplayMetrics().density) * sessionReplay.v().sizeScale))));
            int intValue = ((Number) pair.component1()).intValue();
            int intValue2 = ((Number) pair.component2()).intValue();
            return new s(intValue2, intValue, intValue2 / f11, intValue / f10, sessionReplay.o(), sessionReplay.v().bitRate);
        }

        public a() {
        }
    }

    public s(int i10, int i11, float f10, float f11, int i12, int i13) {
        this.f51664a = i10;
        this.f51665b = i11;
        this.f51666c = f10;
        this.f51667d = f11;
        this.f51668e = i12;
        this.f51669f = i13;
    }

    public final int a() {
        return this.f51669f;
    }

    public final int b() {
        return this.f51668e;
    }

    public final int c() {
        return this.f51665b;
    }

    public final int d() {
        return this.f51664a;
    }

    public final float e() {
        return this.f51666c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f51664a == sVar.f51664a && this.f51665b == sVar.f51665b && Float.compare(this.f51666c, sVar.f51666c) == 0 && Float.compare(this.f51667d, sVar.f51667d) == 0 && this.f51668e == sVar.f51668e && this.f51669f == sVar.f51669f;
    }

    public final float f() {
        return this.f51667d;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f51664a) * 31) + Integer.hashCode(this.f51665b)) * 31) + Float.hashCode(this.f51666c)) * 31) + Float.hashCode(this.f51667d)) * 31) + Integer.hashCode(this.f51668e)) * 31) + Integer.hashCode(this.f51669f);
    }

    public String toString() {
        return "ScreenshotRecorderConfig(recordingWidth=" + this.f51664a + ", recordingHeight=" + this.f51665b + ", scaleFactorX=" + this.f51666c + ", scaleFactorY=" + this.f51667d + ", frameRate=" + this.f51668e + ", bitRate=" + this.f51669f + ')';
    }
}
