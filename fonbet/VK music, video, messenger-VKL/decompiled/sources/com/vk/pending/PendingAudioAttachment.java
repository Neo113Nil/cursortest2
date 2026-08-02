package com.vk.pending;

import androidx.annotation.NonNull;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.MusicTrack;
import com.vk.upload.impl.b;
import com.vk.upload.impl.tasks.d;
import com.vkontakte.android.attachments.AudioAttachment;
import xsna.ju90;

/* loaded from: classes4.dex */
public class PendingAudioAttachment extends AudioAttachment implements ju90 {
    public static final Serializer.c<PendingAudioAttachment> CREATOR = new a();

    public class a extends Serializer.c<PendingAudioAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PendingAudioAttachment a(@NonNull Serializer serializer) {
            return new PendingAudioAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PendingAudioAttachment[i];
        }
    }

    public PendingAudioAttachment(MusicTrack musicTrack) {
        super(musicTrack);
    }

    @Override // xsna.ju90
    public final void O3(int i) {
        this.f.b = i;
    }

    @Override // xsna.ju90
    public final int S() {
        return this.f.b;
    }

    @Override // xsna.ju90
    public final String getUri() {
        return this.f.i;
    }

    @Override // xsna.ju90
    public final b y6() {
        MusicTrack musicTrack = this.f;
        d dVar = new d(musicTrack.i, false);
        dVar.d = musicTrack.b;
        return dVar;
    }

    public PendingAudioAttachment(Serializer serializer) {
        super(serializer);
    }
}
