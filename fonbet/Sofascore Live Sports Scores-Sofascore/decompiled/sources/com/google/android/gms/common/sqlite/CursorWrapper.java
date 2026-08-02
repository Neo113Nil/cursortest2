package com.google.android.gms.common.sqlite;

import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public class CursorWrapper extends android.database.CursorWrapper implements CrossProcessCursor {
    @Override // android.database.CrossProcessCursor
    public final void fillWindow(int i, CursorWindow cursorWindow) {
        throw null;
    }

    @Override // android.database.CrossProcessCursor
    public final CursorWindow getWindow() {
        throw null;
    }

    @Override // android.database.CursorWrapper
    public final /* synthetic */ Cursor getWrappedCursor() {
        return null;
    }

    @Override // android.database.CrossProcessCursor
    public final boolean onMove(int i, int i2) {
        throw null;
    }
}
