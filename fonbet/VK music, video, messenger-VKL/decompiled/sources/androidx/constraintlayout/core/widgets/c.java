package androidx.constraintlayout.core.widgets;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: ChainHead.java */
/* loaded from: classes.dex */
public final class c {
    public final ConstraintWidget a;
    public ConstraintWidget b;
    public ConstraintWidget c;
    public ConstraintWidget d;
    public ConstraintWidget e;
    public ConstraintWidget f;
    public ConstraintWidget g;
    public ArrayList<ConstraintWidget> h;
    public int i;
    public int j;
    public float k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public final int l;
    public final boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;

    public c(ConstraintWidget constraintWidget, int i, boolean z) {
        this.a = constraintWidget;
        this.l = i;
        this.m = z;
    }
}
