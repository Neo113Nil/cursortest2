package ru.ozon.uni.android.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/android/util/FontScalingFeatureFlag;", "", "<init>", "()V", "isEnabled", "", "()Z", "setEnabled", "(Z)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FontScalingFeatureFlag {

    @NotNull
    public static final FontScalingFeatureFlag INSTANCE = new FontScalingFeatureFlag();
    private static boolean isEnabled = true;
    public static final int $stable = 8;

    private FontScalingFeatureFlag() {
    }

    public final boolean isEnabled() {
        return isEnabled;
    }

    public final void setEnabled(boolean z11) {
        isEnabled = z11;
    }
}
