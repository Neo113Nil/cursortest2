package com.vk.superapp.browser.internal.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.provider.SakFileProvider;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.q0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;
import xsna.asp;
import xsna.bgu0;
import xsna.c5g;
import xsna.drm0;
import xsna.e370;
import xsna.e43;
import xsna.e520;
import xsna.iok0;
import xsna.izs;
import xsna.j5g;
import xsna.m5k;
import xsna.n1w0;
import xsna.o1w0;
import xsna.o7j0;
import xsna.p1w0;
import xsna.qex0;
import xsna.qoy;
import xsna.rl3;
import xsna.s3q0;
import xsna.wx20;
import xsna.xgx0;
import xsna.zrp;

/* compiled from: VkWebFileChooserImpl.kt */
/* loaded from: classes6.dex */
public class VkWebFileChooserImpl implements n1w0 {
    public final Fragment a;
    public final String b;
    public ValueCallback<Uri[]> c;
    public Uri d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkWebFileChooserImpl.kt */
    public static final class PickAction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PickAction[] $VALUES;
        public static final PickAction ACTION_CAMERA;
        public static final PickAction ACTION_FILE_PICKER;
        public static final PickAction ACTION_GALLERY;
        private final int iconId;
        private final int id;
        private final int title;

        static {
            PickAction pickAction = new PickAction("ACTION_CAMERA", 0, 1, R.string.vk_capture_photo_or_video, R.drawable.vk_icon_camera_outline_28);
            ACTION_CAMERA = pickAction;
            PickAction pickAction2 = new PickAction("ACTION_GALLERY", 1, 2, R.string.vk_choose_photo, R.drawable.vk_icon_picture_outline_28);
            ACTION_GALLERY = pickAction2;
            PickAction pickAction3 = new PickAction("ACTION_FILE_PICKER", 2, 3, R.string.vk_choose_file, R.drawable.vk_icon_document_outline_28);
            ACTION_FILE_PICKER = pickAction3;
            PickAction[] pickActionArr = {pickAction, pickAction2, pickAction3};
            $VALUES = pickActionArr;
            $ENTRIES = new asp(pickActionArr);
        }

        public PickAction(String str, int i, int i2, int i3, int i4) {
            this.id = i2;
            this.title = i3;
            this.iconId = i4;
        }

        public static PickAction valueOf(String str) {
            return (PickAction) Enum.valueOf(PickAction.class, str);
        }

        public static PickAction[] values() {
            return (PickAction[]) $VALUES.clone();
        }

        public final int h() {
            return this.iconId;
        }

        public final int i() {
            return this.id;
        }

