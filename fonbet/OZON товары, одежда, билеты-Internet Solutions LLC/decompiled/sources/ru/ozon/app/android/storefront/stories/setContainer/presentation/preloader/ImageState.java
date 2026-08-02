package ru.ozon.app.android.storefront.stories.setContainer.presentation.preloader;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/stories/setContainer/presentation/preloader/ImageState;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "LOADING", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ImageState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ImageState[] $VALUES;
    public static final ImageState SUCCESS = new ImageState("SUCCESS", 0);
    public static final ImageState LOADING = new ImageState("LOADING", 1);

    private static final /* synthetic */ ImageState[] $values() {
        return new ImageState[]{SUCCESS, LOADING};
    }

    static {
        ImageState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ImageState(String str, int i11) {
    }

    public static ImageState valueOf(String str) {
        return (ImageState) Enum.valueOf(ImageState.class, str);
    }

    public static ImageState[] values() {
        return (ImageState[]) $VALUES.clone();
    }
}
