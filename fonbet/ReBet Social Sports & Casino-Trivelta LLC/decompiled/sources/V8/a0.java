package V8;

import Ph.AbstractC1440a0;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.C1452g0;
import Ph.C1483w0;
import V8.U;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import l0.AbstractC5338c;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class a0 extends b0 {

    /* renamed from: G, reason: collision with root package name */
    public S8.e f12691G;

    /* renamed from: H, reason: collision with root package name */
    public Function1 f12692H;

    /* renamed from: I, reason: collision with root package name */
    public Function1 f12693I;

    /* renamed from: J, reason: collision with root package name */
    public C0 f12694J;

    /* renamed from: K, reason: collision with root package name */
    public U.d f12695K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f12696L;

    /* renamed from: O, reason: collision with root package name */
    public ImageView f12697O;

    /* renamed from: P, reason: collision with root package name */
    public ImageView f12698P;

    /* renamed from: R, reason: collision with root package name */
    public EditText f12699R;

    public static final class b extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f12704d = new b();

        public b() {
            super(1);
        }

        public final void invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f12705d = new c();

        public c() {
            super(1);
        }

        public final void invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final d f12706d = new d();

        public d() {
            super(1);
        }

        public final void invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final e f12707d = new e();

        public e() {
            super(1);
        }

        public final void invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12691G = S8.d.f10680a;
        this.f12692H = b.f12704d;
        this.f12693I = c.f12705d;
        this.f12695K = U.d.OPEN;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void H(a0 this$0) {
        boolean z10;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f12695K == U.d.OPEN) {
            Editable text = this$0.getSearchInput().getText();
            Intrinsics.checkNotNullExpressionValue(text, "searchInput.text");
            if (text.length() > 0) {
                z10 = true;
                this$0.getClearSearchBtn().setVisibility(!z10 ? 0 : 8);
                this$0.getPerformSearchBtn().setVisibility(0);
            }
        }
        z10 = false;
        this$0.getClearSearchBtn().setVisibility(!z10 ? 0 : 8);
        this$0.getPerformSearchBtn().setVisibility(0);
    }

    public static final void L(a0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getSearchInput().setText((CharSequence) null);
    }

    public static final void M(a0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f12692H.invoke(this$0.getSearchInput().getText().toString());
        if (this$0.f12696L) {
            this$0.I();
        }
    }

    public static final boolean N(a0 this$0, TextView textView, int i10, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i10 != 0 && i10 != 2 && i10 != 3) {
            return false;
        }
        this$0.f12692H.invoke(this$0.getSearchInput().getText().toString());
        if (!this$0.f12696L) {
            return true;
        }
        this$0.I();
        return true;
    }

    private final a getTextWatcher() {
        return new a();
    }

    public final void G() {
        post(new Runnable() { // from class: V8.Z
            @Override // java.lang.Runnable
            public final void run() {
                a0.H(a0.this);
            }
        });
    }

    public final void I() {
        Object systemService = getContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(getSearchInput().getWindowToken(), 0);
    }

    public final void J() {
        this.f12693I = d.f12706d;
        this.f12692H = e.f12707d;
        C0 c02 = this.f12694J;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        this.f12694J = null;
    }

    public final void K() {
        getClearSearchBtn().setOnClickListener(new View.OnClickListener() { // from class: V8.W
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a0.L(a0.this, view);
            }
        });
        getPerformSearchBtn().setOnClickListener(new View.OnClickListener() { // from class: V8.X
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a0.M(a0.this, view);
            }
        });
        getSearchInput().addTextChangedListener(getTextWatcher());
        getSearchInput().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: V8.Y
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean N10;
                N10 = a0.N(a0.this, textView, i10, keyEvent);
                return N10;
            }
        });
    }

    public final void O() {
        getSearchInput().setHintTextColor(this.f12691G.q());
        getSearchInput().setTextColor(this.f12691G.r());
        getClearSearchBtn().setColorFilter(this.f12691G.r());
        setCornerRadius(U8.f.a(10));
        Drawable p10 = O8.k.f8390a.h().p();
        if (p10 == null) {
            p10 = AbstractC5338c.getDrawable(getContext(), O8.r.f8426n);
        }
        Q(p10);
        getPerformSearchBtn().setBackground(null);
        setBackgroundColor(this.f12691G.o());
    }

    public final void P(int i10) {
        getPerformSearchBtn().setImageResource(i10);
    }

    public final void Q(Drawable drawable) {
        getPerformSearchBtn().setImageDrawable(drawable);
    }

    @NotNull
    public final ImageView getClearSearchBtn() {
        ImageView imageView = this.f12697O;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clearSearchBtn");
        return null;
    }

    public final boolean getHideKeyboardOnSearch() {
        return this.f12696L;
    }

    @NotNull
    public final U.d getKeyboardState() {
        return this.f12695K;
    }

    @NotNull
    public final Function1<String, Unit> getOnSearchClickAction() {
        return this.f12692H;
    }

    @NotNull
    public final ImageView getPerformSearchBtn() {
        ImageView imageView = this.f12698P;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("performSearchBtn");
        return null;
    }

    @NotNull
    public final Function1<String, Unit> getQueryListener() {
        return this.f12693I;
    }

    @NotNull
    public final EditText getSearchInput() {
        EditText editText = this.f12699R;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("searchInput");
        return null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(O8.q.f8404c), 1073741824));
    }

    public final void setClearSearchBtn(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.f12697O = imageView;
    }

    public final void setHideKeyboardOnSearch(boolean z10) {
        this.f12696L = z10;
    }

    public final void setKeyboardState(@NotNull U.d value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f12695K = value;
        G();
    }

    public final void setOnSearchClickAction(@NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f12692H = function1;
    }

    public final void setPerformSearchBtn(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.f12698P = imageView;
    }

    public final void setQueryListener(@NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f12693I = function1;
    }

    public final void setSearchInput(@NotNull EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.f12699R = editText;
    }

    public final void setText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        getSearchInput().setText(text, TextView.BufferType.EDITABLE);
        EditText searchInput = getSearchInput();
        Editable text2 = getSearchInput().getText();
        searchInput.setSelection(text2 != null ? text2.length() : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(Context context, S8.e theme) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.f12691G = theme;
        View.inflate(context, O8.t.f8538i, this);
        View findViewById = findViewById(O8.s.f8498k);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.clearSearchBtn)");
        setClearSearchBtn((ImageView) findViewById);
        getClearSearchBtn().setContentDescription(context.getString(O8.u.f8552f));
        View findViewById2 = findViewById(O8.s.f8501l0);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.performSearchBtn)");
        setPerformSearchBtn((ImageView) findViewById2);
        getPerformSearchBtn().setContentDescription(context.getString(O8.u.f8564r));
        View findViewById3 = findViewById(O8.s.f8511q0);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.searchInput)");
        setSearchInput((EditText) findViewById3);
        O();
        K();
    }

    public static final class a implements TextWatcher {

        /* renamed from: V8.a0$a$a, reason: collision with other inner class name */
        public static final class C0264a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f12701n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ a0 f12702o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Editable f12703p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0264a(a0 a0Var, Editable editable, Continuation continuation) {
                super(2, continuation);
                this.f12702o = a0Var;
                this.f12703p = editable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0264a(this.f12702o, this.f12703p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Ph.P p10, Continuation continuation) {
                return ((C0264a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f12701n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f12701n = 1;
                    if (AbstractC1440a0.a(300L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.f12702o.getQueryListener().invoke(String.valueOf(this.f12703p));
                return Unit.INSTANCE;
            }
        }

        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C0 d10;
            C0 c02 = a0.this.f12694J;
            if (c02 != null) {
                C0.a.b(c02, null, 1, null);
            }
            a0 a0Var = a0.this;
            d10 = AbstractC1459k.d(C1483w0.f9135a, C1452g0.c(), null, new C0264a(a0.this, editable, null), 2, null);
            a0Var.f12694J = d10;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            a0.this.G();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
