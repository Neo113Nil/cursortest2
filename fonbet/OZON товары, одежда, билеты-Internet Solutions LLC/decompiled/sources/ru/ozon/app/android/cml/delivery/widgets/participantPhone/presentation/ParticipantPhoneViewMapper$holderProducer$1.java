package ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation;

import Vg.d;
import WZ.l;
import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.view.ParticipantPhoneView;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ParticipantPhoneViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ParticipantPhoneViewHolder> {
    final /* synthetic */ ParticipantPhoneViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ParticipantPhoneViewMapper$holderProducer$1(ParticipantPhoneViewMapper participantPhoneViewMapper) {
        super(2);
        this.this$0 = participantPhoneViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ParticipantPhoneViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        ParticipantPhoneView participantPhoneView = (ParticipantPhoneView) view;
        d actionHandlersStoreFactory = this.this$0.component().getActionHandlersStoreFactory();
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        h viewModelOwnerProvider = ref.getViewModelOwnerProvider();
        final ParticipantPhoneViewMapper participantPhoneViewMapper = this.this$0;
        w0 a11 = new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.ParticipantPhoneViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ParticipantPhoneViewModel participantPhoneViewModel = ParticipantPhoneViewMapper.this.component().getParticipantPhoneViewModelProvider().get();
                Intrinsics.g(participantPhoneViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return participantPhoneViewModel;
            }
        }).a(ParticipantPhoneViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new ParticipantPhoneViewHolder(actionHandlersStoreFactory, participantPhoneView, ref, tokenizedAnalytics, (ParticipantPhoneViewModel) a11, this.this$0.component().getHandlersInhibitor(), this.this$0.component().getContactsRepository(), this.this$0.component().getContactsMapper(), this.this$0.component().getContactsHelper());
    }
}
