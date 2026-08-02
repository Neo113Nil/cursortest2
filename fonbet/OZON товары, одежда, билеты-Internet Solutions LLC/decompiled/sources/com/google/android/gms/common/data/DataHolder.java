package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.sqlite.CursorWrapper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@KeepForSdk
@KeepName
@SafeParcelable.Class(creator = "DataHolderCreator", validate = true)
/* loaded from: classes9.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zaf();
    private static final Builder zaf = new zab(new String[0], null);

    @SafeParcelable.VersionField(id = 1000)
    final int zaa;
    Bundle zab;
    int[] zac;
    int zad;
    boolean zae;

    @SafeParcelable.Field(getter = "getColumns", id = 1)
    private final String[] zag;

    @SafeParcelable.Field(getter = "getWindows", id = 2)
    private final CursorWindow[] zah;

    @SafeParcelable.Field(getter = "getStatusCode", id = 3)
    private final int zai;

    @SafeParcelable.Field(getter = "getMetadata", id = 4)
    private final Bundle zaj;
    private boolean zak;

    @KeepForSdk
    public static class Builder {
        private final String[] zaa;
        private final ArrayList zab = new ArrayList();
        private final HashMap zac = new HashMap();

        /* synthetic */ Builder(String[] strArr, String str, zac zacVar) {
            this.zaa = (String[]) Preconditions.checkNotNull(strArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NonNull
        @KeepForSdk
        public DataHolder build(int i11) {
            return new DataHolder(this, i11);
        }

        @NonNull
        @KeepForSdk
        public Builder withRow(@NonNull ContentValues contentValues) {
            Asserts.checkNotNull(contentValues);
            HashMap hashMap = new HashMap(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return zaa(hashMap);
        }

        @NonNull
        public Builder zaa(@NonNull HashMap hashMap) {
            Asserts.checkNotNull(hashMap);
            this.zab.add(hashMap);
            return this;
        }

        @NonNull
        @KeepForSdk
        public DataHolder build(int i11, @NonNull Bundle bundle) {
            return new DataHolder(this, i11, bundle);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    @KeepForSdk
    public static Builder builder(@NonNull String[] strArr) {
        return new Builder(strArr, null, 0 == true ? 1 : 0);
    }

    @NonNull
    @KeepForSdk
    public static DataHolder empty(int i11) {
        return new DataHolder(zaf, i11, (Bundle) null);
    }

    private final void zae(String str, int i11) {
        Bundle bundle = this.zab;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        }
        if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i11 < 0 || i11 >= this.zad) {
            throw new CursorIndexOutOfBoundsException(i11, this.zad);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0136, code lost:
    
        if (r5 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0138, code lost:
    
        android.util.Log.d("DataHolder", "Couldn't populate window data for row " + r4 + " - allocating new window.");
        r2.freeLastRow();
        r2 = new android.database.CursorWindow(false);
        r2.setStartPosition(r4);
        r2.setNumColumns(r13.zaa.length);
        r3.add(r2);
        r4 = r4 - 1;
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016a, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0174, code lost:
    
        throw new com.google.android.gms.common.data.zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static CursorWindow[] zaf(Builder builder, int i11) {
        if (builder.zaa.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList arrayList = builder.zab;
        int size = arrayList.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cursorWindow);
        cursorWindow.setNumColumns(builder.zaa.length);
        int i12 = 0;
        boolean z11 = false;
        while (i12 < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    Log.d("DataHolder", "Allocating additional cursor window for large data set (row " + i12 + ")");
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i12);
                    cursorWindow.setNumColumns(builder.zaa.length);
                    arrayList2.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList2.remove(cursorWindow);
                        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                    }
                }
                Map map = (Map) arrayList.get(i12);
                int i13 = 0;
                boolean z12 = true;
                while (true) {
                    if (i13 < builder.zaa.length) {
                        if (!z12) {
                            break;
                        }
                        String str = builder.zaa[i13];
                        Object obj = map.get(str);
                        if (obj == null) {
                            z12 = cursorWindow.putNull(i12, i13);
                        } else if (obj instanceof String) {
                            z12 = cursorWindow.putString((String) obj, i12, i13);
                        } else if (obj instanceof Long) {
                            z12 = cursorWindow.putLong(((Long) obj).longValue(), i12, i13);
                        } else if (obj instanceof Integer) {
                            z12 = cursorWindow.putLong(((Integer) obj).intValue(), i12, i13);
                        } else if (obj instanceof Boolean) {
                            z12 = cursorWindow.putLong(true != ((Boolean) obj).booleanValue() ? 0L : 1L, i12, i13);
                        } else if (obj instanceof byte[]) {
                            z12 = cursorWindow.putBlob((byte[]) obj, i12, i13);
                        } else if (obj instanceof Double) {
                            z12 = cursorWindow.putDouble(((Double) obj).doubleValue(), i12, i13);
                        } else {
                            if (!(obj instanceof Float)) {
                                throw new IllegalArgumentException("Unsupported object for column " + str + ": " + obj.toString());
                            }
                            z12 = cursorWindow.putDouble(((Float) obj).floatValue(), i12, i13);
                        }
                        i13++;
                    } else if (z12) {
                        z11 = false;
                    }
                }
            } catch (RuntimeException e11) {
                int size2 = arrayList2.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    ((CursorWindow) arrayList2.get(i14)).close();
                }
                throw e11;
            }
        }
        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    public void close() {
        synchronized (this) {
            try {
                if (!this.zae) {
                    this.zae = true;
                    int i11 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.zah;
                        if (i11 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i11].close();
                        i11++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.zak && this.zah.length > 0 && !isClosed()) {
                close();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public boolean getBoolean(@NonNull String str, int i11, int i12) {
        zae(str, i11);
        return this.zah[i12].getLong(i11, this.zab.getInt(str)) == 1;
    }

    @NonNull
    @KeepForSdk
    public byte[] getByteArray(@NonNull String str, int i11, int i12) {
        zae(str, i11);
        return this.zah[i12].getBlob(i11, this.zab.getInt(str));
    }

    @KeepForSdk
    public int getCount() {
        return this.zad;
    }

    @KeepForSdk
    public int getInteger(@NonNull String str, int i11, int i12) {
        zae(str, i11);
        return this.zah[i12].getInt(i11, this.zab.getInt(str));
    }

    @KeepForSdk
    public long getLong(@NonNull String str, int i11, int i12) {
        zae(str, i11);
        return this.zah[i12].getLong(i11, this.zab.getInt(str));
    }

    @KeepForSdk
    public Bundle getMetadata() {
        return this.zaj;
    }

    @KeepForSdk
    public int getStatusCode() {
        return this.zai;
    }

    @NonNull
    @KeepForSdk
    public String getString(@NonNull String str, int i11, int i12) {
        zae(str, i11);
        return this.zah[i12].getString(i11, this.zab.getInt(str));
    }

    @KeepForSdk
    public int getWindowIndex(int i11) {
        int length;
        int i12 = 0;
        Preconditions.checkState(i11 >= 0 && i11 < this.zad);
        while (true) {
            int[] iArr = this.zac;
            length = iArr.length;
            if (i12 >= length) {
                break;
            }
            if (i11 < iArr[i12]) {
                i12--;
                break;
            }
            i12++;
        }
        return i12 == length ? i12 - 1 : i12;
    }

    @KeepForSdk
    public boolean hasColumn(@NonNull String str) {
        return this.zab.containsKey(str);
    }

    @KeepForSdk
    public boolean hasNull(@NonNull String str, int i11, int i12) {
        zae(str, i11);
        return this.zah[i12].isNull(i11, this.zab.getInt(str));
    }

    @KeepForSdk
    public boolean isClosed() {
        boolean z11;
        synchronized (this) {
            z11 = this.zae;
        }
        return z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        String[] strArr = this.zag;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, strArr, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zah, i11, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zaa);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if ((i11 & 1) != 0) {
            close();
        }
    }

    public final double zaa(@NonNull String str, int i11, int i12) {
        zae(str, i11);
        return this.zah[i12].getDouble(i11, this.zab.getInt(str));
    }

    public final float zab(@NonNull String str, int i11, int i12) {
        zae(str, i11);
        return this.zah[i12].getFloat(i11, this.zab.getInt(str));
    }

    public final void zac(@NonNull String str, int i11, int i12, @NonNull CharArrayBuffer charArrayBuffer) {
        zae(str, i11);
        this.zah[i12].copyStringToBuffer(i11, this.zab.getInt(str), charArrayBuffer);
    }

    public final void zad() {
        this.zab = new Bundle();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            String[] strArr = this.zag;
            if (i12 >= strArr.length) {
                break;
            }
            this.zab.putInt(strArr[i12], i12);
            i12++;
        }
        this.zac = new int[this.zah.length];
        int i13 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.zah;
            if (i11 >= cursorWindowArr.length) {
                this.zad = i13;
                return;
            }
            this.zac[i11] = i13;
            i13 += this.zah[i11].getNumRows() - (i13 - cursorWindowArr[i11].getStartPosition());
            i11++;
        }
    }

    @SafeParcelable.Constructor
    DataHolder(@SafeParcelable.Param(id = 1000) int i11, @SafeParcelable.Param(id = 1) String[] strArr, @SafeParcelable.Param(id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.Param(id = 3) int i12, @SafeParcelable.Param(id = 4) Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = i11;
        this.zag = strArr;
        this.zah = cursorWindowArr;
        this.zai = i12;
        this.zaj = bundle;
    }

    @KeepForSdk
    public DataHolder(@NonNull String[] strArr, @NonNull CursorWindow[] cursorWindowArr, int i11, Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = 1;
        this.zag = (String[]) Preconditions.checkNotNull(strArr);
        this.zah = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.zai = i11;
        this.zaj = bundle;
        zad();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DataHolder(@NonNull Cursor cursor, int i11, Bundle bundle) {
        this(r8, (CursorWindow[]) r1.toArray(new CursorWindow[r1.size()]), i11, bundle);
        int i12;
        CursorWrapper cursorWrapper = new CursorWrapper(cursor);
        String[] columnNames = cursorWrapper.getColumnNames();
        ArrayList arrayList = new ArrayList();
        try {
            int count = cursorWrapper.getCount();
            CursorWindow window = cursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                i12 = 0;
            } else {
                window.acquireReference();
                cursorWrapper.setWindow(null);
                arrayList.add(window);
                i12 = window.getNumRows();
            }
            while (i12 < count) {
                if (!cursorWrapper.moveToPosition(i12)) {
                    break;
                }
                CursorWindow window2 = cursorWrapper.getWindow();
                if (window2 != null) {
                    window2.acquireReference();
                    cursorWrapper.setWindow(null);
                } else {
                    window2 = new CursorWindow(false);
                    window2.setStartPosition(i12);
                    cursorWrapper.fillWindow(i12, window2);
                }
                if (window2.getNumRows() == 0) {
                    break;
                }
                arrayList.add(window2);
                i12 = window2.getStartPosition() + window2.getNumRows();
            }
            cursorWrapper.close();
        } catch (Throwable th2) {
            cursorWrapper.close();
            throw th2;
        }
    }

    private DataHolder(Builder builder, int i11, Bundle bundle) {
        this(builder.zaa, zaf(builder, -1), i11, (Bundle) null);
    }
}
