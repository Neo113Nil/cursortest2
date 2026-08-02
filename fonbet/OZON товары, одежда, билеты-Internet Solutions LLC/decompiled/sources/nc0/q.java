package nc0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import De.C2862e;
import R2.InterfaceC3917k;
import Sc.InterfaceC4008j;
import Sc.s;
import Vb0.b;
import W2.f;
import android.os.Build;
import androidx.recyclerview.widget.LinearLayoutManager;
import dc0.C6149M;
import dc0.C6154S;
import dc0.C6178x;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import oc0.C8692a;
import org.jetbrains.annotations.NotNull;
import pc0.EnumC8897a;
import ru.ozon.id.nativeauth.crossApp.autologin.data.dto.InitAutologinRequestDto;
import ru.ozon.id.nativeauth.crossApp.autologin.data.dto.InitAutologinResponseDto;
import ru.ozon.id.nativeauth.crossApp.data.AccountSignatureData;
import ru.ozon.id.nativeauth.crossApp.data.api.CrossAppApi;
import ru.ozon.id.nativeauth.crossApp.dto.CrossAppChallengeInfoDto;
import ru.ozon.id.nativeauth.crossApp.dto.CrossAppChallengeNotificationDto;
import ru.ozon.id.nativeauth.crossApp.dto.CrossAppChallengeRequestDto;
import ru.ozon.id.nativeauth.crossApp.dto.CrossAppChallengeResponseDto;
import ru.ozon.id.nativeauth.crossApp.dto.CrossAppSharedStoreKeyDto;
import ru.ozon.id.nativeauth.data.models.AuthTokenDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;
import xe.E0;
import xe.InterfaceC10750u;

