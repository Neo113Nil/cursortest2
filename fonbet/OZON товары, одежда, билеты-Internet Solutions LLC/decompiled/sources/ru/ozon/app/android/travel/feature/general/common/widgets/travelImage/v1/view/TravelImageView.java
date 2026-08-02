package ru.ozon.app.android.travel.feature.general.common.widgets.travelImage.v1.view;

import Bl.b;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelImage.v1.presentation.TravelImageVO;
import ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelImage/v1/view/TravelImageView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "imageView", "Lru/ozon/uni/android/atom/image/Image;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "action", "bind", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelImage/v1/presentation/TravelImageVO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelImageView extends FrameLayout {
    private AtomAction action;

    @NotNull
    private final Image imageView;
    private Function1<? super AtomAction, Unit> onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelImageView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Image image = (Image) b.a(Image.class, "type", q.f64554a, null);
        image = image == null ? new Image(context, null, 0, 6, null) : image;
        image.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(image);
        this.imageView = image;
        setOnClickListener(new AD.b(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(TravelImageView travelImageView, View view) {
        Function1<? super AtomAction, Unit> function1;
        AtomAction atomAction = travelImageView.action;
        if (atomAction == null || (function1 = travelImageView.onAction) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    public final void bind(@NotNull TravelImageVO item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.onAction = onAction;
        this.action = item.getAction();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(styleParser.parseColorInt(context, item.getBackgroundColor(), 0));
        ImageHolderKt.bind$default(this.imageView, item.getImage(), null, 2, null);
        ViewExtensionsKt.safeUpdateMargins(this.imageView, Integer.valueOf(item.getMargins().getTop()), Integer.valueOf(item.getMargins().getBottom()), Integer.valueOf(item.getMargins().getStart()), Integer.valueOf(item.getMargins().getEnd()));
    }
}
