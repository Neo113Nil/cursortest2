package j60;

import U50.j;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.localauth.LocalAuthTypeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* renamed from: j60.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7291a implements U50.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final B30.a f69458a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Moshi f69459b;

    public C7291a(@NotNull B30.a biometricAuthManager, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f69458a = biometricAuthManager;
        this.f69459b = moshi;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "bio_available";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        String str;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        boolean b11 = this.f69458a.b();
        Moshi moshi = this.f69459b;
        try {
            str = moshi.c(LocalAuthTypeResult.class).toJson(new LocalAuthTypeResult(b11, b11));
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        ((j) callback).invoke(new NativeResult.Success(str));
    }
}
