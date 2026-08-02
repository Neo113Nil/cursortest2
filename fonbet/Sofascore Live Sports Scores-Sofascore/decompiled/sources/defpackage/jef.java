package defpackage;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class jef extends nef implements KProperty1 {
    @Override // defpackage.nh2
    public KCallable computeReflected() {
        return duf.a.property1(this);
    }

    @Override // kotlin.reflect.KProperty1
    public Object getDelegate(Object obj) {
        return ((KProperty1) getReflected()).getDelegate(obj);
    }

    @Override // kotlin.reflect.KProperty, kotlin.reflect.KProperty0
    public KProperty1.Getter getGetter() {
        return ((KProperty1) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.KProperty1, kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }
}
