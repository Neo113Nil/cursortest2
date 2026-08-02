package kc0;

import Rc0.c;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.id.onetap.compose.onetap.OneTapTitleScenario;
import com.vk.id.onetap.xml.OneTap;
import ic0.C7046b;
import ic0.C7047c;
import kc0.InterfaceC7643a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import nc0.C8493d;
import org.jetbrains.annotations.NotNull;
import r.o;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.credentials.views.BadgeOr;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;
import ru.ozon.id.nativeauth.data.models.b;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.text.TextFieldCellApi;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.cell.text.data.TextFieldPresets;
import ru.ozon.uni.android.component.sheet.SheetMode;
import ru.ozon.uni.android.component.sheet.SheetView;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.controls.button.UncontainedButtonView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInputLayout;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.Style;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.controls.button.ButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;
import td0.C9861a;
import wd0.C10540a;
import xe.C10727i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkc0/c;", "Landroidx/fragment/app/m;", "<init>", "()V", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: kc0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7645c extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    private Jb0.m f71321a;

    /* renamed from: b, reason: collision with root package name */
    private OneTap f71322b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final y0 f71323c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f71324d;

    /* renamed from: kc0.c$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71325a;

        static {
            int[] iArr = new int[EntryDTO.InputDTO.b.values().length];
            try {
                iArr[EntryDTO.InputDTO.b.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EntryDTO.InputDTO.b.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EntryDTO.InputDTO.b.PASSWORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f71325a = iArr;
        }
    }

    /* renamed from: kc0.c$b */
    static final class b extends AbstractC7737t implements Function0<cc0.d> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cc0.d invoke() {
            return new cc0.d(new C7651i(1, C7645c.this.C(), C7629C.class, "onCredentialsChange", "onCredentialsChange(Ljava/lang/CharSequence;)V", 0));
        }
    }

    /* renamed from: kc0.c$c, reason: collision with other inner class name */
    static final class C1170c extends AbstractC7737t implements Function1<C7047c, Unit> {
        C1170c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C7047c c7047c) {
            C7047c it = c7047c;
            Intrinsics.checkNotNullParameter(it, "it");
            C7645c.this.C().B1(it.a(), it.b(), it.c());
            return Unit.f71690a;
        }
    }

    /* renamed from: kc0.c$d */
    public static final class d extends AbstractC7737t implements Function0<z0.b> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C7645c f71329c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C7645c c7645c) {
            super(0);
            this.f71329c = c7645c;
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            return new C7627A(C7645c.this, this.f71329c);
        }
    }

    public C7645c() {
        super(R.layout.fragment_ozon_id_entry);
        d dVar = new d(this);
        InterfaceC4008j a11 = Sc.k.a(Sc.n.NONE, new Bc0.l(new Bc0.k(this)));
        this.f71323c = b0.b(this, kotlin.jvm.internal.N.b(C7629C.class), new Bc0.m(a11), new Bc0.n(a11), dVar);
        this.f71324d = Sc.k.b(new b());
    }

    public static final void B(C7645c c7645c, InterfaceC7643a interfaceC7643a) {
        String message;
        if (interfaceC7643a instanceof InterfaceC7643a.c) {
            InterfaceC7643a.c cVar = (InterfaceC7643a.c) interfaceC7643a;
            o.d.a aVar = new o.d.a();
            aVar.f(c7645c.getString(R.string.ozonid_biometry_auth_prompt_title_android));
            aVar.d(c7645c.getString(R.string.ozonid_biometry_auth_dialog_disagree));
            o.d a11 = aVar.a();
            Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
            int i11 = gc0.g.f64253b;
            gc0.g.a(c7645c, a11, cVar.b(), new C7659q(c7645c, cVar));
            return;
        }
        if (interfaceC7643a instanceof InterfaceC7643a.e) {
            androidx.fragment.app.r requireActivity = c7645c.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            C8493d crossAppArgs = new C8493d(requireActivity);
            c7645c.C().getClass();
            Intrinsics.checkNotNullParameter(crossAppArgs, "crossAppArgs");
            Kb0.K k11 = Tb0.a.f26975d;
            if (k11 == null) {
                throw new Lb0.a();
            }
            k11.v().f().getValue().y(crossAppArgs);
            return;
        }
        if (!(interfaceC7643a instanceof InterfaceC7643a.d)) {
            if (interfaceC7643a instanceof InterfaceC7643a.b) {
                InterfaceC7643a.b bVar = (InterfaceC7643a.b) interfaceC7643a;
                ((C10540a) Oc0.b.a(c7645c, bVar.b(), new u(1, c7645c.C(), C7629C.class, "onUrlLinkClicked", "onUrlLinkClicked(Ljava/lang/String;)V", 0), new v(c7645c, bVar))).b();
                return;
            }
            if (!(interfaceC7643a instanceof InterfaceC7643a.C1167a)) {
                throw new Sc.o();
            }
            InterfaceC7643a.C1167a c1167a = (InterfaceC7643a.C1167a) interfaceC7643a;
            FastEntryActionDTO.EntryNotification notification = c1167a.a().getNotification();
            if (notification != null && (message = notification.getMessage()) != null) {
                View rootView = c7645c.requireActivity().getWindow().getDecorView().getRootView();
                ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
                if (viewGroup != null) {
                    new Qc0.a().d(Qc0.a.b(message, NotificationDTO.Preset.SUCCESS, 5), viewGroup, null, null);
                }
            }
            androidx.fragment.app.G childFragmentManager = c7645c.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            androidx.fragment.app.Q p11 = childFragmentManager.p();
            Intrinsics.checkNotNullExpressionValue(p11, "beginTransaction()");
            int i12 = Rc0.c.f24976c;
            p11.d(c.a.a(c1167a.b(), Rc0.a.Entry), "AgreementsSheet");
            p11.i();
            return;
        }
        Context requireContext = c7645c.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        int px = UiExtKt.toPx(62);
        int px2 = UiExtKt.toPx(18);
        int px3 = UiExtKt.toPx(24);
        RecyclerView recyclerView = new RecyclerView(requireContext);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext));
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
        recyclerView.setPadding(0, px + px2, 0, UiExtKt.toPx(8) + px3);
        recyclerView.setClipToPadding(false);
        recyclerView.setBackgroundResource(android.R.color.transparent);
        SheetView sheetView = new SheetView(recyclerView, null, SheetMode.FULLSCREEN, true, 2, null);
        ru.ozon.id.nativeauth.credentials.countryCode.a a12 = ru.ozon.id.nativeauth.credentials.countryCode.c.a(new C7660s(sheetView, c7645c));
        recyclerView.setAdapter(a12);
        androidx.lifecycle.J viewLifecycleOwner = c7645c.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(androidx.lifecycle.K.a(viewLifecycleOwner), null, null, new r(viewLifecycleOwner, null, (InterfaceC7643a.d) interfaceC7643a, sheetView, recyclerView, a12, requireContext, px, px3, px2), 3);
        androidx.fragment.app.G childFragmentManager2 = c7645c.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
        androidx.fragment.app.Q p12 = childFragmentManager2.p();
        Intrinsics.checkNotNullExpressionValue(p12, "beginTransaction()");
        p12.d(sheetView, "SheetView");
        p12.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C7629C C() {
        return (C7629C) this.f71323c.getValue();
    }

    public static boolean t(C7645c c7645c, int i11) {
        boolean z11 = i11 == 6;
        if (z11) {
            c7645c.C().L1();
        }
        return z11;
    }

    public static void u(C7645c c7645c, b.c cVar) {
        c7645c.C().K1(c7645c, cVar);
    }

    public static void v(C7645c c7645c) {
        c7645c.C().D1();
    }

    public static void w(C7645c c7645c) {
        c7645c.C().G1();
    }

    public static void x(C7645c c7645c) {
        c7645c.C().L1();
    }

    public static final void y(C7645c c7645c, Jb0.m mVar, CharSequence charSequence) {
        TextFieldCellView credentialsTextField = mVar.f14504e;
        Intrinsics.checkNotNullExpressionValue(credentialsTextField, "credentialsTextField");
        cc0.c.c(credentialsTextField, charSequence, (cc0.d) c7645c.f71324d.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public static final void z(C7645c c7645c, Jb0.m mVar, ru.ozon.id.nativeauth.data.models.b bVar) {
        ?? r32;
        int i11;
        C7645c c7645c2;
        int i12;
        int i13;
        ru.ozon.id.nativeauth.data.models.b bVar2;
        Jb0.m mVar2;
        Jb0.m mVar3;
        OzonSpannableString text;
        OzonTextInputLayoutModel.KeyboardType keyboardType;
        TextAtomV2View titleTextAtomV2 = mVar.f14512m;
        Intrinsics.checkNotNullExpressionValue(titleTextAtomV2, "titleTextAtomV2");
        cc0.c.b(titleTextAtomV2, bVar.getTitle());
        TextAtomV2View subtitleTextAtomV2 = mVar.f14509j;
        Intrinsics.checkNotNullExpressionValue(subtitleTextAtomV2, "subtitleTextAtomV2");
        OzonSpannableString h11 = bVar.h();
        if (h11 == null) {
            subtitleTextAtomV2.setVisibility(8);
            i11 = 2;
            r32 = 0;
        } else {
            OzonUrlSpan.Companion.configUrlSpans$default(OzonUrlSpan.INSTANCE, h11, null, Integer.valueOf(subtitleTextAtomV2.getContext().getColor(R.color.text_action)), null, new Pair(subtitleTextAtomV2, new C7649g(1, c7645c.C(), C7629C.class, "onUrlLinkClicked", "onUrlLinkClicked(Ljava/lang/String;)V", 0)), 5, null);
            boolean hasClickableSpan = OzonSpannableStringKt.hasClickableSpan(h11);
            TextDTO.TextAlignment textAlignment = TextDTO.TextAlignment.LEADING;
            CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
            r32 = 0;
            i11 = 2;
            TextDTO textDTO = new TextDTO(h11, textAlignment, layoutPadding, layoutPadding, null, null, TextPreset.PARAGRAPH, null, UniColors.TEXT_SECONDARY.getToken(), Integer.MAX_VALUE, null, null, null, hasClickableSpan, null, null, null, null, null, 515248, null);
            subtitleTextAtomV2.setVisibility(0);
            TextHolderKt.bind$default(subtitleTextAtomV2, textDTO, null, 2, null);
        }
        Jb0.x countrySelector = mVar.f14503d;
        Intrinsics.checkNotNullExpressionValue(countrySelector, "countrySelector");
        EntryDTO.InputDTO e11 = bVar.e();
        EntryDTO.InputDTO.CountrySelect countrySelect = e11 != null ? e11.getCountrySelect() : null;
        LinearLayoutCompat b11 = countrySelector.b();
        if (countrySelect != null) {
            int resId = UniTextStyles.BODY_500_MEDIUM.getResId();
            AppCompatTextView appCompatTextView = countrySelector.f14569b;
            appCompatTextView.setTextAppearance(resId);
            c7645c2 = c7645c;
            appCompatTextView.setText(c7645c2.getString(R.string.ozonid_phone_country_code_format, countrySelect.getPhoneCode()));
            i12 = r32;
        } else {
            c7645c2 = c7645c;
            i12 = 8;
        }
        b11.setVisibility(i12);
        TextFieldCellView credentialsTextField = mVar.f14504e;
        Intrinsics.checkNotNullExpressionValue(credentialsTextField, "credentialsTextField");
        EntryDTO.InputDTO e12 = bVar.e();
        if (e12 != null) {
            credentialsTextField.setInputLabelText(e12.getPlaceholder());
            int i14 = a.f71325a[e12.getType().ordinal()];
            if (i14 == 1) {
                keyboardType = OzonTextInputLayoutModel.KeyboardType.PHONE;
            } else {
                if (i14 != i11 && i14 != 3) {
                    throw new Sc.o();
                }
                keyboardType = OzonTextInputLayoutModel.KeyboardType.TEXT;
            }
            credentialsTextField.setInputKeyboardType(keyboardType);
            TextFieldCellApi.DefaultImpls.inputHasPassword$default(credentialsTextField, e12.getType() != EntryDTO.InputDTO.b.PASSWORD ? r32 : true, r32, i11, null);
            td0.p.b(credentialsTextField, e12.getFocusTrackAction(), new C7646d(1, c7645c2.C(), C7629C.class, "onInputFocused", "onInputFocused(Ljava/lang/String;)V", 0));
            ViewExtKt.show(credentialsTextField);
        } else {
            ViewExtKt.gone(credentialsTextField);
            td0.p.a(credentialsTextField);
        }
        ButtonView submitButton = mVar.f14508i;
        Intrinsics.checkNotNullExpressionValue(submitButton, "submitButton");
        EntryDTO.SubmitButtonDTO g10 = bVar.g();
        if (g10 == null) {
            i13 = 8;
            submitButton.setVisibility(8);
        } else {
            i13 = 8;
            ButtonDTO buttonDTO = new ButtonDTO(ButtonDTO.Preset.SIZE_600, Style.ACTION_PRIMARY, null, new CommonAtomLabelDTO(OzonSpannableStringKt.toOzonSpannableString(g10.getTitle()), null, null, null, null, null, null, false, null, 510, null), null, null, 20, null);
            submitButton.setVisibility(r32);
            ButtonHolderKt.bind$default(submitButton, buttonDTO, null, i11, null);
            submitButton.setOnClickListener(new FG.a(c7645c2, 15));
            C9861a.e(submitButton, "submitButton");
        }
        b.d f7 = bVar.f();
        String title = f7 != null ? f7.getTitle() : null;
        BadgeOr badgeOr = mVar.f14511l;
        if (title == null || title.length() == 0) {
            badgeOr.setVisibility(i13);
        } else {
            badgeOr.setVisibility(r32);
            TextAtomV2View textAtomV2View = (TextAtomV2View) badgeOr.findViewById(R.id.titleBadge);
            if (textAtomV2View != null) {
                textAtomV2View.setText(title);
                Context context = textAtomV2View.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                TextViewExtKt.applyStyle(textAtomV2View, context, UniTextStyles.BODY_400_SMALL.getResId());
            }
        }
        LinearLayout containerSocialButtons = mVar.f14501b;
        Intrinsics.checkNotNullExpressionValue(containerSocialButtons, "containerSocialButtons");
        containerSocialButtons.removeAllViews();
        b.d f11 = bVar.f();
        if (f11 == null || f11.a().isEmpty()) {
            f11 = null;
        }
        if (f11 == null) {
            containerSocialButtons.setVisibility(i13);
            bVar2 = bVar;
        } else {
            for (b.c cVar : f11.a()) {
                if (cVar.e() != EntryDTO.b.VKID_ONE_TAP) {
                    String string = c7645c2.getString(cVar.d());
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    ButtonV3DTO buttonV3DTO = new ButtonV3DTO(ButtonV3DTO.StyleTypes.CUSTOM, ButtonV3DTO.Sizes.SIZE_600, string, null, cVar.b(), null, null, StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue(), null, null, StyleParser.OzColor.OZ_SEMANTIC_COLOR_ACCENT_PRIMARY.getValue(), null, StyleParser.OzColor.OZ_SEMANTIC_CTRL_NEUTRAL_PALE.getValue(), null, null, null, null, null, 256872, null);
                    Context context2 = containerSocialButtons.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    ButtonV3View buttonV3View = new ButtonV3View(context2, null, 0, 0, 14, null);
                    ButtonV3HolderKt.bindOrGone$default(buttonV3View, buttonV3DTO, null, i11, null);
                    buttonV3View.setOnClickListener(new Lo.a(2, c7645c2, cVar));
                    containerSocialButtons.addView(buttonV3View);
                } else if (bVar.k() != null && (mVar2 = c7645c2.f71321a) != null && mVar2.f14501b.indexOfChild(c7645c2.f71322b) == -1 && (mVar3 = c7645c2.f71321a) != null) {
                    LinearLayout linearLayout = mVar3.f14501b;
                    Context requireContext = c7645c2.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    OneTap oneTap = new OneTap(requireContext, null, 0, 6, null);
                    oneTap.setId(R.id.vkIdOneTapButton);
                    oneTap.setScenario(OneTapTitleScenario.SignIn);
                    oneTap.setLayoutParams(new ConstraintLayout.b(-1, -2));
                    linearLayout.addView(oneTap);
                    oneTap.setCallbacks(w.f71413b, new x(c7645c2), new y(c7645c2), new z(c7645c2, bVar, null));
                    c7645c2.f71322b = oneTap;
                }
            }
            bVar2 = bVar;
            containerSocialButtons.setVisibility(r32);
        }
        TextAtomV2View termsOfUseTextView = mVar.f14510k;
        Intrinsics.checkNotNullExpressionValue(termsOfUseTextView, "termsOfUseTextView");
        EntryDTO.TermsOfUse i15 = bVar2.i();
        if (i15 == null || (text = i15.getText()) == null) {
            termsOfUseTextView.setVisibility(i13);
        } else {
            OzonUrlSpan.Companion.configUrlSpans$default(OzonUrlSpan.INSTANCE, text, null, Integer.valueOf(termsOfUseTextView.getContext().getColor(R.color.text_action)), null, new Pair(termsOfUseTextView, new C7650h(1, c7645c2.C(), C7629C.class, "onUrlLinkClicked", "onUrlLinkClicked(Ljava/lang/String;)V", 0)), 5, null);
            boolean hasClickableSpan2 = OzonSpannableStringKt.hasClickableSpan(text);
            CommonCellSettings.LayoutPadding layoutPadding2 = CommonCellSettings.LayoutPadding.PADDING_500;
            TextDTO textDTO2 = new TextDTO(text, TextDTO.TextAlignment.LEADING, layoutPadding2, layoutPadding2, null, null, TextPreset.PARAGRAPH_COMPACT, null, UniColors.TEXT_SECONDARY.getToken(), Integer.MAX_VALUE, null, null, null, hasClickableSpan2, null, null, null, null, null, 515248, null);
            termsOfUseTextView.setVisibility(r32);
            TextHolderKt.bind$default(termsOfUseTextView, textDTO2, null, i11, null);
        }
        Jb0.y yVar = mVar.f14505f;
        ru.ozon.id.common.disclaimer.a.a(yVar, bVar2.b(), new C7647e(1, c7645c2.C(), C7629C.class, "onDisclaimerButtonClicked", "onDisclaimerButtonClicked(Lru/ozon/id/common/disclaimer/DisclaimerDTO$DisclaimerButtonDTO;)V", 0));
        int id2 = termsOfUseTextView.getId();
        UncontainedButtonView uncontainedButtonView = yVar.f14573c;
        uncontainedButtonView.setNextFocusUpId(id2);
        LinearLayout hintButtonsLinearLayout = mVar.f14507h;
        uncontainedButtonView.setNextFocusDownId(hintButtonsLinearLayout.getId());
        Intrinsics.checkNotNullExpressionValue(hintButtonsLinearLayout, "hintButtonsLinearLayout");
        cc0.c.a(hintButtonsLinearLayout, bVar2.d(), new C7648f(c7645c2), null, 4);
        ConstraintLayout contentContainer = mVar.f14502c;
        Intrinsics.checkNotNullExpressionValue(contentContainer, "contentContainer");
        contentContainer.setVisibility(r32);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C7046b.a.a(this, "EntryCredentials", new C1170c());
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        Jb0.m mVar = this.f71321a;
        if (mVar != null) {
            OzonTextInputLayout mainView = mVar.f14504e.getMainView();
            mainView.setTextWatcher(null);
            mainView.getInputViewGroup().getInputView().setOnEditorActionListener(null);
        }
        this.f71321a = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Jb0.m a11 = Jb0.m.a(view);
        ConstraintLayout contentContainer = a11.f14502c;
        Intrinsics.checkNotNullExpressionValue(contentContainer, "contentContainer");
        contentContainer.setVisibility(8);
        TextFieldCellView credentialsTextField = a11.f14504e;
        Intrinsics.checkNotNullExpressionValue(credentialsTextField, "credentialsTextField");
        credentialsTextField.setSaveEnabled(false);
        credentialsTextField.setPreset(TextFieldPresets.INSTANCE.getDefault600End());
        TextFieldCellApi.DefaultImpls.setLabelColor$default(credentialsTextField, credentialsTextField.getContext().getColor(R.color.graphic_negative_primary), 0.0f, 2, null);
        credentialsTextField.getMainView().setTextWatcher((cc0.d) this.f71324d.getValue());
        credentialsTextField.setInputKeyboardAction(OzonTextInputLayoutModel.KeyboardAction.DONE);
        OzonTextInput inputView = credentialsTextField.getMainView().getInputViewGroup().getInputView();
        inputView.setTextAppearance(UniTextStyles.COMPACT_500_MEDIUM.getResId());
        inputView.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: kc0.b
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                return C7645c.t(C7645c.this, i11);
            }
        });
        C9861a.d(credentialsTextField, "credentialsTextField");
        a11.f14503d.b().setOnClickListener(new CG.b(this, 18));
        a11.f14506g.setOnClickListener(new CG.c(this, 12));
        C7629C C11 = C();
        androidx.lifecycle.J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(androidx.lifecycle.K.a(viewLifecycleOwner), null, null, new C7652j(viewLifecycleOwner, null, C11, this, a11), 3);
        this.f71321a = a11;
        C().N1();
    }
}
