package com.vk.feed.core.models.info;

import com.vk.core.serialize.Serializer;
import com.vk.feed.core.models.ImagePhoto;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: InfoBlock.kt */
/* loaded from: classes18.dex */
public final class InfoBlock extends NewsEntry {
    public static final Serializer.c<InfoBlock> CREATOR = new a();
    public final ImagePhoto i;
    public final String j;
    public final String k;
    public final InfoPopup l;
    public final String m;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<InfoBlock> {
        @Override // com.vk.core.serialize.Serializer.c
        public final InfoBlock a(Serializer serializer) {
            return new InfoBlock((ImagePhoto) serializer.G(ImagePhoto.class.getClassLoader()), serializer.H(), serializer.H(), (InfoPopup) serializer.G(InfoPopup.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InfoBlock[i];
        }
    }

    public InfoBlock(ImagePhoto imagePhoto, String str, String str2, InfoPopup infoPopup, String str3) {
        super(new NewsEntry.TrackData(str3, 0, 0L, false, false, null, null, 0, 254, null));
        this.i = imagePhoto;
        this.j = str;
        this.k = str2;
        this.l = infoPopup;
        this.m = str3;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return "info_block";
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
        serializer.i0(this.l);
        serializer.j0(this.m);
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 60;
    }
}
