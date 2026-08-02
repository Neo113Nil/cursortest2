package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjk;
import com.google.android.gms.internal.measurement.zzjk.zza;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.1 */
/* loaded from: classes7.dex */
public abstract class zzjk<MessageType extends zzjk<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzho<MessageType, BuilderType> {
    private static Map<Object, zzjk<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzmf zzb = zzmf.zzc();

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.1 */
    public static abstract class zza<MessageType extends zzjk<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzhq<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;

        @Override // com.google.android.gms.internal.measurement.zzhq
        /* renamed from: zzad */
        public final /* synthetic */ zzhq clone() {
            return (zza) clone();
        }

        @Override // com.google.android.gms.internal.measurement.zzhq
        /* renamed from: zza */
        public final /* synthetic */ zzhq zzb(zzil zzilVar, zzix zzixVar) throws IOException {
            return (zza) zzb(zzilVar, zzixVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzhq
        public final /* synthetic */ zzhq zza(byte[] bArr, int i, int i2) throws zzjt {
            return zzb(bArr, 0, i2, zzix.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzhq
        public final /* synthetic */ zzhq zza(byte[] bArr, int i, int i2, zzix zzixVar) throws zzjt {
            return zzb(bArr, 0, i2, zzixVar);
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzcj()) {
                zzak();
            }
            zza(this.zza, messagetype);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.internal.measurement.zzhq
        /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
        public final BuilderType zzb(zzil zzilVar, zzix zzixVar) throws IOException {
            if (!this.zza.zzcj()) {
                zzak();
            }
            try {
                zzle.zza().zza((zzle) this.zza).zza(this.zza, zzip.zza(zzilVar), zzixVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        private final BuilderType zzb(byte[] bArr, int i, int i2, zzix zzixVar) throws zzjt {
            if (!this.zza.zzcj()) {
                zzak();
            }
            try {
                zzle.zza().zza((zzle) this.zza).zza(this.zza, bArr, 0, i2, new zzhw(zzixVar));
                return this;
            } catch (zzjt e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw zzjt.zzh();
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzkt
        /* renamed from: zzae, reason: merged with bridge method [inline-methods] */
        public final MessageType zzag() {
            MessageType messagetype = (MessageType) zzah();
            if (messagetype.i_()) {
                return messagetype;
            }
            throw new zzmd(messagetype);
        }

        @Override // com.google.android.gms.internal.measurement.zzkt
        /* renamed from: zzaf, reason: merged with bridge method [inline-methods] */
        public MessageType zzah() {
            if (!this.zza.zzcj()) {
                return this.zza;
            }
            this.zza.zzch();
            return this.zza;
        }

        @Override // com.google.android.gms.internal.measurement.zzks
        public final /* synthetic */ zzkq zzai() {
            return this.zzb;
        }

        @Override // com.google.android.gms.internal.measurement.zzhq
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zzaVar = (zza) this.zzb.zza(zzf.zze, null, null);
            zzaVar.zza = (MessageType) zzah();
            return zzaVar;
        }

        protected zza(MessageType messagetype) {
            this.zzb = messagetype;
            if (messagetype.zzcj()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.zza = (MessageType) messagetype.zzcb();
        }

        protected final void zzaj() {
            if (this.zza.zzcj()) {
                return;
            }
            zzak();
        }

        protected void zzak() {
            MessageType messagetype = (MessageType) this.zzb.zzcb();
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzle.zza().zza((zzle) messagetype).zza(messagetype, messagetype2);
        }

        @Override // com.google.android.gms.internal.measurement.zzks
        public final boolean i_() {
            return zzjk.zza(this.zza, false);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.1 */
    public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType> extends zzjk<MessageType, BuilderType> implements zzks {
        protected zzja<zze> zzc = zzja.zzb();

        final zzja<zze> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzja) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.1 */
    protected static class zzc<T extends zzjk<T, ?>> extends zzhs<T> {
        public zzc(T t) {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.1 */
    public static class zzd<ContainingType extends zzkq, Type> extends zziv<ContainingType, Type> {
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.1 */
    static final class zze implements zzjc<zze> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final zzkt zza(zzkt zzktVar, zzkq zzkqVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final zzkz zza(zzkz zzkzVar, zzkz zzkzVar2) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final zzmo zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final zzmy zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final boolean zze() {
            throw new NoSuchMethodError();
        }
    }

    private final int zza() {
        return zzle.zza().zza((zzle) this).zzb(this);
    }

    protected abstract Object zza(int i, Object obj, Object obj2);

    private final int zzb(zzli<?> zzliVar) {
        if (zzliVar == null) {
            return zzle.zza().zza((zzle) this).zza(this);
        }
        return zzliVar.zza(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzho
    final int zzbv() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final int zzby() {
        return zza((zzli) null);
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.1 */
    public enum zzf {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzho
    final int zza(zzli zzliVar) {
        if (zzcj()) {
            int zzb2 = zzb(zzliVar);
            if (zzb2 >= 0) {
                return zzb2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zzb2);
        }
        if (zzbv() != Integer.MAX_VALUE) {
            return zzbv();
        }
        int zzb3 = zzb(zzliVar);
        zzc(zzb3);
        return zzb3;
    }

    public int hashCode() {
        if (zzcj()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    protected final <MessageType extends zzjk<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zzbz() {
        return (BuilderType) zza(zzf.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzca() {
        return (BuilderType) ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza((zza) this);
    }

    static <T extends zzjk<?, ?>> T zza(Class<T> cls) {
        T t = (T) zzc.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) zzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((zzjk) zzmh.zza(cls)).zza(zzf.zzf, (Object) null, (Object) null);
        if (t2 == null) {
            throw new IllegalStateException();
        }
        zzc.put(cls, t2);
        return t2;
    }

    final MessageType zzcb() {
        return (MessageType) zza(zzf.zzd, (Object) null, (Object) null);
    }

    protected static zzjo zzcc() {
        return zzjl.zzd();
    }

    protected static zzjr zzcd() {
        return zzkf.zzd();
    }

    protected static zzjr zza(zzjr zzjrVar) {
        int size = zzjrVar.size();
        return zzjrVar.zza(size == 0 ? 10 : size << 1);
    }

    protected static <E> zzjq<E> zzce() {
        return zzlh.zzd();
    }

    protected static <E> zzjq<E> zza(zzjq<E> zzjqVar) {
        int size = zzjqVar.size();
        return zzjqVar.zza(size == 0 ? 10 : size << 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final /* synthetic */ zzkt zzcf() {
        return (zza) zza(zzf.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final /* synthetic */ zzkt zzcg() {
        return ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza((zza) this);
    }

    @Override // com.google.android.gms.internal.measurement.zzks
    public final /* synthetic */ zzkq zzai() {
        return (zzjk) zza(zzf.zzf, (Object) null, (Object) null);
    }

    static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object zza(zzkq zzkqVar, String str, Object[] objArr) {
        return new zzlg(zzkqVar, str, objArr);
    }

    public String toString() {
        return zzkv.zza(this, super.toString());
    }

    protected final void zzch() {
        zzle.zza().zza((zzle) this).zzc(this);
        zzci();
    }

    final void zzci() {
        this.zzd &= Integer.MAX_VALUE;
    }

    protected static <T extends zzjk<?, ?>> void zza(Class<T> cls, T t) {
        t.zzci();
        zzc.put(cls, t);
    }

    @Override // com.google.android.gms.internal.measurement.zzho
    final void zzc(int i) {
        if (i < 0) {
            throw new IllegalStateException("serialized size must be non-negative, was " + i);
        }
        this.zzd = (i & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final void zza(zzir zzirVar) throws IOException {
        zzle.zza().zza((zzle) this).zza((zzli) this, (zzmx) zzit.zza(zzirVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzle.zza().zza((zzle) this).zzb(this, (zzjk) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzks
    public final boolean i_() {
        return zza(this, Boolean.TRUE.booleanValue());
    }

    protected static final <T extends zzjk<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zzf.zza, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzd2 = zzle.zza().zza((zzle) t).zzd(t);
        if (z) {
            t.zza(zzf.zzb, zzd2 ? t : null, null);
        }
        return zzd2;
    }

    final boolean zzcj() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }
}
