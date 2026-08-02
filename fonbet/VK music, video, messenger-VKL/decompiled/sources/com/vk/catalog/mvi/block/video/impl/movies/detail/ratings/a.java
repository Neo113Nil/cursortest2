package com.vk.catalog.mvi.block.video.impl.movies.detail.ratings;

import com.vk.catalog.mvi.block.BlockId;
import java.util.ArrayList;
import xsna.bo;
import xsna.mno0;
import xsna.r2a;
import xsna.wow;
import xsna.xq;

/* compiled from: MovieRatingsView.kt */
/* loaded from: classes.dex */
public final class a implements r2a {
    public final BlockId b;
    public final ArrayList c;

    /* compiled from: MovieRatingsView.kt */
    /* renamed from: com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.a$a, reason: collision with other inner class name */
    /* loaded from: classes16.dex */
    public static final class C0461a {
        public final mno0.g a;
        public final float b;

        public C0461a(mno0.g gVar, float f) {
            this.a = gVar;
            this.b = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0461a)) {
                return false;
            }
            C0461a c0461a = (C0461a) obj;
            return this.a.equals(c0461a.a) && Float.compare(this.b, c0461a.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (Integer.hashCode(this.a.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Rating(nameText=");
            sb.append(this.a);
            sb.append(", rating=");
            return xq.c(')', this.b, sb);
        }
    }

    public a(BlockId blockId, ArrayList arrayList) {
        this.b = blockId;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.b.equals(aVar.b) && wow.a(this.c, aVar.c);
    }

    public final int hashCode() {
        return wow.b(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieRatingsViewState(blockId=");
        sb.append(this.b);
        sb.append(", ratings=");
        return bo.c(')', sb, this.c);
    }

    @Override // xsna.r2a
    public final BlockId w() {
        return this.b;
    }
}
