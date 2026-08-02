package ru.ozon.app.android.returns.creation.pageconfigurators;

import Hi.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewModel.ButtonsViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class PhotoPickerConfigurator$onComposerInitialized$1$1$1 extends C7735q implements Function1<g, Unit> {
    PhotoPickerConfigurator$onComposerInitialized$1$1$1(Object obj) {
        super(1, obj, ButtonsViewModel.class, "handleGalleryResult", "handleGalleryResult(Lru/ozon/android/gallery/data/GalleryLaunchResult;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(g gVar) {
        invoke2(gVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(g p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((ButtonsViewModel) this.receiver).handleGalleryResult(p02);
    }
}
