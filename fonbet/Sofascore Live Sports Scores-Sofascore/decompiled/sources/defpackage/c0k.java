package defpackage;

import android.app.Application;
import com.sofascore.model.newNetwork.TrendingGridTile;
import com.sofascore.model.newNetwork.TrendingGridTileSize;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lc0k;", "Lynb;", "Ltzj;", "Lmzj;", "", "yzj", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class c0k extends ynb {
    public final vyh l;
    public final boolean m;
    public final List n;
    public final LinkedHashSet o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0k(Application application, vyh vyhVar) {
        super(application, tnb.a);
        vyhVar.getClass();
        this.l = vyhVar;
        ia0 ia0Var = ia0.q;
        this.m = mz1.C();
        TrendingGridTileSize trendingGridTileSize = TrendingGridTileSize.MEDIUM;
        yzj yzjVar = new yzj(2, trendingGridTileSize, 0);
        yzj yzjVar2 = new yzj(6, trendingGridTileSize, 1);
        TrendingGridTileSize trendingGridTileSize2 = TrendingGridTileSize.LARGE;
        this.n = b.j(yzjVar, yzjVar2, new yzj(13, trendingGridTileSize2, 2), new yzj(18, trendingGridTileSize, 3), new yzj(27, trendingGridTileSize2, 4), new yzj(33, trendingGridTileSize, 5), new yzj(39, trendingGridTileSize, 6), new yzj(46, trendingGridTileSize, 7), new yzj(56, trendingGridTileSize2, 8));
        this.o = new LinkedHashSet();
    }

    public static zyj u(yzj yzjVar, TrendingGridTile trendingGridTile) {
        TrendingGridTileSize trendingGridTileSize = yzjVar.b;
        int i = yzjVar.c;
        int i2 = zzj.a[trendingGridTileSize.ordinal()];
        if (i2 == 1) {
            return new wyj(i, trendingGridTile);
        }
        if (i2 == 2) {
            return new syj(i, trendingGridTile);
        }
        if (i2 != 3) {
            zzl.b();
            return null;
        }
        a70.r("Slot size must be MEDIUM or LARGE — slots are hardcoded.");
        return null;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public final java.lang.Object t(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r31v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */
}
