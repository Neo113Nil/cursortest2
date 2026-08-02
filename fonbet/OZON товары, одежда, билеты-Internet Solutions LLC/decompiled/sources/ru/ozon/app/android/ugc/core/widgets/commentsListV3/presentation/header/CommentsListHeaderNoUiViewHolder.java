package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.header;

import android.widget.LinearLayout;
import d20.AbstractC6067d;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/header/CommentsListHeaderNoUiViewHolder;", "Ld20/d;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/header/CommentsHeaderVO;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/header/CommentsHeaderView;", "rootView", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/header/CommentsHeaderView;Ll10/i;Ld20/e;)V", "item", "", "bind", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/header/CommentsHeaderVO;)V", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/header/CommentsHeaderView;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentsListHeaderNoUiViewHolder extends AbstractC6067d<CommentsHeaderVO> {
    public static final int $stable = TextAtomV2View.$stable;

    @NotNull
    private final CommentsHeaderView rootView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentsListHeaderNoUiViewHolder(@NotNull CommentsHeaderView rootView, @NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.rootView = rootView;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull CommentsHeaderVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.rootView.bindNoUiHeader(item);
    }
}
