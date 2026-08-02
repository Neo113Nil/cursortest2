package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class uo2 {
    public static final akd a;

    static {
        String property = System.getProperty("ktor.internal.cio.disable.chararray.pooling");
        a = property != null ? Boolean.parseBoolean(property) : false ? new so2() : new to2(4096);
    }
}
