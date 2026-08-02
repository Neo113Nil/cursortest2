package ru.ozon.uni.atoms.extensions.view;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.view.atoms.badge.Badge;
import ru.ozon.uni.atoms.extensions.ExtensionsKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¨\u0006\u0007"}, d2 = {"setTintColor", "", "Lru/ozon/uni/android/uikit/view/atoms/badge/Badge;", "color", "", "image", "", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BadgeViewExtKt {
    public static final void setTintColor(@NotNull Badge badge, int i11, String str) {
        Intrinsics.checkNotNullParameter(badge, "<this>");
        badge.setTextTintColor(i11);
        if (str == null || !ExtensionsKt.isUrl(str)) {
            badge.setImageColorFilter(Integer.valueOf(i11));
        } else {
            badge.setImageColorFilter(null);
        }
    }
}
