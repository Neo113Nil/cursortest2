package com.vk.catalog2.feature.news.model;

import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import xsna.d1a;
import xsna.epx;
import xsna.i7o0;
import xsna.lbs;
import xsna.u1c0;
import xsna.yg5;
import xsna.zcl;

/* compiled from: UIBlockFeed.kt */
/* loaded from: classes16.dex */
public final class UIBlockFeed extends UIBlock implements d1a {
    public static final Serializer.c<UIBlockFeed> CREATOR = new a();
    public final int A;
    public final int B;
    public final u1c0 y;
    public final long z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockFeed> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockFeed a(Serializer serializer) {
            return new UIBlockFeed(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockFeed[i];
        }
    }

    public UIBlockFeed(com.vk.catalog2.common.dto.api.ui.a aVar, UIBlockHint uIBlockHint, u1c0 u1c0Var, int i, int i2, long j, long j2, int i3, zcl zclVar) {
        this(aVar, uIBlockHint, u1c0Var, i, i2, (i3 & 32) != 0 ? UIBlock.x.getAndIncrement() : j, (i3 & 64) != 0 ? 0L : j2);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return String.valueOf(this.k);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int Hb() {
        return this.B;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        u1c0 u1c0Var = this.y;
        serializer.S(u1c0Var.c);
        serializer.i0(u1c0Var.a);
        serializer.S(this.A);
        serializer.S(this.B);
        serializer.Y(this.z);
    }

    public final UIBlockFeed Pb(u1c0 u1c0Var, CatalogViewStyle catalogViewStyle) {
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.h);
        Set<UIBlockDragDropAction> Db = Db();
        HashSet hashSet = new HashSet();
        Iterator<UIBlockDragDropAction> it = Db.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().zb());
        }
        com.vk.catalog2.common.dto.api.ui.a aVar = new com.vk.catalog2.common.dto.api.ui.a(this.b, this.c, this.d, this.e, this.f, a2, a3, hashSet, (UIBlockHint) null, catalogViewStyle, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7424);
        UIBlockHint uIBlockHint = this.j;
        return new UIBlockFeed(aVar, uIBlockHint != null ? uIBlockHint.zb() : null, u1c0Var, this.A, this.B, this.k, this.z);
    }

    public final long Qb() {
        return this.z + 1;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof UIBlockFeed) && UIBlock.a.b(this, (UIBlock) obj)) {
            UIBlockFeed uIBlockFeed = (UIBlockFeed) obj;
            u1c0 u1c0Var = uIBlockFeed.y;
            u1c0 u1c0Var2 = this.y;
            if (epx.f(u1c0Var2, u1c0Var) && this.B == uIBlockFeed.B && this.A == uIBlockFeed.A && this.z == uIBlockFeed.z) {
                NewsEntry newsEntry = u1c0Var2.a;
                Boolean bool = null;
                Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
                NewsEntry newsEntry2 = uIBlockFeed.y.a;
                Post post2 = newsEntry2 instanceof Post ? (Post) newsEntry2 : null;
                if (post != null && post2 != null) {
                    bool = Boolean.valueOf(post.J == post2.J);
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        u1c0 u1c0Var = this.y;
        NewsEntry newsEntry = u1c0Var.a;
        Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
        long j = this.z;
        int i = this.B;
        int i2 = this.A;
        if (post != null) {
            return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, Integer.valueOf(i2), Integer.valueOf(i), Boolean.valueOf(post.J), Long.valueOf(j));
        }
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), u1c0Var, Integer.valueOf(i2), Integer.valueOf(i), Long.valueOf(j));
    }

    @Override // xsna.d1a
    public final VideoFile m7() {
        yg5 a2 = this.y.a();
        if (a2 != null) {
            return a2.A();
        }
        return null;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "UIBlockStatus[" + this.y + ']';
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return Pb(lbs.c(this.y, null, null, 0, 7), this.l);
    }

    public UIBlockFeed(Serializer serializer) {
        super(serializer);
        this.y = new u1c0(serializer.u(), (NewsEntry) serializer.G(NewsEntry.class.getClassLoader()));
        this.A = serializer.u();
        this.B = serializer.u();
        this.z = serializer.w();
    }

    public UIBlockFeed(com.vk.catalog2.common.dto.api.ui.a aVar, UIBlockHint uIBlockHint, u1c0 u1c0Var, int i, int i2, long j, long j2) {
        super(aVar.a, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, uIBlockHint, Long.valueOf(j), aVar.j, null, null, null, null, null, 31744, null);
        this.z = j2;
        this.y = u1c0Var;
        this.A = i;
        this.B = i2;
    }
}
