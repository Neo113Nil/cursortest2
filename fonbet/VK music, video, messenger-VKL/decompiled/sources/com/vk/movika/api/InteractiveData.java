package com.vk.movika.api;

import com.vk.dto.common.VideoFile;
import com.vk.dto.search.SearchStatsLoggingInfo;
import defpackage.q0;
import xsna.asp;
import xsna.ebs0;
import xsna.epx;
import xsna.qoy;
import xsna.zrp;

/* compiled from: InteractiveData.kt */
/* loaded from: classes3.dex */
public final class InteractiveData {
    public final VideoFile a;
    public final String b;
    public final String c;
    public final From d;
    public final SearchStatsLoggingInfo e;
    public final boolean f;
    public final ebs0 g;
    public final boolean h;
    public final boolean i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InteractiveData.kt */
    public static final class From {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ From[] $VALUES;
        public static final From CATALOG;
        public static final From DISCOVER_APP;
        public static final From DISCOVER_VIDEO;
        public static final From FEED;
        public static final From FULLSCREEN;
        public static final From MESSENGER;

        static {
            From from = new From("CATALOG", 0);
            CATALOG = from;
            From from2 = new From("FEED", 1);
            FEED = from2;
            From from3 = new From("MESSENGER", 2);
            MESSENGER = from3;
            From from4 = new From("DISCOVER_APP", 3);
            DISCOVER_APP = from4;
            From from5 = new From("DISCOVER_VIDEO", 4);
            DISCOVER_VIDEO = from5;
            From from6 = new From("FULLSCREEN", 5);
            FULLSCREEN = from6;
            From[] fromArr = {from, from2, from3, from4, from5, from6};
            $VALUES = fromArr;
            $ENTRIES = new asp(fromArr);
        }

        public From() {
            throw null;
        }

        public static From valueOf(String str) {
            return (From) Enum.valueOf(From.class, str);
        }

        public static From[] values() {
            return (From[]) $VALUES.clone();
        }
    }

    public /* synthetic */ InteractiveData(VideoFile videoFile, String str, String str2, From from, SearchStatsLoggingInfo searchStatsLoggingInfo, ebs0 ebs0Var, boolean z, boolean z2, int i) {
        this(videoFile, str, str2, from, (i & 16) != 0 ? null : searchStatsLoggingInfo, false, (i & 64) != 0 ? null : ebs0Var, (i & 128) != 0 ? false : z, (i & 256) != 0 ? false : z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractiveData)) {
            return false;
        }
        InteractiveData interactiveData = (InteractiveData) obj;
        return epx.f(this.a, interactiveData.a) && epx.f(this.b, interactiveData.b) && epx.f(this.c, interactiveData.c) && this.d == interactiveData.d && epx.f(this.e, interactiveData.e) && this.f == interactiveData.f && epx.f(this.g, interactiveData.g) && this.h == interactiveData.h && this.i == interactiveData.i;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        SearchStatsLoggingInfo searchStatsLoggingInfo = this.e;
        int b = qoy.b((hashCode3 + (searchStatsLoggingInfo == null ? 0 : searchStatsLoggingInfo.hashCode())) * 31, 31, this.f);
        ebs0 ebs0Var = this.g;
        return Boolean.hashCode(this.i) + qoy.b((b + (ebs0Var != null ? ebs0Var.hashCode() : 0)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InteractiveData(videoFile=");
        sb.append(this.a);
        sb.append(", videoReferrer=");
        sb.append(this.b);
        sb.append(", trackCode=");
        sb.append(this.c);
        sb.append(", from=");
        sb.append(this.d);
        sb.append(", searchStatsLoggingInfo=");
        sb.append(this.e);
        sb.append(", isFrontOpening=");
        sb.append(this.f);
        sb.append(", callback=");
        sb.append(this.g);
        sb.append(", isNotInterested=");
        sb.append(this.h);
        sb.append(", isShowPlaylist=");
        return q0.a(sb, this.i, ')');
    }

    public InteractiveData(VideoFile videoFile, String str, String str2, From from, SearchStatsLoggingInfo searchStatsLoggingInfo, boolean z, ebs0 ebs0Var, boolean z2, boolean z3) {
        this.a = videoFile;
        this.b = str;
        this.c = str2;
        this.d = from;
        this.e = searchStatsLoggingInfo;
        this.f = z;
        this.g = ebs0Var;
        this.h = z2;
        this.i = z3;
    }
}
