package com.dylanvann.fastimage;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.q;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* loaded from: classes2.dex */
public class e implements L4.g {

    /* renamed from: a, reason: collision with root package name */
    public final String f30199a;

    public e(String str) {
        this.f30199a = str;
    }

    public static WritableMap a(Drawable drawable) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("width", drawable.getIntrinsicWidth());
        writableNativeMap.putInt("height", drawable.getIntrinsicHeight());
        return writableNativeMap;
    }

    @Override // L4.g
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean f(Drawable drawable, Object obj, M4.j jVar, com.bumptech.glide.load.a aVar, boolean z10) {
        if (!(jVar instanceof M4.f)) {
            return false;
        }
        i iVar = (i) ((M4.f) jVar).l();
        RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((ThemedReactContext) iVar.getContext()).getJSModule(RCTEventEmitter.class);
        int id2 = iVar.getId();
        rCTEventEmitter.receiveEvent(id2, "onFastImageLoad", a(drawable));
        rCTEventEmitter.receiveEvent(id2, "onFastImageLoadEnd", new WritableNativeMap());
        return false;
    }

    @Override // L4.g
    public boolean k(q qVar, Object obj, M4.j jVar, boolean z10) {
        b.d(this.f30199a);
        if (!(jVar instanceof M4.f)) {
            return false;
        }
        i iVar = (i) ((M4.f) jVar).l();
        RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((ThemedReactContext) iVar.getContext()).getJSModule(RCTEventEmitter.class);
        int id2 = iVar.getId();
        rCTEventEmitter.receiveEvent(id2, "onFastImageError", new WritableNativeMap());
        rCTEventEmitter.receiveEvent(id2, "onFastImageLoadEnd", new WritableNativeMap());
        return false;
    }
}
