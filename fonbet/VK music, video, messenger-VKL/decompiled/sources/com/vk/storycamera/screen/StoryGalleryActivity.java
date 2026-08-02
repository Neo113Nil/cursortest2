package com.vk.storycamera.screen;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.vk.core.files.a;
import com.vk.core.ui.themes.ThemableActivity;
import com.vk.dto.stories.entities.StoryCameraGalleryData;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.model.web.StoryBoxPrepared;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.permission.PermissionHelper;
import com.vk.preview.presentation.view.GalleryPickerPreview;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vk.toggle.d;
import com.vkontakte.android.R;
import com.vkontakte.android.VKActivity;
import io.reactivex.rxjava3.core.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.am9;
import xsna.asl0;
import xsna.avj0;
import xsna.bek0;
import xsna.bpn0;
import xsna.c5g;
import xsna.cqm0;
import xsna.cvk;
import xsna.e43;
import xsna.e9i0;
import xsna.eqy;
import xsna.exi0;
import xsna.f5y;
import xsna.fda0;
import xsna.g0m0;
import xsna.hk70;
import xsna.im10;
import xsna.iz10;
import xsna.m3t;
import xsna.nex;
import xsna.nf9;
import xsna.nxi0;
import xsna.ny10;
import xsna.pbk;
import xsna.qhg0;
import xsna.r9c0;
import xsna.sxc0;
import xsna.w29;
import xsna.xa4;
import xsna.ysg0;
import xsna.yz10;

/* compiled from: StoryGalleryActivity.kt */
/* loaded from: classes11.dex */
public final class StoryGalleryActivity extends VKActivity implements g0m0 {
    public static WeakReference<View> F = new WeakReference<>(null);
    public StoryBoxPrepared A;
    public boolean B;
    public Bundle C;
    public GalleryPickerPreview.State D;
    public boolean E;
    public final bpn0 v = new bpn0(new avj0(this, 8));
    public final bpn0 w = new bpn0(new hk70(this, 24));
    public final ArrayList<Uri> x = new ArrayList<>();
    public final am9 y = new am9();
    public StoryCameraParams z;

