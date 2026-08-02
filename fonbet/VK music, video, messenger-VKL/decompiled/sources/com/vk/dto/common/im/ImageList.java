package com.vk.dto.common.im;

import android.net.Uri;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.c5g;
import xsna.cqm0;
import xsna.e43;
import xsna.epx;
import xsna.fxj0;
import xsna.gcy;
import xsna.ixj0;
import xsna.m900;
import xsna.ms9;
import xsna.zcl;

/* compiled from: ImageList.kt */
/* loaded from: classes18.dex */
public final class ImageList extends Serializer.StreamParcelableAdapter implements Iterable<fxj0>, gcy {
    public static final Serializer.c<ImageList> CREATOR = new b();
    public final List<Image> b;

    /* compiled from: ImageList.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static ImageList a(String str) {
            ImageList imageList = new ImageList(null, 1, 0 == true ? 1 : 0);
            String a = cqm0.a(str);
            if (a != null) {
                m900<String, Image> m900Var = Image.g;
                imageList.zb(new Image(480, 480, a, true));
            }
            return imageList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static ImageList b(File file) {
            if (file != null) {
                return new ImageList(new Image(-1, -1, Uri.fromFile(file).toString(), false));
            }
            return new ImageList(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static ImageList c(int i, int i2, String str) {
            ImageList imageList = new ImageList(null, 1, 0 == true ? 1 : 0);
            String a = cqm0.a(str);
            if (a != null) {
                imageList.zb(new Image(i, i2, a, false));
            }
            return imageList;
        }

        public static ImageList d(JSONArray jSONArray) {
            ArrayList arrayList;
            if (jSONArray != null) {
                ArrayList arrayList2 = new ArrayList(jSONArray.length());
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList2.add(jSONArray.getJSONObject(i));
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = (JSONObject) it.next();
                    m900<String, Image> m900Var = Image.g;
                    arrayList3.add(Image.a.b(jSONObject));
                }
                arrayList = new ArrayList(arrayList3);
            } else {
                arrayList = new ArrayList();
            }
            return new ImageList(arrayList);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ImageList> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ImageList a(Serializer serializer) {
            return new ImageList(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ImageList[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImageList() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static String Eb(int i, int i2, List list) {
        Image image = (Image) ixj0.c(list, i, i2);
        if (image != null) {
            return image.d;
        }
        return null;
    }

    public final Image Ab() {
        return (Image) ixj0.b(this.b);
    }

    public final Image Bb(int i, int i2) {
        return (Image) ixj0.c(this.b, i, i2);
    }

    public final Image Cb(int i, boolean z) {
        return (Image) ixj0.d(this.b, i, z);
    }

    public final String Db() {
        return ixj0.h(this.b);
    }

    public final String Fb() {
        return ixj0.n(this.b);
    }

    public final Image Gb(int i) {
        List<Image> list = this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Image image = (Image) obj;
            if (image.b == image.c) {
                arrayList.add(obj);
            }
        }
        return (Image) ixj0.c(arrayList, i, i);
    }

    public final String Hb(int i) {
        List<Image> list = this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Image image = (Image) obj;
            if (image.b == image.c) {
                arrayList.add(obj);
            }
        }
        return Eb(i, i, arrayList);
    }

    public final List<Image> Ib() {
        return this.b;
    }

    public final boolean Jb() {
        return !this.b.isEmpty();
    }

    public final com.vk.dto.common.Image Kb() {
        List<Image> list = this.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (Image image : list) {
            String str = image.d;
            int i = image.b;
            int i2 = image.c;
            arrayList.add(new ImageSize(str, i, i2, null, ImageSize.b.d(i, i2, image.e), false, 40, null));
        }
        return new com.vk.dto.common.Image(arrayList);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.o0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImageList) {
            return epx.f(this.b, ((ImageList) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<fxj0> iterator() {
        return this.b.iterator();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ImageList(list="), this.b);
    }

    public final void zb(Image image) {
        this.b.add(image);
    }

    public ImageList(List<Image> list) {
        this.b = list;
    }

    public /* synthetic */ ImageList(List list, int i, zcl zclVar) {
        this((List<Image>) ((i & 1) != 0 ? new ArrayList() : list));
    }

    public ImageList(Image image) {
        this(e43.o(image));
    }

    public ImageList(ImageList imageList) {
        this(imageList.b);
    }

    public ImageList(Serializer serializer, zcl zclVar) {
        this(serializer.j(Image.CREATOR));
    }
}
