package defpackage;

import java.util.Objects;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class t0d extends s0d {
    public t0d(KClass kClass, String str, String str2) {
        super(nh2.NO_RECEIVER, ((rv2) kClass).getJClass(), str, str2, !Objects.nonNull(kClass) ? 1 : 0);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public void set(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }

    public t0d(Class cls, String str, String str2, int i) {
        super(nh2.NO_RECEIVER, cls, str, str2, i);
    }
}
