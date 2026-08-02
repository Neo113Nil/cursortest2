package ru.ozon.app.android.storefront.widgets.cms.richtext.widget;

import GZ.g;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.cms.databinding.TextBlockWidgetBinding;
import ru.ozon.app.android.storefront.widgets.cms.richtext.RichTextWidgetVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.html.spans.OzonClickableSpan;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/richtext/widget/RichTextWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/cms/richtext/RichTextWidgetVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "LGZ/g;", "router", "<init>", "(Landroid/view/View;LGZ/g;)V", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "text", "", "showDialog", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "", ImagesContract.URL, "onClick", "(Ljava/lang/String;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/storefront/widgets/cms/richtext/RichTextWidgetVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "LGZ/g;", "Lru/ozon/app/android/storefront/widgets/cms/databinding/TextBlockWidgetBinding;", "binding", "Lru/ozon/app/android/storefront/widgets/cms/databinding/TextBlockWidgetBinding;", "Ll20/d;", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RichTextWidgetViewHolder extends k<RichTextWidgetVO> {

    @NotNull
    private final TextBlockWidgetBinding binding;

    @NotNull
    private final View containerView;
    private d info;

    @NotNull
    private final g router;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichTextWidgetViewHolder(@NotNull View containerView, @NotNull g router) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(router, "router");
        this.containerView = containerView;
        this.router = router;
        TextBlockWidgetBinding bind = TextBlockWidgetBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        bind.textBlockWidgetTv.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClick(String url) {
        g.a.a(this.router, url, null, null, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDialog(OzonSpannableString text) {
        Context context = getContext();
        Intrinsics.g(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        G supportFragmentManager = ((r) context).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RichTextWidgetDialog.INSTANCE.newInstance(text).show(supportFragmentManager, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull RichTextWidgetVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.info = info;
        Integer backgroundColor = item.getBackgroundColor();
        if (backgroundColor != null) {
            this.itemView.setBackgroundColor(backgroundColor.intValue());
        }
        Integer textColor = item.getTextColor();
        if (textColor != null) {
            this.binding.textBlockWidgetTv.setTextColor(textColor.intValue());
        }
        TextView textView = this.binding.textBlockWidgetTv;
        OzonClickableSpan.Companion companion = OzonClickableSpan.INSTANCE;
        OzonUrlSpan.Companion companion2 = OzonUrlSpan.INSTANCE;
        OzonSpannableString text = item.getText();
        TextView textBlockWidgetTv = this.binding.textBlockWidgetTv;
        Intrinsics.checkNotNullExpressionValue(textBlockWidgetTv, "textBlockWidgetTv");
        OzonSpannableString onUrlSpanClick = companion2.setOnUrlSpanClick(text, textBlockWidgetTv, new RichTextWidgetViewHolder$bind$3(this));
        TextView textBlockWidgetTv2 = this.binding.textBlockWidgetTv;
        Intrinsics.checkNotNullExpressionValue(textBlockWidgetTv2, "textBlockWidgetTv");
        textView.setText(companion.setOnClickableSpanClick(onUrlSpanClick, textBlockWidgetTv2, new RichTextWidgetViewHolder$bind$4(item, this)));
    }
}
