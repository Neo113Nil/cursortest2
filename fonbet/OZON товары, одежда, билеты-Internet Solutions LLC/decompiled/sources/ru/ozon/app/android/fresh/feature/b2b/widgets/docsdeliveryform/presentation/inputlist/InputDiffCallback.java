package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.inputlist;

import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormVO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/inputlist/InputDiffCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input;Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input;)Z", "areContentsTheSame", "", "getChangePayload", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input;Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input;)Ljava/lang/Object;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InputDiffCallback extends i.d<DocsDeliveryFormVO.Input> {
    @Override // androidx.recyclerview.widget.i.d
    public boolean areContentsTheSame(@NotNull DocsDeliveryFormVO.Input oldItem, @NotNull DocsDeliveryFormVO.Input newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.i.d
    public boolean areItemsTheSame(@NotNull DocsDeliveryFormVO.Input oldItem, @NotNull DocsDeliveryFormVO.Input newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem.getName(), newItem.getName());
    }

    @Override // androidx.recyclerview.widget.i.d
    public Object getChangePayload(@NotNull DocsDeliveryFormVO.Input oldItem, @NotNull DocsDeliveryFormVO.Input newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if ((oldItem instanceof DocsDeliveryFormVO.Input.TextInput) && (newItem instanceof DocsDeliveryFormVO.Input.TextInput)) {
            ArrayList arrayList = new ArrayList();
            DocsDeliveryFormVO.Input.TextInput textInput = (DocsDeliveryFormVO.Input.TextInput) oldItem;
            DocsDeliveryFormVO.Input.TextInput textInput2 = (DocsDeliveryFormVO.Input.TextInput) newItem;
            if (textInput.getIsEnabled() != textInput2.getIsEnabled()) {
                arrayList.add(TextInputPayload.ENABLED);
            }
            if (!Intrinsics.d(textInput.getError(), textInput2.getError())) {
                arrayList.add(TextInputPayload.ERROR);
            }
            if (!Intrinsics.d(textInput.getValue(), textInput2.getValue())) {
                arrayList.add(TextInputPayload.VALUE);
            }
            return arrayList;
        }
        if (!(oldItem instanceof DocsDeliveryFormVO.Input.CheckBoxInput) || !(newItem instanceof DocsDeliveryFormVO.Input.CheckBoxInput)) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        DocsDeliveryFormVO.Input.CheckBoxInput checkBoxInput = (DocsDeliveryFormVO.Input.CheckBoxInput) oldItem;
        DocsDeliveryFormVO.Input.CheckBoxInput checkBoxInput2 = (DocsDeliveryFormVO.Input.CheckBoxInput) newItem;
        if (checkBoxInput.getChecked() != checkBoxInput2.getChecked()) {
            arrayList2.add(CheckBoxInputPayload.CHECKED);
        }
        if (!Intrinsics.d(checkBoxInput.getLabel(), checkBoxInput2.getLabel())) {
            arrayList2.add(CheckBoxInputPayload.LABEL);
        }
        return arrayList2;
    }
}
