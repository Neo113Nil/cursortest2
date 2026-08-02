package com.vk.core.ui.bottomsheet.internal;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.widget.MaxWidthFrameLayout;
import com.vk.core.ui.adapter.RecyclerViewState;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.core.ui.utils.CenterLayoutManager;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import xsna.c220;
import xsna.c33;
import xsna.cz20;
import xsna.d1x;
import xsna.dh6;
import xsna.drm0;
import xsna.dw20;
import xsna.f4m;
import xsna.gu9;
import xsna.gz20;
import xsna.gzs;
import xsna.hz20;
import xsna.iah0;
import xsna.iz20;
import xsna.izs;
import xsna.jjc;
import xsna.klw;
import xsna.m33;
import xsna.mkc;
import xsna.nw20;
import xsna.s3q0;
import xsna.t0w0;
import xsna.tuq;
import xsna.u080;
import xsna.u8;
import xsna.v4v;
import xsna.vth;
import xsna.wzs;
import xsna.xa2;
import xsna.ywt0;
import xsna.z7w;

/* compiled from: ModalController.kt */
/* loaded from: classes17.dex */
public final class e {
    public static final int a1 = iah0.a(8);
    public static final int b1 = iah0.a(12);
    public static final int c1 = iah0.a(16);
    public static final int d1 = iah0.a(24);
    public static final int e1 = iah0.a(80);
    public static final int f1 = iah0.a(72);
    public hz20 A;
    public Integer A0;
    public Integer B;
    public Integer B0;
    public com.vk.qrcode.e C;
    public CharSequence C0;
    public boolean D;
    public Integer D0;
    public iz20 E;
    public Integer E0;
    public boolean F;
    public Integer F0;
    public boolean G;
    public Integer G0;
    public Integer H0;
    public boolean I;
    public CharSequence I0;
    public boolean J;
    public Integer J0;
    public boolean K;
    public boolean L;
    public boolean M;
    public CharSequence M0;
    public boolean N0;
    public boolean O;
    public CharSequence O0;
    public Drawable P;
    public String P0;
    public Drawable Q0;
    public CharSequence R0;
    public String S0;
    public izs<? super View, s3q0> T0;
    public gzs<s3q0> U0;
    public u080 V0;
    public boolean W0;
    public Integer X0;
    public View Y;
    public izs<? super RecyclerViewState, s3q0> Y0;
    public boolean Z;
    public final mkc Z0;
    public ViewGroup a;
    public LinearLayout b;
    public MaxWidthFrameLayout b0;
    public LinearLayout c;
    public View c0;
    public ImageView d;
    public View d0;
    public ImageView e;
    public Drawable e0;
    public TextView f;
    public Drawable f0;
    public FrameLayout g;
    public CharSequence g0;
    public VKReplacerView h;
    public String h0;
    public ImageView i;
    public izs<? super View, s3q0> i0;
    public ImageView j;
    public klw j0;
    public TextView k;
    public Integer k0;
    public TextView l;
    public boolean l0;
    public TextView m;
    public Drawable m0;
    public TextView n;
    public boolean n0;
    public hz20 o;
    public boolean o0;
    public FrameLayout p;
    public Integer p0;
    public FrameLayout q;
    public Integer q0;
    public RecyclerView r;
    public CharSequence r0;
    public RecyclerView.Adapter<? extends RecyclerView.e0> s;
    public Integer s0;
    public Integer t0;
    public TextView u;
    public g u0;
    public hz20 v;
    public Integer w;
    public Integer w0;
    public com.vk.qrcode.e x;
    public Integer x0;
    public boolean y;
    public Integer y0;
    public TextView z;
    public Integer z0;
    public final ArrayList t = new ArrayList();
    public int H = -1;
    public boolean N = true;
    public int Q = -1;
    public int R = -1;
    public int S = -1;
    public int T = -1;
    public int U = -1;
    public int V = -1;
    public izs<? super View, ? extends View> W = new c220(3);
    public izs<? super View, s3q0> X = new z7w(5);
    public final boolean a0 = true;
    public boolean v0 = true;
    public int K0 = -1;
    public int L0 = 1;

