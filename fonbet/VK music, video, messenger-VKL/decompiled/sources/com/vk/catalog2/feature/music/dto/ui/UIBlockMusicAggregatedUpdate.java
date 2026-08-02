package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.a;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.AudioFollowingsUpdateInfo;
import java.util.Objects;
import xsna.epx;
import xsna.ho8;

/* compiled from: UIBlockMusicAggregatedUpdate.kt */
/* loaded from: classes16.dex */
public final class UIBlockMusicAggregatedUpdate extends UIBlock {
    public static final Serializer.c<UIBlockMusicAggregatedUpdate> CREATOR = new a();
    public final AudioFollowingsUpdateInfo y;
    public final UIBlockAction z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockMusicAggregatedUpdate> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockMusicAggregatedUpdate a(Serializer serializer) {
            return new UIBlockMusicAggregatedUpdate(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockMusicAggregatedUpdate[i];
        }
    }

    public UIBlockMusicAggregatedUpdate(com.vk.catalog2.common.dto.api.ui.a aVar, AudioFollowingsUpdateInfo audioFollowingsUpdateInfo, UIBlockAction uIBlockAction) {
        super(aVar);
        this.y = audioFollowingsUpdateInfo;
        this.z = uIBlockAction;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.y.c;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
        serializer.i0(this.z);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockMusicAggregatedUpdate) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockMusicAggregatedUpdate uIBlockMusicAggregatedUpdate = (UIBlockMusicAggregatedUpdate) obj;
        return epx.f(this.y, uIBlockMusicAggregatedUpdate.y) && epx.f(this.z, uIBlockMusicAggregatedUpdate.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return ho8.a(new StringBuilder("AudioFollowingsUpdateInfo<"), this.y.c, '>');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        com.vk.catalog2.common.dto.api.ui.a a2 = a.C0482a.a(this);
        AudioFollowingsUpdateInfo audioFollowingsUpdateInfo = this.y;
        AudioFollowingsUpdateInfo audioFollowingsUpdateInfo2 = new AudioFollowingsUpdateInfo(audioFollowingsUpdateInfo.b, audioFollowingsUpdateInfo.c, audioFollowingsUpdateInfo.d);
        UIBlockAction uIBlockAction = this.z;
        return new UIBlockMusicAggregatedUpdate(a2, audioFollowingsUpdateInfo2, uIBlockAction != null ? uIBlockAction.zb() : null);
    }

    public UIBlockMusicAggregatedUpdate(Serializer serializer) {
        super(serializer);
        this.y = (AudioFollowingsUpdateInfo) serializer.G(AudioFollowingsUpdateInfo.class.getClassLoader());
        this.z = (UIBlockAction) serializer.G(UIBlockActionPlayAudiosFromBlock.class.getClassLoader());
    }
}
