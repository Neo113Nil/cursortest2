package fb;

import android.database.sqlite.SQLiteConstraintException;
import eg.z;
import f3.x;
import k2.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mf.i;
import r4.k;
import sb.j;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f9543b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9544c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f9545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f9546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f9547f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f9548g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f9549h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, String str, String str2, String str3, String str4, String str5, String str6, Continuation continuation) {
        super(2, continuation);
        this.f9543b = bVar;
        this.f9544c = str;
        this.f9545d = str2;
        this.f9546e = str3;
        this.f9547f = str4;
        this.f9548g = str5;
        this.f9549h = str6;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f9543b, this.f9544c, this.f9545d, this.f9546e, this.f9547f, this.f9548g, this.f9549h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        lf.a aVar = lf.a.f20034a;
        h8.b.B(obj);
        j e0 = x.e0();
        e0.getClass();
        String devId = this.f9545d;
        Intrinsics.checkNotNullParameter(devId, "devId");
        int intValue = ((Number) x.n0(e0.f23426a.f23832a, true, false, new d0(25))).intValue();
        String str = this.f9544c;
        String str2 = this.f9546e;
        String str3 = this.f9547f;
        String str4 = this.f9548g;
        String str5 = this.f9549h;
        if (intValue > 0) {
            k.d(e0.f23426a, str, devId, str2, str3, str4, str5);
        } else {
            try {
                k.i(e0.f23426a, str, devId, str2, str3, str4, str5, 8068);
            } catch (SQLiteConstraintException unused) {
                k.d(e0.f23426a, str, devId, str2, str3, str4, str5);
            }
        }
        return Unit.f19194a;
    }
}
