package com.vk.dto.stories.model.actions;

import com.vk.core.serialize.Serializer;
import com.vk.dto.polls.Poll;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.superapp.api.dto.story.actions.StickerAction;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: ActionPoll.kt */
/* loaded from: classes18.dex */
public final class ActionPoll extends StickerAction {
    public static final Serializer.c<ActionPoll> CREATOR = new a();
    public Poll b;
    public final WebStickerType c = WebStickerType.POLL;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionPoll> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionPoll a(Serializer serializer) {
            return new ActionPoll((Poll) serializer.G(Poll.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionPoll[i];
        }
    }

    public ActionPoll(Poll poll) {
        this.b = poll;
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final JSONObject Ab() {
        Poll poll = this.b;
        if (poll != null) {
            return poll.e5();
        }
        return null;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActionPoll) && epx.f(this.b, ((ActionPoll) obj).b);
    }

    public final int hashCode() {
        Poll poll = this.b;
        if (poll == null) {
            return 0;
        }
        return poll.hashCode();
    }

    public final String toString() {
        return "ActionPoll(poll=" + this.b + ')';
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final WebStickerType zb() {
        return this.c;
    }
}
