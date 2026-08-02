package defpackage;

import com.sofascore.model.mvvm.model.Event;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m5d implements b98 {
    public final /* synthetic */ b98 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ boolean c;

    public m5d(b98 b98Var, Function0 function0, boolean z) {
        this.a = b98Var;
        this.b = function0;
        this.c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        l5d l5dVar;
        int i;
        if (rq3Var instanceof l5d) {
            l5dVar = (l5d) rq3Var;
            int i2 = l5dVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l5dVar.s = i2 - Integer.MIN_VALUE;
                Object obj2 = l5dVar.r;
                lu3 lu3Var = lu3.a;
                i = l5dVar.s;
                Event event = null;
                if (i != 0) {
                    y6a.M(obj2);
                    JSONObject jSONObject = (JSONObject) obj;
                    Event event2 = (Event) this.b.invoke();
                    if (event2 != null) {
                        if (this.c) {
                            uoh.a(jSONObject);
                        }
                        Event copyEvent = event2.copyEvent();
                        if (ufa.D(jSONObject, copyEvent)) {
                            event = copyEvent;
                        }
                    }
                    l5dVar.s = 1;
                    if (this.a.emit(event, l5dVar) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj2);
                }
                return Unit.a;
            }
        }
        l5dVar = new l5d(this, rq3Var);
        Object obj22 = l5dVar.r;
        lu3 lu3Var2 = lu3.a;
        i = l5dVar.s;
        Event event3 = null;
        if (i != 0) {
        }
        return Unit.a;
    }
}
