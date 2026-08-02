package gi;

import Zh.InterfaceC1900a;
import Zh.InterfaceC1901b;
import Zh.p;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;

/* loaded from: classes5.dex */
public abstract class e {
    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ InterfaceC1901b c(e eVar, KClass kClass, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i10 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        return eVar.b(kClass, list);
    }

    public abstract void a(i iVar);

    public abstract InterfaceC1901b b(KClass kClass, List list);

    public abstract boolean d();

    public abstract InterfaceC1900a e(KClass kClass, String str);

    public abstract p f(KClass kClass, Object obj);

    public e() {
    }
}
