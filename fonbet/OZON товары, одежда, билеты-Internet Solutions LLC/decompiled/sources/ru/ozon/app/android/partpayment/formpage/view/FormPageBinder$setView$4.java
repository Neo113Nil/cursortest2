package ru.ozon.app.android.partpayment.formpage.view;

import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class FormPageBinder$setView$4 extends C7735q implements InterfaceC6511n<String, String, String, Unit> {
    FormPageBinder$setView$4(Object obj) {
        super(3, obj, FormPageViewModel.class, "onAutocompleteRequested", "onAutocompleteRequested(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, String str3) {
        invoke2(str, str2, str3);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p02, String p12, String p22) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        Intrinsics.checkNotNullParameter(p22, "p2");
        ((FormPageViewModel) this.receiver).onAutocompleteRequested(p02, p12, p22);
    }
}
