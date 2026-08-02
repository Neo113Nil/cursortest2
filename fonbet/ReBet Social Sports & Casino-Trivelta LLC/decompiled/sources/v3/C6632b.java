package v3;

import com.RNRSA.RNRSAKeychainModule;
import com.RNRSA.RNRSAModule;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: v3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6632b implements ReactPackage {
    @Override // com.facebook.react.ReactPackage
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNRSAModule(reactApplicationContext), new RNRSAKeychainModule(reactApplicationContext));
    }

    @Override // com.facebook.react.ReactPackage
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.EMPTY_LIST;
    }
}
