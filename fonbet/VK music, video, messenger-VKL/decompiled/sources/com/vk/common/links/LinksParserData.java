package com.vk.common.links;

import android.os.Bundle;
import defpackage.q0;
import xsna.asp;
import xsna.epx;
import xsna.li70;
import xsna.pjb0;
import xsna.raz;
import xsna.saz;
import xsna.shy;
import xsna.taz;
import xsna.zrp;

/* compiled from: LinksParserData.kt */
/* loaded from: classes17.dex */
public final class LinksParserData {
    public final int a;
    public final Bundle b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final HashtagService i;
    public final raz j;
    public final saz k;
    public final int l;
    public final taz m;
    public final boolean n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LinksParserData.kt */
    public static final class HashtagService {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HashtagService[] $VALUES;
        public static final HashtagService Clips;
        public static final HashtagService Posts;
        public static final HashtagService Video;

        static {
            HashtagService hashtagService = new HashtagService("Posts", 0);
            Posts = hashtagService;
            HashtagService hashtagService2 = new HashtagService("Video", 1);
            Video = hashtagService2;
            HashtagService hashtagService3 = new HashtagService("Clips", 2);
            Clips = hashtagService3;
            HashtagService[] hashtagServiceArr = {hashtagService, hashtagService2, hashtagService3};
            $VALUES = hashtagServiceArr;
            $ENTRIES = new asp(hashtagServiceArr);
        }

        public HashtagService() {
            throw null;
        }

        public static HashtagService valueOf(String str) {
            return (HashtagService) Enum.valueOf(HashtagService.class, str);
        }

        public static HashtagService[] values() {
            return (HashtagService[]) $VALUES.clone();
        }
    }

    public LinksParserData() {
        this(0, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (HashtagService) null, (saz) null, 0, (taz) null, false, 16383);
    }

    public static LinksParserData a(LinksParserData linksParserData, int i, pjb0 pjb0Var) {
        int i2 = linksParserData.a;
        Bundle bundle = linksParserData.b;
        int i3 = linksParserData.c;
        int i4 = linksParserData.d;
        String str = linksParserData.e;
        String str2 = linksParserData.f;
        int i5 = linksParserData.g;
        int i6 = linksParserData.h;
        HashtagService hashtagService = linksParserData.i;
        raz razVar = linksParserData.j;
        saz sazVar = linksParserData.k;
        boolean z = linksParserData.n;
        linksParserData.getClass();
        return new LinksParserData(i2, bundle, i3, i4, str, str2, i5, i6, hashtagService, razVar, sazVar, i, pjb0Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinksParserData)) {
            return false;
        }
        LinksParserData linksParserData = (LinksParserData) obj;
        return this.a == linksParserData.a && epx.f(this.b, linksParserData.b) && this.c == linksParserData.c && this.d == linksParserData.d && epx.f(this.e, linksParserData.e) && epx.f(this.f, linksParserData.f) && this.g == linksParserData.g && this.h == linksParserData.h && this.i == linksParserData.i && epx.f(this.j, linksParserData.j) && epx.f(this.k, linksParserData.k) && this.l == linksParserData.l && epx.f(this.m, linksParserData.m) && this.n == linksParserData.n;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Bundle bundle = this.b;
        int a = shy.a(this.d, shy.a(this.c, (hashCode + (bundle == null ? 0 : bundle.hashCode())) * 31, 31), 31);
        String str = this.e;
        int hashCode2 = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (this.i.hashCode() + shy.a(this.h, shy.a(this.g, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31)) * 31;
        raz razVar = this.j;
        int hashCode4 = (hashCode3 + (razVar == null ? 0 : razVar.hashCode())) * 31;
        saz sazVar = this.k;
        int a2 = shy.a(this.l, (hashCode4 + (sazVar == null ? 0 : sazVar.hashCode())) * 31, 31);
        taz tazVar = this.m;
        return Boolean.hashCode(this.n) + ((a2 + (tazVar != null ? tazVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinksParserData(flags=");
        sb.append(this.a);
        sb.append(", awayParams=");
        sb.append(this.b);
        sb.append(", linkColorRes=");
        sb.append(this.c);
        sb.append(", linkColorAttr=");
        sb.append(this.d);
        sb.append(", hashtagToIgnore=");
        sb.append(this.e);
        sb.append(", hashtagPrefix=");
        sb.append(this.f);
        sb.append(", hashtagColorRes=");
        sb.append(this.g);
        sb.append(", hashtagColorAttr=");
        sb.append(this.h);
        sb.append(", hashtagService=");
        sb.append(this.i);
        sb.append(", postInteract=");
        sb.append(this.j);
        sb.append(", postLinkClickListener=");
        sb.append(this.k);
        sb.append(", timeCodeMaxDuration=");
        sb.append(this.l);
        sb.append(", timeCodeClickListener=");
        sb.append(this.m);
        sb.append(", shouldFilterObsceneText=");
        return q0.a(sb, this.n, ')');
    }

    public LinksParserData(int i) {
        this(i, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (HashtagService) null, (saz) null, 0, (taz) null, false, 16382);
    }

    public LinksParserData(int i, Bundle bundle, int i2, int i3, String str, String str2, int i4, int i5, HashtagService hashtagService, raz razVar, saz sazVar, int i6, taz tazVar, boolean z) {
        this.a = i;
        this.b = bundle;
        this.c = i2;
        this.d = i3;
        this.e = str;
        this.f = str2;
        this.g = i4;
        this.h = i5;
        this.i = hashtagService;
        this.j = razVar;
        this.k = sazVar;
        this.l = i6;
        this.m = tazVar;
        this.n = z;
    }

    public /* synthetic */ LinksParserData(int i, Bundle bundle, int i2, int i3, String str, String str2, int i4, int i5, HashtagService hashtagService, saz sazVar, int i6, taz tazVar, boolean z, int i7) {
        this((i7 & 1) != 0 ? 41739 : i, (i7 & 2) != 0 ? null : bundle, (i7 & 4) != 0 ? 0 : i2, (i7 & 8) != 0 ? 0 : i3, (i7 & 16) != 0 ? null : str, (i7 & 32) != 0 ? null : str2, (i7 & 64) != 0 ? 0 : i4, (i7 & 128) != 0 ? 0 : i5, (i7 & 256) != 0 ? HashtagService.Posts : hashtagService, (i7 & 512) != 0 ? null : li70.c.a, (i7 & 1024) != 0 ? null : sazVar, (i7 & 2048) != 0 ? 0 : i6, (i7 & 4096) != 0 ? null : tazVar, (i7 & 8192) != 0 ? false : z);
    }
}
