package com.yalantis.ucrop;

import L2.AbstractC1388m;
import L2.C1376a;
import L2.v;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.yalantis.ucrop.model.AspectRatio;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import com.yalantis.ucrop.view.b;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import gd.InterfaceC4376a;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jd.i;
import l0.AbstractC5338c;
import m.AbstractActivityC5481c;
import m.AbstractC5479a;
import m.AbstractC5484f;

/* loaded from: classes4.dex */
public class UCropActivity extends AbstractActivityC5481c {

    /* renamed from: I, reason: collision with root package name */
    public static final Bitmap.CompressFormat f42238I = Bitmap.CompressFormat.JPEG;

    /* renamed from: A, reason: collision with root package name */
    public TextView f42239A;

    /* renamed from: B, reason: collision with root package name */
    public TextView f42240B;

    /* renamed from: C, reason: collision with root package name */
    public View f42241C;

    /* renamed from: D, reason: collision with root package name */
    public AbstractC1388m f42242D;

    /* renamed from: f, reason: collision with root package name */
    public String f42247f;

    /* renamed from: g, reason: collision with root package name */
    public int f42248g;

    /* renamed from: h, reason: collision with root package name */
    public int f42249h;

    /* renamed from: i, reason: collision with root package name */
    public int f42250i;

    /* renamed from: j, reason: collision with root package name */
    public int f42251j;

    /* renamed from: k, reason: collision with root package name */
    public int f42252k;

    /* renamed from: l, reason: collision with root package name */
    public int f42253l;

    /* renamed from: m, reason: collision with root package name */
    public int f42254m;

    /* renamed from: n, reason: collision with root package name */
    public int f42255n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f42256o;

    /* renamed from: q, reason: collision with root package name */
    public UCropView f42258q;

    /* renamed from: r, reason: collision with root package name */
    public GestureCropImageView f42259r;

    /* renamed from: s, reason: collision with root package name */
    public OverlayView f42260s;

    /* renamed from: t, reason: collision with root package name */
    public ViewGroup f42261t;

    /* renamed from: u, reason: collision with root package name */
    public ViewGroup f42262u;

    /* renamed from: v, reason: collision with root package name */
    public ViewGroup f42263v;

    /* renamed from: w, reason: collision with root package name */
    public ViewGroup f42264w;

    /* renamed from: x, reason: collision with root package name */
    public ViewGroup f42265x;

    /* renamed from: y, reason: collision with root package name */
    public ViewGroup f42266y;

    /* renamed from: p, reason: collision with root package name */
    public boolean f42257p = true;

    /* renamed from: z, reason: collision with root package name */
    public List f42267z = new ArrayList();

    /* renamed from: E, reason: collision with root package name */
    public Bitmap.CompressFormat f42243E = f42238I;

    /* renamed from: F, reason: collision with root package name */
    public int f42244F = 90;
    private int[] mAllowedGestures = {1, 2, 3};

    /* renamed from: G, reason: collision with root package name */
    public b.InterfaceC0604b f42245G = new a();

    /* renamed from: H, reason: collision with root package name */
    public final View.OnClickListener f42246H = new g();

    public class a implements b.InterfaceC0604b {
        public a() {
        }

        @Override // com.yalantis.ucrop.view.b.InterfaceC0604b
        public void a() {
            UCropActivity.this.f42258q.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator());
            UCropActivity.this.f42241C.setClickable(false);
            UCropActivity.this.f42257p = false;
            UCropActivity.this.supportInvalidateOptionsMenu();
        }

        @Override // com.yalantis.ucrop.view.b.InterfaceC0604b
        public void b(Exception exc) {
            UCropActivity.this.X(exc);
            UCropActivity.this.finish();
        }

        @Override // com.yalantis.ucrop.view.b.InterfaceC0604b
        public void c(float f10) {
            UCropActivity.this.Z(f10);
        }

