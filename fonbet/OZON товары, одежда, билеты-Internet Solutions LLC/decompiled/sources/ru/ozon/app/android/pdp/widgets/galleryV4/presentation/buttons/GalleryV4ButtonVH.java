package ru.ozon.app.android.pdp.widgets.galleryV4.presentation.buttons;

import Sx.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/buttons/GalleryV4ButtonVH;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/buttons/BaseGalleryV4ButtonVH;", "view", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/buttons/GalleryV4ImageButtonView;", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/buttons/GalleryV4ImageButtonView;)V", "bind", "", "item", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Button;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV4ButtonVH extends BaseGalleryV4ButtonVH {

    @NotNull
    private final GalleryV4ImageButtonView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV4ButtonVH(@NotNull GalleryV4ImageButtonView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(Function1 function1, GalleryV4VO.Button button, View view) {
        function1.invoke(button.getAction());
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.buttons.BaseGalleryV4ButtonVH
    public void bind(@NotNull GalleryV4VO.Button item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.view.bind(item.getIcon());
        this.view.setOnClickListener(new a(1, actionHandler, item));
    }
}
