package ru.ozon.debugMenu.internal.core.ui.utils;

import D1.AbstractC2794c0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5242e1;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0012\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004¨\u0006\u0006"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/utils/DebugMenuTestTagElement;", "", "", "T", "LD1/c0;", "Lru/ozon/debugMenu/internal/core/ui/utils/a;", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DebugMenuTestTagElement<T extends Enum<T>> extends AbstractC2794c0<a<T>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final T f94895a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<C5242e1, Unit> f94896b;

    /* JADX WARN: Multi-variable type inference failed */
    public DebugMenuTestTagElement(@NotNull T tag, @NotNull Function1<? super C5242e1, Unit> inspectorInfo) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f94895a = tag;
        this.f94896b = inspectorInfo;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final e.c getF41119a() {
        return new a(this.f94895a);
    }

    public final boolean equals(Object obj) {
        DebugMenuTestTagElement debugMenuTestTagElement = obj instanceof DebugMenuTestTagElement ? (DebugMenuTestTagElement) obj : null;
        if (debugMenuTestTagElement == null) {
            return false;
        }
        return Intrinsics.d(this.f94895a, debugMenuTestTagElement.f94895a);
    }

    public final int hashCode() {
        return this.f94895a.hashCode();
    }

    @Override // D1.AbstractC2794c0
    public final void update(e.c cVar) {
        a node = (a) cVar;
        Intrinsics.checkNotNullParameter(node, "node");
    }
}
