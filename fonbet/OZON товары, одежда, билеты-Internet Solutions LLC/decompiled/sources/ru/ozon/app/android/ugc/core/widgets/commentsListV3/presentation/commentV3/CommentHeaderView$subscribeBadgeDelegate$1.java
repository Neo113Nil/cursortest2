package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.mlkit_common.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/badge/BadgeView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CommentHeaderView$subscribeBadgeDelegate$1 extends AbstractC7737t implements Function0<BadgeView> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentHeaderView$subscribeBadgeDelegate$1(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BadgeView invoke() {
        BadgeView badgeView = new BadgeView(this.$context, null, 0, 0, 14, null);
        ConstraintLayout.b a11 = a.a(badgeView, R$id.commentSubscribeBadge, -2, -2);
        a11.f41658v = 0;
        a11.f41636i = 0;
        a11.f41642l = 0;
        badgeView.setLayoutParams(a11);
        return badgeView;
    }
}
