package ru.ozon.android.messenger.framework.presentation.common.popupmenu.action;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

/* loaded from: classes10.dex */
public final class a extends ConstraintLayout {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f90796c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f90797d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f90798e;

    /* renamed from: ru.ozon.android.messenger.framework.presentation.common.popupmenu.action.a$a, reason: collision with other inner class name */
    static final class C1691a extends AbstractC7737t implements Function1<androidx.constraintlayout.widget.d, Unit> {
        C1691a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(androidx.constraintlayout.widget.d dVar) {
            androidx.constraintlayout.widget.d updateConstraints = dVar;
            Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
            a aVar = a.this;
            ConstraintSetExtKt.layoutConstraintTopToTopOfParent(updateConstraints, a.b(aVar));
            ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(updateConstraints, a.b(aVar));
            ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, a.b(aVar));
            ConstraintSetExtKt.layoutConstraintTopToTopOf(updateConstraints, a.d(aVar), a.b(aVar));
            ConstraintSetExtKt.layoutConstraintBottomToBottomOf(updateConstraints, a.d(aVar), a.b(aVar));
            ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, a.d(aVar));
            ConstraintSetExtKt.layoutConstraintTopToBottomOf(updateConstraints, a.c(aVar), a.b(aVar));
            ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, a.c(aVar));
            ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, a.c(aVar));
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function0<IconView> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f90800b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f90801c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, a aVar) {
            super(0);
            this.f90800b = context;
            this.f90801c = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final IconView invoke() {
            int i11;
            int i12;
            int i13;
            int i14;
            IconView iconView = new IconView(this.f90800b, null, 0, 6, null);
            iconView.setId(R$id.m_popup_menu_action_icon);
            this.f90801c.getClass();
            i11 = ru.ozon.android.messenger.utils.e.f91913j;
            i12 = ru.ozon.android.messenger.utils.e.f91913j;
            ConstraintLayout.b bVar = new ConstraintLayout.b(i11, i12);
            i13 = ru.ozon.android.messenger.utils.e.f91910g;
            i14 = ru.ozon.android.messenger.utils.e.f91906c;
            bVar.setMargins(i13, 0, i14, 0);
            iconView.setLayoutParams(bVar);
            return iconView;
        }
    }

    static final class c extends AbstractC7737t implements Function0<View> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f90802b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f90803c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, a aVar) {
            super(0);
            this.f90802b = context;
            this.f90803c = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            int i11;
            Context context = this.f90802b;
            View view = new View(context);
            view.setId(R$id.m_popup_menu_action_separator);
            this.f90803c.getClass();
            i11 = ru.ozon.android.messenger.utils.e.f91904a;
            view.setLayoutParams(new ConstraintLayout.b(0, i11));
            view.setBackgroundColor(view.getResources().getColor(R$color.graphic_neutral, context.getTheme()));
            return view;
        }
    }

    static final class d extends AbstractC7737t implements Function0<TextAtomV2View> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f90804b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f90805c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, a aVar) {
            super(0);
            this.f90804b = context;
            this.f90805c = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextAtomV2View invoke() {
            int i11;
            int i12;
            TextAtomV2View textAtomV2View = new TextAtomV2View(this.f90804b, null, 0, 6, null);
            ConstraintLayout.b d11 = Bi.b.d(textAtomV2View, R$id.m_popup_menu_action_title, -1, -2);
            this.f90805c.getClass();
            i11 = ru.ozon.android.messenger.utils.e.f91918o;
            d11.setMarginEnd(i11);
            textAtomV2View.setLayoutParams(d11);
            textAtomV2View.setGravity(8388611);
            i12 = ru.ozon.android.messenger.utils.e.f91922s;
            textAtomV2View.setMinWidth(i12);
            textAtomV2View.setTextIsSelectable(false);
            return textAtomV2View;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC4008j b11 = k.b(new d(context, this));
        this.f90796c = b11;
        InterfaceC4008j b12 = k.b(new b(context, this));
        this.f90797d = b12;
        InterfaceC4008j b13 = k.b(new c(context, this));
        this.f90798e = b13;
        addView((IconView) b12.getValue());
        addView((TextAtomV2View) b11.getValue());
        addView((View) b13.getValue());
        ConstraintLayoutExtKt.updateConstraints(this, new C1691a());
    }

    public static final IconView b(a aVar) {
        return (IconView) aVar.f90797d.getValue();
    }

    public static final View c(a aVar) {
        return (View) aVar.f90798e.getValue();
    }

    public static final TextAtomV2View d(a aVar) {
        return (TextAtomV2View) aVar.f90796c.getValue();
    }

    public final void bindTitle(@NotNull TextDTO titleTextDTO) {
        Intrinsics.checkNotNullParameter(titleTextDTO, "titleTextDTO");
        TextHolderKt.bind$default((TextAtomV2View) this.f90796c.getValue(), titleTextDTO, null, 2, null);
    }

    public final void e(@NotNull IconDTO iconDTO) {
        Intrinsics.checkNotNullParameter(iconDTO, "iconDTO");
        IconHolderKt.bind$default((IconView) this.f90797d.getValue(), iconDTO, null, 2, null);
    }

    public final void f(boolean z11) {
        s.e((View) this.f90798e.getValue(), Boolean.valueOf(z11));
    }
}
