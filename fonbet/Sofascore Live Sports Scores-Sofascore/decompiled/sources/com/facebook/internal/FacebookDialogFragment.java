package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Arrays;
import java.util.Date;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/internal/FacebookDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FacebookDialogFragment extends DialogFragment {
    public s0 q;

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog l(Bundle bundle) {
        s0 s0Var = this.q;
        if (s0Var != null) {
            return s0Var;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = activity.getIntent();
            intent.getClass();
            activity.setResult(-1, d0.f(intent, null, null));
            activity.finish();
        }
        this.h = false;
        return super.l(bundle);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        if (this.q == null || !isResumed()) {
            return;
        }
        s0 s0Var = this.q;
        s0Var.getClass();
        s0Var.d();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        FragmentActivity activity;
        String string;
        s0 s0Var;
        super.onCreate(bundle);
        if (this.q == null && (activity = getActivity()) != null) {
            Intent intent = activity.getIntent();
            intent.getClass();
            Bundle j = d0.j(intent);
            final int i = 0;
            if (j != null ? j.getBoolean("is_fallback", false) : false) {
                string = j != null ? j.getString("url") : null;
                if (k0.A(string)) {
                    com.facebook.w wVar = com.facebook.w.a;
                    activity.finish();
                    return;
                }
                final int i2 = 1;
                String format = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{com.facebook.w.b()}, 1));
                int i3 = m.o;
                string.getClass();
                s0.b(activity);
                m mVar = new m(activity, string);
                mVar.b = format;
                mVar.c = new o0(this) { // from class: com.facebook.internal.i
                    public final /* synthetic */ FacebookDialogFragment b;

                    {
                        this.b = this;
                    }

                    @Override // com.facebook.internal.o0
                    public final void a(Bundle bundle2, com.facebook.q qVar) {
                        int i4 = i2;
                        FacebookDialogFragment facebookDialogFragment = this.b;
                        switch (i4) {
                            case 0:
                                FragmentActivity activity2 = facebookDialogFragment.getActivity();
                                if (activity2 != null) {
                                    Intent intent2 = activity2.getIntent();
                                    intent2.getClass();
                                    activity2.setResult(qVar != null ? 0 : -1, d0.f(intent2, bundle2, qVar));
                                    activity2.finish();
                                    break;
                                }
                                break;
                            default:
                                FragmentActivity activity3 = facebookDialogFragment.getActivity();
                                if (activity3 != null) {
                                    Intent intent3 = new Intent();
                                    if (bundle2 == null) {
                                        bundle2 = new Bundle();
                                    }
                                    intent3.putExtras(bundle2);
                                    activity3.setResult(-1, intent3);
                                    activity3.finish();
                                    break;
                                }
                                break;
                        }
                    }
                };
                s0Var = mVar;
            } else {
                String string2 = j != null ? j.getString("action") : null;
                Bundle bundle2 = j != null ? j.getBundle("params") : null;
                if (k0.A(string2)) {
                    com.facebook.w wVar2 = com.facebook.w.a;
                    activity.finish();
                    return;
                }
                string2.getClass();
                Date date = AccessToken.l;
                AccessToken p = com.facebook.appevents.g.p();
                string = com.facebook.appevents.g.q() ? null : com.facebook.w.b();
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                o0 o0Var = new o0(this) { // from class: com.facebook.internal.i
                    public final /* synthetic */ FacebookDialogFragment b;

                    {
                        this.b = this;
                    }

                    @Override // com.facebook.internal.o0
                    public final void a(Bundle bundle22, com.facebook.q qVar) {
                        int i4 = i;
                        FacebookDialogFragment facebookDialogFragment = this.b;
                        switch (i4) {
                            case 0:
                                FragmentActivity activity2 = facebookDialogFragment.getActivity();
                                if (activity2 != null) {
                                    Intent intent2 = activity2.getIntent();
                                    intent2.getClass();
                                    activity2.setResult(qVar != null ? 0 : -1, d0.f(intent2, bundle22, qVar));
                                    activity2.finish();
                                    break;
                                }
                                break;
                            default:
                                FragmentActivity activity3 = facebookDialogFragment.getActivity();
                                if (activity3 != null) {
                                    Intent intent3 = new Intent();
                                    if (bundle22 == null) {
                                        bundle22 = new Bundle();
                                    }
                                    intent3.putExtras(bundle22);
                                    activity3.setResult(-1, intent3);
                                    activity3.finish();
                                    break;
                                }
                                break;
                        }
                    }
                };
                if (p != null) {
                    bundle2.putString(MBridgeConstans.APP_ID, p.h);
                    bundle2.putString("access_token", p.e);
                } else {
                    bundle2.putString(MBridgeConstans.APP_ID, string);
                }
                s0.b(activity);
                s0Var = new s0(activity, string2, bundle2, 1, o0Var);
            }
            this.q = s0Var;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Dialog dialog = this.l;
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        s0 s0Var = this.q;
        if (s0Var != null) {
            s0Var.d();
        }
    }
}
