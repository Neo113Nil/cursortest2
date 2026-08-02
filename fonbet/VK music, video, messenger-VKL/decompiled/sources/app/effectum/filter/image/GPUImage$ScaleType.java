package app.effectum.filter.image;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class GPUImage$ScaleType {
    private static final /* synthetic */ GPUImage$ScaleType[] $VALUES;
    public static final GPUImage$ScaleType CENTER_CROP;
    public static final GPUImage$ScaleType CENTER_INSIDE;

    static {
        GPUImage$ScaleType gPUImage$ScaleType = new GPUImage$ScaleType("CENTER_INSIDE", 0);
        CENTER_INSIDE = gPUImage$ScaleType;
        GPUImage$ScaleType gPUImage$ScaleType2 = new GPUImage$ScaleType("CENTER_CROP", 1);
        CENTER_CROP = gPUImage$ScaleType2;
        $VALUES = new GPUImage$ScaleType[]{gPUImage$ScaleType, gPUImage$ScaleType2};
    }

    public GPUImage$ScaleType() {
        throw null;
    }

    public static GPUImage$ScaleType valueOf(String str) {
        return (GPUImage$ScaleType) Enum.valueOf(GPUImage$ScaleType.class, str);
    }

    public static GPUImage$ScaleType[] values() {
        return (GPUImage$ScaleType[]) $VALUES.clone();
    }
}