    public final void T1(Intent intent) {
        MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint creationEntryPoint;
        String Eb;
        MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint creationEntryPoint2;
        String Eb2;
        String Eb3;
        this.y.c(StoryPublishEvent.CLOSE_GALLERY, new exi0(this, 6));
        Bundle bundleExtra = intent.getBundleExtra("result_attachments");
        if (bundleExtra == null) {
            return;
        }
        Collection<? extends Uri> parcelableArrayList = bundleExtra.getParcelableArrayList("result_files");
        if (parcelableArrayList == null) {
            parcelableArrayList = EmptyList.b;
        }
        ArrayList<Uri> arrayList = this.x;
        arrayList.clear();
        this.B = intent.getBooleanExtra("FROM_COLLAGE", false);
        this.C = intent.getBundleExtra("COLLAGE_PARAMS");
        if (intent.getBooleanExtra("FROM_MULTISELECT_MODE_KEY", false)) {
            arrayList.addAll(parcelableArrayList);
        } else if (this.B) {
            Bundle bundleExtra2 = intent.getBundleExtra("PRESELECTED_FILES");
            Collection<? extends Uri> parcelableArrayList2 = bundleExtra2 != null ? bundleExtra2.getParcelableArrayList("result_files") : null;
            if (parcelableArrayList2 == null) {
                parcelableArrayList2 = EmptyList.b;
            }
            arrayList.addAll(parcelableArrayList2);
        }
        Collection<? extends Uri> collection = parcelableArrayList;
        ArrayList arrayList2 = new ArrayList(c5g.u(collection, 10));
        for (Uri uri : collection) {
            arrayList2.add(a.G(uri) == 3 ? new StoryCameraGalleryData(uri, false, false, false, 12, null) : new StoryCameraGalleryData(uri, true, false, false, 12, null));
        }
        boolean z = bundleExtra.getBoolean("result_story_camera");
        if (!arrayList2.isEmpty()) {
            Bundle bundleExtra3 = intent.getBundleExtra("TRANSITION_BUNDLE");
            boolean z2 = this.B;
            StoryCameraParams storyCameraParams = this.z;
            if (storyCameraParams == null || (Eb3 = storyCameraParams.Eb()) == null || (creationEntryPoint2 = pbk.a(Eb3)) == null) {
                creationEntryPoint2 = MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.NEW_STORY_AVATAR;
            }
            StoryCameraParams storyCameraParams2 = this.z;
            com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(storyCameraParams2 != null ? storyCameraParams2.Ob() : null, creationEntryPoint2);
            StoryCameraParams storyCameraParams3 = this.z;
            if (storyCameraParams3 != null) {
                aVar.b(storyCameraParams3);
            }
            aVar.n();
            aVar.h(arrayList2);
            aVar.z(bundleExtra3 != null);
            StoryCameraParams.a.y(aVar, z2);
            aVar.D(xa4.L(this), 2241, bundleExtra3);
            StoryCameraParams storyCameraParams4 = this.z;
            if (storyCameraParams4 != null && (Eb2 = storyCameraParams4.Eb()) != null) {
                r6 = cqm0.m(Eb2);
            }
            ny10.a(r6, arrayList2);
        } else if (z) {
            StoryCameraParams storyCameraParams5 = this.z;
            if (storyCameraParams5 == null || (Eb = storyCameraParams5.Eb()) == null || (creationEntryPoint = pbk.a(Eb)) == null) {
                creationEntryPoint = MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.NEW_STORY_AVATAR;
            }
            StoryCameraParams storyCameraParams6 = this.z;
            com.vk.storycamera.builder.a aVar2 = new com.vk.storycamera.builder.a(storyCameraParams6 != null ? storyCameraParams6.Ob() : null, creationEntryPoint);
            StoryCameraParams storyCameraParams7 = this.z;
            if (storyCameraParams7 != null) {
                aVar2.b(storyCameraParams7);
            }
            if (U1()) {
                aVar2.f(e43.o(StoryCameraMode.STORY, StoryCameraMode.STORY_VIDEO));
            }
            aVar2.D(xa4.L(this), 3341, null);
        } else {
            cvk.u(R.string.story_gallery_message_attach_error, false);
            V1();
        }
        this.D = (GalleryPickerPreview.State) intent.getParcelableExtra("PREVIEW_STATE");
    }

    public final boolean U1() {
        WebStoryBox Rb;
        eqy<bek0> eqyVar = d.a;
        StoryCameraParams storyCameraParams = this.z;
        return (storyCameraParams == null || (Rb = storyCameraParams.Rb()) == null || !Rb.Db()) ? false : true;
    }

    public final void V1() {
        Intent k = sxc0.a().k(this);
        if (k != null) {
            k.putExtra("PRESELECTED_FILES", this.x);
            k.putExtra("camera_params", this.z);
            k.putExtra("story_box_prepared", this.A);
            k.putExtra("FROM_COLLAGE", this.B);
            k.putExtra("COLLAGE_PARAMS", this.C);
            k.putExtra("PREVIEW_STATE", this.D);
            startActivityForResult(k, 1321);
        }
        this.y.c(StoryPublishEvent.OPEN_GALLERY, new e9i0(this, 8));
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        nf9 nf9Var = nf9.b;
        nf9.e().c(this.E);
        this.E = false;
        overridePendingTransition(0, 0);
        sxc0.a().j();
    }

    @Override // xsna.g0m0
    public final void o5(boolean z) {
        finish();
        overridePendingTransition(0, z ? R.anim.stories_slide_out : 0);
    }

