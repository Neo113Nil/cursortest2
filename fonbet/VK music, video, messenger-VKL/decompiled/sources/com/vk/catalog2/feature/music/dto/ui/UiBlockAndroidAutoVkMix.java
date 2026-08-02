package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.music.AudioStreamMixTitles;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import java.util.Objects;
import xsna.epx;

/* compiled from: UiBlockAndroidAutoVkMix.kt */
/* loaded from: classes16.dex */
public final class UiBlockAndroidAutoVkMix extends UiBlockMusicVkMix {
    public static final Serializer.c<UiBlockAndroidAutoVkMix> CREATOR = new a();
    public final String C;
    public final String D;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UiBlockAndroidAutoVkMix> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UiBlockAndroidAutoVkMix a(Serializer serializer) {
            return new UiBlockAndroidAutoVkMix(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UiBlockAndroidAutoVkMix[i];
        }
    }

    public UiBlockAndroidAutoVkMix(com.vk.catalog2.common.dto.api.ui.a aVar, String str, boolean z, String str2, AudioStreamMixTitles audioStreamMixTitles, String str3, String str4) {
        super(aVar, str, audioStreamMixTitles, str4, z);
        this.C = str2;
        this.D = str3;
    }

    @Override // com.vk.catalog2.feature.music.dto.ui.UiBlockMusicVkMix, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.C);
        serializer.j0(this.D);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UiBlockAndroidAutoVkMix) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UiBlockAndroidAutoVkMix uiBlockAndroidAutoVkMix = (UiBlockAndroidAutoVkMix) obj;
        return epx.f(this.y, uiBlockAndroidAutoVkMix.y) && this.B == uiBlockAndroidAutoVkMix.B && epx.f(this.C, uiBlockAndroidAutoVkMix.C) && epx.f(this.D, uiBlockAndroidAutoVkMix.D) && epx.f(this.z, uiBlockAndroidAutoVkMix.z) && epx.f(this.A, uiBlockAndroidAutoVkMix.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.C, this.D, this.z, this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        AudioStreamMixTitles audioStreamMixTitles = this.z;
        return new UiBlockAndroidAutoVkMix(Ab, this.y, this.B, this.C, audioStreamMixTitles != null ? AudioStreamMixTitles.zb(audioStreamMixTitles) : null, this.D, this.A);
    }

    public UiBlockAndroidAutoVkMix(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.C = H == null ? "" : H;
        String H2 = serializer.H();
        this.D = H2 != null ? H2 : "";
    }
}
