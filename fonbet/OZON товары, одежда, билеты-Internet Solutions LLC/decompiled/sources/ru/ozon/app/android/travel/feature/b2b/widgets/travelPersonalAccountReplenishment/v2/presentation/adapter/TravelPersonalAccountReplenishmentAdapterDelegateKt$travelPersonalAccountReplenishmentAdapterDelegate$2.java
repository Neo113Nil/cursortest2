package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation.adapter;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation.adapter.TravelPersonalAccountReplenishmentAdapterDelegateKt$travelPersonalAccountReplenishmentAdapterDelegate$2;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.android.uikit.view.atoms.tags.TagAtomView;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.v3.holders.tags.TagHolderKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/uni/android/uikit/view/atoms/tags/TagAtomView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TravelPersonalAccountReplenishmentAdapterDelegateKt$travelPersonalAccountReplenishmentAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<TagV3Atom.TagAtom, TypedViewBinding<TagAtomView>>, Unit> {
    final /* synthetic */ Function2<String, Integer, Unit> $onTagClickListener;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "payload", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation.adapter.TravelPersonalAccountReplenishmentAdapterDelegateKt$travelPersonalAccountReplenishmentAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ Function2<String, Integer, Unit> $onTagClickListener;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<TagV3Atom.TagAtom, TypedViewBinding<TagAtomView>> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<TagV3Atom.TagAtom, TypedViewBinding<TagAtomView>> adapterDelegateViewBindingViewHolder, Function2<? super String, ? super Integer, Unit> function2) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$onTagClickListener = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$1$lambda$0(Function2 function2, AdapterDelegateViewBindingViewHolder adapterDelegateViewBindingViewHolder, View view) {
            String text = ((TagV3Atom.TagAtom) adapterDelegateViewBindingViewHolder.getItem()).getText();
            if (text == null) {
                text = "";
            }
            function2.invoke(text, Integer.valueOf(adapterDelegateViewBindingViewHolder.getAdapterPosition()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (!payload.isEmpty() && payload.contains("TagSelectionPayload")) {
                this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout().setSelected(this.$this_adapterDelegateViewBinding.getItem().isSelected());
                return;
            }
            TagAtomView constraintLayout = this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout();
            final AdapterDelegateViewBindingViewHolder<TagV3Atom.TagAtom, TypedViewBinding<TagAtomView>> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            final Function2<String, Integer, Unit> function2 = this.$onTagClickListener;
            TagAtomView tagAtomView = constraintLayout;
            TagHolderKt.bind$default(tagAtomView, adapterDelegateViewBindingViewHolder.getItem(), null, 2, null);
            tagAtomView.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation.adapter.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TravelPersonalAccountReplenishmentAdapterDelegateKt$travelPersonalAccountReplenishmentAdapterDelegate$2.AnonymousClass1.invoke$lambda$1$lambda$0(Function2.this, adapterDelegateViewBindingViewHolder, view);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TravelPersonalAccountReplenishmentAdapterDelegateKt$travelPersonalAccountReplenishmentAdapterDelegate$2(Function2<? super String, ? super Integer, Unit> function2) {
        super(1);
        this.$onTagClickListener = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<TagV3Atom.TagAtom, TypedViewBinding<TagAtomView>> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<TagV3Atom.TagAtom, TypedViewBinding<TagAtomView>> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding, this.$onTagClickListener));
    }
}
