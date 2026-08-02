package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceGroup;
import androidx.preference.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import xsna.agz;
import xsna.b640;
import xsna.ryc0;
import xsna.t1p;
import xsna.tyc0;
import xsna.zr;

/* compiled from: PreferenceFragmentCompat.java */
/* loaded from: classes12.dex */
public abstract class b extends Fragment implements e.c, e.a, e.b, DialogPreference.a {
    public static final String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
    private static final String DIALOG_FRAGMENT_TAG = "androidx.preference.PreferenceFragment.DIALOG";
    private static final int MSG_BIND_PREFERENCES = 1;
    private static final String PREFERENCES_TAG = "android:preferences";
    private static final String TAG = "PreferenceFragment";
    private boolean mHavePrefs;
    private boolean mInitDone;
    RecyclerView mList;
    private androidx.preference.e mPreferenceManager;
    private Runnable mSelectPreferenceRunnable;
    private final d mDividerDecoration = new d();
    private int mLayoutResId = R.layout.preference_list_fragment;
    private final Handler mHandler = new a(Looper.getMainLooper());
    private final Runnable mRequestFocus = new RunnableC0078b();

    /* compiled from: PreferenceFragmentCompat.java */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            b.this.bindPreferences();
        }
    }

    /* compiled from: PreferenceFragmentCompat.java */
    /* renamed from: androidx.preference.b$b, reason: collision with other inner class name */
    public class RunnableC0078b implements Runnable {
        public RunnableC0078b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = b.this.mList;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* compiled from: PreferenceFragmentCompat.java */
    public class c implements Runnable {
        public final /* synthetic */ Preference b;
        public final /* synthetic */ String c;

        public c(Preference preference, String str) {
            this.b = preference;
            this.c = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            RecyclerView.Adapter adapter = bVar.mList.getAdapter();
            if (!(adapter instanceof PreferenceGroup.b)) {
                if (adapter != 0) {
                    throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
                }
                return;
            }
            String str = this.c;
            Preference preference = this.b;
            int O = preference != null ? ((PreferenceGroup.b) adapter).O(preference) : ((PreferenceGroup.b) adapter).f0(str);
            if (O != -1) {
                bVar.mList.scrollToPosition(O);
            } else {
                adapter.registerAdapterDataObserver(new h(adapter, bVar.mList, preference, str));
            }
        }
    }

    /* compiled from: PreferenceFragmentCompat.java */
    public class d extends RecyclerView.n {
        public Drawable b;
        public int c;
        public boolean d = true;

        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.a0 a0Var) {
            if (l(recyclerView, view)) {
                rect.bottom = this.c;
            }
        }

        public final boolean l(RecyclerView recyclerView, View view) {
            RecyclerView.e0 childViewHolder = recyclerView.getChildViewHolder(view);
            if (!(childViewHolder instanceof tyc0) || !((tyc0) childViewHolder).p) {
                return false;
            }
            boolean z = this.d;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild >= recyclerView.getChildCount() - 1) {
                return z;
            }
            RecyclerView.e0 childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(indexOfChild + 1));
            return (childViewHolder2 instanceof tyc0) && ((tyc0) childViewHolder2).o;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.a0 a0Var) {
            if (this.b == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (l(recyclerView, childAt)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.b.setBounds(0, height, width, this.c + height);
                    this.b.draw(canvas);
                }
            }
        }
    }

    /* compiled from: PreferenceFragmentCompat.java */
    public interface e {
        boolean a();
    }

    /* compiled from: PreferenceFragmentCompat.java */
    public interface f {
        boolean a();
    }

    /* compiled from: PreferenceFragmentCompat.java */
    public interface g {
        boolean a();
    }

    /* compiled from: PreferenceFragmentCompat.java */
    public static class h extends RecyclerView.i {
        public final RecyclerView.Adapter<?> a;
        public final RecyclerView b;
        public final Preference c;
        public final String d;

        public h(RecyclerView.Adapter<?> adapter, RecyclerView recyclerView, Preference preference, String str) {
            this.a = adapter;
            this.b = recyclerView;
            this.c = preference;
            this.d = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i, int i2) {
            i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void d(int i, int i2, Object obj) {
            i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            i();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void i() {
            RecyclerView.Adapter<?> adapter = this.a;
            adapter.unregisterAdapterDataObserver(this);
            Preference preference = this.c;
            int O = preference != null ? ((PreferenceGroup.b) adapter).O(preference) : ((PreferenceGroup.b) adapter).f0(this.d);
            if (O != -1) {
                this.b.scrollToPosition(O);
            }
        }
    }

    private void postBindPreferences() {
        if (this.mHandler.hasMessages(1)) {
            return;
        }
        this.mHandler.obtainMessage(1).sendToTarget();
    }

    private void requirePreferenceManager() {
        if (this.mPreferenceManager == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    private void scrollToPreferenceInternal(@Nullable Preference preference, @Nullable String str) {
        c cVar = new c(preference, str);
        if (this.mList == null) {
            this.mSelectPreferenceRunnable = cVar;
        } else {
            cVar.run();
        }
    }

    private void unbindPreferences() {
        getListView().setAdapter(null);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            preferenceScreen.u();
        }
        onUnbindPreferences();
    }

    public void addPreferencesFromResource(int i) {
        requirePreferenceManager();
        setPreferenceScreen(this.mPreferenceManager.c(requireContext(), i, getPreferenceScreen()));
    }

    public void bindPreferences() {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            getListView().setAdapter(onCreateAdapter(preferenceScreen));
            preferenceScreen.q();
        }
        onBindPreferences();
    }

    @Override // androidx.preference.DialogPreference.a
    @Nullable
    public <T extends Preference> T findPreference(@NonNull CharSequence charSequence) {
        PreferenceScreen preferenceScreen;
        androidx.preference.e eVar = this.mPreferenceManager;
        if (eVar == null || (preferenceScreen = eVar.g) == null) {
            return null;
        }
        return (T) preferenceScreen.P(charSequence);
    }

    @Nullable
    public Fragment getCallbackFragment() {
        return null;
    }

    public final RecyclerView getListView() {
        return this.mList;
    }

    public androidx.preference.e getPreferenceManager() {
        return this.mPreferenceManager;
    }

    public PreferenceScreen getPreferenceScreen() {
        return this.mPreferenceManager.g;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i, false);
        androidx.preference.e eVar = new androidx.preference.e(requireContext());
        this.mPreferenceManager = eVar;
        eVar.j = this;
        onCreatePreferences(bundle, getArguments() != null ? getArguments().getString(ARG_PREFERENCE_ROOT) : null);
    }

    @NonNull
    public RecyclerView.Adapter onCreateAdapter(@NonNull PreferenceScreen preferenceScreen) {
        return new androidx.preference.c(preferenceScreen);
    }

    @NonNull
    public RecyclerView.o onCreateLayoutManager() {
        requireContext();
        return new LinearLayoutManager();
    }

    public abstract void onCreatePreferences(@Nullable Bundle bundle, @Nullable String str);

    @NonNull
    public RecyclerView onCreateRecyclerView(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup, @Nullable Bundle bundle) {
        RecyclerView recyclerView;
        if (requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(R.layout.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(onCreateLayoutManager());
        recyclerView2.setAccessibilityDelegateCompat(new ryc0(recyclerView2));
        return recyclerView2;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        TypedArray obtainStyledAttributes = requireContext().obtainStyledAttributes(null, R$styleable.h, R.attr.preferenceFragmentCompatStyle, 0);
        this.mLayoutResId = obtainStyledAttributes.getResourceId(0, this.mLayoutResId);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(requireContext());
        View inflate = cloneInContext.inflate(this.mLayoutResId, viewGroup, false);
        View findViewById = inflate.findViewById(android.R.id.list_container);
        if (!(findViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        RecyclerView onCreateRecyclerView = onCreateRecyclerView(cloneInContext, viewGroup2, bundle);
        if (onCreateRecyclerView == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.mList = onCreateRecyclerView;
        onCreateRecyclerView.addItemDecoration(this.mDividerDecoration);
        setDivider(drawable);
        if (dimensionPixelSize != -1) {
            setDividerHeight(dimensionPixelSize);
        }
        this.mDividerDecoration.d = z;
        if (this.mList.getParent() == null) {
            viewGroup2.addView(this.mList);
        }
        this.mHandler.post(this.mRequestFocus);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.mHandler.removeCallbacks(this.mRequestFocus);
        this.mHandler.removeMessages(1);
        if (this.mHavePrefs) {
            unbindPreferences();
        }
        this.mList = null;
        super.onDestroyView();
    }

    @Override // androidx.preference.e.a
    public void onDisplayPreferenceDialog(@NonNull Preference preference) {
        androidx.fragment.app.d b640Var;
        boolean a2 = getCallbackFragment() instanceof e ? ((e) getCallbackFragment()).a() : false;
        for (Fragment fragment = this; !a2 && fragment != null; fragment = fragment.getParentFragment()) {
            if (fragment instanceof e) {
                a2 = ((e) fragment).a();
            }
        }
        if (!a2 && (mo2getContext() instanceof e)) {
            a2 = ((e) mo2getContext()).a();
        }
        if (!a2 && (getActivity() instanceof e)) {
            a2 = ((e) getActivity()).a();
        }
        if (!a2 && getParentFragmentManager().H(DIALOG_FRAGMENT_TAG) == null) {
            if (preference instanceof EditTextPreference) {
                String str = preference.n;
                b640Var = new t1p();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                b640Var.setArguments(bundle);
            } else if (preference instanceof ListPreference) {
                String str2 = preference.n;
                b640Var = new agz();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                b640Var.setArguments(bundle2);
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                String str3 = preference.n;
                b640Var = new b640();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                b640Var.setArguments(bundle3);
            }
            b640Var.setTargetFragment(this, 0);
            b640Var.Td(getParentFragmentManager(), DIALOG_FRAGMENT_TAG);
        }
    }

    @Override // androidx.preference.e.b
    public void onNavigateToScreen(@NonNull PreferenceScreen preferenceScreen) {
        boolean a2 = getCallbackFragment() instanceof g ? ((g) getCallbackFragment()).a() : false;
        for (Fragment fragment = this; !a2 && fragment != null; fragment = fragment.getParentFragment()) {
            if (fragment instanceof g) {
                a2 = ((g) fragment).a();
            }
        }
        if (!a2 && (mo2getContext() instanceof g)) {
            a2 = ((g) mo2getContext()).a();
        }
        if (a2 || !(getActivity() instanceof g)) {
            return;
        }
        ((g) getActivity()).a();
    }

    @Override // androidx.preference.e.c
    public boolean onPreferenceTreeClick(@NonNull Preference preference) {
        if (preference.p == null) {
            return false;
        }
        boolean a2 = getCallbackFragment() instanceof f ? ((f) getCallbackFragment()).a() : false;
        for (Fragment fragment = this; !a2 && fragment != null; fragment = fragment.getParentFragment()) {
            if (fragment instanceof f) {
                a2 = ((f) fragment).a();
            }
        }
        if (!a2 && (mo2getContext() instanceof f)) {
            a2 = ((f) mo2getContext()).a();
        }
        if (!a2 && (getActivity() instanceof f)) {
            a2 = ((f) getActivity()).a();
        }
        if (a2) {
            return true;
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (preference.q == null) {
            preference.q = new Bundle();
        }
        Bundle bundle = preference.q;
        androidx.fragment.app.f N = parentFragmentManager.N();
        kn().getClassLoader();
        Fragment a3 = N.a(preference.p);
        a3.setArguments(bundle);
        a3.setTargetFragment(this, 0);
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
        aVar.g(((View) requireView().getParent()).getId(), a3, null);
        aVar.d(null);
        aVar.k(false);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.c(bundle2);
            bundle.putBundle(PREFERENCES_TAG, bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        androidx.preference.e eVar = this.mPreferenceManager;
        eVar.h = this;
        eVar.i = this;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        androidx.preference.e eVar = this.mPreferenceManager;
        eVar.h = null;
        eVar.i = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreen;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle(PREFERENCES_TAG)) != null && (preferenceScreen = getPreferenceScreen()) != null) {
            preferenceScreen.b(bundle2);
        }
        if (this.mHavePrefs) {
            bindPreferences();
            Runnable runnable = this.mSelectPreferenceRunnable;
            if (runnable != null) {
                runnable.run();
                this.mSelectPreferenceRunnable = null;
            }
        }
        this.mInitDone = true;
    }

    public void scrollToPreference(@NonNull String str) {
        scrollToPreferenceInternal(null, str);
    }

    public void setDivider(@Nullable Drawable drawable) {
        d dVar = this.mDividerDecoration;
        if (drawable != null) {
            dVar.getClass();
            dVar.c = drawable.getIntrinsicHeight();
        } else {
            dVar.c = 0;
        }
        dVar.b = drawable;
        b.this.mList.invalidateItemDecorations();
    }

    public void setDividerHeight(int i) {
        d dVar = this.mDividerDecoration;
        dVar.c = i;
        b.this.mList.invalidateItemDecorations();
    }

    public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
        androidx.preference.e eVar = this.mPreferenceManager;
        PreferenceScreen preferenceScreen2 = eVar.g;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.u();
            }
            eVar.g = preferenceScreen;
            if (preferenceScreen != null) {
                onUnbindPreferences();
                this.mHavePrefs = true;
                if (this.mInitDone) {
                    postBindPreferences();
                }
            }
        }
    }

    public void setPreferencesFromResource(int i, @Nullable String str) {
        requirePreferenceManager();
        PreferenceScreen c2 = this.mPreferenceManager.c(requireContext(), i, null);
        Object obj = c2;
        if (str != null) {
            Object P = c2.P(str);
            boolean z = P instanceof PreferenceScreen;
            obj = P;
            if (!z) {
                throw new IllegalArgumentException(zr.a("Preference object with key ", str, " is not a PreferenceScreen"));
            }
        }
        setPreferenceScreen((PreferenceScreen) obj);
    }

    public void scrollToPreference(@NonNull Preference preference) {
        scrollToPreferenceInternal(preference, null);
    }

    public void onBindPreferences() {
    }

    public void onUnbindPreferences() {
    }
}
