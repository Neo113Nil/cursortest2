package com.vk.dto.common.donut.popup;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.core.serialize.Serializer;
import java.util.Iterator;
import org.json.JSONObject;
import xsna.aay;
import xsna.asp;
import xsna.bxx;
import xsna.epx;
import xsna.f370;
import xsna.ho8;
import xsna.s3q0;
import xsna.w9y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoDonutAction.kt */
/* loaded from: classes18.dex */
public final class VideoDonutAction extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<VideoDonutAction> CREATOR = new b();
    public static final a e = new a();
    public final String b;
    public final ActionType c;
    public final String d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoDonutAction.kt */
    public static final class ActionType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;
        public static final ActionType CLOSE;
        public static final a Companion;
        public static final ActionType EDIT_PRIVACY;
        public static final ActionType HIGHER_LEVEL;
        public static final ActionType UNKNOWN;
        private final String value;

        /* compiled from: VideoDonutAction.kt */
        public static final class a {
            public static ActionType a(String str) {
                Object obj;
                Iterator<E> it = ActionType.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((ActionType) obj).i(), str)) {
                        break;
                    }
                }
                ActionType actionType = (ActionType) obj;
                return actionType == null ? ActionType.UNKNOWN : actionType;
            }
        }

        static {
            ActionType actionType = new ActionType("HIGHER_LEVEL", 0, "higher_level");
            HIGHER_LEVEL = actionType;
            ActionType actionType2 = new ActionType("EDIT_PRIVACY", 1, "edit_privacy");
            EDIT_PRIVACY = actionType2;
            ActionType actionType3 = new ActionType("CLOSE", 2, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
            CLOSE = actionType3;
            ActionType actionType4 = new ActionType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, "unknown");
            UNKNOWN = actionType4;
            ActionType[] actionTypeArr = {actionType, actionType2, actionType3, actionType4};
            $VALUES = actionTypeArr;
            $ENTRIES = new asp(actionTypeArr);
            Companion = new a();
        }

        public ActionType(String str, int i, String str2) {
            this.value = str2;
        }

        public static zrp<ActionType> h() {
            return $ENTRIES;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }

        public final String i() {
            return this.value;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<VideoDonutAction> {
        @Override // xsna.aay
        public final VideoDonutAction a(JSONObject jSONObject) {
            return new VideoDonutAction(jSONObject, (zcl) null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<VideoDonutAction> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoDonutAction a(Serializer serializer) {
            return new VideoDonutAction(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoDonutAction[i];
        }
    }

    public VideoDonutAction(String str, ActionType actionType, String str2) {
        this.b = str;
        this.c = actionType;
        this.d = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c.i());
        serializer.j0(this.d);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "title");
        w9yVar.e(this.c.i(), "type");
        w9yVar.e(this.d, "url");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoDonutAction)) {
            return false;
        }
        VideoDonutAction videoDonutAction = (VideoDonutAction) obj;
        return epx.f(this.b, videoDonutAction.b) && this.c == videoDonutAction.c && epx.f(this.d, videoDonutAction.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoDonutAction(title=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", url=");
        return ho8.a(sb, this.d, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoDonutAction(JSONObject jSONObject, zcl zclVar) {
        this(r4, ActionType.a.a(r1), f370.D(jSONObject, "url"));
        String string = jSONObject.getString("title");
        ActionType.a aVar = ActionType.Companion;
        String string2 = jSONObject.getString("type");
        aVar.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoDonutAction(Serializer serializer, zcl zclVar) {
        this(r4, ActionType.a.a(r1), serializer.H());
        String H = serializer.H();
        ActionType.a aVar = ActionType.Companion;
        String H2 = serializer.H();
        aVar.getClass();
    }
}
