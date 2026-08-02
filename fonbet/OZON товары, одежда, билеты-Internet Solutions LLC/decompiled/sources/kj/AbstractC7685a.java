package kj;

import ej.C6375d;
import ej.InterfaceC6374c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.ozon.android.inAppUpdate.internal.network.CheckUpdateResponseDTO;

/* renamed from: kj.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC7685a {

    /* renamed from: kj.a$a, reason: collision with other inner class name */
    public static final class C1182a {
        @NotNull
        public static AbstractC7685a a(@NotNull C6375d initParams, @NotNull InterfaceC6374c config, @NotNull Ld0.c diStore) {
            boolean z11;
            Boolean isCommonNetworkClientEnabled;
            Intrinsics.checkNotNullParameter(initParams, "initParams");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(diStore, "diStore");
            InterfaceC6374c.a featureFlags = config.getFeatureFlags();
            if (featureFlags == null || (isCommonNetworkClientEnabled = featureFlags.isCommonNetworkClientEnabled()) == null) {
                initParams.getClass();
                z11 = false;
            } else {
                z11 = isCommonNetworkClientEnabled.booleanValue();
            }
            AbstractC7685a c7687c = z11 ? new C7687c(diStore) : new C7686b(initParams, config, diStore);
            c7687c.b();
            return c7687c;
        }
    }

    @NotNull
    public final CheckUpdateResponseDTO a() {
        Response<CheckUpdateResponseDTO> execute = c().execute();
        if (!execute.isSuccessful()) {
            throw new HttpException(execute);
        }
        CheckUpdateResponseDTO body = execute.body();
        if (body != null) {
            return body;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    protected abstract void b();

    @NotNull
    public abstract Call<CheckUpdateResponseDTO> c();
}
