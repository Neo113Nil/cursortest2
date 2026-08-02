package com.vk.catalog2.common.dto.api;

import com.vk.api.generated.catalog.dto.CatalogBlockMetaDto;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.ContentType;
import com.vk.catalog2.common.dto.api.ShowAllInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VerifyInfo;
import com.vk.internal.api.GsonHolder;
import com.vk.log.L;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.f370;
import xsna.qoy;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: Meta.kt */
/* loaded from: classes16.dex */
public final class Meta extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<Meta> CREATOR = new b();
    public static final a l = new a();
    public final VerifyInfo b;
    public final ContentType c;
    public final String d;
    public final String e;
    public final CatalogOnboardingInfo f;
    public final ShowAllInfo g;
    public final boolean h;
    public final CatalogBlockMetaDto.ContextDto i;
    public final String j;
    public final Boolean k;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<Meta> {
        @Override // xsna.aay
        public final Meta a(JSONObject jSONObject) {
            return new Meta(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<Meta> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Meta a(Serializer serializer) {
            return new Meta(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Meta[i];
        }
    }

    public /* synthetic */ Meta(VerifyInfo verifyInfo, ContentType contentType, String str, String str2, CatalogOnboardingInfo catalogOnboardingInfo, ShowAllInfo showAllInfo, boolean z, CatalogBlockMetaDto.ContextDto contextDto, String str3, Boolean bool, int i, zcl zclVar) {
        this(verifyInfo, contentType, str, str2, catalogOnboardingInfo, showAllInfo, z, contextDto, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? null : bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        ContentType contentType = this.c;
        serializer.m0(contentType != null ? contentType.i() : null);
        serializer.j0(this.d);
        serializer.m0(this.e);
        serializer.i0(this.f);
        serializer.i0(this.g);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.e0(this.i);
        serializer.m0(this.j);
        Boolean bool = this.k;
        serializer.L(bool != null ? bool.booleanValue() : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Meta)) {
            return false;
        }
        Meta meta = (Meta) obj;
        return epx.f(this.b, meta.b) && this.c == meta.c && epx.f(this.d, meta.d) && epx.f(this.e, meta.e) && epx.f(this.f, meta.f) && epx.f(this.g, meta.g) && this.h == meta.h && this.i == meta.i && epx.f(this.j, meta.j) && epx.f(this.k, meta.k);
    }

    public final int hashCode() {
        VerifyInfo verifyInfo = this.b;
        int hashCode = (verifyInfo == null ? 0 : verifyInfo.hashCode()) * 31;
        ContentType contentType = this.c;
        int a2 = urd0.a((hashCode + (contentType == null ? 0 : contentType.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int hashCode2 = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        CatalogOnboardingInfo catalogOnboardingInfo = this.f;
        int hashCode3 = (hashCode2 + (catalogOnboardingInfo == null ? 0 : catalogOnboardingInfo.hashCode())) * 31;
        ShowAllInfo showAllInfo = this.g;
        int b2 = qoy.b((hashCode3 + (showAllInfo == null ? 0 : showAllInfo.hashCode())) * 31, 31, this.h);
        CatalogBlockMetaDto.ContextDto contextDto = this.i;
        int hashCode4 = (b2 + (contextDto == null ? 0 : contextDto.hashCode())) * 31;
        String str2 = this.j;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.k;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String r() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Meta(verifyInfo=");
        sb.append(this.b);
        sb.append(", contentType=");
        sb.append(this.c);
        sb.append(", trackCode=");
        sb.append(this.d);
        sb.append(", anchor=");
        sb.append(this.e);
        sb.append(", audioOnboarding=");
        sb.append(this.f);
        sb.append(", showAllInfo=");
        sb.append(this.g);
        sb.append(", isExplicit=");
        sb.append(this.h);
        sb.append(", context=");
        sb.append(this.i);
        sb.append(", campaignName=");
        sb.append(this.j);
        sb.append(", noConsecutivePlay=");
        return tn.a(sb, this.k, ')');
    }

    public final ContentType zb() {
        return this.c;
    }

    public Meta(VerifyInfo verifyInfo, ContentType contentType, String str, String str2, CatalogOnboardingInfo catalogOnboardingInfo, ShowAllInfo showAllInfo, boolean z, CatalogBlockMetaDto.ContextDto contextDto, String str3, Boolean bool) {
        this.b = verifyInfo;
        this.c = contentType;
        this.d = str;
        this.e = str2;
        this.f = catalogOnboardingInfo;
        this.g = showAllInfo;
        this.h = z;
        this.i = contextDto;
        this.j = str3;
        this.k = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Meta(JSONObject jSONObject) {
        this(r4, r5, r6, r7, r8, r9, r10, r0 != null ? (CatalogBlockMetaDto.ContextDto) GsonHolder.a().fromJson(r0, CatalogBlockMetaDto.ContextDto.class) : null, f370.D(jSONObject, "campaign_name"), Boolean.valueOf(jSONObject.optBoolean("no_consecutive_play", false)));
        VerifyInfo verifyInfo;
        Object a2;
        ShowAllInfo showAllInfo;
        Serializer.c<VerifyInfo> cVar = VerifyInfo.CREATOR;
        String optString = jSONObject.optString("icon", null);
        if (optString != null) {
            int hashCode = optString.hashCode();
            if (hashCode != -1994383672) {
                if (hashCode != -1507003230) {
                    if (hashCode == 1394955557 && optString.equals("trending")) {
                        verifyInfo = new VerifyInfo(false, true, false, false, false, false, 60, null);
                    }
                } else if (optString.equals("trending_verified")) {
                    verifyInfo = new VerifyInfo(true, true, false, false, false, false, 60, null);
                }
            } else if (optString.equals("verified")) {
                verifyInfo = new VerifyInfo(true, false, false, false, false, false, 60, null);
            }
            VerifyInfo a3 = verifyInfo == null ? VerifyInfo.a.a(jSONObject) : verifyInfo;
            ContentType.a aVar = ContentType.Companion;
            String optString2 = jSONObject.optString("content_type");
            aVar.getClass();
            ContentType a4 = ContentType.a.a(optString2);
            String optString3 = jSONObject.optString("track_code");
            String D = f370.D(jSONObject, "anchor");
            CatalogOnboardingInfo.a aVar2 = CatalogOnboardingInfo.d;
            if (jSONObject.has("audio_onboarding")) {
                try {
                    a2 = aVar2.a(jSONObject.getJSONObject("audio_onboarding"));
                } catch (JSONException e) {
                    L.i(e);
                }
                CatalogOnboardingInfo catalogOnboardingInfo = (CatalogOnboardingInfo) a2;
                ShowAllInfo.a aVar3 = ShowAllInfo.d;
                if (jSONObject.has("show_all_info")) {
                    try {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("show_all_info");
                        aVar3.getClass();
                        showAllInfo = new ShowAllInfo(jSONObject2);
                    } catch (JSONException e2) {
                        L.i(e2);
                    }
                    boolean optBoolean = jSONObject.optBoolean("is_explicit", false);
                    String optString4 = jSONObject.optString("context");
                }
                showAllInfo = null;
                boolean optBoolean2 = jSONObject.optBoolean("is_explicit", false);
                String optString42 = jSONObject.optString("context");
            }
            a2 = null;
            CatalogOnboardingInfo catalogOnboardingInfo2 = (CatalogOnboardingInfo) a2;
            ShowAllInfo.a aVar32 = ShowAllInfo.d;
            if (jSONObject.has("show_all_info")) {
            }
            showAllInfo = null;
            boolean optBoolean22 = jSONObject.optBoolean("is_explicit", false);
            String optString422 = jSONObject.optString("context");
        }
        verifyInfo = null;
        VerifyInfo a32 = verifyInfo == null ? VerifyInfo.a.a(jSONObject) : verifyInfo;
        ContentType.a aVar4 = ContentType.Companion;
        String optString22 = jSONObject.optString("content_type");
        aVar4.getClass();
        ContentType a42 = ContentType.a.a(optString22);
        String optString32 = jSONObject.optString("track_code");
        String D2 = f370.D(jSONObject, "anchor");
        CatalogOnboardingInfo.a aVar22 = CatalogOnboardingInfo.d;
        if (jSONObject.has("audio_onboarding")) {
        }
        a2 = null;
        CatalogOnboardingInfo catalogOnboardingInfo22 = (CatalogOnboardingInfo) a2;
        ShowAllInfo.a aVar322 = ShowAllInfo.d;
        if (jSONObject.has("show_all_info")) {
        }
        showAllInfo = null;
        boolean optBoolean222 = jSONObject.optBoolean("is_explicit", false);
        String optString4222 = jSONObject.optString("context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Meta(Serializer serializer) {
        this(r2, r3, r4, r5, r6, r7, r8, r9, r10, Boolean.valueOf(r13 != null ? r13.booleanValue() : false));
        VerifyInfo verifyInfo = (VerifyInfo) serializer.G(VerifyInfo.class.getClassLoader());
        ContentType.a aVar = ContentType.Companion;
        String I = serializer.I();
        aVar.getClass();
        ContentType a2 = ContentType.a.a(I);
        String H = serializer.H();
        String I2 = serializer.I();
        CatalogOnboardingInfo catalogOnboardingInfo = (CatalogOnboardingInfo) serializer.G(CatalogOnboardingInfo.class.getClassLoader());
        ShowAllInfo showAllInfo = (ShowAllInfo) serializer.G(ShowAllInfo.class.getClassLoader());
        boolean m = serializer.m();
        CatalogBlockMetaDto.ContextDto contextDto = (CatalogBlockMetaDto.ContextDto) serializer.A(CatalogBlockMetaDto.ContextDto.class.getClassLoader());
        String I3 = serializer.I();
        Boolean n = serializer.n();
    }
}
