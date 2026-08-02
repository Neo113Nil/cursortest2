package com.google.android.gms.internal.mlkit_vision_common;

import Sh.a;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import r8.b;
import r8.c;
import r8.d;
import r8.e;
import r8.f;

/* loaded from: classes9.dex */
final class zzak implements e {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final c zzb = a.c(1, c.a("key"));
    private static final c zzc = a.c(2, c.a(AppMeasurementSdk.ConditionalUserProperty.VALUE));
    private static final d zzd = new d() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzaj
        @Override // r8.d
        public final void encode(Object obj, Object obj2) {
            zzak.zzg((Map.Entry) obj, (e) obj2);
        }
    };
    private OutputStream zze;
    private final Map zzf;
    private final Map zzg;
    private final d zzh;
    private final zzao zzi = new zzao(this);

    zzak(OutputStream outputStream, Map map, Map map2, d dVar) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = dVar;
    }

    static /* synthetic */ void zzg(Map.Entry entry, e eVar) throws IOException {
        eVar.add(zzb, entry.getKey());
        eVar.add(zzc, entry.getValue());
    }

    private static int zzh(c cVar) {
        zzai zzaiVar = (zzai) cVar.c(zzai.class);
        if (zzaiVar != null) {
            return zzaiVar.zza();
        }
        throw new b("Field has no @Protobuf config");
    }

    private final long zzi(d dVar, Object obj) throws IOException {
        zzaf zzafVar = new zzaf();
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzafVar;
            try {
                dVar.encode(obj, this);
                this.zze = outputStream;
                long zza2 = zzafVar.zza();
                zzafVar.close();
                return zza2;
            } catch (Throwable th2) {
                this.zze = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                zzafVar.close();
            } catch (Throwable th4) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                } catch (Exception unused) {
                }
            }
            throw th3;
        }
    }

    private static zzai zzj(c cVar) {
        zzai zzaiVar = (zzai) cVar.c(zzai.class);
        if (zzaiVar != null) {
            return zzaiVar;
        }
        throw new b("Field has no @Protobuf config");
    }

    private final zzak zzk(d dVar, c cVar, Object obj, boolean z11) throws IOException {
        long zzi = zzi(dVar, obj);
        if (z11 && zzi == 0) {
            return this;
        }
        zzn((zzh(cVar) << 3) | 2);
        zzo(zzi);
        dVar.encode(obj, this);
        return this;
    }

    private final zzak zzl(f fVar, c cVar, Object obj, boolean z11) throws IOException {
        this.zzi.zza(cVar, z11);
        fVar.encode(obj, this.zzi);
        return this;
    }

    private static ByteBuffer zzm(int i11) {
        return ByteBuffer.allocate(i11).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i11) throws IOException {
        while ((i11 & (-128)) != 0) {
            this.zze.write((i11 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            i11 >>>= 7;
        }
        this.zze.write(i11 & 127);
    }

    private final void zzo(long j11) throws IOException {
        while (((-128) & j11) != 0) {
            this.zze.write((((int) j11) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            j11 >>>= 7;
        }
        this.zze.write(((int) j11) & 127);
    }

    @NonNull
    public final e add(@NonNull c cVar, double d11) throws IOException {
        zza(cVar, d11, true);
        return this;
    }

    @NonNull
    public final e inline(Object obj) throws IOException {
        zzf(obj);
        return this;
    }

    @NonNull
    public final e nested(@NonNull c cVar) throws IOException {
        throw new b("nested() is not implemented for protobuf encoding.");
    }

    final e zza(@NonNull c cVar, double d11, boolean z11) throws IOException {
        if (z11 && d11 == 0.0d) {
            return this;
        }
        zzn((zzh(cVar) << 3) | 1);
        this.zze.write(zzm(8).putDouble(d11).array());
        return this;
    }

    final e zzb(@NonNull c cVar, float f7, boolean z11) throws IOException {
        if (z11 && f7 == 0.0f) {
            return this;
        }
        zzn((zzh(cVar) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f7).array());
        return this;
    }

    final e zzc(@NonNull c cVar, Object obj, boolean z11) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z11 || charSequence.length() != 0) {
                    zzn((zzh(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(zza);
                    zzn(bytes.length);
                    this.zze.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    zzc(cVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    zzk(zzd, cVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    zza(cVar, ((Double) obj).doubleValue(), z11);
                    return this;
                }
                if (obj instanceof Float) {
                    zzb(cVar, ((Float) obj).floatValue(), z11);
                    return this;
                }
                if (obj instanceof Number) {
                    zze(cVar, ((Number) obj).longValue(), z11);
                    return this;
                }
                if (obj instanceof Boolean) {
                    zzd(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z11);
                    return this;
                }
                if (!(obj instanceof byte[])) {
                    d dVar = (d) this.zzf.get(obj.getClass());
                    if (dVar != null) {
                        zzk(dVar, cVar, obj, z11);
                        return this;
                    }
                    f fVar = (f) this.zzg.get(obj.getClass());
                    if (fVar != null) {
                        zzl(fVar, cVar, obj, z11);
                        return this;
                    }
                    if (obj instanceof zzag) {
                        zzd(cVar, ((zzag) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        zzd(cVar, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    zzk(this.zzh, cVar, obj, z11);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z11 || bArr.length != 0) {
                    zzn((zzh(cVar) << 3) | 2);
                    zzn(bArr.length);
                    this.zze.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    final zzak zzd(@NonNull c cVar, int i11, boolean z11) throws IOException {
        if (!z11 || i11 != 0) {
            zzai zzj = zzj(cVar);
            zzah zzahVar = zzah.DEFAULT;
            int ordinal = zzj.zzb().ordinal();
            if (ordinal == 0) {
                zzn(zzj.zza() << 3);
                zzn(i11);
                return this;
            }
            if (ordinal == 1) {
                zzn(zzj.zza() << 3);
                zzn((i11 + i11) ^ (i11 >> 31));
                return this;
            }
            if (ordinal == 2) {
                zzn((zzj.zza() << 3) | 5);
                this.zze.write(zzm(4).putInt(i11).array());
                return this;
            }
        }
        return this;
    }

    final zzak zze(@NonNull c cVar, long j11, boolean z11) throws IOException {
        if (!z11 || j11 != 0) {
            zzai zzj = zzj(cVar);
            zzah zzahVar = zzah.DEFAULT;
            int ordinal = zzj.zzb().ordinal();
            if (ordinal == 0) {
                zzn(zzj.zza() << 3);
                zzo(j11);
                return this;
            }
            if (ordinal == 1) {
                zzn(zzj.zza() << 3);
                zzo((j11 >> 63) ^ (j11 + j11));
                return this;
            }
            if (ordinal == 2) {
                zzn((zzj.zza() << 3) | 1);
                this.zze.write(zzm(8).putLong(j11).array());
                return this;
            }
        }
        return this;
    }

    final zzak zzf(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        d dVar = (d) this.zzf.get(obj.getClass());
        if (dVar == null) {
            throw new b("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        dVar.encode(obj, this);
        return this;
    }

    @NonNull
    public final e add(@NonNull c cVar, float f7) throws IOException {
        zzb(cVar, f7, true);
        return this;
    }

    @Override // r8.e
    @NonNull
    public final /* synthetic */ e add(@NonNull c cVar, int i11) throws IOException {
        zzd(cVar, i11, true);
        return this;
    }

    @Override // r8.e
    @NonNull
    public final /* synthetic */ e add(@NonNull c cVar, long j11) throws IOException {
        zze(cVar, j11, true);
        return this;
    }

    @NonNull
    public final e nested(@NonNull String str) throws IOException {
        return nested(c.d(str));
    }

    @Override // r8.e
    @NonNull
    public final e add(@NonNull c cVar, Object obj) throws IOException {
        zzc(cVar, obj, true);
        return this;
    }

    @NonNull
    public final /* synthetic */ e add(@NonNull c cVar, boolean z11) throws IOException {
        zzd(cVar, z11 ? 1 : 0, true);
        return this;
    }

    @NonNull
    public final e add(@NonNull String str, double d11) throws IOException {
        zza(c.d(str), d11, true);
        return this;
    }

    @NonNull
    public final e add(@NonNull String str, int i11) throws IOException {
        zzd(c.d(str), i11, true);
        return this;
    }

    @NonNull
    public final e add(@NonNull String str, long j11) throws IOException {
        zze(c.d(str), j11, true);
        return this;
    }

    @NonNull
    public final e add(@NonNull String str, Object obj) throws IOException {
        zzc(c.d(str), obj, true);
        return this;
    }

    @NonNull
    public final e add(@NonNull String str, boolean z11) throws IOException {
        zzd(c.d(str), z11 ? 1 : 0, true);
        return this;
    }
}
