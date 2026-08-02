package com.vk.im.engine.models.groups;

import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: ManagedGroup.kt */
/* loaded from: classes2.dex */
public final class ManagedGroup {
    public final Peer.Group a;
    public final String b;
    public final Type c;
    public final Access d;
    public final ImageList e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final String i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ManagedGroup.kt */
    public static final class Access {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Access[] $VALUES;
        public static final Access CLOSED;
        public static final a Companion;
        public static final Access OPEN;
        public static final Access PRIVATE;
        private final int value;

        /* compiled from: ManagedGroup.kt */
        public static final class a {
        }

        static {
            Access access = new Access("OPEN", 0, 0);
            OPEN = access;
            Access access2 = new Access("CLOSED", 1, 1);
            CLOSED = access2;
            Access access3 = new Access("PRIVATE", 2, 2);
            PRIVATE = access3;
            Access[] accessArr = {access, access2, access3};
            $VALUES = accessArr;
            $ENTRIES = new asp(accessArr);
            Companion = new a();
        }

        public Access(String str, int i, int i2) {
            this.value = i2;
        }

        public static zrp<Access> h() {
            return $ENTRIES;
        }

        public static Access valueOf(String str) {
            return (Access) Enum.valueOf(Access.class, str);
        }

        public static Access[] values() {
            return (Access[]) $VALUES.clone();
        }

        public final int i() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ManagedGroup.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final a Companion;
        public static final Type EVENT;
        public static final Type GROUP;
        public static final Type PUBLIC;
        private final int value;

        /* compiled from: ManagedGroup.kt */
        public static final class a {
        }

        static {
            Type type = new Type("GROUP", 0, 0);
            GROUP = type;
            Type type2 = new Type("EVENT", 1, 1);
            EVENT = type2;
            Type type3 = new Type(Privacy.PUBLIC, 2, 2);
            PUBLIC = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            Companion = new a();
        }

        public Type(String str, int i, int i2) {
            this.value = i2;
        }

        public static zrp<Type> h() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final int i() {
            return this.value;
        }
    }

    public ManagedGroup(Peer.Group group, String str, Type type, Access access, ImageList imageList, boolean z, boolean z2, int i, String str2) {
        this.a = group;
        this.b = str;
        this.c = type;
        this.d = access;
        this.e = imageList;
        this.f = z;
        this.g = z2;
        this.h = i;
        this.i = str2;
    }

    public static ManagedGroup a(ManagedGroup managedGroup, boolean z, int i, int i2) {
        Peer.Group group = managedGroup.a;
        String str = managedGroup.b;
        Type type = managedGroup.c;
        Access access = managedGroup.d;
        ImageList imageList = managedGroup.e;
        boolean z2 = managedGroup.f;
        if ((i2 & 64) != 0) {
            z = managedGroup.g;
        }
        boolean z3 = z;
        if ((i2 & 128) != 0) {
            i = managedGroup.h;
        }
        String str2 = managedGroup.i;
        managedGroup.getClass();
        return new ManagedGroup(group, str, type, access, imageList, z2, z3, i, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManagedGroup)) {
            return false;
        }
        ManagedGroup managedGroup = (ManagedGroup) obj;
        return epx.f(this.a, managedGroup.a) && epx.f(this.b, managedGroup.b) && this.c == managedGroup.c && this.d == managedGroup.d && epx.f(this.e, managedGroup.e) && this.f == managedGroup.f && this.g == managedGroup.g && this.h == managedGroup.h && epx.f(this.i, managedGroup.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + shy.a(this.h, qoy.b(qoy.b(fw3.a((this.d.hashCode() + ((this.c.hashCode() + urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b)) * 31)) * 31, 31, this.e.b), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ManagedGroup(peer=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", access=");
        sb.append(this.d);
        sb.append(", avatar=");
        sb.append(this.e);
        sb.append(", isNftAvatar=");
        sb.append(this.f);
        sb.append(", isMuted=");
        sb.append(this.g);
        sb.append(", unreadConversationsCount=");
        sb.append(this.h);
        sb.append(", activity=");
        return ho8.a(sb, this.i, ')');
    }
}
