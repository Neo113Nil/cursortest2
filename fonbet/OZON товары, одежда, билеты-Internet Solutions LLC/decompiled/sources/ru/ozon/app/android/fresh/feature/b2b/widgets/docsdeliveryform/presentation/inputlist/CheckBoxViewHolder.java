package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.inputlist;

import EJ.a;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.databinding.CheckboxInputItemBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormVO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.inputlist.CheckBoxViewHolder;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/inputlist/CheckBoxViewHolder;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/inputlist/InputViewHolder;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/CheckboxInputItemBinding;", "binding", "Lkotlin/Function2;", "", "", "", "onCheckedChanged", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/CheckboxInputItemBinding;Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input;", "item", "bindItem", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input;)V", "checked", "setChecked", "(Ljava/lang/Boolean;)V", "label", "setLabel", "(Ljava/lang/String;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/CheckboxInputItemBinding;", "Lkotlin/jvm/functions/Function2;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Ljava/lang/String;", "isChecked", "Z", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckBoxViewHolder extends InputViewHolder {

    @NotNull
    private final CheckboxInputItemBinding binding;
    private boolean isChecked;
    private String name;

    @NotNull
    private final Function2<String, Boolean, Unit> onCheckedChanged;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int itemHeight = ResourceExtKt.toPx(44);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/inputlist/CheckBoxViewHolder$Companion;", "", "<init>", "()V", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CheckBoxViewHolder(@NotNull CheckboxInputItemBinding binding, @NotNull Function2<? super String, ? super Boolean, Unit> onCheckedChanged) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onCheckedChanged, "onCheckedChanged");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.onCheckedChanged = onCheckedChanged;
        binding.getConstraintLayout().setOnClickListener(new a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(CheckBoxViewHolder checkBoxViewHolder, View view) {
        String str = checkBoxViewHolder.name;
        if (str != null) {
            checkBoxViewHolder.onCheckedChanged.invoke(str, Boolean.valueOf(!checkBoxViewHolder.isChecked));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindItem$lambda$4$lambda$3$lambda$2(CheckBoxViewHolder checkBoxViewHolder, DocsDeliveryFormVO.Input input, CompoundButton compoundButton, boolean z11) {
        checkBoxViewHolder.onCheckedChanged.invoke(((DocsDeliveryFormVO.Input.CheckBoxInput) input).getName(), Boolean.valueOf(z11));
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.inputlist.InputViewHolder
    public void bindItem(@NotNull final DocsDeliveryFormVO.Input item) {
        Intrinsics.checkNotNullParameter(item, "item");
        DocsDeliveryFormVO.Input.CheckBoxInput checkBoxInput = item instanceof DocsDeliveryFormVO.Input.CheckBoxInput ? (DocsDeliveryFormVO.Input.CheckBoxInput) item : null;
        if (checkBoxInput != null) {
            this.name = checkBoxInput.getName();
            this.isChecked = checkBoxInput.getChecked();
            setChecked(Boolean.valueOf(((DocsDeliveryFormVO.Input.CheckBoxInput) item).getChecked()));
            setLabel(checkBoxInput.getLabel());
            CheckboxInputItemBinding checkboxInputItemBinding = this.binding;
            checkboxInputItemBinding.radioButtonView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Ou.a
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    CheckBoxViewHolder.bindItem$lambda$4$lambda$3$lambda$2(CheckBoxViewHolder.this, item, compoundButton, z11);
                }
            });
            checkboxInputItemBinding.getConstraintLayout().setLayoutParams(new LinearLayout.LayoutParams(-1, itemHeight));
        }
    }

    public final void setChecked(Boolean checked) {
        Boolean bool = Boolean.TRUE;
        this.isChecked = Intrinsics.d(checked, bool);
        this.binding.radioButtonView.setChecked(Intrinsics.d(checked, bool));
    }

    public final void setLabel(String label) {
        this.binding.subtitleTav.setText(label);
    }
}
