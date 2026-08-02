package ru.ozon.app.android.geo.addresseditconfirmbutton.sticky;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.geo.addresseditconfirmbutton.AddressEditConfirmButtonView;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "view", "Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditConfirmButtonStickyViewMapper$createHolder$4 extends AbstractC7737t implements Function1<AddressEditConfirmButtonView, Unit> {
    final /* synthetic */ ViewGroup $composerRootView;
    final /* synthetic */ AddressEditConfirmButtonStickyViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditConfirmButtonStickyViewMapper$createHolder$4(AddressEditConfirmButtonStickyViewMapper addressEditConfirmButtonStickyViewMapper, ViewGroup viewGroup) {
        super(1);
        this.this$0 = addressEditConfirmButtonStickyViewMapper;
        this.$composerRootView = viewGroup;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AddressEditConfirmButtonView addressEditConfirmButtonView) {
        invoke2(addressEditConfirmButtonView);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AddressEditConfirmButtonView view) {
        ViewGroup findMap;
        Intrinsics.checkNotNullParameter(view, "view");
        findMap = this.this$0.findMap(ComposerViewExtensionKt.composerContainer(this.$composerRootView));
        if (findMap != null) {
            findMap.removeView(view);
        } else {
            ComposerViewExtensionKt.composerBottomContainer(this.$composerRootView).removeView(view);
        }
    }
}
