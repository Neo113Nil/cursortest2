package net.time4j.calendar;

import androidx.core.text.util.LocalePreferences;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.text.Typography;
import net.time4j.PlainDate;
import net.time4j.base.ResourceLoader;
import net.time4j.engine.AttributeKey;
import net.time4j.engine.AttributeQuery;
import net.time4j.engine.CalendarDate;
import net.time4j.engine.CalendarEra;
import net.time4j.engine.ChronoCondition;
import net.time4j.engine.ChronoDisplay;
import net.time4j.engine.ChronoException;
import net.time4j.engine.EpochDays;
import net.time4j.format.Attributes;
import net.time4j.format.CalendarText;
import net.time4j.format.Leniency;
import net.time4j.format.TextElement;
import net.time4j.format.TextWidth;
import net.time4j.format.expert.Iso8601Format;
import org.objectweb.asm.Opcodes;

/* loaded from: classes10.dex */
public final class Nengo implements CalendarEra, Serializable {
    private static final Map<String, Nengo> CHINESE_TO_NENGO;
    private static final byte COURT_NORTHERN = 1;
    private static final byte COURT_SOUTHERN = -1;
    private static final byte COURT_STANDARD = 0;
    public static final Nengo HEISEI;
    private static final Map<String, Nengo> KANJI_TO_NENGO;
    private static final TST KOREAN_TO_NENGO;
    public static final Nengo MEIJI;
    private static final String[] MODERN_KEYS;
    private static final Nengo[] MODERN_NENGOS;
    private static final Nengo NENGO_KENMU;
    private static final Nengo NENGO_OEI;
    public static final Nengo NEWEST;
    private static final String NEW_ERA_PROPERTY = "net.time4j.calendar.japanese.supplemental.era";
    private static final Nengo[] NORTHERN_NENGOS;
    private static final Nengo[] OFFICIAL_NENGOS;
    public static final Nengo REIWA;
    private static final TST ROMAJI_TO_NENGO;
    private static final TST RUSSIAN_TO_NENGO;
    public static final AttributeKey<Selector> SELECTOR;
    public static final Nengo SHOWA;
    public static final Nengo TAISHO;
    private static final long serialVersionUID = 5696395761628504723L;
    private final transient String chinese;
    private final byte court;
    private final int index;
    private final transient String kanji;
    private final transient String korean;
    private final transient int relgregyear;
    private final transient String romaji;
    private final transient String russian;
    private final transient long start;

