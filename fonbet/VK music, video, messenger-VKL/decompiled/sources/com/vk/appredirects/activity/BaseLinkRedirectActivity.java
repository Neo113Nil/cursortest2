package com.vk.appredirects.activity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.appredirects.resolver.AppRedirectResult;
import com.vk.core.view.IndeterminateProgressBarWithLogoView;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.aeg0;
import xsna.az;
import xsna.bz;
import xsna.cz;
import xsna.enj;
import xsna.epx;
import xsna.i83;
import xsna.ml1;
import xsna.ro;
import xsna.s3q0;
import xsna.tb0;
import xsna.ver0;

/* compiled from: BaseLinkRedirectActivity.kt */
/* loaded from: classes.dex */
public abstract class BaseLinkRedirectActivity extends AppCompatActivity implements aeg0 {
    public static final /* synthetic */ int g = 0;
    public final ArrayList f = new ArrayList();

    /* compiled from: BaseLinkRedirectActivity.kt */
    /* loaded from: classes15.dex */
    public static abstract class a extends b {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean b(Context context, Intent intent) {
            Cursor query;
            Uri data = intent.getData();
            if (data == null || !HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(data.getScheme()) || (query = context.getContentResolver().query(data, new String[]{"data1", "mimetype"}, null, null, null)) == null || !query.moveToFirst()) {
                return false;
            }
            try {
                boolean f = epx.f(query.getString(query.getColumnIndex("mimetype")), context.getString(this.a));
                query.close();
                return f;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ro.e(query, th);
                    throw th2;
                }
            }
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.b
        public final void d(Context context, Intent intent, Uri uri) {
            Cursor query = context.getContentResolver().query(uri, new String[]{"data1", "mimetype"}, null, null, null);
            if (query == null) {
                return;
            }
            try {
                if (!query.moveToFirst()) {
                    query.close();
                    return;
                }
                e(query.getLong(query.getColumnIndex("data1")), context);
                s3q0 s3q0Var = s3q0.a;
                query.close();
            } finally {
            }
        }

        public abstract void e(long j, Context context);
    }

    /* compiled from: BaseLinkRedirectActivity.kt */
    /* loaded from: classes15.dex */
    public static abstract class b implements c {
        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final boolean a() {
            return true;
        }

        @Override // com.vk.appredirects.activity.BaseLinkRedirectActivity.c
        public final void c(Context context, Intent intent) {
            Uri data = intent.getData();
            if (data != null) {
                d(context, intent, data);
            }
        }

        public abstract void d(Context context, Intent intent, Uri uri);
    }

    /* compiled from: BaseLinkRedirectActivity.kt */
    /* loaded from: classes15.dex */
    public interface c {
        default boolean a() {
            return true;
        }

        boolean b(Context context, Intent intent);

        void c(Context context, Intent intent);
    }

    /* compiled from: BaseLinkRedirectActivity.kt */
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppRedirectResult.values().length];
            try {
                iArr[AppRedirectResult.REDIRECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppRedirectResult.BROWSER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.aeg0
    public final void Li(tb0 tb0Var) {
        this.f.add(tb0Var);
    }

    public abstract List<c> O1();

    public abstract void R1();

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((tb0) it.next()).onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        L.p("LinkRedirectActivity", "OnCreate");
        super.onCreate(bundle);
        if (getIntent() == null) {
            enj.q(R.string.vk_error, 0, this);
            finish();
            return;
        }
        IndeterminateProgressBarWithLogoView indeterminateProgressBarWithLogoView = new IndeterminateProgressBarWithLogoView(this, null, 0, 14, 0);
        setContentView(indeterminateProgressBarWithLogoView);
        int i = 5;
        ver0.a(i83.c(getIntent(), this).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new az(new ml1(2, indeterminateProgressBarWithLogoView, this), i), new cz(new bz(i), 6)));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        R1();
        super.onResume();
    }

    @Override // xsna.aeg0
    public final void yk(tb0 tb0Var) {
        this.f.remove(tb0Var);
    }

    public void Q1() {
    }
}
