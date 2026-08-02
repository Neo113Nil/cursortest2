package ru.ozon.fintech.features.camera.ui;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/fintech/features/camera/ui/DocFrameOrientation;", "", "<init>", "(Ljava/lang/String;I)V", "PORTRAIT", "LANDSCAPE", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DocFrameOrientation {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ DocFrameOrientation[] $VALUES;
    public static final DocFrameOrientation PORTRAIT = new DocFrameOrientation("PORTRAIT", 0);
    public static final DocFrameOrientation LANDSCAPE = new DocFrameOrientation("LANDSCAPE", 1);

    private static final /* synthetic */ DocFrameOrientation[] $values() {
        return new DocFrameOrientation[]{PORTRAIT, LANDSCAPE};
    }

    static {
        DocFrameOrientation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Xc.b.a($values);
    }

    private DocFrameOrientation(String str, int i11) {
    }

    @NotNull
    public static Xc.a<DocFrameOrientation> getEntries() {
        return $ENTRIES;
    }

    public static DocFrameOrientation valueOf(String str) {
        return (DocFrameOrientation) Enum.valueOf(DocFrameOrientation.class, str);
    }

    public static DocFrameOrientation[] values() {
        return (DocFrameOrientation[]) $VALUES.clone();
    }
}
