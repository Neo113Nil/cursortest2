package ru.ozon.app.android.returns.creation.deeplink.handlers;

import C.J;
import GZ.j;
import IZ.a;
import android.content.Context;
import i10.h;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/returns/creation/deeplink/handlers/BaseReturnCreationDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "Landroid/content/Context;", "context", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "configurators", "Ljava/util/Set;", "getConfigurators", "()Ljava/util/Set;", "", "backgroundColor", "I", "getBackgroundColor", "()I", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class BaseReturnCreationDeeplinkHandler implements a {

    @NotNull
    private final Set<Class<? extends ComposerScreenConfig.PageConfigurator>> configurators = M.f71699a;
    private final int backgroundColor = UniColors.LAYER_FLOOR_0.getResId();

    public abstract int getBackgroundColor();

    @NotNull
    public Set<Class<? extends ComposerScreenConfig.PageConfigurator>> getConfigurators() {
        return this.configurators;
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        return new ComposerFragmentDestination(new ComposerScreenConfig(new h.c.a(a11, (String) null, (String) null, 14), null, false, null, true, false, false, false, null, false, false, true, getConfigurators(), null, Integer.valueOf(getBackgroundColor()), null, false, null, null, 16, false, false, null, null, 16230286, null), a11, null, false, false, null, false, false, null, 508, null);
    }
}
