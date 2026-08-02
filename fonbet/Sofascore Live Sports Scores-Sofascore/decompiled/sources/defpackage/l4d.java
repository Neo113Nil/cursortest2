package defpackage;

import java.io.InputStream;
import java.util.Properties;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class l4d {
    public static final String a;

    static {
        Properties properties = new Properties();
        String str = null;
        try {
            InputStream resourceAsStream = l4d.class.getResourceAsStream("/io/nats/jnats/version.properties");
            if (resourceAsStream != null) {
                try {
                    properties.load(resourceAsStream);
                    str = properties.getProperty("version");
                } finally {
                }
            }
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
        } catch (Exception unused) {
        }
        if (str == null) {
            str = "development";
        }
        a = str;
    }
}
