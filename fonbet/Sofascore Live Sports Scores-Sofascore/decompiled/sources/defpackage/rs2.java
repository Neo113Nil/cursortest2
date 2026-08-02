package defpackage;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class rs2 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rs2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a;
        int a2;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return ((Number) ((qs2) obj3).invoke(obj, obj2)).intValue();
            case 1:
                for (Function1 function1 : (Function1[]) obj3) {
                    int b = o93.b((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
                    if (b != 0) {
                        return b;
                    }
                }
                return 0;
            case 2:
                return ((Number) ((vn6) obj3).invoke(obj, obj2)).intValue();
            case 3:
                Locale locale = (Locale) obj3;
                obj.getClass();
                bm2 R = hz8.R(obj);
                obj2.getClass();
                bm2 R2 = hz8.R(obj2);
                long j = R.b;
                long j2 = R2.b;
                if (j >= j2) {
                    if (j <= j2) {
                        int i2 = R.c;
                        int i3 = R2.c;
                        if (i2 >= i3) {
                            if (i2 <= i3) {
                                return Collator.getInstance(locale).compare((String) R.d, (String) R2.d);
                            }
                        }
                    }
                    return 1;
                }
                return -1;
            case 4:
                return ((Number) ((sc6) obj3).invoke(obj, obj2)).intValue();
            case 5:
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj3;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.u).compareTo(Boolean.valueOf(materialButton2.u));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return compareTo2 != 0 ? compareTo2 : Integer.compare(materialButtonToggleGroup.indexOfChild(materialButton), materialButtonToggleGroup.indexOfChild(materialButton2));
            case 6:
                q3c q3cVar = (q3c) obj3;
                a = q3cVar.a(obj2);
                a2 = q3cVar.a(obj);
                break;
            case 7:
                p3c p3cVar = (p3c) obj3;
                a = p3cVar.a(obj2);
                a2 = p3cVar.a(obj);
                break;
            case 8:
                return ((Number) ((mpa) obj3).invoke(obj, obj2)).intValue();
            case 9:
                return ((Number) ((Function2) obj3).invoke(obj, obj2)).intValue();
            case 10:
                return ((Number) ((wqg) obj3).invoke(obj, obj2)).intValue();
            case 11:
                return ((Number) ((wqg) obj3).invoke(obj, obj2)).intValue();
            case 12:
                return ((Number) ((wqg) obj3).invoke(obj, obj2)).intValue();
            case 13:
                return ((Number) ((wqg) obj3).invoke(obj, obj2)).intValue();
            case 14:
                return ((Number) ((wqg) obj3).invoke(obj, obj2)).intValue();
            case 15:
                return ((Number) ((wqg) obj3).invoke(obj, obj2)).intValue();
            case 16:
                return ((Number) ((wqg) obj3).invoke(obj, obj2)).intValue();
            case 17:
                return ((Number) ((wqg) obj3).invoke(obj, obj2)).intValue();
            case 18:
                return ((Number) ((t6j) obj3).invoke(obj, obj2)).intValue();
            default:
                return ((Number) ((t6j) obj3).invoke(obj, obj2)).intValue();
        }
        return a - a2;
    }
}
