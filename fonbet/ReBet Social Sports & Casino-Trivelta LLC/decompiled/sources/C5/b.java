package C5;

import android.view.MotionEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static final a f1132h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f1133a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1134b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1135c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1136d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1137e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1138f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1139g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            return new b(event.getActionMasked(), event.getRawX(), event.getRawY(), event.getEventTime(), event.getDownTime(), event.getToolType(0), event.getMetaState());
        }

        public a() {
        }
    }

    public b(int i10, float f10, float f11, long j10, long j11, int i11, int i12) {
        this.f1133a = i10;
        this.f1134b = f10;
        this.f1135c = f11;
        this.f1136d = j10;
        this.f1137e = j11;
        this.f1138f = i11;
        this.f1139g = i12;
    }

    public final float a() {
        return this.f1134b;
    }

    public final float b() {
        return this.f1135c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1133a == bVar.f1133a && Float.compare(this.f1134b, bVar.f1134b) == 0 && Float.compare(this.f1135c, bVar.f1135c) == 0 && this.f1136d == bVar.f1136d && this.f1137e == bVar.f1137e && this.f1138f == bVar.f1138f && this.f1139g == bVar.f1139g;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f1133a) * 31) + Float.hashCode(this.f1134b)) * 31) + Float.hashCode(this.f1135c)) * 31) + Long.hashCode(this.f1136d)) * 31) + Long.hashCode(this.f1137e)) * 31) + Integer.hashCode(this.f1138f)) * 31) + Integer.hashCode(this.f1139g);
    }

    public String toString() {
        return "MotionEventSnapshot(action=" + this.f1133a + ", x=" + this.f1134b + ", y=" + this.f1135c + ", eventTime=" + this.f1136d + ", downTime=" + this.f1137e + ", toolType=" + this.f1138f + ", metaState=" + this.f1139g + ")";
    }
}
