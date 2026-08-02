package com.google.android.gms.common.data;

import a3.a;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h8.b;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.sentry.android.core.w0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@KeepName
/* loaded from: classes.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    @NonNull
    public static final Parcelable.Creator<DataHolder> CREATOR = new a(27);

    /* renamed from: a, reason: collision with root package name */
    public final int f4482a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f4483b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f4484c;

    /* renamed from: d, reason: collision with root package name */
    public final CursorWindow[] f4485d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4486e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f4487f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f4488g;

    /* renamed from: h, reason: collision with root package name */
    public int f4489h = 1;

    static {
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int i5, String[] strArr, CursorWindow[] cursorWindowArr, int i10, Bundle bundle) {
        this.f4482a = i5;
        this.f4483b = strArr;
        this.f4485d = cursorWindowArr;
        this.f4486e = i10;
        this.f4487f = bundle;
    }

    public final void c() {
        synchronized (this) {
            try {
                int i5 = this.f4489h - 1;
                this.f4489h = i5;
                if (i5 == 0) {
                    for (CursorWindow cursorWindow : this.f4485d) {
                        cursorWindow.releaseReference();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c();
    }

    public final void finalize() {
        try {
            if (this.f4485d.length > 0 && !isClosed()) {
                synchronized (this) {
                    try {
                        if (this.f4489h > 1) {
                            this.f4489h = 1;
                        }
                        c();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String obj = toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 178);
                sb2.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb2.append(obj);
                sb2.append(")");
                w0.d("DataBuffer", sb2.toString());
            }
        } finally {
            super.finalize();
        }
    }

    public final boolean isClosed() {
        boolean z5;
        synchronized (this) {
            z5 = this.f4489h <= 0;
        }
        return z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        String[] strArr = this.f4483b;
        if (strArr != null) {
            int V2 = b.V(parcel, 1);
            parcel.writeStringArray(strArr);
            b.W(parcel, V2);
        }
        b.Q(parcel, 2, this.f4485d, i5);
        b.U(parcel, 3, 4);
        parcel.writeInt(this.f4486e);
        b.F(parcel, 4, this.f4487f);
        b.U(parcel, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 4);
        parcel.writeInt(this.f4482a);
        b.W(parcel, V);
        if ((i5 & 1) != 0) {
            c();
        }
    }
}
