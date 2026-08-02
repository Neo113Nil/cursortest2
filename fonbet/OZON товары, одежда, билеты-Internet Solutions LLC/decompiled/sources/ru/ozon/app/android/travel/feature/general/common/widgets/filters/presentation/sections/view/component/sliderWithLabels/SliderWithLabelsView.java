package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels;

import Lc.a;
import V.e;
import WZ.t;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gk0.q;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.SliderWithLabelsSectionVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.seekbar.FilterSeekbar;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.v3.holders.controls.tag.TagButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0001\u0018\u0000 L2\u00020\u0001:\u0001LB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u0018*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u0013JS\u0010)\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0!2(\u0010(\u001a$\u0012\b\u0012\u00060%j\u0002`&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0'\u0012\u0004\u0012\u00020\t0$¢\u0006\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u00102\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010,R\u0014\u00103\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010,R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R:\u0010(\u001a&\u0012\b\u0012\u00060%j\u0002`&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0'\u0012\u0004\u0012\u00020\t\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010=R$\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010G\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001e\u0010J\u001a\n\u0018\u00010%j\u0004\u0018\u0001`&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "minValue", "maxValue", "", "updateBadge", "(Ljava/lang/Number;Ljava/lang/Number;)V", "", "timeMask", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "formatValueByMask", "(Ljava/lang/String;I)Ljava/lang/String;", "setSeekbar", "()V", "Lru/ozon/uni/atoms/af/AtomAction$Refresh;", "action", "getActionWithParams", "(Lru/ozon/uni/atoms/af/AtomAction$Refresh;Ljava/lang/Number;Ljava/lang/Number;)Lru/ozon/uni/atoms/af/AtomAction$Refresh;", "Landroid/graphics/Bitmap;", "createThumbBitmap", "()Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "toBitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "setupConstraints", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO$SliderWithLabelsControlVO;", "data", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/Function2;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "trackClickEvent", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO$SliderWithLabelsControlVO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "barColor", "I", "barHighlightColor", "", "dp2f", "F", "dp4f", "dp16", "dp20", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "badge", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar;", "rangeSeekbar", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "cachedBadgeDTO", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "", "cachedIsRangeFilter", "Z", "cachedBadgeTimeMask", "Ljava/lang/String;", "cachedBadgeTextTemplate", "cachedAction", "Lru/ozon/uni/atoms/af/AtomAction$Refresh;", "cachedActionEvent", "LWZ/t;", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SliderWithLabelsView extends ConstraintLayout {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final TagButtonView badge;
    private final int barColor;
    private final int barHighlightColor;
    private AtomAction.Refresh cachedAction;
    private t cachedActionEvent;
    private TagButtonDTO cachedBadgeDTO;
    private String cachedBadgeTextTemplate;
    private String cachedBadgeTimeMask;
    private boolean cachedIsRangeFilter;
    private final int dp16;
    private final int dp20;
    private final float dp2f;
    private final float dp4f;

    @NotNull
    private final FilterSeekbar rangeSeekbar;

    @NotNull
    private final TextAtomV2View title;
    private Function2<? super t, ? super Map<String, String>, Unit> trackClickEvent;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsView$Companion;", "", "<init>", "()V", "DEFAULT_MIN_VALUE", "", "DEFAULT_MAX_VALUE", "ANALYTICS_VALUE_PARAM_KEY", "", "ANALYTICS_VALUE_PARAM_SEPARATOR", "MINIMUM_VALUE_PLACEHOLDER", "MINIMUM_VALUE_PLACEHOLDER_ENCODED", "MAXIMUM_VALUE_PLACEHOLDER", "MAXIMUM_VALUE_PLACEHOLDER_ENCODED", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderWithLabelsView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int themeColor = ThemeExtKt.themeColor(context, R$attr.bgOverlap);
        this.barColor = themeColor;
        int color = context.getColor(UniColors.BG_ACTION_SECONDARY_SOLID.getResId());
        this.barHighlightColor = color;
        float pxF = ResourceExtKt.toPxF(2, context);
        this.dp2f = pxF;
        float pxF2 = ResourceExtKt.toPxF(4, context);
        this.dp4f = pxF2;
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.dp20 = ResourceExtKt.toPx(20, context);
        View g10 = q.f64554a.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View = (TextAtomV2View) g10;
        a.d(textAtomV2View, R$id.sliderWithLabelsTitle, 0, -2, false);
        addView(g10);
        this.title = textAtomV2View;
        TagButtonView tagButtonView = new TagButtonView(context, null, 0, 0, 14, null);
        tagButtonView.setId(R$id.sliderWithLabelsBadge);
        tagButtonView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        addView(tagButtonView);
        this.badge = tagButtonView;
        FilterSeekbar filterSeekbar = new FilterSeekbar(context);
        filterSeekbar.setId(R$id.sliderWithLabelsSeekbar);
        filterSeekbar.setLayoutParams(new ConstraintLayout.b(0, -2));
        Bitmap createThumbBitmap = createThumbBitmap();
        if (createThumbBitmap != null) {
            filterSeekbar.setLeftThumbBitmap(createThumbBitmap);
            filterSeekbar.setRightThumbBitmap(createThumbBitmap);
        }
        filterSeekbar.setCornerRadius(pxF);
        filterSeekbar.m1238setBarHeight(pxF2);
        filterSeekbar.setBarColor(themeColor);
        filterSeekbar.setBarHighlightColor(color);
        filterSeekbar.setMinValue(0.0f);
        filterSeekbar.setMaxValue(1.0f);
        filterSeekbar.setDataType(3);
        addView(filterSeekbar);
        this.rangeSeekbar = filterSeekbar;
        setupConstraints();
        setSeekbar();
    }

    private final Bitmap createThumbBitmap() {
        Drawable mutate;
        Drawable drawable = androidx.core.content.a.getDrawable(getContext(), R$drawable.ic_widget_atom_range_filters_thumb);
        if (drawable == null || (mutate = drawable.mutate()) == null) {
            return null;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        mutate.setTint(ThemeExtKt.themeColor(context, R$attr.graphicActionOnLight));
        return toBitmap(mutate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatValueByMask(String timeMask, int value) {
        if (timeMask == null) {
            return String.valueOf(value);
        }
        int i11 = value / 60;
        int i12 = value % 60;
        return h.X(h.X(h.X(h.X(timeMask, "HH", e.b(new Object[]{Integer.valueOf(i11)}, 1, "%02d", "format(...)"), false), "H", e.b(new Object[]{Integer.valueOf(i11)}, 1, "%d", "format(...)"), false), "mm", e.b(new Object[]{Integer.valueOf(i12)}, 1, "%02d", "format(...)"), false), "m", e.b(new Object[]{Integer.valueOf(i12)}, 1, "%d", "format(...)"), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AtomAction.Refresh getActionWithParams(AtomAction.Refresh action, Number minValue, Number maxValue) {
        String X9;
        String link = action.getLink();
        return AtomAction.Refresh.copy$default(action, (link == null || (X9 = h.X(link, "%7BminValue%7D", String.valueOf(minValue.intValue()), false)) == null) ? null : h.X(X9, "%7BmaxValue%7D", String.valueOf(maxValue.intValue()), false), null, null, null, null, null, 62, null);
    }

    private final void setSeekbar() {
        this.rangeSeekbar.setOnRangeSeekbarChangeListener(new FilterSeekbar.OnRangeSeekbarChangeListener() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.SliderWithLabelsView$setSeekbar$1
            @Override // ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.seekbar.FilterSeekbar.OnRangeSeekbarChangeListener
            public void valueChanged(Number minValue, Number maxValue, FilterSeekbar.Thumb thumb) {
                Intrinsics.checkNotNullParameter(minValue, "minValue");
                Intrinsics.checkNotNullParameter(maxValue, "maxValue");
                SliderWithLabelsView.this.updateBadge(minValue, maxValue);
            }
        });
        this.rangeSeekbar.setOnRangeSeekbarFinalValueListener(new FilterSeekbar.OnRangeSeekbarFinalValueListener() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.SliderWithLabelsView$setSeekbar$2
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
            
                r5 = r2.this$0.trackClickEvent;
             */
            @Override // ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.seekbar.FilterSeekbar.OnRangeSeekbarFinalValueListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void finalValue(Number minValue, Number maxValue, FilterSeekbar.Thumb thumb) {
                AtomAction.Refresh refresh;
                boolean z11;
                String str;
                String formatValueByMask;
                t tVar;
                Function2 function2;
                String str2;
                String formatValueByMask2;
                Function1 function1;
                AtomAction.Refresh actionWithParams;
                Function1 unused;
                Intrinsics.checkNotNullParameter(minValue, "minValue");
                Intrinsics.checkNotNullParameter(maxValue, "maxValue");
                refresh = SliderWithLabelsView.this.cachedAction;
                if (refresh != null) {
                    SliderWithLabelsView sliderWithLabelsView = SliderWithLabelsView.this;
                    function1 = sliderWithLabelsView.actionHandler;
                    if (function1 != null) {
                        actionWithParams = sliderWithLabelsView.getActionWithParams(refresh, minValue, maxValue);
                        function1.invoke(actionWithParams);
                    }
                    unused = sliderWithLabelsView.actionHandler;
                }
                SliderWithLabelsView sliderWithLabelsView2 = SliderWithLabelsView.this;
                StringBuilder sb2 = new StringBuilder();
                z11 = sliderWithLabelsView2.cachedIsRangeFilter;
                if (z11) {
                    str2 = sliderWithLabelsView2.cachedBadgeTimeMask;
                    formatValueByMask2 = sliderWithLabelsView2.formatValueByMask(str2, minValue.intValue());
                    sb2.append(formatValueByMask2);
                    sb2.append("_");
                }
                str = sliderWithLabelsView2.cachedBadgeTimeMask;
                formatValueByMask = sliderWithLabelsView2.formatValueByMask(str, maxValue.intValue());
                sb2.append(formatValueByMask);
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                tVar = SliderWithLabelsView.this.cachedActionEvent;
                if (tVar == null || function2 == null) {
                    return;
                }
                function2.invoke(tVar, U.i(new Pair(AppMeasurementSdk.ConditionalUserProperty.VALUE, sb3)));
            }
        });
    }

    private final void setupConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintLayoutExtensionsKt.topToParent(dVar, this.title);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.title);
        ConstraintLayoutExtensionsKt.endToStart(dVar, this.title, this.badge, this.dp16);
        ConstraintLayoutExtensionsKt.topToParent(dVar, this.badge);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.badge);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.rangeSeekbar, this.title, this.dp20);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.rangeSeekbar);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.rangeSeekbar);
        dVar.f(this);
    }

    private final Bitmap toBitmap(Drawable drawable) {
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBadge(Number minValue, Number maxValue) {
        String str;
        String X9;
        String X11;
        TagButtonDTO copy;
        TagButtonDTO tagButtonDTO = this.cachedBadgeDTO;
        if (tagButtonDTO == null || (str = this.cachedBadgeTextTemplate) == null || (X9 = h.X(str, "{minValue}", formatValueByMask(this.cachedBadgeTimeMask, minValue.intValue()), false)) == null || (X11 = h.X(X9, "{maxValue}", formatValueByMask(this.cachedBadgeTimeMask, maxValue.intValue()), false)) == null) {
            return;
        }
        copy = tagButtonDTO.copy((r34 & 1) != 0 ? tagButtonDTO.styleType : null, (r34 & 2) != 0 ? tagButtonDTO.size : null, (r34 & 4) != 0 ? tagButtonDTO.isSelected : null, (r34 & 8) != 0 ? tagButtonDTO.isDisabled : null, (r34 & 16) != 0 ? tagButtonDTO.isClosable : null, (r34 & 32) != 0 ? tagButtonDTO.icon : null, (r34 & 64) != 0 ? tagButtonDTO.text : X11, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? tagButtonDTO.indicator : null, (r34 & 256) != 0 ? tagButtonDTO.customDefaultStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? tagButtonDTO.customSelectedStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? tagButtonDTO.common : null, (r34 & 2048) != 0 ? tagButtonDTO.closeControlSettings : null, (r34 & 4096) != 0 ? tagButtonDTO.context : null, (r34 & 8192) != 0 ? tagButtonDTO.isStateChangeDisabled : null, (r34 & 16384) != 0 ? tagButtonDTO.image : null, (r34 & 32768) != 0 ? tagButtonDTO.round : null);
        TagButtonHolderKt.bind(this.badge, copy, this.actionHandler);
        this.cachedBadgeDTO = copy;
    }

    public final void bind(@NotNull SliderWithLabelsSectionVO.SliderWithLabelsControlVO data, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function2<? super t, ? super Map<String, String>, Unit> trackClickEvent) {
        TestInfo testInfo;
        TestInfo testInfo2;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(trackClickEvent, "trackClickEvent");
        CommonControlSettings common = data.getCommon();
        String str = null;
        setContentDescription((common == null || (testInfo2 = common.getTestInfo()) == null) ? null : testInfo2.getAutomatizationId());
        this.trackClickEvent = trackClickEvent;
        this.actionHandler = actionHandler;
        this.cachedBadgeDTO = data.getBadge();
        this.cachedIsRangeFilter = data.getSliderWithLabels().getIsInRangeMode();
        this.cachedBadgeTimeMask = data.getBadgeTextMask();
        this.cachedBadgeTextTemplate = data.getBadgeTextTemplate();
        this.cachedAction = data.getSliderWithLabels().getSliderSelectAction();
        this.cachedActionEvent = data.getSliderWithLabels().getActionTokenizedEvent();
        TextHolderKt.bindOrGone(this.title, data.getTitle(), actionHandler);
        updateBadge(Float.valueOf(data.getSliderWithLabels().getInitialMinValue()), Float.valueOf(data.getSliderWithLabels().getInitialMaxValue()));
        FilterSeekbar points = this.rangeSeekbar.setMinValue(data.getSliderWithLabels().getMin()).setMaxValue(data.getSliderWithLabels().getMax()).setMinStartValue(data.getSliderWithLabels().getInitialMinValue()).setMaxStartValue(data.getSliderWithLabels().getInitialMaxValue()).setIsInRangeMode(data.getSliderWithLabels().getIsInRangeMode()).setStep(data.getSliderWithLabels().getStep()).setPoints(data.getSliderWithLabels().getPoints());
        CommonControlSettings common2 = data.getSliderWithLabels().getCommon();
        if (common2 != null && (testInfo = common2.getTestInfo()) != null) {
            str = testInfo.getAutomatizationId();
        }
        points.setAutomatizationId(str).apply();
    }
}
