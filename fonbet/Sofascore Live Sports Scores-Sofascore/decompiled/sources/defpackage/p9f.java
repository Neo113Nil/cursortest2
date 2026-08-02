package defpackage;

import com.sofascore.model.profile.EditorTournament;
import com.sofascore.model.profile.EditorsTournamentsResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class p9f extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ q9f t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p9f(q9f q9fVar, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.t = q9fVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        q9f q9fVar = this.t;
        switch (i) {
            case 0:
                return new p9f(q9fVar, rq3Var, 0);
            case 1:
                return new p9f(q9fVar, rq3Var, 1);
            default:
                return new p9f(q9fVar, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((p9f) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        q9f q9fVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    oi5 oi5Var = q9fVar.m;
                    String str = q9fVar.o;
                    this.s = 1;
                    obj = oi5Var.a.getEditorsTournaments(str, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                List<EditorTournament> uniqueTournaments = ((EditorsTournamentsResponse) obj).getUniqueTournaments();
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : uniqueTournaments) {
                    if (hashSet.add(new Integer(((EditorTournament) obj2).getUniqueTournament().getId()))) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((EditorTournament) it.next()).getUniqueTournament());
                }
                return arrayList2;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                oi5 oi5Var2 = q9fVar.m;
                String str2 = q9fVar.o;
                this.s = 1;
                Object mostOpenedEditorMatches = oi5Var2.a.getMostOpenedEditorMatches(str2, this);
                return mostOpenedEditorMatches == lu3Var2 ? lu3Var2 : mostOpenedEditorMatches;
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                oi5 oi5Var3 = q9fVar.m;
                String str3 = q9fVar.o;
                this.s = 1;
                Object editorOpeningsGraphResponse = oi5Var3.a.getEditorOpeningsGraphResponse(str3, this);
                return editorOpeningsGraphResponse == lu3Var3 ? lu3Var3 : editorOpeningsGraphResponse;
        }
    }
}
