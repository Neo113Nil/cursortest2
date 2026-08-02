package io.sentry.android.replay;

import B0.C2454a;
import android.content.Context;
import hd.C6915b;
import io.sentry.Y2;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final int f67653a;

    /* renamed from: b, reason: collision with root package name */
    private final int f67654b;

    /* renamed from: c, reason: collision with root package name */
    private final float f67655c;

    /* renamed from: d, reason: collision with root package name */
    private final float f67656d;

    /* renamed from: e, reason: collision with root package name */
    private final int f67657e;

    /* renamed from: f, reason: collision with root package name */
    private final int f67658f;

    public static final class a {
        @NotNull
        public static t a(@NotNull Context context, @NotNull Y2 sessionReplay, int i11, int i12) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sessionReplay, "sessionReplay");
            float f7 = i12;
            int c11 = C6915b.c((f7 / context.getResources().getDisplayMetrics().density) * sessionReplay.o().sizeScale);
            int i13 = c11 % 16;
            Integer valueOf = Integer.valueOf(i13 <= 8 ? Math.max(16, c11 - i13) : c11 + (16 - i13));
            float f11 = i11;
            int c12 = C6915b.c((f11 / context.getResources().getDisplayMetrics().density) * sessionReplay.o().sizeScale);
            int i14 = c12 % 16;
            Pair pair = new Pair(valueOf, Integer.valueOf(i14 <= 8 ? Math.max(16, c12 - i14) : c12 + (16 - i14)));
            int intValue = ((Number) pair.a()).intValue();
            int intValue2 = ((Number) pair.b()).intValue();
            return new t(intValue2, intValue, intValue2 / f11, intValue / f7, sessionReplay.h(), sessionReplay.o().bitRate);
        }
    }

    public t(int i11, int i12, float f7, float f11, int i13, int i14) {
        this.f67653a = i11;
        this.f67654b = i12;
        this.f67655c = f7;
        this.f67656d = f11;
        this.f67657e = i13;
        this.f67658f = i14;
    }

    public final int a() {
        return this.f67658f;
    }

    public final int b() {
        return this.f67657e;
    }

    public final int c() {
        return this.f67654b;
    }

    public final int d() {
        return this.f67653a;
    }

    public final float e() {
        return this.f67655c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f67653a == tVar.f67653a && this.f67654b == tVar.f67654b && Float.compare(this.f67655c, tVar.f67655c) == 0 && Float.compare(this.f67656d, tVar.f67656d) == 0 && this.f67657e == tVar.f67657e && this.f67658f == tVar.f67658f;
    }

    public final float f() {
        return this.f67656d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f67658f) + C2454a.a(this.f67657e, Pk0.b.a(this.f67656d, Pk0.b.a(this.f67655c, C2454a.a(this.f67654b, Integer.hashCode(this.f67653a) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenshotRecorderConfig(recordingWidth=");
        sb2.append(this.f67653a);
        sb2.append(", recordingHeight=");
        sb2.append(this.f67654b);
        sb2.append(", scaleFactorX=");
        sb2.append(this.f67655c);
        sb2.append(", scaleFactorY=");
        sb2.append(this.f67656d);
        sb2.append(", frameRate=");
        sb2.append(this.f67657e);
        sb2.append(", bitRate=");
        return Ek.a.d(sb2, this.f67658f, ')');
    }
}
