package androidx.activity;

import android.window.BackEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.activity.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2035b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f16392e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final float f16393a;

    /* renamed from: b, reason: collision with root package name */
    public final float f16394b;

    /* renamed from: c, reason: collision with root package name */
    public final float f16395c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16396d;

    /* renamed from: androidx.activity.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C2035b(float f10, float f11, float f12, int i10) {
        this.f16393a = f10;
        this.f16394b = f11;
        this.f16395c = f12;
        this.f16396d = i10;
    }

    public final float a() {
        return this.f16395c;
    }

    public final int b() {
        return this.f16396d;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f16393a + ", touchY=" + this.f16394b + ", progress=" + this.f16395c + ", swipeEdge=" + this.f16396d + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2035b(BackEvent backEvent) {
        this(r0.c(backEvent), r0.d(backEvent), r0.a(backEvent), r0.b(backEvent));
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        C2034a c2034a = C2034a.f16391a;
    }
}
