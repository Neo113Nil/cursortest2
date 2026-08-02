package com.vk.dto.stories.model;

import com.unity3d.services.UnityAdsConstants;
import xsna.asp;
import xsna.qoy;
import xsna.shy;
import xsna.xq;
import xsna.zrp;

/* compiled from: TextBackgroundInfo.kt */
/* loaded from: classes18.dex */
public final class TextBackgroundInfo {
    public Outline a = Outline.NONE;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public float g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public boolean h = false;
    public int i = 0;
    public float j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TextBackgroundInfo.kt */
    public static final class Outline {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Outline[] $VALUES;
        public static final Outline LINE;
        public static final Outline NONE;

        static {
            Outline outline = new Outline("LINE", 0);
            LINE = outline;
            Outline outline2 = new Outline("NONE", 1);
            NONE = outline2;
            Outline[] outlineArr = {outline, outline2};
            $VALUES = outlineArr;
            $ENTRIES = new asp(outlineArr);
        }

        public Outline() {
            throw null;
        }

        public static Outline valueOf(String str) {
            return (Outline) Enum.valueOf(Outline.class, str);
        }

        public static Outline[] values() {
            return (Outline[]) $VALUES.clone();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextBackgroundInfo)) {
            return false;
        }
        TextBackgroundInfo textBackgroundInfo = (TextBackgroundInfo) obj;
        return this.a == textBackgroundInfo.a && this.b == textBackgroundInfo.b && this.c == textBackgroundInfo.c && this.d == textBackgroundInfo.d && this.e == textBackgroundInfo.e && this.f == textBackgroundInfo.f && Float.compare(this.g, textBackgroundInfo.g) == 0 && this.h == textBackgroundInfo.h && this.i == textBackgroundInfo.i && Float.compare(this.j, textBackgroundInfo.j) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.j) + shy.a(this.i, qoy.b(io.reactivex.rxjava3.subjects.b.a(this.g, shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31, this.h), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextBackgroundInfo(outline=");
        sb.append(this.a);
        sb.append(", paddingLeft=");
        sb.append(this.b);
        sb.append(", paddingTop=");
        sb.append(this.c);
        sb.append(", paddingRight=");
        sb.append(this.d);
        sb.append(", paddingBottom=");
        sb.append(this.e);
        sb.append(", color=");
        sb.append(this.f);
        sb.append(", cornerRadius=");
        sb.append(this.g);
        sb.append(", connectLines=");
        sb.append(this.h);
        sb.append(", alpha=");
        sb.append(this.i);
        sb.append(", borderWidth=");
        return xq.c(')', this.j, sb);
    }
}
