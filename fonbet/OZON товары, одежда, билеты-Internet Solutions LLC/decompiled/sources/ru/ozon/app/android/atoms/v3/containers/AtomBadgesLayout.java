package ru.ozon.app.android.atoms.v3.containers;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.logger.trace.OzTrace;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.utils.BindExtKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001:B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010%\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0014¢\u0006\u0004\b%\u0010&J%\u0010*\u001a\u00020\f2\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0011¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u001c¢\u0006\u0004\b,\u0010-R&\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00000/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006;"}, d2 = {"Lru/ozon/app/android/atoms/v3/containers/AtomBadgesLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/uni/atoms/data/badge/Badge;", "dto", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadge", "(Lru/ozon/uni/atoms/data/badge/Badge;)Lru/ozon/uni/android/atom/badge/BadgeView;", "createBadge", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "", "position", "matchGravity", "(Ljava/lang/String;)I", "Lru/ozon/uni/atoms/data/AtomDTO;", "atomDto", "Ljava/lang/Class;", "getViewType", "(Lru/ozon/uni/atoms/data/AtomDTO;)Ljava/lang/Class;", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "badgeDTO", "x", "y", "addBadge", "(Lru/ozon/uni/atoms/data/badge/Badge;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/uni/android/atom/badge/BadgeView;", "reset", "()V", "", "Lkotlin/Pair;", "tag", "[Lkotlin/Pair;", "badgeMargin", "I", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "recycledAtomPool$delegate", "LSc/j;", "getRecycledAtomPool", "()Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "recycledAtomPool", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AtomBadgesLayout extends FrameLayout {
    private final int badgeMargin;

    /* renamed from: recycledAtomPool$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j recycledAtomPool;

    @NotNull
    private final Pair<String, AtomBadgesLayout>[] tag;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AtomBadgesLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final BadgeView createBadge() {
        q qVar = q.f64554a;
        d b11 = N.b(BadgeView.class);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return (BadgeView) qVar.g(b11, context);
    }

    private final BadgeView getBadge(Badge dto) {
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final int matchGravity(String position) {
        switch (position.hashCode()) {
            case -1383228885:
                if (position.equals("bottom")) {
                    return 80;
                }
                break;
            case 115029:
                if (position.equals("top")) {
                    return 48;
                }
                break;
            case 3317767:
                if (position.equals("left")) {
                    return 8388611;
                }
                break;
            case 108511772:
                if (position.equals("right")) {
                    return 8388613;
                }
                break;
        }
        throw new IllegalStateException("Unsupported gravity for position: ".concat(position));
    }

    @NotNull
    public final BadgeView addBadge(@NotNull Badge badgeDTO, @NotNull String x11, @NotNull String y11) {
        Intrinsics.checkNotNullParameter(badgeDTO, "badgeDTO");
        Intrinsics.checkNotNullParameter(x11, "x");
        Intrinsics.checkNotNullParameter(y11, "y");
        Pair<String, AtomBadgesLayout>[] pairArr = this.tag;
        OzTrace ozTrace = OzTrace.INSTANCE;
        BadgeView badge = getBadge(badgeDTO);
        if (badge == null) {
            badge = createBadge();
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i11 = this.badgeMargin;
        layoutParams.leftMargin = i11;
        layoutParams.rightMargin = i11;
        layoutParams.topMargin = i11;
        layoutParams.bottomMargin = i11;
        layoutParams.gravity = matchGravity(x11) | matchGravity(y11);
        badge.setLayoutParams(layoutParams);
        BadgeHolderKt.bind$default(badge, badgeDTO, (Function1) null, 2, (Object) null);
        addView(badge);
        return badge;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        Pair<String, AtomBadgesLayout>[] pairArr = this.tag;
        OzTrace ozTrace = OzTrace.INSTANCE;
        super.onLayout(changed, left, top, right, bottom);
        Unit unit = Unit.f71690a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Pair<String, AtomBadgesLayout>[] pairArr = this.tag;
        OzTrace ozTrace = OzTrace.INSTANCE;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Unit unit = Unit.f71690a;
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

    public /* synthetic */ AtomBadgesLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtomBadgesLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.tag = new Pair[]{new Pair("layout", this)};
        this.badgeMargin = ResourceExtKt.toPx(4);
        this.recycledAtomPool = k.b(new AtomBadgesLayout$recycledAtomPool$2(context));
    }
}
