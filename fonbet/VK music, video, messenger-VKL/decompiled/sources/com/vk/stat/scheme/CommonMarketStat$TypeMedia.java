package com.vk.stat.scheme;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMedia {

    @pmi0("cnt")
    private final Integer cnt;

    @pmi0("id")
    private final Integer id;

    @pmi0("idx")
    private final Integer idx;

    @pmi0("is_blurred")
    private final Boolean isBlurred;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonMarketStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("photo")
        public static final Type PHOTO;

        @pmi0("video")
        public static final Type VIDEO;

        static {
            Type type = new Type("PHOTO", 0);
            PHOTO = type;
            Type type2 = new Type(SignalingProtocol.MEDIA_OPTION_VIDEO, 1);
            VIDEO = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public CommonMarketStat$TypeMedia(Type type, Integer num, Integer num2, Integer num3, Boolean bool) {
        this.type = type;
        this.id = num;
        this.idx = num2;
        this.cnt = num3;
        this.isBlurred = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeMedia)) {
            return false;
        }
        CommonMarketStat$TypeMedia commonMarketStat$TypeMedia = (CommonMarketStat$TypeMedia) obj;
        return this.type == commonMarketStat$TypeMedia.type && epx.f(this.id, commonMarketStat$TypeMedia.id) && epx.f(this.idx, commonMarketStat$TypeMedia.idx) && epx.f(this.cnt, commonMarketStat$TypeMedia.cnt) && epx.f(this.isBlurred, commonMarketStat$TypeMedia.isBlurred);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        Integer num = this.id;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.idx;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.cnt;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.isBlurred;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMedia(type=");
        sb.append(this.type);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", idx=");
        sb.append(this.idx);
        sb.append(", cnt=");
        sb.append(this.cnt);
        sb.append(", isBlurred=");
        return tn.a(sb, this.isBlurred, ')');
    }

    public /* synthetic */ CommonMarketStat$TypeMedia(Type type, Integer num, Integer num2, Integer num3, Boolean bool, int i, zcl zclVar) {
        this(type, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : bool);
    }
}
