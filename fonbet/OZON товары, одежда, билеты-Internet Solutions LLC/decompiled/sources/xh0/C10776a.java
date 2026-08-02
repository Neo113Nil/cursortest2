package xh0;

import We.B;
import We.G;
import We.L;
import Zg0.e;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* renamed from: xh0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10776a implements B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final e.a.b f105568a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f105569b;

    public C10776a(@NotNull Context context, @NotNull e.a.b appData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appData, "appData");
        this.f105568a = appData;
        this.f105569b = context.getResources().getBoolean(R.bool.isTablet) ? "tablet" : "mobile";
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a aVar) {
        G.a aVar2 = new G.a(Ek.a.a(aVar, "chain"));
        this.f105568a.getClass();
        aVar2.d("User-Agent", null);
        aVar2.d("x-o3-app-name", null);
        aVar2.d("x-o3-app-version", null);
        aVar2.d("x-o3-device-type", this.f105569b);
        return aVar.proceed(aVar2.b());
    }
}
