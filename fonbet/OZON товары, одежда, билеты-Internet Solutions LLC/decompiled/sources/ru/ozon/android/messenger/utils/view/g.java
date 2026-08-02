package ru.ozon.android.messenger.utils.view;

import android.content.Context;
import android.util.Patterns;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.button.Icon;

/* loaded from: classes10.dex */
public final class g {
    public static final void a(@NotNull LinearLayout linearLayout, @NotNull List<Icon> icons, @NotNull d.a networkConfig, int i11, int i12, Integer num) {
        Intrinsics.checkNotNullParameter(linearLayout, "<this>");
        Intrinsics.checkNotNullParameter(icons, "icons");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        linearLayout.removeAllViews();
        int i13 = 0;
        for (Object obj : icons) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C7714v.O0();
                throw null;
            }
            Icon icon = (Icon) obj;
            AppCompatImageView appCompatImageView = new AppCompatImageView(linearLayout.getContext());
            appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i12, i12);
            if (i13 != C7714v.P(icons)) {
                layoutParams.setMarginEnd(i11);
            }
            appCompatImageView.setLayoutParams(layoutParams);
            String tintColor = icon.getTintColor();
            if (tintColor != null) {
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context = appCompatImageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Integer parseColor = styleParser.parseColor(context, tintColor);
                if (parseColor == null) {
                    parseColor = num;
                }
                ru.ozon.android.messenger.utils.image.c.b(appCompatImageView, icon, parseColor, networkConfig);
            } else {
                ru.ozon.android.messenger.utils.image.c.b(appCompatImageView, icon, null, networkConfig);
            }
            String image = icon.getImage();
            Intrinsics.checkNotNullParameter(image, "<this>");
            if (!Patterns.WEB_URL.matcher(image).matches()) {
                Context context2 = appCompatImageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                String name = icon.getImage();
                Intrinsics.checkNotNullParameter(context2, "<this>");
                Intrinsics.checkNotNullParameter(name, "name");
                int identifier = context2.getResources().getIdentifier(name, "drawable", context2.getPackageName());
                Integer valueOf = identifier != 0 ? Integer.valueOf(identifier) : null;
                if (valueOf != null) {
                    appCompatImageView.setId(valueOf.intValue());
                } else {
                    i13 = i14;
                }
            }
            linearLayout.addView(appCompatImageView);
            i13 = i14;
        }
        linearLayout.requestLayout();
    }
}
