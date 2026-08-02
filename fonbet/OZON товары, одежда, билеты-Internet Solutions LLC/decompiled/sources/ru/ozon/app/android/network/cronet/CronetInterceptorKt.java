package ru.ozon.app.android.network.cronet;

import We.B;
import We.E;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWe/E;", "", "hasCronetInterceptor", "(LWe/E;)Z", "network_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CronetInterceptorKt {
    public static final boolean hasCronetInterceptor(@NotNull E e11) {
        Object obj;
        Intrinsics.checkNotNullParameter(e11, "<this>");
        Iterator<T> it = e11.u().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((B) obj) instanceof CronetInterceptor) {
                break;
            }
        }
        return obj != null;
    }
}
