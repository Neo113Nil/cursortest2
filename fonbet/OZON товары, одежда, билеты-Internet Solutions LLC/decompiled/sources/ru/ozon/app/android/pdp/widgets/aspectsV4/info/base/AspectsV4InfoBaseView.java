package ru.ozon.app.android.pdp.widgets.aspectsV4.info.base;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.mlkit_common.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.aspectsV4.info.base.AspectV4InfoBaseVO;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000 \u0016*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u0016B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u000fH\u0004R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/info/base/AspectsV4InfoBaseView;", "VO", "Lru/ozon/app/android/pdp/widgets/aspectsV4/info/base/AspectV4InfoBaseVO;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "textView", "Landroid/view/View;", "getTextView", "()Landroid/view/View;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "bind", "", "item", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "(Lru/ozon/app/android/pdp/widgets/aspectsV4/info/base/AspectV4InfoBaseVO;Lkotlin/jvm/functions/Function1;)V", "initView", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class AspectsV4InfoBaseView<VO extends AspectV4InfoBaseVO> extends ConstraintLayout {

    @NotNull
    private final BadgeView badgeView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = BadgeView.$stable;
    private static final int BADGE_MAX_WIDTH = ResourceExtKt.toPx(170);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/info/base/AspectsV4InfoBaseView$Companion;", "", "<init>", "()V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectsV4InfoBaseView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        ConstraintLayout.b a11 = a.a(badgeView, R$id.aspectsV4BadgeInfoV, -2, -2);
        a11.f41609P = BADGE_MAX_WIDTH;
        badgeView.setLayoutParams(a11);
        this.badgeView = badgeView;
        setId(R$id.aspectsV4InfoV);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -2);
        Dimens dimens = Dimens.INSTANCE;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = dimens.getDP_8();
        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = dimens.getDP_16();
        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = dimens.getDP_16();
        setLayoutParams(bVar);
    }

    public void bind(@NotNull VO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        BadgeHolderKt.bindOrGone(this.badgeView, item.getBadge(), actionHandler);
    }

    @NotNull
    public abstract View getTextView();

    protected final void initView() {
        addView(getTextView());
        addView(this.badgeView);
        ConstraintLayoutExtKt.updateConstraints(this, new AspectsV4InfoBaseView$initView$1(this));
    }
}