    public enum Selector implements ChronoCondition<Nengo> {
        OFFICIAL { // from class: net.time4j.calendar.Nengo.Selector.1
            @Override // net.time4j.engine.ChronoCondition
            public boolean test(Nengo nengo) {
                return nengo.court != 1;
            }
        },
        MODERN { // from class: net.time4j.calendar.Nengo.Selector.2
            @Override // net.time4j.engine.ChronoCondition
            public boolean test(Nengo nengo) {
                return nengo.index >= Nengo.MEIJI.index;
            }
        },
        EDO_PERIOD { // from class: net.time4j.calendar.Nengo.Selector.3
            @Override // net.time4j.engine.ChronoCondition
            public boolean test(Nengo nengo) {
                return nengo.relgregyear >= 1603 && nengo.relgregyear < 1868;
            }
        },
        AZUCHI_MOMOYAMA_PERIOD { // from class: net.time4j.calendar.Nengo.Selector.4
            @Override // net.time4j.engine.ChronoCondition
            public boolean test(Nengo nengo) {
                return nengo.relgregyear >= 1573 && nengo.relgregyear < 1603;
            }
        },
        MUROMACHI_PERIOD { // from class: net.time4j.calendar.Nengo.Selector.5
            @Override // net.time4j.engine.ChronoCondition
            public boolean test(Nengo nengo) {
                return nengo.relgregyear >= 1336 && nengo.relgregyear < 1573 && nengo.court != 1;
            }
        },
        NORTHERN_COURT { // from class: net.time4j.calendar.Nengo.Selector.6
            @Override // net.time4j.engine.ChronoCondition
            public boolean test(Nengo nengo) {
                return nengo.court == 1;
            }
        },
        SOUTHERN_COURT { // from class: net.time4j.calendar.Nengo.Selector.7
            @Override // net.time4j.engine.ChronoCondition
            public boolean test(Nengo nengo) {
                return nengo.court == -1;
            }
        },
        KAMAKURA_PERIOD { // from class: net.time4j.calendar.Nengo.Selector.8
            @Override // net.time4j.engine.ChronoCondition
            public boolean test(Nengo nengo) {
                return nengo.relgregyear >= 1185 && nengo.relgregyear < 1332;
            }
        },
        HEIAN_PERIOD { // from class: net.time4j.calendar.Nengo.Selector.9
            @Override // net.time4j.engine.ChronoCondition
            public boolean test(Nengo nengo) {
                return nengo.relgregyear >= 794 && nengo.relgregyear < 1185;
            }
        },
        NARA_PERIOD { // from class: net.time4j.calendar.Nengo.Selector.10
            @Override // net.time4j.engine.ChronoCondition
            public boolean test(Nengo nengo) {
                return nengo.relgregyear >= 710 && nengo.relgregyear < 794;
            }
        },
        ASUKA_PERIOD { // from class: net.time4j.calendar.Nengo.Selector.11
            @Override // net.time4j.engine.ChronoCondition
            public boolean test(Nengo nengo) {
                return nengo.relgregyear >= 538 && nengo.relgregyear < 710;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02bb  */
    static {
        TST tst;
        Nengo nengo;
        Nengo nengo2;
        DataInputStream dataInputStream;
        TST tst2;
        Nengo nengo3;
        String str;
        String str2;
        String str3;
        String str4;
        String property;
        Nengo nengo4;
        ArrayList arrayList = new ArrayList(256);
        ArrayList arrayList2 = new ArrayList(16);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TST tst3 = new TST();
        TST tst4 = new TST();
        TST tst5 = new TST();
        InputStream load = ResourceLoader.getInstance().load(ResourceLoader.getInstance().locate("calendar", Nengo.class, "data/nengo.data"), true);
        if (load == null) {
            try {
                try {
                    load = ResourceLoader.getInstance().load(Nengo.class, "data/nengo.data", true);
                } catch (IOException e) {
                    throw new IllegalStateException("Invalid nengo data.", e);
                }
            } catch (EOFException unused) {
                nengo = null;
                nengo2 = null;
                tst = tst4;
                property = System.getProperty(NEW_ERA_PROPERTY);
                if (property != null) {
                }
                Nengo[] nengoArr = (Nengo[]) arrayList.toArray(new Nengo[arrayList.size()]);
                OFFICIAL_NENGOS = nengoArr;
                NORTHERN_NENGOS = (Nengo[]) arrayList2.toArray(new Nengo[arrayList2.size()]);
                NENGO_KENMU = nengo4;
                NENGO_OEI = nengo2;
                KANJI_TO_NENGO = Collections.unmodifiableMap(hashMap);
                CHINESE_TO_NENGO = Collections.unmodifiableMap(hashMap2);
                KOREAN_TO_NENGO = tst3;
                RUSSIAN_TO_NENGO = tst;
                ROMAJI_TO_NENGO = tst5;
                Nengo nengo5 = nengoArr[223];
                MEIJI = nengo5;
                Nengo nengo6 = nengoArr[224];
                TAISHO = nengo6;
                Nengo nengo7 = nengoArr[225];
                SHOWA = nengo7;
                Nengo nengo8 = nengoArr[226];
                HEISEI = nengo8;
                Nengo nengo9 = nengoArr[227];
                REIWA = nengo9;
                NEWEST = nengoArr[nengoArr.length - 1];
                SELECTOR = Attributes.createKey("NENGO_SELECTOR", Selector.class);
                MODERN_KEYS = new String[]{"reiwa", "heisei", "showa", "taisho", "meiji"};
                MODERN_NENGOS = new Nengo[]{nengo9, nengo8, nengo7, nengo6, nengo5};
                return;
            }
        }
        try {
            dataInputStream = new DataInputStream(load);
            nengo = null;
            nengo2 = null;
        } catch (EOFException unused2) {
            tst = tst4;
            nengo = null;
            nengo2 = null;
        }
        while (true) {
            try {
                short readShort = dataInputStream.readShort();
                int readInt = dataInputStream.readInt();
                String readUTF = dataInputStream.readUTF();
                String readUTF2 = dataInputStream.readUTF();
                String readUTF3 = dataInputStream.readUTF();
                String readUTF4 = dataInputStream.readUTF();
                byte readByte = dataInputStream.readByte();
                byte readByte2 = dataInputStream.readByte();
                ArrayList arrayList3 = new ArrayList(readByte2);
                int i = 0;
                while (i < readByte2) {
                    byte b = readByte2;
                    try {
                        arrayList3.add(dataInputStream.readUTF());
                        i++;
                        readByte2 = b;
                    } catch (EOFException unused3) {
                        tst = tst4;
                        property = System.getProperty(NEW_ERA_PROPERTY);
                        if (property != null) {
                        }
                        Nengo[] nengoArr2 = (Nengo[]) arrayList.toArray(new Nengo[arrayList.size()]);
                        OFFICIAL_NENGOS = nengoArr2;
                        NORTHERN_NENGOS = (Nengo[]) arrayList2.toArray(new Nengo[arrayList2.size()]);
                        NENGO_KENMU = nengo4;
                        NENGO_OEI = nengo2;
                        KANJI_TO_NENGO = Collections.unmodifiableMap(hashMap);
                        CHINESE_TO_NENGO = Collections.unmodifiableMap(hashMap2);
                        KOREAN_TO_NENGO = tst3;
                        RUSSIAN_TO_NENGO = tst;
                        ROMAJI_TO_NENGO = tst5;
                        Nengo nengo52 = nengoArr2[223];
                        MEIJI = nengo52;
                        Nengo nengo62 = nengoArr2[224];
                        TAISHO = nengo62;
                        Nengo nengo72 = nengoArr2[225];
                        SHOWA = nengo72;
                        Nengo nengo82 = nengoArr2[226];
                        HEISEI = nengo82;
                        Nengo nengo92 = nengoArr2[227];
                        REIWA = nengo92;
                        NEWEST = nengoArr2[nengoArr2.length - 1];
                        SELECTOR = Attributes.createKey("NENGO_SELECTOR", Selector.class);
                        MODERN_KEYS = new String[]{"reiwa", "heisei", "showa", "taisho", "meiji"};
                        MODERN_NENGOS = new Nengo[]{nengo92, nengo82, nengo72, nengo62, nengo52};
                        return;
                    }
                }
                String str5 = (String) arrayList3.get(0);
                if (readByte == 1) {
                    tst2 = tst4;
                    try {
                        Nengo nengo10 = new Nengo(readShort, readInt, readUTF, readUTF2, readUTF3, readUTF4, str5, readByte, arrayList2.size());
                        arrayList2.add(nengo10);
                        nengo3 = nengo10;
                        str = readUTF;
                        str2 = readUTF2;
                        str3 = readUTF3;
                        str4 = readUTF4;
                    } catch (EOFException unused4) {
                        tst = tst2;
                        property = System.getProperty(NEW_ERA_PROPERTY);
                        if (property != null) {
                        }
                        Nengo[] nengoArr22 = (Nengo[]) arrayList.toArray(new Nengo[arrayList.size()]);
                        OFFICIAL_NENGOS = nengoArr22;
                        NORTHERN_NENGOS = (Nengo[]) arrayList2.toArray(new Nengo[arrayList2.size()]);
                        NENGO_KENMU = nengo4;
                        NENGO_OEI = nengo2;
                        KANJI_TO_NENGO = Collections.unmodifiableMap(hashMap);
                        CHINESE_TO_NENGO = Collections.unmodifiableMap(hashMap2);
                        KOREAN_TO_NENGO = tst3;
                        RUSSIAN_TO_NENGO = tst;
                        ROMAJI_TO_NENGO = tst5;
                        Nengo nengo522 = nengoArr22[223];
                        MEIJI = nengo522;
                        Nengo nengo622 = nengoArr22[224];
                        TAISHO = nengo622;
                        Nengo nengo722 = nengoArr22[225];
                        SHOWA = nengo722;
                        Nengo nengo822 = nengoArr22[226];
                        HEISEI = nengo822;
                        Nengo nengo922 = nengoArr22[227];
                        REIWA = nengo922;
                        NEWEST = nengoArr22[nengoArr22.length - 1];
                        SELECTOR = Attributes.createKey("NENGO_SELECTOR", Selector.class);
                        MODERN_KEYS = new String[]{"reiwa", "heisei", "showa", "taisho", "meiji"};
                        MODERN_NENGOS = new Nengo[]{nengo922, nengo822, nengo722, nengo622, nengo522};
                        return;
                    }
                } else {
                    tst2 = tst4;
                    nengo3 = new Nengo(readShort, readInt, readUTF, readUTF2, readUTF3, readUTF4, str5, readByte, arrayList.size());
                    str = readUTF;
                    str2 = readUTF2;
                    str3 = readUTF3;
                    str4 = readUTF4;
                    arrayList.add(nengo3);
                    Nengo nengo11 = nengo;
                    if (readShort == 1334) {
                        nengo = nengo3;
                    } else {
                        if (readShort == 1394) {
                            nengo2 = nengo3;
                        }
                        nengo = nengo11;
                    }
                }
                try {
                    Nengo nengo12 = nengo;
                    try {
                        if (nengo3.court == 1) {
                            try {
                                if (nengo3.relgregyear == 1334) {
                                    tst = tst2;
                                    tst4 = tst;
                                    nengo = nengo12;
                                }
                            } catch (EOFException unused5) {
                                nengo = nengo12;
                                tst = tst2;
                                property = System.getProperty(NEW_ERA_PROPERTY);
                                if (property != null) {
                                }
                                Nengo[] nengoArr222 = (Nengo[]) arrayList.toArray(new Nengo[arrayList.size()]);
                                OFFICIAL_NENGOS = nengoArr222;
                                NORTHERN_NENGOS = (Nengo[]) arrayList2.toArray(new Nengo[arrayList2.size()]);
                                NENGO_KENMU = nengo4;
                                NENGO_OEI = nengo2;
                                KANJI_TO_NENGO = Collections.unmodifiableMap(hashMap);
                                CHINESE_TO_NENGO = Collections.unmodifiableMap(hashMap2);
                                KOREAN_TO_NENGO = tst3;
                                RUSSIAN_TO_NENGO = tst;
                                ROMAJI_TO_NENGO = tst5;
                                Nengo nengo5222 = nengoArr222[223];
                                MEIJI = nengo5222;
                                Nengo nengo6222 = nengoArr222[224];
                                TAISHO = nengo6222;
                                Nengo nengo7222 = nengoArr222[225];
                                SHOWA = nengo7222;
                                Nengo nengo8222 = nengoArr222[226];
                                HEISEI = nengo8222;
                                Nengo nengo9222 = nengoArr222[227];
                                REIWA = nengo9222;
                                NEWEST = nengoArr222[nengoArr222.length - 1];
                                SELECTOR = Attributes.createKey("NENGO_SELECTOR", Selector.class);
                                MODERN_KEYS = new String[]{"reiwa", "heisei", "showa", "taisho", "meiji"};
                                MODERN_NENGOS = new Nengo[]{nengo9222, nengo8222, nengo7222, nengo6222, nengo5222};
                                return;
                            }
                        }
                        hashMap.put(str, nengo3);
                        if (hashMap2.put(str2, nengo3) != null) {
                            tst = tst2;
                            throw new IllegalStateException(nengo3.relgregyear + " " + nengo3.chinese);
                        }
                        tst3.insert(str3, nengo3);
                        tst = tst2;
                        try {
                            tst.insert(str4, nengo3);
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                tst5.insert((String) it.next(), nengo3);
                            }
                            tst4 = tst;
                            nengo = nengo12;
                        } catch (EOFException unused6) {
                        }
                    } catch (EOFException unused7) {
                        tst = tst2;
                    }
                    nengo = nengo12;
                } catch (EOFException unused8) {
                }
            } catch (EOFException unused9) {
                tst = tst4;
            }
            property = System.getProperty(NEW_ERA_PROPERTY);
            if (property != null) {
                String[] split = property.split(",");
                int length = split.length;
                int i2 = 0;
                PlainDate plainDate = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                while (i2 < length) {
                    Nengo nengo13 = nengo;
                    String[] strArr = split;
                    String[] split2 = split[i2].split("=");
                    if (split2.length == 2) {
                        if (split2[0].equals("name")) {
                            str9 = hepburn(split2[1], 0);
                        } else if (split2[0].equals("kanji")) {
                            String str11 = split2[1];
                            str8 = str11;
                            if (str11.length() != 2) {
                                throw new IllegalArgumentException("Japanese kanji must be of length 2.");
                            }
                        } else if (split2[0].equals(LocalePreferences.CalendarType.CHINESE)) {
                            String str12 = split2[1];
                            if (str12.length() != 2) {
                                throw new IllegalArgumentException("Chinese kanji must be of length 2.");
                            }
                            str10 = str12;
                        } else if (split2[0].equals("korean")) {
                            str6 = split2[1];
                        } else if (split2[0].equals("russian")) {
                            str7 = capitalize(split2[1], 0);
                        } else if (split2[0].equals("since")) {
                            try {
                                plainDate = Iso8601Format.parseDate(split2[1]);
                            } catch (ParseException unused10) {
                            }
                        }
                    }
                    i2++;
                    split = strArr;
                    nengo = nengo13;
                }
                nengo4 = nengo;
                if (str9 != null && str8 != null && plainDate != null) {
                    Nengo nengo14 = (Nengo) arrayList.get(arrayList.size() - 1);
                    if (!plainDate.isAfter((CalendarDate) nengo14.getStart())) {
                        throw new IllegalStateException("New Japanese era must be after last defined nengo: " + nengo14.romaji);
                    }
                    String str13 = str10 == null ? str8 : str10;
                    String str14 = str6 == null ? str9 : str6;
                    String str15 = str7 == null ? str9 : str7;
                    PlainDate plainDate2 = plainDate;
                    Nengo nengo15 = new Nengo(plainDate2.getYear(), plainDate2.getDaysSinceEpochUTC(), str8, str13, str14, str15, str9, (byte) 0, arrayList.size());
                    arrayList.add(nengo15);
                    hashMap.put(str8, nengo15);
                    hashMap2.put(str13, nengo15);
                    tst3.insert(str14, nengo15);
                    tst.insert(str15, nengo15);
                    tst5.insert(str9, nengo15);
                } else {
                    throw new IllegalStateException("Invalid syntax: " + property);
                }
            } else {
                nengo4 = nengo;
            }
            Nengo[] nengoArr2222 = (Nengo[]) arrayList.toArray(new Nengo[arrayList.size()]);
            OFFICIAL_NENGOS = nengoArr2222;
            NORTHERN_NENGOS = (Nengo[]) arrayList2.toArray(new Nengo[arrayList2.size()]);
            NENGO_KENMU = nengo4;
            NENGO_OEI = nengo2;
            KANJI_TO_NENGO = Collections.unmodifiableMap(hashMap);
            CHINESE_TO_NENGO = Collections.unmodifiableMap(hashMap2);
            KOREAN_TO_NENGO = tst3;
            RUSSIAN_TO_NENGO = tst;
            ROMAJI_TO_NENGO = tst5;
            Nengo nengo52222 = nengoArr2222[223];
            MEIJI = nengo52222;
            Nengo nengo62222 = nengoArr2222[224];
            TAISHO = nengo62222;
            Nengo nengo72222 = nengoArr2222[225];
            SHOWA = nengo72222;
            Nengo nengo82222 = nengoArr2222[226];
            HEISEI = nengo82222;
            Nengo nengo92222 = nengoArr2222[227];
            REIWA = nengo92222;
            NEWEST = nengoArr2222[nengoArr2222.length - 1];
            SELECTOR = Attributes.createKey("NENGO_SELECTOR", Selector.class);
            MODERN_KEYS = new String[]{"reiwa", "heisei", "showa", "taisho", "meiji"};
            MODERN_NENGOS = new Nengo[]{nengo92222, nengo82222, nengo72222, nengo62222, nengo52222};
            return;
        }
    }

    private Nengo(int i, long j, String str, String str2, String str3, String str4, String str5, byte b, int i2) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Missing kanji.");
        }
        if (str5.isEmpty()) {
            throw new IllegalArgumentException("Missing latin transcription.");
        }
        if (b > 1 || b < -1) {
            throw new IllegalArgumentException("Undefined court byte: " + ((int) b));
        }
        this.relgregyear = i;
        this.start = j;
        this.kanji = str;
        this.chinese = str2;
        this.korean = str3;
        this.russian = str4;
        this.romaji = str5;
        this.court = b;
        this.index = i2;
    }

