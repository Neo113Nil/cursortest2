package ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.binder;

import Ql.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5Resources;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.GalleryV5ImageButtonView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/binder/GalleryV5SingleIconButtonBinder;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/binder/BaseGalleryV5ButtonBinder;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5ImageButtonView;", "galleryResources", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5Resources;", "bgColor", "", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5Resources;Ljava/lang/String;)V", "bind", "", "view", "item", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Button;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV5SingleIconButtonBinder extends BaseGalleryV5ButtonBinder<GalleryV5ImageButtonView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV5SingleIconButtonBinder(@NotNull GalleryV5Resources galleryResources, String str) {
        super(galleryResources, str);
        Intrinsics.checkNotNullParameter(galleryResources, "galleryResources");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(Function1 function1, GalleryV5VO.Button button, View view) {
        function1.invoke(button.getAction());
    }

    public void bind(@NotNull GalleryV5ImageButtonView view, @NotNull GalleryV5VO.Button item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        super.bind((GalleryV5SingleIconButtonBinder) view, item, actionHandler);
        view.bind(item.getIcon());
        view.setOnClickListener(new a(1, actionHandler, item));
    }
}
