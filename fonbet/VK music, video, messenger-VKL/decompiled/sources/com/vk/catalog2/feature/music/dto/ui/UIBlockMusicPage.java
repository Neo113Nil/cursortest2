package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.a;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;

/* compiled from: UIBlockMusicPage.kt */
/* loaded from: classes16.dex */
public abstract class UIBlockMusicPage extends UIBlock {
    public final UIBlockActionPlayAudiosFromBlock y;

    public UIBlockMusicPage(Serializer serializer) {
        super(serializer);
        this.y = (UIBlockActionPlayAudiosFromBlock) serializer.G(UIBlockActionPlayAudiosFromBlock.class.getClassLoader());
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
    }

    public abstract boolean Pb();

    public abstract boolean Qb();

    public abstract boolean Rb();

    public abstract Image Sb();

    public abstract boolean Tb();

    public abstract void Ub();

    public abstract String getName();

    public UIBlockMusicPage(a aVar, UIBlockHint uIBlockHint, UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock) {
        super(aVar.a, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, uIBlockHint, null, null, null, null, null, aVar.m, null, 24320, null);
        this.y = uIBlockActionPlayAudiosFromBlock;
    }
}
