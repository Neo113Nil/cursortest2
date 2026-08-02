package com.vk.stat.scheme;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$ClipUploadStickerItem {

    @pmi0("id")
    private final long id;

    @pmi0("pack_id")
    private final int packId;

    @pmi0(TtmlNode.TAG_STYLE)
    private final String style;

    @pmi0("type")
    private final String type;

    public MobileOfficialAppsClipsStat$ClipUploadStickerItem(long j, int i, String str, String str2) {
        this.id = j;
        this.packId = i;
        this.type = str;
        this.style = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$ClipUploadStickerItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$ClipUploadStickerItem mobileOfficialAppsClipsStat$ClipUploadStickerItem = (MobileOfficialAppsClipsStat$ClipUploadStickerItem) obj;
        return this.id == mobileOfficialAppsClipsStat$ClipUploadStickerItem.id && this.packId == mobileOfficialAppsClipsStat$ClipUploadStickerItem.packId && epx.f(this.type, mobileOfficialAppsClipsStat$ClipUploadStickerItem.type) && epx.f(this.style, mobileOfficialAppsClipsStat$ClipUploadStickerItem.style);
    }

    public final int hashCode() {
        int a = shy.a(this.packId, Long.hashCode(this.id) * 31, 31);
        String str = this.type;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.style;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipUploadStickerItem(id=");
        sb.append(this.id);
        sb.append(", packId=");
        sb.append(this.packId);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", style=");
        return ho8.a(sb, this.style, ')');
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$ClipUploadStickerItem(long j, int i, String str, String str2, int i2, zcl zclVar) {
        this(j, i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2);
    }
}
