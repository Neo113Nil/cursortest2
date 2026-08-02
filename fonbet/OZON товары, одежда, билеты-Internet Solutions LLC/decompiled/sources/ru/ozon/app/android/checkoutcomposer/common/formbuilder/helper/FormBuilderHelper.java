package ru.ozon.app.android.checkoutcomposer.common.formbuilder.helper;

import A00.a;
import Sc.o;
import WZ.t;
import android.content.Context;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.atom2.InputAtom;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.configurator.OptionsSelectorSheetResultConfigurator;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.configurator.SearchSheetResultConfigurator;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.data.FormBuilderDTO;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.FieldAction;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetFragment;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.selectorsheet.OptionsSelectorSheetFragment;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.updateevent.FormBuilderFieldUpdate;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.map.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.StringExtKt;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetResultConfigurator;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001f\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/helper/FormBuilderHelper;", "", "<init>", "()V", "configurators", "", "Ljava/lang/Class;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "getConfigurators", "()Ljava/util/Set;", "Update", "Transform", "Handling", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FormBuilderHelper {

    @NotNull
    public static final FormBuilderHelper INSTANCE = new FormBuilderHelper();

    @NotNull
    private static final Set<Class<? extends ComposerScreenConfig.PageConfigurator>> configurators;

    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0002\b\u00030\u0004j\u0006\u0012\u0002\b\u0003`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020(¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R \u0010\u0006\u001a\u000e\u0012\u0002\b\u00030\u0004j\u0006\u0012\u0002\b\u0003`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010-R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010.R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010/R \u00100\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/helper/FormBuilderHelper$Handling;", "", "Landroid/content/Context;", "context", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "vh", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lkotlin/Function1;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "", "onSearchClicked", "<init>", "(Landroid/content/Context;Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldAction$Click;", "action", "handleFormClickAction", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldAction$Click;)V", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField;", "field", "handleSelectorFieldClickAction", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField;)V", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField;", "handleYandexSearchFieldClickAction", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField;)V", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SearchField;", "handleSearchFieldClickAction", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SearchField;)V", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$CheckboxField;", "handleCheckboxFieldClickAction", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$CheckboxField;)V", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ActionField;", "handleActionFieldClickAction", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ActionField;)V", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldAction;", "handleFormAction", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldAction;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "handleTitleAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "Landroid/content/Context;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "Lkotlin/jvm/functions/Function1;", "actionHandler", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Handling {

        @NotNull
        private final Function1<AtomAction, Unit> actionHandler;

        @NotNull
        private final Context context;

        @NotNull
        private final HandlersInhibitor handlersInhibitor;

        @NotNull
        private final Function1<YandexSearchSheetFragment.Data, Unit> onSearchClicked;

        @NotNull
        private final ComposerReferences ref;

        @NotNull
        private final k<?> vh;

        /* JADX WARN: Multi-variable type inference failed */
        public Handling(@NotNull Context context, @NotNull k<?> vh2, @NotNull ComposerReferences ref, @NotNull HandlersInhibitor handlersInhibitor, @NotNull Function1<? super YandexSearchSheetFragment.Data, Unit> onSearchClicked) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(vh2, "vh");
            Intrinsics.checkNotNullParameter(ref, "ref");
            Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
            Intrinsics.checkNotNullParameter(onSearchClicked, "onSearchClicked");
            this.context = context;
            this.vh = vh2;
            this.ref = ref;
            this.handlersInhibitor = handlersInhibitor;
            this.onSearchClicked = onSearchClicked;
            this.actionHandler = new ActionHandler.Builder(ref, vh2).buildHandler();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handleActionFieldClickAction(FormBuilderBlockVO.Field.ActionField field) {
            AtomAction atomAction = field.getAtomAction();
            if (atomAction != null) {
                handleTitleAction(atomAction);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handleCheckboxFieldClickAction(FormBuilderBlockVO.Field.CheckboxField field) {
            Toast.makeText(this.context, "TODO: " + field.getName(), 0).show();
        }

        private final void handleFormClickAction(FieldAction.Click action) {
            HandlersInhibitor.run$default(this.handlersInhibitor, 0L, new FormBuilderHelper$Handling$handleFormClickAction$1(action, this), 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handleSearchFieldClickAction(FormBuilderBlockVO.Field.SearchField field) {
            SearchSheetFragment newInstance = SearchSheetFragment.INSTANCE.newInstance(new SearchSheetFragment.Data(field.getName(), null, field.getHint(), "", field.getSearchOptions(), null));
            newInstance.setTargetFragment(this.ref.getContainer().j(), 9300);
            newInstance.show(this.ref.getContainer().k(), SearchSheetFragment.class.toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handleSelectorFieldClickAction(FormBuilderBlockVO.Field.SelectorField field) {
            FormBuilderBlockVO.Field.SelectorField.SelectOptions selectOptions = field.getSelectOptions();
            if (selectOptions != null) {
                OptionsSelectorSheetFragment newInstance = OptionsSelectorSheetFragment.INSTANCE.newInstance(new OptionsSelectorSheetFragment.Config(field.getName(), field.getHint(), field.getValue(), selectOptions, null, 16, null));
                newInstance.setTargetFragment(this.ref.getContainer().j(), 9200);
                newInstance.show(this.ref.getContainer().j().getParentFragmentManager(), OptionsSelectorSheetFragment.class.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handleYandexSearchFieldClickAction(FormBuilderBlockVO.Field.YandexSearchField field) {
            this.onSearchClicked.invoke(new YandexSearchSheetFragment.Data(field.getName(), StringProvider.getString(R$string.checkout_form_builder_address_search_title), field.getHint(), field.getText().toString(), field.getSearchOptions(), null, null, null, null, null, 960, null));
            t tokenizedEvent = field.getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
            }
        }

        public final void handleFormAction(@NotNull FieldAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (action instanceof FieldAction.Click) {
                handleFormClickAction((FieldAction.Click) action);
            } else if (action instanceof FieldAction.TextChanged) {
                FieldAction.TextChanged textChanged = (FieldAction.TextChanged) action;
                FormBuilderBlockVO.Field field = textChanged.getField();
                FormBuilderBlockVO.Field.TextField textField = field instanceof FormBuilderBlockVO.Field.TextField ? (FormBuilderBlockVO.Field.TextField) field : null;
                this.ref.getController().d(new FormBuilderFieldUpdate.FormBuilderTextFieldUpdate(textChanged.getField().getName(), (textField != null ? textField.getInputType() : null) == InputAtom.Configuration.InputType.PHONE ? StringExtKt.getNumber(textChanged.getText()) : textChanged.getText()));
            } else {
                if (!(action instanceof FieldAction.ChipSelected)) {
                    throw new o();
                }
                FieldAction.ChipSelected chipSelected = (FieldAction.ChipSelected) action;
                this.ref.getController().update(new FormBuilderFieldUpdate.FormBuilderChipsFieldUpdate(chipSelected.getField().getName(), chipSelected.getChipsWithField()));
            }
            WhenExtKt.getExhaustive(Unit.f71690a);
        }

        public final void handleTitleAction(@NotNull AtomAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.actionHandler.invoke(action);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/helper/FormBuilderHelper$Transform;", "", "<init>", "()V", "makeDataForSend", "", "", "rows", "", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Transform {

        @NotNull
        public static final Transform INSTANCE = new Transform();

        private Transform() {
        }

        @NotNull
        public final Map<String, String> makeDataForSend(@NotNull List<FormBuilderDTO.Row> rows) {
            Intrinsics.checkNotNullParameter(rows, "rows");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it = rows.iterator();
            while (it.hasNext()) {
                Iterator<T> it2 = ((FormBuilderDTO.Row) it.next()).getBlocks().iterator();
                while (it2.hasNext()) {
                    Iterator<T> it3 = ((FormBuilderDTO.Row.Block) it2.next()).getRows().iterator();
                    while (it3.hasNext()) {
                        for (FormBuilderDTO.Row.Block.BlockRow.Field field : ((FormBuilderDTO.Row.Block.BlockRow) it3.next()).getFields()) {
                            linkedHashMap.put(field.getName(), field.getValue());
                        }
                    }
                }
            }
            return linkedHashMap;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ3\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u001bR%\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u001c0\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/helper/FormBuilderHelper$Update;", "", "<init>", "()V", "", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO;", DynamicElementDTO.FORM, "", "fieldName", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions$Option;", "option", "changeSelectorFieldSelectedOption", "(Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions$Option;)Ljava/util/List;", "text", "changeTextFieldValue", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "changeYandexSearchFieldValue", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField;", "chipsWithField", "changeChipsField", "(Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField;)Ljava/util/List;", "LA00/a$J$a;", "update", "", "checkChangeFieldPossibility", "(LA00/a$J$a;Ljava/util/List;)Z", "changeFormByUpdate", "(LA00/a$J$a;Ljava/util/List;)Ljava/util/List;", "Ljava/lang/Class;", "consumeEvents", "Ljava/util/List;", "getConsumeEvents", "()Ljava/util/List;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Update {

        @NotNull
        public static final Update INSTANCE = new Update();

        @NotNull
        private static final List<Class<? extends a.J.InterfaceC0007a>> consumeEvents = C7714v.b0(FormBuilderFieldUpdate.FormBuilderSelectorFieldUpdate.class, FormBuilderFieldUpdate.FormBuilderYandexSearchFieldUpdate.class, FormBuilderFieldUpdate.FormBuilderTextFieldUpdate.class, FormBuilderFieldUpdate.FormBuilderChipsFieldUpdate.class);

        private Update() {
        }

        private final List<FormBuilderBlockVO> changeChipsField(List<FormBuilderBlockVO> form, String fieldName, FormBuilderBlockVO.Field.ChipsField.ChipsWithField chipsWithField) {
            FormBuilderBlockVO formBuilderBlockVO;
            FormBuilderBlockVO.Field.ChipsField copy$default;
            List<FormBuilderBlockVO> list = form;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            for (FormBuilderBlockVO formBuilderBlockVO2 : list) {
                List<FormBuilderBlockVO.Field> fields = formBuilderBlockVO2.getFields();
                if (!(fields instanceof Collection) || !fields.isEmpty()) {
                    Iterator<T> it = fields.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.d(((FormBuilderBlockVO.Field) it.next()).getName(), fieldName)) {
                            formBuilderBlockVO = formBuilderBlockVO2;
                            break;
                        }
                    }
                }
                formBuilderBlockVO = null;
                if (formBuilderBlockVO != null) {
                    List<FormBuilderBlockVO.Field> fields2 = formBuilderBlockVO.getFields();
                    ArrayList arrayList2 = new ArrayList(C7714v.z(fields2, 10));
                    for (FormBuilderBlockVO.Field field : fields2) {
                        FormBuilderBlockVO.Field field2 = Intrinsics.d(field.getName(), fieldName) ? field : null;
                        if (field2 != null) {
                            FormBuilderBlockVO.Field.ChipsField chipsField = field2 instanceof FormBuilderBlockVO.Field.ChipsField ? (FormBuilderBlockVO.Field.ChipsField) field2 : null;
                            if (chipsField != null && (copy$default = FormBuilderBlockVO.Field.ChipsField.copy$default(chipsField, null, null, 0, false, chipsWithField, null, 15, null)) != null) {
                                field = copy$default;
                            }
                        }
                        arrayList2.add(field);
                    }
                    FormBuilderBlockVO copy$default2 = FormBuilderBlockVO.copy$default(formBuilderBlockVO, null, null, 0, arrayList2, false, 23, null);
                    if (copy$default2 != null) {
                        formBuilderBlockVO2 = copy$default2;
                    }
                }
                arrayList.add(formBuilderBlockVO2);
            }
            return arrayList;
        }

        private final List<FormBuilderBlockVO> changeSelectorFieldSelectedOption(List<FormBuilderBlockVO> form, String fieldName, FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option option) {
            FormBuilderBlockVO formBuilderBlockVO;
            String str;
            List<FormBuilderBlockVO> list = form;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            for (FormBuilderBlockVO formBuilderBlockVO2 : list) {
                List<FormBuilderBlockVO.Field> fields = formBuilderBlockVO2.getFields();
                if (!(fields instanceof Collection) || !fields.isEmpty()) {
                    Iterator<T> it = fields.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.d(((FormBuilderBlockVO.Field) it.next()).getName(), fieldName)) {
                            formBuilderBlockVO = formBuilderBlockVO2;
                            break;
                        }
                    }
                }
                formBuilderBlockVO = null;
                if (formBuilderBlockVO != null) {
                    List<FormBuilderBlockVO.Field> fields2 = formBuilderBlockVO.getFields();
                    ArrayList arrayList2 = new ArrayList(C7714v.z(fields2, 10));
                    for (FormBuilderBlockVO.Field field : fields2) {
                        FormBuilderBlockVO.Field field2 = Intrinsics.d(field.getName(), fieldName) ? field : null;
                        if (field2 != null) {
                            FormBuilderBlockVO.Field.SelectorField selectorField = (FormBuilderBlockVO.Field.SelectorField) field2;
                            if (option == null || (str = option.getValue()) == null) {
                                str = "";
                            }
                            FormBuilderBlockVO.Field.SelectorField copy$default = FormBuilderBlockVO.Field.SelectorField.copy$default(selectorField, null, null, 0, false, null, OzonSpannableStringKt.orEmpty(option != null ? option.getText() : null), str, null, null, 415, null);
                            if (copy$default != null) {
                                field = copy$default;
                            }
                        }
                        arrayList2.add(field);
                    }
                    FormBuilderBlockVO copy$default2 = FormBuilderBlockVO.copy$default(formBuilderBlockVO, null, null, 0, arrayList2, false, 23, null);
                    if (copy$default2 != null) {
                        formBuilderBlockVO2 = copy$default2;
                    }
                }
                arrayList.add(formBuilderBlockVO2);
            }
            return arrayList;
        }

        private final List<FormBuilderBlockVO> changeTextFieldValue(List<FormBuilderBlockVO> form, String fieldName, String text) {
            FormBuilderBlockVO formBuilderBlockVO;
            FormBuilderBlockVO.Field.TextField copy$default;
            List<FormBuilderBlockVO> list = form;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            for (FormBuilderBlockVO formBuilderBlockVO2 : list) {
                List<FormBuilderBlockVO.Field> fields = formBuilderBlockVO2.getFields();
                if (!(fields instanceof Collection) || !fields.isEmpty()) {
                    Iterator<T> it = fields.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.d(((FormBuilderBlockVO.Field) it.next()).getName(), fieldName)) {
                            formBuilderBlockVO = formBuilderBlockVO2;
                            break;
                        }
                    }
                }
                formBuilderBlockVO = null;
                if (formBuilderBlockVO != null) {
                    List<FormBuilderBlockVO.Field> fields2 = formBuilderBlockVO.getFields();
                    ArrayList arrayList2 = new ArrayList(C7714v.z(fields2, 10));
                    for (FormBuilderBlockVO.Field field : fields2) {
                        FormBuilderBlockVO.Field field2 = Intrinsics.d(field.getName(), fieldName) ? field : null;
                        if (field2 != null && (copy$default = FormBuilderBlockVO.Field.TextField.copy$default((FormBuilderBlockVO.Field.TextField) field2, null, null, 0, false, null, text, null, null, 223, null)) != null) {
                            field = copy$default;
                        }
                        arrayList2.add(field);
                    }
                    FormBuilderBlockVO copy$default2 = FormBuilderBlockVO.copy$default(formBuilderBlockVO, null, null, 0, arrayList2, false, 23, null);
                    if (copy$default2 != null) {
                        formBuilderBlockVO2 = copy$default2;
                    }
                }
                arrayList.add(formBuilderBlockVO2);
            }
            return arrayList;
        }

        private final List<FormBuilderBlockVO> changeYandexSearchFieldValue(List<FormBuilderBlockVO> form, String fieldName, String text) {
            FormBuilderBlockVO formBuilderBlockVO;
            FormBuilderBlockVO.Field.YandexSearchField copy$default;
            List<FormBuilderBlockVO> list = form;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            for (FormBuilderBlockVO formBuilderBlockVO2 : list) {
                List<FormBuilderBlockVO.Field> fields = formBuilderBlockVO2.getFields();
                if (!(fields instanceof Collection) || !fields.isEmpty()) {
                    Iterator<T> it = fields.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.d(((FormBuilderBlockVO.Field) it.next()).getName(), fieldName)) {
                            formBuilderBlockVO = formBuilderBlockVO2;
                            break;
                        }
                    }
                }
                formBuilderBlockVO = null;
                if (formBuilderBlockVO != null) {
                    List<FormBuilderBlockVO.Field> fields2 = formBuilderBlockVO.getFields();
                    ArrayList arrayList2 = new ArrayList(C7714v.z(fields2, 10));
                    for (FormBuilderBlockVO.Field field : fields2) {
                        FormBuilderBlockVO.Field field2 = Intrinsics.d(field.getName(), fieldName) ? field : null;
                        if (field2 != null && (copy$default = FormBuilderBlockVO.Field.YandexSearchField.copy$default((FormBuilderBlockVO.Field.YandexSearchField) field2, null, null, 0, false, null, OzonSpannableStringKt.toOzonSpannableString(text), null, null, null, null, 991, null)) != null) {
                            field = copy$default;
                        }
                        arrayList2.add(field);
                    }
                    FormBuilderBlockVO copy$default2 = FormBuilderBlockVO.copy$default(formBuilderBlockVO, null, null, 0, arrayList2, false, 23, null);
                    if (copy$default2 != null) {
                        formBuilderBlockVO2 = copy$default2;
                    }
                }
                arrayList.add(formBuilderBlockVO2);
            }
            return arrayList;
        }

        public final List<FormBuilderBlockVO> changeFormByUpdate(@NotNull a.J.InterfaceC0007a update, List<FormBuilderBlockVO> form) {
            Intrinsics.checkNotNullParameter(update, "update");
            if (form != null) {
                if (update instanceof FormBuilderFieldUpdate.FormBuilderSelectorFieldUpdate) {
                    FormBuilderFieldUpdate.FormBuilderSelectorFieldUpdate formBuilderSelectorFieldUpdate = (FormBuilderFieldUpdate.FormBuilderSelectorFieldUpdate) update;
                    return INSTANCE.changeSelectorFieldSelectedOption(form, formBuilderSelectorFieldUpdate.getFieldName(), formBuilderSelectorFieldUpdate.getSelectedOption());
                }
                if (update instanceof FormBuilderFieldUpdate.FormBuilderTextFieldUpdate) {
                    FormBuilderFieldUpdate.FormBuilderTextFieldUpdate formBuilderTextFieldUpdate = (FormBuilderFieldUpdate.FormBuilderTextFieldUpdate) update;
                    return INSTANCE.changeTextFieldValue(form, formBuilderTextFieldUpdate.getFieldName(), formBuilderTextFieldUpdate.getText());
                }
                if (update instanceof FormBuilderFieldUpdate.FormBuilderYandexSearchFieldUpdate) {
                    FormBuilderFieldUpdate.FormBuilderYandexSearchFieldUpdate formBuilderYandexSearchFieldUpdate = (FormBuilderFieldUpdate.FormBuilderYandexSearchFieldUpdate) update;
                    return INSTANCE.changeYandexSearchFieldValue(form, formBuilderYandexSearchFieldUpdate.getFieldName(), formBuilderYandexSearchFieldUpdate.getText());
                }
                if (update instanceof FormBuilderFieldUpdate.FormBuilderChipsFieldUpdate) {
                    FormBuilderFieldUpdate.FormBuilderChipsFieldUpdate formBuilderChipsFieldUpdate = (FormBuilderFieldUpdate.FormBuilderChipsFieldUpdate) update;
                    return INSTANCE.changeChipsField(form, formBuilderChipsFieldUpdate.getFieldName(), formBuilderChipsFieldUpdate.getChipsWithField());
                }
            }
            return null;
        }

        public final boolean checkChangeFieldPossibility(@NotNull a.J.InterfaceC0007a update, List<FormBuilderBlockVO> form) {
            Intrinsics.checkNotNullParameter(update, "update");
            if (!(update instanceof FormBuilderFieldUpdate) || form == null) {
                return false;
            }
            List<FormBuilderBlockVO> list = form;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List<FormBuilderBlockVO.Field> fields = ((FormBuilderBlockVO) it.next()).getFields();
                if (!(fields instanceof Collection) || !fields.isEmpty()) {
                    Iterator<T> it2 = fields.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.d(((FormBuilderBlockVO.Field) it2.next()).getName(), ((FormBuilderFieldUpdate) update).getFieldName())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        @NotNull
        public final List<Class<? extends a.J.InterfaceC0007a>> getConsumeEvents() {
            return consumeEvents;
        }
    }

    static {
        Class[] elements = {YandexSearchSheetResultConfigurator.class, OptionsSelectorSheetResultConfigurator.class, SearchSheetResultConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        configurators = C7705l.j0(elements);
    }

    private FormBuilderHelper() {
    }

    @NotNull
    public final Set<Class<? extends ComposerScreenConfig.PageConfigurator>> getConfigurators() {
        return configurators;
    }
}
