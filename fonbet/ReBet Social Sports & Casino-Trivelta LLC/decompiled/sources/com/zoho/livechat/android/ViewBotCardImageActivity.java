package com.zoho.livechat.android;

import a1.C1908a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.SpannableString;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.k;
import androidx.core.view.AbstractC2109r0;
import androidx.core.view.F0;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import com.zoho.livechat.android.ViewBotCardImageActivity;
import com.zoho.livechat.android.ui.customviews.ZoomableImageView;
import com.zoho.livechat.android.utils.CustomTypefaceSpan;
import io.agora.rtc2.internal.AudioRoutingController;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import l0.AbstractC5338c;
import od.AbstractC5886l;
import od.n;
import od.q;
import od.r;
import od.s;
import od.t;
import og.AbstractC5889a;
import og.AbstractC5892d;
import og.j;
import rd.C6218a;
import wd.d;

/* loaded from: classes4.dex */
public class ViewBotCardImageActivity extends Yf.c {

    /* renamed from: l, reason: collision with root package name */
    public static String f42438l = "";

    /* renamed from: m, reason: collision with root package name */
    public static String f42439m = "";

    /* renamed from: n, reason: collision with root package name */
    public static String f42440n = "";

    /* renamed from: o, reason: collision with root package name */
    public static String f42441o = "";

    /* renamed from: p, reason: collision with root package name */
    public static long f42442p;

    /* renamed from: g, reason: collision with root package name */
    public FrameLayout f42443g;

    /* renamed from: h, reason: collision with root package name */
    public View f42444h;

    /* renamed from: i, reason: collision with root package name */
    public Toolbar f42445i;

    /* renamed from: j, reason: collision with root package name */
    public ZoomableImageView f42446j;

