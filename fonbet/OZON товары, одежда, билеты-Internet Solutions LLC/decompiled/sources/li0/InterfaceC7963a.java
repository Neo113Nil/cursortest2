package li0;

import Ae.InterfaceC2395h;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.fintech.ui.input.CounterView;
import ru.ozon.tracker.db.entities.DbEvent;
import ru.ozon.tracker.db.entities.EventStatus;

/* renamed from: li0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC7963a {

    /* renamed from: li0.a$a, reason: collision with other inner class name */
    public static final class C1241a {

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.db.daos.v2.EventDaoV2$DefaultImpls", f = "EventDaoV2.kt", l = {69, 70}, m = "getAllNotPendingEvents")
        /* renamed from: li0.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C1242a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            InterfaceC7963a f73330d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f73331e;

            /* renamed from: f, reason: collision with root package name */
            int f73332f;

            C1242a(kotlin.coroutines.d<? super C1242a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f73331e = obj;
                this.f73332f |= LinearLayoutManager.INVALID_OFFSET;
                return C1241a.b(null, this);
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.db.daos.v2.EventDaoV2$DefaultImpls", f = "EventDaoV2.kt", l = {63, UserVerificationMethods.USER_VERIFY_EYEPRINT}, m = "getBatch")
        /* renamed from: li0.a$a$b */
        static final class b extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            InterfaceC7963a f73333d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f73334e;

            /* renamed from: f, reason: collision with root package name */
            int f73335f;

            b() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f73334e = obj;
                this.f73335f |= LinearLayoutManager.INVALID_OFFSET;
                return C1241a.c(null, 0, this);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
        
            if (r6 == r1) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object b(@NotNull InterfaceC7963a interfaceC7963a, @NotNull kotlin.coroutines.d<? super List<DbEvent>> dVar) {
            C1242a c1242a;
            int i11;
            if (dVar instanceof C1242a) {
                c1242a = (C1242a) dVar;
                int i12 = c1242a.f73332f;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c1242a.f73332f = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c1242a.f73331e;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1242a.f73332f;
                    if (i11 != 0) {
                        s.b(obj);
                        c1242a.f73330d = interfaceC7963a;
                        c1242a.f73332f = 1;
                        obj = interfaceC7963a.a(CounterView.COUNTER_MAX_DEFAULT, c1242a);
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj);
                            return obj;
                        }
                        interfaceC7963a = c1242a.f73330d;
                        s.b(obj);
                    }
                    c1242a.f73330d = null;
                    c1242a.f73332f = 2;
                    Object d11 = d(interfaceC7963a, (List) obj, c1242a);
                    return d11 != aVar ? aVar : d11;
                }
            }
            c1242a = new C1242a(dVar);
            Object obj2 = c1242a.f73331e;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c1242a.f73332f;
            if (i11 != 0) {
            }
            c1242a.f73330d = null;
            c1242a.f73332f = 2;
            Object d112 = d(interfaceC7963a, (List) obj2, c1242a);
            if (d112 != aVar2) {
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
        
            if (r7 == r1) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0053 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object c(@NotNull InterfaceC7963a interfaceC7963a, int i11, @NotNull kotlin.coroutines.d<? super List<DbEvent>> dVar) {
            b bVar;
            int i12;
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i13 = bVar.f73335f;
                if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    bVar.f73335f = i13 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = bVar.f73334e;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i12 = bVar.f73335f;
                    if (i12 != 0) {
                        s.b(obj);
                        bVar.f73333d = interfaceC7963a;
                        bVar.f73335f = 1;
                        obj = interfaceC7963a.a(i11, bVar);
                    } else {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj);
                            return obj;
                        }
                        interfaceC7963a = bVar.f73333d;
                        s.b(obj);
                    }
                    bVar.f73333d = null;
                    bVar.f73335f = 2;
                    Object d11 = d(interfaceC7963a, (List) obj, bVar);
                    return d11 != aVar ? aVar : d11;
                }
            }
            bVar = new b(dVar);
            Object obj2 = bVar.f73334e;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i12 = bVar.f73335f;
            if (i12 != 0) {
            }
            bVar.f73333d = null;
            bVar.f73335f = 2;
            Object d112 = d(interfaceC7963a, (List) obj2, bVar);
            if (d112 != aVar2) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object d(InterfaceC7963a interfaceC7963a, List list, kotlin.coroutines.jvm.internal.c cVar) {
            C7964b c7964b;
            int i11;
            if (cVar instanceof C7964b) {
                c7964b = (C7964b) cVar;
                int i12 = c7964b.f73338f;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c7964b.f73338f = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c7964b.f73337e;
                    Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c7964b.f73338f;
                    if (i11 == 0) {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ArrayList arrayList = c7964b.f73336d;
                        s.b(obj);
                        return arrayList;
                    }
                    s.b(obj);
                    List list2 = list;
                    ArrayList arrayList2 = new ArrayList(C7714v.z(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(DbEvent.copy$default((DbEvent) it.next(), null, null, null, null, null, EventStatus.PENDING, null, 95, null));
                    }
                    c7964b.f73336d = arrayList2;
                    c7964b.f73338f = 1;
                    return interfaceC7963a.c(arrayList2, c7964b) == obj2 ? obj2 : arrayList2;
                }
            }
            c7964b = new C7964b(cVar);
            Object obj3 = c7964b.f73337e;
            Object obj22 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c7964b.f73338f;
            if (i11 == 0) {
            }
        }
    }

    Object a(int i11, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    Object b(@NotNull kotlin.coroutines.d<? super List<DbEvent>> dVar);

    Object c(@NotNull List list, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    Object clear(@NotNull kotlin.coroutines.d<? super Unit> dVar);

    Object clearUnderDate(@NotNull DateTime dateTime, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    Object deleteEvents(@NotNull List<DbEvent> list, @NotNull kotlin.coroutines.d<? super Integer> dVar);

    Object getBatch(int i11, @NotNull kotlin.coroutines.d<? super List<DbEvent>> dVar);

    Object getCountNotPendingEvents(@NotNull kotlin.coroutines.d<? super Long> dVar);

    @NotNull
    InterfaceC2395h<String> onChangedEvents();

    Object resetPendingStatus(@NotNull kotlin.coroutines.d<? super Unit> dVar);

    Object saveEvent(@NotNull DbEvent dbEvent, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}
