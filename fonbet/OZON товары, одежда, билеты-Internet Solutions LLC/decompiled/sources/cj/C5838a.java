package cj;

import android.content.Context;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* renamed from: cj.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5838a {

    /* renamed from: a, reason: collision with root package name */
    private static Context f57190a;

    @NotNull
    public static final String a(int i11, @NotNull Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        Context context = f57190a;
        Intrinsics.f(context);
        String quantityString = context.getResources().getQuantityString(R.plurals.gallery_multiple_assets_limitation_title, i11, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    @NotNull
    public static final String b(int i11) {
        Context context = f57190a;
        Intrinsics.f(context);
        String string = context.getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public static final void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        f57190a = context;
    }
}
