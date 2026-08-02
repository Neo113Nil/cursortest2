package ru.ozon.app.android.composer.navigations;

import GZ.j;
import KZ.d;
import android.content.Context;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerScreenContainer;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/composer/navigations/ComposerRedirectInterceptor;", "LKZ/d;", "<init>", "()V", "LpZ/f;", "destination", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canIntercept", "(LpZ/f;LGZ/j;)Z", "Landroid/content/Context;", "context", "intercept", "(Landroid/content/Context;LpZ/f;LGZ/j;)LpZ/f;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerRedirectInterceptor implements d {
    @Override // KZ.d
    public boolean canIntercept(@NotNull f destination, @NotNull j route) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(route, "route");
        return destination instanceof ComposerScreenContainer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // KZ.b
    @NotNull
    public f intercept(@NotNull Context context, @NotNull f destination, @NotNull j route) {
        Object obj;
        String obj2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(route, "route");
        if (destination instanceof ComposerScreenContainer) {
            h.c pageRef = ((ComposerScreenContainer) destination).getScreenConfig().getPageRef();
            if ((pageRef instanceof h.c.a) && (obj = route.e().get("redirectKey")) != null && (obj2 = obj.toString()) != null) {
                if (kotlin.text.h.K(obj2)) {
                    obj2 = null;
                }
                if (obj2 != null) {
                    ((h.c.a) pageRef).a(obj2);
                }
            }
        }
        return destination;
    }
}
