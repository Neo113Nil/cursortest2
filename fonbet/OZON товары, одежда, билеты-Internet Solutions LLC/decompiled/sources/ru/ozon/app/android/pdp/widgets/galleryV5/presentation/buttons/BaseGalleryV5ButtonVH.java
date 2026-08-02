package ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/BaseGalleryV5ButtonVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Button;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bind", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Button;Lkotlin/jvm/functions/Function1;)V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BaseGalleryV5ButtonVH extends RecyclerView.C {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseGalleryV5ButtonVH(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public abstract void bind(@NotNull GalleryV5VO.Button item, @NotNull Function1<? super AtomAction, Unit> actionHandler);
}
