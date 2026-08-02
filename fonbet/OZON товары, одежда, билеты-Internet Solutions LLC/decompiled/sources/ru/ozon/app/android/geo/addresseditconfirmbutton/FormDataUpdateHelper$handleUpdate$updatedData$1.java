package ru.ozon.app.android.geo.addresseditconfirmbutton;

import A00.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.updateevent.FormBuilderFieldUpdate;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "it", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FormDataUpdateHelper$handleUpdate$updatedData$1 extends AbstractC7737t implements Function1<String, Map<String, ? extends String>> {
    final /* synthetic */ AddressEditConfirmButtonVO $oldItem;
    final /* synthetic */ a.J.InterfaceC0007a $update;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FormDataUpdateHelper$handleUpdate$updatedData$1(AddressEditConfirmButtonVO addressEditConfirmButtonVO, a.J.InterfaceC0007a interfaceC0007a) {
        super(1);
        this.$oldItem = addressEditConfirmButtonVO;
        this.$update = interfaceC0007a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Map<String, String> invoke(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Map<String, String> dataForSend = this.$oldItem.getDataForSend();
        if (dataForSend == null) {
            dataForSend = U.c();
        }
        return U.n(dataForSend, new Pair(((FormBuilderFieldUpdate.FormBuilderChipsFieldUpdate) this.$update).getFieldName(), it));
    }
}
