package ru.ozon.app.android.travel.utils;

import Ae.E0;
import Ae.w0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "LAe/w0;", "SingleEventsFlow", "()LAe/w0;", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FlowUtilsKt {
    @NotNull
    public static final <T> w0<T> SingleEventsFlow() {
        return E0.b(0, 1, EnumC11113a.DROP_OLDEST, 1);
    }
}
