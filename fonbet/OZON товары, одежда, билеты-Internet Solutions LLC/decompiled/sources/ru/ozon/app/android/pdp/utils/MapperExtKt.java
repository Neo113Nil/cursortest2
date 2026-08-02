package ru.ozon.app.android.pdp.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll20/d;", "", "widgetId", "(Ll20/d;)J", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MapperExtKt {
    public static final long widgetId(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return dVar.d().hashCode();
    }
}
