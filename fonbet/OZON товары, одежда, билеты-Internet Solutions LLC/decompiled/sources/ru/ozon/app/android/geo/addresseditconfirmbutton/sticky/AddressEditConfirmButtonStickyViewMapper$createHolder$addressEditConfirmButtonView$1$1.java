package ru.ozon.app.android.geo.addresseditconfirmbutton.sticky;

import android.view.ViewGroup;
import j10.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.geo.addresseditconfirmbutton.FormDataUpdateHelper;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "link", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditConfirmButtonStickyViewMapper$createHolder$addressEditConfirmButtonView$1$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ ViewGroup $composerRootView;
    final /* synthetic */ i $container;
    final /* synthetic */ h.a<l> $voHelper;
    final /* synthetic */ AddressEditConfirmButtonStickyViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditConfirmButtonStickyViewMapper$createHolder$addressEditConfirmButtonView$1$1(AddressEditConfirmButtonStickyViewMapper addressEditConfirmButtonStickyViewMapper, ViewGroup viewGroup, i iVar, h.a<l> aVar) {
        super(1);
        this.this$0 = addressEditConfirmButtonStickyViewMapper;
        this.$composerRootView = viewGroup;
        this.$container = iVar;
        this.$voHelper = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String link) {
        FormDataUpdateHelper formDataUpdateHelper;
        Intrinsics.checkNotNullParameter(link, "link");
        formDataUpdateHelper = this.this$0.formDataUpdateHelper;
        formDataUpdateHelper.handleClick(link, this.$composerRootView, this.$container.M(), this.$voHelper);
    }
}
