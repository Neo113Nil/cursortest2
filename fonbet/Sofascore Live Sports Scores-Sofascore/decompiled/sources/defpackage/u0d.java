package defpackage;

import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class u0d extends v0d implements KMutableProperty2 {
    @Override // defpackage.nh2
    public final KCallable computeReflected() {
        return duf.a.mutableProperty2(this);
    }

    @Override // kotlin.reflect.KProperty2
    public final Object getDelegate(Object obj, Object obj2) {
        return ((KMutableProperty2) getReflected()).getDelegate(obj, obj2);
    }

    @Override // kotlin.reflect.KProperty, kotlin.reflect.KProperty0
    public final KProperty2.Getter getGetter() {
        return ((KMutableProperty2) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.KMutableProperty
    public final KMutableProperty2.Setter getSetter() {
        return ((KMutableProperty2) getReflected()).getSetter();
    }

    @Override // kotlin.reflect.KMutableProperty2, kotlin.reflect.KProperty2, kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }
}
