package ru.ozon.id.antibot.errorView;

import Ax.ViewOnClickListenerC2451a;
import B0.A0;
import D90.c;
import HY.d;
import Jb0.E;
import Qc0.a;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.html.OzonHtmlParser;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;
import td0.C9864d;
import td0.e;
import vb0.C10294a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/id/antibot/errorView/AntibotErrorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AntibotErrorView extends ConstraintLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f97152e = 0;

    /* renamed from: c, reason: collision with root package name */
    private C10294a f97153c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final E f97154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AntibotErrorView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        E a11 = E.a(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(a11, "inflate(...)");
        this.f97154d = a11;
        ButtonV3View refreshBtn = a11.f14380e;
        Intrinsics.checkNotNullExpressionValue(refreshBtn, "refreshBtn");
        String string = getContext().getString(R.string.ozonid_error_refresh);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        ButtonV3DTO.Sizes sizes = ButtonV3DTO.Sizes.SIZE_500;
        ButtonV3HolderKt.bind$default(refreshBtn, new ButtonV3DTO(ButtonV3DTO.StyleTypes.ACTION_PRIMARY, sizes, string, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262136, null), null, 2, null);
        refreshBtn.setOnClickListener(new ViewOnClickListenerC2451a(this, 16));
        ButtonV3View supportBtn = a11.f14382g;
        Intrinsics.checkNotNullExpressionValue(supportBtn, "supportBtn");
        String string2 = getContext().getString(R.string.ozonid_antibot_fullscreen_support_button);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        ButtonV3HolderKt.bind$default(supportBtn, new ButtonV3DTO(ButtonV3DTO.StyleTypes.ACTION_SECONDARY, sizes, string2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262136, null), null, 2, null);
        supportBtn.setOnClickListener(new c(this, 15));
        a11.f14383h.setTextIsSelectable(false);
        a11.f14381f.setTextIsSelectable(false);
        TextAtomV2View textAtomV2View = a11.f14385j;
        textAtomV2View.setTextIsSelectable(false);
        textAtomV2View.setOnClickListener(new HY.c(this, 10));
    }

    public static void b(AntibotErrorView antibotErrorView) {
        String c11;
        C10294a c10294a = antibotErrorView.f97153c;
        if (c10294a == null || (c11 = c10294a.c()) == null) {
            return;
        }
        Context context = antibotErrorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity a11 = e.a(context);
        if (a11 != null) {
            C9864d.b(a11, c11);
            View rootView = a11.getWindow().getDecorView().getRootView();
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup == null) {
                return;
            }
            a aVar = new a();
            String string = antibotErrorView.getContext().getString(R.string.ozonid_error_incident_copied);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            a.e(aVar, string, viewGroup);
        }
    }

    public static void c(AntibotErrorView antibotErrorView) {
        Function0<Unit> e11;
        C10294a c10294a = antibotErrorView.f97153c;
        if (c10294a == null || (e11 = c10294a.e()) == null) {
            return;
        }
        e11.invoke();
    }

    public static void d(AntibotErrorView antibotErrorView) {
        C10294a c10294a = antibotErrorView.f97153c;
        if (c10294a != null) {
            c10294a.f().invoke(c10294a.h());
        }
    }

    public final void e(@NotNull C10294a errorModel) {
        OzonSpannableString ozonSpannableString;
        String str;
        Intrinsics.checkNotNullParameter(errorModel, "errorModel");
        this.f97153c = errorModel;
        boolean i11 = errorModel.i();
        E e11 = this.f97154d;
        if (i11) {
            e11.f14379d.setImageResource(2131236478);
            AppCompatImageView image = e11.f14379d;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            ViewGroup.LayoutParams layoutParams = image.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = ResourceExtKt.toPx(16);
            image.setLayoutParams(bVar);
        } else {
            e11.f14379d.setImageResource(2131236477);
        }
        String token = (errorModel.i() ? UniColors.BG_DARK_KEY : UniColors.LAYER_FLOOR_1).getToken();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, token);
        if (parseColor != null) {
            e11.f14384i.setBackgroundColor(parseColor.intValue());
        }
        TextAtomV2View title = e11.f14383h;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        String string = getContext().getString(R.string.ozonid_antibot_fullscreen_title_android);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        OzonSpannableString ozonSpannableString2 = OzonSpannableStringKt.toOzonSpannableString(string);
        TextDTO.TextAlignment textAlignment = TextDTO.TextAlignment.CENTER;
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        TextHolderKt.bind$default(title, new TextDTO(ozonSpannableString2, textAlignment, layoutPadding, layoutPadding, null, null, textPreset, UniTextStyles.HEADLINE_600_LARGE.getToken(), UniColors.TEXT_PRIMARY.getToken(), null, null, null, null, false, null, null, null, null, 0, 261680, null), null, 2, null);
        TextAtomV2View subtitle = e11.f14381f;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        String b11 = errorModel.b();
        if (b11 == null || h.K(b11)) {
            String string2 = getContext().getString(R.string.ozonid_antibot_fullscreen_subtitle_android);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(string2);
        } else {
            ozonSpannableString = OzonHtmlParser.INSTANCE.parseHtml(h.X(errorModel.b(), "%@", errorModel.c(), false), 63);
        }
        TextHolderKt.bind$default(subtitle, new TextDTO(ozonSpannableString, textAlignment, layoutPadding, layoutPadding, null, null, textPreset, UniTextStyles.BODY_500_MEDIUM.getToken(), UniColors.TEXT_SECONDARY.getToken(), null, null, null, null, true, null, null, null, null, 5, 253488, null), null, 2, null);
        TextAtomV2View traceView = e11.f14385j;
        Intrinsics.checkNotNullExpressionValue(traceView, "traceView");
        String a11 = errorModel.a();
        if (a11 == null || (str = A0.b(" (", a11, ")")) == null) {
            str = "";
        }
        TextHolderKt.bind$default(traceView, new TextDTO(OzonSpannableStringKt.toOzonSpannableString(getContext().getString(R.string.ozonid_antibot_fullscreen_incident) + str + ": " + errorModel.c()), textAlignment, layoutPadding, layoutPadding, null, null, textPreset, UniTextStyles.BODY_300_X_SMALL.getToken(), UniColors.TEXT_TERTIARY.getToken(), null, null, null, null, false, null, null, null, null, 0, 261680, null), null, 2, null);
        ButtonV3View supportBtn = e11.f14382g;
        Intrinsics.checkNotNullExpressionValue(supportBtn, "supportBtn");
        String h11 = errorModel.h();
        supportBtn.setVisibility(!(h11 == null || h11.length() == 0) ? 0 : 8);
        IconButtonV3View closeBtn = e11.f14377b;
        Intrinsics.checkNotNullExpressionValue(closeBtn, "closeBtn");
        IconButtonV3HolderKt.bind$default(closeBtn, new IconButtonV3DTO(IconButtonV3DTO.Sizes.SIZE_400, ButtonV3DTO.StyleTypes.CUSTOM, IconButtonV3DTO.IconButtonShape.SHAPE_CIRCLE, "ic_s_cross_filled", null, (errorModel.i() ? UniColors.GRAPHIC_LIGHT_KEY : UniColors.GRAPHIC_SECONDARY).getToken(), UniColors.BG_OVERLAP.getToken(), null, null, null, null, null, null, null, 16272, null), null, 2, null);
        Intrinsics.checkNotNullExpressionValue(closeBtn, "closeBtn");
        closeBtn.setVisibility(errorModel.g() ? 0 : 8);
        closeBtn.setOnClickListener(new d(errorModel, 9));
    }
}
