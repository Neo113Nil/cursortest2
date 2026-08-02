package x60;

import Sc.k;
import Sc.n;
import Sc.s;
import U50.j;
import androidx.recyclerview.widget.LinearLayoutManager;
import b90.C5595b;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.security.DangerPermissions;
import xe.C10727i;

/* loaded from: classes3.dex */
public final class e extends V50.b<DangerPermissions> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final P60.d f105060b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Q90.c f105061c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final R30.a f105062d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f105063e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f105064f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull P60.d installedApps, @NotNull Q90.c featureToggles, @NotNull R30.a appCoroutineScopes, @NotNull Moshi moshi) {
        super(moshi);
        Intrinsics.checkNotNullParameter(installedApps, "installedApps");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f105060b = installedApps;
        this.f105061c = featureToggles;
        this.f105062d = appCoroutineScopes;
        this.f105063e = k.a(n.NONE, new C5595b(this, 3));
        this.f105064f = "get_apps";
    }

    public static boolean e(e eVar) {
        return Tl.a.f(eVar.f105061c, S90.c.MOB_QUERY_APPS);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|(1:(1:9)(2:19|20))(2:21|(2:23|24)(2:25|(1:27)))|10|11|12|13|14))|28|6|(0)(0)|10|11|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        r4.printStackTrace();
        r4 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r6v2, types: [Sc.j, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(e eVar, List list, kotlin.coroutines.jvm.internal.c cVar) {
        C10670b c10670b;
        int i11;
        eVar.getClass();
        if (cVar instanceof C10670b) {
            c10670b = (C10670b) cVar;
            int i12 = c10670b.f105050g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c10670b.f105050g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c10670b.f105048e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c10670b.f105050g;
                if (i11 != 0) {
                    s.b(obj);
                    if (!((Boolean) eVar.f105063e.getValue()).booleanValue()) {
                        L80.a.a("GetAppsBridgeInterface", "Disabled by toggle");
                        return new NativeResult.Error("Disabled by toggle", NativeResult.Error.a.IS_NOT_AVAILABLE);
                    }
                    c10670b.f105047d = eVar;
                    c10670b.f105050g = 1;
                    obj = eVar.f105060b.a(list, c10670b);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = c10670b.f105047d;
                    s.b(obj);
                }
                String str = eVar.b().c(List.class).toJson((List) obj);
                return new NativeResult.Success(str);
            }
        }
        c10670b = new C10670b(eVar, cVar);
        Object obj2 = c10670b.f105048e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c10670b.f105050g;
        if (i11 != 0) {
        }
        String str2 = eVar.b().c(List.class).toJson((List) obj2);
        return new NativeResult.Success(str2);
    }

    @Override // V50.b
    @NotNull
    public final Class<DangerPermissions> a() {
        return DangerPermissions.class;
    }

    @Override // V50.b
    public final void c(WeakReference weakReference, Object obj, j callback) {
        DangerPermissions value = (DangerPermissions) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C10727i.c(this.f105062d.b(), null, null, new C10671c(callback, this, value, System.currentTimeMillis(), null), 3);
    }

    @Override // V50.b
    public final NativeResult d(WeakReference weakReference, DangerPermissions dangerPermissions, String parameterJson) {
        DangerPermissions value = dangerPermissions;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        return (NativeResult) C10727i.d(kotlin.coroutines.g.f71771a, new C10672d(this, value, null));
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return this.f105064f;
    }
}
