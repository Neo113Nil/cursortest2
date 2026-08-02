package c4;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReference f3634a = new AtomicReference(null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [c4.o] */
    public static final o a(Context context) {
        v vVar;
        v vVar2;
        AtomicReference atomicReference = f3634a;
        Object obj = atomicReference.get();
        o oVar = obj instanceof o ? (o) obj : null;
        if (oVar != null) {
            return oVar;
        }
        v vVar3 = null;
        while (true) {
            Object obj2 = atomicReference.get();
            if (obj2 instanceof o) {
                vVar = vVar3;
                vVar2 = (o) obj2;
            } else {
                if (vVar3 == null) {
                    x xVar = obj2 instanceof x ? (x) obj2 : null;
                    if (xVar != null) {
                        vVar3 = xVar.a(context);
                    } else {
                        Object applicationContext = context.getApplicationContext();
                        x xVar2 = applicationContext instanceof x ? (x) applicationContext : null;
                        vVar3 = xVar2 != null ? xVar2.a(context) : a0.f3565a.a(context);
                    }
                }
                v vVar4 = vVar3;
                vVar = vVar4;
                vVar2 = vVar4;
            }
            while (!atomicReference.compareAndSet(obj2, vVar2)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            Intrinsics.checkNotNull(vVar2, "null cannot be cast to non-null type coil3.ImageLoader");
            return vVar2;
            vVar3 = vVar;
        }
    }
}
