package com.vk.dto.badges;

import com.vk.core.serialize.Serializer;

/* compiled from: BadgeDonutInfo.kt */
/* loaded from: classes18.dex */
public final class BadgeDonutInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<BadgeDonutInfo> CREATOR = new a();
    public final String b;
    public final Integer c;
    public final String d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<BadgeDonutInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final BadgeDonutInfo a(Serializer serializer) {
            return new BadgeDonutInfo(serializer.H(), serializer.v(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BadgeDonutInfo[i];
        }
    }

    public BadgeDonutInfo(String str, Integer num, String str2) {
        this.b = str;
        this.c = num;
        this.d = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.V(this.c);
        serializer.j0(this.d);
    }
}
