package bc;

import android.util.Log;
import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class b extends TurboReactPackage {
    static {
        try {
            Log.i("QuickCrypto", "Loading C++ library...");
            System.loadLibrary("QuickCrypto");
            Log.i("QuickCrypto", "Successfully loaded C++ library!");
        } catch (Throwable th2) {
            Log.e("QuickCrypto", "Failed to load C++ library! Is it properly installed and linked?", th2);
            throw th2;
        }
    }

    public static /* synthetic */ Map a() {
        return new HashMap();
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() { // from class: bc.a
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                return b.a();
            }
        };
    }
}
