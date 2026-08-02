package com.vk.avatarpicker;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.vk.avatarpicker.BaseAvatarPickerActivity;

/* compiled from: AvatarPickerActivity.kt */
/* loaded from: classes15.dex */
public final class AvatarPickerActivity extends BaseAvatarPickerActivity<b> {
    public static final /* synthetic */ int g = 0;

    /* compiled from: AvatarPickerActivity.kt */
    public static final class a {
        public static Intent a(Context context, String str) {
            Intent intent = new Intent(context, (Class<?>) AvatarPickerActivity.class);
            intent.putExtra("target", str);
            return intent;
        }

        public static Intent b(Context context) {
            Intent a = a(context, "avatar_app");
            a.putExtra("source", BaseAvatarPickerActivity.ImageSourceAction.CAMERA);
            return a;
        }

        public static Intent c(Context context, boolean z) {
            Intent a = a(context, "avatar_app_auth");
            a.putExtra("enable_delete", z);
            return a;
        }

        public static Intent d(Context context) {
            Intent a = a(context, "avatar_app");
            a.putExtra("source", BaseAvatarPickerActivity.ImageSourceAction.GALLERY);
            return a;
        }
    }

    @Override // com.vk.avatarpicker.BaseAvatarPickerActivity
    public final b Q1(Uri uri) {
        b bVar = new b();
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg_image_uri", uri);
        bVar.setArguments(bundle);
        return bVar;
    }
}
