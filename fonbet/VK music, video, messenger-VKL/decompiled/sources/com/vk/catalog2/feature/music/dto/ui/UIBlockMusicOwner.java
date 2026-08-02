package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.music.MusicOwner;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.feature.music.dto.ui.actions.UIBlockActionSwitchAccount;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import xsna.epx;
import xsna.i7o0;

/* compiled from: UIBlockMusicOwner.kt */
/* loaded from: classes16.dex */
public final class UIBlockMusicOwner extends UIBlock {
    public static final Serializer.c<UIBlockMusicOwner> CREATOR = new a();
    public final MusicOwner y;
    public final UIBlockActionSwitchAccount z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockMusicOwner> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockMusicOwner a(Serializer serializer) {
            return new UIBlockMusicOwner(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockMusicOwner[i];
        }
    }

    public UIBlockMusicOwner(Serializer serializer) {
        super(serializer);
        this.y = (MusicOwner) serializer.G(MusicOwner.class.getClassLoader());
        this.z = (UIBlockActionSwitchAccount) serializer.G(UIBlockActionSwitchAccount.class.getClassLoader());
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.y.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
        serializer.i0(this.z);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockMusicOwner) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockMusicOwner uIBlockMusicOwner = (UIBlockMusicOwner) obj;
        return epx.f(this.y, uIBlockMusicOwner.y) && epx.f(this.z, uIBlockMusicOwner.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "UIBlockMusicOwner[" + this.y + ']';
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.h);
        Set<UIBlockDragDropAction> Db = Db();
        HashSet hashSet = new HashSet();
        Iterator<UIBlockDragDropAction> it = Db.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().zb());
        }
        com.vk.catalog2.common.dto.api.ui.a aVar = new com.vk.catalog2.common.dto.api.ui.a(this.b, this.c, this.d, this.e, this.f, a2, a3, hashSet, (UIBlockHint) null, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7936);
        UIBlockHint uIBlockHint = this.j;
        UIBlockHint zb = uIBlockHint != null ? uIBlockHint.zb() : null;
        MusicOwner musicOwner = this.y;
        MusicOwner musicOwner2 = new MusicOwner(musicOwner.b, musicOwner.c, musicOwner.d, musicOwner.e, musicOwner.f, musicOwner.g);
        UIBlockActionSwitchAccount uIBlockActionSwitchAccount = this.z;
        return new UIBlockMusicOwner(aVar, zb, musicOwner2, uIBlockActionSwitchAccount != null ? uIBlockActionSwitchAccount.zb() : null);
    }

    public UIBlockMusicOwner(com.vk.catalog2.common.dto.api.ui.a aVar, UIBlockHint uIBlockHint, MusicOwner musicOwner, UIBlockActionSwitchAccount uIBlockActionSwitchAccount) {
        super(aVar.a, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, uIBlockHint, null, null, null, null, null, null, null, 32512, null);
        this.y = musicOwner;
        this.z = uIBlockActionSwitchAccount;
    }
}
