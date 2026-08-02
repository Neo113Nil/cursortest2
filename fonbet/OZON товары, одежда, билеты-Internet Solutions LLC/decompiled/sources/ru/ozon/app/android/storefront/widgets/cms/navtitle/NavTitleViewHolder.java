package ru.ozon.app.android.storefront.widgets.cms.navtitle;

import T00.a;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.navBar.databinding.WidgetNavTitleBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleVO;Ll20/d;)V", "Lru/ozon/app/android/storefront/navBar/databinding/WidgetNavTitleBinding;", "binding", "Lru/ozon/app/android/storefront/navBar/databinding/WidgetNavTitleBinding;", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavTitleViewHolder extends k<NavTitleVO> {

    @NotNull
    private final WidgetNavTitleBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavTitleViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        WidgetNavTitleBinding bind = WidgetNavTitleBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull NavTitleVO item, @NotNull d info) {
        T00.k k11;
        T00.k k12;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        int i11 = item.getAlign() == NavTitleAlign.CENTER ? 1 : 8388611;
        TextView textView = this.binding.titleTv;
        textView.setText(item.getTitle());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String titleColor = item.getTitleColor();
        String str = null;
        if (titleColor == null) {
            a b11 = info.b();
            titleColor = (b11 == null || (k12 = b11.k()) == null) ? null : k12.c();
        }
        StyleParser.OzColor ozColor = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY;
        textView.setTextColor(styleParser.parseColor(context, titleColor, ozColor));
        textView.setGravity(i11);
        TextView textView2 = this.binding.subtitleTv;
        Intrinsics.f(textView2);
        TextViewExtKt.setTextOrGone(textView2, item.getSubtitle());
        Context context2 = textView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        String subtitleColor = item.getSubtitleColor();
        if (subtitleColor == null) {
            a b12 = info.b();
            if (b12 != null && (k11 = b12.k()) != null) {
                str = k11.c();
            }
        } else {
            str = subtitleColor;
        }
        textView2.setTextColor(styleParser.parseColor(context2, str, ozColor));
        String subtitle = item.getSubtitle();
        if (subtitle == null || h.K(subtitle)) {
            return;
        }
        textView2.setGravity(i11);
    }
}
