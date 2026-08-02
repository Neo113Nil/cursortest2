package lb;

import com.google.gson.reflect.TypeToken;
import eg.z;
import f3.x;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mf.i;
import sb.j;
import ub.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fb.b f19640b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19641c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Boolean f19642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f19643e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f19644f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Boolean f19645g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f19646h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f19647i;
    public final /* synthetic */ String j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f19648k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Integer f19649l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f19650m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f19651n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Integer f19652o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Integer f19653p;
    public final /* synthetic */ Integer q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f19654r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f19655s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Integer f19656t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Integer f19657u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Integer[] f19658v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(fb.b bVar, int i5, Boolean bool, String str, String str2, Boolean bool2, int i10, String str3, String str4, String str5, Integer num, String str6, String str7, Integer num2, Integer num3, Integer num4, String str8, String str9, Integer num5, Integer num6, Integer[] numArr, Continuation continuation) {
        super(2, continuation);
        this.f19640b = bVar;
        this.f19641c = i5;
        this.f19642d = bool;
        this.f19643e = str;
        this.f19644f = str2;
        this.f19645g = bool2;
        this.f19646h = i10;
        this.f19647i = str3;
        this.j = str4;
        this.f19648k = str5;
        this.f19649l = num;
        this.f19650m = str6;
        this.f19651n = str7;
        this.f19652o = num2;
        this.f19653p = num3;
        this.q = num4;
        this.f19654r = str8;
        this.f19655s = str9;
        this.f19656t = num5;
        this.f19657u = num6;
        this.f19658v = numArr;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f19640b, this.f19641c, this.f19642d, this.f19643e, this.f19644f, this.f19645g, this.f19646h, this.f19647i, this.j, this.f19648k, this.f19649l, this.f19650m, this.f19651n, this.f19652o, this.f19653p, this.q, this.f19654r, this.f19655s, this.f19656t, this.f19657u, this.f19658v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        Integer[] numArr;
        String str;
        ?? r14;
        int i5;
        Integer[] numArr2;
        String str2;
        String str3;
        ?? r13;
        lf.a aVar = lf.a.f20034a;
        h8.b.B(obj);
        j e0 = x.e0();
        f fVar = e0.f23427b;
        Boolean bool = this.f19642d;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        int i10 = this.f19641c;
        if (e0.a(bool, i10)) {
            String str4 = this.f19647i;
            String status = str4 == null ? "unknown" : str4;
            int epochSecond = (int) ZonedDateTime.parse(this.f19643e, DateTimeFormatter.ISO_DATE_TIME).withZoneSameInstant(ZoneId.systemDefault()).toEpochSecond();
            boolean z5 = (Intrinsics.areEqual(status, "unknown") && booleanValue && 1209600 + epochSecond < ((int) Instant.now().getEpochSecond())) ? false : booleanValue;
            Type type = new TypeToken<Integer[]>() { // from class: com.sports.insider.data.room.general.RoomRepo$addPredictionPreview$typeArrayInt$1
            }.getType();
            com.google.gson.j jVar = new com.google.gson.j();
            Integer[] numArr3 = this.f19658v;
            String f6 = jVar.f(numArr3, type);
            int intValue = ((Number) x.n0(e0.f23427b.f24213a, true, false, new eb.b(i10, 23))).intValue();
            String str5 = this.f19644f;
            Boolean bool2 = this.f19645g;
            boolean z7 = z5;
            int i11 = this.f19646h;
            String str6 = this.j;
            String str7 = this.f19648k;
            Integer num = this.f19649l;
            String str8 = this.f19650m;
            String str9 = this.f19651n;
            Integer num2 = this.f19652o;
            Integer num3 = this.f19653p;
            Integer num4 = this.q;
            String str10 = this.f19654r;
            String str11 = this.f19655s;
            Integer num5 = this.f19656t;
            Integer num6 = this.f19657u;
            if (intValue > 0) {
                if (bool2 != null) {
                    r13 = bool2.booleanValue();
                    numArr2 = numArr3;
                    str2 = str5;
                    str3 = str6;
                } else {
                    numArr2 = numArr3;
                    str2 = str5;
                    str3 = str6;
                    r13 = 0;
                }
                fVar.getClass();
                Intrinsics.checkNotNullParameter(status, "status");
                numArr = numArr2;
                ((Number) x.n0(fVar.f24213a, false, true, new ub.c(epochSecond, z7 ? 1 : 0, i11, status, str2, str3, (int) r13, f6, str3, str7, num, num4, str9, str11, str8, str10, num2, num5, num3, num6, i10))).intValue();
                i5 = i10;
            } else {
                numArr = numArr3;
                if (bool2 != null) {
                    str = f6;
                    r14 = bool2.booleanValue();
                } else {
                    str = f6;
                    r14 = 0;
                }
                fVar.getClass();
                Intrinsics.checkNotNullParameter(status, "status");
                i5 = i10;
                ((Number) x.n0(fVar.f24213a, false, true, new ub.c(i5, epochSecond, z7 ? 1 : 0, i11, status, str5, str6, (int) r14, str, str6, str7, num, num4, str9, str11, str8, str10, num2, num5, num3, num6))).longValue();
            }
            e0.b(i5, numArr);
        }
        return Unit.f19194a;
    }
}
