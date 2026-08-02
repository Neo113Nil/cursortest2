package nc0;

import De.C2862e;
import Sc.InterfaceC4008j;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import dc0.C6176v;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qc0.c;
import ru.ozon.id.nativeauth.crossApp.data.AccountSignatureData;
import ru.ozon.id.nativeauth.crossApp.migration.data.model.PublicKeyBindMobileCredentials;
import tc0.EnumC9809a;
import xe.C10727i;
import xe.M;

/* renamed from: nc0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8492c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final qc0.b f76745a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final sc0.b f76746b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final qc0.c f76747c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Fb0.f f76748d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6176v> f76749e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C2862e f76750f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.crossApp.BindCrossAppPublicKeyUseCase$executeAsync$1", f = "BindCrossAppPublicKeyUseCase.kt", l = {52}, m = "invokeSuspend")
    /* renamed from: nc0.c$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f76751d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C8492c.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f76751d;
            if (i11 == 0) {
                s.b(obj);
                this.f76751d = 1;
                if (C8492c.this.a(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public C8492c(@NotNull qc0.b crossAppChallengeKeyRepository, @NotNull sc0.b keyBindRepository, @NotNull qc0.c crossAppChallengeKeySigner, @NotNull Fb0.f ozonIdConfig, @NotNull InterfaceC4008j<C6176v> currentUserDataInteractor) {
        Intrinsics.checkNotNullParameter(crossAppChallengeKeyRepository, "crossAppChallengeKeyRepository");
        Intrinsics.checkNotNullParameter(keyBindRepository, "keyBindRepository");
        Intrinsics.checkNotNullParameter(crossAppChallengeKeySigner, "crossAppChallengeKeySigner");
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        Intrinsics.checkNotNullParameter(currentUserDataInteractor, "currentUserDataInteractor");
        this.f76745a = crossAppChallengeKeyRepository;
        this.f76746b = keyBindRepository;
        this.f76747c = crossAppChallengeKeySigner;
        this.f76748d = ozonIdConfig;
        this.f76749e = currentUserDataInteractor;
        this.f76750f = td0.f.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C8491b c8491b;
        Object obj;
        int i11;
        c.a a11;
        C8492c c8492c;
        String str;
        String str2;
        String str3;
        long j11;
        qc0.b bVar;
        Long l11;
        if (cVar instanceof C8491b) {
            c8491b = (C8491b) cVar;
            int i12 = c8491b.f76744k;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c8491b.f76744k = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj = c8491b.f76742i;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c8491b.f76744k;
                if (i11 != 0) {
                    s.b(obj);
                    a11 = this.f76747c.a();
                    List a02 = C7714v.a0(new PublicKeyBindMobileCredentials(a11.c(), null, null, null, null, 30, null));
                    EnumC9809a enumC9809a = EnumC9809a.BIND;
                    c8491b.f76737d = this;
                    c8491b.f76738e = a11;
                    c8491b.f76744k = 1;
                    obj = this.f76746b.a(a02, enumC9809a, c8491b);
                    if (obj != aVar) {
                        c8492c = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j12 = c8491b.f76741h;
                    qc0.b bVar2 = c8491b.f76740g;
                    String str4 = c8491b.f76739f;
                    String str5 = (String) c8491b.f76738e;
                    String str6 = (String) c8491b.f76737d;
                    s.b(obj);
                    j11 = j12;
                    bVar = bVar2;
                    str3 = str5;
                    str = str6;
                    str2 = str4;
                    l11 = (Long) obj;
                    if (l11 != null) {
                        return Unit.f71690a;
                    }
                    bVar.e(C7714v.a0(new AccountSignatureData(str, str3, l11.longValue(), str2, j11)));
                    return Unit.f71690a;
                }
                a11 = (c.a) c8491b.f76738e;
                c8492c = (C8492c) c8491b.f76737d;
                s.b(obj);
                if (((List) obj).contains(a11.c())) {
                    qc0.b bVar3 = c8492c.f76745a;
                    String c11 = a11.c();
                    String b11 = a11.b();
                    long a12 = a11.a();
                    String a13 = c8492c.f76748d.getAppName().a();
                    C6176v value = c8492c.f76749e.getValue();
                    c8491b.f76737d = c11;
                    c8491b.f76738e = b11;
                    c8491b.f76739f = a13;
                    c8491b.f76740g = bVar3;
                    c8491b.f76741h = a12;
                    c8491b.f76744k = 2;
                    Object c12 = value.c(c8491b);
                    if (c12 != aVar) {
                        str = c11;
                        str2 = a13;
                        str3 = b11;
                        j11 = a12;
                        bVar = bVar3;
                        obj = c12;
                        l11 = (Long) obj;
                        if (l11 != null) {
                        }
                    }
                    return aVar;
                }
                return Unit.f71690a;
            }
        }
        c8491b = new C8491b(this, cVar);
        obj = c8491b.f76742i;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c8491b.f76744k;
        if (i11 != 0) {
        }
        if (((List) obj).contains(a11.c())) {
        }
        return Unit.f71690a;
    }

    public final void b() {
        C10727i.c(this.f76750f, null, null, new a(null), 3);
    }
}
