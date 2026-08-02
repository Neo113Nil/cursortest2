package com.google.firebase.auth;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes3.dex */
public interface AuthResult extends SafeParcelable {
    AdditionalUserInfo Q();

    FirebaseUser getUser();
}
