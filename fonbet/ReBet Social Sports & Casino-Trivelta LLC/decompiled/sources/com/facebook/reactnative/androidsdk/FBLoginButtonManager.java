package com.facebook.reactnative.androidsdk;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import d8.EnumC4028d;
import d8.n;
import java.util.Locale;
import t8.AbstractC6451e;
import t8.C6447a;
import t8.C6449c;

/* loaded from: classes2.dex */
public class FBLoginButtonManager extends SimpleViewManager<C6449c> {
    public static final String REACT_CLASS = "RCTFBLoginButton";
    private final C6447a mActivityEventListener;

    public FBLoginButtonManager(ReactApplicationContext reactApplicationContext) {
        C6447a c6447a = new C6447a();
        this.mActivityEventListener = c6447a;
        reactApplicationContext.addActivityEventListener(c6447a);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "defaultAudience")
    public void setDefaultAudience(C6449c c6449c, String str) {
        EnumC4028d enumC4028d = EnumC4028d.FRIENDS;
        if (str != null) {
            enumC4028d = EnumC4028d.valueOf(str.toUpperCase(Locale.ROOT));
        }
        c6449c.setDefaultAudience(enumC4028d);
    }

    @ReactProp(name = "loginBehaviorAndroid")
    public void setLoginBehavior(C6449c c6449c, String str) {
        n nVar = n.NATIVE_WITH_FALLBACK;
        if (str != null) {
            nVar = n.valueOf(str.toUpperCase(Locale.ROOT));
        }
        c6449c.setLoginBehavior(nVar);
    }

    @ReactProp(name = "permissions")
    public void setPermissions(C6449c c6449c, ReadableArray readableArray) {
        c6449c.setPermissions(AbstractC6451e.p(readableArray));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C6449c createViewInstance(ThemedReactContext themedReactContext) {
        return new C6449c(themedReactContext, this.mActivityEventListener.a());
    }
}
