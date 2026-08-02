package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import Ej.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public abstract class zbuf<MessageType extends zbuf<MessageType, BuilderType>, BuilderType extends zbtz<MessageType, BuilderType>> extends zbsj<MessageType, BuilderType> {
    private static final Map zbb = new ConcurrentHashMap();
    private int zbd = -1;
    protected zbwm zbc = zbwm.zbc();

    protected static Object zbA(zbvm zbvmVar, String str, Object[] objArr) {
        return new zbvw(zbvmVar, str, objArr);
    }

    protected static void zbD(Class cls, zbuf zbufVar) {
        zbufVar.zbC();
        zbb.put(cls, zbufVar);
    }

    protected static final boolean zbF(zbuf zbufVar, boolean z11) {
        byte byteValue = ((Byte) zbufVar.zbb(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zbk = zbvu.zba().zbb(zbufVar.getClass()).zbk(zbufVar);
        if (z11) {
            zbufVar.zbb(2, true != zbk ? null : zbufVar, null);
        }
        return zbk;
    }

    private final int zbc(zbvx zbvxVar) {
        return zbvu.zba().zbb(getClass()).zba(this);
    }

    private static zbuf zbe(zbuf zbufVar, byte[] bArr, int i11, int i12, zbtp zbtpVar) throws zbuq {
        if (i12 == 0) {
            return zbufVar;
        }
        zbuf zbt = zbufVar.zbt();
        try {
            zbvx zbb2 = zbvu.zba().zbb(zbt.getClass());
            zbb2.zbh(zbt, bArr, 0, i12, new zbsq(zbtpVar));
            zbb2.zbf(zbt);
            return zbt;
        } catch (zbuq e11) {
            throw e11;
        } catch (zbwk e12) {
            throw e12.zba();
        } catch (IOException e13) {
            if (e13.getCause() instanceof zbuq) {
                throw ((zbuq) e13.getCause());
            }
            throw new zbuq(e13);
        } catch (IndexOutOfBoundsException unused) {
            throw new zbuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static zbud zbr(zbvm zbvmVar, Object obj, zbvm zbvmVar2, zbui zbuiVar, int i11, zbww zbwwVar, Class cls) {
        return new zbud(zbvmVar, obj, zbvmVar2, new zbuc(null, 32149011, zbwwVar, false, false), cls);
    }

    static zbuf zbs(Class cls) {
        Map map = zbb;
        zbuf zbufVar = (zbuf) map.get(cls);
        if (zbufVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zbufVar = (zbuf) map.get(cls);
            } catch (ClassNotFoundException e11) {
                throw new IllegalStateException("Class initialization cannot fail.", e11);
            }
        }
        if (zbufVar != null) {
            return zbufVar;
        }
        zbuf zbufVar2 = (zbuf) ((zbuf) zbws.zbe(cls)).zbb(6, null, null);
        if (zbufVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zbufVar2);
        return zbufVar2;
    }

    protected static zbuf zbu(zbuf zbufVar, byte[] bArr, zbtp zbtpVar) throws zbuq {
        zbuf zbe = zbe(zbufVar, bArr, 0, bArr.length, zbtpVar);
        if (zbe == null || zbF(zbe, true)) {
            return zbe;
        }
        throw new zbwk(zbe).zba();
    }

    protected static zbuk zbv() {
        return zbtw.zbf();
    }

    protected static zbul zbw() {
        return zbug.zbf();
    }

    protected static zbum zbx() {
        return zbva.zbf();
    }

    protected static zbun zby() {
        return zbvv.zbe();
    }

    static Object zbz(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e11);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zbvu.zba().zbb(getClass()).zbj(this, (zbuf) obj);
    }

    public final int hashCode() {
        if (zbG()) {
            return zbn();
        }
        int i11 = this.zba;
        if (i11 != 0) {
            return i11;
        }
        int zbn = zbn();
        this.zba = zbn;
        return zbn;
    }

    public final String toString() {
        return zbvo.zba(this, super.toString());
    }

    protected final void zbB() {
        zbvu.zba().zbb(getClass()).zbf(this);
        zbC();
    }

    final void zbC() {
        this.zbd &= Integer.MAX_VALUE;
    }

    final void zbE(int i11) {
        this.zbd = (this.zbd & LinearLayoutManager.INVALID_OFFSET) | Integer.MAX_VALUE;
    }

    final boolean zbG() {
        return (this.zbd & LinearLayoutManager.INVALID_OFFSET) != 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm
    public final /* synthetic */ zbvl zbJ() {
        return (zbtz) zbb(5, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm
    public final /* synthetic */ zbvl zbK() {
        zbtz zbtzVar = (zbtz) zbb(5, null, null);
        zbtzVar.zbh(this);
        return zbtzVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm
    public final void zbL(zbtk zbtkVar) throws IOException {
        zbvu.zba().zbb(getClass()).zbi(this, zbtl.zba(zbtkVar));
    }

    protected abstract Object zbb(int i11, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsj
    final int zbj(zbvx zbvxVar) {
        if (zbG()) {
            int zba = zbvxVar.zba(this);
            if (zba >= 0) {
                return zba;
            }
            throw new IllegalStateException(b.a(zba, "serialized size must be non-negative, was "));
        }
        int i11 = this.zbd & Integer.MAX_VALUE;
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        int zba2 = zbvxVar.zba(this);
        if (zba2 < 0) {
            throw new IllegalStateException(b.a(zba2, "serialized size must be non-negative, was "));
        }
        this.zbd = (this.zbd & LinearLayoutManager.INVALID_OFFSET) | zba2;
        return zba2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn
    public final /* synthetic */ zbvm zbm() {
        return (zbuf) zbb(6, null, null);
    }

    final int zbn() {
        return zbvu.zba().zbb(getClass()).zbb(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm
    public final int zbo() {
        if (zbG()) {
            int zbc = zbc(null);
            if (zbc >= 0) {
                return zbc;
            }
            throw new IllegalStateException(b.a(zbc, "serialized size must be non-negative, was "));
        }
        int i11 = this.zbd & Integer.MAX_VALUE;
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        int zbc2 = zbc(null);
        if (zbc2 < 0) {
            throw new IllegalStateException(b.a(zbc2, "serialized size must be non-negative, was "));
        }
        this.zbd = (this.zbd & LinearLayoutManager.INVALID_OFFSET) | zbc2;
        return zbc2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn
    public final boolean zbp() {
        return zbF(this, true);
    }

    protected final zbtz zbq() {
        return (zbtz) zbb(5, null, null);
    }

    final zbuf zbt() {
        return (zbuf) zbb(4, null, null);
    }
}
