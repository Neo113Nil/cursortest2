package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentricHeader;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentricHeader/MediaCentricHeaderView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentricHeader/MediaCentricHeaderVO;", "item", "", "bind", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentricHeader/MediaCentricHeaderVO;)V", "Lru/ozon/uni/android/atom/icon/IconView;", "iconView$delegate", "LSc/j;", "getIconView", "()Lru/ozon/uni/android/atom/icon/IconView;", "iconView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "ratingText$delegate", "getRatingText", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "ratingText", "separatorView$delegate", "getSeparatorView", "separatorView", "dateText$delegate", "getDateText", "dateText", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaCentricHeaderView extends LinearLayout {

    /* renamed from: dateText$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dateText;

    /* renamed from: iconView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconView;

    /* renamed from: ratingText$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ratingText;

    /* renamed from: separatorView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j separatorView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCentricHeaderView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.iconView = k.b(new MediaCentricHeaderView$iconView$2(context, this));
        this.ratingText = k.b(new MediaCentricHeaderView$ratingText$2(context, this));
        this.separatorView = k.b(new MediaCentricHeaderView$separatorView$2(context, this));
        this.dateText = k.b(new MediaCentricHeaderView$dateText$2(context, this));
    }

    private final TextAtomV2View getDateText() {
        return (TextAtomV2View) this.dateText.getValue();
    }

    private final IconView getIconView() {
        return (IconView) this.iconView.getValue();
    }

    private final TextAtomV2View getRatingText() {
        return (TextAtomV2View) this.ratingText.getValue();
    }

    private final TextAtomV2View getSeparatorView() {
        return (TextAtomV2View) this.separatorView.getValue();
    }

    public final void bind(@NotNull MediaCentricHeaderVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        IconDTO ratingIcon = item.getRatingIcon();
        if (ratingIcon != null) {
            IconHolderKt.bindOrGone$default(getIconView(), ratingIcon, null, 2, null);
        }
        TextDTO ratingValue = item.getRatingValue();
        if (ratingValue != null) {
            TextHolderKt.bindOrGone$default(getRatingText(), ratingValue, null, 2, null);
        }
        TextDTO separator = item.getSeparator();
        if (separator != null) {
            TextHolderKt.bindOrGone$default(getSeparatorView(), separator, null, 2, null);
        }
        TextDTO date = item.getDate();
        if (date != null) {
            TextHolderKt.bindOrGone$default(getDateText(), date, null, 2, null);
        }
    }
}
