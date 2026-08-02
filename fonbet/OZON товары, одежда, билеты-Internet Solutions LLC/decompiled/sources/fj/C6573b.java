package fj;

import Ld0.c;
import android.content.Context;
import android.os.Build;
import androidx.activity.ActivityC5043j;
import ei0.InterfaceC6369b;
import ej.C6373b;
import ej.C6375d;
import ej.EnumC6378g;
import ej.InterfaceC6372a;
import ej.InterfaceC6374c;
import gj.C6743a;
import hj.C6960a;
import ij.C7084a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kj.AbstractC7685a;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lj.c;
import org.jetbrains.annotations.NotNull;
import pj.C8938a;
import retrofit2.HttpException;
import ru.ozon.android.inAppUpdate.internal.network.CheckUpdateResponseDTO;
import ru.ozon.android.inAppUpdate.internal.ui.OzonInAppUpdateSdkActivity;
import ru.ozon.android.inAppUpdate.internal.ui.blocking.OzonInAppUpdateSdkBlockingActivity;
import ru.ozon.android.inAppUpdate.internal.ui.e;
import ru.ozon.android.inAppUpdate.internal.ui.h;

/* renamed from: fj.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6573b implements InterfaceC6372a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6375d f63591a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f63592b;

    /* renamed from: c, reason: collision with root package name */
    private CheckUpdateResponseDTO f63593c;

    public C6573b(@NotNull C6375d params, @NotNull c diStore) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(diStore, "diStore");
        this.f63591a = params;
        this.f63592b = diStore;
        int i11 = C8938a.f81237c;
        C8938a.d(params.a());
        C6743a.a(diStore);
    }

    @Override // ej.InterfaceC6376e
    public final void J(@NotNull InterfaceC6374c config, @NotNull ActivityC5043j activity) {
        e a11;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(activity, "activity");
        InterfaceC6374c.InterfaceC0981c.a aVar = InterfaceC6374c.InterfaceC0981c.a.GOOGLE_PLAY;
        CheckUpdateResponseDTO checkUpdateResponseDTO = this.f63593c;
        if (checkUpdateResponseDTO == null) {
            return;
        }
        if (checkUpdateResponseDTO.getMustUpdate()) {
            int i11 = OzonInAppUpdateSdkBlockingActivity.f83828j;
            activity.startActivity(OzonInAppUpdateSdkBlockingActivity.a.a(activity, h.a(config, new e.a(checkUpdateResponseDTO), aVar)));
            return;
        }
        int e11 = C6960a.a().e(activity);
        if (e11 == 1 || e11 == 2 || e11 == 4) {
            int i12 = C8938a.f81237c;
            C8938a.b("Abort the flow update because the download of the new version of the application is already running. Current status of downloading the apk: " + e11);
            C7084a a12 = C6960a.a();
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            a12.h(applicationContext, new C6572a(this, activity, config, checkUpdateResponseDTO, aVar));
            return;
        }
        int i13 = lj.c.f73376d;
        Set a13 = c.a.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : a13) {
            if (androidx.core.content.a.checkSelfPermission(activity, (String) obj) != 0) {
                arrayList.add(obj);
            }
        }
        List list = arrayList;
        if (Build.VERSION.SDK_INT >= 30) {
            list = null;
        }
        if (list == null) {
            list = K.f71697a;
        }
        String version = checkUpdateResponseDTO.getVersion();
        if (list.isEmpty()) {
            C6960a.a();
            a11 = C7084a.g(config.getApkName(), version) ? new e.c(checkUpdateResponseDTO) : new e.a(checkUpdateResponseDTO);
        } else {
            a11 = C6373b.a(checkUpdateResponseDTO);
        }
        int i14 = OzonInAppUpdateSdkActivity.f83815i;
        activity.startActivity(OzonInAppUpdateSdkActivity.a.a(activity, h.a(config, a11, aVar)));
    }

    @Override // ej.InterfaceC6372a
    public final void e(Function1<? super Ld0.c, ? extends InterfaceC6369b> function1) {
        C6960a.f(function1);
    }

    @Override // ej.InterfaceC6376e
    @NotNull
    public final EnumC6378g i(@NotNull InterfaceC6374c config) {
        Intrinsics.checkNotNullParameter(config, "config");
        int i11 = C8938a.f81237c;
        C8938a.b("Trying to get information about the possibility of updating the application.");
        try {
            this.f63593c = AbstractC7685a.C1182a.a(this.f63591a, config, this.f63592b).a();
            C8938a.b("An update for the app is available.");
            return EnumC6378g.UPDATE_AVAILABLE;
        } catch (Exception e11) {
            if ((e11 instanceof HttpException) && ((HttpException) e11).code() == 404) {
                int i12 = C8938a.f81237c;
                C8938a.b("The backend returned a 404 error. The current version of the application is up to date.");
            }
            C8938a.c(null, e11);
            C6960a.d();
            return EnumC6378g.UPDATE_NOT_AVAILABLE;
        }
    }

    @Override // Ld0.e
    public final void onInstantPluginsCreated() {
    }
}
