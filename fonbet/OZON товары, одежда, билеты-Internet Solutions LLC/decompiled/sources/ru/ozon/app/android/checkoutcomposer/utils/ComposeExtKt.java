package ru.ozon.app.android.checkoutcomposer.utils;

import d00.C6018d;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aE\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00010\u00002*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u0002\"\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld00/d;", "", "", "Lm20/a;", "Ll20/c;", "viewMappers", "", "rawViewMappers", "(Ld00/d;[Lm20/a;)V", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposeExtKt {
    public static final void rawViewMappers(@NotNull C6018d<Object> c6018d, @NotNull InterfaceC8046a<?, ? extends c>... viewMappers) {
        Intrinsics.checkNotNullParameter(c6018d, "<this>");
        Intrinsics.checkNotNullParameter(viewMappers, "viewMappers");
        for (final InterfaceC8046a<?, ? extends c> interfaceC8046a : viewMappers) {
            c6018d.g().add(new C6018d.a() { // from class: ru.ozon.app.android.checkoutcomposer.utils.ComposeExtKt$rawViewMappers$lambda$3$$inlined$rawViewMapper$1
                @Override // d00.C6018d.a
                public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Intrinsics.g(InterfaceC8046a.this, "null cannot be cast to non-null type ru.ozon.composer.widget.mapper.ViewItemMapper<kotlin.Any, ru.ozon.composer.widget.item.ViewItem>");
                    return InterfaceC8046a.this;
                }
            });
        }
    }
}
