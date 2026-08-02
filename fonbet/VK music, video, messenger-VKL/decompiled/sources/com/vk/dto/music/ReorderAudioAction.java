package com.vk.dto.music;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.Objects;
import xsna.epx;

/* compiled from: ReorderAudioAction.kt */
/* loaded from: classes18.dex */
public final class ReorderAudioAction extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ReorderAudioAction> CREATOR = new a();
    public final UserId b;
    public final int c;
    public final String d;
    public int e;
    public int f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ReorderAudioAction> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ReorderAudioAction a(Serializer serializer) {
            return new ReorderAudioAction(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReorderAudioAction[i];
        }
    }

    public ReorderAudioAction(UserId userId, int i, String str, int i2, int i3) {
        this.b = userId;
        this.c = i;
        this.d = str;
        this.e = i2;
        this.f = i3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.S(this.c);
        serializer.j0(this.d);
        serializer.S(this.e);
        serializer.S(this.f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ReorderAudioAction)) {
            return false;
        }
        ReorderAudioAction reorderAudioAction = (ReorderAudioAction) obj;
        return this.c == reorderAudioAction.c && epx.f(this.b, reorderAudioAction.b);
    }

    public final int hashCode() {
        return Objects.hash(this.b, Integer.valueOf(this.c));
    }

    public ReorderAudioAction(MusicTrack musicTrack, int i, int i2) {
        this(musicTrack.c, musicTrack.b, musicTrack.r, i, i2);
    }

    public ReorderAudioAction(Serializer serializer) {
        this((UserId) serializer.A(UserId.class.getClassLoader()), serializer.u(), serializer.H(), serializer.u(), serializer.u());
    }
}
