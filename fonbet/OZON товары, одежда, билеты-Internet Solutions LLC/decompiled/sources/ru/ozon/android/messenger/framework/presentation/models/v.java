package ru.ozon.android.messenger.framework.presentation.models;

import Sc.r;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class v {
    @NotNull
    public static final c a(@NotNull u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return uVar.c().getBlockId();
    }

    public static final <T extends g> T b(@NotNull u uVar) {
        Object a11;
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        try {
            r.Companion companion = Sc.r.INSTANCE;
            Intrinsics.checkNotNullParameter(uVar, "<this>");
            a11 = uVar.c();
            Intrinsics.g(a11, "null cannot be cast to non-null type T of ru.ozon.android.messenger.framework.presentation.models.MessengerVOKt.getBlockTyped");
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        if (a11 instanceof r.b) {
            a11 = null;
        }
        return (T) a11;
    }

    @NotNull
    public static final q c(@NotNull u uVar, @NotNull p itemInfo) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        return new q(C7714v.a0(uVar), itemInfo);
    }

    @NotNull
    public static final q d(@NotNull u uVar, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Intrinsics.checkNotNullParameter(id2, "id");
        return c(uVar, new p(id2, 4));
    }
}
