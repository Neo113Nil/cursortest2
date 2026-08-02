package com.vk.newsfeed.posting.impl.domain.rules.local;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.music.MusicAttachDto;
import com.vk.newsfeed.posting.impl.domain.rules.PostingRule;
import com.vk.newsfeed.posting.impl.domain.rules.RuleAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import java.util.Collections;
import java.util.List;
import xsna.nrg0;
import xsna.xmc0;

/* compiled from: AudioMaxCountRule.kt */
/* loaded from: classes4.dex */
public final class AudioMaxCountRule implements PostingRule {
    public static final Serializer.c<AudioMaxCountRule> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AudioMaxCountRule> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioMaxCountRule a(Serializer serializer) {
            return new AudioMaxCountRule();
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioMaxCountRule[i];
        }
    }

    @Override // com.vk.newsfeed.posting.impl.domain.rules.PostingRule
    public final PostingRule.a F2(xmc0 xmc0Var) {
        PostingState.Editing editing = xmc0Var.a;
        PostingSettings postingSettings = xmc0Var.c;
        boolean z = postingSettings.t;
        int i = postingSettings.s;
        if (!z || i <= 0) {
            MusicAttachDto musicAttachDto = editing.i.l;
            return musicAttachDto instanceof MusicAttachDto.MusicTracksDto ? ((MusicAttachDto.MusicTracksDto) musicAttachDto).b.size() > 1 ? new PostingRule.a.b(new PostingUserMessage.Service(this, null, false, 6, null)) : PostingRule.a.C1431a.b : PostingRule.a.C1431a.b;
        }
        MusicAttachDto musicAttachDto2 = editing.i.l;
        return musicAttachDto2 instanceof MusicAttachDto.MusicTracksDto ? ((MusicAttachDto.MusicTracksDto) musicAttachDto2).b.size() > i ? new PostingRule.a.b(new PostingUserMessage.Service(this, null, false, 6, null)) : PostingRule.a.C1431a.b : PostingRule.a.C1431a.b;
    }

    @Override // com.vk.newsfeed.posting.impl.domain.rules.PostingRule
    public final List<nrg0> c6(xmc0 xmc0Var) {
        int i;
        int i2 = 1;
        if (xmc0Var.c.t && (i = xmc0Var.a.d.s) >= 1) {
            i2 = i;
        }
        return Collections.singletonList(new nrg0(RuleAttachment.Audio, i2));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
    }
}
