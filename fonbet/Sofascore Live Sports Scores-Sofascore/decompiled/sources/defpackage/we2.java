package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class we2 extends LinkedHashMap {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ int a;

    /* JADX WARN: Multi-variable type inference failed */
    public Matcher a(String str, Pattern pattern) {
        Matcher matcher = (Matcher) get(pattern);
        if (matcher != null) {
            matcher.reset(str);
            return matcher;
        }
        Matcher matcher2 = pattern.matcher(str);
        put(pattern, matcher2);
        return matcher2;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.a) {
            case 0:
                if (super.size() > 100) {
                }
                break;
            case 1:
                if (size() > 4) {
                }
                break;
            default:
                if (size() > 32) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ we2(boolean z, int i, float f, int i2) {
        super(i, f, z);
        this.a = i2;
    }
}
