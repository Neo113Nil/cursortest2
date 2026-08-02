package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3;

import Bi.b;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CommentHeaderView$dateTextDelegate$1 extends AbstractC7737t implements Function0<TextAtomV2View> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentHeaderView$dateTextDelegate$1(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TextAtomV2View invoke() {
        TextAtomV2View textAtomV2View = new TextAtomV2View(this.$context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.commentDateText, -2, -2);
        d11.f41636i = 0;
        d11.f41642l = 0;
        d11.f41607N = Dimens.INSTANCE.getDP_48();
        d11.f41616W = true;
        textAtomV2View.setLayoutParams(d11);
        return textAtomV2View;
    }
}
