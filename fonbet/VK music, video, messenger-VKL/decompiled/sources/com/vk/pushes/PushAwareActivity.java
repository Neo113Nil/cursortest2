package com.vk.pushes;

import com.vkontakte.android.VKActivity;
import xsna.fpf0;
import xsna.m7m;

/* compiled from: PushAwareActivity.kt */
/* loaded from: classes5.dex */
public class PushAwareActivity extends VKActivity {
    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        ((PushComponent) m7m.a(this).a(fpf0.a(PushComponent.class))).sc().c();
    }
}
