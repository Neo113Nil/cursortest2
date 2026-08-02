package ru.ozon.app.android.commonwidgets.widgets.headerWidget.presentation;

import Pc.a;
import android.content.Context;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.commonwidgets.R$dimen;
import ru.ozon.app.android.common.commonwidgets.R$layout;
import ru.ozon.app.android.commonwidgets.widgets.headerWidget.data.PageHeaderDTO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR6\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00110\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR<\u0010\u001f\u001a$\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u001dj\b\u0012\u0004\u0012\u00020\u0003`\u001e0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/headerWidget/presentation/PageHeaderViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/commonwidgets/widgets/headerWidget/data/PageHeaderDTO;", "Lru/ozon/app/android/commonwidgets/widgets/headerWidget/presentation/PageHeaderVO;", "LPc/a;", "Landroid/content/Context;", "context", "<init>", "(LPc/a;)V", "", "stateId", "toVO", "(Lru/ozon/app/android/commonwidgets/widgets/headerWidget/data/PageHeaderDTO;Ljava/lang/String;)Lru/ozon/app/android/commonwidgets/widgets/headerWidget/presentation/PageHeaderVO;", "LPc/a;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PageHeaderViewMapper extends WidgetViewMapper<PageHeaderDTO, PageHeaderVO> {

    @NotNull
    private final a<Context> context;

    @NotNull
    private final Function2<View, ComposerReferences, k<PageHeaderVO>> holderProducer;
    private final int layout;

    @NotNull
    private final Function2<PageHeaderDTO, d, List<PageHeaderVO>> mapper;

    public PageHeaderViewMapper(@NotNull a<Context> context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.mapper = new PageHeaderViewMapper$mapper$1(this);
        this.layout = R$layout.widget_page_header_layout;
        this.holderProducer = PageHeaderViewMapper$holderProducer$1.INSTANCE;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<PageHeaderVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<PageHeaderDTO, d, List<PageHeaderVO>> getMapper() {
        return this.mapper;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @NotNull
    public final PageHeaderVO toVO(@NotNull PageHeaderDTO pageHeaderDTO, @NotNull String stateId) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(pageHeaderDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        String style = pageHeaderDTO.getStyle();
        switch (style.hashCode()) {
            case -851608108:
                if (style.equals("HEADER_STYLE_XL")) {
                    i11 = R$dimen.widget_header_style_xl;
                    i12 = R$dimen.widget_header_style_xl_bottom_padding;
                    break;
                }
                i11 = R$dimen.widget_header_style_m;
                i12 = R$dimen.widget_header_style_m_bottom_padding;
                break;
            case -304565908:
                if (style.equals("HEADER_STYLE_L")) {
                    i11 = R$dimen.widget_header_style_l;
                    i12 = R$dimen.widget_header_style_l_bottom_padding;
                    break;
                }
                i11 = R$dimen.widget_header_style_m;
                i12 = R$dimen.widget_header_style_m_bottom_padding;
                break;
            case -304565907:
                if (style.equals("HEADER_STYLE_M")) {
                    i11 = R$dimen.widget_header_style_m;
                    i12 = R$dimen.widget_header_style_m_bottom_padding;
                    break;
                }
                i11 = R$dimen.widget_header_style_m;
                i12 = R$dimen.widget_header_style_m_bottom_padding;
                break;
            default:
                i11 = R$dimen.widget_header_style_m;
                i12 = R$dimen.widget_header_style_m_bottom_padding;
                break;
        }
        String title = pageHeaderDTO.getTitle();
        return new PageHeaderVO(("HeaderWidget." + stateId + "." + title).hashCode(), pageHeaderDTO.getTitle(), this.context.get().getResources().getDimensionPixelSize(i11), this.context.get().getResources().getDimensionPixelOffset(i12));
    }
}
