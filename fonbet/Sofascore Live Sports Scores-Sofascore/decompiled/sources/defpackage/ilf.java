package defpackage;

import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Random;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class ilf {
    public static final SecureRandom a;
    public static final Random b;

    static {
        SecureRandom secureRandom = new SecureRandom();
        a = secureRandom;
        byte[] generateSeed = secureRandom.generateSeed(8);
        ByteBuffer allocate = ByteBuffer.allocate(64);
        allocate.put(generateSeed);
        allocate.flip();
        b = new Random(allocate.getLong());
    }

    public static long a(Random random, long j) {
        long nextLong;
        long j2;
        do {
            nextLong = (random.nextLong() << 1) >>> 1;
            j2 = nextLong % j;
        } while ((j - 1) + (nextLong - j2) < 0);
        return j2;
    }
}
