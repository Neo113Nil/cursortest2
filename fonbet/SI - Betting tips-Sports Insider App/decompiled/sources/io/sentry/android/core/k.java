package io.sentry.android.core;

import io.sentry.b5;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f15767a;

    static {
        int[] iArr = new int[b5.values().length];
        f15767a = iArr;
        try {
            iArr[b5.INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f15767a[b5.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f15767a[b5.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f15767a[b5.FATAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f15767a[b5.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
