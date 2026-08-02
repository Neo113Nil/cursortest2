package gc0;

import Ae.C0;
import Sc.InterfaceC4008j;
import Sc.o;
import Sc.s;
import Vb0.b;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import h3.C6788a;
import hc0.C6910a;
import java.security.Signature;
import java.security.SignatureException;
import kc0.C7629C;
import kc0.InterfaceC7643a;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import r.o;
import ru.ozon.id.nativeauth.biometry.data.dto.BiometryEntryActionDTO;
import ru.ozon.id.nativeauth.data.models.b;
import td0.C9862b;
import xe.M;

/* renamed from: gc0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6709b implements M {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C6788a f64227a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f64228b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<vc0.d> f64229c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6910a> f64230d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Pc0.c> f64231e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Nc0.f> f64232f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C0 f64233g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Bc0.e f64234h;

    /* renamed from: gc0.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64235a;

        static {
            int[] iArr = new int[BiometryEntryActionDTO.ErrorDTO.b.values().length];
            try {
                iArr[BiometryEntryActionDTO.ErrorDTO.b.RELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BiometryEntryActionDTO.ErrorDTO.b.RESTRICTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f64235a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.biometry.BiometryAuthViewModelDelegate$onBiometryAuthSucceeded$1", f = "BiometryAuthViewModelDelegate.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH, 70}, m = "invokeSuspend")
    /* renamed from: gc0.b$b, reason: collision with other inner class name */
    static final class C1040b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f64236d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ b.InterfaceC2133b.C2135b f64238f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f64239g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1040b(b.InterfaceC2133b.C2135b c2135b, String str, kotlin.coroutines.d<? super C1040b> dVar) {
            super(2, dVar);
            this.f64238f = c2135b;
            this.f64239g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C6709b.this.new C1040b(this.f64238f, this.f64239g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1040b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
        
            if (gc0.C6709b.f(r4, (ru.ozon.id.nativeauth.biometry.data.dto.BiometryEntryActionDTO) r6, r5) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f64236d;
            C6709b c6709b = C6709b.this;
            if (i11 == 0) {
                s.b(obj);
                ((Nc0.f) c6709b.f64232f.getValue()).p();
                C6910a c6910a = (C6910a) c6709b.f64230d.getValue();
                String a11 = this.f64238f.a();
                this.f64236d = 1;
                obj = c6910a.e(a11, this.f64239g, this);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            this.f64236d = 2;
        }
    }

    public C6709b(@NotNull String screenId, @NotNull C7629C parent, @NotNull InterfaceC4008j keyStore, @NotNull InterfaceC4008j authBiometryRepository, @NotNull InterfaceC4008j router, @NotNull InterfaceC4008j mainScreenContainer, @NotNull C0 eventsSharedFlow, @NotNull Bc0.e exceptionHandler) {
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(keyStore, "keyStore");
        Intrinsics.checkNotNullParameter(authBiometryRepository, "authBiometryRepository");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(mainScreenContainer, "mainScreenContainer");
        Intrinsics.checkNotNullParameter(eventsSharedFlow, "eventsSharedFlow");
        Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
        this.f64227a = x0.a(parent);
        this.f64228b = screenId;
        this.f64229c = keyStore;
        this.f64230d = authBiometryRepository;
        this.f64231e = router;
        this.f64232f = mainScreenContainer;
        this.f64233g = eventsSharedFlow;
        this.f64234h = exceptionHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(C6709b c6709b, BiometryEntryActionDTO biometryEntryActionDTO, kotlin.coroutines.jvm.internal.c cVar) {
        C6710c c6710c;
        int i11;
        Object obj;
        BiometryEntryActionDTO.DataDTO.Biometry biometry;
        BiometryEntryActionDTO.ErrorDTO error;
        c6709b.getClass();
        if (cVar instanceof C6710c) {
            c6710c = (C6710c) cVar;
            int i12 = c6710c.f64244h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c6710c.f64244h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = c6710c.f64242f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c6710c.f64244h;
                if (i11 != 0) {
                    s.b(obj2);
                    c6710c.f64240d = c6709b;
                    c6710c.f64241e = biometryEntryActionDTO;
                    c6710c.f64244h = 1;
                    BiometryEntryActionDTO.DataDTO data = biometryEntryActionDTO.getData();
                    if (data == null || (biometry = data.getBiometry()) == null || !biometry.getClearDevicePublicKey()) {
                        obj = Unit.f71690a;
                    } else {
                        obj = c6709b.f64230d.getValue().g(c6710c);
                        if (obj != aVar) {
                            obj = Unit.f71690a;
                        }
                    }
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    biometryEntryActionDTO = c6710c.f64241e;
                    c6709b = c6710c.f64240d;
                    s.b(obj2);
                }
                error = biometryEntryActionDTO.getError();
                if (error == null) {
                    c6709b.getClass();
                    int i13 = a.f64235a[error.getType().ordinal()];
                    InterfaceC4008j<Nc0.f> interfaceC4008j = c6709b.f64232f;
                    if (i13 == 1) {
                        interfaceC4008j.getValue().m();
                        interfaceC4008j.getValue().y(error.getMessage());
                    } else {
                        if (i13 != 2) {
                            throw new o();
                        }
                        interfaceC4008j.getValue().hideLoader();
                        interfaceC4008j.getValue().y(error.getMessage());
                    }
                } else {
                    c6709b.f64231e.getValue().w(biometryEntryActionDTO);
                }
                return Unit.f71690a;
            }
        }
        c6710c = new C6710c(c6709b, cVar);
        Object obj22 = c6710c.f64242f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c6710c.f64244h;
        if (i11 != 0) {
        }
        error = biometryEntryActionDTO.getError();
        if (error == null) {
        }
        return Unit.f71690a;
    }

    public final void g(int i11) {
        if (i11 == 11 || i11 == 12 || i11 == 14) {
            td0.f.b(this, this.f64234h, new C6711d(this, null));
        }
    }

    @Override // xe.M
    @NotNull
    public final CoroutineContext getCoroutineContext() {
        return this.f64227a.getCoroutineContext();
    }

    public final void h(@NotNull b.InterfaceC2133b.C2135b biometry, @NotNull o.c cryptoObject) {
        String str;
        Intrinsics.checkNotNullParameter(biometry, "biometry");
        Intrinsics.checkNotNullParameter(cryptoObject, "cryptoObject");
        Signature d11 = cryptoObject.d();
        Bc0.e eVar = this.f64234h;
        if (d11 == null) {
            td0.f.b(this, eVar, new C6711d(this, null));
            return;
        }
        byte[] bytes = biometry.b().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        try {
            d11.update(bytes);
            byte[] sign = d11.sign();
            Intrinsics.f(sign);
            str = C9862b.a(0, sign);
        } catch (SignatureException e11) {
            b.a.c(Vb0.b.f28514a, e11);
            str = null;
        }
        if (str == null) {
            td0.f.b(this, eVar, new C6711d(this, null));
        } else {
            td0.f.b(this, eVar, new C1040b(biometry, str, null));
        }
    }

    public final boolean i(@NotNull b.InterfaceC2133b.C2135b biometry) {
        Intrinsics.checkNotNullParameter(biometry, "biometry");
        Signature c11 = this.f64229c.getValue().c();
        if (c11 != null) {
            td0.f.b(this, null, new f(this, new InterfaceC7643a.c(biometry, new o.c(c11)), null));
            return true;
        }
        td0.f.b(this, this.f64234h, new e(this, null));
        return false;
    }
}
