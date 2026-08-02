package ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0004"}, d2 = {"checkIconNameSame", "", "", "another", "common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconChooserViewModelKt {
    public static final boolean checkIconNameSame(@NotNull String str, @NotNull String another) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(another, "another");
        return Intrinsics.d(str, another) || Intrinsics.d(h.X(str, "_round", "", false), another);
    }
}
