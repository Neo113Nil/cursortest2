package zendesk.core;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.util.Log;
import java.util.Arrays;
import l0.AbstractC5339d;

/* loaded from: classes5.dex */
public class MediaFileProvider extends AbstractC5339d {
    private static final String LOG_TAG = "MediaFileProvider";

    private String[] columnNamesWithData(String[] strArr) {
        for (String str : strArr) {
            if ("_data".equals(str)) {
                return strArr;
            }
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
        strArr2[strArr.length] = "_data";
        return strArr2;
    }

    @Override // l0.AbstractC5339d, android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor query = super.query(uri, strArr, str, strArr2, str2);
        if (query == null) {
            Log.w(LOG_TAG, "Not able to apply workaround, super.query(...) returned null");
            return null;
        }
        String[] columnNames = query.getColumnNames();
        MatrixCursor matrixCursor = new MatrixCursor(columnNamesWithData(columnNames), query.getCount());
        query.moveToPosition(-1);
        while (query.moveToNext()) {
            MatrixCursor.RowBuilder newRow = matrixCursor.newRow();
            for (int i10 = 0; i10 < columnNames.length; i10++) {
                newRow.add(query.getString(i10));
            }
        }
        query.close();
        return matrixCursor;
    }
}
