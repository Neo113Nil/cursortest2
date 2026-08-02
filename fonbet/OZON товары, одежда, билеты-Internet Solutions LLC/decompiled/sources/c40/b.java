package c40;

import Sc.k;
import Sc.n;
import android.app.Activity;
import android.util.Log;
import androidx.fragment.app.r;
import b40.InterfaceC5539a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.esia.api.EsiaLoginData;
import z6.C10992a;

/* loaded from: classes3.dex */
public final class b implements InterfaceC5539a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f56493a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f56494b;

    public b(@NotNull String redirectDeeplink) {
        Intrinsics.checkNotNullParameter(redirectDeeplink, "redirectDeeplink");
        this.f56493a = redirectDeeplink;
        this.f56494b = k.a(n.PUBLICATION, new C5744a(0));
        Log.d("Esia", "redirectDeeplink: " + redirectDeeplink);
    }

    @Override // b40.InterfaceC5539a
    public final boolean isAvailable() {
        return true;
    }

    @Override // b40.InterfaceC5539a
    public final void login(@NotNull Activity activity, @NotNull EsiaLoginData data) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(data, "data");
        String permissions = data.getPermissions();
        if (permissions != null) {
            B6.a.d((r) activity, new C10992a(data.getClientId(), data.getClientSecret(), data.getTime(), data.getState(), this.f56493a, data.getScope()), permissions);
        } else {
            B6.a.c((r) activity, new C10992a(data.getClientId(), data.getClientSecret(), data.getTime(), data.getState(), this.f56493a, data.getScope()));
        }
    }
}
