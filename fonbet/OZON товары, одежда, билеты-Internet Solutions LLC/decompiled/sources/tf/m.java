package tf;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.M;
import sf.G;

/* loaded from: classes10.dex */
final class m extends AbstractC7737t implements Function2<Integer, Long, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ G f99517b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ M<Long> f99518c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ M<Long> f99519d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ M<Long> f99520e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(G g10, M m11, M m12, M m13) {
        super(2);
        this.f99517b = g10;
        this.f99518c = m11;
        this.f99519d = m12;
        this.f99520e = m13;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v12, types: [T, java.lang.Long] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Long l11) {
        int intValue = num.intValue();
        long longValue = l11.longValue();
        if (intValue == 21589) {
            if (longValue < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            byte readByte = this.f99517b.readByte();
            boolean z11 = (readByte & 1) == 1;
            boolean z12 = (readByte & 2) == 2;
            boolean z13 = (readByte & 4) == 4;
            long j11 = z11 ? 5L : 1L;
            if (z12) {
                j11 += 4;
            }
            if (z13) {
                j11 += 4;
            }
            if (longValue < j11) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z11) {
                this.f99518c.f71787a = Long.valueOf(r2.o() * 1000);
            }
            if (z12) {
                this.f99519d.f71787a = Long.valueOf(r2.o() * 1000);
            }
            if (z13) {
                this.f99520e.f71787a = Long.valueOf(r2.o() * 1000);
            }
        }
        return Unit.f71690a;
    }
}
