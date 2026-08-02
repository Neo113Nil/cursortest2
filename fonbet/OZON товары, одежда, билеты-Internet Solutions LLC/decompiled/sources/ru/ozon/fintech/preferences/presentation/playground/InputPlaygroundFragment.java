package ru.ozon.fintech.preferences.presentation.playground;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import Sc.InterfaceC4008j;
import Sc.s;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.fragment.app.r;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import f3.AbstractC6409a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.preferences.presentation.playground.InputPlaygroundFragment;
import ru.ozon.fintech.ui.input.InputView;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.core.UniColors;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/fintech/preferences/presentation/playground/InputPlaygroundFragment;", "Landroidx/fragment/app/m;", "<init>", "()V", "fintech-preferences_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InputPlaygroundFragment extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    public z0.b f96880a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final y0 f96881b;

    /* renamed from: c, reason: collision with root package name */
    private v90.e f96882c;

    /* renamed from: d, reason: collision with root package name */
    private Resources.Theme f96883d;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96884a;

        static {
            int[] iArr = new int[InputView.Style.values().length];
            try {
                iArr[InputView.Style.INPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputView.Style.TEXTAREA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f96884a = iArr;
        }
    }

    public static final class b implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v90.e f96885a;

        public b(v90.e eVar) {
            this.f96885a = eVar;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            int i14;
            String valueOf = String.valueOf(charSequence);
            InputView inputView = this.f96885a.f102641x;
            try {
                i14 = Integer.valueOf(Integer.parseInt(valueOf));
            } catch (Exception unused) {
                i14 = 0;
            }
            inputView.setCounter(i14);
        }
    }

    public static final class c implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v90.e f96886a;

        public c(v90.e eVar) {
            this.f96886a = eVar;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            int i14;
            String valueOf = String.valueOf(charSequence);
            InputView inputView = this.f96886a.f102641x;
            try {
                i14 = Integer.parseInt(valueOf);
            } catch (Exception unused) {
                i14 = 1;
            }
            inputView.setRows(i14);
        }
    }

    public static final class d implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v90.e f96887a;

        public d(v90.e eVar) {
            this.f96887a = eVar;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            this.f96887a.f102641x.setLabel(String.valueOf(charSequence));
        }
    }

    public static final class e implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v90.e f96888a;

        public e(v90.e eVar) {
            this.f96888a = eVar;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            this.f96888a.f102641x.setInputText(String.valueOf(charSequence));
        }
    }

    public static final class f implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v90.e f96889a;

        public f(v90.e eVar) {
            this.f96889a = eVar;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            this.f96889a.f102641x.setCaption(String.valueOf(charSequence));
        }
    }

    public static final class g implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v90.e f96890a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InputPlaygroundFragment f96891b;

        public g(v90.e eVar, InputPlaygroundFragment inputPlaygroundFragment) {
            this.f96890a = eVar;
            this.f96891b = inputPlaygroundFragment;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            Integer valueOf;
            InputView inputView = this.f96890a.f102641x;
            String valueOf2 = String.valueOf(charSequence);
            if (valueOf2.length() == 0) {
                valueOf = null;
            } else {
                StyleParser styleParser = StyleParser.INSTANCE;
                Context requireContext = this.f96891b.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                valueOf = Integer.valueOf(styleParser.parseColor(requireContext, valueOf2, UniColors.TEXT_SECONDARY.getResId()));
            }
            inputView.setCaptionColor(valueOf);
        }
    }

    public static final class h implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v90.e f96892a;

        public h(v90.e eVar) {
            this.f96892a = eVar;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            InputView inputView = this.f96892a.f102641x;
            Integer w02 = kotlin.text.h.w0(String.valueOf(charSequence));
            inputView.setMaxLength(w02 != null ? w02.intValue() : 50);
        }
    }

    public static final class i implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v90.e f96893a;

        public i(v90.e eVar) {
            this.f96893a = eVar;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            this.f96893a.f102641x.setPlaceHolder(String.valueOf(charSequence));
        }
    }

    public static final class j implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v90.e f96894a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InputPlaygroundFragment f96895b;

        public j(v90.e eVar, InputPlaygroundFragment inputPlaygroundFragment) {
            this.f96894a = eVar;
            this.f96895b = inputPlaygroundFragment;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            Integer iconResByToken;
            String valueOf = String.valueOf(charSequence);
            InputView inputView = this.f96894a.f102641x;
            if (valueOf.length() == 0) {
                iconResByToken = null;
            } else {
                Context requireContext = this.f96895b.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                iconResByToken = TokensExtKt.getIconResByToken(requireContext, valueOf);
            }
            inputView.setFirstIconToken(iconResByToken);
        }
    }

    public static final class k implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v90.e f96896a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InputPlaygroundFragment f96897b;

        public k(v90.e eVar, InputPlaygroundFragment inputPlaygroundFragment) {
            this.f96896a = eVar;
            this.f96897b = inputPlaygroundFragment;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            Integer iconResByToken;
            String valueOf = String.valueOf(charSequence);
            InputView inputView = this.f96896a.f102641x;
            if (valueOf.length() == 0) {
                iconResByToken = null;
            } else {
                Context requireContext = this.f96897b.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                iconResByToken = TokensExtKt.getIconResByToken(requireContext, valueOf);
            }
            inputView.setSecondIconToken(iconResByToken);
        }
    }

    public static final class l implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v90.e f96898a;

        public l(v90.e eVar) {
            this.f96898a = eVar;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            String valueOf = String.valueOf(charSequence);
            InputView inputView = this.f96898a.f102641x;
            if (valueOf.length() == 0) {
                valueOf = null;
            }
            inputView.setInputMask(valueOf);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.playground.InputPlaygroundFragment$onViewCreated$lambda$35$$inlined$observe$1", f = "InputPlaygroundFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class m extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96899d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96900e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96902g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ v90.e f96903h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.playground.InputPlaygroundFragment$onViewCreated$lambda$35$$inlined$observe$1$1", f = "InputPlaygroundFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96904d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96905e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ v90.e f96906f;

            /* renamed from: ru.ozon.fintech.preferences.presentation.playground.InputPlaygroundFragment$m$a$a, reason: collision with other inner class name */
            public static final class C2120a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ v90.e f96907a;

                public C2120a(v90.e eVar) {
                    this.f96907a = eVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    int i11 = a.f96884a[((InputView.Style) t2).ordinal()];
                    v90.e eVar = this.f96907a;
                    if (i11 == 1) {
                        TextInputLayout fieldSize = eVar.f102639v;
                        Intrinsics.checkNotNullExpressionValue(fieldSize, "fieldSize");
                        fieldSize.setVisibility(0);
                        MaterialAutoCompleteTextView sizeDropdown = eVar.f102608B;
                        Intrinsics.checkNotNullExpressionValue(sizeDropdown, "sizeDropdown");
                        sizeDropdown.setVisibility(0);
                        TextInputLayout fieldLabelPosition = eVar.f102635r;
                        Intrinsics.checkNotNullExpressionValue(fieldLabelPosition, "fieldLabelPosition");
                        fieldLabelPosition.setVisibility(0);
                        TextInputLayout fieldTheme = eVar.f102640w;
                        Intrinsics.checkNotNullExpressionValue(fieldTheme, "fieldTheme");
                        fieldTheme.setVisibility(0);
                        MaterialAutoCompleteTextView themeDropdown = eVar.f102616J;
                        Intrinsics.checkNotNullExpressionValue(themeDropdown, "themeDropdown");
                        themeDropdown.setVisibility(0);
                        TextInputLayout fieldFirstIcon = eVar.f102632o;
                        Intrinsics.checkNotNullExpressionValue(fieldFirstIcon, "fieldFirstIcon");
                        fieldFirstIcon.setVisibility(0);
                        TextInputEditText etFirstIcon = eVar.f102623f;
                        Intrinsics.checkNotNullExpressionValue(etFirstIcon, "etFirstIcon");
                        etFirstIcon.setVisibility(0);
                        TextInputLayout fieldSecondIcon = eVar.f102638u;
                        Intrinsics.checkNotNullExpressionValue(fieldSecondIcon, "fieldSecondIcon");
                        fieldSecondIcon.setVisibility(0);
                        TextInputEditText etSecondIcon = eVar.f102628k;
                        Intrinsics.checkNotNullExpressionValue(etSecondIcon, "etSecondIcon");
                        etSecondIcon.setVisibility(0);
                        TextInputLayout fieldInputMask = eVar.f102633p;
                        Intrinsics.checkNotNullExpressionValue(fieldInputMask, "fieldInputMask");
                        fieldInputMask.setVisibility(0);
                        TextInputEditText etInputMask = eVar.f102624g;
                        Intrinsics.checkNotNullExpressionValue(etInputMask, "etInputMask");
                        etInputMask.setVisibility(0);
                        TextInputLayout fieldInputMode = eVar.f102634q;
                        Intrinsics.checkNotNullExpressionValue(fieldInputMode, "fieldInputMode");
                        fieldInputMode.setVisibility(0);
                        MaterialAutoCompleteTextView inputModeDropDown = eVar.f102642y;
                        Intrinsics.checkNotNullExpressionValue(inputModeDropDown, "inputModeDropDown");
                        inputModeDropDown.setVisibility(0);
                        TextInputLayout fieldMaxLength = eVar.f102636s;
                        Intrinsics.checkNotNullExpressionValue(fieldMaxLength, "fieldMaxLength");
                        fieldMaxLength.setVisibility(0);
                        TextInputEditText etmaxLength = eVar.f102630m;
                        Intrinsics.checkNotNullExpressionValue(etmaxLength, "etmaxLength");
                        etmaxLength.setVisibility(0);
                        LinearLayout bottomBarContainer = eVar.f102619b;
                        Intrinsics.checkNotNullExpressionValue(bottomBarContainer, "bottomBarContainer");
                        bottomBarContainer.setVisibility(8);
                        LinearLayout isResizeContainer = eVar.f102643z;
                        Intrinsics.checkNotNullExpressionValue(isResizeContainer, "isResizeContainer");
                        isResizeContainer.setVisibility(8);
                        TextInputEditText etRows = eVar.f102627j;
                        Intrinsics.checkNotNullExpressionValue(etRows, "etRows");
                        etRows.setVisibility(8);
                        TextInputLayout fieldRows = eVar.f102637t;
                        Intrinsics.checkNotNullExpressionValue(fieldRows, "fieldRows");
                        fieldRows.setVisibility(8);
                        TextInputLayout fieldCounter = eVar.f102631n;
                        Intrinsics.checkNotNullExpressionValue(fieldCounter, "fieldCounter");
                        fieldCounter.setVisibility(8);
                        TextInputEditText etCounter = eVar.f102622e;
                        Intrinsics.checkNotNullExpressionValue(etCounter, "etCounter");
                        etCounter.setVisibility(8);
                        SwitchMaterial switchHasInfoIcon = eVar.f102614H;
                        Intrinsics.checkNotNullExpressionValue(switchHasInfoIcon, "switchHasInfoIcon");
                        switchHasInfoIcon.setVisibility(8);
                    } else {
                        if (i11 != 2) {
                            throw new Sc.o();
                        }
                        TextInputLayout fieldSize2 = eVar.f102639v;
                        Intrinsics.checkNotNullExpressionValue(fieldSize2, "fieldSize");
                        fieldSize2.setVisibility(8);
                        MaterialAutoCompleteTextView sizeDropdown2 = eVar.f102608B;
                        Intrinsics.checkNotNullExpressionValue(sizeDropdown2, "sizeDropdown");
                        sizeDropdown2.setVisibility(8);
                        TextInputLayout fieldLabelPosition2 = eVar.f102635r;
                        Intrinsics.checkNotNullExpressionValue(fieldLabelPosition2, "fieldLabelPosition");
                        fieldLabelPosition2.setVisibility(8);
                        TextInputLayout fieldTheme2 = eVar.f102640w;
                        Intrinsics.checkNotNullExpressionValue(fieldTheme2, "fieldTheme");
                        fieldTheme2.setVisibility(8);
                        MaterialAutoCompleteTextView themeDropdown2 = eVar.f102616J;
                        Intrinsics.checkNotNullExpressionValue(themeDropdown2, "themeDropdown");
                        themeDropdown2.setVisibility(8);
                        TextInputLayout fieldFirstIcon2 = eVar.f102632o;
                        Intrinsics.checkNotNullExpressionValue(fieldFirstIcon2, "fieldFirstIcon");
                        fieldFirstIcon2.setVisibility(8);
                        TextInputEditText etFirstIcon2 = eVar.f102623f;
                        Intrinsics.checkNotNullExpressionValue(etFirstIcon2, "etFirstIcon");
                        etFirstIcon2.setVisibility(8);
                        TextInputLayout fieldSecondIcon2 = eVar.f102638u;
                        Intrinsics.checkNotNullExpressionValue(fieldSecondIcon2, "fieldSecondIcon");
                        fieldSecondIcon2.setVisibility(8);
                        TextInputEditText etSecondIcon2 = eVar.f102628k;
                        Intrinsics.checkNotNullExpressionValue(etSecondIcon2, "etSecondIcon");
                        etSecondIcon2.setVisibility(8);
                        TextInputLayout fieldInputMask2 = eVar.f102633p;
                        Intrinsics.checkNotNullExpressionValue(fieldInputMask2, "fieldInputMask");
                        fieldInputMask2.setVisibility(8);
                        TextInputEditText etInputMask2 = eVar.f102624g;
                        Intrinsics.checkNotNullExpressionValue(etInputMask2, "etInputMask");
                        etInputMask2.setVisibility(8);
                        TextInputLayout fieldInputMode2 = eVar.f102634q;
                        Intrinsics.checkNotNullExpressionValue(fieldInputMode2, "fieldInputMode");
                        fieldInputMode2.setVisibility(8);
                        MaterialAutoCompleteTextView inputModeDropDown2 = eVar.f102642y;
                        Intrinsics.checkNotNullExpressionValue(inputModeDropDown2, "inputModeDropDown");
                        inputModeDropDown2.setVisibility(8);
                        TextInputLayout fieldMaxLength2 = eVar.f102636s;
                        Intrinsics.checkNotNullExpressionValue(fieldMaxLength2, "fieldMaxLength");
                        fieldMaxLength2.setVisibility(8);
                        TextInputEditText etmaxLength2 = eVar.f102630m;
                        Intrinsics.checkNotNullExpressionValue(etmaxLength2, "etmaxLength");
                        etmaxLength2.setVisibility(8);
                        LinearLayout bottomBarContainer2 = eVar.f102619b;
                        Intrinsics.checkNotNullExpressionValue(bottomBarContainer2, "bottomBarContainer");
                        bottomBarContainer2.setVisibility(0);
                        LinearLayout isResizeContainer2 = eVar.f102643z;
                        Intrinsics.checkNotNullExpressionValue(isResizeContainer2, "isResizeContainer");
                        isResizeContainer2.setVisibility(0);
                        TextInputEditText etRows2 = eVar.f102627j;
                        Intrinsics.checkNotNullExpressionValue(etRows2, "etRows");
                        etRows2.setVisibility(0);
                        TextInputLayout fieldRows2 = eVar.f102637t;
                        Intrinsics.checkNotNullExpressionValue(fieldRows2, "fieldRows");
                        fieldRows2.setVisibility(0);
                        TextInputLayout fieldCounter2 = eVar.f102631n;
                        Intrinsics.checkNotNullExpressionValue(fieldCounter2, "fieldCounter");
                        fieldCounter2.setVisibility(0);
                        TextInputEditText etCounter2 = eVar.f102622e;
                        Intrinsics.checkNotNullExpressionValue(etCounter2, "etCounter");
                        etCounter2.setVisibility(0);
                        SwitchMaterial switchHasInfoIcon2 = eVar.f102614H;
                        Intrinsics.checkNotNullExpressionValue(switchHasInfoIcon2, "switchHasInfoIcon");
                        switchHasInfoIcon2.setVisibility(0);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, v90.e eVar) {
                super(2, dVar);
                this.f96905e = interfaceC2395h;
                this.f96906f = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96905e, dVar, this.f96906f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96904d;
                if (i11 == 0) {
                    s.b(obj);
                    C2120a c2120a = new C2120a(this.f96906f);
                    this.f96904d = 1;
                    if (this.f96905e.collect(c2120a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, v90.e eVar) {
            super(2, dVar);
            this.f96902g = interfaceC2395h;
            this.f96903h = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            m mVar = InputPlaygroundFragment.this.new m(this.f96902g, dVar, this.f96903h);
            mVar.f96900e = obj;
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((m) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96899d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96900e)) {
                    J viewLifecycleOwner = InputPlaygroundFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96902g, null, this.f96903h);
                    this.f96899d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    public static final class n extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return InputPlaygroundFragment.this;
        }
    }

    public static final class o extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f96909b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(n nVar) {
            super(0);
            this.f96909b = nVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f96909b.invoke();
        }
    }

    public static final class p extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96910b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96910b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f96910b.getValue()).getViewModelStore();
        }
    }

    public static final class q extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96911b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96911b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f96911b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public InputPlaygroundFragment() {
        B50.a aVar = new B50.a(this, 1);
        InterfaceC4008j a11 = Sc.k.a(Sc.n.NONE, new o(new n()));
        this.f96881b = b0.b(this, kotlin.jvm.internal.N.b(E90.m.class), new p(a11), new q(a11), aVar);
    }

    public static Unit t(InputPlaygroundFragment inputPlaygroundFragment, MenuItem it) {
        Editable text;
        Editable text2;
        Editable text3;
        Intrinsics.checkNotNullParameter(it, "it");
        v90.e eVar = inputPlaygroundFragment.f96882c;
        if (eVar != null) {
            InputView inputView = eVar.f102641x;
            E90.m mVar = (E90.m) inputPlaygroundFragment.f96881b.getValue();
            String inputText = inputView.getInputText();
            InputView.Size size = inputView.getSize();
            InputView.Theme theme = inputView.getTheme();
            String placeHolder = inputView.getPlaceHolder();
            String caption = inputView.getCaption();
            v90.e eVar2 = inputPlaygroundFragment.f96882c;
            String str = null;
            String obj = (eVar2 == null || (text3 = eVar2.f102621d.getText()) == null) ? null : text3.toString();
            InputView.Status status = inputView.getStatus();
            InputView.State state = inputView.getState();
            v90.e eVar3 = inputPlaygroundFragment.f96882c;
            String obj2 = (eVar3 == null || (text2 = eVar3.f102623f.getText()) == null) ? null : text2.toString();
            v90.e eVar4 = inputPlaygroundFragment.f96882c;
            if (eVar4 != null && (text = eVar4.f102628k.getText()) != null) {
                str = text.toString();
            }
            mVar.f0(inputText, size, theme, placeHolder, caption, obj, status, state, obj2, str, Integer.valueOf(inputView.getMaxLength()), inputView.getLabel(), inputView.getLabelPosition(), inputView.getInputMask(), inputView.getInputMode(), Boolean.valueOf(inputView.getBottomBar()), Integer.valueOf(inputView.getRows()), inputView.getCounter(), Boolean.valueOf(inputView.getIsResize()), Boolean.valueOf(inputView.getDisabledTextAreaClearButton()), Boolean.valueOf(inputView.getHasInfoIcon()));
        }
        return Unit.f71690a;
    }

    public static Unit u(InputPlaygroundFragment inputPlaygroundFragment) {
        ((E90.m) inputPlaygroundFragment.f96881b.getValue()).g0();
        return Unit.f71690a;
    }

    public static void v(v90.e eVar, InputPlaygroundFragment inputPlaygroundFragment, int i11) {
        InputView.Style style = ((InputView.Style[]) InputView.Style.getEntries().toArray(new InputView.Style[0]))[i11];
        eVar.f102641x.setStyle(style);
        ((E90.m) inputPlaygroundFragment.f96881b.getValue()).d0(style);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((w90.b) O30.a.a(O30.c.a(requireActivity)).a(w90.b.class)).r(this);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f96883d = requireActivity().getTheme();
        requireContext().setTheme(R.style.Theme_MaterialComponents_DayNight_NoActionBar);
        ((E90.m) this.f96881b.getValue()).getClass();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        v90.e b11 = v90.e.b(inflater, viewGroup);
        this.f96882c = b11;
        LinearLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroy() {
        Resources.Theme theme = this.f96883d;
        if (theme != null) {
            requireContext().getTheme().setTo(theme);
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        this.f96882c = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        v90.e eVar = this.f96882c;
        if (eVar != null) {
            eVar.f102617K.bindState(new FinToolbarState("Input Playground", null, null, null, null, null, null, null, null, Integer.valueOf(R.drawable.ic_m_disclosure_back_filled), "graphicTertiary", new B50.g(this, 1), Integer.valueOf(R.menu.download_menu), "graphicTertiary", null, new E90.h(this, 0), 17, 16894, null));
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), R.layout.fintech_playground_item_dropdown_menu, InputView.Style.getEntries().toArray(new InputView.Style[0]));
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(requireContext(), R.layout.fintech_playground_item_dropdown_menu, InputView.State.getEntries().toArray(new InputView.State[0]));
        ArrayAdapter arrayAdapter3 = new ArrayAdapter(requireContext(), R.layout.fintech_playground_item_dropdown_menu, InputView.Status.getEntries().toArray(new InputView.Status[0]));
        ArrayAdapter arrayAdapter4 = new ArrayAdapter(requireContext(), R.layout.fintech_playground_item_dropdown_menu, InputView.Theme.getEntries().toArray(new InputView.Theme[0]));
        ArrayAdapter arrayAdapter5 = new ArrayAdapter(requireContext(), R.layout.fintech_playground_item_dropdown_menu, InputView.Size.getEntries().toArray(new InputView.Size[0]));
        ArrayAdapter arrayAdapter6 = new ArrayAdapter(requireContext(), R.layout.fintech_playground_item_dropdown_menu, InputView.InputMode.getEntries().toArray(new InputView.InputMode[0]));
        ArrayAdapter arrayAdapter7 = new ArrayAdapter(requireContext(), R.layout.fintech_playground_item_dropdown_menu, InputView.LabelPosition.getEntries().toArray(new InputView.LabelPosition[0]));
        final v90.e eVar2 = this.f96882c;
        if (eVar2 != null) {
            x0<InputView.Style> e02 = ((E90.m) this.f96881b.getValue()).e0();
            J viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C10727i.c(K.a(viewLifecycleOwner), null, null, new m(e02, null, eVar2), 3);
            MaterialAutoCompleteTextView materialAutoCompleteTextView = eVar2.f102611E;
            materialAutoCompleteTextView.setAdapter(arrayAdapter);
            materialAutoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: E90.i
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view2, int i11, long j11) {
                    InputPlaygroundFragment.v(v90.e.this, this, i11);
                }
            });
            MaterialAutoCompleteTextView materialAutoCompleteTextView2 = eVar2.f102609C;
            materialAutoCompleteTextView2.setAdapter(arrayAdapter2);
            materialAutoCompleteTextView2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: E90.j
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view2, int i11, long j11) {
                    v90.e.this.f102641x.setState(((InputView.State[]) InputView.State.getEntries().toArray(new InputView.State[0]))[i11]);
                }
            });
            MaterialAutoCompleteTextView materialAutoCompleteTextView3 = eVar2.f102610D;
            materialAutoCompleteTextView3.setAdapter(arrayAdapter3);
            materialAutoCompleteTextView3.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: E90.k
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view2, int i11, long j11) {
                    v90.e.this.f102641x.setStatus(((InputView.Status[]) InputView.Status.getEntries().toArray(new InputView.Status[0]))[i11]);
                }
            });
            TextInputEditText etLabel = eVar2.f102625h;
            Intrinsics.checkNotNullExpressionValue(etLabel, "etLabel");
            etLabel.addTextChangedListener(new d(eVar2));
            MaterialAutoCompleteTextView materialAutoCompleteTextView4 = eVar2.f102607A;
            materialAutoCompleteTextView4.setAdapter(arrayAdapter7);
            materialAutoCompleteTextView4.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: E90.l
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view2, int i11, long j11) {
                    v90.e.this.f102641x.setLabelPosition(((InputView.LabelPosition[]) InputView.LabelPosition.getEntries().toArray(new InputView.LabelPosition[0]))[i11]);
                }
            });
            MaterialAutoCompleteTextView materialAutoCompleteTextView5 = eVar2.f102616J;
            materialAutoCompleteTextView5.setAdapter(arrayAdapter4);
            materialAutoCompleteTextView5.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: E90.a
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view2, int i11, long j11) {
                    v90.e.this.f102641x.setTheme(((InputView.Theme[]) InputView.Theme.getEntries().toArray(new InputView.Theme[0]))[i11]);
                }
            });
            MaterialAutoCompleteTextView materialAutoCompleteTextView6 = eVar2.f102608B;
            materialAutoCompleteTextView6.setAdapter(arrayAdapter5);
            materialAutoCompleteTextView6.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: E90.b
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view2, int i11, long j11) {
                    v90.e.this.f102641x.setSize(((InputView.Size[]) InputView.Size.getEntries().toArray(new InputView.Size[0]))[i11]);
                }
            });
            TextInputEditText etValue = eVar2.f102629l;
            Intrinsics.checkNotNullExpressionValue(etValue, "etValue");
            etValue.addTextChangedListener(new e(eVar2));
            TextInputEditText etCaption = eVar2.f102620c;
            Intrinsics.checkNotNullExpressionValue(etCaption, "etCaption");
            etCaption.addTextChangedListener(new f(eVar2));
            TextInputEditText etCaptionColor = eVar2.f102621d;
            Intrinsics.checkNotNullExpressionValue(etCaptionColor, "etCaptionColor");
            etCaptionColor.addTextChangedListener(new g(eVar2, this));
            TextInputEditText etmaxLength = eVar2.f102630m;
            Intrinsics.checkNotNullExpressionValue(etmaxLength, "etmaxLength");
            etmaxLength.addTextChangedListener(new h(eVar2));
            TextInputEditText etPlaceholder = eVar2.f102626i;
            Intrinsics.checkNotNullExpressionValue(etPlaceholder, "etPlaceholder");
            etPlaceholder.addTextChangedListener(new i(eVar2));
            TextInputEditText etFirstIcon = eVar2.f102623f;
            Intrinsics.checkNotNullExpressionValue(etFirstIcon, "etFirstIcon");
            etFirstIcon.addTextChangedListener(new j(eVar2, this));
            TextInputEditText etSecondIcon = eVar2.f102628k;
            Intrinsics.checkNotNullExpressionValue(etSecondIcon, "etSecondIcon");
            etSecondIcon.addTextChangedListener(new k(eVar2, this));
            TextInputEditText etInputMask = eVar2.f102624g;
            Intrinsics.checkNotNullExpressionValue(etInputMask, "etInputMask");
            etInputMask.addTextChangedListener(new l(eVar2));
            MaterialAutoCompleteTextView materialAutoCompleteTextView7 = eVar2.f102642y;
            materialAutoCompleteTextView7.setAdapter(arrayAdapter6);
            materialAutoCompleteTextView7.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: E90.c
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view2, int i11, long j11) {
                    v90.e.this.f102641x.setInputMode(((InputView.InputMode[]) InputView.InputMode.getEntries().toArray(new InputView.InputMode[0]))[i11]);
                }
            });
            TextInputEditText etCounter = eVar2.f102622e;
            Intrinsics.checkNotNullExpressionValue(etCounter, "etCounter");
            etCounter.addTextChangedListener(new b(eVar2));
            eVar2.f102612F.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: E90.d
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    v90.e.this.f102641x.setBottomBar(z11);
                }
            });
            eVar2.f102614H.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: E90.e
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    v90.e.this.f102641x.setHasInfoIcon(z11);
                }
            });
            eVar2.f102615I.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: E90.f
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    v90.e.this.f102641x.setResize(z11);
                }
            });
            eVar2.f102613G.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: E90.g
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    v90.e.this.f102641x.setDisabledTextAreaClearButton(z11);
                }
            });
            TextInputEditText etRows = eVar2.f102627j;
            Intrinsics.checkNotNullExpressionValue(etRows, "etRows");
            etRows.addTextChangedListener(new c(eVar2));
        }
    }
}
