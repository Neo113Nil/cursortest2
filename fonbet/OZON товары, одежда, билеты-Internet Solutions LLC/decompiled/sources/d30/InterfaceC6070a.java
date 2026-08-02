package d30;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import e30.C6288a;
import e30.C6290c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: d30.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6070a {

    /* renamed from: d30.a$a, reason: collision with other inner class name */
    public static final class C0941a {

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.analytic.db.dao.GraylogDbDao$DefaultImpls", f = "GraylogDbDao.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, 46}, m = "updateUser")
        /* renamed from: d30.a$a$a, reason: collision with other inner class name */
        static final class C0942a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            InterfaceC6070a f61094d;

            /* renamed from: e, reason: collision with root package name */
            C6290c f61095e;

            /* renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f61096f;

            /* renamed from: g, reason: collision with root package name */
            int f61097g;

            C0942a() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f61096f = obj;
                this.f61097g |= LinearLayoutManager.INVALID_OFFSET;
                return C0941a.a(null, null, this);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
        
            if (r5.h(r6, r0) != r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
        
            if (r7 == r1) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object a(@NotNull InterfaceC6070a interfaceC6070a, @NotNull C6290c c6290c, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            C0942a c0942a;
            int i11;
            C6290c c6290c2;
            if (dVar instanceof C0942a) {
                c0942a = (C0942a) dVar;
                int i12 = c0942a.f61097g;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0942a.f61097g = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c0942a.f61096f;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c0942a.f61097g;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        c0942a.f61094d = interfaceC6070a;
                        c0942a.f61095e = c6290c;
                        c0942a.f61097g = 1;
                        obj = interfaceC6070a.b(c0942a);
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Sc.s.b(obj);
                            return Unit.f71690a;
                        }
                        c6290c = c0942a.f61095e;
                        interfaceC6070a = c0942a.f61094d;
                        Sc.s.b(obj);
                    }
                    c6290c2 = (C6290c) obj;
                    if (c6290c2 == null && Intrinsics.d(c6290c2.b(), c6290c.b())) {
                        return Unit.f71690a;
                    }
                    c0942a.f61094d = null;
                    c0942a.f61095e = null;
                    c0942a.f61097g = 2;
                }
            }
            c0942a = new C0942a(dVar);
            Object obj2 = c0942a.f61096f;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c0942a.f61097g;
            if (i11 != 0) {
            }
            c6290c2 = (C6290c) obj2;
            if (c6290c2 == null) {
            }
            c0942a.f61094d = null;
            c0942a.f61095e = null;
            c0942a.f61097g = 2;
        }
    }

    Object a(@NotNull kotlin.coroutines.jvm.internal.c cVar);

    Object b(@NotNull kotlin.coroutines.jvm.internal.c cVar);

    Object c(@NotNull C6290c c6290c, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    Object d(@NotNull ArrayList arrayList, @NotNull kotlin.coroutines.d dVar);

    Object e(int i11, @NotNull kotlin.coroutines.d<? super List<C6288a>> dVar);

    Object f(int i11, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    Object g(@NotNull kotlin.coroutines.d<? super List<C6288a>> dVar);

    Object h(@NotNull C6290c c6290c, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    Object i(@NotNull C6288a c6288a, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}