/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<CrossAppApi> f76825a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<InterfaceC3917k<W2.f>> f76826b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final qc0.b f76827c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final qc0.d f76828d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final qc0.c f76829e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ru.ozon.id.logout.data.d f76830f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Ib0.e f76831g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Xb0.a f76832h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C8692a> f76833i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6178x> f76834j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Kc0.l> f76835k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C2862e f76836l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f76837m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f76838n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f76839o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f76840p;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.crossApp.CrossAppAutologinUseCase$resetAutologinFlagDebug$2", f = "CrossAppAutologinUseCase.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<W2.b, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f76841d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = q.this.new a(dVar);
            aVar.f76841d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(W2.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            ((W2.b) this.f76841d).h(q.f(q.this));
            return Unit.f71690a;
        }
    }

    public q() {
        throw null;
    }

    public q(InterfaceC4008j api, InterfaceC4008j ozonIdNotifier, InterfaceC4008j dataStore, qc0.b crossAppChallengeKeyRepository, qc0.d crossAppChallengeRepository, qc0.c crossAppChallengeKeySigner, ru.ozon.id.logout.data.d logoutRepository, Ib0.e authEvents, Xb0.a logoutHandler, InterfaceC4008j autologinAvailableRepository, InterfaceC4008j currentUserRepository, InterfaceC4008j firstLaunchRepository) {
        C2862e coroutineScope = td0.f.a();
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(ozonIdNotifier, "ozonIdNotifier");
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        Intrinsics.checkNotNullParameter(crossAppChallengeKeyRepository, "crossAppChallengeKeyRepository");
        Intrinsics.checkNotNullParameter(crossAppChallengeRepository, "crossAppChallengeRepository");
        Intrinsics.checkNotNullParameter(crossAppChallengeKeySigner, "crossAppChallengeKeySigner");
        Intrinsics.checkNotNullParameter(logoutRepository, "logoutRepository");
        Intrinsics.checkNotNullParameter(authEvents, "authEvents");
        Intrinsics.checkNotNullParameter(logoutHandler, "logoutHandler");
        Intrinsics.checkNotNullParameter(autologinAvailableRepository, "autologinAvailableRepository");
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        Intrinsics.checkNotNullParameter(firstLaunchRepository, "firstLaunchRepository");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f76825a = api;
        this.f76826b = dataStore;
        this.f76827c = crossAppChallengeKeyRepository;
        this.f76828d = crossAppChallengeRepository;
        this.f76829e = crossAppChallengeKeySigner;
        this.f76830f = logoutRepository;
        this.f76831g = authEvents;
        this.f76832h = logoutHandler;
        this.f76833i = autologinAvailableRepository;
        this.f76834j = currentUserRepository;
        this.f76835k = firstLaunchRepository;
        this.f76836l = coroutineScope;
        this.f76837m = Sc.k.b(r.f76843b);
        this.f76838n = Sc.k.b(p.f76824b);
        this.f76839o = Sc.k.b(C8501l.f76814b);
        this.f76840p = ozonIdNotifier;
    }

    public static final f.a f(q qVar) {
        return (f.a) qVar.f76837m.getValue();
    }

    public static final void g(q qVar, Tg.b bVar) {
        qVar.getClass();
        if (bVar instanceof AtomAction.ViewAction) {
            return;
        }
        C10727i.c(qVar.f76836l, null, null, new o(bVar, qVar, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(kotlin.coroutines.jvm.internal.c cVar) {
        C8499j c8499j;
        Object obj;
        Wc.a aVar;
        int i11;
        InitAutologinRequestDto initAutologinRequestDto;
        List<AccountSignatureData> list;
        q qVar;
        List<AccountSignatureData> list2;
        q qVar2;
        InitAutologinResponseDto initAutologinResponseDto;
        List<String> unauthorizedKeys;
        String b11;
        q qVar3;
        CrossAppChallengeResponseDto crossAppChallengeResponseDto;
        NotificationDTO.LeftContent leftContent;
        if (cVar instanceof C8499j) {
            c8499j = (C8499j) cVar;
            int i12 = c8499j.f76813i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c8499j.f76813i = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj = c8499j.f76811g;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c8499j.f76813i;
                if (i11 != 0) {
                    s.b(obj);
                    List<AccountSignatureData> c11 = this.f76827c.c();
                    if (c11.isEmpty()) {
                        return Unit.f71690a;
                    }
                    List<AccountSignatureData> list3 = c11;
                    ArrayList arrayList = new ArrayList(C7714v.z(list3, 10));
                    for (AccountSignatureData accountSignatureData : list3) {
                        arrayList.add(new CrossAppSharedStoreKeyDto(accountSignatureData.getPublicKey(), accountSignatureData.getAppName()));
                    }
                    initAutologinRequestDto = new InitAutologinRequestDto(arrayList);
                    Kc0.l value = this.f76835k.getValue();
                    c8499j.f76808d = this;
                    c8499j.f76809e = c11;
                    c8499j.f76810f = initAutologinRequestDto;
                    c8499j.f76813i = 1;
                    Object g10 = value.g(c8499j);
                    if (g10 != aVar) {
                        list = c11;
                        obj = g10;
                        qVar = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        qVar3 = c8499j.f76808d;
                        s.b(obj);
                        crossAppChallengeResponseDto = (CrossAppChallengeResponseDto) obj;
                        if (crossAppChallengeResponseDto.getNotificationBar() != null) {
                            C6149M c6149m = (C6149M) qVar3.f76840p.getValue();
                            CrossAppChallengeNotificationDto notificationBar = crossAppChallengeResponseDto.getNotificationBar();
                            String title = notificationBar.getTitle();
                            String subtitle = notificationBar.getSubtitle();
                            Integer titleMaxLines = notificationBar.getTitleMaxLines();
                            Integer subtitleMaxLines = notificationBar.getSubtitleMaxLines();
                            if (notificationBar.getLeftContent() != null) {
                                CrossAppChallengeNotificationDto.LeftContentAtomDto atom = notificationBar.getLeftContent().getAtom();
                                leftContent = new NotificationDTO.LeftContent(atom != null ? atom.getIcon() : null, notificationBar.getLeftContent().getAlignment());
                            } else {
                                leftContent = null;
                            }
                            c6149m.g(new NotificationDTO(title, subtitle, titleMaxLines, subtitleMaxLines, leftContent, notificationBar.getRightContent() != null ? new NotificationDTO.RightContent(notificationBar.getRightContent().getButtonType(), notificationBar.getRightContent().getButton(), notificationBar.getRightContent().getIconButton(), notificationBar.getRightContent().getAlignment()) : null, notificationBar.getAutoHideDelay(), notificationBar.getCommon(), notificationBar.getContext(), notificationBar.getPreset()), new C8500k(qVar3));
                        }
                        if (crossAppChallengeResponseDto.getStatus().getIsSuccess()) {
                            return Unit.f71690a;
                        }
                        Fb0.d.a(new Fb0.c(true, (AuthTokenDTO) null, 4), Gb0.d.CROSS_APP, false);
                        return Unit.f71690a;
                    }
                    list2 = c8499j.f76809e;
                    qVar2 = c8499j.f76808d;
                    s.b(obj);
                    initAutologinResponseDto = (InitAutologinResponseDto) obj;
                    unauthorizedKeys = initAutologinResponseDto.getUnauthorizedKeys();
                    if (unauthorizedKeys != null) {
                        qVar2.f76827c.f(unauthorizedKeys);
                    }
                    if (initAutologinResponseDto.getSelectedKeyInfo() == null && (b11 = qVar2.f76829e.b(initAutologinResponseDto.getSelectedKeyInfo().getAuthPublicKey(), initAutologinResponseDto.getSelectedKeyInfo().getAuthChallenge())) != null) {
                        for (AccountSignatureData accountSignatureData2 : list2) {
                            if (Intrinsics.d(accountSignatureData2.getPublicKey(), initAutologinResponseDto.getSelectedKeyInfo().getAuthPublicKey())) {
                                String appName = accountSignatureData2.getAppName();
                                String authAction = initAutologinResponseDto.getSelectedKeyInfo().getAuthAction();
                                CrossAppChallengeInfoDto crossAppChallengeInfoDto = new CrossAppChallengeInfoDto(initAutologinResponseDto.getSelectedKeyInfo().getAuthPublicKey(), appName, b11);
                                String MODEL = Build.MODEL;
                                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                CrossAppChallengeRequestDto crossAppChallengeRequestDto = new CrossAppChallengeRequestDto(crossAppChallengeInfoDto, MODEL);
                                c8499j.f76808d = qVar2;
                                c8499j.f76809e = null;
                                c8499j.f76813i = 3;
                                obj = qVar2.f76828d.a(authAction, crossAppChallengeRequestDto, c8499j);
                                if (obj != aVar) {
                                    qVar3 = qVar2;
                                    crossAppChallengeResponseDto = (CrossAppChallengeResponseDto) obj;
                                    if (crossAppChallengeResponseDto.getNotificationBar() != null) {
                                    }
                                    if (crossAppChallengeResponseDto.getStatus().getIsSuccess()) {
                                    }
                                }
                                return aVar;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    return Unit.f71690a;
                }
                initAutologinRequestDto = c8499j.f76810f;
                list = c8499j.f76809e;
                qVar = c8499j.f76808d;
                s.b(obj);
                EnumC8897a enumC8897a = !((Boolean) obj).booleanValue() ? EnumC8897a.INSTALL : EnumC8897a.UPDATE;
                CrossAppApi value2 = qVar.f76825a.getValue();
                String a11 = enumC8897a.a();
                c8499j.f76808d = qVar;
                c8499j.f76809e = list;
                c8499j.f76810f = null;
                c8499j.f76813i = 2;
                obj = value2.initAutologinMobile(a11, initAutologinRequestDto, CrossAppApi.a.f97223a, c8499j);
                if (obj != aVar) {
                    list2 = list;
                    qVar2 = qVar;
                    initAutologinResponseDto = (InitAutologinResponseDto) obj;
                    unauthorizedKeys = initAutologinResponseDto.getUnauthorizedKeys();
                    if (unauthorizedKeys != null) {
                    }
                    if (initAutologinResponseDto.getSelectedKeyInfo() == null) {
                        return Unit.f71690a;
                    }
                    while (r4.hasNext()) {
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                return aVar;
            }
        }
        c8499j = new C8499j(this, cVar);
        obj = c8499j.f76811g;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = c8499j.f76813i;
        if (i11 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        CrossAppApi value22 = qVar.f76825a.getValue();
        String a112 = enumC8897a.a();
        c8499j.f76808d = qVar;
        c8499j.f76809e = list;
        c8499j.f76810f = null;
        c8499j.f76813i = 2;
        obj = value22.initAutologinMobile(a112, initAutologinRequestDto, CrossAppApi.a.f97223a, c8499j);
        if (obj != aVar) {
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(1:(1:(1:(1:(8:13|14|15|16|17|18|19|20)(2:26|27))(8:28|29|30|(3:32|(2:35|16)|34)|17|18|19|20))(10:37|38|39|(2:41|34)|30|(0)|17|18|19|20))(2:42|43))(5:51|52|53|(1:55)|34)|44|(2:46|(6:48|(2:50|34)|39|(0)|30|(0)))|17|18|19|20))|68|6|7|(0)(0)|44|(0)|17|18|19|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x004c, code lost:
    
        r9 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x004d, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0048, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0049, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2 A[Catch: all -> 0x0048, Exception -> 0x004c, TRY_LEAVE, TryCatch #5 {Exception -> 0x004c, all -> 0x0048, blocks: (B:29:0x0043, B:30:0x00ca, B:32:0x00d2, B:38:0x0052, B:39:0x00b7, B:43:0x0058, B:44:0x0077, B:46:0x008d, B:48:0x009e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d A[Catch: all -> 0x0048, Exception -> 0x004c, TryCatch #5 {Exception -> 0x004c, all -> 0x0048, blocks: (B:29:0x0043, B:30:0x00ca, B:32:0x00d2, B:38:0x0052, B:39:0x00b7, B:43:0x0058, B:44:0x0077, B:46:0x008d, B:48:0x009e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r1v0, types: [Wc.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [nc0.q] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6, types: [nc0.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(kotlin.coroutines.jvm.internal.c cVar) {
        C8502m c8502m;
        ?? r22;
        q qVar;
        InterfaceC4008j interfaceC4008j;
        q qVar2;
        boolean d11;
        q qVar3;
        q qVar4;
        try {
            if (cVar instanceof C8502m) {
                c8502m = (C8502m) cVar;
                int i11 = c8502m.f76818g;
                if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c8502m.f76818g = i11 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c8502m.f76816e;
                    ?? r12 = Wc.a.COROUTINE_SUSPENDED;
                    r22 = c8502m.f76818g;
                    if (r22 != 0) {
                        s.b(obj);
                        try {
                            InterfaceC2395h<W2.f> data = this.f76826b.getValue().getData();
                            c8502m.f76815d = this;
                            c8502m.f76818g = 1;
                            obj = C2399j.u(data, c8502m);
                            if (obj != r12) {
                                qVar2 = this;
                            }
                            return r12;
                        } catch (Exception e11) {
                            e = e11;
                            qVar = this;
                            E0.f(c8502m.getContext());
                            b.a.c(Vb0.b.f28514a, e);
                            interfaceC4008j = qVar.f76839o;
                            ((InterfaceC10750u) interfaceC4008j.getValue()).complete(Unit.f71690a);
                            return Unit.f71690a;
                        } catch (Throwable th2) {
                            th = th2;
                            r12 = this;
                            ((InterfaceC10750u) r12.f76839o.getValue()).complete(Unit.f71690a);
                            throw th;
                        }
                    }
                    if (r22 != 1) {
                        if (r22 == 2) {
                            q qVar5 = c8502m.f76815d;
                            s.b(obj);
                            qVar3 = qVar5;
                            C6178x value = qVar3.f76834j.getValue();
                            c8502m.f76815d = qVar3;
                            c8502m.f76818g = 3;
                            obj = value.a(c8502m);
                            r22 = qVar3;
                            if (obj == r12) {
                                return r12;
                            }
                            qVar4 = r22;
                            if (((C6154S) obj).i()) {
                            }
                            interfaceC4008j = qVar4.f76839o;
                            ((InterfaceC10750u) interfaceC4008j.getValue()).complete(Unit.f71690a);
                            return Unit.f71690a;
                        }
                        if (r22 != 3) {
                            if (r22 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            qVar = c8502m.f76815d;
                            try {
                                s.b(obj);
                                qVar4 = qVar;
                                interfaceC4008j = qVar4.f76839o;
                            } catch (Exception e12) {
                                e = e12;
                                E0.f(c8502m.getContext());
                                b.a.c(Vb0.b.f28514a, e);
                                interfaceC4008j = qVar.f76839o;
                                ((InterfaceC10750u) interfaceC4008j.getValue()).complete(Unit.f71690a);
                                return Unit.f71690a;
                            }
                            ((InterfaceC10750u) interfaceC4008j.getValue()).complete(Unit.f71690a);
                            return Unit.f71690a;
                        }
                        q qVar6 = c8502m.f76815d;
                        s.b(obj);
                        r22 = qVar6;
                        qVar4 = r22;
                        if (((C6154S) obj).i()) {
                            c8502m.f76815d = r22;
                            c8502m.f76818g = 4;
                            if (r22.h(c8502m) != r12) {
                                qVar = r22;
                                qVar4 = qVar;
                            }
                            return r12;
                        }
                        interfaceC4008j = qVar4.f76839o;
                        ((InterfaceC10750u) interfaceC4008j.getValue()).complete(Unit.f71690a);
                        return Unit.f71690a;
                    }
                    q qVar7 = c8502m.f76815d;
                    s.b(obj);
                    qVar2 = qVar7;
                    d11 = Intrinsics.d(((W2.f) obj).c((f.a) qVar2.f76837m.getValue()), Boolean.TRUE);
                    qVar4 = qVar2;
                    if (!d11) {
                        qVar2.f76833i.getValue().getClass();
                        qVar4 = qVar2;
                        if (C8692a.a()) {
                            InterfaceC3917k<W2.f> value2 = qVar2.f76826b.getValue();
                            C8503n c8503n = new C8503n(qVar2, null);
                            c8502m.f76815d = qVar2;
                            c8502m.f76818g = 2;
                            qVar3 = qVar2;
                            if (W2.j.a(value2, c8503n, c8502m) == r12) {
                                return r12;
                            }
                            C6178x value3 = qVar3.f76834j.getValue();
                            c8502m.f76815d = qVar3;
                            c8502m.f76818g = 3;
                            obj = value3.a(c8502m);
                            r22 = qVar3;
                            if (obj == r12) {
                            }
                            qVar4 = r22;
                            if (((C6154S) obj).i()) {
                            }
                        }
                    }
                    interfaceC4008j = qVar4.f76839o;
                    ((InterfaceC10750u) interfaceC4008j.getValue()).complete(Unit.f71690a);
                    return Unit.f71690a;
                }
            }
            if (r22 != 0) {
            }
            d11 = Intrinsics.d(((W2.f) obj).c((f.a) qVar2.f76837m.getValue()), Boolean.TRUE);
            qVar4 = qVar2;
            if (!d11) {
            }
            interfaceC4008j = qVar4.f76839o;
            ((InterfaceC10750u) interfaceC4008j.getValue()).complete(Unit.f71690a);
            return Unit.f71690a;
        } catch (Throwable th3) {
            th = th3;
        }
        c8502m = new C8502m(this, cVar);
        Object obj2 = c8502m.f76816e;
        ?? r122 = Wc.a.COROUTINE_SUSPENDED;
        r22 = c8502m.f76818g;
    }

    public final Object i(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        if (((AtomicBoolean) this.f76838n.getValue()).compareAndSet(false, true)) {
            Object j11 = j(cVar);
            return j11 == Wc.a.COROUTINE_SUSPENDED ? j11 : Unit.f71690a;
        }
        Object s11 = ((InterfaceC10750u) this.f76839o.getValue()).s(cVar);
        return s11 == Wc.a.COROUTINE_SUSPENDED ? s11 : Unit.f71690a;
    }

    public final Object k(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object a11 = W2.j.a(this.f76826b.getValue(), new a(null), dVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }
}
