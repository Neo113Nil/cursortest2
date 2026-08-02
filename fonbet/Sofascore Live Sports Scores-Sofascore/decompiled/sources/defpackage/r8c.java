package defpackage;

import android.content.Context;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.EventResponse;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class r8c extends hoi implements Function2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ MediaPost B;
    public final /* synthetic */ Event C;
    public final /* synthetic */ u8c D;
    public av4 r;
    public String s;
    public String t;
    public bx7 u;
    public iy7 v;
    public int w;
    public int x;
    public long y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8c(rq3 rq3Var, u8c u8cVar, Event event, MediaPost mediaPost) {
        super(2, rq3Var);
        this.B = mediaPost;
        this.C = event;
        this.D = u8cVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        r8c r8cVar = new r8c(rq3Var, this.D, this.C, this.B);
        r8cVar.A = obj;
        return r8cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r8c) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (r1 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
    
        if (r1 == r9) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0105  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int intValue;
        av4 t;
        Event event;
        Object w;
        String slug;
        iy7 iy7Var;
        Object T;
        bx7 bx7Var;
        int i;
        String str;
        long j;
        String str2;
        Highlight highlight;
        u8c u8cVar = this.D;
        Context context = u8cVar.a;
        ku3 ku3Var = (ku3) this.A;
        lu3 lu3Var = lu3.a;
        int i2 = this.z;
        MediaPost mediaPost = this.B;
        rq3 rq3Var = null;
        if (i2 == 0) {
            y6a.M(obj);
            Integer eventId = mediaPost.getEventId();
            if (eventId != null) {
                intValue = eventId.intValue();
                av4 t2 = xw3.t(ku3Var, null, new w7c(u8cVar, intValue, rq3Var, 12), 3);
                t = xw3.t(ku3Var, null, new w7c(u8cVar, intValue, rq3Var, 13), 3);
                event = this.C;
                if (event == null) {
                    this.A = null;
                    this.r = t;
                    this.w = intValue;
                    this.z = 1;
                    w = t2.w(this);
                }
                av4 av4Var = t;
                Event event2 = event;
                int i3 = intValue;
                int id = mediaPost.getId();
                String string = context.getString(R.string.highlights_live_title);
                Sport sport = mediaPost.getSport();
                if (sport != null && (slug = sport.getSlug()) != null) {
                    bx7 F = uxf.F(event2, context, true, false, null, null, 60);
                    long createdAtTimestamp = mediaPost.getCreatedAtTimestamp();
                    Integer F2 = o3a.F(event2.getTournament());
                    UniqueTournament uniqueTournament = event2.getTournament().getUniqueTournament();
                    iy7Var = new iy7(F2, uniqueTournament != null ? tba.x(uniqueTournament) : null);
                    this.A = null;
                    this.r = null;
                    this.s = string;
                    this.t = slug;
                    this.u = F;
                    this.v = iy7Var;
                    this.w = i3;
                    this.x = id;
                    this.y = createdAtTimestamp;
                    this.z = 2;
                    T = av4Var.T(this);
                    if (T != lu3Var) {
                        bx7Var = F;
                        i = id;
                        str = string;
                        j = createdAtTimestamp;
                        str2 = slug;
                        highlight = (Highlight) T;
                        if (highlight != null) {
                        }
                    }
                    return lu3Var;
                }
            }
            return null;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j2 = this.y;
            int i4 = this.x;
            iy7 iy7Var2 = this.v;
            bx7 bx7Var2 = this.u;
            String str3 = this.t;
            String str4 = this.s;
            y6a.M(obj);
            str = str4;
            bx7Var = bx7Var2;
            T = obj;
            i = i4;
            str2 = str3;
            iy7Var = iy7Var2;
            j = j2;
            highlight = (Highlight) T;
            if (highlight != null) {
                return new cqk(i, str2, j, iy7Var, bx7Var, str, null, highlight, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
            }
            return null;
        }
        int i5 = this.w;
        t = this.r;
        y6a.M(obj);
        intValue = i5;
        w = obj;
        EventResponse eventResponse = (EventResponse) yaa.x((x2g) w);
        event = eventResponse != null ? eventResponse.getEvent() : null;
    }
}
