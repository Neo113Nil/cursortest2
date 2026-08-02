package ru.ozon.app.android.pdp.ui.configurators;

import d00.C6018d;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aM\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u0003\"\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "S", "Ld00/d;", "", "Lm20/a;", "Ll20/c;", "viewMappers", "", "rawViewMappers", "(Ld00/d;[Lm20/a;)V", "configurators_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposeWidgetExtKt {
    public static final <S> void rawViewMappers(@NotNull C6018d<S> c6018d, @NotNull InterfaceC8046a<?, ? extends c>... viewMappers) {
        Intrinsics.checkNotNullParameter(c6018d, "<this>");
        Intrinsics.checkNotNullParameter(viewMappers, "viewMappers");
        for (final InterfaceC8046a<?, ? extends c> interfaceC8046a : viewMappers) {
            c6018d.g().add(new C6018d.a() { // from class: ru.ozon.app.android.pdp.ui.configurators.ComposeWidgetExtKt$rawViewMappers$lambda$1$$inlined$rawViewMapper$1
                @Override // d00.C6018d.a
                public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Intrinsics.g(InterfaceC8046a.this, "null cannot be cast to non-null type ru.ozon.composer.widget.mapper.ViewItemMapper<S of ru.ozon.app.android.pdp.ui.configurators.ComposeWidgetExtKt.rawViewMappers, ru.ozon.composer.widget.item.ViewItem>");
                    return InterfaceC8046a.this;
                }
            });
        }
    }
}
