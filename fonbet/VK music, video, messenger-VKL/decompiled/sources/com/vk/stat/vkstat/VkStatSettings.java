package com.vk.stat.vkstat;

import xsna.pmi0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: VkStatSettings.kt */
/* loaded from: classes5.dex */
public final class VkStatSettings {
    public final int a;

    @pmi0("batch_size")
    private final int drainBatchSize;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkStatSettings() {
        this(r2, r2, 3, null);
        int i = 0;
    }

    public final int a() {
        return this.drainBatchSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkStatSettings)) {
            return false;
        }
        VkStatSettings vkStatSettings = (VkStatSettings) obj;
        return this.drainBatchSize == vkStatSettings.drainBatchSize && this.a == vkStatSettings.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a) + (Integer.hashCode(this.drainBatchSize) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkStatSettings(drainBatchSize=");
        sb.append(this.drainBatchSize);
        sb.append(", sendBatchSize=");
        return vu5.b(sb, this.a, ')');
    }

    public VkStatSettings(int i, int i2) {
        this.drainBatchSize = i;
        this.a = i2;
        if (i <= 0) {
            throw new IllegalArgumentException("batchSize must be > 0");
        }
    }

    public /* synthetic */ VkStatSettings(int i, int i2, int i3, zcl zclVar) {
        this((i3 & 1) != 0 ? Integer.MAX_VALUE : i, (i3 & 2) != 0 ? 5000 : i2);
    }
}
