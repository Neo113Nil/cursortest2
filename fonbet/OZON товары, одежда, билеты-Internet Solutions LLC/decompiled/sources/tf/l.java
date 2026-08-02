package tf;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.L;
import sf.G;

/* loaded from: classes10.dex */
final class l extends AbstractC7737t implements Function2<Integer, Long, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ I f99511b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f99512c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ L f99513d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ G f99514e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ L f99515f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ L f99516g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(I i11, long j11, L l11, G g10, L l12, L l13) {
        super(2);
        this.f99511b = i11;
        this.f99512c = j11;
        this.f99513d = l11;
        this.f99514e = g10;
        this.f99515f = l12;
        this.f99516g = l13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Long l11) {
        int intValue = num.intValue();
        long longValue = l11.longValue();
        if (intValue == 1) {
            I i11 = this.f99511b;
            if (i11.f71783a) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            i11.f71783a = true;
            if (longValue < this.f99512c) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            L l12 = this.f99513d;
            long j11 = l12.f71786a;
            G g10 = this.f99514e;
            if (j11 == 4294967295L) {
                j11 = g10.p();
            }
            l12.f71786a = j11;
            L l13 = this.f99515f;
            l13.f71786a = l13.f71786a == 4294967295L ? g10.p() : 0L;
            L l14 = this.f99516g;
            l14.f71786a = l14.f71786a == 4294967295L ? g10.p() : 0L;
        }
        return Unit.f71690a;
    }
}
