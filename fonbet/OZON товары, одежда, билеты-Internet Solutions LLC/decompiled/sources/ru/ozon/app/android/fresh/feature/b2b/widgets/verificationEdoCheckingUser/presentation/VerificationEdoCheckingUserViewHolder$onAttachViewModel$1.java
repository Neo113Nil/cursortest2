package ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingUser.presentation;

import Sc.s;
import Wc.a;
import android.view.View;
import android.widget.LinearLayout;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetVerificationEdoCheckingUserBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingUser.presentation.VerificationEdoCheckingUserVO;
import ru.ozon.uni.android.cell.text.TextFieldCellView;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "fields", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/presentation/VerificationEdoCheckingUserVO$Field;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingUser.presentation.VerificationEdoCheckingUserViewHolder$onAttachViewModel$1", f = "VerificationEdoCheckingUserViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class VerificationEdoCheckingUserViewHolder$onAttachViewModel$1 extends j implements Function2<List<? extends VerificationEdoCheckingUserVO.Field>, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ VerificationEdoCheckingUserViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerificationEdoCheckingUserViewHolder$onAttachViewModel$1(VerificationEdoCheckingUserViewHolder verificationEdoCheckingUserViewHolder, d<? super VerificationEdoCheckingUserViewHolder$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = verificationEdoCheckingUserViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        VerificationEdoCheckingUserViewHolder$onAttachViewModel$1 verificationEdoCheckingUserViewHolder$onAttachViewModel$1 = new VerificationEdoCheckingUserViewHolder$onAttachViewModel$1(this.this$0, dVar);
        verificationEdoCheckingUserViewHolder$onAttachViewModel$1.L$0 = obj;
        return verificationEdoCheckingUserViewHolder$onAttachViewModel$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends VerificationEdoCheckingUserVO.Field> list, d<? super Unit> dVar) {
        return invoke2((List<VerificationEdoCheckingUserVO.Field>) list, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WidgetVerificationEdoCheckingUserBinding widgetVerificationEdoCheckingUserBinding;
        List list;
        VerificationEdoCheckingUserVO boundData;
        Map<String, String> lexemes;
        String str;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        List list2 = (List) this.L$0;
        if (list2 != null) {
            VerificationEdoCheckingUserViewHolder verificationEdoCheckingUserViewHolder = this.this$0;
            int i11 = 0;
            for (Object obj2 : list2) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                widgetVerificationEdoCheckingUserBinding = verificationEdoCheckingUserViewHolder.binding;
                LinearLayout constraintLayout = widgetVerificationEdoCheckingUserBinding.getConstraintLayout();
                list = verificationEdoCheckingUserViewHolder.inputFieldsIds;
                View findViewById = constraintLayout.findViewById(((Number) list.get(i11)).intValue());
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                TextFieldCellView textFieldCellView = (TextFieldCellView) findViewById;
                if (((VerificationEdoCheckingUserVO.Field) obj2).getHasError() && (boundData = verificationEdoCheckingUserViewHolder.getBoundData()) != null && (lexemes = boundData.getLexemes()) != null && (str = lexemes.get("errorRequiredText")) != null) {
                    verificationEdoCheckingUserViewHolder.showError(textFieldCellView, str);
                }
                i11 = i12;
            }
        }
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<VerificationEdoCheckingUserVO.Field> list, d<? super Unit> dVar) {
        return ((VerificationEdoCheckingUserViewHolder$onAttachViewModel$1) create(list, dVar)).invokeSuspend(Unit.f71690a);
    }
}
