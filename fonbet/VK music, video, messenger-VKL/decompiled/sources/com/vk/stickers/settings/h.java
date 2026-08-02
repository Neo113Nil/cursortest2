package com.vk.stickers.settings;

import com.vk.stickers.settings.StickerSettingsCheckItem;
import com.vk.stickers.settings.i;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: StickerSettingsView.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class h extends FunctionReferenceImpl implements wzs<StickerSettingsCheckItem.Setting, Boolean, s3q0> {
    @Override // xsna.wzs
    public final s3q0 invoke(StickerSettingsCheckItem.Setting setting, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        ((i.b) this.receiver).a(setting, booleanValue);
        return s3q0.a;
    }
}
