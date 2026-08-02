package com.vk.dto.community.entries.widget;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Match.kt */
/* loaded from: classes18.dex */
public final class Match extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<Match> CREATOR = new a();
    public final Team b;
    public final Team c;
    public final Image d;
    public final Score e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Match> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Match a(Serializer serializer) {
            return new Match(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Match[i];
        }
    }

    public Match(JSONObject jSONObject) throws JSONException {
        this.f = jSONObject.optString("state");
        this.e = new Score(jSONObject.optJSONObject("score"));
        this.b = new Team(jSONObject.getJSONObject("team_a"));
        this.c = new Team(jSONObject.getJSONObject("team_b"));
        JSONArray optJSONArray = jSONObject.optJSONArray("icon");
        JSONObject optJSONObject = jSONObject.optJSONObject("live_action");
        this.d = optJSONArray == null ? null : new Image(optJSONArray, null, 2, null);
        this.g = optJSONObject != null ? optJSONObject.getString("url") : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("action");
        this.h = optJSONObject2 != null ? optJSONObject2.optString("url") : null;
        this.i = optJSONObject2 != null ? optJSONObject2.optString("target") : null;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.i0(this.d);
        serializer.i0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
    }

    /* compiled from: Match.kt */
    public static final class Score extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Score> CREATOR = new a();
        public final Integer b;
        public final Integer c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Score> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Score a(Serializer serializer) {
                return new Score(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Score[i];
            }
        }

        public Score(JSONObject jSONObject) throws JSONException {
            if (jSONObject == null) {
                this.b = null;
                this.c = null;
            } else {
                this.b = Integer.valueOf(jSONObject.getInt("team_a"));
                this.c = Integer.valueOf(jSONObject.getInt("team_b"));
            }
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            Integer num = this.b;
            serializer.j0(num != null ? num.toString() : null);
            Integer num2 = this.c;
            serializer.j0(num2 != null ? num2.toString() : null);
        }

        public final String toString() {
            Integer num;
            Integer num2 = this.b;
            if (num2 == null || (num = this.c) == null) {
                return "–";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(num2);
            sb.append(':');
            sb.append(num);
            return sb.toString();
        }

        public Score(Serializer serializer) {
            String H = serializer.H();
            String H2 = serializer.H();
            this.b = H == null ? null : Integer.valueOf(H);
            this.c = H2 != null ? Integer.valueOf(H2) : null;
        }
    }

    public Match(Serializer serializer) {
        this.b = (Team) serializer.G(Team.class.getClassLoader());
        this.c = (Team) serializer.G(Team.class.getClassLoader());
        this.d = (Image) serializer.G(Image.class.getClassLoader());
        this.e = (Score) serializer.G(Score.class.getClassLoader());
        this.f = serializer.H();
        this.g = serializer.H();
        this.h = serializer.H();
        this.i = serializer.H();
    }
}
