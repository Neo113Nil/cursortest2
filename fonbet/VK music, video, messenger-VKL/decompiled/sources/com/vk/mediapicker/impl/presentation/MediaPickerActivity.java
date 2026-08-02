package com.vk.mediapicker.impl.presentation;

import android.os.Bundle;
import android.util.TypedValue;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.vk.core.activity.BaseActivity;
import com.vk.mediapicker.api.models.MediaPickerFragmentArguments;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.krv0;
import xsna.msy;
import xsna.ou10;
import xsna.u210;
import xsna.zj0;

/* compiled from: MediaPickerActivity.kt */
/* loaded from: classes3.dex */
public final class MediaPickerActivity extends BaseActivity {
    public static final /* synthetic */ int h = 0;
    public final Object g = msy.a(LazyThreadSafetyMode.NONE, new u210(this, 2));

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = krv0.a;
        Integer b = krv0.b();
        if (b != null) {
            setTheme(b.intValue());
        }
        setContentView(R.layout.media_picker_activity);
        getSupportFragmentManager().l0("media_picker_result", this, new zj0(this, 17));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        a aVar = new a(supportFragmentManager);
        ou10 ou10Var = (ou10) this.g.getValue();
        MediaPickerFragmentArguments mediaPickerFragmentArguments = (MediaPickerFragmentArguments) getIntent().getParcelableExtra("configuration_intent");
        if (mediaPickerFragmentArguments == null) {
            mediaPickerFragmentArguments = new MediaPickerFragmentArguments(false, false, null, null, null, 31, null);
        }
        aVar.g(R.id.media_picker_container, ou10Var.c(mediaPickerFragmentArguments), null);
        aVar.k(false);
        getWindow().setNavigationBarColor(krv0.l(R.attr.vk_ui_background_secondary));
    }
}
