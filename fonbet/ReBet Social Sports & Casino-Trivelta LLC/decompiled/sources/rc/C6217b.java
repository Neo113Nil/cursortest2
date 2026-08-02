package rc;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativerestart.RestartModule;
import java.util.ArrayList;
import java.util.List;

/* renamed from: rc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6217b implements ReactPackage {
    @Override // com.facebook.react.ReactPackage
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RestartModule(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.ReactPackage
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList();
    }
}
