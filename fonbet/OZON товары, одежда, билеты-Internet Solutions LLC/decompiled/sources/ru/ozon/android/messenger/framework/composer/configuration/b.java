package ru.ozon.android.messenger.framework.composer.configuration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashSet<g> f86625a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final HashSet<d> f86626b = new HashSet<>();

    @Override // ru.ozon.android.messenger.framework.composer.configuration.a
    @NotNull
    public final Set<QZ.g> a() {
        HashSet<d> hashSet = this.f86626b;
        if (hashSet.isEmpty()) {
            hashSet = null;
        }
        if (hashSet != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = hashSet.iterator();
            while (it.hasNext()) {
                QZ.g create = ((d) it.next()).create();
                if (create != null) {
                    arrayList.add(create);
                }
            }
            Set<QZ.g> Y02 = C7714v.Y0(arrayList);
            if (Y02 != null) {
                return Y02;
            }
        }
        return M.f71699a;
    }

    @Override // ru.ozon.android.messenger.framework.composer.configuration.a
    @NotNull
    public final Set<f> b(@NotNull ru.ozon.android.messenger.framework.composer.screen.e screenConfig) {
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        HashSet<g> hashSet = this.f86625a;
        ArrayList arrayList = new ArrayList();
        Iterator<g> it = hashSet.iterator();
        while (it.hasNext()) {
            f create = it.next().create();
            if (create != null) {
                arrayList.add(create);
            }
        }
        return C7714v.Y0(arrayList);
    }
}
