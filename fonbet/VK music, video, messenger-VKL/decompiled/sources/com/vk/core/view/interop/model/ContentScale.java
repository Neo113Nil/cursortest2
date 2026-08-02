package com.vk.core.view.interop.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContentScale.kt */
/* loaded from: classes17.dex */
public final class ContentScale {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ContentScale[] $VALUES;
    public static final ContentScale Crop;
    public static final ContentScale FillBounds;
    public static final ContentScale FillHeight;
    public static final ContentScale FillWidth;
    public static final ContentScale Fit;
    public static final ContentScale Inside;
    public static final ContentScale None;

    /* compiled from: ContentScale.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContentScale.values().length];
            try {
                iArr[ContentScale.Crop.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentScale.Fit.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContentScale.FillHeight.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ContentScale.FillWidth.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ContentScale.Inside.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ContentScale.None.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ContentScale.FillBounds.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        ContentScale contentScale = new ContentScale("Crop", 0);
        Crop = contentScale;
        ContentScale contentScale2 = new ContentScale("Fit", 1);
        Fit = contentScale2;
        ContentScale contentScale3 = new ContentScale("FillHeight", 2);
        FillHeight = contentScale3;
        ContentScale contentScale4 = new ContentScale("FillWidth", 3);
        FillWidth = contentScale4;
        ContentScale contentScale5 = new ContentScale("Inside", 4);
        Inside = contentScale5;
        ContentScale contentScale6 = new ContentScale("None", 5);
        None = contentScale6;
        ContentScale contentScale7 = new ContentScale("FillBounds", 6);
        FillBounds = contentScale7;
        ContentScale[] contentScaleArr = {contentScale, contentScale2, contentScale3, contentScale4, contentScale5, contentScale6, contentScale7};
        $VALUES = contentScaleArr;
        $ENTRIES = new asp(contentScaleArr);
    }

    public ContentScale() {
        throw null;
    }

    public static ContentScale valueOf(String str) {
        return (ContentScale) Enum.valueOf(ContentScale.class, str);
    }

    public static ContentScale[] values() {
        return (ContentScale[]) $VALUES.clone();
    }
}
