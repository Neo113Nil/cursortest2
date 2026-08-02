package ru.ozon.app.android.abtool.presentation.features.recycler;

import android.text.Html;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0000¨\u0006\u0007"}, d2 = {"parseHtml", "", "", "onError", "Lkotlin/Function1;", "", "", "abzone_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AbToggleAdapterKt {
    @NotNull
    public static final CharSequence parseHtml(@NotNull String str, Function1<? super Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Html.fromHtml(str, 0);
        } catch (Exception e11) {
            if (function1 != null) {
                function1.invoke(e11);
            }
            return str;
        }
    }

    public static /* synthetic */ CharSequence parseHtml$default(String str, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function1 = null;
        }
        return parseHtml(str, function1);
    }
}
