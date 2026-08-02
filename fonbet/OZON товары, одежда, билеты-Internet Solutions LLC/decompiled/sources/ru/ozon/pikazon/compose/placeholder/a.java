package ru.ozon.pikazon.compose.placeholder;

import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderInfo;

/* loaded from: classes3.dex */
public final class a {
    @NotNull
    public static final e a(@NotNull e eVar, @NotNull Function1<? super PlaceholderInfo, Unit> callback) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return eVar.l0(new OnPlaceholderInfoChangedElement(callback));
    }
}
