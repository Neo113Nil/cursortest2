package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjm;
import com.google.android.gms.measurement.internal.zzlt;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class e2o implements a4n {
    public final HashSet a;
    public final gu b;

    public e2o(AppMeasurementSdk appMeasurementSdk, gu guVar) {
        this.b = guVar;
        appMeasurementSdk.a(new xxn(this));
        this.a = new HashSet();
    }

    @Override // defpackage.a4n
    public final void a(Set set) {
        HashSet hashSet = this.a;
        hashSet.clear();
        HashSet hashSet2 = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashSet2.size() >= 50) {
                break;
            }
            vv9 vv9Var = uqn.a;
            if (str != null && str.length() != 0) {
                int codePointAt = str.codePointAt(0);
                if (!Character.isLetter(codePointAt)) {
                    if (codePointAt == 95) {
                        codePointAt = 95;
                    }
                }
                int length = str.length();
                int charCount = Character.charCount(codePointAt);
                while (true) {
                    if (charCount < length) {
                        int codePointAt2 = str.codePointAt(charCount);
                        if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                            charCount += Character.charCount(codePointAt2);
                        }
                    } else if (str.length() != 0) {
                        int codePointAt3 = str.codePointAt(0);
                        if (Character.isLetter(codePointAt3)) {
                            int length2 = str.length();
                            int charCount2 = Character.charCount(codePointAt3);
                            while (true) {
                                if (charCount2 >= length2) {
                                    String b = zzlt.b(str, zzjm.a, zzjm.f);
                                    if (b != null) {
                                        str = b;
                                    }
                                    hashSet2.add(str);
                                } else {
                                    int codePointAt4 = str.codePointAt(charCount2);
                                    if (codePointAt4 == 95 || Character.isLetterOrDigit(codePointAt4)) {
                                        charCount2 += Character.charCount(codePointAt4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hashSet.addAll(hashSet2);
    }
}
