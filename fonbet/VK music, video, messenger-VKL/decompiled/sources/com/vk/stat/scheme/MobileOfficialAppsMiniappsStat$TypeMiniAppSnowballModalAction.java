package com.vk.stat.scheme;

import com.coremedia.iso.boxes.FreeSpaceBox;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.asp;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsMiniappsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction implements SchemeStat$TypeClick.b {

    @pmi0("type")
    private final Type type;

    @pmi0("user_id")
    private final Long userId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMiniappsStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final Type CLOSE;

        @pmi0(X3.i.Y)
        public static final Type SECONDARY;

        @pmi0(FreeSpaceBox.TYPE)
        public static final Type SKIP;

        @pmi0("transition")
        public static final Type TRANSITION;

        static {
            Type type = new Type("CLOSE", 0);
            CLOSE = type;
            Type type2 = new Type(BatchApiRequest.FIELD_VALUE_ON_ERROR_SKIP, 1);
            SKIP = type2;
            Type type3 = new Type("TRANSITION", 2);
            TRANSITION = type3;
            Type type4 = new Type("SECONDARY", 3);
            SECONDARY = type4;
            Type[] typeArr = {type, type2, type3, type4};
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

    public MobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction(Type type, Long l) {
        this.type = type;
        this.userId = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction)) {
            return false;
        }
        MobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction mobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction = (MobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction) obj;
        return this.type == mobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction.type && epx.f(this.userId, mobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction.userId);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        Long l = this.userId;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMiniAppSnowballModalAction(type=");
        sb.append(this.type);
        sb.append(", userId=");
        return iq.b(sb, this.userId, ')');
    }

    public /* synthetic */ MobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction(Type type, Long l, int i, zcl zclVar) {
        this(type, (i & 2) != 0 ? null : l);
    }
}
