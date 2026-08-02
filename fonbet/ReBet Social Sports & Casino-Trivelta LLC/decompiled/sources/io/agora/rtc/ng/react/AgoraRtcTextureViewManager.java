package io.agora.rtc.ng.react;

import android.view.TextureView;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

@ReactModule(name = AgoraRtcTextureViewManager.NAME)
/* loaded from: classes3.dex */
public class AgoraRtcTextureViewManager extends AgoraRtcTextureViewManagerSpec<TextureView> {
    public static final String NAME = "AgoraRtcTextureView";
    private ThemedReactContext context;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public TextureView createViewInstance(ThemedReactContext themedReactContext) {
        this.context = themedReactContext;
        return new TextureView(themedReactContext.getApplicationContext());
    }

    @Override // com.facebook.react.viewmanagers.AgoraRtcTextureViewManagerInterface
    @ReactProp(name = "callApi")
    public void setCallApi(TextureView textureView, ReadableMap readableMap) {
        String string = readableMap.getString("funcName");
        String string2 = readableMap.getString("params");
        AgoraRtcNgModule agoraRtcNgModule = (AgoraRtcNgModule) this.context.getNativeModule(AgoraRtcNgModule.class);
        synchronized (agoraRtcNgModule.irisApiLock) {
            try {
                agoraRtcNgModule.irisApiEngine.callIrisApi(string, string2, textureView);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }
}
