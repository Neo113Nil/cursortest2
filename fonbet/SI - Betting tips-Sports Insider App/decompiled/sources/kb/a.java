package kb;

import com.google.gson.reflect.TypeToken;
import eg.z;
import f3.x;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import java.lang.reflect.Type;
import k2.w;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mf.i;
import sb.j;
import ub.d;
import ub.e;
import ub.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fb.b f18965b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18966c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Boolean f18967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f18968e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f18969f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f18970g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f18971h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f18972i;
    public final /* synthetic */ Boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f18973k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f18974l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f18975m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f18976n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Integer f18977o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f18978p;
    public final /* synthetic */ String q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Integer f18979r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Integer f18980s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Integer f18981t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f18982u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f18983v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Integer f18984w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Integer f18985x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Integer[] f18986y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(fb.b bVar, int i5, Boolean bool, String str, String str2, String str3, String str4, String str5, Boolean bool2, int i10, String str6, String str7, String str8, Integer num, String str9, String str10, Integer num2, Integer num3, Integer num4, String str11, String str12, Integer num5, Integer num6, Integer[] numArr, Continuation continuation) {
        super(2, continuation);
        this.f18965b = bVar;
        this.f18966c = i5;
        this.f18967d = bool;
        this.f18968e = str;
        this.f18969f = str2;
        this.f18970g = str3;
        this.f18971h = str4;
        this.f18972i = str5;
        this.j = bool2;
        this.f18973k = i10;
        this.f18974l = str6;
        this.f18975m = str7;
        this.f18976n = str8;
        this.f18977o = num;
        this.f18978p = str9;
        this.q = str10;
        this.f18979r = num2;
        this.f18980s = num3;
        this.f18981t = num4;
        this.f18982u = str11;
        this.f18983v = str12;
        this.f18984w = num5;
        this.f18985x = num6;
        this.f18986y = numArr;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f18965b, this.f18966c, this.f18967d, this.f18968e, this.f18969f, this.f18970g, this.f18971h, this.f18972i, this.j, this.f18973k, this.f18974l, this.f18975m, this.f18976n, this.f18977o, this.f18978p, this.q, this.f18979r, this.f18980s, this.f18981t, this.f18982u, this.f18983v, this.f18984w, this.f18985x, this.f18986y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v4 */
    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        j jVar;
        Integer[] numArr;
        String status;
        int i5;
        ?? r72;
        int i10;
        lf.a aVar = lf.a.f20034a;
        h8.b.B(obj);
        j e0 = x.e0();
        f fVar = e0.f23427b;
        Boolean bool = this.f18967d;
        final int i11 = this.f18966c;
        if (e0.a(bool, i11)) {
            Type type = new TypeToken<Integer[]>() { // from class: com.sports.insider.data.room.general.RoomRepo$addPrediction$typeArrayInt$1
            }.getType();
            com.google.gson.j jVar2 = new com.google.gson.j();
            Integer[] numArr2 = this.f18986y;
            final String f6 = jVar2.f(numArr2, type);
            w wVar = fVar.f24213a;
            w wVar2 = fVar.f24213a;
            int intValue = ((Number) x.n0(wVar, true, false, new d(i11, 2))).intValue();
            String str = this.f18968e;
            String str2 = this.f18969f;
            final String str3 = this.f18970g;
            String str4 = this.f18971h;
            String str5 = this.f18972i;
            final int i12 = this.f18973k;
            final String status2 = this.f18974l;
            final String str6 = this.f18975m;
            final String str7 = this.f18976n;
            final Integer num = this.f18977o;
            final String str8 = this.f18978p;
            final String str9 = this.q;
            final Integer num2 = this.f18979r;
            final Integer num3 = this.f18980s;
            final Integer num4 = this.f18981t;
            final String str10 = this.f18982u;
            final String str11 = this.f18983v;
            final Integer num5 = this.f18984w;
            final Integer num6 = this.f18985x;
            if (intValue > 0) {
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                final int epochSecond = (int) ZonedDateTime.parse(str2, DateTimeFormatter.ISO_DATE_TIME).withZoneSameInstant(ZoneId.systemDefault()).toEpochSecond();
                if (status2 == null) {
                    status2 = "unknown";
                }
                Intrinsics.checkNotNullParameter(status2, "status");
                jVar = e0;
                numArr = numArr2;
                final int i13 = booleanValue ? 1 : 0;
                ((Number) x.n0(wVar2, false, true, new Function1() { // from class: ub.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i14 = epochSecond;
                        int i15 = i13;
                        int i16 = i12;
                        String str12 = status2;
                        int i17 = i11;
                        s2.a _connection = (s2.a) obj2;
                        Intrinsics.checkNotNullParameter(_connection, "_connection");
                        s2.c r02 = _connection.r0("\n        UPDATE OR IGNORE table_prediction_preview \n        SET startTime = ?, publication = ?, type = ?, status = ?,\n        imageBackground = ? ,odds = ?, \n        forecasts = ?, arrayKind = ?,\n        oddsForecast = ?, forecast = ?,\n        teamHomeId = ?, teamGuestId = ?,\n        teamHomeFlag = ?, teamGuestFlag = ?,\n        teamHomeName = ?, teamGuestName = ?,\n        scoreHome = ?, scoreGuest = ?,\n        scoreHomeExtra = ?, scoreGuestExtra = ?\n        WHERE id == ? ");
                        try {
                            r02.f(1, i14);
                            r02.f(2, i15);
                            r02.f(3, i16);
                            r02.B(4, str12);
                            String str13 = str3;
                            if (str13 == null) {
                                r02.h(5);
                            } else {
                                r02.B(5, str13);
                            }
                            String str14 = str6;
                            if (str14 == null) {
                                r02.h(6);
                            } else {
                                r02.B(6, str14);
                            }
                            r02.h(7);
                            String str15 = f6;
                            if (str15 == null) {
                                r02.h(8);
                            } else {
                                r02.B(8, str15);
                            }
                            String str16 = str6;
                            if (str16 == null) {
                                r02.h(9);
                            } else {
                                r02.B(9, str16);
                            }
                            String str17 = str7;
                            if (str17 == null) {
                                r02.h(10);
                            } else {
                                r02.B(10, str17);
                            }
                            if (num == null) {
                                r02.h(11);
                            } else {
                                r02.f(11, r0.intValue());
                            }
                            if (num4 == null) {
                                r02.h(12);
                            } else {
                                r02.f(12, r0.intValue());
                            }
                            String str18 = str9;
                            if (str18 == null) {
                                r02.h(13);
                            } else {
                                r02.B(13, str18);
                            }
                            String str19 = str11;
                            if (str19 == null) {
                                r02.h(14);
                            } else {
                                r02.B(14, str19);
                            }
                            String str20 = str8;
                            if (str20 == null) {
                                r02.h(15);
                            } else {
                                r02.B(15, str20);
                            }
                            String str21 = str10;
                            if (str21 == null) {
                                r02.h(16);
                            } else {
                                r02.B(16, str21);
                            }
                            if (num2 == null) {
                                r02.h(17);
                            } else {
                                r02.f(17, r0.intValue());
                            }
                            if (num5 == null) {
                                r02.h(18);
                            } else {
                                r02.f(18, r0.intValue());
                            }
                            if (num3 == null) {
                                r02.h(19);
                            } else {
                                r02.f(19, r0.intValue());
                            }
                            if (num6 == null) {
                                r02.h(20);
                            } else {
                                r02.f(20, r0.intValue());
                            }
                            r02.f(21, i17);
                            r02.n0();
                            int q = io.sentry.config.a.q(_connection);
                            r02.close();
                            return Integer.valueOf(q);
                        } catch (Throwable th2) {
                            r02.close();
                            throw th2;
                        }
                    }
                })).intValue();
                Intrinsics.checkNotNullParameter(status2, "status");
                ((Number) x.n0(wVar2, false, true, new e(epochSecond, booleanValue ? 1 : 0, i12, status2, str3, str6, str4, str5, str, f6, str6, str7, num, num4, str9, str11, str8, str10, num2, num5, num3, num6, i11))).intValue();
                i10 = i11;
            } else {
                jVar = e0;
                numArr = numArr2;
                if (bool != null) {
                    i5 = i12;
                    r72 = bool.booleanValue();
                    status = status2;
                } else {
                    status = status2;
                    i5 = i12;
                    r72 = 0;
                }
                int epochSecond2 = (int) ZonedDateTime.parse(str2, DateTimeFormatter.ISO_DATE_TIME).withZoneSameInstant(ZoneId.systemDefault()).toEpochSecond();
                if (status == null) {
                    status = "unknown";
                }
                Intrinsics.checkNotNullParameter(status, "status");
                i10 = i11;
                ((Number) x.n0(wVar2, false, true, new e(i10, epochSecond2, (int) r72, i5, status, str3, str6, str4, str5, str, f6, str6, str7, num, num4, str9, str11, str8, str10, num2, num5, num3, num6))).longValue();
            }
            jVar.b(i10, numArr);
        }
        return Unit.f19194a;
    }
}
