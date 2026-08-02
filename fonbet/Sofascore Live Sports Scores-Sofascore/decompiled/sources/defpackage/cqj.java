package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public interface cqj {
    default String a(Object obj) {
        return (String) g().invoke(obj);
    }

    default List b(Object obj) {
        return (List) h().invoke(obj);
    }

    default boolean c(hub hubVar) {
        return true;
    }

    int d();

    Function1 g();

    Function1 h();
}
