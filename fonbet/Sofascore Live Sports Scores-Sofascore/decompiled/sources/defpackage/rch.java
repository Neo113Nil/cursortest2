package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import com.sofascore.results.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class rch extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Context s;
    public final /* synthetic */ Bitmap t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rch(Context context, Bitmap bitmap, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = context;
        this.t = bitmap;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new rch(this.s, this.t, rq3Var, 0);
            default:
                return new rch(this.s, this.t, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((rch) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        FileOutputStream fileOutputStream;
        OutputStream fileOutputStream2;
        int i = this.r;
        Bitmap bitmap = this.t;
        Context context = this.s;
        FileOutputStream fileOutputStream3 = null;
        Boolean valueOf = null;
        fileOutputStream3 = null;
        fileOutputStream3 = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                File file = new File(context.getFilesDir(), "images");
                file.mkdir();
                File file2 = new File(file.getPath(), vxd.l(System.currentTimeMillis() / 1000, "Sofascore_").concat(".png"));
                try {
                    try {
                        try {
                            fileOutputStream = new FileOutputStream(file2);
                        } catch (IOException unused) {
                        }
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
                    bitmap.recycle();
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream3 = fileOutputStream;
                    s38.a().c(e);
                    e.printStackTrace();
                    if (fileOutputStream3 != null) {
                        fileOutputStream3.flush();
                        fileOutputStream3.close();
                    }
                    file2.setReadable(true, false);
                    return file2;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream3 = fileOutputStream;
                    if (fileOutputStream3 != null) {
                        try {
                            fileOutputStream3.flush();
                            fileOutputStream3.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
                file2.setReadable(true, false);
                return file2;
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                String m = vxd.m("Sofascore_", yaa.w(), ".png");
                String string = context.getString(R.string.app_name);
                string.getClass();
                if (Build.VERSION.SDK_INT >= 29) {
                    ContentResolver contentResolver = context.getContentResolver();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_display_name", m);
                    contentValues.put("mime_type", "image/png");
                    contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + File.separator + string);
                    Uri insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                    fileOutputStream2 = insert != null ? contentResolver.openOutputStream(insert) : null;
                } else {
                    fileOutputStream2 = new FileOutputStream(new File(wv8.i(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).toString(), File.separator, string), m));
                }
                if (fileOutputStream2 != null) {
                    try {
                        valueOf = Boolean.valueOf(bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2));
                        fileOutputStream2.close();
                    } finally {
                    }
                }
                return valueOf;
        }
    }
}
