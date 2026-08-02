package com.google.firebase.auth;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tasks.Task;
import java.util.List;
import kb.AbstractC5239y;

/* loaded from: classes3.dex */
public abstract class MultiFactorResolver extends AbstractSafeParcelable {
    public abstract FirebaseAuth g();

    public abstract List h();

    public abstract MultiFactorSession i();

    public abstract Task j(AbstractC5239y abstractC5239y);
}
