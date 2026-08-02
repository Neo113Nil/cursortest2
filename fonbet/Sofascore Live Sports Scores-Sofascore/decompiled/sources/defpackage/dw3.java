package defpackage;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class dw3 implements FilenameFilter {
    public final /* synthetic */ int a;

    public /* synthetic */ dw3(int i) {
        this.a = i;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.a) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            case 2:
                Object[] objArr = {"trigger-type-anomaly", "trigger-type-oom"};
                ArrayList arrayList = new ArrayList(2);
                for (int i = 0; i < 2; i++) {
                    Object obj = objArr[i];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                return Collections.unmodifiableList(arrayList).contains(str);
            case 3:
                return str.startsWith("event");
            case 4:
                return str.startsWith("event") && !str.endsWith("_");
            case 5:
                str.getClass();
                return new Regex(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1))).f(str);
            case 6:
                str.getClass();
                return new Regex(String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3))).f(str);
            case 7:
                str.getClass();
                return new Regex(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1))).f(str);
            default:
                str.getClass();
                return new Regex(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1))).f(str);
        }
    }
}
