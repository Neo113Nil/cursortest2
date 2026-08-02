package org.bouncycastle.crypto.engines;

import com.plaid.internal.EnumC3631g;
import java.lang.reflect.Array;
import kotlin.UByte;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.math.ec.Tnaf;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes5.dex */
public class AESEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;

    /* renamed from: m1, reason: collision with root package name */
    private static final int f61567m1 = -2139062144;

    /* renamed from: m2, reason: collision with root package name */
    private static final int f61568m2 = 2139062143;

    /* renamed from: m3, reason: collision with root package name */
    private static final int f61569m3 = 27;

    /* renamed from: m4, reason: collision with root package name */
    private static final int f61570m4 = -1061109568;

    /* renamed from: m5, reason: collision with root package name */
    private static final int f61571m5 = 1061109567;

    /* renamed from: C0, reason: collision with root package name */
    private int f61572C0;

    /* renamed from: C1, reason: collision with root package name */
    private int f61573C1;

    /* renamed from: C2, reason: collision with root package name */
    private int f61574C2;

    /* renamed from: C3, reason: collision with root package name */
    private int f61575C3;
    private int ROUNDS;
    private int[][] WorkingKey = null;
    private boolean forEncryption;

    /* renamed from: s, reason: collision with root package name */
    private byte[] f61576s;

    /* renamed from: S, reason: collision with root package name */
    private static final byte[] f61564S = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, ByteCompanionObject.MIN_VALUE, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, ByteCompanionObject.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, -74, -38, 33, Tnaf.POW_2_WIDTH, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, Base64.padSymbol, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22};

    /* renamed from: Si, reason: collision with root package name */
    private static final byte[] f61565Si = {82, 9, 106, -43, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, Base64.padSymbol, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, 14, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, 18, Tnaf.POW_2_WIDTH, 89, 39, ByteCompanionObject.MIN_VALUE, -20, 95, 96, 81, ByteCompanionObject.MAX_VALUE, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, 33, 12, 125};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, EnumC3631g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, 77, EnumC3631g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, 47, 94, 188, 99, EnumC3631g.SDK_ASSET_ICON_ARROW_UP_VALUE, 151, 53, 106, EnumC3631g.SDK_ASSET_ICON_OVERRIDE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE, 125, 250, EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE, EnumC3631g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE};

    /* renamed from: T0, reason: collision with root package name */
    private static final int[] f61566T0 = {-1520213050, -2072216328, -1720223762, -1921287178, 234025727, -1117033514, -1318096930, 1422247313, 1345335392, 50397442, -1452841010, 2099981142, 436141799, 1658312629, -424957107, -1703512340, 1170918031, -1652391393, 1086966153, -2021818886, 368769775, -346465870, -918075506, 200339707, -324162239, 1742001331, -39673249, -357585083, -1080255453, -140204973, -1770884380, 1539358875, -1028147339, 486407649, -1366060227, 1780885068, 1513502316, 1094664062, 49805301, 1338821763, 1546925160, -190470831, 887481809, 150073849, -1821281822, 1943591083, 1395732834, 1058346282, 201589768, 1388824469, 1696801606, 1589887901, 672667696, -1583966665, 251987210, -1248159185, 151455502, 907153956, -1686077413, 1038279391, 652995533, 1764173646, -843926913, -1619692054, 453576978, -1635548387, 1949051992, 773462580, 756751158, -1301385508, -296068428, -73359269, -162377052, 1295727478, 1641469623, -827083907, 2066295122, 1055122397, 1898917726, -1752923117, -179088474, 1758581177, 0, 753790401, 1612718144, 536673507, -927878791, -312779850, -1100322092, 1187761037, -641810841, 1262041458, -565556588, -733197160, -396863312, 1255133061, 1808847035, 720367557, -441800113, 385612781, -985447546, -682799718, 1429418854, -1803188975, -817543798, 284817897, 100794884, -2122350594, -263171936, 1144798328, -1163944155, -475486133, -212774494, -22830243, -1069531008, -1970303227, -1382903233, -1130521311, 1211644016, 83228145, -541279133, -1044990345, 1977277103, 1663115586, 806359072, 452984805, 250868733, 1842533055, 1288555905, 336333848, 890442534, 804056259, -513843266, -1567123659, -867941240, 957814574, 1472513171, -223893675, -2105639172, 1195195770, -1402706744, -413311558, 723065138, -1787595802, -1604296512, -1736343271, -783331426, 2145180835, 1713513028, 2116692564, -1416589253, -2088204277, -901364084, 703524551, -742868885, 1007948840, 2044649127, -497131844, 487262998, 1994120109, 1004593371, 1446130276, 1312438900, 503974420, -615954030, 168166924, 1814307912, -463709000, 1573044895, 1859376061, -273896381, -1503501628, -1466855111, -1533700815, 937747667, -1954973198, 854058965, 1137232011, 1496790894, -1217565222, -1936880383, 1691735473, -766620004, -525751991, -1267962664, -95005012, 133494003, 636152527, -1352309302, -1904575756, -374428089, 403179536, -709182865, -2005370640, 1864705354, 1915629148, 605822008, -240736681, -944458637, 1371981463, 602466507, 2094914977, -1670089496, 555687742, -582268010, -591544991, -2037675251, -2054518257, -1871679264, 1111375484, -994724495, -1436129588, -666351472, 84083462, 32962295, 302911004, -1553899070, 1597322602, -111716434, -793134743, -1853454825, 1489093017, 656219450, -1180787161, 954327513, 335083755, -1281845205, 856756514, -1150719534, 1893325225, -1987146233, -1483434957, -1231316179, 572399164, -1836611819, 552200649, 1238290055, -11184726, 2015897680, 2061492133, -1886614525, -123625127, -2138470135, 386731290, -624967835, 837215959, -968736124, -1201116976, -1019133566, -1332111063, 1999449434, 286199582, -877612933, -61582168, -692339859, 974525996};
    private static final int[] Tinv0 = {1353184337, 1399144830, -1012656358, -1772214470, -882136261, -247096033, -1420232020, -1828461749, 1442459680, -160598355, -1854485368, 625738485, -52959921, -674551099, -2143013594, -1885117771, 1230680542, 1729870373, -1743852987, -507445667, 41234371, 317738113, -1550367091, -956705941, -413167869, -1784901099, -344298049, -631680363, 763608788, -752782248, 694804553, 1154009486, 1787413109, 2021232372, 1799248025, -579749593, -1236278850, 397248752, 1722556617, -1271214467, 407560035, -2110711067, 1613975959, 1165972322, -529046351, -2068943941, 480281086, -1809118983, 1483229296, 436028815, -2022908268, -1208452270, 601060267, -503166094, 1468997603, 715871590, 120122290, 63092015, -1703164538, -1526188077, -226023376, -1297760477, -1167457534, 1552029421, 723308426, -1833666137, -252573709, -1578997426, -839591323, -708967162, 526529745, -1963022652, -1655493068, -1604979806, 853641733, 1978398372, 971801355, -1427152832, 111112542, 1360031421, -108388034, 1023860118, -1375387939, 1186850381, -1249028975, 90031217, 1876166148, -15380384, 620468249, -1746289194, -868007799, 2006899047, -1119688528, -2004121337, 945494503, -605108103, 1191869601, -384875908, -920746760, 0, -2088337399, 1223502642, -1401941730, 1316117100, -67170563, 1446544655, 517320253, 658058550, 1691946762, 564550760, -783000677, 976107044, -1318647284, 266819475, -761860428, -1634624741, 1338359936, -1574904735, 1766553434, 370807324, 179999714, -450191168, 1138762300, 488053522, 185403662, -1379431438, -1180125651, -928440812, -2061897385, 1275557295, -1143105042, -44007517, -1624899081, -1124765092, -985962940, 880737115, 1982415755, -590994485, 1761406390, 1676797112, -891538985, 277177154, 1076008723, 538035844, 2099530373, -130171950, 288553390, 1839278535, 1261411869, -214912292, -330136051, -790380169, 1813426987, -1715900247, -95906799, 577038663, -997393240, 440397984, -668172970, -275762398, -951170681, -1043253031, -22885748, 906744984, -813566554, 685669029, 646887386, -1530942145, -459458004, 227702864, -1681105046, 1648787028, -1038905866, -390539120, 1593260334, -173030526, -1098883681, 2090061929, -1456614033, -1290656305, 999926984, -1484974064, 1852021992, 2075868123, 158869197, -199730834, 28809964, -1466282109, 1701746150, 2129067946, 147831841, -420997649, -644094022, -835293366, -737566742, -696471511, -1347247055, 824393514, 815048134, -1067015627, 935087732, -1496677636, -1328508704, 366520115, 1251476721, -136647615, 240176511, 804688151, -1915335306, 1303441219, 1414376140, -553347356, -474623586, 461924940, -1205916479, 2136040774, 82468509, 1563790337, 1937016826, 776014843, 1511876531, 1389550482, 861278441, 323475053, -1939744870, 2047648055, -1911228327, -1992551445, -299390514, 902390199, -303751967, 1018251130, 1507840668, 1064563285, 2043548696, -1086863501, -355600557, 1537932639, 342834655, -2032450440, -2114736182, 1053059257, 741614648, 1598071746, 1925389590, 203809468, -1958134744, 1100287487, 1895934009, -558691320, -1662733096, -1866377628, 1636092795, 1890988757, 1952214088, 1113045200};

    private static int FFmulX(int i10) {
        return (((i10 & f61567m1) >>> 7) * 27) ^ ((f61568m2 & i10) << 1);
    }

    private static int FFmulX2(int i10) {
        int i11 = (f61571m5 & i10) << 2;
        int i12 = i10 & f61570m4;
        int i13 = i12 ^ (i12 >>> 1);
        return (i13 >>> 5) ^ (i11 ^ (i13 >>> 2));
    }

    private void decryptBlock(int[][] iArr) {
        int i10 = this.f61572C0;
        int i11 = this.ROUNDS;
        int[] iArr2 = iArr[i11];
        char c10 = 0;
        int i12 = i10 ^ iArr2[0];
        int i13 = 1;
        int i14 = this.f61573C1 ^ iArr2[1];
        char c11 = 2;
        int i15 = this.f61574C2 ^ iArr2[2];
        int i16 = i11 - 1;
        int i17 = iArr2[3] ^ this.f61575C3;
        while (i16 > i13) {
            int[] iArr3 = Tinv0;
            int shift = (((iArr3[i12 & 255] ^ shift(iArr3[(i17 >> 8) & 255], 24)) ^ shift(iArr3[(i15 >> 16) & 255], 16)) ^ shift(iArr3[(i14 >> 24) & 255], 8)) ^ iArr[i16][c10];
            char c12 = c10;
            int shift2 = (((shift(iArr3[(i12 >> 8) & 255], 24) ^ iArr3[i14 & 255]) ^ shift(iArr3[(i17 >> 16) & 255], 16)) ^ shift(iArr3[(i15 >> 24) & 255], 8)) ^ iArr[i16][i13];
            int i18 = i13;
            int shift3 = (((shift(iArr3[(i14 >> 8) & 255], 24) ^ iArr3[i15 & 255]) ^ shift(iArr3[(i12 >> 16) & 255], 16)) ^ shift(iArr3[(i17 >> 24) & 255], 8)) ^ iArr[i16][c11];
            int shift4 = shift(iArr3[(i12 >> 24) & 255], 8) ^ ((iArr3[i17 & 255] ^ shift(iArr3[(i15 >> 8) & 255], 24)) ^ shift(iArr3[(i14 >> 16) & 255], 16));
            int i19 = i16 - 1;
            int i20 = shift4 ^ iArr[i16][3];
            int shift5 = (((iArr3[shift & 255] ^ shift(iArr3[(i20 >> 8) & 255], 24)) ^ shift(iArr3[(shift3 >> 16) & 255], 16)) ^ shift(iArr3[(shift2 >> 24) & 255], 8)) ^ iArr[i19][c12];
            int shift6 = (((iArr3[shift2 & 255] ^ shift(iArr3[(shift >> 8) & 255], 24)) ^ shift(iArr3[(i20 >> 16) & 255], 16)) ^ shift(iArr3[(shift3 >> 24) & 255], 8)) ^ iArr[i19][i18];
            char c13 = c11;
            int shift7 = (((shift(iArr3[(shift2 >> 8) & 255], 24) ^ iArr3[shift3 & 255]) ^ shift(iArr3[(shift >> 16) & 255], 16)) ^ shift(iArr3[(i20 >> 24) & 255], 8)) ^ iArr[i19][c13];
            i16 -= 2;
            i17 = iArr[i19][3] ^ (((iArr3[i20 & 255] ^ shift(iArr3[(shift3 >> 8) & 255], 24)) ^ shift(iArr3[(shift2 >> 16) & 255], 16)) ^ shift(iArr3[(shift >> 24) & 255], 8));
            i12 = shift5;
            i14 = shift6;
            i15 = shift7;
            c10 = c12;
            i13 = i18;
            c11 = c13;
        }
        char c14 = c10;
        int i21 = i13;
        char c15 = c11;
        int[] iArr4 = Tinv0;
        int shift8 = (((iArr4[i12 & 255] ^ shift(iArr4[(i17 >> 8) & 255], 24)) ^ shift(iArr4[(i15 >> 16) & 255], 16)) ^ shift(iArr4[(i14 >> 24) & 255], 8)) ^ iArr[i16][c14];
        int shift9 = (((iArr4[i14 & 255] ^ shift(iArr4[(i12 >> 8) & 255], 24)) ^ shift(iArr4[(i17 >> 16) & 255], 16)) ^ shift(iArr4[(i15 >> 24) & 255], 8)) ^ iArr[i16][i21];
        int shift10 = (((iArr4[i15 & 255] ^ shift(iArr4[(i14 >> 8) & 255], 24)) ^ shift(iArr4[(i12 >> 16) & 255], 16)) ^ shift(iArr4[(i17 >> 24) & 255], 8)) ^ iArr[i16][c15];
        int shift11 = (shift(iArr4[(i12 >> 24) & 255], 8) ^ ((iArr4[i17 & 255] ^ shift(iArr4[(i15 >> 8) & 255], 24)) ^ shift(iArr4[(i14 >> 16) & 255], 16))) ^ iArr[i16][3];
        byte[] bArr = f61565Si;
        int i22 = bArr[shift8 & 255] & UByte.MAX_VALUE;
        byte[] bArr2 = this.f61576s;
        int i23 = ((i22 ^ ((bArr2[(shift11 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr2[(shift10 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(shift9 >> 24) & 255] << 24);
        int[] iArr5 = iArr[c14];
        this.f61572C0 = i23 ^ iArr5[c14];
        this.f61573C1 = ((((bArr2[shift9 & 255] & UByte.MAX_VALUE) ^ ((bArr2[(shift8 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(shift11 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr2[(shift10 >> 24) & 255] << 24)) ^ iArr5[i21];
        this.f61574C2 = ((((bArr2[shift10 & 255] & UByte.MAX_VALUE) ^ ((bArr[(shift9 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(shift8 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr2[(shift11 >> 24) & 255] << 24)) ^ iArr5[c15];
        this.f61575C3 = ((((bArr[shift11 & 255] & UByte.MAX_VALUE) ^ ((bArr2[(shift10 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr2[(shift9 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr2[(shift8 >> 24) & 255] << 24)) ^ iArr5[3];
    }

    private void encryptBlock(int[][] iArr) {
        int i10 = this.f61572C0;
        char c10 = 0;
        int[] iArr2 = iArr[0];
        int i11 = i10 ^ iArr2[0];
        int i12 = 1;
        int i13 = this.f61573C1 ^ iArr2[1];
        char c11 = 2;
        int i14 = this.f61574C2 ^ iArr2[2];
        int i15 = iArr2[3] ^ this.f61575C3;
        int i16 = 1;
        while (i16 < this.ROUNDS - i12) {
            int[] iArr3 = f61566T0;
            int shift = (((iArr3[i11 & 255] ^ shift(iArr3[(i13 >> 8) & 255], 24)) ^ shift(iArr3[(i14 >> 16) & 255], 16)) ^ shift(iArr3[(i15 >> 24) & 255], 8)) ^ iArr[i16][c10];
            char c12 = c10;
            int shift2 = (((shift(iArr3[(i14 >> 8) & 255], 24) ^ iArr3[i13 & 255]) ^ shift(iArr3[(i15 >> 16) & 255], 16)) ^ shift(iArr3[(i11 >> 24) & 255], 8)) ^ iArr[i16][i12];
            int i17 = i12;
            int shift3 = (((shift(iArr3[(i15 >> 8) & 255], 24) ^ iArr3[i14 & 255]) ^ shift(iArr3[(i11 >> 16) & 255], 16)) ^ shift(iArr3[(i13 >> 24) & 255], 8)) ^ iArr[i16][c11];
            int shift4 = ((shift(iArr3[(i11 >> 8) & 255], 24) ^ iArr3[i15 & 255]) ^ shift(iArr3[(i13 >> 16) & 255], 16)) ^ shift(iArr3[(i14 >> 24) & 255], 8);
            int i18 = i16 + 1;
            int i19 = shift4 ^ iArr[i16][3];
            int shift5 = (((iArr3[shift & 255] ^ shift(iArr3[(shift2 >> 8) & 255], 24)) ^ shift(iArr3[(shift3 >> 16) & 255], 16)) ^ shift(iArr3[(i19 >> 24) & 255], 8)) ^ iArr[i18][c12];
            int shift6 = (((iArr3[shift2 & 255] ^ shift(iArr3[(shift3 >> 8) & 255], 24)) ^ shift(iArr3[(i19 >> 16) & 255], 16)) ^ shift(iArr3[(shift >> 24) & 255], 8)) ^ iArr[i18][i17];
            char c13 = c11;
            int shift7 = (((shift(iArr3[(i19 >> 8) & 255], 24) ^ iArr3[shift3 & 255]) ^ shift(iArr3[(shift >> 16) & 255], 16)) ^ shift(iArr3[(shift2 >> 24) & 255], 8)) ^ iArr[i18][c13];
            i16 += 2;
            i15 = (((iArr3[i19 & 255] ^ shift(iArr3[(shift >> 8) & 255], 24)) ^ shift(iArr3[(shift2 >> 16) & 255], 16)) ^ shift(iArr3[(shift3 >> 24) & 255], 8)) ^ iArr[i18][3];
            i11 = shift5;
            i13 = shift6;
            i14 = shift7;
            c10 = c12;
            i12 = i17;
            c11 = c13;
        }
        char c14 = c10;
        int i20 = i12;
        char c15 = c11;
        int[] iArr4 = f61566T0;
        int shift8 = (((iArr4[i11 & 255] ^ shift(iArr4[(i13 >> 8) & 255], 24)) ^ shift(iArr4[(i14 >> 16) & 255], 16)) ^ shift(iArr4[(i15 >> 24) & 255], 8)) ^ iArr[i16][c14];
        int shift9 = (((iArr4[i13 & 255] ^ shift(iArr4[(i14 >> 8) & 255], 24)) ^ shift(iArr4[(i15 >> 16) & 255], 16)) ^ shift(iArr4[(i11 >> 24) & 255], 8)) ^ iArr[i16][i20];
        int shift10 = (((iArr4[i14 & 255] ^ shift(iArr4[(i15 >> 8) & 255], 24)) ^ shift(iArr4[(i11 >> 16) & 255], 16)) ^ shift(iArr4[(i13 >> 24) & 255], 8)) ^ iArr[i16][c15];
        int shift11 = (((shift(iArr4[(i11 >> 8) & 255], 24) ^ iArr4[i15 & 255]) ^ shift(iArr4[(i13 >> 16) & 255], 16)) ^ shift(iArr4[(i14 >> 24) & 255], 8)) ^ iArr[i16][3];
        byte[] bArr = f61564S;
        int i21 = (bArr[shift8 & 255] & UByte.MAX_VALUE) ^ ((bArr[(shift9 >> 8) & 255] & UByte.MAX_VALUE) << 8);
        byte[] bArr2 = this.f61576s;
        int i22 = (i21 ^ ((bArr2[(shift10 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr2[(shift11 >> 24) & 255] << 24);
        int[] iArr5 = iArr[i16 + 1];
        this.f61572C0 = i22 ^ iArr5[c14];
        this.f61573C1 = ((((bArr2[shift9 & 255] & UByte.MAX_VALUE) ^ ((bArr[(shift10 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(shift11 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr2[(shift8 >> 24) & 255] << 24)) ^ iArr5[i20];
        this.f61574C2 = ((((bArr2[shift10 & 255] & UByte.MAX_VALUE) ^ ((bArr[(shift11 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(shift8 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(shift9 >> 24) & 255] << 24)) ^ iArr5[c15];
        this.f61575C3 = ((((bArr2[shift11 & 255] & UByte.MAX_VALUE) ^ ((bArr2[(shift8 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr2[(shift9 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(shift10 >> 24) & 255] << 24)) ^ iArr5[3];
    }

    private int[][] generateWorkingKey(byte[] bArr, boolean z10) {
        int i10;
        int length = bArr.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i11 = length >>> 2;
        this.ROUNDS = i11 + 6;
        int i12 = 1;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i11 + 7, 4);
        char c10 = 3;
        if (i11 == 4) {
            i10 = 1;
            int littleEndianToInt = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = littleEndianToInt;
            int littleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = littleEndianToInt2;
            int littleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = littleEndianToInt3;
            int littleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = littleEndianToInt4;
            for (int i13 = 1; i13 <= 10; i13++) {
                littleEndianToInt ^= subWord(shift(littleEndianToInt4, 8)) ^ rcon[i13 - 1];
                int[] iArr2 = iArr[i13];
                iArr2[0] = littleEndianToInt;
                littleEndianToInt2 ^= littleEndianToInt;
                iArr2[1] = littleEndianToInt2;
                littleEndianToInt3 ^= littleEndianToInt2;
                iArr2[2] = littleEndianToInt3;
                littleEndianToInt4 ^= littleEndianToInt3;
                iArr2[3] = littleEndianToInt4;
            }
        } else if (i11 == 6) {
            i10 = 1;
            int littleEndianToInt5 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = littleEndianToInt5;
            int littleEndianToInt6 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = littleEndianToInt6;
            int littleEndianToInt7 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = littleEndianToInt7;
            int littleEndianToInt8 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = littleEndianToInt8;
            int littleEndianToInt9 = Pack.littleEndianToInt(bArr, 16);
            int littleEndianToInt10 = Pack.littleEndianToInt(bArr, 20);
            int i14 = 1;
            int i15 = 1;
            while (true) {
                int[] iArr3 = iArr[i14];
                iArr3[0] = littleEndianToInt9;
                iArr3[1] = littleEndianToInt10;
                int subWord = littleEndianToInt5 ^ (subWord(shift(littleEndianToInt10, 8)) ^ i15);
                int[] iArr4 = iArr[i14];
                iArr4[2] = subWord;
                int i16 = littleEndianToInt6 ^ subWord;
                iArr4[3] = i16;
                int i17 = littleEndianToInt7 ^ i16;
                int[] iArr5 = iArr[i14 + 1];
                iArr5[0] = i17;
                int i18 = littleEndianToInt8 ^ i17;
                iArr5[1] = i18;
                int i19 = littleEndianToInt9 ^ i18;
                iArr5[2] = i19;
                int i20 = littleEndianToInt10 ^ i19;
                iArr5[3] = i20;
                int subWord2 = subWord(shift(i20, 8)) ^ (i15 << 1);
                i15 <<= 2;
                littleEndianToInt5 = subWord ^ subWord2;
                int[] iArr6 = iArr[i14 + 2];
                iArr6[0] = littleEndianToInt5;
                littleEndianToInt6 = i16 ^ littleEndianToInt5;
                iArr6[1] = littleEndianToInt6;
                littleEndianToInt7 = i17 ^ littleEndianToInt6;
                iArr6[2] = littleEndianToInt7;
                littleEndianToInt8 = i18 ^ littleEndianToInt7;
                iArr6[3] = littleEndianToInt8;
                i14 += 3;
                if (i14 >= 13) {
                    break;
                }
                littleEndianToInt9 = i19 ^ littleEndianToInt8;
                littleEndianToInt10 = i20 ^ littleEndianToInt9;
            }
        } else {
            if (i11 != 8) {
                throw new IllegalStateException("Should never get here");
            }
            int littleEndianToInt11 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = littleEndianToInt11;
            int littleEndianToInt12 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = littleEndianToInt12;
            int littleEndianToInt13 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = littleEndianToInt13;
            int littleEndianToInt14 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = littleEndianToInt14;
            int littleEndianToInt15 = Pack.littleEndianToInt(bArr, 16);
            iArr[1][0] = littleEndianToInt15;
            int littleEndianToInt16 = Pack.littleEndianToInt(bArr, 20);
            iArr[1][1] = littleEndianToInt16;
            int littleEndianToInt17 = Pack.littleEndianToInt(bArr, 24);
            iArr[1][2] = littleEndianToInt17;
            int littleEndianToInt18 = Pack.littleEndianToInt(bArr, 28);
            iArr[1][3] = littleEndianToInt18;
            int i21 = 1;
            int i22 = 2;
            while (true) {
                int subWord3 = subWord(shift(littleEndianToInt18, 8)) ^ i21;
                i21 <<= i12;
                littleEndianToInt11 ^= subWord3;
                int[] iArr7 = iArr[i22];
                iArr7[0] = littleEndianToInt11;
                littleEndianToInt12 ^= littleEndianToInt11;
                iArr7[i12] = littleEndianToInt12;
                littleEndianToInt13 ^= littleEndianToInt12;
                iArr7[2] = littleEndianToInt13;
                littleEndianToInt14 ^= littleEndianToInt13;
                iArr7[c10] = littleEndianToInt14;
                i10 = i12;
                int i23 = i22 + 1;
                char c11 = c10;
                if (i23 >= 15) {
                    break;
                }
                littleEndianToInt15 ^= subWord(littleEndianToInt14);
                int[] iArr8 = iArr[i23];
                iArr8[0] = littleEndianToInt15;
                littleEndianToInt16 ^= littleEndianToInt15;
                iArr8[i10] = littleEndianToInt16;
                littleEndianToInt17 ^= littleEndianToInt16;
                iArr8[2] = littleEndianToInt17;
                littleEndianToInt18 ^= littleEndianToInt17;
                iArr8[c11] = littleEndianToInt18;
                i22 += 2;
                i12 = i10;
                c10 = c11;
            }
        }
        if (!z10) {
            for (int i24 = i10; i24 < this.ROUNDS; i24++) {
                for (int i25 = 0; i25 < 4; i25++) {
                    int[] iArr9 = iArr[i24];
                    iArr9[i25] = inv_mcol(iArr9[i25]);
                }
            }
        }
        return iArr;
    }

    private static int inv_mcol(int i10) {
        int shift = shift(i10, 8) ^ i10;
        int FFmulX = i10 ^ FFmulX(shift);
        int FFmulX2 = shift ^ FFmulX2(FFmulX);
        return FFmulX ^ (FFmulX2 ^ shift(FFmulX2, 16));
    }

    private void packBlock(byte[] bArr, int i10) {
        int i11 = this.f61572C0;
        bArr[i10] = (byte) i11;
        bArr[i10 + 1] = (byte) (i11 >> 8);
        bArr[i10 + 2] = (byte) (i11 >> 16);
        bArr[i10 + 3] = (byte) (i11 >> 24);
        int i12 = this.f61573C1;
        bArr[i10 + 4] = (byte) i12;
        bArr[i10 + 5] = (byte) (i12 >> 8);
        bArr[i10 + 6] = (byte) (i12 >> 16);
        bArr[i10 + 7] = (byte) (i12 >> 24);
        int i13 = this.f61574C2;
        bArr[i10 + 8] = (byte) i13;
        bArr[i10 + 9] = (byte) (i13 >> 8);
        bArr[i10 + 10] = (byte) (i13 >> 16);
        bArr[i10 + 11] = (byte) (i13 >> 24);
        int i14 = this.f61575C3;
        bArr[i10 + 12] = (byte) i14;
        bArr[i10 + 13] = (byte) (i14 >> 8);
        bArr[i10 + 14] = (byte) (i14 >> 16);
        bArr[i10 + 15] = (byte) (i14 >> 24);
    }

    private static int shift(int i10, int i11) {
        return (i10 << (-i11)) | (i10 >>> i11);
    }

    private static int subWord(int i10) {
        byte[] bArr = f61564S;
        return (bArr[(i10 >> 24) & 255] << 24) | (bArr[i10 & 255] & UByte.MAX_VALUE) | ((bArr[(i10 >> 8) & 255] & UByte.MAX_VALUE) << 8) | ((bArr[(i10 >> 16) & 255] & UByte.MAX_VALUE) << 16);
    }

    private void unpackBlock(byte[] bArr, int i10) {
        int i11 = bArr[i10] & UByte.MAX_VALUE;
        this.f61572C0 = i11;
        int i12 = ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | i11;
        this.f61572C0 = i12;
        int i13 = i12 | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
        this.f61572C0 = i13;
        this.f61572C0 = i13 | (bArr[i10 + 3] << 24);
        int i14 = bArr[i10 + 4] & UByte.MAX_VALUE;
        this.f61573C1 = i14;
        int i15 = ((bArr[i10 + 5] & UByte.MAX_VALUE) << 8) | i14;
        this.f61573C1 = i15;
        int i16 = i15 | ((bArr[i10 + 6] & UByte.MAX_VALUE) << 16);
        this.f61573C1 = i16;
        this.f61573C1 = i16 | (bArr[i10 + 7] << 24);
        int i17 = bArr[i10 + 8] & UByte.MAX_VALUE;
        this.f61574C2 = i17;
        int i18 = ((bArr[i10 + 9] & UByte.MAX_VALUE) << 8) | i17;
        this.f61574C2 = i18;
        int i19 = i18 | ((bArr[i10 + 10] & UByte.MAX_VALUE) << 16);
        this.f61574C2 = i19;
        this.f61574C2 = i19 | (bArr[i10 + 11] << 24);
        int i20 = bArr[i10 + 12] & UByte.MAX_VALUE;
        this.f61575C3 = i20;
        int i21 = ((bArr[i10 + 13] & UByte.MAX_VALUE) << 8) | i20;
        this.f61575C3 = i21;
        int i22 = i21 | ((bArr[i10 + 14] & UByte.MAX_VALUE) << 16);
        this.f61575C3 = i22;
        this.f61575C3 = (bArr[i10 + 15] << 24) | i22;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "AES";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to AES init - " + cipherParameters.getClass().getName());
        }
        this.WorkingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey(), z10);
        this.forEncryption = z10;
        if (z10) {
            this.f61576s = Arrays.clone(f61564S);
        } else {
            this.f61576s = Arrays.clone(f61565Si);
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.WorkingKey == null) {
            throw new IllegalStateException("AES engine not initialised");
        }
        if (i10 + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        boolean z10 = this.forEncryption;
        unpackBlock(bArr, i10);
        int[][] iArr = this.WorkingKey;
        if (z10) {
            encryptBlock(iArr);
        } else {
            decryptBlock(iArr);
        }
        packBlock(bArr2, i11);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
