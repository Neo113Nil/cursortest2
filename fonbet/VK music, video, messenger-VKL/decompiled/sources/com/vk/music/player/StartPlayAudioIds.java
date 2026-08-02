package com.vk.music.player;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.j5g;

/* compiled from: StartPlayRequest.kt */
/* loaded from: classes3.dex */
public final class StartPlayAudioIds extends StartPlaySource {
    public static final Serializer.c<StartPlayAudioIds> CREATOR = new a();
    public final List<String> c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StartPlayAudioIds> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StartPlayAudioIds a(Serializer serializer) {
            return new StartPlayAudioIds(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StartPlayAudioIds[i];
        }
    }

    public StartPlayAudioIds(List<String> list) {
        super(null, 1, null);
        this.c = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.l0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StartPlayAudioIds) && epx.f(this.c, ((StartPlayAudioIds) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartPlayAudioIds(audioIds(first=");
        List<String> list = this.c;
        sb.append((String) j5g.a0(list));
        sb.append(", last=");
        sb.append((String) j5g.k0(list));
        sb.append("), ids size = ");
        sb.append(list.size());
        sb.append(')');
        return sb.toString();
    }

    public StartPlayAudioIds(Serializer serializer) {
        this(com.vk.core.serialize.a.a(serializer));
    }
}