    /* compiled from: ModalController.kt */
    public static final class a {
        public boolean A;
        public gzs<Boolean> A1;
        public boolean B;
        public gzs<s3q0> B0;
        public boolean B1;
        public Boolean C;
        public RecyclerView.Adapter<? extends RecyclerView.e0> C0;
        public boolean C1;
        public View D;
        public boolean D1;
        public View E;
        public boolean E0;
        public boolean E1;
        public Integer F;
        public CharSequence F0;
        public boolean F1;
        public Drawable G;
        public hz20 G0;
        public boolean G1;
        public klw H;
        public CharSequence H0;
        public Integer I;
        public Drawable I0;
        public boolean J;
        public hz20 J0;
        public boolean J1;
        public Drawable K;
        public Integer K0;
        public boolean L;
        public String L0;
        public boolean M;
        public com.vk.qrcode.e M0;
        public boolean N;
        public boolean N0;
        public Integer O;
        public CharSequence O0;
        public Integer P;
        public hz20 P0;
        public CharSequence Q;
        public Integer Q0;
        public Integer R;
        public String R0;
        public Integer S;
        public com.vk.qrcode.e S0;
        public Integer T;
        public boolean T0;
        public Integer U;
        public gz20 U0;
        public Float V;
        public DialogInterface.OnKeyListener V0;
        public Integer W;
        public iz20 W0;
        public Rect X;
        public izs<? super View, s3q0> X0;
        public Integer Y;
        public u8 Y0;
        public Integer Z;
        public xa2 Z0;
        public Integer a0;
        public DialogInterface.OnDismissListener a1;
        public boolean b;
        public boolean b0;
        public izs<? super nw20, s3q0> b1;
        public CharSequence c0;
        public b c1;
        public boolean d;
        public Integer d0;
        public u080 d1;
        public boolean e;
        public Integer e0;
        public ModalBottomSheetBehavior.d e1;
        public boolean f;
        public Integer f0;
        public dh6.a f1;
        public Integer g0;
        public Drawable g1;
        public boolean h;
        public String h0;
        public CharSequence h1;
        public boolean i;
        public izs<? super View, s3q0> i0;
        public View j;
        public CharSequence j0;
        public boolean k;
        public MaxWidthFrameLayout l;
        public Integer m;
        public boolean m0;
        public boolean n;
        public boolean o;
        public boolean o0;
        public boolean o1;
        public wzs<? super b, ? super u080, ? extends ModalBottomSheetBehavior<ViewGroup>> p0;
        public boolean p1;
        public Integer q;
        public Integer r0;
        public g t1;
        public Drawable v0;
        public Integer v1;
        public boolean w1;
        public int x0;
        public boolean x1;
        public Drawable y1;
        public int z0;
        public gzs<s3q0> z1;
        public float a = nw20.m1;
        public boolean c = true;
        public boolean g = true;
        public boolean p = true;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public int x = -1;
        public int y = -1;
        public int z = -1;
        public int k0 = -1;
        public int l0 = 1;
        public boolean n0 = true;
        public boolean q0 = true;
        public int s0 = -1;
        public final int t0 = -1;
        public int u0 = -1;
        public int w0 = -1;
        public float y0 = -1.0f;
        public int A0 = dw20.e1;
        public final ArrayList D0 = new ArrayList();
        public izs<? super RecyclerViewState, s3q0> i1 = new v4v(13);
        public izs<? super View, s3q0> j1 = new tuq(11);
        public izs<? super View, ? extends View> k1 = new c220(3);
        public boolean l1 = true;
        public boolean m1 = true;
        public boolean n1 = true;
        public int q1 = -1;
        public int r1 = -1;
        public boolean s1 = true;
        public boolean u1 = true;
        public boolean H1 = true;
        public boolean I1 = true;
    }

