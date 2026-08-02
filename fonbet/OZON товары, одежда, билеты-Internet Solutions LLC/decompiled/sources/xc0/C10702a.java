package xc0;

import Sc.InterfaceC4008j;
import Sc.s;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.logout.data.ConfirmTrustedDeviceDTO;
import ru.ozon.id.nativeauth.accountMerge.data.AccountMergeDTO;
import ru.ozon.id.nativeauth.biometry.data.dto.BiometryEntryActionDTO;
import ru.ozon.id.nativeauth.credentials.countryCode.PhoneCodeCountrySelectDTO;
import ru.ozon.id.nativeauth.data.api.ComposerAuthApi;
import ru.ozon.id.nativeauth.data.api.PageResponse;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;
import ru.ozon.id.nativeauth.data.models.LoginErrorActionDTO;
import ru.ozon.id.nativeauth.data.models.RestoreAccesDTO;
import ru.ozon.id.nativeauth.pageAgreementWithConditions.data.PageAgreementWithConditionsDTO;
import ru.ozon.id.nativeauth.pageNotification.data.PageNotificationDTO;
import ru.ozon.id.nativeauth.pageSocialAdditional.data.PageSocialAdditionalOptionDTO;
import ru.ozon.id.nativeauth.requestPhoneAccess.data.RequestPhoneAccessDTO;
import wc0.InterfaceC10500a;
import xe.C10720e0;
import xe.C10727i;
import xe.I;
import xe.M;

