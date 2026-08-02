package ru.ozon.app.android.returns.listEmpty.presentation;

import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.returns.listEmpty.presentation.TextBlockVO;
import ru.ozon.app.android.returns.listEmpty.presentation.util.TextBlockOutlineProvider;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u0000H$¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000b0\u001c8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/returns/listEmpty/presentation/TextBlockViewHolder;", "Lru/ozon/app/android/returns/listEmpty/presentation/TextBlockVO;", "T", "Lru/ozon/composer/ui/widget/k;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/returns/listEmpty/presentation/TextBlockVO;Ll20/d;)V", "bindContent", "(Lru/ozon/app/android/returns/listEmpty/presentation/TextBlockVO;)V", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "imageView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getHeaderTextAtomView", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "headerTextAtomView", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "getLargeButtonView", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "largeButtonView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class TextBlockViewHolder<T extends TextBlockVO> extends k<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextBlockViewHolder(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        itemView.setOutlineProvider(new TextBlockOutlineProvider());
        itemView.setClipToOutline(true);
    }

    protected abstract void bindContent(@NotNull T item);

    @NotNull
    protected abstract Function1<AtomAction, Unit> getActionHandler();

    @NotNull
    protected abstract TextAtomView getHeaderTextAtomView();

    @NotNull
    protected abstract ImageView getImageView();

    @NotNull
    protected abstract LargeButtonView getLargeButtonView();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull T item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Integer parseColor = StyleParser.INSTANCE.parseColor(getContext(), item.getColor());
        if (parseColor != null) {
            this.itemView.setBackgroundColor(parseColor.intValue());
        }
        ImageViewExtKt.load$default(getImageView(), item.getImage(), null, null, null, item.getImageSize(), false, null, 110, null);
        TextAtomHolderKt.bind(getHeaderTextAtomView(), item.getHeader(), getActionHandler());
        bindContent(item);
        LargeButtonHolderKt.bindOrGone(getLargeButtonView(), item.getCallToAction(), getActionHandler());
    }
}
