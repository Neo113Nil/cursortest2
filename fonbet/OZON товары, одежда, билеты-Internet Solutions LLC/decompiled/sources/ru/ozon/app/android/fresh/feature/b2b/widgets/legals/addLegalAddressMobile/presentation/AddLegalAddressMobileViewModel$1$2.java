package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.presentation;

import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.mapcommon.map.OzonSuggestionsController;
import ru.ozon.app.android.mapcommon.map.model.BoundingBoxModel;
import ru.ozon.app.android.mapcommon.mapcommon.SdkSuggestionsControllerWrapper;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", SearchIntents.EXTRA_QUERY, "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddLegalAddressMobileViewModel$1$2 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ AddLegalAddressMobileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddLegalAddressMobileViewModel$1$2(AddLegalAddressMobileViewModel addLegalAddressMobileViewModel) {
        super(1);
        this.this$0 = addLegalAddressMobileViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        SdkSuggestionsControllerWrapper sdkSuggestionsControllerWrapper;
        BoundingBoxModel boundingBoxModel;
        AreaLocalStore areaLocalStore;
        sdkSuggestionsControllerWrapper = this.this$0.suggestionsController;
        Intrinsics.f(str);
        boundingBoxModel = this.this$0.boundingBox;
        areaLocalStore = this.this$0.areaLocalStore;
        OzonSuggestionsController.DefaultImpls.search$default(sdkSuggestionsControllerWrapper, str, null, boundingBoxModel, areaLocalStore.getLocationUid(), 2, null);
    }
}
