package ru.ozon.app.android.geo.addresseditconfirmbutton.sticky;

import fd.InterfaceC6511n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.geo.addresseditconfirmbutton.FormDataUpdateHelper;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "formInfo", "", "", "link", "silent", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditConfirmButtonStickyViewMapper$createHolder$3 extends AbstractC7737t implements InterfaceC6511n<Map<String, ? extends String>, String, Boolean, Unit> {
    final /* synthetic */ i $container;
    final /* synthetic */ AddressEditConfirmButtonStickyViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditConfirmButtonStickyViewMapper$createHolder$3(AddressEditConfirmButtonStickyViewMapper addressEditConfirmButtonStickyViewMapper, i iVar) {
        super(3);
        this.this$0 = addressEditConfirmButtonStickyViewMapper;
        this.$container = iVar;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends String> map, String str, Boolean bool) {
        invoke((Map<String, String>) map, str, bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(Map<String, String> formInfo, String link, boolean z11) {
        FormDataUpdateHelper formDataUpdateHelper;
        Intrinsics.checkNotNullParameter(formInfo, "formInfo");
        Intrinsics.checkNotNullParameter(link, "link");
        formDataUpdateHelper = this.this$0.formDataUpdateHelper;
        formDataUpdateHelper.sendFormData(formInfo, link, this.$container.M(), z11);
    }
}
