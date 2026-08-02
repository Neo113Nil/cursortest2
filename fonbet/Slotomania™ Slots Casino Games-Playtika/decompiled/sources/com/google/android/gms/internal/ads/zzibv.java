package com.google.android.gms.internal.ads;

import air.com.playtika.android.common.GameActivity$$ExternalSyntheticLambda1;
import com.google.android.gms.internal.ads.zzibv;
import com.google.android.gms.internal.ads.zzibw;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes8.dex */
public abstract class zzibv<MessageType extends zzibw<MessageType, BuilderType>, BuilderType extends zzibv<MessageType, BuilderType>> implements zzifb {
    private String zza(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 16 + String.valueOf(str).length() + 44);
        sb.append("Reading ");
        sb.append(name);
        sb.append(" from a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    protected static zzigg zzaR(zzifc zzifcVar) {
        return new zzigg(zzifcVar);
    }

    @Deprecated
    protected static <T> void zzaS(Iterable<T> iterable, Collection<? super T> collection) {
        zzaT(iterable, (List) collection);
    }

    protected static <T> void zzaT(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = zziee.zzb;
        iterable.getClass();
        if (!(iterable instanceof zzien)) {
            if (iterable instanceof zzifl) {
                list.addAll((Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        List zza = ((zzien) iterable).zza();
        zzien zzienVar = (zzien) list;
        int size = list.size();
        for (Object obj : zza) {
            if (obj == null) {
                int size2 = zzienVar.size() - size;
                StringBuilder sb = new StringBuilder(String.valueOf(size2).length() + 26);
                sb.append("Element at index ");
                sb.append(size2);
                sb.append(" is null.");
                String sb2 = sb.toString();
                int size3 = zzienVar.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(sb2);
                    }
                    zzienVar.remove(size3);
                }
            } else if (obj instanceof zzicn) {
                zzienVar.zzb();
            } else if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                zzicn.zzt(bArr2, 0, bArr2.length);
                zzienVar.zzb();
            } else {
                zzienVar.add((String) obj);
            }
        }
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof zzifn) {
                ((zzifn) list).zze(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    zzc(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i = 0; i < size3; i++) {
            GameActivity$$ExternalSyntheticLambda1 gameActivity$$ExternalSyntheticLambda1 = (Object) list2.get(i);
            if (gameActivity$$ExternalSyntheticLambda1 == null) {
                zzc(list, size2);
            }
            list.add(gameActivity$$ExternalSyntheticLambda1);
        }
    }

    private static void zzc(List<?> list, int i) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String sb2 = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(sb2);
            }
            list.remove(size2);
        }
    }

    @Override // 
    public abstract BuilderType zzbf();

    /* renamed from: zzaD, reason: merged with bridge method [inline-methods] */
    public BuilderType zzbe(zzicr zzicrVar) throws IOException {
        int i = zzidb.zzb;
        int i2 = zzica.zza;
        return zzbd(zzicrVar, zzidb.zza);
    }

    @Override // 
    /* renamed from: zzaE, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzbd(zzicr zzicrVar, zzidb zzidbVar) throws IOException;

    public BuilderType zzaF(zzicn zzicnVar) throws zzieg {
        try {
            zzicr zzm = zzicnVar.zzm();
            zzbe(zzm);
            zzm.zzb(0);
            return this;
        } catch (zzieg e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    public BuilderType zzaG(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        try {
            zzicr zzm = zzicnVar.zzm();
            zzbd(zzm, zzidbVar);
            zzm.zzb(0);
            return this;
        } catch (zzieg e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    /* renamed from: zzaH, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr) throws zzieg {
        return zzaZ(bArr, 0, bArr.length);
    }

    @Override // 
    /* renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i, int i2) throws zzieg {
        try {
            zzicr zzI = zzicr.zzI(bArr, i, i2, false);
            zzbe(zzI);
            zzI.zzb(0);
            return this;
        } catch (zzieg e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    /* renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, zzidb zzidbVar) throws zzieg {
        return zzaX(bArr, 0, bArr.length, zzidbVar);
    }

    @Override // 
    /* renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaX(byte[] bArr, int i, int i2, zzidb zzidbVar) throws zzieg {
        try {
            zzicr zzI = zzicr.zzI(bArr, i, i2, false);
            zzbd(zzI, zzidbVar);
            zzI.zzb(0);
            return this;
        } catch (zzieg e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    public BuilderType zzaL(InputStream inputStream) throws IOException {
        zzicr zzH = zzicr.zzH(inputStream, 4096);
        zzbe(zzH);
        zzH.zzb(0);
        return this;
    }

    public BuilderType zzaM(InputStream inputStream, zzidb zzidbVar) throws IOException {
        zzicr zzH = zzicr.zzH(inputStream, 4096);
        zzbd(zzH, zzidbVar);
        zzH.zzb(0);
        return this;
    }

    public boolean zzaN(InputStream inputStream, zzidb zzidbVar) throws IOException {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        zzaM(new zzibu(inputStream, zzicr.zzO(read, inputStream)), zzidbVar);
        return true;
    }

    public boolean zzaO(InputStream inputStream) throws IOException {
        int i = zzidb.zzb;
        int i2 = zzica.zza;
        return zzaN(inputStream, zzidb.zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: zzaP, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(zzifc zzifcVar) {
        if (zzbw().getClass().isInstance(zzifcVar)) {
            return (BuilderType) zzaQ((zzibw) zzifcVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    protected abstract BuilderType zzaQ(MessageType messagetype);

    public /* bridge */ /* synthetic */ zzifb zzaV(InputStream inputStream, zzidb zzidbVar) throws IOException {
        zzaM(inputStream, zzidbVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzifb zzaW(InputStream inputStream) throws IOException {
        zzaL(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzifb zzbb(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        zzaG(zzicnVar, zzidbVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzifb zzbc(zzicn zzicnVar) throws zzieg {
        zzaF(zzicnVar);
        return this;
    }
}
