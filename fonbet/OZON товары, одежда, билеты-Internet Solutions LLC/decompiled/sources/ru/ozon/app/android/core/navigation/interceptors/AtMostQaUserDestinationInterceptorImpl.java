package ru.ozon.app.android.core.navigation.interceptors;

import GZ.j;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.navigation.interceptors.AtMostQaUserDestinationInterceptor;
import ru.ozon.app.android.navigation.interceptors.predicate.core.InterceptorMultiplePredicate;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/core/navigation/interceptors/AtMostQaUserDestinationInterceptorImpl;", "Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;", "Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorMultiplePredicate;", "atMostQaUserPredicate", "<init>", "(Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorMultiplePredicate;)V", "Landroid/content/Context;", "context", "LpZ/f;", "destination", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "intercept", "(Landroid/content/Context;LpZ/f;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorMultiplePredicate;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AtMostQaUserDestinationInterceptorImpl implements AtMostQaUserDestinationInterceptor {

    @NotNull
    private final InterceptorMultiplePredicate atMostQaUserPredicate;

    public AtMostQaUserDestinationInterceptorImpl(@NotNull InterceptorMultiplePredicate atMostQaUserPredicate) {
        Intrinsics.checkNotNullParameter(atMostQaUserPredicate, "atMostQaUserPredicate");
        this.atMostQaUserPredicate = atMostQaUserPredicate;
    }

    @Override // KZ.b
    @NotNull
    public f intercept(@NotNull Context context, @NotNull f destination, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(route, "route");
        if (this.atMostQaUserPredicate.invoke()) {
            return destination;
        }
        f.Companion.getClass();
        return f.b.a();
    }
}
