package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class pz1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pz1(long j, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
        this.d = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        long j = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                yma ymaVar = (yma) obj;
                ymaVar.getClass();
                ymaVar.a();
                ha5.X0(ymaVar, (b20) obj3, this.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (jii) obj2, 52);
                break;
            case 1:
                esf esfVar = (esf) obj3;
                WritableByteChannel writableByteChannel = (WritableByteChannel) obj2;
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                byteBuffer.getClass();
                long j2 = j - esfVar.a;
                if (j2 < byteBuffer.remaining()) {
                    int limit = byteBuffer.limit();
                    byteBuffer.limit(byteBuffer.position() + ((int) j2));
                    while (byteBuffer.hasRemaining()) {
                        writableByteChannel.write(byteBuffer);
                    }
                    byteBuffer.limit(limit);
                    esfVar.a += j2;
                } else {
                    long j3 = 0;
                    while (byteBuffer.hasRemaining()) {
                        j3 += writableByteChannel.write(byteBuffer);
                    }
                    esfVar.a += j3;
                }
                break;
            case 2:
                long longValue = ((Long) obj).longValue();
                ((e1d) obj2).setValue(aij.a);
                ((Function1) obj3).invoke(Long.valueOf(Instant.ofEpochMilli(longValue).atZone(ZoneOffset.UTC).toLocalDate().atTime(Instant.ofEpochSecond(j).atZone(ZoneId.systemDefault()).toLocalTime()).atZone(ZoneId.systemDefault()).toEpochSecond()));
                break;
            default:
                ha5 ha5Var = (ha5) obj;
                ha5Var.getClass();
                float H0 = ha5Var.H0(3.0f);
                float H02 = ha5Var.H0(14.0f);
                long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var.n() >> 32))) << 32) | (Float.floatToRawIntBits(H02) & 4294967295L);
                float H03 = ha5Var.H0(16.0f);
                ha5.f0(ha5Var, this.b, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(H0) & 4294967295L), floatToRawIntBits, (Float.floatToRawIntBits(H03) << 32) | (Float.floatToRawIntBits(H03) & 4294967295L), null, 240);
                long j4 = ((r13) ((cdi) obj3).getValue()).a;
                float H04 = ha5Var.H0(10.0f);
                float floatValue = ((Number) ((cdi) obj2).getValue()).floatValue();
                float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) / 2.0f;
                ha5.U(ha5Var, j4, H04, (Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 120);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ pz1(Object obj, long j, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }
}
