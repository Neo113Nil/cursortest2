package v0;

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
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import androidx.core.graphics.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import v0.i;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final z.j f66776a = new z.j(2);

    /* renamed from: b, reason: collision with root package name */
    public static final Comparator f66777b = new Comparator() { // from class: v0.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return d.a((byte[]) obj, (byte[]) obj2);
        }
    };

    public interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    public static class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final ContentProviderClient f66778a;

        public b(Context context, Uri uri) {
            this.f66778a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // v0.d.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f66778a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e10) {
                Log.w("FontsProvider", "Unable to query the content provider", e10);
                return null;
            }
        }

        @Override // v0.d.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f66778a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public String f66779a;

        /* renamed from: b, reason: collision with root package name */
        public String f66780b;

        /* renamed from: c, reason: collision with root package name */
        public List f66781c;

        public c(String str, String str2, List list) {
            this.f66779a = str;
            this.f66780b = str2;
            this.f66781c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.f66779a, cVar.f66779a) && Objects.equals(this.f66780b, cVar.f66780b) && Objects.equals(this.f66781c, cVar.f66781c);
        }

        public int hashCode() {
            return Objects.hash(this.f66779a, this.f66780b, this.f66781c);
        }
    }

    public static /* synthetic */ int a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    public static List b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static List d(e eVar, Resources resources) {
        return eVar.b() != null ? eVar.b() : androidx.core.content.res.h.c(resources, eVar.c());
    }

    public static i.a e(Context context, List list, CancellationSignal cancellationSignal) {
        String h10;
        Typeface h11;
        K2.a.c("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                e eVar = (e) list.get(i10);
                if (Build.VERSION.SDK_INT < 31 || (h11 = v.h((h10 = eVar.h()))) == null || v.j(h11) == null) {
                    ProviderInfo f10 = f(context.getPackageManager(), eVar, context.getResources());
                    if (f10 == null) {
                        return i.a.b(1, null);
                    }
                    arrayList.add(g(context, eVar, f10.authority, cancellationSignal));
                } else {
                    arrayList.add(new i.b[]{new i.b(h10, eVar.i())});
                }
            }
            return i.a.a(0, arrayList);
        } finally {
            K2.a.f();
        }
    }

    public static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) {
        K2.a.c("FontProvider.getProvider");
        try {
            List d10 = d(eVar, resources);
            c cVar = new c(eVar.e(), eVar.f(), d10);
            ProviderInfo providerInfo = (ProviderInfo) f66776a.get(cVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            String e10 = eVar.e();
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e10, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + e10);
            }
            if (!resolveContentProvider.packageName.equals(eVar.f())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + e10 + ", but package was not " + eVar.f());
            }
            List b10 = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(b10, f66777b);
            for (int i10 = 0; i10 < d10.size(); i10++) {
                ArrayList arrayList = new ArrayList((Collection) d10.get(i10));
                Collections.sort(arrayList, f66777b);
                if (c(b10, arrayList)) {
                    f66776a.put(cVar, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            K2.a.f();
            return null;
        } finally {
            K2.a.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v2, types: [v0.d$a] */
    public static i.b[] g(Context context, e eVar, String str, CancellationSignal cancellationSignal) {
        ?? r16;
        a aVar;
        a aVar2;
        Uri withAppendedId;
        boolean z10;
        K2.a.c("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            a a10 = a.a(context, build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                K2.a.c("ContentQueryWrapper.query");
                try {
                    try {
                        cursor = a10.b(build, strArr, "query = ?", new String[]{eVar.g()}, null, cancellationSignal);
                        if (cursor == null || cursor.getCount() <= 0) {
                            aVar = a10;
                        } else {
                            int columnIndex = cursor.getColumnIndex("result_code");
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursor.getColumnIndex("_id");
                            int columnIndex3 = cursor.getColumnIndex("file_id");
                            int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursor.getColumnIndex("font_weight");
                            int columnIndex6 = cursor.getColumnIndex("font_italic");
                            while (cursor.moveToNext()) {
                                int i10 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                                int i11 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                                if (columnIndex3 == -1) {
                                    aVar2 = a10;
                                    withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                                } else {
                                    aVar2 = a10;
                                    withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                                }
                                int i12 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                                if (columnIndex6 != -1) {
                                    z10 = true;
                                    if (cursor.getInt(columnIndex6) == 1) {
                                        arrayList2.add(i.b.a(withAppendedId, i11, i12, z10, i10));
                                        a10 = aVar2;
                                    }
                                }
                                z10 = false;
                                arrayList2.add(i.b.a(withAppendedId, i11, i12, z10, i10));
                                a10 = aVar2;
                            }
                            aVar = a10;
                            arrayList = arrayList2;
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        aVar.close();
                        return (i.b[]) arrayList.toArray(new i.b[0]);
                    } finally {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r16 = context;
                    if (cursor != null) {
                        cursor.close();
                    }
                    r16.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                r16 = a10;
            }
        } finally {
            K2.a.f();
        }
    }
}
