package com.appsonair.appsync.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.F;
import androidx.activity.OnBackPressedDispatcher;
import com.appsonair.appsync.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractActivityC5481c;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0015¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/appsonair/appsync/activities/AppUpdateActivity;", "Lm/c;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "activityClose", "Z", "Landroidx/activity/F;", "callback", "Landroidx/activity/F;", "appSync_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AppUpdateActivity extends AbstractActivityC5481c {
    private boolean activityClose;
    private F callback;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-1, reason: not valid java name */
    public static final void m59onCreate$lambda1(AppUpdateActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.activityClose = true;
        F f10 = this$0.callback;
        F f11 = null;
        if (f10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            f10 = null;
        }
        f10.setEnabled(true);
        F f12 = this$0.callback;
        if (f12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
        } else {
            f11 = f12;
        }
        f11.handleOnBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-2, reason: not valid java name */
    public static final void m60onCreate$lambda2(String str, AppUpdateActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    @SuppressLint({"NewApi", "DiscouragedApi"})
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_update);
        try {
            ApplicationInfo applicationInfo = getPackageManager().getApplicationInfo(getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "packageManager.getApplic…ageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            ApplicationInfo applicationInfo2 = getPackageManager().getApplicationInfo(getPackageName(), 0);
            Intrinsics.checkNotNullExpressionValue(applicationInfo2, "packageManager.getApplicationInfo(packageName, 0)");
            CharSequence applicationLabel = getPackageManager().getApplicationLabel(applicationInfo2);
            Intrinsics.checkNotNull(applicationLabel, "null cannot be cast to non-null type kotlin.String");
            String str = (String) applicationLabel;
            int i10 = bundle != null ? bundle.getInt("com.appsonair.icon") : 0;
            Bundle extras = getIntent().getExtras();
            Intrinsics.checkNotNull(extras);
            String string = extras.getString("res");
            JSONObject jSONObject = new JSONObject(String.valueOf(string));
            if (jSONObject.isNull(string)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("updateData");
                boolean z10 = jSONObject2.getBoolean("isAndroidForcedUpdate");
                boolean z11 = jSONObject2.getBoolean("isAndroidUpdate");
                String string2 = jSONObject2.getString("androidBuildNumber");
                final String string3 = jSONObject2.getString("androidUpdateLink");
                boolean z12 = getApplicationContext().getPackageManager().getPackageInfo(getPackageName(), 0).versionCode < (string2 != null ? Integer.parseInt(string2) : 0);
                ImageView imageView = (ImageView) findViewById(R.id.img_icon);
                if ((z10 || z11) && z12) {
                    TextView textView = (TextView) findViewById(R.id.txt_title);
                    TextView textView2 = (TextView) findViewById(R.id.txt_des);
                    TextView textView3 = (TextView) findViewById(R.id.txt_no_thanks);
                    TextView textView4 = (TextView) findViewById(R.id.btn_update);
                    if (i10 != 0) {
                        imageView.setVisibility(0);
                        imageView.setImageResource(i10);
                    }
                    String str2 = str + " " + getString(R.string.update_title);
                    Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder().apply(builderAction).toString()");
                    textView.setText(str2);
                    if (z10) {
                        textView3.setVisibility(8);
                        textView2.setText(getString(R.string.update_force_dsc));
                    } else {
                        textView3.setVisibility(0);
                        textView2.setText(getString(R.string.update_dsc, str));
                        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.appsonair.appsync.activities.a
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                AppUpdateActivity.m59onCreate$lambda1(AppUpdateActivity.this, view);
                            }
                        });
                    }
                    textView4.setOnClickListener(new View.OnClickListener() { // from class: com.appsonair.appsync.activities.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            AppUpdateActivity.m60onCreate$lambda2(string3, this, view);
                        }
                    });
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        this.callback = new F() { // from class: com.appsonair.appsync.activities.AppUpdateActivity$onCreate$4
            {
                super(true);
            }

            @Override // androidx.activity.F
            public void handleOnBackPressed() {
                boolean z13;
                z13 = AppUpdateActivity.this.activityClose;
                if (z13) {
                    AppUpdateActivity.this.finish();
                }
            }
        };
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        F f10 = this.callback;
        if (f10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            f10 = null;
        }
        onBackPressedDispatcher.i(this, f10);
    }
}
