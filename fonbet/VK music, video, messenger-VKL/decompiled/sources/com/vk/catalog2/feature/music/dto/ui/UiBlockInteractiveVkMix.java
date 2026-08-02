package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.music.AudioStreamMixTitles;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.core.serialize.Serializer;
import com.vk.music.mixsettings.MixSettingsEntity;
import java.util.Objects;
import xsna.epx;

/* compiled from: UiBlockInteractiveVkMix.kt */
/* loaded from: classes16.dex */
public final class UiBlockInteractiveVkMix extends UiBlockMusicVkMix {
    public static final Serializer.c<UiBlockInteractiveVkMix> CREATOR = new a();
    public final MixSettingsEntity C;
    public final UIBlockPlaceholder D;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UiBlockInteractiveVkMix> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UiBlockInteractiveVkMix a(Serializer serializer) {
            return new UiBlockInteractiveVkMix(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UiBlockInteractiveVkMix[i];
        }
    }

    public UiBlockInteractiveVkMix(com.vk.catalog2.common.dto.api.ui.a aVar, String str, AudioStreamMixTitles audioStreamMixTitles, String str2, MixSettingsEntity mixSettingsEntity, boolean z, UIBlockPlaceholder uIBlockPlaceholder) {
        super(aVar, str, audioStreamMixTitles, str2, z);
        this.C = mixSettingsEntity;
        this.D = uIBlockPlaceholder;
    }

    @Override // com.vk.catalog2.feature.music.dto.ui.UiBlockMusicVkMix, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.e0(this.C);
        serializer.L(this.B ? (byte) 1 : (byte) 0);
        serializer.i0(this.D);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UiBlockInteractiveVkMix) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UiBlockInteractiveVkMix uiBlockInteractiveVkMix = (UiBlockInteractiveVkMix) obj;
        return epx.f(this.y, uiBlockInteractiveVkMix.y) && epx.f(this.z, uiBlockInteractiveVkMix.z) && epx.f(this.A, uiBlockInteractiveVkMix.A) && this.B == uiBlockInteractiveVkMix.B && epx.f(this.D, uiBlockInteractiveVkMix.D) && epx.f(this.C, uiBlockInteractiveVkMix.C);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.A, this.C, this.z, Boolean.valueOf(this.B), this.D);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        AudioStreamMixTitles audioStreamMixTitles = this.z;
        AudioStreamMixTitles zb = audioStreamMixTitles != null ? AudioStreamMixTitles.zb(audioStreamMixTitles) : null;
        MixSettingsEntity mixSettingsEntity = this.C;
        MixSettingsEntity a2 = mixSettingsEntity != null ? MixSettingsEntity.a(mixSettingsEntity, null, 15) : null;
        UIBlockPlaceholder uIBlockPlaceholder = this.D;
        return new UiBlockInteractiveVkMix(Ab, this.y, zb, this.A, a2, this.B, uIBlockPlaceholder != null ? uIBlockPlaceholder.zb() : null);
    }

    public UiBlockInteractiveVkMix(Serializer serializer) {
        super(serializer);
        this.C = (MixSettingsEntity) serializer.A(MixSettingsEntity.class.getClassLoader());
        this.D = (UIBlockPlaceholder) serializer.G(UIBlockPlaceholder.class.getClassLoader());
    }
}
