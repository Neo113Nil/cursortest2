package y80;

import A30.m;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import e40.d;
import fd.InterfaceC6511n;
import h3.C6788a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator;
import x80.C10677a;
import x80.e;
import x80.f;
import x80.h;
import x80.i;
import x80.j;
import y80.InterfaceC10862a;

/* renamed from: y80.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10863b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final S80.b f106291a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f106292b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final m f106293c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final R30.a f106294d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f106295e;

    /* renamed from: f, reason: collision with root package name */
    private Function0<String> f106296f;

    /* renamed from: g, reason: collision with root package name */
    private Function0<String> f106297g;

    /* renamed from: h, reason: collision with root package name */
    private Function1<? super d, Unit> f106298h;

    /* renamed from: i, reason: collision with root package name */
    private Function0<Boolean> f106299i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC6511n<? super String, ? super Boolean, ? super Boolean, Unit> f106300j;

    /* renamed from: k, reason: collision with root package name */
    private Function0<Boolean> f106301k;

    /* renamed from: l, reason: collision with root package name */
    private Function2<? super String, ? super Boolean, Unit> f106302l;

    /* renamed from: y80.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106303a;

        static {
            int[] iArr = new int[InterfaceC10862a.EnumC2293a.values().length];
            try {
                iArr[InterfaceC10862a.EnumC2293a.OZON_ID_RECOVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC10862a.EnumC2293a.OZON_WEB_AUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterfaceC10862a.EnumC2293a.OZON_WEB_AUTH_NEW_ARCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InterfaceC10862a.EnumC2293a.OZON_PAYMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InterfaceC10862a.EnumC2293a.OZON_WEB.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InterfaceC10862a.EnumC2293a.OZON_BROWSER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InterfaceC10862a.EnumC2293a.OZON_OTHERS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[InterfaceC10862a.EnumC2293a.INTEGRATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[InterfaceC10862a.EnumC2293a.SYSTEM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f106303a = iArr;
        }
    }

    public C10863b(@NotNull m fintechAuthInteractor, @NotNull R30.a appCoroutineScopes, @NotNull S80.b fintechNavigation, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings) {
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechAuthInteractor, "fintechAuthInteractor");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        this.f106291a = fintechNavigation;
        this.f106292b = fintechSettings;
        this.f106293c = fintechAuthInteractor;
        this.f106294d = appCoroutineScopes;
        this.f106295e = k.b(new F90.d(this, 7));
    }

    public static Set a(C10863b c10863b) {
        InterfaceC10862a cVar;
        c10863b.getClass();
        Xc.a<InterfaceC10862a.EnumC2293a> a11 = InterfaceC10862a.EnumC2293a.a();
        ArrayList arrayList = new ArrayList(C7714v.z(a11, 10));
        Iterator<E> it = a11.iterator();
        while (it.hasNext()) {
            int i11 = a.f106303a[((InterfaceC10862a.EnumC2293a) it.next()).ordinal()];
            ru.ozon.fintech.settings.domain.a aVar = c10863b.f106292b;
            S80.b bVar = c10863b.f106291a;
            switch (i11) {
                case 1:
                    cVar = new x80.c(bVar, aVar);
                    break;
                case 2:
                    Function0<Boolean> function0 = c10863b.f106301k;
                    if (function0 == null) {
                        Intrinsics.n("isStartedNow");
                        throw null;
                    }
                    Function0<String> function02 = c10863b.f106296f;
                    if (function02 == null) {
                        Intrinsics.n("provideTabId");
                        throw null;
                    }
                    cVar = new f(aVar, bVar, function0, function02);
                    break;
                case 3:
                    cVar = new h(c10863b.f106293c, c10863b.f106294d, bVar, aVar);
                    break;
                case 4:
                    cVar = new e(bVar, aVar);
                    break;
                case 5:
                    Function2<? super String, ? super Boolean, Unit> function2 = c10863b.f106302l;
                    if (function2 == null) {
                        Intrinsics.n("handleUrl");
                        throw null;
                    }
                    cVar = new i(aVar, function2);
                    break;
                case 6:
                    cVar = new x80.b(bVar, aVar);
                    break;
                case 7:
                    cVar = new x80.d(bVar, aVar);
                    break;
                case 8:
                    InterfaceC6511n<? super String, ? super Boolean, ? super Boolean, Unit> interfaceC6511n = c10863b.f106300j;
                    if (interfaceC6511n == null) {
                        Intrinsics.n("doCloseActivity");
                        throw null;
                    }
                    Function0<Boolean> function03 = c10863b.f106299i;
                    if (function03 == null) {
                        Intrinsics.n("provideActivityForResult");
                        throw null;
                    }
                    cVar = new C10677a(interfaceC6511n, bVar, function03);
                    break;
                case 9:
                    cVar = new j(bVar);
                    break;
                default:
                    throw new o();
            }
            arrayList.add(cVar);
        }
        return C7714v.Y0(arrayList);
    }

    @NotNull
    public final Set<InterfaceC10862a> b() {
        return (Set) this.f106295e.getValue();
    }

    public final void c(@NotNull C6788a scope, @NotNull NativeBridgeConfigurator nativeBridgeConfigurator, @NotNull Function1 pushUrlWrapToExchangerAndPop, @NotNull Function0 provideTabId, @NotNull Function0 provideAppConfigId, @NotNull InterfaceC6511n doCloseActivity, @NotNull Function0 provideActivityForResult, @NotNull Function0 isStartedNow, @NotNull Function2 handleUrl) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(nativeBridgeConfigurator, "nativeBridgeConfigurator");
        Intrinsics.checkNotNullParameter(pushUrlWrapToExchangerAndPop, "pushUrlWrapToExchangerAndPop");
        Intrinsics.checkNotNullParameter(provideTabId, "provideTabId");
        Intrinsics.checkNotNullParameter(provideAppConfigId, "provideAppConfigId");
        Intrinsics.checkNotNullParameter(doCloseActivity, "doCloseActivity");
        Intrinsics.checkNotNullParameter(provideActivityForResult, "provideActivityForResult");
        Intrinsics.checkNotNullParameter(isStartedNow, "isStartedNow");
        Intrinsics.checkNotNullParameter(handleUrl, "handleUrl");
        this.f106298h = pushUrlWrapToExchangerAndPop;
        this.f106299i = provideActivityForResult;
        this.f106297g = provideAppConfigId;
        this.f106296f = provideTabId;
        this.f106300j = doCloseActivity;
        this.f106301k = isStartedNow;
        this.f106302l = handleUrl;
    }
}
