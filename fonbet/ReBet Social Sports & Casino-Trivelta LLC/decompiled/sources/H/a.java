package H;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: H.a$a, reason: collision with other inner class name */
    public static final class C0093a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f4258d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0093a(List list) {
            super(1);
            this.f4258d = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m6invoke(obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m6invoke(Object obj) {
            List list = this.f4258d;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((Function1) list.get(i10)).invoke(obj);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(int i10, f fVar) {
        super(i10, fVar, null, r2);
        List list;
        Function1 function1;
        synchronized (h.e()) {
            list = h.f4293i;
            function1 = (Function1) CollectionsKt.singleOrNull(list);
            function1 = function1 == null ? new C0093a(list) : function1;
        }
    }
}
