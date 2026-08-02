package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* loaded from: classes2.dex */
public class LottieAnimationViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & LottieAnimationViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public LottieAnimationViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: receiveCommand */
    public void kotlinCompat$receiveCommand(T t10, String str, ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "resume":
                ((LottieAnimationViewManagerInterface) this.mViewManager).resume(t10);
                break;
            case "play":
                ((LottieAnimationViewManagerInterface) this.mViewManager).play(t10, readableArray.getInt(0), readableArray.getInt(1));
                break;
            case "pause":
                ((LottieAnimationViewManagerInterface) this.mViewManager).pause(t10);
                break;
            case "reset":
                ((LottieAnimationViewManagerInterface) this.mViewManager).reset(t10);
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1931191604:
                if (str.equals("imageAssetsFolder")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1698420908:
                if (str.equals("sourceURL")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1620771041:
                if (str.equals("textFiltersIOS")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1111735389:
                if (str.equals("sourceJson")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1111633594:
                if (str.equals("sourceName")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1073046328:
                if (str.equals("cacheComposition")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals(ReactProgressBarViewManager.PROP_PROGRESS)) {
                    c10 = 6;
                    break;
                }
                break;
            case -413415295:
                if (str.equals("textFiltersAndroid")) {
                    c10 = 7;
                    break;
                }
                break;
            case -204076609:
                if (str.equals("sourceDotLottieURI")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 95945896:
                if (str.equals("dummy")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 109641799:
                if (str.equals("speed")) {
                    c10 = 11;
                    break;
                }
                break;
            case 399078087:
                if (str.equals("hardwareAccelerationAndroid")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 1192042876:
                if (str.equals("enableSafeModeAndroid")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 1193882713:
                if (str.equals("renderMode")) {
                    c10 = 14;
                    break;
                }
                break;
            case 1410565912:
                if (str.equals("colorFilters")) {
                    c10 = 15;
                    break;
                }
                break;
            case 1438608771:
                if (str.equals("autoPlay")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2049757303:
                if (str.equals(ViewProps.RESIZE_MODE)) {
                    c10 = 17;
                    break;
                }
                break;
            case 2111299681:
                if (str.equals("enableMergePathsAndroidForKitKatAndAbove")) {
                    c10 = 18;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setImageAssetsFolder(t10, obj != null ? (String) obj : null);
                break;
            case 1:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setSourceURL(t10, obj != null ? (String) obj : null);
                break;
            case 2:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setTextFiltersIOS(t10, (ReadableArray) obj);
                break;
            case 3:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setSourceJson(t10, obj != null ? (String) obj : null);
                break;
            case 4:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setSourceName(t10, obj != null ? (String) obj : null);
                break;
            case 5:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setCacheComposition(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 6:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setProgress(t10, obj == null ? 0.0f : ((Double) obj).floatValue());
                break;
            case 7:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setTextFiltersAndroid(t10, (ReadableArray) obj);
                break;
            case '\b':
                ((LottieAnimationViewManagerInterface) this.mViewManager).setSourceDotLottieURI(t10, obj != null ? (String) obj : null);
                break;
            case '\t':
                ((LottieAnimationViewManagerInterface) this.mViewManager).setLoop(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '\n':
                ((LottieAnimationViewManagerInterface) this.mViewManager).setDummy(t10, (ReadableMap) obj);
                break;
            case 11:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setSpeed(t10, obj == null ? 0.0d : ((Double) obj).doubleValue());
                break;
            case '\f':
                ((LottieAnimationViewManagerInterface) this.mViewManager).setHardwareAccelerationAndroid(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '\r':
                ((LottieAnimationViewManagerInterface) this.mViewManager).setEnableSafeModeAndroid(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 14:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setRenderMode(t10, obj != null ? (String) obj : null);
                break;
            case 15:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setColorFilters(t10, (ReadableArray) obj);
                break;
            case 16:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setAutoPlay(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 17:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setResizeMode(t10, obj != null ? (String) obj : null);
                break;
            case 18:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setEnableMergePathsAndroidForKitKatAndAbove(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
