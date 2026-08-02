package com.unity3d.ads.core.data.model;

import com.ironsource.U3;
import com.ironsource.mediationsdk.j;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;", "", "<init>", "(Ljava/lang/String;I)V", j.a, "MREC", "INTERSTITIAL", "REWARDED", "NATIVE", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdRevenueAdFormat {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ AdRevenueAdFormat[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final AdRevenueAdFormat BANNER = new AdRevenueAdFormat(j.a, 0);
    public static final AdRevenueAdFormat MREC = new AdRevenueAdFormat("MREC", 1);
    public static final AdRevenueAdFormat INTERSTITIAL = new AdRevenueAdFormat("INTERSTITIAL", 2);
    public static final AdRevenueAdFormat REWARDED = new AdRevenueAdFormat("REWARDED", 3);
    public static final AdRevenueAdFormat NATIVE = new AdRevenueAdFormat("NATIVE", 4);

    private static final /* synthetic */ AdRevenueAdFormat[] $values() {
        return new AdRevenueAdFormat[]{BANNER, MREC, INTERSTITIAL, REWARDED, NATIVE};
    }

    static {
        AdRevenueAdFormat[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
    }

    private AdRevenueAdFormat(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static AdRevenueAdFormat valueOf(String str) {
        return (AdRevenueAdFormat) Enum.valueOf(AdRevenueAdFormat.class, str);
    }

    public static AdRevenueAdFormat[] values() {
        return (AdRevenueAdFormat[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat$Companion;", "", "<init>", "()V", "fromString", "Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;", U3.i.X, "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final AdRevenueAdFormat fromString(@Nullable String value) {
            Object u2gVar;
            if (value == null) {
                return null;
            }
            try {
                p2g p2gVar = w2g.b;
                String upperCase = value.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                u2gVar = AdRevenueAdFormat.valueOf(upperCase);
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            return (AdRevenueAdFormat) (u2gVar instanceof u2g ? null : u2gVar);
        }

        private Companion() {
        }
    }
}
