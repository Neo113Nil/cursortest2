package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import xsna.vuu;
import xsna.xq;
import xsna.zcl;

/* compiled from: DownloadingState.kt */
/* loaded from: classes18.dex */
public abstract class DownloadingState extends Serializer.StreamParcelableAdapter {

    /* compiled from: DownloadingState.kt */
    public static final class Downloading extends DownloadingState {
        public static final Serializer.c<Downloading> CREATOR = new a();
        public final float b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Downloading> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Downloading a(Serializer serializer) {
                return new Downloading(serializer.s());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Downloading[i];
            }
        }

        public Downloading(float f) {
            super(null);
            this.b = f;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.P(this.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Downloading) && Float.compare(this.b, ((Downloading) obj).b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b);
        }

        public final String toString() {
            return xq.c(')', this.b, new StringBuilder("Downloading(progress="));
        }

        public final float zb() {
            return this.b;
        }
    }

    /* compiled from: DownloadingState.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static int a(DownloadingState downloadingState) {
            vuu vuuVar = downloadingState instanceof vuu ? (vuu) downloadingState : null;
            if (vuuVar != null) {
                return vuuVar.g5();
            }
            NotLoaded.b.getClass();
            return 0;
        }
    }

    public /* synthetic */ DownloadingState(zcl zclVar) {
        this();
    }

    public DownloadingState() {
    }

    /* compiled from: DownloadingState.kt */
    public static final class Corrupted extends DownloadingState implements vuu {
        public static final Corrupted b = new Corrupted(null);
        public static final int c = 4;
        public static final Serializer.c<Corrupted> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Corrupted> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Corrupted a(Serializer serializer) {
                return Corrupted.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Corrupted[i];
            }
        }

        public final boolean equals(Object obj) {
            return obj instanceof Corrupted;
        }

        @Override // xsna.vuu
        public final int g5() {
            return c;
        }

        public final int hashCode() {
            return c + 31;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
        }
    }

    /* compiled from: DownloadingState.kt */
    public static final class Downloaded extends DownloadingState implements vuu {
        public static final Downloaded b = new Downloaded(null);
        public static final int c = 1;
        public static final Serializer.c<Downloaded> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Downloaded> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Downloaded a(Serializer serializer) {
                return Downloaded.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Downloaded[i];
            }
        }

        public final boolean equals(Object obj) {
            return obj instanceof Downloaded;
        }

        @Override // xsna.vuu
        public final int g5() {
            return c;
        }

        public final int hashCode() {
            return c + 31;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
        }
    }

    /* compiled from: DownloadingState.kt */
    public static final class NotLoaded extends DownloadingState implements vuu {
        public static final NotLoaded b = new NotLoaded(null);
        public static final Serializer.c<NotLoaded> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<NotLoaded> {
            @Override // com.vk.core.serialize.Serializer.c
            public final NotLoaded a(Serializer serializer) {
                return NotLoaded.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotLoaded[i];
            }
        }

        public final boolean equals(Object obj) {
            return obj instanceof NotLoaded;
        }

        @Override // xsna.vuu
        public final int g5() {
            return 0;
        }

        public final int hashCode() {
            return 31;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
        }
    }

    /* compiled from: DownloadingState.kt */
    public static final class PartlyDownloaded extends DownloadingState implements vuu {
        public static final PartlyDownloaded b = new PartlyDownloaded(null);
        public static final int c = 3;
        public static final Serializer.c<PartlyDownloaded> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<PartlyDownloaded> {
            @Override // com.vk.core.serialize.Serializer.c
            public final PartlyDownloaded a(Serializer serializer) {
                return PartlyDownloaded.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PartlyDownloaded[i];
            }
        }

        public final boolean equals(Object obj) {
            return obj instanceof PartlyDownloaded;
        }

        @Override // xsna.vuu
        public final int g5() {
            return c;
        }

        public final int hashCode() {
            return c + 31;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
        }
    }

    /* compiled from: DownloadingState.kt */
    public static final class PendingDownload extends DownloadingState implements vuu {
        public static final PendingDownload b = new PendingDownload(null);
        public static final int c = 2;
        public static final Serializer.c<PendingDownload> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<PendingDownload> {
            @Override // com.vk.core.serialize.Serializer.c
            public final PendingDownload a(Serializer serializer) {
                return PendingDownload.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PendingDownload[i];
            }
        }

        public final boolean equals(Object obj) {
            return obj instanceof PendingDownload;
        }

        @Override // xsna.vuu
        public final int g5() {
            return c;
        }

        public final int hashCode() {
            return c + 31;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
        }
    }
}
