package y9;

import com.google.protobuf.DescriptorProtos$Edition;
import java.util.ArrayList;
import ru.ozon.fintech.ui.input.CounterView;

/* loaded from: classes9.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f106330a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f106331b = new ArrayList();

    m() {
    }

    private void a(String str, int[] iArr) {
        this.f106330a.add(iArr);
        this.f106331b.add(str);
    }

    final String b(String str) {
        synchronized (this) {
            if (this.f106330a.isEmpty()) {
                a("US/CA", new int[]{0, 19});
                a("US", new int[]{30, 39});
                a("US/CA", new int[]{60, 139});
                a("FR", new int[]{300, 379});
                a("BG", new int[]{380});
                a("SI", new int[]{383});
                a("HR", new int[]{385});
                a("BA", new int[]{387});
                a("DE", new int[]{400, 440});
                a("JP", new int[]{450, 459});
                a("RU", new int[]{460, 469});
                a("TW", new int[]{471});
                a("EE", new int[]{474});
                a("LV", new int[]{475});
                a("AZ", new int[]{476});
                a("LT", new int[]{477});
                a("UZ", new int[]{478});
                a("LK", new int[]{479});
                a("PH", new int[]{480});
                a("BY", new int[]{481});
                a("UA", new int[]{482});
                a("MD", new int[]{484});
                a("AM", new int[]{485});
                a("GE", new int[]{486});
                a("KZ", new int[]{487});
                a("HK", new int[]{489});
                a("JP", new int[]{490, 499});
                a("GB", new int[]{CounterView.COUNTER_MAX_DEFAULT, 509});
                a("GR", new int[]{520});
                a("LB", new int[]{528});
                a("CY", new int[]{529});
                a("MK", new int[]{531});
                a("MT", new int[]{535});
                a("IE", new int[]{539});
                a("BE/LU", new int[]{540, 549});
                a("PT", new int[]{560});
                a("IS", new int[]{569});
                a("DK", new int[]{570, 579});
                a("PL", new int[]{590});
                a("RO", new int[]{594});
                a("HU", new int[]{599});
                a("ZA", new int[]{600, 601});
                a("GH", new int[]{603});
                a("BH", new int[]{608});
                a("MU", new int[]{609});
                a("MA", new int[]{611});
                a("DZ", new int[]{613});
                a("KE", new int[]{616});
                a("CI", new int[]{618});
                a("TN", new int[]{619});
                a("SY", new int[]{621});
                a("EG", new int[]{622});
                a("LY", new int[]{624});
                a("JO", new int[]{625});
                a("IR", new int[]{626});
                a("KW", new int[]{627});
                a("SA", new int[]{628});
                a("AE", new int[]{629});
                a("FI", new int[]{640, 649});
                a("CN", new int[]{690, 695});
                a("NO", new int[]{700, 709});
                a("IL", new int[]{729});
                a("SE", new int[]{730, 739});
                a("GT", new int[]{740});
                a("SV", new int[]{741});
                a("HN", new int[]{742});
                a("NI", new int[]{743});
                a("CR", new int[]{744});
                a("PA", new int[]{745});
                a("DO", new int[]{746});
                a("MX", new int[]{750});
                a("CA", new int[]{754, 755});
                a("VE", new int[]{759});
                a("CH", new int[]{760, 769});
                a("CO", new int[]{770});
                a("UY", new int[]{773});
                a("PE", new int[]{775});
                a("BO", new int[]{777});
                a("AR", new int[]{779});
                a("CL", new int[]{780});
                a("PY", new int[]{784});
                a("PE", new int[]{785});
                a("EC", new int[]{786});
                a("BR", new int[]{789, 790});
                a("IT", new int[]{800, 839});
                a("ES", new int[]{840, 849});
                a("CU", new int[]{850});
                a("SK", new int[]{858});
                a("CZ", new int[]{859});
                a("YU", new int[]{860});
                a("MN", new int[]{865});
                a("KP", new int[]{867});
                a("TR", new int[]{868, 869});
                a("NL", new int[]{870, 879});
                a("KR", new int[]{880});
                a("TH", new int[]{885});
                a("SG", new int[]{888});
                a("IN", new int[]{890});
                a("VN", new int[]{893});
                a("PK", new int[]{896});
                a("ID", new int[]{899});
                a("AT", new int[]{DescriptorProtos$Edition.EDITION_LEGACY_VALUE, 919});
                a("AU", new int[]{930, 939});
                a("AZ", new int[]{940, 949});
                a("MY", new int[]{955});
                a("MO", new int[]{958});
            }
        }
        int parseInt = Integer.parseInt(str.substring(0, 3));
        int size = this.f106330a.size();
        for (int i11 = 0; i11 < size; i11++) {
            int[] iArr = (int[]) this.f106330a.get(i11);
            int i12 = iArr[0];
            if (parseInt < i12) {
                return null;
            }
            if (iArr.length != 1) {
                i12 = iArr[1];
            }
            if (parseInt <= i12) {
                return (String) this.f106331b.get(i11);
            }
        }
        return null;
    }
}
