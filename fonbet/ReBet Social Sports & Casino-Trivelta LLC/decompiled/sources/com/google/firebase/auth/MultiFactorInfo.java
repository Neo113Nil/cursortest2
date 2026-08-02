package com.google.firebase.auth;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class MultiFactorInfo extends AbstractSafeParcelable {
    public abstract String a();

    public abstract long g();

    public abstract String getDisplayName();

    public abstract String h();

    public abstract JSONObject i();
}
