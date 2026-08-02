package ru.ozon.debugMenu.internal.core.ui.utils;

import B0.A0;
import C1.i;
import D1.E0;
import I1.A;
import I1.D;
import I1.z;
import androidx.compose.ui.e;
import java.lang.Enum;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class a<T extends Enum<T>> extends e.c implements i, E0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final T f94897a;

    public a(@NotNull T tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f94897a = tag;
    }

    @Override // D1.E0
    public final void applySemantics(@NotNull D d11) {
        Intrinsics.checkNotNullParameter(d11, "<this>");
        if (getNode().isAttached()) {
            T t2 = this.f94897a;
            String simpleName = t2.getClass().getSimpleName();
            if (!h.A(simpleName, "TestTags", false)) {
                throw new IllegalArgumentException(A0.b("Имя класса ", t2.getClass().getName(), " должно заканчиваться на \"TestTags\"").toString());
            }
            z.t(d11, h.U(simpleName, "TestTags") + "." + t2.name());
            A.a(d11, true);
        }
    }

    @Override // D1.E0
    public final boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // D1.E0
    public final boolean getShouldMergeDescendantSemantics() {
        return false;
    }
}
