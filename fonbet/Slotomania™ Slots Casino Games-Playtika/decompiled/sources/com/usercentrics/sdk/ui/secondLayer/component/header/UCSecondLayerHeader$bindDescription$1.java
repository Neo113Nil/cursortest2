package com.usercentrics.sdk.ui.secondLayer.component.header;

import com.usercentrics.sdk.models.settings.PredefinedUIHtmlLinkType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UCSecondLayerHeader.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class UCSecondLayerHeader$bindDescription$1 extends FunctionReferenceImpl implements Function1<PredefinedUIHtmlLinkType, Unit> {
    UCSecondLayerHeader$bindDescription$1(Object obj) {
        super(1, obj, UCSecondLayerHeaderViewModel.class, "onPredefinedUIHtmlLinkClick", "onPredefinedUIHtmlLinkClick(Lcom/usercentrics/sdk/models/settings/PredefinedUIHtmlLinkType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PredefinedUIHtmlLinkType predefinedUIHtmlLinkType) {
        invoke2(predefinedUIHtmlLinkType);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PredefinedUIHtmlLinkType p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((UCSecondLayerHeaderViewModel) this.receiver).onPredefinedUIHtmlLinkClick(p0);
    }
}
