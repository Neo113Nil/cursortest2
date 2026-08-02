package org.joda.time.tz;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.joda.time.DateTimeZone;

/* loaded from: classes6.dex */
public class CachedDateTimeZone extends DateTimeZone {

    /* renamed from: f, reason: collision with root package name */
    private static final int f79384f;
    private static final long serialVersionUID = 5472298452022250685L;

    /* renamed from: e, reason: collision with root package name */
    private final transient a[] f79385e;
    private final DateTimeZone iZone;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f79386a;

        /* renamed from: b, reason: collision with root package name */
        public final DateTimeZone f79387b;

        /* renamed from: c, reason: collision with root package name */
        a f79388c;

        /* renamed from: d, reason: collision with root package name */
        private String f79389d;

        /* renamed from: e, reason: collision with root package name */
        private int f79390e = LinearLayoutManager.INVALID_OFFSET;

        /* renamed from: f, reason: collision with root package name */
        private int f79391f = LinearLayoutManager.INVALID_OFFSET;

        a(long j11, DateTimeZone dateTimeZone) {
            this.f79386a = j11;
            this.f79387b = dateTimeZone;
        }

        public final String a(long j11) {
            a aVar = this.f79388c;
            if (aVar != null && j11 >= aVar.f79386a) {
                return aVar.a(j11);
            }
            if (this.f79389d == null) {
                this.f79389d = this.f79387b.l(this.f79386a);
            }
            return this.f79389d;
        }

        public final int b(long j11) {
            a aVar = this.f79388c;
            if (aVar != null && j11 >= aVar.f79386a) {
                return aVar.b(j11);
            }
            if (this.f79390e == Integer.MIN_VALUE) {
                this.f79390e = this.f79387b.n(this.f79386a);
            }
            return this.f79390e;
        }

        public final int c(long j11) {
            a aVar = this.f79388c;
            if (aVar != null && j11 >= aVar.f79386a) {
                return aVar.c(j11);
            }
            if (this.f79391f == Integer.MIN_VALUE) {
                this.f79391f = this.f79387b.v(this.f79386a);
            }
            return this.f79391f;
        }
    }

    static {
        Integer num;
        int i11;
        try {
            num = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            num = null;
        }
        if (num == null) {
            i11 = UserVerificationMethods.USER_VERIFY_NONE;
        } else {
            int i12 = 0;
            for (int intValue = num.intValue() - 1; intValue > 0; intValue >>= 1) {
                i12++;
            }
            i11 = 1 << i12;
        }
        f79384f = i11 - 1;
    }

    private CachedDateTimeZone(DateTimeZone dateTimeZone) {
        super(dateTimeZone.h());
        this.f79385e = new a[f79384f + 1];
        this.iZone = dateTimeZone;
    }

    public static CachedDateTimeZone G(DateTimeZone dateTimeZone) {
        return dateTimeZone instanceof CachedDateTimeZone ? (CachedDateTimeZone) dateTimeZone : new CachedDateTimeZone(dateTimeZone);
    }

    private a H(long j11) {
        int i11 = (int) (j11 >> 32);
        int i12 = f79384f & i11;
        a[] aVarArr = this.f79385e;
        a aVar = aVarArr[i12];
        if (aVar != null && ((int) (aVar.f79386a >> 32)) == i11) {
            return aVar;
        }
        long j12 = j11 & (-4294967296L);
        a aVar2 = new a(j12, this.iZone);
        long j13 = 4294967295L | j12;
        a aVar3 = aVar2;
        while (true) {
            long A11 = this.iZone.A(j12);
            if (A11 == j12 || A11 > j13) {
                break;
            }
            a aVar4 = new a(A11, this.iZone);
            aVar3.f79388c = aVar4;
            aVar3 = aVar4;
            j12 = A11;
        }
        aVarArr[i12] = aVar2;
        return aVar2;
    }

    @Override // org.joda.time.DateTimeZone
    public final long A(long j11) {
        return this.iZone.A(j11);
    }

    @Override // org.joda.time.DateTimeZone
    public final long B(long j11) {
        return this.iZone.B(j11);
    }

    @Override // org.joda.time.DateTimeZone
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CachedDateTimeZone) {
            return this.iZone.equals(((CachedDateTimeZone) obj).iZone);
        }
        return false;
    }

    @Override // org.joda.time.DateTimeZone
    public final int hashCode() {
        return this.iZone.hashCode();
    }

    @Override // org.joda.time.DateTimeZone
    public final String l(long j11) {
        return H(j11).a(j11);
    }

    @Override // org.joda.time.DateTimeZone
    public final int n(long j11) {
        return H(j11).b(j11);
    }

    @Override // org.joda.time.DateTimeZone
    public final int v(long j11) {
        return H(j11).c(j11);
    }

    @Override // org.joda.time.DateTimeZone
    public final boolean y() {
        return this.iZone.y();
    }
}
