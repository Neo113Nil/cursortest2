package com.vk.feed.core.models.news;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.actions.Action;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;
import xsna.zjh0;

/* compiled from: ExpertCard.kt */
/* loaded from: classes18.dex */
public final class ExpertCard extends NewsEntry {
    public static final Serializer.c<ExpertCard> CREATOR = new a();
    public final String i;
    public final String j;
    public final double k;
    public final boolean l;
    public final Action m;
    public final String n = "expert_card";

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ExpertCard> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ExpertCard a(Serializer serializer) {
            return new ExpertCard(serializer.H(), serializer.H(), serializer.r(), serializer.m(), (Action) serializer.G(Action.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExpertCard[i];
        }
    }

    public ExpertCard(String str, String str2, double d, boolean z, Action action) {
        this.i = str;
        this.j = str2;
        this.k = d;
        this.l = z;
        this.m = action;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return this.n;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.O(this.k);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
        serializer.i0(this.m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpertCard)) {
            return false;
        }
        ExpertCard expertCard = (ExpertCard) obj;
        return epx.f(this.i, expertCard.i) && epx.f(this.j, expertCard.j) && Double.compare(this.k, expertCard.k) == 0 && this.l == expertCard.l && epx.f(this.m, expertCard.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + qoy.b(zjh0.b(this.k, urd0.a(this.i.hashCode() * 31, 31, this.j), 31), 31, this.l);
    }

    public final String toString() {
        return "ExpertCard(title=" + this.i + ", subtitle=" + this.j + ", rating=" + this.k + ", isRatingHighlighted=" + this.l + ", action=" + this.m + ')';
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 40;
    }
}
