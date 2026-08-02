package com.vk.catalog.mvi.block.video.impl.p002short.draft;

import android.view.View;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.dto.common.VideoFile;
import xsna.br;
import xsna.epx;
import xsna.jq;
import xsna.smk;

/* compiled from: DraftShortVideoEvent.kt */
/* loaded from: classes.dex */
public interface c extends smk {

    /* compiled from: DraftShortVideoEvent.kt */
    /* loaded from: classes16.dex */
    public static final class a implements c {
        public final BlockId.CompositeId a;
        public final VideoFile b;
        public final View c;

        public a(BlockId.CompositeId compositeId, VideoFile videoFile, View view) {
            this.a = compositeId;
            this.b = videoFile;
            this.c = view;
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
            return this.c.hashCode() + jq.b(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenDraftShortVideo(blockId=");
            sb.append(this.a);
            sb.append(", file=");
            sb.append(this.b);
            sb.append(", view=");
            return br.b(sb, this.c, ')');
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }

    /* compiled from: DraftShortVideoEvent.kt */
    /* loaded from: classes16.dex */
    public static final class b implements c {
        public final BlockId.CompositeId a;
        public final VideoFile b;
        public final View c;

        public b(BlockId.CompositeId compositeId, VideoFile videoFile, View view) {
            this.a = compositeId;
            this.b = videoFile;
            this.c = view;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + jq.b(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenDraftShortVideoMenu(blockId=");
            sb.append(this.a);
            sb.append(", file=");
            sb.append(this.b);
            sb.append(", view=");
            return br.b(sb, this.c, ')');
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }
}
