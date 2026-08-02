package com.vk.dto.stories.model.mention;

import android.text.style.UnderlineSpan;
import com.vk.dto.common.id.UserId;
import xsna.i420;
import xsna.p0m0;
import xsna.zcl;

/* compiled from: StorySpans.kt */
/* loaded from: classes18.dex */
public final class StoryMentionSpan extends UnderlineSpan implements i420, p0m0 {
    public final UserId b;
    public boolean c;

    public /* synthetic */ StoryMentionSpan(UserId userId, boolean z, int i, int i2, zcl zclVar) {
        this(userId, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // xsna.i420
    public final boolean n1() {
        return this.c;
    }

    @Override // xsna.i420
    public final void o1(boolean z) {
        this.c = z;
    }

    public StoryMentionSpan(UserId userId, boolean z, int i) {
        this.b = userId;
        this.c = z;
    }

    @Override // xsna.i420
    public final void d1(int i) {
    }
}
