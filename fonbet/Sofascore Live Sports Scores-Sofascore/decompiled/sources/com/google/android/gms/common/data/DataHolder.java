package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.a70;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
@KeepName
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zad();
    public final int a;
    public final String[] b;
    public Bundle c;
    public final CursorWindow[] d;
    public final int e;
    public final Bundle f;
    public int[] g;
    public int h;
    public boolean i = false;
    public final boolean j = true;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @KeepForSdk
    public static class Builder {
    }

    static {
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.a = i;
        this.b = strArr;
        this.d = cursorWindowArr;
        this.e = i2;
        this.f = bundle;
    }

    public final int Y0(int i) {
        int length;
        int i2 = 0;
        Preconditions.l(i >= 0 && i < this.h);
        while (true) {
            int[] iArr = this.g;
            length = iArr.length;
            if (i2 >= length) {
                break;
            }
            if (i < iArr[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == length ? i2 - 1 : i2;
    }

    public final void Z0(int i, String str) {
        boolean z;
        Bundle bundle = this.c;
        if (bundle == null || !bundle.containsKey(str)) {
            a70.p("No such column: ".concat(String.valueOf(str)));
            return;
        }
        synchronized (this) {
            z = this.i;
        }
        if (z) {
            a70.p("Buffer is closed.");
        } else if (i < 0 || i >= this.h) {
            throw new CursorIndexOutOfBoundsException(i, this.h);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                if (!this.i) {
                    this.i = true;
                    int i = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.d;
                        if (i >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i].close();
                        i++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finalize() {
        boolean z;
        try {
            if (this.j && this.d.length > 0) {
                synchronized (this) {
                    z = this.i;
                }
                if (!z) {
                    close();
                    new StringBuilder(String.valueOf(toString()).length() + 178);
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.n(parcel, 1, this.b);
        SafeParcelWriter.p(parcel, 2, this.d, i);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.e);
        SafeParcelWriter.b(parcel, 4, this.f);
        SafeParcelWriter.r(parcel, 1000, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.t(parcel, s);
        if ((i & 1) != 0) {
            close();
        }
    }
}
