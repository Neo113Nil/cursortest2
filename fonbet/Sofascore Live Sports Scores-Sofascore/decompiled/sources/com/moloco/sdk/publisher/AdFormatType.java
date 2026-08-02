package com.moloco.sdk.publisher;

import com.ironsource.mediationsdk.j;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.tz9;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000e"}, d2 = {"Lcom/moloco/sdk/publisher/AdFormatType;", "", "<init>", "(Ljava/lang/String;I)V", j.a, "INTERSTITIAL", "REWARDED", "MREC", "NATIVE", "INLINE_ADAPTIVE_BANNER", "ANCHORED_ADAPTIVE_BANNER", "toLowercase", "", "toTitlecase", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdFormatType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ AdFormatType[] $VALUES;
    public static final AdFormatType BANNER = new AdFormatType(j.a, 0);
    public static final AdFormatType INTERSTITIAL = new AdFormatType("INTERSTITIAL", 1);
    public static final AdFormatType REWARDED = new AdFormatType("REWARDED", 2);
    public static final AdFormatType MREC = new AdFormatType("MREC", 3);
    public static final AdFormatType NATIVE = new AdFormatType("NATIVE", 4);
    public static final AdFormatType INLINE_ADAPTIVE_BANNER = new AdFormatType("INLINE_ADAPTIVE_BANNER", 5);
    public static final AdFormatType ANCHORED_ADAPTIVE_BANNER = new AdFormatType("ANCHORED_ADAPTIVE_BANNER", 6);

    private static final /* synthetic */ AdFormatType[] $values() {
        return new AdFormatType[]{BANNER, INTERSTITIAL, REWARDED, MREC, NATIVE, INLINE_ADAPTIVE_BANNER, ANCHORED_ADAPTIVE_BANNER};
    }

    static {
        AdFormatType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private AdFormatType(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static AdFormatType valueOf(String str) {
        return (AdFormatType) Enum.valueOf(AdFormatType.class, str);
    }

    public static AdFormatType[] values() {
        return (AdFormatType[]) $VALUES.clone();
    }

    @NotNull
    public final String toLowercase() {
        String lowerCase = toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    @NotNull
    public final String toTitlecase() {
        String lowercase = toLowercase();
        if (lowercase.length() <= 0) {
            return lowercase;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = lowercase.charAt(0);
        sb.append((Object) (Character.isLowerCase(charAt) ? tz9.Q(charAt) : String.valueOf(charAt)));
        sb.append(lowercase.substring(1));
        return sb.toString();
    }
}
