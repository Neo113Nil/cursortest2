package hg;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class f0 implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f10680b;

    public /* synthetic */ f0(Ref.ObjectRef objectRef, int i5) {
        this.f10679a = i5;
        this.f10680b = objectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hg.h
    public final Object d(Object obj, Continuation continuation) {
        switch (this.f10679a) {
            case 0:
                this.f10680b.element = obj;
                throw new ig.a(this);
            default:
                this.f10680b.element = obj;
                throw new ig.a(this);
        }
    }
}
