package ru.ozon.app.android.product.common.product;

import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/product/common/product/ImageTheme;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "THEME_TYPE_INVALID", "THEME_TYPE_WAVE", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ImageTheme {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ImageTheme[] $VALUES;

    @i(name = "THEME_TYPE_INVALID")
    public static final ImageTheme THEME_TYPE_INVALID = new ImageTheme("THEME_TYPE_INVALID", 0, "THEME_TYPE_INVALID");

    @i(name = "THEME_TYPE_WAVE")
    public static final ImageTheme THEME_TYPE_WAVE = new ImageTheme("THEME_TYPE_WAVE", 1, "THEME_TYPE_WAVE");

    @NotNull
    private final String key;

    private static final /* synthetic */ ImageTheme[] $values() {
        return new ImageTheme[]{THEME_TYPE_INVALID, THEME_TYPE_WAVE};
    }

    static {
        ImageTheme[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ImageTheme(String str, int i11, String str2) {
        this.key = str2;
    }

    public static ImageTheme valueOf(String str) {
        return (ImageTheme) Enum.valueOf(ImageTheme.class, str);
    }

    public static ImageTheme[] values() {
        return (ImageTheme[]) $VALUES.clone();
    }
}
