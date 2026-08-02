package m0;

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
import com.sports.insider.data.repository.room.metric.EventsTable;
import io.sentry.android.core.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import s.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final l f20108a = new l(2);

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.android.material.color.utilities.h f20109b = new com.google.android.material.color.utilities.h(3);

    public static com.google.android.flexbox.d a(Context context, List list) {
        String str;
        Typeface c2;
        Trace.beginSection(m4.g.B("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < list.size(); i5++) {
                d dVar = (d) list.get(i5);
                if (Build.VERSION.SDK_INT < 31 || (c2 = g0.g.c((str = dVar.f20114e))) == null || g0.g.d(c2) == null) {
                    ProviderInfo b10 = b(context.getPackageManager(), dVar, context.getResources());
                    if (b10 == null) {
                        com.google.android.flexbox.d dVar2 = new com.google.android.flexbox.d();
                        dVar2.f4226a = 1;
                        dVar2.f4227b = Collections.singletonList(null);
                        return dVar2;
                    }
                    arrayList.add(c(context, dVar, b10.authority));
                } else {
                    arrayList.add(new i[]{new i(str, dVar.f20115f)});
                }
            }
            com.google.android.flexbox.d dVar3 = new com.google.android.flexbox.d();
            dVar3.f4226a = 0;
            dVar3.f4227b = arrayList;
            return dVar3;
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, d dVar, Resources resources) {
        com.google.android.material.color.utilities.h hVar = f20109b;
        l lVar = f20108a;
        Trace.beginSection(m4.g.B("FontProvider.getProvider"));
        try {
            List list = dVar.f20113d;
            String str = dVar.f20110a;
            String str2 = dVar.f20111b;
            if (list == null) {
                list = f0.b.h(0, resources);
            }
            b bVar = new b();
            bVar.f20105a = str;
            bVar.f20106b = str2;
            bVar.f20107c = list;
            ProviderInfo providerInfo = (ProviderInfo) lVar.c(bVar);
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
            Collections.sort(arrayList, hVar);
            for (int i5 = 0; i5 < list.size(); i5++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i5));
                Collections.sort(arrayList2, hVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i10), (byte[]) arrayList2.get(i10))) {
                            break;
                        }
                    }
                    lVar.d(bVar, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133 A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #1 {all -> 0x0154, blocks: (B:3:0x000f, B:5:0x0042, B:55:0x0133, B:56:0x0136, B:75:0x014d, B:76:0x0150, B:77:0x0153, B:78:0x0049, B:8:0x0050, B:23:0x00a9, B:25:0x00ae, B:27:0x00b4, B:28:0x00dd, B:32:0x00e6, B:34:0x00f3, B:36:0x00fc, B:39:0x0112, B:41:0x011b, B:45:0x0127, B:49:0x0107, B:70:0x0147, B:71:0x014a), top: B:2:0x000f, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i[] c(Context context, d dVar, String str) {
        Cursor cursor;
        Cursor cursor2;
        Trace.beginSection(m4.g.B("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme(EventsTable.contentColumn).authority(str).build();
            Uri build2 = new Uri.Builder().scheme(EventsTable.contentColumn).authority(str).appendPath("file").build();
            a aVar = Build.VERSION.SDK_INT < 24 ? new a(context, build, 0) : new a(context, build, 1);
            Cursor cursor3 = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(m4.g.B("ContentQueryWrapper.query"));
                try {
                    String[] strArr2 = {dVar.f20112c};
                    switch (aVar.f20103a) {
                        case 0:
                            ContentProviderClient contentProviderClient = aVar.f20104b;
                            cursor = null;
                            if (contentProviderClient != null) {
                                try {
                                    cursor = contentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                                } catch (RemoteException e7) {
                                    w0.n("FontsProvider", "Unable to query the content provider", e7);
                                }
                            }
                            cursor2 = cursor;
                            Trace.endSection();
                            if (cursor2 != null && cursor2.getCount() > 0) {
                                int columnIndex = cursor2.getColumnIndex("result_code");
                                ArrayList arrayList2 = new ArrayList();
                                int columnIndex2 = cursor2.getColumnIndex("_id");
                                int columnIndex3 = cursor2.getColumnIndex("file_id");
                                int columnIndex4 = cursor2.getColumnIndex("font_ttc_index");
                                int columnIndex5 = cursor2.getColumnIndex("font_weight");
                                int columnIndex6 = cursor2.getColumnIndex("font_italic");
                                while (cursor2.moveToNext()) {
                                    int i5 = columnIndex != -1 ? cursor2.getInt(columnIndex) : 0;
                                    arrayList2.add(new i(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor2.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor2.getLong(columnIndex3)), columnIndex4 != -1 ? cursor2.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor2.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor2.getInt(columnIndex6) == 1, i5));
                                }
                                arrayList = arrayList2;
                            }
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            aVar.a();
                            return (i[]) arrayList.toArray(new i[0]);
                        default:
                            ContentProviderClient contentProviderClient2 = aVar.f20104b;
                            cursor = null;
                            if (contentProviderClient2 != null) {
                                try {
                                    cursor = contentProviderClient2.query(build, strArr, "query = ?", strArr2, null, null);
                                } catch (RemoteException e9) {
                                    w0.n("FontsProvider", "Unable to query the content provider", e9);
                                }
                            }
                            cursor2 = cursor;
                            Trace.endSection();
                            if (cursor2 != null) {
                                int columnIndex7 = cursor2.getColumnIndex("result_code");
                                ArrayList arrayList22 = new ArrayList();
                                int columnIndex22 = cursor2.getColumnIndex("_id");
                                int columnIndex32 = cursor2.getColumnIndex("file_id");
                                int columnIndex42 = cursor2.getColumnIndex("font_ttc_index");
                                int columnIndex52 = cursor2.getColumnIndex("font_weight");
                                int columnIndex62 = cursor2.getColumnIndex("font_italic");
                                while (cursor2.moveToNext()) {
                                }
                                arrayList = arrayList22;
                                break;
                            }
                            if (cursor2 != null) {
                            }
                            aVar.a();
                            return (i[]) arrayList.toArray(new i[0]);
                    }
                } finally {
                }
            } catch (Throwable th2) {
                if (0 != 0) {
                    cursor3.close();
                }
                aVar.a();
                throw th2;
            }
        } finally {
        }
    }
}
