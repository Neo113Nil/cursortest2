package v2;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import g.C6594f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import v2.C10195j;

/* renamed from: v2.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10189d {

    /* renamed from: a, reason: collision with root package name */
    private static final io.sentry.cache.b f101682a = new io.sentry.cache.b(1);

    /* renamed from: v2.d$a */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final ContentProviderClient f101683a;

        a(Context context, Uri uri) {
            this.f101683a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        public final void a() {
            ContentProviderClient contentProviderClient = this.f101683a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }

        public final Cursor b(Uri uri, String[] strArr, String[] strArr2) {
            ContentProviderClient contentProviderClient = this.f101683a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
            } catch (RemoteException e11) {
                Log.w("FontsProvider", "Unable to query the content provider", e11);
                return null;
            }
        }
    }

    @NonNull
    static C10195j.a a(@NonNull Context context, @NonNull C10190e c10190e) throws PackageManager.NameNotFoundException {
        Cursor cursor;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String c11 = c10190e.c();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(c11, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(Nk.a.b("No package found for authority: ", c11));
        }
        if (!resolveContentProvider.packageName.equals(c10190e.d())) {
            StringBuilder b11 = C6594f.b("Found content provider ", c11, ", but package was not ");
            b11.append(c10190e.d());
            throw new PackageManager.NameNotFoundException(b11.toString());
        }
        Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        io.sentry.cache.b bVar = f101682a;
        Collections.sort(arrayList, bVar);
        List<List<byte[]>> a11 = c10190e.a() != null ? c10190e.a() : androidx.core.content.res.e.b(resources, 0);
        int i11 = 0;
        loop1: while (true) {
            cursor = null;
            if (i11 >= a11.size()) {
                resolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList(a11.get(i11));
            Collections.sort(arrayList2, bVar);
            if (arrayList.size() == arrayList2.size()) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if (!Arrays.equals((byte[]) arrayList.get(i12), (byte[]) arrayList2.get(i12))) {
                        break;
                    }
                }
                break loop1;
            }
            i11++;
        }
        if (resolveContentProvider == null) {
            return new C10195j.a(1, null);
        }
        String str = resolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        a aVar = new a(context, build);
        try {
            cursor = aVar.b(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, new String[]{c10190e.e()});
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList4 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    arrayList4.add(new C10195j.b(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, columnIndex != -1 ? cursor.getInt(columnIndex) : 0));
                }
                arrayList3 = arrayList4;
            }
            if (cursor != null) {
                cursor.close();
            }
            aVar.a();
            return new C10195j.a(0, (C10195j.b[]) arrayList3.toArray(new C10195j.b[0]));
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            aVar.a();
            throw th2;
        }
    }
}
