package com.vk.catalog.mvi.block.video.impl.p002short;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.dto.common.VideoFile;
import xsna.lq;
import xsna.smk;

/* compiled from: ClipListViewEvent.kt */
/* loaded from: classes16.dex */
public interface c extends smk {

    /* compiled from: ClipListViewEvent.kt */
    public static final class a implements c {
        public final BlockId.CompositeId a;
        public final VideoFile b;

        public a(BlockId.CompositeId compositeId, VideoFile videoFile) {
            this.a = compositeId;
            this.b = videoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenShortVideo(blockId=");
            sb.append(this.a);
            sb.append(", file=");
            return lq.a(sb, this.b, ')');
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }
}
