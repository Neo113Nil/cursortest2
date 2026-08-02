package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.view.AviaCheckTariffsBenefitView;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/view/AviaCheckTariffsBenefitView;", "<unused var>", "Landroid/view/LayoutInflater;", "root", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaCheckTariffsBenefitsAdapterDelegateKt$aviaCheckTariffsBenefitsAdapterDelegate$1 extends AbstractC7737t implements Function2<LayoutInflater, ViewGroup, TypedViewBinding<AviaCheckTariffsBenefitView>> {
    final /* synthetic */ Function1<AtomAction, Unit> $onClick;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/view/AviaCheckTariffsBenefitView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.view.adapter.AviaCheckTariffsBenefitsAdapterDelegateKt$aviaCheckTariffsBenefitsAdapterDelegate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<AviaCheckTariffsBenefitView> {
        final /* synthetic */ Function1<AtomAction, Unit> $onClick;
        final /* synthetic */ ViewGroup $root;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(ViewGroup viewGroup, Function1<? super AtomAction, Unit> function1) {
            super(0);
            this.$root = viewGroup;
            this.$onClick = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AviaCheckTariffsBenefitView invoke() {
            Context context = this.$root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            AviaCheckTariffsBenefitView aviaCheckTariffsBenefitView = new AviaCheckTariffsBenefitView(context);
            Function1<AtomAction, Unit> function1 = this.$onClick;
            aviaCheckTariffsBenefitView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            aviaCheckTariffsBenefitView.setActionHandler(function1);
            return aviaCheckTariffsBenefitView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AviaCheckTariffsBenefitsAdapterDelegateKt$aviaCheckTariffsBenefitsAdapterDelegate$1(Function1<? super AtomAction, Unit> function1) {
        super(2);
        this.$onClick = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TypedViewBinding<AviaCheckTariffsBenefitView> invoke(LayoutInflater layoutInflater, ViewGroup root) {
        Intrinsics.checkNotNullParameter(layoutInflater, "<unused var>");
        Intrinsics.checkNotNullParameter(root, "root");
        return new TypedViewBinding<>(new AnonymousClass1(root, this.$onClick));
    }
}
