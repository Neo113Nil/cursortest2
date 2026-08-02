package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sg9 {
    public static final Logger a = Logger.getLogger(og9.class.getName());
    public static final gc2 b;

    static {
        gc2 gc2Var = gc2.d;
        b = q1f.o("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    public static void a(String str, Object... objArr) {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    public static int b(int i, byte b2, short s) {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        a("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    public static int c(lof lofVar) {
        return (lofVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((lofVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((lofVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }
}
