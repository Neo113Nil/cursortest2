package ru.ozon.app.android.returns.list.presentation.viewHolder.delegate;

import android.content.Context;
import j.C7232a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.R$drawable;
import ru.ozon.app.android.returns.list.presentation.viewObject.ReturnPreviewVO;
import ru.ozon.app.android.returns.list.presentation.views.ReturnHeaderView;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/returns/list/presentation/viewHolder/delegate/ReturnHeaderViewHolderDelegate;", "", "headerView", "Lru/ozon/app/android/returns/list/presentation/views/ReturnHeaderView;", "<init>", "(Lru/ozon/app/android/returns/list/presentation/views/ReturnHeaderView;)V", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/returns/list/presentation/viewObject/ReturnPreviewVO$Header;", "bind", "", "bind$details_prodGoogleAllVendorsRelease", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnHeaderViewHolderDelegate {
    private ReturnPreviewVO.Header header;

    @NotNull
    private final ReturnHeaderView headerView;

    public ReturnHeaderViewHolderDelegate(@NotNull ReturnHeaderView headerView) {
        Intrinsics.checkNotNullParameter(headerView, "headerView");
        this.headerView = headerView;
        headerView.setBackground(C7232a.a(headerView.getContext(), R$drawable.bg_rounded_top_corners));
    }

    public final void bind$details_prodGoogleAllVendorsRelease(@NotNull ReturnPreviewVO.Header header) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.header = header;
        ReturnHeaderView returnHeaderView = this.headerView;
        Integer num = null;
        TextHolderKt.bindOrGone$default(returnHeaderView.getTitleView(), header.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(returnHeaderView.getSubtitleView(), header.getSubtitle(), null, 2, null);
        IconHolderKt.bindOrGone$default(returnHeaderView.getIconView(), header.getIcon(), null, 2, null);
        String separatorColor = header.getSeparatorColor();
        if (separatorColor != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = returnHeaderView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            num = styleParser.parseColor(context, separatorColor);
        }
        if (num == null) {
            ViewExtKt.gone(returnHeaderView.getSeparatorView());
        } else {
            returnHeaderView.getSeparatorView().setBackgroundColor(num.intValue());
            ViewExtKt.show(returnHeaderView.getSeparatorView());
        }
    }
}
