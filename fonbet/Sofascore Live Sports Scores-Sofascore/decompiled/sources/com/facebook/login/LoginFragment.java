package com.facebook.login;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.c0;
import com.facebook.login.LoginClient;
import com.sofascore.results.R;
import defpackage.ce;
import defpackage.de;
import defpackage.i20;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/login/LoginFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public class LoginFragment extends Fragment {
    public String a;
    public LoginClient.Request b;
    public LoginClient c;
    public de d;
    public View e;

    public final LoginClient j() {
        LoginClient loginClient = this.c;
        if (loginClient != null) {
            return loginClient;
        }
        Intrinsics.i("loginClient");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        j().j(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        LoginClient loginClient = bundle != null ? (LoginClient) bundle.getParcelable("loginClient") : null;
        if (loginClient == null) {
            loginClient = new LoginClient();
            loginClient.b = -1;
            if (loginClient.c != null) {
                com.facebook.t.a("Can't set fragment once it is already set.");
                return;
            }
            loginClient.c = this;
        } else {
            if (loginClient.c != null) {
                com.facebook.t.a("Can't set fragment once it is already set.");
                return;
            }
            loginClient.c = this;
        }
        this.c = loginClient;
        j().d = new q(this);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.a = callingActivity.getPackageName();
        }
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.b = (LoginClient.Request) bundleExtra.getParcelable("request");
        }
        de registerForActivityResult = registerForActivityResult(new ce(3), new q(new i20(16, this, activity)));
        registerForActivityResult.getClass();
        this.d = registerForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.com_facebook_login_fragment, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        findViewById.getClass();
        this.e = findViewById;
        j().e = new c0(this, 5);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        LoginMethodHandler g = j().g();
        if (g != null) {
            g.b();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        View view = getView();
        View findViewById = view != null ? view.findViewById(R.id.com_facebook_login_fragment_progress_bar) : null;
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        super.onResume();
        if (this.a == null) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        LoginClient j = j();
        LoginClient.Request request = this.b;
        LoginClient.Request request2 = j.g;
        if ((request2 == null || j.b < 0) && request != null) {
            int i = request.n;
            if (request2 != null) {
                com.facebook.t.a("Attempted to authorize while a request is pending.");
                return;
            }
            Date date = AccessToken.l;
            if (!com.facebook.appevents.g.q() || j.b()) {
                j.g = request;
                ArrayList arrayList = new ArrayList();
                int i2 = request.a;
                boolean z5 = true;
                if (i != 2) {
                    switch (i2) {
                        case 1:
                        case 2:
                            z = true;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            z = false;
                            break;
                        default:
                            throw null;
                    }
                    if (z) {
                        arrayList.add(new GetTokenLoginMethodHandler(j));
                    }
                    if (!com.facebook.w.p) {
                        switch (i2) {
                            case 1:
                            case 2:
                            case 3:
                            case 5:
                                z2 = true;
                                break;
                            case 4:
                            case 6:
                                z2 = false;
                                break;
                            default:
                                throw null;
                        }
                        if (z2) {
                            arrayList.add(new KatanaProxyLoginMethodHandler(j));
                        }
                    }
                } else if (!com.facebook.w.p) {
                    switch (i2) {
                        case 1:
                        case 2:
                        case 5:
                            z4 = true;
                            break;
                        case 3:
                        case 4:
                        case 6:
                            z4 = false;
                            break;
                        default:
                            throw null;
                    }
                    if (z4) {
                        arrayList.add(new InstagramAppLoginMethodHandler(j));
                    }
                }
                if (com.appsflyer.internal.i.b(i2)) {
                    arrayList.add(new CustomTabLoginMethodHandler(j));
                }
                switch (i2) {
                    case 1:
                    case 4:
                    case 5:
                        z3 = true;
                        break;
                    case 2:
                    case 3:
                    case 6:
                        z3 = false;
                        break;
                    default:
                        throw null;
                }
                if (z3) {
                    arrayList.add(new WebViewLoginMethodHandler(j));
                }
                if (i != 2) {
                    switch (i2) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            z5 = false;
                        case 6:
                            if (z5) {
                                arrayList.add(new DeviceAuthMethodHandler(j));
                                break;
                            }
                            break;
                        default:
                            throw null;
                    }
                }
                j.a = (LoginMethodHandler[]) arrayList.toArray(new LoginMethodHandler[0]);
                j.k();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", j());
    }
}
