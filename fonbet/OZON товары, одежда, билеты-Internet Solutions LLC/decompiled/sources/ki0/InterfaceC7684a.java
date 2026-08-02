package ki0;

import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.tracker.db.entities.PerfEventEntity;

/* renamed from: ki0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC7684a {

    /* renamed from: ki0.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C1179a {

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.db.daos.PerfEventDao$DefaultImpls", f = "PerfEventDao.kt", l = {DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER, DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "clearTableAndResetIds")
        /* renamed from: ki0.a$a$a, reason: collision with other inner class name */
        static final class C1180a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            InterfaceC7684a f71633d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f71634e;

            /* renamed from: f, reason: collision with root package name */
            int f71635f;

            C1180a() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f71634e = obj;
                this.f71635f |= LinearLayoutManager.INVALID_OFFSET;
                return C1179a.a(null, this);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        
            if (r5.d(r0) != r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
        
            if (r5.clear(r0) == r1) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object a(@NotNull InterfaceC7684a interfaceC7684a, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            C1180a c1180a;
            int i11;
            if (dVar instanceof C1180a) {
                c1180a = (C1180a) dVar;
                int i12 = c1180a.f71635f;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c1180a.f71635f = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c1180a.f71634e;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1180a.f71635f;
                    if (i11 != 0) {
                        s.b(obj);
                        c1180a.f71633d = interfaceC7684a;
                        c1180a.f71635f = 1;
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj);
                            return Unit.f71690a;
                        }
                        interfaceC7684a = c1180a.f71633d;
                        s.b(obj);
                    }
                    c1180a.f71633d = null;
                    c1180a.f71635f = 2;
                }
            }
            c1180a = new C1180a(dVar);
            Object obj2 = c1180a.f71634e;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c1180a.f71635f;
            if (i11 != 0) {
            }
            c1180a.f71633d = null;
            c1180a.f71635f = 2;
        }
    }

    Object a(@NotNull List<Long> list, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    Object b(@NotNull List<Long> list, @NotNull kotlin.coroutines.d<? super List<PerfEventEntity>> dVar);

    Object c(@NotNull ArrayList arrayList, @NotNull j jVar);

    Object clear(@NotNull kotlin.coroutines.d<? super Unit> dVar);

    Object d(@NotNull kotlin.coroutines.d<? super Unit> dVar);

    Object e(@NotNull kotlin.coroutines.jvm.internal.c cVar);

    Object f(@NotNull DateTime dateTime, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    Object getAllEvents(@NotNull kotlin.coroutines.d<? super List<PerfEventEntity>> dVar);
}
