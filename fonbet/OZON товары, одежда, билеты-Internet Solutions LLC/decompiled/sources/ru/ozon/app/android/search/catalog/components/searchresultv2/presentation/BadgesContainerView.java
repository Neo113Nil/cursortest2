package ru.ozon.app.android.search.catalog.components.searchresultv2.presentation;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.utils.BindExtKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u000eJ\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"¨\u0006&"}, d2 = {"Lru/ozon/app/android/search/catalog/components/searchresultv2/presentation/BadgesContainerView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "dto", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadgeFromPool", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)Lru/ozon/uni/android/atom/badge/BadgeView;", "createAtomBadge", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "Lru/ozon/uni/atoms/data/AtomDTO;", "atomDto", "Ljava/lang/Class;", "getViewType", "(Lru/ozon/uni/atoms/data/AtomDTO;)Ljava/lang/Class;", "badge", "addBadge", "", "reset", "()V", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "recycledAtomPool$delegate", "LSc/j;", "getRecycledAtomPool", "()Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "recycledAtomPool", "defaultBadgePaddingInPx", "I", "defaultRightBadgePaddingInPx", "defaultBadgePaddingBetweenInPx", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BadgesContainerView extends LinearLayout {
    private final int defaultBadgePaddingBetweenInPx;
    private final int defaultBadgePaddingInPx;
    private final int defaultRightBadgePaddingInPx;

    /* renamed from: recycledAtomPool$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j recycledAtomPool;
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BadgesContainerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final BadgeView createAtomBadge() {
        q qVar = q.f64554a;
        d b11 = N.b(BadgeView.class);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return (BadgeView) qVar.g(b11, context);
    }

    private final BadgeView getBadgeFromPool(BadgeDTO dto) {
        Atom<AtomDTO, Atom.AtomConfiguration> recycledAtom = getRecycledAtomPool().getRecycledAtom(getViewType(dto), dto.getContext(), getContext());
        View containerView = recycledAtom != null ? recycledAtom.getContainerView() : null;
        if (containerView instanceof BadgeView) {
            return (BadgeView) containerView;
        }
        return null;
    }

    private final RecycledAtomPool getRecycledAtomPool() {
        return (RecycledAtomPool) this.recycledAtomPool.getValue();
    }

    private final Class<?> getViewType(AtomDTO atomDto) {
        return atomDto.getClass();
    }

    @NotNull
    public final BadgeView addBadge(@NotNull BadgeDTO badge) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        BadgeView badgeFromPool = getBadgeFromPool(badge);
        if (badgeFromPool == null) {
            badgeFromPool = createAtomBadge();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = layoutParams.gravity;
        layoutParams.setMargins(this.defaultBadgePaddingInPx, getChildCount() > 0 ? this.defaultBadgePaddingBetweenInPx : 0, this.defaultRightBadgePaddingInPx, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        badgeFromPool.setLayoutParams(layoutParams);
        BadgeHolderKt.bind$default(badgeFromPool, badge, (Function1) null, 2, (Object) null);
        addView(badgeFromPool);
        badgeFromPool.setClickable(false);
        badgeFromPool.setFocusable(false);
        return badgeFromPool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void reset() {
        while (getChildCount() > 0) {
            View view = (View) C7714v.J(ViewGroupExtKt.children(this));
            removeView(view);
            if (view instanceof BadgeView) {
                Atom<AtomDTO, Atom.AtomConfiguration> holder = BindExtKt.getHolder((AtomView) view);
                if (holder == null) {
                    holder = null;
                }
                if (holder != null) {
                    getRecycledAtomPool().putRecycledAtom(getViewType(holder.getData()), holder);
                }
            }
        }
    }

    public /* synthetic */ BadgesContainerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgesContainerView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.recycledAtomPool = k.b(new BadgesContainerView$recycledAtomPool$2(context));
        this.defaultBadgePaddingInPx = ResourceExtKt.toPx(4);
        this.defaultRightBadgePaddingInPx = ResourceExtKt.toPx(8);
        this.defaultBadgePaddingBetweenInPx = ResourceExtKt.toPx(2);
        setOrientation(1);
    }
}
