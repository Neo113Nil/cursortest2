package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.action.b;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.x;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/android/messenger/framework/composer/widgets/fastAnswerTemplateEditor/presentation/u;", "Lru/ozon/android/messenger/framework/composer/widgets/fastAnswerTemplateEditor/presentation/h;", "<init>", "()V", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class u extends h {
    @Override // ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.h, ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.v
    /* renamed from: h0 */
    public final void g0(@NotNull x action) {
        Intrinsics.checkNotNullParameter(action, "action");
        super.g0(action);
        if (action instanceof x.b) {
            x.b bVar = (x.b) action;
            boolean c11 = bVar.c();
            Tg.b a11 = bVar.a();
            b.a b11 = bVar.b();
            if (!c11 || getState().getValue().d() || a11 == null || b11 == null) {
                return;
            }
            ((Function1) b11.b()).invoke(a11);
        }
    }
}
