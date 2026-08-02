package defpackage;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m6l extends sq3 {
    public /* synthetic */ Object A;
    public final /* synthetic */ n6l B;
    public int C;
    public float r;
    public int s;
    public int t;
    public int u;
    public int v;
    public List w;
    public Context x;
    public hoi y;
    public k6l z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6l(n6l n6lVar, sq3 sq3Var) {
        super(sq3Var);
        this.B = n6lVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, this);
    }
}