    public static Nengo ofRelatedGregorianYear(int i) {
        return ofRelatedGregorianYear(i, Selector.OFFICIAL);
    }

    public static Nengo ofRelatedGregorianYear(int i, Selector selector) {
        Nengo nengo;
        Nengo nengo2;
        Nengo nengo3 = null;
        if (i >= 701) {
            int i2 = AnonymousClass1.$SwitchMap$net$time4j$calendar$Nengo$Selector[selector.ordinal()];
            if (i2 == 1) {
                if (i >= 1873) {
                    return ofRelatedGregorianYear(i, Selector.MODERN);
                }
                int length = OFFICIAL_NENGOS.length - 1;
                int i3 = 0;
                while (i3 <= length) {
                    int i4 = (i3 + length) >> 1;
                    if (OFFICIAL_NENGOS[i4].getFirstRelatedGregorianYear() <= i) {
                        i3 = i4 + 1;
                    } else {
                        length = i4 - 1;
                    }
                }
                if (i3 != 0) {
                    return OFFICIAL_NENGOS[i3 - 1];
                }
            } else if (i2 == 2) {
                int lowerBound = getLowerBound(selector);
                for (int length2 = OFFICIAL_NENGOS.length - 1; length2 >= lowerBound; length2--) {
                    nengo = OFFICIAL_NENGOS[length2];
                    if (nengo.relgregyear <= i) {
                        nengo3 = nengo;
                        break;
                    }
                }
            } else if (i2 != 3) {
                if (i2 != 4) {
                    int lowerBound2 = getLowerBound(selector);
                    int upperBound = getUpperBound(selector);
                    Nengo[] nengoArr = OFFICIAL_NENGOS;
                    if (i >= nengoArr[lowerBound2].relgregyear && i <= nengoArr[upperBound + 1].relgregyear) {
                        while (upperBound >= lowerBound2) {
                            nengo = OFFICIAL_NENGOS[upperBound];
                            if (nengo.relgregyear <= i) {
                                nengo3 = nengo;
                                break;
                            }
                            upperBound--;
                        }
                    }
                } else if (i >= 1334 && i <= 1393) {
                    int i5 = NENGO_OEI.index - 1;
                    while (true) {
                        nengo2 = OFFICIAL_NENGOS[i5];
                        if (nengo2.court != -1) {
                            break;
                        }
                        if (nengo2.relgregyear <= i) {
                            break;
                        }
                        i5--;
                    }
                    nengo3 = nengo2;
                }
            } else if (i >= 1332 && i <= 1394) {
                for (int length3 = NORTHERN_NENGOS.length - 1; length3 >= 0; length3--) {
                    nengo2 = NORTHERN_NENGOS[length3];
                    if (nengo2.relgregyear <= i) {
                        nengo3 = nengo2;
                    }
                }
            }
        }
        if (nengo3 != null) {
            return nengo3;
        }
        throw new IllegalArgumentException("Could not find nengo for year=" + i + ", selector=" + selector + ".");
    }

