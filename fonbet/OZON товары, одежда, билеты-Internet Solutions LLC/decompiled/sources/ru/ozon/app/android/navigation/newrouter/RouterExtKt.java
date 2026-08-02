package ru.ozon.app.android.navigation.newrouter;

import GZ.g;
import LZ.a;
import Sc.InterfaceC3999a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.LinkGenerator;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"LGZ/g;", "", "restartApp", "(LGZ/g;)V", "clearBackStack", "navigation_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RouterExtKt {
    @InterfaceC3999a
    public static final void clearBackStack(@NotNull g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        restartApp(gVar);
    }

    public static final void restartApp(@NotNull g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        String uri = LinkGenerator.INSTANCE.clearBackStack().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        gVar.c(new a(uri, 6, (Map) null), null);
    }
}
