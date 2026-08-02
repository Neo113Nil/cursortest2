package com.vk.vmoji.character.model;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import xsna.epx;
import xsna.er;
import xsna.j5g;
import xsna.zcl;

/* compiled from: BaseUrlImageModel.kt */
/* loaded from: classes7.dex */
public final class BaseUrlImageModel extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<BaseUrlImageModel> CREATOR = new a();
    public final String b;
    public final Image c;
    public final Image d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<BaseUrlImageModel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final BaseUrlImageModel a(Serializer serializer) {
            return new BaseUrlImageModel(serializer.H(), null, null, 6, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BaseUrlImageModel[i];
        }
    }

    public /* synthetic */ BaseUrlImageModel(String str, Image image, Image image2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : image, (i & 4) != 0 ? null : image2);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseUrlImageModel)) {
            return false;
        }
        BaseUrlImageModel baseUrlImageModel = (BaseUrlImageModel) obj;
        return epx.f(this.b, baseUrlImageModel.b) && epx.f(this.c, baseUrlImageModel.c) && epx.f(this.d, baseUrlImageModel.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Image image = this.c;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.d;
        return hashCode2 + (image2 != null ? image2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseUrlImageModel(baseUrl=");
        sb.append(this.b);
        sb.append(", imageSquare=");
        sb.append(this.c);
        sb.append(", imageWide=");
        return er.d(sb, this.d, ')');
    }

    public final String zb(final int i, Map<Integer, String> map, Image image) {
        String str = null;
        ImageSize Cb = image != null ? image.Cb(i, true, false) : null;
        if (image != null && Cb != null) {
            str = Cb.d.d;
        }
        if (str != null) {
            return str;
        }
        Set<Integer> keySet = map.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Number) obj).intValue() >= i) {
                arrayList.add(obj);
            }
        }
        Integer num = (Integer) j5g.r0(new Comparator() { // from class: xsna.xp6
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                int intValue = ((Integer) obj2).intValue();
                int i2 = i;
                return Math.abs(intValue - i2) - Math.abs(((Integer) obj3).intValue() - i2);
            }
        }, arrayList);
        if (num == null) {
            num = (Integer) j5g.l0(map.keySet());
        }
        return this.b + DomExceptionUtils.SEPARATOR + map.get(num);
    }

    public BaseUrlImageModel(String str, Image image, Image image2) {
        this.b = str;
        this.c = image;
        this.d = image2;
    }
}