        public final int j() {
            return this.title;
        }
    }

    /* compiled from: VkWebFileChooserImpl.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public a() {
            this(false, false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RequestedTypes(hasVideoType=");
            sb.append(this.a);
            sb.append(", hasPhotoType=");
            sb.append(this.b);
            sb.append(", hasAnyType=");
            return q0.a(sb, this.c, ')');
        }

        public a(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }
    }

    /* compiled from: VkWebFileChooserImpl.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PickAction.values().length];
            try {
                iArr[PickAction.ACTION_CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PickAction.ACTION_GALLERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PickAction.ACTION_FILE_PICKER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VkWebFileChooserImpl(Fragment fragment, String str) {
        this.a = fragment;
        this.b = str;
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        superappUiRouterBridge = superappUiRouterBridge == null ? null : superappUiRouterBridge;
        iok0 iok0Var = superappUiRouterBridge instanceof iok0 ? (iok0) superappUiRouterBridge : null;
        if (iok0Var != null) {
            iok0Var.u0(fragment);
        }
    }

    @Override // xsna.n1w0
    public void a(Intent intent, boolean z, izs<? super Uri, s3q0> izsVar) {
        if (z) {
            Uri data = (intent != null ? intent.getData() : null) == null ? this.d : intent.getData();
            if (data != null) {
                izsVar.invoke(data);
            }
            ValueCallback<Uri[]> valueCallback = this.c;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(data != null ? new Uri[]{data} : null);
            }
        } else {
            ValueCallback<Uri[]> valueCallback2 = this.c;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(null);
            }
        }
        this.c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[Catch: all -> 0x0009, TryCatch #0 {all -> 0x0009, blocks: (B:2:0x0000, B:4:0x0005, B:5:0x000c, B:7:0x0010, B:10:0x001b, B:14:0x0023, B:16:0x0033, B:20:0x0056, B:22:0x005e, B:23:0x0062, B:28:0x0049, B:30:0x0050), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[Catch: all -> 0x0009, TryCatch #0 {all -> 0x0009, blocks: (B:2:0x0000, B:4:0x0005, B:5:0x000c, B:7:0x0010, B:10:0x001b, B:14:0x0023, B:16:0x0033, B:20:0x0056, B:22:0x005e, B:23:0x0062, B:28:0x0049, B:30:0x0050), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    @Override // xsna.n1w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        String[] strArr;
        try {
            ValueCallback<Uri[]> valueCallback2 = this.c;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(null);
            }
            this.c = valueCallback;
            String[] acceptTypes = fileChooserParams != null ? fileChooserParams.getAcceptTypes() : null;
            if (acceptTypes != null) {
                String[] strArr2 = acceptTypes.length == 0 ? null : acceptTypes;
                if (strArr2 != null) {
                    String Z = rl3.Z(strArr2, null, null, null, null, 63);
                    strArr = Z.length() > 0 ? (String[]) drm0.c0(Z, new String[]{StringUtils.COMMA}, 0, 6).toArray(new String[0]) : new String[]{"*/*"};
                    if (strArr != null) {
                        i(strArr, fileChooserParams == null ? fileChooserParams.isCaptureEnabled() : true, fileChooserParams != null ? fileChooserParams.getMode() : 0);
                    }
                }
            }
            strArr = new String[]{"*/*"};
            i(strArr, fileChooserParams == null ? fileChooserParams.isCaptureEnabled() : true, fileChooserParams != null ? fileChooserParams.getMode() : 0);
        } catch (Throwable th) {
            String b2 = m5k.b(th, new StringBuilder("error on file chooser: "));
            if (qex0.c) {
                xgx0.a.getClass();
                xgx0.b(b2);
            }
        }
    }

    @Override // xsna.n1w0
    public void c(int i, Intent intent, boolean z) {
        a(intent, z, new o7j0(17));
    }

    @Override // xsna.n1w0
    public boolean d(int i) {
        return i == 122;
    }

    public boolean e() {
        return true;
    }

    public void f(boolean z, a aVar, PickAction pickAction, boolean z2) {
        int i = b.$EnumSwitchMapping$0[pickAction.ordinal()];
        if (i != 1) {
            if (i == 2) {
                j(z, z2, aVar);
                return;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                k();
                return;
            }
        }
        boolean z3 = aVar.b;
        boolean z4 = aVar.a;
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        superappUiRouterBridge.k0(SuperappUiRouterBridge.Permission.CAMERA, new p1w0(this, z3, z4));
    }

    public final void finalize() {
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        iok0 iok0Var = superappUiRouterBridge instanceof iok0 ? (iok0) superappUiRouterBridge : null;
        if (iok0Var != null) {
            iok0Var.x0(this.a);
        }
    }

    public boolean g() {
        return false;
    }

    public void h(boolean z, boolean z2) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        Fragment fragment = this.a;
        Context mo2getContext = fragment.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        try {
            SakFileProvider.b.getClass();
            File file = new File(mo2getContext.getCacheDir(), "/superapp/");
            if (!file.exists()) {
                file.mkdirs();
            }
            Uri uriForFile = FileProvider.getUriForFile(fragment.requireContext(), this.b, new File(file, bgu0.a.format(new Date()) + ".jpg"));
            this.d = uriForFile;
            intent.putExtra("output", uriForFile);
            if (intent.resolveActivity(mo2getContext.getPackageManager()) != null) {
                fragment.startActivityForResult(intent, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                return;
            }
            xgx0.a.getClass();
            xgx0.b("error no activity can handle this intent " + intent);
            Toast.makeText(mo2getContext, mo2getContext.getString(R.string.vk_confirmation_dialog_something_went_wrong), 0).show();
        } catch (Exception e) {
            xgx0.a.getClass();
            xgx0.g("error on file create " + e);
            Toast.makeText(mo2getContext, mo2getContext.getString(R.string.vk_confirmation_dialog_something_went_wrong), 0).show();
        }
    }

    public final void i(String[] strArr, boolean z, int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        ArrayList arrayList = new ArrayList();
        boolean z5 = i == 1;
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z2 = false;
                break;
            } else {
                if (drm0.D(strArr[i2], "image", false)) {
                    z2 = true;
                    break;
                }
                i2++;
            }
        }
        int length2 = strArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length2) {
                z3 = false;
                break;
            } else {
                if (drm0.D(strArr[i3], "video", false)) {
                    z3 = true;
                    break;
                }
                i3++;
            }
        }
        int length3 = strArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length3) {
                z4 = false;
                break;
            }
            if (!new Regex("image|video").a(strArr[i4])) {
                z4 = true;
                break;
            }
            i4++;
        }
        boolean z6 = z2 || z4;
        boolean z7 = !(z2 || z3) || z4;
        if (z) {
            arrayList.add(PickAction.ACTION_CAMERA);
        }
        if (z7 && !z && g()) {
            arrayList.add(PickAction.ACTION_FILE_PICKER);
        }
        if (((z6 || z3) && !z) || e()) {
            arrayList.add(PickAction.ACTION_GALLERY);
        }
        a aVar = new a(z3, z2, z4);
        if (arrayList.size() <= 1) {
            if (arrayList.isEmpty()) {
                l();
                return;
            } else {
                f(z, aVar, (PickAction) j5g.Y(arrayList), z5);
                return;
            }
        }
        Context requireContext = this.a.requireContext();
        o1w0 o1w0Var = new o1w0(this, z, aVar, z5);
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i6 = i5 + 1;
            if (i5 < 0) {
                e43.t();
                throw null;
            }
            PickAction pickAction = (PickAction) next;
            arrayList2.add(new e520(pickAction.i(), pickAction.h(), pickAction.j(), i5, false, 0, 0, false, null, 0, null, false, 8176));
            i5 = i6;
        }
        wx20.c(new com.vk.superapp.browser.internal.utils.a(arrayList, o1w0Var, arrayList2, this), requireContext, "picker_menu_tag", 0, 0, 28);
    }

    public void j(boolean z, boolean z2, a aVar) {
        boolean z3 = aVar.a;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z2);
        if (aVar.c) {
            intent.setType("*/*");
            intent.putExtra("media_type", 111);
        } else {
            boolean z4 = aVar.b;
            if (z4 && z3) {
                intent.setType("image/*,video/*");
                intent.putExtra("media_type", 111);
                intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            } else if (z4) {
                intent.setType("image/*");
                intent.putExtra("media_type", Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);
            } else if (z3) {
                intent.setType("video/*");
                intent.putExtra("media_type", 333);
            }
        }
        Intent intent2 = new Intent("android.intent.action.CHOOSER");
        intent2.putExtra("android.intent.extra.INTENT", intent);
        this.a.startActivityForResult(intent2, 101);
    }

    public final void l() {
        ValueCallback<Uri[]> valueCallback = this.c;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
        this.c = null;
        this.d = null;
    }

    public void k() {
    }
}
