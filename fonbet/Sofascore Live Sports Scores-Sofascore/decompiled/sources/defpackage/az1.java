package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class az1 {
    public static final pm0 a;
    public static final pm0 b;
    public static final sx2 c;

    static {
        KType kType;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(qcf.class);
        KType kType2 = null;
        try {
            kType = duf.b(qcf.class);
        } catch (Throwable unused) {
            kType = null;
        }
        a = new pm0("UploadProgressListenerAttributeKey", new h5k(orCreateKotlinClass, kType));
        KClass orCreateKotlinClass2 = duf.a.getOrCreateKotlinClass(qcf.class);
        try {
            kType2 = duf.b(qcf.class);
        } catch (Throwable unused2) {
        }
        b = new pm0("DownloadProgressListenerAttributeKey", new h5k(orCreateKotlinClass2, kType2));
        c = new sx2("BodyProgress", (Function0) new t63(19), (Function1) new sx1(26));
    }
}
