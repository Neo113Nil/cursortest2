package com.vk.catalog.mvi.block.video.impl.p002short;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.dto.common.VideoFile;
import xsna.epx;
import xsna.ho8;
import xsna.jq;
import xsna.smk;

/* compiled from: ShortVideoEvent.kt */
/* loaded from: classes.dex */
public interface e extends smk {

    /* compiled from: ShortVideoEvent.kt */
    /* loaded from: classes16.dex */
    public static final class a implements e {
        public final BlockId.CompositeId a;
        public final VideoFile b;
        public final String c;

        public a(BlockId.CompositeId compositeId, VideoFile videoFile, String str) {
            this.a = compositeId;
            this.b = videoFile;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int b = jq.b(this.b, this.a.hashCode() * 31, 31);
            String str = this.c;
            return b + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenShortVideo(blockId=");
            sb.append(this.a);
            sb.append(", file=");
            sb.append(this.b);
            sb.append(", trackCode=");
            return ho8.a(sb, this.c, ')');
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }
}
