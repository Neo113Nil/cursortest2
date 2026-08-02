package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class xp2 {
    public static final Charset a = StandardCharsets.US_ASCII;
    public static final Charset b = StandardCharsets.ISO_8859_1;
    public static final Charset c = StandardCharsets.UTF_8;
    public static final Charset d;

    static {
        Charset charset = StandardCharsets.UTF_16BE;
        Charset charset2 = StandardCharsets.UTF_16LE;
        d = StandardCharsets.UTF_16;
    }
}
