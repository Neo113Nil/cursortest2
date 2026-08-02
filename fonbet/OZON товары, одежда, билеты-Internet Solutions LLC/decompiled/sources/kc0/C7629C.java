package kc0;

import Ae.C0;
import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2417s0;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.w0;
import Ae.x0;
import B0.C2454a;
import Bc0.a;
import De.C2862e;
import Rc0.b;
import Sc.InterfaceC4008j;
import Sc.r;
import Vb0.b;
import android.app.Application;
import android.net.Uri;
import android.os.Parcelable;
import android.util.Patterns;
import androidx.lifecycle.C5418g0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.m;
import cd0.C5806a;
import com.vk.id.VKID;
import com.vk.id.auth.AuthCodeData;
import gc0.C6709b;
import h3.C6788a;
import id0.C7050a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import jc0.C7344g;
import kc0.InterfaceC7641O;
import kc0.InterfaceC7643a;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import mc0.C8127a;
import org.jetbrains.annotations.NotNull;
import r.o;
import ru.ozon.id.common.disclaimer.DisclaimerDTO;
import ru.ozon.id.core.FeatureFlagConf;
import ru.ozon.id.nativeauth.credentials.countryCode.PhoneCodeCountrySelectDTO;
import ru.ozon.id.nativeauth.crossApp.data.AccountSignatureData;
import ru.ozon.id.nativeauth.crossApp.dto.CrossAppSharedStoreKeyDto;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;
import ru.ozon.id.nativeauth.data.models.LoginErrorActionDTO;
import ru.ozon.id.nativeauth.data.models.OtpDTO;
import ru.ozon.id.nativeauth.data.models.b;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import wc0.InterfaceC10500a;
import xc0.C10702a;
import xe.C10720e0;
import xe.C10727i;
import zc0.C11087b;
import ze.EnumC11113a;

