package io.intercom.android.sdk.helpcenter.utils.networking;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.CallAdapter;

/* compiled from: NetworkResponseAdapter.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u001a\u0012\u0004\u0012\u0002H\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00050\u00040\u0003B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0007H\u0016J\"\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponseAdapter;", ExifInterface.LATITUDE_SOUTH, "", "Lretrofit2/CallAdapter;", "Lretrofit2/Call;", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "successType", "Ljava/lang/reflect/Type;", "<init>", "(Ljava/lang/reflect/Type;)V", "responseType", "adapt", NotificationCompat.CATEGORY_CALL, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NetworkResponseAdapter<S> implements CallAdapter<S, Call<NetworkResponse<? extends S>>> {
    public static final int $stable = 8;
    private final Type successType;

    public NetworkResponseAdapter(Type successType) {
        Intrinsics.checkNotNullParameter(successType, "successType");
        this.successType = successType;
    }

    @Override // retrofit2.CallAdapter
    /* renamed from: responseType, reason: from getter */
    public Type getSuccessType() {
        return this.successType;
    }

    @Override // retrofit2.CallAdapter
    public Call<NetworkResponse<S>> adapt(Call<S> call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return new NetworkResponseCall(call);
    }
}
