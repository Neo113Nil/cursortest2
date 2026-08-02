package com.vk.dto.common.actions;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;

/* compiled from: ActionPerformActionWithUrl.kt */
/* loaded from: classes18.dex */
public final class ActionPerformActionWithUrl extends Action {
    public static final Serializer.c<ActionPerformActionWithUrl> CREATOR = new a();
    public final String c;
    public final PerformActionWithUrl d;

    /* compiled from: ActionPerformActionWithUrl.kt */
    public static final class PerformActionWithUrl extends Serializer.StreamParcelableAdapter implements bxx {
        public static final Serializer.c<PerformActionWithUrl> CREATOR = new c();
        public final String b;

        /* compiled from: ActionPerformActionWithUrl.kt */
        public static final class a {
        }

        /* compiled from: JsonParser.kt */
        public static final class b extends aay<PerformActionWithUrl> {
            @Override // xsna.aay
            public final PerformActionWithUrl a(JSONObject jSONObject) {
                return new PerformActionWithUrl(jSONObject.optString("action"));
            }
        }

        /* compiled from: Serializer.kt */
        public static final class c extends Serializer.c<PerformActionWithUrl> {
            @Override // com.vk.core.serialize.Serializer.c
            public final PerformActionWithUrl a(Serializer serializer) {
                return new PerformActionWithUrl(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PerformActionWithUrl[i];
            }
        }

        static {
            new b();
        }

        public PerformActionWithUrl(String str) {
            this.b = str;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
        }

        @Override // xsna.bxx
        public final JSONObject e5() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", this.b);
            return jSONObject;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PerformActionWithUrl) && epx.f(this.b, ((PerformActionWithUrl) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("PerformActionWithUrl(action="), this.b, ')');
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionPerformActionWithUrl> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionPerformActionWithUrl a(Serializer serializer) {
            return new ActionPerformActionWithUrl(serializer.H(), (PerformActionWithUrl) serializer.A(PerformActionWithUrl.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionPerformActionWithUrl[i];
        }
    }

    public ActionPerformActionWithUrl(String str, PerformActionWithUrl performActionWithUrl) {
        this.c = str;
        this.d = performActionWithUrl;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.e0(this.d);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("perform_action_with_url", this.d);
        jSONObject.put("url", this.c);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionPerformActionWithUrl)) {
            return false;
        }
        ActionPerformActionWithUrl actionPerformActionWithUrl = (ActionPerformActionWithUrl) obj;
        return epx.f(this.c, actionPerformActionWithUrl.c) && epx.f(this.d, actionPerformActionWithUrl.d);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        PerformActionWithUrl performActionWithUrl = this.d;
        return hashCode + (performActionWithUrl == null ? 0 : performActionWithUrl.hashCode());
    }

    public final String toString() {
        return "ActionPerformActionWithUrl(url=" + this.c + ", action=" + this.d + ')';
    }
}
