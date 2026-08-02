package com.dylanvann.fastimage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PorterDuff;
import androidx.annotation.NonNull;
import com.bumptech.glide.m;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
class FastImageViewManager extends SimpleViewManager<i> implements d {
    static final String REACT_CLASS = "FastImageView";
    static final String REACT_ON_LOAD_START_EVENT = "onFastImageLoadStart";
    static final String REACT_ON_PROGRESS_EVENT = "onFastImageProgress";
    private static final Map<String, List<i>> VIEWS_FOR_URLS = new WeakHashMap();
    private m requestManager = null;

    private static Activity getActivityFromContext(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ThemedReactContext)) {
            return null;
        }
        Context baseContext = ((ThemedReactContext) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        if (!(baseContext instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext2 = ((ContextWrapper) baseContext).getBaseContext();
        if (baseContext2 instanceof Activity) {
            return (Activity) baseContext2;
        }
        return null;
    }

    private static boolean isActivityDestroyed(Activity activity) {
        return activity.isDestroyed() || activity.isFinishing();
    }

    private static boolean isValidContextForGlide(Context context) {
        if (getActivityFromContext(context) == null) {
            return false;
        }
        return !isActivityDestroyed(r0);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.builder().put(REACT_ON_LOAD_START_EVENT, MapBuilder.of("registrationName", REACT_ON_LOAD_START_EVENT)).put(REACT_ON_PROGRESS_EVENT, MapBuilder.of("registrationName", REACT_ON_PROGRESS_EVENT)).put("onFastImageLoad", MapBuilder.of("registrationName", "onFastImageLoad")).put("onFastImageError", MapBuilder.of("registrationName", "onFastImageError")).put("onFastImageLoadEnd", MapBuilder.of("registrationName", "onFastImageLoadEnd")).build();
    }

    @Override // com.dylanvann.fastimage.d
    public float getGranularityPercentage() {
        return 0.5f;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.dylanvann.fastimage.d
    public void onProgress(String str, long j10, long j11) {
        List<i> list = VIEWS_FOR_URLS.get(str);
        if (list != null) {
            for (i iVar : list) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putInt("loaded", (int) j10);
                writableNativeMap.putInt("total", (int) j11);
                ((RCTEventEmitter) ((ThemedReactContext) iVar.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(iVar.getId(), REACT_ON_PROGRESS_EVENT, writableNativeMap);
            }
        }
    }

    @ReactProp(name = "defaultSource")
    public void setDefaultSource(i iVar, String str) {
        ResourceDrawableIdHelper.getInstance();
        iVar.f(ResourceDrawableIdHelper.getResourceDrawable(iVar.getContext(), str));
    }

    @ReactProp(name = ViewProps.RESIZE_MODE)
    public void setResizeMode(i iVar, String str) {
        iVar.setScaleType(g.f(str));
    }

    @ReactProp(name = "source")
    public void setSource(i iVar, ReadableMap readableMap) {
        iVar.g(readableMap);
    }

    @ReactProp(customType = "Color", name = "tintColor")
    public void setTintColor(i iVar, Integer num) {
        if (num == null) {
            iVar.clearColorFilter();
        } else {
            iVar.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public i createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        if (isValidContextForGlide(themedReactContext)) {
            this.requestManager = com.bumptech.glide.c.u(themedReactContext);
        }
        return new i(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NonNull i iVar) {
        super.onAfterUpdateTransaction((FastImageViewManager) iVar);
        iVar.e(this, this.requestManager, VIEWS_FOR_URLS);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NonNull i iVar) {
        iVar.c(this.requestManager);
        B4.h hVar = iVar.f30209g;
        if (hVar != null) {
            String hVar2 = hVar.toString();
            b.d(hVar2);
            Map<String, List<i>> map = VIEWS_FOR_URLS;
            List<i> list = map.get(hVar2);
            if (list != null) {
                list.remove(iVar);
                if (list.size() == 0) {
                    map.remove(hVar2);
                }
            }
        }
        super.onDropViewInstance((FastImageViewManager) iVar);
    }
}
