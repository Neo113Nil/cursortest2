package com.vk.dto.newsfeed.entries;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.serialize.Serializer;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.MyTargetBrandLiftSurvey;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import xsna.bp50;
import xsna.cjl0;
import xsna.ej90;
import xsna.epx;
import xsna.gjx;
import xsna.ho8;
import xsna.j5g;
import xsna.lhz0;
import xsna.nnx;
import xsna.qoy;
import xsna.tsx0;
import xsna.urd0;
import xsna.wjz0;
import xsna.wsx0;
import xsna.zcl;
import xsna.zu50;

/* compiled from: MyTargetNativeAdEntry.kt */
/* loaded from: classes18.dex */
public final class MyTargetNativeAdEntry extends NewsEntry implements wsx0, tsx0 {
    public static final Serializer.c<MyTargetNativeAdEntry> CREATOR = new c();
    public final bp50 A;
    public final gjx B;
    public final String C;
    public final boolean D;
    public b E;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final DisclaimerData q;
    public DisclaimerContent r;
    public final EntryHeader s;
    public final PhotoAttachment t;
    public final VideoAttachment u;
    public final MyTargetBrandLiftSurvey v;
    public final ej90 w;
    public final boolean x;
    public final boolean y;
    public final zu50 z;

    /* compiled from: MyTargetNativeAdEntry.kt */
    public static final class a {
        public static final Description a(String str) {
            if (str != null) {
                return new Description(new Text(str, null), null, null, null, str, false, false, false, PsExtractor.AUDIO_STREAM, null);
            }
            return null;
        }
    }

    /* compiled from: MyTargetNativeAdEntry.kt */
    public static final class b {
        public final String a;
        public final boolean b;
        public final Map<String, Set<String>> c;

