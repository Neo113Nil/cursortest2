package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.io.Serializable;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.zrp;

/* compiled from: ClipStatStoryData.kt */
/* loaded from: classes18.dex */
public final class ClipStatStoryData extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ClipStatStoryData> CREATOR = new a();
    public final Type b;
    public final long c;
    public final UserId d;
    public final String e;
    public final String f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipStatStoryData.kt */
    public static final class Type implements Serializable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Likes;
        public static final Type Views;

        static {
            Type type = new Type("Views", 0);
            Views = type;
            Type type2 = new Type("Likes", 1);
            Likes = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClipStatStoryData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipStatStoryData a(Serializer serializer) {
            return new ClipStatStoryData((Type) serializer.C(), serializer.w(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipStatStoryData[i];
        }
    }

    public ClipStatStoryData(Type type, long j, UserId userId, String str, String str2) {
        this.b = type;
        this.c = j;
        this.d = userId;
        this.e = str;
        this.f = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.g0(this.b);
        serializer.Y(this.c);
        serializer.e0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipStatStoryData)) {
            return false;
        }
        ClipStatStoryData clipStatStoryData = (ClipStatStoryData) obj;
        return this.b == clipStatStoryData.b && this.c == clipStatStoryData.c && epx.f(this.d, clipStatStoryData.d) && epx.f(this.e, clipStatStoryData.e) && epx.f(this.f, clipStatStoryData.f);
    }

    public final int hashCode() {
        int a2 = bh10.a(bh10.a(this.b.hashCode() * 31, 31, this.c), 31, this.d.b);
        String str = this.e;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipStatStoryData(type=");
        sb.append(this.b);
        sb.append(", count=");
        sb.append(this.c);
        sb.append(", uid=");
        sb.append(this.d);
        sb.append(", groupName=");
        sb.append(this.e);
        sb.append(", photoUrl=");
        return ho8.a(sb, this.f, ')');
    }
}
