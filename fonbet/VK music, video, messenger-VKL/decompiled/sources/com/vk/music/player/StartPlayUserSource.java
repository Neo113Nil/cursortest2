package com.vk.music.player;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.vu5;

/* compiled from: StartPlayRequest.kt */
/* loaded from: classes3.dex */
public final class StartPlayUserSource extends StartPlaySource {
    public static final Serializer.c<StartPlayUserSource> CREATOR = new a();
    public final UserId c;
    public final int d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StartPlayUserSource> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StartPlayUserSource a(Serializer serializer) {
            return new StartPlayUserSource(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StartPlayUserSource[i];
        }
    }

    public StartPlayUserSource(UserId userId, int i) {
        super(null, 1, null);
        this.c = userId;
        this.d = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.c);
        serializer.S(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartPlayUserSource)) {
            return false;
        }
        StartPlayUserSource startPlayUserSource = (StartPlayUserSource) obj;
        return epx.f(this.c, startPlayUserSource.c) && this.d == startPlayUserSource.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (Long.hashCode(this.c.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartPlayUserSource(userId=");
        sb.append(this.c);
        sb.append(", offset=");
        return vu5.b(sb, this.d, ')');
    }

    public StartPlayUserSource(Serializer serializer) {
        this((UserId) serializer.A(UserId.class.getClassLoader()), serializer.u());
    }
}
