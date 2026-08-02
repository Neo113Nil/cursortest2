package com.vk.dto.actionlinks;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;

/* compiled from: ActionButtonStat.kt */
/* loaded from: classes18.dex */
public final class ActionButtonStat extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ActionButtonStat> CREATOR = new b();
    public final int b;
    public final int c;
    public final ActionLink d;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ActionButtonStat> {
        @Override // xsna.aay
        public final ActionButtonStat a(JSONObject jSONObject) {
            return new ActionButtonStat(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ActionButtonStat> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionButtonStat a(Serializer serializer) {
            return new ActionButtonStat(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionButtonStat[i];
        }
    }

    static {
        new a();
    }

    public ActionButtonStat(JSONObject jSONObject) {
        this.b = jSONObject.optInt("clicks");
        this.c = jSONObject.optInt("views");
        this.d = new ActionLink(jSONObject.optJSONObject("link"));
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.i0(this.d);
    }

    public ActionButtonStat(Serializer serializer) {
        this.b = serializer.u();
        this.c = serializer.u();
        this.d = (ActionLink) serializer.G(ActionLink.class.getClassLoader());
    }
}
