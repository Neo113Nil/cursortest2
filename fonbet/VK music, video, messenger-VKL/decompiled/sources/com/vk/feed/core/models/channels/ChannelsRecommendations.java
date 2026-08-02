package com.vk.feed.core.models.channels;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.LinkButton;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Objects;
import xsna.epx;
import xsna.ho8;
import xsna.iux0;

/* compiled from: ChannelsRecommendations.kt */
/* loaded from: classes18.dex */
public final class ChannelsRecommendations extends NewsEntry implements iux0 {
    public static final Serializer.c<ChannelsRecommendations> CREATOR = new a();
    public final String i;
    public final ArrayList<ChannelsRecommendation> j;
    public final LinkButton k;
    public final String l;
    public final String m;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ChannelsRecommendations> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ChannelsRecommendations a(Serializer serializer) {
            return new ChannelsRecommendations(serializer.H(), serializer.B(ChannelsRecommendation.class.getClassLoader()), (LinkButton) serializer.G(LinkButton.class.getClassLoader()), serializer.I());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChannelsRecommendations[i];
        }
    }

    public ChannelsRecommendations(String str, ArrayList<ChannelsRecommendation> arrayList, LinkButton linkButton, String str2) {
        super(new NewsEntry.TrackData(str2, 0, 0L, false, false, null, null, 0, 254, null));
        this.i = str;
        this.j = arrayList;
        this.k = linkButton;
        this.l = str2;
        this.m = "recommended_channels";
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Bb() {
        return Db();
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return this.m;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.i);
        serializer.f0(this.j);
        serializer.i0(this.k);
        serializer.m0(this.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChannelsRecommendations) {
            ChannelsRecommendations channelsRecommendations = (ChannelsRecommendations) obj;
            if (epx.f(this.m, channelsRecommendations.m) && epx.f(this.l, channelsRecommendations.l)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.iux0, xsna.kru
    public final String getTitle() {
        return this.i;
    }

    public final int hashCode() {
        return Objects.hash(this.m, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsRecommendations(title=");
        sb.append(this.i);
        sb.append(", items=");
        sb.append(this.j);
        sb.append(", button=");
        sb.append(this.k);
        sb.append(", trackCode=");
        return ho8.a(sb, this.l, ')');
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 68;
    }
}
