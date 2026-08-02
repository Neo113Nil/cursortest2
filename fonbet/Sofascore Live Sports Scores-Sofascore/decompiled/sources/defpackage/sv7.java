package defpackage;

import android.content.Context;
import com.sofascore.results.R;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class sv7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tv7 b;

    public /* synthetic */ sv7(tv7 tv7Var, int i) {
        this.a = i;
        this.b = tv7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List split$default;
        String string;
        int i = this.a;
        tv7 tv7Var = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                String lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (lowerCase.equals("third-placed teams")) {
                    String string2 = tv7Var.getContext().getString(R.string.third_placed_teams_short);
                    string2.getClass();
                    return string2;
                }
                split$default = StringsKt__StringsKt.split$default(str, new String[]{" "}, false, 0, 6, null);
                String str2 = (String) CollectionsKt.a0(1, split$default);
                return (str2 == null || (string = tv7Var.getContext().getString(R.string.competition_group_name, str2)) == null) ? str : string;
            default:
                cai caiVar = (cai) obj;
                caiVar.getClass();
                tv7Var.e = caiVar;
                Context context = tv7Var.getContext();
                context.getClass();
                d7a.F(context, tv7Var.e);
                tv7Var.j();
                return Unit.a;
        }
    }
}
