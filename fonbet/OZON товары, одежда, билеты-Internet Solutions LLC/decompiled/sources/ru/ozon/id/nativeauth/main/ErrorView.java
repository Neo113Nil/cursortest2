package ru.ozon.id.nativeauth.main;

import Dy.ViewOnClickListenerC2883a;
import Jb0.F;
import Lc0.e;
import Sc.o;
import U7.d;
import android.app.Activity;
import android.content.Context;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.main.b;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.Style;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.html.OzonHtmlParser;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.controls.button.ButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import td0.C9864d;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/id/nativeauth/main/ErrorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ErrorView extends ConstraintLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f97275g = 0;

    /* renamed from: c, reason: collision with root package name */
    private Object f97276c;

    /* renamed from: d, reason: collision with root package name */
    private Function0<Unit> f97277d;

    /* renamed from: e, reason: collision with root package name */
    private F f97278e;

    /* renamed from: f, reason: collision with root package name */
    private final int f97279f;

    static final class a extends AbstractC7737t implements Function1<View, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f97280b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<Unit> function0) {
            super(1);
            this.f97280b = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            this.f97280b.invoke();
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function1<String, Spanned> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f97281b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b.c f97282c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextAtomV2View f97283d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z11, b.c cVar, TextAtomV2View textAtomV2View) {
            super(1);
            this.f97281b = z11;
            this.f97282c = cVar;
            this.f97283d = textAtomV2View;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Spanned invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            OzonSpannableString parseHtml$default = OzonHtmlParser.Companion.parseHtml$default(OzonHtmlParser.INSTANCE, it, 0, 2, null);
            if (this.f97281b) {
                b.c.a aVar = (b.c.a) this.f97282c;
                int J11 = h.J(parseHtml$default, aVar.b(), 0, false, 6);
                int length = aVar.b().length() + J11;
                if (J11 != -1) {
                    parseHtml$default.setSpan(new StyleSpan(1), J11, length, 33);
                    TextAtomV2View textAtomV2View = this.f97283d;
                    parseHtml$default.setSpan(new ForegroundColorSpan(textAtomV2View.getResources().getColor(R.color.blue_500, textAtomV2View.getContext().getTheme())), J11, length, 33);
                }
            }
            return parseHtml$default;
        }
    }

    static final class c extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.c f97284b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ErrorView f97285c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ErrorView errorView, b.c cVar) {
            super(0);
            this.f97284b = cVar;
            this.f97285c = errorView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function0<Unit> a11 = ((b.c.C2137b) this.f97284b).a();
            if (a11 != null || (a11 = this.f97285c.f()) != null) {
                a11.invoke();
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ErrorView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void b(ErrorView errorView, b.c cVar) {
        errorView.e(((b.c.a) cVar).b());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    public static void c(Function0 function0, ErrorView errorView) {
        if (function0 != null) {
            ((c) function0).invoke();
            return;
        }
        ?? r02 = errorView.f97276c;
        if (r02 != 0) {
            r02.invoke();
        }
    }

    public static void d(ErrorView errorView, String str) {
        errorView.e(str);
    }

    private final void e(String str) {
        Context context = getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            C9864d.b(activity, str);
            View rootView = activity.getWindow().getDecorView().getRootView();
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup == null) {
                return;
            }
            Qc0.a aVar = new Qc0.a();
            String string = getContext().getString(R.string.ozonid_error_incident_copied);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Qc0.a.e(aVar, string, viewGroup);
        }
    }

    private final void h(String str, Function0<Unit> function0) {
        String str2;
        F f7 = this.f97278e;
        if (f7 == null) {
            return;
        }
        ButtonView screenStateActionBtn = f7.f14391f;
        Intrinsics.checkNotNullExpressionValue(screenStateActionBtn, "screenStateActionBtn");
        ButtonDTO.Preset preset = ButtonDTO.Preset.SIZE_400;
        Style style = Style.ACTION_SECONDARY;
        if (str == null) {
            str2 = screenStateActionBtn.getContext().getString(R.string.ozonid_error_refresh);
            Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
        } else {
            str2 = str;
        }
        ButtonHolderKt.bind$default(screenStateActionBtn, new ButtonDTO(preset, style, null, new CommonAtomLabelDTO(OzonSpannableStringKt.toOzonSpannableString(str2), null, null, null, null, null, null, false, null, 510, null), null, new CommonControlSettings(null, null, null, 7, null), 4, null), null, 2, null);
        screenStateActionBtn.setOnClickListener(new ViewOnClickListenerC2883a(3, function0, this));
        screenStateActionBtn.requestFocus();
        screenStateActionBtn.setVisibility(0);
    }

    private final void k(String str) {
        String str2;
        CharSequence text;
        F f7 = this.f97278e;
        if (f7 == null || (text = f7.f14388c.getText()) == null || (str2 = text.toString()) == null) {
            str2 = "";
        }
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(str2 + "\n" + str);
        int J11 = h.J(ozonSpannableString, str, 0, false, 6);
        ozonSpannableString.setSpan(new ru.ozon.id.nativeauth.main.a(this, str), J11, str.length() + J11, 18);
        if (f7 != null) {
            f7.f14388c.setText(ozonSpannableString);
        }
        if (f7 != null) {
            f7.f14388c.setOnClickListener(new IW.a(1, this, str));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function0<kotlin.Unit>] */
    public final Function0<Unit> f() {
        return this.f97276c;
    }

    public final void g(Function0<Unit> function0) {
        this.f97276c = function0;
    }

    public final void i(Function0<Unit> function0) {
        F f7 = this.f97278e;
        if (f7 != null) {
            f7.f14387b.setOnClickListener(new DG.a(new a(function0), 1));
        }
        this.f97277d = function0;
    }

    public final void j(@NotNull b.c state) {
        String string;
        String string2;
        int i11;
        Intrinsics.checkNotNullParameter(state, "state");
        ViewExtKt.hideKeyboard(this);
        F f7 = this.f97278e;
        if (f7 != null) {
            boolean z11 = state instanceof b.c.a;
            b.c.C2138c c2138c = b.c.C2138c.f97323a;
            b.c.d dVar = b.c.d.f97324a;
            int i12 = R.drawable.ic_ozon_id_errors_state;
            if (!z11 && !Intrinsics.d(state, dVar) && !(state instanceof b.c.e)) {
                if (state instanceof b.c.C2137b) {
                    Integer d11 = ((b.c.C2137b) state).d();
                    if (d11 != null) {
                        i12 = d11.intValue();
                    }
                } else {
                    if (!Intrinsics.d(state, c2138c)) {
                        throw new o();
                    }
                    i12 = R.drawable.ic_ozon_id_no_network_state;
                }
            }
            int color = getResources().getColor(R.color.transparent, getContext().getTheme());
            TextAtomV2View errorDescTv = f7.f14388c;
            errorDescTv.setHighlightColor(color);
            ImageView imageView = f7.f14389d;
            imageView.setImageResource(i12);
            if (z11) {
                ((b.c.a) state).getClass();
                string = d.e(getContext().getString(R.string.ozonid_error_antibot_title), "");
            } else if (state instanceof b.c.C2137b) {
                string = ((b.c.C2137b) state).g();
            } else if (Intrinsics.d(state, c2138c)) {
                string = getContext().getString(R.string.ozonid_error_no_connection_title);
            } else if (Intrinsics.d(state, dVar)) {
                string = getContext().getString(R.string.ozonid_error_technical_error_title);
            } else {
                if (!(state instanceof b.c.e)) {
                    throw new o();
                }
                string = getContext().getString(R.string.ozonid_error_technical_error_title);
            }
            OzonSpannableString ozonSpannableString = string != null ? OzonSpannableStringKt.toOzonSpannableString(string) : null;
            TextAtomV2View errorTitleTv = f7.f14390e;
            if (ozonSpannableString != null) {
                TextDTO textDTO = new TextDTO(OzonSpannableStringKt.toOzonSpannableString(ozonSpannableString), TextDTO.TextAlignment.CENTER, null, null, null, null, TextPreset.f97932H3, null, null, Integer.MAX_VALUE, null, null, null, false, null, null, null, null, null, 523708, null);
                Intrinsics.checkNotNullExpressionValue(errorTitleTv, "errorTitleTv");
                TextHolderKt.bind$default(errorTitleTv, textDTO, null, 2, null);
            } else {
                Intrinsics.checkNotNullExpressionValue(errorTitleTv, "errorTitleTv");
                errorTitleTv.setVisibility(8);
            }
            AppCompatImageView closeButton = f7.f14387b;
            if (z11) {
                b.c.a aVar = (b.c.a) state;
                String a11 = aVar.a();
                boolean z12 = a11 == null || h.K(a11);
                boolean z13 = !z12;
                if (z12) {
                    string2 = errorDescTv.getContext().getString(R.string.ozonid_error_antibot_description_short_android, aVar.b());
                    Intrinsics.f(string2);
                } else {
                    string2 = h.X(aVar.a(), "%@", aVar.b(), false);
                }
                CharSequence charSequence = (CharSequence) new b(z13, state, errorDescTv).invoke(string2);
                Intrinsics.checkNotNullParameter(errorDescTv, "<this>");
                if (charSequence != null) {
                    if (h.K(charSequence)) {
                        charSequence = null;
                    }
                    if (charSequence != null) {
                        errorDescTv.setText(charSequence);
                        i11 = 0;
                        errorDescTv.setVisibility(i11);
                        Intrinsics.checkNotNullParameter(errorDescTv, "<this>");
                        errorDescTv.setFocusable(true);
                        errorDescTv.setFocusableInTouchMode(true);
                        errorDescTv.setClickable(true);
                        errorDescTv.setOnClickListener(new e(0, this, state));
                        errorDescTv.setTextIsSelectable(true);
                        errorDescTv.setGravity(8388611);
                        SmallButtonView screenStateSecondaryActionBtn = f7.f14392g;
                        Intrinsics.checkNotNullExpressionValue(screenStateSecondaryActionBtn, "screenStateSecondaryActionBtn");
                        ViewExtKt.gone(screenStateSecondaryActionBtn);
                        Intrinsics.checkNotNullExpressionValue(closeButton, "closeButton");
                        closeButton.setVisibility(8);
                    }
                }
                i11 = 8;
                errorDescTv.setVisibility(i11);
                Intrinsics.checkNotNullParameter(errorDescTv, "<this>");
                errorDescTv.setFocusable(true);
                errorDescTv.setFocusableInTouchMode(true);
                errorDescTv.setClickable(true);
                errorDescTv.setOnClickListener(new e(0, this, state));
                errorDescTv.setTextIsSelectable(true);
                errorDescTv.setGravity(8388611);
                SmallButtonView screenStateSecondaryActionBtn2 = f7.f14392g;
                Intrinsics.checkNotNullExpressionValue(screenStateSecondaryActionBtn2, "screenStateSecondaryActionBtn");
                ViewExtKt.gone(screenStateSecondaryActionBtn2);
                Intrinsics.checkNotNullExpressionValue(closeButton, "closeButton");
                closeButton.setVisibility(8);
            } else if (state instanceof b.c.C2137b) {
                b.c.C2137b c2137b = (b.c.C2137b) state;
                String c11 = c2137b.c();
                if (c11 != null) {
                    Intrinsics.checkNotNullExpressionValue(errorDescTv, "errorDescTv");
                    errorDescTv.setVisibility(0);
                    errorDescTv.setText(androidx.core.text.b.a(c11, 63));
                    errorDescTv.setTextIsSelectable(false);
                    if (c2137b.e() != null) {
                        errorDescTv.setOnClickListener(new AI.b(state, 5));
                    } else {
                        errorDescTv.setOnClickListener(null);
                    }
                } else {
                    Intrinsics.checkNotNullExpressionValue(errorDescTv, "errorDescTv");
                    errorDescTv.setVisibility(8);
                }
                Intrinsics.checkNotNullExpressionValue(closeButton, "closeButton");
                closeButton.setVisibility(c2137b.f() ? 0 : 8);
            } else if (Intrinsics.d(state, c2138c)) {
                errorDescTv.setText(R.string.ozonid_error_no_connection_description);
                errorDescTv.setTextIsSelectable(false);
                errorDescTv.setOnClickListener(null);
            } else if (Intrinsics.d(state, dVar)) {
                errorDescTv.setText(R.string.ozonid_error_technical_error_description);
                errorDescTv.setTextIsSelectable(false);
                errorDescTv.setOnClickListener(null);
            } else {
                if (!(state instanceof b.c.e)) {
                    throw new o();
                }
                b.c.e eVar = (b.c.e) state;
                String a12 = eVar.a();
                if (a12 == null || h.K(a12)) {
                    errorDescTv.setText(R.string.ozonid_error_technical_error_description);
                    errorDescTv.setTextIsSelectable(false);
                    errorDescTv.setOnClickListener(null);
                } else {
                    k(eVar.a());
                }
            }
            boolean z14 = state instanceof b.c.C2137b;
            if (z14) {
                b.c.C2137b c2137b2 = (b.c.C2137b) state;
                String b11 = c2137b2.b();
                ButtonView screenStateActionBtn = f7.f14391f;
                if (b11 != null) {
                    h(b11, new c(this, state));
                    screenStateActionBtn.setVisibility(0);
                } else {
                    Intrinsics.checkNotNullExpressionValue(screenStateActionBtn, "screenStateActionBtn");
                    screenStateActionBtn.setVisibility(8);
                }
                if (c2137b2.h() != null) {
                    k(c2137b2.h());
                }
            } else {
                h(null, null);
            }
            int i13 = this.f97279f;
            if (z11) {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.width = i13;
                layoutParams.height = i13;
                imageView.setLayoutParams(layoutParams);
                return;
            }
            if (z14) {
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                layoutParams2.width = i13;
                layoutParams2.height = i13;
                imageView.setLayoutParams(layoutParams2);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ErrorView(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, 0);
        attributeSet = (i11 & 2) != 0 ? null : attributeSet;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f97279f = getResources().getDimensionPixelSize(R.dimen.dimen_88);
        this.f97278e = F.a(LayoutInflater.from(context), this);
    }
}
