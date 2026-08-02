package c1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class h {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0084 -> B:13:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0087 -> B:13:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(List list, t0 t0Var, mf.c cVar) {
        e eVar;
        int i5;
        List list2;
        Ref.ObjectRef objectRef;
        Iterator it;
        Throwable th2;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i10 = eVar.f3363d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f3363d = i10 - Integer.MIN_VALUE;
                Object obj = eVar.f3362c;
                lf.a aVar = lf.a.f20034a;
                i5 = eVar.f3363d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    ArrayList arrayList = new ArrayList();
                    g gVar = new g(list, arrayList, null);
                    eVar.f3360a = arrayList;
                    eVar.f3363d = 1;
                    if (((n) t0Var).a(gVar, eVar) == aVar) {
                        return aVar;
                    }
                    list2 = arrayList;
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = eVar.f3361b;
                        objectRef = (Ref.ObjectRef) eVar.f3360a;
                        try {
                            h8.b.B(obj);
                        } catch (Throwable th3) {
                            T t3 = objectRef.element;
                            if (t3 == 0) {
                                objectRef.element = th3;
                            } else {
                                Intrinsics.checkNotNull(t3);
                                gf.d.a((Throwable) t3, th3);
                            }
                        }
                        while (it.hasNext()) {
                            Function1 function1 = (Function1) it.next();
                            eVar.f3360a = objectRef;
                            eVar.f3361b = it;
                            eVar.f3363d = 2;
                            if (function1.invoke(eVar) == aVar) {
                                return aVar;
                            }
                        }
                        th2 = (Throwable) objectRef.element;
                        if (th2 == null) {
                            return Unit.f19194a;
                        }
                        throw th2;
                    }
                    list2 = (List) eVar.f3360a;
                    h8.b.B(obj);
                }
                objectRef = new Ref.ObjectRef();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th2 = (Throwable) objectRef.element;
                if (th2 == null) {
                }
            }
        }
        eVar = new e(cVar);
        Object obj2 = eVar.f3362c;
        lf.a aVar2 = lf.a.f20034a;
        i5 = eVar.f3363d;
        if (i5 != 0) {
        }
        objectRef = new Ref.ObjectRef();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th2 = (Throwable) objectRef.element;
        if (th2 == null) {
        }
    }
}
