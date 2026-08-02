package com.giphyreactnativesdk;

import O8.k;
import X8.c;
import X8.i;
import a9.d;
import a9.e;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/giphyreactnativesdk/RTNGiphySdkModule;", "Lcom/giphyreactnativesdk/RTNGiphySdkModuleSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "apiKey", "", "verificationMode", "", "videoCacheMaxBytes", "", "configure", "(Ljava/lang/String;ZD)V", "Companion", "a", "giphy_react-native-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RTNGiphySdkModule extends RTNGiphySdkModuleSpec {

    @NotNull
    public static final String NAME = "RTNGiphySDKModule";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTNGiphySdkModule(@NotNull ReactApplicationContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.giphyreactnativesdk.NativeGiphySDKSpec
    @ReactMethod
    public void configure(@NotNull String apiKey, boolean verificationMode, double videoCacheMaxBytes) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        d.a(reactApplicationContext, (long) videoCacheMaxBytes);
        k kVar = k.f8390a;
        kVar.p(e.a());
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext2, "getReactApplicationContext(...)");
        i iVar = new i(reactApplicationContext2);
        ReactApplicationContext reactApplicationContext3 = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext3, "getReactApplicationContext(...)");
        kVar.d(reactApplicationContext3, apiKey, verificationMode, MapsKt.hashMapOf(TuplesKt.to(iVar.a(), iVar.b())), new c());
    }

    @Override // com.giphyreactnativesdk.NativeGiphySDKSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "RTNGiphySDKModule";
    }
}
