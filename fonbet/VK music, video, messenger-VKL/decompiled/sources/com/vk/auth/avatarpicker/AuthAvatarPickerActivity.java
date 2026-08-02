package com.vk.auth.avatarpicker;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.ironsource.X3;
import com.vk.auth.avatarpicker.AuthAvatarPickerActivity;
import com.vk.superapp.core.ui.component.VkSdkActivity;
import com.vk.superapp.provider.SakFileProvider;
import com.vkontakte.android.R;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.c5g;
import xsna.dhr0;
import xsna.e370;
import xsna.e43;
import xsna.eeu0;
import xsna.epx;
import xsna.gfx0;
import xsna.i7o0;
import xsna.s15;
import xsna.s3q0;
import xsna.zrp;

/* compiled from: AuthAvatarPickerActivity.kt */
/* loaded from: classes15.dex */
public final class AuthAvatarPickerActivity extends VkSdkActivity {
    public static final /* synthetic */ int i = 0;
    public List<? extends DialogItem> f = e43.l(DialogItem.CAMERA, DialogItem.GALLERY);
    public Uri g;
    public File h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthAvatarPickerActivity.kt */
    public static final class DialogItem {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DialogItem[] $VALUES;
        public static final DialogItem CAMERA;
        public static final DialogItem DELETE;
        public static final DialogItem GALLERY;
        private final int resourceId;

        static {
            DialogItem dialogItem = new DialogItem("CAMERA", 0, R.string.vk_auth_avatar_camera);
            CAMERA = dialogItem;
            DialogItem dialogItem2 = new DialogItem("GALLERY", 1, R.string.vk_auth_avatar_gallery);
            GALLERY = dialogItem2;
            DialogItem dialogItem3 = new DialogItem("DELETE", 2, R.string.vk_auth_avatar_delete);
            DELETE = dialogItem3;
            DialogItem[] dialogItemArr = {dialogItem, dialogItem2, dialogItem3};
            $VALUES = dialogItemArr;
            $ENTRIES = new asp(dialogItemArr);
        }

        public DialogItem(String str, int i, int i2) {
            this.resourceId = i2;
        }

        public static DialogItem valueOf(String str) {
            return (DialogItem) Enum.valueOf(DialogItem.class, str);
        }

        public static DialogItem[] values() {
            return (DialogItem[]) $VALUES.clone();
        }

        public final int h() {
            return this.resourceId;
        }
    }

    /* compiled from: AuthAvatarPickerActivity.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DialogItem.values().length];
            try {
                iArr[DialogItem.GALLERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DialogItem.CAMERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DialogItem.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final File O1() {
        SakFileProvider.a aVar = SakFileProvider.b;
        Context applicationContext = getApplicationContext();
        aVar.getClass();
        File file = new File(applicationContext.getCacheDir(), "/superapp/");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, "avatar_to_upload_" + System.currentTimeMillis());
    }

    public final void Q1() {
        File file = this.h;
        if (file != null) {
            file.delete();
        }
        setResult(0);
        finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004e, code lost:
    
        if (r2 == 0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r4v12, types: [xsna.s3q0] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v15, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R1(Uri uri) {
        if (uri != 0) {
            String scheme = uri.getScheme();
            ?? r2 = X3.i.b;
            try {
                if (!epx.f(scheme, X3.i.b)) {
                    try {
                        uri = getContentResolver().openInputStream(uri);
                        try {
                            File O1 = O1();
                            this.h = O1;
                            r2 = new FileOutputStream(O1);
                            try {
                                i7o0.b(uri, r2, 8192);
                                if (uri != 0) {
                                    try {
                                        uri.close();
                                        s3q0 s3q0Var = s3q0.a;
                                    } catch (Throwable unused) {
                                    }
                                }
                            } catch (Exception unused2) {
                                Q1();
                                if (uri != 0) {
                                    try {
                                        uri.close();
                                        s3q0 s3q0Var2 = s3q0.a;
                                    } catch (Throwable unused3) {
                                    }
                                }
                            }
                        } catch (Exception unused4) {
                            r2 = 0;
                        } catch (Throwable th) {
                            r2 = 0;
                            th = th;
                            if (uri != 0) {
                                try {
                                    uri.close();
                                    s3q0 s3q0Var3 = s3q0.a;
                                } catch (Throwable unused5) {
                                }
                            }
                            if (r2 == 0) {
                                throw th;
                            }
                            try {
                                r2.close();
                                s3q0 s3q0Var4 = s3q0.a;
                                throw th;
                            } catch (Throwable unused6) {
                                throw th;
                            }
                        }
                    } catch (Exception unused7) {
                        uri = 0;
                        r2 = 0;
                    } catch (Throwable th2) {
                        r2 = 0;
                        th = th2;
                        uri = 0;
                    }
                    try {
                        r2.close();
                        uri = s3q0.a;
                    } catch (Throwable unused8) {
                    }
                    File file = this.h;
                    if (file != null) {
                        uri = Uri.fromFile(file);
                    }
                }
                setResult(-1, new Intent().putExtra("output", uri));
                finish();
            } catch (Throwable th3) {
                th = th3;
            }
        }
        uri = 0;
        setResult(-1, new Intent().putExtra("output", uri));
        finish();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        Uri uri;
        if (i2 == 2) {
            Uri data = intent != null ? intent.getData() : null;
            if (i3 != -1 || data == null) {
                Q1();
                return;
            } else {
                R1(data);
                return;
            }
        }
        if (i2 != 3) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 != -1 || (uri = this.g) == null) {
            Q1();
        } else {
            R1(uri);
        }
    }

    @Override // com.vk.superapp.core.ui.component.VkSdkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        List<? extends DialogItem> list;
        gfx0 gfx0Var = e370.b;
        if (gfx0Var == null) {
            gfx0Var = null;
        }
        gfx0Var.getClass();
        setTheme(!dhr0.M() ? R.style.VkSuperappkit_Light_Transparent : R.style.VkSuperappkit_Dark_Transparent);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setContentView(frameLayout);
        if (getIntent().getBooleanExtra("enable_delete_button", false)) {
            ArrayList arrayList = new ArrayList(i7o0.a(this.f));
            arrayList.add(DialogItem.DELETE);
            list = arrayList;
        } else {
            list = this.f;
        }
        this.f = list;
        eeu0.a aVar = new eeu0.a(this);
        List<? extends DialogItem> list2 = this.f;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((DialogItem) it.next()).h()));
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(getString(((Number) it2.next()).intValue()));
        }
        aVar.b((CharSequence[]) arrayList3.toArray(new String[0]), new s15(this, 0));
        aVar.a.n = new DialogInterface.OnCancelListener() { // from class: xsna.t15
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                int i2 = AuthAvatarPickerActivity.i;
                AuthAvatarPickerActivity.this.Q1();
            }
        };
        aVar.m();
    }
}
