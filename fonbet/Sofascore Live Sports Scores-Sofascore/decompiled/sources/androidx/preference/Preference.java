package androidx.preference;

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
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import com.sofascore.results.R;
import defpackage.a5f;
import defpackage.a70;
import defpackage.bsk;
import defpackage.c5f;
import defpackage.cb;
import defpackage.jjf;
import defpackage.k4f;
import defpackage.kac;
import defpackage.l4f;
import defpackage.m4f;
import defpackage.r4a;
import defpackage.td4;
import defpackage.wt3;
import defpackage.xo8;
import defpackage.y4f;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public int D;
    public final int E;
    public y4f F;
    public ArrayList G;
    public PreferenceGroup H;
    public boolean I;
    public l4f J;
    public m4f K;
    public final cb L;
    public final Context a;
    public a5f b;
    public long c;
    public boolean d;
    public k4f e;
    public int f;
    public CharSequence g;
    public CharSequence h;
    public int i;
    public Drawable j;
    public final String k;
    public Intent l;
    public final String m;
    public Bundle n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final String r;
    public final Object s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.f = Integer.MAX_VALUE;
        this.o = true;
        this.p = true;
        this.q = true;
        this.t = true;
        this.u = true;
        this.v = true;
        this.w = true;
        this.x = true;
        this.z = true;
        this.C = true;
        this.D = R.layout.preference;
        this.L = new cb(this, 9);
        this.a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jjf.g, i, 0);
        this.i = obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        String string = obtainStyledAttributes.getString(26);
        this.k = string == null ? obtainStyledAttributes.getString(6) : string;
        CharSequence text = obtainStyledAttributes.getText(34);
        this.g = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.h = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = obtainStyledAttributes.getString(22);
        this.m = string2 == null ? obtainStyledAttributes.getString(13) : string2;
        this.D = obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.E = obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        this.o = obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        boolean z = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        this.p = z;
        this.q = obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        String string3 = obtainStyledAttributes.getString(19);
        this.r = string3 == null ? obtainStyledAttributes.getString(10) : string3;
        this.w = obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, z));
        this.x = obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, z));
        if (obtainStyledAttributes.hasValue(18)) {
            this.s = n(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.s = n(obtainStyledAttributes, 11);
        }
        this.C = obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        boolean hasValue = obtainStyledAttributes.hasValue(32);
        this.y = hasValue;
        if (hasValue) {
            this.z = obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        this.A = obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        this.v = obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        this.B = obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }

    public static void t(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                t(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public void a(Bundle bundle) {
        Parcelable parcelable;
        String str = this.k;
        if (TextUtils.isEmpty(str) || (parcelable = bundle.getParcelable(str)) == null) {
            return;
        }
        this.I = false;
        o(parcelable);
        if (this.I) {
            return;
        }
        a70.r("Derived class did not call super.onRestoreInstanceState()");
    }

    public void b(Bundle bundle) {
        String str = this.k;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.I = false;
        Parcelable p = p();
        if (!this.I) {
            a70.r("Derived class did not call super.onSaveInstanceState()");
        } else if (p != null) {
            bundle.putParcelable(str, p);
        }
    }

    public long c() {
        return this.c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = this.f;
        int i2 = preference2.f;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.g;
        CharSequence charSequence2 = preference2.g;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.g.toString());
    }

    public final String d(String str) {
        return !x() ? str : this.b.g().getString(this.k, str);
    }

    public CharSequence e() {
        m4f m4fVar = this.K;
        return m4fVar != null ? m4fVar.c(this) : this.h;
    }

    public boolean f() {
        return this.o && this.t && this.u;
    }

    public void g() {
        int indexOf;
        y4f y4fVar = this.F;
        if (y4fVar == null || (indexOf = y4fVar.c.indexOf(this)) == -1) {
            return;
        }
        y4fVar.notifyItemChanged(indexOf, this);
    }

    public void h(boolean z) {
        ArrayList arrayList = this.G;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) arrayList.get(i);
            if (preference.t == z) {
                preference.t = !z;
                preference.h(preference.w());
                preference.g();
            }
        }
    }

    public void i() {
        PreferenceScreen preferenceScreen;
        String str = this.r;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a5f a5fVar = this.b;
        Preference preference = null;
        if (a5fVar != null && (preferenceScreen = (PreferenceScreen) a5fVar.g) != null) {
            preference = preferenceScreen.z(str);
        }
        if (preference == null) {
            StringBuilder q = wt3.q("Dependency \"", str, "\" not found for preference \"");
            q.append(this.k);
            q.append("\" (title: \"");
            q.append((Object) this.g);
            q.append("\"");
            throw new IllegalStateException(q.toString());
        }
        ArrayList arrayList = preference.G;
        if (arrayList == null) {
            arrayList = new ArrayList();
            preference.G = arrayList;
        }
        arrayList.add(this);
        boolean w = preference.w();
        if (this.t == w) {
            this.t = !w;
            h(w());
            g();
        }
    }

    public final void j(a5f a5fVar) {
        long j;
        this.b = a5fVar;
        if (!this.d) {
            synchronized (a5fVar) {
                j = a5fVar.b;
                a5fVar.b = 1 + j;
            }
            this.c = j;
        }
        if (x()) {
            a5f a5fVar2 = this.b;
            if ((a5fVar2 != null ? a5fVar2.g() : null).contains(this.k)) {
                q(null);
                return;
            }
        }
        Object obj = this.s;
        if (obj != null) {
            q(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(c5f c5fVar) {
        Integer num;
        TextView textView;
        ImageView imageView;
        View a;
        boolean z;
        View view = c5fVar.itemView;
        view.setOnClickListener(this.L);
        view.setId(0);
        TextView textView2 = (TextView) c5fVar.a(android.R.id.summary);
        if (textView2 != null) {
            CharSequence e = e();
            if (!TextUtils.isEmpty(e)) {
                textView2.setText(e);
                textView2.setVisibility(0);
                num = Integer.valueOf(textView2.getCurrentTextColor());
                textView = (TextView) c5fVar.a(android.R.id.title);
                boolean z2 = this.p;
                if (textView != null) {
                    CharSequence charSequence = this.g;
                    if (TextUtils.isEmpty(charSequence)) {
                        textView.setVisibility(8);
                    } else {
                        textView.setText(charSequence);
                        textView.setVisibility(0);
                        if (this.y) {
                            textView.setSingleLine(this.z);
                        }
                        if (!z2 && f() && num != null) {
                            textView.setTextColor(num.intValue());
                        }
                    }
                }
                imageView = (ImageView) c5fVar.a(android.R.id.icon);
                boolean z3 = this.A;
                if (imageView != null) {
                    int i = this.i;
                    if (i != 0 || this.j != null) {
                        Drawable drawable = this.j;
                        if (drawable == null) {
                            drawable = td4.d0(i, this.a);
                            this.j = drawable;
                        }
                        if (drawable != null) {
                            imageView.setImageDrawable(drawable);
                        }
                    }
                    if (this.j != null) {
                        imageView.setVisibility(0);
                    } else {
                        imageView.setVisibility(z3 ? 4 : 8);
                    }
                }
                a = c5fVar.a(R.id.icon_frame);
                if (a == null) {
                    a = c5fVar.a(android.R.id.icon_frame);
                }
                if (a != null) {
                    if (this.j != null) {
                        a.setVisibility(0);
                    } else {
                        a.setVisibility(z3 ? 4 : 8);
                    }
                }
                if (this.C) {
                    t(view, true);
                } else {
                    t(view, f());
                }
                view.setFocusable(z2);
                view.setClickable(z2);
                c5fVar.e = this.w;
                c5fVar.f = this.x;
                z = this.B;
                if (z && this.J == null) {
                    this.J = new l4f(this);
                }
                view.setOnCreateContextMenuListener(!z ? this.J : null);
                view.setLongClickable(z);
                if (z || z2) {
                }
                WeakHashMap weakHashMap = bsk.a;
                view.setBackground(null);
                return;
            }
            textView2.setVisibility(8);
        }
        num = null;
        textView = (TextView) c5fVar.a(android.R.id.title);
        boolean z22 = this.p;
        if (textView != null) {
        }
        imageView = (ImageView) c5fVar.a(android.R.id.icon);
        boolean z32 = this.A;
        if (imageView != null) {
        }
        a = c5fVar.a(R.id.icon_frame);
        if (a == null) {
        }
        if (a != null) {
        }
        if (this.C) {
        }
        view.setFocusable(z22);
        view.setClickable(z22);
        c5fVar.e = this.w;
        c5fVar.f = this.x;
        z = this.B;
        if (z) {
            this.J = new l4f(this);
        }
        view.setOnCreateContextMenuListener(!z ? this.J : null);
        view.setLongClickable(z);
        if (z) {
        }
    }

    public void m() {
        y();
    }

    public Object n(TypedArray typedArray, int i) {
        return null;
    }

    public void o(Parcelable parcelable) {
        this.I = true;
        if (parcelable == AbsSavedState.EMPTY_STATE || parcelable == null) {
            return;
        }
        a70.p("Wrong state class -- expecting Preference State");
    }

    public Parcelable p() {
        this.I = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void r(View view) {
        Fragment fragment;
        String str;
        if (f() && this.p) {
            l();
            k4f k4fVar = this.e;
            if (k4fVar != null) {
                k4fVar.m(this);
                return;
            }
            a5f a5fVar = this.b;
            if (a5fVar == null || (fragment = (PreferenceFragmentCompat) a5fVar.h) == null || (str = this.m) == null) {
                Intent intent = this.l;
                if (intent != null) {
                    this.a.startActivity(intent);
                    return;
                }
                return;
            }
            for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getParentFragment()) {
            }
            fragment.getContext();
            fragment.getActivity();
            s parentFragmentManager = fragment.getParentFragmentManager();
            Bundle bundle = this.n;
            if (bundle == null) {
                bundle = new Bundle();
                this.n = bundle;
            }
            xo8 M = parentFragmentManager.M();
            fragment.requireActivity().getClassLoader();
            Fragment a = M.a(str);
            a.setArguments(bundle);
            a.setTargetFragment(fragment, 0);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
            aVar.l(((View) fragment.requireView().getParent()).getId(), a, null);
            aVar.c(null);
            aVar.f();
        }
    }

    public final void s(String str) {
        if (x() && !TextUtils.equals(str, d(null))) {
            SharedPreferences.Editor f = this.b.f();
            f.putString(this.k, str);
            if (this.b.a) {
                return;
            }
            f.apply();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.g;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence e = e();
        if (!TextUtils.isEmpty(e)) {
            sb.append(e);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public void u(CharSequence charSequence) {
        if (this.K != null) {
            a70.r("Preference already has a SummaryProvider set.");
        } else {
            if (TextUtils.equals(this.h, charSequence)) {
                return;
            }
            this.h = charSequence;
            g();
        }
    }

    public final void v(boolean z) {
        if (this.v != z) {
            this.v = z;
            y4f y4fVar = this.F;
            if (y4fVar != null) {
                Handler handler = y4fVar.e;
                kac kacVar = y4fVar.f;
                handler.removeCallbacks(kacVar);
                handler.post(kacVar);
            }
        }
    }

    public boolean w() {
        return !f();
    }

    public final boolean x() {
        return (this.b == null || !this.q || TextUtils.isEmpty(this.k)) ? false : true;
    }

    public final void y() {
        ArrayList arrayList;
        PreferenceScreen preferenceScreen;
        String str = this.r;
        if (str != null) {
            a5f a5fVar = this.b;
            Preference preference = null;
            if (a5fVar != null && (preferenceScreen = (PreferenceScreen) a5fVar.g) != null) {
                preference = preferenceScreen.z(str);
            }
            if (preference == null || (arrayList = preference.G) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class BaseSavedState extends AbsSavedState {

        @NonNull
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new d();

        public BaseSavedState() {
            super(AbsSavedState.EMPTY_STATE);
        }

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }
    }

    public void l() {
    }

    public void q(Object obj) {
    }

    public Preference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, r4a.w(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}
