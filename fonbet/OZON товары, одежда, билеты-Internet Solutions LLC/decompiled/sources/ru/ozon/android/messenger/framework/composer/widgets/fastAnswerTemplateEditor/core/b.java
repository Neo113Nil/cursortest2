package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.core;

import S0.InterfaceC3967k;
import a1.C4912a;
import fd.InterfaceC6512o;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.t;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.uni.core.repository.UniThemeKt;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static C4912a f86836a = new C4912a(false, -1361773203, a.f86837b);

    static final class a extends AbstractC7737t implements InterfaceC6512o<ru.ozon.composer.compose.widget.i<t>, g.a, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f86837b = new a(4);

        @Override // fd.InterfaceC6512o
        public final Unit invoke(ru.ozon.composer.compose.widget.i<t> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
            ru.ozon.composer.compose.widget.i<t> content = iVar;
            g.a it = aVar;
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(content, "$this$content");
            Intrinsics.checkNotNullParameter(it, "it");
            if ((intValue & 6) == 0) {
                intValue |= interfaceC3967k2.n(content) ? 4 : 2;
            }
            if ((intValue & 131) == 130 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                UniThemeKt.UniTheme(false, a1.c.c(1573754100, new ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.core.a(content), interfaceC3967k2), interfaceC3967k2, 48, 1);
            }
            return Unit.f71690a;
        }
    }
}
