package ru.ozon.app.android.orderdetails.radiogroup.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.af.holders.RadioItemAtom;
import ru.ozon.app.android.atoms.data.deprecated.RadioItem;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$style;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/orderdetails/radiogroup/presentation/RadioGroupViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/radiogroup/presentation/RadioGroupVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "composerBus", "<init>", "(Landroid/view/View;Ll10/b;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/orderdetails/radiogroup/presentation/RadioGroupVO;Ll20/d;)V", "Ll10/b;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "adapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RadioGroupViewHolder extends k<RadioGroupVO> {

    @NotNull
    private final AtomsAdapter adapter;

    @NotNull
    private final InterfaceC7851b composerBus;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.orderdetails.radiogroup.presentation.RadioGroupViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
            invoke2(atomAction);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomAction it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it instanceof AtomAction.Click) {
                InterfaceC7851b.a.a(RadioGroupViewHolder.this.composerBus, ((AtomAction.Click) it).getLink(), null, null, null, 14);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioGroupViewHolder(@NotNull View containerView, @NotNull InterfaceC7851b composerBus) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(composerBus, "composerBus");
        this.composerBus = composerBus;
        AtomsAdapter atomsAdapter = new AtomsAdapter(U.i(new Pair(new Atom.ConfCondition(RadioItem.class, null, 2, null), new RadioItemAtom.Configuration(0, 0, 8, 8, Integer.valueOf(R$style.TextStyle_Body), 3, null))), null, null, null, 14, null);
        this.adapter = atomsAdapter;
        View view = this.itemView;
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout");
        ((VerticalAtomsLayout) view).setAdapter(atomsAdapter);
        atomsAdapter.setOnAction(new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull RadioGroupVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.adapter.bind(getContext(), item.getButtons());
    }
}
