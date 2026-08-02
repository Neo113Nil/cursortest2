package la;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19424b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f19425c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19424b = i5;
        this.f19425c = dVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19424b) {
            case 0:
                return new c(this.f19425c, continuation, 0);
            case 1:
                return new c(this.f19425c, continuation, 1);
            case 2:
                return new c(this.f19425c, continuation, 2);
            default:
                return new c(this.f19425c, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19424b) {
        }
        return ((c) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f19424b;
        d dVar = this.f19425c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                return d.K0(dVar).a("announcement");
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                fa.a K0 = d.K0(dVar);
                K0.getClass();
                Intrinsics.checkNotNullParameter("announcementId", "key");
                int i10 = K0.f9541a.getInt("announcementId", 0);
                if (i10 == 0) {
                    return new Integer(0);
                }
                fa.a K02 = d.K0(dVar);
                K02.getClass();
                Intrinsics.checkNotNullParameter("announcementIdCreate", "key");
                if (K02.f9542b.getLong("announcementIdCreate", 0L) + 2592000000L > System.currentTimeMillis()) {
                    return new Integer(i10);
                }
                d.K0(dVar).d("announcement", null);
                fa.a K03 = d.K0(dVar);
                K03.getClass();
                Intrinsics.checkNotNullParameter("announcementId", "key");
                SharedPreferences.Editor edit = K03.f9541a.edit();
                edit.putInt("announcementId", 0);
                edit.apply();
                d.K0(dVar).c(0L, "announcementIdCreate");
                d.K0(dVar).b("announcementIsRead", false);
                return new Integer(0);
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                fa.a K04 = d.K0(dVar);
                K04.getClass();
                Intrinsics.checkNotNullParameter("announcementIsRead", "key");
                return Boolean.valueOf(K04.f9542b.getBoolean("announcementIsRead", false));
            default:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                d.K0(dVar).b("announcementIsRead", true);
                return Unit.f19194a;
        }
    }
}
