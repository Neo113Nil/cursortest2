package defpackage;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class hef extends nef implements KProperty0 {
    @Override // defpackage.nh2
    public final KCallable computeReflected() {
        return duf.a.property0(this);
    }

    @Override // kotlin.reflect.KProperty0
    public final Object getDelegate() {
        return ((KProperty0) getReflected()).getDelegate();
    }

    @Override // kotlin.reflect.KProperty, kotlin.reflect.KProperty0
    public final KProperty0.Getter getGetter() {
        return ((KProperty0) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.KProperty0, kotlin.jvm.functions.Function0
    public final Object invoke() {
        return get();
    }
}
