package com.vk.voip.ui.room;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import com.vkontakte.android.FragmentWrapperActivity;
import com.vkontakte.android.R;
import java.util.regex.Pattern;
import kotlin.Pair;
import xsna.dhr0;
import xsna.ln0;
import xsna.yfb;

/* compiled from: AddRoomToCallActivity.kt */
/* loaded from: classes7.dex */
public final class AddRoomToCallActivity extends FragmentWrapperActivity {
    public static final /* synthetic */ int z = 0;

    /* compiled from: AddRoomToCallActivity.kt */
    public static final class a {
        public static Intent a(Context context, String str) {
            Intent intent = new Intent(context, (Class<?>) AddRoomToCallActivity.class);
            intent.putExtra("room_link", str);
            return intent;
        }
    }

    @Override // com.vkontakte.android.FragmentWrapperActivity, com.vk.navigation.NavigationDelegateActivity, android.app.Activity
    public final void finish() {
        overridePendingTransition(0, 0);
        super.finish();
    }

    @Override // com.vkontakte.android.FragmentWrapperActivity, com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Window window = getWindow();
        window.getDecorView().setBackground(null);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setStatusBarColor(dhr0.t.c(R.attr.vk_ui_header_background));
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null || (str = extras.getString("room_link")) == null) {
                str = "";
            }
            Pattern pattern = ln0.h1;
            Bundle b = yfb.b(new Pair("room_link", str));
            ln0 ln0Var = new ln0();
            ln0Var.setArguments(b);
            ln0Var.Td(getSupportFragmentManager(), null);
        }
    }
}
