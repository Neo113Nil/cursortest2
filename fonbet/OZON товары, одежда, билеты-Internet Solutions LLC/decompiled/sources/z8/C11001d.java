package z8;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: z8.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11001d {

    /* renamed from: a, reason: collision with root package name */
    private static final byte f107322a = Byte.parseByte("01110000", 2);

    /* renamed from: b, reason: collision with root package name */
    private static final byte f107323b = Byte.parseByte("00001111", 2);

    @NonNull
    public static String a() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array = wrap.array();
        byte b11 = array[0];
        array[16] = b11;
        array[0] = (byte) ((b11 & f107323b) | f107322a);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
