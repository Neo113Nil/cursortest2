package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.c;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.iut0;
import xsna.m33;
import xsna.t33;
import xsna.tyc0;
import xsna.ytp0;

/* loaded from: classes12.dex */
public class Preference implements Comparable<Preference> {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public int H;
    public int I;
    public androidx.preference.c J;
    public ArrayList K;
    public PreferenceGroup L;
    public boolean M;
    public d N;
    public e O;
    public final a P;

    @NonNull
    public final Context b;

    @Nullable
    public androidx.preference.e c;
    public long d;
    public boolean e;
    public b f;
    public c g;
    public int h;
    public int i;
    public CharSequence j;
    public CharSequence k;
    public int l;
    public Drawable m;
    public String n;
    public Intent o;
    public final String p;
    public Bundle q;
    public boolean r;
    public final boolean s;
    public boolean t;
    public final boolean u;
    public final String v;
    public Object w;
    public boolean x;
    public boolean y;
    public boolean z;

    public static class BaseSavedState extends AbsSavedState {

        @NonNull
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new a();

        public class a implements Parcelable.Creator<BaseSavedState> {
            @Override // android.os.Parcelable.Creator
            public final BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final BaseSavedState[] newArray(int i) {
                return new BaseSavedState[i];
            }
        }

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Preference.this.B(view);
        }
    }

    public interface b {
        boolean Sl(@NonNull Preference preference, Object obj);
    }

    public interface c {
        boolean eh(@NonNull Preference preference);
    }

    public static class d implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
        public final Preference b;

        public d(@NonNull Preference preference) {
            this.b = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            Preference preference = this.b;
            CharSequence m = preference.m();
            if (!preference.F || TextUtils.isEmpty(m)) {
                return;
            }
            contextMenu.setHeaderTitle(m);
            contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Preference preference = this.b;
            ClipboardManager clipboardManager = (ClipboardManager) preference.h().getSystemService("clipboard");
            CharSequence m = preference.m();
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", m));
            Toast.makeText(preference.h(), preference.h().getString(R.string.preference_copied, m), 0).show();
            return true;
        }
    }

    public interface e<T extends Preference> {
        @Nullable
        CharSequence a(@NonNull T t);
    }

    public Preference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        this.h = Integer.MAX_VALUE;
        this.i = 0;
        this.r = true;
        this.s = true;
        this.u = true;
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = true;
        this.D = true;
        this.G = true;
        this.H = R.layout.preference;
        this.P = new a();
        this.b = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.g, i, i2);
        this.l = obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        String string = obtainStyledAttributes.getString(26);
        this.n = string == null ? obtainStyledAttributes.getString(6) : string;
        CharSequence text = obtainStyledAttributes.getText(34);
        this.j = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.k = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.h = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = obtainStyledAttributes.getString(22);
        this.p = string2 == null ? obtainStyledAttributes.getString(13) : string2;
        this.H = obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.I = obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        this.r = obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        boolean z = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        this.s = z;
        this.u = obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        String string3 = obtainStyledAttributes.getString(19);
        this.v = string3 == null ? obtainStyledAttributes.getString(10) : string3;
        this.A = obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, z));
        this.B = obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, z));
        if (obtainStyledAttributes.hasValue(18)) {
            this.w = v(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.w = v(obtainStyledAttributes, 11);
        }
        this.G = obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        boolean hasValue = obtainStyledAttributes.hasValue(32);
        this.C = hasValue;
        if (hasValue) {
            this.D = obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        this.E = obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        this.z = obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        this.F = obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }

    public static void G(@NonNull View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                G(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.fragment.app.Fragment, androidx.preference.e$c] */
    public final void A() {
        ?? r0;
        if (n() && this.s) {
            t();
            c cVar = this.g;
            if (cVar == null || !cVar.eh(this)) {
                androidx.preference.e eVar = this.c;
                if ((eVar == null || (r0 = eVar.h) == 0 || !r0.onPreferenceTreeClick(this)) && this.o != null) {
                    h().startActivity(this.o);
                }
            }
        }
    }

    public void B(@NonNull View view) {
        A();
    }

    public final void C(boolean z) {
        if (M() && z != i(!z)) {
            SharedPreferences.Editor a2 = this.c.a();
            a2.putBoolean(this.n, z);
            if (this.c.e) {
                return;
            }
            a2.apply();
        }
    }

    public final void D(int i) {
        if (M() && i != j(~i)) {
            SharedPreferences.Editor a2 = this.c.a();
            a2.putInt(this.n, i);
            if (this.c.e) {
                return;
            }
            a2.apply();
        }
    }

    public final void E(String str) {
        if (M() && !TextUtils.equals(str, k(null))) {
            SharedPreferences.Editor a2 = this.c.a();
            a2.putString(this.n, str);
            if (this.c.e) {
                return;
            }
            a2.apply();
        }
    }

    public final void F(boolean z) {
        if (this.r != z) {
            this.r = z;
            p(L());
            o();
        }
    }

    public final void H(String str) {
        this.n = str;
        if (this.t && TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(this.n)) {
                throw new IllegalStateException("Preference does not have a key assigned.");
            }
            this.t = true;
        }
    }

    public void I(@Nullable CharSequence charSequence) {
        if (this.O != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.k, charSequence)) {
            return;
        }
        this.k = charSequence;
        o();
    }

    public final void J(@Nullable String str) {
        if (TextUtils.equals(str, this.j)) {
            return;
        }
        this.j = str;
        o();
    }

    public final void K(boolean z) {
        if (this.z != z) {
            this.z = z;
            androidx.preference.c cVar = this.J;
            if (cVar != null) {
                Handler handler = cVar.g;
                c.a aVar = cVar.h;
                handler.removeCallbacks(aVar);
                handler.post(aVar);
            }
        }
    }

    public boolean L() {
        return !n();
    }

    public final boolean M() {
        return (this.c == null || !this.u || TextUtils.isEmpty(this.n)) ? false : true;
    }

    public final void N() {
        ArrayList arrayList;
        PreferenceScreen preferenceScreen;
        String str = this.v;
        if (str != null) {
            androidx.preference.e eVar = this.c;
            Preference preference = null;
            if (eVar != null && (preferenceScreen = eVar.g) != null) {
                preference = preferenceScreen.P(str);
            }
            if (preference == null || (arrayList = preference.K) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    public boolean a(Object obj) {
        b bVar = this.f;
        return bVar == null || bVar.Sl(this, obj);
    }

    public void b(@NonNull Bundle bundle) {
        Parcelable parcelable;
        if (TextUtils.isEmpty(this.n) || (parcelable = bundle.getParcelable(this.n)) == null) {
            return;
        }
        this.M = false;
        w(parcelable);
        if (!this.M) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void c(@NonNull Bundle bundle) {
        if (TextUtils.isEmpty(this.n)) {
            return;
        }
        this.M = false;
        Parcelable x = x();
        if (!this.M) {
            throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
        }
        if (x != null) {
            bundle.putParcelable(this.n, x);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull Preference preference) {
        Preference preference2 = preference;
        int i = this.h;
        int i2 = preference2.h;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.j;
        CharSequence charSequence2 = preference2.j;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.j.toString());
    }

    public long getId() {
        return this.d;
    }

    @NonNull
    public Context h() {
        return this.b;
    }

    public final boolean i(boolean z) {
        return !M() ? z : this.c.b().getBoolean(this.n, z);
    }

    public final int j(int i) {
        return !M() ? i : this.c.b().getInt(this.n, i);
    }

    public final String k(String str) {
        return !M() ? str : this.c.b().getString(this.n, str);
    }

    @Nullable
    public final SharedPreferences l() {
        androidx.preference.e eVar = this.c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Nullable
    public CharSequence m() {
        e eVar = this.O;
        return eVar != null ? eVar.a(this) : this.k;
    }

    public boolean n() {
        return this.r && this.x && this.y;
    }

    public void o() {
        int indexOf;
        androidx.preference.c cVar = this.J;
        if (cVar == null || (indexOf = cVar.e.indexOf(this)) == -1) {
            return;
        }
        cVar.notifyItemChanged(indexOf, this);
    }

    public void p(boolean z) {
        ArrayList arrayList = this.K;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) arrayList.get(i);
            if (preference.x == z) {
                preference.x = !z;
                preference.p(preference.L());
                preference.o();
            }
        }
    }

    public void q() {
        PreferenceScreen preferenceScreen;
        String str = this.v;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        androidx.preference.e eVar = this.c;
        Preference preference = null;
        if (eVar != null && (preferenceScreen = eVar.g) != null) {
            preference = preferenceScreen.P(str);
        }
        if (preference == null) {
            StringBuilder a2 = t33.a("Dependency \"", str, "\" not found for preference \"");
            a2.append(this.n);
            a2.append("\" (title: \"");
            a2.append((Object) this.j);
            a2.append("\"");
            throw new IllegalStateException(a2.toString());
        }
        if (preference.K == null) {
            preference.K = new ArrayList();
        }
        preference.K.add(this);
        boolean L = preference.L();
        if (this.x == L) {
            this.x = !L;
            p(L());
            o();
        }
    }

    public final void r(@NonNull androidx.preference.e eVar) {
        long j;
        this.c = eVar;
        if (!this.e) {
            synchronized (eVar) {
                j = eVar.b;
                eVar.b = 1 + j;
            }
            this.d = j;
        }
        if (M() && l().contains(this.n)) {
            z(null, true);
            return;
        }
        Object obj = this.w;
        if (obj != null) {
            z(obj, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void s(@NonNull tyc0 tyc0Var) {
        Integer num;
        TextView textView;
        ImageView imageView;
        View V5;
        boolean z;
        View view = tyc0Var.itemView;
        view.setOnClickListener(this.P);
        view.setId(this.i);
        TextView textView2 = (TextView) tyc0Var.V5(android.R.id.summary);
        if (textView2 != null) {
            CharSequence m = m();
            if (!TextUtils.isEmpty(m)) {
                textView2.setText(m);
                textView2.setVisibility(0);
                num = Integer.valueOf(textView2.getCurrentTextColor());
                textView = (TextView) tyc0Var.V5(android.R.id.title);
                boolean z2 = this.s;
                if (textView != null) {
                    CharSequence charSequence = this.j;
                    if (TextUtils.isEmpty(charSequence)) {
                        textView.setVisibility(8);
                    } else {
                        textView.setText(charSequence);
                        textView.setVisibility(0);
                        if (this.C) {
                            textView.setSingleLine(this.D);
                        }
                        if (!z2 && n() && num != null) {
                            textView.setTextColor(num.intValue());
                        }
                    }
                }
                imageView = (ImageView) tyc0Var.V5(android.R.id.icon);
                boolean z3 = this.E;
                if (imageView != null) {
                    int i = this.l;
                    if (i != 0 || this.m != null) {
                        if (this.m == null) {
                            this.m = m33.a(i, this.b);
                        }
                        Drawable drawable = this.m;
                        if (drawable != null) {
                            imageView.setImageDrawable(drawable);
                        }
                    }
                    if (this.m != null) {
                        imageView.setVisibility(0);
                    } else {
                        imageView.setVisibility(z3 ? 4 : 8);
                    }
                }
                V5 = tyc0Var.V5(R.id.icon_frame);
                if (V5 == null) {
                    V5 = tyc0Var.V5(android.R.id.icon_frame);
                }
                if (V5 != null) {
                    if (this.m != null) {
                        V5.setVisibility(0);
                    } else {
                        V5.setVisibility(z3 ? 4 : 8);
                    }
                }
                if (this.G) {
                    G(view, true);
                } else {
                    G(view, n());
                }
                view.setFocusable(z2);
                view.setClickable(z2);
                tyc0Var.o = this.A;
                tyc0Var.p = this.B;
                z = this.F;
                if (z && this.N == null) {
                    this.N = new d(this);
                }
                view.setOnCreateContextMenuListener(!z ? this.N : null);
                view.setLongClickable(z);
                if (z || z2) {
                }
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                view.setBackground(null);
                return;
            }
            textView2.setVisibility(8);
        }
        num = null;
        textView = (TextView) tyc0Var.V5(android.R.id.title);
        boolean z22 = this.s;
        if (textView != null) {
        }
        imageView = (ImageView) tyc0Var.V5(android.R.id.icon);
        boolean z32 = this.E;
        if (imageView != null) {
        }
        V5 = tyc0Var.V5(R.id.icon_frame);
        if (V5 == null) {
        }
        if (V5 != null) {
        }
        if (this.G) {
        }
        view.setFocusable(z22);
        view.setClickable(z22);
        tyc0Var.o = this.A;
        tyc0Var.p = this.B;
        z = this.F;
        if (z) {
            this.N = new d(this);
        }
        view.setOnCreateContextMenuListener(!z ? this.N : null);
        view.setLongClickable(z);
        if (z) {
        }
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.j;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence m = m();
        if (!TextUtils.isEmpty(m)) {
            sb.append(m);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public void u() {
        N();
    }

    @Nullable
    public Object v(@NonNull TypedArray typedArray, int i) {
        return null;
    }

    public void w(@Nullable Parcelable parcelable) {
        this.M = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    @Nullable
    public Parcelable x() {
        this.M = true;
        return AbsSavedState.EMPTY_STATE;
    }

    @Deprecated
    public void z(Object obj, boolean z) {
        y(obj);
    }

    public void t() {
    }

    public void y(@Nullable Object obj) {
    }

    public Preference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, ytp0.a(R.attr.preferenceStyle, android.R.attr.preferenceStyle, context));
    }

    public Preference(@NonNull Context context) {
        this(context, null);
    }
}
