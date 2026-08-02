package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.f7r;
import xsna.mp70;
import xsna.np70;
import xsna.pft0;
import xsna.sq;
import xsna.tjr0;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
final class zzdm implements np70 {
    private static final Charset zza = Charset.forName(C.UTF8_NAME);
    private static final f7r zzb;
    private static final f7r zzc;
    private static final mp70 zzd;
    private OutputStream zze;
    private final Map zzf;
    private final Map zzg;
    private final mp70 zzh;
    private final zzdq zzi = new zzdq(this);

    static {
        zzdk a = pft0.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(a.annotationType(), a);
        zzb = new f7r("key", sq.a(hashMap));
        zzdk a2 = pft0.a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(a2.annotationType(), a2);
        zzc = new f7r("value", sq.a(hashMap2));
        zzd = new mp70() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzdl
            @Override // xsna.wip
            public final void encode(Object obj, np70 np70Var) {
                zzdm.zzg((Map.Entry) obj, np70Var);
            }
        };
    }

    public zzdm(OutputStream outputStream, Map map, Map map2, mp70 mp70Var) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = mp70Var;
    }

    public static /* synthetic */ void zzg(Map.Entry entry, np70 np70Var) throws IOException {
        np70Var.add(zzb, entry.getKey());
        np70Var.add(zzc, entry.getValue());
    }

    private static int zzh(f7r f7rVar) {
        zzdk zzdkVar = (zzdk) f7rVar.a(zzdk.class);
        if (zzdkVar != null) {
            return zzdkVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final long zzi(mp70 mp70Var, Object obj) throws IOException {
        zzdh zzdhVar = new zzdh();
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzdhVar;
            try {
                mp70Var.encode(obj, this);
                this.zze = outputStream;
                long zza2 = zzdhVar.zza();
                zzdhVar.close();
                return zza2;
            } catch (Throwable th) {
                this.zze = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                zzdhVar.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    private static zzdk zzj(f7r f7rVar) {
        zzdk zzdkVar = (zzdk) f7rVar.a(zzdk.class);
        if (zzdkVar != null) {
            return zzdkVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final zzdm zzk(mp70 mp70Var, f7r f7rVar, Object obj, boolean z) throws IOException {
        long zzi = zzi(mp70Var, obj);
        if (z && zzi == 0) {
            return this;
        }
        zzn((zzh(f7rVar) << 3) | 2);
        zzo(zzi);
        mp70Var.encode(obj, this);
        return this;
    }

    private final zzdm zzl(tjr0 tjr0Var, f7r f7rVar, Object obj, boolean z) throws IOException {
        this.zzi.zza(f7rVar, z);
        tjr0Var.encode(obj, this.zzi);
        return this;
    }

    private static ByteBuffer zzm(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.zze.write((i & 127) | 128);
            i >>>= 7;
        }
        this.zze.write(i & 127);
    }

    private final void zzo(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.zze.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.zze.write(((int) j) & 127);
    }

    @Override // xsna.np70
    @NonNull
    public final np70 add(@NonNull f7r f7rVar, double d) throws IOException {
        zza(f7rVar, d, true);
        return this;
    }

    @NonNull
    public final np70 inline(@Nullable Object obj) throws IOException {
        zzf(obj);
        return this;
    }

    @NonNull
    public final np70 nested(@NonNull f7r f7rVar) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    public final np70 zza(@NonNull f7r f7rVar, double d, boolean z) throws IOException {
        if (z && d == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            return this;
        }
        zzn((zzh(f7rVar) << 3) | 1);
        this.zze.write(zzm(8).putDouble(d).array());
        return this;
    }

    public final np70 zzb(@NonNull f7r f7rVar, float f, boolean z) throws IOException {
        if (z && f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return this;
        }
        zzn((zzh(f7rVar) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f).array());
        return this;
    }

    public final np70 zzc(@NonNull f7r f7rVar, @Nullable Object obj, boolean z) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    zzn((zzh(f7rVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(zza);
                    zzn(bytes.length);
                    this.zze.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    zzc(f7rVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    zzk(zzd, f7rVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    zza(f7rVar, ((Double) obj).doubleValue(), z);
                    return this;
                }
                if (obj instanceof Float) {
                    zzb(f7rVar, ((Float) obj).floatValue(), z);
                    return this;
                }
                if (obj instanceof Number) {
                    zze(f7rVar, ((Number) obj).longValue(), z);
                    return this;
                }
                if (obj instanceof Boolean) {
                    zzd(f7rVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
                    return this;
                }
                if (!(obj instanceof byte[])) {
                    mp70 mp70Var = (mp70) this.zzf.get(obj.getClass());
                    if (mp70Var != null) {
                        zzk(mp70Var, f7rVar, obj, z);
                        return this;
                    }
                    tjr0 tjr0Var = (tjr0) this.zzg.get(obj.getClass());
                    if (tjr0Var != null) {
                        zzl(tjr0Var, f7rVar, obj, z);
                        return this;
                    }
                    if (obj instanceof zzdi) {
                        zzd(f7rVar, ((zzdi) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        zzd(f7rVar, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    zzk(this.zzh, f7rVar, obj, z);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z || bArr.length != 0) {
                    zzn((zzh(f7rVar) << 3) | 2);
                    zzn(bArr.length);
                    this.zze.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    public final zzdm zzd(@NonNull f7r f7rVar, int i, boolean z) throws IOException {
        if (!z || i != 0) {
            zzdk zzj = zzj(f7rVar);
            zzdj zzdjVar = zzdj.DEFAULT;
            int ordinal = zzj.zzb().ordinal();
            if (ordinal == 0) {
                zzn(zzj.zza() << 3);
                zzn(i);
                return this;
            }
            if (ordinal == 1) {
                zzn(zzj.zza() << 3);
                zzn((i + i) ^ (i >> 31));
                return this;
            }
            if (ordinal == 2) {
                zzn((zzj.zza() << 3) | 5);
                this.zze.write(zzm(4).putInt(i).array());
                return this;
            }
        }
        return this;
    }

    public final zzdm zze(@NonNull f7r f7rVar, long j, boolean z) throws IOException {
        if (!z || j != 0) {
            zzdk zzj = zzj(f7rVar);
            zzdj zzdjVar = zzdj.DEFAULT;
            int ordinal = zzj.zzb().ordinal();
            if (ordinal == 0) {
                zzn(zzj.zza() << 3);
                zzo(j);
                return this;
            }
            if (ordinal == 1) {
                zzn(zzj.zza() << 3);
                zzo((j >> 63) ^ (j + j));
                return this;
            }
            if (ordinal == 2) {
                zzn((zzj.zza() << 3) | 1);
                this.zze.write(zzm(8).putLong(j).array());
                return this;
            }
        }
        return this;
    }

    public final zzdm zzf(@Nullable Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        mp70 mp70Var = (mp70) this.zzf.get(obj.getClass());
        if (mp70Var == null) {
            throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        mp70Var.encode(obj, this);
        return this;
    }

    @NonNull
    public final np70 add(@NonNull f7r f7rVar, float f) throws IOException {
        zzb(f7rVar, f, true);
        return this;
    }

    @Override // xsna.np70
    @NonNull
    public final /* synthetic */ np70 add(@NonNull f7r f7rVar, int i) throws IOException {
        zzd(f7rVar, i, true);
        return this;
    }

    @Override // xsna.np70
    @NonNull
    public final /* synthetic */ np70 add(@NonNull f7r f7rVar, long j) throws IOException {
        zze(f7rVar, j, true);
        return this;
    }

    @NonNull
    public final np70 nested(@NonNull String str) throws IOException {
        return nested(f7r.b(str));
    }

    @Override // xsna.np70
    @NonNull
    public final np70 add(@NonNull f7r f7rVar, @Nullable Object obj) throws IOException {
        zzc(f7rVar, obj, true);
        return this;
    }

    @Override // xsna.np70
    @NonNull
    public final /* synthetic */ np70 add(@NonNull f7r f7rVar, boolean z) throws IOException {
        zzd(f7rVar, z ? 1 : 0, true);
        return this;
    }

    @NonNull
    public final np70 add(@NonNull String str, double d) throws IOException {
        zza(f7r.b(str), d, true);
        return this;
    }

    @NonNull
    public final np70 add(@NonNull String str, int i) throws IOException {
        zzd(f7r.b(str), i, true);
        return this;
    }

    @NonNull
    public final np70 add(@NonNull String str, long j) throws IOException {
        zze(f7r.b(str), j, true);
        return this;
    }

    @NonNull
    public final np70 add(@NonNull String str, @Nullable Object obj) throws IOException {
        zzc(f7r.b(str), obj, true);
        return this;
    }

    @NonNull
    public final np70 add(@NonNull String str, boolean z) throws IOException {
        zzd(f7r.b(str), z ? 1 : 0, true);
        return this;
    }
}
