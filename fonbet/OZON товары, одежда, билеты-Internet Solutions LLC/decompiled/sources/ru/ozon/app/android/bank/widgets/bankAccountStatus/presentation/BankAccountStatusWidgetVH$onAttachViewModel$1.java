package ru.ozon.app.android.bank.widgets.bankAccountStatus.presentation;

import Ae.InterfaceC2397i;
import Ae.x0;
import Sc.C4005g;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.bank.databinding.WidgetBankAccountStatusBinding;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.bank.widgets.bankAccountStatus.presentation.BankAccountStatusWidgetVH$onAttachViewModel$1", f = "BankAccountStatusWidgetVH.kt", l = {93}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class BankAccountStatusWidgetVH$onAttachViewModel$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ BankAccountStatusWidgetVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BankAccountStatusWidgetVH$onAttachViewModel$1(BankAccountStatusWidgetVH bankAccountStatusWidgetVH, d<? super BankAccountStatusWidgetVH$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = bankAccountStatusWidgetVH;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BankAccountStatusWidgetVH$onAttachViewModel$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        BankAccountStatusViewModel bankAccountStatusViewModel;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            bankAccountStatusViewModel = this.this$0.widgetViewModel;
            x0<String> balance = bankAccountStatusViewModel.getBalance();
            final BankAccountStatusWidgetVH bankAccountStatusWidgetVH = this.this$0;
            InterfaceC2397i<? super String> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.bank.widgets.bankAccountStatus.presentation.BankAccountStatusWidgetVH$onAttachViewModel$1.1
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((String) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(String str, d<? super Unit> dVar) {
                    BankAccountStatusVO bankAccountStatusVO;
                    BankAccountStatusVO bankAccountStatusVO2;
                    BankAccountStatusVO bankAccountStatusVO3;
                    WidgetBankAccountStatusBinding widgetBankAccountStatusBinding;
                    TextDTO subTitle;
                    if (str != null) {
                        bankAccountStatusVO = BankAccountStatusWidgetVH.this.item;
                        if ((bankAccountStatusVO != null ? bankAccountStatusVO.getTitle() : null) != null) {
                            bankAccountStatusVO2 = BankAccountStatusWidgetVH.this.item;
                            TextDTO copy$default = (bankAccountStatusVO2 == null || (subTitle = bankAccountStatusVO2.getSubTitle()) == null) ? null : TextDTO.copy$default(subTitle, OzonSpannableStringKt.toOzonSpannableString(str), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
                            BankAccountStatusWidgetVH bankAccountStatusWidgetVH2 = BankAccountStatusWidgetVH.this;
                            bankAccountStatusVO3 = bankAccountStatusWidgetVH2.item;
                            bankAccountStatusWidgetVH2.item = bankAccountStatusVO3 != null ? BankAccountStatusVO.copy$default(bankAccountStatusVO3, 0L, null, copy$default, null, null, null, null, null, null, false, 1019, null) : null;
                            if (copy$default != null) {
                                widgetBankAccountStatusBinding = BankAccountStatusWidgetVH.this.binding;
                                TextHolderKt.bind$default(widgetBankAccountStatusBinding.subTitleTv, copy$default, null, 2, null);
                            }
                        }
                    }
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (balance.collect(interfaceC2397i, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        throw new C4005g();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((BankAccountStatusWidgetVH$onAttachViewModel$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
