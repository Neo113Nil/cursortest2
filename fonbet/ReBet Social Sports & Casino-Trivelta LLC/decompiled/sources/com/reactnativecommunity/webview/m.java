package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.Toast;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import l0.AbstractC5338c;
import l0.AbstractC5339d;
import x0.C6774c;

/* loaded from: classes4.dex */
public class m implements ActivityEventListener {

    /* renamed from: g, reason: collision with root package name */
    public static final d f41375g = new d();

    /* renamed from: a, reason: collision with root package name */
    public final ReactApplicationContext f41376a;

    /* renamed from: b, reason: collision with root package name */
    public DownloadManager.Request f41377b;

    /* renamed from: c, reason: collision with root package name */
    public ValueCallback f41378c;

    /* renamed from: d, reason: collision with root package name */
    public ValueCallback f41379d;

    /* renamed from: e, reason: collision with root package name */
    public File f41380e;

    /* renamed from: f, reason: collision with root package name */
    public File f41381f;

    public class a implements PermissionListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f41382a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f41383b;

        public a(String str, String str2) {
            this.f41382a = str;
            this.f41383b = str2;
        }

        @Override // com.facebook.react.modules.core.PermissionListener
        public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
            if (i10 != 1) {
                return false;
            }
            if (iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(m.this.f41376a, this.f41383b, 1).show();
            } else if (m.this.f41377b != null) {
                m.this.h(this.f41382a);
            }
            return true;
        }
    }

    public static /* synthetic */ class b {
        static final /* synthetic */ int[] $SwitchMap$com$reactnativecommunity$webview$RNCWebViewModuleImpl$MimeType;

        static {
            int[] iArr = new int[c.values().length];
            $SwitchMap$com$reactnativecommunity$webview$RNCWebViewModuleImpl$MimeType = iArr;
            try {
                iArr[c.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$reactnativecommunity$webview$RNCWebViewModuleImpl$MimeType[c.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum c {
        DEFAULT("*/*"),
        IMAGE("image"),
        VIDEO("video");


        /* renamed from: a, reason: collision with root package name */
        public final String f41388a;

        c(String str) {
            this.f41388a = str;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public double f41389a = 1.0d;

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f41390b = new HashMap();

        public enum a {
            UNDECIDED,
            SHOULD_OVERRIDE,
            DO_NOT_OVERRIDE
        }

        public synchronized AtomicReference a(Double d10) {
            return (AtomicReference) this.f41390b.get(d10);
        }

        public synchronized C6774c b() {
            double d10;
            AtomicReference atomicReference;
            d10 = this.f41389a;
            this.f41389a = 1.0d + d10;
            atomicReference = new AtomicReference(a.UNDECIDED);
            this.f41390b.put(Double.valueOf(d10), atomicReference);
            return new C6774c(Double.valueOf(d10), atomicReference);
        }

        public synchronized void c(Double d10) {
            this.f41390b.remove(d10);
        }
    }

    public m(ReactApplicationContext reactApplicationContext) {
        this.f41376a = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    private PermissionAwareActivity o() {
        ComponentCallbacks2 currentActivity = this.f41376a.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof PermissionAwareActivity) {
            return (PermissionAwareActivity) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    public boolean A(String[] strArr, boolean z10, ValueCallback valueCallback, boolean z11) {
        Intent r10;
        this.f41379d = valueCallback;
        Activity currentActivity = this.f41376a.getCurrentActivity();
        ArrayList arrayList = new ArrayList();
        Intent intent = null;
        if (!v()) {
            if (d(strArr).booleanValue() && (intent = p()) != null) {
                arrayList.add(intent);
            }
            if (f(strArr).booleanValue() && (r10 = r()) != null) {
                arrayList.add(r10);
            }
        }
        Intent intent2 = new Intent("android.intent.action.CHOOSER");
        if (!z11) {
            intent2.putExtra("android.intent.extra.INTENT", l(strArr, z10));
            intent2.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
            intent = intent2;
        }
        if (intent == null) {
            Log.w(NativeRNCWebViewModuleSpec.NAME, "there is no Camera permission");
        } else if (intent.resolveActivity(currentActivity.getPackageManager()) != null) {
            currentActivity.startActivityForResult(intent, 1);
        } else {
            Log.w(NativeRNCWebViewModuleSpec.NAME, "there is no Activity to handle this Intent");
        }
        return true;
    }

    public final Boolean c(String str) {
        if (str.matches("\\.\\w+")) {
            str = m(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(c.IMAGE.f41388a));
    }

    public final Boolean d(String[] strArr) {
        String[] i10 = i(strArr);
        return Boolean.valueOf(g(i10, c.DEFAULT.f41388a).booleanValue() || g(i10, c.IMAGE.f41388a).booleanValue());
    }

    public final Boolean e(String str) {
        if (str.matches("\\.\\w+")) {
            str = m(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(c.VIDEO.f41388a));
    }

    public final Boolean f(String[] strArr) {
        String[] i10 = i(strArr);
        return Boolean.valueOf(g(i10, c.DEFAULT.f41388a).booleanValue() || g(i10, c.VIDEO.f41388a).booleanValue());
    }

    public final Boolean g(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public void h(String str) {
        try {
            ((DownloadManager) this.f41376a.getSystemService("download")).enqueue(this.f41377b);
            Toast.makeText(this.f41376a, str, 1).show();
        } catch (IllegalArgumentException | SecurityException e10) {
            Log.w(NativeRNCWebViewModuleSpec.NAME, "Unsupported URI, aborting download", e10);
        }
    }

    public final String[] i(String[] strArr) {
        if (w(strArr).booleanValue()) {
            return new String[]{c.DEFAULT.f41388a};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            if (str.matches("\\.\\w+")) {
                String m10 = m(str.replace(".", ""));
                if (m10 != null) {
                    strArr2[i10] = m10;
                } else {
                    strArr2[i10] = str;
                }
            } else {
                strArr2[i10] = str;
            }
        }
        return strArr2;
    }

    public File j(c cVar) {
        String str;
        String str2;
        int i10 = b.$SwitchMap$com$reactnativecommunity$webview$RNCWebViewModuleImpl$MimeType[cVar.ordinal()];
        if (i10 == 1) {
            String str3 = Environment.DIRECTORY_PICTURES;
            str = "image-";
            str2 = ".jpg";
        } else if (i10 != 2) {
            str = "";
            str2 = "";
        } else {
            String str4 = Environment.DIRECTORY_MOVIES;
            str = "video-";
            str2 = ".mp4";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(String.valueOf(System.currentTimeMillis()));
        sb2.append(str2);
        return File.createTempFile(str, str2, this.f41376a.getExternalFilesDir(null));
    }

    public final Intent k(String str) {
        String str2 = str.isEmpty() ? c.DEFAULT.f41388a : str;
        if (str.matches("\\.\\w+")) {
            str2 = m(str.replace(".", ""));
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str2);
        return intent;
    }

    public final Intent l(String[] strArr, boolean z10) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(c.DEFAULT.f41388a);
        intent.putExtra("android.intent.extra.MIME_TYPES", i(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z10);
        return intent;
    }

    public final String m(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    public Uri n(File file) {
        String packageName = this.f41376a.getPackageName();
        return AbstractC5339d.getUriForFile(this.f41376a, packageName + ".fileprovider", file);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
        if (this.f41379d == null && this.f41378c == null) {
            return;
        }
        File file = this.f41380e;
        boolean z10 = false;
        boolean z11 = file != null && file.length() > 0;
        File file2 = this.f41381f;
        if (file2 != null && file2.length() > 0) {
            z10 = true;
        }
        if (i10 != 1) {
            if (i10 == 3) {
                if (i11 != -1) {
                    this.f41378c.onReceiveValue(null);
                } else if (z11) {
                    this.f41378c.onReceiveValue(n(this.f41380e));
                } else if (z10) {
                    this.f41378c.onReceiveValue(n(this.f41381f));
                } else {
                    this.f41378c.onReceiveValue(intent.getData());
                }
            }
        } else if (i11 != -1) {
            ValueCallback valueCallback = this.f41379d;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
        } else if (z11) {
            this.f41379d.onReceiveValue(new Uri[]{n(this.f41380e)});
        } else if (z10) {
            this.f41379d.onReceiveValue(new Uri[]{n(this.f41381f)});
        } else {
            this.f41379d.onReceiveValue(q(intent, i11));
        }
        File file3 = this.f41380e;
        if (file3 != null && !z11) {
            file3.delete();
        }
        File file4 = this.f41381f;
        if (file4 != null && !z10) {
            file4.delete();
        }
        this.f41379d = null;
        this.f41378c = null;
        this.f41380e = null;
        this.f41381f = null;
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    public Intent p() {
        Intent intent;
        Throwable e10;
        Uri n10;
        try {
            File j10 = j(c.IMAGE);
            this.f41380e = j10;
            n10 = n(j10);
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
        } catch (IOException | IllegalArgumentException e11) {
            intent = null;
            e10 = e11;
        }
        try {
            intent.putExtra("output", n10);
            return intent;
        } catch (IOException e12) {
            e10 = e12;
            Log.e("CREATE FILE", "Error occurred while creating the File", e10);
            e10.printStackTrace();
            return intent;
        } catch (IllegalArgumentException e13) {
            e10 = e13;
            Log.e("CREATE FILE", "Error occurred while creating the File", e10);
            e10.printStackTrace();
            return intent;
        }
    }

    public Uri[] q(Intent intent, int i10) {
        if (intent == null) {
            return null;
        }
        if (intent.getClipData() == null) {
            if (intent.getData() == null || i10 != -1) {
                return null;
            }
            return WebChromeClient.FileChooserParams.parseResult(i10, intent);
        }
        int itemCount = intent.getClipData().getItemCount();
        Uri[] uriArr = new Uri[itemCount];
        for (int i11 = 0; i11 < itemCount; i11++) {
            uriArr[i11] = intent.getClipData().getItemAt(i11).getUri();
        }
        return uriArr;
    }

    public Intent r() {
        Intent intent;
        Throwable e10;
        Uri n10;
        try {
            File j10 = j(c.VIDEO);
            this.f41381f = j10;
            n10 = n(j10);
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
        } catch (IOException | IllegalArgumentException e11) {
            intent = null;
            e10 = e11;
        }
        try {
            intent.putExtra("output", n10);
            return intent;
        } catch (IOException e12) {
            e10 = e12;
            Log.e("CREATE FILE", "Error occurred while creating the File", e10);
            e10.printStackTrace();
            return intent;
        } catch (IllegalArgumentException e13) {
            e10 = e13;
            Log.e("CREATE FILE", "Error occurred while creating the File", e10);
            e10.printStackTrace();
            return intent;
        }
    }

    public final PermissionListener s(String str, String str2) {
        return new a(str, str2);
    }

    public boolean t(String str, String str2) {
        Activity currentActivity = this.f41376a.getCurrentActivity();
        if (Build.VERSION.SDK_INT > 28) {
            return true;
        }
        boolean z10 = AbstractC5338c.checkSelfPermission(currentActivity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        if (!z10) {
            o().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1, s(str, str2));
        }
        return z10;
    }

    public boolean u() {
        return true;
    }

    public boolean v() {
        Activity currentActivity = this.f41376a.getCurrentActivity();
        try {
            if (Arrays.asList(currentActivity.getPackageManager().getPackageInfo(currentActivity.getApplicationContext().getPackageName(), 4096).requestedPermissions).contains("android.permission.CAMERA")) {
                return AbstractC5338c.checkSelfPermission(currentActivity, "android.permission.CAMERA") != 0;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public final Boolean w(String[] strArr) {
        String str;
        boolean z10 = true;
        if (strArr.length != 0 && (strArr.length != 1 || (str = strArr[0]) == null || str.length() != 0)) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public void x(DownloadManager.Request request) {
        this.f41377b = request;
    }

    public void y(boolean z10, double d10) {
        AtomicReference a10 = f41375g.a(Double.valueOf(d10));
        if (a10 != null) {
            synchronized (a10) {
                try {
                    a10.set(z10 ? d.a.DO_NOT_OVERRIDE : d.a.SHOULD_OVERRIDE);
                    a10.notify();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void z(String str, ValueCallback valueCallback) {
        Intent r10;
        Intent p10;
        this.f41378c = valueCallback;
        Activity currentActivity = this.f41376a.getCurrentActivity();
        Intent createChooser = Intent.createChooser(k(str), "");
        ArrayList arrayList = new ArrayList();
        if (c(str).booleanValue() && (p10 = p()) != null) {
            arrayList.add(p10);
        }
        if (e(str).booleanValue() && (r10 = r()) != null) {
            arrayList.add(r10);
        }
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (createChooser.resolveActivity(currentActivity.getPackageManager()) != null) {
            currentActivity.startActivityForResult(createChooser, 3);
        } else {
            Log.w(NativeRNCWebViewModuleSpec.NAME, "there is no Activity to handle this Intent");
        }
    }
}
