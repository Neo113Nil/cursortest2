package com.appsonair.appsync.activities;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.F;
import androidx.activity.OnBackPressedDispatcher;
import com.appsonair.appsync.R;
import com.appsonair.appsync.services.DownloadImageTask;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractActivityC5481c;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/appsonair/appsync/activities/MaintenanceActivity;", "Lm/c;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroidx/activity/F;", "callback", "Landroidx/activity/F;", "appSync_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class MaintenanceActivity extends AbstractActivityC5481c {
    private F callback;

    @Override // androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintenance);
        try {
            Bundle extras = getIntent().getExtras();
            Intrinsics.checkNotNull(extras);
            JSONObject jSONObject = new JSONObject(String.valueOf(extras.getString("res")));
            if (jSONObject.getBoolean("isMaintenance")) {
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_root);
                ImageView imgIcon = (ImageView) findViewById(R.id.img_icon);
                TextView textView = (TextView) findViewById(R.id.txt_title_maintain);
                TextView textView2 = (TextView) findViewById(R.id.txt_des_maintain);
                JSONObject jSONObject2 = jSONObject.getJSONObject("maintenanceData");
                if (!Intrinsics.areEqual(jSONObject2.toString(), "{}")) {
                    String title = jSONObject2.optString("title", "");
                    String description = jSONObject2.optString("description", "");
                    String image = jSONObject2.optString("image", "");
                    String textColorCode = jSONObject2.optString("textColorCode", "");
                    String backgroundColorCode = jSONObject2.optString("backgroundColorCode", "");
                    Intrinsics.checkNotNullExpressionValue(backgroundColorCode, "backgroundColorCode");
                    if (backgroundColorCode.length() > 0) {
                        linearLayout.setBackgroundColor(Color.parseColor(backgroundColorCode));
                    }
                    Intrinsics.checkNotNullExpressionValue(textColorCode, "textColorCode");
                    if (textColorCode.length() > 0) {
                        textView.setTextColor(Color.parseColor(textColorCode));
                        textView2.setTextColor(Color.parseColor(textColorCode));
                    }
                    Intrinsics.checkNotNullExpressionValue(image, "image");
                    if (image.length() > 0) {
                        Intrinsics.checkNotNullExpressionValue(imgIcon, "imgIcon");
                        new DownloadImageTask(imgIcon).execute(image);
                    } else {
                        imgIcon.setVisibility(0);
                    }
                    Intrinsics.checkNotNullExpressionValue(description, "description");
                    if (description.length() > 0) {
                        textView2.setText(description);
                    }
                    Intrinsics.checkNotNullExpressionValue(title, "title");
                    if (title.length() > 0) {
                        textView.setText(title);
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.callback = new F() { // from class: com.appsonair.appsync.activities.MaintenanceActivity$onCreate$1
            @Override // androidx.activity.F
            public void handleOnBackPressed() {
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
