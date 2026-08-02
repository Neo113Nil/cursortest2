package org.maplibre.android;

import Lm0.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import ch.C5834e;
import org.maplibre.android.storage.FileSource;
import org.maplibre.android.util.DefaultStyle;
import org.maplibre.android.util.TileServerOptions;

@Keep
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes10.dex */
public final class MapLibre {
    private static MapLibre INSTANCE = null;
    private static final String TAG = "Mbgl-MapLibre";
    private static d moduleProvider;
    private String apiKey;
    private Context context;
    private TileServerOptions tileServerOptions;

    MapLibre(@NonNull Context context, String str) {
        this.context = context;
        this.apiKey = str;
    }

    public static String getApiKey() {
        validateMapLibre();
        return INSTANCE.apiKey;
    }

    @NonNull
    public static Context getApplicationContext() {
        validateMapLibre();
        return INSTANCE.context;
    }

    private static AssetManager getAssetManager() {
        return getApplicationContext().getResources().getAssets();
    }

    @NonNull
    public static synchronized MapLibre getInstance(@NonNull Context context) {
        MapLibre mapLibre;
        synchronized (MapLibre.class) {
            try {
                org.maplibre.android.utils.e.b(context);
                org.maplibre.android.utils.e.a(TAG);
                if (INSTANCE == null) {
                    Context applicationContext = context.getApplicationContext();
                    FileSource.e(applicationContext);
                    INSTANCE = new MapLibre(applicationContext, null);
                    org.maplibre.android.net.b.c(applicationContext);
                }
                TileServerOptions a11 = TileServerOptions.a(f.MapLibre);
                MapLibre mapLibre2 = INSTANCE;
                mapLibre2.tileServerOptions = a11;
                mapLibre2.apiKey = null;
                FileSource b11 = FileSource.b(context);
                b11.setTileServerOptions(a11);
                b11.setApiKey(null);
                mapLibre = INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mapLibre;
    }

    @NonNull
    public static d getModuleProvider() {
        if (moduleProvider == null) {
            moduleProvider = new C5834e();
        }
        return moduleProvider;
    }

    public static DefaultStyle getPredefinedStyle(String str) {
        validateMapLibre();
        TileServerOptions tileServerOptions = INSTANCE.tileServerOptions;
        if (tileServerOptions == null) {
            return null;
        }
        for (DefaultStyle defaultStyle : tileServerOptions.b()) {
            if (defaultStyle.getName().equalsIgnoreCase(str)) {
                return defaultStyle;
            }
        }
        return null;
    }

    public static DefaultStyle[] getPredefinedStyles() {
        validateMapLibre();
        TileServerOptions tileServerOptions = INSTANCE.tileServerOptions;
        if (tileServerOptions != null) {
            return tileServerOptions.b();
        }
        return null;
    }

    public static TileServerOptions getTileServerOptions() {
        validateMapLibre();
        return INSTANCE.tileServerOptions;
    }

    public static boolean hasInstance() {
        return INSTANCE != null;
    }

    static boolean isApiKeyValid(String str) {
        if (str == null) {
            return false;
        }
        return !str.trim().toLowerCase(Vf.a.f32686a).isEmpty();
    }

    public static synchronized Boolean isConnected() {
        Boolean valueOf;
        synchronized (MapLibre.class) {
            validateMapLibre();
            valueOf = Boolean.valueOf(org.maplibre.android.net.b.c(INSTANCE.context).d());
        }
        return valueOf;
    }

    public static void setApiKey(String str) {
        validateMapLibre();
        throwIfApiKeyInvalid(str);
        INSTANCE.apiKey = str;
        FileSource.b(getApplicationContext()).setApiKey(str);
    }

    public static synchronized void setConnected(Boolean bool) {
        synchronized (MapLibre.class) {
            validateMapLibre();
            org.maplibre.android.net.b.c(INSTANCE.context).g(bool);
        }
    }

    public static void setModuleProvider(d dVar) {
        moduleProvider = dVar;
    }

    public static void throwIfApiKeyInvalid(String str) {
        if (!isApiKeyValid(str)) {
            throw new Wf.c(Nk.a.b("A valid API key is required, currently provided key is: ", str));
        }
    }

    private static void validateMapLibre() {
        if (INSTANCE == null) {
            throw new Wf.c();
        }
    }

    MapLibre(@NonNull Context context, String str, @NonNull TileServerOptions tileServerOptions) {
        this.context = context;
        this.apiKey = str;
        this.tileServerOptions = tileServerOptions;
    }

    @NonNull
    public static synchronized MapLibre getInstance(@NonNull Context context, String str, f fVar) {
        MapLibre mapLibre;
        synchronized (MapLibre.class) {
            try {
                org.maplibre.android.utils.e.b(context);
                org.maplibre.android.utils.e.a(TAG);
                MapLibre mapLibre2 = INSTANCE;
                if (mapLibre2 == null) {
                    Lm0.a.d(new a.c[0]);
                    Context applicationContext = context.getApplicationContext();
                    FileSource.e(applicationContext);
                    INSTANCE = new MapLibre(applicationContext, str);
                    org.maplibre.android.net.b.c(applicationContext);
                } else {
                    mapLibre2.apiKey = str;
                }
                TileServerOptions a11 = TileServerOptions.a(fVar);
                INSTANCE.tileServerOptions = a11;
                FileSource b11 = FileSource.b(context);
                b11.setTileServerOptions(a11);
                b11.setApiKey(str);
                mapLibre = INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mapLibre;
    }
}
