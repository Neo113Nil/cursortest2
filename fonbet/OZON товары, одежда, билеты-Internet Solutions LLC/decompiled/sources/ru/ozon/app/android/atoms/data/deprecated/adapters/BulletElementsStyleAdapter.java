package ru.ozon.app.android.atoms.data.deprecated.adapters;

import com.squareup.moshi.C;
import com.squareup.moshi.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.deprecated.BulletElements;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/adapters/BulletElementsStyleAdapter;", "", "<init>", "()V", "toJson", "", "style", "Lru/ozon/app/android/atoms/data/deprecated/BulletElements$BulletStyle;", "fromJson", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BulletElementsStyleAdapter {
    @h
    @NotNull
    public final BulletElements.BulletStyle fromJson(@NotNull String style) {
        BulletElements.BulletStyle bulletStyle;
        Intrinsics.checkNotNullParameter(style, "style");
        BulletElements.BulletStyle[] values = BulletElements.BulletStyle.values();
        int length = values.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                bulletStyle = null;
                break;
            }
            bulletStyle = values[i11];
            if (Intrinsics.d(bulletStyle.getKey(), style)) {
                break;
            }
            i11++;
        }
        return bulletStyle == null ? BulletElements.BulletStyle.MEDIUM : bulletStyle;
    }

    @C
    @NotNull
    public final String toJson(@NotNull BulletElements.BulletStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return style.getKey();
    }
}
