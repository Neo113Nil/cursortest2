package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s2 implements i3 {

    /* renamed from: b, reason: collision with root package name */
    public static final s2 f5572b = new s2(0);

    /* renamed from: c, reason: collision with root package name */
    public static final s2 f5573c = new s2(1);

    /* renamed from: d, reason: collision with root package name */
    public static final s2 f5574d = new s2(2);

    /* renamed from: e, reason: collision with root package name */
    public static final s2 f5575e = new s2(3);

    /* renamed from: f, reason: collision with root package name */
    public static final s2 f5576f = new s2(4);

    /* renamed from: g, reason: collision with root package name */
    public static final s2 f5577g = new s2(5);

    /* renamed from: h, reason: collision with root package name */
    public static final s2 f5578h = new s2(6);

    /* renamed from: i, reason: collision with root package name */
    public static final s2 f5579i = new s2(7);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5580a;

    public /* synthetic */ s2(int i5) {
        this.f5580a = i5;
    }

    @Override // com.google.android.gms.internal.play_billing.i3
    public final boolean a(int i5) {
        switch (this.f5580a) {
            case 0:
                switch (i5) {
                }
            case 1:
                switch (i5) {
                    default:
                        switch (i5) {
                        }
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        return true;
                }
            case 2:
                if (d3.n(i5) != 0) {
                }
                break;
            case 3:
                if ((i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? null : x4.ALTERNATIVE_BILLING_ACTION : x4.LOCAL_PURCHASES_UPDATED_ACTION : x4.PURCHASES_UPDATED_ACTION : x4.BROADCAST_ACTION_UNSPECIFIED) != null) {
                }
                break;
            case 4:
                if (i5 == 0 || i5 == 1 || i5 == 2 || i5 == 3) {
                }
                break;
            case 5:
                if (i5 != 17 && i5 != 18) {
                    switch (i5) {
                    }
                }
                break;
            case 6:
                if (i5 == 0 || i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4 || i5 == 5) {
                }
                break;
            default:
                if (i5 == 0 || i5 == 1) {
                }
                break;
        }
        return true;
    }
}
