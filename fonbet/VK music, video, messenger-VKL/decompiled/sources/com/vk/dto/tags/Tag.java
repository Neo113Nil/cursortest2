package com.vk.dto.tags;

import com.vk.dto.common.id.UserId;
import defpackage.q0;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.n0o0;
import xsna.qoy;
import xsna.shy;
import xsna.zjh0;
import xsna.zrp;

/* compiled from: Tag.kt */
/* loaded from: classes18.dex */
public final class Tag {
    public final int a;
    public final int b;
    public final ContentType c;
    public final UserId d;
    public final int e;
    public final n0o0 f;
    public final double g;
    public final double h;
    public final Integer i;
    public final Integer j;
    public final boolean k;
    public final boolean l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Tag.kt */
    public static final class ContentType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ContentType[] $VALUES;
        public static final ContentType PHOTO;
        private final String serverKey = "photo";

        static {
            ContentType contentType = new ContentType();
            PHOTO = contentType;
            ContentType[] contentTypeArr = {contentType};
            $VALUES = contentTypeArr;
            $ENTRIES = new asp(contentTypeArr);
        }

        public static ContentType valueOf(String str) {
            return (ContentType) Enum.valueOf(ContentType.class, str);
        }

        public static ContentType[] values() {
            return (ContentType[]) $VALUES.clone();
        }

        public final String h() {
            return this.serverKey;
        }
    }

    public Tag(int i, int i2, ContentType contentType, UserId userId, int i3, n0o0 n0o0Var, double d, double d2, Integer num, Integer num2, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = contentType;
        this.d = userId;
        this.e = i3;
        this.f = n0o0Var;
        this.g = d;
        this.h = d2;
        this.i = num;
        this.j = num2;
        this.k = z;
        this.l = z2;
    }

    public static Tag a(Tag tag, double d, double d2) {
        int i = tag.a;
        int i2 = tag.b;
        ContentType contentType = tag.c;
        UserId userId = tag.d;
        int i3 = tag.e;
        n0o0 n0o0Var = tag.f;
        Integer num = tag.i;
        Integer num2 = tag.j;
        boolean z = tag.k;
        boolean z2 = tag.l;
        tag.getClass();
        return new Tag(i, i2, contentType, userId, i3, n0o0Var, d, d2, num, num2, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) obj;
        return this.a == tag.a && this.b == tag.b && this.c == tag.c && epx.f(this.d, tag.d) && this.e == tag.e && epx.f(this.f, tag.f) && Double.compare(this.g, tag.g) == 0 && Double.compare(this.h, tag.h) == 0 && epx.f(this.i, tag.i) && epx.f(this.j, tag.j) && this.k == tag.k && this.l == tag.l;
    }

    public final int hashCode() {
        int b = zjh0.b(this.h, zjh0.b(this.g, (this.f.hashCode() + shy.a(this.e, bh10.a((this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31)) * 31, 31, this.d.b), 31)) * 31, 31), 31);
        Integer num = this.i;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.j;
        return Boolean.hashCode(this.l) + qoy.b((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tag(id=");
        sb.append(this.a);
        sb.append(", productId=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", ownerId=");
        sb.append(this.d);
        sb.append(", itemId=");
        sb.append(this.e);
        sb.append(", link=");
        sb.append(this.f);
        sb.append(", x=");
        sb.append(this.g);
        sb.append(", y=");
        sb.append(this.h);
        sb.append(", startTime=");
        sb.append(this.i);
        sb.append(", endTime=");
        sb.append(this.j);
        sb.append(", isOwner=");
        sb.append(this.k);
        sb.append(", isAdult=");
        return q0.a(sb, this.l, ')');
    }
}