        public b(String str, Map map, boolean z) {
            this.a = str;
            this.b = z;
            this.c = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static b a(b bVar, String str, LinkedHashMap linkedHashMap, int i) {
            if ((i & 1) != 0) {
                str = bVar.a;
            }
            boolean z = (i & 2) != 0 ? bVar.b : true;
            Map map = linkedHashMap;
            if ((i & 4) != 0) {
                map = bVar.c;
            }
            bVar.getClass();
            return new b(str, map, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SurveyState(currentQuestionId=");
            sb.append(this.a);
            sb.append(", isFinished=");
            sb.append(this.b);
            sb.append(", selectedAnswerIdsByQuestionIds=");
            return cjl0.a(sb, this.c, ')');
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<MyTargetNativeAdEntry> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MyTargetNativeAdEntry a(Serializer serializer) {
            String H = serializer.H();
            String H2 = serializer.H();
            String H3 = serializer.H();
            String H4 = serializer.H();
            String H5 = serializer.H();
            String H6 = serializer.H();
            String H7 = serializer.H();
            String H8 = serializer.H();
            DisclaimerData disclaimerData = (DisclaimerData) serializer.G(DisclaimerData.class.getClassLoader());
            DisclaimerContent disclaimerContent = (DisclaimerContent) serializer.C();
            if (disclaimerContent == null) {
                disclaimerContent = DisclaimerContent.UNSUPPORTED;
            }
            return new MyTargetNativeAdEntry(H, H2, H3, H4, H5, H6, H8, H7, disclaimerData, disclaimerContent, (EntryHeader) serializer.G(EntryHeader.class.getClassLoader()), (PhotoAttachment) serializer.G(PhotoAttachment.class.getClassLoader()), (VideoAttachment) serializer.G(VideoAttachment.class.getClassLoader()), (MyTargetBrandLiftSurvey) serializer.G(MyTargetBrandLiftSurvey.class.getClassLoader()), null, serializer.m(), serializer.m(), null, null, null, serializer.I(), 933888, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MyTargetNativeAdEntry[i];
        }
    }

    public /* synthetic */ MyTargetNativeAdEntry(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, DisclaimerData disclaimerData, DisclaimerContent disclaimerContent, EntryHeader entryHeader, PhotoAttachment photoAttachment, VideoAttachment videoAttachment, MyTargetBrandLiftSurvey myTargetBrandLiftSurvey, ej90 ej90Var, boolean z, boolean z2, zu50 zu50Var, bp50 bp50Var, gjx gjxVar, String str9, int i, zcl zclVar) {
        this(str, str2, str3, str4, str5, str6, str7, str8, (i & 256) != 0 ? null : disclaimerData, (i & 512) != 0 ? DisclaimerContent.UNSUPPORTED : disclaimerContent, entryHeader, (i & 2048) != 0 ? null : photoAttachment, (i & 4096) != 0 ? null : videoAttachment, (i & 8192) != 0 ? null : myTargetBrandLiftSurvey, (i & 16384) != 0 ? null : ej90Var, z, z2, (131072 & i) != 0 ? null : zu50Var, (262144 & i) != 0 ? null : bp50Var, (524288 & i) != 0 ? null : gjxVar, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str9);
    }

    public static MyTargetNativeAdEntry Eb(MyTargetNativeAdEntry myTargetNativeAdEntry, DisclaimerData disclaimerData, DisclaimerContent disclaimerContent, VideoAttachment videoAttachment, boolean z, zu50 zu50Var, bp50 bp50Var, gjx gjxVar, int i) {
        boolean z2;
        zu50 zu50Var2;
        String str = myTargetNativeAdEntry.i;
        String str2 = myTargetNativeAdEntry.j;
        String str3 = myTargetNativeAdEntry.k;
        String str4 = myTargetNativeAdEntry.l;
        String str5 = myTargetNativeAdEntry.m;
        String str6 = myTargetNativeAdEntry.n;
        String str7 = myTargetNativeAdEntry.o;
        String str8 = myTargetNativeAdEntry.p;
        DisclaimerData disclaimerData2 = (i & 256) != 0 ? myTargetNativeAdEntry.q : disclaimerData;
        DisclaimerContent disclaimerContent2 = (i & 512) != 0 ? myTargetNativeAdEntry.r : disclaimerContent;
        EntryHeader entryHeader = myTargetNativeAdEntry.s;
        DisclaimerData disclaimerData3 = disclaimerData2;
        DisclaimerContent disclaimerContent3 = disclaimerContent2;
        PhotoAttachment photoAttachment = myTargetNativeAdEntry.t;
        VideoAttachment videoAttachment2 = (i & 4096) != 0 ? myTargetNativeAdEntry.u : videoAttachment;
        MyTargetBrandLiftSurvey myTargetBrandLiftSurvey = myTargetNativeAdEntry.v;
        VideoAttachment videoAttachment3 = videoAttachment2;
        ej90 ej90Var = myTargetNativeAdEntry.w;
        boolean z3 = (i & 32768) != 0 ? myTargetNativeAdEntry.x : z;
        boolean z4 = myTargetNativeAdEntry.y;
        if ((i & 131072) != 0) {
            z2 = z4;
            zu50Var2 = myTargetNativeAdEntry.z;
        } else {
            z2 = z4;
            zu50Var2 = zu50Var;
        }
        bp50 bp50Var2 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? myTargetNativeAdEntry.A : bp50Var;
        gjx gjxVar2 = (i & 524288) != 0 ? myTargetNativeAdEntry.B : gjxVar;
        String str9 = myTargetNativeAdEntry.C;
        myTargetNativeAdEntry.getClass();
        return new MyTargetNativeAdEntry(str, str2, str3, str4, str5, str6, str7, str8, disclaimerData3, disclaimerContent3, entryHeader, photoAttachment, videoAttachment3, myTargetBrandLiftSurvey, ej90Var, z3, z2, zu50Var2, bp50Var2, gjxVar2, str9);
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return this.p;
    }

    @Override // xsna.tsx0
    public final DisclaimerData N3() {
        return this.q;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
        serializer.j0(this.l);
        serializer.j0(this.m);
        serializer.j0(this.n);
        serializer.j0(this.p);
        serializer.j0(this.o);
        serializer.i0(this.q);
        serializer.g0(this.r);
        serializer.i0(this.s);
        serializer.i0(this.t);
        serializer.i0(this.u);
        serializer.i0(this.v);
        serializer.L(this.x ? (byte) 1 : (byte) 0);
        serializer.L(this.y ? (byte) 1 : (byte) 0);
        serializer.m0(this.C);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MyTargetNativeAdEntry.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        MyTargetNativeAdEntry myTargetNativeAdEntry = (MyTargetNativeAdEntry) obj;
        return epx.f(this.i, myTargetNativeAdEntry.i) && epx.f(this.j, myTargetNativeAdEntry.j) && epx.f(this.k, myTargetNativeAdEntry.k) && epx.f(this.l, myTargetNativeAdEntry.l) && epx.f(this.m, myTargetNativeAdEntry.m) && epx.f(this.n, myTargetNativeAdEntry.n) && epx.f(this.o, myTargetNativeAdEntry.o) && epx.f(this.p, myTargetNativeAdEntry.p) && epx.f(this.u, myTargetNativeAdEntry.u) && this.x == myTargetNativeAdEntry.x && this.y == myTargetNativeAdEntry.y && epx.f(this.t, myTargetNativeAdEntry.t) && epx.f(this.v, myTargetNativeAdEntry.v) && epx.f(this.C, myTargetNativeAdEntry.C);
    }

    @Override // xsna.tsx0
    public final DisclaimerContent getContentType() {
        return this.r;
    }

    @Override // xsna.wsx0
    public final EntryHeader getHeader() {
        return this.s;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(this.i.hashCode() * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p);
        VideoAttachment videoAttachment = this.u;
        int b2 = qoy.b(qoy.b((a2 + (videoAttachment != null ? videoAttachment.hashCode() : 0)) * 31, 31, this.x), 31, this.y);
        PhotoAttachment photoAttachment = this.t;
        int hashCode = (b2 + (photoAttachment != null ? photoAttachment.hashCode() : 0)) * 31;
        MyTargetBrandLiftSurvey myTargetBrandLiftSurvey = this.v;
        int hashCode2 = (hashCode + (myTargetBrandLiftSurvey != null ? myTargetBrandLiftSurvey.b.hashCode() : 0)) * 31;
        String str = this.C;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MyTargetNativeAdEntry(bannerId=");
        sb.append(this.i);
        sb.append(", patternType=");
        sb.append(this.j);
        sb.append(", templateId=");
        sb.append(this.k);
        sb.append(", pattern=");
        sb.append(this.l);
        sb.append(", adData=");
        sb.append(this.m);
        sb.append(", sdkSource=");
        sb.append(this.n);
        sb.append(", format=");
        sb.append(this.o);
        sb.append(", typeName=");
        sb.append(this.p);
        sb.append(", disclaimerData=");
        sb.append(this.q);
        sb.append(", contentType=");
        sb.append(this.r);
        sb.append(", header=");
        sb.append(this.s);
        sb.append(", photoAttachment=");
        sb.append(this.t);
        sb.append(", videoAttachment=");
        sb.append(this.u);
        sb.append(", survey=");
        sb.append(this.v);
        sb.append(", parsedDescription=");
        sb.append(this.w);
        sb.append(", isHidden=");
        sb.append(this.x);
        sb.append(", isMultipart=");
        sb.append(this.y);
        sb.append(", nativeAd=");
        sb.append(this.z);
        sb.append(", adsChoiceController=");
        sb.append(this.A);
        sb.append(", internalNativeBanner=");
        sb.append(this.B);
        sb.append(", disclaimerText=");
        return ho8.a(sb, this.C, ')');
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 66;
    }

    public MyTargetNativeAdEntry(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, DisclaimerData disclaimerData, DisclaimerContent disclaimerContent, EntryHeader entryHeader, PhotoAttachment photoAttachment, VideoAttachment videoAttachment, MyTargetBrandLiftSurvey myTargetBrandLiftSurvey, ej90 ej90Var, boolean z, boolean z2, zu50 zu50Var, bp50 bp50Var, gjx gjxVar, String str9) {
        wjz0 content;
        lhz0 lhz0Var;
        ArrayList arrayList;
        nnx nnxVar;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = str5;
        this.n = str6;
        this.o = str7;
        this.p = str8;
        this.q = disclaimerData;
        this.r = disclaimerContent;
        this.s = entryHeader;
        this.t = photoAttachment;
        this.u = videoAttachment;
        this.v = myTargetBrandLiftSurvey;
        this.w = ej90Var;
        this.x = z;
        this.y = z2;
        this.z = zu50Var;
        this.A = bp50Var;
        this.B = gjxVar;
        this.C = str9;
        boolean z3 = false;
        if (gjxVar != null && (content = gjxVar.getContent()) != null && (lhz0Var = content.g) != null && (arrayList = lhz0Var.c) != null && (nnxVar = (nnx) j5g.b0(0, arrayList)) != null && nnxVar.getHeight() > nnxVar.getWidth()) {
            z3 = true;
        }
        this.D = z3;
    }
}
