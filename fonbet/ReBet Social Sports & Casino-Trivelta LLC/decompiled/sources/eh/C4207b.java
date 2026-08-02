package eh;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: eh.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4207b implements Comparable {

    /* renamed from: j, reason: collision with root package name */
    public static final a f46031j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final C4207b f46032k = AbstractC4206a.a(0L);

    /* renamed from: a, reason: collision with root package name */
    public final int f46033a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46034b;

    /* renamed from: c, reason: collision with root package name */
    public final int f46035c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC4209d f46036d;

    /* renamed from: e, reason: collision with root package name */
    public final int f46037e;

    /* renamed from: f, reason: collision with root package name */
    public final int f46038f;

    /* renamed from: g, reason: collision with root package name */
    public final EnumC4208c f46039g;

    /* renamed from: h, reason: collision with root package name */
    public final int f46040h;

    /* renamed from: i, reason: collision with root package name */
    public final long f46041i;

    /* renamed from: eh.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C4207b(int i10, int i11, int i12, EnumC4209d dayOfWeek, int i13, int i14, EnumC4208c month, int i15, long j10) {
        Intrinsics.checkNotNullParameter(dayOfWeek, "dayOfWeek");
        Intrinsics.checkNotNullParameter(month, "month");
        this.f46033a = i10;
        this.f46034b = i11;
        this.f46035c = i12;
        this.f46036d = dayOfWeek;
        this.f46037e = i13;
        this.f46038f = i14;
        this.f46039g = month;
        this.f46040h = i15;
        this.f46041i = j10;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C4207b other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.compare(this.f46041i, other.f46041i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4207b)) {
            return false;
        }
        C4207b c4207b = (C4207b) obj;
        return this.f46033a == c4207b.f46033a && this.f46034b == c4207b.f46034b && this.f46035c == c4207b.f46035c && this.f46036d == c4207b.f46036d && this.f46037e == c4207b.f46037e && this.f46038f == c4207b.f46038f && this.f46039g == c4207b.f46039g && this.f46040h == c4207b.f46040h && this.f46041i == c4207b.f46041i;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.f46033a) * 31) + Integer.hashCode(this.f46034b)) * 31) + Integer.hashCode(this.f46035c)) * 31) + this.f46036d.hashCode()) * 31) + Integer.hashCode(this.f46037e)) * 31) + Integer.hashCode(this.f46038f)) * 31) + this.f46039g.hashCode()) * 31) + Integer.hashCode(this.f46040h)) * 31) + Long.hashCode(this.f46041i);
    }

    public String toString() {
        return "GMTDate(seconds=" + this.f46033a + ", minutes=" + this.f46034b + ", hours=" + this.f46035c + ", dayOfWeek=" + this.f46036d + ", dayOfMonth=" + this.f46037e + ", dayOfYear=" + this.f46038f + ", month=" + this.f46039g + ", year=" + this.f46040h + ", timestamp=" + this.f46041i + ')';
    }
}
