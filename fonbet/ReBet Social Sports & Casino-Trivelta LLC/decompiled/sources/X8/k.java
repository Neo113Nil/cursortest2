package X8;

import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.giphyreactnativesdk.RTNGiphyDialogModule;
import com.giphyreactnativesdk.RTNGiphyGridViewManager;
import com.giphyreactnativesdk.RTNGiphyMediaViewManager;
import com.giphyreactnativesdk.RTNGiphySdkModule;
import com.giphyreactnativesdk.RTNGiphyVideoManager;
import com.giphyreactnativesdk.RTNGiphyVideoViewManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k extends TurboReactPackage {
    public static final Map getReactModuleInfoProvider$lambda$0() {
        HashMap hashMap = new HashMap();
        hashMap.put("RTNGiphySDKModule", new ReactModuleInfo("RTNGiphySDKModule", "RTNGiphySDKModule", false, false, true, false, true));
        hashMap.put("RTNGiphyDialogModule", new ReactModuleInfo("RTNGiphyDialogModule", "RTNGiphyDialogModule", false, false, true, false, true));
        hashMap.put("RTNGiphyVideoManager", new ReactModuleInfo("RTNGiphyVideoManager", "RTNGiphyVideoManager", false, false, true, false, true));
        return hashMap;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public List createViewManagers(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RTNGiphyMediaViewManager());
        arrayList.add(new RTNGiphyVideoViewManager());
        arrayList.add(new RTNGiphyGridViewManager());
        return arrayList;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        int hashCode = name.hashCode();
        if (hashCode == -1210309101) {
            if (name.equals("RTNGiphySDKModule")) {
                return new RTNGiphySdkModule(reactContext);
            }
            return null;
        }
        if (hashCode == 1523416039) {
            if (name.equals("RTNGiphyDialogModule")) {
                return new RTNGiphyDialogModule(reactContext);
            }
            return null;
        }
        if (hashCode == 1995941061 && name.equals("RTNGiphyVideoManager")) {
            return new RTNGiphyVideoManager(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() { // from class: X8.j
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                Map reactModuleInfoProvider$lambda$0;
                reactModuleInfoProvider$lambda$0 = k.getReactModuleInfoProvider$lambda$0();
                return reactModuleInfoProvider$lambda$0;
            }
        };
    }
}
