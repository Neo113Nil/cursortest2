package com.vk.superapp.api.dto.story.actions;

import android.graphics.Color;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.story.WebStickerType;
import org.json.JSONObject;
import xsna.epx;
import xsna.urd0;
import xsna.vu5;

/* compiled from: WebActionQuestion.kt */
/* loaded from: classes6.dex */
public final class WebActionQuestion extends StickerAction {
    public static final Serializer.c<WebActionQuestion> CREATOR = new b();
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final WebStickerType f;

    /* compiled from: WebActionQuestion.kt */
    public static final class a {
        public static WebActionQuestion a(JSONObject jSONObject) {
            return new WebActionQuestion(jSONObject.getString("question"), jSONObject.optString("button", jSONObject.optString("question_button")), jSONObject.optString(TtmlNode.TAG_STYLE, "light"), Color.parseColor("#" + jSONObject.optString("color", "3F8AE0")));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<WebActionQuestion> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebActionQuestion a(Serializer serializer) {
            return new WebActionQuestion(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebActionQuestion[i];
        }
    }

    public WebActionQuestion(String str, String str2, String str3, int i) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = WebStickerType.QUESTION;
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final JSONObject Ab() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("question", this.b);
        jSONObject.put("button", this.c);
        jSONObject.put(TtmlNode.TAG_STYLE, this.d);
        jSONObject.put("color", this.e);
        return jSONObject;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.S(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebActionQuestion)) {
            return false;
        }
        WebActionQuestion webActionQuestion = (WebActionQuestion) obj;
        return epx.f(this.b, webActionQuestion.b) && epx.f(this.c, webActionQuestion.c) && epx.f(this.d, webActionQuestion.d) && this.e == webActionQuestion.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebActionQuestion(question=");
        sb.append(this.b);
        sb.append(", button=");
        sb.append(this.c);
        sb.append(", style=");
        sb.append(this.d);
        sb.append(", color=");
        return vu5.b(sb, this.e, ')');
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final WebStickerType zb() {
        return this.f;
    }

    public WebActionQuestion(Serializer serializer) {
        this(serializer.H(), serializer.H(), serializer.H(), serializer.u());
    }
}