        @Override // com.yalantis.ucrop.view.b.InterfaceC0604b
        public void d(float f10) {
            UCropActivity.this.T(f10);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UCropActivity.this.f42259r.setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view).getChildAt(0)).g(view.isSelected()));
            UCropActivity.this.f42259r.B();
            if (view.isSelected()) {
                return;
            }
            for (ViewGroup viewGroup : UCropActivity.this.f42267z) {
                viewGroup.setSelected(viewGroup == view);
            }
        }
    }

    public class c implements HorizontalProgressWheelView.a {
        public c() {
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void a() {
            UCropActivity.this.f42259r.B();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void b() {
            UCropActivity.this.f42259r.v();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void c(float f10, float f11) {
            UCropActivity.this.f42259r.z(f10 / 42.0f);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UCropActivity.this.Q();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UCropActivity.this.R(90);
        }
    }

    public class f implements HorizontalProgressWheelView.a {
        public f() {
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void a() {
            UCropActivity.this.f42259r.B();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void b() {
            UCropActivity.this.f42259r.v();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void c(float f10, float f11) {
            if (f10 > 0.0f) {
                UCropActivity.this.f42259r.E(UCropActivity.this.f42259r.getCurrentScale() + (f10 * ((UCropActivity.this.f42259r.getMaxScale() - UCropActivity.this.f42259r.getMinScale()) / 15000.0f)));
            } else {
                UCropActivity.this.f42259r.G(UCropActivity.this.f42259r.getCurrentScale() + (f10 * ((UCropActivity.this.f42259r.getMaxScale() - UCropActivity.this.f42259r.getMinScale()) / 15000.0f)));
            }
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.isSelected()) {
                return;
            }
            UCropActivity.this.c0(view.getId());
        }
    }

    public class h implements InterfaceC4376a {
        public h() {
        }

        @Override // gd.InterfaceC4376a
        public void a(Uri uri, int i10, int i11, int i12, int i13) {
            UCropActivity uCropActivity = UCropActivity.this;
            uCropActivity.Y(uri, uCropActivity.f42259r.getTargetAspectRatio(), i10, i11, i12, i13);
            UCropActivity.this.finish();
        }

        @Override // gd.InterfaceC4376a
        public void b(Throwable th2) {
            UCropActivity.this.X(th2);
            UCropActivity.this.finish();
        }
    }

    static {
        AbstractC5484f.J(true);
    }

    public final void K() {
        if (this.f42241C == null) {
            this.f42241C = new View(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(3, fd.e.f46651t);
            this.f42241C.setLayoutParams(layoutParams);
            this.f42241C.setClickable(true);
        }
        ((RelativeLayout) findViewById(fd.e.f46655x)).addView(this.f42241C);
    }

    public final void L(int i10) {
        v.a((ViewGroup) findViewById(fd.e.f46655x), this.f42242D);
        this.f42263v.findViewById(fd.e.f46650s).setVisibility(i10 == fd.e.f46647p ? 0 : 8);
        this.f42261t.findViewById(fd.e.f46648q).setVisibility(i10 == fd.e.f46645n ? 0 : 8);
        this.f42262u.findViewById(fd.e.f46649r).setVisibility(i10 == fd.e.f46646o ? 0 : 8);
    }

    public void M() {
        this.f42241C.setClickable(true);
        this.f42257p = true;
        supportInvalidateOptionsMenu();
        this.f42259r.w(this.f42243E, this.f42244F, new h());
    }

    public final void O() {
        UCropView uCropView = (UCropView) findViewById(fd.e.f46653v);
        this.f42258q = uCropView;
        this.f42259r = uCropView.getCropImageView();
        this.f42260s = this.f42258q.getOverlayView();
        this.f42259r.setTransformImageListener(this.f42245G);
        ((ImageView) findViewById(fd.e.f46634c)).setColorFilter(this.f42255n, PorterDuff.Mode.SRC_ATOP);
        findViewById(fd.e.f46654w).setBackgroundColor(this.f42252k);
        if (this.f42256o) {
            return;
        }
        ((RelativeLayout.LayoutParams) findViewById(fd.e.f46654w).getLayoutParams()).bottomMargin = 0;
        findViewById(fd.e.f46654w).requestLayout();
    }

    public final void P(Intent intent) {
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.CompressionFormatName");
        Bitmap.CompressFormat valueOf = !TextUtils.isEmpty(stringExtra) ? Bitmap.CompressFormat.valueOf(stringExtra) : null;
        if (valueOf == null) {
            valueOf = f42238I;
        }
        this.f42243E = valueOf;
        this.f42244F = intent.getIntExtra("com.yalantis.ucrop.CompressionQuality", 90);
        int[] intArrayExtra = intent.getIntArrayExtra("com.yalantis.ucrop.AllowedGestures");
        if (intArrayExtra != null && intArrayExtra.length == 3) {
            this.mAllowedGestures = intArrayExtra;
        }
        this.f42259r.setMaxBitmapSize(intent.getIntExtra("com.yalantis.ucrop.MaxBitmapSize", 0));
        this.f42259r.setMaxScaleMultiplier(intent.getFloatExtra("com.yalantis.ucrop.MaxScaleMultiplier", 10.0f));
        this.f42259r.setImageToWrapCropBoundsAnimDuration(intent.getIntExtra("com.yalantis.ucrop.ImageToCropBoundsAnimDuration", FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION));
        this.f42260s.setFreestyleCropEnabled(intent.getBooleanExtra("com.yalantis.ucrop.FreeStyleCrop", false));
        this.f42260s.setDimmedColor(intent.getIntExtra("com.yalantis.ucrop.DimmedLayerColor", getResources().getColor(fd.b.f46610e)));
        this.f42260s.setCircleDimmedLayer(intent.getBooleanExtra("com.yalantis.ucrop.CircleDimmedLayer", false));
        this.f42260s.setShowCropFrame(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropFrame", true));
        this.f42260s.setCropFrameColor(intent.getIntExtra("com.yalantis.ucrop.CropFrameColor", getResources().getColor(fd.b.f46608c)));
        this.f42260s.setCropFrameStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropFrameStrokeWidth", getResources().getDimensionPixelSize(fd.c.f46619a)));
        this.f42260s.setShowCropGrid(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropGrid", true));
        this.f42260s.setCropGridRowCount(intent.getIntExtra("com.yalantis.ucrop.CropGridRowCount", 2));
        this.f42260s.setCropGridColumnCount(intent.getIntExtra("com.yalantis.ucrop.CropGridColumnCount", 2));
        this.f42260s.setCropGridColor(intent.getIntExtra("com.yalantis.ucrop.CropGridColor", getResources().getColor(fd.b.f46609d)));
        this.f42260s.setCropGridStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropGridStrokeWidth", getResources().getDimensionPixelSize(fd.c.f46620b)));
        float floatExtra = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioX", -1.0f);
        float floatExtra2 = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioY", -1.0f);
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (floatExtra >= 0.0f && floatExtra2 >= 0.0f) {
            ViewGroup viewGroup = this.f42261t;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            float f10 = floatExtra / floatExtra2;
            this.f42259r.setTargetAspectRatio(Float.isNaN(f10) ? 0.0f : f10);
        } else if (parcelableArrayListExtra == null || intExtra >= parcelableArrayListExtra.size()) {
            this.f42259r.setTargetAspectRatio(0.0f);
        } else {
            float b10 = ((AspectRatio) parcelableArrayListExtra.get(intExtra)).b() / ((AspectRatio) parcelableArrayListExtra.get(intExtra)).c();
            this.f42259r.setTargetAspectRatio(Float.isNaN(b10) ? 0.0f : b10);
        }
        int intExtra2 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeX", 0);
        int intExtra3 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeY", 0);
        if (intExtra2 <= 0 || intExtra3 <= 0) {
            return;
        }
        this.f42259r.setMaxResultImageSizeX(intExtra2);
        this.f42259r.setMaxResultImageSizeY(intExtra3);
    }

    public final void Q() {
        GestureCropImageView gestureCropImageView = this.f42259r;
        gestureCropImageView.z(-gestureCropImageView.getCurrentAngle());
        this.f42259r.B();
    }

    public final void R(int i10) {
        this.f42259r.z(i10);
        this.f42259r.B();
    }

    public final void S(int i10) {
        GestureCropImageView gestureCropImageView = this.f42259r;
        int i11 = this.mAllowedGestures[i10];
        gestureCropImageView.setScaleEnabled(i11 == 3 || i11 == 1);
        GestureCropImageView gestureCropImageView2 = this.f42259r;
        int i12 = this.mAllowedGestures[i10];
        gestureCropImageView2.setRotateEnabled(i12 == 3 || i12 == 2);
    }

    public final void T(float f10) {
        TextView textView = this.f42239A;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(f10)));
        }
    }

    public final void U(int i10) {
        TextView textView = this.f42239A;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    public final void V(Intent intent) {
        Uri uri = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.InputUri");
        Uri uri2 = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
        P(intent);
        if (uri == null || uri2 == null) {
            X(new NullPointerException(getString(fd.h.f46663a)));
            finish();
            return;
        }
        try {
            this.f42259r.p(uri, uri2);
        } catch (Exception e10) {
            X(e10);
            finish();
        }
    }

    public final void W() {
        if (!this.f42256o) {
            S(0);
        } else if (this.f42261t.getVisibility() == 0) {
            c0(fd.e.f46645n);
        } else {
            c0(fd.e.f46647p);
        }
    }

    public void X(Throwable th2) {
        setResult(96, new Intent().putExtra("com.yalantis.ucrop.Error", th2));
    }

    public void Y(Uri uri, float f10, int i10, int i11, int i12, int i13) {
        setResult(-1, new Intent().putExtra("com.yalantis.ucrop.OutputUri", uri).putExtra("com.yalantis.ucrop.CropAspectRatio", f10).putExtra("com.yalantis.ucrop.ImageWidth", i12).putExtra("com.yalantis.ucrop.ImageHeight", i13).putExtra("com.yalantis.ucrop.OffsetX", i10).putExtra("com.yalantis.ucrop.OffsetY", i11));
    }

    public final void Z(float f10) {
        TextView textView = this.f42240B;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf((int) (f10 * 100.0f))));
        }
    }

    public final void a0(int i10) {
        TextView textView = this.f42240B;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    public final void b0(int i10) {
        Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i10);
        }
    }

    public final void c0(int i10) {
        if (this.f42256o) {
            this.f42261t.setSelected(i10 == fd.e.f46645n);
            this.f42262u.setSelected(i10 == fd.e.f46646o);
            this.f42263v.setSelected(i10 == fd.e.f46647p);
            this.f42264w.setVisibility(i10 == fd.e.f46645n ? 0 : 8);
            this.f42265x.setVisibility(i10 == fd.e.f46646o ? 0 : 8);
            this.f42266y.setVisibility(i10 == fd.e.f46647p ? 0 : 8);
            L(i10);
            if (i10 == fd.e.f46647p) {
                S(0);
            } else if (i10 == fd.e.f46646o) {
                S(1);
            } else {
                S(2);
            }
        }
    }

    public final void d0() {
        b0(this.f42249h);
        Toolbar toolbar = (Toolbar) findViewById(fd.e.f46651t);
        toolbar.setBackgroundColor(this.f42248g);
        toolbar.setTitleTextColor(this.f42251j);
        TextView textView = (TextView) toolbar.findViewById(fd.e.f46652u);
        textView.setTextColor(this.f42251j);
        textView.setText(this.f42247f);
        Drawable mutate = AbstractC5338c.getDrawable(this, this.f42253l).mutate();
        mutate.setColorFilter(this.f42251j, PorterDuff.Mode.SRC_ATOP);
        toolbar.setNavigationIcon(mutate);
        setSupportActionBar(toolbar);
        AbstractC5479a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.v(false);
        }
    }

    public final void e0(Intent intent) {
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            parcelableArrayListExtra = new ArrayList();
            parcelableArrayListExtra.add(new AspectRatio(null, 1.0f, 1.0f));
            parcelableArrayListExtra.add(new AspectRatio(null, 3.0f, 4.0f));
            parcelableArrayListExtra.add(new AspectRatio(getString(fd.h.f46665c).toUpperCase(), 0.0f, 0.0f));
            parcelableArrayListExtra.add(new AspectRatio(null, 3.0f, 2.0f));
            parcelableArrayListExtra.add(new AspectRatio(null, 16.0f, 9.0f));
            intExtra = 2;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(fd.e.f46638g);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            AspectRatio aspectRatio = (AspectRatio) it.next();
            FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(fd.f.f46659b, (ViewGroup) null);
            frameLayout.setLayoutParams(layoutParams);
            AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
            aspectRatioTextView.setActiveColor(this.f42250i);
            aspectRatioTextView.setAspectRatio(aspectRatio);
            linearLayout.addView(frameLayout);
            this.f42267z.add(frameLayout);
        }
        ((ViewGroup) this.f42267z.get(intExtra)).setSelected(true);
        Iterator it2 = this.f42267z.iterator();
        while (it2.hasNext()) {
            ((ViewGroup) it2.next()).setOnClickListener(new b());
        }
    }

    public final void f0() {
        this.f42239A = (TextView) findViewById(fd.e.f46649r);
        ((HorizontalProgressWheelView) findViewById(fd.e.f46643l)).setScrollingListener(new c());
        ((HorizontalProgressWheelView) findViewById(fd.e.f46643l)).setMiddleLineColor(this.f42250i);
        findViewById(fd.e.f46657z).setOnClickListener(new d());
        findViewById(fd.e.f46631A).setOnClickListener(new e());
        U(this.f42250i);
    }

    public final void g0() {
        this.f42240B = (TextView) findViewById(fd.e.f46650s);
        ((HorizontalProgressWheelView) findViewById(fd.e.f46644m)).setScrollingListener(new f());
        ((HorizontalProgressWheelView) findViewById(fd.e.f46644m)).setMiddleLineColor(this.f42250i);
        a0(this.f42250i);
    }

    public final void h0() {
        ImageView imageView = (ImageView) findViewById(fd.e.f46637f);
        ImageView imageView2 = (ImageView) findViewById(fd.e.f46636e);
        ImageView imageView3 = (ImageView) findViewById(fd.e.f46635d);
        imageView.setImageDrawable(new i(imageView.getDrawable(), this.f42250i));
        imageView2.setImageDrawable(new i(imageView2.getDrawable(), this.f42250i));
        imageView3.setImageDrawable(new i(imageView3.getDrawable(), this.f42250i));
    }

    public final void i0(Intent intent) {
        this.f42249h = intent.getIntExtra("com.yalantis.ucrop.StatusBarColor", AbstractC5338c.getColor(this, fd.b.f46613h));
        this.f42248g = intent.getIntExtra("com.yalantis.ucrop.ToolbarColor", AbstractC5338c.getColor(this, fd.b.f46614i));
        this.f42250i = intent.getIntExtra("com.yalantis.ucrop.UcropColorControlsWidgetActive", AbstractC5338c.getColor(this, fd.b.f46606a));
        this.f42251j = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarWidgetColor", AbstractC5338c.getColor(this, fd.b.f46615j));
        this.f42253l = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCancelDrawable", fd.d.f46629a);
        this.f42254m = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCropDrawable", fd.d.f46630b);
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.UcropToolbarTitleText");
        this.f42247f = stringExtra;
        if (stringExtra == null) {
            stringExtra = getResources().getString(fd.h.f46664b);
        }
        this.f42247f = stringExtra;
        this.f42255n = intent.getIntExtra("com.yalantis.ucrop.UcropLogoColor", AbstractC5338c.getColor(this, fd.b.f46611f));
        this.f42256o = !intent.getBooleanExtra("com.yalantis.ucrop.HideBottomControls", false);
        this.f42252k = intent.getIntExtra("com.yalantis.ucrop.UcropRootViewBackgroundColor", AbstractC5338c.getColor(this, fd.b.f46607b));
        d0();
        O();
        if (this.f42256o) {
            ViewGroup viewGroup = (ViewGroup) ((ViewGroup) findViewById(fd.e.f46655x)).findViewById(fd.e.f46632a);
            viewGroup.setVisibility(0);
            LayoutInflater.from(this).inflate(fd.f.f46660c, viewGroup, true);
            C1376a c1376a = new C1376a();
            this.f42242D = c1376a;
            c1376a.h0(50L);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(fd.e.f46645n);
            this.f42261t = viewGroup2;
            viewGroup2.setOnClickListener(this.f42246H);
            ViewGroup viewGroup3 = (ViewGroup) findViewById(fd.e.f46646o);
            this.f42262u = viewGroup3;
            viewGroup3.setOnClickListener(this.f42246H);
            ViewGroup viewGroup4 = (ViewGroup) findViewById(fd.e.f46647p);
            this.f42263v = viewGroup4;
            viewGroup4.setOnClickListener(this.f42246H);
            this.f42264w = (ViewGroup) findViewById(fd.e.f46638g);
            this.f42265x = (ViewGroup) findViewById(fd.e.f46639h);
            this.f42266y = (ViewGroup) findViewById(fd.e.f46640i);
            e0(intent);
            f0();
            g0();
            h0();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(fd.f.f46658a);
        Intent intent = getIntent();
        i0(intent);
        V(intent);
        W();
        K();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(fd.g.f46662a, menu);
        MenuItem findItem = menu.findItem(fd.e.f46642k);
        Drawable icon = findItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(this.f42251j, PorterDuff.Mode.SRC_ATOP);
                findItem.setIcon(icon);
            } catch (IllegalStateException e10) {
                Log.i("UCropActivity", String.format("%s - %s", e10.getMessage(), getString(fd.h.f46666d)));
            }
            ((Animatable) findItem.getIcon()).start();
        }
        MenuItem findItem2 = menu.findItem(fd.e.f46641j);
        Drawable drawable = AbstractC5338c.getDrawable(this, this.f42254m);
        if (drawable == null) {
            return true;
        }
        drawable.mutate();
        drawable.setColorFilter(this.f42251j, PorterDuff.Mode.SRC_ATOP);
        findItem2.setIcon(drawable);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == fd.e.f46641j) {
            M();
            return true;
        }
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(fd.e.f46641j).setVisible(!this.f42257p);
        menu.findItem(fd.e.f46642k).setVisible(this.f42257p);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // m.AbstractActivityC5481c, androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public void onStop() {
        super.onStop();
        GestureCropImageView gestureCropImageView = this.f42259r;
        if (gestureCropImageView != null) {
            gestureCropImageView.v();
        }
    }
}
