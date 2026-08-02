package t8;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.reactnative.androidsdk.FBAccessTokenModule;
import com.facebook.reactnative.androidsdk.FBAppEventsLoggerModule;
import com.facebook.reactnative.androidsdk.FBAppLinkModule;
import com.facebook.reactnative.androidsdk.FBGameRequestDialogModule;
import com.facebook.reactnative.androidsdk.FBGraphRequestModule;
import com.facebook.reactnative.androidsdk.FBLoginButtonManager;
import com.facebook.reactnative.androidsdk.FBLoginManagerModule;
import com.facebook.reactnative.androidsdk.FBMessageDialogModule;
import com.facebook.reactnative.androidsdk.FBProfileModule;
import com.facebook.reactnative.androidsdk.FBSendButtonManager;
import com.facebook.reactnative.androidsdk.FBSettingsModule;
import com.facebook.reactnative.androidsdk.FBShareButtonManager;
import com.facebook.reactnative.androidsdk.FBShareDialogModule;
import java.util.Arrays;
import java.util.List;

/* renamed from: t8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6448b implements ReactPackage {

    /* renamed from: a, reason: collision with root package name */
    public C6447a f65771a = new C6447a();

    @Override // com.facebook.react.ReactPackage
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new FBAccessTokenModule(reactApplicationContext), new FBAppEventsLoggerModule(reactApplicationContext), new FBAppLinkModule(reactApplicationContext), new FBGameRequestDialogModule(reactApplicationContext, this.f65771a), new FBGraphRequestModule(reactApplicationContext), new FBLoginManagerModule(reactApplicationContext, this.f65771a), new FBMessageDialogModule(reactApplicationContext, this.f65771a), new FBProfileModule(reactApplicationContext), new FBSettingsModule(), new FBShareDialogModule(reactApplicationContext, this.f65771a));
    }

    @Override // com.facebook.react.ReactPackage
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new FBLoginButtonManager(reactApplicationContext), new FBSendButtonManager(), new FBShareButtonManager());
    }
}
