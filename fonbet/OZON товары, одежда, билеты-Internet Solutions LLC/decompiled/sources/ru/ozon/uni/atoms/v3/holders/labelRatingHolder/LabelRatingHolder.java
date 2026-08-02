package ru.ozon.uni.atoms.v3.holders.labelRatingHolder;

import Cw.b;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.atom.labelRating.LabelRatingView;
import ru.ozon.uni.android.atom.labelRating.data.LabelRatingPreset;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.labelRating.LabelRatingDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.v3.AtomV3;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/labelRatingHolder/LabelRatingHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/labelRating/LabelRatingDTO;", "Lru/ozon/uni/android/atom/labelRating/LabelRatingView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/atom/labelRating/LabelRatingView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "mapRatingDTO", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "getStyleRes", "", "style", "Lru/ozon/uni/atoms/data/labelRating/LabelRatingDTO$LabelRatingStyle;", "mapRatingLabelStyle", "Lru/ozon/uni/atoms/data/rating/RatingDTO$RatingStyle;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LabelRatingHolder extends AtomV3<LabelRatingDTO, LabelRatingView> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LabelRatingDTO.LabelRatingStyle.values().length];
            try {
                iArr[LabelRatingDTO.LabelRatingStyle.DEFAULT_ON_DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelRatingHolder(@NotNull LabelRatingView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnClickListener(new b(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(LabelRatingHolder labelRatingHolder, View view) {
        AtomActionDTO action;
        AtomAction atomAction;
        LabelRatingDTO labelRatingDTO = (LabelRatingDTO) labelRatingHolder.getData();
        if (labelRatingDTO != null && (action = labelRatingDTO.getAction()) != null && (atomAction = AtomActionMapperKt.toAtomAction(action, labelRatingDTO.getTrackingInfo())) != null) {
            labelRatingHolder.handleAction(atomAction);
            return;
        }
        Object parent = labelRatingHolder.getContainerView().getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.callOnClick();
        }
    }

    private final int getStyleRes(LabelRatingDTO.LabelRatingStyle style) {
        return (style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) == 1 ? R$style.LabelRating_DefaultOnDark : R$style.LabelRating_Default;
    }

    private final RatingDTO mapRatingDTO(LabelRatingDTO item) {
        RatingDTO.RatingStyle mapRatingLabelStyle = mapRatingLabelStyle(item.getStyle());
        RatingDTO rating = item.getRating();
        RatingDTO.RatingSize mainPreset = getContainerView().getLabelRatingPreset().getMainPreset();
        CommonControlSettings common = item.getRating().getCommon();
        return RatingDTO.copy$default(rating, mapRatingLabelStyle, mainPreset, common != null ? CommonControlSettings.copy$default(common, null, null, null, 6, null) : null, Boolean.FALSE, null, null, null, 112, null);
    }

    private final RatingDTO.RatingStyle mapRatingLabelStyle(LabelRatingDTO.LabelRatingStyle style) {
        return (style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) == 1 ? RatingDTO.RatingStyle.DEFAULT_ON_DARK : RatingDTO.RatingStyle.DEFAULT;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull LabelRatingDTO item) {
        LabelRatingPreset preset;
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((LabelRatingHolder) item);
        LabelRatingView containerView = getContainerView();
        LabelRatingDTO.LabelRatingPreset preset2 = item.getPreset();
        if (preset2 == null || (preset = preset2.getPreset()) == null) {
            preset = LabelRatingDTO.LabelRatingPreset.HORIZONTAL_END_300.getPreset();
        }
        containerView.setLabelRatingPreset(preset);
        containerView.applyStyle(getStyleRes(item.getStyle()));
        LabelRatingHolderKt.bindCellData(containerView, mapRatingDTO(item), item.getLabel());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LabelRatingHolder(@NotNull Context context, String str) {
        this(new LabelRatingView(context, null, 0, 0, null, false, 62, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