    public e(c33 c33Var) {
        this.Z0 = new mkc(3, this, c33Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:408:0x0700, code lost:
    
        if (xsna.f4m.f(r1) != false) goto L582;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View a(Context context) {
        View view;
        CharSequence charSequence;
        View view2;
        ViewGroup.LayoutParams layoutParams;
        int i;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.modal_bottom_sheet, (ViewGroup) null, false);
        this.a = viewGroup;
        if (viewGroup == null) {
            viewGroup = null;
        }
        this.b = (LinearLayout) viewGroup.findViewById(R.id.content);
        ViewGroup viewGroup2 = this.a;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        this.c = (LinearLayout) viewGroup2.findViewById(R.id.buttons_container);
        int i2 = this.R;
        if (i2 != -1) {
            LinearLayout linearLayout = this.b;
            if (linearLayout == null) {
                linearLayout = null;
            }
            f4m.y(i2, linearLayout);
        }
        if (this.I) {
            ViewGroup viewGroup3 = this.a;
            if (viewGroup3 == null) {
                viewGroup3 = null;
            }
            viewGroup3.setBackground(this.P);
            if (this.P == null || (i = this.Q) == -1) {
                i = 0;
            }
            ViewGroup viewGroup4 = this.a;
            if (viewGroup4 == null) {
                viewGroup4 = null;
            }
            viewGroup4.setPadding(i, i, i, i);
            ViewGroup viewGroup5 = this.a;
            if (viewGroup5 == null) {
                viewGroup5 = null;
            }
            viewGroup5.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            LinearLayout linearLayout2 = this.b;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        } else {
            if (!this.M || this.J) {
                ViewGroup viewGroup6 = this.a;
                if (viewGroup6 == null) {
                    viewGroup6 = null;
                }
                Rect rect = ywt0.a;
                viewGroup6.setPadding(0, 0, 0, 0);
            } else {
                d1x c = gu9.c(R.attr.vk_ui_background_modal, context);
                ViewGroup viewGroup7 = this.a;
                if (viewGroup7 == null) {
                    viewGroup7 = null;
                }
                viewGroup7.setBackground(c);
            }
            if (this.O) {
                LinearLayout linearLayout3 = this.b;
                if (linearLayout3 == null) {
                    linearLayout3 = null;
                }
                ViewParent parent = linearLayout3.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup8 = (ViewGroup) parent;
                    LinearLayout linearLayout4 = this.b;
                    if (linearLayout4 == null) {
                        linearLayout4 = null;
                    }
                    viewGroup8.removeView(linearLayout4);
                    NestedScrollView nestedScrollView = new NestedScrollView(context, null);
                    nestedScrollView.setOverScrollMode(2);
                    LinearLayout linearLayout5 = this.b;
                    if (linearLayout5 == null) {
                        linearLayout5 = null;
                    }
                    nestedScrollView.addView(linearLayout5);
                    viewGroup8.addView(nestedScrollView, 0);
                }
            }
        }
        View view3 = this.Y;
        boolean z = this.a0;
        if (view3 != null) {
            if (this.I || this.v == null) {
                ViewGroup viewGroup9 = this.a;
                if (viewGroup9 == null) {
                    viewGroup9 = null;
                }
                viewGroup9.removeAllViews();
                ViewGroup viewGroup10 = this.a;
                if (viewGroup10 == null) {
                    viewGroup10 = null;
                }
                viewGroup10.addView(this.Y);
                if (this.F) {
                    ViewGroup viewGroup11 = this.a;
                    ViewGroup viewGroup12 = viewGroup11 == null ? null : viewGroup11;
                    int i3 = a1;
                    ywt0.a(viewGroup12, i3, 0, i3, 0, 10);
                }
                if (this.G) {
                    ViewGroup viewGroup13 = this.a;
                    ViewGroup viewGroup14 = viewGroup13 == null ? null : viewGroup13;
                    int i4 = a1;
                    ywt0.a(viewGroup14, 0, i4, 0, i4, 5);
                } else {
                    int i5 = this.H;
                    if (i5 != -1) {
                        ViewGroup viewGroup15 = this.a;
                        ywt0.a(viewGroup15 == null ? null : viewGroup15, 0, i5, 0, i5, 5);
                    }
                }
            } else {
                LinearLayout linearLayout6 = this.b;
                if (linearLayout6 == null) {
                    linearLayout6 = null;
                }
                linearLayout6.removeAllViews();
                LinearLayout linearLayout7 = this.b;
                if (linearLayout7 == null) {
                    linearLayout7 = null;
                }
                linearLayout7.addView(this.Y);
                if (z) {
                    e();
                }
                f();
            }
            if (this.Z && (view2 = this.Y) != null && (layoutParams = view2.getLayoutParams()) != null) {
                layoutParams.height = -1;
            }
        } else {
            if (this.K) {
                ViewGroup viewGroup16 = this.a;
                ViewGroup viewGroup17 = viewGroup16 == null ? null : viewGroup16;
                int i6 = a1;
                ywt0.a(viewGroup17, i6, 0, i6, 0, 10);
            }
            if (this.L) {
                ViewGroup viewGroup18 = this.a;
                ViewGroup viewGroup19 = viewGroup18 == null ? null : viewGroup18;
                int i7 = a1;
                ywt0.a(viewGroup19, 0, i7, 0, i7, 5);
            }
            this.d = (ImageView) g(R.id.icon);
            this.e = (ImageView) g(R.id.close_icon);
            this.f = (TextView) g(R.id.btnEndTitle);
            this.g = (FrameLayout) g(R.id.fl_photo_container);
            this.i = (ImageView) g(R.id.photo);
            this.h = (VKReplacerView) g(R.id.placeholder);
            this.j = (ImageView) g(R.id.indicator);
            this.k = (TextView) g(R.id.title);
            this.l = (TextView) g(R.id.subtitle);
            this.m = (TextView) g(R.id.message);
            this.n = (TextView) g(R.id.more);
            this.p = (FrameLayout) g(R.id.fl_additional_custom_content_container);
            RecyclerView recyclerView = (RecyclerView) g(R.id.recycler);
            this.r = recyclerView;
            recyclerView.addOnScrollListener(new cz20(this));
            Drawable drawable = this.e0;
            if (drawable != null) {
                ImageView imageView = this.d;
                if (imageView == null) {
                    imageView = null;
                }
                imageView.setImageDrawable(drawable);
            } else {
                ImageView imageView2 = this.d;
                if (imageView2 == null) {
                    imageView2 = null;
                }
                imageView2.setVisibility(8);
                LinearLayout linearLayout8 = this.b;
                if (linearLayout8 == null) {
                    linearLayout8 = null;
                }
                ImageView imageView3 = this.d;
                if (imageView3 == null) {
                    imageView3 = null;
                }
                linearLayout8.removeView(imageView3);
            }
            Drawable drawable2 = this.f0;
            if (drawable2 != null) {
                ImageView imageView4 = this.e;
                if (imageView4 == null) {
                    imageView4 = null;
                }
                imageView4.setImageDrawable(drawable2);
                ImageView imageView5 = this.e;
                if (imageView5 == null) {
                    imageView5 = null;
                }
                jjc.g(imageView5, this.T0);
                CharSequence charSequence2 = this.g0;
                if (charSequence2 != null) {
                    ImageView imageView6 = this.e;
                    if (imageView6 == null) {
                        imageView6 = null;
                    }
                    imageView6.setContentDescription(charSequence2);
                }
            } else {
                ImageView imageView7 = this.e;
                if (imageView7 == null) {
                    imageView7 = null;
                }
                imageView7.setVisibility(8);
                ImageView imageView8 = this.e;
                if (imageView8 == null) {
                    imageView8 = null;
                }
                imageView8.setOnClickListener(null);
                LinearLayout linearLayout9 = this.b;
                if (linearLayout9 == null) {
                    linearLayout9 = null;
                }
                ImageView imageView9 = this.e;
                if (imageView9 == null) {
                    imageView9 = null;
                }
                linearLayout9.removeView(imageView9);
            }
            String str = this.h0;
            if (str != null) {
                TextView textView = this.f;
                if (textView == null) {
                    textView = null;
                }
                textView.setText(str);
                TextView textView2 = this.f;
                if (textView2 == null) {
                    textView2 = null;
                }
                jjc.g(textView2, this.i0);
                TextView textView3 = this.f;
                if (textView3 == null) {
                    textView3 = null;
                }
                textView3.setVisibility(0);
            } else {
                TextView textView4 = this.f;
                if (textView4 == null) {
                    textView4 = null;
                }
                f4m.j(textView4);
            }
            Integer num = this.k0;
            klw klwVar = this.j0;
            int i8 = c1;
            if (klwVar == null && num == null) {
                FrameLayout frameLayout = this.g;
                if (frameLayout == null) {
                    frameLayout = null;
                }
                frameLayout.setVisibility(8);
                LinearLayout linearLayout10 = this.b;
                if (linearLayout10 == null) {
                    linearLayout10 = null;
                }
                FrameLayout frameLayout2 = this.g;
                if (frameLayout2 == null) {
                    frameLayout2 = null;
                }
                linearLayout10.removeView(frameLayout2);
            } else {
                float f = this.l0 ? 50.0f : 14.0f;
                if (num != null) {
                    VKReplacerView vKReplacerView = this.h;
                    if ((vKReplacerView == null ? null : vKReplacerView).b) {
                        if (vKReplacerView == null) {
                            vKReplacerView = null;
                        }
                        f4m.j(vKReplacerView);
                    }
                    ImageView imageView10 = this.i;
                    if (imageView10 == null) {
                        imageView10 = null;
                    }
                    imageView10.setImageResource(num.intValue());
                    ImageView imageView11 = this.i;
                    if (imageView11 == null) {
                        imageView11 = null;
                    }
                    imageView11.setOutlineProvider(new t0w0(6, iah0.a(f), false, false));
                    if (this.l0) {
                        ImageView imageView12 = this.i;
                        if (imageView12 == null) {
                            imageView12 = null;
                        }
                        imageView12.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    }
                    view = this.i;
                    if (view == null) {
                        view = null;
                    }
                } else {
                    ImageView imageView13 = this.i;
                    if (imageView13 == null) {
                        imageView13 = null;
                    }
                    f4m.j(imageView13);
                    view = klwVar.b.getView();
                    VKReplacerView vKReplacerView2 = this.h;
                    if (vKReplacerView2 == null) {
                        vKReplacerView2 = null;
                    }
                    if (vKReplacerView2.a(view)) {
                        klwVar.b.f(klwVar.a, new VKImageController.b(f, null, false, 0, null, null, null, VKImageController.ScaleType.CENTER_CROP, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65278));
                    }
                }
                view.setClipToOutline(true);
                view.setContentDescription(context.getString(R.string.accessibility_photo));
                boolean z2 = (this.p0 == null || this.q0 == null) ? false : true;
                if (this.n0 || this.o0 || z2) {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (z2) {
                        Integer num2 = this.p0;
                        layoutParams2.width = num2 != null ? num2.intValue() : 0;
                        Integer num3 = this.q0;
                        layoutParams2.height = num3 != null ? num3.intValue() : 0;
                    } else {
                        int i9 = this.n0 ? e1 : f1;
                        layoutParams2.width = i9;
                        layoutParams2.height = i9;
                    }
                    view.setLayoutParams(layoutParams2);
                }
                gzs<s3q0> gzsVar = this.U0;
                if (gzsVar != null) {
                    jjc.g(view, new vth(2, gzsVar));
                    s3q0 s3q0Var = s3q0.a;
                }
                ImageView imageView14 = this.j;
                if (imageView14 == null) {
                    imageView14 = null;
                }
                Drawable drawable3 = this.m0;
                if (drawable3 != null) {
                    imageView14.setImageDrawable(drawable3);
                    s3q0 s3q0Var2 = s3q0.a;
                } else {
                    f4m.j(imageView14);
                }
                if (this.W0) {
                    imageView14.setBackground(null);
                }
                TextView textView5 = this.k;
                if (textView5 == null) {
                    textView5 = null;
                }
                f4m.t(i8, textView5);
            }
            ImageView imageView15 = this.d;
            if (imageView15 == null) {
                imageView15 = null;
            }
            if (f4m.f(imageView15)) {
                FrameLayout frameLayout3 = this.g;
                if (frameLayout3 == null) {
                    frameLayout3 = null;
                }
                if (f4m.f(frameLayout3)) {
                    ViewGroup viewGroup20 = this.a;
                    ywt0.a(viewGroup20 == null ? null : viewGroup20, 0, b1, 0, 0, 13);
                }
            }
            CharSequence charSequence3 = this.r0;
            if (charSequence3 == null || drm0.N(charSequence3)) {
                TextView textView6 = this.k;
                if (textView6 == null) {
                    textView6 = null;
                }
                textView6.setVisibility(8);
                LinearLayout linearLayout11 = this.b;
                if (linearLayout11 == null) {
                    linearLayout11 = null;
                }
                TextView textView7 = this.k;
                if (textView7 == null) {
                    textView7 = null;
                }
                linearLayout11.removeView(textView7);
                s3q0 s3q0Var3 = s3q0.a;
            } else {
                Integer num4 = this.x0;
                if (num4 != null) {
                    int intValue = num4.intValue();
                    TextView textView8 = this.k;
                    if (textView8 == null) {
                        textView8 = null;
                    }
                    textView8.setTextAppearance(intValue);
                    s3q0 s3q0Var4 = s3q0.a;
                }
                Integer num5 = this.t0;
                if (num5 != null) {
                    int intValue2 = num5.intValue();
                    TextView textView9 = this.k;
                    if (textView9 == null) {
                        textView9 = null;
                    }
                    textView9.setGravity(intValue2);
                    s3q0 s3q0Var5 = s3q0.a;
                }
                Integer num6 = this.y0;
                if (num6 != null) {
                    int intValue3 = num6.intValue();
                    TextView textView10 = this.k;
                    if (textView10 == null) {
                        textView10 = null;
                    }
                    textView10.setMaxLines(intValue3);
                    s3q0 s3q0Var6 = s3q0.a;
                }
                TextView textView11 = this.k;
                if (textView11 == null) {
                    textView11 = null;
                }
                textView11.setText(this.r0);
                Integer num7 = this.s0;
                if (num7 != null) {
                    int intValue4 = num7.intValue();
                    TextView textView12 = this.k;
                    if (textView12 == null) {
                        textView12 = null;
                    }
                    textView12.setTextColor(intValue4);
                    s3q0 s3q0Var7 = s3q0.a;
                }
                if (this.s != null) {
                    if (this.e0 == null || this.j0 == null || this.r0 == null || this.I0 == null) {
                        ViewGroup viewGroup21 = this.a;
                        ywt0.a(viewGroup21 == null ? null : viewGroup21, 0, i8, 0, 0, 13);
                    }
                    TextView textView13 = this.k;
                    if (textView13 == null) {
                        textView13 = null;
                    }
                    f4m.t(i8, textView13);
                    f4m.q(i8, textView13);
                }
                Integer num8 = this.z0;
                if (num8 != null) {
                    TextView textView14 = this.k;
                    if (textView14 == null) {
                        textView14 = null;
                    }
                    f4m.s(num8.intValue(), textView14);
                    f4m.r(num8.intValue(), textView14);
                }
                Integer num9 = this.A0;
                if (num9 != null) {
                    int intValue5 = num9.intValue();
                    TextView textView15 = this.k;
                    if (textView15 == null) {
                        textView15 = null;
                    }
                    f4m.t(intValue5, textView15);
                    s3q0 s3q0Var8 = s3q0.a;
                }
                Integer num10 = this.B0;
                if (num10 != null) {
                    int intValue6 = num10.intValue();
                    TextView textView16 = this.k;
                    if (textView16 == null) {
                        textView16 = null;
                    }
                    f4m.q(intValue6, textView16);
                    s3q0 s3q0Var9 = s3q0.a;
                }
            }
            CharSequence charSequence4 = this.C0;
            if (charSequence4 == null || drm0.N(charSequence4)) {
                TextView textView17 = this.l;
                if (textView17 == null) {
                    textView17 = null;
                }
                textView17.setVisibility(8);
                LinearLayout linearLayout12 = this.b;
                if (linearLayout12 == null) {
                    linearLayout12 = null;
                }
                TextView textView18 = this.l;
                if (textView18 == null) {
                    textView18 = null;
                }
                linearLayout12.removeView(textView18);
            } else {
                TextView textView19 = this.l;
                if (textView19 == null) {
                    textView19 = null;
                }
                textView19.setText(this.C0);
                Integer num11 = this.D0;
                if (num11 != null) {
                    int intValue7 = num11.intValue();
                    TextView textView20 = this.l;
                    if (textView20 == null) {
                        textView20 = null;
                    }
                    textView20.setTextColor(intValue7);
                    s3q0 s3q0Var10 = s3q0.a;
                }
                Integer num12 = this.E0;
                if (num12 != null) {
                    int intValue8 = num12.intValue();
                    TextView textView21 = this.l;
                    if (textView21 == null) {
                        textView21 = null;
                    }
                    textView21.setTextAppearance(intValue8);
                    s3q0 s3q0Var11 = s3q0.a;
                }
                Integer num13 = this.F0;
                if (num13 != null) {
                    int intValue9 = num13.intValue();
                    TextView textView22 = this.l;
                    if (textView22 == null) {
                        textView22 = null;
                    }
                    textView22.setGravity(intValue9);
                    s3q0 s3q0Var12 = s3q0.a;
                }
                Integer num14 = this.G0;
                if (num14 != null) {
                    int intValue10 = num14.intValue();
                    TextView textView23 = this.l;
                    if (textView23 == null) {
                        textView23 = null;
                    }
                    f4m.t(intValue10, textView23);
                    s3q0 s3q0Var13 = s3q0.a;
                }
                Integer num15 = this.H0;
                if (num15 != null) {
                    TextView textView24 = this.l;
                    if (textView24 == null) {
                        textView24 = null;
                    }
                    f4m.q(num15.intValue(), textView24);
                }
            }
            CharSequence charSequence5 = this.I0;
            if (charSequence5 == null || drm0.N(charSequence5)) {
                TextView textView25 = this.m;
                if (textView25 == null) {
                    textView25 = null;
                }
                textView25.setVisibility(8);
                LinearLayout linearLayout13 = this.b;
                if (linearLayout13 == null) {
                    linearLayout13 = null;
                }
                TextView textView26 = this.m;
                if (textView26 == null) {
                    textView26 = null;
                }
                linearLayout13.removeView(textView26);
            } else {
                TextView textView27 = this.m;
                if (textView27 == null) {
                    textView27 = null;
                }
                textView27.setText(this.I0);
                int i10 = this.K0;
                if (i10 > 0) {
                    TextView textView28 = this.m;
                    if (textView28 == null) {
                        textView28 = null;
                    }
                    textView28.setMaxLines(i10);
                    TextView textView29 = this.m;
                    if (textView29 == null) {
                        textView29 = null;
                    }
                    textView29.setEllipsize(TextUtils.TruncateAt.END);
                }
                int i11 = this.L0;
                if (i11 != 1) {
                    TextView textView30 = this.m;
                    if (textView30 == null) {
                        textView30 = null;
                    }
                    textView30.setGravity(i11);
                }
                Integer num16 = this.J0;
                if (num16 != null) {
                    TextView textView31 = this.m;
                    if (textView31 == null) {
                        textView31 = null;
                    }
                    f4m.s(num16.intValue(), textView31);
                    f4m.r(num16.intValue(), textView31);
                }
            }
            CharSequence charSequence6 = this.M0;
            int i12 = a1;
            int i13 = d1;
            if (charSequence6 == null || drm0.N(charSequence6)) {
                TextView textView32 = this.n;
                if (textView32 == null) {
                    textView32 = null;
                }
                textView32.setVisibility(8);
                LinearLayout linearLayout14 = this.b;
                if (linearLayout14 == null) {
                    linearLayout14 = null;
                }
                TextView textView33 = this.n;
                if (textView33 == null) {
                    textView33 = null;
                }
                linearLayout14.removeView(textView33);
            } else {
                TextView textView34 = this.n;
                if (textView34 == null) {
                    textView34 = null;
                }
                textView34.setText(this.M0);
                TextView textView35 = this.n;
                if (textView35 == null) {
                    textView35 = null;
                }
                jjc.f(this.Z0, textView35);
                LinearLayout linearLayout15 = this.c;
                if (linearLayout15 == null) {
                    linearLayout15 = null;
                }
                Integer num17 = this.X0;
                f4m.t(num17 != null ? num17.intValue() : i13, linearLayout15);
                if ((this.O0 == null || this.v == null) && ((this.R0 == null || this.A == null) && this.s == null)) {
                    TextView textView36 = this.n;
                    if (textView36 == null) {
                        textView36 = null;
                    }
                    f4m.q(i12, textView36);
                }
            }
            View view4 = this.c0;
            if (view4 != null) {
                FrameLayout frameLayout4 = this.p;
                if (frameLayout4 == null) {
                    frameLayout4 = null;
                }
                frameLayout4.addView(view4);
                FrameLayout frameLayout5 = this.p;
                if (frameLayout5 == null) {
                    frameLayout5 = null;
                }
                f4m.t(i13, frameLayout5);
                LinearLayout linearLayout16 = this.c;
                if (linearLayout16 == null) {
                    linearLayout16 = null;
                }
                Integer num18 = this.X0;
                f4m.t(num18 != null ? num18.intValue() : i8, linearLayout16);
            } else {
                FrameLayout frameLayout6 = this.p;
                if (frameLayout6 == null) {
                    frameLayout6 = null;
                }
                f4m.j(frameLayout6);
                LinearLayout linearLayout17 = this.b;
                if (linearLayout17 == null) {
                    linearLayout17 = null;
                }
                FrameLayout frameLayout7 = this.p;
                if (frameLayout7 == null) {
                    frameLayout7 = null;
                }
                linearLayout17.removeView(frameLayout7);
            }
            if (this.s != null) {
                RecyclerView recyclerView2 = this.r;
                if (recyclerView2 == null) {
                    recyclerView2 = null;
                }
                recyclerView2.setHasFixedSize(this.v0);
                Integer num19 = this.w0;
                if (num19 == null || num19.intValue() == -1) {
                    num19 = null;
                }
                recyclerView2.setLayoutManager(num19 != null ? new CenterLayoutManager(context) : new LinearLayoutManager(1, false));
                recyclerView2.setItemAnimator(this.u0);
                recyclerView2.setLayoutAnimation(null);
                Iterator it = this.t.iterator();
                while (it.hasNext()) {
                    recyclerView2.addItemDecoration((RecyclerView.n) it.next());
                }
                recyclerView2.setAdapter(this.s);
                recyclerView2.setOverScrollMode(2);
                if (this.I) {
                    ViewGroup viewGroup22 = this.a;
                    if (viewGroup22 == null) {
                        viewGroup22 = null;
                    }
                    Rect rect2 = ywt0.a;
                    viewGroup22.setPadding(0, 0, 0, 0);
                } else {
                    ImageView imageView16 = this.d;
                    if (imageView16 == null) {
                        imageView16 = null;
                    }
                    if (f4m.f(imageView16)) {
                        FrameLayout frameLayout8 = this.g;
                        if (frameLayout8 == null) {
                            frameLayout8 = null;
                        }
                        if (f4m.f(frameLayout8)) {
                            TextView textView37 = this.k;
                            if (textView37 == null) {
                                textView37 = null;
                            }
                            if (f4m.f(textView37)) {
                                TextView textView38 = this.m;
                                if (textView38 == null) {
                                    textView38 = null;
                                }
                                if (f4m.f(textView38)) {
                                    TextView textView39 = this.n;
                                    if (textView39 == null) {
                                        textView39 = null;
                                    }
                                    if (f4m.f(textView39)) {
                                        FrameLayout frameLayout9 = this.p;
                                        if (frameLayout9 == null) {
                                            frameLayout9 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    ViewGroup viewGroup23 = this.a;
                    if (viewGroup23 == null) {
                        viewGroup23 = null;
                    }
                    i12 = viewGroup23.getPaddingTop();
                    int i14 = i12;
                    ViewGroup viewGroup24 = this.a;
                    ywt0.a(viewGroup24 == null ? null : viewGroup24, 0, i14, 0, c1, 5);
                }
                Integer num20 = this.w0;
                if (num20 != null) {
                    int intValue11 = num20.intValue();
                    RecyclerView recyclerView3 = this.r;
                    if (recyclerView3 == null) {
                        recyclerView3 = null;
                    }
                    RecyclerView.o layoutManager = recyclerView3.getLayoutManager();
                    if (layoutManager != null) {
                        RecyclerView recyclerView4 = this.r;
                        if (recyclerView4 == null) {
                            recyclerView4 = null;
                        }
                        layoutManager.smoothScrollToPosition(recyclerView4, null, intValue11);
                        s3q0 s3q0Var14 = s3q0.a;
                    }
                    s3q0 s3q0Var15 = s3q0.a;
                }
            } else {
                RecyclerView recyclerView5 = this.r;
                if (recyclerView5 == null) {
                    recyclerView5 = null;
                }
                recyclerView5.setVisibility(8);
                LinearLayout linearLayout18 = this.b;
                if (linearLayout18 == null) {
                    linearLayout18 = null;
                }
                RecyclerView recyclerView6 = this.r;
                if (recyclerView6 == null) {
                    recyclerView6 = null;
                }
                linearLayout18.removeView(recyclerView6);
                s3q0 s3q0Var16 = s3q0.a;
            }
            if (this.s == null && ((this.O0 == null || this.v == null) && ((this.R0 == null || this.A == null) && (this.M0 == null || this.o == null)))) {
                CharSequence charSequence7 = this.r0;
                if (charSequence7 == null || drm0.N(charSequence7) || !((charSequence = this.I0) == null || drm0.N(charSequence))) {
                    CharSequence charSequence8 = this.I0;
                    if (charSequence8 != null && !drm0.N(charSequence8)) {
                        TextView textView40 = this.m;
                        if (textView40 == null) {
                            textView40 = null;
                        }
                        f4m.q(i8, textView40);
                    }
                } else {
                    TextView textView41 = this.k;
                    if (textView41 == null) {
                        textView41 = null;
                    }
                    f4m.q(i8, textView41);
                }
            }
            if (z) {
                e();
            }
            f();
        }
        int i15 = this.S;
        if (i15 != -1) {
            ViewGroup viewGroup25 = this.a;
            ywt0.a(viewGroup25 == null ? null : viewGroup25, 0, i15, 0, 0, 13);
        }
        int i16 = this.T;
        if (i16 != -1) {
            ViewGroup viewGroup26 = this.a;
            ywt0.a(viewGroup26 == null ? null : viewGroup26, 0, 0, 0, i16, 7);
        }
        int i17 = this.U;
        if (i17 != -1) {
            ViewGroup viewGroup27 = this.a;
            ywt0.a(viewGroup27 == null ? null : viewGroup27, i17, 0, 0, 0, 14);
        }
        int i18 = this.V;
        if (i18 != -1) {
            ViewGroup viewGroup28 = this.a;
            ywt0.a(viewGroup28 == null ? null : viewGroup28, 0, 0, i18, 0, 11);
        }
        izs<? super View, ? extends View> izsVar = this.W;
        ViewGroup viewGroup29 = this.a;
        if (viewGroup29 == null) {
            viewGroup29 = null;
        }
        View invoke = izsVar.invoke(viewGroup29);
        this.X.invoke(invoke);
        LinearLayout linearLayout19 = this.b;
        (linearLayout19 != null ? linearLayout19 : null).setClipToOutline(true);
        return invoke;
    }

    public final void b() {
        MaxWidthFrameLayout maxWidthFrameLayout = this.b0;
        if (maxWidthFrameLayout == null) {
            return;
        }
        ViewParent parent = maxWidthFrameLayout.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeView(maxWidthFrameLayout);
    }

    public final void c() {
        ViewGroup viewGroup = this.a;
        if (viewGroup == null || this.b == null) {
            return;
        }
        if (viewGroup == null) {
            viewGroup = null;
        }
        viewGroup.removeView(this.Y);
        LinearLayout linearLayout = this.b;
        (linearLayout != null ? linearLayout : null).removeView(this.Y);
    }

    public final void d(int i) {
        Pair pair;
        if (i == -5) {
            TextView textView = this.z;
            pair = new Pair(textView != null ? textView : null, this.S0);
        } else if (i == -4) {
            TextView textView2 = this.u;
            pair = new Pair(textView2 != null ? textView2 : null, this.P0);
        } else if (i == -2) {
            TextView textView3 = this.z;
            pair = new Pair(textView3 != null ? textView3 : null, this.R0);
        } else {
            if (i != -1) {
                return;
            }
            TextView textView4 = this.u;
            pair = new Pair(textView4 != null ? textView4 : null, this.O0);
        }
        TextView textView5 = (TextView) pair.d();
        CharSequence charSequence = (CharSequence) pair.g();
        textView5.setTag(Integer.valueOf(i));
        textView5.setText(charSequence);
    }

    public final void e() {
        TextView textView = (TextView) g(R.id.positive_button);
        textView.setTag(-1);
        this.u = textView;
        TextView textView2 = (TextView) g(R.id.negative_button);
        textView2.setTag(-2);
        this.z = textView2;
        int i = 0;
        if (this.N0) {
            View g = g(R.id.buttons_divider);
            LinearLayout linearLayout = this.c;
            if (linearLayout == null) {
                linearLayout = null;
            }
            linearLayout.removeAllViews();
            linearLayout.setOrientation(1);
            TextView textView3 = this.u;
            if (textView3 == null) {
                textView3 = null;
            }
            ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
            layoutParams.width = -1;
            ViewGroup.LayoutParams layoutParams2 = g.getLayoutParams();
            layoutParams2.height = g.getLayoutParams().width;
            layoutParams2.width = 0;
            TextView textView4 = this.u;
            if (textView4 == null) {
                textView4 = null;
            }
            linearLayout.addView(textView4, layoutParams);
            linearLayout.addView(g, layoutParams2);
            TextView textView5 = this.z;
            if (textView5 == null) {
                textView5 = null;
            }
            linearLayout.addView(textView5, layoutParams);
        }
        CharSequence charSequence = this.O0;
        mkc mkcVar = this.Z0;
        if (charSequence == null || drm0.N(charSequence)) {
            TextView textView6 = this.u;
            if (textView6 == null) {
                textView6 = null;
            }
            textView6.setVisibility(8);
        } else {
            TextView textView7 = this.u;
            if (textView7 == null) {
                textView7 = null;
            }
            textView7.setText(this.O0);
            TextView textView8 = this.u;
            if (textView8 == null) {
                textView8 = null;
            }
            textView8.setCompoundDrawablesRelativeWithIntrinsicBounds(this.Q0, (Drawable) null, (Drawable) null, (Drawable) null);
            TextView textView9 = this.u;
            if (textView9 == null) {
                textView9 = null;
            }
            jjc.f(mkcVar, textView9);
            if (this.w != null) {
                TextView textView10 = this.u;
                TextView textView11 = textView10 == null ? null : textView10;
                if (textView10 == null) {
                    textView10 = null;
                }
                textView11.setBackground(m33.a(this.w.intValue(), textView10.getContext()));
            }
            i = 1;
        }
        CharSequence charSequence2 = this.R0;
        if (charSequence2 == null || drm0.N(charSequence2)) {
            TextView textView12 = this.z;
            if (textView12 == null) {
                textView12 = null;
            }
            textView12.setVisibility(8);
        } else {
            TextView textView13 = this.z;
            if (textView13 == null) {
                textView13 = null;
            }
            textView13.setText(this.R0);
            TextView textView14 = this.z;
            if (textView14 == null) {
                textView14 = null;
            }
            textView14.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            TextView textView15 = this.z;
            if (textView15 == null) {
                textView15 = null;
            }
            jjc.f(mkcVar, textView15);
            i |= 2;
            if (this.B != null) {
                TextView textView16 = this.z;
                TextView textView17 = textView16 == null ? null : textView16;
                if (textView16 == null) {
                    textView16 = null;
                }
                textView17.setBackground(m33.a(this.B.intValue(), textView16.getContext()));
            }
        }
        if (i == 1) {
            View g2 = g(R.id.buttons_divider);
            g2.setVisibility(8);
            LinearLayout linearLayout2 = this.c;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            linearLayout2.removeView(g2);
        } else if (i == 2) {
            View g3 = g(R.id.buttons_divider);
            g3.setVisibility(8);
            LinearLayout linearLayout3 = this.c;
            if (linearLayout3 == null) {
                linearLayout3 = null;
            }
            linearLayout3.removeView(g3);
        } else if (i == 0) {
            LinearLayout linearLayout4 = this.c;
            if (linearLayout4 == null) {
                linearLayout4 = null;
            }
            linearLayout4.setVisibility(8);
            ViewGroup viewGroup = this.a;
            if (viewGroup == null) {
                viewGroup = null;
            }
            LinearLayout linearLayout5 = this.c;
            if (linearLayout5 == null) {
                linearLayout5 = null;
            }
            viewGroup.removeView(linearLayout5);
        }
        if (this.J) {
            LinearLayout linearLayout6 = this.c;
            if (linearLayout6 == null) {
                linearLayout6 = null;
            }
            linearLayout6.setVisibility(8);
            ViewGroup viewGroup2 = this.a;
            if (viewGroup2 == null) {
                viewGroup2 = null;
            }
            LinearLayout linearLayout7 = this.c;
            viewGroup2.removeView(linearLayout7 != null ? linearLayout7 : null);
        }
    }

    public final void f() {
        FrameLayout frameLayout = (FrameLayout) g(R.id.custom_bottom_container);
        this.q = frameLayout;
        View view = this.d0;
        if (view != null) {
            frameLayout.addView(view);
            FrameLayout frameLayout2 = this.q;
            (frameLayout2 != null ? frameLayout2 : null).setVisibility(0);
        } else {
            f4m.j(frameLayout);
            ViewGroup viewGroup = this.a;
            if (viewGroup == null) {
                viewGroup = null;
            }
            FrameLayout frameLayout3 = this.q;
            viewGroup.removeView(frameLayout3 != null ? frameLayout3 : null);
        }
    }

    public final <T extends View> T g(int i) {
        ViewGroup viewGroup = this.a;
        if (viewGroup == null) {
            viewGroup = null;
        }
        return (T) viewGroup.findViewById(i);
    }
}
