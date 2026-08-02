package androidx.lifecycle;

import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.collections.builders.MapBuilder;
import xsna.jgp;
import xsna.q1h0;
import xsna.rgn;
import xsna.xh50;

/* compiled from: SavedStateHandle.android.kt */
/* loaded from: classes12.dex */
public final class w {
    public final q1h0 a;

    /* compiled from: SavedStateHandle.android.kt */
    public static final class a {
        public static w a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                bundle = bundle2;
            }
            if (bundle == null) {
                return new w();
            }
            bundle.setClassLoader(w.class.getClassLoader());
            MapBuilder mapBuilder = new MapBuilder(bundle.size());
            for (String str : bundle.keySet()) {
                mapBuilder.put(str, bundle.get(str));
            }
            return new w(mapBuilder.h());
        }
    }

    public w(MapBuilder mapBuilder) {
        new LinkedHashMap();
        this.a = new q1h0(mapBuilder);
    }

    public final <T> T a(String str) {
        T t;
        q1h0 q1h0Var = this.a;
        LinkedHashMap linkedHashMap = q1h0Var.a;
        LinkedHashMap linkedHashMap2 = q1h0Var.d;
        try {
            xh50 xh50Var = (xh50) linkedHashMap2.get(str);
            if (xh50Var != null && (t = (T) xh50Var.getValue()) != null) {
                return t;
            }
            return (T) linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            q1h0Var.c.remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public final rgn b() {
        return this.a.e;
    }

    public w() {
        new LinkedHashMap();
        this.a = new q1h0(jgp.b);
    }
}
