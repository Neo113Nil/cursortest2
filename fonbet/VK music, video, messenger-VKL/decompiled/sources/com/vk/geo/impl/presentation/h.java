package com.vk.geo.impl.presentation;

import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.ZoomLevel;
import xsna.do00;
import xsna.epx;
import xsna.m300;
import xsna.vby;

/* compiled from: GeoSideEffect.kt */
/* loaded from: classes2.dex */
public interface h {

    /* compiled from: GeoSideEffect.kt */
    @vby
    public static final class a implements h {
        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "ClearMap(onlyStyles=false)";
        }
    }

    /* compiled from: GeoSideEffect.kt */
    @vby
    public static final class b implements h {
        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return epx.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "DebugMarkers(markers=null)";
        }
    }

    /* compiled from: GeoSideEffect.kt */
    public static final class c implements h {
    }

    /* compiled from: GeoSideEffect.kt */
    public static final class d implements h {
    }

    /* compiled from: GeoSideEffect.kt */
    public static final class e implements h {
        public final BoundingBox a;
        public final long b;

        public e(BoundingBox boundingBox) {
            int i = m300.b;
            this.a = boundingBox;
            this.b = -1L;
        }
    }

    /* compiled from: GeoSideEffect.kt */
    public static final class f implements h {
        public final long a;
        public final ZoomLevel b;
        public final boolean c;
        public final long d;

        public f(long j, ZoomLevel zoomLevel, boolean z, int i) {
            zoomLevel = (i & 2) != 0 ? null : zoomLevel;
            z = (i & 4) != 0 ? true : z;
            int i2 = m300.b;
            this.a = j;
            this.b = zoomLevel;
            this.c = z;
            this.d = -1L;
        }
    }

    /* compiled from: GeoSideEffect.kt */
    public static final class g implements h {
        public final do00 a;
        public final int b;

        public g(do00 do00Var, int i) {
            this.a = do00Var;
            this.b = i;
        }
    }
}
