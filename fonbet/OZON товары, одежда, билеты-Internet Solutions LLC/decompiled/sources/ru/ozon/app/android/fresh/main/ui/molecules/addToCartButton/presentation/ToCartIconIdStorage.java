package ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/presentation/ToCartIconIdStorage;", "", "<init>", "()V", "", "drawableName", "", "resID", "", "putID", "(Ljava/lang/String;I)V", "getIcon", "(Ljava/lang/String;)Ljava/lang/Integer;", "", "storage", "Ljava/util/Map;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ToCartIconIdStorage {

    @NotNull
    public static final ToCartIconIdStorage INSTANCE = new ToCartIconIdStorage();

    @NotNull
    private static final Map<String, Integer> storage = new LinkedHashMap();

    private ToCartIconIdStorage() {
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
