package ru.ozon.app.android.session.deeplinks;

import B0.C2454a;
import C.J;
import GZ.j;
import IZ.a;
import android.content.Context;
import android.net.Uri;
import i10.h;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import qZ.C9010b;
import qZ.InterfaceC9013e;
import qZ.InterfaceC9014f;
import ru.ozon.app.android.cabinet.FlashCallConfigurator;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFlowDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.FlowTag;
import ru.ozon.app.android.ui.session.configurators.auth.AuthPostDataConfigurator;
import ru.ozon.app.android.ui.session.configurators.auth.smsretriever.SmsRetrieverConfigurator;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/session/deeplinks/OTPDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "", "Ljava/lang/Class;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "getOtpConfigurators", "()Ljava/util/Set;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OTPDeeplinkHandler implements a {
    private final Set<Class<? extends ComposerScreenConfig.PageConfigurator>> getOtpConfigurators() {
        Class[] elements = {SmsRetrieverConfigurator.class, FlashCallConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        if (Intrinsics.d(b11.getAuthority(), "my")) {
            List<String> pathSegments = b11.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            if (!pathSegments.isEmpty() && C2454a.h(b11, "otp", 0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r0 == r1) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // IZ.a
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f getDestination(@NotNull Context context, @NotNull j route) {
        FlowTag flowTag;
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        if (context instanceof InterfaceC9013e) {
            InterfaceC9014f screenFlowTag = ((InterfaceC9013e) context).getScreenFlowTag();
            flowTag = FlowTag.CHANGE_INFORMATION;
        }
        flowTag = FlowTag.AUTH;
        return new ComposerFlowDestination(new ComposerScreenConfig(new h.c.a(a11, (String) null, (String) null, 14), null, false, null, false, false, false, false, ComposerScreenConfig.RefreshByAuthConfig.Disabled.INSTANCE, false, false, false, getOtpConfigurators(), e0.h(AuthPostDataConfigurator.class), null, null, false, null, null, null, false, false, null, null, 16764606, null), a11, null, new C9010b(flowTag, 14), false, 20, null);
    }
}
