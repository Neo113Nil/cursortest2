package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.music.AudioStreamMixTitles;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.a;
import com.vk.core.serialize.Serializer;
import xsna.ho8;
import xsna.qjg;

/* compiled from: UiBlockMusicVkMix.kt */
/* loaded from: classes16.dex */
public abstract class UiBlockMusicVkMix extends UIBlock {
    public final String A;
    public final boolean B;
    public final String y;
    public final AudioStreamMixTitles z;

    public UiBlockMusicVkMix(a aVar, String str, AudioStreamMixTitles audioStreamMixTitles, String str2, boolean z) {
        super(aVar);
        this.y = str;
        this.z = audioStreamMixTitles;
        this.A = str2;
        this.B = z;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b + '_' + this.y;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.y);
        serializer.e0(this.z);
        serializer.j0(this.A);
        serializer.L(this.B ? (byte) 1 : (byte) 0);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append('<');
        return ho8.a(sb, this.y, '>');
    }

    public UiBlockMusicVkMix(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.y = H == null ? "" : H;
        this.z = (AudioStreamMixTitles) serializer.A(AudioStreamMixTitles.class.getClassLoader());
        String H2 = serializer.H();
        this.A = H2 != null ? H2 : "";
        this.B = serializer.m();
    }
}
