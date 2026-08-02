package io.agora.rtc.ng.react;

import android.view.SurfaceView;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

@ReactModule(name = AgoraRtcSurfaceViewManager.NAME)
/* loaded from: classes3.dex */
public class AgoraRtcSurfaceViewManager extends AgoraRtcSurfaceViewManagerSpec<FrameLayout> {
    public static final String NAME = "AgoraRtcSurfaceView";
    private ThemedReactContext context;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public FrameLayout createViewInstance(ThemedReactContext themedReactContext) {
        this.context = themedReactContext;
        FrameLayout frameLayout = new FrameLayout(themedReactContext.getReactApplicationContext());
        frameLayout.addView(new SurfaceView(themedReactContext.getApplicationContext()));
        return frameLayout;
    }

    @Override // com.facebook.react.viewmanagers.AgoraRtcSurfaceViewManagerInterface
    @ReactProp(name = "callApi")
    public void setCallApi(FrameLayout frameLayout, ReadableMap readableMap) {
        String string = readableMap.getString("funcName");
        String string2 = readableMap.getString("params");
        AgoraRtcNgModule agoraRtcNgModule = (AgoraRtcNgModule) this.context.getNativeModule(AgoraRtcNgModule.class);
        synchronized (agoraRtcNgModule.irisApiLock) {
            try {
                agoraRtcNgModule.irisApiEngine.callIrisApi(string, string2, frameLayout.getChildAt(0));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // com.facebook.react.viewmanagers.AgoraRtcSurfaceViewManagerInterface
    @ReactProp(name = "zOrderMediaOverlay")
    public void setZOrderMediaOverlay(FrameLayout frameLayout, boolean z10) {
        ((SurfaceView) frameLayout.getChildAt(0)).setZOrderMediaOverlay(z10);
    }

    @Override // com.facebook.react.viewmanagers.AgoraRtcSurfaceViewManagerInterface
    @ReactProp(name = "zOrderOnTop")
    public void setZOrderOnTop(FrameLayout frameLayout, boolean z10) {
        ((SurfaceView) frameLayout.getChildAt(0)).setZOrderOnTop(z10);
    }
}
