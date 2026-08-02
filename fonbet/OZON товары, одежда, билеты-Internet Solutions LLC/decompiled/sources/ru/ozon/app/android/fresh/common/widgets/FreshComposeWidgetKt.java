package ru.ozon.app.android.fresh.common.widgets;

import d00.C6018d;
import d00.C6020f;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.compose.widget.k;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "S", "", "widgetName", "", "version", "Lkotlin/Function1;", "Ld00/d;", "", "init", "Ln20/i;", "FreshComposeWidget", "(Ljava/lang/String;[JLkotlin/jvm/functions/Function1;)Ln20/i;", "widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FreshComposeWidgetKt {
    @NotNull
    public static final <S> i FreshComposeWidget(@NotNull String widgetName, @NotNull long[] version, @NotNull Function1<? super C6018d<S>, Unit> init) {
        Intrinsics.checkNotNullParameter(widgetName, "widgetName");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(init, "init");
        return C6020f.a("express", widgetName, k.a(Arrays.copyOf(version, version.length)), init);
    }

    public static /* synthetic */ i FreshComposeWidget$default(String str, long[] jArr, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            jArr = new long[]{1};
        }
        return FreshComposeWidget(str, jArr, function1);
    }
}
