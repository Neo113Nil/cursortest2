package T7;

import T7.d0;
import T7.r;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m;
import com.twilio.voice.EventKeys;
import g6.C4331C;
import g6.C4357q;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J#\u0010\u0016\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\bR$\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"LT7/n;", "Landroidx/fragment/app/m;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "h0", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onResume", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onDestroyView", EventKeys.VALUES_KEY, "Lg6/q;", "error", "l0", "(Landroid/os/Bundle;Lg6/q;)V", "m0", X9.m.f13664a, "Landroid/app/Dialog;", "getInnerDialog", "()Landroid/app/Dialog;", "n0", "(Landroid/app/Dialog;)V", "innerDialog", "n", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: T7.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1674n extends DialogInterfaceOnCancelListenerC2163m {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public Dialog innerDialog;

    public static final void j0(C1674n this$0, Bundle bundle, C4357q c4357q) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.l0(bundle, c4357q);
    }

    public static final void k0(C1674n this$0, Bundle bundle, C4357q c4357q) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m0(bundle);
    }

    public final void h0() {
        AbstractActivityC2168s activity;
        d0 a10;
        if (this.innerDialog == null && (activity = getActivity()) != null) {
            Intent intent = activity.getIntent();
            M m10 = M.f11009a;
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            Bundle y10 = M.y(intent);
            if (y10 != null ? y10.getBoolean("is_fallback", false) : false) {
                String string = y10 != null ? y10.getString(EventKeys.URL) : null;
                if (Y.d0(string)) {
                    Y.k0("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    activity.finish();
                    return;
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{C4331C.m()}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                r.a aVar = r.f11161q;
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                a10 = aVar.a(activity, string, format);
                a10.B(new d0.d() { // from class: T7.m
                    @Override // T7.d0.d
                    public final void a(Bundle bundle, C4357q c4357q) {
                        C1674n.k0(C1674n.this, bundle, c4357q);
                    }
                });
            } else {
                String string2 = y10 == null ? null : y10.getString("action");
                Bundle bundle = y10 != null ? y10.getBundle("params") : null;
                if (Y.d0(string2)) {
                    Y.k0("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
                    activity.finish();
                    return;
                } else {
                    if (string2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    a10 = new d0.a(activity, string2, bundle).h(new d0.d() { // from class: T7.l
                        @Override // T7.d0.d
                        public final void a(Bundle bundle2, C4357q c4357q) {
                            C1674n.j0(C1674n.this, bundle2, c4357q);
                        }
                    }).a();
                }
            }
            this.innerDialog = a10;
        }
    }

    public final void l0(Bundle values, C4357q error) {
        AbstractActivityC2168s activity = getActivity();
        if (activity == null) {
            return;
        }
        M m10 = M.f11009a;
        Intent intent = activity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "fragmentActivity.intent");
        activity.setResult(error == null ? -1 : 0, M.n(intent, values, error));
        activity.finish();
    }

    public final void m0(Bundle values) {
        AbstractActivityC2168s activity = getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        if (values == null) {
            values = new Bundle();
        }
        intent.putExtras(values);
        activity.setResult(-1, intent);
        activity.finish();
    }

    public final void n0(Dialog dialog) {
        this.innerDialog = dialog;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if ((this.innerDialog instanceof d0) && isResumed()) {
            Dialog dialog = this.innerDialog;
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((d0) dialog).x();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        h0();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = this.innerDialog;
        if (dialog != null) {
            if (dialog != null) {
                return dialog;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
        }
        l0(null, null);
        setShowsDialog(false);
        Dialog onCreateDialog = super.onCreateDialog(savedInstanceState);
        Intrinsics.checkNotNullExpressionValue(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Dialog dialog = this.innerDialog;
        if (dialog instanceof d0) {
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((d0) dialog).x();
        }
    }
}
