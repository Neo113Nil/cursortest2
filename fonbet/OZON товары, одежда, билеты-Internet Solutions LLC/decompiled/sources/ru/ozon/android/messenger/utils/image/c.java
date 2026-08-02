package ru.ozon.android.messenger.utils.image;

import android.content.Context;
import android.util.Patterns;
import android.widget.ImageView;
import j.C7232a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.android.messenger.framework.presentation.models.n;
import ru.ozon.android.messenger.utils.n;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.button.Icon;

/* loaded from: classes10.dex */
public final class c {
    public static final void a(@NotNull ImageView imageView, String str, @NotNull d.a networkConfig) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        ImageViewExtKt.load$default(imageView, str != null ? n.b(str, networkConfig.a(), networkConfig.b()) : null, null, null, null, null, false, null, 126, null);
    }

    public static final void b(@NotNull ImageView imageView, Icon icon, Integer num, @NotNull d.a networkConfig) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        if (icon == null) {
            return;
        }
        String image = icon.getImage();
        Intrinsics.checkNotNullParameter(image, "<this>");
        if (Patterns.WEB_URL.matcher(image).matches()) {
            a(imageView, icon.getImage(), networkConfig);
        } else {
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            String name = icon.getImage();
            Intrinsics.checkNotNullParameter(context, "<this>");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(context, "<this>");
            Intrinsics.checkNotNullParameter(name, "name");
            int identifier = context.getResources().getIdentifier(name, "drawable", context.getPackageName());
            imageView.setImageDrawable(identifier != 0 ? C7232a.a(context, identifier) : null);
        }
        if (num != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context2 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ThemeExtKt.tint(imageView, Integer.valueOf(styleParser.parseColor(context2, icon.getTintColor(), num.intValue())));
            return;
        }
        StyleParser styleParser2 = StyleParser.INSTANCE;
        Context context3 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        ThemeExtKt.tint(imageView, styleParser2.parseColor(context3, icon.getTintColor()));
    }

    public static void c(ImageView imageView, Icon icon, d.a networkConfig) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        if (icon == null) {
            s.a(imageView);
        } else {
            s.d(imageView);
            b(imageView, icon, null, networkConfig);
        }
    }

    public static final void d(@NotNull ImageView imageView, ru.ozon.android.messenger.framework.presentation.models.n nVar, @NotNull d.a networkConfig) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        if (nVar instanceof n.a) {
            imageView.setImageResource(((n.a) nVar).a());
        } else if (nVar instanceof n.b) {
            a(imageView, ((n.b) nVar).a(), networkConfig);
        }
    }
}
