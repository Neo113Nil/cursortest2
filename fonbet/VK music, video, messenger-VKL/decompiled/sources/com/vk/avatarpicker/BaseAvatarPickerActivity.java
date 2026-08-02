package com.vk.avatarpicker;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.avatarpicker.a;
import com.vk.avatarpicker.b;
import com.vk.avatarpicker.c;
import com.vk.core.apps.BuildInfo;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.c5g;
import xsna.dhr0;
import xsna.e43;
import xsna.h7u0;
import xsna.i7o0;
import xsna.ix2;
import xsna.lpj;
import xsna.lz0;
import xsna.ouz;
import xsna.ozl;
import xsna.q4t;
import xsna.qc;
import xsna.qg90;
import xsna.tk5;
import xsna.vua0;
import xsna.w66;
import xsna.x66;
import xsna.zrp;

/* compiled from: BaseAvatarPickerActivity.kt */
/* loaded from: classes15.dex */
public abstract class BaseAvatarPickerActivity<CF extends b> extends AppCompatActivity implements c.a, a.InterfaceC0422a {
    public static final List<ImageSourceAction> f = e43.l(ImageSourceAction.CAMERA, ImageSourceAction.GALLERY);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BaseAvatarPickerActivity.kt */
    public static final class ImageSourceAction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ImageSourceAction[] $VALUES;
        public static final ImageSourceAction CAMERA;
        public static final ImageSourceAction DELETE;
        public static final ImageSourceAction GALLERY;
        private final int titleId;

        static {
            ImageSourceAction imageSourceAction = new ImageSourceAction("CAMERA", 0, R.string.img_picker_dialog_item_camera);
            CAMERA = imageSourceAction;
            ImageSourceAction imageSourceAction2 = new ImageSourceAction("GALLERY", 1, R.string.img_picker_dialog_item_gallery);
            GALLERY = imageSourceAction2;
            ImageSourceAction imageSourceAction3 = new ImageSourceAction("DELETE", 2, R.string.img_picker_dialog_item_delete);
            DELETE = imageSourceAction3;
            ImageSourceAction[] imageSourceActionArr = {imageSourceAction, imageSourceAction2, imageSourceAction3};
            $VALUES = imageSourceActionArr;
            $ENTRIES = new asp(imageSourceActionArr);
        }

        public ImageSourceAction(String str, int i, int i2) {
            this.titleId = i2;
        }

        public static ImageSourceAction valueOf(String str) {
            return (ImageSourceAction) Enum.valueOf(ImageSourceAction.class, str);
        }

        public static ImageSourceAction[] values() {
            return (ImageSourceAction[]) $VALUES.clone();
        }

        public final int h() {
            return this.titleId;
        }
    }

    /* compiled from: BaseAvatarPickerActivity.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageSourceAction.values().length];
            try {
                iArr[ImageSourceAction.GALLERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageSourceAction.CAMERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageSourceAction.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void O1() {
        setResult(0);
        finish();
    }

    public abstract CF Q1(Uri uri);

    /* JADX WARN: Multi-variable type inference failed */
    public final void R1() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(getPackageManager()) == null) {
            BuildInfo.Client client = BuildInfo.a;
            VKApplication vKApplication = com.vk.core.apps.a.a;
            O1();
        }
        qg90 i = vua0.i(false);
        int intValue = ((Number) i.a).intValue();
        intent.putExtra("output", com.vk.core.files.a.N((File) i.b));
        PermissionHelper permissionHelper = PermissionHelper.a;
        permissionHelper.getClass();
        PermissionHelper.h(permissionHelper, this, PermissionHelper.t, R.string.vk_permissions_intent_photo, R.string.vk_permissions_intent_photo_settings, new w66(this, intent, intValue), new ix2(this, 6), 64);
    }

    public final void T1(Uri uri) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a b = tk5.b(supportFragmentManager, supportFragmentManager);
        b.f(R.id.root_view, Q1(uri), null, 1);
        b.d("crop");
        b.k(true);
    }

    public final void U1() {
        PermissionHelper permissionHelper = PermissionHelper.a;
        permissionHelper.getClass();
        PermissionHelper.h(permissionHelper, this, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, new qc(this, 4), new com.vk.movika.sdk.base.data.a(this, 10), 64);
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (vua0.s(i)) {
            if (i2 != -1) {
                O1();
                return;
            }
            Uri N = com.vk.core.files.a.N(vua0.l(i));
            if (N != null) {
                T1(N);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @ozl
    public final void onBackPressed() {
        super.onBackPressed();
        if (getSupportFragmentManager().K() == 0) {
            O1();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView(R.layout.activity_image_picker);
        ImageSourceAction imageSourceAction = (ImageSourceAction) getIntent().getSerializableExtra("source");
        boolean booleanExtra = getIntent().getBooleanExtra("enable_delete", false);
        List<ImageSourceAction> list = f;
        List<ImageSourceAction> list2 = list;
        if (booleanExtra) {
            ArrayList arrayList = new ArrayList(i7o0.a(list));
            arrayList.add(ImageSourceAction.DELETE);
            list2 = arrayList;
        }
        int i = imageSourceAction == null ? -1 : a.$EnumSwitchMapping$0[imageSourceAction.ordinal()];
        if (i != -1) {
            if (i == 1) {
                U1();
                return;
            } else {
                if (i != 2) {
                    return;
                }
                R1();
                return;
            }
        }
        lz0 lz0Var = new lz0(this, 4);
        final com.vk.movika.sdk.android.defaultplayer.view.timeline.a aVar = new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(this, 6);
        List<ImageSourceAction> list3 = list2;
        ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((ImageSourceAction) it.next()).h()));
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(getString(((Number) it2.next()).intValue()));
        }
        String[] strArr = (String[]) arrayList3.toArray(new String[0]);
        h7u0.a aVar2 = new h7u0.a(new lpj(this, dhr0.C().c));
        aVar2.T(strArr, new x66(0, list2, lz0Var));
        aVar2.a.n = new DialogInterface.OnCancelListener() { // from class: xsna.y66
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                com.vk.movika.sdk.android.defaultplayer.view.timeline.a.this.invoke();
            }
        };
        aVar2.m();
    }

    @Override // com.vk.avatarpicker.a.InterfaceC0422a
    public final void t0(Uri uri) {
        setResult(-1, new Intent().putExtra("output", uri));
        finish();
    }

    @Override // com.vk.avatarpicker.c.a
    public final void v0(q4t q4tVar) {
        if (q4tVar instanceof ouz) {
            T1(((ouz) q4tVar).a.f());
        }
    }
}
