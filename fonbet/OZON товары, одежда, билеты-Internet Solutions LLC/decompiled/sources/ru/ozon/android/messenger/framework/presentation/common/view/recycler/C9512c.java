package ru.ozon.android.messenger.framework.presentation.common.view.recycler;

import java.util.HashMap;
import java.util.List;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.ozon.android.messenger.framework.presentation.common.view.recycler.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9512c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashMap<Integer, List<q<ru.ozon.android.messenger.framework.presentation.models.g, X4.a>>> f91214a = new HashMap<>();

    public final q<ru.ozon.android.messenger.framework.presentation.models.g, X4.a> a(int i11) {
        List<q<ru.ozon.android.messenger.framework.presentation.models.g, X4.a>> list = this.f91214a.get(Integer.valueOf(i11));
        if (list != null) {
            return (q) C7714v.x0(list);
        }
        return null;
    }
}