    /* renamed from: k, reason: collision with root package name */
    public BroadcastReceiver f42447k = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewBotCardImageActivity.this.onBackPressed();
        }
    }

    public class b implements Toolbar.h {
        public b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (menuItem.getItemId() == q.f60379S) {
                File file = new File(Environment.getExternalStorageDirectory(), "/Mobilisten/Mobilisten Images");
                if (!file.exists()) {
                    file.mkdirs();
                }
                d.R(ViewBotCardImageActivity.this, ViewBotCardImageActivity.f42440n, ViewBotCardImageActivity.f42439m);
                return false;
            }
            if (menuItem.getItemId() != q.f60556j) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                d.M(ViewBotCardImageActivity.this, ViewBotCardImageActivity.f42439m, ViewBotCardImageActivity.f42440n);
                return false;
            }
            if (AbstractC5338c.checkSelfPermission(ViewBotCardImageActivity.this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                ViewBotCardImageActivity.this.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, FaceShapeAreaOptions.FACE_SHAPE_AREA_MOUTHPOSITION);
                return false;
            }
            d.M(ViewBotCardImageActivity.this, ViewBotCardImageActivity.f42439m, ViewBotCardImageActivity.f42440n);
            return false;
        }
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (ViewBotCardImageActivity.this.f42445i.getVisibility() == 0) {
                AbstractC5889a.a(ViewBotCardImageActivity.this, false);
                ViewBotCardImageActivity.this.f42445i.setVisibility(4);
            } else {
                AbstractC5889a.a(ViewBotCardImageActivity.this, true);
                ViewBotCardImageActivity.this.f42445i.setVisibility(0);
            }
        }
    }

    public static /* synthetic */ void F(ViewBotCardImageActivity viewBotCardImageActivity) {
        viewBotCardImageActivity.getClass();
        Rect rect = new Rect();
        viewBotCardImageActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i10 = rect.top;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewBotCardImageActivity.f42445i.getLayoutParams();
        marginLayoutParams.topMargin = i10;
        viewBotCardImageActivity.f42445i.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewBotCardImageActivity.f42444h.getLayoutParams();
        marginLayoutParams2.height = i10;
        viewBotCardImageActivity.f42444h.setLayoutParams(marginLayoutParams2);
    }

    @Override // Yf.c
    public void E(F0 f02) {
        super.E(f02);
        if (getWindow() != null) {
            AbstractC2109r0.a(getWindow(), getWindow().getDecorView()).e(false);
        }
    }

    public final Calendar K(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    public final BroadcastReceiver L() {
        return new c();
    }

    public String M(Long l10) {
        Calendar K10 = K(Calendar.getInstance());
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -1);
        return l10.longValue() > K10.getTimeInMillis() ? getResources().getString(t.f60899M) : l10.longValue() > K(calendar).getTimeInMillis() ? getResources().getString(t.f60905N) : O(l10);
    }

    public String O(Long l10) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
        int i10 = simpleDateFormat.getCalendar().get(1);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy");
        simpleDateFormat2.format(l10);
        return (i10 == simpleDateFormat2.getCalendar().get(1) ? new SimpleDateFormat("MMM dd") : new SimpleDateFormat("MMM dd, yy")).format(l10);
    }

    @Override // Yf.c
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public FrameLayout D() {
        return this.f42443g;
    }

    @Override // Yf.c, androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = Build.VERSION.SDK_INT;
        getWindow().addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().addFlags(134217728);
        if (this.f42447k == null) {
            this.f42447k = L();
        }
        setContentView(r.f60790j);
        this.f42443g = (FrameLayout) findViewById(q.f60535g9);
        this.f42445i = (Toolbar) findViewById(q.f60492d);
        this.f42444h = findViewById(q.f60542h5);
        setSupportActionBar(this.f42445i);
        A();
        this.f42446j = (ZoomableImageView) findViewById(q.f60503e);
        if (i10 >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        getWindow().getDecorView().setSystemUiVisibility(3328);
        this.f42445i.post(new Runnable() { // from class: od.A
            @Override // java.lang.Runnable
            public final void run() {
                ViewBotCardImageActivity.F(ViewBotCardImageActivity.this);
            }
        });
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            f42438l = extras.getString("IMAGEDNAME");
            f42442p = extras.getLong("IMAGETIME");
            f42439m = extras.getString("IMAGEURI");
            f42441o = extras.getString("IMAGEID");
            String string = extras.getString(StackTraceHelper.ID_KEY);
            int i11 = extras.getInt(ViewProps.POSITION);
            if (string != null) {
                f42440n = string + i11 + "";
            } else {
                f42440n = f42441o;
            }
            d.H(this.f42446j, f42439m, null, true, false, null, Integer.valueOf(k.d(getResources(), n.f59933m, getBaseContext().getTheme())));
        }
        this.f42445i.setNavigationOnClickListener(new a());
        this.f42445i.post(new Runnable() { // from class: od.B
            @Override // java.lang.Runnable
            public final void run() {
                ViewBotCardImageActivity.this.f42445i.setTitle(ViewBotCardImageActivity.f42438l);
            }
        });
        og.n.c(this.f42445i, M(Long.valueOf(f42442p)) + ", " + j.a(f42442p));
        Context j10 = AbstractC5892d.j(getBaseContext());
        if (this.f42445i.getNavigationIcon() != null) {
            this.f42445i.getNavigationIcon().setColorFilter(AbstractC5892d.f(j10, Integer.valueOf(AbstractC5886l.f59877q2)), PorterDuff.Mode.SRC_ATOP);
        }
        if (this.f42445i.getOverflowIcon() != null) {
            Drawable f10 = k.f(getResources(), AbstractC5892d.l(j10, AbstractC5886l.f59881r2), getTheme());
            if (f10 != null) {
                this.f42445i.setOverflowIcon(f10);
            }
            this.f42445i.getOverflowIcon().setColorFilter(AbstractC5892d.f(j10, Integer.valueOf(AbstractC5886l.f59885s2)), PorterDuff.Mode.SRC_ATOP);
        }
        this.f42445i.setOnMenuItemClickListener(new b());
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(s.f60825b, menu);
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan(C6218a.P());
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = menu.getItem(i10);
            SpannableString spannableString = new SpannableString(item.getItemId() == q.f60379S ? getBaseContext().getString(t.f61115t1) : item.getItemId() == q.f60556j ? getBaseContext().getString(t.f61068m0) : null);
            spannableString.setSpan(customTypefaceSpan, 0, spannableString.length(), 33);
            item.setTitle(spannableString);
        }
        return false;
    }

    @Override // m.AbstractActivityC5481c, androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 0;
        }
    }

    @Override // Yf.c, androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public void onPause() {
        super.onPause();
        C1908a.b(this).e(this.f42447k);
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == 401) {
            if (iArr[0] == 0) {
                d.M(this, f42439m, f42440n);
            } else {
                Toast.makeText(this, getResources().getString(t.f60859F1), 0).show();
            }
        }
    }

    @Override // Yf.c, androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public void onResume() {
        super.onResume();
        C1908a.b(this).c(this.f42447k, new IntentFilter("201"));
    }
}
