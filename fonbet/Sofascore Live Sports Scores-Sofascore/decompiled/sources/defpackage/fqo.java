package defpackage;

import com.google.android.gms.internal.cast.zzhy;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class fqo extends zzhy {
    public static final fqo g = new fqo(0, null, new Object[0]);
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f;

    public fqo(int i, Object obj, Object[] objArr) {
        this.d = obj;
        this.e = objArr;
        this.f = i;
    }

    @Override // com.google.android.gms.internal.cast.zzhy
    public final epo d() {
        return new epo(this, this.e, this.f);
    }

    @Override // com.google.android.gms.internal.cast.zzhy
    public final spo g() {
        return new spo(this, new xpo(0, this.f, this.e));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.cast.zzhy, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            int i = this.f;
            Object[] objArr = this.e;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.d;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int F = b6a.F(obj.hashCode());
                        while (true) {
                            int i2 = F & length;
                            int i3 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                            if (i3 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i3])) {
                                obj2 = objArr[i3 ^ 1];
                                break;
                            }
                            F = i2 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int F2 = b6a.F(obj.hashCode());
                        while (true) {
                            int i4 = F2 & length2;
                            char c = (char) sArr[i4];
                            if (c == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c])) {
                                obj2 = objArr[c ^ 1];
                                break;
                            }
                            F2 = i4 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int F3 = b6a.F(obj.hashCode());
                        while (true) {
                            int i5 = F3 & length3;
                            int i6 = iArr[i5];
                            if (i6 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            F3 = i5 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // com.google.android.gms.internal.cast.zzhy
    public final xpo h() {
        return new xpo(1, this.f, this.e);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f;
    }
}
