package kotlin.jvm.internal;

import ag.c;
import ag.e;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class PropertyReference2Impl extends PropertyReference2 {
    public PropertyReference2Impl(e eVar, String str, String str2) {
        super(((ClassBasedDeclarationContainer) eVar).getJClass(), str, str2, !(eVar instanceof c) ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference2
    public Object get(Object obj, Object obj2) {
        getGetter();
        throw null;
    }

    public PropertyReference2Impl(Class cls, String str, String str2, int i5) {
        super(cls, str, str2, i5);
    }
}
