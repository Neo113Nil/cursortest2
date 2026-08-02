package ru.ozon.uni.atoms.v3.holders.rating;

import Dc0.m;
import Sc.o;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.atom.rating.RatingView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J\u0014\u0010\u0010\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/rating/DsRatingHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "Lru/ozon/uni/android/atom/rating/RatingView;", "Lru/ozon/uni/atoms/v3/holders/WrappedAtomHolder;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/atom/rating/RatingView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "applyStyle", "style", "Lru/ozon/uni/atoms/data/rating/RatingDTO$RatingStyle;", "getStyle", "", "preset", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsRatingHolder extends AtomV3<RatingDTO, RatingView> implements WrappedAtomHolder {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RatingDTO.RatingStyle.values().length];
            try {
                iArr[RatingDTO.RatingStyle.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RatingDTO.RatingStyle.CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RatingDTO.RatingStyle.DEFAULT_ON_DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RatingDTO.RatingStyle.STATIC_ON_DARK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsRatingHolder(@NotNull RatingView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnClickListener(new m(this, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(DsRatingHolder dsRatingHolder, View view) {
        AtomActionDTO action;
        AtomAction atomAction;
        RatingDTO ratingDTO = (RatingDTO) dsRatingHolder.getData();
        CommonControlSettings common = ratingDTO.getCommon();
        if (common != null && (action = common.getAction()) != null && (atomAction = AtomActionMapperKt.toAtomAction(action, ratingDTO.getTrackingInfo())) != null) {
            dsRatingHolder.handleAction(atomAction);
            return;
        }
        Object parent = dsRatingHolder.getContainerView().getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.callOnClick();
        }
    }

    private final void applyStyle(RatingView ratingView, RatingDTO.RatingStyle ratingStyle) {
        ratingView.applyStyle(getStyle(ratingStyle));
    }

    private final int getStyle(RatingDTO.RatingStyle preset) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[preset.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return R$style.Rating_Default;
        }
        if (i11 == 3) {
            return R$style.Rating_DefaultOnDark;
        }
        if (i11 == 4) {
            return R$style.Rating_StaticOnDark;
        }
        throw new o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull RatingDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((DsRatingHolder) item);
        RatingView containerView = getContainerView();
        RatingDTO.RatingSize size = item.getSize();
        if (size == null) {
            size = RatingDTO.RatingSize.SIZE_500;
        }
        containerView.setRatingSize(size);
        Boolean separateClickable = item.getSeparateClickable();
        containerView.setSeparateClickable(separateClickable != null ? separateClickable.booleanValue() : true);
        Float total = item.getTotal();
        containerView.setTotalRating(total != null ? total.floatValue() : 0.0f);
        RatingDTO.RatingStyle style = item.getStyle();
        if (style == null) {
            style = RatingDTO.RatingStyle.DEFAULT;
        }
        applyStyle(containerView, style);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsRatingHolder(@NotNull Context context, String str) {
        this(new RatingView(context, null, 0, 0, 14, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
