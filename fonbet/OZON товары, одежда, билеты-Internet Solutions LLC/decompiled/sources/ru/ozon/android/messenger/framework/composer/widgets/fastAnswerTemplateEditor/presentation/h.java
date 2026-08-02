package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation;

import Q1.K;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.x;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/android/messenger/framework/composer/widgets/fastAnswerTemplateEditor/presentation/h;", "Lru/ozon/android/messenger/framework/composer/widgets/fastAnswerTemplateEditor/presentation/v;", "Lru/ozon/android/messenger/framework/composer/widgets/fastAnswerTemplateEditor/presentation/i;", "Lru/ozon/android/messenger/framework/composer/widgets/fastAnswerTemplateEditor/presentation/x;", "<init>", "()V", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public class h extends v<i, x> {
    public h() {
        super(new i(0));
    }

    @Override // ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.v
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void g0(@NotNull x action) {
        K f7;
        String f11;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof x.b) {
            boolean c11 = ((x.b) action).c();
            y b11 = getState().getValue().b();
            if (b11 == null || (f7 = b11.f()) == null || (f11 = f7.f()) == null || f11.length() <= 0) {
                v.e0(this, i.a(f0(), null, true, false, 5));
                return;
            } else {
                v.e0(this, i.a(f0(), null, false, c11, 3));
                return;
            }
        }
        if (action instanceof x.a) {
            y a11 = ((x.a) action).a();
            f0().getClass();
            v.e0(this, new i(a11, false, false));
        } else {
            if (!(action instanceof x.c)) {
                throw new Sc.o();
            }
            String a12 = ((x.c) action).a();
            y b12 = f0().b();
            if (b12 == null) {
                return;
            }
            v.e0(this, i.a(f0(), y.a(b12, new K(6, 0L, a12)), false, false, 4));
        }
    }
}
