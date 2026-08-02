package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.customview.view.AbsSavedState;
import com.sports.insider.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class SearchView extends l2 implements n.c {

    /* renamed from: i0, reason: collision with root package name */
    public static final p3 f638i0;
    public boolean A;
    public CharSequence B;
    public boolean C;
    public boolean D;
    public int E;
    public boolean F;
    public CharSequence G;
    public boolean H;
    public int I;
    public SearchableInfo J;
    public Bundle K;
    public final f3 L;

    /* renamed from: a, reason: collision with root package name */
    public final SearchAutoComplete f639a;

    /* renamed from: b, reason: collision with root package name */
    public final View f640b;

    /* renamed from: c, reason: collision with root package name */
    public final View f641c;

    /* renamed from: d, reason: collision with root package name */
    public final View f642d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f643e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f644f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f645g;

    /* renamed from: g0, reason: collision with root package name */
    public final f3 f646g0;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f647h;

    /* renamed from: h0, reason: collision with root package name */
    public final WeakHashMap f648h0;

    /* renamed from: i, reason: collision with root package name */
    public final View f649i;
    public s3 j;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f650k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f651l;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f652m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f653n;

    /* renamed from: o, reason: collision with root package name */
    public final ImageView f654o;

    /* renamed from: p, reason: collision with root package name */
    public final Drawable f655p;
    public final int q;

    /* renamed from: r, reason: collision with root package name */
    public final int f656r;

    /* renamed from: s, reason: collision with root package name */
    public final Intent f657s;

    /* renamed from: t, reason: collision with root package name */
    public final Intent f658t;

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f659u;

    /* renamed from: v, reason: collision with root package name */
    public View.OnFocusChangeListener f660v;

    /* renamed from: w, reason: collision with root package name */
    public View.OnClickListener f661w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f662x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f663y;

    /* renamed from: z, reason: collision with root package name */
    public a1.c f664z;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new q3();

        /* renamed from: a, reason: collision with root package name */
        public boolean f665a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f665a = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f665a + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeValue(Boolean.valueOf(this.f665a));
        }
    }

    static {
        p3 p3Var = null;
        if (Build.VERSION.SDK_INT < 29) {
            p3 p3Var2 = new p3();
            p3Var2.f869a = null;
            p3Var2.f870b = null;
            p3Var2.f871c = null;
            p3.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                p3Var2.f869a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                p3Var2.f870b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                p3Var2.f871c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            p3Var = p3Var2;
        }
        f638i0 = p3Var;
    }

    public SearchView(@NonNull Context context) {
        super(context, null, R.attr.searchViewStyle);
        this.f650k = new Rect();
        this.f651l = new Rect();
        this.f652m = new int[2];
        this.f653n = new int[2];
        this.L = new f3(this, 0);
        this.f646g0 = new f3(this, 1);
        this.f648h0 = new WeakHashMap();
        i3 i3Var = new i3(this);
        j3 j3Var = new j3(this);
        k3 k3Var = new k3(this);
        v0 v0Var = new v0(1, this);
        m2 m2Var = new m2(1, this);
        e3 e3Var = new e3(this);
        int[] iArr = i.a.f10849v;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.searchViewStyle, 0);
        c4 c4Var = new c4(context, obtainStyledAttributes);
        androidx.core.view.z0.n(this, context, iArr, null, obtainStyledAttributes, R.attr.searchViewStyle);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f639a = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f640b = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f641c = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f642d = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f643e = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f644f = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f645g = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f647h = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f654o = imageView5;
        findViewById.setBackground(c4Var.b(20));
        findViewById2.setBackground(c4Var.b(25));
        imageView.setImageDrawable(c4Var.b(23));
        imageView2.setImageDrawable(c4Var.b(15));
        imageView3.setImageDrawable(c4Var.b(12));
        imageView4.setImageDrawable(c4Var.b(28));
        imageView5.setImageDrawable(c4Var.b(23));
        this.f655p = c4Var.b(22);
        m4.g.v(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.q = obtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.f656r = obtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(i3Var);
        imageView3.setOnClickListener(i3Var);
        imageView2.setOnClickListener(i3Var);
        imageView4.setOnClickListener(i3Var);
        searchAutoComplete.setOnClickListener(i3Var);
        searchAutoComplete.addTextChangedListener(e3Var);
        searchAutoComplete.setOnEditorActionListener(k3Var);
        searchAutoComplete.setOnItemClickListener(v0Var);
        searchAutoComplete.setOnItemSelectedListener(m2Var);
        searchAutoComplete.setOnKeyListener(j3Var);
        searchAutoComplete.setOnFocusChangeListener(new g3(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f659u = obtainStyledAttributes.getText(14);
        this.B = obtainStyledAttributes.getText(21);
        int i5 = obtainStyledAttributes.getInt(6, -1);
        if (i5 != -1) {
            setImeOptions(i5);
        }
        int i10 = obtainStyledAttributes.getInt(5, -1);
        if (i10 != -1) {
            setInputType(i10);
        }
        setFocusable(obtainStyledAttributes.getBoolean(1, true));
        c4Var.g();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f657s = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f658t = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f649i = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new h3(this));
        }
        o(this.f662x);
        l();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f639a;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final Intent b(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.G);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.K;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.J.getSearchActivity());
        return intent;
    }

    public final Intent c(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.K;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.D = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f639a;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.D = false;
    }

    public final void d() {
        int i5 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f639a;
        if (i5 >= 29) {
            l3.a(searchAutoComplete);
            return;
        }
        p3 p3Var = f638i0;
        p3Var.getClass();
        p3.a();
        Method method = p3Var.f869a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        p3Var.getClass();
        p3.a();
        Method method2 = p3Var.f870b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void e() {
        SearchAutoComplete searchAutoComplete = this.f639a;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f662x) {
            clearFocus();
            o(true);
        }
    }

    public final void f(int i5) {
        int i10;
        String h10;
        Cursor cursor = this.f664z.f15c;
        if (cursor != null && cursor.moveToPosition(i5)) {
            Intent intent = null;
            try {
                int i11 = u3.f967x;
                String h11 = u3.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h11 == null) {
                    h11 = this.J.getSuggestIntentAction();
                }
                if (h11 == null) {
                    h11 = "android.intent.action.SEARCH";
                }
                String h12 = u3.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h12 == null) {
                    h12 = this.J.getSuggestIntentData();
                }
                if (h12 != null && (h10 = u3.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h12 = h12 + "/" + Uri.encode(h10);
                }
                intent = b(h11, h12 == null ? null : Uri.parse(h12), u3.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), u3.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e7) {
                try {
                    i10 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i10 = -1;
                }
                io.sentry.android.core.w0.n("SearchView", "Search suggestions cursor at row " + i10 + " returned exception.", e7);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e9) {
                    io.sentry.android.core.w0.e("SearchView", "Failed launch activity: " + intent, e9);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f639a;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void g(int i5) {
        Editable text = this.f639a.getText();
        Cursor cursor = this.f664z.f15c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i5)) {
            setQuery(text);
            return;
        }
        String c2 = this.f664z.c(cursor);
        if (c2 != null) {
            setQuery(c2);
        } else {
            setQuery(text);
        }
    }

    public int getImeOptions() {
        return this.f639a.getImeOptions();
    }

    public int getInputType() {
        return this.f639a.getInputType();
    }

    public int getMaxWidth() {
        return this.E;
    }

    public CharSequence getQuery() {
        return this.f639a.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.B;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.J;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f659u : getContext().getText(this.J.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f656r;
    }

    public int getSuggestionRowLayout() {
        return this.q;
    }

    public a1.c getSuggestionsAdapter() {
        return this.f664z;
    }

    public final void h(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void i() {
        SearchAutoComplete searchAutoComplete = this.f639a;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.J != null) {
            getContext().startActivity(b("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void j() {
        boolean isEmpty = TextUtils.isEmpty(this.f639a.getText());
        int i5 = (!isEmpty || (this.f662x && !this.H)) ? 0 : 8;
        ImageView imageView = this.f645g;
        imageView.setVisibility(i5);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void k() {
        int[] iArr = this.f639a.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f641c.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f642d.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void l() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z5 = this.f662x;
        SearchAutoComplete searchAutoComplete = this.f639a;
        if (z5 && (drawable = this.f655p) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void m() {
        this.f642d.setVisibility(((this.A || this.F) && !this.f663y && (this.f644f.getVisibility() == 0 || this.f647h.getVisibility() == 0)) ? 0 : 8);
    }

    public final void n(boolean z5) {
        boolean z7 = this.A;
        this.f644f.setVisibility((!z7 || !(z7 || this.F) || this.f663y || !hasFocus() || (!z5 && this.F)) ? 8 : 0);
    }

    public final void o(boolean z5) {
        this.f663y = z5;
        int i5 = 8;
        int i10 = z5 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f639a.getText());
        this.f643e.setVisibility(i10);
        n(!isEmpty);
        this.f640b.setVisibility(z5 ? 8 : 0);
        ImageView imageView = this.f654o;
        imageView.setVisibility((imageView.getDrawable() == null || this.f662x) ? 8 : 0);
        j();
        if (this.F && !this.f663y && isEmpty) {
            this.f644f.setVisibility(8);
            i5 = 0;
        }
        this.f647h.setVisibility(i5);
        m();
    }

    @Override // n.c
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.f639a;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.G = "";
        clearFocus();
        o(true);
        searchAutoComplete.setImeOptions(this.I);
        this.H = false;
    }

    @Override // n.c
    public final void onActionViewExpanded() {
        if (this.H) {
            return;
        }
        this.H = true;
        SearchAutoComplete searchAutoComplete = this.f639a;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.I = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.L);
        post(this.f646g0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.l2, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i5, int i10, int i11, int i12) {
        super.onLayout(z5, i5, i10, i11, i12);
        if (z5) {
            SearchAutoComplete searchAutoComplete = this.f639a;
            int[] iArr = this.f652m;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f653n;
            getLocationInWindow(iArr2);
            int i13 = iArr[1] - iArr2[1];
            int i14 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i14;
            int height = searchAutoComplete.getHeight() + i13;
            Rect rect = this.f650k;
            rect.set(i14, i13, width, height);
            int i15 = rect.left;
            int i16 = rect.right;
            int i17 = i12 - i10;
            Rect rect2 = this.f651l;
            rect2.set(i15, 0, i16, i17);
            s3 s3Var = this.j;
            if (s3Var == null) {
                s3 s3Var2 = new s3(searchAutoComplete, rect2, rect);
                this.j = s3Var2;
                setTouchDelegate(s3Var2);
            } else {
                s3Var.f942b.set(rect2);
                Rect rect3 = s3Var.f944d;
                rect3.set(rect2);
                int i18 = -s3Var.f945e;
                rect3.inset(i18, i18);
                s3Var.f943c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.l2, android.view.View
    public final void onMeasure(int i5, int i10) {
        int i11;
        if (this.f663y) {
            super.onMeasure(i5, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (mode == Integer.MIN_VALUE) {
            int i12 = this.E;
            size = i12 > 0 ? Math.min(i12, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.E;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i11 = this.E) > 0) {
            size = Math.min(i11, size);
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        o(savedState.f665a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f665a = this.f663y;
        return savedState;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z5) {
        super.onWindowFocusChanged(z5);
        post(this.L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i5, Rect rect) {
        if (this.D || !isFocusable()) {
            return false;
        }
        if (this.f663y) {
            return super.requestFocus(i5, rect);
        }
        boolean requestFocus = this.f639a.requestFocus(i5, rect);
        if (requestFocus) {
            o(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.K = bundle;
    }

    public void setIconified(boolean z5) {
        if (z5) {
            e();
            return;
        }
        o(false);
        SearchAutoComplete searchAutoComplete = this.f639a;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f661w;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z5) {
        if (this.f662x == z5) {
            return;
        }
        this.f662x = z5;
        o(z5);
        l();
    }

    public void setImeOptions(int i5) {
        this.f639a.setImeOptions(i5);
    }

    public void setInputType(int i5) {
        this.f639a.setInputType(i5);
    }

    public void setMaxWidth(int i5) {
        this.E = i5;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f660v = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f661w = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.B = charSequence;
        l();
    }

    public void setQueryRefinementEnabled(boolean z5) {
        this.C = z5;
        a1.c cVar = this.f664z;
        if (cVar instanceof u3) {
            ((u3) cVar).f975p = z5 ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r0, 65536) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.J = searchableInfo;
        Intent intent = null;
        boolean z5 = true;
        SearchAutoComplete searchAutoComplete = this.f639a;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.J.getImeOptions());
            int inputType = this.J.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.J.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            a1.c cVar = this.f664z;
            if (cVar != null) {
                cVar.b(null);
            }
            if (this.J.getSuggestAuthority() != null) {
                u3 u3Var = new u3(getContext(), this, this.J, this.f648h0);
                this.f664z = u3Var;
                searchAutoComplete.setAdapter(u3Var);
                ((u3) this.f664z).f975p = this.C ? 2 : 1;
            }
            l();
        }
        SearchableInfo searchableInfo2 = this.J;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.J.getVoiceSearchLaunchWebSearch()) {
                intent = this.f657s;
            } else if (this.J.getVoiceSearchLaunchRecognizer()) {
                intent = this.f658t;
            }
            if (intent != null) {
            }
        }
        z5 = false;
        this.F = z5;
        if (z5) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        o(this.f663y);
    }

    public void setSubmitButtonEnabled(boolean z5) {
        this.A = z5;
        o(this.f663y);
    }

    public void setSuggestionsAdapter(a1.c cVar) {
        this.f664z = cVar;
        this.f639a.setAdapter(cVar);
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class SearchAutoComplete extends t {

        /* renamed from: a, reason: collision with root package name */
        public int f666a;

        /* renamed from: b, reason: collision with root package name */
        public SearchView f667b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f668c;

        /* renamed from: d, reason: collision with root package name */
        public final r3 f669d;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
            this.f669d = new r3(this);
            this.f666a = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i5 = configuration.screenWidthDp;
            int i10 = configuration.screenHeightDp;
            if (i5 >= 960 && i10 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i5 < 600) {
                return (i5 < 640 || i10 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                l3.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            p3 p3Var = SearchView.f638i0;
            p3Var.getClass();
            p3.a();
            Method method = p3Var.f871c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f666a <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.t, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f668c) {
                r3 r3Var = this.f669d;
                removeCallbacks(r3Var);
                post(r3Var);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z5, int i5, Rect rect) {
            super.onFocusChanged(z5, i5, rect);
            SearchView searchView = this.f667b;
            searchView.o(searchView.f663y);
            searchView.post(searchView.L);
            if (searchView.f639a.hasFocus()) {
                searchView.d();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i5, KeyEvent keyEvent) {
            if (i5 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f667b.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i5, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z5) {
            super.onWindowFocusChanged(z5);
            if (z5 && this.f667b.hasFocus() && getVisibility() == 0) {
                this.f668c = true;
                Context context = getContext();
                p3 p3Var = SearchView.f638i0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        public void setImeVisibility(boolean z5) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            r3 r3Var = this.f669d;
            if (!z5) {
                this.f668c = false;
                removeCallbacks(r3Var);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f668c = true;
                    return;
                }
                this.f668c = false;
                removeCallbacks(r3Var);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f667b = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i5) {
            super.setThreshold(i5);
            this.f666a = i5;
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    public void setOnCloseListener(m3 m3Var) {
    }

    public void setOnQueryTextListener(n3 n3Var) {
    }

    public void setOnSuggestionListener(o3 o3Var) {
    }
}
