package ru.ozon.app.android.product.addToCart.presentation;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/ToCartIconColorStorage;", "", "<init>", "()V", "", "colorName", "", "color", "", "putColor", "(Ljava/lang/String;I)V", "Landroid/content/Context;", "context", "getColor", "(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/Integer;", "", "storage", "Ljava/util/Map;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ToCartIconColorStorage {

    @NotNull
    public static final ToCartIconColorStorage INSTANCE = new ToCartIconColorStorage();

    @NotNull
    private static final Map<String, Integer> storage = new LinkedHashMap();

    private ToCartIconColorStorage() {
    }

    public final Integer getColor(String colorName, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (colorName == null) {
            return null;
        }
        try {
            Integer num = storage.get(colorName);
            if (num != null) {
                return num;
            }
            Integer parseColor = StyleParser.INSTANCE.parseColor(context, colorName);
            if (parseColor == null) {
                return null;
            }
            putColor(colorName, parseColor.intValue());
            return parseColor;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void putColor(@NotNull String colorName, int color) {
        Intrinsics.checkNotNullParameter(colorName, "colorName");
        Map<String, Integer> map = storage;
        if (map.size() >= 6) {
            map.clear();
        }
        map.put(colorName, Integer.valueOf(color));
    }
}
