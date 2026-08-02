package k2;

import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g0 implements hg.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f18665a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hg.h f18666b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String[] f18667c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f18668d;

    public g0(Ref.ObjectRef objectRef, hg.h hVar, String[] strArr, int[] iArr) {
        this.f18665a = objectRef;
        this.f18666b = hVar;
        this.f18667c = strArr;
        this.f18668d = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r6.d(r15, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
    
        if (r6.d(r15, r0) == r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // hg.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int[] iArr, Continuation continuation) {
        f0 f0Var;
        int i5;
        T t3;
        if (continuation instanceof f0) {
            f0Var = (f0) continuation;
            int i10 = f0Var.f18663d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                f0Var.f18663d = i10 - Integer.MIN_VALUE;
                Object obj = f0Var.f18661b;
                lf.a aVar = lf.a.f20034a;
                i5 = f0Var.f18663d;
                Ref.ObjectRef objectRef = this.f18665a;
                if (i5 != 0) {
                    h8.b.B(obj);
                    T t5 = objectRef.element;
                    String[] strArr = this.f18667c;
                    hg.h hVar = this.f18666b;
                    if (t5 == 0) {
                        Set B = kotlin.collections.p.B(strArr);
                        f0Var.f18660a = iArr;
                        f0Var.f18663d = 1;
                        t3 = iArr;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        int length = strArr.length;
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < length) {
                            String str = strArr[i11];
                            int i13 = i12 + 1;
                            T t10 = objectRef.element;
                            if (t10 == 0) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            int i14 = this.f18668d[i12];
                            if (((int[]) t10)[i14] != iArr[i14]) {
                                arrayList.add(str);
                            }
                            i11++;
                            i12 = i13;
                        }
                        t3 = iArr;
                        if (!arrayList.isEmpty()) {
                            Set Z = CollectionsKt.Z(arrayList);
                            f0Var.f18660a = iArr;
                            f0Var.f18663d = 2;
                            t3 = iArr;
                        }
                    }
                } else {
                    if (i5 != 1 && i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int[] iArr2 = f0Var.f18660a;
                    h8.b.B(obj);
                    t3 = iArr2;
                }
                objectRef.element = t3;
                return Unit.f19194a;
            }
        }
        f0Var = new f0(this, continuation);
        Object obj2 = f0Var.f18661b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = f0Var.f18663d;
        Ref.ObjectRef objectRef2 = this.f18665a;
        if (i5 != 0) {
        }
        objectRef2.element = t3;
        return Unit.f19194a;
    }
}
