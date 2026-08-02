package ru.ozon.android.messenger.framework.composer.navigation.config;

import i10.h;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.screen.e;

/* loaded from: classes10.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Set<b> f86718a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final HashMap<a, b> f86719b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull Set<? extends b> providers) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        this.f86718a = providers;
        this.f86719b = new HashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.composer.navigation.config.b
    @NotNull
    public final e a(@NotNull a page) {
        b bVar;
        Intrinsics.checkNotNullParameter(page, "page");
        HashMap<a, b> hashMap = this.f86719b;
        b bVar2 = hashMap.get(page);
        if (bVar2 == null) {
            Iterator it = this.f86718a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar = 0;
                    break;
                }
                bVar = it.next();
                if (((b) bVar).b(page)) {
                    break;
                }
            }
            bVar2 = bVar;
            if (bVar2 != null) {
                hashMap.put(page, bVar2);
            } else {
                bVar2 = null;
            }
        }
        return bVar2 != null ? bVar2.a(page) : new e(new h.c.a(page.b(), (String) null, (String) null, 14), null, null, null, 0, null, 32766);
    }

    @Override // ru.ozon.android.messenger.framework.composer.navigation.config.b
    public final boolean b(@NotNull a page) {
        Intrinsics.checkNotNullParameter(page, "page");
        Set<b> set = this.f86718a;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (((b) it.next()).b(page)) {
                return true;
            }
        }
        return false;
    }
}
