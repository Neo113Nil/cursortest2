package com.vk.superapp.vksteps.utils.enums;

import java.util.Iterator;
import java.util.Locale;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkStepsSyncDurationStrategy.kt */
/* loaded from: classes6.dex */
public final class VkStepsSyncDurationStrategy {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkStepsSyncDurationStrategy[] $VALUES;
    public static final a Companion;
    public static final VkStepsSyncDurationStrategy ONE_DAY;
    public static final VkStepsSyncDurationStrategy ONE_MINUTE;
    public static final VkStepsSyncDurationStrategy TEN_MINUTES;

    /* compiled from: VkStepsSyncDurationStrategy.kt */
    public static final class a {
        public static VkStepsSyncDurationStrategy a(String str) {
            Object obj;
            Iterator<E> it = VkStepsSyncDurationStrategy.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((VkStepsSyncDurationStrategy) obj).name().toLowerCase(Locale.ROOT).equals(str)) {
                    break;
                }
            }
            return (VkStepsSyncDurationStrategy) obj;
        }
    }

    static {
        VkStepsSyncDurationStrategy vkStepsSyncDurationStrategy = new VkStepsSyncDurationStrategy("ONE_MINUTE", 0);
        ONE_MINUTE = vkStepsSyncDurationStrategy;
        VkStepsSyncDurationStrategy vkStepsSyncDurationStrategy2 = new VkStepsSyncDurationStrategy("TEN_MINUTES", 1);
        TEN_MINUTES = vkStepsSyncDurationStrategy2;
        VkStepsSyncDurationStrategy vkStepsSyncDurationStrategy3 = new VkStepsSyncDurationStrategy("ONE_DAY", 2);
        ONE_DAY = vkStepsSyncDurationStrategy3;
        VkStepsSyncDurationStrategy[] vkStepsSyncDurationStrategyArr = {vkStepsSyncDurationStrategy, vkStepsSyncDurationStrategy2, vkStepsSyncDurationStrategy3};
        $VALUES = vkStepsSyncDurationStrategyArr;
        $ENTRIES = new asp(vkStepsSyncDurationStrategyArr);
        Companion = new a();
    }

    public VkStepsSyncDurationStrategy() {
        throw null;
    }

    public static zrp<VkStepsSyncDurationStrategy> h() {
        return $ENTRIES;
    }

    public static VkStepsSyncDurationStrategy valueOf(String str) {
        return (VkStepsSyncDurationStrategy) Enum.valueOf(VkStepsSyncDurationStrategy.class, str);
    }

    public static VkStepsSyncDurationStrategy[] values() {
        return (VkStepsSyncDurationStrategy[]) $VALUES.clone();
    }
}
