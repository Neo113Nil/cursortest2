package dg0;

import pf0.j;

/* renamed from: dg0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C6198a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f61623a;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.QA_BUILDS_OR_AUTOTEST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.PROD_BUILDS_OZON_QA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j.PROD_BUILDS_OZON_EMPLOYEE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[j.PROD_BUILDS_ALL_USERS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f61623a = iArr;
    }
}
