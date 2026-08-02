package io.sentry.android.sqlite;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.CrossProcessCursor;
import android.database.CursorWindow;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.v0;
import io.sentry.android.replay.n;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements CrossProcessCursor {

    /* renamed from: a, reason: collision with root package name */
    public final CrossProcessCursor f16185a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f16186b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16187c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16188d;

    public c(CrossProcessCursor delegate, v0 spanManager, String sql) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(spanManager, "spanManager");
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f16185a = delegate;
        this.f16186b = spanManager;
        this.f16187c = sql;
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16185a.close();
    }

    @Override // android.database.Cursor
    public final void copyStringToBuffer(int i5, CharArrayBuffer charArrayBuffer) {
        this.f16185a.copyStringToBuffer(i5, charArrayBuffer);
    }

    @Override // android.database.Cursor
    public final void deactivate() {
        this.f16185a.deactivate();
    }

    @Override // android.database.CrossProcessCursor
    public final void fillWindow(int i5, CursorWindow cursorWindow) {
        if (this.f16188d) {
            this.f16185a.fillWindow(i5, cursorWindow);
            return;
        }
        this.f16188d = true;
        this.f16186b.U(this.f16187c, new a(this, i5, cursorWindow));
    }

    @Override // android.database.Cursor
    public final byte[] getBlob(int i5) {
        return this.f16185a.getBlob(i5);
    }

    @Override // android.database.Cursor
    public final int getColumnCount() {
        return this.f16185a.getColumnCount();
    }

    @Override // android.database.Cursor
    public final int getColumnIndex(String str) {
        return this.f16185a.getColumnIndex(str);
    }

    @Override // android.database.Cursor
    public final int getColumnIndexOrThrow(String str) {
        return this.f16185a.getColumnIndexOrThrow(str);
    }

    @Override // android.database.Cursor
    public final String getColumnName(int i5) {
        return this.f16185a.getColumnName(i5);
    }

    @Override // android.database.Cursor
    public final String[] getColumnNames() {
        return this.f16185a.getColumnNames();
    }

    @Override // android.database.Cursor
    public final int getCount() {
        if (this.f16188d) {
            return this.f16185a.getCount();
        }
        this.f16188d = true;
        return ((Number) this.f16186b.U(this.f16187c, new n(4, this))).intValue();
    }

    @Override // android.database.Cursor
    public final double getDouble(int i5) {
        return this.f16185a.getDouble(i5);
    }

    @Override // android.database.Cursor
    public final Bundle getExtras() {
        return this.f16185a.getExtras();
    }

    @Override // android.database.Cursor
    public final float getFloat(int i5) {
        return this.f16185a.getFloat(i5);
    }

    @Override // android.database.Cursor
    public final int getInt(int i5) {
        return this.f16185a.getInt(i5);
    }

    @Override // android.database.Cursor
    public final long getLong(int i5) {
        return this.f16185a.getLong(i5);
    }

    @Override // android.database.Cursor
    public final Uri getNotificationUri() {
        return this.f16185a.getNotificationUri();
    }

    @Override // android.database.Cursor
    public final int getPosition() {
        return this.f16185a.getPosition();
    }

    @Override // android.database.Cursor
    public final short getShort(int i5) {
        return this.f16185a.getShort(i5);
    }

    @Override // android.database.Cursor
    public final String getString(int i5) {
        return this.f16185a.getString(i5);
    }

    @Override // android.database.Cursor
    public final int getType(int i5) {
        return this.f16185a.getType(i5);
    }

    @Override // android.database.Cursor
    public final boolean getWantsAllOnMoveCalls() {
        return this.f16185a.getWantsAllOnMoveCalls();
    }

    @Override // android.database.CrossProcessCursor
    public final CursorWindow getWindow() {
        return this.f16185a.getWindow();
    }

    @Override // android.database.Cursor
    public final boolean isAfterLast() {
        return this.f16185a.isAfterLast();
    }

    @Override // android.database.Cursor
    public final boolean isBeforeFirst() {
        return this.f16185a.isBeforeFirst();
    }

    @Override // android.database.Cursor
    public final boolean isClosed() {
        return this.f16185a.isClosed();
    }

    @Override // android.database.Cursor
    public final boolean isFirst() {
        return this.f16185a.isFirst();
    }

    @Override // android.database.Cursor
    public final boolean isLast() {
        return this.f16185a.isLast();
    }

    @Override // android.database.Cursor
    public final boolean isNull(int i5) {
        return this.f16185a.isNull(i5);
    }

    @Override // android.database.Cursor
    public final boolean move(int i5) {
        return this.f16185a.move(i5);
    }

    @Override // android.database.Cursor
    public final boolean moveToFirst() {
        return this.f16185a.moveToFirst();
    }

    @Override // android.database.Cursor
    public final boolean moveToLast() {
        return this.f16185a.moveToLast();
    }

    @Override // android.database.Cursor
    public final boolean moveToNext() {
        return this.f16185a.moveToNext();
    }

    @Override // android.database.Cursor
    public final boolean moveToPosition(int i5) {
        return this.f16185a.moveToPosition(i5);
    }

    @Override // android.database.Cursor
    public final boolean moveToPrevious() {
        return this.f16185a.moveToPrevious();
    }

    @Override // android.database.CrossProcessCursor
    public final boolean onMove(int i5, int i10) {
        if (this.f16188d) {
            return this.f16185a.onMove(i5, i10);
        }
        this.f16188d = true;
        return ((Boolean) this.f16186b.U(this.f16187c, new b(this, i5, i10))).booleanValue();
    }

    @Override // android.database.Cursor
    public final void registerContentObserver(ContentObserver contentObserver) {
        this.f16185a.registerContentObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f16185a.registerDataSetObserver(dataSetObserver);
    }

    @Override // android.database.Cursor
    public final boolean requery() {
        return this.f16185a.requery();
    }

    @Override // android.database.Cursor
    public final Bundle respond(Bundle bundle) {
        return this.f16185a.respond(bundle);
    }

    @Override // android.database.Cursor
    public final void setExtras(Bundle bundle) {
        this.f16185a.setExtras(bundle);
    }

    @Override // android.database.Cursor
    public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        this.f16185a.setNotificationUri(contentResolver, uri);
    }

    @Override // android.database.Cursor
    public final void unregisterContentObserver(ContentObserver contentObserver) {
        this.f16185a.unregisterContentObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f16185a.unregisterDataSetObserver(dataSetObserver);
    }
}
