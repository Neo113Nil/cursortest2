package com.vk.clips.edit.editor;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.clips.upload.edit.api.ClipsUploadSdkEditComponent;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewParams;
import com.vk.movika.sdk.base.model.e;
import com.vkontakte.android.VKActivity;
import xsna.bpn0;
import xsna.dhr0;
import xsna.fpf0;
import xsna.gy;
import xsna.m7m;
import xsna.mhy;
import xsna.mld;
import xsna.rok;
import xsna.sok;
import xsna.tok;

/* compiled from: ClipsChoosePreviewActivity.kt */
/* loaded from: classes16.dex */
public final class ClipsChoosePreviewActivity extends VKActivity implements rok {
    public static final /* synthetic */ int y = 0;
    public mld w;
    public final sok v = new sok(this);
    public final bpn0 x = new bpn0(new e(this, 18));

    @Override // xsna.rok
    public final tok R() {
        return this.v;
    }

    @Override // com.vkontakte.android.VKActivity, androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public final void onBackPressed() {
        mld mldVar = this.w;
        if (mldVar == null) {
            mldVar = null;
        }
        mldVar.a0();
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        setTheme(dhr0.a.v());
        super.onCreate(bundle);
        mhy.f(getWindow());
        mld Fb = ((ClipsUploadSdkEditComponent) m7m.a(this).mo408a(fpf0.a(ClipsUploadSdkEditComponent.class))).Fb((ClipsChoosePreviewParams) getIntent().getParcelableExtra("choose_preview_settings_key"), this, new gy(1, this, ClipsChoosePreviewActivity.class, CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "close(Lcom/vk/clips/upload/edit/api/preview/ClipsChoosePreviewResult;)V", 0, 5));
        this.w = Fb;
        if (Fb == null) {
            Fb = null;
        }
        setContentView(Fb.getView());
        mld mldVar = this.w;
        (mldVar != null ? mldVar : null).onCreate();
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        mld mldVar = this.w;
        if (mldVar == null) {
            mldVar = null;
        }
        mldVar.onDestroy();
    }
}
