package defpackage;

import com.ironsource.Y1;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class aob extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ LinkedHashMap j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aob(LinkedHashMap linkedHashMap, int i) {
        super(1);
        this.i = i;
        this.j = linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        znb znbVar;
        String str;
        int i = this.i;
        int i2 = 0;
        LinkedHashMap linkedHashMap = this.j;
        switch (i) {
            case 0:
                MatchResult matchResult = (MatchResult) obj;
                matchResult.getClass();
                znb[] values = znb.values();
                int length = values.length;
                while (true) {
                    if (i2 < length) {
                        znbVar = values[i2];
                        String str2 = znbVar.a;
                        String upperCase = matchResult.getValue().toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        if (!Intrinsics.c(str2, upperCase)) {
                            i2++;
                        }
                    } else {
                        znbVar = null;
                    }
                }
                if (znbVar != null) {
                    znb znbVar2 = znbVar.b ? znbVar : null;
                    if (znbVar2 != null && (str = (String) linkedHashMap.get(znbVar2)) != null) {
                        return str;
                    }
                }
                return Y1.f;
            default:
                String str3 = ((k38) obj).a;
                str3.getClass();
                LinkedHashMap k = tub.k(bob.a(), linkedHashMap);
                Pattern compile = Pattern.compile("\\[(.*?)]");
                compile.getClass();
                String g = new Regex(compile).g(new StringBuilder(str3), new aob(k, i2));
                g.getClass();
                return new k38(g);
        }
    }
}
