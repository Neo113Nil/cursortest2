package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zbq extends com.google.android.gms.internal.p000authapi.zbb implements zbr {
    public zbq() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 101:
                com.google.android.gms.internal.p000authapi.zbc.b(parcel);
                a70.i();
                return false;
            case 102:
                Status status = (Status) com.google.android.gms.internal.p000authapi.zbc.a(parcel, Status.CREATOR);
                com.google.android.gms.internal.p000authapi.zbc.b(parcel);
                p3(status);
                break;
            case 103:
                Status status2 = (Status) com.google.android.gms.internal.p000authapi.zbc.a(parcel, Status.CREATOR);
                com.google.android.gms.internal.p000authapi.zbc.b(parcel);
                d3(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
