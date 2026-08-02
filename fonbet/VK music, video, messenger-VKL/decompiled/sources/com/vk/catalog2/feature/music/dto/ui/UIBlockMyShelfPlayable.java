package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.CatalogButtonOpenUrl;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.audiobook.AudioBook;
import java.util.Objects;
import xsna.epx;
import xsna.ho8;
import xsna.qjg;
import xsna.zcl;

/* compiled from: UIBlockMyShelfPlayable.kt */
/* loaded from: classes16.dex */
public final class UIBlockMyShelfPlayable extends UIBlock {
    public static final Serializer.c<UIBlockMyShelfPlayable> CREATOR = new a();
    public final AudioBook A;
    public final CatalogButtonOpenUrl y;
    public final MusicTrack z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockMyShelfPlayable> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockMyShelfPlayable a(Serializer serializer) {
            return new UIBlockMyShelfPlayable(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockMyShelfPlayable[i];
        }
    }

    public /* synthetic */ UIBlockMyShelfPlayable(com.vk.catalog2.common.dto.api.ui.a aVar, CatalogButtonOpenUrl catalogButtonOpenUrl, MusicTrack musicTrack, AudioBook audioBook, int i, zcl zclVar) {
        this(aVar, catalogButtonOpenUrl, (i & 4) != 0 ? null : musicTrack, (i & 8) != 0 ? null : audioBook);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        MusicTrack musicTrack = this.z;
        sb.append(musicTrack != null ? Integer.valueOf(musicTrack.b) : null);
        AudioBook audioBook = this.A;
        sb.append(audioBook != null ? Integer.valueOf(audioBook.b) : null);
        return sb.toString();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
        serializer.i0(this.z);
        serializer.i0(this.A);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockMyShelfPlayable) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockMyShelfPlayable uIBlockMyShelfPlayable = (UIBlockMyShelfPlayable) obj;
        return epx.f(this.y, uIBlockMyShelfPlayable.y) && epx.f(this.z, uIBlockMyShelfPlayable.z) && epx.f(this.A, uIBlockMyShelfPlayable.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z, this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append('<');
        return ho8.a(sb, this.y.e, '>');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        CatalogButtonOpenUrl catalogButtonOpenUrl = this.y;
        CatalogButtonOpenUrl catalogButtonOpenUrl2 = new CatalogButtonOpenUrl(catalogButtonOpenUrl.c, catalogButtonOpenUrl.d, catalogButtonOpenUrl.e, catalogButtonOpenUrl.f, catalogButtonOpenUrl.g, catalogButtonOpenUrl.h, catalogButtonOpenUrl.i, catalogButtonOpenUrl.j, catalogButtonOpenUrl.k);
        MusicTrack musicTrack = this.z;
        MusicTrack zb = musicTrack != null ? MusicTrack.zb(musicTrack, 0, null, 0, 0, null, false, null, null, false, false, null, null, null, -1, 1048575) : null;
        AudioBook audioBook = this.A;
        return new UIBlockMyShelfPlayable(Ab, catalogButtonOpenUrl2, zb, audioBook != null ? AudioBook.zb(audioBook, null, false, 4194303) : null);
    }

    public UIBlockMyShelfPlayable(com.vk.catalog2.common.dto.api.ui.a aVar, CatalogButtonOpenUrl catalogButtonOpenUrl, MusicTrack musicTrack, AudioBook audioBook) {
        super(aVar);
        this.y = catalogButtonOpenUrl;
        this.z = musicTrack;
        this.A = audioBook;
    }

    public UIBlockMyShelfPlayable(Serializer serializer) {
        super(serializer);
        this.y = (CatalogButtonOpenUrl) serializer.G(CatalogButtonOpenUrl.class.getClassLoader());
        this.z = (MusicTrack) serializer.G(MusicTrack.class.getClassLoader());
        this.A = (AudioBook) serializer.G(AudioBook.class.getClassLoader());
    }
}
