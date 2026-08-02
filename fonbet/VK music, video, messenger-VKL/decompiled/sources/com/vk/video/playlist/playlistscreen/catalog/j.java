package com.vk.video.playlist.playlistscreen.catalog;

import com.vk.catalog.mvi.block.BlockId;
import xsna.epx;
import xsna.q1a;
import xsna.vu5;

/* compiled from: PlaylistHorizontalFiltersWithScrollView.kt */
/* loaded from: classes6.dex */
public interface j extends q1a {

    /* compiled from: PlaylistHorizontalFiltersWithScrollView.kt */
    public static final class a implements j {
        public final String b;
        public final int c;

        public a(String str, int i) {
            this.b = str;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClickBlockFilter(blockId=");
            io.reactivex.rxjava3.processors.b.b(sb, this.b, ", filterIndex=");
            return vu5.b(sb, this.c, ')');
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return new BlockId.Simple(this.b);
        }
    }
}
