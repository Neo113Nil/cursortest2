package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.NotificationImage;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.da70;
import xsna.epx;
import xsna.ho8;
import xsna.j5g;
import xsna.ms9;
import xsna.rl3;
import xsna.shy;

/* compiled from: NotificationImage.kt */
/* loaded from: classes18.dex */
public final class NotificationImage extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<NotificationImage> CREATOR = new b();
    public final List<ImageInfo> b;

    /* compiled from: NotificationImage.kt */
    public static final class ImageInfo extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<ImageInfo> CREATOR = new a();
        public final int b;
        public final int c;
        public final String d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ImageInfo> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ImageInfo a(Serializer serializer) {
                return new ImageInfo(serializer.u(), serializer.u(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ImageInfo[i];
            }
        }

        public ImageInfo(int i, int i2, String str) {
            this.b = i;
            this.c = i2;
            this.d = str;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b);
            serializer.S(this.c);
            serializer.j0(this.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageInfo)) {
                return false;
            }
            ImageInfo imageInfo = (ImageInfo) obj;
            return this.b == imageInfo.b && this.c == imageInfo.c && epx.f(this.d, imageInfo.d);
        }

        public final int hashCode() {
            int a2 = shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
            String str = this.d;
            return a2 + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageInfo(width=");
            sb.append(this.b);
            sb.append(", height=");
            sb.append(this.c);
            sb.append(", url=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: NotificationImage.kt */
    public static final class a {
        public static NotificationImage a(JSONArray jSONArray) {
            if (jSONArray == null) {
                return new NotificationImage(EmptyList.b);
            }
            int length = jSONArray.length();
            ImageInfo[] imageInfoArr = new ImageInfo[length];
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                imageInfoArr[i] = new ImageInfo(jSONObject.optInt("width"), jSONObject.optInt("height"), jSONObject.optString("url"));
            }
            return new NotificationImage(rl3.u0(imageInfoArr));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<NotificationImage> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NotificationImage a(Serializer serializer) {
            return new NotificationImage(serializer.l(ImageInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NotificationImage[i];
        }
    }

    public NotificationImage(List<ImageInfo> list) {
        this.b = list;
    }

    public static String Db(NotificationImage notificationImage, int i) {
        Object next;
        List<ImageInfo> Ab = notificationImage.Ab();
        ArrayList arrayList = new ArrayList();
        for (Object obj : Ab) {
            if (((ImageInfo) obj).b * 1.0f >= i) {
                arrayList.add(obj);
            }
        }
        ImageInfo imageInfo = (ImageInfo) j5g.r0(new da70(i), arrayList);
        if (imageInfo == null) {
            Iterator<T> it = notificationImage.Ab().iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int i2 = ((ImageInfo) next).b;
                    do {
                        Object next2 = it.next();
                        int i3 = ((ImageInfo) next2).b;
                        if (i2 < i3) {
                            next = next2;
                            i2 = i3;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            imageInfo = (ImageInfo) next;
        }
        if (imageInfo != null) {
            return imageInfo.d;
        }
        return null;
    }

    public static final NotificationImage Eb(JSONArray jSONArray) {
        return a.a(jSONArray);
    }

    public final List<ImageInfo> Ab() {
        List<ImageInfo> list = this.b;
        if (list == null) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ImageInfo imageInfo = (ImageInfo) obj;
            if (imageInfo.b > 0 && imageInfo.d != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final ImageInfo Bb(int i) {
        List<ImageInfo> Ab = Ab();
        ArrayList arrayList = new ArrayList();
        for (Object obj : Ab) {
            ImageInfo imageInfo = (ImageInfo) obj;
            int i2 = imageInfo.b;
            if (i2 == imageInfo.c && i2 >= i) {
                arrayList.add(obj);
            }
        }
        return (ImageInfo) j5g.r0(new da70(i), arrayList);
    }

    public final String Cb(int i) {
        ImageInfo Bb = Bb(i);
        if (Bb != null) {
            return Bb.d;
        }
        return null;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.W(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationImage) && epx.f(this.b, ((NotificationImage) obj).b);
    }

    public final int hashCode() {
        List<ImageInfo> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("NotificationImage(imageInfos="), this.b);
    }

    public final String zb(int i, int i2) {
        String str;
        List<ImageInfo> Ab = Ab();
        ArrayList arrayList = new ArrayList();
        for (Object obj : Ab) {
            ImageInfo imageInfo = (ImageInfo) obj;
            if (imageInfo.c > 0 && (str = imageInfo.d) != null && str.length() != 0) {
                arrayList.add(obj);
            }
        }
        final int i3 = i * i2;
        ImageInfo imageInfo2 = (ImageInfo) j5g.r0(new Comparator() { // from class: xsna.ea70
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                NotificationImage.ImageInfo imageInfo3 = (NotificationImage.ImageInfo) obj2;
                NotificationImage.ImageInfo imageInfo4 = (NotificationImage.ImageInfo) obj3;
                Serializer.c<NotificationImage> cVar = NotificationImage.CREATOR;
                int i4 = imageInfo3.b * imageInfo3.c;
                int i5 = i3;
                return Math.abs(i5 - i4) - Math.abs(i5 - (imageInfo4.b * imageInfo4.c));
            }
        }, arrayList);
        if (imageInfo2 != null) {
            return imageInfo2.d;
        }
        return null;
    }
}
