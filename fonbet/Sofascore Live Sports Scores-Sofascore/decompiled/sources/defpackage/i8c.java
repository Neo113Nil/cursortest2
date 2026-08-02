package defpackage;

import com.sofascore.model.newNetwork.mediaposts.MediaType;
import com.sofascore.model.newNetwork.mediaposts.PersonalizedMLMediaResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class i8c extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ u8c t;
    public final /* synthetic */ String u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i8c(u8c u8cVar, String str, String str2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = u8cVar;
        this.u = str;
        this.v = str2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new i8c(this.t, this.u, this.v, rq3Var, 0);
            case 1:
                return new i8c(this.t, this.u, this.v, rq3Var, 1);
            case 2:
                return new i8c(this.t, this.u, this.v, rq3Var, 2);
            default:
                return new i8c(this.t, this.u, this.v, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((i8c) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        u8c u8cVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    m7c m7cVar = u8cVar.b;
                    List c = a.c(MediaType.InfluencerVideo);
                    this.s = 1;
                    obj = m7c.d(m7cVar, this.u, this.v, c, null, this, 8);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                PersonalizedMLMediaResponse personalizedMLMediaResponse = (PersonalizedMLMediaResponse) obj;
                if (personalizedMLMediaResponse != null) {
                    return personalizedMLMediaResponse.getPosts();
                }
                return null;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    m7c m7cVar2 = u8cVar.b;
                    List c2 = a.c(MediaType.NewsArticle);
                    this.s = 1;
                    obj = m7c.d(m7cVar2, this.u, this.v, c2, null, this, 8);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                PersonalizedMLMediaResponse personalizedMLMediaResponse2 = (PersonalizedMLMediaResponse) obj;
                if (personalizedMLMediaResponse2 != null) {
                    return personalizedMLMediaResponse2.getPosts();
                }
                return null;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    m7c m7cVar3 = u8cVar.b;
                    List c3 = a.c(MediaType.YTShortVideo);
                    this.s = 1;
                    obj = m7c.d(m7cVar3, this.u, this.v, c3, null, this, 8);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                PersonalizedMLMediaResponse personalizedMLMediaResponse3 = (PersonalizedMLMediaResponse) obj;
                if (personalizedMLMediaResponse3 != null) {
                    return personalizedMLMediaResponse3.getPosts();
                }
                return null;
            default:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    m7c m7cVar4 = u8cVar.b;
                    List c4 = a.c(MediaType.ExternalVideo);
                    this.s = 1;
                    obj = m7c.d(m7cVar4, this.u, this.v, c4, null, this, 8);
                    if (obj == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                PersonalizedMLMediaResponse personalizedMLMediaResponse4 = (PersonalizedMLMediaResponse) obj;
                if (personalizedMLMediaResponse4 != null) {
                    return personalizedMLMediaResponse4.getPosts();
                }
                return null;
        }
    }
}
