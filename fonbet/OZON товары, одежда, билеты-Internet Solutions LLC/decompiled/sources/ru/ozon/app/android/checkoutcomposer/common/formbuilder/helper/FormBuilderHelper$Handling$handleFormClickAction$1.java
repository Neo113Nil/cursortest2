package ru.ozon.app.android.checkoutcomposer.common.formbuilder.helper;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.helper.FormBuilderHelper;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.FieldAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FormBuilderHelper$Handling$handleFormClickAction$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ FieldAction.Click $action;
    final /* synthetic */ FormBuilderHelper.Handling this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FormBuilderHelper$Handling$handleFormClickAction$1(FieldAction.Click click, FormBuilderHelper.Handling handling) {
        super(0);
        this.$action = click;
        this.this$0 = handling;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FormBuilderBlockVO.Field field = this.$action.getField();
        if (field instanceof FormBuilderBlockVO.Field.YandexSearchField) {
            this.this$0.handleYandexSearchFieldClickAction((FormBuilderBlockVO.Field.YandexSearchField) this.$action.getField());
            return;
        }
        if (field instanceof FormBuilderBlockVO.Field.SearchField) {
            this.this$0.handleSearchFieldClickAction((FormBuilderBlockVO.Field.SearchField) this.$action.getField());
            return;
        }
        if (field instanceof FormBuilderBlockVO.Field.SelectorField) {
            this.this$0.handleSelectorFieldClickAction((FormBuilderBlockVO.Field.SelectorField) this.$action.getField());
        } else if (field instanceof FormBuilderBlockVO.Field.CheckboxField) {
            this.this$0.handleCheckboxFieldClickAction((FormBuilderBlockVO.Field.CheckboxField) this.$action.getField());
        } else if (field instanceof FormBuilderBlockVO.Field.ActionField) {
            this.this$0.handleActionFieldClickAction((FormBuilderBlockVO.Field.ActionField) this.$action.getField());
        }
    }
}
