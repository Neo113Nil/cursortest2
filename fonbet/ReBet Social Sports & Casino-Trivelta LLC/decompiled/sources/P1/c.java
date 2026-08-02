package P1;

import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f8700a;

    /* renamed from: b, reason: collision with root package name */
    public final List f8701b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f8702a;

        /* renamed from: b, reason: collision with root package name */
        public final String f8703b;

        /* renamed from: c, reason: collision with root package name */
        public final long f8704c;

        /* renamed from: d, reason: collision with root package name */
        public final long f8705d;

        public a(String str, String str2, long j10, long j11) {
            this.f8702a = str;
            this.f8703b = str2;
            this.f8704c = j10;
            this.f8705d = j11;
        }
    }

    public c(long j10, List list) {
        this.f8700a = j10;
        this.f8701b = list;
    }

    public W1.a a(long j10) {
        long j11;
        if (this.f8701b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f8701b.size() - 1; size >= 0; size--) {
            a aVar = (a) this.f8701b.get(size);
            boolean equals = "video/mp4".equals(aVar.f8702a) | z10;
            if (size == 0) {
                j12 -= aVar.f8705d;
                j11 = 0;
            } else {
                j11 = j12 - aVar.f8704c;
            }
            long j17 = j11;
            long j18 = j12;
            j12 = j17;
            if (!equals || j12 == j18) {
                z10 = equals;
            } else {
                j16 = j18 - j12;
                j15 = j12;
                z10 = false;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j18;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new W1.a(j13, j14, this.f8700a, j15, j16);
    }
}
