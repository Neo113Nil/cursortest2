package com.margelo.nitro.nitrofetch;

import android.util.Base64;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.blob.BlobModule;
import fr.greweb.reactnativeviewshot.ViewShot;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroFetchBlob.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007¨\u0006\u000b"}, d2 = {"Lcom/margelo/nitro/nitrofetch/NitroFetchBlob;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "createBlobId", ViewShot.Results.BASE_64, "Companion", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NitroFetchBlob extends ReactContextBaseJavaModule {
    public static final String NAME = "NitroFetchBlob";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NitroFetchBlob(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final String createBlobId(String base64) {
        Intrinsics.checkNotNullParameter(base64, "base64");
        try {
            byte[] decode = Base64.decode(base64, 2);
            BlobModule blobModule = (BlobModule) getReactApplicationContext().getNativeModule(BlobModule.class);
            if (blobModule == null) {
                return "";
            }
            Intrinsics.checkNotNull(decode);
            return blobModule.store(decode);
        } catch (Throwable unused) {
            return "";
        }
    }
}
