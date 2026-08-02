package com.vk.dto.common.clips;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.c5g;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.rl3;
import xsna.zrp;

/* compiled from: ClipsAdsFeaturesParams.kt */
/* loaded from: classes18.dex */
public final class ClipsAdsFeaturesParams extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ClipsAdsFeaturesParams> CREATOR = new a();
    public final List<String> b;
    public final List<AdsFlags> c;
    public final String d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsAdsFeaturesParams.kt */
    public static final class AdsFlags {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AdsFlags[] $VALUES;
        public static final AdsFlags HIDE_CLOSING_AD_BANNER;
        public static final AdsFlags HIDE_FULLSCREEN_AD_BANNER;
        public static final AdsFlags UNKNOWN;
        private final int value;

        static {
            AdsFlags adsFlags = new AdsFlags(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
            UNKNOWN = adsFlags;
            AdsFlags adsFlags2 = new AdsFlags("HIDE_CLOSING_AD_BANNER", 1, 1);
            HIDE_CLOSING_AD_BANNER = adsFlags2;
            AdsFlags adsFlags3 = new AdsFlags("HIDE_FULLSCREEN_AD_BANNER", 2, 2);
            HIDE_FULLSCREEN_AD_BANNER = adsFlags3;
            AdsFlags[] adsFlagsArr = {adsFlags, adsFlags2, adsFlags3};
            $VALUES = adsFlagsArr;
            $ENTRIES = new asp(adsFlagsArr);
        }

        public AdsFlags(String str, int i, int i2) {
            this.value = i2;
        }

        public static AdsFlags valueOf(String str) {
            return (AdsFlags) Enum.valueOf(AdsFlags.class, str);
        }

        public static AdsFlags[] values() {
            return (AdsFlags[]) $VALUES.clone();
        }

        public final int h() {
            return this.value;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClipsAdsFeaturesParams> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipsAdsFeaturesParams a(Serializer serializer) {
            return new ClipsAdsFeaturesParams(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipsAdsFeaturesParams[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClipsAdsFeaturesParams(List<String> list, List<? extends AdsFlags> list2, String str) {
        this.b = list;
        this.c = list2;
        this.d = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.l0(this.b);
        List<AdsFlags> list = this.c;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((AdsFlags) it.next()).h()));
        }
        serializer.U(arrayList);
        serializer.j0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsAdsFeaturesParams)) {
            return false;
        }
        ClipsAdsFeaturesParams clipsAdsFeaturesParams = (ClipsAdsFeaturesParams) obj;
        return epx.f(this.b, clipsAdsFeaturesParams.b) && epx.f(this.c, clipsAdsFeaturesParams.c) && epx.f(this.d, clipsAdsFeaturesParams.d);
    }

    public final int hashCode() {
        int a2 = fw3.a(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsAdsFeaturesParams(wbItemIds=");
        sb.append(this.b);
        sb.append(", adsFlags=");
        sb.append(this.c);
        sb.append(", articles=");
        return ho8.a(sb, this.d, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClipsAdsFeaturesParams(Serializer serializer) {
        this(r0, r2, serializer.H());
        ArrayList a2 = com.vk.core.serialize.a.a(serializer);
        int[] c = serializer.c();
        List<Integer> s0 = c != null ? rl3.s0(c) : null;
        List<Integer> list = s0 == null ? EmptyList.b : s0;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            AdsFlags adsFlags = AdsFlags.HIDE_CLOSING_AD_BANNER;
            if (intValue != adsFlags.h()) {
                adsFlags = AdsFlags.HIDE_FULLSCREEN_AD_BANNER;
                if (intValue != adsFlags.h()) {
                    adsFlags = AdsFlags.UNKNOWN;
                }
            }
            arrayList.add(adsFlags);
        }
    }
}
