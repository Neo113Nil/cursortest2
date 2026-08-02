package com.vk.vmoji.character.model;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.core.serialize.Serializer;
import com.vk.vmoji.character.model.ImageListModel;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.epx;
import xsna.j5g;
import xsna.ms9;
import xsna.shy;
import xsna.zcl;

/* compiled from: ImageListModel.kt */
/* loaded from: classes7.dex */
public final class ImageListModel extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ImageListModel> CREATOR = new b();
    public final List<ImageModel> b;

    /* compiled from: ImageListModel.kt */
    public static final class ImageModel extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<ImageModel> CREATOR = new a();
        public final String b;
        public final int c;
        public final int d;
        public final boolean e;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ImageModel> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ImageModel a(Serializer serializer) {
                return new ImageModel(serializer.H(), serializer.u(), serializer.u(), epx.f(serializer.n(), Boolean.TRUE));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ImageModel[i];
            }
        }

        public ImageModel(String str, int i, int i2, boolean z) {
            this.b = str;
            this.c = i;
            this.d = i2;
            this.e = z;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.S(this.c);
            serializer.S(this.d);
            serializer.L(this.e ? (byte) 1 : (byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageModel)) {
                return false;
            }
            ImageModel imageModel = (ImageModel) obj;
            return epx.f(this.b, imageModel.b) && this.c == imageModel.c && this.d == imageModel.d && this.e == imageModel.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageModel(url=");
            sb.append(this.b);
            sb.append(", width=");
            sb.append(this.c);
            sb.append(", height=");
            sb.append(this.d);
            sb.append(", isBase=");
            return q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: ImageListModel.kt */
    public static final class a {
        public static ImageListModel a(List list) {
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                return null;
            }
            List<BaseImageDto> list3 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
            for (BaseImageDto baseImageDto : list3) {
                arrayList.add(new ImageModel(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), epx.f(baseImageDto.e(), Boolean.TRUE)));
            }
            return new ImageListModel(arrayList);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ImageListModel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ImageListModel a(Serializer serializer) {
            return new ImageListModel(serializer.B(ImageModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ImageListModel[i];
        }
    }

    public ImageListModel() {
        this(null, 1, null);
    }

    public static String Ab(ImageListModel imageListModel, final int i) {
        Object next;
        List<ImageModel> list = imageListModel.b;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((ImageModel) obj).c > 0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                if (((ImageModel) next2).c * 1.0f >= i) {
                    arrayList2.add(next2);
                }
            }
            ImageModel imageModel = (ImageModel) j5g.r0(new Comparator() { // from class: xsna.yjw
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    Serializer.c<ImageListModel> cVar = ImageListModel.CREATOR;
                    int i2 = ((ImageListModel.ImageModel) obj2).c;
                    int i3 = i;
                    return Math.abs(i2 - i3) - Math.abs(((ImageListModel.ImageModel) obj3).c - i3);
                }
            }, arrayList2);
            if (imageModel == null) {
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        int i2 = ((ImageModel) next).c;
                        do {
                            Object next3 = it2.next();
                            int i3 = ((ImageModel) next3).c;
                            if (i2 < i3) {
                                next = next3;
                                i2 = i3;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                imageModel = (ImageModel) next;
            }
            if (imageModel != null) {
                return imageModel.b;
            }
        }
        return null;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.f0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageListModel) && epx.f(this.b, ((ImageListModel) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ImageListModel(images="), this.b);
    }

    public final ImageModel zb(int i) {
        int abs;
        List<ImageModel> list = this.b;
        ArrayList<ImageModel> arrayList = new ArrayList();
        for (Object obj : list) {
            ImageModel imageModel = (ImageModel) obj;
            if (imageModel.c == imageModel.d) {
                arrayList.add(obj);
            }
        }
        ImageModel imageModel2 = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() == 1) {
            return (ImageModel) arrayList.get(0);
        }
        int i2 = i * i;
        int i3 = Integer.MAX_VALUE;
        for (ImageModel imageModel3 : arrayList) {
            if (imageModel3.b.length() > 0 && (abs = Math.abs(i2 - (imageModel3.c * imageModel3.d))) < i3) {
                imageModel2 = imageModel3;
                i3 = abs;
            }
        }
        return imageModel2;
    }

    public ImageListModel(List<ImageModel> list) {
        this.b = list;
    }

    public ImageListModel(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? EmptyList.b : list);
    }
}
