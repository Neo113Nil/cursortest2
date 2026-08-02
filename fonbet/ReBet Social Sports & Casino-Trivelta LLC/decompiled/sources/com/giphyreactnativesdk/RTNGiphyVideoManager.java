package com.giphyreactnativesdk;

import X8.u;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0017¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/giphyreactnativesdk/RTNGiphyVideoManager;", "Lcom/giphyreactnativesdk/RTNGiphyVideoManagerSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "", "muteAll", "()V", "pauseAll", "resume", "Companion", "a", "giphy_react-native-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RTNGiphyVideoManager extends RTNGiphyVideoManagerSpec {

    @NotNull
    public static final String NAME = "RTNGiphyVideoManager";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTNGiphyVideoManager(@NotNull ReactApplicationContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.giphyreactnativesdk.NativeGiphyVideoManagerSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "RTNGiphyVideoManager";
    }

    @Override // com.giphyreactnativesdk.NativeGiphyVideoManagerSpec
    @ReactMethod
    public void muteAll() {
        u.f13662a.g();
    }

    @Override // com.giphyreactnativesdk.NativeGiphyVideoManagerSpec
    @ReactMethod
    public void pauseAll() {
        u.f13662a.i();
    }

    @Override // com.giphyreactnativesdk.NativeGiphyVideoManagerSpec
    @ReactMethod
    public void resume() {
        u.f13662a.k();
    }
}
