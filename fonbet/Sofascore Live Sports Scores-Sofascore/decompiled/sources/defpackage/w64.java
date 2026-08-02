package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.widget.NumberPicker;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class w64 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w64(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                rhj rhjVar = new rhj(context, (Function2) obj2);
                e92 e92Var = rhjVar.d;
                ((NumberPicker) e92Var.b).setValue(i3);
                NumberPicker numberPicker = (NumberPicker) e92Var.c;
                int i4 = i2 % 5;
                if (i4 != 0) {
                    i2 = i4 <= 2 ? i2 - i4 : i2 + (5 - i4);
                }
                numberPicker.setValue(rhjVar.e.indexOf(Integer.valueOf(i2)));
                return rhjVar;
            case 1:
                return ((HashSet) obj2).contains(Integer.valueOf(((i22) obj).n.getId())) ? Integer.valueOf(i3) : Integer.valueOf(i2);
            default:
                b20 b20Var = (b20) obj2;
                c8e c8eVar = (c8e) obj;
                x10 x10Var = c8eVar.a;
                int d = c8eVar.d(i3);
                int d2 = c8eVar.d(i2);
                CharSequence charSequence = x10Var.e;
                if (d < 0 || d > d2 || d2 > charSequence.length()) {
                    StringBuilder s = lnb.s(d, d2, "start(", ") or end(", ") is out of range [0..");
                    s.append(charSequence.length());
                    s.append("], or start > end!");
                    s3a.a(s.toString());
                }
                Path path = new Path();
                ydj ydjVar = x10Var.d;
                ydjVar.f.getSelectionPath(d, d2, path);
                int i5 = ydjVar.h;
                if (i5 != 0 && !path.isEmpty()) {
                    path.offset(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i5);
                }
                b20 b20Var2 = new b20(path);
                b20Var2.k((Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(c8eVar.f) & 4294967295L));
                b20.a(b20Var, b20Var2);
                return Unit.a;
        }
    }
}
