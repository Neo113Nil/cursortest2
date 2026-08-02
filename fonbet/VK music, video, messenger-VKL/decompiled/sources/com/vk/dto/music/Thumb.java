package com.vk.dto.music;

import android.net.Uri;
import android.util.SparseArray;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.brm0;
import xsna.bxx;
import xsna.d370;
import xsna.dso0;
import xsna.epx;
import xsna.glw;
import xsna.shy;
import xsna.zcl;
import xsna.zik0;

/* compiled from: Thumb.kt */
/* loaded from: classes18.dex */
public final class Thumb extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<Thumb> CREATOR = new c();
    public static final b f = new b();
    public final String b;
    public final int c;
    public final int d;
    public final SparseArray<Uri> e;

    /* compiled from: Thumb.kt */
    public static final class a {
        public static ArrayList a(JSONArray jSONArray) {
            int length = jSONArray.length();
            if (length <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add((Thumb) Thumb.f.a(optJSONObject));
                }
            }
            return arrayList;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<Thumb> {
        @Override // xsna.aay
        public final Thumb a(JSONObject jSONObject) {
            String optString = jSONObject.optString("id");
            int optInt = jSONObject.optInt("width");
            int optInt2 = jSONObject.optInt("height");
            SparseArray sparseArray = new SparseArray();
            JSONArray optJSONArray = jSONObject.optJSONArray("sizes");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        int optInt3 = optJSONObject.optInt("width");
                        Serializer.c<Thumb> cVar = Thumb.CREATOR;
                        String optString2 = optJSONObject.optString("src");
                        sparseArray.append(optInt3, optString2 != null ? Uri.parse(optString2) : Uri.EMPTY);
                    }
                }
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (brm0.B(next, "photo_", false)) {
                    int intValue = Integer.valueOf(next.substring(6)).intValue();
                    Serializer.c<Thumb> cVar2 = Thumb.CREATOR;
                    String optString3 = jSONObject.optString(next);
                    sparseArray.append(intValue, optString3 != null ? Uri.parse(optString3) : Uri.EMPTY);
                }
            }
            return new Thumb(optString, optInt, optInt2, sparseArray);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<Thumb> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Thumb a(Serializer serializer) {
            String str;
            String H = serializer.H();
            int u = serializer.u();
            int u2 = serializer.u();
            SparseArray sparseArray = new SparseArray();
            int u3 = serializer.u();
            if (u3 > 0) {
                for (int i = 0; i < u3; i++) {
                    int u4 = serializer.u();
                    try {
                        str = serializer.H();
                    } catch (Throwable unused) {
                        str = null;
                    }
                    Serializer.c<Thumb> cVar = Thumb.CREATOR;
                    sparseArray.append(u4, str != null ? Uri.parse(str) : Uri.EMPTY);
                }
            }
            return new Thumb(H, u, u2, sparseArray);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Thumb[i];
        }
    }

    public /* synthetic */ Thumb(String str, int i, int i2, SparseArray sparseArray, int i3, zcl zclVar) {
        this(str, i, i2, (i3 & 8) != 0 ? new SparseArray() : sparseArray);
    }

    public static Uri Eb(SparseArray sparseArray, int i) {
        if (sparseArray.keyAt(i) < 10) {
            return null;
        }
        return (Uri) sparseArray.valueAt(i);
    }

    public static Thumb zb(Thumb thumb, SparseArray sparseArray, int i) {
        String str = thumb.b;
        int i2 = thumb.c;
        int i3 = thumb.d;
        if ((i & 8) != 0) {
            sparseArray = thumb.e;
        }
        thumb.getClass();
        return new Thumb(str, i2, i3, sparseArray);
    }

    public final String Ab(int i, boolean z) {
        Uri Cb = Cb(i, z);
        if (Cb != null) {
            return Cb.toString();
        }
        return null;
    }

    public final Uri Cb(int i, boolean z) {
        SparseArray<Uri> sparseArray = this.e;
        int size = sparseArray.size();
        Uri uri = null;
        if (size != 0) {
            int i2 = 0;
            if (size == 1) {
                return Eb(sparseArray, 0);
            }
            if (glw.a().b() || z) {
                int size2 = sparseArray.size() - 1;
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    int i3 = i2 + 1;
                    if (Math.abs(i - sparseArray.keyAt(i2)) < Math.abs(i - sparseArray.keyAt(i3))) {
                        if (r5 / i >= 0.05d) {
                            i2 = i3;
                        }
                        uri = Eb(sparseArray, i2);
                    } else {
                        i2 = i3;
                    }
                }
                return uri == null ? Eb(sparseArray, size - 1) : uri;
            }
            if (!zik0.c(sparseArray)) {
                int keyAt = sparseArray.keyAt(0);
                int size3 = sparseArray.size();
                for (int i4 = 1; i4 < size3; i4++) {
                    int keyAt2 = sparseArray.keyAt(i4);
                    if (keyAt2 < keyAt) {
                        keyAt = keyAt2;
                        i2 = i4;
                    }
                }
                return Eb(sparseArray, i2);
            }
        }
        return null;
    }

    public final SparseArray<Uri> Fb() {
        return this.e;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.S(this.c);
        serializer.S(this.d);
        SparseArray<Uri> sparseArray = this.e;
        int size = sparseArray.size();
        serializer.S(size);
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                serializer.S(sparseArray.keyAt(i));
                Uri valueAt = sparseArray.valueAt(i);
                serializer.j0(valueAt != null ? valueAt.toString() : null);
            }
        }
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new dso0(this, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Thumb)) {
            return false;
        }
        Thumb thumb = (Thumb) obj;
        if (!epx.f(this.b, thumb.b) || this.c != thumb.c || this.d != thumb.d) {
            return false;
        }
        SparseArray<Uri> sparseArray = this.e;
        if (sparseArray.size() != thumb.e.size()) {
            return false;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            if (sparseArray.keyAt(i) != thumb.e.keyAt(i) || !epx.f(sparseArray.valueAt(i), thumb.e.valueAt(i))) {
                return false;
            }
        }
        return true;
    }

    public final int getHeight() {
        return this.d;
    }

    public final String getId() {
        return this.b;
    }

    public final int getWidth() {
        return this.c;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.c);
        Integer valueOf2 = Integer.valueOf(this.d);
        SparseArray<Uri> sparseArray = this.e;
        int size = sparseArray.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i = shy.a(sparseArray.keyAt(i2), i * 31, 31) + sparseArray.valueAt(i2).hashCode();
        }
        return Objects.hash(this.b, valueOf, valueOf2, Integer.valueOf(i));
    }

    public final String toString() {
        return "Thumb(id=" + this.b + ", width=" + this.c + ", height=" + this.d + ", urls=" + this.e + ')';
    }

    public Thumb(String str, int i, int i2, SparseArray<Uri> sparseArray) {
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = sparseArray;
    }

    public Thumb(SparseArray<Uri> sparseArray) {
        this(null, 0, 0, null, 8, null);
        zik0.e(this.e, sparseArray);
    }

    public Thumb(Image image) {
        this(null, 0, 0, null, 8, null);
        Iterator it = image.b.iterator();
        while (it.hasNext()) {
            com.vk.dto.common.im.Image image2 = ((ImageSize) it.next()).d;
            String str = image2.d;
            this.e.append(image2.b, str != null ? Uri.parse(str) : Uri.EMPTY);
        }
    }
}
