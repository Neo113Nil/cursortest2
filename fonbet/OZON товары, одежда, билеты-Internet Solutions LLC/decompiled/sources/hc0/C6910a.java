package hc0;

import Sc.InterfaceC4008j;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.biometry.data.api.AuthBiometryApi;
import ru.ozon.id.nativeauth.biometry.data.dto.BiometryEntryActionDTO;
import ru.ozon.id.nativeauth.biometry.data.dto.SaveAuthBiometrySettingsRequestDTO;
import wc0.InterfaceC10500a;
import xe.C10720e0;
import xe.C10727i;
import xe.I;
import xe.M;

/* renamed from: hc0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6910a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<AuthBiometryApi> f65280a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<vc0.c> f65281b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<vc0.d> f65282c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<InterfaceC10500a> f65283d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final I f65284e;

    @e(c = "ru.ozon.id.nativeauth.biometry.data.AuthBiometryRepository$auth$2", f = "AuthBiometryRepository.kt", l = {55, 60}, m = "invokeSuspend")
    /* renamed from: hc0.a$a, reason: collision with other inner class name */
    static final class C1064a extends j implements Function2<M, kotlin.coroutines.d<? super BiometryEntryActionDTO>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f65285d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f65287f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f65288g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1064a(String str, String str2, kotlin.coroutines.d<? super C1064a> dVar) {
            super(2, dVar);
            this.f65287f = str;
            this.f65288g = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C6910a.this.new C1064a(this.f65287f, this.f65288g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super BiometryEntryActionDTO> dVar) {
            return ((C1064a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
        
            if (r7 == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f65285d;
            C6910a c6910a = C6910a.this;
            if (i11 == 0) {
                s.b(obj);
                vc0.c cVar = (vc0.c) c6910a.f65281b.getValue();
                this.f65285d = 1;
                obj = cVar.b(this);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return obj;
                }
                s.b(obj);
            }
            Map<String, ? extends Object> j11 = U.j(new Pair("signature", this.f65287f), new Pair("deviceId", (String) obj));
            InterfaceC10500a interfaceC10500a = (InterfaceC10500a) c6910a.f65283d.getValue();
            this.f65285d = 2;
            Object h11 = interfaceC10500a.h(this.f65288g, j11, this);
            return h11 == aVar ? aVar : h11;
        }
    }

    @e(c = "ru.ozon.id.nativeauth.biometry.data.AuthBiometryRepository$getUniqueApplicationId$1", f = "AuthBiometryRepository.kt", l = {52}, m = "invokeSuspend")
    /* renamed from: hc0.a$b */
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super String>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f65289d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C6910a.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super String> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f65289d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            vc0.c cVar = (vc0.c) C6910a.this.f65281b.getValue();
            this.f65289d = 1;
            Object b11 = cVar.b(this);
            return b11 == aVar ? aVar : b11;
        }
    }

    public C6910a() {
        throw null;
    }

    public C6910a(InterfaceC4008j api, InterfaceC4008j appInfoRepository, InterfaceC4008j keyStore, InterfaceC4008j actionAuthRepository) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        He.b ioDispatcher = He.b.f10879b;
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(appInfoRepository, "appInfoRepository");
        Intrinsics.checkNotNullParameter(keyStore, "keyStore");
        Intrinsics.checkNotNullParameter(actionAuthRepository, "actionAuthRepository");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f65280a = api;
        this.f65281b = appInfoRepository;
        this.f65282c = keyStore;
        this.f65283d = actionAuthRepository;
        this.f65284e = ioDispatcher;
    }

    public final Object e(@NotNull String str, @NotNull String str2, @NotNull kotlin.coroutines.d<? super BiometryEntryActionDTO> dVar) {
        return C10727i.f(this.f65284e, new C1064a(str2, str, null), dVar);
    }

    @NotNull
    public final String f() {
        return (String) C10727i.d(g.f71771a, new b(null));
    }

    public final Object g(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object f7 = C10727i.f(this.f65284e, new C6911b(this, null), cVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    public final Object h(@NotNull String str, @NotNull String str2, @NotNull j jVar) {
        Object f7 = C10727i.f(this.f65284e, new C6912c(this, str, str2, null), jVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (r7.saveAuthBiometricSettings(r4, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C6913d c6913d;
        int i11;
        C6910a c6910a;
        if (cVar instanceof C6913d) {
            c6913d = (C6913d) cVar;
            int i12 = c6913d.f65301h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c6913d.f65301h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c6913d.f65299f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c6913d.f65301h;
                if (i11 != 0) {
                    s.b(obj);
                    vc0.c value = this.f65281b.getValue();
                    c6913d.f65297d = this;
                    c6913d.f65298e = str;
                    c6913d.f65301h = 1;
                    obj = value.b(c6913d);
                    if (obj != aVar) {
                        c6910a = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                str = c6913d.f65298e;
                c6910a = c6913d.f65297d;
                s.b(obj);
                SaveAuthBiometrySettingsRequestDTO saveAuthBiometrySettingsRequestDTO = new SaveAuthBiometrySettingsRequestDTO((String) obj, false, str);
                AuthBiometryApi value2 = c6910a.f65280a.getValue();
                c6913d.f65297d = null;
                c6913d.f65298e = null;
                c6913d.f65301h = 2;
            }
        }
        c6913d = new C6913d(this, cVar);
        Object obj2 = c6913d.f65299f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c6913d.f65301h;
        if (i11 != 0) {
        }
        SaveAuthBiometrySettingsRequestDTO saveAuthBiometrySettingsRequestDTO2 = new SaveAuthBiometrySettingsRequestDTO((String) obj2, false, str);
        AuthBiometryApi value22 = c6910a.f65280a.getValue();
        c6913d.f65297d = null;
        c6913d.f65298e = null;
        c6913d.f65301h = 2;
    }
}
