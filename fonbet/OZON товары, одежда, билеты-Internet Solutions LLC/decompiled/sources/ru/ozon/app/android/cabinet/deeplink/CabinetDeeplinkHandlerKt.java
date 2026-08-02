package ru.ozon.app.android.cabinet.deeplink;

import QZ.g;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cabinet.biometry.BiometryStateConfigurator;
import ru.ozon.app.android.payment.ui.configurators.AvailableNativePaymentInterceptor;
import ru.ozon.app.android.ui.session.configurators.auth.AuthPostDataConfigurator;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "Ljava/lang/Class;", "LQZ/g;", "getAuthStateConfigurators", "()Ljava/util/Set;", "cabinet_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CabinetDeeplinkHandlerKt {
    @NotNull
    public static final Set<Class<? extends g>> getAuthStateConfigurators() {
        Class[] elements = {AuthPostDataConfigurator.class, BiometryStateConfigurator.class, AvailableNativePaymentInterceptor.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
