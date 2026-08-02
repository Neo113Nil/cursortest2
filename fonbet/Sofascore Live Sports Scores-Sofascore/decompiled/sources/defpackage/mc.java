package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.g;
import androidx.fragment.app.s;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mc extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mc(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(0);
        this.i = i;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
        this.m = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (r9 != 4) goto L44;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i = this.i;
        Object obj = this.m;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        switch (i) {
            case 0:
                Intent intent = (Intent) obj2;
                Activity activity = (Activity) obj3;
                String str = (String) obj4;
                int i2 = 0;
                if (str == null) {
                    yhk.s("Name is null");
                } else if (str.equals("ACTIVITY")) {
                    i2 = 1;
                } else if (str.equals("BROADCAST")) {
                    i2 = 2;
                } else if (str.equals("SERVICE")) {
                    i2 = 3;
                } else if (str.equals("FOREGROUND_SERVICE")) {
                    i2 = 4;
                } else if (str.equals("CALLBACK")) {
                    i2 = 5;
                } else {
                    a70.p("No enum constant androidx.glance.appwidget.action.ActionTrampolineType.".concat(str));
                }
                int C = wt3.C(i2);
                if (C != 0) {
                    if (C != 1) {
                        if (C == 2) {
                            activity.startService(intent);
                        } else if (C == 3) {
                            ubb.a.a(activity, intent);
                        }
                    }
                    activity.sendBroadcast(intent);
                } else {
                    activity.startActivity(intent, (Bundle) obj);
                }
                break;
            case 1:
                ((f25) obj4).e((Function0) obj3, (z15) obj2, (ema) obj);
                break;
            default:
                g gVar = (g) obj4;
                ViewGroup viewGroup = (ViewGroup) obj3;
                Object i3 = gVar.f.i(viewGroup, obj2);
                gVar.q = i3;
                if (i3 == null) {
                    gVar.r = true;
                } else {
                    ((fsf) obj).a = new zs4(gVar, obj2, viewGroup);
                    if (s.O(2)) {
                        Objects.toString(gVar.d);
                        Objects.toString(gVar.e);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
