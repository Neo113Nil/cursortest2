package ru.ozon.app.android.limb2;

import GZ.j;
import KZ.c;
import Ld0.a;
import Od0.a;
import Od0.c;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/limb2/Limb2DeeplinkInterceptor;", "LKZ/c;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canIntercept", "(LGZ/j;)Z", "intercept", "(LGZ/j;)LGZ/j;", "Landroid/content/Context;", "LLd0/c;", "ozonLimbDiStore$delegate", "LSc/j;", "getOzonLimbDiStore", "()LLd0/c;", "ozonLimbDiStore", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Limb2DeeplinkInterceptor implements c {

    @NotNull
    private final Context context;

    /* renamed from: ozonLimbDiStore$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ozonLimbDiStore;

    public Limb2DeeplinkInterceptor(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.ozonLimbDiStore = k.b(new Limb2DeeplinkInterceptor$ozonLimbDiStore$2(this));
    }

    private final Ld0.c getOzonLimbDiStore() {
        return (Ld0.c) this.ozonLimbDiStore.getValue();
    }

    @Override // KZ.c
    public boolean canIntercept(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Context applicationContext = getOzonLimbDiStore().c().a().getApplicationContext();
        Uri uri = route.b();
        Intrinsics.checkNotNullParameter(uri, "uri");
        c.b bVar = new c.b(uri);
        a b11 = getOzonLimbDiStore().b();
        Intrinsics.f(applicationContext);
        return b11.b(bVar, applicationContext) instanceof a.C0408a;
    }

    @Override // KZ.a
    public j intercept(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return null;
    }
}
