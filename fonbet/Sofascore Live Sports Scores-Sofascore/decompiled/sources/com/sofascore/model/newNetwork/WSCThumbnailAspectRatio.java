package com.sofascore.model.newNetwork;

import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/sofascore/model/newNetwork/WSCThumbnailAspectRatio;", "", "ratio", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRatio", "()Ljava/lang/String;", "RATIO_DEFAULT", "RATIO_1X1", "RATIO_2X3", "RATIO_16X9", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WSCThumbnailAspectRatio {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ WSCThumbnailAspectRatio[] $VALUES;

    @NotNull
    private final String ratio;
    public static final WSCThumbnailAspectRatio RATIO_DEFAULT = new WSCThumbnailAspectRatio("RATIO_DEFAULT", 0, "");
    public static final WSCThumbnailAspectRatio RATIO_1X1 = new WSCThumbnailAspectRatio("RATIO_1X1", 1, "1x1");
    public static final WSCThumbnailAspectRatio RATIO_2X3 = new WSCThumbnailAspectRatio("RATIO_2X3", 2, "2x3");
    public static final WSCThumbnailAspectRatio RATIO_16X9 = new WSCThumbnailAspectRatio("RATIO_16X9", 3, "16x9");

    private static final /* synthetic */ WSCThumbnailAspectRatio[] $values() {
        return new WSCThumbnailAspectRatio[]{RATIO_DEFAULT, RATIO_1X1, RATIO_2X3, RATIO_16X9};
    }

    static {
        WSCThumbnailAspectRatio[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private WSCThumbnailAspectRatio(String str, int i, String str2) {
        this.ratio = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static WSCThumbnailAspectRatio valueOf(String str) {
        return (WSCThumbnailAspectRatio) Enum.valueOf(WSCThumbnailAspectRatio.class, str);
    }

    public static WSCThumbnailAspectRatio[] values() {
        return (WSCThumbnailAspectRatio[]) $VALUES.clone();
    }

    @NotNull
    public final String getRatio() {
        return this.ratio;
    }
}
