package defpackage;

import com.blaze.blazesdk.features.stories.repos.StoriesRepositoryImpl;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yvl extends sq3 {
    public Object r;
    public Object s;
    public String t;
    public Serializable u;
    public String v;
    public boolean w;
    public /* synthetic */ Object x;
    public final /* synthetic */ StoriesRepositoryImpl y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvl(StoriesRepositoryImpl storiesRepositoryImpl, rq3 rq3Var) {
        super(rq3Var);
        this.y = storiesRepositoryImpl;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.a(this, null, null, null, null, null, null, false, false);
    }
}
