package kotlin.jvm.internal;

import ag.b;
import ag.n;
import ag.s;
import ag.t;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class PropertyReference2 extends PropertyReference implements t {
    public PropertyReference2() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public b computeReflected() {
        return Reflection.property2(this);
    }

    public abstract /* synthetic */ Object get(Object obj, Object obj2);

    @Override // ag.t
    public Object getDelegate(Object obj, Object obj2) {
        return ((t) getReflected()).getDelegate(obj, obj2);
    }

    @Override // kotlin.jvm.internal.PropertyReference
    public /* bridge */ /* synthetic */ n getGetter() {
        getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    public PropertyReference2(Class cls, String str, String str2, int i5) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i5);
    }

    @Override // kotlin.jvm.internal.PropertyReference
    public s getGetter() {
        ((t) getReflected()).getGetter();
        return null;
    }
}
