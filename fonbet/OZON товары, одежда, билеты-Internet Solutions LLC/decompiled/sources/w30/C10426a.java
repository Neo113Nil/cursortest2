package w30;

import Ae.O0;
import Ae.x0;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: w30.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10426a {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final List<String> f103502e = C7714v.b0("com.awesun.control", "com.anydesk.anydeskandroid", "com.sand.airdroid", "com.teamviewer.host.market", "net.dwservice.client", "com.realvnc.viewer.android", "com.embarcadero.LiteManager", "com.whatsapp", "us.zoom.videomeetings", "com.skype.raider", "ru.safib.assistant", "rb.system.com", "com.carriez.flutter_hbb");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f103503a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Q90.c f103504b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f103505c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final x0<List<String>> f103506d;

    public C10426a(@NotNull Context context, @NotNull Q90.c featureToggles, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        this.f103503a = context;
        this.f103504b = featureToggles;
        this.f103505c = fintechSettings;
        this.f103506d = O0.a(K.f71697a);
    }

    @NotNull
    public final x0<List<String>> a() {
        return this.f103506d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public final void b() {
        ?? r32;
        String str;
        boolean d11 = Tl.a.f(this.f103504b, S90.c.MOB_DISCLOSURE_SCREEN) ? Intrinsics.d(this.f103505c.o(), Boolean.TRUE) : true;
        x0 x0Var = this.f103506d;
        if (d11) {
            PackageManager packageManager = this.f103503a.getPackageManager();
            if (packageManager != null) {
                List<String> list = f103502e;
                r32 = new ArrayList();
                for (String str2 : list) {
                    try {
                        str = packageManager.getApplicationInfo(str2, 0).packageName;
                    } catch (Exception e11) {
                        L80.a.c("AppsInfoProvider", "Error while found item " + str2, e11);
                        str = null;
                    }
                    if (str != null) {
                        r32.add(str);
                    }
                }
            } else {
                r32 = K.f71697a;
            }
        } else {
            r32 = K.f71697a;
        }
        x0Var.setValue(r32);
    }
}
