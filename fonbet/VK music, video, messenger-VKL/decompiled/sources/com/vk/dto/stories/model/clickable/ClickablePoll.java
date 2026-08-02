package com.vk.dto.stories.model.clickable;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollBackground;
import com.vk.dto.polls.PollContentColor;
import com.vk.dto.stories.entities.stat.ClickableStickerStatInfo;
import com.vk.dto.stories.model.actions.ActionPoll;
import com.vk.stickers.api.styles.StickerCommonStyle;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import xsna.epx;
import xsna.q500;
import xsna.zcl;

/* compiled from: ClickablePoll.kt */
/* loaded from: classes18.dex */
public final class ClickablePoll extends ClickableSticker {
    public static final Serializer.c<ClickablePoll> CREATOR = new a();
    public final ActionPoll e;
    public final WebStickerType f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClickablePoll> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickablePoll a(Serializer serializer) {
            return new ClickablePoll(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickablePoll[i];
        }
    }

    public /* synthetic */ ClickablePoll(long j, List list, q500 q500Var, ActionPoll actionPoll, int i, zcl zclVar) {
        this((i & 1) != 0 ? 0L : j, list, (i & 4) != 0 ? null : q500Var, actionPoll);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final void Ab(ClickableStickerStatInfo.a aVar) {
        Object obj;
        StickerCommonStyle stickerCommonStyle;
        StringBuilder sb = new StringBuilder();
        ActionPoll actionPoll = this.e;
        Poll poll = actionPoll.b;
        if (poll == null || (obj = poll.c) == null) {
            obj = 0;
        }
        sb.append(obj);
        sb.append('_');
        Poll poll2 = actionPoll.b;
        sb.append(poll2 != null ? poll2.b : 0);
        aVar.b("text_value", sb.toString());
        Poll poll3 = actionPoll.b;
        String str = null;
        PollBackground pollBackground = poll3 != null ? poll3.s : null;
        PollContentColor pollContentColor = pollBackground instanceof PollContentColor ? (PollContentColor) pollBackground : null;
        if (pollContentColor != null && (stickerCommonStyle = pollContentColor.d) != null) {
            str = stickerCommonStyle.i();
        }
        aVar.b(TtmlNode.TAG_STYLE, str);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final WebStickerType Cb() {
        return this.f;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.W(this.c);
        serializer.d0(this.d);
        serializer.i0(this.e);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker, xsna.bxx
    public final JSONObject e5() {
        Object obj;
        JSONObject e5 = super.e5();
        ActionPoll actionPoll = this.e;
        Poll poll = actionPoll.b;
        if (poll == null || (obj = poll.c) == null) {
            obj = 0;
        }
        e5.put("poll_owner_id", obj);
        Poll poll2 = actionPoll.b;
        e5.put("poll_id", poll2 != null ? poll2.b : 0);
        return e5;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickablePoll) || !super.equals(obj)) {
            return false;
        }
        ClickablePoll clickablePoll = (ClickablePoll) obj;
        return epx.f(this.e, clickablePoll.e) && this.f == clickablePoll.f;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + (super.hashCode() * 31)) * 31);
    }

    public ClickablePoll(long j, List<WebClickablePoint> list, q500 q500Var, ActionPoll actionPoll) {
        super(j, list, q500Var);
        this.e = actionPoll;
        this.f = WebStickerType.POLL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClickablePoll(Serializer serializer) {
        this(r1, r3, r4, r7 == null ? new ActionPoll(null) : r7);
        long w = serializer.w();
        ArrayList k = serializer.k(WebClickablePoint.class);
        ArrayList arrayList = k == null ? new ArrayList() : k;
        q500 y = serializer.y();
        ActionPoll actionPoll = (ActionPoll) serializer.G(ActionPoll.class.getClassLoader());
    }
}
