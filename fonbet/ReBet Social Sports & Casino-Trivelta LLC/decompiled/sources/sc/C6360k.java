package sc;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativesystemnavigationbar.SystemNavigationBarModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: sc.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6360k implements ReactPackage {
    @Override // com.facebook.react.ReactPackage
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SystemNavigationBarModule(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.ReactPackage
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.EMPTY_LIST;
    }
}
