package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.music.RadioStation;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import java.util.List;
import java.util.Objects;
import xsna.dfp0;
import xsna.epx;
import xsna.ho8;
import xsna.i7o0;

/* compiled from: UIBlockRadioStation.kt */
/* loaded from: classes16.dex */
public final class UIBlockRadioStation extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockRadioStation> CREATOR = new a();
    public final RadioStation y;
    public final List<RadioStation> z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockRadioStation> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockRadioStation a(Serializer serializer) {
            return new UIBlockRadioStation(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockRadioStation[i];
        }
    }

    public UIBlockRadioStation(com.vk.catalog2.common.dto.api.ui.a aVar, RadioStation radioStation, List<RadioStation> list) {
        super(aVar);
        this.y = radioStation;
        this.z = list;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return String.valueOf(this.y.b);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
        serializer.W(this.z);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof UIBlockRadioStation) && UIBlock.a.b(this, (UIBlock) obj)) {
            return epx.f(this.y, ((UIBlockRadioStation) obj).y);
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.y.i;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return ho8.a(new StringBuilder("RadioStation<"), this.y.e, '>');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return new UIBlockRadioStation(Ab(), RadioStation.zb(this.y, false, 255), i7o0.a(this.z));
    }

    public UIBlockRadioStation(Serializer serializer) {
        super(serializer);
        Serializer.StreamParcelable G = serializer.G(RadioStation.class.getClassLoader());
        if (G != null) {
            this.y = (RadioStation) G;
            this.z = serializer.k(RadioStation.class);
            return;
        }
        throw new IllegalArgumentException("Can't get value!");
    }
}
