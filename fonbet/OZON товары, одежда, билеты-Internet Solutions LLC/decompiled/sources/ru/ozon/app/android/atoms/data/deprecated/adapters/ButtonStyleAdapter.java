package ru.ozon.app.android.atoms.data.deprecated.adapters;

import com.squareup.moshi.C;
import com.squareup.moshi.h;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.deprecated.Button;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/adapters/ButtonStyleAdapter;", "", "<init>", "()V", "toJson", "", "style", "Lru/ozon/uni/atoms/data/deprecated/Button$Style;", "fromJson", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ButtonStyleAdapter {
    @h
    @NotNull
    public final Button.Style fromJson(@NotNull String style) {
        Button.Style style2;
        Intrinsics.checkNotNullParameter(style, "style");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = style.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Button.Style[] values = Button.Style.values();
        int length = values.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                style2 = null;
                break;
            }
            style2 = values[i11];
            String key = style2.getKey();
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
            String lowerCase2 = key.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (Intrinsics.d(lowerCase2, lowerCase)) {
                break;
            }
            i11++;
        }
        return style2 == null ? Button.INSTANCE.getDefaultStyle() : style2;
    }

    @C
    @NotNull
    public final String toJson(@NotNull Button.Style style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return style.getKey();
    }
}
