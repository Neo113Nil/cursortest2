package com.sofascore.results.settings.about;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.results.R;
import defpackage.bfk;
import defpackage.dmi;
import defpackage.e6b;
import defpackage.g0;
import defpackage.k0;
import defpackage.ke0;
import defpackage.m0;
import defpackage.mz1;
import defpackage.nq8;
import defpackage.sc;
import defpackage.yhk;
import defpackage.zu3;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/settings/about/AboutActivity;", "Lcom/sofascore/results/base/BaseActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AboutActivity extends Hilt_AboutActivity {
    public static final /* synthetic */ int O = 0;
    public MenuItem J;
    public final int K = ke0.c;
    public sc L;
    public int M;
    public bfk N;

    public final void M(String str) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Calendar calendar = ke0.a;
            ke0.g(this, getString(R.string.web_browser_error), 0);
        }
    }

    public final void N() {
        String y = dmi.y(getString(R.string.app_version), " 26.07.20");
        if (D().getDevMod()) {
            StringBuilder s = mz1.s(y, "\nDEV MOD (", Build.MODEL, " ", Build.MANUFACTURER);
            s.append(")");
            y = s.toString();
        } else {
            sc scVar = this.L;
            if (scVar == null) {
                Intrinsics.i("binding");
                throw null;
            }
            ((ImageView) scVar.p).setOnClickListener(new g0(this, 2));
        }
        sc scVar2 = this.L;
        if (scVar2 != null) {
            ((TextView) scVar2.o).setText(y);
        } else {
            Intrinsics.i("binding");
            throw null;
        }
    }

    @Override // com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 0;
        View inflate = getLayoutInflater().inflate(R.layout.activity_about, (ViewGroup) null, false);
        int i2 = R.id.button_accessibility_policy;
        TextView textView = (TextView) nq8.B(R.id.button_accessibility_policy, inflate);
        if (textView != null) {
            i2 = R.id.button_cookie_privacy;
            TextView textView2 = (TextView) nq8.B(R.id.button_cookie_privacy, inflate);
            if (textView2 != null) {
                i2 = R.id.button_facebook;
                ImageView imageView = (ImageView) nq8.B(R.id.button_facebook, inflate);
                if (imageView != null) {
                    i2 = R.id.button_gdpr;
                    TextView textView3 = (TextView) nq8.B(R.id.button_gdpr, inflate);
                    if (textView3 != null) {
                        i2 = R.id.button_impressum;
                        TextView textView4 = (TextView) nq8.B(R.id.button_impressum, inflate);
                        if (textView4 != null) {
                            i2 = R.id.button_instagram;
                            ImageView imageView2 = (ImageView) nq8.B(R.id.button_instagram, inflate);
                            if (imageView2 != null) {
                                i2 = R.id.button_privacy;
                                TextView textView5 = (TextView) nq8.B(R.id.button_privacy, inflate);
                                if (textView5 != null) {
                                    i2 = R.id.button_support;
                                    TextView textView6 = (TextView) nq8.B(R.id.button_support, inflate);
                                    if (textView6 != null) {
                                        i2 = R.id.button_terms;
                                        TextView textView7 = (TextView) nq8.B(R.id.button_terms, inflate);
                                        if (textView7 != null) {
                                            i2 = R.id.button_tiktok;
                                            ImageView imageView3 = (ImageView) nq8.B(R.id.button_tiktok, inflate);
                                            if (imageView3 != null) {
                                                i2 = R.id.button_twitter;
                                                ImageView imageView4 = (ImageView) nq8.B(R.id.button_twitter, inflate);
                                                if (imageView4 != null) {
                                                    i2 = R.id.logo;
                                                    ImageView imageView5 = (ImageView) nq8.B(R.id.logo, inflate);
                                                    if (imageView5 != null) {
                                                        i2 = R.id.romania_license_layout;
                                                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.romania_license_layout, inflate);
                                                        if (linearLayout != null) {
                                                            i2 = R.id.romania_license_text;
                                                            if (((TextView) nq8.B(R.id.romania_license_text, inflate)) != null) {
                                                                i2 = R.id.romania_license_title;
                                                                if (((TextView) nq8.B(R.id.romania_license_title, inflate)) != null) {
                                                                    i2 = R.id.social_networks;
                                                                    if (((LinearLayout) nq8.B(R.id.social_networks, inflate)) != null) {
                                                                        i2 = R.id.toolbar;
                                                                        if (((UnderlinedToolbar) nq8.B(R.id.toolbar, inflate)) != null) {
                                                                            i2 = R.id.version;
                                                                            TextView textView8 = (TextView) nq8.B(R.id.version, inflate);
                                                                            if (textView8 != null) {
                                                                                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                                                                                this.L = new sc(coordinatorLayout, textView, textView2, imageView, textView3, textView4, imageView2, textView5, textView6, textView7, imageView3, imageView4, imageView5, linearLayout, textView8);
                                                                                setContentView(coordinatorLayout);
                                                                                addMenuProvider(new k0(this, i), this, e6b.d);
                                                                                Drawable navigationIcon = G().getNavigationIcon();
                                                                                if (navigationIcon != null) {
                                                                                    navigationIcon.setTintList(ColorStateList.valueOf(getColor(R.color.n_lv_1)));
                                                                                }
                                                                                N();
                                                                                sc scVar = this.L;
                                                                                if (scVar == null) {
                                                                                    Intrinsics.i("binding");
                                                                                    throw null;
                                                                                }
                                                                                ((TextView) scVar.m).setOnClickListener(new g0(this, i));
                                                                                sc scVar2 = this.L;
                                                                                if (scVar2 == null) {
                                                                                    Intrinsics.i("binding");
                                                                                    throw null;
                                                                                }
                                                                                ((TextView) scVar2.k).setOnClickListener(new g0(this, 3));
                                                                                sc scVar3 = this.L;
                                                                                if (scVar3 == null) {
                                                                                    Intrinsics.i("binding");
                                                                                    throw null;
                                                                                }
                                                                                scVar3.h.setOnClickListener(new g0(this, 4));
                                                                                sc scVar4 = this.L;
                                                                                if (scVar4 == null) {
                                                                                    Intrinsics.i("binding");
                                                                                    throw null;
                                                                                }
                                                                                scVar4.d.setOnClickListener(new g0(this, 5));
                                                                                sc scVar5 = this.L;
                                                                                if (scVar5 == null) {
                                                                                    Intrinsics.i("binding");
                                                                                    throw null;
                                                                                }
                                                                                ((TextView) scVar5.n).setOnClickListener(new g0(this, 6));
                                                                                sc scVar6 = this.L;
                                                                                if (scVar6 == null) {
                                                                                    Intrinsics.i("binding");
                                                                                    throw null;
                                                                                }
                                                                                scVar6.i.setOnClickListener(new g0(this, 7));
                                                                                sc scVar7 = this.L;
                                                                                if (scVar7 == null) {
                                                                                    Intrinsics.i("binding");
                                                                                    throw null;
                                                                                }
                                                                                scVar7.j.setOnClickListener(new g0(this, 8));
                                                                                sc scVar8 = this.L;
                                                                                if (scVar8 == null) {
                                                                                    Intrinsics.i("binding");
                                                                                    throw null;
                                                                                }
                                                                                scVar8.c.setOnClickListener(new g0(this, 9));
                                                                                sc scVar9 = this.L;
                                                                                if (scVar9 == null) {
                                                                                    Intrinsics.i("binding");
                                                                                    throw null;
                                                                                }
                                                                                scVar9.e.setOnClickListener(new g0(this, 10));
                                                                                sc scVar10 = this.L;
                                                                                if (scVar10 == null) {
                                                                                    Intrinsics.i("binding");
                                                                                    throw null;
                                                                                }
                                                                                ((ImageView) scVar10.f).setOnClickListener(new g0(this, 11));
                                                                                sc scVar11 = this.L;
                                                                                if (scVar11 == null) {
                                                                                    Intrinsics.i("binding");
                                                                                    throw null;
                                                                                }
                                                                                ((ImageView) scVar11.g).setOnClickListener(new g0(this, 1));
                                                                                sc scVar12 = this.L;
                                                                                if (scVar12 == null) {
                                                                                    Intrinsics.i("binding");
                                                                                    throw null;
                                                                                }
                                                                                ((LinearLayout) scVar12.b).setVisibility(zu3.g0.hasMcc(Integer.valueOf(this.K)) ? 0 : 8);
                                                                                k().Z(new m0(this), false);
                                                                                int b = GoogleApiAvailability.e.b(getApplicationContext(), GoogleApiAvailabilityLight.a);
                                                                                if (b == 0 || b == 2) {
                                                                                    return;
                                                                                }
                                                                                Calendar calendar = ke0.a;
                                                                                ke0.g(this, "Google Play Service Code: " + b, 0);
                                                                                return;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "AboutScreen";
    }
}
