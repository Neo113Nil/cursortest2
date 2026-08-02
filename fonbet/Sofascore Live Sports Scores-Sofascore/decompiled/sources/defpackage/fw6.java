package defpackage;

import android.content.Context;
import android.view.View;
import com.sofascore.model.profile.InvitedUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class fw6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1d b;

    public /* synthetic */ fw6(int i, e1d e1dVar) {
        this.a = i;
        this.b = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        e1d e1dVar = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                e1dVar.setValue(str);
                return Unit.a;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                e1dVar.setValue(bool);
                return Unit.a;
            case 2:
                ((o55) obj).getClass();
                return new e27(0, e1dVar);
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                e1dVar.setValue(str2);
                return Unit.a;
            case 4:
                r27 r27Var = (r27) obj;
                r27Var.getClass();
                e1dVar.setValue(r27Var);
                return Unit.a;
            case 5:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                e1dVar.setValue(bool2);
                return Unit.a;
            case 6:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                e1dVar.setValue(bool3);
                return Unit.a;
            case 7:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                e1dVar.setValue(bool4);
                return Unit.a;
            case 8:
                Boolean bool5 = (Boolean) obj;
                bool5.getClass();
                e1dVar.setValue(bool5);
                return Unit.a;
            case 9:
                ((o55) obj).getClass();
                return new e27(1, e1dVar);
            case 10:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                e1dVar.setValue(bool6);
                return Unit.a;
            case 11:
                cm7 cm7Var = (cm7) obj;
                cm7Var.getClass();
                e1dVar.setValue(cm7Var);
                return Unit.a;
            case 12:
                Boolean bool7 = (Boolean) obj;
                bool7.getClass();
                e1dVar.setValue(bool7);
                return Unit.a;
            case 13:
                Boolean bool8 = (Boolean) obj;
                bool8.getClass();
                e1dVar.setValue(bool8);
                return Unit.a;
            case 14:
                dma dmaVar = (dma) obj;
                dmaVar.getClass();
                e1dVar.setValue(new dnd(dmaVar.I(0L)));
                return Unit.a;
            case 15:
                dma dmaVar2 = (dma) obj;
                dmaVar2.getClass();
                e1dVar.setValue(jca.r(dmaVar2.w(0L), d7a.I(dmaVar2.e())));
                return Unit.a;
            case 16:
                Boolean bool9 = (Boolean) obj;
                bool9.getClass();
                e1dVar.setValue(bool9);
                return Unit.a;
            case 17:
                aej aejVar = (aej) obj;
                aejVar.getClass();
                if (((Boolean) e1dVar.getValue()) == null) {
                    e1dVar.setValue(Boolean.valueOf(aejVar.d()));
                }
                return Unit.a;
            case 18:
                dma dmaVar3 = (dma) obj;
                dmaVar3.getClass();
                e1dVar.setValue(new c7a(dmaVar3.e()));
                return Unit.a;
            case 19:
                Boolean bool10 = (Boolean) obj;
                bool10.booleanValue();
                e1dVar.setValue(bool10);
                return Unit.a;
            case 20:
                Boolean bool11 = (Boolean) obj;
                bool11.getClass();
                e1dVar.setValue(bool11);
                return Unit.a;
            case 21:
                dma dmaVar4 = (dma) obj;
                dmaVar4.getClass();
                e1dVar.setValue(jca.r(dmaVar4.w(0L), d7a.I(dmaVar4.e())));
                return Unit.a;
            case 22:
                Boolean bool12 = (Boolean) obj;
                bool12.getClass();
                e1dVar.setValue(bool12);
                return Unit.a;
            case 23:
                e1dVar.setValue((dma) obj);
                return Unit.a;
            case 24:
                ll1 ll1Var = (ll1) obj;
                ll1Var.getClass();
                e1dVar.setValue(ll1Var);
                return Unit.a;
            case 25:
                Context context = (Context) obj;
                context.getClass();
                return new ywe(context, e1dVar);
            case 26:
                View view = (View) obj;
                view.getClass();
                e1dVar.setValue(view);
                return Unit.a;
            case 27:
                InvitedUser invitedUser = (InvitedUser) obj;
                invitedUser.getClass();
                e1dVar.setValue(invitedUser);
                return Unit.a;
            case 28:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((Function1) e1dVar.getValue()).invoke(f)).floatValue());
            default:
                ie8 ie8Var = (ie8) obj;
                ie8Var.getClass();
                e1dVar.setValue(Boolean.valueOf(ie8Var.d()));
                return Unit.a;
        }
    }
}
