package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.music.AudioStreamMixTitles;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.dto.ui.UiBlockMusicVkMixStyle;
import com.vk.core.serialize.Serializer;
import java.util.Objects;
import xsna.epx;

/* compiled from: UiBlockSimpleVkMix.kt */
/* loaded from: classes16.dex */
public final class UiBlockSimpleVkMix extends UiBlockMusicVkMix {
    public static final Serializer.c<UiBlockSimpleVkMix> CREATOR = new a();
    public final String C;
    public final String D;
    public final UiBlockMusicVkMixStyle E;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UiBlockSimpleVkMix> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UiBlockSimpleVkMix a(Serializer serializer) {
            return new UiBlockSimpleVkMix(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UiBlockSimpleVkMix[i];
        }
    }

    public UiBlockSimpleVkMix(com.vk.catalog2.common.dto.api.ui.a aVar, String str, boolean z, String str2, AudioStreamMixTitles audioStreamMixTitles, String str3, String str4, UiBlockMusicVkMixStyle uiBlockMusicVkMixStyle) {
        super(aVar, str, audioStreamMixTitles, str4, z);
        this.C = str2;
        this.D = str3;
        this.E = uiBlockMusicVkMixStyle;
    }

    @Override // com.vk.catalog2.feature.music.dto.ui.UiBlockMusicVkMix, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.C);
        serializer.j0(this.D);
        serializer.j0(this.E.h());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UiBlockSimpleVkMix) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UiBlockSimpleVkMix uiBlockSimpleVkMix = (UiBlockSimpleVkMix) obj;
        return epx.f(this.y, uiBlockSimpleVkMix.y) && this.B == uiBlockSimpleVkMix.B && epx.f(this.C, uiBlockSimpleVkMix.C) && epx.f(this.D, uiBlockSimpleVkMix.D) && epx.f(this.z, uiBlockSimpleVkMix.z) && epx.f(this.A, uiBlockSimpleVkMix.A) && this.E == uiBlockSimpleVkMix.E;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.C, this.D, this.z, this.A, this.E.h());
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        AudioStreamMixTitles audioStreamMixTitles = this.z;
        return new UiBlockSimpleVkMix(Ab, this.y, this.B, this.C, audioStreamMixTitles != null ? AudioStreamMixTitles.zb(audioStreamMixTitles) : null, this.D, this.A, this.E);
    }

    public UiBlockSimpleVkMix(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.C = H == null ? "" : H;
        String H2 = serializer.H();
        this.D = H2 != null ? H2 : "";
        UiBlockMusicVkMixStyle.a aVar = UiBlockMusicVkMixStyle.Companion;
        String H3 = serializer.H();
        aVar.getClass();
        this.E = UiBlockMusicVkMixStyle.a.a(H3);
    }
}
