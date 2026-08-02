package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import xsna.exc0;
import xsna.i5s;
import xsna.lh01;
import xsna.ozg0;
import xsna.y57;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public class DataSource extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DataSource> CREATOR;
    public static final String h;
    public static final String i;
    public final DataType b;
    public final int c;

    @Nullable
    public final Device d;

    @Nullable
    public final zzb e;
    public final String f;
    public final String g;

    /* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
    public static final class a {
        public DataType a;
        public zzb c;
        public int b = -1;
        public String d = "";

        @NonNull
        public final DataSource a() {
            exc0.k("Must set data type", this.a != null);
            exc0.k("Must set data source type", this.b >= 0);
            return new DataSource(this.a, this.b, null, this.c, this.d);
        }

        @NonNull
        public final void b() {
            this.c = zzb.c;
        }

        @NonNull
        public final void c(@NonNull DataType dataType) {
            this.a = dataType;
        }

        @NonNull
        public final void d() {
            this.d = "estimated_steps";
        }

        @NonNull
        public final void e() {
            this.b = 1;
        }
    }

    static {
        Locale locale = Locale.ROOT;
        h = "RAW".toLowerCase(locale);
        i = "DERIVED".toLowerCase(locale);
        CREATOR = new lh01();
    }

    public DataSource(DataType dataType, int i2, @Nullable Device device, @Nullable zzb zzbVar, String str) {
        this.b = dataType;
        this.c = i2;
        this.d = device;
        this.e = zzbVar;
        this.f = str;
        StringBuilder sb = new StringBuilder();
        sb.append(i2 != 0 ? i : h);
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb.append(dataType.b);
        if (zzbVar != null) {
            sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(zzbVar.b);
        }
        if (device != null) {
            sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(device.zza());
        }
        if (str != null) {
            sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(str);
        }
        this.g = sb.toString();
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DataSource) {
            return this.g.equals(((DataSource) obj).g);
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Nullable
    public final Device i() {
        return this.d;
    }

    @NonNull
    public final String j() {
        return this.g;
    }

    @NonNull
    public final String k() {
        return this.f;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSource{");
        sb.append(this.c != 0 ? i : h);
        zzb zzbVar = this.e;
        if (zzbVar != null) {
            sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(zzbVar);
        }
        Device device = this.d;
        if (device != null) {
            sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(device);
        }
        String str = this.f;
        if (str != null) {
            sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(str);
        }
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.b, i2, false);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.c);
        ozg0.p(parcel, 4, this.d, i2, false);
        ozg0.p(parcel, 5, this.e, i2, false);
        ozg0.q(parcel, 6, this.f, false);
        ozg0.x(w, parcel);
    }

    @NonNull
    public final String zzb() {
        int i2 = this.c;
        String str = i2 != 0 ? i2 != 1 ? "?" : "d" : "r";
        String zzc = this.b.zzc();
        zzb zzbVar = this.e;
        String concat = zzbVar == null ? "" : zzbVar.equals(zzb.c) ? ":gms" : StringUtils.PROCESS_POSTFIX_DELIMITER.concat(String.valueOf(zzbVar.b));
        Device device = this.d;
        String a2 = device != null ? y57.a(StringUtils.PROCESS_POSTFIX_DELIMITER, device.c, StringUtils.PROCESS_POSTFIX_DELIMITER, device.d) : "";
        String str2 = this.f;
        String concat2 = str2 != null ? StringUtils.PROCESS_POSTFIX_DELIMITER.concat(str2) : "";
        StringBuilder b = i5s.b(str, StringUtils.PROCESS_POSTFIX_DELIMITER, zzc, concat, a2);
        b.append(concat2);
        return b.toString();
    }
}
