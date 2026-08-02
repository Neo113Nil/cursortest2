package ru.ozon.android.inAppUpdate.internal.ui.blocking;

import Sc.o;
import android.view.View;
import androidx.fragment.app.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.inAppUpdate.internal.ui.blocking.OzonInAppUpdateSdkBlockingActivity;
import ru.ozon.android.inAppUpdate.internal.ui.blocking.a;
import ru.ozon.android.inAppUpdate.internal.ui.blocking.c;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.loader.data.LoaderSize;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.Style;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.holders.controls.button.ButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final r f83840a;

    /* renamed from: b, reason: collision with root package name */
    private View f83841b;

    /* renamed from: c, reason: collision with root package name */
    private Image f83842c;

    /* renamed from: d, reason: collision with root package name */
    private TextAtomV2View f83843d;

    /* renamed from: e, reason: collision with root package name */
    private TextAtomV2View f83844e;

    /* renamed from: f, reason: collision with root package name */
    private ButtonView f83845f;

    /* renamed from: g, reason: collision with root package name */
    private View f83846g;

    /* renamed from: h, reason: collision with root package name */
    private LoaderView f83847h;

    /* renamed from: i, reason: collision with root package name */
    private TextAtomV2View f83848i;

    /* renamed from: j, reason: collision with root package name */
    private View f83849j;

    /* renamed from: k, reason: collision with root package name */
    private Image f83850k;

    /* renamed from: l, reason: collision with root package name */
    private TextAtomV2View f83851l;

    /* renamed from: m, reason: collision with root package name */
    private TextAtomV2View f83852m;

    /* renamed from: n, reason: collision with root package name */
    private ButtonView f83853n;

    /* renamed from: o, reason: collision with root package name */
    private View f83854o;

    /* renamed from: p, reason: collision with root package name */
    private Image f83855p;

    /* renamed from: q, reason: collision with root package name */
    private TextAtomV2View f83856q;

    /* renamed from: r, reason: collision with root package name */
    private TextAtomV2View f83857r;

    /* renamed from: s, reason: collision with root package name */
    private ButtonView f83858s;

    /* renamed from: t, reason: collision with root package name */
    private Function1<? super c, Unit> f83859t;

    public b(@NotNull r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f83840a = activity;
    }

    public static void a(b bVar) {
        Function1<? super c, Unit> function1 = bVar.f83859t;
        if (function1 == null) {
            Intrinsics.n("onAction");
            throw null;
        }
        ((OzonInAppUpdateSdkBlockingActivity.c) function1).invoke(c.a.f83860a);
    }

    public static void b(b bVar) {
        Function1<? super c, Unit> function1 = bVar.f83859t;
        if (function1 == null) {
            Intrinsics.n("onAction");
            throw null;
        }
        ((OzonInAppUpdateSdkBlockingActivity.c) function1).invoke(c.d.f83863a);
    }

    public static void c(b bVar) {
        Function1<? super c, Unit> function1 = bVar.f83859t;
        if (function1 == null) {
            Intrinsics.n("onAction");
            throw null;
        }
        ((OzonInAppUpdateSdkBlockingActivity.c) function1).invoke(c.f.f83865a);
    }

    public final void d(@NotNull Function1<? super c, Unit> onAction) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.f83859t = onAction;
        r rVar = this.f83840a;
        this.f83841b = rVar.findViewById(R.id.updateRequiredContainer);
        this.f83842c = (Image) rVar.findViewById(R.id.updateRequiredImage);
        this.f83843d = (TextAtomV2View) rVar.findViewById(R.id.updateRequiredTitle);
        this.f83844e = (TextAtomV2View) rVar.findViewById(R.id.updateRequiredDescription);
        this.f83845f = (ButtonView) rVar.findViewById(R.id.updateRequiredButton);
        this.f83846g = rVar.findViewById(R.id.downloadingContainer);
        this.f83847h = (LoaderView) rVar.findViewById(R.id.downloadingLoader);
        this.f83848i = (TextAtomV2View) rVar.findViewById(R.id.downloadingText);
        this.f83849j = rVar.findViewById(R.id.installUpdateContainer);
        this.f83850k = (Image) rVar.findViewById(R.id.installUpdateImage);
        this.f83851l = (TextAtomV2View) rVar.findViewById(R.id.installUpdateTitle);
        this.f83852m = (TextAtomV2View) rVar.findViewById(R.id.installUpdateDescription);
        this.f83853n = (ButtonView) rVar.findViewById(R.id.installUpdateButton);
        this.f83854o = rVar.findViewById(R.id.errorContainer);
        this.f83855p = (Image) rVar.findViewById(R.id.errorImage);
        this.f83856q = (TextAtomV2View) rVar.findViewById(R.id.errorTitle);
        this.f83857r = (TextAtomV2View) rVar.findViewById(R.id.errorDescription);
        this.f83858s = (ButtonView) rVar.findViewById(R.id.errorButton);
    }

    public final void e(@NotNull a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        View view = this.f83841b;
        if (view == null) {
            Intrinsics.n("updateRequiredContainer");
            throw null;
        }
        view.setVisibility(8);
        View view2 = this.f83846g;
        if (view2 == null) {
            Intrinsics.n("downloadingContainer");
            throw null;
        }
        view2.setVisibility(8);
        View view3 = this.f83849j;
        if (view3 == null) {
            Intrinsics.n("installUpdateContainer");
            throw null;
        }
        view3.setVisibility(8);
        View view4 = this.f83854o;
        if (view4 == null) {
            Intrinsics.n("errorContainer");
            throw null;
        }
        view4.setVisibility(8);
        boolean z11 = state instanceof a.d;
        r rVar = this.f83840a;
        if (z11) {
            Image image = this.f83842c;
            if (image == null) {
                Intrinsics.n("updateRequiredImage");
                throw null;
            }
            image.setImageResource(2131235618);
            TextAtomV2View textAtomV2View = this.f83843d;
            if (textAtomV2View == null) {
                Intrinsics.n("updateRequiredTitle");
                throw null;
            }
            String string = rVar.getString(R.string.in_app_update_hard_download_new_app_version_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            OzonSpannableString ozonSpannableString = new OzonSpannableString(string);
            TextPreset textPreset = TextPreset.PRESET_CUSTOM;
            TextDTO.TextAlignment textAlignment = TextDTO.TextAlignment.CENTER;
            TextHolderKt.bind$default(textAtomV2View, new TextDTO(ozonSpannableString, textAlignment, null, null, null, null, textPreset, "tsHeadline700XLarge", "textPrimary", Integer.MAX_VALUE, null, null, null, false, null, null, null, null, null, 523324, null), null, 2, null);
            TextAtomV2View textAtomV2View2 = this.f83844e;
            if (textAtomV2View2 == null) {
                Intrinsics.n("updateRequiredDescription");
                throw null;
            }
            String string2 = rVar.getString(R.string.in_app_update_hard_download_description);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            TextHolderKt.bind$default(textAtomV2View2, new TextDTO(new OzonSpannableString(string2), textAlignment, null, null, null, null, textPreset, "tsBody500Medium", "textSecondary", Integer.MAX_VALUE, null, null, null, false, null, null, null, null, null, 523324, null), null, 2, null);
            ButtonView buttonView = this.f83845f;
            if (buttonView == null) {
                Intrinsics.n("updateRequiredButton");
                throw null;
            }
            ButtonDTO.Preset preset = ButtonDTO.Preset.SIZE_600;
            Style style = Style.ACTION_PRIMARY;
            String string3 = rVar.getString(R.string.in_app_update_hard_download_button_text);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            ButtonHolderKt.bind$default(buttonView, new ButtonDTO(preset, style, null, new CommonAtomLabelDTO(new OzonSpannableString(string3), null, null, null, null, null, null, false, null, 510, null), null, null, 20, null), null, 2, null);
            ButtonView buttonView2 = this.f83845f;
            if (buttonView2 == null) {
                Intrinsics.n("updateRequiredButton");
                throw null;
            }
            buttonView2.setOnClickListener(new EJ.a(this, 8));
            View view5 = this.f83841b;
            if (view5 != null) {
                view5.setVisibility(0);
                return;
            } else {
                Intrinsics.n("updateRequiredContainer");
                throw null;
            }
        }
        if (state instanceof a.C1447a) {
            LoaderView loaderView = this.f83847h;
            if (loaderView == null) {
                Intrinsics.n("downloadingLoader");
                throw null;
            }
            loaderView.setLoaderSize(LoaderSize.LOADER_600);
            TextAtomV2View textAtomV2View3 = this.f83848i;
            if (textAtomV2View3 == null) {
                Intrinsics.n("downloadingText");
                throw null;
            }
            String string4 = rVar.getString(R.string.in_app_update_hard_download_in_progress_title);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            TextHolderKt.bind$default(textAtomV2View3, new TextDTO(new OzonSpannableString(string4), TextDTO.TextAlignment.CENTER, null, null, null, null, TextPreset.PRESET_CUSTOM, "tsHeadline700XLarge", "textPrimary", Integer.MAX_VALUE, null, null, null, false, null, null, null, null, null, 523324, null), null, 2, null);
            View view6 = this.f83846g;
            if (view6 != null) {
                view6.setVisibility(0);
                return;
            } else {
                Intrinsics.n("downloadingContainer");
                throw null;
            }
        }
        if (!(state instanceof a.c)) {
            if (!(state instanceof a.b)) {
                throw new o();
            }
            Image image2 = this.f83855p;
            if (image2 == null) {
                Intrinsics.n("errorImage");
                throw null;
            }
            image2.setImageResource(2131235617);
            TextAtomV2View textAtomV2View4 = this.f83856q;
            if (textAtomV2View4 == null) {
                Intrinsics.n("errorTitle");
                throw null;
            }
            String string5 = rVar.getString(R.string.in_app_update_hard_download_error_title);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            OzonSpannableString ozonSpannableString2 = new OzonSpannableString(string5);
            TextPreset textPreset2 = TextPreset.PRESET_CUSTOM;
            TextDTO.TextAlignment textAlignment2 = TextDTO.TextAlignment.CENTER;
            TextHolderKt.bind$default(textAtomV2View4, new TextDTO(ozonSpannableString2, textAlignment2, null, null, null, null, textPreset2, "tsHeadline700XLarge", "textPrimary", Integer.MAX_VALUE, null, null, null, false, null, null, null, null, null, 523324, null), null, 2, null);
            TextAtomV2View textAtomV2View5 = this.f83857r;
            if (textAtomV2View5 == null) {
                Intrinsics.n("errorDescription");
                throw null;
            }
            String string6 = rVar.getString(R.string.in_app_update_hard_download_error_description);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            TextHolderKt.bind$default(textAtomV2View5, new TextDTO(new OzonSpannableString(string6), textAlignment2, null, null, null, null, textPreset2, "tsBody500Medium", "textSecondary", Integer.MAX_VALUE, null, null, null, false, null, null, null, null, null, 523324, null), null, 2, null);
            ButtonView buttonView3 = this.f83858s;
            if (buttonView3 == null) {
                Intrinsics.n("errorButton");
                throw null;
            }
            ButtonDTO.Preset preset2 = ButtonDTO.Preset.SIZE_600;
            Style style2 = Style.ACTION_PRIMARY;
            String string7 = rVar.getString(R.string.in_app_update_hard_download_error_button_text);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            ButtonHolderKt.bind$default(buttonView3, new ButtonDTO(preset2, style2, null, new CommonAtomLabelDTO(new OzonSpannableString(string7), null, null, null, null, null, null, false, null, 510, null), null, null, 20, null), null, 2, null);
            ButtonView buttonView4 = this.f83858s;
            if (buttonView4 == null) {
                Intrinsics.n("errorButton");
                throw null;
            }
            buttonView4.setOnClickListener(new EI.a(this, 9));
            View view7 = this.f83854o;
            if (view7 != null) {
                view7.setVisibility(0);
                return;
            } else {
                Intrinsics.n("errorContainer");
                throw null;
            }
        }
        boolean a11 = ((a.c) state).a();
        Image image3 = this.f83850k;
        if (image3 == null) {
            Intrinsics.n("installUpdateImage");
            throw null;
        }
        image3.setImageResource(2131235619);
        TextAtomV2View textAtomV2View6 = this.f83851l;
        if (textAtomV2View6 == null) {
            Intrinsics.n("installUpdateTitle");
            throw null;
        }
        String string8 = rVar.getString(R.string.in_app_update_hard_install_new_app_version_title);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        OzonSpannableString ozonSpannableString3 = new OzonSpannableString(string8);
        TextPreset textPreset3 = TextPreset.PRESET_CUSTOM;
        TextDTO.TextAlignment textAlignment3 = TextDTO.TextAlignment.CENTER;
        TextHolderKt.bind$default(textAtomV2View6, new TextDTO(ozonSpannableString3, textAlignment3, null, null, null, null, textPreset3, "tsHeadline700XLarge", "textPrimary", Integer.MAX_VALUE, null, null, null, false, null, null, null, null, null, 523324, null), null, 2, null);
        int i11 = a11 ? R.string.in_app_update_hard_install_new_app_version_description_google_play : R.string.in_app_update_hard_install_new_app_version_description_common;
        TextAtomV2View textAtomV2View7 = this.f83852m;
        if (textAtomV2View7 == null) {
            Intrinsics.n("installUpdateDescription");
            throw null;
        }
        String string9 = rVar.getString(i11);
        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
        TextHolderKt.bind$default(textAtomV2View7, new TextDTO(new OzonSpannableString(string9), textAlignment3, null, null, null, null, textPreset3, "tsBody500Medium", "textSecondary", Integer.MAX_VALUE, null, null, null, false, null, null, null, null, null, 523324, null), null, 2, null);
        int i12 = a11 ? R.string.in_app_update_hard_go_to_downloads_button_text : R.string.in_app_update_hard_install_new_app_version_button_text;
        ButtonView buttonView5 = this.f83853n;
        if (buttonView5 == null) {
            Intrinsics.n("installUpdateButton");
            throw null;
        }
        ButtonDTO.Preset preset3 = ButtonDTO.Preset.SIZE_600;
        Style style3 = Style.ACTION_PRIMARY;
        String string10 = rVar.getString(i12);
        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
        ButtonHolderKt.bind$default(buttonView5, new ButtonDTO(preset3, style3, null, new CommonAtomLabelDTO(new OzonSpannableString(string10), null, null, null, null, null, null, false, null, 510, null), null, null, 20, null), null, 2, null);
        ButtonView buttonView6 = this.f83853n;
        if (buttonView6 == null) {
            Intrinsics.n("installUpdateButton");
            throw null;
        }
        buttonView6.setOnClickListener(new GI.c(this, 8));
        View view8 = this.f83849j;
        if (view8 != null) {
            view8.setVisibility(0);
        } else {
            Intrinsics.n("installUpdateContainer");
            throw null;
        }
    }
}
