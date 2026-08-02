package ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.binder.GalleryV5SingleIconButtonBinder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5ButtonVH;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/BaseGalleryV5ButtonVH;", "view", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5ImageButtonView;", "binder", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/binder/GalleryV5SingleIconButtonBinder;", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5ImageButtonView;Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/binder/GalleryV5SingleIconButtonBinder;)V", "bind", "", "item", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Button;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV5ButtonVH extends BaseGalleryV5ButtonVH {

    @NotNull
    private final GalleryV5SingleIconButtonBinder binder;

    @NotNull
    private final GalleryV5ImageButtonView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV5ButtonVH(@NotNull GalleryV5ImageButtonView view, @NotNull GalleryV5SingleIconButtonBinder binder) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(binder, "binder");
        this.view = view;
        this.binder = binder;
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.BaseGalleryV5ButtonVH
    public void bind(@NotNull GalleryV5VO.Button item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.binder.bind(this.view, item, actionHandler);
    }
}
