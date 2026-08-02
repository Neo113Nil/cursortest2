package ru.ozon.app.android.universalwidgets.widgets.uw.badgescontainer;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.utils.BindExtKt;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 ?2\u00020\u0001:\u0001?B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\"\u0010\u000eJ7\u0010)\u001a\u00020\f2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0014¢\u0006\u0004\b)\u0010*J)\u0010.\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010\u00132\b\u0010,\u001a\u0004\u0018\u00010\u00132\u0006\u0010-\u001a\u00020\u0006¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\f¢\u0006\u0004\b0\u00101R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001c\u00108\u001a\u00020\u00068B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010=¨\u0006@"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/badgescontainer/HorizontalBadgesContainerView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "containerWidth", "containerHalfWidth", "", "adjustBadgesSize", "(II)V", "Lru/ozon/uni/android/atom/badge/BadgeView;", "view", "clearBadge", "(Lru/ozon/uni/android/atom/badge/BadgeView;)V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "createBadge", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)Lru/ozon/uni/android/atom/badge/BadgeView;", "dto", "getBadgeFromPool", "createAtomBadge", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "Lru/ozon/uni/atoms/data/AtomDTO;", "atomDto", "Ljava/lang/Class;", "getViewType", "(Lru/ozon/uni/atoms/data/AtomDTO;)Ljava/lang/Class;", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "firstHorizontalBadge", "secondHorizontalBadge", "margin", "bindBadges", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;I)V", "reset", "()V", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "recycledAtomPool$delegate", "LSc/j;", "getRecycledAtomPool", "()Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "recycledAtomPool", "betweenMargin", "I", "getBetweenMargin", "()I", "firstBadge", "Lru/ozon/uni/android/atom/badge/BadgeView;", "secondBadge", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HorizontalBadgesContainerView extends ViewGroup {
    private int betweenMargin;
    private BadgeView firstBadge;

    /* renamed from: recycledAtomPool$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j recycledAtomPool;
    private BadgeView secondBadge;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalBadgesContainerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void adjustBadgesSize(int containerWidth, int containerHalfWidth) {
        BadgeView badgeView;
        BadgeView badgeView2 = this.firstBadge;
        int measuredWidth = badgeView2 != null ? badgeView2.getMeasuredWidth() : 0;
        BadgeView badgeView3 = this.secondBadge;
        int measuredWidth2 = (badgeView3 != null ? badgeView3.getMeasuredWidth() : 0) + measuredWidth;
        if (measuredWidth2 <= containerWidth) {
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        if (measuredWidth > containerHalfWidth) {
            BadgeView badgeView4 = this.firstBadge;
            if (badgeView4 != null) {
                badgeView4.measure(View.MeasureSpec.makeMeasureSpec(containerHalfWidth, 1073741824), makeMeasureSpec);
                return;
            }
            return;
        }
        if (measuredWidth2 <= containerWidth || (badgeView = this.secondBadge) == null) {
            return;
        }
        badgeView.measure(View.MeasureSpec.makeMeasureSpec(containerWidth - measuredWidth, 1073741824), makeMeasureSpec);
    }

    private final void clearBadge(BadgeView view) {
        removeView(view);
        AtomV3<AtomDTO, ? extends View> holder = BindExtKt.getHolder(view);
        if (holder == null) {
            holder = null;
        }
        if (holder == null) {
            return;
        }
        getRecycledAtomPool().putRecycledAtom(getViewType(holder.getData()), holder);
    }

    private final BadgeView createAtomBadge() {
        q qVar = q.f64554a;
        d b11 = N.b(BadgeView.class);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return (BadgeView) qVar.g(b11, context);
    }

    private final BadgeView createBadge(BadgeDTO badge) {
        BadgeView badgeFromPool = getBadgeFromPool(badge);
        if (badgeFromPool == null) {
            badgeFromPool = createAtomBadge();
        }
        badgeFromPool.setClickable(false);
        badgeFromPool.setFocusable(false);
        BadgeHolderKt.bind$default(badgeFromPool, badge, (Function1) null, 2, (Object) null);
        addView(badgeFromPool);
        return badgeFromPool;
    }

    private final BadgeView getBadgeFromPool(BadgeDTO dto) {
        Atom<AtomDTO, Atom.AtomConfiguration> recycledAtom = getRecycledAtomPool().getRecycledAtom(getViewType(dto), dto.getContext(), getContext());
        View containerView = recycledAtom != null ? recycledAtom.getContainerView() : null;
        if (containerView instanceof BadgeView) {
            return (BadgeView) containerView;
        }
        return null;
    }

    private final int getBetweenMargin() {
        if (this.firstBadge == null || this.secondBadge == null) {
            return 0;
        }
        return this.betweenMargin;
    }

    private final RecycledAtomPool getRecycledAtomPool() {
        return (RecycledAtomPool) this.recycledAtomPool.getValue();
    }

    private final Class<?> getViewType(AtomDTO atomDto) {
        return atomDto.getClass();
    }

    public final void bindBadges(BadgeDTO firstHorizontalBadge, BadgeDTO secondHorizontalBadge, int margin) {
        reset();
        this.betweenMargin = margin;
        this.firstBadge = firstHorizontalBadge != null ? createBadge(firstHorizontalBadge) : null;
        this.secondBadge = secondHorizontalBadge != null ? createBadge(secondHorizontalBadge) : null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
        BadgeView badgeView = this.firstBadge;
        if (badgeView != null) {
            LayoutExtKt.layoutLeftTop(badgeView, getPaddingStart(), getPaddingTop());
        }
        int betweenMargin = this.firstBadge != null ? getBetweenMargin() : 0;
        BadgeView badgeView2 = this.secondBadge;
        if (badgeView2 != null) {
            BadgeView badgeView3 = this.firstBadge;
            LayoutExtKt.layoutLeftTop(badgeView2, (badgeView3 != null ? badgeView3.getRight() : getPaddingStart()) + betweenMargin, getPaddingTop());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingStart()) - getPaddingEnd();
        int betweenMargin = size - getBetweenMargin();
        int i11 = betweenMargin / 2;
        BadgeView badgeView = this.firstBadge;
        if (badgeView != null) {
            MeasureExtKt.measure(badgeView, size, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        }
        BadgeView badgeView2 = this.firstBadge;
        int i12 = (badgeView2 != null ? badgeView2.getMeasuredWidth() : 0) > i11 ? i11 : betweenMargin;
        BadgeView badgeView3 = this.secondBadge;
        if (badgeView3 != null) {
            MeasureExtKt.measure(badgeView3, i12, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        }
        adjustBadgesSize(betweenMargin, i11);
        BadgeView badgeView4 = this.firstBadge;
        int measuredHeight = badgeView4 != null ? badgeView4.getMeasuredHeight() : 0;
        BadgeView badgeView5 = this.secondBadge;
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), getPaddingBottom() + getPaddingTop() + Math.max(measuredHeight, badgeView5 != null ? badgeView5.getMeasuredHeight() : 0));
    }

    public final void reset() {
        BadgeView badgeView = this.firstBadge;
        if (badgeView != null) {
            clearBadge(badgeView);
        }
        BadgeView badgeView2 = this.secondBadge;
        if (badgeView2 != null) {
            clearBadge(badgeView2);
        }
        this.firstBadge = null;
        this.secondBadge = null;
    }

    public /* synthetic */ HorizontalBadgesContainerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalBadgesContainerView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.recycledAtomPool = LazyUtilsKt.unsafeLazy(new HorizontalBadgesContainerView$recycledAtomPool$2(context));
    }
}
