package com.vk.libvideo.live.api.broadcast_settings.models;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import xsna.epx;
import xsna.lq;
import xsna.zcl;

/* compiled from: BroadcastStream.kt */
/* loaded from: classes3.dex */
public abstract class BroadcastStream extends Serializer.StreamParcelableAdapter {

    /* compiled from: BroadcastStream.kt */
    public static final class Upcoming extends BroadcastStream {
        public static final Serializer.c<Upcoming> CREATOR = new a();
        public final VideoFile b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Upcoming> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Upcoming a(Serializer serializer) {
                return new Upcoming((VideoFile) serializer.G(VideoFile.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Upcoming[i];
            }
        }

        public Upcoming(VideoFile videoFile) {
            super(null);
            this.b = videoFile;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Upcoming) && epx.f(this.b, ((Upcoming) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return lq.a(new StringBuilder("Upcoming(videoFile="), this.b, ')');
        }
    }

    public /* synthetic */ BroadcastStream(zcl zclVar) {
        this();
    }

    public BroadcastStream() {
    }

    /* compiled from: BroadcastStream.kt */
    public static final class New extends BroadcastStream {
        public static final New b = new New(null);
        public static final Serializer.c<New> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<New> {
            @Override // com.vk.core.serialize.Serializer.c
            public final New a(Serializer serializer) {
                return New.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new New[i];
            }
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
        }
    }
}
