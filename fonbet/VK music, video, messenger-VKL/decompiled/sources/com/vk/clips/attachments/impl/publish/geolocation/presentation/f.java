package com.vk.clips.attachments.impl.publish.geolocation.presentation;

import com.vk.dto.clips.ClipsVideoItemLocation;
import com.vk.dto.geo.GeoLocation;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.ms9;
import xsna.xl50;

/* compiled from: ClipsGeoPickerPatch.kt */
/* loaded from: classes16.dex */
public interface f extends xl50 {

    /* compiled from: ClipsGeoPickerPatch.kt */
    public static final class a implements f {
        public static final a b = new a();
    }

    /* compiled from: ClipsGeoPickerPatch.kt */
    public static final class b implements f {
        public final List<GeoLocation> b;

        public b(List<GeoLocation> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("SetLoaded(locations="), this.b);
        }
    }

    /* compiled from: ClipsGeoPickerPatch.kt */
    public static final class c implements f {
        public static final c b = new c();
    }

    /* compiled from: ClipsGeoPickerPatch.kt */
    public static final class d implements f {
        public final String b;
        public final String c;

        public d(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetResultKeys(requestKey=");
            sb.append(this.b);
            sb.append(", bundleKey=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsGeoPickerPatch.kt */
    public static final class e implements f {
    }

    /* compiled from: ClipsGeoPickerPatch.kt */
    /* renamed from: com.vk.clips.attachments.impl.publish.geolocation.presentation.f$f, reason: collision with other inner class name */
    public static final class C0548f implements f {
        public final List<ClipsVideoItemLocation> b;

        public C0548f(List<ClipsVideoItemLocation> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0548f) && epx.f(this.b, ((C0548f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("UpdateRawLocations(locations="), this.b);
        }
    }
}
