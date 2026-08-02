package X5;

import android.graphics.Canvas;
import android.util.Size;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* loaded from: classes2.dex */
public final class e implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public static final e f13590a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final c f13591b = new c();

    @Override // java.lang.AutoCloseable
    public void close() {
        k().close();
        Iterator it = d().iterator();
        while (it.hasNext()) {
            androidx.core.content.res.e.a((d) it.next());
        }
    }

    public List d() {
        return CollectionsKt.emptyList();
    }

    public c k() {
        return f13591b;
    }

    public Object r(View view, Canvas canvas, Size size, Continuation continuation) {
        Object obj;
        Iterator it = d().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((d) obj).u0(view)) {
                break;
            }
        }
        d dVar = (d) obj;
        if (dVar == null) {
            dVar = k();
        }
        Object r12 = dVar.r1(view, canvas, size, continuation);
        return r12 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? r12 : Unit.INSTANCE;
    }
}
