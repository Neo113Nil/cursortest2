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
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.d;
import androidx.preference.DialogPreference;
import xsna.z1h0;

/* compiled from: PreferenceDialogFragmentCompat.java */
/* loaded from: classes12.dex */
public abstract class a extends androidx.fragment.app.d implements DialogInterface.OnClickListener {
    public CharSequence A;
    public CharSequence B;
    public int C;
    public BitmapDrawable D;
    public int E;
    public DialogPreference x;
    public CharSequence y;
    public CharSequence z;

    /* compiled from: PreferenceDialogFragmentCompat.java */
    /* renamed from: androidx.preference.a$a, reason: collision with other inner class name */
    public static class C0077a {
        public static void a(@NonNull Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    public final DialogPreference Dn() {
        if (this.x == null) {
            this.x = (DialogPreference) ((DialogPreference.a) getTargetFragment()).findPreference(requireArguments().getString("key"));
        }
        return this.x;
    }

    public boolean En() {
        return false;
    }

    public void Fn(@NonNull View view) {
        int i;
        View findViewById = view.findViewById(R.id.message);
        if (findViewById != null) {
            CharSequence charSequence = this.B;
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

    @Nullable
    public View Gn() {
        int i = this.C;
        if (i == 0) {
            return null;
        }
        return getLayoutInflater().inflate(i, (ViewGroup) null);
    }

    public abstract void Hn(boolean z);

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(@NonNull DialogInterface dialogInterface, int i) {
        this.E = i;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        z1h0 targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.a)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.a aVar = (DialogPreference.a) targetFragment;
        String string = requireArguments().getString("key");
        if (bundle != null) {
            this.y = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.z = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.A = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.B = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.C = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.D = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) aVar.findPreference(string);
        this.x = dialogPreference;
        this.y = dialogPreference.Q;
        this.z = dialogPreference.T;
        this.A = dialogPreference.U;
        this.B = dialogPreference.R;
        this.C = dialogPreference.V;
        Drawable drawable = dialogPreference.S;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.D = (BitmapDrawable) drawable;
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.D = new BitmapDrawable(getResources(), createBitmap);
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Hn(this.E == -1);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.y);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.z);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.A);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.B);
        bundle.putInt("PreferenceDialogFragment.layout", this.C);
        BitmapDrawable bitmapDrawable = this.D;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // androidx.fragment.app.d
    @NonNull
    public Dialog yn(@Nullable Bundle bundle) {
        this.E = -2;
        d.a title = new d.a(requireContext()).setTitle(this.y);
        title.a.c = this.D;
        d.a f = title.j(this.z, this).f(this.A, this);
        requireContext();
        View Gn = Gn();
        if (Gn != null) {
            Fn(Gn);
            f.setView(Gn);
        } else {
            f.d(this.B);
        }
        In(f);
        androidx.appcompat.app.d create = f.create();
        if (En()) {
            Window window = create.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                C0077a.a(window);
                return create;
            }
            Jn();
        }
        return create;
    }

    public void Jn() {
    }

    public void In(@NonNull d.a aVar) {
    }
}
