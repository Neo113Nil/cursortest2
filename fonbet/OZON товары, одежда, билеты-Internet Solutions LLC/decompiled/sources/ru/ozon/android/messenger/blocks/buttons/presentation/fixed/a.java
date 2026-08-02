package ru.ozon.android.messenger.blocks.buttons.presentation.fixed;

import android.view.ViewGroup;
import com.google.android.flexbox.FlexboxLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.buttons.a;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.app.android.messenger.databinding.MItemChatFixedButtonBinding;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

/* loaded from: classes10.dex */
public final class a extends ru.ozon.android.messenger.blocks.buttons.presentation.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MItemChatFixedButtonBinding f84442a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d.a f84443b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.navigation.controller.a f84444c;

    /* renamed from: ru.ozon.android.messenger.blocks.buttons.presentation.fixed.a$a, reason: collision with other inner class name */
    static final class C1473a extends AbstractC7737t implements Function1<AtomAction, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a.C1471a f84446c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1473a(a.C1471a c1471a) {
            super(1);
            this.f84446c = c1471a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AtomAction atomAction) {
            AtomAction it = atomAction;
            Intrinsics.checkNotNullParameter(it, "it");
            ru.ozon.android.messenger.framework.navigation.controller.a aVar = a.this.f84444c;
            ButtonV3Atom.SmallBorderlessButton d11 = this.f84446c.d();
            aVar.q(ru.ozon.android.messenger.framework.navigation.action.b.e(it, d11 != null ? d11.getAction() : null, 2));
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a.C1471a f84448c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a.C1471a c1471a) {
            super(0);
            this.f84448c = c1471a;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a.this.f84444c.q(this.f84448c.b());
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull MItemChatFixedButtonBinding binding, @NotNull d.a networkConfig, @NotNull ru.ozon.android.messenger.framework.navigation.controller.a controller) {
        super(binding);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f84442a = binding;
        this.f84443b = networkConfig;
        this.f84444c = controller;
    }

    @Override // ru.ozon.android.messenger.blocks.buttons.presentation.b
    public final void e(@NotNull ru.ozon.android.messenger.blocks.buttons.a button, boolean z11) {
        Intrinsics.checkNotNullParameter(button, "button");
        a.C1471a c1471a = (a.C1471a) button;
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        FlexboxLayoutManager.b bVar = layoutParams instanceof FlexboxLayoutManager.b ? (FlexboxLayoutManager.b) layoutParams : null;
        if (bVar != null) {
            bVar.e();
            bVar.c();
        }
        ChatButtonFixedLayout chatButtonFixedLayout = this.f84442a.chatButtonOL;
        chatButtonFixedLayout.d(z11);
        chatButtonFixedLayout.k(c1471a.f());
        chatButtonFixedLayout.j(c1471a.d(), new C1473a(c1471a));
        chatButtonFixedLayout.i(c1471a.c(), c1471a.e(), this.f84443b);
        chatButtonFixedLayout.h(new b(c1471a));
    }
}