    public static Nengo ofKanji(String str) {
        Nengo nengo = KANJI_TO_NENGO.get(str);
        if (nengo != null) {
            return nengo;
        }
        throw new IllegalArgumentException("Could not find any nengo for Japanese kanji: " + str);
    }

    public static List<Nengo> parseRomaji(String str) {
        String hepburn = hepburn(str, 0);
        TST tst = ROMAJI_TO_NENGO;
        return tst.find(tst.longestPrefixOf(hepburn, 0));
    }

    public static List<Nengo> list() {
        return list(Selector.OFFICIAL);
    }

    public static List<Nengo> list(Selector selector) {
        List asList;
        int i = AnonymousClass1.$SwitchMap$net$time4j$calendar$Nengo$Selector[selector.ordinal()];
        if (i == 1) {
            asList = Arrays.asList(OFFICIAL_NENGOS);
        } else if (i == 3) {
            asList = Arrays.asList(NORTHERN_NENGOS);
        } else {
            int lowerBound = getLowerBound(selector);
            int upperBound = getUpperBound(selector);
            asList = new ArrayList((upperBound - lowerBound) + 1);
            while (lowerBound <= upperBound) {
                asList.add(OFFICIAL_NENGOS[lowerBound]);
                lowerBound++;
            }
        }
        return Collections.unmodifiableList(asList);
    }

