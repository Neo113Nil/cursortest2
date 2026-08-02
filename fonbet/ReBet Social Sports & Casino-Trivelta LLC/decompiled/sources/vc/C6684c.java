package vc;

import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.rt2zz.reactnativecontacts.ContactsManager;
import com.rt2zz.reactnativecontacts.NativeContactsSpec;
import java.util.HashMap;
import java.util.Map;

/* renamed from: vc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6684c extends TurboReactPackage {
    public static /* synthetic */ Map a() {
        HashMap hashMap = new HashMap();
        hashMap.put(NativeContactsSpec.NAME, new ReactModuleInfo(NativeContactsSpec.NAME, NativeContactsSpec.NAME, false, false, true, false, true));
        return hashMap;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeContactsSpec.NAME)) {
            return new ContactsManager(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() { // from class: vc.b
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                return C6684c.a();
            }
        };
    }
}
