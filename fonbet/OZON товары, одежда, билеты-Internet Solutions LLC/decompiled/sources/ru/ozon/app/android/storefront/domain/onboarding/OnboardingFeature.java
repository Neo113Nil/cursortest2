package ru.ozon.app.android.storefront.domain.onboarding;

import G.g;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/domain/onboarding/OnboardingFeature;", "", "baseKey", "", "maxShowCount", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getMaxShowCount", "()I", "SRV_2_BADGE_ONBOARDING", "SEARCH_CATEGORY_HEADER_ONBOARDING", "SORT_AND_FILTER_IN_TAGS_ONBOARDING", "TILE_GRID_2_BADGE_ONBOARDING", "key", "id", "onboarding_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OnboardingFeature {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OnboardingFeature[] $VALUES;

    @NotNull
    private final String baseKey;
    private final int maxShowCount;
    public static final OnboardingFeature SRV_2_BADGE_ONBOARDING = new OnboardingFeature("SRV_2_BADGE_ONBOARDING", 0, "srv2_badge_onboarding", 3);
    public static final OnboardingFeature SEARCH_CATEGORY_HEADER_ONBOARDING = new OnboardingFeature("SEARCH_CATEGORY_HEADER_ONBOARDING", 1, "search_category_header_onboarding", 1);
    public static final OnboardingFeature SORT_AND_FILTER_IN_TAGS_ONBOARDING = new OnboardingFeature("SORT_AND_FILTER_IN_TAGS_ONBOARDING", 2, "sort_and_filter_in_tags_onboarding", 1);
    public static final OnboardingFeature TILE_GRID_2_BADGE_ONBOARDING = new OnboardingFeature("TILE_GRID_2_BADGE_ONBOARDING", 3, "tile_grid_2_badge_onboarding", 1);

    private static final /* synthetic */ OnboardingFeature[] $values() {
        return new OnboardingFeature[]{SRV_2_BADGE_ONBOARDING, SEARCH_CATEGORY_HEADER_ONBOARDING, SORT_AND_FILTER_IN_TAGS_ONBOARDING, TILE_GRID_2_BADGE_ONBOARDING};
    }

    static {
        OnboardingFeature[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OnboardingFeature(String str, int i11, String str2, int i12) {
        this.baseKey = str2;
        this.maxShowCount = i12;
    }

    public static /* synthetic */ String key$default(OnboardingFeature onboardingFeature, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: key");
        }
        if ((i11 & 1) != 0) {
            str = "";
        }
        return onboardingFeature.key(str);
    }

    public static OnboardingFeature valueOf(String str) {
        return (OnboardingFeature) Enum.valueOf(OnboardingFeature.class, str);
    }

    public static OnboardingFeature[] values() {
        return (OnboardingFeature[]) $VALUES.clone();
    }

    public final int getMaxShowCount() {
        return this.maxShowCount;
    }

    @NotNull
    public final String key(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return id2.length() == 0 ? this.baseKey : g.c(this.baseKey, "_", id2);
    }
}
