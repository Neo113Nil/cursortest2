package com.vk.stat.scheme;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.uqi;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;

/* compiled from: MobileOfficialAppsStoriesStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsStoriesStat$ClickableStickerInfo {
    public final transient String a;

    @pmi0("category_id")
    private final Integer categoryId;

    @pmi0("color")
    private final FilteredString filteredColor;

    @pmi0("id")
    private final Integer id;

    @pmi0("id_value")
    private final Integer idValue;

    @pmi0("mini_app_id")
    private final Integer miniAppId;

    @pmi0(TtmlNode.TAG_STYLE)
    private final String style;

    @pmi0("text_value")
    private final String textValue;

    @pmi0("type")
    private final String type;

    /* compiled from: MobileOfficialAppsStoriesStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsStoriesStat$ClickableStickerInfo>, a9y<MobileOfficialAppsStoriesStat$ClickableStickerInfo> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsStoriesStat$ClickableStickerInfo(fai.A(x9yVar, "id"), fai.C(x9yVar, "type"), fai.C(x9yVar, "text_value"), fai.C(x9yVar, TtmlNode.TAG_STYLE), fai.A(x9yVar, "id_value"), fai.C(x9yVar, "color"), fai.A(x9yVar, "mini_app_id"), fai.A(x9yVar, "category_id"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsStoriesStat$ClickableStickerInfo mobileOfficialAppsStoriesStat$ClickableStickerInfo = (MobileOfficialAppsStoriesStat$ClickableStickerInfo) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("id", mobileOfficialAppsStoriesStat$ClickableStickerInfo.b());
            x9yVar.o("type", mobileOfficialAppsStoriesStat$ClickableStickerInfo.g());
            x9yVar.o("text_value", mobileOfficialAppsStoriesStat$ClickableStickerInfo.f());
            x9yVar.o(TtmlNode.TAG_STYLE, mobileOfficialAppsStoriesStat$ClickableStickerInfo.e());
            x9yVar.n("id_value", mobileOfficialAppsStoriesStat$ClickableStickerInfo.c());
            x9yVar.o("color", mobileOfficialAppsStoriesStat$ClickableStickerInfo.a);
            x9yVar.n("mini_app_id", mobileOfficialAppsStoriesStat$ClickableStickerInfo.d());
            x9yVar.n("category_id", mobileOfficialAppsStoriesStat$ClickableStickerInfo.a());
            return x9yVar;
        }
    }

    public MobileOfficialAppsStoriesStat$ClickableStickerInfo() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final Integer a() {
        return this.categoryId;
    }

    public final Integer b() {
        return this.id;
    }

    public final Integer c() {
        return this.idValue;
    }

    public final Integer d() {
        return this.miniAppId;
    }

    public final String e() {
        return this.style;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsStoriesStat$ClickableStickerInfo)) {
            return false;
        }
        MobileOfficialAppsStoriesStat$ClickableStickerInfo mobileOfficialAppsStoriesStat$ClickableStickerInfo = (MobileOfficialAppsStoriesStat$ClickableStickerInfo) obj;
        return epx.f(this.id, mobileOfficialAppsStoriesStat$ClickableStickerInfo.id) && epx.f(this.type, mobileOfficialAppsStoriesStat$ClickableStickerInfo.type) && epx.f(this.textValue, mobileOfficialAppsStoriesStat$ClickableStickerInfo.textValue) && epx.f(this.style, mobileOfficialAppsStoriesStat$ClickableStickerInfo.style) && epx.f(this.idValue, mobileOfficialAppsStoriesStat$ClickableStickerInfo.idValue) && epx.f(this.a, mobileOfficialAppsStoriesStat$ClickableStickerInfo.a) && epx.f(this.miniAppId, mobileOfficialAppsStoriesStat$ClickableStickerInfo.miniAppId) && epx.f(this.categoryId, mobileOfficialAppsStoriesStat$ClickableStickerInfo.categoryId);
    }

    public final String f() {
        return this.textValue;
    }

    public final String g() {
        return this.type;
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.type;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.textValue;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.style;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.idValue;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.a;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.miniAppId;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.categoryId;
        return hashCode7 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickableStickerInfo(id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", textValue=");
        sb.append(this.textValue);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", idValue=");
        sb.append(this.idValue);
        sb.append(", color=");
        sb.append(this.a);
        sb.append(", miniAppId=");
        sb.append(this.miniAppId);
        sb.append(", categoryId=");
        return uqi.b(sb, this.categoryId, ')');
    }

    public MobileOfficialAppsStoriesStat$ClickableStickerInfo(Integer num, String str, String str2, String str3, Integer num2, String str4, Integer num3, Integer num4) {
        this.id = num;
        this.type = str;
        this.textValue = str2;
        this.style = str3;
        this.idValue = num2;
        this.a = str4;
        this.miniAppId = num3;
        this.categoryId = num4;
        FilteredString filteredString = new FilteredString(lhg.b(7));
        this.filteredColor = filteredString;
        filteredString.a(str4);
    }

    public /* synthetic */ MobileOfficialAppsStoriesStat$ClickableStickerInfo(Integer num, String str, String str2, String str3, Integer num2, String str4, Integer num3, Integer num4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : num4);
    }
}
