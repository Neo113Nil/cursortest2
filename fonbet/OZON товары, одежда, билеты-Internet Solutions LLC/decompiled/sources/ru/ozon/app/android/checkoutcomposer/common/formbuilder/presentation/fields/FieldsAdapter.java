package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields;

import Sc.o;
import Ve.C4636t5;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormConfig;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.ViewType;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.map.databinding.ItemFormBlockFieldActionBinding;
import ru.ozon.app.android.map.databinding.ItemFormBlockFieldAtomsBinding;
import ru.ozon.app.android.map.databinding.ItemFormBlockFieldCheckboxBinding;
import ru.ozon.app.android.map.databinding.ItemFormBlockFieldChipsBinding;
import ru.ozon.app.android.map.databinding.ItemFormBlockFieldSearchBinding;
import ru.ozon.app.android.map.databinding.ItemFormBlockFieldSelectorBinding;
import ru.ozon.app.android.map.databinding.ItemFormBlockFieldTextBinding;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\"\u001a\u00020\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b$\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010%R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R(\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010'R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldVH;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;", "formConfig", "Lkotlin/Function1;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldAction;", "", "onAction", "Lru/ozon/uni/atoms/af/AtomAction;", "onTitleAction", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Landroid/view/View;", "onOnboardingShow", "<init>", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldVH;", "getItemCount", "()I", "holder", "onBindViewHolder", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldVH;I)V", "", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "items", "submitList", "(Ljava/util/List;)V", "getSpanSize", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "fields", "Ljava/util/List;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FieldsAdapter extends RecyclerView.g<FieldVH> {

    @NotNull
    private List<? extends FormBuilderBlockVO.Field> fields;

    @NotNull
    private final FormConfig formConfig;

    @NotNull
    private final Function1<FieldAction, Unit> onAction;
    private final Function2<OnBoardingDTO, View, Unit> onOnboardingShow;

    @NotNull
    private final Function1<AtomAction, Unit> onTitleAction;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewType.values().length];
            try {
                iArr[ViewType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewType.CHECKBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ViewType.SELECTOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ViewType.SEARCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ViewType.YANDEX_SEARCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ViewType.ATOMS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ViewType.ACTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ViewType.FIELD_TYPE_CHIPS_WITH_FIELD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FieldsAdapter(@NotNull FormConfig formConfig, @NotNull Function1<? super FieldAction, Unit> onAction, @NotNull Function1<? super AtomAction, Unit> onTitleAction, Function2<? super OnBoardingDTO, ? super View, Unit> function2) {
        Intrinsics.checkNotNullParameter(formConfig, "formConfig");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(onTitleAction, "onTitleAction");
        this.formConfig = formConfig;
        this.onAction = onAction;
        this.onTitleAction = onTitleAction;
        this.onOnboardingShow = function2;
        this.fields = K.f71697a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.fields.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return this.fields.get(position).getViewType().getId();
    }

    public final int getSpanSize(int position) {
        return this.fields.get(position).getFieldSize();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public FieldVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater a11 = C4636t5.a(parent, "parent");
        for (ViewType viewType2 : ViewType.values()) {
            if (viewType2.getId() == viewType) {
                switch (WhenMappings.$EnumSwitchMapping$0[viewType2.ordinal()]) {
                    case 1:
                        ItemFormBlockFieldTextBinding inflate = ItemFormBlockFieldTextBinding.inflate(a11, parent, false);
                        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
                        return new TextFieldVH(inflate, this.formConfig, this.onAction);
                    case 2:
                        ItemFormBlockFieldCheckboxBinding inflate2 = ItemFormBlockFieldCheckboxBinding.inflate(a11, parent, false);
                        Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
                        return new CheckboxFieldVH(inflate2, this.formConfig, this.onAction);
                    case 3:
                        ItemFormBlockFieldSelectorBinding inflate3 = ItemFormBlockFieldSelectorBinding.inflate(a11, parent, false);
                        Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(...)");
                        return new SelectorFieldVH(inflate3, this.formConfig, this.onAction);
                    case 4:
                        ItemFormBlockFieldSearchBinding inflate4 = ItemFormBlockFieldSearchBinding.inflate(a11, parent, false);
                        Intrinsics.checkNotNullExpressionValue(inflate4, "inflate(...)");
                        return new SearchFieldVH(inflate4, this.formConfig, this.onAction);
                    case 5:
                        ItemFormBlockFieldSearchBinding inflate5 = ItemFormBlockFieldSearchBinding.inflate(a11, parent, false);
                        Intrinsics.checkNotNullExpressionValue(inflate5, "inflate(...)");
                        return new YandexSearchFieldVH(inflate5, this.formConfig, this.onAction);
                    case 6:
                        ItemFormBlockFieldAtomsBinding inflate6 = ItemFormBlockFieldAtomsBinding.inflate(a11, parent, false);
                        Intrinsics.checkNotNullExpressionValue(inflate6, "inflate(...)");
                        return new AtomFieldVH(inflate6, this.formConfig, this.onTitleAction);
                    case 7:
                        ItemFormBlockFieldActionBinding inflate7 = ItemFormBlockFieldActionBinding.inflate(a11, parent, false);
                        Intrinsics.checkNotNullExpressionValue(inflate7, "inflate(...)");
                        return new ActionFieldVH(inflate7, this.formConfig, this.onAction);
                    case 8:
                        ItemFormBlockFieldChipsBinding inflate8 = ItemFormBlockFieldChipsBinding.inflate(a11, parent, false);
                        Intrinsics.checkNotNullExpressionValue(inflate8, "inflate(...)");
                        return new ChipsFieldVH(inflate8, this.onAction, this.onOnboardingShow, this.formConfig);
                    default:
                        throw new o();
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final void submitList(@NotNull List<? extends FormBuilderBlockVO.Field> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        i.c a11 = i.a(new FieldsDiffUtilCallback(this.fields, items), true);
        Intrinsics.checkNotNullExpressionValue(a11, "calculateDiff(...)");
        this.fields = items;
        a11.c(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull FieldVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.fields.get(position));
    }
}
