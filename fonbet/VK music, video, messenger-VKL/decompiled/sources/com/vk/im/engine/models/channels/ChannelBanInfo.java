package com.vk.im.engine.models.channels;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.core.serialize.Serializer;
import xsna.asp;
import xsna.epx;
import xsna.myc0;
import xsna.shy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ChannelBanInfo.kt */
/* loaded from: classes2.dex */
public final class ChannelBanInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ChannelBanInfo> CREATOR = new a();
    public final String b;
    public final int c;
    public final Reason d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelBanInfo.kt */
    public static final class Reason {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Reason[] $VALUES;
        public static final a Companion;
        public static final Reason FLOOD;
        public static final Reason OTHER;
        public static final Reason SPAM;
        public static final Reason STRONG_LANGUAGE;
        public static final Reason VERBAL_ABUSE;
        private final int id;

        /* compiled from: ChannelBanInfo.kt */
        public static final class a {
            public static Reason a(Integer num) {
                for (Reason reason : Reason.h()) {
                    if (num.intValue() == reason.i()) {
                        return reason;
                    }
                }
                return Reason.OTHER;
            }
        }

        static {
            Reason reason = new Reason(NativeAdContent.ViewTag.OTHER, 0, 0);
            OTHER = reason;
            Reason reason2 = new Reason("SPAM", 1, 1);
            SPAM = reason2;
            Reason reason3 = new Reason("VERBAL_ABUSE", 2, 2);
            VERBAL_ABUSE = reason3;
            Reason reason4 = new Reason("STRONG_LANGUAGE", 3, 3);
            STRONG_LANGUAGE = reason4;
            Reason reason5 = new Reason("FLOOD", 4, 4);
            FLOOD = reason5;
            Reason[] reasonArr = {reason, reason2, reason3, reason4, reason5};
            $VALUES = reasonArr;
            $ENTRIES = new asp(reasonArr);
            Companion = new a();
        }

        public Reason(String str, int i, int i2) {
            this.id = i2;
        }

        public static zrp<Reason> h() {
            return $ENTRIES;
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) $VALUES.clone();
        }

        public final int i() {
            return this.id;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ChannelBanInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ChannelBanInfo a(Serializer serializer) {
            return new ChannelBanInfo(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChannelBanInfo[i];
        }
    }

    public ChannelBanInfo(String str, int i, Reason reason) {
        this.b = str;
        this.c = i;
        this.d = reason;
        boolean z = i != 0;
        this.e = z;
        this.f = !z;
        this.g = reason != Reason.OTHER;
        this.h = myc0.f(str);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.S(this.c);
        serializer.S(this.d.i());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelBanInfo)) {
            return false;
        }
        ChannelBanInfo channelBanInfo = (ChannelBanInfo) obj;
        return epx.f(this.b, channelBanInfo.b) && this.c == channelBanInfo.c && this.d == channelBanInfo.d;
    }

    public final int hashCode() {
        String str = this.b;
        return this.d.hashCode() + shy.a(this.c, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "ChannelBanInfo(comment=" + this.b + ", endDate=" + this.c + ", reason=" + this.d + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChannelBanInfo(Serializer serializer, zcl zclVar) {
        this(r4, r0, Reason.a.a(r3));
        String H = serializer.H();
        int u = serializer.u();
        Reason.a aVar = Reason.Companion;
        Integer valueOf = Integer.valueOf(serializer.u());
        aVar.getClass();
    }
}
