package com.vk.libvideo.upload.api;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import xsna.epx;
import xsna.lq;
import xsna.oq;
import xsna.xq;
import xsna.zcl;

/* compiled from: VideoUploadEvents.kt */
/* loaded from: classes.dex */
public abstract class VideoUploadEvent extends Serializer.StreamParcelableAdapter {
    public final VideoUpload b;

    /* compiled from: VideoUploadEvents.kt */
    /* loaded from: classes3.dex */
    public static final class Cancel extends VideoUploadEvent {
        public static final Serializer.c<Cancel> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Cancel> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Cancel a(Serializer serializer) {
                return new Cancel((VideoUpload) serializer.A(VideoUpload.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cancel[i];
            }
        }

        public Cancel(VideoUpload videoUpload) {
            super(videoUpload, null);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.e0(this.b);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Cancel) && epx.f(((Cancel) obj).b, this.b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Cancel[upload=" + this.b + ']';
        }

        @Override // com.vk.libvideo.upload.api.VideoUploadEvent
        public final VideoUploadEvent zb(boolean z) {
            return new Cancel(VideoUpload.zb(this.b, null, null, false, false, z, null, null, 65023));
        }
    }

    /* compiled from: VideoUploadEvents.kt */
    /* loaded from: classes3.dex */
    public static final class Delete extends VideoUploadEvent {
        public static final Serializer.c<Delete> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Delete> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Delete a(Serializer serializer) {
                return new Delete((VideoUpload) serializer.A(VideoUpload.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Delete[i];
            }
        }

        public Delete(VideoUpload videoUpload) {
            super(videoUpload, null);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.e0(this.b);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Delete) && epx.f(((Delete) obj).b, this.b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Delete[upload=" + this.b + ']';
        }

        @Override // com.vk.libvideo.upload.api.VideoUploadEvent
        public final VideoUploadEvent zb(boolean z) {
            return new Delete(VideoUpload.zb(this.b, null, null, false, false, z, null, null, 65023));
        }
    }

    /* compiled from: VideoUploadEvents.kt */
    /* loaded from: classes3.dex */
    public static final class Done extends VideoUploadEvent {
        public static final Serializer.c<Done> CREATOR = new a();
        public final VideoFile c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Done> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Done a(Serializer serializer) {
                return new Done((VideoUpload) serializer.A(VideoUpload.class.getClassLoader()), (VideoFile) serializer.A(VideoFile.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Done[i];
            }
        }

        public Done(VideoUpload videoUpload, VideoFile videoFile) {
            super(videoUpload, null);
            this.c = videoFile;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.e0(this.b);
            serializer.e0(this.c);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Done) && epx.f(((Done) obj).b, this.b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Done[upload=" + this.b + ']';
        }

        @Override // com.vk.libvideo.upload.api.VideoUploadEvent
        public final VideoUploadEvent zb(boolean z) {
            return new Done(VideoUpload.zb(this.b, null, null, false, false, z, null, null, 65023), this.c);
        }
    }

    /* compiled from: VideoUploadEvents.kt */
    /* loaded from: classes3.dex */
    public static final class Fail extends VideoUploadEvent {
        public static final Serializer.c<Fail> CREATOR = new a();
        public final Throwable c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Fail> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Fail a(Serializer serializer) {
                return new Fail((VideoUpload) serializer.A(VideoUpload.class.getClassLoader()), (Throwable) serializer.C());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Fail[i];
            }
        }

        public Fail(VideoUpload videoUpload, Throwable th) {
            super(videoUpload, null);
            this.c = th;
        }

        public final Throwable Ab() {
            return this.c;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.e0(this.b);
            serializer.g0(this.c);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Fail)) {
                return false;
            }
            Fail fail = (Fail) obj;
            return epx.f(fail.b, this.b) && epx.f(fail.c, this.c);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Fail[upload=");
            sb.append(this.b);
            sb.append(", error=");
            return oq.c(sb, this.c, ']');
        }

        @Override // com.vk.libvideo.upload.api.VideoUploadEvent
        public final VideoUploadEvent zb(boolean z) {
            return new Fail(VideoUpload.zb(this.b, null, null, false, false, z, null, null, 65023), this.c);
        }
    }

    /* compiled from: VideoUploadEvents.kt */
    /* loaded from: classes3.dex */
    public static final class Progress extends VideoUploadEvent {
        public static final Serializer.c<Progress> CREATOR = new a();
        public final float c;
        public final boolean d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Progress> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Progress a(Serializer serializer) {
                return new Progress((VideoUpload) serializer.A(VideoUpload.class.getClassLoader()), serializer.s(), serializer.m());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Progress[i];
            }
        }

        public /* synthetic */ Progress(VideoUpload videoUpload, float f, boolean z, int i, zcl zclVar) {
            this(videoUpload, f, (i & 4) != 0 ? false : z);
        }

        public final float Ab() {
            return this.c;
        }

        public final boolean Bb() {
            return this.d;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.e0(this.b);
            serializer.P(this.c);
            serializer.L(this.d ? (byte) 1 : (byte) 0);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) obj;
            return epx.f(progress.b, this.b) && progress.c == this.c;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Progress[upload=");
            sb.append(this.b);
            sb.append(", progress=");
            return xq.c(']', this.c, sb);
        }

        @Override // com.vk.libvideo.upload.api.VideoUploadEvent
        public final VideoUploadEvent zb(boolean z) {
            return new Progress(VideoUpload.zb(this.b, null, null, false, false, z, null, null, 65023), this.c, false, 4, null);
        }

        public Progress(VideoUpload videoUpload, float f, boolean z) {
            super(videoUpload, null);
            this.c = f;
            this.d = z;
        }
    }

    /* compiled from: VideoUploadEvents.kt */
    /* loaded from: classes3.dex */
    public static final class Removed extends VideoUploadEvent {
        public static final Serializer.c<Removed> CREATOR = new a();
        public final VideoFile c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Removed> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Removed a(Serializer serializer) {
                return new Removed((VideoFile) serializer.A(VideoFile.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Removed[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Removed(VideoFile videoFile) {
            super(VideoUpload.s, null);
            Serializer.c<VideoUpload> cVar = VideoUpload.CREATOR;
            this.c = videoFile;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.e0(this.c);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Removed) && epx.f(((Removed) obj).c, this.c);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return lq.a(new StringBuilder("Removed[upload=EMPTY, videoFile="), this.c, ']');
        }

        @Override // com.vk.libvideo.upload.api.VideoUploadEvent
        public final VideoUploadEvent zb(boolean z) {
            return new Removed(this.c);
        }
    }

    /* compiled from: VideoUploadEvents.kt */
    /* loaded from: classes3.dex */
    public static final class Start extends VideoUploadEvent {
        public static final Serializer.c<Start> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Start> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Start a(Serializer serializer) {
                return new Start((VideoUpload) serializer.A(VideoUpload.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Start[i];
            }
        }

        public Start(VideoUpload videoUpload) {
            super(videoUpload, null);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.e0(this.b);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Start) && epx.f(((Start) obj).b, this.b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Start[upload=" + this.b + ']';
        }

        @Override // com.vk.libvideo.upload.api.VideoUploadEvent
        public final VideoUploadEvent zb(boolean z) {
            return new Start(VideoUpload.zb(this.b, null, null, false, false, z, null, null, 65023));
        }
    }

    public VideoUploadEvent(VideoUpload videoUpload, zcl zclVar) {
        this.b = videoUpload;
    }

    public abstract VideoUploadEvent zb(boolean z);
}
