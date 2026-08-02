package org.maplibre.android.maps;

import B0.A0;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.maplibre.android.log.Logger;
import org.maplibre.android.style.layers.CannotAddLayerException;
import org.maplibre.android.style.layers.Layer;
import org.maplibre.android.style.layers.RasterLayer;
import org.maplibre.android.style.layers.TransitionOptions;
import org.maplibre.android.style.sources.CannotAddSourceException;
import org.maplibre.android.style.sources.RasterSource;
import org.maplibre.android.style.sources.Source;

/* loaded from: classes10.dex */
public class Style {

    /* renamed from: a, reason: collision with root package name */
    private final NativeMap f79821a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<String, Source> f79822b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, Layer> f79823c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, Bitmap> f79824d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final Builder f79825e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f79826f;

    private static class BitmapImageConversionTask extends AsyncTask<Builder.ImageWrapper, Void, Image[]> {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<NativeMap> f79827a;

        BitmapImageConversionTask(NativeMap nativeMap) {
            this.f79827a = new WeakReference<>(nativeMap);
        }

        @Override // android.os.AsyncTask
        @NonNull
        protected final Image[] doInBackground(Builder.ImageWrapper[] imageWrapperArr) {
            ArrayList arrayList = new ArrayList();
            for (Builder.ImageWrapper imageWrapper : imageWrapperArr) {
                arrayList.add(Style.t(imageWrapper));
            }
            return (Image[]) arrayList.toArray(new Image[arrayList.size()]);
        }

        @Override // android.os.AsyncTask
        protected final void onPostExecute(@NonNull Image[] imageArr) {
            Image[] imageArr2 = imageArr;
            super.onPostExecute(imageArr2);
            NativeMap nativeMap = this.f79827a.get();
            if (nativeMap == null || nativeMap.U()) {
                return;
            }
            nativeMap.L(imageArr2);
        }
    }

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f79828a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f79829b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f79830c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private TransitionOptions f79831d;

        /* renamed from: e, reason: collision with root package name */
        private String f79832e;

        public static class ImageWrapper {

            /* renamed from: a, reason: collision with root package name */
            Bitmap f79833a;

            /* renamed from: b, reason: collision with root package name */
            String f79834b;

            public ImageWrapper() {
                throw null;
            }

            public ImageWrapper(Bitmap bitmap, String str) {
                this.f79834b = str;
                this.f79833a = bitmap;
            }
        }

        public class LayerAboveWrapper extends LayerWrapper {
        }

        public class LayerAtWrapper extends LayerWrapper {
        }

        public class LayerBelowWrapper extends LayerWrapper {
        }

        public class LayerWrapper {

            /* renamed from: a, reason: collision with root package name */
            RasterLayer f79835a;
        }

        @NonNull
        public final void e(@NonNull String str) {
            this.f79832e = str;
        }

        public final String f() {
            return this.f79832e;
        }

        @NonNull
        public final void g(@NonNull RasterLayer rasterLayer) {
            ArrayList arrayList = this.f79829b;
            LayerWrapper layerWrapper = new LayerWrapper();
            layerWrapper.f79835a = rasterLayer;
            arrayList.add(layerWrapper);
        }

        @NonNull
        public final void h(@NonNull RasterSource rasterSource) {
            this.f79828a.add(rasterSource);
        }

