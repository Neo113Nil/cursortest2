package com.vk.video.playlist.playlistscreen.catalog;

import com.vk.catalog.mvi.block.BlockId;
import defpackage.q0;
import java.util.ArrayList;
import xsna.epx;
import xsna.qr;
import xsna.r2a;
import xsna.vu5;

/* compiled from: PlaylistHorizontalFiltersWithScrollView.kt */
/* loaded from: classes6.dex */
public final class n implements r2a {
    public final String b;
    public final ArrayList c;
    public final int d;

    /* compiled from: PlaylistHorizontalFiltersWithScrollView.kt */
    public static final class a {
        public final String a;
        public final boolean b;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ButtonViewState(title=");
            sb.append(this.a);
            sb.append(", isSelected=");
            return q0.a(sb, this.b, ')');
        }
    }

    public n() {
        throw null;
    }

    public n(String str, ArrayList arrayList, int i) {
        this.b = str;
        this.c = arrayList;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return epx.f(this.b, nVar.b) && epx.f(this.c, nVar.c) && this.d == nVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + qr.a(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewState(blockId=");
        io.reactivex.rxjava3.processors.b.b(sb, this.b, ", seasonsBlockFilters=");
        sb.append(this.c);
        sb.append(", selectedIndex=");
        return vu5.b(sb, this.d, ')');
    }

    @Override // xsna.r2a
    public final BlockId w() {
        return new BlockId.Simple(this.b);
    }
}
