package jg;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.android.billingclient.api.a f18485a = new com.android.billingclient.api.a("CLOSED", 9);

    public static final Object a(u uVar, long j, Function2 function2) {
        while (true) {
            if (uVar.f18527c >= j && !uVar.d()) {
                return uVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f18488a;
            Object obj = atomicReferenceFieldUpdater.get(uVar);
            com.android.billingclient.api.a aVar = f18485a;
            if (obj == aVar) {
                return aVar;
            }
            u uVar2 = (u) ((c) obj);
            if (uVar2 == null) {
                uVar2 = (u) function2.invoke(Long.valueOf(uVar.f18527c + 1), uVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(uVar, null, uVar2)) {
                    if (atomicReferenceFieldUpdater.get(uVar) != null) {
                        break;
                    }
                }
                if (uVar.d()) {
                    uVar.e();
                }
            }
            uVar = uVar2;
        }
    }
}
