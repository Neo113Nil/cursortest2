package kotlin.jvm.internal;

import ag.c;
import ag.e;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i5, e eVar, String str, String str2) {
        super(i5, CallableReference.NO_RECEIVER, ((ClassBasedDeclarationContainer) eVar).getJClass(), str, str2, !(eVar instanceof c) ? 1 : 0);
    }

    public FunctionReferenceImpl(int i5, Class cls, String str, String str2, int i10) {
        super(i5, CallableReference.NO_RECEIVER, cls, str, str2, i10);
    }

    public FunctionReferenceImpl(int i5, Object obj, Class cls, String str, String str2, int i10) {
        super(i5, obj, cls, str, str2, i10);
    }
}
