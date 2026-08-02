package qb;

import com.sports.insider.data.repository.room.support.dp.impl.SupportTable;
import eg.z;
import f3.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mf.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22088b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fb.b f22089c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22090d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(fb.b bVar, int i5, Continuation continuation, int i10) {
        super(2, continuation);
        this.f22088b = i10;
        this.f22089c = bVar;
        this.f22090d = i5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f22088b) {
            case 0:
                return new b(this.f22089c, this.f22090d, continuation, 0);
            default:
                return new b(this.f22089c, this.f22090d, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f22088b) {
        }
        return ((b) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f22088b;
        int i10 = this.f22090d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                return new Integer(((Number) x.n0(fb.b.P0().f22382a.f22378a, false, true, new eb.b(i10, 12))).intValue());
            default:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                List<SupportTable> list = (List) x.n0(fb.b.P0().f22382a.f22378a, true, false, new eb.b(i10, 13));
                ArrayList arrayList = new ArrayList();
                for (SupportTable supportTable : list) {
                    ka.a supportData = supportTable != null ? supportTable.toSupportData() : null;
                    if (supportData != null) {
                        arrayList.add(supportData);
                    }
                }
                return arrayList;
        }
    }
}
