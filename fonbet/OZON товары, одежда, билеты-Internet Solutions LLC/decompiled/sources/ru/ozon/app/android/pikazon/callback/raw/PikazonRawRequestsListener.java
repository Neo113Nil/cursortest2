package ru.ozon.app.android.pikazon.callback.raw;

import We.InterfaceC4865g;
import We.L;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pikazon/callback/raw/PikazonRawRequestsListener;", "", "Lru/ozon/app/android/pikazon/callback/raw/RequestData;", "requestData", "", "onRequestStarted", "(Lru/ozon/app/android/pikazon/callback/raw/RequestData;)V", "LWe/g;", "call", "LWe/L;", "response", "onResponseReceived", "(LWe/g;LWe/L;Lru/ozon/app/android/pikazon/callback/raw/RequestData;)V", "Ljava/io/IOException;", "e", "onRequestFailed", "(LWe/g;Ljava/io/IOException;Lru/ozon/app/android/pikazon/callback/raw/RequestData;)V", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PikazonRawRequestsListener {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onRequestStarted(@NotNull PikazonRawRequestsListener pikazonRawRequestsListener, @NotNull RequestData requestData) {
            Intrinsics.checkNotNullParameter(requestData, "requestData");
        }
    }

    void onRequestFailed(@NotNull InterfaceC4865g call, @NotNull IOException e11, @NotNull RequestData requestData);

    void onRequestStarted(@NotNull RequestData requestData);

    void onResponseReceived(@NotNull InterfaceC4865g call, @NotNull L response, @NotNull RequestData requestData);
}
