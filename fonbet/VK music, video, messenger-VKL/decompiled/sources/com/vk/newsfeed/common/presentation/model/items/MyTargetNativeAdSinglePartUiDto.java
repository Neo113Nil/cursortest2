package com.vk.newsfeed.common.presentation.model.items;

import com.vk.dto.newsfeed.entries.DisclaimerContent;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.feed.core.models.Description;
import com.vk.newsfeed.common.data.displayitems.AdVkFeedItemState;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import xsna.asp;
import xsna.bp50;
import xsna.cw50;
import xsna.dw50;
import xsna.epx;
import xsna.fw3;
import xsna.gjx;
import xsna.ol60;
import xsna.u1c0;
import xsna.zrp;
import xsna.zu50;

/* compiled from: MyTargetNativeAdSinglePartUiDto.kt */
/* loaded from: classes4.dex */
public final class MyTargetNativeAdSinglePartUiDto extends ol60 {
    public final zu50 h;
    public final cw50 i;
    public final gjx j;
    public final String k;
    public final Description l;
    public final Description m;
    public final Description n;
    public final String o;
    public final Description p;
    public final List<dw50> q;
    public final bp50 r;
    public final u1c0 s;
    public final MyTargetNativeAdEntry t;
    public AdVkFeedItemState u;
    public final DisclaimerContent v;
    public final Map<Integer, String> w;
    public final Type x;
    public final PhotoAttachment y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MyTargetNativeAdSinglePartUiDto.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CAROUSEL;
        public static final Type COLLAGE;
        public static final Type INTERNAL_STATIC;
        public static final Type INTERNAL_VIDEO;
        public static final Type STATIC;

        static {
            Type type = new Type("INTERNAL_STATIC", 0);
            INTERNAL_STATIC = type;
            Type type2 = new Type("INTERNAL_VIDEO", 1);
            INTERNAL_VIDEO = type2;
            Type type3 = new Type("STATIC", 2);
            STATIC = type3;
            Type type4 = new Type("COLLAGE", 3);
            COLLAGE = type4;
            Type type5 = new Type("CAROUSEL", 4);
            CAROUSEL = type5;
            Type[] typeArr = {type, type2, type3, type4, type5};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public MyTargetNativeAdSinglePartUiDto(zu50 zu50Var, cw50 cw50Var, gjx gjxVar, String str, Description description, Description description2, Description description3, String str2, Description description4, List list, bp50 bp50Var, u1c0 u1c0Var, MyTargetNativeAdEntry myTargetNativeAdEntry, AdVkFeedItemState adVkFeedItemState, DisclaimerContent disclaimerContent, HashMap hashMap, Type type, PhotoAttachment photoAttachment) {
        super(354, 0, 0, 0, null);
        this.h = zu50Var;
        this.i = cw50Var;
        this.j = gjxVar;
        this.k = str;
        this.l = description;
        this.m = description2;
        this.n = description3;
        this.o = str2;
        this.p = description4;
        this.q = list;
        this.r = bp50Var;
        this.s = u1c0Var;
        this.t = myTargetNativeAdEntry;
        this.u = adVkFeedItemState;
        this.v = disclaimerContent;
        this.w = hashMap;
        this.x = type;
        this.y = photoAttachment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyTargetNativeAdSinglePartUiDto)) {
            return false;
        }
        MyTargetNativeAdSinglePartUiDto myTargetNativeAdSinglePartUiDto = (MyTargetNativeAdSinglePartUiDto) obj;
        myTargetNativeAdSinglePartUiDto.getClass();
        return epx.f(this.h, myTargetNativeAdSinglePartUiDto.h) && epx.f(this.i, myTargetNativeAdSinglePartUiDto.i) && epx.f(this.j, myTargetNativeAdSinglePartUiDto.j) && epx.f(this.k, myTargetNativeAdSinglePartUiDto.k) && epx.f(this.l, myTargetNativeAdSinglePartUiDto.l) && epx.f(this.m, myTargetNativeAdSinglePartUiDto.m) && epx.f(this.n, myTargetNativeAdSinglePartUiDto.n) && epx.f(this.o, myTargetNativeAdSinglePartUiDto.o) && epx.f(this.p, myTargetNativeAdSinglePartUiDto.p) && epx.f(this.q, myTargetNativeAdSinglePartUiDto.q) && epx.f(this.r, myTargetNativeAdSinglePartUiDto.r) && epx.f(this.s, myTargetNativeAdSinglePartUiDto.s) && epx.f(this.t, myTargetNativeAdSinglePartUiDto.t) && this.u == myTargetNativeAdSinglePartUiDto.u && this.v == myTargetNativeAdSinglePartUiDto.v && epx.f(this.w, myTargetNativeAdSinglePartUiDto.w) && this.x == myTargetNativeAdSinglePartUiDto.x && epx.f(this.y, myTargetNativeAdSinglePartUiDto.y);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(0) * 31;
        zu50 zu50Var = this.h;
        int hashCode2 = (hashCode + (zu50Var == null ? 0 : zu50Var.hashCode())) * 31;
        cw50 cw50Var = this.i;
        int hashCode3 = (hashCode2 + (cw50Var == null ? 0 : cw50Var.hashCode())) * 31;
        gjx gjxVar = this.j;
        int hashCode4 = (hashCode3 + (gjxVar == null ? 0 : gjxVar.hashCode())) * 31;
        String str = this.k;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Description description = this.l;
        int hashCode6 = (hashCode5 + (description == null ? 0 : description.hashCode())) * 31;
        Description description2 = this.m;
        int hashCode7 = (hashCode6 + (description2 == null ? 0 : description2.hashCode())) * 31;
        Description description3 = this.n;
        int hashCode8 = (hashCode7 + (description3 == null ? 0 : description3.hashCode())) * 31;
        String str2 = this.o;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Description description4 = this.p;
        int a = fw3.a((hashCode9 + (description4 == null ? 0 : description4.hashCode())) * 961, 31, this.q);
        bp50 bp50Var = this.r;
        int hashCode10 = (this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((a + (bp50Var == null ? 0 : bp50Var.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
        Map<Integer, String> map = this.w;
        int hashCode11 = (this.x.hashCode() + ((hashCode10 + (map == null ? 0 : map.hashCode())) * 31)) * 31;
        PhotoAttachment photoAttachment = this.y;
        return hashCode11 + (photoAttachment != null ? photoAttachment.hashCode() : 0);
    }

    public final String toString() {
        return "MyTargetNativeAdSinglePartUiDto(seqId=0, nativeAd=" + this.h + ", nativePromoBanner=" + this.i + ", internalNativeBanner=" + this.j + ", title=" + this.k + ", ageRestriction=" + this.l + ", advertisingLabel=" + this.m + ", description=" + this.n + ", navigationType=" + this.o + ", compositeCategory=" + this.p + ", baseVideoAutoplayHolderUiDto=null, cards=" + this.q + ", adChoicesController=" + this.r + ", footerDisplayItem=" + this.s + ", raw=" + this.t + ", state=" + this.u + ", contentType=" + this.v + ", collageFrameDurations=" + this.w + ", type=" + this.x + ", photoAttachment=" + this.y + ')';
    }
}
