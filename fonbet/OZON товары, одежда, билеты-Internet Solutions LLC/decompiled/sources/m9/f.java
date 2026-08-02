package m9;

import android.content.Intent;
import h9.EnumC6876a;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f74654a = Pattern.compile(",");

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap f74655b;

    static {
        EnumSet of2 = EnumSet.of(EnumC6876a.QR_CODE);
        EnumSet of3 = EnumSet.of(EnumC6876a.DATA_MATRIX);
        EnumSet of4 = EnumSet.of(EnumC6876a.AZTEC);
        EnumSet of5 = EnumSet.of(EnumC6876a.PDF_417);
        EnumSet of6 = EnumSet.of(EnumC6876a.UPC_A, EnumC6876a.UPC_E, EnumC6876a.EAN_13, EnumC6876a.EAN_8, EnumC6876a.RSS_14, EnumC6876a.RSS_EXPANDED);
        EnumSet of7 = EnumSet.of(EnumC6876a.CODE_39, EnumC6876a.CODE_93, EnumC6876a.CODE_128, EnumC6876a.ITF, EnumC6876a.CODABAR);
        EnumSet copyOf = EnumSet.copyOf((Collection) of6);
        copyOf.addAll(of7);
        HashMap hashMap = new HashMap();
        f74655b = hashMap;
        hashMap.put("ONE_D_MODE", copyOf);
        hashMap.put("PRODUCT_MODE", of6);
        hashMap.put("QR_CODE_MODE", of2);
        hashMap.put("DATA_MATRIX_MODE", of3);
        hashMap.put("AZTEC_MODE", of4);
        hashMap.put("PDF417_MODE", of5);
    }

    public static Set<EnumC6876a> a(Intent intent) {
        String stringExtra = intent.getStringExtra("SCAN_FORMATS");
        List asList = stringExtra != null ? Arrays.asList(f74654a.split(stringExtra)) : null;
        String stringExtra2 = intent.getStringExtra("SCAN_MODE");
        if (asList != null) {
            EnumSet noneOf = EnumSet.noneOf(EnumC6876a.class);
            try {
                Iterator it = asList.iterator();
                while (it.hasNext()) {
                    noneOf.add(EnumC6876a.valueOf((String) it.next()));
                }
                return noneOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (stringExtra2 != null) {
            return (Set) f74655b.get(stringExtra2);
        }
        return null;
    }
}
