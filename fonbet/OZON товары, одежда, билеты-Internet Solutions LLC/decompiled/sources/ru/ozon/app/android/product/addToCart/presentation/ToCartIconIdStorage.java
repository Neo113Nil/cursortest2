package ru.ozon.app.android.product.addToCart.presentation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import j.C7232a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/ToCartIconIdStorage;", "", "<init>", "()V", "", "drawableName", "", "resID", "", "putID", "(Ljava/lang/String;I)V", "getIcon", "(Ljava/lang/String;)Ljava/lang/Integer;", "drawableId", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "getDrawable", "(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "", "storage", "Ljava/util/Map;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ToCartIconIdStorage {

    @NotNull
    public static final ToCartIconIdStorage INSTANCE = new ToCartIconIdStorage();

    @NotNull
    private static final Map<String, Integer> storage = new LinkedHashMap();

    private ToCartIconIdStorage() {
    }

    @SuppressLint({"DiscouragedApi"})
    public final Drawable getDrawable(String drawableId, @NotNull Context context) {
        int i11;
        Intrinsics.checkNotNullParameter(context, "context");
        if (drawableId == null) {
            return null;
        }
        try {
            Integer icon = getIcon(drawableId);
            if (icon != null) {
                i11 = icon.intValue();
            } else {
                int identifier = context.getResources().getIdentifier(drawableId, "drawable", context.getPackageName());
                if (identifier != 0) {
                    INSTANCE.putID(drawableId, identifier);
                }
                i11 = identifier;
            }
            if (i11 != 0) {
                return C7232a.a(context, i11);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final Integer getIcon(@NotNull String drawableName) {
        Intrinsics.checkNotNullParameter(drawableName, "drawableName");
        return storage.get(drawableName);
    }

    public final void putID(@NotNull String drawableName, int resID) {
        Intrinsics.checkNotNullParameter(drawableName, "drawableName");
        Map<String, Integer> map = storage;
        if (map.size() >= 40) {
            map.clear();
        }
        map.put(drawableName, Integer.valueOf(resID));
    }
}
