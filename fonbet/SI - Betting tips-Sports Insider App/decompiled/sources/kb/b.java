package kb;

import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import eg.z;
import f3.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mf.i;
import ub.d;
import ub.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fb.b f18988c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18989d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(fb.b bVar, int i5, Continuation continuation, int i10) {
        super(2, continuation);
        this.f18987b = i10;
        this.f18988c = bVar;
        this.f18989d = i5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f18987b) {
            case 0:
                return new b(this.f18988c, this.f18989d, continuation, 0);
            case 1:
                return new b(this.f18988c, this.f18989d, continuation, 1);
            case 2:
                return new b(this.f18988c, this.f18989d, continuation, 2);
            case 3:
                return new b(this.f18988c, this.f18989d, continuation, 3);
            case 4:
                return new b(this.f18988c, this.f18989d, continuation, 4);
            case 5:
                return new b(this.f18988c, this.f18989d, continuation, 5);
            case 6:
                return new b(this.f18988c, this.f18989d, continuation, 6);
            default:
                return new b(this.f18988c, this.f18989d, continuation, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f18987b) {
        }
        return ((b) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f18987b;
        boolean z5 = false;
        int i10 = this.f18989d;
        int i11 = 1;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                f fVar = x.e0().f23427b;
                if (((Number) x.n0(fVar.f24213a, true, false, new d(i10, i11))).intValue() > 0) {
                    z5 = io.sentry.config.a.C(Integer.valueOf(((Number) x.n0(fVar.f24213a, false, true, new eb.b(i10, 27))).intValue()));
                } else if (((Number) x.n0(fVar.f24213a, false, true, new eb.b(i10, 24))).longValue() > 0) {
                    z5 = true;
                }
                return Boolean.valueOf(z5);
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                return (ja.a) x.n0(x.e0().f23426a.f23832a, true, false, new eb.b(i10, 19));
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                return Boolean.valueOf(io.sentry.config.a.C(Integer.valueOf(((Number) x.n0(x.e0().f23426a.f23832a, true, false, new eb.b(i10, 20))).intValue())));
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                return (String) x.n0(x.e0().f23427b.f24213a, true, false, new eb.b(i10, 25));
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                PredictionTable predictionTable = (PredictionTable) x.n0(x.e0().f23427b.f24213a, true, false, new eb.b(i10, 28));
                if (predictionTable == null) {
                    return null;
                }
                return new ja.b(predictionTable.getId(), predictionTable.getStartTime(), predictionTable.getPublication(), predictionTable.getType(), predictionTable.getStatus(), predictionTable.getImageBackground(), predictionTable.getOdds(), predictionTable.getResultsIsViewed(), predictionTable.getAnalyticsFull(), predictionTable.getAnalyticsShort(), predictionTable.getLeague(), predictionTable.getForecasts(), predictionTable.getArrayKind(), predictionTable.getArrayPrediction(), predictionTable.getOddsForecast(), predictionTable.getForecast(), predictionTable.getTeamHomeId(), predictionTable.getTeamGuestId(), predictionTable.getTeamHomeFlag(), predictionTable.getTeamGuestFlag(), predictionTable.getTeamHomeName(), predictionTable.getTeamGuestName(), predictionTable.getScoreHome(), predictionTable.getScoreGuest(), predictionTable.getScoreHomeExtra(), predictionTable.getScoreGuestExtra());
            case 5:
                lf.a aVar6 = lf.a.f20034a;
                h8.b.B(obj);
                x.n0(x.e0().f23427b.f24213a, false, true, new d(i10, 4));
                return Unit.f19194a;
            case 6:
                lf.a aVar7 = lf.a.f20034a;
                h8.b.B(obj);
                return new Integer(((Number) x.n0(x.e0().f23427b.f24213a, false, true, new d(i10, 9))).intValue());
            default:
                lf.a aVar8 = lf.a.f20034a;
                h8.b.B(obj);
                return new Integer(((Number) x.n0(x.e0().f23426a.f23832a, false, true, new eb.b(i10, 16))).intValue());
        }
    }
}
