package ru.ozon.app.android.regulardraw.miniapp;

import BZ.a;
import CZ.c;
import CZ.f;
import CZ.g;
import EZ.e;
import Sc.k;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/regulardraw/miniapp/RegularDrawAppHandler;", "LBZ/a;", "<init>", "()V", "", "miniAppName", "", "canSwitchApp", "(Ljava/lang/String;)Z", "Landroid/content/Context;", "context", "LEZ/e;", "LCZ/g;", "response", "isSaved", "LCZ/c;", "getMiniAppDestination", "(Landroid/content/Context;Ljava/lang/String;LEZ/e;Z)LCZ/c;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RegularDrawAppHandler implements a {
    @Override // BZ.a
    public boolean canSwitchApp(@NotNull String miniAppName) {
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        return Intrinsics.d(miniAppName, "regularDraw");
    }

    @Override // BZ.a
    @NotNull
    public c getMiniAppDestination(@NotNull Context context, @NotNull String miniAppName, @NotNull e<g> response, boolean isSaved) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        Intrinsics.checkNotNullParameter(response, "response");
        return f.b(this, miniAppName, k.b(new RegularDrawAppHandler$getMiniAppDestination$1(miniAppName)), response.b().b(), false, 8);
    }
}
