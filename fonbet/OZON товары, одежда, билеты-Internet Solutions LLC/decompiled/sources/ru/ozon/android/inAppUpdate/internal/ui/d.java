package ru.ozon.android.inAppUpdate.internal.ui;

import Sc.o;
import android.content.Context;
import gj.C6743a;
import hj.C6960a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.inAppUpdate.internal.ui.e;
import ru.ozon.android.inAppUpdate.internal.ui.g;
import ru.ozon.app.android.R;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.Style;
import ru.ozon.uni.atoms.data.image.CornerRadius;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.holders.controls.button.ButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final OzonInAppUpdateSdkActivity f83893a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final g f83894b;

    public d(@NotNull OzonInAppUpdateSdkActivity activity, @NotNull g config) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f83893a = activity;
        this.f83894b = config;
    }

    public static void a(d dVar, ButtonView buttonView, Function0 function0) {
        e c11 = dVar.f83894b.c();
        boolean z11 = c11 instanceof e.a;
        OzonInAppUpdateSdkActivity ozonInAppUpdateSdkActivity = dVar.f83893a;
        g gVar = dVar.f83894b;
        if (z11) {
            ozonInAppUpdateSdkActivity.J(gVar);
        } else if ((c11 instanceof e.c) || (c11 instanceof e.b)) {
            jj.c.d(ozonInAppUpdateSdkActivity, gVar, c11.a());
        } else {
            if (!(c11 instanceof e.C1451e) && !(c11 instanceof e.d)) {
                throw new o();
            }
            C6960a.b().d(ozonInAppUpdateSdkActivity);
        }
        C6743a.b(ActionType.CLICK.INSTANCE, buttonView.getTitleText());
        ((b) function0).invoke();
    }

    public final void b(@NotNull Image imageView, @NotNull TextAtomV2View titleTextView, @NotNull TextAtomV2View descriptionTextView, @NotNull ButtonView buttonView, @NotNull ButtonV3View remindMeLaterButtonView) {
        int intValue;
        Integer b11;
        Integer b12;
        String string;
        String string2;
        int i11;
        Integer b13;
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(titleTextView, "titleTextView");
        Intrinsics.checkNotNullParameter(descriptionTextView, "descriptionTextView");
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        Intrinsics.checkNotNullParameter(remindMeLaterButtonView, "remindMeLaterButtonView");
        g gVar = this.f83894b;
        e c11 = gVar.c();
        g.d e11 = gVar.e();
        boolean z11 = c11 instanceof e.a;
        if (z11) {
            g.b b14 = e11.b();
            intValue = (b14 == null || (b13 = b14.b()) == null) ? 2131235616 : b13.intValue();
        } else if ((c11 instanceof e.c) || (c11 instanceof e.b)) {
            g.b c12 = e11.c();
            intValue = (c12 == null || (b11 = c12.b()) == null) ? 2131235620 : b11.intValue();
        } else {
            if (!(c11 instanceof e.d) && !(c11 instanceof e.C1451e)) {
                throw new o();
            }
            g.b d11 = e11.d();
            intValue = (d11 == null || (b12 = d11.b()) == null) ? 2131235621 : b12.intValue();
        }
        imageView.setImageResource(intValue);
        imageView.setRatio(ImageAspectRatio.RATIO_3_2);
        imageView.setCornerRadius(CornerRadius.RADIUS_500);
        g.d e12 = gVar.e();
        if (z11) {
            g.b b15 = e12.b();
            if (b15 == null || (string = b15.getTitle()) == null) {
                string = titleTextView.getContext().getString(R.string.in_app_update_download_new_app_version_title);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
        } else if ((c11 instanceof e.c) || (c11 instanceof e.b)) {
            g.b c13 = e12.c();
            if (c13 == null || (string = c13.getTitle()) == null) {
                string = titleTextView.getContext().getString(R.string.in_app_update_install_new_app_version_title);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
        } else {
            if (!(c11 instanceof e.d) && !(c11 instanceof e.C1451e)) {
                throw new o();
            }
            g.b d12 = e12.d();
            if (d12 == null || (string = d12.getTitle()) == null) {
                string = titleTextView.getContext().getString(R.string.in_app_update_request_permission_title);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
        }
        OzonSpannableString ozonSpannableString = new OzonSpannableString(string);
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
        TextHolderKt.bind$default(titleTextView, new TextDTO(ozonSpannableString, null, layoutPadding, layoutPadding, null, null, textPreset, "tsHeadline700XLarge", "textPrimary", Integer.MAX_VALUE, null, null, null, false, null, null, null, null, null, 523314, null), null, 2, null);
        g.d e13 = gVar.e();
        if (z11) {
            g.b b16 = e13.b();
            if (b16 == null || (string2 = b16.a()) == null) {
                string2 = descriptionTextView.getContext().getString(R.string.in_app_update_download_description);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            }
        } else if (c11 instanceof e.c) {
            g.b c14 = e13.c();
            if (c14 == null || (string2 = c14.a()) == null) {
                string2 = descriptionTextView.getContext().getString(R.string.in_app_update_install_new_app_version_description_play_market);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            }
        } else if (c11 instanceof e.b) {
            g.b c15 = e13.c();
            if (c15 == null || (string2 = c15.a()) == null) {
                string2 = descriptionTextView.getContext().getString(R.string.in_app_update_install_new_app_version_description_common);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            }
        } else if (c11 instanceof e.C1451e) {
            g.b d13 = e13.d();
            if (d13 == null || (string2 = d13.a()) == null) {
                string2 = descriptionTextView.getContext().getString(R.string.in_app_update_request_permission_description_play_market);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            }
        } else {
            if (!(c11 instanceof e.d)) {
                throw new o();
            }
            g.b d14 = e13.d();
            if (d14 == null || (string2 = d14.a()) == null) {
                string2 = descriptionTextView.getContext().getString(R.string.in_app_update_request_permission_description_common);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            }
        }
        OzonSpannableString ozonSpannableString2 = new OzonSpannableString(string2);
        CommonCellSettings.LayoutPadding layoutPadding2 = CommonCellSettings.LayoutPadding.PADDING_300;
        TextHolderKt.bind$default(descriptionTextView, new TextDTO(ozonSpannableString2, null, layoutPadding, layoutPadding, layoutPadding2, layoutPadding2, textPreset, "tsBody500Medium", "textSecondary", Integer.MAX_VALUE, null, null, null, false, null, null, null, null, null, 523266, null), null, 2, null);
        Context context = buttonView.getContext();
        if (z11) {
            i11 = R.string.in_app_update_download_button_text;
        } else if (c11 instanceof e.c) {
            i11 = R.string.in_app_update_open_downloads;
        } else if (c11 instanceof e.b) {
            i11 = R.string.in_app_update_install_button_text;
        } else {
            if (!(c11 instanceof e.C1451e) && !(c11 instanceof e.d)) {
                throw new o();
            }
            i11 = R.string.in_app_update_request_permission_button_text;
        }
        String string3 = context.getString(i11);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        ButtonHolderKt.bind$default(buttonView, new ButtonDTO(ButtonDTO.Preset.SIZE_600, Style.ACTION_PRIMARY, null, new CommonAtomLabelDTO(new OzonSpannableString(string3), null, null, null, null, null, null, false, null, 510, null), null, null, 20, null), null, 2, null);
        ButtonV3DTO.Sizes sizes = ButtonV3DTO.Sizes.SIZE_600;
        ButtonV3DTO.StyleTypes styleTypes = ButtonV3DTO.StyleTypes.ACTION_SECONDARY;
        String string4 = remindMeLaterButtonView.getContext().getString(R.string.in_app_update_remind_me_later_button_text);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        ButtonV3HolderKt.bind$default(remindMeLaterButtonView, new ButtonV3DTO(styleTypes, sizes, string4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262136, null), null, 2, null);
    }
}
