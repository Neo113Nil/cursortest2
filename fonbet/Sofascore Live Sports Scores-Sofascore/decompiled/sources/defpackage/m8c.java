package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.EventResponse;
import com.sofascore.model.newNetwork.PlayerDetailsResponse;
import com.sofascore.model.newNetwork.TeamDetailsResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class m8c extends hoi implements Function2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ MediaPost B;
    public final /* synthetic */ et8 C;
    public final /* synthetic */ Event D;
    public final /* synthetic */ u8c E;
    public av4 r;
    public zu4 s;
    public et8 t;
    public Event u;
    public Player v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8c(MediaPost mediaPost, et8 et8Var, Event event, u8c u8cVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.B = mediaPost;
        this.C = et8Var;
        this.D = event;
        this.E = u8cVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        m8c m8cVar = new m8c(this.B, this.C, this.D, this.E, rq3Var);
        m8cVar.A = obj;
        return m8cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m8c) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x012d, code lost:
    
        if (r5 != r2) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int intValue;
        int intValue2;
        av4 t;
        et8 et8Var;
        Event event;
        int i;
        zu4 zu4Var;
        Object w;
        int i2;
        int i3;
        Object T;
        int i4;
        int i5;
        Event event2;
        PlayerDetailsResponse playerDetailsResponse;
        Player player;
        Object T2;
        Team team;
        ku3 ku3Var = (ku3) this.A;
        lu3 lu3Var = lu3.a;
        int i6 = this.z;
        rq3 rq3Var = null;
        if (i6 == 0) {
            y6a.M(obj);
            MediaPost mediaPost = this.B;
            Integer playerId = mediaPost.getPlayerId();
            if (playerId != null) {
                intValue = playerId.intValue();
                Integer eventId = mediaPost.getEventId();
                if (eventId != null) {
                    int intValue3 = eventId.intValue();
                    Integer teamId = mediaPost.getTeamId();
                    if (teamId != null) {
                        intValue2 = teamId.intValue();
                        u8c u8cVar = this.E;
                        t = xw3.t(ku3Var, null, new w7c(u8cVar, intValue, rq3Var, 6), 3);
                        av4 t2 = xw3.t(ku3Var, null, new w7c(u8cVar, intValue3, rq3Var, 5), 3);
                        av4 t3 = xw3.t(ku3Var, null, new w7c(u8cVar, intValue2, rq3Var, 7), 3);
                        et8Var = this.C;
                        event = this.D;
                        if (event == null) {
                            this.A = null;
                            this.r = t;
                            this.s = t3;
                            this.t = et8Var;
                            this.w = intValue;
                            this.x = intValue3;
                            this.y = intValue2;
                            this.z = 1;
                            w = t2.w(this);
                            if (w != lu3Var) {
                                zu4Var = t3;
                                i2 = intValue2;
                                i3 = intValue3;
                            }
                        }
                        i = intValue3;
                        zu4Var = t3;
                        int i7 = i;
                        this.A = null;
                        this.r = null;
                        this.s = zu4Var;
                        this.t = et8Var;
                        this.u = event;
                        this.w = intValue;
                        this.x = i7;
                        this.y = intValue2;
                        this.z = 2;
                        T = t.T(this);
                        if (T != lu3Var) {
                            int i8 = intValue2;
                            i4 = i7;
                            i5 = i8;
                            event2 = event;
                            playerDetailsResponse = (PlayerDetailsResponse) yaa.x((x2g) T);
                            if (playerDetailsResponse != null) {
                                this.A = null;
                                this.r = null;
                                this.s = null;
                                this.t = et8Var;
                                this.u = event2;
                                this.v = player;
                                this.w = intValue;
                                this.x = i4;
                                this.y = i5;
                                this.z = 3;
                                T2 = zu4Var.T(this);
                            }
                        }
                    }
                }
            }
            return null;
        }
        if (i6 != 1) {
            if (i6 == 2) {
                i5 = this.y;
                i4 = this.x;
                int i9 = this.w;
                event2 = this.u;
                et8 et8Var2 = this.t;
                zu4Var = this.s;
                y6a.M(obj);
                et8Var = et8Var2;
                intValue = i9;
                T = obj;
                playerDetailsResponse = (PlayerDetailsResponse) yaa.x((x2g) T);
                if (playerDetailsResponse != null && (player = playerDetailsResponse.getPlayer()) != null) {
                    this.A = null;
                    this.r = null;
                    this.s = null;
                    this.t = et8Var;
                    this.u = event2;
                    this.v = player;
                    this.w = intValue;
                    this.x = i4;
                    this.y = i5;
                    this.z = 3;
                    T2 = zu4Var.T(this);
                }
                return null;
            }
            if (i6 != 3) {
                if (i6 == 4) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i5 = this.y;
            i4 = this.x;
            int i10 = this.w;
            player = this.v;
            event2 = this.u;
            et8 et8Var3 = this.t;
            y6a.M(obj);
            et8Var = et8Var3;
            intValue = i10;
            T2 = obj;
            TeamDetailsResponse teamDetailsResponse = (TeamDetailsResponse) yaa.x((x2g) T2);
            if (teamDetailsResponse != null && (team = teamDetailsResponse.getTeam()) != null) {
                this.A = null;
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = null;
                this.w = intValue;
                this.x = i4;
                this.y = i5;
                this.z = 4;
                Object invoke = et8Var.invoke(event2, player, team, this);
                return invoke == lu3Var ? lu3Var : invoke;
            }
            return null;
        }
        i2 = this.y;
        i3 = this.x;
        int i11 = this.w;
        et8 et8Var4 = this.t;
        zu4Var = this.s;
        t = this.r;
        y6a.M(obj);
        et8Var = et8Var4;
        intValue = i11;
        w = obj;
        EventResponse eventResponse = (EventResponse) yaa.x((x2g) w);
        event = eventResponse != null ? eventResponse.getEvent() : null;
        if (event != null) {
            i = i3;
            intValue2 = i2;
            int i72 = i;
            this.A = null;
            this.r = null;
            this.s = zu4Var;
            this.t = et8Var;
            this.u = event;
            this.w = intValue;
            this.x = i72;
            this.y = intValue2;
            this.z = 2;
            T = t.T(this);
            if (T != lu3Var) {
            }
        }
        return null;
    }
}
