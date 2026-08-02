package androidx.loader.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.loader.content.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import l0.AbstractC5336a;
import u0.l;

/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: a, reason: collision with root package name */
    public final c.a f20435a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f20436b;

    /* renamed from: c, reason: collision with root package name */
    public String f20437c;

    /* renamed from: d, reason: collision with root package name */
    public String f20438d;

    /* renamed from: e, reason: collision with root package name */
    public Cursor f20439e;

    /* renamed from: f, reason: collision with root package name */
    public u0.d f20440f;
    private String[] mProjection;
    private String[] mSelectionArgs;

    public b(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.f20435a = new c.a();
        this.f20436b = uri;
        this.mProjection = strArr;
        this.f20437c = str;
        this.mSelectionArgs = strArr2;
        this.f20438d = str2;
    }

    @Override // androidx.loader.content.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void deliverResult(Cursor cursor) {
        if (isReset()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f20439e;
        this.f20439e = cursor;
        if (isStarted()) {
            super.deliverResult(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // androidx.loader.content.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Cursor loadInBackground() {
        synchronized (this) {
            if (isLoadInBackgroundCanceled()) {
                throw new l();
            }
            this.f20440f = new u0.d();
        }
        try {
            Cursor b10 = AbstractC5336a.b(getContext().getContentResolver(), this.f20436b, this.mProjection, this.f20437c, this.mSelectionArgs, this.f20438d, this.f20440f);
            if (b10 != null) {
                try {
                    b10.getCount();
                    b10.registerContentObserver(this.f20435a);
                } catch (RuntimeException e10) {
                    b10.close();
                    throw e10;
                }
            }
            synchronized (this) {
                this.f20440f = null;
            }
            return b10;
        } catch (Throwable th2) {
            synchronized (this) {
                this.f20440f = null;
                throw th2;
            }
        }
    }

    @Override // androidx.loader.content.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onCanceled(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    @Override // androidx.loader.content.a
    public void cancelLoadInBackground() {
        super.cancelLoadInBackground();
        synchronized (this) {
            try {
                u0.d dVar = this.f20440f;
                if (dVar != null) {
                    dVar.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.loader.content.a, androidx.loader.content.c
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f20436b);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.mProjection));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f20437c);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.mSelectionArgs));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f20438d);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f20439e);
    }

    @Override // androidx.loader.content.c
    public void onReset() {
        super.onReset();
        onStopLoading();
        Cursor cursor = this.f20439e;
        if (cursor != null && !cursor.isClosed()) {
            this.f20439e.close();
        }
        this.f20439e = null;
    }

    @Override // androidx.loader.content.c
    public void onStartLoading() {
        Cursor cursor = this.f20439e;
        if (cursor != null) {
            deliverResult(cursor);
        }
        if (takeContentChanged() || this.f20439e == null) {
            forceLoad();
        }
    }

    @Override // androidx.loader.content.c
    public void onStopLoading() {
        cancelLoad();
    }
}
