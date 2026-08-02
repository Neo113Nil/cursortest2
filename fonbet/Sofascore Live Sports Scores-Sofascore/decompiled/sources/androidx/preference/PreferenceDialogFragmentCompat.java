package androidx.preference;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.ironsource.U3;
import defpackage.a70;
import defpackage.r4f;
import defpackage.sm;
import defpackage.wm;
import defpackage.xm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class PreferenceDialogFragmentCompat extends DialogFragment implements DialogInterface.OnClickListener {
    public DialogPreference q;
    public CharSequence r;
    public CharSequence s;
    public CharSequence t;
    public CharSequence u;
    public int v;
    public BitmapDrawable w;
    public int x;

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog l(Bundle bundle) {
        this.x = -2;
        wm title = new wm(requireContext()).setTitle(this.r);
        BitmapDrawable bitmapDrawable = this.w;
        sm smVar = title.a;
        smVar.c = bitmapDrawable;
        smVar.g = this.s;
        smVar.h = this;
        smVar.i = this.t;
        smVar.j = this;
        requireContext();
        int i = this.v;
        View inflate = i != 0 ? getLayoutInflater().inflate(i, (ViewGroup) null) : null;
        if (inflate != null) {
            r(inflate);
            title.setView(inflate);
        } else {
            smVar.f = this.u;
        }
        t(title);
        xm create = title.create();
        if (this instanceof EditTextPreferenceDialogFragmentCompat) {
            Window window = create.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                r4f.a(window);
                return create;
            }
            EditTextPreferenceDialogFragmentCompat editTextPreferenceDialogFragmentCompat = (EditTextPreferenceDialogFragmentCompat) this;
            editTextPreferenceDialogFragmentCompat.B = SystemClock.currentThreadTimeMillis();
            editTextPreferenceDialogFragmentCompat.u();
        }
        return create;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.x = i;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Fragment targetFragment = getTargetFragment();
        if (!(targetFragment instanceof PreferenceFragmentCompat)) {
            a70.r("Target fragment must implement TargetFragment interface");
            return;
        }
        PreferenceFragmentCompat preferenceFragmentCompat = (PreferenceFragmentCompat) targetFragment;
        String string = requireArguments().getString(U3.i.W);
        if (bundle != null) {
            this.r = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.s = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.t = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.u = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.v = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.w = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) preferenceFragmentCompat.j(string);
        this.q = dialogPreference;
        this.r = dialogPreference.M;
        this.s = dialogPreference.P;
        this.t = dialogPreference.Q;
        this.u = dialogPreference.N;
        this.v = dialogPreference.R;
        Drawable drawable = dialogPreference.O;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.w = (BitmapDrawable) drawable;
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.w = new BitmapDrawable(getResources(), createBitmap);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        s(this.x == -1);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.r);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.s);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.t);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.u);
        bundle.putInt("PreferenceDialogFragment.layout", this.v);
        BitmapDrawable bitmapDrawable = this.w;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    public final DialogPreference q() {
        DialogPreference dialogPreference = this.q;
        if (dialogPreference != null) {
            return dialogPreference;
        }
        DialogPreference dialogPreference2 = (DialogPreference) ((PreferenceFragmentCompat) getTargetFragment()).j(requireArguments().getString(U3.i.W));
        this.q = dialogPreference2;
        return dialogPreference2;
    }

    public void r(View view) {
        int i;
        View findViewById = view.findViewById(R.id.message);
        if (findViewById != null) {
            CharSequence charSequence = this.u;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    public abstract void s(boolean z);

    public void t(wm wmVar) {
    }
}
