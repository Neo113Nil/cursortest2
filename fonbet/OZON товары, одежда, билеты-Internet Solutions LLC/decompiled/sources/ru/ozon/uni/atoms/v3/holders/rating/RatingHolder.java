package ru.ozon.uni.atoms.v3.holders.rating;

import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import android.content.Context;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.appearance.atom.RatingAppearance;
import ru.ozon.uni.android.uikit.view.atoms.rating.RatingView;
import ru.ozon.uni.atoms.data.rating.RatingAtom;
import ru.ozon.uni.atoms.extensions.ExtensionsKt;
import ru.ozon.uni.atoms.extensions.ViewExtKt;
import ru.ozon.uni.atoms.v3.AtomV3;

@InterfaceC3999a
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0019\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/rating/RatingHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/rating/RatingAtom;", "Lru/ozon/uni/android/uikit/view/atoms/rating/RatingView;", "view", "", "atomContext", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/rating/RatingView;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/rating/RatingAtom$RatingTheme;", "theme", "", "mapTheme", "(Lru/ozon/uni/atoms/data/rating/RatingAtom$RatingTheme;)I", "item", "", "onBind", "(Lru/ozon/uni/atoms/data/rating/RatingAtom;)V", "xsBottomPadding$delegate", "LSc/j;", "getXsBottomPadding", "()I", "xsBottomPadding", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "appearance", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RatingHolder extends AtomV3<RatingAtom, RatingView> {

    @NotNull
    private final StyleAppearance<RatingView> appearance;

    /* renamed from: xsBottomPadding$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j xsBottomPadding;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RatingAtom.RatingTheme.values().length];
            try {
                iArr[RatingAtom.RatingTheme.THEME_TYPE_XS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RatingAtom.RatingTheme.THEME_TYPE_S.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RatingAtom.RatingTheme.THEME_TYPE_M.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RatingAtom.RatingTheme.THEME_TYPE_L.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RatingAtom.RatingTheme.THEME_TYPE_XL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingHolder(@NotNull RatingView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.xsBottomPadding = k.b(RatingHolder$xsBottomPadding$2.INSTANCE);
        this.appearance = StyleAppearance.INSTANCE.of(new RatingAppearance());
    }

    private final int getXsBottomPadding() {
        return ((Number) this.xsBottomPadding.getValue()).intValue();
    }

    private final int mapTheme(RatingAtom.RatingTheme theme) {
        int i11;
        int i12 = WhenMappings.$EnumSwitchMapping$0[theme.ordinal()];
        if (i12 == 1) {
            i11 = R$style.RatingBarStyle_XS;
        } else if (i12 == 2) {
            i11 = R$style.RatingBarStyle_S;
        } else if (i12 == 3) {
            i11 = R$style.RatingBarStyle_M;
        } else if (i12 == 4) {
            i11 = R$style.RatingBarStyle_L;
        } else {
            if (i12 != 5) {
                throw new o();
            }
            i11 = R$style.RatingBarStyle_XL;
        }
        return ((Number) ExtensionsKt.getExhaustive(Integer.valueOf(i11))).intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull RatingAtom item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((RatingHolder) item);
        RatingView containerView = getContainerView();
        containerView.setRating(item.getRating());
        containerView.setCount(item.getCount());
        StyleAppearance<RatingView> styleAppearance = this.appearance;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        styleAppearance.read(context, mapTheme(item.getTheme()));
        this.appearance.apply(containerView);
        RatingAtom.RatingTheme theme = item.getTheme();
        RatingAtom.RatingTheme ratingTheme = RatingAtom.RatingTheme.THEME_TYPE_XS;
        ViewExtKt.updatePadding$default(containerView, 0, 0, 0, theme == ratingTheme ? getXsBottomPadding() : 0, 7, null);
        RatingView.setMargin$default(containerView, 0, 0, 0, 0, item.getTheme() == ratingTheme ? 14 : 15, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RatingHolder(@NotNull Context context, String str) {
        this((RatingView) q.f64554a.g(N.b(RatingView.class), context), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