    public boolean matches(Selector selector) {
        return selector.test(this);
    }

    public int getFirstRelatedGregorianYear() {
        return this.relgregyear;
    }

    public PlainDate getStart() {
        return PlainDate.of(this.start, EpochDays.UTC);
    }

    public boolean isModern() {
        return this.index >= MEIJI.index;
    }

    public String getDisplayName(Locale locale) {
        return getDisplayName(locale, TextWidth.WIDE);
    }

    public String getDisplayName(Locale locale, TextWidth textWidth) {
        String str;
        if (locale.getLanguage().isEmpty()) {
            return this.romaji;
        }
        int i = this.index;
        if (i < MEIJI.index || i > NEWEST.index || locale.getLanguage().equals("ru")) {
            if (locale.getLanguage().equals("ja")) {
                return this.kanji;
            }
            if (locale.getLanguage().equals("zh")) {
                return this.chinese;
            }
            if (locale.getLanguage().equals("ko")) {
                return this.korean;
            }
            if (locale.getLanguage().equals("ru")) {
                return "Период " + this.russian;
            }
            return this.romaji;
        }
        int i2 = 0;
        while (true) {
            Nengo[] nengoArr = MODERN_NENGOS;
            if (i2 >= nengoArr.length) {
                str = null;
                break;
            }
            if (equals(nengoArr[i2])) {
                str = MODERN_KEYS[i2];
                break;
            }
            i2++;
        }
        if (str == null) {
            throw new IllegalStateException("Modern nengos need an update.");
        }
        if (textWidth == TextWidth.NARROW) {
            str = str + "_n";
        }
        return CalendarText.getInstance("japanese", locale).getTextForms().get(str);
    }

    public Nengo findNext() {
        if (this.court == 1) {
            int i = this.index;
            Nengo[] nengoArr = NORTHERN_NENGOS;
            if (i == nengoArr.length - 1) {
                return NENGO_OEI;
            }
            return nengoArr[i + 1];
        }
        int i2 = this.index;
        Nengo[] nengoArr2 = OFFICIAL_NENGOS;
        if (i2 == nengoArr2.length - 1) {
            return null;
        }
        return nengoArr2[i2 + 1];
    }

    public Nengo findPrevious() {
        if (this.court == 1) {
            int i = this.index;
            if (i == 0) {
                return OFFICIAL_NENGOS[NENGO_KENMU.index - 1];
            }
            return NORTHERN_NENGOS[i - 1];
        }
        int i2 = this.index;
        if (i2 == 0) {
            return null;
        }
        return OFFICIAL_NENGOS[i2 - 1];
    }