    @Override // com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i != 1321) {
                if (i == 2241 || i == 3341) {
                    if (U1()) {
                        setResult(-1);
                    }
                    finish();
                    return;
                }
                return;
            }
            if (!U1()) {
                if (intent != null) {
                    T1(intent);
                    return;
                }
                return;
            } else if (intent != null) {
                T1(intent);
                return;
            } else {
                setResult(-1);
                finish();
                return;
            }
        }
        if (i != 1321) {
            if (i == 2241 || i == 3341) {
                PermissionHelper.a.getClass();
                if (PermissionHelper.q(this) || PermissionHelper.o(this)) {
                    new Handler(Looper.getMainLooper()).post(new w29(this, 9));
                    return;
                } else {
                    finish();
                    return;
                }
            }
            return;
        }
        fda0 fda0Var = new fda0(this, 12);
        PermissionHelper.a.getClass();
        if (!PermissionHelper.q(this) && !PermissionHelper.o(this)) {
            fda0Var.invoke(Boolean.FALSE);
            return;
        }
        yz10 a = iz10.a(this);
        ArrayList c = a.c();
        if (c != null && !c.isEmpty()) {
            Iterator it = c.iterator();
            while (it.hasNext()) {
                if (((AlbumEntry) it.next()).d() > 0) {
                    fda0Var.invoke(Boolean.TRUE);
                    return;
                }
            }
        }
        this.p.b(a.d(111, -2, 0, 1).subscribe(new f5y(new qhg0(fda0Var, 8), 23), new nex(new r9c0(fda0Var, 13), 25)));
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String Eb;
        String Eb2;
        getWindow().requestFeature(13);
        new im10().a();
        super.onCreate(bundle);
        this.z = bundle != null ? (StoryCameraParams) bundle.getParcelable("camera_params") : null;
        this.A = bundle != null ? (StoryBoxPrepared) bundle.getParcelable("story_box_prepared") : null;
        if (this.z == null) {
            Intent intent = getIntent();
            StoryCameraParams storyCameraParams = (StoryCameraParams) intent.getParcelableExtra("camera_params");
            this.z = storyCameraParams;
            if (storyCameraParams == null) {
                this.z = new com.vk.storycamera.builder.a(intent.getStringExtra("ref"), intent.getStringExtra("entry_point")).a();
            }
        }
        Long valueOf = getIntent().hasExtra("session_id") ? Long.valueOf(getIntent().getLongExtra("session_id", 0L)) : null;
        nf9 nf9Var = nf9.b;
        nxi0 e = nf9.e();
        m3t m3tVar = (m3t) this.v.getValue();
        ThemableActivity themableActivity = this.i;
        x<JSONObject> a = m3tVar.a(themableActivity);
        StoryCameraParams storyCameraParams2 = this.z;
        String m = (storyCameraParams2 == null || (Eb2 = storyCameraParams2.Eb()) == null) ? null : cqm0.m(Eb2);
        String str = m == null ? "" : m;
        StoryCameraParams storyCameraParams3 = this.z;
        String Ob = storyCameraParams3 != null ? storyCameraParams3.Ob() : null;
        e.a(themableActivity, valueOf, a, str, Ob == null ? "" : Ob);
        am9 am9Var = this.y;
        am9.a a2 = am9Var.a();
        StoryCameraParams storyCameraParams4 = this.z;
        a2.a((storyCameraParams4 == null || (Eb = storyCameraParams4.Eb()) == null) ? null : cqm0.m(Eb));
        am9.a a3 = am9Var.a();
        StoryCameraParams storyCameraParams5 = this.z;
        a3.c(storyCameraParams5 != null ? storyCameraParams5.Ob() : null);
        this.E = false;
        V1();
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((ysg0) this.w.getValue()).a(asl0.b.a);
    }

    @Override // com.vk.core.activity.BaseActivity, android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        ArrayList<Uri> arrayList = this.x;
        arrayList.clear();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("INTENT_INPUT_FILES");
        if (parcelableArrayList != null) {
            arrayList.addAll(parcelableArrayList);
        }
        this.B = bundle.getBoolean("FROM_COLLAGE", false);
        this.C = bundle.getBundle("COLLAGE_PARAMS");
        this.D = (GalleryPickerPreview.State) bundle.getParcelable("PREVIEW_STATE");
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("INTENT_INPUT_FILES", this.x);
        bundle.putBoolean("FROM_COLLAGE", this.B);
        bundle.putParcelable("COLLAGE_PARAMS", this.C);
        bundle.putParcelable("PREVIEW_STATE", this.D);
    }
}
