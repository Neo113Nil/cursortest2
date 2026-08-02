package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public enum n0 {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);


    /* renamed from: c, reason: collision with root package name */
    public static final x0 f5518c;

    /* renamed from: a, reason: collision with root package name */
    public final int f5520a;

    static {
        byte b10 = 0;
        androidx.transition.n0 n0Var = new androidx.transition.n0(b10, 3);
        n0Var.f2734c = new Object[8];
        n0Var.f2733b = 0;
        n0[] values = values();
        int length = values.length;
        for (int i5 = b10; i5 < length; i5++) {
            n0 n0Var2 = values[i5];
            Integer valueOf = Integer.valueOf(n0Var2.f5520a);
            int i10 = n0Var.f2733b + 1;
            Object[] objArr = (Object[]) n0Var.f2734c;
            int length2 = objArr.length;
            int i11 = i10 + i10;
            if (i11 > length2) {
                n0Var.f2734c = Arrays.copyOf(objArr, x.b(length2, i11));
            }
            Object[] objArr2 = (Object[]) n0Var.f2734c;
            int i12 = n0Var.f2733b;
            int i13 = i12 + i12;
            objArr2[i13] = valueOf;
            objArr2[i13 + 1] = n0Var2;
            n0Var.f2733b = i12 + 1;
        }
        e0 e0Var = (e0) n0Var.f2735d;
        if (e0Var != null) {
            throw e0Var.a();
        }
        x0 a7 = x0.a(n0Var.f2733b, (Object[]) n0Var.f2734c, n0Var);
        e0 e0Var2 = (e0) n0Var.f2735d;
        if (e0Var2 != null) {
            throw e0Var2.a();
        }
        f5518c = a7;
    }

    n0(int i5) {
        this.f5520a = i5;
    }
}
