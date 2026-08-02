package ru.ozon.app.android.pikazon.retry.utils;

import Dg0.d;
import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.retry.OnConnectionRestored;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDg0/d$b;", "Lru/ozon/app/android/pikazon/retry/OnConnectionRestored;", "asOnConnectionRestored", "(LDg0/d$b;)Lru/ozon/app/android/pikazon/retry/OnConnectionRestored;", "lib_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ConnectionRestoredPoliciesKt {
    @NotNull
    public static final OnConnectionRestored asOnConnectionRestored(@NotNull d.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (bVar instanceof d.b.a) {
            return OnConnectionRestored.DoNothing.INSTANCE;
        }
        if (bVar instanceof d.b.C0141b) {
            return new OnConnectionRestored.Retry(((d.b.C0141b) bVar).getCount());
        }
        throw new o();
    }
}
