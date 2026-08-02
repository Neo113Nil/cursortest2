package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.af.layout.FrameAtomsLayout;
import ru.ozon.app.android.atoms.atom2.InputAtom;
import ru.ozon.app.android.atoms.data.deprecated.Checkbox;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormConfig;
import ru.ozon.app.android.map.databinding.ItemFormBlockFieldCheckboxBinding;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomsAdapter;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/CheckboxFieldVH;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldVH;", "binding", "Lru/ozon/app/android/map/databinding/ItemFormBlockFieldCheckboxBinding;", "formConfig", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;", "onAction", "Lkotlin/Function1;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldAction;", "", "<init>", "(Lru/ozon/app/android/map/databinding/ItemFormBlockFieldCheckboxBinding;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;Lkotlin/jvm/functions/Function1;)V", "fieldsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "bind", "item", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckboxFieldVH extends FieldVH {

    @NotNull
    private final AtomsAdapter fieldsAdapter;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CheckboxFieldVH(@NotNull ItemFormBlockFieldCheckboxBinding binding, @NotNull FormConfig formConfig, @NotNull Function1<? super FieldAction, Unit> onAction) {
        super(r3, formConfig);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(formConfig, "formConfig");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        FrameAtomsLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        AtomsAdapter atomsAdapter = new AtomsAdapter(U.i(new Pair(new Atom.ConfCondition(Checkbox.class, null, 2, null), new InputAtom.Configuration(0, 0, 0, 0, null, null, null, 124, null))), null, null, null, 14, null);
        this.fieldsAdapter = atomsAdapter;
        binding.fieldFAL.setAdapter(atomsAdapter);
    }

    @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.FieldVH
    public void bind(@NotNull FormBuilderBlockVO.Field item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AtomsAdapter atomsAdapter = this.fieldsAdapter;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, C7714v.a0(((FormBuilderBlockVO.Field.CheckboxField) item).getCheckboxAtom()));
    }
}
