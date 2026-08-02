package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.AvatarSize;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.bxx;
import xsna.cqm0;
import xsna.epx;
import xsna.glw;
import xsna.ixj0;
import xsna.izs;
import xsna.m900;
import xsna.uq;
import xsna.xy9;
import xsna.zcl;

/* compiled from: Image.kt */
/* loaded from: classes.dex */
public final class Image extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<Image> CREATOR = new a();
    public static final Image d = new Image();
    public final ArrayList b;
    public final ArrayList c;

    /* compiled from: Image.kt */
    /* loaded from: classes18.dex */
    public static final class a extends Serializer.c<Image> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Image a(Serializer serializer) {
            return new Image(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Image[i];
        }
    }

    /* compiled from: Image.kt */
    /* loaded from: classes18.dex */
    public static final class b {
        public static Image a(String str) {
            Image image = new Image((zcl) null);
            String a = cqm0.a(str);
            if (a != null) {
                m900<String, ImageSize> m900Var = ImageSize.e;
                image.zb(ImageSize.b.a(a));
            }
            return image;
        }

        public static Image b(JSONObject jSONObject) {
            Set set;
            String a = cqm0.a(jSONObject.optString("photo_base"));
            if (a != null) {
                Serializer.c<Image> cVar = Image.CREATOR;
                return a(a);
            }
            AvatarSize.Companion.getClass();
            set = AvatarSize.SIZES_OBSOLETE;
            return AvatarSize.a.a(set, jSONObject);
        }

        public static Image c(String str, int i, int i2, char c) {
            return new Image((List<ImageSize>) Collections.singletonList(new ImageSize(str, i, i2, null, c, false, 40, null)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Image(JSONArray jSONArray) throws JSONException {
        this(jSONArray, null, 2, 0 == true ? 1 : 0);
    }

    public static ImageSize Bb(int i, ArrayList arrayList, final boolean z, boolean z2, boolean z3) {
        Object next;
        if (ixj0.o(arrayList) != null) {
            return (ImageSize) ixj0.d(arrayList, i, z);
        }
        izs izsVar = new izs() { // from class: xsna.efw
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ImageSize imageSize = (ImageSize) obj;
                Serializer.c<Image> cVar = Image.CREATOR;
                return Integer.valueOf(z ? imageSize.d.b : imageSize.d.c);
            }
        };
        Object obj = null;
        if (!glw.a().b() && !z3) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    Comparable comparable = (Comparable) izsVar.invoke(obj);
                    do {
                        Object next2 = it.next();
                        Comparable comparable2 = (Comparable) izsVar.invoke(next2);
                        if (comparable.compareTo(comparable2) > 0) {
                            obj = next2;
                            comparable = comparable2;
                        }
                    } while (it.hasNext());
                }
            }
            return (ImageSize) obj;
        }
        if (!z2) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                obj = it2.next();
                if (it2.hasNext()) {
                    int abs = Math.abs(((Number) izsVar.invoke((ImageSize) obj)).intValue() - i);
                    do {
                        Object next3 = it2.next();
                        int abs2 = Math.abs(((Number) izsVar.invoke((ImageSize) next3)).intValue() - i);
                        if (abs > abs2) {
                            obj = next3;
                            abs = abs2;
                        }
                    } while (it2.hasNext());
                }
            }
            return (ImageSize) obj;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((Number) izsVar.invoke((ImageSize) obj2)).intValue() >= i) {
                arrayList2.add(obj2);
            }
        }
        Iterator it3 = arrayList2.iterator();
        if (it3.hasNext()) {
            next = it3.next();
            if (it3.hasNext()) {
                Comparable comparable3 = (Comparable) izsVar.invoke(next);
                do {
                    Object next4 = it3.next();
                    Comparable comparable4 = (Comparable) izsVar.invoke(next4);
                    if (comparable3.compareTo(comparable4) > 0) {
                        next = next4;
                        comparable3 = comparable4;
                    }
                } while (it3.hasNext());
            }
        } else {
            next = null;
        }
        ImageSize imageSize = (ImageSize) next;
        if (imageSize != null) {
            return imageSize;
        }
        Iterator it4 = arrayList.iterator();
        if (it4.hasNext()) {
            obj = it4.next();
            if (it4.hasNext()) {
                Comparable comparable5 = (Comparable) izsVar.invoke(obj);
                do {
                    Object next5 = it4.next();
                    Comparable comparable6 = (Comparable) izsVar.invoke(next5);
                    if (comparable5.compareTo(comparable6) < 0) {
                        obj = next5;
                        comparable5 = comparable6;
                    }
                } while (it4.hasNext());
            }
        }
        return (ImageSize) obj;
    }

    public final ImageSize Ab(int i, boolean z) {
        return Bb(i, this.b, true, z, true);
    }

    public final ImageSize Cb(int i, boolean z, boolean z2) {
        boolean b2 = glw.a().b();
        ArrayList arrayList = this.b;
        if (!b2) {
            return Bb(i, arrayList, z, z2, false);
        }
        ImageSize Bb = Bb(i, this.c, z, z2, false);
        return Bb == null ? Bb(i, arrayList, z, z2, false) : Bb;
    }

    public final boolean Db() {
        return !this.c.isEmpty();
    }

    public final float E0() {
        ArrayList arrayList = this.b;
        ImageSize imageSize = !arrayList.isEmpty() ? (ImageSize) xy9.b(1, arrayList) : null;
        if (imageSize == null || imageSize.getWidth() == 0 || imageSize.getHeight() == 0) {
            return -1.0f;
        }
        return imageSize.getWidth() / imageSize.getHeight();
    }

    public final Image Eb() {
        if (this == d || this.b.isEmpty()) {
            return null;
        }
        return this;
    }

    public final ArrayList Fb() {
        return new ArrayList(this.b);
    }

    public final JSONArray Gb() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((ImageSize) it.next()).e5());
        }
        return jSONArray;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.o0(this.b);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        try {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ImageSize imageSize = (ImageSize) it.next();
                jSONObject.put("photo_" + imageSize.getWidth(), imageSize.getUrl());
            }
            return jSONObject;
        } catch (JSONException e) {
            L.i(e);
            return jSONObject;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Image.class.equals(obj.getClass())) {
            return false;
        }
        return epx.f(this.b, ((Image) obj).b);
    }

    public final int hashCode() {
        return Objects.hash(this.b);
    }

    public final String toString() {
        return uq.b(this.b, new StringBuilder("size: "));
    }

    public final void zb(ImageSize imageSize) {
        this.b.add(imageSize);
        if (imageSize.Ab()) {
            return;
        }
        this.c.add(imageSize);
    }

    public /* synthetic */ Image(zcl zclVar) {
        this();
    }

    public /* synthetic */ Image(JSONArray jSONArray, String str, int i, zcl zclVar) throws JSONException {
        this(jSONArray, (i & 2) != 0 ? null : str);
    }

    public Image(JSONArray jSONArray, String str) throws JSONException {
        this.b = new ArrayList();
        this.c = new ArrayList();
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                zb(new ImageSize(optJSONObject, str));
            }
        }
    }

    public Image() {
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public Image(Serializer serializer) {
        this(serializer.j(ImageSize.CREATOR));
    }

    public Image(List<ImageSize> list) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        List<ImageSize> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        Iterator<ImageSize> it = list.iterator();
        while (it.hasNext()) {
            zb(it.next());
        }
    }
}