/* renamed from: kc0.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7629C extends C5806a {

    /* renamed from: y0, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f71211y0 = {I1.w.c(C7629C.class, "uiState", "getUiState()Lru/ozon/id/nativeauth/data/models/EntryVO;", 0), I1.w.c(C7629C.class, "antibotErrorAction", "getAntibotErrorAction()Ljava/lang/String;", 0)};

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private final Function1<C7629C, C6709b> f71212A;

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private final Bc0.e f71213B;

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final C0 f71214C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final Function1<FeatureFlagConf, Unit> f71215D;

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private final Application f71216E;

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C7344g> f71217F;

    /* renamed from: G, reason: collision with root package name */
    @NotNull
    private final qc0.b f71218G;

    /* renamed from: H, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f71219H;

    /* renamed from: I, reason: collision with root package name */
    @NotNull
    private final C2862e f71220I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f71221J;

    /* renamed from: K, reason: collision with root package name */
    @NotNull
    private final C2406m0 f71222K;

    /* renamed from: L, reason: collision with root package name */
    @NotNull
    private final td0.m f71223L;

    /* renamed from: M, reason: collision with root package name */
    @NotNull
    private final td0.m f71224M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f71225N;

    /* renamed from: O, reason: collision with root package name */
    @NotNull
    private final Object f71226O;

    /* renamed from: P, reason: collision with root package name */
    @NotNull
    private final x0<CharSequence> f71227P;

    /* renamed from: Q, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<CharSequence> f71228Q;

    /* renamed from: R, reason: collision with root package name */
    @NotNull
    private final C2417s0 f71229R;

    /* renamed from: S, reason: collision with root package name */
    @NotNull
    private final C0 f71230S;

    /* renamed from: X, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<Boolean> f71231X;

    /* renamed from: Y, reason: collision with root package name */
    @NotNull
    private final x0<InterfaceC7641O> f71232Y;

    /* renamed from: Z, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<InterfaceC7641O> f71233Z;

    /* renamed from: r0, reason: collision with root package name */
    @NotNull
    private final x0<OtpDTO.AgreementSheet> f71234r0;

    /* renamed from: s0, reason: collision with root package name */
    private final Pattern f71235s0;

    /* renamed from: t0, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f71236t0;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final String f71237u;

    /* renamed from: u0, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f71238u0;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10702a> f71239v;

    /* renamed from: v0, reason: collision with root package name */
    @NotNull
    private final T f71240v0;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Pc0.c> f71241w;

    /* renamed from: w0, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.h<Unit> f71242w0;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final C5418g0 f71243x;

    /* renamed from: x0, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f71244x0;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final C11087b f71245y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<cc0.e> f71246z;

    /* renamed from: kc0.C$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71247a;

        static {
            int[] iArr = new int[EntryDTO.InputDTO.b.values().length];
            try {
                iArr[EntryDTO.InputDTO.b.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EntryDTO.InputDTO.b.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EntryDTO.InputDTO.b.PASSWORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f71247a = iArr;
        }
    }

    /* renamed from: kc0.C$b */
    static final class b extends AbstractC7737t implements Function1<InterfaceC7641O, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC7641O interfaceC7641O) {
            InterfaceC7641O it = interfaceC7641O;
            Intrinsics.checkNotNullParameter(it, "it");
            C7629C.this.f71232Y.tryEmit(it);
            return Unit.f71690a;
        }
    }

    /* renamed from: kc0.C$c */
    /* synthetic */ class c extends C7735q implements Function1<FastEntryActionDTO, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(FastEntryActionDTO fastEntryActionDTO) {
            FastEntryActionDTO p02 = fastEntryActionDTO;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((C7629C) this.receiver).y1(p02);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsViewModel$onBiometryAuthError$1", f = "EntryCredentialsViewModel.kt", l = {681}, m = "invokeSuspend")
    /* renamed from: kc0.C$d */
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f71249d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C7629C.this.new d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f71249d;
            if (i11 == 0) {
                Sc.s.b(obj);
                w0 w0Var = C7629C.this.f71214C;
                InterfaceC7643a.e eVar = InterfaceC7643a.e.f71319a;
                this.f71249d = 1;
                if (((C0) w0Var).emit(eVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsViewModel$onCloseButtonClicked$1", f = "EntryCredentialsViewModel.kt", l = {257}, m = "invokeSuspend")
    /* renamed from: kc0.C$e */
    static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f71251d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C7629C.this.new e(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f71251d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C0 G02 = C7629C.this.G0();
                b.a aVar2 = b.a.f24975a;
                this.f71251d = 1;
                if (G02.emit(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsViewModel$onCompleteButtonClicked$1", f = "EntryCredentialsViewModel.kt", l = {m.e.DEFAULT_SWIPE_ANIMATION_DURATION, 251}, m = "invokeSuspend")
    /* renamed from: kc0.C$f */
    static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f71253d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f71255f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Tc.d f71256g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Tc.d dVar, kotlin.coroutines.d dVar2) {
            super(2, dVar2);
            this.f71255f = str;
            this.f71256g = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C7629C.this.new f(this.f71255f, this.f71256g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        
            if (r4.q1(r5.f71255f, r5.f71256g, r5) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f71253d;
            C7629C c7629c = C7629C.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                C7629C.Y0(c7629c).p();
                C0 G02 = c7629c.G0();
                b.a aVar2 = b.a.f24975a;
                this.f71253d = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                Sc.s.b(obj);
            }
            this.f71253d = 2;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsViewModel$onCountrySelectorClicked$1", f = "EntryCredentialsViewModel.kt", l = {618, 621, 623, 627}, m = "invokeSuspend")
    /* renamed from: kc0.C$g */
    static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        Exception f71257d;

        /* renamed from: e, reason: collision with root package name */
        int f71258e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC7643a.d f71260g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ EntryDTO.InputDTO.CountrySelect f71261h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ C0 f71262i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC7643a.d dVar, EntryDTO.InputDTO.CountrySelect countrySelect, C0 c02, kotlin.coroutines.d dVar2) {
            super(2, dVar2);
            this.f71260g = dVar;
            this.f71261h = countrySelect;
            this.f71262i = c02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            EntryDTO.InputDTO.CountrySelect countrySelect = this.f71261h;
            C0 c02 = this.f71262i;
            return C7629C.this.new g(this.f71260g, countrySelect, c02, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
        
            if (r2.emit(r1, r8) != r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
        
            if (((Ae.C0) r9).emit(r8.f71260g, r8) == r0) goto L32;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f71258e;
            C0 c02 = this.f71262i;
            C7629C c7629c = C7629C.this;
            try {
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C7629C.f1(c7629c);
                    w0 w0Var = c7629c.f71214C;
                    this.f71258e = 1;
                } else if (i11 == 1) {
                    Sc.s.b(obj);
                } else {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            Sc.s.b(obj);
                            return Unit.f71690a;
                        }
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Exception exc = this.f71257d;
                        Sc.s.b(obj);
                        throw exc;
                    }
                    Sc.s.b(obj);
                    InterfaceC7643a.d.AbstractC1168a.b bVar = new InterfaceC7643a.d.AbstractC1168a.b((PhoneCodeCountrySelectDTO) obj);
                    this.f71258e = 3;
                }
                C10702a c10702a = (C10702a) c7629c.f71239v.getValue();
                String link = this.f71261h.getLink();
                this.f71258e = 2;
                obj = c10702a.u(link, this);
            } catch (CancellationException e11) {
                throw e11;
            } catch (Exception e12) {
                InterfaceC7643a.d.AbstractC1168a.C1169a c1169a = InterfaceC7643a.d.AbstractC1168a.C1169a.f71317a;
                this.f71257d = e12;
                this.f71258e = 4;
                if (c02.emit(c1169a, this) != aVar) {
                    throw e12;
                }
            }
            if (obj == aVar) {
                return aVar;
            }
            InterfaceC7643a.d.AbstractC1168a.b bVar2 = new InterfaceC7643a.d.AbstractC1168a.b((PhoneCodeCountrySelectDTO) obj);
            this.f71258e = 3;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsViewModel$onCredentialsChange$1", f = "EntryCredentialsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: kc0.C$h */
    static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ CharSequence f71264e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(CharSequence charSequence, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f71264e = charSequence;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C7629C.this.new h(this.f71264e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            C7629C c7629c = C7629C.this;
            CharSequence Q02 = C7629C.Q0(c7629c, this.f71264e);
            c7629c.f71232Y.tryEmit(InterfaceC7641O.c.f71307a);
            c7629c.f71227P.tryEmit(Q02);
            c7629c.f71243x.g(Q02, "credentials_state_key");
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsViewModel$onDisclaimerButtonClicked$1", f = "EntryCredentialsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: kc0.C$i */
    static final class i extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ DisclaimerDTO.DisclaimerButtonDTO f71265d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C7629C f71266e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(DisclaimerDTO.DisclaimerButtonDTO disclaimerButtonDTO, C7629C c7629c, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f71265d = disclaimerButtonDTO;
            this.f71266e = c7629c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new i(this.f71265d, this.f71266e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            AtomActionDTO action = this.f71265d.getAction();
            String link = action != null ? action.getLink() : null;
            if (link == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C7629C c7629c = this.f71266e;
            ((Pc0.c) c7629c.f71241w.getValue()).v(link);
            C7629C.f1(c7629c);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsViewModel$onErrorButtonClicked$1", f = "EntryCredentialsViewModel.kt", l = {651}, m = "invokeSuspend")
    /* renamed from: kc0.C$j */
    static final class j extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f71267d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f71269f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f71269f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C7629C.this.new j(this.f71269f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f71267d;
            C7629C c7629c = C7629C.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                C10702a c10702a = (C10702a) c7629c.f71239v.getValue();
                this.f71267d = 1;
                obj = c10702a.g(this.f71269f, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            C7629C.f1(c7629c);
            ((Pc0.c) c7629c.f71241w.getValue()).v(((LoginErrorActionDTO) obj).getDeeplink());
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsViewModel$onHintButtonClicked$1", f = "EntryCredentialsViewModel.kt", l = {592}, m = "invokeSuspend")
    /* renamed from: kc0.C$k */
    static final class k extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f71270d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ b.InterfaceC2133b f71272f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(b.InterfaceC2133b interfaceC2133b, kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            this.f71272f = interfaceC2133b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C7629C.this.new k(this.f71272f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f71270d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C7629C c7629c = C7629C.this;
                C7629C.f1(c7629c);
                b.InterfaceC2133b interfaceC2133b = this.f71272f;
                if (interfaceC2133b instanceof b.InterfaceC2133b.d) {
                    ((Pc0.c) c7629c.f71241w.getValue()).C(((b.InterfaceC2133b.d) interfaceC2133b).a());
                } else if (interfaceC2133b instanceof b.InterfaceC2133b.c) {
                    b.InterfaceC2133b.c cVar = (b.InterfaceC2133b.c) interfaceC2133b;
                    String b11 = cVar.b();
                    if (b11 != null) {
                        C7629C.c1(c7629c).b(b11);
                    }
                    ((Pc0.c) c7629c.f71241w.getValue()).v(cVar.a());
                } else if (interfaceC2133b instanceof b.InterfaceC2133b.a) {
                    C7629C.Y0(c7629c).p();
                    b.InterfaceC2133b.a aVar2 = (b.InterfaceC2133b.a) interfaceC2133b;
                    String a11 = aVar2.a();
                    Map<String, Object> b12 = aVar2.b();
                    this.f71270d = 1;
                    if (c7629c.q1(a11, b12, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (!(interfaceC2133b instanceof b.InterfaceC2133b.C2135b)) {
                        throw new Sc.o();
                    }
                    ru.ozon.id.nativeauth.data.models.b v12 = c7629c.v1();
                    if (v12 != null) {
                        c7629c.R1(v12);
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsViewModel$onSubmitButtonClick$1", f = "EntryCredentialsViewModel.kt", l = {399}, m = "invokeSuspend")
    /* renamed from: kc0.C$l */
    static final class l extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f71273d;

        l(kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C7629C.this.new l(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((l) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f71273d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C7629C c7629c = C7629C.this;
                String obj2 = c7629c.f71227P.getValue().toString();
                InterfaceC7641O p12 = C7629C.p1(c7629c, obj2);
                if (p12.equals(InterfaceC7641O.c.f71307a)) {
                    C7629C.Y0(c7629c).p();
                    C7629C.f1(c7629c);
                    this.f71273d = 1;
                    if (C7629C.Q1(c7629c, obj2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    c7629c.f71232Y.tryEmit(p12);
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsViewModel$onVKIdOneTapAuthCode$1", f = "EntryCredentialsViewModel.kt", l = {424}, m = "invokeSuspend")
    /* renamed from: kc0.C$m */
    static final class m extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f71275d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AuthCodeData f71277f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(AuthCodeData authCodeData, kotlin.coroutines.d<? super m> dVar) {
            super(2, dVar);
            this.f71277f = authCodeData;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C7629C.this.new m(this.f71277f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((m) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f71275d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C7629C c7629c = C7629C.this;
                C7629C.Y0(c7629c).p();
                this.f71275d = 1;
                if (c7629c.z0(this.f71277f, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7629C(@NotNull String screenId, @NotNull InterfaceC4008j authRepository, @NotNull InterfaceC4008j authRouter, @NotNull InterfaceC4008j mainScreenContainer, @NotNull C5418g0 savedStateHandle, @NotNull C11087b mapper, @NotNull InterfaceC4008j phoneHelper, @NotNull Function1 provideBiometryAuthDelegate, @NotNull Bc0.e notificationExceptionHandler, @NotNull C0 eventsSharedFlow, @NotNull Function1 initMobileConf, @NotNull Application application, @NotNull InterfaceC4008j otpResultListenerHolder, @NotNull InterfaceC4008j trackingRepository, @NotNull Fb0.f ozonIdConfig, @NotNull Function1 provideFastEntryActionHandler, @NotNull InterfaceC4008j authActionRepository, @NotNull a.n fullScreenExceptionHandler, @NotNull qc0.c crossAppChallengeKeySigner, @NotNull qc0.d crossAppChallengeRepository, @NotNull qc0.b crossAppChallengeKeyRepository) {
        super(savedStateHandle, provideFastEntryActionHandler, xe.N.g(td0.f.a(), fullScreenExceptionHandler), ozonIdConfig, crossAppChallengeKeySigner, crossAppChallengeRepository, crossAppChallengeKeyRepository, authRouter, authRepository, mainScreenContainer, authActionRepository, eventsSharedFlow);
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Intrinsics.checkNotNullParameter(authRepository, "authRepository");
        Intrinsics.checkNotNullParameter(authRouter, "authRouter");
        Intrinsics.checkNotNullParameter(mainScreenContainer, "mainScreenContainer");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(phoneHelper, "phoneHelper");
        Intrinsics.checkNotNullParameter(provideBiometryAuthDelegate, "provideBiometryAuthDelegate");
        Intrinsics.checkNotNullParameter(notificationExceptionHandler, "notificationExceptionHandler");
        Intrinsics.checkNotNullParameter(eventsSharedFlow, "eventsSharedFlow");
        Intrinsics.checkNotNullParameter(initMobileConf, "initMobileConf");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(otpResultListenerHolder, "otpResultListenerHolder");
        Intrinsics.checkNotNullParameter(trackingRepository, "trackingRepository");
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        Intrinsics.checkNotNullParameter(provideFastEntryActionHandler, "provideFastEntryActionHandler");
        Intrinsics.checkNotNullParameter(authActionRepository, "authActionRepository");
        Intrinsics.checkNotNullParameter(fullScreenExceptionHandler, "fullScreenExceptionHandler");
        Intrinsics.checkNotNullParameter(crossAppChallengeKeySigner, "crossAppChallengeKeySigner");
        Intrinsics.checkNotNullParameter(crossAppChallengeRepository, "crossAppChallengeRepository");
        Intrinsics.checkNotNullParameter(crossAppChallengeKeyRepository, "crossAppChallengeKeyRepository");
        this.f71237u = screenId;
        this.f71239v = authRepository;
        this.f71241w = authRouter;
        this.f71243x = savedStateHandle;
        this.f71245y = mapper;
        this.f71246z = phoneHelper;
        this.f71212A = provideBiometryAuthDelegate;
        this.f71213B = notificationExceptionHandler;
        this.f71214C = eventsSharedFlow;
        this.f71215D = initMobileConf;
        this.f71216E = application;
        this.f71217F = otpResultListenerHolder;
        this.f71218G = crossAppChallengeKeyRepository;
        this.f71219H = mainScreenContainer;
        C6788a a11 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2862e g10 = xe.N.g(xe.N.g(a11, He.b.f10879b), fullScreenExceptionHandler);
        this.f71220I = g10;
        C2406m0 c2406m0 = new C2406m0(savedStateHandle.d("vo_saved_state_key"));
        this.f71222K = c2406m0;
        this.f71223L = td0.n.a(savedStateHandle, "vo_saved_state_key");
        this.f71224M = td0.n.a(savedStateHandle, "antibot_error_state_key");
        this.f71226O = Sc.k.a(Sc.n.NONE, C7638L.f71295b);
        x0<CharSequence> a12 = O0.a("");
        this.f71227P = a12;
        this.f71228Q = C2399j.b(a12);
        this.f71229R = new C2417s0(a12, c2406m0, new C7640N(3, null));
        C0 b11 = E0.b(1, 0, EnumC11113a.DROP_OLDEST, 2);
        b11.tryEmit(Boolean.FALSE);
        this.f71230S = b11;
        this.f71231X = C2399j.a(b11);
        x0<InterfaceC7641O> a13 = O0.a(InterfaceC7641O.c.f71307a);
        this.f71232Y = a13;
        this.f71233Z = C2399j.b(a13);
        this.f71234r0 = O0.a(null);
        this.f71235s0 = Patterns.EMAIL_ADDRESS;
        C7635I c7635i = new C7635I(this);
        this.f71236t0 = c7635i;
        this.f71238u0 = trackingRepository;
        this.f71240v0 = new T(androidx.lifecycle.x0.a(this), new C7639M(c2406m0), trackingRepository);
        C7634H c7634h = new C7634H(1, this, C7629C.class, "onOtpResponseToken", "onOtpResponseToken(Ljava/lang/String;)V", 0);
        this.f71242w0 = c7634h;
        td0.f.b(androidx.lifecycle.x0.a(this), null, new C7628B(this, null));
        ((C7344g) otpResultListenerHolder.getValue()).a(c7634h);
        ru.ozon.id.nativeauth.data.models.b bVar = (ru.ozon.id.nativeauth.data.models.b) savedStateHandle.c("vo_saved_state_key");
        CharSequence charSequence = (CharSequence) savedStateHandle.c("credentials_state_key");
        ((Nc0.f) mainScreenContainer.getValue()).b(c7635i);
        if (bVar == null) {
            td0.f.b(g10, null, new C7632F(this, null));
        } else {
            J1(bVar, charSequence);
        }
        this.f71244x0 = Sc.k.b(new C7630D(this));
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [Sc.j, java.lang.Object] */
    private final void J1(ru.ozon.id.nativeauth.data.models.b bVar, CharSequence charSequence) {
        EntryDTO.InputDTO.CountrySelect countrySelect;
        EntryDTO.InputDTO e11 = bVar.e();
        this.f71225N = (e11 != null ? e11.getType() : null) == EntryDTO.InputDTO.b.PHONE;
        if (e11 != null && (countrySelect = e11.getCountrySelect()) != null) {
            ((C8127a) this.f71226O.getValue()).e(countrySelect.getPhoneCode(), countrySelect.getPhoneMask());
        }
        this.f71223L.setValue(this, f71211y0[0], bVar);
        E1(charSequence);
        ((Nc0.f) this.f71219H.getValue()).j();
        ru.ozon.id.nativeauth.data.models.b v12 = v1();
        this.f71230S.tryEmit(Boolean.valueOf((v12 != null ? v12.e() : null) != null));
    }

    private final boolean O1() {
        EntryDTO.FeatureFlags c11;
        ru.ozon.id.nativeauth.data.models.b v12 = v1();
        return (((v12 == null || (c11 = v12.c()) == null) ? false : Intrinsics.d(c11.isCrossAppDisabled(), Boolean.TRUE)) || !Uri.parse(this.f71241w.getValue().o(this.f71237u).b()).getBooleanQueryParameter("isFirstAuthScreenQueryParam", false) || this.f71221J) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object P1(String str, String str2, kotlin.coroutines.jvm.internal.j jVar) {
        EntryDTO.SubmitButtonDTO g10;
        ru.ozon.id.nativeauth.data.models.b v12 = v1();
        if (v12 != null && (g10 = v12.g()) != null) {
            List<AccountSignatureData> c11 = this.f71218G.c();
            ArrayList arrayList = new ArrayList(C7714v.z(c11, 10));
            for (AccountSignatureData accountSignatureData : c11) {
                arrayList.add(new CrossAppSharedStoreKeyDto(accountSignatureData.getPublicKey(), accountSignatureData.getAppName()));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, Object> data = g10.getData();
            if (data != null) {
                linkedHashMap.putAll(data);
            }
            EntryDTO.InputDTO e11 = v12.e();
            if (e11 != null) {
                if (e11.getType() == EntryDTO.InputDTO.b.PHONE) {
                    if (e11.getCountrySelect() != null) {
                        str = U7.d.e(e11.getCountrySelect().getPhoneCode(), str);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    int length = str.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        char charAt = str.charAt(i11);
                        if (Character.isDigit(charAt)) {
                            sb2.append(charAt);
                        }
                    }
                    str = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
                }
                Map b11 = C2454a.b(e11.getName(), str);
                if (b11 != null) {
                    linkedHashMap.putAll(b11);
                }
            }
            if (!arrayList.isEmpty()) {
                linkedHashMap.put("sharedStoreKeys", arrayList);
            }
            if (str2 != null) {
                linkedHashMap.put("otpResponseToken", str2);
            }
            Object q12 = q1(g10.getAction(), linkedHashMap, jVar);
            return q12 == Wc.a.COROUTINE_SUSPENDED ? q12 : Unit.f71690a;
        }
        return Unit.f71690a;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [Sc.j, java.lang.Object] */
    public static final CharSequence Q0(C7629C c7629c, CharSequence charSequence) {
        EntryDTO.InputDTO e11;
        if (!c7629c.f71225N) {
            return charSequence == null ? "" : charSequence;
        }
        ru.ozon.id.nativeauth.data.models.b v12 = c7629c.v1();
        return ((v12 == null || (e11 = v12.e()) == null) ? null : e11.getCountrySelect()) != null ? ((C8127a) c7629c.f71226O.getValue()).b(charSequence) : c7629c.f71246z.getValue().a(charSequence);
    }

    static /* synthetic */ Object Q1(C7629C c7629c, String str, kotlin.coroutines.d dVar) {
        return c7629c.P1(str, null, (kotlin.coroutines.jvm.internal.j) dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R1(ru.ozon.id.nativeauth.data.models.b bVar) {
        Parcelable parcelable;
        Object obj;
        List<b.InterfaceC2133b> d11 = bVar.d();
        if (d11 != null) {
            Iterator<T> it = d11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((b.InterfaceC2133b) obj) instanceof b.InterfaceC2133b.C2135b) {
                    break;
                }
            }
            parcelable = (b.InterfaceC2133b) obj;
        } else {
            parcelable = null;
        }
        b.InterfaceC2133b.C2135b c2135b = parcelable instanceof b.InterfaceC2133b.C2135b ? (b.InterfaceC2133b.C2135b) parcelable : null;
        if (c2135b == null) {
            return false;
        }
        if (((C6709b) this.f71244x0.getValue()).i(c2135b)) {
            return true;
        }
        List<b.InterfaceC2133b> d12 = bVar.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : d12) {
            if (!(((b.InterfaceC2133b) obj2) instanceof b.InterfaceC2133b.C2135b)) {
                arrayList.add(obj2);
            }
        }
        this.f71223L.setValue(this, f71211y0[0], ru.ozon.id.nativeauth.data.models.b.a(bVar, arrayList));
        return false;
    }

    public static final String U0(C7629C c7629c) {
        Uri parse = Uri.parse(c7629c.f71241w.getValue().o(c7629c.f71237u).b());
        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        for (String str : queryParameterNames) {
            if (!Intrinsics.d(str, "isFirstAuthScreenQueryParam")) {
                clearQuery.appendQueryParameter(str, parse.getQueryParameter(str));
            }
        }
        String uri = clearQuery.build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "let(...)");
        return uri;
    }

    public static final Nc0.f Y0(C7629C c7629c) {
        return (Nc0.f) c7629c.f71219H.getValue();
    }

    public static final C7050a c1(C7629C c7629c) {
        return (C7050a) c7629c.f71238u0.getValue();
    }

    public static final void f1(C7629C c7629c) {
        c7629c.f71230S.tryEmit(Boolean.FALSE);
    }

    public static final void g1(C7629C c7629c) {
        c7629c.getClass();
        td0.f.b(c7629c.f71220I, null, new C7632F(c7629c, null));
    }

    public static final void i1(C7629C c7629c, OtpDTO.AgreementSheet agreementSheet) {
        c7629c.getClass();
        c7629c.O0(Vc0.a.b(agreementSheet));
        c7629c.f71234r0.setValue(agreementSheet);
    }

    public static final void j1(C7629C c7629c, String str) {
        C10727i.c(c7629c.f71220I, null, null, new C7633G(c7629c, str, null), 3);
    }

    public static final void k1(C7629C c7629c, ru.ozon.id.nativeauth.data.models.b bVar) {
        c7629c.getClass();
        EntryDTO.InputDTO e11 = bVar.e();
        String value = e11 != null ? e11.getValue() : null;
        b.d f7 = bVar.f();
        List<b.c> a11 = f7 != null ? f7.a() : null;
        if (a11 != null && !a11.isEmpty()) {
            try {
                r.Companion companion = Sc.r.INSTANCE;
                VKID.Companion.init$default(VKID.INSTANCE, c7629c.f71216E, null, 2, null);
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                r.Companion companion2 = Sc.r.INSTANCE;
                Sc.s.a(th2);
            }
        }
        c7629c.J1(bVar, value);
        if (c7629c.R1(bVar) || !c7629c.O1()) {
            return;
        }
        td0.f.b(androidx.lifecycle.x0.a(c7629c), null, new C7636J(c7629c, null));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Sc.j, java.lang.Object] */
    public static final void l1(C7629C c7629c) {
        c7629c.getClass();
        c7629c.f71223L.setValue(c7629c, f71211y0[0], null);
        ((C8127a) c7629c.f71226O.getValue()).e("", "");
        c7629c.f71225N = false;
        c7629c.f71227P.tryEmit("");
        c7629c.f71230S.tryEmit(Boolean.FALSE);
        c7629c.f71232Y.tryEmit(InterfaceC7641O.c.f71307a);
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [Sc.j, java.lang.Object] */
    public static final InterfaceC7641O p1(C7629C c7629c, String str) {
        EntryDTO.InputDTO e11;
        boolean z11;
        ru.ozon.id.nativeauth.data.models.b v12 = c7629c.v1();
        InterfaceC7641O.c cVar = InterfaceC7641O.c.f71307a;
        if (v12 != null && (e11 = v12.e()) != null) {
            EntryDTO.TranslationLexemes.ValidationLexemes j11 = v12.j();
            int i11 = a.f71247a[e11.getType().ordinal()];
            if (i11 == 1) {
                if (e11.getCountrySelect() != null) {
                    z11 = ((C8127a) c7629c.f71226O.getValue()).d(str);
                } else {
                    try {
                        z11 = c7629c.f71246z.getValue().b("+" + kotlin.text.h.S(str, "+"));
                    } catch (Throwable th2) {
                        if (!(th2 instanceof M8.d)) {
                            b.a.c(Vb0.b.f28514a, th2);
                        }
                        z11 = false;
                    }
                }
                return z11 ? cVar : new InterfaceC7641O.a(j11.isInvalid().getPhone(), c7629c.s1());
            }
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new Sc.o();
                }
            } else if (!c7629c.f71235s0.matcher(str).matches()) {
                return new InterfaceC7641O.a(j11.isInvalid().getEmail(), c7629c.s1());
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q1(String str, Map map, kotlin.coroutines.jvm.internal.c cVar) {
        C7631E c7631e;
        int i11;
        C7629C c7629c;
        if (cVar instanceof C7631E) {
            c7631e = (C7631E) cVar;
            int i12 = c7631e.f71282g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c7631e.f71282g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c7631e.f71280e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c7631e.f71282g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    C10702a value = this.f71239v.getValue();
                    c7631e.f71279d = this;
                    c7631e.f71282g = 1;
                    obj = InterfaceC10500a.C2252a.a(value, str, map, c7631e, 8);
                    if (obj == aVar) {
                        return aVar;
                    }
                    c7629c = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c7629c = c7631e.f71279d;
                    Sc.s.b(obj);
                }
                c7629c.y1((FastEntryActionDTO) obj);
                return Unit.f71690a;
            }
        }
        c7631e = new C7631E(this, cVar);
        Object obj2 = c7631e.f71280e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c7631e.f71282g;
        if (i11 != 0) {
        }
        c7629c.y1((FastEntryActionDTO) obj2);
        return Unit.f71690a;
    }

    private final EntryDTO.InputDTO.ErrorButton s1() {
        EntryDTO.InputDTO e11;
        ru.ozon.id.nativeauth.data.models.b v12 = v1();
        if (v12 == null || (e11 = v12.e()) == null) {
            return null;
        }
        return e11.getErrorButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ru.ozon.id.nativeauth.data.models.b v1() {
        return (ru.ozon.id.nativeauth.data.models.b) this.f71223L.getValue(this, f71211y0[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y1(FastEntryActionDTO fastEntryActionDTO) {
        if (fastEntryActionDTO.getError() != null) {
            H0(fastEntryActionDTO.getError(), s1(), new b());
            return;
        }
        this.f71243x.e("antibot_error_state_key");
        FastEntryActionDTO.SharedStoreKeysInfo sharedStoreKeysInfo = fastEntryActionDTO.getSharedStoreKeysInfo();
        if ((sharedStoreKeysInfo != null ? sharedStoreKeysInfo.getUnauthorizedKeys() : null) != null) {
            this.f71218G.f(fastEntryActionDTO.getSharedStoreKeysInfo().getUnauthorizedKeys());
        }
        J0(fastEntryActionDTO, new c(1, this, C7629C.class, "onAction", "onAction(Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO;)V", 0));
    }

    public final void A1(@NotNull b.InterfaceC2133b.C2135b biometry, @NotNull o.c cryptoObject) {
        Intrinsics.checkNotNullParameter(biometry, "biometry");
        Intrinsics.checkNotNullParameter(cryptoObject, "cryptoObject");
        ((C6709b) this.f71244x0.getValue()).h(biometry, cryptoObject);
    }

    public final void B1(@NotNull String analyticTag, @NotNull FastEntryActionDTO authActionDTO, boolean z11) {
        Intrinsics.checkNotNullParameter(analyticTag, "analyticTag");
        Intrinsics.checkNotNullParameter(authActionDTO, "authActionDTO");
        D0().l(analyticTag, authActionDTO, z11);
    }

    public final void C1(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        ((Nc0.f) this.f71219H.getValue()).p();
        this.f71241w.getValue().C(link);
    }

    public final void D1() {
        EntryDTO.InputDTO e11;
        EntryDTO.InputDTO.CountrySelect countrySelect;
        ru.ozon.id.nativeauth.data.models.b v12 = v1();
        if (v12 == null || (e11 = v12.e()) == null || (countrySelect = e11.getCountrySelect()) == null) {
            return;
        }
        C0 b11 = E0.b(0, 0, null, 7);
        td0.f.b(this.f71220I, null, new g(new InterfaceC7643a.d(b11), countrySelect, b11, null));
    }

    public final void E1(CharSequence charSequence) {
        td0.f.b(xe.N.g(this.f71220I, this.f71213B), null, new h(charSequence, null));
    }

    public final void F1(@NotNull DisclaimerDTO.DisclaimerButtonDTO button) {
        Intrinsics.checkNotNullParameter(button, "button");
        td0.f.b(xe.N.g(this.f71220I, this.f71213B), null, new i(button, this, null));
    }

    public final void G1() {
        String action;
        EntryDTO.InputDTO.ErrorButton s12;
        kotlin.reflect.m<?>[] mVarArr = f71211y0;
        kotlin.reflect.m<?> mVar = mVarArr[1];
        td0.m mVar2 = this.f71224M;
        String str = (String) mVar2.getValue(this, mVar);
        if (str == null || str.length() == 0) {
            EntryDTO.InputDTO.ErrorButton s13 = s1();
            String action2 = s13 != null ? s13.getAction() : null;
            action = (action2 == null || action2.length() == 0 || (s12 = s1()) == null) ? null : s12.getAction();
        } else {
            action = (String) mVar2.getValue(this, mVarArr[1]);
        }
        if (action == null) {
            return;
        }
        td0.f.b(xe.N.g(this.f71220I, this.f71213B), null, new j(action, null));
    }

    public final void H1(@NotNull b.InterfaceC2133b hintButton) {
        Intrinsics.checkNotNullParameter(hintButton, "hintButton");
        td0.f.b(xe.N.g(this.f71220I, this.f71213B), null, new k(hintButton, null));
    }

    public final void I1(@NotNull String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f71240v0.a(action);
    }

    public final void K1(@NotNull C7645c lifecycleOwner, @NotNull b.c button) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(button, "button");
        this.f71230S.tryEmit(Boolean.FALSE);
        td0.f.b(xe.N.g(this.f71220I, this.f71213B), null, new C7637K(button, this, lifecycleOwner, null));
    }

    public final void L1() {
        td0.f.b(xe.N.g(this.f71220I, this.f71213B), null, new l(null));
    }

    public final void M1(@NotNull AuthCodeData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        td0.f.b(this.f71220I, null, new m(data, null));
    }

    public final void N1() {
        ru.ozon.id.nativeauth.data.models.b v12 = v1();
        this.f71230S.tryEmit(Boolean.valueOf((v12 != null ? v12.e() : null) != null));
    }

    @Override // cd0.C5806a, Rc0.s
    public final void f0(boolean z11) {
        OtpDTO.AgreementSheet value;
        Rc0.t A02 = A0();
        if (A02 == null || (value = this.f71234r0.getValue()) == null) {
            return;
        }
        O0(Vc0.a.a(value, A02.c(), Boolean.valueOf(z11)));
    }

    @Override // cd0.C5806a, Rc0.s
    public final void g0() {
        td0.f.b(xe.N.g(this.f71220I, this.f71213B), null, new e(null));
    }

    @Override // cd0.C5806a, Rc0.s
    public final void h0() {
        OtpDTO.AgreementSheet.CompleteButton completeButton;
        Rc0.t A02 = A0();
        if (A02 != null && A02.b()) {
            OtpDTO.AgreementSheet value = this.f71234r0.getValue();
            String action = (value == null || (completeButton = value.getCompleteButton()) == null) ? null : completeButton.getAction();
            if (action == null) {
                ((Nc0.f) this.f71219H.getValue()).v(new Throwable("complete button action is null"));
                return;
            }
            String obj = this.f71227P.getValue().toString();
            StringBuilder sb2 = new StringBuilder();
            int length = obj.length();
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = obj.charAt(i11);
                if (Character.isDigit(charAt)) {
                    sb2.append(charAt);
                }
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            Tc.d builder = new Tc.d();
            Boolean a11 = A02.a();
            if (a11 != null) {
                builder.put("isAdsAllowed", a11);
            }
            Boolean c11 = A02.c();
            if (c11 != null) {
                builder.put("isTermsConfirmed", c11);
            }
            builder.put("phone", sb3);
            Intrinsics.checkNotNullParameter(builder, "builder");
            td0.f.b(this.f71220I, null, new f(action, builder.u(), null));
        }
    }

    @Override // cd0.C5806a, Rc0.s
    public final void i0(boolean z11) {
        OtpDTO.AgreementSheet value;
        Rc0.t A02 = A0();
        if (A02 == null || (value = this.f71234r0.getValue()) == null) {
            return;
        }
        O0(Vc0.a.a(value, Boolean.valueOf(z11), A02.a()));
    }

    @Override // cd0.C5806a, Rc0.s
    public final void j0(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        super.j0(url);
        this.f71230S.tryEmit(Boolean.FALSE);
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        ((Nc0.f) this.f71219H.getValue()).d(this.f71236t0);
        this.f71217F.getValue().c((Function1) this.f71242w0);
        super.onCleared();
    }

    @NotNull
    public final InterfaceC2395h<CharSequence> r1() {
        return this.f71228Q;
    }

    @NotNull
    public final InterfaceC2395h<Boolean> t1() {
        return this.f71231X;
    }

    @NotNull
    public final C2417s0 u1() {
        return this.f71229R;
    }

    @NotNull
    public final C2406m0 w1() {
        return this.f71222K;
    }

    @NotNull
    public final InterfaceC2395h<InterfaceC7641O> x1() {
        return this.f71233Z;
    }

    public final void z1(int i11) {
        ((C6709b) this.f71244x0.getValue()).g(i11);
        if (O1()) {
            td0.f.b(androidx.lifecycle.x0.a(this), null, new d(null));
        }
    }
}
