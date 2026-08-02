package cl.json;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import h8.InterfaceC4488a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class NativeRNShareSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNShare";

    public NativeRNShareSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @InterfaceC4488a
    public final Map<String, Object> getConstants() {
        Map<String, Object> typedExportedConstants = getTypedExportedConstants();
        if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet(Arrays.asList("DISCORD", "EMAIL", "FACEBOOK", "FACEBOOKSTORIES", "GENERIC", "GOOGLEPLUS", "INSTAGRAM", "INSTAGRAMSTORIES", "LINKEDIN", "MESSENGER", "PAGESMANAGER", "PINTEREST", "SHARE_BACKGROUND_AND_STICKER_IMAGE", "SHARE_BACKGROUND_IMAGE", "SHARE_BACKGROUND_VIDEO", "SHARE_STICKER_IMAGE", "SMS", "SNAPCHAT", "TELEGRAM", "TWITTER", "VIBER", "WHATSAPP", "WHATSAPPBUSINESS"));
            HashSet hashSet3 = new HashSet(typedExportedConstants.keySet());
            hashSet3.removeAll(hashSet);
            hashSet3.removeAll(hashSet2);
            if (!hashSet3.isEmpty()) {
                throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", hashSet3));
            }
            hashSet.removeAll(typedExportedConstants.keySet());
            if (!hashSet.isEmpty()) {
                throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", hashSet));
            }
        }
        return typedExportedConstants;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public abstract Map<String, Object> getTypedExportedConstants();

    @ReactMethod
    @InterfaceC4488a
    public abstract void isBase64File(String str, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void isPackageInstalled(String str, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void open(ReadableMap readableMap, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void shareSingle(ReadableMap readableMap, Promise promise);
}
