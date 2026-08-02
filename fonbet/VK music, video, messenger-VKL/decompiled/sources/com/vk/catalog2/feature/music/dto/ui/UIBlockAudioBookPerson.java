package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.audiobook.AudioBookPerson;
import java.util.Objects;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: UIBlockAudioBookPerson.kt */
/* loaded from: classes16.dex */
public final class UIBlockAudioBookPerson extends UIBlock {
    public static final Serializer.c<UIBlockAudioBookPerson> CREATOR = new a();
    public final AudioBookPerson y;
    public final UIBlockLegalNotice z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockAudioBookPerson> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockAudioBookPerson a(Serializer serializer) {
            return new UIBlockAudioBookPerson(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockAudioBookPerson[i];
        }
    }

    public /* synthetic */ UIBlockAudioBookPerson(com.vk.catalog2.common.dto.api.ui.a aVar, AudioBookPerson audioBookPerson, UIBlockLegalNotice uIBlockLegalNotice, int i, zcl zclVar) {
        this(aVar, audioBookPerson, (i & 4) != 0 ? null : uIBlockLegalNotice);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return String.valueOf(this.y.b);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
        serializer.i0(this.z);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockAudioBookPerson) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockAudioBookPerson uIBlockAudioBookPerson = (UIBlockAudioBookPerson) obj;
        return epx.f(this.y, uIBlockAudioBookPerson.y) && epx.f(this.z, uIBlockAudioBookPerson.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return ho8.a(new StringBuilder("Person["), this.y.c, ']');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        AudioBookPerson zb = AudioBookPerson.zb(this.y);
        UIBlockLegalNotice uIBlockLegalNotice = this.z;
        return new UIBlockAudioBookPerson(Ab, zb, uIBlockLegalNotice != null ? new UIBlockLegalNotice(uIBlockLegalNotice.Ab(), uIBlockLegalNotice.y, uIBlockLegalNotice.z) : null);
    }

    public UIBlockAudioBookPerson(com.vk.catalog2.common.dto.api.ui.a aVar, AudioBookPerson audioBookPerson, UIBlockLegalNotice uIBlockLegalNotice) {
        super(aVar);
        this.y = audioBookPerson;
        this.z = uIBlockLegalNotice;
    }

    public UIBlockAudioBookPerson(Serializer serializer) {
        super(serializer);
        this.y = (AudioBookPerson) serializer.G(AudioBookPerson.class.getClassLoader());
        this.z = (UIBlockLegalNotice) serializer.G(UIBlockLegalNotice.class.getClassLoader());
    }
}
