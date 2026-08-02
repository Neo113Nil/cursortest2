package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.MusicTrack;
import java.util.Objects;
import xsna.epx;
import xsna.ho8;

/* compiled from: UIBlockMusicSignal.kt */
/* loaded from: classes16.dex */
public final class UIBlockMusicSignal extends UIBlock {
    public static final Serializer.c<UIBlockMusicSignal> CREATOR = new a();
    public final String A;
    public final String B;
    public final String C;
    public final MusicTrack D;
    public final UIBlockActionPlayAudiosFromBlock E;
    public final UIBlockActionOpenSection F;
    public final String y;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockMusicSignal> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockMusicSignal a(Serializer serializer) {
            return new UIBlockMusicSignal(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockMusicSignal[i];
        }
    }

    public UIBlockMusicSignal(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2, String str3, String str4, String str5, MusicTrack musicTrack, UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock, UIBlockActionOpenSection uIBlockActionOpenSection) {
        super(aVar);
        this.y = str;
        this.z = str2;
        this.A = str3;
        this.B = str4;
        this.C = str5;
        this.D = musicTrack;
        this.E = uIBlockActionPlayAudiosFromBlock;
        this.F = uIBlockActionOpenSection;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.y;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.y);
        serializer.j0(this.z);
        serializer.j0(this.A);
        serializer.j0(this.B);
        serializer.j0(this.C);
        serializer.i0(this.D);
        serializer.i0(this.E);
        serializer.i0(this.F);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockMusicSignal) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockMusicSignal uIBlockMusicSignal = (UIBlockMusicSignal) obj;
        return epx.f(this.y, uIBlockMusicSignal.y) && epx.f(this.z, uIBlockMusicSignal.z) && epx.f(this.A, uIBlockMusicSignal.A) && epx.f(this.B, uIBlockMusicSignal.B) && epx.f(this.C, uIBlockMusicSignal.C) && epx.f(this.D, uIBlockMusicSignal.D) && epx.f(this.E, uIBlockMusicSignal.E) && epx.f(this.F, uIBlockMusicSignal.F);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return ho8.a(new StringBuilder("Signal<"), this.A, '>');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        MusicTrack musicTrack = this.D;
        MusicTrack zb = musicTrack != null ? MusicTrack.zb(musicTrack, 0, null, 0, 0, null, false, null, null, false, false, null, null, null, -1, 1048575) : null;
        UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock = this.E;
        UIBlockActionPlayAudiosFromBlock zb2 = uIBlockActionPlayAudiosFromBlock != null ? uIBlockActionPlayAudiosFromBlock.zb() : null;
        UIBlockActionOpenSection uIBlockActionOpenSection = this.F;
        return new UIBlockMusicSignal(Ab, this.y, this.z, this.A, this.B, this.C, zb, zb2, uIBlockActionOpenSection != null ? uIBlockActionOpenSection.Rb(uIBlockActionOpenSection.e) : null);
    }

    public UIBlockMusicSignal(Serializer serializer) {
        super(serializer);
        this.y = serializer.H();
        this.z = serializer.H();
        String H = serializer.H();
        this.A = H == null ? "" : H;
        String H2 = serializer.H();
        this.B = H2 == null ? "" : H2;
        String H3 = serializer.H();
        this.C = H3 != null ? H3 : "";
        this.D = (MusicTrack) serializer.G(MusicTrack.class.getClassLoader());
        this.E = (UIBlockActionPlayAudiosFromBlock) serializer.G(UIBlockActionPlayAudiosFromBlock.class.getClassLoader());
        this.F = (UIBlockActionOpenSection) serializer.G(UIBlockActionOpenSection.class.getClassLoader());
    }
}