/* renamed from: xc0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10702a implements InterfaceC10500a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ InterfaceC10500a f105321a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Hb0.c> f105322b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final I f105323c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f105324d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f105325e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.data.api.ComposerAuthRepository$getAccountMerge$$inlined$request$1", f = "ComposerAuthRepository.kt", l = {84}, m = "invokeSuspend")
    /* renamed from: xc0.a$a, reason: collision with other inner class name */
    public static final class C2278a extends j implements Function2<M, kotlin.coroutines.d<? super AccountMergeDTO>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f105326d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f105328f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComposerAuthApi f105329g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2278a(String str, kotlin.coroutines.d dVar, ComposerAuthApi composerAuthApi) {
            super(2, dVar);
            this.f105328f = str;
            this.f105329g = composerAuthApi;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C10702a.this.new C2278a(this.f105328f, dVar, this.f105329g);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super AccountMergeDTO> dVar) {
            return ((C2278a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f105326d;
            if (i11 == 0) {
                s.b(obj);
                String l11 = C10702a.l(C10702a.this, this.f105328f);
                this.f105326d = 1;
                obj = this.f105329g.getAccountMerge(l11, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return ((PageResponse) obj).getData();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.data.api.ComposerAuthRepository$getConfirmTrustedDevice$$inlined$request$1", f = "ComposerAuthRepository.kt", l = {84}, m = "invokeSuspend")
    /* renamed from: xc0.a$b */
    public static final class b extends j implements Function2<M, kotlin.coroutines.d<? super ConfirmTrustedDeviceDTO>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f105330d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f105332f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComposerAuthApi f105333g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, kotlin.coroutines.d dVar, ComposerAuthApi composerAuthApi) {
            super(2, dVar);
            this.f105332f = str;
            this.f105333g = composerAuthApi;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C10702a.this.new b(this.f105332f, dVar, this.f105333g);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super ConfirmTrustedDeviceDTO> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f105330d;
            if (i11 == 0) {
                s.b(obj);
                String l11 = C10702a.l(C10702a.this, this.f105332f);
                this.f105330d = 1;
                obj = this.f105333g.getConfirmTrustedDevice(l11, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return ((PageResponse) obj).getData();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.data.api.ComposerAuthRepository$getPageConditionsAndAgreements$$inlined$request$1", f = "ComposerAuthRepository.kt", l = {84}, m = "invokeSuspend")
    /* renamed from: xc0.a$c */
    public static final class c extends j implements Function2<M, kotlin.coroutines.d<? super PageAgreementWithConditionsDTO>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f105334d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f105336f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComposerAuthApi f105337g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, kotlin.coroutines.d dVar, ComposerAuthApi composerAuthApi) {
            super(2, dVar);
            this.f105336f = str;
            this.f105337g = composerAuthApi;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C10702a.this.new c(this.f105336f, dVar, this.f105337g);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super PageAgreementWithConditionsDTO> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f105334d;
            if (i11 == 0) {
                s.b(obj);
                String l11 = C10702a.l(C10702a.this, this.f105336f);
                this.f105334d = 1;
                obj = this.f105337g.getPageAgreementWithConditions(l11, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return ((PageResponse) obj).getData();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.data.api.ComposerAuthRepository$getPageNotification$$inlined$request$1", f = "ComposerAuthRepository.kt", l = {84}, m = "invokeSuspend")
    /* renamed from: xc0.a$d */
    public static final class d extends j implements Function2<M, kotlin.coroutines.d<? super PageNotificationDTO>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f105338d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f105340f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComposerAuthApi f105341g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, kotlin.coroutines.d dVar, ComposerAuthApi composerAuthApi) {
            super(2, dVar);
            this.f105340f = str;
            this.f105341g = composerAuthApi;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C10702a.this.new d(this.f105340f, dVar, this.f105341g);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super PageNotificationDTO> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f105338d;
            if (i11 == 0) {
                s.b(obj);
                String l11 = C10702a.l(C10702a.this, this.f105340f);
                this.f105338d = 1;
                obj = this.f105341g.getPageNotification(l11, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return ((PageResponse) obj).getData();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.data.api.ComposerAuthRepository$getPageSocialMergeNotification$$inlined$request$1", f = "ComposerAuthRepository.kt", l = {84}, m = "invokeSuspend")
    /* renamed from: xc0.a$e */
    public static final class e extends j implements Function2<M, kotlin.coroutines.d<? super PageSocialAdditionalOptionDTO>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f105342d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f105344f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComposerAuthApi f105345g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, kotlin.coroutines.d dVar, ComposerAuthApi composerAuthApi) {
            super(2, dVar);
            this.f105344f = str;
            this.f105345g = composerAuthApi;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C10702a.this.new e(this.f105344f, dVar, this.f105345g);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super PageSocialAdditionalOptionDTO> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f105342d;
            if (i11 == 0) {
                s.b(obj);
                String l11 = C10702a.l(C10702a.this, this.f105344f);
                this.f105342d = 1;
                obj = this.f105345g.getPageSocialAdditionalOption(l11, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return ((PageResponse) obj).getData();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.data.api.ComposerAuthRepository$getPhoneCodes$$inlined$request$1", f = "ComposerAuthRepository.kt", l = {84}, m = "invokeSuspend")
    /* renamed from: xc0.a$f */
    public static final class f extends j implements Function2<M, kotlin.coroutines.d<? super PhoneCodeCountrySelectDTO>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f105346d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f105348f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComposerAuthApi f105349g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, kotlin.coroutines.d dVar, ComposerAuthApi composerAuthApi) {
            super(2, dVar);
            this.f105348f = str;
            this.f105349g = composerAuthApi;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C10702a.this.new f(this.f105348f, dVar, this.f105349g);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super PhoneCodeCountrySelectDTO> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f105346d;
            if (i11 == 0) {
                s.b(obj);
                String l11 = C10702a.l(C10702a.this, this.f105348f);
                this.f105346d = 1;
                obj = this.f105349g.getPhoneCodes(l11, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return ((PageResponse) obj).getData();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.data.api.ComposerAuthRepository$getRequestPhoneAccess$$inlined$request$1", f = "ComposerAuthRepository.kt", l = {84}, m = "invokeSuspend")
    /* renamed from: xc0.a$g */
    public static final class g extends j implements Function2<M, kotlin.coroutines.d<? super RequestPhoneAccessDTO>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f105350d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f105352f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComposerAuthApi f105353g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, kotlin.coroutines.d dVar, ComposerAuthApi composerAuthApi) {
            super(2, dVar);
            this.f105352f = str;
            this.f105353g = composerAuthApi;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C10702a.this.new g(this.f105352f, dVar, this.f105353g);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super RequestPhoneAccessDTO> dVar) {
            return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f105350d;
            if (i11 == 0) {
                s.b(obj);
                String l11 = C10702a.l(C10702a.this, this.f105352f);
                this.f105350d = 1;
                obj = this.f105353g.getRequestPhoneAccess(l11, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return ((PageResponse) obj).getData();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.data.api.ComposerAuthRepository$getRestoreEntryActions$$inlined$request$1", f = "ComposerAuthRepository.kt", l = {84}, m = "invokeSuspend")
    /* renamed from: xc0.a$h */
    public static final class h extends j implements Function2<M, kotlin.coroutines.d<? super RestoreAccesDTO>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f105354d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f105356f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComposerAuthApi f105357g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, kotlin.coroutines.d dVar, ComposerAuthApi composerAuthApi) {
            super(2, dVar);
            this.f105356f = str;
            this.f105357g = composerAuthApi;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C10702a.this.new h(this.f105356f, dVar, this.f105357g);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super RestoreAccesDTO> dVar) {
            return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f105354d;
            if (i11 == 0) {
                s.b(obj);
                String l11 = C10702a.l(C10702a.this, this.f105356f);
                this.f105354d = 1;
                obj = this.f105357g.getRestoreAccess(l11, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return ((PageResponse) obj).getData();
        }
    }

    public C10702a() {
        throw null;
    }

    public C10702a(InterfaceC4008j composerAuthApi, InterfaceC4008j appInfoRepository, InterfaceC4008j featureFlagsStore, InterfaceC4008j actionAuthRepository) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        He.b ioDispatcher = He.b.f10879b;
        Intrinsics.checkNotNullParameter(composerAuthApi, "composerAuthApi");
        Intrinsics.checkNotNullParameter(appInfoRepository, "appInfoRepository");
        Intrinsics.checkNotNullParameter(featureFlagsStore, "featureFlagsStore");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(actionAuthRepository, "actionAuthRepository");
        this.f105321a = (InterfaceC10500a) actionAuthRepository.getValue();
        this.f105322b = featureFlagsStore;
        this.f105323c = ioDispatcher;
        this.f105324d = composerAuthApi;
        this.f105325e = appInfoRepository;
    }

    public static final vc0.c i(C10702a c10702a) {
        return (vc0.c) c10702a.f105325e.getValue();
    }

    public static final String l(C10702a c10702a, String str) {
        c10702a.getClass();
        return Nk.a.b("composer-api.bx/_action/", kotlin.text.h.S(str, "ozon://"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposerAuthApi n() {
        return (ComposerAuthApi) this.f105324d.getValue();
    }

    @Override // wc0.InterfaceC10500a
    public final Object a(@NotNull String str, Map map, boolean z11, boolean z12, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return this.f105321a.a(str, map, z11, z12, cVar);
    }

    @Override // wc0.InterfaceC10500a
    public final Object b(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return this.f105321a.b(str, cVar);
    }

    @Override // wc0.InterfaceC10500a
    public final Object c(@NotNull FastEntryActionDTO.FastEntryDataDTO.MobileId mobileId, @NotNull kotlin.coroutines.d<? super FastEntryActionDTO> dVar) {
        return this.f105321a.c(mobileId, dVar);
    }

    @Override // wc0.InterfaceC10500a
    public final Object d(@NotNull String str, @NotNull j jVar) {
        return this.f105321a.d(str, jVar);
    }

    @Override // wc0.InterfaceC10500a
    public final Object e(@NotNull String str, @NotNull Map map, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return this.f105321a.e(str, map, cVar);
    }

    @Override // wc0.InterfaceC10500a
    public final Object f(@NotNull String str, @NotNull kotlin.coroutines.d<? super FastEntryActionDTO> dVar) {
        return this.f105321a.f(str, dVar);
    }

    @Override // wc0.InterfaceC10500a
    public final Object g(@NotNull String str, @NotNull kotlin.coroutines.d<? super LoginErrorActionDTO> dVar) {
        return this.f105321a.g(str, dVar);
    }

    @Override // wc0.InterfaceC10500a
    public final Object h(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull kotlin.coroutines.d<? super BiometryEntryActionDTO> dVar) {
        return this.f105321a.h(str, map, dVar);
    }

    public final Object m(@NotNull String str, @NotNull kotlin.coroutines.d<? super AccountMergeDTO> dVar) {
        return C10727i.f(this.f105323c, new C2278a(str, null, n()), dVar);
    }

    public final Object o(@NotNull String str, @NotNull kotlin.coroutines.d<? super ConfirmTrustedDeviceDTO> dVar) {
        return C10727i.f(this.f105323c, new b(str, null, n()), dVar);
    }

    public final Object p(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return C10727i.f(this.f105323c, new C10703b(this, str, null, this), cVar);
    }

    public final Object q(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return C10727i.f(this.f105323c, new C10704c(this, str, null, n()), cVar);
    }

    public final Object r(@NotNull String str, @NotNull kotlin.coroutines.d<? super PageAgreementWithConditionsDTO> dVar) {
        return C10727i.f(this.f105323c, new c(str, null, n()), dVar);
    }

    public final Object s(@NotNull String str, @NotNull kotlin.coroutines.d<? super PageNotificationDTO> dVar) {
        return C10727i.f(this.f105323c, new d(str, null, n()), dVar);
    }

    public final Object t(@NotNull String str, @NotNull kotlin.coroutines.d<? super PageSocialAdditionalOptionDTO> dVar) {
        return C10727i.f(this.f105323c, new e(str, null, n()), dVar);
    }

    public final Object u(@NotNull String str, @NotNull kotlin.coroutines.d<? super PhoneCodeCountrySelectDTO> dVar) {
        return C10727i.f(this.f105323c, new f(str, null, n()), dVar);
    }

    public final Object v(@NotNull String str, @NotNull kotlin.coroutines.d<? super RequestPhoneAccessDTO> dVar) {
        return C10727i.f(this.f105323c, new g(str, null, n()), dVar);
    }

    public final Object w(@NotNull String str, @NotNull kotlin.coroutines.d<? super RestoreAccesDTO> dVar) {
        return C10727i.f(this.f105323c, new h(str, null, n()), dVar);
    }
}
