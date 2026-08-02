package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsFeedbacksStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedbacksStat$TypeFeedbackView implements SchemeStat$TypeView.b {

    @pmi0("block_id")
    private final String blockId;

    public MobileOfficialAppsFeedbacksStat$TypeFeedbackView(String str) {
        this.blockId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedbacksStat$TypeFeedbackView) && epx.f(this.blockId, ((MobileOfficialAppsFeedbacksStat$TypeFeedbackView) obj).blockId);
    }

    public final int hashCode() {
        return this.blockId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("TypeFeedbackView(blockId="), this.blockId, ')');
    }
}
