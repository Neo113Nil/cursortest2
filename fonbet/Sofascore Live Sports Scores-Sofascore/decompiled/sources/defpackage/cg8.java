package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import com.ironsource.U3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class cg8 {
    public static final zmb a = new zmb(2);
    public static final z b = new z(28);

    public static mu4 a(Context context, List list) {
        String str;
        Typeface c;
        Trace.beginSection(h5a.U("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                dg8 dg8Var = (dg8) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (c = x5k.c((str = dg8Var.e))) == null || x5k.d(c) == null) {
                    ProviderInfo b2 = b(context.getPackageManager(), dg8Var, context.getResources());
                    if (b2 == null) {
                        return new mu4();
                    }
                    arrayList.add(c(context, dg8Var, b2.authority));
                } else {
                    arrayList.add(new yg8[]{new yg8(str, dg8Var.f)});
                }
            }
            return new mu4(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, dg8 dg8Var, Resources resources) {
        z zVar = b;
        zmb zmbVar = a;
        Trace.beginSection(h5a.U("FontProvider.getProvider"));
        try {
            List list = dg8Var.d;
            String str = dg8Var.a;
            String str2 = dg8Var.b;
            if (list == null) {
                list = qx9.E(resources, 0);
            }
            bg8 bg8Var = new bg8();
            bg8Var.a = str;
            bg8Var.b = str2;
            bg8Var.c = list;
            ProviderInfo providerInfo = (ProviderInfo) zmbVar.c(bg8Var);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!resolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, zVar);
            for (int i = 0; i < list.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                Collections.sort(arrayList2, zVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    zmbVar.d(bg8Var, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static yg8[] c(Context context, dg8 dg8Var, String str) {
        String[] strArr;
        Trace.beginSection(h5a.U("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT).authority(str).build();
            Uri build2 = new Uri.Builder().scheme(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT).authority(str).appendPath(U3.i.b).build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr2 = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(h5a.U("ContentQueryWrapper.query"));
                try {
                    String str2 = dg8Var.f;
                    String str3 = dg8Var.c;
                    if (str2 != null) {
                        int length = str2.length();
                        int i = 0;
                        while (i < length) {
                            int codePointAt = str2.codePointAt(i);
                            if (!Character.isWhitespace(codePointAt)) {
                                strArr = new String[]{str3, "VF"};
                                break;
                            }
                            i += Character.charCount(codePointAt);
                        }
                    }
                    strArr = new String[]{str3};
                    String[] strArr3 = strArr;
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr2, "query = ?", strArr3, null, null);
                        } catch (RemoteException unused) {
                        }
                    }
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int i2 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            arrayList2.add(new yg8(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, dg8Var.f, i2));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return (yg8[]) arrayList.toArray(new yg8[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                if (acquireUnstableContentProviderClient != null) {
                    acquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } finally {
        }
    }
}
