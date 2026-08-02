package x60;

import U50.j;
import android.content.SharedPreferences;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.security.GetRequest;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.security.GetResult;

/* loaded from: classes3.dex */
public final class f extends V50.a<GetRequest> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Ib.a<SharedPreferences> f105065b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f105066c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull Moshi moshi, @NotNull Ib.a sharedPreferences) {
        super(moshi);
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f105065b = sharedPreferences;
        this.f105066c = "get";
    }

    @Override // V50.a
    @NotNull
    public final Class<GetRequest> b() {
        return GetRequest.class;
    }

    @Override // V50.a
    public final void d(WeakReference weakReference, Object obj, j callback) {
        String str;
        GetRequest value = (GetRequest) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String string = this.f105065b.get().getString(value.getKey(), "null");
        String str2 = string != null ? string : "null";
        try {
            str = c().c(GetResult.class).toJson(new GetResult(str2));
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        callback.invoke(new NativeResult.Success(str));
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return this.f105066c;
    }
}
