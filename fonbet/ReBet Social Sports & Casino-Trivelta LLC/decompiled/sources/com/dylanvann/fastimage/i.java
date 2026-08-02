package com.dylanvann.fastimage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.m;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class i extends AppCompatImageView {

    /* renamed from: d, reason: collision with root package name */
    public boolean f30206d;

    /* renamed from: e, reason: collision with root package name */
    public ReadableMap f30207e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f30208f;

    /* renamed from: g, reason: collision with root package name */
    public B4.h f30209g;

    public i(Context context) {
        super(context);
        this.f30206d = false;
        this.f30207e = null;
        this.f30208f = null;
    }

    public void c(m mVar) {
        if (mVar == null || getTag() == null || !(getTag() instanceof L4.d)) {
            return;
        }
        mVar.q(this);
    }

    public final boolean d(String str) {
        return str == null || str.trim().isEmpty();
    }

    public void e(FastImageViewManager fastImageViewManager, m mVar, Map map) {
        if (this.f30206d) {
            ReadableMap readableMap = this.f30207e;
            if ((readableMap == null || !readableMap.hasKey("uri") || d(this.f30207e.getString("uri"))) && this.f30208f == null) {
                c(mVar);
                B4.h hVar = this.f30209g;
                if (hVar != null) {
                    b.d(hVar.h());
                }
                setImageDrawable(null);
                return;
            }
            f c10 = g.c(getContext(), this.f30207e);
            if (c10 != null && c10.getUri().toString().length() == 0) {
                RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((ThemedReactContext) getContext()).getJSModule(RCTEventEmitter.class);
                int id2 = getId();
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("message", "Invalid source prop:" + this.f30207e);
                rCTEventEmitter.receiveEvent(id2, "onFastImageError", writableNativeMap);
                c(mVar);
                B4.h hVar2 = this.f30209g;
                if (hVar2 != null) {
                    b.d(hVar2.h());
                }
                setImageDrawable(null);
                return;
            }
            B4.h a10 = c10 == null ? null : c10.a();
            this.f30209g = a10;
            c(mVar);
            String h10 = a10 == null ? null : a10.h();
            if (a10 != null) {
                b.c(h10, fastImageViewManager);
                List list = (List) map.get(h10);
                if (list != null && !list.contains(this)) {
                    list.add(this);
                } else if (list == null) {
                    map.put(h10, new ArrayList(Collections.singletonList(this)));
                }
            }
            ThemedReactContext themedReactContext = (ThemedReactContext) getContext();
            if (c10 != null) {
                ((RCTEventEmitter) themedReactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "onFastImageLoadStart", new WritableNativeMap());
            }
            if (mVar != null) {
                com.bumptech.glide.l a11 = mVar.v(c10 != null ? c10.c() : null).a(((L4.h) g.d(themedReactContext, c10, this.f30207e).U(this.f30208f)).h(this.f30208f));
                if (h10 != null) {
                    a11.z0(new e(h10));
                }
                a11.x0(this);
            }
        }
    }

    public void f(Drawable drawable) {
        this.f30206d = true;
        this.f30208f = drawable;
    }

    public void g(ReadableMap readableMap) {
        this.f30206d = true;
        this.f30207e = readableMap;
    }
}
