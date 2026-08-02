package ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.info;

import FV.c;
import WZ.l;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.GalleryV4ViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/info/GalleryV4InfoVH;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryV4ViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item$Info;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/info/GalleryV4InfoView;", "galleryV4InfoView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/info/GalleryV4InfoView;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "item", "bind", "(Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item$Info;)V", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/info/GalleryV4InfoView;", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV4InfoVH extends GalleryV4ViewHolder<GalleryV4VO.Item.Info> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final GalleryV4InfoView galleryV4InfoView;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GalleryV4InfoVH(@NotNull GalleryV4InfoView galleryV4InfoView, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics) {
        super(galleryV4InfoView);
        Intrinsics.checkNotNullParameter(galleryV4InfoView, "galleryV4InfoView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.galleryV4InfoView = galleryV4InfoView;
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(GalleryV4VO.Item.Info info, GalleryV4InfoVH galleryV4InfoVH, View view) {
        AtomAction action = info.getAction();
        if (action != null) {
            galleryV4InfoVH.actionHandler.invoke(action);
        }
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.GalleryV4ViewHolder
    public void bind(@NotNull GalleryV4VO.Item.Info item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.galleryV4InfoView.bind(item);
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, item.getEvent());
        this.galleryV4InfoView.setOnClickListener(new c(1, item, this));
    }
}
