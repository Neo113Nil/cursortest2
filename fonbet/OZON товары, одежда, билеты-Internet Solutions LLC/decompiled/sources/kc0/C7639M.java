package kc0;

import Ae.C2406m0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.EntryDTO;

/* renamed from: kc0.M, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7639M implements InterfaceC2395h<String> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2406m0 f71296a;

    /* renamed from: kc0.M$a */
    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f71297a;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsViewModel$special$$inlined$mapNotNull$1$2", f = "EntryCredentialsViewModel.kt", l = {225}, m = "emit")
        /* renamed from: kc0.M$a$a, reason: collision with other inner class name */
        public static final class C1166a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f71298d;

            /* renamed from: e, reason: collision with root package name */
            int f71299e;

            public C1166a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f71298d = obj;
                this.f71299e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i) {
            this.f71297a = interfaceC2397i;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C1166a c1166a;
            int i11;
            if (dVar instanceof C1166a) {
                c1166a = (C1166a) dVar;
                int i12 = c1166a.f71299e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c1166a.f71299e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c1166a.f71298d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1166a.f71299e;
                    if (i11 != 0) {
                        Sc.s.b(obj2);
                        EntryDTO.InputDTO e11 = ((ru.ozon.id.nativeauth.data.models.b) obj).e();
                        String focusTrackAction = e11 != null ? e11.getFocusTrackAction() : null;
                        if (focusTrackAction != null) {
                            c1166a.f71299e = 1;
                            if (this.f71297a.emit(focusTrackAction, c1166a) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj2);
                    }
                    return Unit.f71690a;
                }
            }
            c1166a = new C1166a(dVar);
            Object obj22 = c1166a.f71298d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c1166a.f71299e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public C7639M(C2406m0 c2406m0) {
        this.f71296a = c2406m0;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super String> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f71296a.collect(new a(interfaceC2397i), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
