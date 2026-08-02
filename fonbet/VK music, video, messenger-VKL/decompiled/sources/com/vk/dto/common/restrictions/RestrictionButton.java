package com.vk.dto.common.restrictions;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.aay;
import xsna.asp;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.s3q0;
import xsna.urd0;
import xsna.w9y;
import xsna.zrp;

/* compiled from: RestrictionButton.kt */
/* loaded from: classes18.dex */
public final class RestrictionButton extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<RestrictionButton> CREATOR = new b();
    public static final a e = new a();
    public final String b;
    public final String c;
    public final String d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RestrictionButton.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action DELETE;
        public static final Action DONAT;
        public static final Action LOGIN;
        public static final Action PLAY;
        public static final Action SUBSCRIBE;
        public static final Action UPDATE;
        private final String value;

        static {
            Action action = new Action("PLAY", 0, "play");
            PLAY = action;
            Action action2 = new Action("SUBSCRIBE", 1, "subscribe");
            SUBSCRIBE = action2;
            Action action3 = new Action("LOGIN", 2, "login");
            LOGIN = action3;
            Action action4 = new Action("DELETE", 3, "delete");
            DELETE = action4;
            Action action5 = new Action(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_UPDATE, 4, "update");
            UPDATE = action5;
            Action action6 = new Action("DONAT", 5, "donat");
            DONAT = action6;
            Action[] actionArr = {action, action2, action3, action4, action5, action6};
            $VALUES = actionArr;
            $ENTRIES = new asp(actionArr);
        }

        public Action(String str, int i, String str2) {
            this.value = str2;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<RestrictionButton> {
        @Override // xsna.aay
        public final RestrictionButton a(JSONObject jSONObject) {
            String optString = jSONObject.optString("action");
            String optString2 = jSONObject.optString("title");
            String optString3 = jSONObject.optString("action_url");
            if (optString.length() == 0 && optString2.length() == 0) {
                return null;
            }
            return new RestrictionButton(optString, optString2, optString3);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<RestrictionButton> {
        @Override // com.vk.core.serialize.Serializer.c
        public final RestrictionButton a(Serializer serializer) {
            return new RestrictionButton(serializer.H(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RestrictionButton[i];
        }
    }

    public RestrictionButton(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "action");
        w9yVar.e(this.c, "title");
        w9yVar.e(this.d, "action_url");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RestrictionButton)) {
            return false;
        }
        RestrictionButton restrictionButton = (RestrictionButton) obj;
        return epx.f(this.b, restrictionButton.b) && epx.f(this.c, restrictionButton.c) && epx.f(this.d, restrictionButton.d);
    }

    public final String getTitle() {
        return this.c;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RestrictionButton(action=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", actionUrl=");
        return ho8.a(sb, this.d, ')');
    }

    public final String zb() {
        return this.b;
    }
}
