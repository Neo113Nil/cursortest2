package defpackage;

import com.vungle.ads.internal.protos.Sdk;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class mic {
    public static final BitSet d;
    public final String a;
    public final byte[] b;
    public final Object c;

    static {
        BitSet bitSet = new BitSet(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            bitSet.set(c);
        }
        for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        d = bitSet;
    }

    public mic(Object obj, String str, boolean z) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        z1a.y(lowerCase, "name");
        z1a.r("token must have at least 1 tchar", !lowerCase.isEmpty());
        if (lowerCase.equals("connection")) {
            qic.c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        for (int i = 0; i < lowerCase.length(); i++) {
            char charAt = lowerCase.charAt(i);
            if ((!z || charAt != ':' || i != 0) && !d.get(charAt)) {
                a70.p(ufa.C("Invalid character '%s' in key name '%s'", Character.valueOf(charAt), lowerCase));
                throw null;
            }
        }
        this.a = lowerCase;
        this.b = lowerCase.getBytes(xp2.a);
        this.c = obj;
    }

    public abstract Object a(byte[] bArr);

    public abstract byte[] b(Object obj);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((mic) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return mz1.o(new StringBuilder("Key{name='"), this.a, "'}");
    }
}