        @NonNull
        public final void i(@NonNull TransitionOptions transitionOptions) {
            this.f79831d = transitionOptions;
        }
    }

    public interface OnStyleLoaded {
        void a(@NonNull Style style);
    }

    Style(Builder builder, NativeMap nativeMap) {
        this.f79825e = builder;
        this.f79821a = nativeMap;
    }

    public static Image t(Builder.ImageWrapper imageWrapper) {
        Bitmap bitmap = imageWrapper.f79833a;
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            bitmap = bitmap.copy(config2, false);
        }
        ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        return new Image(allocate.array(), bitmap.getDensity() / 160.0f, imageWrapper.f79834b, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    private void u(String str) {
        if (!this.f79826f) {
            throw new IllegalStateException(A0.b("Calling ", str, " when a newer style is loading/has loaded."));
        }
    }

    public final void a(@NonNull Bitmap bitmap, @NonNull String str) {
        u("addImage");
        this.f79821a.L(new Image[]{t(new Builder.ImageWrapper(bitmap, str))});
    }

    public final void b(@NonNull HashMap hashMap) {
        u("addImages");
        BitmapImageConversionTask bitmapImageConversionTask = new BitmapImageConversionTask(this.f79821a);
        Builder.ImageWrapper[] imageWrapperArr = new Builder.ImageWrapper[hashMap.size()];
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        for (int i11 = 0; i11 < hashMap.size(); i11++) {
            String str = (String) arrayList.get(i11);
            imageWrapperArr[i11] = new Builder.ImageWrapper((Bitmap) hashMap.get(str), str);
        }
        bitmapImageConversionTask.execute(imageWrapperArr);
    }

    public final void c(@NonNull Layer layer) {
        u("addLayer");
        this.f79821a.t(layer);
        this.f79823c.put(layer.b(), layer);
    }

    public final void d(@NonNull Layer layer, @NonNull String str) {
        u("addLayerAbove");
        this.f79821a.r(layer, str);
        this.f79823c.put(layer.b(), layer);
    }

    public final void e(@NonNull Layer layer, @NonNull String str) {
        u("addLayerBelow");
        this.f79821a.G(layer, str);
        this.f79823c.put(layer.b(), layer);
    }

    public final void f(@NonNull Source source) {
        u("addSource");
        this.f79821a.u(source);
        this.f79822b.put(source.getId(), source);
    }

    final void g() {
        this.f79826f = false;
        HashMap<String, Layer> hashMap = this.f79823c;
        for (Layer layer : hashMap.values()) {
            if (layer != null) {
                layer.f();
            }
        }
        HashMap<String, Source> hashMap2 = this.f79822b;
        for (Source source : hashMap2.values()) {
            if (source != null) {
                source.setDetached();
            }
        }
        HashMap<String, Bitmap> hashMap3 = this.f79824d;
        for (Map.Entry<String, Bitmap> entry : hashMap3.entrySet()) {
            this.f79821a.M(entry.getKey());
            entry.getValue().recycle();
        }
        hashMap2.clear();
        hashMap.clear();
        hashMap3.clear();
    }

    public final void h(@NonNull String str) {
        u("getImage");
        this.f79821a.getImage(str);
    }

    public final Layer i(@NonNull String str) {
        u("getLayer");
        Layer layer = this.f79823c.get(str);
        return layer == null ? this.f79821a.x(str) : layer;
    }

    public final <T extends Layer> T j(@NonNull String str) {
        u("getLayerAs");
        return (T) this.f79821a.x(str);
    }

    @NonNull
    public final List<Layer> k() {
        u("getLayers");
        return this.f79821a.F();
    }

    @NonNull
    public final List<Source> l() {
        u("getSources");
        return this.f79821a.d();
    }

    @NonNull
    public final String m() {
        u("getUri");
        return this.f79821a.w();
    }

    public final boolean n() {
        return this.f79826f;
    }

    final void o() {
        NativeMap nativeMap = this.f79821a;
        if (this.f79826f) {
            return;
        }
        this.f79826f = true;
        Builder builder = this.f79825e;
        Iterator it = builder.f79828a.iterator();
        while (it.hasNext()) {
            try {
                f((Source) it.next());
            } catch (CannotAddSourceException e11) {
                Logger.e("Style", "Failed to add source", e11);
            }
        }
        try {
            Iterator it2 = builder.f79829b.iterator();
            while (it2.hasNext()) {
                Builder.LayerWrapper layerWrapper = (Builder.LayerWrapper) it2.next();
                if (layerWrapper instanceof Builder.LayerAtWrapper) {
                    RasterLayer rasterLayer = layerWrapper.f79835a;
                    ((Builder.LayerAtWrapper) layerWrapper).getClass();
                    u("addLayerAbove");
                    nativeMap.B(rasterLayer);
                    this.f79823c.put(rasterLayer.b(), rasterLayer);
                } else if (layerWrapper instanceof Builder.LayerAboveWrapper) {
                    RasterLayer rasterLayer2 = layerWrapper.f79835a;
                    ((Builder.LayerAboveWrapper) layerWrapper).getClass();
                    d(rasterLayer2, null);
                } else if (layerWrapper instanceof Builder.LayerBelowWrapper) {
                    RasterLayer rasterLayer3 = layerWrapper.f79835a;
                    ((Builder.LayerBelowWrapper) layerWrapper).getClass();
                    e(rasterLayer3, null);
                } else {
                    e(layerWrapper.f79835a, "org.maplibre.annotations.points");
                }
            }
        } catch (CannotAddLayerException e12) {
            Logger.e("Style", "Failed to add layer", e12);
        }
        Iterator it3 = builder.f79830c.iterator();
        while (it3.hasNext()) {
            Builder.ImageWrapper imageWrapper = (Builder.ImageWrapper) it3.next();
            a(imageWrapper.f79833a, imageWrapper.f79834b);
        }
        if (builder.f79831d != null) {
            TransitionOptions transitionOptions = builder.f79831d;
            u("setTransition");
            nativeMap.m(transitionOptions);
        }
    }

    public final void p(@NonNull String str) {
        u("removeImage");
        this.f79821a.M(str);
    }

    public final void q(@NonNull String str) {
        u("removeLayer");
        this.f79823c.remove(str);
        this.f79821a.y(str);
    }

    public final void r(@NonNull Layer layer) {
        u("removeLayer");
        this.f79823c.remove(layer.b());
        this.f79821a.o(layer);
    }

    public final void s(@NonNull String str) {
        u("removeSource");
        if (this.f79821a.l(str)) {
            this.f79822b.remove(str);
        }
    }
}
