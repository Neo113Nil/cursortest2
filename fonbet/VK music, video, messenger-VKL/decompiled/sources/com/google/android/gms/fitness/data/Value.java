package com.google.android.gms.fitness.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import xsna.dq70;
import xsna.exc0;
import xsna.ozg0;
import xsna.sxz0;
import xsna.zk3;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class Value extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Value> CREATOR = new sxz0();
    public final int b;
    public final boolean c;
    public final float d;

    @Nullable
    public final String e;

    @Nullable
    public final zk3 f;

    @Nullable
    public final int[] g;

    @Nullable
    public final float[] h;

    @Nullable
    public final byte[] i;

    public Value(int i, boolean z, float f, @Nullable String str, @Nullable Bundle bundle, @Nullable int[] iArr, @Nullable float[] fArr, @Nullable byte[] bArr) {
        zk3 zk3Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = str;
        if (bundle == null) {
            zk3Var = null;
        } else {
            ClassLoader classLoader = MapValue.class.getClassLoader();
            exc0.i(classLoader);
            bundle.setClassLoader(classLoader);
            zk3Var = new zk3(bundle.size());
            for (String str2 : bundle.keySet()) {
                MapValue mapValue = (MapValue) bundle.getParcelable(str2);
                exc0.i(mapValue);
                zk3Var.put(str2, mapValue);
            }
        }
        this.f = zk3Var;
        this.g = iArr;
        this.h = fArr;
        this.i = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj != this) {
            if (!(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            int i = value.b;
            int i2 = this.b;
            if (i2 != i || this.c != value.c) {
                return false;
            }
            if (i2 != 1) {
                if (i2 == 3) {
                    return dq70.b(this.e, value.e);
                }
                if (i2 == 4) {
                    return dq70.b(this.f, value.f);
                }
                if (i2 == 5) {
                    return Arrays.equals(this.g, value.g);
                }
                if (i2 == 6) {
                    return Arrays.equals(this.h, value.h);
                }
                if (i2 == 7) {
                    return Arrays.equals(this.i, value.i);
                }
                if (this.d != value.d) {
                    return false;
                }
            } else if (j() != value.j()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.d), this.e, this.f, this.g, this.h, this.i});
    }

    public final float i() {
        exc0.k("Value is not in float format", this.b == 2);
        return this.d;
    }

    public final int j() {
        exc0.k("Value is not in int format", this.b == 1);
        return Float.floatToRawIntBits(this.d);
    }

    @NonNull
    public final String toString() {
        String str;
        if (!this.c) {
            return "unset";
        }
        switch (this.b) {
            case 1:
                return Integer.toString(j());
            case 2:
                return Float.toString(this.d);
            case 3:
                String str2 = this.e;
                return str2 == null ? "" : str2;
            case 4:
                zk3 zk3Var = this.f;
                if (zk3Var != null) {
                    return new TreeMap(zk3Var).toString();
                }
            case 5:
                return Arrays.toString(this.g);
            case 6:
                return Arrays.toString(this.h);
            case 7:
                byte[] bArr = this.i;
                if (bArr != null) {
                    int length = bArr.length;
                    int length2 = bArr.length;
                    if (length2 == 0 || length <= 0 || length > length2) {
                        str = null;
                    } else {
                        StringBuilder sb = new StringBuilder(((length + 15) / 16) * 57);
                        int i = length;
                        int i2 = 0;
                        int i3 = 0;
                        while (i > 0) {
                            if (i2 == 0) {
                                if (length < 65536) {
                                    sb.append(String.format("%04X:", Integer.valueOf(i3)));
                                } else {
                                    sb.append(String.format("%08X:", Integer.valueOf(i3)));
                                }
                            } else if (i2 == 8) {
                                sb.append(" -");
                            }
                            sb.append(String.format(" %02X", Integer.valueOf(bArr[i3] & 255)));
                            i--;
                            i2++;
                            if (i2 == 16 || i == 0) {
                                sb.append('\n');
                                i2 = 0;
                            }
                            i3++;
                        }
                        str = sb.toString();
                    }
                    if (str != null) {
                        return str;
                    }
                }
            default:
                return "unknown";
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        Bundle bundle;
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ozg0.v(parcel, 3, 4);
        parcel.writeFloat(this.d);
        ozg0.q(parcel, 4, this.e, false);
        zk3 zk3Var = this.f;
        if (zk3Var == null) {
            bundle = null;
        } else {
            Bundle bundle2 = new Bundle(zk3Var.d);
            Iterator it = ((zk3.a) zk3Var.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                bundle2.putParcelable((String) entry.getKey(), (Parcelable) entry.getValue());
            }
            bundle = bundle2;
        }
        ozg0.d(parcel, 5, bundle, false);
        ozg0.i(parcel, 6, this.g, false);
        float[] fArr = this.h;
        if (fArr != null) {
            int w2 = ozg0.w(7, parcel);
            parcel.writeFloatArray(fArr);
            ozg0.x(w2, parcel);
        }
        ozg0.e(parcel, 8, this.i, false);
        ozg0.x(w, parcel);
    }
}
