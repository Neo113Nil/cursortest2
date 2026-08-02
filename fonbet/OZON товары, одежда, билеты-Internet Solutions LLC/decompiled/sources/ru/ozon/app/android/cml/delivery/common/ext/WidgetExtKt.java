package ru.ozon.app.android.cml.delivery.common.ext;

import T00.a;
import T00.e;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.navigation.DeeplinkUtils;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u001c\u0010\u0005\u001a\u00020\u0002*\u00060\u0000j\u0002`\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001c\u0010\u0007\u001a\u00020\u0006*\u00060\u0000j\u0002`\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "getWidgetId", "(Ll20/d;)J", "widgetId", "", "isEditMode", "(Ll20/d;)Z", "delivery_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WidgetExtKt {
    public static final long getWidgetId(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return dVar.d().hashCode();
    }

    public static final boolean isEditMode(@NotNull d dVar) {
        e h11;
        String j11;
        Uri parse;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        a b11 = dVar.b();
        return (b11 == null || (h11 = b11.h()) == null || (j11 = h11.j()) == null || (parse = Uri.parse(j11)) == null || !DeeplinkUtils.INSTANCE.isEditMode(parse)) ? false : true;
    }
}
