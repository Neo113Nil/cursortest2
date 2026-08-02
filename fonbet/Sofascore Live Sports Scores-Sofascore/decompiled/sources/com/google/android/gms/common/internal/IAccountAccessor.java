package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface IAccountAccessor extends IInterface {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Stub extends zzb implements IAccountAccessor {
        public static final /* synthetic */ int a = 0;

        public Stub() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean J(int i, Parcel parcel, Parcel parcel2) {
            if (i != 2) {
                return false;
            }
            throw null;
        }
    }

    Account zzb();
}
