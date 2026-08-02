package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views;

import FV.a;
import WZ.l;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricVO;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricImageViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricItemViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO$Image;", "Lru/ozon/uni/android/atom/image/Image;", "imageView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/uni/android/atom/image/Image;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "item", "bind", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO$Image;)V", "Lru/ozon/uni/android/atom/image/Image;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaCentricImageViewHolder extends MediaCentricItemViewHolder<MediaCentricVO.MediaItemVO.Image> {
    public static final int $stable = Image.$stable;

    @NotNull
    private final Image imageView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCentricImageViewHolder(@NotNull Image imageView, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics) {
        super(tokenizedAnalytics, imageView, null);
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.imageView = imageView;
        imageView.setOnClickListener(new a(0, this, actionHandler));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(MediaCentricImageViewHolder mediaCentricImageViewHolder, Function1 function1, View view) {
        AtomAction clickAction;
        MediaCentricVO.MediaItemVO.Image item = mediaCentricImageViewHolder.getItem();
        if (item == null || (clickAction = item.getClickAction()) == null) {
            return;
        }
        function1.invoke(clickAction);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views.MediaCentricItemViewHolder
    public void bind(@NotNull MediaCentricVO.MediaItemVO.Image item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind((MediaCentricImageViewHolder) item);
        ImageHolderKt.bind$default(this.imageView, item.getImage(), null, 2, null);
    }
}
