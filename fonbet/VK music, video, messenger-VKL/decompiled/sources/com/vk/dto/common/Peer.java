package com.vk.dto.common;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.core.serialize.Serializer;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.epx;
import xsna.lhg;
import xsna.vu5;
import xsna.zcl;
import xsna.zrp;

/* compiled from: Peer.kt */
/* loaded from: classes.dex */
public abstract class Peer extends Serializer.StreamParcelableAdapter implements Comparable<Peer> {
    public static final Serializer.c<Peer> CREATOR = new b();
    public final long b;
    public final Type c;
    public final long d;

    /* compiled from: Peer.kt */
    /* loaded from: classes18.dex */
    public static final class Channel extends Peer {
        public Channel(long j) {
            super(j, Type.CHANNEL, j, null);
        }
    }

    /* compiled from: Peer.kt */
    /* loaded from: classes18.dex */
    public static final class Chat extends Peer {
        public Chat(long j) {
            super(j, Type.CHAT, j - 2000000000, null);
        }
    }

    /* compiled from: Peer.kt */
    /* loaded from: classes18.dex */
    public static final class Contact extends Member {
        public Contact(long j) {
            super(j, Type.CONTACT, j - 1900000000);
        }
    }

    /* compiled from: Peer.kt */
    /* loaded from: classes18.dex */
    public static final class Email extends Member {
        public Email(long j) {
            super(j, Type.EMAIL, (-j) - 2000000000);
        }
    }

    /* compiled from: Peer.kt */
    /* loaded from: classes18.dex */
    public static final class Group extends Member {
        public Group(long j) {
            super(j, Type.GROUP, -j);
        }
    }

    /* compiled from: Peer.kt */
    /* loaded from: classes18.dex */
    public static class Member extends Peer {
        public Member(long j, Type type, long j2) {
            super(j, type, j2, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Peer.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CHANNEL;
        public static final Type CHAT;
        public static final Type CONTACT;
        public static final a Companion;
        public static final Type EMAIL;
        public static final Type GROUP;
        public static final Type UNKNOWN;
        public static final Type USER;
        private final int typeAsInt;

        /* compiled from: Peer.kt */
        public static final class a {
            public static Type a(int i) {
                switch (i) {
                    case 0:
                        return Type.UNKNOWN;
                    case 1:
                        return Type.USER;
                    case 2:
                        return Type.EMAIL;
                    case 3:
                        return Type.GROUP;
                    case 4:
                        return Type.CHAT;
                    case 5:
                        return Type.CONTACT;
                    case 6:
                        return Type.CHANNEL;
                    default:
                        throw new IllegalArgumentException(lhg.a(i, "Illegal typeAsInt value: "));
                }
            }
        }

        static {
            Type type = new Type(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
            UNKNOWN = type;
            Type type2 = new Type("USER", 1, 1);
            USER = type2;
            Type type3 = new Type(CommonConstant.RETKEY.EMAIL, 2, 2);
            EMAIL = type3;
            Type type4 = new Type("GROUP", 3, 3);
            GROUP = type4;
            Type type5 = new Type("CHAT", 4, 4);
            CHAT = type5;
            Type type6 = new Type("CONTACT", 5, 5);
            CONTACT = type6;
            Type type7 = new Type("CHANNEL", 6, 6);
            CHANNEL = type7;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            Companion = new a();
        }

        public Type(String str, int i, int i2) {
            this.typeAsInt = i2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final int h() {
            return this.typeAsInt;
        }
    }

    /* compiled from: Peer.kt */
    public static final class Unknown extends Peer {
        public static final Unknown e = new Unknown(0, Type.UNKNOWN, 0, null);
    }

    /* compiled from: Peer.kt */
    /* loaded from: classes18.dex */
    public static final class User extends Member {
        public User(long j) {
            super(j, Type.USER, j);
        }
    }

    /* compiled from: Peer.kt */
    public static final class a {

        /* compiled from: Peer.kt */
        /* renamed from: com.vk.dto.common.Peer$a$a, reason: collision with other inner class name */
        /* loaded from: classes18.dex */
        public static final /* synthetic */ class C0902a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Type.values().length];
                try {
                    iArr[Type.USER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Type.EMAIL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Type.GROUP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Type.CHAT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Type.CONTACT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Type.CHANNEL.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Type.UNKNOWN.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static Peer a(long j, Type type) {
            return b(e(j, type));
        }

        public static Peer b(long j) {
            switch (C0902a.$EnumSwitchMapping$0[f(j).ordinal()]) {
                case 1:
                    return new User(j);
                case 2:
                    return new Email(j);
                case 3:
                    return new Group(j);
                case 4:
                    return new Chat(j);
                case 5:
                    return new Contact(j);
                case 6:
                    return Unknown.e;
                case 7:
                    return Unknown.e;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public static Group c(long j) {
            return new Group(-j);
        }

        public static long d(long j) {
            long j2;
            int i = C0902a.$EnumSwitchMapping$0[f(j).ordinal()];
            if (i == 2) {
                j = -j;
            } else {
                if (i == 3) {
                    return -j;
                }
                if (i != 4) {
                    if (i != 5) {
                        return j;
                    }
                    j2 = 1900000000;
                    return j - j2;
                }
            }
            j2 = 2000000000;
            return j - j2;
        }

        public static long e(long j, Type type) {
            switch (C0902a.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                case 6:
                    return j;
                case 2:
                    return (-j) - 2000000000;
                case 3:
                    return -j;
                case 4:
                    return j + 2000000000;
                case 5:
                    return j + 1900000000;
                case 7:
                    return 0L;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public static Type f(long j) {
            return j > 2147483647L ? Type.USER : j > 2000000000 ? Type.CHAT : j > 1900000000 ? Type.CONTACT : j > 0 ? Type.USER : j < -2147483648L ? Type.GROUP : j < -2000000000 ? Type.EMAIL : j < 0 ? Type.GROUP : Type.UNKNOWN;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<Peer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Peer a(Serializer serializer) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            return a.b(serializer.w());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Peer[i];
        }
    }

    public Peer(long j, Type type, long j2, zcl zclVar) {
        this.b = j;
        this.c = type;
        this.d = j2;
    }

    public final boolean Ab(Type type) {
        return this.c == type;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Peer peer) {
        return epx.h(this.b, peer.b);
    }

    public final boolean equals(Object obj) {
        Peer peer = obj instanceof Peer ? (Peer) obj : null;
        return peer != null && peer.b == this.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Peer(dialogId=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", id=");
        return vu5.a(')', this.d, sb);
    }

    public final boolean zb() {
        return this.c == Type.CHAT;
    }
}
