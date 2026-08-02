package org.spongycastle.crypto.engines;

import com.plaid.internal.EnumC3631g;
import java.lang.reflect.Array;
import kotlin.UByte;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.math.ec.Tnaf;

/* renamed from: org.spongycastle.crypto.engines.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5951a implements org.spongycastle.crypto.e {

    /* renamed from: a, reason: collision with root package name */
    public int f62533a;

    /* renamed from: b, reason: collision with root package name */
    public int[][] f62534b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f62535c;

    /* renamed from: d, reason: collision with root package name */
    public int f62536d;

    /* renamed from: e, reason: collision with root package name */
    public int f62537e;

    /* renamed from: f, reason: collision with root package name */
    public int f62538f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f62539g;

    /* renamed from: s, reason: collision with root package name */
    private byte[] f62540s;

    /* renamed from: S, reason: collision with root package name */
    private static final byte[] f62530S = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, ByteCompanionObject.MIN_VALUE, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, ByteCompanionObject.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, -74, -38, 33, Tnaf.POW_2_WIDTH, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, Base64.padSymbol, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22};

    /* renamed from: Si, reason: collision with root package name */
    private static final byte[] f62531Si = {82, 9, 106, -43, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, Base64.padSymbol, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, 14, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, 18, Tnaf.POW_2_WIDTH, 89, 39, ByteCompanionObject.MIN_VALUE, -20, 95, 96, 81, ByteCompanionObject.MAX_VALUE, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, 33, 12, 125};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, EnumC3631g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, 77, EnumC3631g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, 47, 94, 188, 99, EnumC3631g.SDK_ASSET_ICON_ARROW_UP_VALUE, 151, 53, 106, EnumC3631g.SDK_ASSET_ICON_OVERRIDE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE, 125, 250, EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE, EnumC3631g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE};

    /* renamed from: T0, reason: collision with root package name */
    private static final int[] f62532T0 = {-1520213050, -2072216328, -1720223762, -1921287178, 234025727, -1117033514, -1318096930, 1422247313, 1345335392, 50397442, -1452841010, 2099981142, 436141799, 1658312629, -424957107, -1703512340, 1170918031, -1652391393, 1086966153, -2021818886, 368769775, -346465870, -918075506, 200339707, -324162239, 1742001331, -39673249, -357585083, -1080255453, -140204973, -1770884380, 1539358875, -1028147339, 486407649, -1366060227, 1780885068, 1513502316, 1094664062, 49805301, 1338821763, 1546925160, -190470831, 887481809, 150073849, -1821281822, 1943591083, 1395732834, 1058346282, 201589768, 1388824469, 1696801606, 1589887901, 672667696, -1583966665, 251987210, -1248159185, 151455502, 907153956, -1686077413, 1038279391, 652995533, 1764173646, -843926913, -1619692054, 453576978, -1635548387, 1949051992, 773462580, 756751158, -1301385508, -296068428, -73359269, -162377052, 1295727478, 1641469623, -827083907, 2066295122, 1055122397, 1898917726, -1752923117, -179088474, 1758581177, 0, 753790401, 1612718144, 536673507, -927878791, -312779850, -1100322092, 1187761037, -641810841, 1262041458, -565556588, -733197160, -396863312, 1255133061, 1808847035, 720367557, -441800113, 385612781, -985447546, -682799718, 1429418854, -1803188975, -817543798, 284817897, 100794884, -2122350594, -263171936, 1144798328, -1163944155, -475486133, -212774494, -22830243, -1069531008, -1970303227, -1382903233, -1130521311, 1211644016, 83228145, -541279133, -1044990345, 1977277103, 1663115586, 806359072, 452984805, 250868733, 1842533055, 1288555905, 336333848, 890442534, 804056259, -513843266, -1567123659, -867941240, 957814574, 1472513171, -223893675, -2105639172, 1195195770, -1402706744, -413311558, 723065138, -1787595802, -1604296512, -1736343271, -783331426, 2145180835, 1713513028, 2116692564, -1416589253, -2088204277, -901364084, 703524551, -742868885, 1007948840, 2044649127, -497131844, 487262998, 1994120109, 1004593371, 1446130276, 1312438900, 503974420, -615954030, 168166924, 1814307912, -463709000, 1573044895, 1859376061, -273896381, -1503501628, -1466855111, -1533700815, 937747667, -1954973198, 854058965, 1137232011, 1496790894, -1217565222, -1936880383, 1691735473, -766620004, -525751991, -1267962664, -95005012, 133494003, 636152527, -1352309302, -1904575756, -374428089, 403179536, -709182865, -2005370640, 1864705354, 1915629148, 605822008, -240736681, -944458637, 1371981463, 602466507, 2094914977, -1670089496, 555687742, -582268010, -591544991, -2037675251, -2054518257, -1871679264, 1111375484, -994724495, -1436129588, -666351472, 84083462, 32962295, 302911004, -1553899070, 1597322602, -111716434, -793134743, -1853454825, 1489093017, 656219450, -1180787161, 954327513, 335083755, -1281845205, 856756514, -1150719534, 1893325225, -1987146233, -1483434957, -1231316179, 572399164, -1836611819, 552200649, 1238290055, -11184726, 2015897680, 2061492133, -1886614525, -123625127, -2138470135, 386731290, -624967835, 837215959, -968736124, -1201116976, -1019133566, -1332111063, 1999449434, 286199582, -877612933, -61582168, -692339859, 974525996};
    private static final int[] Tinv0 = {1353184337, 1399144830, -1012656358, -1772214470, -882136261, -247096033, -1420232020, -1828461749, 1442459680, -160598355, -1854485368, 625738485, -52959921, -674551099, -2143013594, -1885117771, 1230680542, 1729870373, -1743852987, -507445667, 41234371, 317738113, -1550367091, -956705941, -413167869, -1784901099, -344298049, -631680363, 763608788, -752782248, 694804553, 1154009486, 1787413109, 2021232372, 1799248025, -579749593, -1236278850, 397248752, 1722556617, -1271214467, 407560035, -2110711067, 1613975959, 1165972322, -529046351, -2068943941, 480281086, -1809118983, 1483229296, 436028815, -2022908268, -1208452270, 601060267, -503166094, 1468997603, 715871590, 120122290, 63092015, -1703164538, -1526188077, -226023376, -1297760477, -1167457534, 1552029421, 723308426, -1833666137, -252573709, -1578997426, -839591323, -708967162, 526529745, -1963022652, -1655493068, -1604979806, 853641733, 1978398372, 971801355, -1427152832, 111112542, 1360031421, -108388034, 1023860118, -1375387939, 1186850381, -1249028975, 90031217, 1876166148, -15380384, 620468249, -1746289194, -868007799, 2006899047, -1119688528, -2004121337, 945494503, -605108103, 1191869601, -384875908, -920746760, 0, -2088337399, 1223502642, -1401941730, 1316117100, -67170563, 1446544655, 517320253, 658058550, 1691946762, 564550760, -783000677, 976107044, -1318647284, 266819475, -761860428, -1634624741, 1338359936, -1574904735, 1766553434, 370807324, 179999714, -450191168, 1138762300, 488053522, 185403662, -1379431438, -1180125651, -928440812, -2061897385, 1275557295, -1143105042, -44007517, -1624899081, -1124765092, -985962940, 880737115, 1982415755, -590994485, 1761406390, 1676797112, -891538985, 277177154, 1076008723, 538035844, 2099530373, -130171950, 288553390, 1839278535, 1261411869, -214912292, -330136051, -790380169, 1813426987, -1715900247, -95906799, 577038663, -997393240, 440397984, -668172970, -275762398, -951170681, -1043253031, -22885748, 906744984, -813566554, 685669029, 646887386, -1530942145, -459458004, 227702864, -1681105046, 1648787028, -1038905866, -390539120, 1593260334, -173030526, -1098883681, 2090061929, -1456614033, -1290656305, 999926984, -1484974064, 1852021992, 2075868123, 158869197, -199730834, 28809964, -1466282109, 1701746150, 2129067946, 147831841, -420997649, -644094022, -835293366, -737566742, -696471511, -1347247055, 824393514, 815048134, -1067015627, 935087732, -1496677636, -1328508704, 366520115, 1251476721, -136647615, 240176511, 804688151, -1915335306, 1303441219, 1414376140, -553347356, -474623586, 461924940, -1205916479, 2136040774, 82468509, 1563790337, 1937016826, 776014843, 1511876531, 1389550482, 861278441, 323475053, -1939744870, 2047648055, -1911228327, -1992551445, -299390514, 902390199, -303751967, 1018251130, 1507840668, 1064563285, 2043548696, -1086863501, -355600557, 1537932639, 342834655, -2032450440, -2114736182, 1053059257, 741614648, 1598071746, 1925389590, 203809468, -1958134744, 1100287487, 1895934009, -558691320, -1662733096, -1866377628, 1636092795, 1890988757, 1952214088, 1113045200};

    public static int b(int i10) {
        return (((i10 & (-2139062144)) >>> 7) * 27) ^ ((2139062143 & i10) << 1);
    }

    public static int c(int i10) {
        int i11 = (1061109567 & i10) << 2;
        int i12 = i10 & (-1061109568);
        int i13 = i12 ^ (i12 >>> 1);
        return (i13 >>> 5) ^ (i11 ^ (i13 >>> 2));
    }

    public static int g(int i10) {
        int i11 = i(i10, 8) ^ i10;
        int b10 = i10 ^ b(i11);
        int c10 = i11 ^ c(b10);
        return b10 ^ (c10 ^ i(c10, 16));
    }

    public static int i(int i10, int i11) {
        return (i10 << (-i11)) | (i10 >>> i11);
    }

    public static int j(int i10) {
        byte[] bArr = f62530S;
        return (bArr[(i10 >> 24) & 255] << 24) | (bArr[i10 & 255] & UByte.MAX_VALUE) | ((bArr[(i10 >> 8) & 255] & UByte.MAX_VALUE) << 8) | ((bArr[(i10 >> 16) & 255] & UByte.MAX_VALUE) << 16);
    }

    @Override // org.spongycastle.crypto.e
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        if (!(jVar instanceof org.spongycastle.crypto.params.w)) {
            throw new IllegalArgumentException("invalid parameter passed to AES init - " + jVar.getClass().getName());
        }
        this.f62534b = f(((org.spongycastle.crypto.params.w) jVar).a(), z10);
        this.f62539g = z10;
        if (z10) {
            this.f62540s = Aj.a.d(f62530S);
        } else {
            this.f62540s = Aj.a.d(f62531Si);
        }
    }

    public final void d(int[][] iArr) {
        int i10 = this.f62535c;
        int i11 = this.f62533a;
        int[] iArr2 = iArr[i11];
        char c10 = 0;
        int i12 = i10 ^ iArr2[0];
        int i13 = 1;
        int i14 = this.f62536d ^ iArr2[1];
        char c11 = 2;
        int i15 = this.f62537e ^ iArr2[2];
        int i16 = i11 - 1;
        int i17 = iArr2[3] ^ this.f62538f;
        while (i16 > i13) {
            int[] iArr3 = Tinv0;
            int i18 = (((iArr3[i12 & 255] ^ i(iArr3[(i17 >> 8) & 255], 24)) ^ i(iArr3[(i15 >> 16) & 255], 16)) ^ i(iArr3[(i14 >> 24) & 255], 8)) ^ iArr[i16][c10];
            char c12 = c10;
            int i19 = (((i(iArr3[(i12 >> 8) & 255], 24) ^ iArr3[i14 & 255]) ^ i(iArr3[(i17 >> 16) & 255], 16)) ^ i(iArr3[(i15 >> 24) & 255], 8)) ^ iArr[i16][i13];
            int i20 = i13;
            int i21 = (((i(iArr3[(i14 >> 8) & 255], 24) ^ iArr3[i15 & 255]) ^ i(iArr3[(i12 >> 16) & 255], 16)) ^ i(iArr3[(i17 >> 24) & 255], 8)) ^ iArr[i16][c11];
            int i22 = i(iArr3[(i12 >> 24) & 255], 8) ^ ((iArr3[i17 & 255] ^ i(iArr3[(i15 >> 8) & 255], 24)) ^ i(iArr3[(i14 >> 16) & 255], 16));
            int i23 = i16 - 1;
            int i24 = i22 ^ iArr[i16][3];
            int i25 = (((iArr3[i18 & 255] ^ i(iArr3[(i24 >> 8) & 255], 24)) ^ i(iArr3[(i21 >> 16) & 255], 16)) ^ i(iArr3[(i19 >> 24) & 255], 8)) ^ iArr[i23][c12];
            int i26 = (((iArr3[i19 & 255] ^ i(iArr3[(i18 >> 8) & 255], 24)) ^ i(iArr3[(i24 >> 16) & 255], 16)) ^ i(iArr3[(i21 >> 24) & 255], 8)) ^ iArr[i23][i20];
            char c13 = c11;
            int i27 = (((i(iArr3[(i19 >> 8) & 255], 24) ^ iArr3[i21 & 255]) ^ i(iArr3[(i18 >> 16) & 255], 16)) ^ i(iArr3[(i24 >> 24) & 255], 8)) ^ iArr[i23][c13];
            i16 -= 2;
            i17 = iArr[i23][3] ^ (((iArr3[i24 & 255] ^ i(iArr3[(i21 >> 8) & 255], 24)) ^ i(iArr3[(i19 >> 16) & 255], 16)) ^ i(iArr3[(i18 >> 24) & 255], 8));
            i12 = i25;
            i14 = i26;
            i15 = i27;
            c10 = c12;
            i13 = i20;
            c11 = c13;
        }
        char c14 = c10;
        int i28 = i13;
        char c15 = c11;
        int[] iArr4 = Tinv0;
        int i29 = (((iArr4[i12 & 255] ^ i(iArr4[(i17 >> 8) & 255], 24)) ^ i(iArr4[(i15 >> 16) & 255], 16)) ^ i(iArr4[(i14 >> 24) & 255], 8)) ^ iArr[i16][c14];
        int i30 = (((iArr4[i14 & 255] ^ i(iArr4[(i12 >> 8) & 255], 24)) ^ i(iArr4[(i17 >> 16) & 255], 16)) ^ i(iArr4[(i15 >> 24) & 255], 8)) ^ iArr[i16][i28];
        int i31 = (((iArr4[i15 & 255] ^ i(iArr4[(i14 >> 8) & 255], 24)) ^ i(iArr4[(i12 >> 16) & 255], 16)) ^ i(iArr4[(i17 >> 24) & 255], 8)) ^ iArr[i16][c15];
        int i32 = (i(iArr4[(i12 >> 24) & 255], 8) ^ ((iArr4[i17 & 255] ^ i(iArr4[(i15 >> 8) & 255], 24)) ^ i(iArr4[(i14 >> 16) & 255], 16))) ^ iArr[i16][3];
        byte[] bArr = f62531Si;
        int i33 = bArr[i29 & 255] & UByte.MAX_VALUE;
        byte[] bArr2 = this.f62540s;
        int i34 = ((i33 ^ ((bArr2[(i32 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr2[(i31 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(i30 >> 24) & 255] << 24);
        int[] iArr5 = iArr[c14];
        this.f62535c = i34 ^ iArr5[c14];
        this.f62536d = ((((bArr2[i30 & 255] & UByte.MAX_VALUE) ^ ((bArr2[(i29 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(i32 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr2[(i31 >> 24) & 255] << 24)) ^ iArr5[i28];
        this.f62537e = ((((bArr2[i31 & 255] & UByte.MAX_VALUE) ^ ((bArr[(i30 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(i29 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr2[(i32 >> 24) & 255] << 24)) ^ iArr5[c15];
        this.f62538f = ((((bArr[i32 & 255] & UByte.MAX_VALUE) ^ ((bArr2[(i31 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr2[(i30 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr2[(i29 >> 24) & 255] << 24)) ^ iArr5[3];
    }

    public final void e(int[][] iArr) {
        int i10 = this.f62535c;
        char c10 = 0;
        int[] iArr2 = iArr[0];
        int i11 = i10 ^ iArr2[0];
        int i12 = 1;
        int i13 = this.f62536d ^ iArr2[1];
        char c11 = 2;
        int i14 = this.f62537e ^ iArr2[2];
        int i15 = iArr2[3] ^ this.f62538f;
        int i16 = 1;
        while (i16 < this.f62533a - i12) {
            int[] iArr3 = f62532T0;
            int i17 = (((iArr3[i11 & 255] ^ i(iArr3[(i13 >> 8) & 255], 24)) ^ i(iArr3[(i14 >> 16) & 255], 16)) ^ i(iArr3[(i15 >> 24) & 255], 8)) ^ iArr[i16][c10];
            char c12 = c10;
            int i18 = (((i(iArr3[(i14 >> 8) & 255], 24) ^ iArr3[i13 & 255]) ^ i(iArr3[(i15 >> 16) & 255], 16)) ^ i(iArr3[(i11 >> 24) & 255], 8)) ^ iArr[i16][i12];
            int i19 = i12;
            int i20 = (((i(iArr3[(i15 >> 8) & 255], 24) ^ iArr3[i14 & 255]) ^ i(iArr3[(i11 >> 16) & 255], 16)) ^ i(iArr3[(i13 >> 24) & 255], 8)) ^ iArr[i16][c11];
            int i21 = ((i(iArr3[(i11 >> 8) & 255], 24) ^ iArr3[i15 & 255]) ^ i(iArr3[(i13 >> 16) & 255], 16)) ^ i(iArr3[(i14 >> 24) & 255], 8);
            int i22 = i16 + 1;
            int i23 = i21 ^ iArr[i16][3];
            int i24 = (((iArr3[i17 & 255] ^ i(iArr3[(i18 >> 8) & 255], 24)) ^ i(iArr3[(i20 >> 16) & 255], 16)) ^ i(iArr3[(i23 >> 24) & 255], 8)) ^ iArr[i22][c12];
            int i25 = (((iArr3[i18 & 255] ^ i(iArr3[(i20 >> 8) & 255], 24)) ^ i(iArr3[(i23 >> 16) & 255], 16)) ^ i(iArr3[(i17 >> 24) & 255], 8)) ^ iArr[i22][i19];
            char c13 = c11;
            int i26 = (((i(iArr3[(i23 >> 8) & 255], 24) ^ iArr3[i20 & 255]) ^ i(iArr3[(i17 >> 16) & 255], 16)) ^ i(iArr3[(i18 >> 24) & 255], 8)) ^ iArr[i22][c13];
            i16 += 2;
            i15 = (((iArr3[i23 & 255] ^ i(iArr3[(i17 >> 8) & 255], 24)) ^ i(iArr3[(i18 >> 16) & 255], 16)) ^ i(iArr3[(i20 >> 24) & 255], 8)) ^ iArr[i22][3];
            i11 = i24;
            i13 = i25;
            i14 = i26;
            c10 = c12;
            i12 = i19;
            c11 = c13;
        }
        char c14 = c10;
        int i27 = i12;
        char c15 = c11;
        int[] iArr4 = f62532T0;
        int i28 = (((iArr4[i11 & 255] ^ i(iArr4[(i13 >> 8) & 255], 24)) ^ i(iArr4[(i14 >> 16) & 255], 16)) ^ i(iArr4[(i15 >> 24) & 255], 8)) ^ iArr[i16][c14];
        int i29 = (((iArr4[i13 & 255] ^ i(iArr4[(i14 >> 8) & 255], 24)) ^ i(iArr4[(i15 >> 16) & 255], 16)) ^ i(iArr4[(i11 >> 24) & 255], 8)) ^ iArr[i16][i27];
        int i30 = (((iArr4[i14 & 255] ^ i(iArr4[(i15 >> 8) & 255], 24)) ^ i(iArr4[(i11 >> 16) & 255], 16)) ^ i(iArr4[(i13 >> 24) & 255], 8)) ^ iArr[i16][c15];
        int i31 = (((i(iArr4[(i11 >> 8) & 255], 24) ^ iArr4[i15 & 255]) ^ i(iArr4[(i13 >> 16) & 255], 16)) ^ i(iArr4[(i14 >> 24) & 255], 8)) ^ iArr[i16][3];
        byte[] bArr = f62530S;
        int i32 = (bArr[i28 & 255] & UByte.MAX_VALUE) ^ ((bArr[(i29 >> 8) & 255] & UByte.MAX_VALUE) << 8);
        byte[] bArr2 = this.f62540s;
        int i33 = (i32 ^ ((bArr2[(i30 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr2[(i31 >> 24) & 255] << 24);
        int[] iArr5 = iArr[i16 + 1];
        this.f62535c = i33 ^ iArr5[c14];
        this.f62536d = ((((bArr2[i29 & 255] & UByte.MAX_VALUE) ^ ((bArr[(i30 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(i31 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr2[(i28 >> 24) & 255] << 24)) ^ iArr5[i27];
        this.f62537e = ((((bArr2[i30 & 255] & UByte.MAX_VALUE) ^ ((bArr[(i31 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(i28 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(i29 >> 24) & 255] << 24)) ^ iArr5[c15];
        this.f62538f = ((((bArr2[i31 & 255] & UByte.MAX_VALUE) ^ ((bArr2[(i28 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr2[(i29 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(i30 >> 24) & 255] << 24)) ^ iArr5[3];
    }

    public final int[][] f(byte[] bArr, boolean z10) {
        int i10;
        int length = bArr.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i11 = length >>> 2;
        this.f62533a = i11 + 6;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i11 + 7, 4);
        if (i11 == 4) {
            i10 = 1;
            int i12 = Aj.f.i(bArr, 0);
            iArr[0][0] = i12;
            int i13 = Aj.f.i(bArr, 4);
            iArr[0][1] = i13;
            int i14 = Aj.f.i(bArr, 8);
            iArr[0][2] = i14;
            int i15 = Aj.f.i(bArr, 12);
            iArr[0][3] = i15;
            for (int i16 = 1; i16 <= 10; i16++) {
                i12 ^= j(i(i15, 8)) ^ rcon[i16 - 1];
                int[] iArr2 = iArr[i16];
                iArr2[0] = i12;
                i13 ^= i12;
                iArr2[1] = i13;
                i14 ^= i13;
                iArr2[2] = i14;
                i15 ^= i14;
                iArr2[3] = i15;
            }
        } else if (i11 == 6) {
            i10 = 1;
            int i17 = Aj.f.i(bArr, 0);
            iArr[0][0] = i17;
            int i18 = Aj.f.i(bArr, 4);
            iArr[0][1] = i18;
            int i19 = Aj.f.i(bArr, 8);
            iArr[0][2] = i19;
            int i20 = Aj.f.i(bArr, 12);
            iArr[0][3] = i20;
            int i21 = Aj.f.i(bArr, 16);
            iArr[1][0] = i21;
            int i22 = Aj.f.i(bArr, 20);
            iArr[1][1] = i22;
            int j10 = i17 ^ (j(i(i22, 8)) ^ 1);
            int[] iArr3 = iArr[1];
            iArr3[2] = j10;
            int i23 = i18 ^ j10;
            iArr3[3] = i23;
            int i24 = i19 ^ i23;
            int[] iArr4 = iArr[2];
            iArr4[0] = i24;
            int i25 = i20 ^ i24;
            iArr4[1] = i25;
            int i26 = i21 ^ i25;
            iArr4[2] = i26;
            int i27 = i22 ^ i26;
            iArr4[3] = i27;
            int i28 = 2;
            for (int i29 = 3; i29 < 12; i29 += 3) {
                int j11 = j10 ^ (j(i(i27, 8)) ^ i28);
                int[] iArr5 = iArr[i29];
                iArr5[0] = j11;
                int i30 = i23 ^ j11;
                iArr5[1] = i30;
                int i31 = i24 ^ i30;
                iArr5[2] = i31;
                int i32 = i25 ^ i31;
                iArr5[3] = i32;
                int i33 = i26 ^ i32;
                int i34 = i29 + 1;
                int[] iArr6 = iArr[i34];
                iArr6[0] = i33;
                int i35 = i27 ^ i33;
                iArr6[1] = i35;
                int j12 = j(i(i35, 8)) ^ (i28 << 1);
                i28 <<= 2;
                j10 = j11 ^ j12;
                int[] iArr7 = iArr[i34];
                iArr7[2] = j10;
                i23 = i30 ^ j10;
                iArr7[3] = i23;
                i24 = i31 ^ i23;
                int[] iArr8 = iArr[i29 + 2];
                iArr8[0] = i24;
                i25 = i32 ^ i24;
                iArr8[1] = i25;
                i26 = i33 ^ i25;
                iArr8[2] = i26;
                i27 = i35 ^ i26;
                iArr8[3] = i27;
            }
            int j13 = (j(i(i27, 8)) ^ i28) ^ j10;
            int[] iArr9 = iArr[12];
            iArr9[0] = j13;
            int i36 = j13 ^ i23;
            iArr9[1] = i36;
            int i37 = i36 ^ i24;
            iArr9[2] = i37;
            iArr9[3] = i37 ^ i25;
        } else {
            if (i11 != 8) {
                throw new IllegalStateException("Should never get here");
            }
            int i38 = Aj.f.i(bArr, 0);
            iArr[0][0] = i38;
            int i39 = Aj.f.i(bArr, 4);
            iArr[0][1] = i39;
            int i40 = Aj.f.i(bArr, 8);
            iArr[0][2] = i40;
            int i41 = Aj.f.i(bArr, 12);
            iArr[0][3] = i41;
            int i42 = Aj.f.i(bArr, 16);
            iArr[1][0] = i42;
            int i43 = Aj.f.i(bArr, 20);
            iArr[1][1] = i43;
            int i44 = Aj.f.i(bArr, 24);
            iArr[1][2] = i44;
            int i45 = Aj.f.i(bArr, 28);
            iArr[1][3] = i45;
            int i46 = 1;
            i10 = 1;
            for (int i47 = 2; i47 < 14; i47 += 2) {
                int j14 = j(i(i45, 8)) ^ i46;
                i46 <<= 1;
                i38 ^= j14;
                int[] iArr10 = iArr[i47];
                iArr10[0] = i38;
                i39 ^= i38;
                iArr10[1] = i39;
                i40 ^= i39;
                iArr10[2] = i40;
                i41 ^= i40;
                iArr10[3] = i41;
                i42 ^= j(i41);
                int[] iArr11 = iArr[i47 + 1];
                iArr11[0] = i42;
                i43 ^= i42;
                iArr11[1] = i43;
                i44 ^= i43;
                iArr11[2] = i44;
                i45 ^= i44;
                iArr11[3] = i45;
            }
            int j15 = (j(i(i45, 8)) ^ i46) ^ i38;
            int[] iArr12 = iArr[14];
            iArr12[0] = j15;
            int i48 = j15 ^ i39;
            iArr12[1] = i48;
            int i49 = i48 ^ i40;
            iArr12[2] = i49;
            iArr12[3] = i49 ^ i41;
        }
        if (!z10) {
            for (int i50 = i10; i50 < this.f62533a; i50++) {
                for (int i51 = 0; i51 < 4; i51++) {
                    int[] iArr13 = iArr[i50];
                    iArr13[i51] = g(iArr13[i51]);
                }
            }
        }
        return iArr;
    }

    @Override // org.spongycastle.crypto.e
    public String getAlgorithmName() {
        return "AES";
    }

    @Override // org.spongycastle.crypto.e
    public int getBlockSize() {
        return 16;
    }

    public final void h(byte[] bArr, int i10) {
        int i11 = this.f62535c;
        bArr[i10] = (byte) i11;
        bArr[i10 + 1] = (byte) (i11 >> 8);
        bArr[i10 + 2] = (byte) (i11 >> 16);
        bArr[i10 + 3] = (byte) (i11 >> 24);
        int i12 = this.f62536d;
        bArr[i10 + 4] = (byte) i12;
        bArr[i10 + 5] = (byte) (i12 >> 8);
        bArr[i10 + 6] = (byte) (i12 >> 16);
        bArr[i10 + 7] = (byte) (i12 >> 24);
        int i13 = this.f62537e;
        bArr[i10 + 8] = (byte) i13;
        bArr[i10 + 9] = (byte) (i13 >> 8);
        bArr[i10 + 10] = (byte) (i13 >> 16);
        bArr[i10 + 11] = (byte) (i13 >> 24);
        int i14 = this.f62538f;
        bArr[i10 + 12] = (byte) i14;
        bArr[i10 + 13] = (byte) (i14 >> 8);
        bArr[i10 + 14] = (byte) (i14 >> 16);
        bArr[i10 + 15] = (byte) (i14 >> 24);
    }

    public final void k(byte[] bArr, int i10) {
        int i11 = bArr[i10] & UByte.MAX_VALUE;
        this.f62535c = i11;
        int i12 = ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | i11;
        this.f62535c = i12;
        int i13 = i12 | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
        this.f62535c = i13;
        this.f62535c = i13 | (bArr[i10 + 3] << 24);
        int i14 = bArr[i10 + 4] & UByte.MAX_VALUE;
        this.f62536d = i14;
        int i15 = ((bArr[i10 + 5] & UByte.MAX_VALUE) << 8) | i14;
        this.f62536d = i15;
        int i16 = i15 | ((bArr[i10 + 6] & UByte.MAX_VALUE) << 16);
        this.f62536d = i16;
        this.f62536d = i16 | (bArr[i10 + 7] << 24);
        int i17 = bArr[i10 + 8] & UByte.MAX_VALUE;
        this.f62537e = i17;
        int i18 = ((bArr[i10 + 9] & UByte.MAX_VALUE) << 8) | i17;
        this.f62537e = i18;
        int i19 = i18 | ((bArr[i10 + 10] & UByte.MAX_VALUE) << 16);
        this.f62537e = i19;
        this.f62537e = i19 | (bArr[i10 + 11] << 24);
        int i20 = bArr[i10 + 12] & UByte.MAX_VALUE;
        this.f62538f = i20;
        int i21 = ((bArr[i10 + 13] & UByte.MAX_VALUE) << 8) | i20;
        this.f62538f = i21;
        int i22 = i21 | ((bArr[i10 + 14] & UByte.MAX_VALUE) << 16);
        this.f62538f = i22;
        this.f62538f = (bArr[i10 + 15] << 24) | i22;
    }

    @Override // org.spongycastle.crypto.e
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.f62534b == null) {
            throw new IllegalStateException("AES engine not initialised");
        }
        if (i10 + 16 > bArr.length) {
            throw new org.spongycastle.crypto.l("input buffer too short");
        }
        if (i11 + 16 > bArr2.length) {
            throw new org.spongycastle.crypto.x("output buffer too short");
        }
        if (this.f62539g) {
            k(bArr, i10);
            e(this.f62534b);
            h(bArr2, i11);
            return 16;
        }
        k(bArr, i10);
        d(this.f62534b);
        h(bArr2, i11);
        return 16;
    }

    @Override // org.spongycastle.crypto.e
    public void reset() {
    }
}
