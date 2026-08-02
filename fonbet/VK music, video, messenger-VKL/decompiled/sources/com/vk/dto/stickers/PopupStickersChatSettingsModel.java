package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: PopupStickersChatSettingsModel.kt */
/* loaded from: classes18.dex */
public final class PopupStickersChatSettingsModel extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PopupStickersChatSettingsModel> CREATOR = new a();

    @pmi0("animationAutoplayOnGet")
    private boolean animationAutoplayOnGet;

    @pmi0("animationAutoplayOnSend")
    private boolean animationAutoplayOnSend;

    @pmi0("chatIdsWithDisabledAutoplay")
    private final List<Long> chatIdsWithDisabledAutoplay;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PopupStickersChatSettingsModel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PopupStickersChatSettingsModel a(Serializer serializer) {
            boolean m = serializer.m();
            boolean m2 = serializer.m();
            List f = serializer.f();
            if (f == null) {
                f = EmptyList.b;
            }
            return new PopupStickersChatSettingsModel(m, m2, f);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PopupStickersChatSettingsModel[i];
        }
    }

    public PopupStickersChatSettingsModel() {
        this(false, false, null, 7, null);
    }

    public final boolean Ab() {
        return this.animationAutoplayOnSend;
    }

    public final List<Long> Bb() {
        return this.chatIdsWithDisabledAutoplay;
    }

    public final void Cb(boolean z) {
        this.animationAutoplayOnGet = z;
    }

    public final void Db(boolean z) {
        this.animationAutoplayOnSend = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.animationAutoplayOnSend ? (byte) 1 : (byte) 0);
        serializer.L(this.animationAutoplayOnGet ? (byte) 1 : (byte) 0);
        serializer.a0(this.chatIdsWithDisabledAutoplay);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupStickersChatSettingsModel)) {
            return false;
        }
        PopupStickersChatSettingsModel popupStickersChatSettingsModel = (PopupStickersChatSettingsModel) obj;
        return this.animationAutoplayOnSend == popupStickersChatSettingsModel.animationAutoplayOnSend && this.animationAutoplayOnGet == popupStickersChatSettingsModel.animationAutoplayOnGet && epx.f(this.chatIdsWithDisabledAutoplay, popupStickersChatSettingsModel.chatIdsWithDisabledAutoplay);
    }

    public final int hashCode() {
        return this.chatIdsWithDisabledAutoplay.hashCode() + qoy.b(Boolean.hashCode(this.animationAutoplayOnSend) * 31, 31, this.animationAutoplayOnGet);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PopupStickersChatSettingsModel(animationAutoplayOnSend=");
        sb.append(this.animationAutoplayOnSend);
        sb.append(", animationAutoplayOnGet=");
        sb.append(this.animationAutoplayOnGet);
        sb.append(", chatIdsWithDisabledAutoplay=");
        return ms9.a(')', sb, this.chatIdsWithDisabledAutoplay);
    }

    public final boolean zb() {
        return this.animationAutoplayOnGet;
    }

    public PopupStickersChatSettingsModel(boolean z, boolean z2, List<Long> list) {
        this.animationAutoplayOnSend = z;
        this.animationAutoplayOnGet = z2;
        this.chatIdsWithDisabledAutoplay = list;
    }

    public PopupStickersChatSettingsModel(boolean z, boolean z2, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? EmptyList.b : list);
    }
}
