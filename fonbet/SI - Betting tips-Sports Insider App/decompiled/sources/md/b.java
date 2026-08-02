package md;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f20530a = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;

    public static String[] b() {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            return new String[]{"_id", "bucket_id", "bucket_display_name", "_data", i5 > 28 ? "date_modified" : "datetaken", "orientation", "width", "height", "_size", "volume_name"};
        }
        return new String[]{"_id", "bucket_id", "bucket_display_name", "_data", i5 > 28 ? "date_modified" : "datetaken", "orientation", "width", "height", "_size"};
    }

    public final List a(Context context) {
        String str;
        Uri withAppendedId;
        Intrinsics.checkNotNullParameter(context, "context");
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33 ? !(i5 != 33 && context.checkSelfPermission("android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) : context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            return e0.f19204a;
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                try {
                    Cursor query = context.getApplicationContext().getContentResolver().query(this.f20530a, b(), null, null, (i5 > 28 ? "date_modified" : "datetaken").concat(" DESC"));
                    if (query != null) {
                        while (query.moveToNext() && arrayList.size() < 33) {
                            try {
                                if (!TextUtils.isEmpty(query.getString(query.getColumnIndex("_data")))) {
                                    long j = query.getLong(query.getColumnIndex("_id"));
                                    String string = query.getString(query.getColumnIndex("bucket_display_name"));
                                    String str2 = string == null ? "" : string;
                                    int i10 = Build.VERSION.SDK_INT;
                                    if (i10 >= 30) {
                                        str = query.getString(i10 >= 29 ? query.getColumnIndex("volume_name") : -1);
                                    } else {
                                        str = null;
                                    }
                                    if (i10 >= 30) {
                                        Intrinsics.checkNotNull(str);
                                        withAppendedId = MediaStore.Images.Media.getContentUri(str, j);
                                        Intrinsics.checkNotNullExpressionValue(withAppendedId, "getContentUri(...)");
                                    } else {
                                        withAppendedId = ContentUris.withAppendedId(this.f20530a, j);
                                        Intrinsics.checkNotNullExpressionValue(withAppendedId, "withAppendedId(...)");
                                    }
                                    Uri uri = withAppendedId;
                                    if (str == null) {
                                        str = "";
                                    }
                                    arrayList.add(new lc.e(j, uri, str2, str));
                                }
                            } catch (Exception e7) {
                                e = e7;
                                cursor = query;
                                zc.d.b(4, "getGalleryPicture", e);
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return arrayList;
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = query;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                    }
                    if (query != null) {
                        query.close();
                        return arrayList;
                    }
                } catch (Exception e9) {
                    e = e9;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e10) {
            e = e10;
        }
        return arrayList;
    }
}
