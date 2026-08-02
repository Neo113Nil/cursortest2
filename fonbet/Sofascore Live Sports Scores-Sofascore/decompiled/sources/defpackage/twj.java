package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface twj {
    Object a();

    Object b();

    default boolean c(Object obj, Object obj2) {
        return obj.equals(b()) && obj2.equals(a());
    }
}
