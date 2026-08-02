package com.vk.dto.badges;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import xsna.bpn0;
import xsna.cz5;
import xsna.i5s;
import xsna.j5g;
import xsna.vi0;
import xsna.wv0;
import xsna.xv0;

/* compiled from: BadgeImage.kt */
/* loaded from: classes18.dex */
public final class BadgeImage implements Serializer.StreamParcelable {
    public static final Serializer.c<BadgeImage> CREATOR = new a();
    public final String b;
    public final bpn0 c;
    public final bpn0 d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<BadgeImage> {
        @Override // com.vk.core.serialize.Serializer.c
        public final BadgeImage a(Serializer serializer) {
            return new BadgeImage(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BadgeImage[i];
        }
    }

    public BadgeImage(String str) {
        this.b = str;
        new bpn0(new wv0(1));
        this.c = new bpn0(new xv0(1));
        this.d = new bpn0(new vi0(2));
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
    }

    public final String a(int i, boolean z) {
        StringBuilder sb = new StringBuilder(this.b);
        sb.append("/stack");
        sb.append("28");
        if (z) {
            sb.append("_dark");
        } else {
            sb.append("_light");
        }
        Map map = (Map) this.c.getValue();
        Set keySet = map.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Number) obj).intValue() >= i) {
                arrayList.add(obj);
            }
        }
        Integer num = (Integer) j5g.r0(new cz5(i), arrayList);
        if (num == null) {
            num = (Integer) j5g.l0(map.keySet());
        }
        return i5s.a(sb, (String) map.get(num), ".png");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BadgeImage(Serializer serializer) {
        this(r1 == null ? "" : r1);
        String H = serializer.H();
    }
}
