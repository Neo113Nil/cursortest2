package x60;

import U50.j;
import android.content.SharedPreferences;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.security.SaveRequest;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.security.SaveResult;

/* loaded from: classes3.dex */
public final class g extends V50.a<SaveRequest> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Ib.a<SharedPreferences> f105067b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f105068c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@NotNull Moshi moshi, @NotNull Ib.a sharedPreferences) {
        super(moshi);
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f105067b = sharedPreferences;
        this.f105068c = "save";
    }

    @Override // V50.a
    @NotNull
    public final Class<SaveRequest> b() {
        return SaveRequest.class;
    }

    @Override // V50.a
    public final void d(WeakReference weakReference, Object obj, j callback) {
        String str;
        SaveRequest value = (SaveRequest) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f105067b.get().edit().putString(value.getKey(), value.getValue()).apply();
        Moshi c11 = c();
        try {
            str = c11.c(SaveResult.class).toJson(new SaveResult(value.getKey(), value.getValue()));
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        callback.invoke(new NativeResult.Success(str));
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return this.f105068c;
    }
}
