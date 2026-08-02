package com.vk.dto.stories.model.clickable;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.stories.entities.stat.ClickableStickerStatInfo;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.superapp.api.dto.story.actions.WebActionQuestion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
import xsna.epx;
import xsna.q500;
import xsna.qoy;
import xsna.zcl;

/* compiled from: ClickableQuestion.kt */
/* loaded from: classes18.dex */
public final class ClickableQuestion extends ClickableSticker {
    public static final Serializer.c<ClickableQuestion> CREATOR = new a();
    public final WebActionQuestion e;
    public final boolean f;
    public final WebStickerType g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClickableQuestion> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickableQuestion a(Serializer serializer) {
            return new ClickableQuestion(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickableQuestion[i];
        }
    }

    public /* synthetic */ ClickableQuestion(long j, List list, q500 q500Var, WebActionQuestion webActionQuestion, boolean z, int i, zcl zclVar) {
        this((i & 1) != 0 ? 0L : j, list, (i & 4) != 0 ? null : q500Var, webActionQuestion, (i & 16) != 0 ? true : z);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final void Ab(ClickableStickerStatInfo.a aVar) {
        StringBuilder sb = new StringBuilder();
        WebActionQuestion webActionQuestion = this.e;
        sb.append(webActionQuestion.b);
        sb.append('\t');
        sb.append(webActionQuestion.c);
        aVar.b("text_value", sb.toString());
        aVar.b(TtmlNode.TAG_STYLE, webActionQuestion.d);
        aVar.b("color", Db());
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final WebStickerType Cb() {
        return this.g;
    }

    public final String Db() {
        return String.format("%06X", Arrays.copyOf(new Object[]{Integer.valueOf(this.e.e & 16777215)}, 1));
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.W(this.c);
        serializer.d0(this.d);
        serializer.i0(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker, xsna.bxx
    public final JSONObject e5() {
        JSONObject e5 = super.e5();
        WebActionQuestion webActionQuestion = this.e;
        e5.put("question", webActionQuestion.b);
        e5.put("question_button", webActionQuestion.c);
        e5.put(TtmlNode.TAG_STYLE, webActionQuestion.d);
        e5.put("color", Db());
        return e5;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableQuestion) || !super.equals(obj)) {
            return false;
        }
        ClickableQuestion clickableQuestion = (ClickableQuestion) obj;
        return epx.f(this.e, clickableQuestion.e) && this.f == clickableQuestion.f && Db().equals(clickableQuestion.Db()) && this.g == clickableQuestion.g;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final int hashCode() {
        return this.g.hashCode() + ((Db().hashCode() + qoy.b((this.e.hashCode() + (super.hashCode() * 31)) * 31, 31, this.f)) * 31);
    }

    public ClickableQuestion(long j, List<WebClickablePoint> list, q500 q500Var, WebActionQuestion webActionQuestion, boolean z) {
        super(j, list, q500Var);
        this.e = webActionQuestion;
        this.f = z;
        this.g = WebStickerType.QUESTION;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClickableQuestion(Serializer serializer) {
        this(r1, r0 == null ? new ArrayList() : r0, serializer.y(), (WebActionQuestion) serializer.G(WebActionQuestion.class.getClassLoader()), serializer.m());
        long w = serializer.w();
        ArrayList k = serializer.k(WebClickablePoint.class);
    }
}
