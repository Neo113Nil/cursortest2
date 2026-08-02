package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentricHeader;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentricHeader/MediaCentricHeaderVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentricHeader/MediaCentricHeaderVO;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentricHeader/MediaCentricHeaderView;", "containerView", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentricHeader/MediaCentricHeaderView;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentricHeader/MediaCentricHeaderVO;Ll20/d;)V", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentricHeader/MediaCentricHeaderView;", "getContainerView", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentricHeader/MediaCentricHeaderView;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaCentricHeaderVH extends k<MediaCentricHeaderVO> {

    @NotNull
    private final MediaCentricHeaderView containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCentricHeaderVH(@NotNull MediaCentricHeaderView containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull MediaCentricHeaderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.bind(item);
    }
}
