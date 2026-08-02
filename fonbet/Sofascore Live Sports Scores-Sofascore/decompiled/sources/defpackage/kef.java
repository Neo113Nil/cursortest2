package defpackage;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class kef extends jef {
    public kef(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(nh2.NO_RECEIVER, ((rv2) kDeclarationContainer).getJClass(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public kef(Class cls, String str, String str2, int i) {
        super(nh2.NO_RECEIVER, cls, str, str2, i);
    }
}
