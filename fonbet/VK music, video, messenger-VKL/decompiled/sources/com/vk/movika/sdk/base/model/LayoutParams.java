package com.vk.movika.sdk.base.model;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* loaded from: classes3.dex */
public final class LayoutParams {
    public final Double a;
    public final Double b;
    public final Double c;
    public final Double d;
    public final Double e;
    public final InnerSizesDependOn f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class InnerSizesDependOn {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InnerSizesDependOn[] $VALUES;
        public static final InnerSizesDependOn SELF;
        public static final InnerSizesDependOn VIDEO;

        static {
            InnerSizesDependOn innerSizesDependOn = new InnerSizesDependOn("SELF", 0);
            SELF = innerSizesDependOn;
            InnerSizesDependOn innerSizesDependOn2 = new InnerSizesDependOn(SignalingProtocol.MEDIA_OPTION_VIDEO, 1);
            VIDEO = innerSizesDependOn2;
            InnerSizesDependOn[] innerSizesDependOnArr = {innerSizesDependOn, innerSizesDependOn2};
            $VALUES = innerSizesDependOnArr;
            $ENTRIES = new asp(innerSizesDependOnArr);
        }

        public InnerSizesDependOn() {
            throw null;
        }

        public static InnerSizesDependOn valueOf(String str) {
            return (InnerSizesDependOn) Enum.valueOf(InnerSizesDependOn.class, str);
        }

        public static InnerSizesDependOn[] values() {
            return (InnerSizesDependOn[]) $VALUES.clone();
        }
    }

    public LayoutParams(Double d, Double d2, Double d3, Double d4, Double d5, InnerSizesDependOn innerSizesDependOn) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = innerSizesDependOn;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LayoutParams)) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) obj;
        return epx.f(this.a, layoutParams.a) && epx.f(this.b, layoutParams.b) && epx.f(this.c, layoutParams.c) && epx.f(this.d, layoutParams.d) && epx.f(this.e, layoutParams.e) && this.f == layoutParams.f;
    }

    public final int hashCode() {
        Double d = this.a;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.c;
        int hashCode3 = (hashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.d;
        int hashCode4 = (hashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.e;
        return this.f.hashCode() + ((hashCode4 + (d5 != null ? d5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "LayoutParams(x=" + this.a + ", y=" + this.b + ", width=" + this.c + ", height=" + this.d + ", angle=" + this.e + ", innerSizesDependOn=" + this.f + ")";
    }

    public LayoutParams() {
        this(null, null, null, null, null, InnerSizesDependOn.SELF);
    }
}
