package com.vk.im.engine.models.attaches;

import android.os.Parcel;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import java.util.Iterator;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AttachChannelStub.kt */
/* loaded from: classes2.dex */
public final class AttachChannelStub implements AttachWithImage {
    public static final Serializer.c<AttachChannelStub> CREATOR = new a();
    public final Type b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final long g;
    public final String h;
    public int i;
    public AttachSyncState j;
    public final UserId k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AttachChannelStub.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type AUDIO;
        public static final a Companion;
        public static final Type DOC;
        public static final Type PHOTO;
        public static final Type UNKNOWN;
        public static final Type VIDEO;
        private final String typeName;

        /* compiled from: AttachChannelStub.kt */
        public static final class a {
            public static Type a(String str) {
                Object obj;
                Iterator<E> it = Type.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((Type) obj).i(), str)) {
                        break;
                    }
                }
                Type type = (Type) obj;
                return type == null ? Type.UNKNOWN : type;
            }
        }

        static {
            Type type = new Type("PHOTO", 0, "photo");
            PHOTO = type;
            Type type2 = new Type(SignalingProtocol.MEDIA_OPTION_VIDEO, 1, "video");
            VIDEO = type2;
            Type type3 = new Type(SignalingProtocol.MEDIA_OPTION_AUDIO, 2, "audio");
            AUDIO = type3;
            Type type4 = new Type("DOC", 3, "doc");
            DOC = type4;
            Type type5 = new Type(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4, "");
            UNKNOWN = type5;
            Type[] typeArr = {type, type2, type3, type4, type5};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            Companion = new a();
        }

        public Type(String str, int i, String str2) {
            this.typeName = str2;
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

        public final String i() {
            return this.typeName;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachChannelStub> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachChannelStub a(Serializer serializer) {
            return new AttachChannelStub(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachChannelStub[i];
        }
    }

    public AttachChannelStub(Type type, int i, int i2, String str, String str2, long j, String str3) {
        this.b = type;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = str2;
        this.g = j;
        this.h = str3;
        this.j = AttachSyncState.DONE;
        this.k = UserId.d;
        boolean z = false;
        this.l = type == Type.PHOTO;
        this.m = type == Type.VIDEO;
        this.n = type == Type.AUDIO;
        this.o = type == Type.DOC;
        if (i != 0 && i2 != 0) {
            z = true;
        }
        this.p = z;
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.j;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        return "";
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b.i());
        serializer.S(this.c);
        serializer.S(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.Y(this.g);
        serializer.j0(this.h);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.j = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachChannelStub(this);
    }

    @Override // xsna.ztx0
    public final ImageList d() {
        return new ImageList(new Image(this.d, this.c, "", false));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachChannelStub)) {
            return false;
        }
        AttachChannelStub attachChannelStub = (AttachChannelStub) obj;
        return this.b == attachChannelStub.b && this.c == attachChannelStub.c && this.d == attachChannelStub.d && epx.f(this.e, attachChannelStub.e) && epx.f(this.f, attachChannelStub.f) && this.g == attachChannelStub.g && epx.f(this.h, attachChannelStub.h);
    }

    @Override // xsna.ztx0
    public final ImageList f() {
        return new ImageList(null, 1, null);
    }

    public final int hashCode() {
        return this.h.hashCode() + bh10.a(urd0.a(urd0.a(shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void m0(int i) {
        this.i = i;
    }

    @Override // com.vk.dto.attaches.Attach
    public final UserId q() {
        return this.k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachChannelStub(type=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", width=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", artist=");
        sb.append(this.f);
        sb.append(", size=");
        sb.append(this.g);
        sb.append(", ext=");
        return ho8.a(sb, this.h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.i;
    }

    public AttachChannelStub(AttachChannelStub attachChannelStub) {
        this(attachChannelStub.b, attachChannelStub.c, attachChannelStub.d, attachChannelStub.e, attachChannelStub.f, attachChannelStub.g, attachChannelStub.h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AttachChannelStub(Serializer serializer, zcl zclVar) {
        this(r3, r4, r5, r6, r7, r8, r12 == null ? "" : r12);
        Type.a aVar = Type.Companion;
        String H = serializer.H();
        H = H == null ? "" : H;
        aVar.getClass();
        Type a2 = Type.a.a(H);
        int u = serializer.u();
        int u2 = serializer.u();
        String H2 = serializer.H();
        String str = H2 == null ? "" : H2;
        String H3 = serializer.H();
        String str2 = H3 == null ? "" : H3;
        long w = serializer.w();
        String H4 = serializer.H();
    }
}
