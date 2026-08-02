package com.vk.fave;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.fave.MarketFavable;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.ecomm.fave.api.models.FaveMarketItem;
import com.vk.fave.entities.FaveType;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import xsna.epx;
import xsna.gmq;
import xsna.gnq;

/* compiled from: FaveItem.kt */
/* loaded from: classes18.dex */
public final class FaveItem implements Serializer.StreamParcelable {
    public static final Serializer.c<FaveItem> CREATOR = new a();
    public final String b;
    public final boolean c;
    public final long d;
    public final List<FaveTag> e;
    public gmq f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<FaveItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final FaveItem a(Serializer serializer) {
            return new FaveItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FaveItem[i];
        }
    }

    public FaveItem(String str, boolean z, long j, List<FaveTag> list, gmq gmqVar) {
        this.b = str;
        this.c = z;
        this.d = j;
        this.e = list;
        this.f = gmqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        String str = this.b;
        serializer.j0(str);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.Y(this.d);
        serializer.W(this.e);
        serializer.j0(str);
        gnq gnqVar = gnq.a;
        gmq gmqVar = this.f;
        gnqVar.getClass();
        serializer.i0(gmqVar instanceof Post ? (Serializer.StreamParcelableAdapter) gmqVar : gmqVar instanceof ArticleAttachment ? (Serializer.StreamParcelableAdapter) gmqVar : gmqVar instanceof SnippetAttachment ? (Serializer.StreamParcelableAdapter) gmqVar : gmqVar instanceof FaveMarketItem ? (Serializer.StreamParcelableAdapter) gmqVar : gmqVar instanceof MarketFavable ? (Serializer.StreamParcelableAdapter) gmqVar : gmqVar instanceof VideoAttachment ? (Serializer.StreamParcelableAdapter) gmqVar : gmqVar instanceof PodcastAttachment ? (Serializer.StreamParcelableAdapter) gmqVar : gmqVar instanceof Narrative ? (Serializer.StreamParcelableAdapter) gmqVar : null);
    }

    public final gmq d() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!FaveItem.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        FaveItem faveItem = (FaveItem) obj;
        return epx.f(this.b, faveItem.b) && epx.f(this.f, faveItem.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "FaveItem(type=" + this.b + ", seen=" + this.c + ", addedDate=" + this.d + ", tags=" + this.e + ", content=" + this.f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FaveItem(Serializer serializer) {
        this(r2, r3, r4, r6, r9);
        gmq gmqVar;
        String H = serializer.H();
        String str = H == null ? "" : H;
        boolean m = serializer.m();
        long w = serializer.w();
        ArrayList l = serializer.l(FaveTag.class.getClassLoader());
        ArrayList arrayList = l == null ? new ArrayList() : l;
        gnq.a.getClass();
        switch (gnq.a.$EnumSwitchMapping$0[FaveType.valueOf(serializer.H().toUpperCase(Locale.ROOT)).ordinal()]) {
            case 1:
                gmqVar = (gmq) serializer.G(Post.class.getClassLoader());
                break;
            case 2:
                gmqVar = (gmq) serializer.G(ArticleAttachment.class.getClassLoader());
                break;
            case 3:
                gmqVar = (gmq) serializer.G(SnippetAttachment.class.getClassLoader());
                break;
            case 4:
                gmqVar = (gmq) serializer.G(FaveMarketItem.class.getClassLoader());
                break;
            case 5:
                gmqVar = (gmq) serializer.G(VideoAttachment.class.getClassLoader());
                break;
            case 6:
                gmqVar = (gmq) serializer.G(VideoAttachment.class.getClassLoader());
                break;
            case 7:
                gmqVar = (gmq) serializer.G(PodcastAttachment.class.getClassLoader());
                break;
            case 8:
                gmqVar = (gmq) serializer.G(Narrative.class.getClassLoader());
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
