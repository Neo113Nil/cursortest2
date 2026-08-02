package com.vk.superapp.advertisement;

import com.vk.external.miniapp.net.ad.AdvertisementType;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.kq01;
import xsna.ms9;
import xsna.shy;

/* compiled from: AdSlots.kt */
/* loaded from: classes6.dex */
public final class a {
    public final List<C1856a> a;
    public final List<C1856a> b;
    public final List<C1856a> c;

    /* compiled from: AdSlots.kt */
    /* renamed from: com.vk.superapp.advertisement.a$a, reason: collision with other inner class name */
    public static final class C1856a {
        public final int a;
        public final int b;
        public final String c;

        public C1856a(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1856a)) {
                return false;
            }
            C1856a c1856a = (C1856a) obj;
            return this.a == c1856a.a && this.b == c1856a.b && epx.f(this.c, c1856a.c);
        }

        public final int hashCode() {
            int a = shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
            String str = this.c;
            return a + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SlotDescription(id=");
            sb.append(this.a);
            sb.append(", adSource=");
            sb.append((Object) kq01.s(this.b));
            sb.append(", tag=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: AdSlots.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdvertisementType.values().length];
            try {
                iArr[AdvertisementType.REWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvertisementType.MULTI_INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvertisementType.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(List<C1856a> list, List<C1856a> list2, List<C1856a> list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final List<C1856a> a(AdvertisementType advertisementType) {
        int i = b.$EnumSwitchMapping$0[advertisementType.ordinal()];
        if (i == 1) {
            return this.a;
        }
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return this.c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdSlots(rewardedSlots=");
        sb.append(this.a);
        sb.append(", multiInterstitialSlots=");
        sb.append(this.b);
        sb.append(", interstitialSlots=");
        return ms9.a(')', sb, this.c);
    }
}