    @Override // net.time4j.engine.CalendarEra
    public String name() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.romaji);
        sb.append(" (");
        Nengo findNext = findNext();
        if (findNext != null) {
            sb.append(this.relgregyear);
            sb.append('-');
            sb.append(findNext.relgregyear);
        } else {
            sb.append("since ");
            sb.append(this.relgregyear);
        }
        sb.append(')');
        return sb.toString();
    }

    int getValue() {
        int i;
        int i2;
        if (matches(Selector.NORTHERN_COURT)) {
            i = (this.index - NORTHERN_NENGOS.length) + NENGO_OEI.index;
            i2 = SHOWA.index;
        } else {
            i = this.index;
            i2 = SHOWA.index;
        }
        return (i - i2) + 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Nengo) {
            Nengo nengo = (Nengo) obj;
            if (this.relgregyear == nengo.relgregyear && this.start == nengo.start && this.kanji.equals(nengo.kanji) && this.romaji.equals(nengo.romaji) && this.court == nengo.court) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.start;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.romaji);
        sb.append(' ');
        sb.append(this.kanji);
        sb.append(' ');
        Nengo findNext = findNext();
        if (findNext != null) {
            sb.append(this.relgregyear);
            sb.append('-');
            sb.append(findNext.relgregyear);
        } else {
            sb.append("since ");
            sb.append(this.relgregyear);
        }
        if (this.court != 0) {
            sb.append(" (");
            sb.append(this.court == 1 ? 'N' : 'S');
            sb.append(')');
        }
        return sb.toString();
    }

    long getStartAsDaysSinceEpochUTC() {
        return this.start;
    }

    int getIndexOfficial() {
        return this.index;
    }

    static Nengo ofIndexOfficial(int i) {
        return OFFICIAL_NENGOS[i];
    }

    static String hepburn(CharSequence charSequence, int i) {
        int min = Math.min(charSequence.length(), i + 32);
        StringBuilder sb = null;
        for (int i2 = i; i2 < min; i2++) {
            char charAt = charSequence.charAt(i2);
            char c = 362;
            char c2 = 363;
            char c3 = 332;
            char c4 = 333;
            if (i2 == i) {
                if (charAt != 212 && charAt != 244 && charAt != 333) {
                    c3 = Character.toUpperCase(charAt);
                }
                if (charAt != 219 && charAt != 251 && charAt != 363) {
                    c = c3;
                }
            } else {
                if (charAt != 212 && charAt != 244 && charAt != 332) {
                    c4 = Character.toLowerCase(charAt);
                }
                if (charAt != 219 && charAt != 251 && charAt != 362) {
                    c2 = c4;
                }
                c = c2;
            }
            if (charAt == '\'') {
                c = Typography.rightSingleQuote;
            }
            if (charAt == ' ') {
                c = '-';
            }
            if (sb != null || c != charAt) {
                if (sb == null) {
                    sb = new StringBuilder(32);
                    sb.append(charSequence.subSequence(i, i2));
                }
                sb.append(c);
            }
        }
        return sb == null ? charSequence.subSequence(i, min).toString() : sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String capitalize(CharSequence charSequence, int i) {
        int min = Math.min(charSequence.length(), i + 32);
        StringBuilder sb = null;
        int i2 = i;
        boolean z = true;
        while (i2 < min) {
            char charAt = charSequence.charAt(i2);
            char upperCase = z ? Character.toUpperCase(charAt) : Character.toLowerCase(charAt);
            boolean z2 = charAt == ' ';
            if (sb != null || upperCase != charAt) {
                if (sb == null) {
                    sb = new StringBuilder(32);
                    sb.append(charSequence.subSequence(i, i2));
                }
                sb.append(upperCase);
            }
            i2++;
            z = z2;
        }
        return sb == null ? charSequence.subSequence(i, min).toString() : sb.toString();
    }

    private static int getUpperBound(Selector selector) {
        switch (selector) {
            case NORTHERN_COURT:
                return NORTHERN_NENGOS.length - 1;
            case SOUTHERN_COURT:
                return NENGO_KENMU.index + 8;
            case EDO_PERIOD:
                return MEIJI.index - 1;
            case AZUCHI_MOMOYAMA_PERIOD:
                return Opcodes.NEW;
            case MUROMACHI_PERIOD:
                return Opcodes.INVOKESTATIC;
            case KAMAKURA_PERIOD:
                return NENGO_KENMU.index - 1;
            case HEIAN_PERIOD:
                return 102;
            case NARA_PERIOD:
                return 14;
            case ASUKA_PERIOD:
                return 2;
            default:
                return OFFICIAL_NENGOS.length - 1;
        }
    }

    private static int getLowerBound(Selector selector) {
        switch (selector) {
            case MODERN:
                return MEIJI.index;
            case NORTHERN_COURT:
            default:
                return 0;
            case SOUTHERN_COURT:
                return NENGO_KENMU.index;
            case EDO_PERIOD:
                return 188;
            case AZUCHI_MOMOYAMA_PERIOD:
                return Opcodes.INVOKEINTERFACE;
            case MUROMACHI_PERIOD:
                return NENGO_KENMU.index + 1;
            case KAMAKURA_PERIOD:
                return 103;
            case HEIAN_PERIOD:
                return 15;
            case NARA_PERIOD:
                return 3;
        }
    }

    private static Nengo of(int i, boolean z) {
        return z ? NORTHERN_NENGOS[i] : OFFICIAL_NENGOS[i];
    }

    private Object readResolve() throws ObjectStreamException {
        try {
            int i = this.index;
            boolean z = true;
            if (this.court != 1) {
                z = false;
            }
            return of(i, z);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new StreamCorruptedException();
        }
    }

    static class Element implements TextElement<Nengo>, Serializable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final Element SINGLETON = new Element();
        private static final long serialVersionUID = -1099321098836107792L;

        @Override // net.time4j.engine.ChronoElement
        public char getSymbol() {
            return 'G';
        }

        @Override // net.time4j.engine.ChronoElement
        public boolean isDateElement() {
            return true;
        }

        @Override // net.time4j.engine.ChronoElement
        public boolean isLenient() {
            return false;
        }

        @Override // net.time4j.engine.ChronoElement
        public boolean isTimeElement() {
            return false;
        }

        private Element() {
        }

        @Override // net.time4j.format.TextElement
        public void print(ChronoDisplay chronoDisplay, Appendable appendable, AttributeQuery attributeQuery) throws IOException, ChronoException {
            appendable.append(((Nengo) chronoDisplay.get(this)).getDisplayName((Locale) attributeQuery.get(Attributes.LANGUAGE, Locale.ROOT), (TextWidth) attributeQuery.get(Attributes.TEXT_WIDTH, TextWidth.WIDE)));
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x0187 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0221 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0222  */
        @Override // net.time4j.format.TextElement
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Nengo parse(CharSequence charSequence, ParsePosition parsePosition, AttributeQuery attributeQuery) {
            int i;
            Nengo nengo;
            String longestPrefixOf;
            int i2;
            int size;
            Locale locale = (Locale) attributeQuery.get(Attributes.LANGUAGE, Locale.ROOT);
            TextWidth textWidth = (TextWidth) attributeQuery.get(Attributes.TEXT_WIDTH, TextWidth.WIDE);
            Map<String, String> textForms = CalendarText.getInstance("japanese", locale).getTextForms();
            int index = parsePosition.getIndex();
            if (index >= charSequence.length()) {
                parsePosition.setErrorIndex(index);
                return null;
            }
            String capitalize = locale.getLanguage().equals("ru") ? Nengo.capitalize(charSequence, index) : Nengo.hepburn(charSequence, index);
            int i3 = 0;
            while (true) {
                if (i3 >= Nengo.MODERN_KEYS.length) {
                    i = 0;
                    nengo = null;
                    break;
                }
                String str = Nengo.MODERN_KEYS[i3];
                if (textWidth == TextWidth.NARROW) {
                    str = str + "_n";
                }
                String str2 = textForms.get(str);
                if (capitalize.startsWith(str2)) {
                    nengo = Nengo.MODERN_NENGOS[i3];
                    i = str2.length();
                    if (textWidth != TextWidth.NARROW && nengo != Nengo.SHOWA) {
                        parsePosition.setIndex(index + i);
                        return nengo;
                    }
                } else {
                    i3++;
                }
            }
            if (capitalize.length() < 2) {
                if (nengo != null) {
                    parsePosition.setIndex(index + 1);
                }
                return nengo;
            }
            List<Nengo> list = Collections.EMPTY_LIST;
            if (locale.getLanguage().equals("ja")) {
                int i4 = capitalize.length() >= 4 ? 4 : 2;
                longestPrefixOf = capitalize.substring(0, i4);
                Nengo nengo2 = (Nengo) Nengo.KANJI_TO_NENGO.get(longestPrefixOf);
                if (nengo2 == null && i4 == 4) {
                    longestPrefixOf = capitalize.substring(0, 2);
                    nengo2 = (Nengo) Nengo.KANJI_TO_NENGO.get(longestPrefixOf);
                }
                if (nengo2 != null) {
                    if (nengo2 == nengo) {
                        nengo = null;
                    }
                    list = Collections.singletonList(nengo2);
                    i2 = 0;
                    size = list.size();
                    if (size != 0 || longestPrefixOf == null) {
                        if (nengo != null) {
                            return null;
                        }
                        parsePosition.setIndex(index + i);
                        return nengo;
                    }
                    int length = longestPrefixOf.length() + i2;
                    if (i < length) {
                        nengo = null;
                    } else if (i > length) {
                        parsePosition.setIndex(index + i);
                        return nengo;
                    }
                    if (size == 1) {
                        Nengo nengo3 = list.get(0);
                        if (nengo == null || nengo3 == nengo) {
                            parsePosition.setIndex(index + length);
                            return nengo3;
                        }
                    }
                    Selector selector = (Selector) attributeQuery.get(Nengo.SELECTOR, Selector.OFFICIAL);
                    ArrayList arrayList = new ArrayList(list);
                    if (nengo != null && !arrayList.contains(nengo)) {
                        arrayList.add(nengo);
                    }
                    Collections.sort(arrayList, new Comparator<Nengo>() { // from class: net.time4j.calendar.Nengo.Element.1
                        @Override // java.util.Comparator
                        public int compare(Nengo nengo4, Nengo nengo5) {
                            if (nengo4.start < nengo5.start) {
                                return 1;
                            }
                            return nengo4.start == nengo5.start ? 0 : -1;
                        }
                    });
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!((Nengo) it.next()).matches(selector)) {
                            it.remove();
                        }
                    }
                    if (arrayList.size() == 1) {
                        parsePosition.setIndex(index + length);
                        return (Nengo) arrayList.get(0);
                    }
                    if (arrayList.size() <= 1 || ((Leniency) attributeQuery.get(Attributes.LENIENCY, Leniency.SMART)).isStrict()) {
                        return null;
                    }
                    parsePosition.setIndex(index + length);
                    return (Nengo) arrayList.get(0);
                }
                longestPrefixOf = null;
                i2 = 0;
                size = list.size();
                if (size != 0) {
                }
                if (nengo != null) {
                }
            } else {
                if (locale.getLanguage().equals("zh")) {
                    int i5 = capitalize.length() >= 4 ? 4 : 2;
                    longestPrefixOf = capitalize.substring(0, i5);
                    Nengo nengo4 = (Nengo) Nengo.CHINESE_TO_NENGO.get(longestPrefixOf);
                    if (nengo4 == null && i5 == 4) {
                        longestPrefixOf = capitalize.substring(0, 2);
                        nengo4 = (Nengo) Nengo.CHINESE_TO_NENGO.get(longestPrefixOf);
                    }
                    if (nengo4 != null) {
                        if (nengo4 == nengo) {
                            nengo = null;
                        }
                        list = Collections.singletonList(nengo4);
                    }
                    longestPrefixOf = null;
                } else if (locale.getLanguage().equals("ko")) {
                    longestPrefixOf = Nengo.KOREAN_TO_NENGO.longestPrefixOf(capitalize, index);
                    list = Nengo.KOREAN_TO_NENGO.find(longestPrefixOf);
                } else if (!locale.getLanguage().equals("ru")) {
                    longestPrefixOf = Nengo.ROMAJI_TO_NENGO.longestPrefixOf(capitalize, index);
                    list = Nengo.ROMAJI_TO_NENGO.find(longestPrefixOf);
                } else {
                    if (capitalize.startsWith("Период ")) {
                        i2 = 7;
                        capitalize = capitalize.substring(7);
                    } else {
                        i2 = 0;
                    }
                    longestPrefixOf = Nengo.RUSSIAN_TO_NENGO.longestPrefixOf(capitalize, index);
                    list = Nengo.RUSSIAN_TO_NENGO.find(longestPrefixOf);
                    size = list.size();
                    if (size != 0) {
                    }
                    if (nengo != null) {
                    }
                }
                i2 = 0;
                size = list.size();
                if (size != 0) {
                }
                if (nengo != null) {
                }
            }
        }

        @Override // net.time4j.engine.ChronoElement
        public String name() {
            return "ERA";
        }

        @Override // net.time4j.engine.ChronoElement
        public Class<Nengo> getType() {
            return Nengo.class;
        }

        @Override // java.util.Comparator
        public int compare(ChronoDisplay chronoDisplay, ChronoDisplay chronoDisplay2) {
            Nengo nengo = (Nengo) chronoDisplay.get(this);
            Nengo nengo2 = (Nengo) chronoDisplay2.get(this);
            if (nengo.start < nengo2.start) {
                return -1;
            }
            if (nengo.start > nengo2.start) {
                return 1;
            }
            return nengo.court == 1 ? nengo2.court == 1 ? 0 : 1 : nengo2.court == 1 ? -1 : 0;
        }

        @Override // net.time4j.engine.ChronoElement
        public Nengo getDefaultMinimum() {
            return Nengo.OFFICIAL_NENGOS[0];
        }

        @Override // net.time4j.engine.ChronoElement
        public Nengo getDefaultMaximum() {
            return Nengo.OFFICIAL_NENGOS[Nengo.OFFICIAL_NENGOS.length - 1];
        }

        @Override // net.time4j.engine.ChronoElement
        public String getDisplayName(Locale locale) {
            String str = CalendarText.getIsoInstance(locale).getTextForms().get("L_era");
            return str == null ? name() : str;
        }

        private Object readResolve() throws ObjectStreamException {
            return SINGLETON;
        }
    }

    private static class TST {
        private Node root;

        private TST() {
            this.root = null;
        }

        List<Nengo> find(String str) {
            if (str == null || str.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            Node find = find(this.root, str, 0);
            if (find == null) {
                return Collections.EMPTY_LIST;
            }
            return Collections.unmodifiableList(find.nengos);
        }

        private static Node find(Node node, String str, int i) {
            if (node == null) {
                return null;
            }
            char charAt = str.charAt(i);
            if (charAt < node.c) {
                return find(node.left, str, i);
            }
            if (charAt > node.c) {
                return find(node.right, str, i);
            }
            return i < str.length() + (-1) ? find(node.mid, str, i + 1) : node;
        }

        void insert(String str, Nengo nengo) {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("Empty key cannot be inserted.");
            }
            this.root = insert(this.root, str, nengo, 0);
        }

        private static Node insert(Node node, String str, Nengo nengo, int i) {
            char charAt = str.charAt(i);
            if (node == null) {
                node = new Node();
                node.c = charAt;
            }
            if (charAt < node.c) {
                node.left = insert(node.left, str, nengo, i);
                return node;
            }
            if (charAt <= node.c) {
                if (i < str.length() - 1) {
                    node.mid = insert(node.mid, str, nengo, i + 1);
                    return node;
                }
                if (node.nengos == null) {
                    node.nengos = new ArrayList();
                }
                node.nengos.add(nengo);
                return node;
            }
            node.right = insert(node.right, str, nengo, i);
            return node;
        }

        String longestPrefixOf(CharSequence charSequence, int i) {
            Node node = this.root;
            int length = charSequence.length();
            int i2 = i;
            int i3 = i2;
            while (node != null && i2 < length) {
                char charAt = charSequence.charAt(i2);
                if (charAt < node.c) {
                    node = node.left;
                } else if (charAt > node.c) {
                    node = node.right;
                } else {
                    i2++;
                    if (node.nengos != null) {
                        i3 = i2;
                    }
                    node = node.mid;
                }
            }
            if (i >= i3) {
                return null;
            }
            return charSequence.subSequence(i, i3).toString();
        }
    }

    private static class Node {
        private char c;
        private Node left;
        private Node mid;
        private List<Nengo> nengos;
        private Node right;

        private Node() {
            this.c = (char) 0;
            this.left = null;
            this.mid = null;
            this.right = null;
            this.nengos = null;
        }
    }
}
