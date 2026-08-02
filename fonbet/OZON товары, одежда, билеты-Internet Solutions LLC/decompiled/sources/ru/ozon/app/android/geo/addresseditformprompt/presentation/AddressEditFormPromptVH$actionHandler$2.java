package ru.ozon.app.android.geo.addresseditformprompt.presentation;

import W10.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.geo.addresseditformprompt.OpenSearchActionHandler;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetSharedViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditFormPromptVH$actionHandler$2 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ AddressEditFormPromptVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditFormPromptVH$actionHandler$2(AddressEditFormPromptVH addressEditFormPromptVH) {
        super(1);
        this.this$0 = addressEditFormPromptVH;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click it) {
        OpenSearchActionHandler openSearchActionHandler;
        YandexSearchSheetSharedViewModel yandexSearchSheetSharedViewModel;
        ComposerReferences composerReferences;
        Intrinsics.checkNotNullParameter(it, "it");
        openSearchActionHandler = this.this$0.openSearchActionHandler;
        c trackingData = this.this$0.getTrackingData();
        yandexSearchSheetSharedViewModel = this.this$0.yandexSearchSheetSharedViewModel;
        composerReferences = this.this$0.ref;
        openSearchActionHandler.handle(it, trackingData, yandexSearchSheetSharedViewModel, composerReferences.getContainer());
    }
}
