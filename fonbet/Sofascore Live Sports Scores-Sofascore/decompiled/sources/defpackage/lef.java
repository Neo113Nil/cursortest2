package defpackage;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class lef extends nef implements KProperty2 {
    public lef(Class cls, String str, String str2) {
        super(nh2.NO_RECEIVER, cls, str, str2, 0);
    }

    @Override // defpackage.nh2
    public final KCallable computeReflected() {
        return duf.a.property2(this);
    }

    @Override // kotlin.reflect.KProperty2
    public final Object getDelegate(Object obj, Object obj2) {
        return ((KProperty2) getReflected()).getDelegate(obj, obj2);
    }

    @Override // kotlin.reflect.KProperty, kotlin.reflect.KProperty0
    public final KProperty2.Getter getGetter() {
        return ((KProperty2) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.KProperty2, kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    public lef() {
    }
}
