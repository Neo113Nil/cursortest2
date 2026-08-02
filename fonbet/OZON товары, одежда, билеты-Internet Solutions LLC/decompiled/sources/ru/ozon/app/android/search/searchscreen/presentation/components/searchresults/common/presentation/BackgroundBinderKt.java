package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0000¨\u0006\t"}, d2 = {"bindBackground", "", "Landroid/view/View;", "backgroundImage", "Landroid/graphics/drawable/Drawable;", "backgroundColor", "", "defaultColor", "", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BackgroundBinderKt {
    public static final void bindBackground(@NotNull View view, Drawable drawable, String str, int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (drawable != null) {
            view.setBackground(drawable);
            return;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setBackgroundColor(styleParser.parseColorInt(context, str, i11));
    }
}
