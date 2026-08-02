package defpackage;

import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.network.response.EventResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v7c extends hoi implements Function2 {
    public final /* synthetic */ MediaPost A;
    public final /* synthetic */ u8c B;
    public av4 r;
    public List s;
    public String t;
    public String u;
    public String v;
    public int w;
    public long x;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7c(rq3 rq3Var, u8c u8cVar, MediaPost mediaPost) {
        super(2, rq3Var);
        this.A = mediaPost;
        this.B = u8cVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        v7c v7cVar = new v7c(rq3Var, this.B, this.A);
        v7cVar.z = obj;
        return v7cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v7c) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [bx7] */
    /* JADX WARN: Type inference failed for: r7v2, types: [bx7] */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        av4 t;
        List<String> list;
        String header;
        String description;
        String str;
        Object T;
        String str2;
        long j;
        int i;
        x2g x2gVar;
        EventResponse eventResponse;
        Event event;
        ku3 ku3Var = (ku3) this.z;
        lu3 lu3Var = lu3.a;
        int i2 = this.y;
        int i3 = 1;
        u8c u8cVar = this.B;
        rq3 rq3Var = null;
        rq3Var = null;
        rq3Var = null;
        MediaPost mediaPost = this.A;
        if (i2 == 0) {
            y6a.M(obj);
            t = xw3.t(ku3Var, null, new p7c(mediaPost, u8cVar, rq3Var, 3), 3);
            List<String> images = mediaPost.getImages();
            if (images == null || images.isEmpty()) {
                return null;
            }
            av4 t2 = xw3.t(ku3Var, null, new o7c(u8cVar, images, rq3Var, i3), 3);
            this.z = null;
            this.r = t;
            this.s = images;
            this.y = 1;
            if (t2.w(this) != lu3Var) {
                list = images;
            }
            return lu3Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j2 = this.x;
            int i4 = this.w;
            String str3 = this.v;
            String str4 = this.u;
            String str5 = this.t;
            List<String> list2 = this.s;
            y6a.M(obj);
            j = j2;
            i = i4;
            str2 = str3;
            description = str4;
            header = str5;
            list = list2;
            T = obj;
            x2gVar = (x2g) T;
            if (x2gVar != null && (eventResponse = (EventResponse) yaa.x(x2gVar)) != null && (event = eventResponse.getEvent()) != null) {
                rq3Var = uxf.F(event, u8cVar.a, false, false, null, null, 62);
            }
            return new b94(i, header, description, j, str2, rq3Var, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31), (String) CollectionsKt.firstOrNull(mediaPost.getTags()), l6g.W(list), mediaPost.getExternalUrl(), mediaPost.getTags().contains("featured"));
        }
        list = this.s;
        t = this.r;
        y6a.M(obj);
        int id = mediaPost.getId();
        long createdAtTimestamp = mediaPost.getCreatedAtTimestamp();
        header = mediaPost.getHeader();
        description = mediaPost.getDescription();
        Sport sport = mediaPost.getSport();
        if (sport == null || (str = sport.getSlug()) == null) {
            str = "";
        }
        this.z = null;
        this.r = null;
        this.s = list;
        this.t = header;
        this.u = description;
        this.v = str;
        this.w = id;
        this.x = createdAtTimestamp;
        this.y = 2;
        T = t.T(this);
        if (T != lu3Var) {
            str2 = str;
            j = createdAtTimestamp;
            i = id;
            x2gVar = (x2g) T;
            if (x2gVar != null) {
                rq3Var = uxf.F(event, u8cVar.a, false, false, null, null, 62);
            }
            return new b94(i, header, description, j, str2, rq3Var, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31), (String) CollectionsKt.firstOrNull(mediaPost.getTags()), l6g.W(list), mediaPost.getExternalUrl(), mediaPost.getTags().contains("featured"));
        }
        return lu3Var;
    }
}
