package g60;

import U50.j;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r90.f;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.geolocation.LocationAvailableData;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class c implements U50.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Moshi f63930a;

    /* renamed from: b, reason: collision with root package name */
    private final f f63931b;

    public c(@NotNull Moshi moshi, f fVar) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f63930a = moshi;
        this.f63931b = fVar;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "is_available";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        String str;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        f fVar = this.f63931b;
        boolean n11 = fVar != null ? fVar.n() : false;
        boolean m11 = fVar != null ? fVar.m() : false;
        try {
            str = this.f63930a.c(LocationAvailableData.class).toJson(new LocationAvailableData(n11 || m11));
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        ((j) callback).invoke(new NativeResult.Success(str));
    }
}
