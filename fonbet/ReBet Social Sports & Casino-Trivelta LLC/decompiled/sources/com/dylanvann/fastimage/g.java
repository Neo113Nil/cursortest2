package com.dylanvann.fastimage;

import B4.k;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.uimanager.ViewProps;
import com.twilio.voice.EventKeys;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Drawable f30202a = new ColorDrawable(0);

    /* renamed from: b, reason: collision with root package name */
    public static final Map f30203b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final Map f30204c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final Map f30205d = new c();

    public class a extends HashMap {
        public a() {
            put("immutable", com.dylanvann.fastimage.a.IMMUTABLE);
            put("web", com.dylanvann.fastimage.a.WEB);
            put("cacheOnly", com.dylanvann.fastimage.a.CACHE_ONLY);
        }
    }

    public class b extends HashMap {
        public b() {
            put("low", com.bumptech.glide.h.LOW);
            put("normal", com.bumptech.glide.h.NORMAL);
            put("high", com.bumptech.glide.h.HIGH);
        }
    }

    public class c extends HashMap {
        public c() {
            put("contain", ImageView.ScaleType.FIT_CENTER);
            put("cover", ImageView.ScaleType.CENTER_CROP);
            put("stretch", ImageView.ScaleType.FIT_XY);
            put("center", ImageView.ScaleType.CENTER_INSIDE);
        }
    }

    public static /* synthetic */ class d {
        static final /* synthetic */ int[] $SwitchMap$com$dylanvann$fastimage$FastImageCacheControl;

        static {
            int[] iArr = new int[com.dylanvann.fastimage.a.values().length];
            $SwitchMap$com$dylanvann$fastimage$FastImageCacheControl = iArr;
            try {
                iArr[com.dylanvann.fastimage.a.WEB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$dylanvann$fastimage$FastImageCacheControl[com.dylanvann.fastimage.a.CACHE_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$dylanvann$fastimage$FastImageCacheControl[com.dylanvann.fastimage.a.IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static com.dylanvann.fastimage.a a(ReadableMap readableMap) {
        return (com.dylanvann.fastimage.a) h("cache", "immutable", f30203b, readableMap);
    }

    public static B4.i b(ReadableMap readableMap) {
        B4.i iVar = B4.i.f731b;
        if (!readableMap.hasKey("headers")) {
            return iVar;
        }
        ReadableMap map = readableMap.getMap("headers");
        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
        k.a aVar = new k.a();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            aVar.b(nextKey, map.getString(nextKey));
        }
        return aVar.c();
    }

    public static f c(Context context, ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        return new f(context, readableMap.getString("uri"), b(readableMap));
    }

    public static L4.h d(Context context, f fVar, ReadableMap readableMap) {
        com.bumptech.glide.h e10 = e(readableMap);
        com.dylanvann.fastimage.a a10 = a(readableMap);
        com.bumptech.glide.load.engine.j jVar = com.bumptech.glide.load.engine.j.f29827e;
        int i10 = d.$SwitchMap$com$dylanvann$fastimage$FastImageCacheControl[a10.ordinal()];
        boolean z10 = false;
        boolean z11 = true;
        if (i10 == 1) {
            jVar = com.bumptech.glide.load.engine.j.f29824b;
        } else if (i10 != 2) {
            z11 = false;
        } else {
            z11 = false;
            z10 = true;
        }
        L4.h hVar = (L4.h) ((L4.h) ((L4.h) ((L4.h) ((L4.h) new L4.h().f(jVar)).N(z10)).c0(z11)).V(e10)).U(f30202a);
        return fVar.get_isResource() ? (L4.h) hVar.a(L4.h.n0(O4.a.c(context))) : hVar;
    }

    public static com.bumptech.glide.h e(ReadableMap readableMap) {
        return (com.bumptech.glide.h) h(EventKeys.PRIORITY, "normal", f30204c, readableMap);
    }

    public static ImageView.ScaleType f(String str) {
        return (ImageView.ScaleType) g(ViewProps.RESIZE_MODE, "cover", f30205d, str);
    }

    public static Object g(String str, String str2, Map map, String str3) {
        if (str3 != null) {
            str2 = str3;
        }
        Object obj = map.get(str2);
        if (obj != null) {
            return obj;
        }
        throw new JSApplicationIllegalArgumentException("FastImage, invalid " + str + " : " + str2);
    }

    public static Object h(String str, String str2, Map map, ReadableMap readableMap) {
        String str3 = null;
        if (readableMap != null) {
            try {
                str3 = readableMap.getString(str);
            } catch (NoSuchKeyException unused) {
            }
        }
        return g(str, str2, map, str3);
    }
}
