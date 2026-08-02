package ru.ozon.app.android.pdp.widgets.translateButton.presentation;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.R$string;
import ru.ozon.app.android.pdp.widgets.translateButton.core.TranslateShowLoadingUpdateKey;
import ru.ozon.app.android.pdp.widgets.translateButton.presentation.TranslateViewModel;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.uikit.utils.NotificationBarHelperKt;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.widgets.translateButton.presentation.TranslateButtonViewHolder$onAttachViewModel$1", f = "TranslateButtonViewHolder.kt", l = {51}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class TranslateButtonViewHolder$onAttachViewModel$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ TranslateButtonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TranslateButtonViewHolder$onAttachViewModel$1(TranslateButtonViewHolder translateButtonViewHolder, d<? super TranslateButtonViewHolder$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = translateButtonViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TranslateButtonViewHolder$onAttachViewModel$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TranslateViewModel translateViewModel;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            translateViewModel = this.this$0.viewModel;
            InterfaceC2395h<TranslateViewModel.TranslateState> translateState = translateViewModel.getTranslateState();
            final TranslateButtonViewHolder translateButtonViewHolder = this.this$0;
            InterfaceC2397i<? super TranslateViewModel.TranslateState> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.pdp.widgets.translateButton.presentation.TranslateButtonViewHolder$onAttachViewModel$1.1
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((TranslateViewModel.TranslateState) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(TranslateViewModel.TranslateState translateState2, d<? super Unit> dVar) {
                    NotificationDTO notificationDTO;
                    ComposerReferences composerReferences;
                    ButtonV3View buttonV3View;
                    ComposerReferences composerReferences2;
                    if (translateState2 instanceof TranslateViewModel.TranslateState.Loading) {
                        composerReferences2 = TranslateButtonViewHolder.this.refs;
                        InterfaceC7851b controller = composerReferences2.getController();
                        TranslateButtonVO translateButtonVO = (TranslateButtonVO) TranslateButtonViewHolder.this.getBoundedData();
                        controller.update(new TranslateShowLoadingUpdateKey(true, translateButtonVO != null ? translateButtonVO.getLoaderTopPadding() : 0));
                    } else if (translateState2 instanceof TranslateViewModel.TranslateState.Success) {
                        TranslateButtonViewHolder.this.handleTranslated();
                    } else if (translateState2 instanceof TranslateViewModel.TranslateState.Error) {
                        TranslateButtonViewHolder translateButtonViewHolder2 = TranslateButtonViewHolder.this;
                        if (((TranslateViewModel.TranslateState.Error) translateState2).getIsNetworkError()) {
                            AppTypeResolver appTypeResolver = AppTypeResolver.INSTANCE;
                            buttonV3View = TranslateButtonViewHolder.this.view;
                            Context context = buttonV3View.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            notificationDTO = NotificationBarHelperKt.createNetworkErrorNotificationDTO(appTypeResolver.isSelect(context));
                        } else {
                            notificationDTO = new NotificationDTO(StringProvider.getString(R$string.reviews_failed_to_translate_notification_title), StringProvider.getString(ru.ozon.app.android.common.actionHandlers.R$string.common_try_again_android), null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 476, null);
                        }
                        translateButtonViewHolder2.showNotification(notificationDTO);
                        composerReferences = TranslateButtonViewHolder.this.refs;
                        composerReferences.getController().update(new TranslateShowLoadingUpdateKey(false, 0, 2, null));
                    }
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (translateState.collect(interfaceC2397i, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TranslateButtonViewHolder$onAttachViewModel$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
