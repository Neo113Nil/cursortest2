package com.vk.catalog.mvi.block.video.impl.video.list;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.libvideo.api.ui.VideoTransitionSource;
import xsna.bh10;
import xsna.epx;
import xsna.q1a;
import xsna.vu5;

/* compiled from: VideosListView.kt */
/* loaded from: classes16.dex */
public interface c extends q1a {

    /* compiled from: VideosListView.kt */
    public static final class a implements c {
        public final BlockId.CompositeId b;
        public final VideoTransitionSource c;

        public a(BlockId.CompositeId compositeId, VideoTransitionSource videoTransitionSource) {
            this.b = compositeId;
            this.c = videoTransitionSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            VideoTransitionSource videoTransitionSource = this.c;
            return hashCode + (videoTransitionSource == null ? 0 : videoTransitionSource.hashCode());
        }

        public final String toString() {
            return "OnMetaClick(blockId=" + this.b + ", videoTransitionSource=" + this.c + ')';
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideosListView.kt */
    public static final class b implements c {
        public final BlockId.CompositeId b;

        public b(BlockId.CompositeId compositeId) {
            this.b = compositeId;
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideosListView.kt */
    /* renamed from: com.vk.catalog.mvi.block.video.impl.video.list.c$c, reason: collision with other inner class name */
    public static final class C0473c implements c {
        public final BlockId.CompositeId b;
        public final VideoTransitionSource c;

        public C0473c(BlockId.CompositeId compositeId, VideoTransitionSource videoTransitionSource) {
            this.b = compositeId;
            this.c = videoTransitionSource;
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideosListView.kt */
    public static final class d implements c {
        public final BlockId.CompositeId b;

        public d(BlockId.CompositeId compositeId) {
            this.b = compositeId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "PinSubscribersTooltipShown(blockId=" + this.b + ')';
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: VideosListView.kt */
    public static final class e implements c {
        public final BlockId.CompositeId b;
        public final long c;
        public final long d;

        public e(BlockId.CompositeId compositeId, long j, long j2) {
            this.b = compositeId;
            this.c = j;
            this.d = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && this.c == eVar.c && this.d == eVar.d;
        }

        public final int hashCode() {
            return Long.hashCode(this.d) + bh10.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoCardViewedAction(blockId=");
            sb.append(this.b);
            sb.append(", startViewMs=");
            sb.append(this.c);
            sb.append(", endViewMs=");
            return vu5.a(')', this.d, sb);
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }
}
