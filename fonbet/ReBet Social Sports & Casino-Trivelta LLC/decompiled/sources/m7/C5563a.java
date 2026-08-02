package m7;

import d7.InterfaceC4015d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5563a implements b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0815a f56383c = new C0815a(null);

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4015d f56384a;

    /* renamed from: b, reason: collision with root package name */
    public long f56385b;

    /* renamed from: m7.a$a, reason: collision with other inner class name */
    public static final class C0815a {
        public /* synthetic */ C0815a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0815a() {
        }
    }

    public C5563a(InterfaceC4015d animationInformation) {
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        this.f56384a = animationInformation;
        this.f56385b = -1L;
    }

    @Override // m7.b
    public long a(long j10) {
        long c10 = c();
        long j11 = 0;
        if (c10 == 0) {
            return -1L;
        }
        if (!e() && j10 / c10 >= this.f56384a.b()) {
            return -1L;
        }
        long j12 = j10 % c10;
        int a10 = this.f56384a.a();
        for (int i10 = 0; i10 < a10 && j11 <= j12; i10++) {
            j11 += this.f56384a.l(i10);
        }
        return j10 + (j11 - j12);
    }

    @Override // m7.b
    public int b(long j10, long j11) {
        long c10 = c();
        if (c10 == 0) {
            return d(0L);
        }
        if (e() || j10 / c10 < this.f56384a.b()) {
            return d(j10 % c10);
        }
        return -1;
    }

    @Override // m7.b
    public long c() {
        long j10 = this.f56385b;
        if (j10 != -1) {
            return j10;
        }
        this.f56385b = 0L;
        int a10 = this.f56384a.a();
        for (int i10 = 0; i10 < a10; i10++) {
            this.f56385b += this.f56384a.l(i10);
        }
        return this.f56385b;
    }

    public final int d(long j10) {
        int i10 = 0;
        long j11 = 0;
        while (true) {
            j11 += this.f56384a.l(i10);
            int i11 = i10 + 1;
            if (j10 < j11) {
                return i10;
            }
            i10 = i11;
        }
    }

    public boolean e() {
        return this.f56384a.b() == 0;
    }
}
