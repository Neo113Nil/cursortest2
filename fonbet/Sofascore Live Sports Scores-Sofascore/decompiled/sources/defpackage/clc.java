package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.ironsource.U3;
import com.sofascore.model.database.DbNatsEvent;
import com.sofascore.model.mvvm.model.MmaOrganisationHeadFlags;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class clc implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ clc(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nlg V0;
        int i;
        int i2;
        int i3 = this.a;
        int i4 = R.id.text_brand_name;
        switch (i3) {
            case 0:
                ((Integer) obj).getClass();
                return Boolean.FALSE;
            case 1:
                qlc qlcVar = (qlc) obj;
                qlcVar.getClass();
                return qlcVar.a;
            case 2:
                ((aoc) obj).getClass();
                return Boolean.TRUE;
            case 3:
                ((MmaOrganisationHeadFlags) obj).getClass();
                return Boolean.TRUE;
            case 4:
                MmaOrganisationHeadFlags mmaOrganisationHeadFlags = (MmaOrganisationHeadFlags) obj;
                mmaOrganisationHeadFlags.getClass();
                return Boolean.valueOf(mmaOrganisationHeadFlags.getEvents());
            case 5:
                MmaOrganisationHeadFlags mmaOrganisationHeadFlags2 = (MmaOrganisationHeadFlags) obj;
                mmaOrganisationHeadFlags2.getClass();
                return Boolean.valueOf(mmaOrganisationHeadFlags2.getRankings());
            case 6:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                V0 = glgVar.V0("DELETE FROM mma_organization_view_table");
                try {
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 7:
                return Boolean.TRUE;
            case 8:
                y3h.m((b4h) obj);
                return Unit.a;
            case 9:
                KProperty[] kPropertyArr = y3h.a;
                a4h a4hVar = w3h.y;
                Unit unit = Unit.a;
                ((b4h) obj).a(a4hVar, unit);
                return unit;
            case 10:
                b4h b4hVar = (b4h) obj;
                b4hVar.getClass();
                KProperty[] kPropertyArr2 = z3h.a;
                a4h a4hVar2 = x3h.a;
                KProperty kProperty = z3h.a[0];
                b4hVar.a(a4hVar2, Boolean.TRUE);
                return Unit.a;
            case 11:
                c8e c8eVar = (c8e) obj;
                StringBuilder sb = new StringBuilder(U3.j.d);
                sb.append(c8eVar.b);
                sb.append(", ");
                return wv8.j(sb, c8eVar.c, ')');
            case 12:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                return wt3.m(((e5f) entry.getKey()).a, " = ", new StringBuilder("  "), value instanceof byte[] ? ph0.I((byte[]) value, ", ", null, 56) : String.valueOf(entry.getValue()));
            case 13:
                Context context = (Context) obj;
                context.getClass();
                NativeAdView nativeAdView = new NativeAdView(context);
                nativeAdView.setBackgroundColor(0);
                nativeAdView.setPaddingRelative(0, ao2.v(6, context), ao2.v(6, context), 0);
                nativeAdView.setBackground(context.getDrawable(R.drawable.rounded_surface_level_1));
                View inflate = LayoutInflater.from(context).inflate(R.layout.view_native_ad_content, (ViewGroup) nativeAdView, false);
                nativeAdView.addView(inflate);
                if (((TextView) nq8.B(R.id.ad_placeholder, inflate)) != null) {
                    TextView textView = (TextView) nq8.B(R.id.body, inflate);
                    if (textView != null) {
                        ImageView imageView = (ImageView) nq8.B(R.id.brand_image, inflate);
                        if (imageView == null) {
                            i = R.id.brand_image;
                        } else if (((Space) nq8.B(R.id.brand_logo_space, inflate)) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                            TextView textView2 = (TextView) nq8.B(R.id.cta_button, inflate);
                            if (textView2 != null) {
                                i = R.id.main_image;
                                MediaView mediaView = (MediaView) nq8.B(R.id.main_image, inflate);
                                if (mediaView != null) {
                                    TextView textView3 = (TextView) nq8.B(R.id.text_brand_name, inflate);
                                    if (textView3 != null) {
                                        i = R.id.text_sponsored;
                                        if (((TextView) nq8.B(R.id.text_sponsored, inflate)) != null) {
                                            i4 = R.id.title;
                                            TextView textView4 = (TextView) nq8.B(R.id.title, inflate);
                                            if (textView4 != null) {
                                                utk utkVar = new utk(constraintLayout, textView, imageView, textView2, mediaView, textView3, textView4);
                                                mediaView.setOnHierarchyChangeListener(new z3d());
                                                nativeAdView.setTag(utkVar);
                                                return nativeAdView;
                                            }
                                        }
                                    }
                                    i = i4;
                                }
                            } else {
                                i = R.id.cta_button;
                            }
                        } else {
                            i = R.id.brand_logo_space;
                        }
                    } else {
                        i = R.id.body;
                    }
                } else {
                    i = R.id.ad_placeholder;
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
                return null;
            case 14:
                NativeAdView nativeAdView2 = (NativeAdView) obj;
                nativeAdView2.getClass();
                nativeAdView2.removeAllViews();
                nativeAdView2.destroy();
                return Unit.a;
            case 15:
                Context context2 = (Context) obj;
                context2.getClass();
                NativeAdView nativeAdView3 = new NativeAdView(context2);
                nativeAdView3.setBackgroundColor(0);
                nativeAdView3.setPaddingRelative(0, ao2.v(6, context2), ao2.v(6, context2), 0);
                nativeAdView3.setBackground(context2.getDrawable(R.drawable.rounded_surface_level_1));
                View inflate2 = LayoutInflater.from(context2).inflate(R.layout.view_native_ad_grid, (ViewGroup) nativeAdView3, false);
                nativeAdView3.addView(inflate2);
                if (((TextView) nq8.B(R.id.ad_placeholder, inflate2)) != null) {
                    TextView textView5 = (TextView) nq8.B(R.id.body, inflate2);
                    if (textView5 != null) {
                        ImageView imageView2 = (ImageView) nq8.B(R.id.brand_image, inflate2);
                        if (imageView2 == null) {
                            i2 = R.id.brand_image;
                        } else if (((Space) nq8.B(R.id.brand_logo_space, inflate2)) != null) {
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate2;
                            TextView textView6 = (TextView) nq8.B(R.id.cta_button, inflate2);
                            if (textView6 != null) {
                                TextView textView7 = (TextView) nq8.B(R.id.text_brand_name, inflate2);
                                if (textView7 == null) {
                                    i2 = R.id.text_brand_name;
                                } else if (((TextView) nq8.B(R.id.text_sponsored, inflate2)) != null) {
                                    TextView textView8 = (TextView) nq8.B(R.id.title, inflate2);
                                    if (textView8 != null) {
                                        nativeAdView3.setTag(new vtk(constraintLayout2, textView5, imageView2, textView6, textView7, textView8));
                                        return nativeAdView3;
                                    }
                                    i2 = R.id.title;
                                } else {
                                    i2 = R.id.text_sponsored;
                                }
                            } else {
                                i2 = R.id.cta_button;
                            }
                        } else {
                            i2 = R.id.brand_logo_space;
                        }
                    } else {
                        i2 = R.id.body;
                    }
                } else {
                    i2 = R.id.ad_placeholder;
                }
                yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
                return null;
            case 16:
                NativeAdView nativeAdView4 = (NativeAdView) obj;
                nativeAdView4.getClass();
                nativeAdView4.removeAllViews();
                nativeAdView4.destroy();
                return Unit.a;
            case 17:
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                V0 = glgVar2.V0("SELECT * FROM nats_event_table ORDER BY id ASC LIMIT 100");
                try {
                    int r = w1a.r(V0, "id");
                    int r2 = w1a.r(V0, "topic");
                    int r3 = w1a.r(V0, PglCryptUtils.KEY_MESSAGE);
                    ArrayList arrayList = new ArrayList();
                    while (V0.U0()) {
                        arrayList.add(new DbNatsEvent((int) V0.getLong(r), V0.F0(r2), V0.F0(r3)));
                    }
                    return arrayList;
                } finally {
                }
            case 18:
                glg glgVar3 = (glg) obj;
                glgVar3.getClass();
                V0 = glgVar3.V0("DELETE FROM nats_event_table WHERE id NOT IN (SELECT id FROM nats_event_table ORDER BY id DESC LIMIT 10000)");
                try {
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 19:
                glg glgVar4 = (glg) obj;
                glgVar4.getClass();
                V0 = glgVar4.V0("SELECT * FROM nats_event_table ORDER BY id ASC LIMIT 500");
                try {
                    int r4 = w1a.r(V0, "id");
                    int r5 = w1a.r(V0, "topic");
                    int r6 = w1a.r(V0, PglCryptUtils.KEY_MESSAGE);
                    ArrayList arrayList2 = new ArrayList();
                    while (V0.U0()) {
                        arrayList2.add(new DbNatsEvent((int) V0.getLong(r4), V0.F0(r5), V0.F0(r6)));
                    }
                    return arrayList2;
                } finally {
                }
            case 20:
                ly3 ly3Var = (ly3) obj;
                ly3Var.getClass();
                return new e6d(yso.w(ly3Var));
            case 21:
                return new ay0(yso.w((ly3) obj));
            case 22:
                Context context3 = (Context) obj;
                context3.getClass();
                if (context3 instanceof ContextWrapper) {
                    return ((ContextWrapper) context3).getBaseContext();
                }
                return null;
            case 23:
                s6d s6dVar = (s6d) obj;
                s6dVar.getClass();
                g7d g7dVar = s6dVar.c;
                if (g7dVar == null || g7dVar.g.b != s6dVar.b.b) {
                    return null;
                }
                return g7dVar;
            case 24:
                s6d s6dVar2 = (s6d) obj;
                s6dVar2.getClass();
                g7d g7dVar2 = s6dVar2.c;
                if (g7dVar2 == null || g7dVar2.g.b != s6dVar2.b.b) {
                    return null;
                }
                return g7dVar2;
            case 25:
                s6d s6dVar3 = (s6d) obj;
                s6dVar3.getClass();
                return Integer.valueOf(s6dVar3.b.b);
            case 26:
                ((ly3) obj).getClass();
                return new l6d();
            case 27:
                Context context4 = (Context) obj;
                context4.getClass();
                ContextWrapper contextWrapper = context4 instanceof ContextWrapper ? (ContextWrapper) context4 : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
            case 28:
                Context context5 = (Context) obj;
                context5.getClass();
                if (context5 instanceof Activity) {
                    return (Activity) context5;
                }
                return null;
            default:
                s6d s6dVar4 = (s6d) obj;
                s6dVar4.getClass();
                return s6dVar4.c;
        }
    }
}
