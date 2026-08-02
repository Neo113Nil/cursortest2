package mi;

import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import li.AbstractC5469c;

/* loaded from: classes5.dex */
public class m implements Comparable, Serializable {
    private static final m[] INSTANCES;

    /* renamed from: a, reason: collision with root package name */
    public static final Map f56641a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f56642b;

    /* renamed from: c, reason: collision with root package name */
    public static final Set f56643c;
    private static final long serialVersionUID = -4556668597489844917L;
    private final int number;
    private static final String[] STEMS_SIMPLE = {"jia", "yi", "bing", "ding", "wu", "ji", "geng", "xin", "ren", "gui"};
    private static final String[] STEMS_PINYIN = {"jiǎ", "yǐ", "bǐng", "dīng", "wù", "jǐ", "gēng", "xīn", "rén", "guǐ"};
    private static final String[] STEMS_CHINESE = {"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};
    private static final String[] STEMS_KOREAN = {"갑", "을", "병", "정", "무", "기", "경", "신", "임", "계"};
    private static final String[] STEMS_VIETNAMESE = {"giáp", "ất", "bính", "đinh", "mậu", "kỷ", "canh", "tân", "nhâm", "quý"};
    private static final String[] STEMS_RUSSIAN = {"Цзя", "И", "Бин", "Дин", "У", "Цзи", "Гэн", "Синь", "Жэнь", "Гуй"};
    private static final String[] BRANCHES_SIMPLE = {"zi", "chou", "yin", "mao", "chen", "si", "wu", "wei", "shen", "you", "xu", "hai"};
    private static final String[] BRANCHES_PINYIN = {"zǐ", "chǒu", "yín", "mǎo", "chén", "sì", "wǔ", "wèi", "shēn", "yǒu", "xū", "hài"};
    private static final String[] BRANCHES_CHINESE = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
    private static final String[] BRANCHES_KOREAN = {"자", "축", "인", "묘", "진", "사", "오", "미", "신", "유", "술", "해"};
    private static final String[] BRANCHES_VIETNAMESE = {"tí", "sửu", "dần", "mão", "thìn", "tị", "ngọ", "mùi", "thân", "dậu", "tuất", "hợi"};
    private static final String[] BRANCHES_RUSSIAN = {"Цзы", "Чоу", "Инь", "Мао", "Чэнь", "Сы", "У", "Вэй", "Шэнь", "Ю", "Сюй", "Хай"};

    public enum a {
        ZI_1_RAT,
        CHOU_2_OX,
        YIN_3_TIGER,
        MAO_4_HARE,
        CHEN_5_DRAGON,
        SI_6_SNAKE,
        WU_7_HORSE,
        WEI_8_SHEEP,
        SHEN_9_MONKEY,
        YOU_10_FOWL,
        XU_11_DOG,
        HAI_12_PIG;

        public String a(Locale locale) {
            String language = locale.getLanguage();
            Map map = m.f56642b;
            if (language.isEmpty()) {
                language = "root";
            }
            String[] strArr = (String[]) map.get(language);
            if (strArr == null) {
                strArr = m.BRANCHES_PINYIN;
            }
            return strArr[ordinal()];
        }
    }

    public enum b {
        JIA_1_WOOD_YANG,
        YI_2_WOOD_YIN,
        BING_3_FIRE_YANG,
        DING_4_FIRE_YIN,
        WU_5_EARTH_YANG,
        JI_6_EARTH_YIN,
        GENG_7_METAL_YANG,
        XIN_8_METAL_YIN,
        REN_9_WATER_YANG,
        GUI_10_WATER_YIN;

        public String a(Locale locale) {
            String language = locale.getLanguage();
            Map map = m.f56641a;
            if (language.isEmpty()) {
                language = "root";
            }
            String[] strArr = (String[]) map.get(language);
            if (strArr == null) {
                strArr = m.STEMS_PINYIN;
            }
            return strArr[ordinal()];
        }
    }

    static {
        m[] mVarArr = new m[60];
        int i10 = 0;
        while (i10 < 60) {
            int i11 = i10 + 1;
            mVarArr[i10] = new m(i11);
            i10 = i11;
        }
        INSTANCES = mVarArr;
        HashMap hashMap = new HashMap();
        hashMap.put("root", STEMS_SIMPLE);
        String[] strArr = STEMS_CHINESE;
        hashMap.put("zh", strArr);
        hashMap.put("ja", strArr);
        hashMap.put("ko", STEMS_KOREAN);
        hashMap.put("vi", STEMS_VIETNAMESE);
        hashMap.put("ru", STEMS_RUSSIAN);
        f56641a = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("root", BRANCHES_SIMPLE);
        String[] strArr2 = BRANCHES_CHINESE;
        hashMap2.put("zh", strArr2);
        hashMap2.put("ja", strArr2);
        hashMap2.put("ko", BRANCHES_KOREAN);
        hashMap2.put("vi", BRANCHES_VIETNAMESE);
        hashMap2.put("ru", BRANCHES_RUSSIAN);
        f56642b = Collections.unmodifiableMap(hashMap2);
        HashSet hashSet = new HashSet();
        hashSet.add("zh");
        hashSet.add("ja");
        hashSet.add("ko");
        f56643c = Collections.unmodifiableSet(hashSet);
    }

    public m(int i10) {
        this.number = i10;
    }

    public static m i(int i10) {
        if (i10 >= 1 && i10 <= 60) {
            return INSTANCES[i10 - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i10);
    }

    public static m j(b bVar, a aVar) {
        int ordinal = bVar.ordinal();
        m i10 = i(ordinal + 1 + AbstractC5469c.c((aVar.ordinal() - ordinal) * 25, 60));
        if (i10.h() == bVar && i10.f() == aVar) {
            return i10;
        }
        throw new IllegalArgumentException("Invalid combination of stem and branch.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static m k(CharSequence charSequence, ParsePosition parsePosition, Locale locale, boolean z10) {
        b bVar;
        boolean z11;
        m mVar;
        int i10;
        boolean z12;
        a aVar;
        a aVar2;
        Locale locale2 = locale;
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        boolean isEmpty = locale2.getLanguage().isEmpty();
        int i11 = index + 1;
        m mVar2 = null;
        if (i11 >= length || index < 0) {
            parsePosition.setErrorIndex(index);
            return null;
        }
        if (f56643c.contains(locale2.getLanguage())) {
            b[] values = b.values();
            int length2 = values.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    bVar = null;
                    break;
                }
                bVar = values[i12];
                if (bVar.a(locale2).charAt(0) == charSequence.charAt(index)) {
                    break;
                }
                i12++;
            }
            if (bVar != null) {
                a[] values2 = a.values();
                int length3 = values2.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length3) {
                        aVar2 = null;
                        break;
                    }
                    a aVar3 = values2[i13];
                    if (aVar3.a(locale2).charAt(0) == charSequence.charAt(i11)) {
                        index += 2;
                        aVar2 = aVar3;
                        break;
                    }
                    i13++;
                }
                z11 = isEmpty;
                mVar = null;
                aVar = aVar2;
            } else {
                z11 = isEmpty;
                aVar = 0;
                mVar = null;
            }
        } else {
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                if (charSequence.charAt(i11) == '-') {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                parsePosition.setErrorIndex(index);
                return null;
            }
            b[] values3 = b.values();
            int length4 = values3.length;
            bVar = null;
            int i14 = 0;
            while (i14 < length4) {
                b bVar2 = values3[i14];
                String a10 = bVar2.a(locale2);
                m mVar3 = mVar2;
                int i15 = index;
                while (true) {
                    if (i15 >= i11) {
                        z12 = isEmpty;
                        break;
                    }
                    int i16 = i15 - index;
                    char charAt = charSequence.charAt(i15);
                    if (isEmpty) {
                        charAt = l(charAt);
                    }
                    char c10 = charAt;
                    z12 = isEmpty;
                    if (i16 < a10.length() && a10.charAt(i16) == c10) {
                        if (i16 + 1 == a10.length()) {
                            bVar = bVar2;
                            break;
                        }
                        i15++;
                        isEmpty = z12;
                    }
                }
                i14++;
                mVar2 = mVar3;
                isEmpty = z12;
            }
            z11 = isEmpty;
            mVar = mVar2;
            if (bVar == null) {
                if (z10 && !z11 && i11 + 1 < length) {
                    return k(charSequence, parsePosition, Locale.ROOT, true);
                }
                parsePosition.setErrorIndex(index);
                return mVar;
            }
            a[] values4 = a.values();
            int length5 = values4.length;
            m mVar4 = mVar;
            int i17 = 0;
            while (i17 < length5) {
                a aVar4 = values4[i17];
                String a11 = aVar4.a(locale2);
                int i18 = i11 + 1;
                while (true) {
                    if (i18 >= length) {
                        i10 = index;
                        break;
                    }
                    int i19 = i18 - i11;
                    int i20 = i19 - 1;
                    char charAt2 = charSequence.charAt(i18);
                    if (z11) {
                        charAt2 = l(charAt2);
                    }
                    char c11 = charAt2;
                    i10 = index;
                    if (i20 >= a11.length() || a11.charAt(i20) != c11) {
                        break;
                    }
                    if (i19 == a11.length()) {
                        mVar4 = aVar4;
                        index = i18 + 1;
                        break;
                    }
                    i18++;
                    index = i10;
                }
                index = i10;
                i17++;
                locale2 = locale;
                mVar4 = mVar4;
            }
            aVar = mVar4;
        }
        if (bVar != null && aVar != 0) {
            parsePosition.setIndex(index);
            return j(bVar, aVar);
        }
        if (z10 && !z11) {
            return k(charSequence, parsePosition, Locale.ROOT, true);
        }
        parsePosition.setErrorIndex(index);
        return mVar;
    }

    public static char l(char c10) {
        if (c10 == 224) {
            return 'a';
        }
        if (c10 == 249) {
            return 'u';
        }
        if (c10 == 275) {
            return 'e';
        }
        if (c10 == 299) {
            return 'i';
        }
        if (c10 == 363) {
            return 'u';
        }
        if (c10 == 462) {
            return 'a';
        }
        if (c10 == 464) {
            return 'i';
        }
        if (c10 == 466) {
            return 'o';
        }
        if (c10 == 232 || c10 == 233) {
            return 'e';
        }
        if (c10 == 236 || c10 == 237) {
            return 'i';
        }
        return c10;
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(m mVar) {
        if (getClass().equals(mVar.getClass())) {
            return this.number - ((m) m.class.cast(mVar)).number;
        }
        throw new ClassCastException("Cannot compare different types.");
    }

    public boolean equals(Object obj) {
        return getClass().equals(obj.getClass()) && this.number == ((m) obj).number;
    }

    public a f() {
        return a.values()[(this.number % 12 != 0 ? r0 : 12) - 1];
    }

    public String g(Locale locale) {
        b h10 = h();
        a f10 = f();
        return h10.a(locale) + (f56643c.contains(locale.getLanguage()) ? "" : "-") + f10.a(locale);
    }

    public int getNumber() {
        return this.number;
    }

    public b h() {
        return b.values()[(this.number % 10 != 0 ? r0 : 10) - 1];
    }

    public int hashCode() {
        return this.number;
    }

    public Object readResolve() {
        return i(this.number);
    }

    public String toString() {
        return g(Locale.ROOT) + "(" + String.valueOf(this.number) + ")";
    }
}
