package ru.ozon.android.messenger.framework.domain.usecases;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.domain.f;

/* renamed from: ru.ozon.android.messenger.framework.domain.usecases.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9396m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f89101a;

    public C9396m(@NotNull ru.ozon.android.messenger.framework.domain.repository.b repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f89101a = repository;
    }

    @NotNull
    public final ArrayList a(@NotNull Pair... blockParams) {
        Intrinsics.checkNotNullParameter(blockParams, "blockParams");
        ArrayList arrayList = new ArrayList(blockParams.length);
        for (Pair pair : blockParams) {
            arrayList.add(this.f89101a.z((f.b) pair.e(), pair.f()));
        }
        return arrayList;
    }
}
