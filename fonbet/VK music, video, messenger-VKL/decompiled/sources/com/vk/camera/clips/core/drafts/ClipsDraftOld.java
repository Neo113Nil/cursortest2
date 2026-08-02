package com.vk.camera.clips.core.drafts;

import android.os.Parcel;
import com.vk.clips.attachments.api.main.video.ClipsVideoAttachmentData;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.external.ClipsDraftablePlaylist;
import com.vk.dto.clips.external.ClipsDuetInfo;
import com.vk.dto.common.clips.ClipVideoItem;
import com.vk.dto.common.clips.ClipsDraftMusicOld;
import com.vk.dto.common.clips.ClipsGeoLocationAttachment;
import com.vk.dto.common.clips.ClipsLinkAttachment;
import com.vk.dto.common.clips.ClipsMarketAttachment;
import com.vk.dto.stories.entities.OrdData;
import com.vk.dto.stories.model.CanvasStickerDraft;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import xsna.aay;
import xsna.bh10;
import xsna.bxx;
import xsna.d370;
import xsna.epx;
import xsna.f370;
import xsna.fw3;
import xsna.ozl;
import xsna.qoy;
import xsna.r7;
import xsna.shy;

/* compiled from: ClipsDraftOld.kt */
@ozl
/* loaded from: classes14.dex */
public final class ClipsDraftOld implements Serializer.StreamParcelable, bxx {
    public final DraftUserRelatedData A;
    public final String b;
    public final int c;
    public final List<ClipVideoItem> d;
    public final String e;
    public final long f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final String j;
    public final List<? extends List<? extends CanvasStickerDraft>> k;
    public final float l;
    public final float m;
    public final ClipsDraftMusicOld n;
    public final Long o;
    public final ClipsGeoLocationAttachment p;
    public final String q;
    public final ClipsLinkAttachment r;
    public final ClipsMarketAttachment s;
    public final List<? extends List<ClipsDraftMusicOld>> t;
    public final OrdData u;
    public final ClipsDuetInfo v;
    public final float w;
    public final ClipsDraftablePlaylist x;
    public final TemplateDraftData y;
    public final ClipsVideoAttachmentData z;
    public static final Serializer.c<ClipsDraftOld> CREATOR = new b();
    public static final a B = new a();

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ClipsDraftOld> {
        @Override // xsna.aay
        public final ClipsDraftOld a(JSONObject jSONObject) {
            return new ClipsDraftOld(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ClipsDraftOld> {
        /* JADX WARN: Finally extract failed */
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipsDraftOld a(Serializer serializer) {
            ArrayList arrayList;
            int i;
            ArrayList arrayList2;
            String str;
            ArrayList arrayList3;
            String H = serializer.H();
            int u = serializer.u();
            ArrayList k = serializer.k(ClipVideoItem.class);
            if (k == null) {
                k = new ArrayList();
            }
            String H2 = serializer.H();
            long w = serializer.w();
            boolean m = serializer.m();
            int u2 = serializer.u();
            boolean m2 = serializer.m();
            String H3 = serializer.H();
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            try {
                int u3 = serializer.u();
                if (u3 >= 0) {
                    arrayList = new ArrayList();
                    for (int i2 = 0; i2 < u3; i2++) {
                        ArrayList k2 = serializer.k(CanvasStickerDraft.class);
                        if (k2 != null) {
                            arrayList.add(k2);
                        }
                    }
                } else {
                    arrayList = null;
                }
                float s = serializer.s();
                float s2 = serializer.s();
                ClipsDraftMusicOld clipsDraftMusicOld = (ClipsDraftMusicOld) serializer.G(ClipsDraftMusicOld.class.getClassLoader());
                Long x = serializer.x();
                ClipsGeoLocationAttachment clipsGeoLocationAttachment = (ClipsGeoLocationAttachment) serializer.G(ClipsGeoLocationAttachment.class.getClassLoader());
                String H4 = serializer.H();
                ClipsLinkAttachment clipsLinkAttachment = (ClipsLinkAttachment) serializer.G(ClipsLinkAttachment.class.getClassLoader());
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
                try {
                    int u4 = serializer.u();
                    if (u4 >= 0) {
                        i = u;
                        ArrayList arrayList4 = new ArrayList();
                        arrayList2 = k;
                        int i3 = 0;
                        while (i3 < u4) {
                            int i4 = u4;
                            ArrayList k3 = serializer.k(ClipsDraftMusicOld.class);
                            if (k3 != null) {
                                arrayList4.add(k3);
                            }
                            i3++;
                            u4 = i4;
                        }
                        str = H;
                        arrayList3 = arrayList4;
                    } else {
                        i = u;
                        arrayList2 = k;
                        str = H;
                        arrayList3 = null;
                    }
                    return new ClipsDraftOld(str, i, arrayList2, H2, w, m, u2, m2, H3, arrayList, s, s2, clipsDraftMusicOld, x, clipsGeoLocationAttachment, H4, clipsLinkAttachment, (ClipsMarketAttachment) serializer.G(ClipsMarketAttachment.class.getClassLoader()), arrayList3, (OrdData) serializer.G(OrdData.class.getClassLoader()), (ClipsDuetInfo) serializer.G(ClipsDuetInfo.class.getClassLoader()), serializer.s(), (ClipsDraftablePlaylist) serializer.G(ClipsDraftablePlaylist.class.getClassLoader()), (TemplateDraftData) serializer.G(TemplateDraftData.class.getClassLoader()), (ClipsVideoAttachmentData) serializer.G(ClipsVideoAttachmentData.class.getClassLoader()), (DraftUserRelatedData) serializer.G(DraftUserRelatedData.class.getClassLoader()));
                } finally {
                }
            } catch (Throwable th) {
                if (th instanceof Serializer.DeserializationError) {
                    throw th;
                }
                throw new Serializer.DeserializationError(null, th);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipsDraftOld[i];
        }
    }

    public ClipsDraftOld(String str, int i, List<ClipVideoItem> list, String str2, long j, boolean z, int i2, boolean z2, String str3, List<? extends List<? extends CanvasStickerDraft>> list2, float f, float f2, ClipsDraftMusicOld clipsDraftMusicOld, Long l, ClipsGeoLocationAttachment clipsGeoLocationAttachment, String str4, ClipsLinkAttachment clipsLinkAttachment, ClipsMarketAttachment clipsMarketAttachment, List<? extends List<ClipsDraftMusicOld>> list3, OrdData ordData, ClipsDuetInfo clipsDuetInfo, float f3, ClipsDraftablePlaylist clipsDraftablePlaylist, TemplateDraftData templateDraftData, ClipsVideoAttachmentData clipsVideoAttachmentData, DraftUserRelatedData draftUserRelatedData) {
        this.b = str;
        this.c = i;
        this.d = list;
        this.e = str2;
        this.f = j;
        this.g = z;
        this.h = i2;
        this.i = z2;
        this.j = str3;
        this.k = list2;
        this.l = f;
        this.m = f2;
        this.n = clipsDraftMusicOld;
        this.o = l;
        this.p = clipsGeoLocationAttachment;
        this.q = str4;
        this.r = clipsLinkAttachment;
        this.s = clipsMarketAttachment;
        this.t = list3;
        this.u = ordData;
        this.v = clipsDuetInfo;
        this.w = f3;
        this.x = clipsDraftablePlaylist;
        this.y = templateDraftData;
        this.z = clipsVideoAttachmentData;
        this.A = draftUserRelatedData;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.S(this.c);
        serializer.W(this.d);
        serializer.j0(this.e);
        serializer.Y(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.S(this.h);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.j0(this.j);
        serializer.X(this.k);
        serializer.P(this.l);
        serializer.P(this.m);
        serializer.i0(this.n);
        serializer.b0(this.o);
        serializer.i0(this.p);
        serializer.j0(this.q);
        serializer.i0(this.r);
        serializer.X(this.t);
        serializer.i0(this.u);
        serializer.i0(this.v);
        serializer.i0(this.s);
        serializer.P(this.w);
        serializer.i0(this.x);
        serializer.i0(this.y);
        serializer.i0(this.z);
        serializer.i0(this.A);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new r7(this, 27));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsDraftOld)) {
            return false;
        }
        ClipsDraftOld clipsDraftOld = (ClipsDraftOld) obj;
        return epx.f(this.b, clipsDraftOld.b) && this.c == clipsDraftOld.c && epx.f(this.d, clipsDraftOld.d) && epx.f(this.e, clipsDraftOld.e) && this.f == clipsDraftOld.f && this.g == clipsDraftOld.g && this.h == clipsDraftOld.h && this.i == clipsDraftOld.i && epx.f(this.j, clipsDraftOld.j) && epx.f(this.k, clipsDraftOld.k) && Float.compare(this.l, clipsDraftOld.l) == 0 && Float.compare(this.m, clipsDraftOld.m) == 0 && epx.f(this.n, clipsDraftOld.n) && epx.f(this.o, clipsDraftOld.o) && epx.f(this.p, clipsDraftOld.p) && epx.f(this.q, clipsDraftOld.q) && epx.f(this.r, clipsDraftOld.r) && epx.f(this.s, clipsDraftOld.s) && epx.f(this.t, clipsDraftOld.t) && epx.f(this.u, clipsDraftOld.u) && epx.f(this.v, clipsDraftOld.v) && Float.compare(this.w, clipsDraftOld.w) == 0 && epx.f(this.x, clipsDraftOld.x) && epx.f(this.y, clipsDraftOld.y) && epx.f(this.z, clipsDraftOld.z) && epx.f(this.A, clipsDraftOld.A);
    }

    public final int hashCode() {
        int a2 = fw3.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d);
        String str = this.e;
        int b2 = qoy.b(shy.a(this.h, qoy.b(bh10.a((a2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31), 31, this.i);
        String str2 = this.j;
        int hashCode = (b2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<? extends List<? extends CanvasStickerDraft>> list = this.k;
        int a3 = io.reactivex.rxjava3.subjects.b.a(this.m, io.reactivex.rxjava3.subjects.b.a(this.l, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31), 31);
        ClipsDraftMusicOld clipsDraftMusicOld = this.n;
        int hashCode2 = (a3 + (clipsDraftMusicOld == null ? 0 : clipsDraftMusicOld.hashCode())) * 31;
        Long l = this.o;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        ClipsGeoLocationAttachment clipsGeoLocationAttachment = this.p;
        int hashCode4 = (hashCode3 + (clipsGeoLocationAttachment == null ? 0 : clipsGeoLocationAttachment.hashCode())) * 31;
        String str3 = this.q;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ClipsLinkAttachment clipsLinkAttachment = this.r;
        int hashCode6 = (hashCode5 + (clipsLinkAttachment == null ? 0 : clipsLinkAttachment.hashCode())) * 31;
        ClipsMarketAttachment clipsMarketAttachment = this.s;
        int hashCode7 = (hashCode6 + (clipsMarketAttachment == null ? 0 : clipsMarketAttachment.hashCode())) * 31;
        List<? extends List<ClipsDraftMusicOld>> list2 = this.t;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        OrdData ordData = this.u;
        int hashCode9 = (hashCode8 + (ordData == null ? 0 : ordData.hashCode())) * 31;
        ClipsDuetInfo clipsDuetInfo = this.v;
        int a4 = io.reactivex.rxjava3.subjects.b.a(this.w, (hashCode9 + (clipsDuetInfo == null ? 0 : clipsDuetInfo.hashCode())) * 31, 31);
        ClipsDraftablePlaylist clipsDraftablePlaylist = this.x;
        int hashCode10 = (a4 + (clipsDraftablePlaylist == null ? 0 : clipsDraftablePlaylist.hashCode())) * 31;
        TemplateDraftData templateDraftData = this.y;
        int hashCode11 = (hashCode10 + (templateDraftData == null ? 0 : templateDraftData.hashCode())) * 31;
        ClipsVideoAttachmentData clipsVideoAttachmentData = this.z;
        int hashCode12 = (hashCode11 + (clipsVideoAttachmentData == null ? 0 : clipsVideoAttachmentData.hashCode())) * 31;
        DraftUserRelatedData draftUserRelatedData = this.A;
        return hashCode12 + (draftUserRelatedData != null ? draftUserRelatedData.hashCode() : 0);
    }

    public final String toString() {
        return "ClipsDraftOld(id=" + this.b + ", maxClipDurationMs=" + this.c + ", files=" + this.d + ", description=" + this.e + ", previewTimestamp=" + this.f + ", autosaved=" + this.g + ", dateSeconds=" + this.h + ", isPreviewFromGallery=" + this.i + ", previewUri=" + this.j + ", stickers=" + this.k + ", soundVolume=" + this.l + ", musicVolume=" + this.m + ", licensedMusic=" + this.n + ", delayedPublicationDate=" + this.o + ", geoLocationAttachment=" + this.p + ", entryPoint=" + this.q + ", linkAttachment=" + this.r + ", marketAttachment=" + this.s + ", audios=" + this.t + ", ordInfo=" + this.u + ", duetInfo=" + this.v + ", aspectRatio=" + this.w + ", playlist=" + this.x + ", template=" + this.y + ", attachedVideo=" + this.z + ", userRelatedData=" + this.A + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClipsDraftOld(JSONObject jSONObject) {
        this(r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r1, (ClipsDraftMusicOld) aay.a.c(jSONObject, "editor_music", r2), f370.z(jSONObject, "delayed_publication_date"), (ClipsGeoLocationAttachment) aay.a.c(jSONObject, "geo_location_attachment", ClipsGeoLocationAttachment.l), f370.D(jSONObject, "entry_point"), (ClipsLinkAttachment) aay.a.c(jSONObject, "link_attachment", ClipsLinkAttachment.d), (ClipsMarketAttachment) aay.a.c(jSONObject, "market_attachment", ClipsMarketAttachment.e), aay.a.b(jSONObject, "audios", r2), (OrdData) aay.a.c(jSONObject, "ord_info", OrdData.e), (ClipsDuetInfo) aay.a.c(jSONObject, "duet_info", ClipsDuetInfo.e), (float) jSONObject.getDouble("aspect_ratio"), (ClipsDraftablePlaylist) aay.a.c(jSONObject, "playlist", ClipsDraftablePlaylist.f), (TemplateDraftData) aay.a.c(jSONObject, "template", TemplateDraftData.d), (ClipsVideoAttachmentData) aay.a.c(jSONObject, "video_attachment", ClipsVideoAttachmentData.i), (DraftUserRelatedData) aay.a.c(jSONObject, "user_related_data", DraftUserRelatedData.g));
        String str;
        try {
            str = jSONObject.getString("id");
        } catch (Throwable unused) {
            str = null;
        }
        String valueOf = str == null ? String.valueOf(jSONObject.getInt("id")) : str;
        int i = jSONObject.getInt("max_duration");
        ArrayList a2 = aay.a.a(jSONObject, "files", ClipVideoItem.t);
        ArrayList arrayList = a2 == null ? new ArrayList() : a2;
        String D = f370.D(jSONObject, "description");
        long j = jSONObject.getLong("preview_timestamp");
        boolean z = jSONObject.getBoolean("autosaved");
        int i2 = jSONObject.getInt("date");
        boolean optBoolean = jSONObject.optBoolean("is_preview_from_gallery", false);
        String D2 = f370.D(jSONObject, "preview_uri");
        ArrayList b2 = aay.a.b(jSONObject, "stickers", CanvasStickerDraft.d);
        float f = (float) jSONObject.getDouble("sound_volume");
        float f2 = (float) jSONObject.getDouble("music_volume");
        ClipsDraftMusicOld.a aVar = ClipsDraftMusicOld.e;
    }
}
