package ru.ozon.debugMenu.internal.core.ui.utils;

import I1.A;
import I1.D;
import I1.o;
import I1.z;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5242e1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    /* JADX WARN: Incorrect field signature: TT; */
    static final class a extends AbstractC7737t implements Function1<C5242e1, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Enum f94898b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (TT;)V */
        a(Enum r12) {
            super(1);
            this.f94898b = r12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C5242e1 c5242e1) {
            C5242e1 DebugMenuTestTagElement = c5242e1;
            Intrinsics.checkNotNullParameter(DebugMenuTestTagElement, "$this$DebugMenuTestTagElement");
            DebugMenuTestTagElement.getClass();
            DebugMenuTestTagElement.a().b(this.f94898b.name(), "tag");
            return Unit.f71690a;
        }
    }

    /* renamed from: ru.ozon.debugMenu.internal.core.ui.utils.b$b, reason: collision with other inner class name */
    static final class C1976b extends AbstractC7737t implements Function1<D, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f94899b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1976b(String str) {
            super(1);
            this.f94899b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(D d11) {
            D semantics = d11;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            z.t(semantics, this.f94899b);
            A.a(semantics, true);
            return Unit.f71690a;
        }
    }

    @NotNull
    public static final <T extends Enum<T>> e a(@NotNull e eVar, @NotNull T tag) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        return eVar.l0(new DebugMenuTestTagElement(tag, new a(tag)));
    }

    @NotNull
    public static final e b(@NotNull e eVar, @NotNull String testTag) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        return o.c(eVar, false, new C1976b(testTag));
    }
}
