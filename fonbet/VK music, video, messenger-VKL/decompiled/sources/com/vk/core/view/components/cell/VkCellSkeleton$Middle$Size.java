package com.vk.core.view.components.cell;

import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import xsna.asp;
import xsna.imi0;
import xsna.msy;
import xsna.tqf0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkCellSkeleton.kt */
@imi0
/* loaded from: classes17.dex */
public final class VkCellSkeleton$Middle$Size {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkCellSkeleton$Middle$Size[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final a Companion;
    public static final VkCellSkeleton$Middle$Size Large;
    public static final VkCellSkeleton$Middle$Size Medium;
    public static final VkCellSkeleton$Middle$Size Small;

    /* compiled from: VkCellSkeleton.kt */
    public static final class a {
        public final KSerializer<VkCellSkeleton$Middle$Size> serializer() {
            return (KSerializer) VkCellSkeleton$Middle$Size.$cachedSerializer$delegate.getValue();
        }
    }

    static {
        VkCellSkeleton$Middle$Size vkCellSkeleton$Middle$Size = new VkCellSkeleton$Middle$Size("Small", 0);
        Small = vkCellSkeleton$Middle$Size;
        VkCellSkeleton$Middle$Size vkCellSkeleton$Middle$Size2 = new VkCellSkeleton$Middle$Size("Medium", 1);
        Medium = vkCellSkeleton$Middle$Size2;
        VkCellSkeleton$Middle$Size vkCellSkeleton$Middle$Size3 = new VkCellSkeleton$Middle$Size("Large", 2);
        Large = vkCellSkeleton$Middle$Size3;
        VkCellSkeleton$Middle$Size[] vkCellSkeleton$Middle$SizeArr = {vkCellSkeleton$Middle$Size, vkCellSkeleton$Middle$Size2, vkCellSkeleton$Middle$Size3};
        $VALUES = vkCellSkeleton$Middle$SizeArr;
        $ENTRIES = new asp(vkCellSkeleton$Middle$SizeArr);
        Companion = new a();
        $cachedSerializer$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new tqf0(13));
    }

    public VkCellSkeleton$Middle$Size() {
        throw null;
    }

    public static VkCellSkeleton$Middle$Size valueOf(String str) {
        return (VkCellSkeleton$Middle$Size) Enum.valueOf(VkCellSkeleton$Middle$Size.class, str);
    }

    public static VkCellSkeleton$Middle$Size[] values() {
        return (VkCellSkeleton$Middle$Size[]) $VALUES.clone();
    }
}
