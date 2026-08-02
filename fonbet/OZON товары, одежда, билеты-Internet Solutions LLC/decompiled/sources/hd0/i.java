package hd0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import R2.InterfaceC3917k;
import Sc.InterfaceC4008j;
import Sc.r;
import Sc.s;
import W2.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.sso2.Sso2MobileConfigResponseDTO;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<InterfaceC3917k<W2.f>> f65358a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Moshi> f65359b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f65360c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f65361d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f65362e;

    static final class a extends AbstractC7737t implements Function0<JsonAdapter<Sso2MobileConfigResponseDTO>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final JsonAdapter<Sso2MobileConfigResponseDTO> invoke() {
            return ((Moshi) i.this.f65359b.getValue()).c(Sso2MobileConfigResponseDTO.class);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2MobileConfigRepository$debugDelete$2", f = "Sso2MobileConfigRepository.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<W2.b, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f65364d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = i.this.new b(dVar);
            bVar.f65364d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(W2.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            W2.b bVar = (W2.b) this.f65364d;
            i iVar = i.this;
            bVar.h(i.d(iVar));
            bVar.h(i.b(iVar));
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function0<f.a<String>> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f65366b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final f.a<String> invoke() {
            return W2.i.c("last_app_version");
        }
    }

    static final class d extends AbstractC7737t implements Function0<f.a<String>> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f65367b = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final f.a<String> invoke() {
            return W2.i.c("sso_mobile_config_last_response");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull InterfaceC4008j<? extends InterfaceC3917k<W2.f>> dataStore, @NotNull InterfaceC4008j<Moshi> moshi) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f65358a = dataStore;
        this.f65359b = moshi;
        this.f65360c = Sc.k.b(d.f65367b);
        this.f65361d = Sc.k.b(c.f65366b);
        this.f65362e = Sc.k.b(new a());
    }

    public static final JsonAdapter a(i iVar) {
        return (JsonAdapter) iVar.f65362e.getValue();
    }

    public static final f.a b(i iVar) {
        return (f.a) iVar.f65361d.getValue();
    }

    public static final f.a d(i iVar) {
        return (f.a) iVar.f65360c.getValue();
    }

    public final Object e(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object a11 = W2.j.a(this.f65358a.getValue(), new b(null), dVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:24|25))(3:26|27|(1:29)(1:30))|12|(1:14)(1:23)|15|16|(1:21)(2:18|19)))|33|6|7|(0)(0)|12|(0)(0)|15|16|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        r0 = Sc.r.INSTANCE;
        r6 = Sc.s.a(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0026, B:12:0x0051, B:14:0x0063, B:15:0x0073, B:27:0x0037), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        j jVar;
        int i11;
        Object a11;
        i iVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i12 = jVar.f65371g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                jVar.f65371g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = jVar.f65369e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = jVar.f65371g;
                if (i11 != 0) {
                    s.b(obj);
                    r.Companion companion = r.INSTANCE;
                    InterfaceC2395h<W2.f> data = this.f65358a.getValue().getData();
                    jVar.f65368d = this;
                    jVar.f65371g = 1;
                    obj = C2399j.u(data, jVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    iVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar = jVar.f65368d;
                    s.b(obj);
                }
                String str = (String) ((W2.f) obj).c((f.a) iVar.f65360c.getValue());
                a11 = str == null ? (Sso2MobileConfigResponseDTO) ((JsonAdapter) iVar.f65362e.getValue()).fromJson(str) : null;
                r.Companion companion2 = r.INSTANCE;
                if (a11 instanceof r.b) {
                    return a11;
                }
                return null;
            }
        }
        jVar = new j(this, cVar);
        Object obj2 = jVar.f65369e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = jVar.f65371g;
        if (i11 != 0) {
        }
        String str2 = (String) ((W2.f) obj2).c((f.a) iVar.f65360c.getValue());
        if (str2 == null) {
        }
        r.Companion companion22 = r.INSTANCE;
        if (a11 instanceof r.b) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24)(1:25))|12|13|(1:15)(1:17)))|28|6|7|(0)(0)|12|13|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        r0 = Sc.r.INSTANCE;
        r5 = Sc.s.a(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        k kVar;
        int i11;
        Serializable a11;
        i iVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i12 = kVar.f65375g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                kVar.f65375g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = kVar.f65373e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = kVar.f65375g;
                if (i11 != 0) {
                    s.b(obj);
                    r.Companion companion = r.INSTANCE;
                    InterfaceC2395h<W2.f> data = this.f65358a.getValue().getData();
                    kVar.f65372d = this;
                    kVar.f65375g = 1;
                    obj = C2399j.u(data, kVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    iVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar = kVar.f65372d;
                    s.b(obj);
                }
                a11 = (String) ((W2.f) obj).c((f.a) iVar.f65361d.getValue());
                r.Companion companion2 = r.INSTANCE;
                if (a11 instanceof r.b) {
                    return a11;
                }
                return null;
            }
        }
        kVar = new k(this, cVar);
        Object obj2 = kVar.f65373e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = kVar.f65375g;
        if (i11 != 0) {
        }
        a11 = (String) ((W2.f) obj2).c((f.a) iVar.f65361d.getValue());
        r.Companion companion22 = r.INSTANCE;
        if (a11 instanceof r.b) {
        }
    }

    public final Object h(@NotNull Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object a11 = W2.j.a(this.f65358a.getValue(), new l(this, sso2MobileConfigResponseDTO, null), cVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    public final Object i(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object a11 = W2.j.a(this.f65358a.getValue(), new m(this, str, null), cVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }
}
