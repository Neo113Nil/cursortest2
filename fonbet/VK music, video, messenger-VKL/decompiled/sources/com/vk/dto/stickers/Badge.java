package com.vk.dto.stickers;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.core.serialize.Serializer;
import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: Badge.kt */
/* loaded from: classes18.dex */
public final class Badge extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<Badge> CREATOR = new a();

    @pmi0("subtype")
    private final BadgeSubtype subtype;

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final String type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Badge.kt */
    public static final class BadgeSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BadgeSubtype[] $VALUES;
        public static final a Companion;
        public static final BadgeSubtype DISCOUNT;
        public static final BadgeSubtype NEW;
        public static final BadgeSubtype UNKNOWN;

        @pmi0("serverKey")
        private final String serverKey;

        /* compiled from: Badge.kt */
        public static final class a {
            public static BadgeSubtype a(String str) {
                Object obj;
                Iterator<E> it = BadgeSubtype.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((BadgeSubtype) obj).i(), str)) {
                        break;
                    }
                }
                BadgeSubtype badgeSubtype = (BadgeSubtype) obj;
                return badgeSubtype == null ? BadgeSubtype.UNKNOWN : badgeSubtype;
            }
        }

        static {
            BadgeSubtype badgeSubtype = new BadgeSubtype("NEW", 0, "new");
            NEW = badgeSubtype;
            BadgeSubtype badgeSubtype2 = new BadgeSubtype("DISCOUNT", 1, "discount");
            DISCOUNT = badgeSubtype2;
            BadgeSubtype badgeSubtype3 = new BadgeSubtype(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2, "");
            UNKNOWN = badgeSubtype3;
            BadgeSubtype[] badgeSubtypeArr = {badgeSubtype, badgeSubtype2, badgeSubtype3};
            $VALUES = badgeSubtypeArr;
            $ENTRIES = new asp(badgeSubtypeArr);
            Companion = new a();
        }

        private BadgeSubtype(String str, int i, String str2) {
            this.serverKey = str2;
        }

        public static zrp<BadgeSubtype> h() {
            return $ENTRIES;
        }

        public static BadgeSubtype valueOf(String str) {
            return (BadgeSubtype) Enum.valueOf(BadgeSubtype.class, str);
        }

        public static BadgeSubtype[] values() {
            return (BadgeSubtype[]) $VALUES.clone();
        }

        public final String i() {
            return this.serverKey;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Badge> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Badge a(Serializer serializer) {
            String H = serializer.H();
            BadgeSubtype.a aVar = BadgeSubtype.Companion;
            String H2 = serializer.H();
            aVar.getClass();
            return new Badge(H, BadgeSubtype.a.a(H2), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Badge[i];
        }
    }

    public Badge(String str, BadgeSubtype badgeSubtype, String str2) {
        this.type = str;
        this.subtype = badgeSubtype;
        this.text = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.type);
        serializer.j0(this.subtype.i());
        serializer.j0(this.text);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Badge)) {
            return false;
        }
        Badge badge = (Badge) obj;
        return epx.f(this.type, badge.type) && this.subtype == badge.subtype && epx.f(this.text, badge.text);
    }

    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        int hashCode = (this.subtype.hashCode() + (this.type.hashCode() * 31)) * 31;
        String str = this.text;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Badge(type=");
        sb.append(this.type);
        sb.append(", subtype=");
        sb.append(this.subtype);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    public final BadgeSubtype zb() {
        return this.subtype;
    }
}
