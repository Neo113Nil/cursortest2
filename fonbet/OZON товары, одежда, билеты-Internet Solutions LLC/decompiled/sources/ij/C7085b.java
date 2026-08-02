package ij;

import android.app.DownloadManager;
import android.content.Context;
import android.database.Cursor;
import android.os.ParcelFileDescriptor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pj.C8938a;

/* renamed from: ij.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7085b {
    @NotNull
    public static final DownloadManager a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService((Class<Object>) DownloadManager.class);
        Intrinsics.checkNotNullExpressionValue(systemService, "getSystemService(...)");
        return (DownloadManager) systemService;
    }

    public static final int b(@NotNull DownloadManager downloadManager, long j11) {
        Intrinsics.checkNotNullParameter(downloadManager, "<this>");
        Cursor query = downloadManager.query(new DownloadManager.Query().setFilterById(j11));
        try {
            if (!query.moveToFirst()) {
                int i11 = C8938a.f81237c;
                C8938a.b("Download was not found");
                query.close();
                return -1;
            }
            int i12 = query.getInt(query.getColumnIndex("status"));
            int columnIndex = query.getColumnIndex("reason");
            int i13 = columnIndex < 0 ? -1 : query.getInt(columnIndex);
            if (i12 == 8) {
                try {
                    ParcelFileDescriptor openDownloadedFile = downloadManager.openDownloadedFile(j11);
                    try {
                        Unit unit = Unit.f71690a;
                        Vd0.b.a(openDownloadedFile, null);
                    } finally {
                    }
                } catch (Exception e11) {
                    int i14 = C8938a.f81237c;
                    C8938a.c("Download status = -1, file was deleted", e11);
                    query.close();
                    return -1;
                }
            }
            int i15 = C8938a.f81237c;
            C8938a.b("Download status = " + i12 + ", reason = " + i13);
            query.close();
            return i12;
        } finally {
        }
    }
}
