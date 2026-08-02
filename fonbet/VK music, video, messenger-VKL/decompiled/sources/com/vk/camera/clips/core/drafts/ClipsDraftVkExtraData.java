package com.vk.camera.clips.core.drafts;

import android.os.Parcel;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftMusicInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.external.ClipsDuetInfo;
import com.vk.dto.common.clips.ClipsGeoLocationAttachment;
import com.vk.dto.common.clips.ClipsLinkAttachment;
import com.vk.dto.common.clips.ClipsMarketAttachment;
import com.vk.dto.stories.model.CanvasStickerDraft;
import com.vk.movika.sdk.base.observable.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.d370;
import xsna.epx;
import xsna.iq;
import xsna.zcl;

/* compiled from: ClipsDraftVkExtraData.kt */
/* loaded from: classes14.dex */
public final class ClipsDraftVkExtraData implements Serializer.StreamParcelable, bxx {
    public List<? extends List<? extends CanvasStickerDraft>> b;
    public ClipsDraftMusicInfo c;
    public ClipsGeoLocationAttachment d;
    public ClipsLinkAttachment e;
    public ClipsMarketAttachment f;
    public ClipInvolvementActionButton<?> g;
    public final ClipsDuetInfo h;
    public TemplateDraftData i;
    public DraftUserRelatedData j;
    public final Long k;
    public static final a l = new a();
    public static final Serializer.c<ClipsDraftVkExtraData> CREATOR = new b();

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ClipsDraftVkExtraData> {
        @Override // xsna.aay
        public final ClipsDraftVkExtraData a(JSONObject jSONObject) {
            return new ClipsDraftVkExtraData(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ClipsDraftVkExtraData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipsDraftVkExtraData a(Serializer serializer) {
            ArrayList arrayList;
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            try {
                int u = serializer.u();
                if (u >= 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < u; i++) {
                        ArrayList k = serializer.k(CanvasStickerDraft.class);
                        if (k != null) {
                            arrayList2.add(k);
                        }
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                return new ClipsDraftVkExtraData(arrayList, (ClipsDraftMusicInfo) serializer.G(ClipsDraftMusicInfo.class.getClassLoader()), (ClipsGeoLocationAttachment) serializer.G(ClipsGeoLocationAttachment.class.getClassLoader()), (ClipsLinkAttachment) serializer.G(ClipsLinkAttachment.class.getClassLoader()), (ClipsMarketAttachment) serializer.G(ClipsMarketAttachment.class.getClassLoader()), (ClipInvolvementActionButton) serializer.G(ClipInvolvementActionButton.class.getClassLoader()), (ClipsDuetInfo) serializer.G(ClipsDuetInfo.class.getClassLoader()), (TemplateDraftData) serializer.G(TemplateDraftData.class.getClassLoader()), (DraftUserRelatedData) serializer.G(DraftUserRelatedData.class.getClassLoader()), serializer.x());
            } finally {
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipsDraftVkExtraData[i];
        }
    }

    public ClipsDraftVkExtraData() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.X(this.b);
        serializer.i0(this.c);
        serializer.i0(this.d);
        serializer.i0(this.e);
        serializer.i0(this.h);
        serializer.i0(this.f);
        serializer.i0(this.g);
        serializer.i0(this.i);
        serializer.i0(this.j);
        serializer.b0(this.k);
    }

    public final Long d() {
        return this.k;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ClipsDraftMusicInfo e() {
        return this.c;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new q(this, 25));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsDraftVkExtraData)) {
            return false;
        }
        ClipsDraftVkExtraData clipsDraftVkExtraData = (ClipsDraftVkExtraData) obj;
        return epx.f(this.b, clipsDraftVkExtraData.b) && epx.f(this.c, clipsDraftVkExtraData.c) && epx.f(this.d, clipsDraftVkExtraData.d) && epx.f(this.e, clipsDraftVkExtraData.e) && epx.f(this.f, clipsDraftVkExtraData.f) && epx.f(this.g, clipsDraftVkExtraData.g) && epx.f(this.h, clipsDraftVkExtraData.h) && epx.f(this.i, clipsDraftVkExtraData.i) && epx.f(this.j, clipsDraftVkExtraData.j) && epx.f(this.k, clipsDraftVkExtraData.k);
    }

    public final int hashCode() {
        List<? extends List<? extends CanvasStickerDraft>> list = this.b;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        ClipsDraftMusicInfo clipsDraftMusicInfo = this.c;
        int hashCode2 = (hashCode + (clipsDraftMusicInfo == null ? 0 : clipsDraftMusicInfo.hashCode())) * 31;
        ClipsGeoLocationAttachment clipsGeoLocationAttachment = this.d;
        int hashCode3 = (hashCode2 + (clipsGeoLocationAttachment == null ? 0 : clipsGeoLocationAttachment.hashCode())) * 31;
        ClipsLinkAttachment clipsLinkAttachment = this.e;
        int hashCode4 = (hashCode3 + (clipsLinkAttachment == null ? 0 : clipsLinkAttachment.hashCode())) * 31;
        ClipsMarketAttachment clipsMarketAttachment = this.f;
        int hashCode5 = (hashCode4 + (clipsMarketAttachment == null ? 0 : clipsMarketAttachment.hashCode())) * 31;
        ClipInvolvementActionButton<?> clipInvolvementActionButton = this.g;
        int hashCode6 = (hashCode5 + (clipInvolvementActionButton == null ? 0 : clipInvolvementActionButton.hashCode())) * 31;
        ClipsDuetInfo clipsDuetInfo = this.h;
        int hashCode7 = (hashCode6 + (clipsDuetInfo == null ? 0 : clipsDuetInfo.hashCode())) * 31;
        TemplateDraftData templateDraftData = this.i;
        int hashCode8 = (hashCode7 + (templateDraftData == null ? 0 : templateDraftData.hashCode())) * 31;
        DraftUserRelatedData draftUserRelatedData = this.j;
        int hashCode9 = (hashCode8 + (draftUserRelatedData == null ? 0 : draftUserRelatedData.hashCode())) * 31;
        Long l2 = this.k;
        return hashCode9 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsDraftVkExtraData(stickers=");
        sb.append(this.b);
        sb.append(", licensedMusic=");
        sb.append(this.c);
        sb.append(", geoLocationAttachment=");
        sb.append(this.d);
        sb.append(", linkAttachment=");
        sb.append(this.e);
        sb.append(", marketAttachment=");
        sb.append(this.f);
        sb.append(", involvementAttachment=");
        sb.append(this.g);
        sb.append(", duetInfo=");
        sb.append(this.h);
        sb.append(", template=");
        sb.append(this.i);
        sb.append(", userRelatedData=");
        sb.append(this.j);
        sb.append(", deletedAt=");
        return iq.b(sb, this.k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public ClipsDraftVkExtraData(List<? extends List<? extends CanvasStickerDraft>> list, ClipsDraftMusicInfo clipsDraftMusicInfo, ClipsGeoLocationAttachment clipsGeoLocationAttachment, ClipsLinkAttachment clipsLinkAttachment, ClipsMarketAttachment clipsMarketAttachment, ClipInvolvementActionButton<?> clipInvolvementActionButton, ClipsDuetInfo clipsDuetInfo, TemplateDraftData templateDraftData, DraftUserRelatedData draftUserRelatedData, Long l2) {
        this.b = list;
        this.c = clipsDraftMusicInfo;
        this.d = clipsGeoLocationAttachment;
        this.e = clipsLinkAttachment;
        this.f = clipsMarketAttachment;
        this.g = clipInvolvementActionButton;
        this.h = clipsDuetInfo;
        this.i = templateDraftData;
        this.j = draftUserRelatedData;
        this.k = l2;
    }

    public /* synthetic */ ClipsDraftVkExtraData(List list, ClipsDraftMusicInfo clipsDraftMusicInfo, ClipsGeoLocationAttachment clipsGeoLocationAttachment, ClipsLinkAttachment clipsLinkAttachment, ClipsMarketAttachment clipsMarketAttachment, ClipInvolvementActionButton clipInvolvementActionButton, ClipsDuetInfo clipsDuetInfo, TemplateDraftData templateDraftData, DraftUserRelatedData draftUserRelatedData, Long l2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : clipsDraftMusicInfo, (i & 4) != 0 ? null : clipsGeoLocationAttachment, (i & 8) != 0 ? null : clipsLinkAttachment, (i & 16) != 0 ? null : clipsMarketAttachment, (i & 32) != 0 ? null : clipInvolvementActionButton, (i & 64) != 0 ? null : clipsDuetInfo, (i & 128) != 0 ? null : templateDraftData, (i & 256) != 0 ? null : draftUserRelatedData, (i & 512) != 0 ? null : l2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClipsDraftVkExtraData(JSONObject jSONObject) {
        this(r3, r4, r5, r6, r7, r8, r9, r10, r11, r0 <= 0 ? null : Long.valueOf(r0));
        ArrayList b2 = aay.a.b(jSONObject, "stickers", CanvasStickerDraft.d);
        ClipsDraftMusicInfo clipsDraftMusicInfo = (ClipsDraftMusicInfo) aay.a.c(jSONObject, "editor_music", ClipsDraftMusicInfo.f);
        ClipsGeoLocationAttachment clipsGeoLocationAttachment = (ClipsGeoLocationAttachment) aay.a.c(jSONObject, "geo_location_attachment", ClipsGeoLocationAttachment.l);
        ClipsLinkAttachment clipsLinkAttachment = (ClipsLinkAttachment) aay.a.c(jSONObject, "link_attachment", ClipsLinkAttachment.d);
        ClipsMarketAttachment clipsMarketAttachment = (ClipsMarketAttachment) aay.a.c(jSONObject, "market_attachment", ClipsMarketAttachment.e);
        ClipInvolvementActionButton clipInvolvementActionButton = (ClipInvolvementActionButton) aay.a.c(jSONObject, "involvement_attachment", ClipInvolvementActionButton.d);
        ClipsDuetInfo clipsDuetInfo = (ClipsDuetInfo) aay.a.c(jSONObject, "duet_info", ClipsDuetInfo.e);
        TemplateDraftData templateDraftData = (TemplateDraftData) aay.a.c(jSONObject, "template", TemplateDraftData.d);
        DraftUserRelatedData draftUserRelatedData = (DraftUserRelatedData) aay.a.c(jSONObject, "user_data", DraftUserRelatedData.g);
        long optLong = jSONObject.optLong("deleted_at");
    }
}
