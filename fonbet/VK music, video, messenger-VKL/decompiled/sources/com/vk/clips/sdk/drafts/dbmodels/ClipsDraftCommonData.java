package com.vk.clips.sdk.drafts.dbmodels;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.aay;
import xsna.bh10;
import xsna.bxx;
import xsna.d370;
import xsna.epx;
import xsna.f370;
import xsna.fw3;
import xsna.iq;
import xsna.qm1;
import xsna.qoy;
import xsna.shy;
import xsna.zcl;

/* compiled from: ClipsDraftCommonData.kt */
/* loaded from: classes17.dex */
public final class ClipsDraftCommonData implements Serializer.StreamParcelable, bxx {
    public final String b;
    public final int c;
    public List<ClipsEditorInputVideoItem> d;
    public String e;
    public long f;
    public final boolean g;
    public final int h;
    public boolean i;
    public String j;
    public final String k;
    public List<? extends List<ClipsDraftMusicInfo>> l;
    public float m;
    public ClipsDraftOrdDataInfo n;
    public Long o;
    public static final a p = new a();
    public static final Serializer.c<ClipsDraftCommonData> CREATOR = new b();

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ClipsDraftCommonData> {
        @Override // xsna.aay
        public final ClipsDraftCommonData a(JSONObject jSONObject) {
            return new ClipsDraftCommonData(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ClipsDraftCommonData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipsDraftCommonData a(Serializer serializer) {
            ArrayList arrayList;
            String H = serializer.H();
            int u = serializer.u();
            ArrayList k = serializer.k(ClipsEditorInputVideoItem.class);
            if (k == null) {
                k = new ArrayList();
            }
            String H2 = serializer.H();
            long w = serializer.w();
            boolean m = serializer.m();
            int u2 = serializer.u();
            boolean m2 = serializer.m();
            String H3 = serializer.H();
            String H4 = serializer.H();
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            try {
                int u3 = serializer.u();
                if (u3 >= 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < u3; i++) {
                        ArrayList k2 = serializer.k(ClipsDraftMusicInfo.class);
                        if (k2 != null) {
                            arrayList2.add(k2);
                        }
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                return new ClipsDraftCommonData(H, u, k, H2, w, m, u2, m2, H3, H4, arrayList, serializer.s(), (ClipsDraftOrdDataInfo) serializer.G(ClipsDraftOrdDataInfo.class.getClassLoader()), serializer.x());
            } finally {
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipsDraftCommonData[i];
        }
    }

    public ClipsDraftCommonData(String str, int i, List<ClipsEditorInputVideoItem> list, String str2, long j, boolean z, int i2, boolean z2, String str3, String str4, List<? extends List<ClipsDraftMusicInfo>> list2, float f, ClipsDraftOrdDataInfo clipsDraftOrdDataInfo, Long l) {
        this.b = str;
        this.c = i;
        this.d = list;
        this.e = str2;
        this.f = j;
        this.g = z;
        this.h = i2;
        this.i = z2;
        this.j = str3;
        this.k = str4;
        this.l = list2;
        this.m = f;
        this.n = clipsDraftOrdDataInfo;
        this.o = l;
    }

    public static ClipsDraftCommonData a(ClipsDraftCommonData clipsDraftCommonData, ArrayList arrayList, int i, List list, int i2) {
        String str = clipsDraftCommonData.b;
        int i3 = clipsDraftCommonData.c;
        List<ClipsEditorInputVideoItem> list2 = (i2 & 4) != 0 ? clipsDraftCommonData.d : arrayList;
        String str2 = clipsDraftCommonData.e;
        List<ClipsEditorInputVideoItem> list3 = list2;
        long j = clipsDraftCommonData.f;
        boolean z = clipsDraftCommonData.g;
        int i4 = (i2 & 64) != 0 ? clipsDraftCommonData.h : i;
        boolean z2 = clipsDraftCommonData.i;
        String str3 = (i2 & 256) != 0 ? clipsDraftCommonData.j : null;
        String str4 = clipsDraftCommonData.k;
        List list4 = (i2 & 1024) != 0 ? clipsDraftCommonData.l : list;
        float f = clipsDraftCommonData.m;
        ClipsDraftOrdDataInfo clipsDraftOrdDataInfo = clipsDraftCommonData.n;
        Long l = clipsDraftCommonData.o;
        clipsDraftCommonData.getClass();
        return new ClipsDraftCommonData(str, i3, list3, str2, j, z, i4, z2, str3, str4, list4, f, clipsDraftOrdDataInfo, l);
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
        serializer.j0(this.k);
        serializer.X(this.l);
        serializer.P(this.m);
        serializer.i0(this.n);
        serializer.b0(this.o);
    }

    public final ClipsEditorInputVideoItem b(String str) {
        Object obj = null;
        if (str == null) {
            return null;
        }
        Iterator<T> it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (epx.f(((ClipsEditorInputVideoItem) next).b.getPath(), str)) {
                obj = next;
                break;
            }
        }
        return (ClipsEditorInputVideoItem) obj;
    }

    public final List<List<ClipsDraftMusicInfo>> d() {
        return this.l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<ClipsEditorInputVideoItem> e() {
        return this.d;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new qm1(this, 26));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsDraftCommonData)) {
            return false;
        }
        ClipsDraftCommonData clipsDraftCommonData = (ClipsDraftCommonData) obj;
        return epx.f(this.b, clipsDraftCommonData.b) && this.c == clipsDraftCommonData.c && epx.f(this.d, clipsDraftCommonData.d) && epx.f(this.e, clipsDraftCommonData.e) && this.f == clipsDraftCommonData.f && this.g == clipsDraftCommonData.g && this.h == clipsDraftCommonData.h && this.i == clipsDraftCommonData.i && epx.f(this.j, clipsDraftCommonData.j) && epx.f(this.k, clipsDraftCommonData.k) && epx.f(this.l, clipsDraftCommonData.l) && Float.compare(this.m, clipsDraftCommonData.m) == 0 && epx.f(this.n, clipsDraftCommonData.n) && epx.f(this.o, clipsDraftCommonData.o);
    }

    public final String f() {
        return this.j;
    }

    public final void g(String str) {
        this.j = str;
    }

    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        int a2 = fw3.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d);
        String str = this.e;
        int b2 = qoy.b(shy.a(this.h, qoy.b(bh10.a((a2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31), 31, this.i);
        String str2 = this.j;
        int hashCode = (b2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<? extends List<ClipsDraftMusicInfo>> list = this.l;
        int a3 = io.reactivex.rxjava3.subjects.b.a(this.m, (hashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31);
        ClipsDraftOrdDataInfo clipsDraftOrdDataInfo = this.n;
        int hashCode3 = (a3 + (clipsDraftOrdDataInfo == null ? 0 : clipsDraftOrdDataInfo.hashCode())) * 31;
        Long l = this.o;
        return hashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsDraftCommonData(id=");
        sb.append(this.b);
        sb.append(", maxClipDurationMs=");
        sb.append(this.c);
        sb.append(", files=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", previewTimestamp=");
        sb.append(this.f);
        sb.append(", autosaved=");
        sb.append(this.g);
        sb.append(", dateSeconds=");
        sb.append(this.h);
        sb.append(", isPreviewFromGallery=");
        sb.append(this.i);
        sb.append(", previewUri=");
        sb.append(this.j);
        sb.append(", entryPoint=");
        sb.append(this.k);
        sb.append(", audios=");
        sb.append(this.l);
        sb.append(", aspectRatio=");
        sb.append(this.m);
        sb.append(", ordInfo=");
        sb.append(this.n);
        sb.append(", delayedPublicationDate=");
        return iq.b(sb, this.o, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public /* synthetic */ ClipsDraftCommonData(String str, int i, List list, String str2, long j, boolean z, int i2, boolean z2, String str3, String str4, List list2, float f, ClipsDraftOrdDataInfo clipsDraftOrdDataInfo, Long l, int i3, zcl zclVar) {
        this(str, i, list, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? -1L : j, (i3 & 32) != 0 ? true : z, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? false : z2, (i3 & 256) != 0 ? null : str3, (i3 & 512) != 0 ? null : str4, (i3 & 1024) != 0 ? null : list2, (i3 & 2048) != 0 ? 0.5625f : f, (i3 & 4096) != 0 ? null : clipsDraftOrdDataInfo, (i3 & 8192) != 0 ? null : l);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClipsDraftCommonData(JSONObject jSONObject) {
        this(r4, r5, r1 == null ? new ArrayList() : r1, f370.D(jSONObject, "description"), jSONObject.getLong("preview_timestamp"), jSONObject.getBoolean("autosaved"), jSONObject.getInt("date"), jSONObject.optBoolean("is_preview_from_gallery", false), f370.D(jSONObject, "preview_uri"), f370.D(jSONObject, "entry_point"), aay.a.b(jSONObject, "audios", ClipsDraftMusicInfo.f), (float) jSONObject.getDouble("aspect_ratio"), (ClipsDraftOrdDataInfo) aay.a.c(jSONObject, "ord_info", ClipsDraftOrdDataInfo.e), f370.z(jSONObject, "delayed_publication_date"));
        String str;
        try {
            str = jSONObject.getString("id");
        } catch (Throwable unused) {
            str = null;
        }
        String valueOf = str == null ? String.valueOf(jSONObject.getInt("id")) : str;
        int i = jSONObject.getInt("max_duration");
        ArrayList a2 = aay.a.a(jSONObject, "files", ClipsEditorInputVideoItem.s);
    }
}
