package androidx.camera.core.internal.utils;

import androidx.annotation.NonNull;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.nio.ByteBuffer;
import xsna.alw;
import xsna.ca2;

/* loaded from: classes11.dex */
public final class ImageUtil {

    public static final class CodecFailedException extends Exception {
        private FailureType mFailureType;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class FailureType {
            private static final /* synthetic */ FailureType[] $VALUES;
            public static final FailureType DECODE_FAILED;
            public static final FailureType ENCODE_FAILED;
            public static final FailureType UNKNOWN;

            static {
                FailureType failureType = new FailureType("ENCODE_FAILED", 0);
                ENCODE_FAILED = failureType;
                FailureType failureType2 = new FailureType("DECODE_FAILED", 1);
                DECODE_FAILED = failureType2;
                FailureType failureType3 = new FailureType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
                UNKNOWN = failureType3;
                $VALUES = new FailureType[]{failureType, failureType2, failureType3};
            }

            public FailureType() {
                throw null;
            }

            public static FailureType valueOf(String str) {
                return (FailureType) Enum.valueOf(FailureType.class, str);
            }

            public static FailureType[] values() {
                return (FailureType[]) $VALUES.clone();
            }
        }
    }

    @NonNull
    public static byte[] a(@NonNull alw alwVar) {
        int pixelStride;
        int pixelStride2;
        alw.a aVar = alwVar.M2()[0];
        alw.a aVar2 = alwVar.M2()[1];
        alw.a aVar3 = alwVar.M2()[2];
        ca2.a aVar4 = (ca2.a) aVar;
        ByteBuffer a = aVar4.a();
        ca2.a aVar5 = (ca2.a) aVar2;
        ByteBuffer a2 = aVar5.a();
        ca2.a aVar6 = (ca2.a) aVar3;
        ByteBuffer a3 = aVar6.a();
        a.rewind();
        a2.rewind();
        a3.rewind();
        int remaining = a.remaining();
        byte[] bArr = new byte[((alwVar.getHeight() * alwVar.getWidth()) / 2) + remaining];
        int i = 0;
        for (int i2 = 0; i2 < alwVar.getHeight(); i2++) {
            a.get(bArr, i, alwVar.getWidth());
            i += alwVar.getWidth();
            a.position(Math.min(remaining, aVar4.b() + (a.position() - alwVar.getWidth())));
        }
        int height = alwVar.getHeight() / 2;
        int width = alwVar.getWidth() / 2;
        int b = aVar6.b();
        int b2 = aVar5.b();
        synchronized (aVar6) {
            pixelStride = aVar6.a.getPixelStride();
        }
        synchronized (aVar5) {
            pixelStride2 = aVar5.a.getPixelStride();
        }
        byte[] bArr2 = new byte[b];
        byte[] bArr3 = new byte[b2];
        for (int i3 = 0; i3 < height; i3++) {
            a3.get(bArr2, 0, Math.min(b, a3.remaining()));
            a2.get(bArr3, 0, Math.min(b2, a2.remaining()));
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < width; i6++) {
                int i7 = i + 1;
                bArr[i] = bArr2[i4];
                i += 2;
                bArr[i7] = bArr3[i5];
                i4 += pixelStride;
                i5 += pixelStride2;
            }
        }
        return bArr;
    }
}
