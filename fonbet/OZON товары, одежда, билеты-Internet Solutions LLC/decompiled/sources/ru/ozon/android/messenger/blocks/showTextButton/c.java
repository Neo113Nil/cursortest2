package ru.ozon.android.messenger.blocks.showTextButton;

import androidx.lifecycle.x0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.showTextButton.a;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.v;
import ru.ozon.android.messenger.framework.data.repository.C9351a;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import xe.AbstractC10711a;
import xe.B0;
import xe.C10727i;

/* loaded from: classes10.dex */
public final class c extends v<k, a> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f86387g = 0;

    /* renamed from: e, reason: collision with root package name */
    public C9351a f86388e;

    /* renamed from: f, reason: collision with root package name */
    private B0 f86389f;

    @Override // ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.v
    public final void g0(a aVar) {
        Object f02;
        a.C1530a c1530a;
        ru.ozon.android.messenger.framework.navigation.action.a a11;
        Object f03;
        a action = aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof a.C1530a)) {
            if (!(action instanceof a.b)) {
                throw new Sc.o();
            }
            k a12 = ((a.b) action).a();
            ButtonV3DTO b11 = a12.b();
            if (b11 == null) {
                return;
            }
            f02 = f0();
            boolean c11 = a12.c();
            ((k) f02).getClass();
            v.e0(this, new k(b11, c11));
            return;
        }
        B0 b02 = this.f86389f;
        if ((b02 == null || !((AbstractC10711a) b02).isActive()) && (a11 = (c1530a = (a.C1530a) action).a()) != null) {
            k a13 = k.a(f0(), true);
            ButtonV3DTO b12 = a13.b();
            if (b12 != null) {
                f03 = f0();
                boolean c12 = a13.c();
                ((k) f03).getClass();
                v.e0(this, new k(b12, c12));
            }
            ru.ozon.android.messenger.framework.core.d b13 = c1530a.b();
            AtomAction c13 = a11.c();
            AtomAction.Click click = c13 instanceof AtomAction.Click ? (AtomAction.Click) c13 : null;
            this.f86389f = C10727i.c(x0.a(this), null, null, new b(this, a11, click != null ? click.getParams() : null, b13, null), 3);
        }
    }
}
