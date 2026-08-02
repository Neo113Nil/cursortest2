package com.vk.feed.core.models.feedback;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;

/* compiled from: ButtonsFeedback.kt */
/* loaded from: classes18.dex */
public final class ButtonsFeedback extends Feedback {
    public static final Serializer.c<ButtonsFeedback> CREATOR = new b();
    public final List<Answer> f;

    /* compiled from: ButtonsFeedback.kt */
    public static final class Answer extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Answer> CREATOR = new a();
        public final String b;
        public final String c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Answer> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Answer a(Serializer serializer) {
                return new Answer(serializer.H(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Answer[i];
            }
        }

        public Answer(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Answer)) {
                return false;
            }
            Answer answer = (Answer) obj;
            return epx.f(this.b, answer.b) && epx.f(this.c, answer.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Answer(id=");
            sb.append(this.b);
            sb.append(", title=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: ButtonsFeedback.kt */
    public static final class a {
        public static ButtonsFeedback a(JSONObject jSONObject) {
            String string = jSONObject.getString("question");
            ArrayList arrayList = null;
            String optString = jSONObject.optString("gratitude", null);
            JSONArray optJSONArray = jSONObject.optJSONArray("answers");
            Serializer.c<Answer> cVar = Answer.CREATOR;
            if (optJSONArray != null) {
                arrayList = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        arrayList.add(new Answer(optJSONObject.getString("id"), optJSONObject.getString("title")));
                    }
                }
            }
            return new ButtonsFeedback(string, optString, arrayList, jSONObject.optString("track_code"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ButtonsFeedback> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ButtonsFeedback a(Serializer serializer) {
            return new ButtonsFeedback(serializer.H(), serializer.H(), serializer.j(Answer.CREATOR), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ButtonsFeedback[i];
        }
    }

    public ButtonsFeedback(String str, String str2, List<Answer> list, String str3) {
        super(str, str2, str3);
        this.f = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.o0(this.f);
        serializer.j0(this.d);
    }
}
