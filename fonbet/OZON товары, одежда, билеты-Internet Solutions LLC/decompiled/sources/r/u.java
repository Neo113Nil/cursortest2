package r;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.f;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.lifecycle.z0;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public class u extends DialogInterfaceOnCancelListenerC5390k {

    /* renamed from: a, reason: collision with root package name */
    final Handler f82376a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    final Runnable f82377b = new a();

    /* renamed from: c, reason: collision with root package name */
    p f82378c;

    /* renamed from: d, reason: collision with root package name */
    private int f82379d;

    /* renamed from: e, reason: collision with root package name */
    private int f82380e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f82381f;

    /* renamed from: g, reason: collision with root package name */
    TextView f82382g;

    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            u uVar = u.this;
            Context context = uVar.getContext();
            if (context == null) {
                Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
            } else {
                uVar.f82378c.V0(1);
                uVar.f82378c.T0(context.getString(R.string.fingerprint_dialog_touch_sensor));
            }
        }
    }

    final class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
            u.this.f82378c.X0(true);
        }
    }

    private static class c {
        static void a(@NonNull Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    private static class d {
        static int a() {
            return R.attr.colorError;
        }
    }

    private int t(int i11) {
        Context context = getContext();
        androidx.fragment.app.r activity = getActivity();
        if (context == null || activity == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i11, typedValue, true);
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(typedValue.data, new int[]{i11});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.f82378c.R0(true);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.fragment.app.r activity = getActivity();
        if (activity != null) {
            p pVar = (p) new z0(activity).a(p.class);
            this.f82378c = pVar;
            pVar.q0().observe(this, new v(this));
            this.f82378c.n0().observe(this, new w(this));
        }
        this.f82379d = t(d.a());
        this.f82380e = t(android.R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NonNull
    public final Dialog onCreateDialog(Bundle bundle) {
        f.a aVar = new f.a(requireContext());
        aVar.setTitle(this.f82378c.u0());
        View inflate = LayoutInflater.from(aVar.getContext()).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            CharSequence t02 = this.f82378c.t0();
            if (TextUtils.isEmpty(t02)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(t02);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            this.f82378c.getClass();
            if (TextUtils.isEmpty(null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText((CharSequence) null);
            }
        }
        this.f82381f = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.f82382g = (TextView) inflate.findViewById(R.id.fingerprint_error);
        aVar.h(C9089b.b(this.f82378c.d0()) ? getString(R.string.confirm_device_credential_password) : this.f82378c.s0(), new b());
        aVar.setView(inflate);
        androidx.appcompat.app.f create = aVar.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onPause() {
        super.onPause();
        this.f82376a.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onResume() {
        super.onResume();
        this.f82378c.U0(0);
        this.f82378c.V0(1);
        this.f82378c.T0(getString(R.string.fingerprint_dialog_touch_sensor));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x002e, code lost:
    
        if (r8 == 1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0034, code lost:
    
        if (r8 == 3) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void u(int i11) {
        if (this.f82381f == null) {
            return;
        }
        int p02 = this.f82378c.p0();
        Context context = getContext();
        Drawable drawable = null;
        if (context == null) {
            Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
        } else {
            int i12 = R.drawable.fingerprint_dialog_fp_icon;
            if (p02 != 0 || i11 != 1) {
                if (p02 == 1 && i11 == 2) {
                    i12 = 2131231837;
                } else {
                    if (p02 == 2) {
                    }
                    if (p02 == 1) {
                    }
                }
            }
            drawable = androidx.core.content.a.getDrawable(context, i12);
        }
        if (drawable == null) {
            return;
        }
        this.f82381f.setImageDrawable(drawable);
        if ((p02 != 0 || i11 != 1) && ((p02 == 1 && i11 == 2) || (p02 == 2 && i11 == 1))) {
            c.a(drawable);
        }
        this.f82378c.U0(i11);
    }

    final void v(int i11) {
        TextView textView = this.f82382g;
        if (textView != null) {
            textView.setTextColor(i11 == 2 ? this.f82379d : this.f82380e);
        }
    }
}
