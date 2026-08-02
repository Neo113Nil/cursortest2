package com.vk.attachpicker.impl;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.impl.ImagePickerActivity;
import com.vk.avatarchange.AvatarChangeActivity;
import com.vk.core.files.ExternalDirType;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vk.gallerypicker.configuration.SpoilerConfiguration;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import com.vkontakte.android.activities.LogoutReceiver;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vungle.ads.internal.task.g;
import java.io.File;
import java.util.ArrayList;
import ru.ok.android.sdk.SharedKt;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.dhr0;
import xsna.e43;
import xsna.h7u0;
import xsna.ll9;
import xsna.rmg;
import xsna.rwi;
import xsna.seq;
import xsna.sfg;
import xsna.vua0;
import xsna.znk0;

/* loaded from: classes.dex */
public class ImagePickerActivity extends FragmentActivity {
    public static final /* synthetic */ int p = 0;
    public String k;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public int i = 0;
    public UserId j = UserId.d;
    public Intent l = null;
    public GalleryPickerSourceConfiguration m = new GalleryPickerSourceConfiguration();
    public boolean n = false;
    public LogoutReceiver o = null;

    /* loaded from: classes15.dex */
    public static class a {
        public boolean b;
        public boolean c;
        public boolean d;
        public boolean e;
        public boolean f;
        public Intent h;
        public String l;
        public final ArrayList<String> a = new ArrayList<>();
        public GalleryPickerSourceConfiguration.EntryPoint g = null;
        public int i = -1;
        public int j = 0;
        public UserId k = UserId.d;

        @NonNull
        public final Intent a(Context context) {
            Intent intent = new Intent(context, (Class<?>) ImagePickerActivity.class);
            intent.putExtra("crop", false);
            intent.putExtra("finish_intent", this.h);
            intent.putExtra("allow_album", this.d);
            intent.putExtra("force_thumb", this.b);
            intent.putExtra("new_thumb", this.c);
            intent.putExtra("skip_avatar_publish", false);
            intent.putExtra("subtitle_res", 0);
            intent.putExtra("source_configuration", new GalleryPickerSourceConfiguration(this.e, this.f, this.g, false, false, false, false, false, new SpoilerConfiguration()));
            intent.putExtra("thumb_uid", this.k);
            int i = this.i;
            if (i >= 0) {
                intent.putExtra("type", i);
            }
            int i2 = this.j;
            if (i2 > 0) {
                intent.putExtra(SignalingProtocol.KEY_LIMIT, i2);
            }
            ArrayList<String> arrayList = this.a;
            if (!arrayList.isEmpty()) {
                intent.putExtra("custom", arrayList);
            }
            String str = this.l;
            if (str != null) {
                intent.putExtra("username", str);
            }
            return intent;
        }
    }

    public final void O1(int i, Intent intent) {
        Intent intent2 = this.l;
        if (intent2 != null) {
            intent2.putExtra("wasPicked", i == -1);
            startActivity(this.l);
        } else {
            setResult(i, intent);
            finish();
        }
    }

