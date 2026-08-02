package com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll;

import com.vk.dto.common.id.UserId;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.InteractivePollStickerView;
import xsna.epx;
import xsna.qoy;
import xsna.shy;

/* compiled from: PollVotingInteractor.kt */
/* loaded from: classes6.dex */
public final class e {
    public final UserId a;
    public final int b;
    public final boolean c;
    public final InteractivePollStickerView.b d;

    public e(UserId userId, int i, boolean z, InteractivePollStickerView.b bVar) {
        this.a = userId;
        this.b = i;
        this.c = z;
        this.d = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return epx.f(this.a, eVar.a) && this.b == eVar.b && this.c == eVar.c && epx.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qoy.b(shy.a(this.b, Long.hashCode(this.a.b) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "PollVoteData(ownerId=" + this.a + ", pollId=" + this.b + ", isBoard=" + this.c + ", statData=" + this.d + ')';
    }
}
