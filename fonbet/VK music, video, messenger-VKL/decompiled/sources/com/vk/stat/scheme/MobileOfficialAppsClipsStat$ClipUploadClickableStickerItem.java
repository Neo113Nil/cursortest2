package com.vk.stat.scheme;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$ClipUploadClickableStickerItem {

    @pmi0("category_id")
    private final Integer categoryId;

    @pmi0("event_id")
    private final String eventId;

    @pmi0("id")
    private final long id;

    @pmi0("id_value")
    private final Long idValue;

    @pmi0("seance_id")
    private final String seanceId;

    @pmi0(TtmlNode.TAG_STYLE)
    private final String style;

    @pmi0("text_value")
    private final String textValue;

    @pmi0("type")
    private final String type;

    public MobileOfficialAppsClipsStat$ClipUploadClickableStickerItem(String str, long j, String str2, String str3, Long l, Integer num, String str4, String str5) {
        this.type = str;
        this.id = j;
        this.style = str2;
        this.textValue = str3;
        this.idValue = l;
        this.categoryId = num;
        this.eventId = str4;
        this.seanceId = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$ClipUploadClickableStickerItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$ClipUploadClickableStickerItem mobileOfficialAppsClipsStat$ClipUploadClickableStickerItem = (MobileOfficialAppsClipsStat$ClipUploadClickableStickerItem) obj;
        return epx.f(this.type, mobileOfficialAppsClipsStat$ClipUploadClickableStickerItem.type) && this.id == mobileOfficialAppsClipsStat$ClipUploadClickableStickerItem.id && epx.f(this.style, mobileOfficialAppsClipsStat$ClipUploadClickableStickerItem.style) && epx.f(this.textValue, mobileOfficialAppsClipsStat$ClipUploadClickableStickerItem.textValue) && epx.f(this.idValue, mobileOfficialAppsClipsStat$ClipUploadClickableStickerItem.idValue) && epx.f(this.categoryId, mobileOfficialAppsClipsStat$ClipUploadClickableStickerItem.categoryId) && epx.f(this.eventId, mobileOfficialAppsClipsStat$ClipUploadClickableStickerItem.eventId) && epx.f(this.seanceId, mobileOfficialAppsClipsStat$ClipUploadClickableStickerItem.seanceId);
    }

    public final int hashCode() {
        int a = bh10.a(this.type.hashCode() * 31, 31, this.id);
        String str = this.style;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.textValue;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.idValue;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.categoryId;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.eventId;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.seanceId;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipUploadClickableStickerItem(type=");
        sb.append(this.type);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", textValue=");
        sb.append(this.textValue);
        sb.append(", idValue=");
        sb.append(this.idValue);
        sb.append(", categoryId=");
        sb.append(this.categoryId);
        sb.append(", eventId=");
        sb.append(this.eventId);
        sb.append(", seanceId=");
        return ho8.a(sb, this.seanceId, ')');
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$ClipUploadClickableStickerItem(String str, long j, String str2, String str3, Long l, Integer num, String str4, String str5, int i, zcl zclVar) {
        this(str, j, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5);
    }
}
