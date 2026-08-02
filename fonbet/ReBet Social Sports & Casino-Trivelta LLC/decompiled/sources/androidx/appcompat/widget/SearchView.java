package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
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
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.AbstractC2082d0;
import androidx.customview.view.AbsSavedState;
import com.plaid.internal.EnumC3631g;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.AbstractC5335a;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements androidx.appcompat.view.c {

    /* renamed from: T4, reason: collision with root package name */
    public static final o f17081T4;

    /* renamed from: A, reason: collision with root package name */
    public final Drawable f17082A;

    /* renamed from: B, reason: collision with root package name */
    public final int f17083B;

    /* renamed from: C, reason: collision with root package name */
    public final int f17084C;

    /* renamed from: D, reason: collision with root package name */
    public final Intent f17085D;

    /* renamed from: E, reason: collision with root package name */
    public final Intent f17086E;

    /* renamed from: F, reason: collision with root package name */
    public final CharSequence f17087F;

    /* renamed from: G, reason: collision with root package name */
    public m f17088G;

    /* renamed from: H, reason: collision with root package name */
    public l f17089H;

    /* renamed from: I, reason: collision with root package name */
    public View.OnFocusChangeListener f17090I;

    /* renamed from: J, reason: collision with root package name */
    public View.OnClickListener f17091J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f17092K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f17093L;

    /* renamed from: O, reason: collision with root package name */
    public F0.a f17094O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f17095P;

    /* renamed from: P4, reason: collision with root package name */
    public final TextView.OnEditorActionListener f17096P4;

    /* renamed from: Q4, reason: collision with root package name */
    public final AdapterView.OnItemClickListener f17097Q4;

    /* renamed from: R, reason: collision with root package name */
    public CharSequence f17098R;

    /* renamed from: R4, reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f17099R4;

    /* renamed from: S4, reason: collision with root package name */
    public TextWatcher f17100S4;

    /* renamed from: T, reason: collision with root package name */
    public boolean f17101T;

    /* renamed from: T1, reason: collision with root package name */
    public SearchableInfo f17102T1;

    /* renamed from: V, reason: collision with root package name */
    public boolean f17103V;

    /* renamed from: V1, reason: collision with root package name */
    public Bundle f17104V1;

    /* renamed from: W, reason: collision with root package name */
    public int f17105W;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f17106b1;

    /* renamed from: b2, reason: collision with root package name */
    public final Runnable f17107b2;

    /* renamed from: g1, reason: collision with root package name */
    public CharSequence f17108g1;

    /* renamed from: g2, reason: collision with root package name */
    public Runnable f17109g2;
    private int[] mTemp;
    private int[] mTemp2;

    /* renamed from: n, reason: collision with root package name */
    public final SearchAutoComplete f17110n;

    /* renamed from: o, reason: collision with root package name */
    public final View f17111o;

    /* renamed from: p, reason: collision with root package name */
    public final View f17112p;

    /* renamed from: p1, reason: collision with root package name */
    public CharSequence f17113p1;

    /* renamed from: p2, reason: collision with root package name */
    public final WeakHashMap f17114p2;

    /* renamed from: q, reason: collision with root package name */
    public final View f17115q;

    /* renamed from: r, reason: collision with root package name */
    public final ImageView f17116r;

    /* renamed from: s, reason: collision with root package name */
    public final ImageView f17117s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f17118t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f17119u;

    /* renamed from: v, reason: collision with root package name */
    public final View f17120v;

    /* renamed from: w, reason: collision with root package name */
    public p f17121w;

    /* renamed from: x, reason: collision with root package name */
    public Rect f17122x;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f17123x1;

    /* renamed from: x2, reason: collision with root package name */
    public final View.OnClickListener f17124x2;

    /* renamed from: y, reason: collision with root package name */
    public Rect f17125y;

    /* renamed from: y1, reason: collision with root package name */
    public int f17126y1;

    /* renamed from: y2, reason: collision with root package name */
    public View.OnKeyListener f17127y2;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f17128z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public boolean f17129c;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f17129c + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f17129c));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f17129c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    public static class SearchAutoComplete extends C2048c {

        /* renamed from: d, reason: collision with root package name */
        public int f17130d;

        /* renamed from: e, reason: collision with root package name */
        public SearchView f17131e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f17132f;

        /* renamed from: g, reason: collision with root package name */
        public final Runnable f17133g;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, AbstractC5335a.f54998m);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 >= 600) {
                return 192;
            }
            if (i10 < 640 || i11 < 480) {
                return EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE;
            }
            return 192;
        }

        public void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f17081T4.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        public boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void d() {
            if (this.f17132f) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f17132f = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f17130d <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C2048c, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f17132f) {
                removeCallbacks(this.f17133g);
                post(this.f17133g);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f17131e.X();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
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
                        this.f17131e.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f17131e.hasFocus() && getVisibility() == 0) {
                this.f17132f = true;
                if (SearchView.K(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f17132f = false;
                removeCallbacks(this.f17133g);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f17132f = true;
                    return;
                }
                this.f17132f = false;
                removeCallbacks(this.f17133g);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f17131e = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f17130d = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f17133g = new a();
            this.f17130d = getThreshold();
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.W(charSequence);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.d0();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            F0.a aVar = SearchView.this.f17094O;
            if (aVar instanceof U) {
                aVar.a(null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f17090I;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.z();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f17116r) {
                searchView.T();
                return;
            }
            if (view == searchView.f17118t) {
                searchView.P();
                return;
            }
            if (view == searchView.f17117s) {
                searchView.U();
            } else if (view == searchView.f17119u) {
                searchView.Y();
            } else if (view == searchView.f17110n) {
                searchView.F();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f17102T1 == null) {
                return false;
            }
            if (searchView.f17110n.isPopupShowing() && SearchView.this.f17110n.getListSelection() != -1) {
                return SearchView.this.V(view, i10, keyEvent);
            }
            if (SearchView.this.f17110n.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.N(0, null, searchView2.f17110n.getText().toString());
            return true;
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.U();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.Q(i10, 0, null);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.R(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static class k {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface l {
        boolean a();
    }

    public interface m {
        boolean p(String str);

        boolean t(String str);
    }

    public interface n {
    }

    public static class o {

        /* renamed from: a, reason: collision with root package name */
        public Method f17145a;

        /* renamed from: b, reason: collision with root package name */
        public Method f17146b;

        /* renamed from: c, reason: collision with root package name */
        public Method f17147c;

        public o() {
            this.f17145a = null;
            this.f17146b = null;
            this.f17147c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f17145a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f17146b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f17147c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f17146b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f17145a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f17147c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static class p extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        public final View f17148a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f17149b;

        /* renamed from: c, reason: collision with root package name */
        public final Rect f17150c;

        /* renamed from: d, reason: collision with root package name */
        public final Rect f17151d;

        /* renamed from: e, reason: collision with root package name */
        public final int f17152e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f17153f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f17152e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f17149b = new Rect();
            this.f17151d = new Rect();
            this.f17150c = new Rect();
            a(rect, rect2);
            this.f17148a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f17149b.set(rect);
            this.f17151d.set(rect);
            Rect rect3 = this.f17151d;
            int i10 = this.f17152e;
            rect3.inset(-i10, -i10);
            this.f17150c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f17153f;
                    if (z11 && !this.f17151d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else {
                    if (action == 3) {
                        z11 = this.f17153f;
                        this.f17153f = false;
                    }
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                z10 = true;
            } else {
                if (this.f17149b.contains(x10, y10)) {
                    this.f17153f = true;
                    z10 = true;
                }
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (!z10 || this.f17150c.contains(x10, y10)) {
                Rect rect = this.f17150c;
                motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
            } else {
                motionEvent.setLocation(this.f17148a.getWidth() / 2, this.f17148a.getHeight() / 2);
            }
            return this.f17148a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f17081T4 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    public static boolean K(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(l.d.f55025e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(l.d.f55026f);
    }

    private void setQuery(CharSequence charSequence) {
        this.f17110n.setText(charSequence);
        this.f17110n.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final Intent A(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f17113p1);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f17104V1;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f17102T1.getSearchActivity());
        return intent;
    }

    public final Intent B(Cursor cursor, int i10, String str) {
        int i11;
        String n10;
        try {
            String n11 = U.n(cursor, "suggest_intent_action");
            if (n11 == null) {
                n11 = this.f17102T1.getSuggestIntentAction();
            }
            if (n11 == null) {
                n11 = "android.intent.action.SEARCH";
            }
            String str2 = n11;
            String n12 = U.n(cursor, "suggest_intent_data");
            if (n12 == null) {
                n12 = this.f17102T1.getSuggestIntentData();
            }
            if (n12 != null && (n10 = U.n(cursor, "suggest_intent_data_id")) != null) {
                n12 = n12 + "/" + Uri.encode(n10);
            }
            return A(str2, n12 == null ? null : Uri.parse(n12), U.n(cursor, "suggest_intent_extra_data"), U.n(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                i11 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i11 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            return null;
        }
    }

    public final Intent C(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f17104V1;
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

    public final Intent D(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    public final void E() {
        this.f17110n.dismissDropDown();
    }

    public void F() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f17110n);
            return;
        }
        o oVar = f17081T4;
        oVar.b(this.f17110n);
        oVar.a(this.f17110n);
    }

    public final void G(View view, Rect rect) {
        view.getLocationInWindow(this.mTemp);
        getLocationInWindow(this.mTemp2);
        int[] iArr = this.mTemp;
        int i10 = iArr[1];
        int[] iArr2 = this.mTemp2;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    public final CharSequence H(CharSequence charSequence) {
        if (!this.f17092K || this.f17082A == null) {
            return charSequence;
        }
        int textSize = (int) (this.f17110n.getTextSize() * 1.25d);
        this.f17082A.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f17082A), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final boolean I() {
        SearchableInfo searchableInfo = this.f17102T1;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            Intent intent = this.f17102T1.getVoiceSearchLaunchWebSearch() ? this.f17085D : this.f17102T1.getVoiceSearchLaunchRecognizer() ? this.f17086E : null;
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, PKIFailureInfo.notAuthorized) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean J() {
        return this.f17093L;
    }

    public final boolean L() {
        return (this.f17095P || this.f17106b1) && !J();
    }

    public final void M(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e10) {
            Log.e("SearchView", "Failed launch activity: " + intent, e10);
        }
    }

    public void N(int i10, String str, String str2) {
        getContext().startActivity(A("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    public final boolean O(int i10, int i11, String str) {
        Cursor c10 = this.f17094O.c();
        if (c10 == null || !c10.moveToPosition(i10)) {
            return false;
        }
        M(B(c10, i11, str));
        return true;
    }

    public void P() {
        if (!TextUtils.isEmpty(this.f17110n.getText())) {
            this.f17110n.setText("");
            this.f17110n.requestFocus();
            this.f17110n.setImeVisibility(true);
        } else if (this.f17092K) {
            l lVar = this.f17089H;
            if (lVar == null || !lVar.a()) {
                clearFocus();
                i0(true);
            }
        }
    }

    public boolean Q(int i10, int i11, String str) {
        O(i10, 0, null);
        this.f17110n.setImeVisibility(false);
        E();
        return true;
    }

    public boolean R(int i10) {
        a0(i10);
        return true;
    }

    public void S(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void T() {
        i0(false);
        this.f17110n.requestFocus();
        this.f17110n.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f17091J;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void U() {
        Editable text = this.f17110n.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m mVar = this.f17088G;
        if (mVar == null || !mVar.t(text.toString())) {
            if (this.f17102T1 != null) {
                N(0, null, text.toString());
            }
            this.f17110n.setImeVisibility(false);
            E();
        }
    }

    public boolean V(View view, int i10, KeyEvent keyEvent) {
        if (this.f17102T1 != null && this.f17094O != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return Q(this.f17110n.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.f17110n.setSelection(i10 == 21 ? 0 : this.f17110n.length());
                this.f17110n.setListSelection(0);
                this.f17110n.clearListSelection();
                this.f17110n.b();
                return true;
            }
            if (i10 == 19) {
                this.f17110n.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void W(CharSequence charSequence) {
        Editable text = this.f17110n.getText();
        this.f17113p1 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        h0(!isEmpty);
        j0(isEmpty);
        c0();
        g0();
        if (this.f17088G != null && !TextUtils.equals(charSequence, this.f17108g1)) {
            this.f17088G.p(charSequence.toString());
        }
        this.f17108g1 = charSequence.toString();
    }

    public void X() {
        i0(J());
        Z();
        if (this.f17110n.hasFocus()) {
            F();
        }
    }

    public void Y() {
        SearchableInfo searchableInfo = this.f17102T1;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(D(this.f17085D, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(C(this.f17086E, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public final void Z() {
        post(this.f17107b2);
    }

    public final void a0(int i10) {
        Editable text = this.f17110n.getText();
        Cursor c10 = this.f17094O.c();
        if (c10 == null) {
            return;
        }
        if (!c10.moveToPosition(i10)) {
            setQuery(text);
            return;
        }
        CharSequence convertToString = this.f17094O.convertToString(c10);
        if (convertToString != null) {
            setQuery(convertToString);
        } else {
            setQuery(text);
        }
    }

    public void b0(CharSequence charSequence, boolean z10) {
        this.f17110n.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f17110n;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f17113p1 = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        U();
    }

    public final void c0() {
        boolean isEmpty = TextUtils.isEmpty(this.f17110n.getText());
        this.f17118t.setVisibility(!isEmpty || (this.f17092K && !this.f17123x1) ? 0 : 8);
        Drawable drawable = this.f17118t.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f17103V = true;
        super.clearFocus();
        this.f17110n.clearFocus();
        this.f17110n.setImeVisibility(false);
        this.f17103V = false;
    }

    public void d0() {
        int[] iArr = this.f17110n.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f17112p.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f17115q.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void e0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f17110n;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(H(queryHint));
    }

    public final void f0() {
        this.f17110n.setThreshold(this.f17102T1.getSuggestThreshold());
        this.f17110n.setImeOptions(this.f17102T1.getImeOptions());
        int inputType = this.f17102T1.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f17102T1.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f17110n.setInputType(inputType);
        F0.a aVar = this.f17094O;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f17102T1.getSuggestAuthority() != null) {
            U u10 = new U(getContext(), this, this.f17102T1, this.f17114p2);
            this.f17094O = u10;
            this.f17110n.setAdapter(u10);
            ((U) this.f17094O).w(this.f17101T ? 2 : 1);
        }
    }

    public final void g0() {
        this.f17115q.setVisibility((L() && (this.f17117s.getVisibility() == 0 || this.f17119u.getVisibility() == 0)) ? 0 : 8);
    }

    public int getImeOptions() {
        return this.f17110n.getImeOptions();
    }

    public int getInputType() {
        return this.f17110n.getInputType();
    }

    public int getMaxWidth() {
        return this.f17105W;
    }

    public CharSequence getQuery() {
        return this.f17110n.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f17098R;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f17102T1;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f17087F : getContext().getText(this.f17102T1.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f17084C;
    }

    public int getSuggestionRowLayout() {
        return this.f17083B;
    }

    public F0.a getSuggestionsAdapter() {
        return this.f17094O;
    }

    public final void h0(boolean z10) {
        this.f17117s.setVisibility((this.f17095P && L() && hasFocus() && (z10 || !this.f17106b1)) ? 0 : 8);
    }

    public final void i0(boolean z10) {
        this.f17093L = z10;
        int i10 = 8;
        int i11 = z10 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f17110n.getText());
        this.f17116r.setVisibility(i11);
        h0(!isEmpty);
        this.f17111o.setVisibility(z10 ? 8 : 0);
        if (this.f17128z.getDrawable() != null && !this.f17092K) {
            i10 = 0;
        }
        this.f17128z.setVisibility(i10);
        c0();
        j0(isEmpty);
        g0();
    }

    public final void j0(boolean z10) {
        int i10 = 8;
        if (this.f17106b1 && !J() && z10) {
            this.f17117s.setVisibility(8);
            i10 = 0;
        }
        this.f17119u.setVisibility(i10);
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewCollapsed() {
        b0("", false);
        clearFocus();
        i0(true);
        this.f17110n.setImeOptions(this.f17126y1);
        this.f17123x1 = false;
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewExpanded() {
        if (this.f17123x1) {
            return;
        }
        this.f17123x1 = true;
        int imeOptions = this.f17110n.getImeOptions();
        this.f17126y1 = imeOptions;
        this.f17110n.setImeOptions(imeOptions | 33554432);
        this.f17110n.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f17107b2);
        post(this.f17109g2);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            G(this.f17110n, this.f17122x);
            Rect rect = this.f17125y;
            Rect rect2 = this.f17122x;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            p pVar = this.f17121w;
            if (pVar != null) {
                pVar.a(this.f17125y, this.f17122x);
                return;
            }
            p pVar2 = new p(this.f17125y, this.f17122x, this.f17110n);
            this.f17121w = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        if (J()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f17105W;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f17105W;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.f17105W) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        i0(savedState.f17129c);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f17129c = J();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        Z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.f17103V || !isFocusable()) {
            return false;
        }
        if (J()) {
            return super.requestFocus(i10, rect);
        }
        boolean requestFocus = this.f17110n.requestFocus(i10, rect);
        if (requestFocus) {
            i0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f17104V1 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            P();
        } else {
            T();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f17092K == z10) {
            return;
        }
        this.f17092K = z10;
        i0(z10);
        e0();
    }

    public void setImeOptions(int i10) {
        this.f17110n.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f17110n.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f17105W = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.f17089H = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f17090I = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.f17088G = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f17091J = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f17098R = charSequence;
        e0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f17101T = z10;
        F0.a aVar = this.f17094O;
        if (aVar instanceof U) {
            ((U) aVar).w(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f17102T1 = searchableInfo;
        if (searchableInfo != null) {
            f0();
            e0();
        }
        boolean I10 = I();
        this.f17106b1 = I10;
        if (I10) {
            this.f17110n.setPrivateImeOptions("nm");
        }
        i0(J());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f17095P = z10;
        i0(J());
    }

    public void setSuggestionsAdapter(F0.a aVar) {
        this.f17094O = aVar;
        this.f17110n.setAdapter(aVar);
    }

    public void z() {
        if (this.f17120v.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f17112p.getPaddingLeft();
            Rect rect = new Rect();
            boolean b10 = l0.b(this);
            int dimensionPixelSize = this.f17092K ? resources.getDimensionPixelSize(l.d.f55023c) + resources.getDimensionPixelSize(l.d.f55024d) : 0;
            this.f17110n.getDropDownBackground().getPadding(rect);
            this.f17110n.setDropDownHorizontalOffset(b10 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f17110n.setDropDownWidth((((this.f17120v.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5335a.f54976I);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17122x = new Rect();
        this.f17125y = new Rect();
        this.mTemp = new int[2];
        this.mTemp2 = new int[2];
        this.f17107b2 = new b();
        this.f17109g2 = new c();
        this.f17114p2 = new WeakHashMap();
        f fVar = new f();
        this.f17124x2 = fVar;
        this.f17127y2 = new g();
        h hVar = new h();
        this.f17096P4 = hVar;
        i iVar = new i();
        this.f17097Q4 = iVar;
        j jVar = new j();
        this.f17099R4 = jVar;
        this.f17100S4 = new a();
        a0 v10 = a0.v(context, attributeSet, l.j.SearchView, i10, 0);
        AbstractC2082d0.j0(this, context, l.j.SearchView, attributeSet, v10.r(), i10, 0);
        LayoutInflater.from(context).inflate(v10.n(l.j.f55224O1, l.g.f55139r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(l.f.f55083E);
        this.f17110n = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f17111o = findViewById(l.f.f55079A);
        View findViewById = findViewById(l.f.f55082D);
        this.f17112p = findViewById;
        View findViewById2 = findViewById(l.f.f55089K);
        this.f17115q = findViewById2;
        ImageView imageView = (ImageView) findViewById(l.f.f55120y);
        this.f17116r = imageView;
        ImageView imageView2 = (ImageView) findViewById(l.f.f55080B);
        this.f17117s = imageView2;
        ImageView imageView3 = (ImageView) findViewById(l.f.f55121z);
        this.f17118t = imageView3;
        ImageView imageView4 = (ImageView) findViewById(l.f.f55084F);
        this.f17119u = imageView4;
        ImageView imageView5 = (ImageView) findViewById(l.f.f55081C);
        this.f17128z = imageView5;
        AbstractC2082d0.p0(findViewById, v10.g(l.j.f55228P1));
        AbstractC2082d0.p0(findViewById2, v10.g(l.j.f55244T1));
        imageView.setImageDrawable(v10.g(l.j.f55240S1));
        imageView2.setImageDrawable(v10.g(l.j.f55216M1));
        imageView3.setImageDrawable(v10.g(l.j.f55204J1));
        imageView4.setImageDrawable(v10.g(l.j.f55252V1));
        imageView5.setImageDrawable(v10.g(l.j.f55240S1));
        this.f17082A = v10.g(l.j.f55236R1);
        f0.a(imageView, getResources().getString(l.h.f55156o));
        this.f17083B = v10.n(l.j.f55248U1, l.g.f55138q);
        this.f17084C = v10.n(l.j.f55208K1, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f17100S4);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f17127y2);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(v10.a(l.j.f55220N1, true));
        int f10 = v10.f(l.j.f55192G1, -1);
        if (f10 != -1) {
            setMaxWidth(f10);
        }
        this.f17087F = v10.p(l.j.f55212L1);
        this.f17098R = v10.p(l.j.f55232Q1);
        int k10 = v10.k(l.j.f55200I1, -1);
        if (k10 != -1) {
            setImeOptions(k10);
        }
        int k11 = v10.k(l.j.f55196H1, -1);
        if (k11 != -1) {
            setInputType(k11);
        }
        setFocusable(v10.a(l.j.f55188F1, true));
        v10.x();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f17085D = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f17086E = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f17120v = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        i0(this.f17092K);
        e0();
    }
}
