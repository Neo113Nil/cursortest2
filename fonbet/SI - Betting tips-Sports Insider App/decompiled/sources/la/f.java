package la;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19459b;

    /* renamed from: c, reason: collision with root package name */
    public int f19460c;

    /* renamed from: d, reason: collision with root package name */
    public int f19461d;

    /* renamed from: e, reason: collision with root package name */
    public Object f19462e;

    /* renamed from: f, reason: collision with root package name */
    public Object f19463f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f19464g;

    /* renamed from: h, reason: collision with root package name */
    public Object f19465h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(List list, Object obj, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19459b = i5;
        this.f19464g = list;
        this.f19465h = obj;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19459b) {
            case 0:
                return new f((g) this.f19464g, continuation);
            case 1:
                return new f((List) this.f19464g, (s0) this.f19465h, continuation, 1);
            case 2:
                return new f((md.m) this.f19462e, this.f19461d, (String) this.f19463f, (String) this.f19464g, (String) this.f19465h, continuation);
            default:
                return new f((List) this.f19464g, (pc.u) this.f19465h, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19459b) {
        }
        return ((f) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:133:0x0113
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02fc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x025e -> B:41:0x0113). Please report as a decompilation issue!!! */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: la.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Continuation continuation) {
        super(2, continuation);
        this.f19459b = 0;
        this.f19464g = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(md.m mVar, int i5, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.f19459b = 2;
        this.f19462e = mVar;
        this.f19461d = i5;
        this.f19463f = str;
        this.f19464g = str2;
        this.f19465h = str3;
    }
}
