package com.vk.pushes.notifications.base;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;

/* compiled from: PushButton.kt */
/* loaded from: classes5.dex */
public final class PushButton extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PushButton> CREATOR = new b();
    public final String b;
    public final Action c;

    /* compiled from: PushButton.kt */
    public static final class Action extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Action> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Action> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Action a(Serializer serializer) {
                return new Action(serializer.H(), serializer.H(), serializer.H(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Action[i];
            }
        }

        public Action(String str, String str2, String str3, String str4) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.j0(this.e);
        }
    }

    /* compiled from: PushButton.kt */
    public static final class a {
        public static PushButton a(JSONObject jSONObject) {
            String optString = jSONObject.optString("label");
            JSONObject optJSONObject = jSONObject.optJSONObject("action");
            Action action = null;
            if (optJSONObject != null) {
                Serializer.c<Action> cVar = Action.CREATOR;
                String optString2 = optJSONObject.optString("type");
                String optString3 = optJSONObject.optString("url", null);
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("context");
                action = new Action(optString2, optJSONObject2 != null ? optJSONObject2.optString("query", null) : null, optString3, optJSONObject2 != null ? optJSONObject2.toString() : null);
            }
            return new PushButton(optString, action);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<PushButton> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PushButton a(Serializer serializer) {
            return new PushButton(serializer.H(), (Action) serializer.G(Action.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PushButton[i];
        }
    }

    public PushButton(String str, Action action) {
        this.b = str;
        this.c = action;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
    }
}