    public final void Q1() {
        int intExtra = getIntent().getIntExtra(SignalingProtocol.KEY_LIMIT, 100);
        Intent h = rwi.d().h().h(this, true, intExtra, intExtra, 111);
        h.putExtra("prevent_styling", false);
        h.removeExtra("media_type");
        h.putExtra("total_selection_limit", intExtra);
        h.putExtra("selection_limit", intExtra);
        if (intExtra <= 1) {
            h.putExtra("single_mode", true);
        }
        if (this.f) {
            h.putExtra("force_thumb", true);
        }
        h.putExtra("new_thumb_flow", this.g);
        h.putExtra("thumb_uid", this.j);
        String str = this.k;
        if (str != null) {
            h.putExtra("username", str);
        }
        h.putExtra("skip_avatar_publish", this.h);
        h.putExtra("subtitle_res", this.i);
        h.putExtra("gallery_picker_source_configuration", this.m);
        startActivityForResult(h, 50);
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        rwi.d().h().getClass();
        if (i2 != -1) {
            O1(0, null);
            return;
        }
        if ((i == 50 || i == 10987) && intent != null) {
            Intent intent2 = this.l;
            if (intent2 != null) {
                intent2.getExtras().putAll(intent.getExtras());
            } else {
                intent2 = intent;
            }
            if (intent.hasExtra("result_attachments")) {
                Bundle bundleExtra = intent.getBundleExtra("result_attachments");
                ArrayList arrayList = new ArrayList();
                if (bundleExtra.containsKey("result_files") && bundleExtra.containsKey("result_video_flags")) {
                    ArrayList parcelableArrayList = bundleExtra.getParcelableArrayList("result_files");
                    boolean[] booleanArray = bundleExtra.getBooleanArray("result_video_flags");
                    for (int i3 = 0; i3 < booleanArray.length; i3++) {
                        Uri uri = (Uri) parcelableArrayList.get(i3);
                        if (!booleanArray[i3]) {
                            arrayList.add(uri.toString());
                        }
                    }
                }
                intent2 = this.l;
                if (intent2 == null) {
                    intent2 = new Intent();
                }
                if (arrayList.size() == 1) {
                    intent2.putExtra(X3.i.b, (String) arrayList.get(0));
                } else {
                    intent2.putExtra("files", arrayList);
                }
                if (this.f) {
                    intent2.putExtra("cropLeft", intent.getFloatExtra("cropLeft", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    intent2.putExtra("cropTop", intent.getFloatExtra("cropTop", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    intent2.putExtra("cropRight", intent.getFloatExtra("cropRight", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    intent2.putExtra("cropBottom", intent.getFloatExtra("cropBottom", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                }
                intent2.putExtra("new_thumb_flow", false);
            } else {
                intent2.putExtra("new_thumb_flow", true);
            }
            if (i == 50) {
                intent2.putExtra("is_from_gallery", this.n);
            }
            if (intent.hasExtra("edited_content_uri")) {
                intent2.putExtra("edited_content_uri", (Uri) intent.getParcelableExtra("edited_content_uri"));
            }
            if (intent.hasExtra("original_content_uri")) {
                intent2.putExtra("original_content_uri", (Uri) intent.getParcelableExtra("original_content_uri"));
            }
            O1(-1, intent2);
        }
        if (vua0.s(i)) {
            File l = vua0.l(i);
            if (l != null) {
                String name = l.getName();
                seq seqVar = com.vk.core.files.a.b;
                Context context = e43.a;
                ExternalDirType externalDirType = ExternalDirType.IMAGES;
                seqVar.getClass();
                Parcelable c = seq.c(context, name, externalDirType);
                new com.vk.core.files.b(znk0.n()).a(l, externalDirType).subscribe();
                if (this.g) {
                    String str = "file://" + l.getAbsolutePath();
                    rwi.d().h().getClass();
                    Intent putExtra = new Intent(this, (Class<?>) AvatarChangeActivity.class).putExtra(X3.i.b, str).putExtra("thumb_uid", this.j).putExtra("skip_avatar_publish", this.h).putExtra("subtitle_res", this.i);
                    String str2 = this.k;
                    if (str2 != null) {
                        putExtra.putExtra("username", str2);
                    }
                    startActivityForResult(putExtra, 10987);
                } else {
                    Intent intent3 = new Intent(this, (Class<?>) PhotoEditorActivity.class);
                    intent3.putExtra(X3.i.b, l);
                    intent3.putExtra("force_thumb", this.f);
                    intent3.putExtra("original_content_uri", c);
                    startActivityForResult(intent3, 50);
                }
            } else {
                finish();
            }
        }
        if (i == 51) {
            Photo photo = (Photo) intent.getParcelableExtra("photo");
            Intent intent4 = this.l;
            if (intent4 == null) {
                intent4 = new Intent();
            }
            intent4.putExtra(SharedKt.PARAM_ATTACHMENT, new PhotoAttachment(photo));
            O1(-1, intent4);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = LogoutReceiver.a(this);
        overridePendingTransition(0, 0);
        this.f = getIntent().getBooleanExtra("force_thumb", false);
        this.g = getIntent().getBooleanExtra("new_thumb", false);
        this.h = getIntent().getBooleanExtra("skip_avatar_publish", false);
        this.i = getIntent().getIntExtra("subtitle_res", 0);
        UserId userId = (UserId) getIntent().getParcelableExtra("thumb_uid");
        this.j = userId;
        if (userId == null) {
            this.j = UserId.d;
        }
        this.k = getIntent().getStringExtra("username");
        this.l = (Intent) getIntent().getParcelableExtra("finish_intent");
        this.m = (GalleryPickerSourceConfiguration) getIntent().getParcelableExtra("source_configuration");
        if (bundle != null) {
            ll9.a(bundle);
            return;
        }
        int intExtra = getIntent().getIntExtra("type", -1);
        if (intExtra == 0) {
            this.n = false;
            PermissionHelper permissionHelper = PermissionHelper.a;
            permissionHelper.getClass();
            PermissionHelper.h(permissionHelper, this, PermissionHelper.t, R.string.vk_permissions_intent_photo, R.string.vk_permissions_intent_photo_settings, new sfg(this, 25), new rmg(this, 16), 64);
        } else if (intExtra == 1) {
            this.n = true;
            Q1();
        } else if (intExtra != 2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(getResources().getString(R.string.add_photo_gallery));
            arrayList.add(getResources().getString(R.string.add_photo_camera));
            if (getIntent().getBooleanExtra("allow_album", true)) {
                arrayList.add(getResources().getString(R.string.add_photo_from_album));
            }
            if (getIntent().hasExtra("custom")) {
                arrayList.addAll(getIntent().getStringArrayListExtra("custom"));
            }
            final ArrayList arrayList2 = new ArrayList();
            arrayList2.add(g.e);
            arrayList2.add("c");
            if (getIntent().getBooleanExtra("allow_album", true)) {
                arrayList2.add("a");
            }
            h7u0.a aVar = new h7u0.a(new ContextThemeWrapper(this, dhr0.C().c));
            aVar.g0(R.string.attach_photo);
            aVar.T((CharSequence[]) arrayList.toArray(new String[arrayList.size()]), new DialogInterface.OnClickListener() { // from class: xsna.pkw
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    int i2 = ImagePickerActivity.p;
                    ArrayList arrayList3 = arrayList2;
                    int size = arrayList3.size();
                    ImagePickerActivity imagePickerActivity = ImagePickerActivity.this;
                    if (i >= size) {
                        int size2 = i - arrayList3.size();
                        Intent intent = new Intent();
                        intent.putExtra("option", size2);
                        imagePickerActivity.setResult(1, intent);
                        imagePickerActivity.finish();
                        return;
                    }
                    String str = (String) arrayList3.get(i);
                    if (com.vungle.ads.internal.task.g.e.equals(str)) {
                        imagePickerActivity.n = true;
                        imagePickerActivity.Q1();
                    } else if (!"c".equals(str)) {
                        if ("a".equals(str)) {
                            rwi.d().h().b(imagePickerActivity);
                        }
                    } else {
                        imagePickerActivity.n = false;
                        PermissionHelper permissionHelper2 = PermissionHelper.a;
                        permissionHelper2.getClass();
                        PermissionHelper.h(permissionHelper2, imagePickerActivity, PermissionHelper.t, R.string.vk_permissions_intent_photo, R.string.vk_permissions_intent_photo_settings, new sfg(imagePickerActivity, 25), new rmg(imagePickerActivity, 16), 64);
                    }
                }
            });
            aVar.h(new DialogInterface.OnCancelListener() { // from class: xsna.qkw
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    int i = ImagePickerActivity.p;
                    ImagePickerActivity imagePickerActivity = ImagePickerActivity.this;
                    imagePickerActivity.setResult(0);
                    imagePickerActivity.finish();
                }
            });
            aVar.m();
        } else {
            rwi.d().h().b(this);
        }
        dhr0.r0(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        this.o.b();
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ll9.b(bundle);
    }
}
