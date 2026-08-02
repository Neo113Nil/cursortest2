package com.appsflyer.internal;

import android.os.Process;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.C;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC2423fe;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.vungle.ads.internal.protos.Sdk;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.zip.ZipFile;

/* loaded from: classes8.dex */
public class AFa1gSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    public static final Map AFKeystoreWrapper;
    private static int afDebugLog;
    private static long afErrorLog;
    private static long afInfoLog;
    private static byte afLogForce;
    private static Object d;
    public static final Map e;
    private static int force;
    private static Object i;
    private static byte[] unregisterClient;
    private static long v;
    private static byte[] w;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0031 -> B:4:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i2, byte b) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = $13;
        int i7 = i6 + 47;
        $12 = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i2 + 4;
        int i10 = s + 33;
        int i11 = 49 - b;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i11];
        if (bArr == null) {
            int i12 = i6 + 19;
            $12 = i12 % 128;
            int i13 = i12 % 2;
            int i14 = i11;
            i4 = 0;
            i10 = (i10 + (-i14)) - 3;
            i9++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i10;
            if (i4 == i11) {
                return new String(bArr2, 0);
            }
            i14 = bArr[i9];
            i10 = (i10 + (-i14)) - 3;
            i9++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i10;
            if (i4 == i11) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i10;
            if (i4 == i11) {
            }
        }
    }

    static void init$0() {
        int i2 = 2 % 2;
        int i3 = $11;
        int i4 = ((i3 | 29) << 1) - (i3 ^ 29);
        $10 = i4 % 128;
        int i5 = i4 % 2;
        byte[] bArr = new byte[1172];
        System.arraycopy("oØ\u0098\u0013ð\u0007ï\u0000\u0003\u00023Äò\u000eî\u0005ü\u0003íBÇï\u000eç\u0013üó\u00044çÏ\u000eç\u0013üó\u0004\nï\u0001\u0000ó\u000e\u0013Ü\fû÷òøñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøâ-Ì\f\föõýñÿ<Êîýú\n÷ð\u0011ðð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001úë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þÿî+Úú\u0004ï,Øôÿî.Ñ\bü\u001fßûø\u0000\u001eØôÿî.ßûø\u0000\u001eØôÈ\u0000ê\u0010/È\u0000ê\u0010/\u0006è\u00120Â÷>åÚú\u0004\u0006è\u00120Â÷>·\u0004ú\tøô\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõÿî!Û\u0000ü\bðûøñ\bü\u0003ùÿûø\u0000ð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\föé\u0013ø÷ÿð\u0014â\u0006ò\f\u0012÷\u0013õ\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñôúù\u000b\u0012ú\u0010õËëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:Ê)Ð'\u0004ýÉ\u0000ýý+\u0000ûýÐ+Ï1ÿî\u001fêï\u0001÷\u0000\fû\u0006è\u00120½\u0006îCÖ\u0000\u0003ÿî!ìê\t\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñ\n\u0001ú\u001bÎ\u0006ýð\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ñìý\u000eå\u0013ñüôñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøØ7¹\u001f\föñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøâ-Ì\f\föõýÿî\u001fêì\u000eôö\r\u0005ÿö\n\u0001ú\u000bî\u001fê\u0001ú\u0012Þÿð\u0012ù\u0011õ\u0002\u0006ò\fÿî+ÿ\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú÷\b\b\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ú\u000bú\u001dÜêÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tüö\u0004î\fÿî.Ô\bëý$Ú\u000búüð\u0006è\u00120¶þ\bú;±\u000eö?Ñîö$Øûøþ\u001eÜÿ\n\u0001ñÿî#æê\u0001,Ô÷ÿö\u0006è\u00120¶þ\bú;±\u000eö?Ñîö(Ô÷ÿöÿî\u001eçì\u0012\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñ\u0002*Æ\u0002\f!Ìý\u000eå\u0006è\u00120Â÷>èÔúù\u000b\u0001üó\u0004\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþð\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüð\u0002\u000eî\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüð\fê\t\u0019àóü\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þÿî.Ñÿúþþ\u0006ô÷\u001dØ\u0006\b\u0012õ\u0015õú\u000bú\u001eÔ\bëýñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøâ-Ç\u0011\fö$¸Ëëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:öúÕû(\u0001ý\u0000Ë,üýþ\u0001úË\u00002\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïHø\u0002Ú\u000fêì\u000eôö\r\u001eàê\u0010".getBytes(C.ISO88591_NAME), 0, bArr, 0, 1172);
        $$a = bArr;
        $$b = 232;
        int i6 = $11;
        int i7 = ((i6 | 81) << 1) - (i6 ^ 81);
        $10 = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(47:7|8|(1:10)(1:817)|11|(2:12|13)|(33:15|16|(31:795|796|(29:791|792|(25:787|788|23|(1:25)(1:(1:777)(3:778|779|780))|26|(3:28|(3:30|31|32)|37)(6:758|759|760|761|762|763)|(3:40|41|42)|49|50|51|52|53|(1:55)(1:755)|56|(1:60)(1:754)|61|62|63|(1:65)(3:749|(1:751)|752)|66|(1:68)(1:748)|69|70|(5:74|(30:76|77|78|79|(7:81|(5:95|96|97|98|99)(1:83)|84|85|86|87|89)(1:739)|(10:102|103|104|105|106|107|108|(18:110|(1:112)(1:(1:256)(1:(1:258)(1:259)))|113|114|115|116|117|118|119|120|121|(2:123|(2:(3:126|127|128)(6:130|(1:132)(1:137)|133|134|135|136)|129)(3:138|139|140))|141|142|(4:144|145|146|147)(1:(4:158|159|160|161)(13:(4:169|170|171|172)(11:179|180|181|182|183|184|185|186|187|188|150)|728|223|224|(2:226|(3:229|230|231)(1:228))|235|236|(1:238)(1:250)|239|240|241|242|243))|148|149|150)|260|261)(1:729)|262|263|264|266|267|268|269|270|271|272|273|274|275|276|277|278|279|280|281|282|283|284|285|(19:286|287|288|289|(3:291|292|293)|306|307|308|309|310|311|312|(11:314|315|316|317|318|319|320|321|322|323|324)(5:653|654|655|656|657)|325|(36:327|328|(2:330|(1:332)(3:555|556|557))(1:558)|(1:334)(1:554)|335|336|337|338|339|340|341|(6:343|344|345|346|347|348)(1:541)|349|350|351|352|353|354|(2:356|(1:358)(1:359))|495|360|361|362|363|364|365|366|367|368|369|370|371|372|373|(2:375|(4:377|378|379|380)(3:387|388|389))|390)(25:559|560|561|562|563|564|565|(2:566|(2:568|(2:570|571)(2:572|573))(2:626|627))|574|575|576|577|578|579|580|581|582|583|584|585|(1:587)|588|589|590|(2:592|(2:594|595))(3:596|597|598))|391|392|(9:394|395|396|397|398|399|400|(1:402)|403)(3:460|461|462)|(13:405|(1:407)(1:443)|408|409|410|411|412|413|414|415|416|417|418)(1:444)))(1:742)|232|233|234)|744)|22|23|(0)(0)|26|(0)(0)|(3:40|41|42)|49|50|51|52|53|(0)(0)|56|(13:58|60|61|62|63|(0)(0)|66|(0)(0)|69|70|(6:72|74|(0)(0)|232|233|234)|745|746)|754|61|62|63|(0)(0)|66|(0)(0)|69|70|(0)|745|746)|20|(0)|22|23|(0)(0)|26|(0)(0)|(0)|49|50|51|52|53|(0)(0)|56|(0)|754|61|62|63|(0)(0)|66|(0)(0)|69|70|(0)|745|746)|18|(0)|20|(0)|22|23|(0)(0)|26|(0)(0)|(0)|49|50|51|52|53|(0)(0)|56|(0)|754|61|62|63|(0)(0)|66|(0)(0)|69|70|(0)|745|746)|799|800|801|802|803|804|805|806|807|16|(0)|18|(0)|20|(0)|22|23|(0)(0)|26|(0)(0)|(0)|49|50|51|52|53|(0)(0)|56|(0)|754|61|62|63|(0)(0)|66|(0)(0)|69|70|(0)|745|746) */
    /* JADX WARN: Can't wrap try/catch for region: R(48:6|7|8|(1:10)(1:817)|11|(2:12|13)|(33:15|16|(31:795|796|(29:791|792|(25:787|788|23|(1:25)(1:(1:777)(3:778|779|780))|26|(3:28|(3:30|31|32)|37)(6:758|759|760|761|762|763)|(3:40|41|42)|49|50|51|52|53|(1:55)(1:755)|56|(1:60)(1:754)|61|62|63|(1:65)(3:749|(1:751)|752)|66|(1:68)(1:748)|69|70|(5:74|(30:76|77|78|79|(7:81|(5:95|96|97|98|99)(1:83)|84|85|86|87|89)(1:739)|(10:102|103|104|105|106|107|108|(18:110|(1:112)(1:(1:256)(1:(1:258)(1:259)))|113|114|115|116|117|118|119|120|121|(2:123|(2:(3:126|127|128)(6:130|(1:132)(1:137)|133|134|135|136)|129)(3:138|139|140))|141|142|(4:144|145|146|147)(1:(4:158|159|160|161)(13:(4:169|170|171|172)(11:179|180|181|182|183|184|185|186|187|188|150)|728|223|224|(2:226|(3:229|230|231)(1:228))|235|236|(1:238)(1:250)|239|240|241|242|243))|148|149|150)|260|261)(1:729)|262|263|264|266|267|268|269|270|271|272|273|274|275|276|277|278|279|280|281|282|283|284|285|(19:286|287|288|289|(3:291|292|293)|306|307|308|309|310|311|312|(11:314|315|316|317|318|319|320|321|322|323|324)(5:653|654|655|656|657)|325|(36:327|328|(2:330|(1:332)(3:555|556|557))(1:558)|(1:334)(1:554)|335|336|337|338|339|340|341|(6:343|344|345|346|347|348)(1:541)|349|350|351|352|353|354|(2:356|(1:358)(1:359))|495|360|361|362|363|364|365|366|367|368|369|370|371|372|373|(2:375|(4:377|378|379|380)(3:387|388|389))|390)(25:559|560|561|562|563|564|565|(2:566|(2:568|(2:570|571)(2:572|573))(2:626|627))|574|575|576|577|578|579|580|581|582|583|584|585|(1:587)|588|589|590|(2:592|(2:594|595))(3:596|597|598))|391|392|(9:394|395|396|397|398|399|400|(1:402)|403)(3:460|461|462)|(13:405|(1:407)(1:443)|408|409|410|411|412|413|414|415|416|417|418)(1:444)))(1:742)|232|233|234)|744)|22|23|(0)(0)|26|(0)(0)|(3:40|41|42)|49|50|51|52|53|(0)(0)|56|(13:58|60|61|62|63|(0)(0)|66|(0)(0)|69|70|(6:72|74|(0)(0)|232|233|234)|745|746)|754|61|62|63|(0)(0)|66|(0)(0)|69|70|(0)|745|746)|20|(0)|22|23|(0)(0)|26|(0)(0)|(0)|49|50|51|52|53|(0)(0)|56|(0)|754|61|62|63|(0)(0)|66|(0)(0)|69|70|(0)|745|746)|18|(0)|20|(0)|22|23|(0)(0)|26|(0)(0)|(0)|49|50|51|52|53|(0)(0)|56|(0)|754|61|62|63|(0)(0)|66|(0)(0)|69|70|(0)|745|746)|799|800|801|802|803|804|805|806|807|16|(0)|18|(0)|20|(0)|22|23|(0)(0)|26|(0)(0)|(0)|49|50|51|52|53|(0)(0)|56|(0)|754|61|62|63|(0)(0)|66|(0)(0)|69|70|(0)|745|746) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0687, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName($$c(r13, (short) ((r13 & 144) | (r13 ^ 144)), (byte) (-r11[r23]))).getMethod($$c(r11[r19], (short) 304, r11[415(0x19f, float:5.82E-43)]), r8).invoke(r0, r8)).booleanValue() != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x1cc9, code lost:
    
        r0 = r41.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r0.setAccessible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x1ce2, code lost:
    
        if (r51 == true) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x1ce4, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x1ce7, code lost:
    
        com.appsflyer.internal.AFa1gSDK.i = r0.newInstance(r1, java.lang.Boolean.valueOf(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x1cf5, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x1cf8, code lost:
    
        r1 = r26;
        r2 = r52;
        r5 = null;
        r6 = 2;
        r14 = 1;
        r27 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x1ce6, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x1e38, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x0622, code lost:
    
        r12 = r27 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x0345, code lost:
    
        r19 = 19;
        r16 = 262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x034e, code lost:
    
        r21 = 743;
     */
    /* JADX WARN: Code restructure failed: missing block: B:814:0x0348, code lost:
    
        r19 = 19;
        r16 = 262;
        r17 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:226:0x1e90 A[Catch: Exception -> 0x1fd2, TryCatch #72 {Exception -> 0x1fd2, blocks: (B:8:0x024e, B:10:0x0265, B:32:0x0436, B:40:0x0513, B:45:0x0565, B:47:0x056b, B:48:0x056c, B:49:0x056d, B:52:0x05b8, B:62:0x05f9, B:66:0x0615, B:69:0x061f, B:74:0x062d, B:224:0x1e4d, B:226:0x1e90, B:230:0x1e94, B:234:0x1f8f, B:238:0x1f14, B:239:0x1f33, B:246:0x1f73, B:248:0x1f79, B:249:0x1f7a, B:250:0x1f26, B:758:0x0442, B:766:0x1fb8, B:768:0x1fbe, B:769:0x1fbf, B:772:0x1fc1, B:774:0x1fc7, B:775:0x1fc8, B:778:0x03d4, B:783:0x1fca, B:785:0x1fd0, B:786:0x1fd1, B:763:0x04ea, B:760:0x04ac, B:780:0x03fb, B:42:0x0524, B:242:0x1f3a, B:243:0x1f71), top: B:7:0x024e, inners: #15, #26, #30, #44, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x1f14 A[Catch: Exception -> 0x1fd2, TRY_ENTER, TryCatch #72 {Exception -> 0x1fd2, blocks: (B:8:0x024e, B:10:0x0265, B:32:0x0436, B:40:0x0513, B:45:0x0565, B:47:0x056b, B:48:0x056c, B:49:0x056d, B:52:0x05b8, B:62:0x05f9, B:66:0x0615, B:69:0x061f, B:74:0x062d, B:224:0x1e4d, B:226:0x1e90, B:230:0x1e94, B:234:0x1f8f, B:238:0x1f14, B:239:0x1f33, B:246:0x1f73, B:248:0x1f79, B:249:0x1f7a, B:250:0x1f26, B:758:0x0442, B:766:0x1fb8, B:768:0x1fbe, B:769:0x1fbf, B:772:0x1fc1, B:774:0x1fc7, B:775:0x1fc8, B:778:0x03d4, B:783:0x1fca, B:785:0x1fd0, B:786:0x1fd1, B:763:0x04ea, B:760:0x04ac, B:780:0x03fb, B:42:0x0524, B:242:0x1f3a, B:243:0x1f71), top: B:7:0x024e, inners: #15, #26, #30, #44, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x1f26 A[Catch: Exception -> 0x1fd2, TryCatch #72 {Exception -> 0x1fd2, blocks: (B:8:0x024e, B:10:0x0265, B:32:0x0436, B:40:0x0513, B:45:0x0565, B:47:0x056b, B:48:0x056c, B:49:0x056d, B:52:0x05b8, B:62:0x05f9, B:66:0x0615, B:69:0x061f, B:74:0x062d, B:224:0x1e4d, B:226:0x1e90, B:230:0x1e94, B:234:0x1f8f, B:238:0x1f14, B:239:0x1f33, B:246:0x1f73, B:248:0x1f79, B:249:0x1f7a, B:250:0x1f26, B:758:0x0442, B:766:0x1fb8, B:768:0x1fbe, B:769:0x1fbf, B:772:0x1fc1, B:774:0x1fc7, B:775:0x1fc8, B:778:0x03d4, B:783:0x1fca, B:785:0x1fd0, B:786:0x1fd1, B:763:0x04ea, B:760:0x04ac, B:780:0x03fb, B:42:0x0524, B:242:0x1f3a, B:243:0x1f71), top: B:7:0x024e, inners: #15, #26, #30, #44, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0511 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:742:0x1f7b  */
    /* JADX WARN: Removed duplicated region for block: B:748:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:749:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:755:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x0442 A[Catch: Exception -> 0x1fd2, TRY_ENTER, TRY_LEAVE, TryCatch #72 {Exception -> 0x1fd2, blocks: (B:8:0x024e, B:10:0x0265, B:32:0x0436, B:40:0x0513, B:45:0x0565, B:47:0x056b, B:48:0x056c, B:49:0x056d, B:52:0x05b8, B:62:0x05f9, B:66:0x0615, B:69:0x061f, B:74:0x062d, B:224:0x1e4d, B:226:0x1e90, B:230:0x1e94, B:234:0x1f8f, B:238:0x1f14, B:239:0x1f33, B:246:0x1f73, B:248:0x1f79, B:249:0x1f7a, B:250:0x1f26, B:758:0x0442, B:766:0x1fb8, B:768:0x1fbe, B:769:0x1fbf, B:772:0x1fc1, B:774:0x1fc7, B:775:0x1fc8, B:778:0x03d4, B:783:0x1fca, B:785:0x1fd0, B:786:0x1fd1, B:763:0x04ea, B:760:0x04ac, B:780:0x03fb, B:42:0x0524, B:242:0x1f3a, B:243:0x1f71), top: B:7:0x024e, inners: #15, #26, #30, #44, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:776:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:787:0x03a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:791:0x037b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:795:0x0356 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v101, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v136, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v123, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r10v174, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r10v177, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r10v91, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r11v130, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r11v172, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r12v83, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r15v54, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r15v73, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r1v116, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v263, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v285, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v302, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v312, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v323, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v95, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r27v24 */
    /* JADX WARN: Type inference failed for: r27v62 */
    /* JADX WARN: Type inference failed for: r27v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v205, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r2v210, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v92, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r35v11, types: [long] */
    /* JADX WARN: Type inference failed for: r35v12 */
    /* JADX WARN: Type inference failed for: r35v13 */
    /* JADX WARN: Type inference failed for: r35v15 */
    /* JADX WARN: Type inference failed for: r35v16 */
    /* JADX WARN: Type inference failed for: r35v17 */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r35v3 */
    /* JADX WARN: Type inference failed for: r35v4 */
    /* JADX WARN: Type inference failed for: r35v5 */
    /* JADX WARN: Type inference failed for: r35v6 */
    /* JADX WARN: Type inference failed for: r35v7 */
    /* JADX WARN: Type inference failed for: r35v8 */
    /* JADX WARN: Type inference failed for: r36v0, types: [java.lang.Class[], java.lang.Object, java.lang.Object[], java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v163, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v75, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r43v19 */
    /* JADX WARN: Type inference failed for: r4v129, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v130, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r6v107, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r6v145, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r6v70, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v151, types: [java.lang.Class] */
    static {
        String str;
        Object obj;
        String str2;
        char c;
        char c2;
        char c3;
        Object invoke;
        Object invoke2;
        Object invoke3;
        char c4;
        int i2;
        char c5;
        char c6;
        boolean z;
        Object[] objArr;
        int i3;
        boolean[] zArr;
        boolean[] zArr2;
        boolean[] zArr3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        ?? r35;
        int i7;
        boolean[] zArr4;
        Object[] objArr2;
        Class<?>[] clsArr;
        boolean[] zArr5;
        boolean[] zArr6;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z3;
        int i13;
        int i14;
        int i15;
        int i16;
        byte b;
        short s;
        byte b2;
        boolean z4;
        Object obj2;
        boolean z5;
        int i17;
        int i18;
        int i19;
        Class<?>[] clsArr2;
        Class<?>[] clsArr3;
        Class<?>[] clsArr4;
        Class<?>[] clsArr5;
        Throwable th;
        boolean z6;
        int i20;
        Class cls;
        Class<?>[] clsArr6;
        Object invoke4;
        Class<?>[] clsArr7;
        short s2;
        byte b3;
        String str3;
        int i21;
        Object newInstance;
        byte b4;
        Class cls2;
        boolean z7;
        Class<?>[] clsArr8;
        byte b5;
        byte[] bArr;
        boolean[] zArr7;
        ?? r43;
        String sb;
        Random random;
        int i22;
        int i23;
        int i24;
        boolean z8;
        Class<byte[]> cls3 = byte[].class;
        init$0();
        int i25 = 2;
        try {
            int i26 = 7;
            int i27 = 1;
            byte[] bArr2 = $$a;
            Class<?> cls4 = Class.forName($$c(bArr2[62], bArr2[7], bArr2[1161]));
            byte b6 = bArr2[1152];
            int currentTimeMillis = (int) System.currentTimeMillis();
            int i28 = Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE + (b6 * (-317));
            int i29 = ~b6;
            int i30 = ~(((-2) ^ currentTimeMillis) | ((-2) & currentTimeMillis));
            int i31 = ((i30 & i29) | (i29 ^ i30)) * (-318);
            int i32 = (i28 ^ i31) + ((i28 & i31) << 1);
            int i33 = ~((i29 & currentTimeMillis) | (i29 ^ currentTimeMillis));
            int i34 = (~currentTimeMillis) | 1;
            int i35 = (i32 - (~((i33 | (~((i34 & b6) | (i34 ^ b6)))) * 318))) - 1;
            int i36 = (~b6) | (~currentTimeMillis);
            int i37 = (b6 & 1) | (b6 ^ 1);
            int i38 = ((~((i37 & currentTimeMillis) | (i37 ^ currentTimeMillis))) | (~((i36 & 1) | (i36 ^ 1)))) * 318;
            Method method = cls4.getMethod($$c((byte) (((i35 | i38) << 1) - (i38 ^ i35)), bArr2[262], bArr2[778]), Integer.TYPE, Integer.TYPE);
            Class<?>[] clsArr9 = null;
            int intValue = ((Integer) method.invoke(null, 22, 7)).intValue();
            int currentTimeMillis2 = (int) System.currentTimeMillis();
            int i39 = ~(((-1910590762) & currentTimeMillis2) | ((-1910590762) ^ currentTimeMillis2));
            int i40 = (i39 & 817907969) | (817907969 ^ i39);
            int i41 = ~(((-986381272) & currentTimeMillis2) | ((-986381272) ^ currentTimeMillis2));
            int i42 = ((i40 & i41) | (i40 ^ i41)) * (-880);
            int i43 = (1021786368 & i42) + (i42 | 1021786368);
            int i44 = ~currentTimeMillis2;
            int i45 = ~((i44 & (-1910590762)) | ((-1910590762) ^ i44));
            int i46 = (i45 & 986381271) | (986381271 ^ i45);
            int i47 = ~(currentTimeMillis2 | 1910590761);
            int i48 = i43 + (((i46 & i47) | (i46 ^ i47)) * (-880));
            int i49 = i47 * 880;
            int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
            int i51 = ((-2095017712) & intValue) | (intValue ^ (-2095017712)) | 5655178;
            int i52 = i51 * IronSourceError.ERROR_BN_RELOAD_SKIP_BACKGROUND;
            int currentTimeMillis3 = (int) System.currentTimeMillis();
            int i53 = (i51 * 465412) + (i50 * (-756));
            int i54 = ~currentTimeMillis3;
            int i55 = -(-(((i52 ^ i54) | (i52 & i54)) * (-757)));
            int i56 = (i53 & i55) + (i53 | i55);
            int i57 = ~i50;
            int i58 = (i57 & i52) | (i57 ^ i52);
            int i59 = i56 + ((~((i58 & currentTimeMillis3) | (i58 ^ currentTimeMillis3))) * 1514);
            int i60 = ~i52;
            int i61 = ~i50;
            int i62 = ~(i60 | i61);
            int i63 = ~((i61 ^ i54) | (i54 & i61));
            int i64 = (i62 & i63) | (i62 ^ i63);
            int i65 = (i50 & i52) | (i52 ^ i50);
            int i66 = ~((i65 & currentTimeMillis3) | (i65 ^ currentTimeMillis3));
            int i67 = i59 + (((i64 & i66) | (i64 ^ i66)) * 757);
            int i68 = ~intValue;
            int i69 = ~(1087851246 | i68);
            int i70 = (i69 & (-2095017712)) | (i69 ^ (-2095017712)) | (~(i68 | 1012821643));
            int i71 = i70 * (-1228);
            int currentTimeMillis4 = (int) System.currentTimeMillis();
            int i72 = i70 * 642244;
            int i73 = i67 * 263;
            int i74 = ((i72 | i73) << 1) - (i72 ^ i73);
            int i75 = ~i71;
            int i76 = ~((i75 & i67) | (i75 ^ i67));
            int i77 = ~i67;
            int i78 = i76 | (~(i77 | i71));
            int i79 = ~((i77 ^ currentTimeMillis4) | (i77 & currentTimeMillis4));
            int i80 = (i74 - (~(-(-(((i78 ^ i79) | (i78 & i79)) * 262))))) - 1;
            int i81 = -(-((~((i77 ^ i71) | (i77 & i71))) * (-786)));
            int i82 = (i80 ^ i81) + ((i80 & i81) << 1);
            int i83 = ~i67;
            int i84 = ~currentTimeMillis4;
            int i85 = ~((i84 & i83) | (i83 ^ i84));
            int i86 = ~(i67 | (~i71));
            int i87 = (i86 & i85) | (i85 ^ i86);
            int i88 = ~((i83 & i71) | (i83 ^ i71));
            int i89 = -(-(((i87 & i88) | (i87 ^ i88)) * 262));
            int i90 = (i82 & i89) + (i89 | i82);
            int i91 = ~(((-1007166466) & i68) | ((-1007166466) ^ i68));
            int i92 = ~intValue;
            int i93 = ~((i92 & (-1087851247)) | (i92 ^ (-1087851247)) | 1012821643);
            int i94 = (i93 & i91) | (i91 ^ i93);
            int i95 = i94 * IronSourceError.ERROR_BN_RELOAD_SKIP_BACKGROUND;
            int currentTimeMillis5 = (int) System.currentTimeMillis();
            int i96 = i94 * 607246;
            int i97 = -(-(i90 * (-987)));
            int i98 = (i96 ^ i97) + ((i96 & i97) << 1);
            int i99 = ~i90;
            int i100 = ~currentTimeMillis5;
            int i101 = i99 | i100;
            int i102 = ~((i101 & i95) | (i101 ^ i95));
            int i103 = i95 | i90;
            int i104 = ~((i103 ^ currentTimeMillis5) | (i103 & currentTimeMillis5));
            int i105 = ((i102 ^ i104) | (i102 & i104)) * 988;
            int i106 = ((i98 | i105) << 1) - (i98 ^ i105);
            int i107 = ((i99 & i95) | (i95 ^ i99)) * (-988);
            int i108 = (i106 ^ i107) + ((i107 & i106) << 1);
            int i109 = ~i95;
            int i110 = ~i90;
            int i111 = (~((i109 & i110) | (i109 ^ i110))) | (~((currentTimeMillis5 & i110) | (i110 ^ currentTimeMillis5)));
            int i112 = (i95 & i100) | (i100 ^ i95);
            int i113 = ~((i112 & i90) | (i112 ^ i90));
            if (i108 + (((i111 & i113) | (i111 ^ i113)) * 988) == 0) {
                return;
            }
            afErrorLog = 3800951577373773706L;
            afLogForce = Ascii.SI;
            AFKeystoreWrapper = new HashMap();
            e = new HashMap();
            try {
                String $$c = $$c(bArr2[19], bArr2[189], bArr2[214]);
                if (i == null) {
                    byte b7 = bArr2[19];
                    str = $$c(b7, (short) (b7 | Ascii.FF), bArr2[743]);
                } else {
                    str = null;
                }
                try {
                    byte b8 = bArr2[62];
                    Class<?> cls5 = Class.forName($$c(b8, (short) ((b8 ^ Ascii.SUB) | (b8 & Ascii.SUB)), (byte) (-bArr2[114])));
                    byte b9 = bArr2[19];
                    Method method2 = cls5.getMethod($$c(b9, (short) ((b9 ^ 49) | (b9 & 49)), bArr2[193]), new Class[0]);
                    obj = method2.invoke(null, null);
                } catch (Exception unused) {
                    obj = null;
                }
                if (obj != null) {
                    int i114 = $11;
                    int i115 = (i114 & 89) + (i114 | 89);
                    $10 = i115 % 128;
                    int i116 = i115 % 2;
                    c2 = 19;
                    c3 = 262;
                    str2 = $$c;
                    c = 743;
                    if (obj != null) {
                        try {
                            invoke = obj.getClass().getMethod($$c((byte) 70, (short) 173, $$a[150]), null).invoke(obj, null);
                        } catch (Exception unused2) {
                        }
                        if (obj != null) {
                            try {
                                invoke2 = obj.getClass().getMethod($$c((byte) 70, (short) 183, $$a[113]), null).invoke(obj, null);
                            } catch (Exception unused3) {
                            }
                            if (obj != null) {
                                try {
                                    invoke3 = obj.getClass().getMethod($$c((byte) 70, (short) 197, $$a[150]), null).invoke(obj, null);
                                } catch (Exception unused4) {
                                }
                                if (invoke == null) {
                                    c4 = 150;
                                } else if (str == null) {
                                    c4 = 150;
                                    invoke = null;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    byte[] bArr3 = $$a;
                                    byte b10 = bArr3[13];
                                    c4 = 150;
                                    try {
                                        Object[] objArr3 = {sb2.append($$c(b10, (short) ((b10 & 193) | (b10 ^ 193)), bArr3[150])).append(str).toString()};
                                        byte b11 = (byte) (-bArr3[239]);
                                        invoke = Class.forName($$c(b11, (short) ((b11 ^ 144) | (b11 & 144)), (byte) (-bArr3[106]))).getDeclaredConstructor(String.class).newInstance(objArr3);
                                    } catch (Throwable th2) {
                                        Throwable cause = th2.getCause();
                                        if (cause == null) {
                                            throw th2;
                                        }
                                        throw cause;
                                    }
                                }
                                i2 = 5;
                                if (invoke3 == null) {
                                    int i117 = $11;
                                    int i118 = ((i117 | 5) << 1) - (i117 ^ 5);
                                    $10 = i118 % 128;
                                    if (i118 % 2 != 0) {
                                        int i119 = 5 / 0;
                                    }
                                    z = false;
                                    c6 = 'j';
                                    c5 = 239;
                                } else {
                                    byte[] bArr4 = $$a;
                                    byte b12 = (byte) (-bArr4[239]);
                                    int i120 = $$b;
                                    c5 = 239;
                                    int currentTimeMillis6 = (int) System.currentTimeMillis();
                                    int i121 = i120 * 603;
                                    int i122 = (((-1208) | i121) << 1) - ((-1208) ^ i121);
                                    int i123 = ~currentTimeMillis6;
                                    c6 = 'j';
                                    int i124 = ((~(3 | i123)) | i120) * (-602);
                                    int i125 = (i122 & i124) + (i122 | i124);
                                    int i126 = ~i120;
                                    int i127 = ~((3 ^ i126) | (i126 & 3));
                                    z = false;
                                    int i128 = ~((3 ^ currentTimeMillis6) | (3 & currentTimeMillis6));
                                    int i129 = (i127 ^ i128) | (i128 & i127);
                                    int i130 = ~currentTimeMillis6;
                                    int i131 = ~((i130 & (-4)) | (i130 ^ (-4)) | i120);
                                    int i132 = -(-(((i129 & i131) | (i129 ^ i131)) * (-301)));
                                    int i133 = (i125 & i132) + (i125 | i132);
                                    int i134 = (~((i123 ^ i120) | (i123 & i120))) * 301;
                                    try {
                                        Object invoke5 = Class.forName($$c((byte) (-bArr4[239]), (short) 241, bArr4[c3])).getMethod($$c((byte) 70, (short) 256, bArr4[c4]), String.class).invoke(null, $$c(b12, (short) ((i133 & i134) + (i134 | i133)), bArr4[778]));
                                        int i135 = $11;
                                        int i136 = ((i135 | 63) << 1) - (i135 ^ 63);
                                        $10 = i136 % 128;
                                        int i137 = i136 % 2;
                                        try {
                                            byte b13 = (byte) (-bArr4[239]);
                                            invoke3 = Class.forName($$c(b13, (short) (b13 | 144), (byte) (-bArr4[106]))).getDeclaredConstructor(String.class).newInstance(invoke5);
                                        } catch (Throwable th3) {
                                            Throwable cause2 = th3.getCause();
                                            if (cause2 == null) {
                                                throw th3;
                                            }
                                            throw cause2;
                                        }
                                    } catch (Throwable th4) {
                                        Throwable cause3 = th4.getCause();
                                        if (cause3 == null) {
                                            throw th4;
                                        }
                                        throw cause3;
                                    }
                                }
                                if (invoke2 == null && invoke != null) {
                                    byte[] bArr5 = $$a;
                                    try {
                                        Object[] objArr4 = new Object[2];
                                        objArr4[1] = $$c(bArr5[c2], (short) 266, bArr5[417]);
                                        objArr4[z ? 1 : 0] = invoke;
                                        byte b14 = (byte) (-bArr5[c5]);
                                        Class<?> cls6 = Class.forName($$c(b14, (short) ((b14 ^ 144) | (b14 & 144)), (byte) (-bArr5[c6])));
                                        Class<?>[] clsArr10 = new Class[2];
                                        byte b15 = (byte) (-bArr5[c5]);
                                        clsArr10[z ? 1 : 0] = Class.forName($$c(b15, (short) (b15 | 144), (byte) (-bArr5[c6])));
                                        clsArr10[1] = String.class;
                                        invoke2 = cls6.getDeclaredConstructor(clsArr10).newInstance(objArr4);
                                    } catch (Throwable th5) {
                                        Throwable cause4 = th5.getCause();
                                        if (cause4 == null) {
                                            throw th5;
                                        }
                                        throw cause4;
                                    }
                                }
                                byte[] bArr6 = $$a;
                                byte b16 = (byte) (-bArr6[c5]);
                                objArr = (Object[]) Array.newInstance(Class.forName($$c(b16, (short) ((b16 ^ 144) | (b16 & 144)), (byte) (-bArr6[c6]))), 7);
                                objArr[z ? 1 : 0] = null;
                                objArr[1] = invoke2;
                                objArr[2] = invoke;
                                objArr[3] = invoke3;
                                i3 = 4;
                                objArr[4] = invoke2;
                                objArr[5] = invoke;
                                objArr[6] = invoke3;
                                zArr = new boolean[]{false, true, true, true, true, true, true};
                                zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                zArr3 = new boolean[7];
                                zArr3[z ? 1 : 0] = z;
                                zArr3[1] = z;
                                zArr3[2] = true;
                                zArr3[3] = true;
                                zArr3[4] = z;
                                zArr3[5] = true;
                                zArr3[6] = true;
                                Class<?> cls7 = Class.forName($$c(bArr6[62], (short) 275, bArr6[978]));
                                i24 = cls7.getDeclaredField($$c(bArr6[889], (short) 298, bArr6[843])).getInt(cls7);
                                i4 = i24 < 34 ? 1 : z ? 1 : 0;
                                zArr3[z ? 1 : 0] = (i24 != 29 && i24 >= 26) ? true : z ? 1 : 0;
                                if (i24 >= 21) {
                                    z8 = true;
                                } else {
                                    int i138 = $10;
                                    int i139 = (i138 ^ 99) + ((i138 & 99) << 1);
                                    $11 = i139 % 128;
                                    if (i139 % 2 != 0) {
                                        int i140 = 2 % 2;
                                    }
                                    z8 = z ? 1 : 0;
                                }
                                zArr3[1] = z8;
                                zArr3[4] = i24 >= 21 ? true : z ? 1 : 0;
                                i5 = z ? 1 : 0;
                                i6 = i5;
                                z2 = z;
                                while (i5 == 0 && i6 < 9) {
                                    if (zArr3[i6]) {
                                        r35 = cls3;
                                        i7 = i26;
                                        zArr4 = zArr;
                                        objArr2 = objArr;
                                        clsArr = clsArr9;
                                        zArr5 = zArr2;
                                        zArr6 = zArr3;
                                        i8 = i4;
                                        i9 = i5;
                                        i10 = i25;
                                        i11 = i6;
                                        z3 = z2;
                                    } else {
                                        int i141 = i26;
                                        try {
                                            z4 = zArr[i6];
                                            obj2 = objArr[i6];
                                            z5 = zArr2[i6];
                                            if (z4) {
                                                i19 = i3;
                                                int i142 = $10 + 1;
                                                $11 = i142 % 128;
                                                int i143 = i142 % i25;
                                                if (obj2 != null) {
                                                    try {
                                                        byte[] bArr7 = $$a;
                                                        byte b17 = (byte) (-bArr7[c5]);
                                                        i18 = i2;
                                                        i17 = i25;
                                                        try {
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            Throwable cause5 = th.getCause();
                                                            if (cause5 == null) {
                                                                throw th;
                                                            }
                                                            throw cause5;
                                                        }
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                    }
                                                }
                                                StringBuilder sb3 = new StringBuilder();
                                                byte[] bArr8 = $$a;
                                                byte b18 = bArr8[c];
                                                StringBuilder append = sb3.append($$c(b18, (short) ((b18 ^ 275) | (b18 & 275)), bArr8[184])).append(obj2);
                                                byte b19 = bArr8[108];
                                                try {
                                                    Object[] objArr5 = {append.append($$c(b19, (short) ((b19 ^ 307) | (b19 & 307)), bArr8[125])).toString()};
                                                    Class<?> cls8 = Class.forName($$c((byte) (-bArr8[c5]), (short) 315, bArr8[198]));
                                                    Class<?>[] clsArr11 = new Class[i27];
                                                    clsArr11[z2 ? 1 : 0] = String.class;
                                                    throw ((Throwable) cls8.getDeclaredConstructor(clsArr11).newInstance(objArr5));
                                                } catch (Throwable th8) {
                                                    Throwable cause6 = th8.getCause();
                                                    if (cause6 == null) {
                                                        throw th8;
                                                    }
                                                    throw cause6;
                                                }
                                            }
                                            i17 = i25;
                                            i18 = i2;
                                            i19 = i3;
                                        } catch (Throwable th9) {
                                            th = th9;
                                            r35 = cls3;
                                            zArr4 = zArr;
                                            objArr2 = objArr;
                                            zArr5 = zArr2;
                                        }
                                        if (z4) {
                                            Random random2 = new Random();
                                            try {
                                                int i144 = i27;
                                                r35 = ((Long) Class.forName($$c((byte) (-$$a[c5]), (short) 241, r7[c3])).getMethod($$c(r7[c2], (short) 333, r7[915]), clsArr9).invoke(clsArr9, clsArr9)).longValue();
                                                Class<?>[] clsArr12 = clsArr9;
                                                boolean[] zArr8 = zArr2;
                                                try {
                                                    random2.setSeed(r35 ^ (-1617582197));
                                                    clsArr2 = clsArr12;
                                                    clsArr3 = clsArr2;
                                                    clsArr4 = clsArr3;
                                                    clsArr5 = clsArr4;
                                                    zArr7 = zArr6;
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    r35 = cls3;
                                                }
                                                while (clsArr2 == null) {
                                                    ?? r36 = clsArr12;
                                                    int i145 = $10 + 5;
                                                    r35 = cls3;
                                                    $11 = i145 % 128;
                                                    int i146 = i145 % 2;
                                                    int i147 = clsArr3 == null ? 6 : clsArr4 == null ? i18 : clsArr5 == null ? i19 : 3;
                                                    try {
                                                        objArr2 = objArr;
                                                        zArr5 = zArr8;
                                                        try {
                                                            int currentTimeMillis7 = (int) System.currentTimeMillis();
                                                            int i148 = 569 + (i147 * 569);
                                                            int i149 = ~i147;
                                                            zArr4 = zArr;
                                                            int i150 = ((-2) ^ i149) | ((-2) & i149);
                                                            int i151 = ~i150;
                                                            r43 = ~currentTimeMillis7;
                                                            int i152 = ~((-2) | r43);
                                                            int i153 = (i151 ^ i152) | (i152 & i151);
                                                            int i154 = ~currentTimeMillis7;
                                                            int i155 = ~((i149 ^ i154) | (i149 & i154));
                                                            int i156 = ((i153 ^ i155) | (i153 & i155)) * (-1136);
                                                            int i157 = (i148 ^ i156) + ((i148 & i156) << 1);
                                                            int i158 = ~(((-2) ^ currentTimeMillis7) | ((-2) & currentTimeMillis7));
                                                            int i159 = ~i147;
                                                            int i160 = i158 | (~((i159 ^ currentTimeMillis7) | (i159 & currentTimeMillis7)));
                                                            int i161 = (r43 ^ 1) | (r43 & 1);
                                                            int i162 = ~((i161 ^ i147) | (i161 & i147));
                                                            int i163 = ((i160 ^ i162) | (i160 & i162)) * (-568);
                                                            int i164 = (i157 ^ i163) + ((i157 & i163) << 1);
                                                            int i165 = ~((r43 ^ 1) | (r43 & 1));
                                                            int i166 = ~((i154 ^ i147) | (i154 & i147));
                                                            int i167 = (i165 ^ i166) | (i165 & i166);
                                                            int i168 = ~((i150 & currentTimeMillis7) | (i150 ^ currentTimeMillis7));
                                                            int i169 = ((i167 & i168) | (i167 ^ i168)) * 568;
                                                            try {
                                                                StringBuilder sb4 = new StringBuilder((i164 ^ i169) + ((i164 & i169) << 1));
                                                                sb4.append('.');
                                                                int i170 = z2 ? 1 : 0;
                                                                while (i170 < i147) {
                                                                    int i171 = $11;
                                                                    int i172 = (i171 ^ 35) + ((i171 & 35) << 1);
                                                                    $10 = i172 % 128;
                                                                    if (i172 % 2 != 0) {
                                                                        r36.hashCode();
                                                                        throw r36;
                                                                    }
                                                                    if (z5) {
                                                                        int nextInt = random2.nextInt(26);
                                                                        if (random2.nextBoolean()) {
                                                                            int i173 = $11;
                                                                            int i174 = ((i173 | 101) << 1) - (i173 ^ 101);
                                                                            i22 = i147;
                                                                            $10 = i174 % 128;
                                                                            int i175 = i174 % 2;
                                                                            i23 = ((nextInt | 65) << 1) - (nextInt ^ 65);
                                                                        } else {
                                                                            i22 = i147;
                                                                            i23 = 95 - (~nextInt);
                                                                            int i176 = i17 % i17;
                                                                        }
                                                                        sb4.append((char) i23);
                                                                        int i177 = i17 % i17;
                                                                    } else {
                                                                        sb4.append((char) (8191 - (~(-(-random2.nextInt(12))))));
                                                                        i22 = i147;
                                                                    }
                                                                    int i178 = ((i170 | (-80)) << 1) - (i170 ^ (-80));
                                                                    i170 = (i178 ^ 81) + ((i178 & 81) << 1);
                                                                    i147 = i22;
                                                                }
                                                                sb = sb4.toString();
                                                            } catch (Throwable th11) {
                                                                th = th11;
                                                            }
                                                        } catch (Throwable th12) {
                                                            th = th12;
                                                            zArr4 = zArr;
                                                        }
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                        r35 = r35;
                                                        zArr4 = zArr;
                                                        objArr2 = objArr;
                                                        zArr5 = zArr8;
                                                        zArr6 = zArr3;
                                                        i8 = i4;
                                                        i9 = i5;
                                                        i12 = i6;
                                                        int currentTimeMillis8 = (int) System.currentTimeMillis();
                                                        i11 = i12;
                                                        int i179 = (-1965) + (i11 * 984);
                                                        int i180 = ~i11;
                                                        int i181 = ((i180 & 1) | (i180 ^ 1)) * 983;
                                                        int i182 = (i179 & i181) + (i179 | i181);
                                                        int i183 = ~i11;
                                                        int i184 = ~currentTimeMillis8;
                                                        int i185 = ((-2) | (~((i183 & i184) | (i183 ^ i184)))) * (-983);
                                                        i7 = i141;
                                                        while (i13 < i7) {
                                                        }
                                                        int currentTimeMillis9 = (int) System.currentTimeMillis();
                                                        int i186 = ~currentTimeMillis9;
                                                        int i187 = 589919008 + ((~(((-1655334471) ^ i186) | ((-1655334471) & i186))) * 979) + ((((-727204297) ^ currentTimeMillis9) | ((-727204297) & currentTimeMillis9)) * (-979));
                                                        int i188 = ~((currentTimeMillis9 & (-1655334471)) | ((-1655334471) ^ currentTimeMillis9));
                                                        int i189 = ~((i186 & (-727204297)) | (i186 ^ (-727204297)));
                                                        int i190 = -(-(((i188 & i189) | (i188 ^ i189)) * 979));
                                                        i14 = (i187 & i190) + (i190 | i187);
                                                        int currentTimeMillis10 = (int) System.currentTimeMillis();
                                                        int i191 = -(-((~(((-936656879) ^ currentTimeMillis10) | ((-936656879) & currentTimeMillis10))) * TypedValues.CycleType.TYPE_EASING));
                                                        i15 = (((1982889564 | i191) << 1) - (i191 ^ 1982889564)) - (-1951265516);
                                                        int i192 = ~currentTimeMillis10;
                                                        int i193 = ~((i192 & (-936656879)) | (i192 ^ (-936656879)));
                                                        i16 = -(-(((i193 & (-939425775)) | ((-939425775) ^ i193)) * TypedValues.CycleType.TYPE_EASING));
                                                        if (i14 > ((i15 | i16) << 1) - (i16 ^ i15)) {
                                                        }
                                                        try {
                                                            throw ((Throwable) Class.forName($$c((byte) (-$$a[c5]), (short) 315, r0[198])).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(b, s, (byte) (-b2)), th));
                                                        } catch (Throwable th14) {
                                                            Throwable cause7 = th14.getCause();
                                                            if (cause7 == null) {
                                                                throw th14;
                                                            }
                                                            throw cause7;
                                                        }
                                                    }
                                                    if (clsArr3 == null) {
                                                        try {
                                                            Object[] objArr6 = new Object[i17];
                                                            objArr6[i144] = sb;
                                                            objArr6[z2 ? 1 : 0] = obj2;
                                                            byte[] bArr9 = $$a;
                                                            byte b20 = (byte) (-bArr9[c5]);
                                                            Class<?> cls9 = Class.forName($$c(b20, (short) ((b20 ^ 144) | (b20 & 144)), (byte) (-bArr9[c6])));
                                                            Class<?>[] clsArr13 = new Class[2];
                                                            byte b21 = (byte) (-bArr9[c5]);
                                                            clsArr13[z2 ? 1 : 0] = Class.forName($$c(b21, (short) (b21 | 144), (byte) (-bArr9[c6])));
                                                            clsArr13[i144] = String.class;
                                                            clsArr3 = cls9.getDeclaredConstructor(clsArr13).newInstance(objArr6);
                                                        } catch (Throwable th15) {
                                                            Throwable cause8 = th15.getCause();
                                                            if (cause8 == null) {
                                                                throw th15;
                                                            }
                                                            throw cause8;
                                                        }
                                                    } else {
                                                        if (clsArr4 != null) {
                                                            if (clsArr5 == null) {
                                                                try {
                                                                    Object[] objArr7 = new Object[2];
                                                                    objArr7[i144] = sb;
                                                                    objArr7[z2 ? 1 : 0] = obj2;
                                                                    byte[] bArr10 = $$a;
                                                                    byte b22 = (byte) (-bArr10[c5]);
                                                                    Class<?> cls10 = Class.forName($$c(b22, (short) ((b22 ^ 144) | (b22 & 144)), (byte) (-bArr10[c6])));
                                                                    Class<?>[] clsArr14 = new Class[2];
                                                                    byte b23 = (byte) (-bArr10[c5]);
                                                                    clsArr14[z2 ? 1 : 0] = Class.forName($$c(b23, (short) ((b23 & 144) | (b23 ^ 144)), (byte) (-bArr10[c6])));
                                                                    clsArr14[i144] = String.class;
                                                                    clsArr5 = cls10.getDeclaredConstructor(clsArr14).newInstance(objArr7);
                                                                } catch (Throwable th16) {
                                                                    Throwable cause9 = th16.getCause();
                                                                    if (cause9 == null) {
                                                                        throw th16;
                                                                    }
                                                                    throw cause9;
                                                                }
                                                            } else {
                                                                int i194 = $10 + 61;
                                                                $11 = i194 % 128;
                                                                int i195 = i194 % 2;
                                                                try {
                                                                    Object[] objArr8 = new Object[2];
                                                                    objArr8[i144] = sb;
                                                                    objArr8[z2 ? 1 : 0] = obj2;
                                                                    byte[] bArr11 = $$a;
                                                                    byte b24 = (byte) (-bArr11[c5]);
                                                                    Class<?> cls11 = Class.forName($$c(b24, (short) ((b24 ^ 144) | (b24 & 144)), (byte) (-bArr11[c6])));
                                                                    Class<?>[] clsArr15 = new Class[2];
                                                                    byte b25 = (byte) (-bArr11[c5]);
                                                                    clsArr15[z2 ? 1 : 0] = Class.forName($$c(b25, (short) ((b25 & 144) | (b25 ^ 144)), (byte) (-bArr11[c6])));
                                                                    clsArr15[i144] = String.class;
                                                                    ?? newInstance2 = cls11.getDeclaredConstructor(clsArr15).newInstance(objArr8);
                                                                    int i196 = $11 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                                                                    $10 = i196 % 128;
                                                                    int i197 = i196 % 2;
                                                                    try {
                                                                        try {
                                                                            byte b26 = (byte) (-bArr11[c5]);
                                                                            Class<?> cls12 = Class.forName($$c(b26, (short) ((b26 ^ Ascii.DC4) | (b26 & Ascii.DC4)), bArr11[978]));
                                                                            Class<?>[] clsArr16 = new Class[i144];
                                                                            byte b27 = (byte) (-bArr11[c5]);
                                                                            random = random2;
                                                                            clsArr16[z2 ? 1 : 0] = Class.forName($$c(b27, (short) ((b27 & 144) | (b27 ^ 144)), (byte) (-bArr11[c6])));
                                                                            Object newInstance3 = cls12.getDeclaredConstructor(clsArr16).newInstance(newInstance2);
                                                                            try {
                                                                                byte b28 = (byte) (-bArr11[c5]);
                                                                                Class.forName($$c(b28, (short) ((b28 ^ Ascii.DC4) | (b28 & Ascii.DC4)), bArr11[978])).getMethod($$c(bArr11[c2], (short) 372, bArr11[184]), r36).invoke(newInstance3, r36);
                                                                                clsArr2 = newInstance2;
                                                                                cls3 = r35;
                                                                                objArr = objArr2;
                                                                                zArr8 = zArr5;
                                                                                random2 = random;
                                                                                zArr = zArr4;
                                                                                clsArr12 = null;
                                                                                i17 = 2;
                                                                                i144 = 1;
                                                                                zArr7 = r43;
                                                                            } catch (Throwable th17) {
                                                                                Throwable cause10 = th17.getCause();
                                                                                if (cause10 == null) {
                                                                                    throw th17;
                                                                                }
                                                                                throw cause10;
                                                                            }
                                                                        } catch (Exception e2) {
                                                                            StringBuilder sb5 = new StringBuilder();
                                                                            byte[] bArr12 = $$a;
                                                                            StringBuilder append2 = sb5.append($$c(bArr12[c], (short) 376, bArr12[184])).append(newInstance2);
                                                                            byte b29 = bArr12[108];
                                                                            String sb6 = append2.append($$c(b29, (short) (b29 | 307), bArr12[125])).toString();
                                                                            try {
                                                                                Object[] objArr9 = new Object[2];
                                                                                objArr9[1] = e2;
                                                                                objArr9[z2 ? 1 : 0] = sb6;
                                                                                Class<?> cls13 = Class.forName($$c((byte) (-bArr12[c5]), (short) 315, bArr12[198]));
                                                                                Class<?>[] clsArr17 = new Class[2];
                                                                                clsArr17[z2 ? 1 : 0] = String.class;
                                                                                clsArr17[1] = Throwable.class;
                                                                                throw ((Throwable) cls13.getDeclaredConstructor(clsArr17).newInstance(objArr9));
                                                                            } catch (Throwable th18) {
                                                                                Throwable cause11 = th18.getCause();
                                                                                if (cause11 == null) {
                                                                                    throw th18;
                                                                                }
                                                                                throw cause11;
                                                                            }
                                                                        }
                                                                    } catch (Throwable th19) {
                                                                        Throwable cause12 = th19.getCause();
                                                                        if (cause12 == null) {
                                                                            throw th19;
                                                                        }
                                                                        throw cause12;
                                                                    }
                                                                } catch (Throwable th20) {
                                                                    Throwable cause13 = th20.getCause();
                                                                    if (cause13 == null) {
                                                                        throw th20;
                                                                    }
                                                                    throw cause13;
                                                                }
                                                            }
                                                            th = th11;
                                                            zArr6 = zArr3;
                                                            i8 = i4;
                                                            i9 = i5;
                                                            i12 = i6;
                                                            int currentTimeMillis82 = (int) System.currentTimeMillis();
                                                            i11 = i12;
                                                            int i1792 = (-1965) + (i11 * 984);
                                                            int i1802 = ~i11;
                                                            int i1812 = ((i1802 & 1) | (i1802 ^ 1)) * 983;
                                                            int i1822 = (i1792 & i1812) + (i1792 | i1812);
                                                            int i1832 = ~i11;
                                                            int i1842 = ~currentTimeMillis82;
                                                            int i1852 = ((-2) | (~((i1832 & i1842) | (i1832 ^ i1842)))) * (-983);
                                                            i7 = i141;
                                                            for (i13 = (((i1822 ^ i1852) + ((i1852 & i1822) << 1)) - (~(-(-(((~((-2) | (~currentTimeMillis82))) | (~((-2) | i11))) * 983))))) - 1; i13 < i7; i13++) {
                                                                if (zArr6[i13]) {
                                                                    clsArr = null;
                                                                    i = null;
                                                                    d = null;
                                                                    i10 = 2;
                                                                    z3 = false;
                                                                    r35 = r35;
                                                                    zArr6 = zArr6;
                                                                }
                                                            }
                                                            int currentTimeMillis92 = (int) System.currentTimeMillis();
                                                            int i1862 = ~currentTimeMillis92;
                                                            int i1872 = 589919008 + ((~(((-1655334471) ^ i1862) | ((-1655334471) & i1862))) * 979) + ((((-727204297) ^ currentTimeMillis92) | ((-727204297) & currentTimeMillis92)) * (-979));
                                                            int i1882 = ~((currentTimeMillis92 & (-1655334471)) | ((-1655334471) ^ currentTimeMillis92));
                                                            int i1892 = ~((i1862 & (-727204297)) | (i1862 ^ (-727204297)));
                                                            int i1902 = -(-(((i1882 & i1892) | (i1882 ^ i1892)) * 979));
                                                            i14 = (i1872 & i1902) + (i1902 | i1872);
                                                            int currentTimeMillis102 = (int) System.currentTimeMillis();
                                                            int i1912 = -(-((~(((-936656879) ^ currentTimeMillis102) | ((-936656879) & currentTimeMillis102))) * TypedValues.CycleType.TYPE_EASING));
                                                            i15 = (((1982889564 | i1912) << 1) - (i1912 ^ 1982889564)) - (-1951265516);
                                                            int i1922 = ~currentTimeMillis102;
                                                            int i1932 = ~((i1922 & (-936656879)) | (i1922 ^ (-936656879)));
                                                            i16 = -(-(((i1932 & (-939425775)) | ((-939425775) ^ i1932)) * TypedValues.CycleType.TYPE_EASING));
                                                            if (i14 > ((i15 | i16) << 1) - (i16 ^ i15)) {
                                                                byte[] bArr13 = $$a;
                                                                b = bArr13[28497];
                                                                s = (short) ((b ^ 24457) | (b & 24457));
                                                                b2 = bArr13[20842];
                                                            } else {
                                                                byte[] bArr14 = $$a;
                                                                b = bArr14[c];
                                                                s = (short) ((b ^ 1096) | (b & 1096));
                                                                b2 = bArr14[779];
                                                            }
                                                            throw ((Throwable) Class.forName($$c((byte) (-$$a[c5]), (short) 315, r0[198])).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(b, s, (byte) (-b2)), th));
                                                        }
                                                        try {
                                                            Object[] objArr10 = new Object[2];
                                                            objArr10[i144] = sb;
                                                            objArr10[z2 ? 1 : 0] = obj2;
                                                            byte[] bArr15 = $$a;
                                                            byte b30 = (byte) (-bArr15[c5]);
                                                            Class<?> cls14 = Class.forName($$c(b30, (short) ((b30 ^ 144) | (b30 & 144)), (byte) (-bArr15[c6])));
                                                            Class<?>[] clsArr18 = new Class[2];
                                                            byte b31 = (byte) (-bArr15[c5]);
                                                            clsArr18[z2 ? 1 : 0] = Class.forName($$c(b31, (short) (b31 | 144), (byte) (-bArr15[c6])));
                                                            clsArr18[i144] = String.class;
                                                            clsArr4 = cls14.getDeclaredConstructor(clsArr18).newInstance(objArr10);
                                                        } catch (Throwable th21) {
                                                            Throwable cause14 = th21.getCause();
                                                            if (cause14 == null) {
                                                                throw th21;
                                                            }
                                                            throw cause14;
                                                        }
                                                    }
                                                    random = random2;
                                                    cls3 = r35;
                                                    objArr = objArr2;
                                                    zArr8 = zArr5;
                                                    random2 = random;
                                                    zArr = zArr4;
                                                    clsArr12 = null;
                                                    i17 = 2;
                                                    i144 = 1;
                                                    zArr7 = r43;
                                                }
                                                zArr5 = zArr8;
                                                zArr6 = zArr7;
                                            } catch (Throwable th22) {
                                                Throwable cause15 = th22.getCause();
                                                if (cause15 == null) {
                                                    throw th22;
                                                }
                                                throw cause15;
                                            }
                                        } else {
                                            zArr5 = zArr2;
                                            clsArr2 = null;
                                            clsArr3 = null;
                                            clsArr4 = null;
                                            clsArr5 = null;
                                            zArr6 = zArr6;
                                        }
                                        r35 = cls3;
                                        zArr4 = zArr;
                                        objArr2 = objArr;
                                        byte[] bArr16 = $$a;
                                        String $$c2 = $$c(bArr16[13], (short) 380, bArr16[i141]);
                                        try {
                                            byte b32 = (byte) 70;
                                            Class<?>[] clsArr19 = clsArr2;
                                            String $$c3 = $$c(b32, (short) 428, bArr16[c4]);
                                            Class<?>[] clsArr20 = clsArr3;
                                            Class[] clsArr21 = new Class[1];
                                            clsArr21[z2 ? 1 : 0] = String.class;
                                            try {
                                                String str4 = (String) Class.forName($$c((byte) (-bArr16[c5]), (short) 438, (byte) (-bArr16[c6]))).getMethod($$c(b32, (short) 449, bArr16[843]), null).invoke(Class.class.getMethod($$c3, clsArr21).invoke(AFa1gSDK.class, $$c2), null);
                                                StringBuilder sb7 = new StringBuilder();
                                                byte b33 = bArr16[i141];
                                                ZipFile zipFile = new ZipFile(str4.substring(i18, str4.lastIndexOf(sb7.append($$c(b33, (short) ((b33 & 455) | (b33 ^ 455)), bArr16[125])).append($$c2).toString())));
                                                try {
                                                    byte[] bArr17 = new byte[8054];
                                                    InputStream inputStream = zipFile.getInputStream(zipFile.getEntry($$c2.substring(1)));
                                                    int i198 = $10;
                                                    int i199 = ((i198 | 107) << 1) - (i198 ^ 107);
                                                    $11 = i199 % 128;
                                                    int i200 = i199 % 2;
                                                    try {
                                                        Class<?> cls15 = Class.forName($$c((byte) (-bArr16[c5]), (short) 455, bArr16[987]));
                                                        Class<?>[] clsArr22 = new Class[1];
                                                        short s3 = (short) 481;
                                                        clsArr22[z2 ? 1 : 0] = Class.forName($$c((byte) (-bArr16[c5]), s3, bArr16[198]));
                                                        try {
                                                            Object[] objArr11 = {cls15.getDeclaredConstructor(clsArr22).newInstance(inputStream)};
                                                            short s4 = (short) 499;
                                                            Class<?> cls16 = Class.forName($$c((byte) (-bArr16[c5]), s4, (byte) (-bArr16[779])));
                                                            Class<?>[] clsArr23 = new Class[1];
                                                            zArr6 = zArr3;
                                                            try {
                                                                clsArr23[z2 ? 1 : 0] = Class.forName($$c((byte) (-bArr16[c5]), s3, bArr16[198]));
                                                                Object newInstance4 = cls16.getDeclaredConstructor(clsArr23).newInstance(objArr11);
                                                                int i201 = 2 % 2;
                                                                try {
                                                                    ?? cls17 = Class.forName($$c((byte) (-bArr16[c5]), s4, (byte) (-bArr16[779])));
                                                                    byte b34 = bArr16[1152];
                                                                    String $$c4 = $$c((byte) ((b34 & 1) + (b34 | 1)), (short) 521, bArr16[159]);
                                                                    ?? r10 = new Class[1];
                                                                    r10[z2 ? 1 : 0] = r35;
                                                                    cls17.getMethod($$c4, r10).invoke(newInstance4, bArr17);
                                                                    try {
                                                                        Class.forName($$c((byte) (-bArr16[c5]), s4, (byte) (-bArr16[779]))).getMethod($$c(bArr16[c2], (short) 372, bArr16[184]), null).invoke(newInstance4, null);
                                                                        int i202 = 22;
                                                                        int i203 = 8002;
                                                                        String str5 = str2;
                                                                        byte[] bArr18 = bArr17;
                                                                        Class cls18 = null;
                                                                        ?? r27 = z2;
                                                                        while (true) {
                                                                            long j = 1;
                                                                            try {
                                                                                long j2 = j;
                                                                                int i204 = r27;
                                                                                while (i204 < bArr18.length) {
                                                                                    try {
                                                                                        int i205 = i204;
                                                                                        j2 = ((bArr18[i204] + (j2 << 6)) + (j2 << 16)) - j2;
                                                                                        i204 = (i205 ^ 1) + ((i205 & 1) << 1);
                                                                                    } catch (Throwable th23) {
                                                                                        th = th23;
                                                                                        th = th;
                                                                                        i8 = i4;
                                                                                        i9 = i5;
                                                                                        i12 = i6;
                                                                                        zArr6 = zArr6;
                                                                                        try {
                                                                                            zipFile.close();
                                                                                            throw th;
                                                                                        } catch (Throwable th24) {
                                                                                            th.addSuppressed(th24);
                                                                                            throw th;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                int i206 = ((i202 | 40) << 1) - (i202 ^ 40);
                                                                                int currentTimeMillis11 = (int) System.currentTimeMillis();
                                                                                int i207 = ~currentTimeMillis11;
                                                                                int i208 = ~(((-8032) ^ i207) | ((-8032) & i207));
                                                                                int i209 = (-4160058) + (i202 * (-518)) + (((i202 ^ i208) | (i208 & i202)) * 519);
                                                                                int i210 = ~currentTimeMillis11;
                                                                                int i211 = ((-8032) ^ i210) | ((-8032) & i210);
                                                                                int i212 = ~((i211 ^ i202) | (i211 & i202));
                                                                                int i213 = (i202 ^ 8031) | (i202 & 8031);
                                                                                int i214 = ~((i213 ^ currentTimeMillis11) | (i213 & currentTimeMillis11));
                                                                                int i215 = i209 + (((i212 ^ i214) | (i214 & i212)) * (-519));
                                                                                int i216 = ~((i202 ^ currentTimeMillis11) | (i202 & currentTimeMillis11));
                                                                                int i217 = ((i216 & 8031) | (i216 ^ 8031)) * 519;
                                                                                bArr18[i206] = (byte) (bArr18[(i215 ^ i217) + ((i215 & i217) << 1)] + 106);
                                                                                int length = bArr18.length;
                                                                                int i218 = -i202;
                                                                                int i219 = i202;
                                                                                byte[] bArr19 = bArr18;
                                                                                int currentTimeMillis12 = (int) System.currentTimeMillis();
                                                                                int i220 = ((i218 * 302) - (~(-(-(length * 603))))) - 1;
                                                                                int i221 = ~i218;
                                                                                int i222 = ~currentTimeMillis12;
                                                                                int i223 = ((~((i221 ^ i222) | (i221 & i222))) | length) * (-602);
                                                                                int i224 = (i220 & i223) + (i220 | i223);
                                                                                int i225 = ~length;
                                                                                i8 = i221 & currentTimeMillis12;
                                                                                int i226 = (~((i221 ^ i225) | (i221 & i225))) | (~((i221 ^ currentTimeMillis12) | i8));
                                                                                int i227 = ~currentTimeMillis12;
                                                                                int i228 = i218 | i227;
                                                                                int i229 = (i226 | (~((i228 ^ length) | (i228 & length)))) * (-301);
                                                                                int i230 = (((i224 | i229) << 1) - (i224 ^ i229)) + ((~((i227 & length) | (i227 ^ length))) * 301);
                                                                                try {
                                                                                    Object[] objArr12 = new Object[3];
                                                                                    objArr12[2] = Integer.valueOf(i230);
                                                                                    objArr12[1] = Integer.valueOf(i219);
                                                                                    objArr12[r27] = bArr19;
                                                                                    byte[] bArr20 = $$a;
                                                                                    ?? cls19 = Class.forName($$c((byte) (-bArr20[c5]), (short) 529, bArr20[347]));
                                                                                    ?? r6 = new Class[3];
                                                                                    r6[r27] = r35;
                                                                                    r6[1] = Integer.TYPE;
                                                                                    r6[2] = Integer.TYPE;
                                                                                    Object newInstance5 = cls19.getDeclaredConstructor(r6).newInstance(objArr12);
                                                                                    Object obj3 = i;
                                                                                    if (obj3 == null) {
                                                                                        int i231 = $10 + 57;
                                                                                        $11 = i231 % 128;
                                                                                        int i232 = i231 % 2;
                                                                                        try {
                                                                                            afInfoLog = j2;
                                                                                            int i233 = -(ViewConfiguration.getTouchSlop() >> 8);
                                                                                            int i234 = ((i233 | (-971281231)) << 1) - (i233 ^ (-971281231));
                                                                                            byte[] bArr21 = {81, -120, -50, 98, 97, 125, 73, -95, -118, -73, -47, -1, -35, -25, 92, -59};
                                                                                            int elapsedRealtimeNanos = (int) (afInfoLog ^ ((-3283468305376455728L) - (SystemClock.elapsedRealtimeNanos() >> 60)));
                                                                                            byte[] bArr22 = new byte[16];
                                                                                            int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
                                                                                            z6 = z4;
                                                                                            int elapsedCpuTime = (int) (afInfoLog ^ ((Process.getElapsedCpuTime() >> 48) - 3283468305376455724L));
                                                                                            try {
                                                                                                Object[] objArr13 = new Object[5];
                                                                                                objArr13[i19] = 16;
                                                                                                objArr13[3] = Integer.valueOf(elapsedCpuTime);
                                                                                                objArr13[2] = bArr22;
                                                                                                objArr13[1] = Integer.valueOf(fadingEdgeLength);
                                                                                                objArr13[r27] = bArr21;
                                                                                                Class<?> cls20 = Class.forName($$c((byte) (-bArr20[c5]), (short) 241, bArr20[c3]));
                                                                                                i20 = i219;
                                                                                                String $$c5 = $$c(bArr20[62], (short) 556, bArr20[159]);
                                                                                                Class<?>[] clsArr24 = new Class[5];
                                                                                                clsArr24[r27] = Object.class;
                                                                                                clsArr24[1] = Integer.TYPE;
                                                                                                clsArr24[2] = Object.class;
                                                                                                clsArr24[3] = Integer.TYPE;
                                                                                                clsArr24[i19] = Integer.TYPE;
                                                                                                cls20.getMethod($$c5, clsArr24).invoke(null, objArr13);
                                                                                                AFk1tSDK.getMonetizationNetwork(bArr22, afLogForce, afErrorLog);
                                                                                                try {
                                                                                                    Object[] objArr14 = new Object[i19];
                                                                                                    objArr14[3] = AFk1zSDK.getMediationNetwork(i234);
                                                                                                    objArr14[2] = bArr22;
                                                                                                    objArr14[1] = Integer.valueOf(elapsedRealtimeNanos);
                                                                                                    objArr14[r27] = newInstance5;
                                                                                                    ?? cls21 = Class.forName($$c(bArr20[c2], (short) 564, bArr20[223]));
                                                                                                    ?? r2 = new Class[4];
                                                                                                    r2[r27] = Class.forName($$c((byte) (-bArr20[c5]), (short) 481, bArr20[198]));
                                                                                                    r2[1] = Integer.TYPE;
                                                                                                    r2[2] = r35;
                                                                                                    r2[3] = byte[][].class;
                                                                                                    invoke4 = cls21.getDeclaredConstructor(r2).newInstance(objArr14);
                                                                                                    cls = cls18;
                                                                                                    clsArr6 = clsArr4;
                                                                                                } catch (Throwable th25) {
                                                                                                    Throwable cause16 = th25.getCause();
                                                                                                    if (cause16 == null) {
                                                                                                        throw th25;
                                                                                                    }
                                                                                                    throw cause16;
                                                                                                }
                                                                                            } catch (Throwable th26) {
                                                                                                Throwable cause17 = th26.getCause();
                                                                                                if (cause17 == null) {
                                                                                                    throw th26;
                                                                                                }
                                                                                                throw cause17;
                                                                                            }
                                                                                        } catch (Throwable th27) {
                                                                                            th = th27;
                                                                                            th = th;
                                                                                            i8 = i4;
                                                                                            i9 = i5;
                                                                                            i12 = i6;
                                                                                            zArr6 = zArr6;
                                                                                            zipFile.close();
                                                                                            throw th;
                                                                                        }
                                                                                    } else {
                                                                                        z6 = z4;
                                                                                        i20 = i219;
                                                                                        v = j2;
                                                                                        int elapsedRealtimeNanos2 = (int) (j2 ^ (6453106098331251761L - (SystemClock.elapsedRealtimeNanos() >> 60)));
                                                                                        int i235 = -(ViewConfiguration.getTouchSlop() >> 8);
                                                                                        int currentTimeMillis13 = (int) System.currentTimeMillis();
                                                                                        int i236 = i235 * (-1939);
                                                                                        int i237 = (i236 ^ 14565) + ((i236 & 14565) << 1);
                                                                                        int i238 = ~((-16) | i235);
                                                                                        int i239 = ~currentTimeMillis13;
                                                                                        int i240 = ~((i239 ^ 15) | (i239 & 15));
                                                                                        int i241 = -(-((i238 | i240) * (-970)));
                                                                                        int i242 = ((i237 | i241) << 1) - (i241 ^ i237);
                                                                                        int i243 = ~i235;
                                                                                        int i244 = (~((i243 ^ 15) | (i243 & 15))) * 1940;
                                                                                        int i245 = (i242 ^ i244) + ((i242 & i244) << 1);
                                                                                        int i246 = ~((i243 & (-16)) | (i243 ^ (-16)));
                                                                                        int i247 = -(-(((i246 & i240) | (i246 ^ i240)) * 970));
                                                                                        byte b35 = (byte) (((i245 | i247) << 1) - (i247 ^ i245));
                                                                                        System.currentTimeMillis();
                                                                                        System.currentTimeMillis();
                                                                                        try {
                                                                                            Object[] objArr15 = new Object[3];
                                                                                            objArr15[2] = Short.valueOf(b35);
                                                                                            objArr15[1] = Integer.valueOf(elapsedRealtimeNanos2);
                                                                                            objArr15[r27] = newInstance5;
                                                                                            byte b36 = bArr20[c2];
                                                                                            Class<?> cls22 = Class.forName($$c(b36, (short) ((b36 ^ Ascii.DLE) | (b36 & Ascii.DLE)), bArr20[214]), true, (ClassLoader) d);
                                                                                            String $$c6 = $$c(b32, (short) LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, bArr20[417]);
                                                                                            Class<?>[] clsArr25 = new Class[3];
                                                                                            cls = cls18;
                                                                                            clsArr6 = clsArr4;
                                                                                            clsArr25[r27] = Class.forName($$c((byte) (-bArr20[c5]), (short) 481, bArr20[198]));
                                                                                            clsArr25[1] = Integer.TYPE;
                                                                                            clsArr25[2] = Short.TYPE;
                                                                                            invoke4 = cls22.getMethod($$c6, clsArr25).invoke(obj3, objArr15);
                                                                                        } catch (Throwable th28) {
                                                                                            Throwable cause18 = th28.getCause();
                                                                                            if (cause18 == null) {
                                                                                                throw th28;
                                                                                            }
                                                                                            throw cause18;
                                                                                        }
                                                                                    }
                                                                                    short s5 = (short) 481;
                                                                                    Class<?> cls23 = Class.forName($$c((byte) (-bArr20[c5]), s5, bArr20[198]));
                                                                                    byte b37 = (byte) 82;
                                                                                    String $$c7 = $$c(b37, (short) ((b37 ^ 553) | (b37 & 553)), bArr20[75]);
                                                                                    Class<?>[] clsArr26 = new Class[1];
                                                                                    clsArr26[r27] = Long.TYPE;
                                                                                    cls23.getMethod($$c7, clsArr26).invoke(invoke4, 17);
                                                                                    if (z6) {
                                                                                        int i248 = $10;
                                                                                        int i249 = i248 + 35;
                                                                                        $11 = i249 % 128;
                                                                                        int i250 = i249 % 2;
                                                                                        Object obj4 = i;
                                                                                        if (obj4 == null) {
                                                                                            int i251 = (i248 ^ 15) + ((i248 & 15) << 1);
                                                                                            $11 = i251 % 128;
                                                                                            if (i251 % 2 == 0) {
                                                                                                throw null;
                                                                                            }
                                                                                            clsArr8 = clsArr20;
                                                                                        } else {
                                                                                            clsArr8 = clsArr6;
                                                                                        }
                                                                                        Class<?>[] clsArr27 = obj4 == null ? clsArr5 : clsArr19;
                                                                                        ?? cls24 = Class.forName($$c((byte) (-bArr20[c5]), s5, bArr20[198]));
                                                                                        byte b38 = bArr20[1152];
                                                                                        int currentTimeMillis14 = (int) System.currentTimeMillis();
                                                                                        int i252 = b38 * 1435;
                                                                                        int i253 = ((-716) & i252) + ((-716) | i252);
                                                                                        int i254 = -(-(((b38 ^ (-2)) | (b38 & (-2))) * (-1434)));
                                                                                        int i255 = ((i253 | i254) << 1) - (i253 ^ i254);
                                                                                        int i256 = ~currentTimeMillis14;
                                                                                        int i257 = ~((i256 ^ b38) | (i256 & b38));
                                                                                        int i258 = ~((b38 ^ 1) | (b38 & 1));
                                                                                        int i259 = (i257 ^ i258) | (i257 & i258);
                                                                                        int i260 = ~b38;
                                                                                        int i261 = ((-2) ^ i260) | ((-2) & i260);
                                                                                        int i262 = ~((i261 ^ currentTimeMillis14) | (i261 & currentTimeMillis14));
                                                                                        int i263 = -(-(((i259 ^ i262) | (i259 & i262)) * 717));
                                                                                        int i264 = (i255 ^ i263) + ((i255 & i263) << 1);
                                                                                        int i265 = ~b38;
                                                                                        int i266 = ((-2) ^ i265) | ((-2) & i265);
                                                                                        int i267 = ~currentTimeMillis14;
                                                                                        int i268 = (~(b38 | 1)) | (~((i266 ^ i267) | (i266 & i267)));
                                                                                        int i269 = ~((b38 ^ currentTimeMillis14) | (b38 & currentTimeMillis14));
                                                                                        String $$c8 = $$c((byte) (i264 + (((i268 & i269) | (i268 ^ i269)) * 717)), (short) 638, bArr20[75]);
                                                                                        ?? r11 = new Class[3];
                                                                                        r11[r27] = r35;
                                                                                        r11[1] = Integer.TYPE;
                                                                                        r11[2] = Integer.TYPE;
                                                                                        Method method3 = cls24.getMethod($$c8, r11);
                                                                                        byte b39 = (byte) (-bArr20[c5]);
                                                                                        ?? cls25 = Class.forName($$c(b39, (short) (b39 | Ascii.DC4), bArr20[978]));
                                                                                        try {
                                                                                            Class[] clsArr28 = new Class[1];
                                                                                            byte b40 = (byte) (-bArr20[c5]);
                                                                                            i8 = i4;
                                                                                            clsArr7 = clsArr5;
                                                                                            try {
                                                                                                clsArr28[r27] = Class.forName($$c(b40, (short) ((b40 ^ 144) | (b40 & 144)), (byte) (-bArr20[c6])));
                                                                                                Object newInstance6 = cls25.getConstructor(clsArr28).newInstance(clsArr8);
                                                                                                if (i8 != 0) {
                                                                                                    int i270 = $11 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                                                                                                    $10 = i270 % 128;
                                                                                                    int i271 = i270 % 2;
                                                                                                    try {
                                                                                                        byte b41 = (byte) (-bArr20[c5]);
                                                                                                        i9 = i5;
                                                                                                        b5 = b37;
                                                                                                        try {
                                                                                                            ((Boolean) Class.forName($$c(b41, (short) ((b41 ^ 144) | (b41 & 144)), (byte) (-bArr20[c6]))).getMethod($$c(b5, (short) 641, bArr20[c4]), null).invoke(clsArr8, null)).booleanValue();
                                                                                                        } catch (Throwable th29) {
                                                                                                            th = th29;
                                                                                                            try {
                                                                                                                Throwable cause19 = th.getCause();
                                                                                                                if (cause19 == null) {
                                                                                                                    throw th;
                                                                                                                }
                                                                                                                throw cause19;
                                                                                                            } catch (Exception e3) {
                                                                                                                e = e3;
                                                                                                                i12 = i6;
                                                                                                                StringBuilder sb8 = new StringBuilder();
                                                                                                                byte[] bArr23 = $$a;
                                                                                                                StringBuilder append3 = sb8.append($$c(bArr23[c], (short) 651, bArr23[184])).append(clsArr8);
                                                                                                                byte b42 = bArr23[108];
                                                                                                                try {
                                                                                                                    throw ((Throwable) Class.forName($$c((byte) (-bArr23[c5]), (short) 315, bArr23[198])).getDeclaredConstructor(String.class, Throwable.class).newInstance(append3.append($$c(b42, (short) ((b42 ^ 307) | (b42 & 307)), bArr23[125])).toString(), e));
                                                                                                                } catch (Throwable th30) {
                                                                                                                    Throwable cause20 = th30.getCause();
                                                                                                                    if (cause20 == null) {
                                                                                                                        throw th30;
                                                                                                                    }
                                                                                                                    throw cause20;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (Throwable th31) {
                                                                                                        th = th31;
                                                                                                        i9 = i5;
                                                                                                    }
                                                                                                } else {
                                                                                                    i9 = i5;
                                                                                                    b5 = b37;
                                                                                                }
                                                                                                int i272 = $11;
                                                                                                int i273 = ((i272 | 1) << 1) - (i272 ^ 1);
                                                                                                $10 = i273 % 128;
                                                                                                int i274 = i273 % 2;
                                                                                                try {
                                                                                                    bArr = new byte[1024];
                                                                                                    i12 = i6;
                                                                                                } catch (Throwable th32) {
                                                                                                    th = th32;
                                                                                                    i12 = i6;
                                                                                                    try {
                                                                                                        byte[] bArr24 = $$a;
                                                                                                        byte b43 = (byte) (-bArr24[c5]);
                                                                                                        Class<?> cls26 = Class.forName($$c(b43, (short) ((b43 ^ 144) | (b43 & 144)), (byte) (-bArr24[c6])));
                                                                                                        byte b44 = bArr24[449];
                                                                                                        ((Boolean) cls26.getMethod($$c(b44, (short) ((b44 ^ 660) | (b44 & 660)), bArr24[179]), null).invoke(clsArr8, null)).booleanValue();
                                                                                                        try {
                                                                                                            byte b45 = (byte) (-bArr24[c5]);
                                                                                                            Class<?> cls27 = Class.forName($$c(b45, (short) ((b45 ^ 144) | (b45 & 144)), (byte) (-bArr24[c6])));
                                                                                                            byte b46 = bArr24[449];
                                                                                                            ((Boolean) cls27.getMethod($$c(b46, (short) ((b46 ^ 660) | (b46 & 660)), bArr24[179]), null).invoke(clsArr27, null)).booleanValue();
                                                                                                            throw th;
                                                                                                        } catch (Throwable th33) {
                                                                                                            Throwable cause21 = th33.getCause();
                                                                                                            if (cause21 == null) {
                                                                                                                throw th33;
                                                                                                            }
                                                                                                            throw cause21;
                                                                                                        }
                                                                                                    } catch (Throwable th34) {
                                                                                                        Throwable cause22 = th34.getCause();
                                                                                                        if (cause22 == null) {
                                                                                                            throw th34;
                                                                                                        }
                                                                                                        throw cause22;
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    String $$c9 = $$c((byte) 86, (short) 655, bArr20[184]);
                                                                                                    ?? r15 = new Class[3];
                                                                                                    r15[r27] = r35;
                                                                                                    r15[1] = Integer.TYPE;
                                                                                                    r15[2] = Integer.TYPE;
                                                                                                    Method method4 = cls25.getMethod($$c9, r15);
                                                                                                    while (i203 > 0) {
                                                                                                        int intValue2 = ((Integer) method3.invoke(invoke4, bArr, Integer.valueOf((int) r27), Integer.valueOf(Math.min(1024, i203)))).intValue();
                                                                                                        if (intValue2 == -1) {
                                                                                                            break;
                                                                                                        }
                                                                                                        Object obj5 = invoke4;
                                                                                                        method4.invoke(newInstance6, bArr, Integer.valueOf((int) r27), Integer.valueOf(intValue2));
                                                                                                        int i275 = -intValue2;
                                                                                                        Method method5 = method4;
                                                                                                        Method method6 = method3;
                                                                                                        int currentTimeMillis15 = (int) System.currentTimeMillis();
                                                                                                        int i276 = (i275 * (-159)) + (i203 * (-159));
                                                                                                        int i277 = ~i275;
                                                                                                        int i278 = -(-(((i203 ^ i277) | (i277 & i203)) * 160));
                                                                                                        int i279 = (i276 & i278) + (i276 | i278);
                                                                                                        int i280 = ~currentTimeMillis15;
                                                                                                        int i281 = ~(i280 | i275);
                                                                                                        int i282 = ~((i275 ^ i203) | (i275 & i203));
                                                                                                        int i283 = -(-(((i281 ^ i282) | (i282 & i281)) * (-160)));
                                                                                                        int i284 = (i279 & i283) + (i279 | i283);
                                                                                                        int i285 = ~i203;
                                                                                                        int i286 = ~((i285 & i280) | (i285 ^ i280));
                                                                                                        int i287 = ((i275 & i286) | (i275 ^ i286)) * 160;
                                                                                                        i203 = ((i284 | i287) << 1) - (i287 ^ i284);
                                                                                                        method3 = method6;
                                                                                                        method4 = method5;
                                                                                                        invoke4 = obj5;
                                                                                                    }
                                                                                                    byte[] bArr25 = $$a;
                                                                                                    int i288 = r27;
                                                                                                    Class.forName($$c((byte) (-bArr25[c5]), (short) 663, bArr25[528])).getMethod($$c(b5, (short) 684, bArr25[75]), new Class[0]).invoke(cls25.getMethod($$c(b32, (short) 659, bArr25[184]), new Class[i288]).invoke(newInstance6, new Object[i288]), new Object[0]);
                                                                                                    cls25.getMethod($$c(bArr25[c2], (short) 372, bArr25[184]), new Class[0]).invoke(newInstance6, new Object[0]);
                                                                                                    Method declaredMethod = Class.forName($$c(bArr25[449], (short) 687, (byte) (bArr25[343] - 1))).getDeclaredMethod($$c((byte) (bArr25[1142] - 1), (short) 707, bArr25[843]), String.class, String.class, Integer.TYPE);
                                                                                                    int i289 = $11 + 73;
                                                                                                    $10 = i289 % 128;
                                                                                                    int i290 = i289 % 2;
                                                                                                    try {
                                                                                                        byte b47 = (byte) (-bArr25[c5]);
                                                                                                        short s6 = (short) 713;
                                                                                                        Object invoke6 = Class.forName($$c(b47, (short) ((b47 ^ 144) | (b47 & 144)), (byte) (-bArr25[c6]))).getMethod($$c(b32, s6, bArr25[113]), null).invoke(clsArr8, null);
                                                                                                        int i291 = $11;
                                                                                                        int i292 = ((i291 | 91) << 1) - (i291 ^ 91);
                                                                                                        $10 = i292 % 128;
                                                                                                        int i293 = i292 % 2;
                                                                                                        try {
                                                                                                            byte b48 = (byte) (-bArr25[c5]);
                                                                                                            newInstance = declaredMethod.invoke(null, invoke6, Class.forName($$c(b48, (short) (b48 | 144), (byte) (-bArr25[c6]))).getMethod($$c(b32, s6, bArr25[113]), null).invoke(clsArr27, null), 0);
                                                                                                            try {
                                                                                                                byte b49 = (byte) (-bArr25[c5]);
                                                                                                                Class<?> cls28 = Class.forName($$c(b49, (short) (b49 | 144), (byte) (-bArr25[c6])));
                                                                                                                byte b50 = bArr25[449];
                                                                                                                ((Boolean) cls28.getMethod($$c(b50, (short) ((b50 ^ 660) | (b50 & 660)), bArr25[179]), null).invoke(clsArr8, null)).booleanValue();
                                                                                                                try {
                                                                                                                    byte b51 = (byte) (-bArr25[c5]);
                                                                                                                    Class<?> cls29 = Class.forName($$c(b51, (short) ((b51 ^ 144) | (b51 & 144)), (byte) (-bArr25[c6])));
                                                                                                                    byte b52 = bArr25[449];
                                                                                                                    ((Boolean) cls29.getMethod($$c(b52, (short) ((b52 ^ 660) | (b52 & 660)), bArr25[179]), null).invoke(clsArr27, null)).booleanValue();
                                                                                                                    if (d == null) {
                                                                                                                        int i294 = $11;
                                                                                                                        int i295 = ((i294 | 41) << 1) - (i294 ^ 41);
                                                                                                                        $10 = i295 % 128;
                                                                                                                        if (i295 % 2 != 0) {
                                                                                                                            Object obj6 = null;
                                                                                                                            obj6.hashCode();
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            d = Class.class.getMethod($$c(b32, (short) 732, bArr25[778]), null).invoke(AFa1gSDK.class, null);
                                                                                                                        } catch (Throwable th35) {
                                                                                                                            Throwable cause23 = th35.getCause();
                                                                                                                            if (cause23 == null) {
                                                                                                                                throw th35;
                                                                                                                            }
                                                                                                                            throw cause23;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    s2 = s5;
                                                                                                                    b4 = b32;
                                                                                                                    str3 = str5;
                                                                                                                } catch (Throwable th36) {
                                                                                                                    Throwable cause24 = th36.getCause();
                                                                                                                    if (cause24 == null) {
                                                                                                                        throw th36;
                                                                                                                    }
                                                                                                                    throw cause24;
                                                                                                                }
                                                                                                            } catch (Throwable th37) {
                                                                                                                Throwable cause25 = th37.getCause();
                                                                                                                if (cause25 == null) {
                                                                                                                    throw th37;
                                                                                                                }
                                                                                                                throw cause25;
                                                                                                            }
                                                                                                        } catch (Throwable th38) {
                                                                                                            Throwable cause26 = th38.getCause();
                                                                                                            if (cause26 == null) {
                                                                                                                throw th38;
                                                                                                            }
                                                                                                            throw cause26;
                                                                                                        }
                                                                                                    } catch (Throwable th39) {
                                                                                                        Throwable cause27 = th39.getCause();
                                                                                                        if (cause27 == null) {
                                                                                                            throw th39;
                                                                                                        }
                                                                                                        throw cause27;
                                                                                                    }
                                                                                                } catch (Throwable th40) {
                                                                                                    th = th40;
                                                                                                    byte[] bArr242 = $$a;
                                                                                                    byte b432 = (byte) (-bArr242[c5]);
                                                                                                    Class<?> cls262 = Class.forName($$c(b432, (short) ((b432 ^ 144) | (b432 & 144)), (byte) (-bArr242[c6])));
                                                                                                    byte b442 = bArr242[449];
                                                                                                    ((Boolean) cls262.getMethod($$c(b442, (short) ((b442 ^ 660) | (b442 & 660)), bArr242[179]), null).invoke(clsArr8, null)).booleanValue();
                                                                                                    byte b452 = (byte) (-bArr242[c5]);
                                                                                                    Class<?> cls272 = Class.forName($$c(b452, (short) ((b452 ^ 144) | (b452 & 144)), (byte) (-bArr242[c6])));
                                                                                                    byte b462 = bArr242[449];
                                                                                                    ((Boolean) cls272.getMethod($$c(b462, (short) ((b462 ^ 660) | (b462 & 660)), bArr242[179]), null).invoke(clsArr27, null)).booleanValue();
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (Exception e4) {
                                                                                                e = e4;
                                                                                                i9 = i5;
                                                                                                i12 = i6;
                                                                                                StringBuilder sb82 = new StringBuilder();
                                                                                                byte[] bArr232 = $$a;
                                                                                                StringBuilder append32 = sb82.append($$c(bArr232[c], (short) 651, bArr232[184])).append(clsArr8);
                                                                                                byte b422 = bArr232[108];
                                                                                                throw ((Throwable) Class.forName($$c((byte) (-bArr232[c5]), (short) 315, bArr232[198])).getDeclaredConstructor(String.class, Throwable.class).newInstance(append32.append($$c(b422, (short) ((b422 ^ 307) | (b422 & 307)), bArr232[125])).toString(), e));
                                                                                            } catch (Throwable th41) {
                                                                                                th = th41;
                                                                                                i9 = i5;
                                                                                                i12 = i6;
                                                                                                byte[] bArr2422 = $$a;
                                                                                                byte b4322 = (byte) (-bArr2422[c5]);
                                                                                                Class<?> cls2622 = Class.forName($$c(b4322, (short) ((b4322 ^ 144) | (b4322 & 144)), (byte) (-bArr2422[c6])));
                                                                                                byte b4422 = bArr2422[449];
                                                                                                ((Boolean) cls2622.getMethod($$c(b4422, (short) ((b4422 ^ 660) | (b4422 & 660)), bArr2422[179]), null).invoke(clsArr8, null)).booleanValue();
                                                                                                byte b4522 = (byte) (-bArr2422[c5]);
                                                                                                Class<?> cls2722 = Class.forName($$c(b4522, (short) ((b4522 ^ 144) | (b4522 & 144)), (byte) (-bArr2422[c6])));
                                                                                                byte b4622 = bArr2422[449];
                                                                                                ((Boolean) cls2722.getMethod($$c(b4622, (short) ((b4622 ^ 660) | (b4622 & 660)), bArr2422[179]), null).invoke(clsArr27, null)).booleanValue();
                                                                                                throw th;
                                                                                            }
                                                                                        } catch (Exception e5) {
                                                                                            e = e5;
                                                                                            i8 = i4;
                                                                                        } catch (Throwable th42) {
                                                                                            th = th42;
                                                                                            i8 = i4;
                                                                                        }
                                                                                    } else {
                                                                                        Object obj7 = invoke4;
                                                                                        i8 = i4;
                                                                                        clsArr7 = clsArr5;
                                                                                        i9 = i5;
                                                                                        i12 = i6;
                                                                                        byte b53 = (byte) (-bArr20[c5]);
                                                                                        ?? cls30 = Class.forName($$c(b53, (short) ((b53 ^ 672) | (b53 & 672)), bArr20[347]));
                                                                                        ?? cls31 = Class.forName($$c((byte) (-bArr20[c5]), s5, bArr20[198]));
                                                                                        Object newInstance7 = cls30.getConstructor(new Class[]{cls31}).newInstance(obj7);
                                                                                        Object invoke7 = cls30.getMethod($$c(b32, (short) 772, (byte) (-bArr20[c6])), new Class[0]).invoke(newInstance7, new Object[0]);
                                                                                        Method method7 = Class.forName($$c((byte) (-bArr20[c5]), (short) 783, bArr20[528])).getMethod($$c(b32, (short) 804, bArr20[843]), new Class[0]);
                                                                                        byte b54 = bArr20[1152];
                                                                                        Method method8 = cls31.getMethod($$c((byte) ((b54 & 1) + (b54 | 1)), (short) 638, bArr20[75]), new Class[]{r35});
                                                                                        try {
                                                                                            Object newInstance8 = Class.forName($$c((byte) (-bArr20[c5]), (short) 455, bArr20[987])).getDeclaredConstructor(Class.forName($$c((byte) (-bArr20[c5]), s5, bArr20[198]))).newInstance(newInstance7);
                                                                                            try {
                                                                                                Object invoke8 = Class.class.getMethod($$c(b32, (short) 732, bArr20[778]), null).invoke(AFa1gSDK.class, null);
                                                                                                ?? cls32 = Class.forName($$c((byte) (-bArr20[c5]), (short) 810, bArr20[310]));
                                                                                                Object newInstance9 = cls32.getConstructor(new Class[0]).newInstance(new Object[0]);
                                                                                                byte b55 = (byte) 86;
                                                                                                Method method9 = cls32.getMethod($$c(b55, (short) 655, bArr20[184]), new Class[]{r35, Integer.TYPE, Integer.TYPE});
                                                                                                Method method10 = cls32.getMethod($$c((byte) 83, (short) 838, bArr20[c4]), new Class[0]);
                                                                                                s2 = s5;
                                                                                                Method method11 = Class.forName($$c((byte) (-bArr20[c5]), (short) 848, bArr20[915])).getMethod($$c(bArr20[c2], (short) 372, bArr20[184]), new Class[0]);
                                                                                                byte[] bArr26 = new byte[1024];
                                                                                                int i296 = 0;
                                                                                                while (true) {
                                                                                                    int intValue3 = ((Integer) method8.invoke(newInstance8, bArr26)).intValue();
                                                                                                    if (intValue3 <= 0) {
                                                                                                        b3 = b32;
                                                                                                        str3 = str5;
                                                                                                        i21 = 0;
                                                                                                        break;
                                                                                                    }
                                                                                                    b3 = b32;
                                                                                                    str3 = str5;
                                                                                                    Method method12 = method8;
                                                                                                    if (i296 >= ((Long) method7.invoke(invoke7, new Object[0])).longValue()) {
                                                                                                        i21 = 0;
                                                                                                        break;
                                                                                                    }
                                                                                                    method9.invoke(newInstance9, bArr26, 0, Integer.valueOf(intValue3));
                                                                                                    int i297 = -(-intValue3);
                                                                                                    i296 = (i296 ^ i297) + ((i297 & i296) << 1);
                                                                                                    int i298 = $10;
                                                                                                    int i299 = ((i298 | 25) << 1) - (i298 ^ 25);
                                                                                                    $11 = i299 % 128;
                                                                                                    int i300 = i299 % 2;
                                                                                                    int i301 = 2 % 2;
                                                                                                    b32 = b3;
                                                                                                    str5 = str3;
                                                                                                    method8 = method12;
                                                                                                }
                                                                                                byte[] bArr27 = (byte[]) method10.invoke(newInstance9, new Object[i21]);
                                                                                                try {
                                                                                                    method11.invoke(newInstance8, new Object[i21]);
                                                                                                    method11.invoke(newInstance9, new Object[i21]);
                                                                                                } catch (Exception unused5) {
                                                                                                }
                                                                                                byte[] bArr28 = $$a;
                                                                                                short s7 = (short) 899;
                                                                                                try {
                                                                                                    newInstance = Class.forName($$c(bArr28[449], (short) 864, bArr28[638])).getDeclaredConstructor(Class.forName($$c((byte) (-bArr28[c5]), s7, bArr28[198])), Class.forName($$c((byte) (-bArr28[c5]), (short) 917, (byte) (bArr28[343] - 1)))).newInstance(Class.forName($$c((byte) (-bArr28[c5]), s7, bArr28[198])).getMethod($$c(b55, (short) 937, bArr28[75]), new Class[]{r35}).invoke(null, bArr27), invoke8);
                                                                                                    try {
                                                                                                        Field declaredField = Class.forName($$c(bArr28[449], (short) 940, bArr28[60])).getDeclaredField($$c((byte) (-bArr28[758]), (short) 971, bArr28[415]));
                                                                                                        declaredField.setAccessible(true);
                                                                                                        Object obj8 = declaredField.get(invoke8);
                                                                                                        Class<?> cls33 = obj8.getClass();
                                                                                                        Field declaredField2 = cls33.getDeclaredField($$c((byte) (bArr28[1142] + 1), (short) 978, bArr28[978]));
                                                                                                        declaredField2.setAccessible(true);
                                                                                                        byte b56 = bArr28[1142];
                                                                                                        int currentTimeMillis16 = (int) System.currentTimeMillis();
                                                                                                        int i302 = ~b56;
                                                                                                        int i303 = ~(((-2) ^ i302) | ((-2) & i302));
                                                                                                        int i304 = ~(((-2) ^ currentTimeMillis16) | ((-2) & currentTimeMillis16));
                                                                                                        int i305 = (((-751) + (b56 * (-751))) - (~(-(-(((i303 & i304) | (i303 ^ i304)) * InterfaceC2423fe.c.g))))) - 1;
                                                                                                        int i306 = -(-((~(currentTimeMillis16 | (-2) | b56)) * (-1504)));
                                                                                                        int i307 = (i305 & i306) + (i306 | i305);
                                                                                                        int i308 = ~(((-2) & b56) | ((-2) ^ b56));
                                                                                                        int i309 = ~((i302 ^ 1) | (i302 & 1));
                                                                                                        int i310 = -(-(((i308 & i309) | (i308 ^ i309)) * 752));
                                                                                                        int i311 = $$b;
                                                                                                        Field declaredField3 = cls33.getDeclaredField($$c((byte) ((i307 & i310) + (i310 | i307)), (short) ((i311 & 769) | (i311 ^ 769)), bArr28[474]));
                                                                                                        declaredField3.setAccessible(true);
                                                                                                        Object obj9 = declaredField2.get(obj8);
                                                                                                        Object obj10 = declaredField3.get(obj8);
                                                                                                        Object obj11 = declaredField.get(newInstance);
                                                                                                        ArrayList arrayList = new ArrayList((List) obj9);
                                                                                                        try {
                                                                                                            b4 = b3;
                                                                                                            Class cls34 = (Class) Class.class.getMethod($$c(b4, (short) 1025, bArr28[c3]), null).invoke(obj10.getClass(), null);
                                                                                                            int length2 = Array.getLength(obj10);
                                                                                                            Object newInstance10 = Array.newInstance((Class<?>) cls34, length2);
                                                                                                            for (int i312 = 0; i312 < length2; i312 = ((i312 | 1) << 1) - (i312 ^ 1)) {
                                                                                                                Array.set(newInstance10, i312, Array.get(obj10, i312));
                                                                                                            }
                                                                                                            declaredField2.set(obj11, arrayList);
                                                                                                            declaredField3.set(obj11, newInstance10);
                                                                                                            int currentTimeMillis17 = (int) System.currentTimeMillis();
                                                                                                            int i313 = ~currentTimeMillis17;
                                                                                                            int i314 = (-532442014) + (((i313 & (-1062203072)) | (i313 ^ (-1062203072)) | 134407169) * 1444);
                                                                                                            int i315 = ~(((-420144258) & currentTimeMillis17) | ((-420144258) ^ currentTimeMillis17));
                                                                                                            int i316 = (i315 & 134407169) | (134407169 ^ i315);
                                                                                                            int i317 = ~((currentTimeMillis17 & (-776465984)) | ((-776465984) ^ currentTimeMillis17));
                                                                                                            int i318 = ((i317 & i316) | (i316 ^ i317)) * (-1444);
                                                                                                            int i319 = ((i314 | i318) << 1) - (i318 ^ i314);
                                                                                                            int i320 = ((i319 | (-146256932)) << 1) - ((-146256932) ^ i319);
                                                                                                            int currentTimeMillis18 = (int) System.currentTimeMillis();
                                                                                                            int i321 = ~currentTimeMillis18;
                                                                                                            int i322 = ~((i321 & (-120898215)) | (i321 ^ (-120898215)));
                                                                                                            int i323 = -(-((1677192328 | i322) * 764));
                                                                                                            int i324 = (729969597 & i323) + (i323 | 729969597);
                                                                                                            int i325 = ~currentTimeMillis18;
                                                                                                            int i326 = ~((i325 & 1677192328) | (i325 ^ 1677192328));
                                                                                                            int i327 = -(-(((i326 & (-1744301743)) | ((-1744301743) ^ i326)) * (-1528)));
                                                                                                            int i328 = (i324 ^ i327) + ((i327 & i324) << 1);
                                                                                                            int i329 = (((-1690512943) & i322) | ((-1690512943) ^ i322)) * 764;
                                                                                                            if (i320 > (i328 & i329) + (i329 | i328)) {
                                                                                                                throw null;
                                                                                                            }
                                                                                                            if (d == null) {
                                                                                                                d = newInstance;
                                                                                                                int i330 = 2 % 2;
                                                                                                            }
                                                                                                        } catch (Throwable th43) {
                                                                                                            Throwable cause28 = th43.getCause();
                                                                                                            if (cause28 == null) {
                                                                                                                throw th43;
                                                                                                            }
                                                                                                            throw cause28;
                                                                                                        }
                                                                                                    } catch (Exception e6) {
                                                                                                        StringBuilder sb9 = new StringBuilder();
                                                                                                        byte[] bArr29 = $$a;
                                                                                                        StringBuilder append4 = sb9.append($$c(bArr29[c], (short) IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION, bArr29[184])).append(invoke8);
                                                                                                        byte b57 = bArr29[108];
                                                                                                        try {
                                                                                                            throw ((Throwable) Class.forName($$c((byte) (-bArr29[c5]), (short) 315, bArr29[198])).getDeclaredConstructor(String.class, Throwable.class).newInstance(append4.append($$c(b57, (short) (b57 | 307), bArr29[125])).toString(), e6));
                                                                                                        } catch (Throwable th44) {
                                                                                                            Throwable cause29 = th44.getCause();
                                                                                                            if (cause29 == null) {
                                                                                                                throw th44;
                                                                                                            }
                                                                                                            throw cause29;
                                                                                                        }
                                                                                                    }
                                                                                                } catch (Throwable th45) {
                                                                                                    Throwable cause30 = th45.getCause();
                                                                                                    if (cause30 == null) {
                                                                                                        throw th45;
                                                                                                    }
                                                                                                    throw cause30;
                                                                                                }
                                                                                            } catch (Throwable th46) {
                                                                                                Throwable cause31 = th46.getCause();
                                                                                                if (cause31 == null) {
                                                                                                    throw th46;
                                                                                                }
                                                                                                throw cause31;
                                                                                            }
                                                                                        } catch (Throwable th47) {
                                                                                            Throwable cause32 = th47.getCause();
                                                                                            if (cause32 == null) {
                                                                                                throw th47;
                                                                                            }
                                                                                            throw cause32;
                                                                                        }
                                                                                    }
                                                                                    Object obj12 = newInstance;
                                                                                    if (!(!z6)) {
                                                                                        int i331 = $10 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                                                                                        $11 = i331 % 128;
                                                                                        int i332 = i331 % 2;
                                                                                        try {
                                                                                            byte[] bArr30 = $$a;
                                                                                            Class<?> cls35 = Class.forName($$c(bArr30[449], (short) 687, (byte) ((-2) - (bArr30[343] ^ (-1)))));
                                                                                            byte b58 = bArr30[1142];
                                                                                            int currentTimeMillis19 = (int) System.currentTimeMillis();
                                                                                            int i333 = (-284) + (b58 * (-282));
                                                                                            int i334 = ~b58;
                                                                                            int i335 = ~currentTimeMillis19;
                                                                                            int i336 = -(-(((i334 & i335) | (i334 ^ i335)) * (-283)));
                                                                                            int i337 = (i333 ^ i336) + ((i336 & i333) << 1);
                                                                                            int i338 = ~b58;
                                                                                            int i339 = (~((i338 ^ (-1)) | i338)) * 283;
                                                                                            Method declaredMethod2 = cls35.getDeclaredMethod($$c((byte) (((((i337 | i339) << 1) - (i339 ^ i337)) - (~(-(-((~((i338 & currentTimeMillis19) | (i338 ^ currentTimeMillis19))) * 283))))) - 1), (short) IronSourceError.ERROR_BN_LOAD_FAILED_NO_CANDIDATES, bArr30[159]), String.class, Class.forName($$c((byte) (-bArr30[c5]), (short) 917, (byte) (bArr30[343] - 1))));
                                                                                            declaredMethod2.setAccessible(true);
                                                                                            try {
                                                                                                ?? invoke9 = declaredMethod2.invoke(obj12, str3, Class.class.getMethod($$c(b4, (short) 732, bArr30[778]), null).invoke(AFa1gSDK.class, null));
                                                                                                if (invoke9 != null) {
                                                                                                    cls35.getDeclaredMethod($$c(bArr30[c2], (short) 372, bArr30[184]), new Class[0]).invoke(obj12, new Object[0]);
                                                                                                }
                                                                                                cls2 = invoke9;
                                                                                            } catch (Throwable th48) {
                                                                                                Throwable cause33 = th48.getCause();
                                                                                                if (cause33 == null) {
                                                                                                    throw th48;
                                                                                                }
                                                                                                throw cause33;
                                                                                            }
                                                                                        } catch (Throwable th49) {
                                                                                            th = th49;
                                                                                            th = th;
                                                                                            zArr6 = zArr6;
                                                                                            zipFile.close();
                                                                                            throw th;
                                                                                        }
                                                                                    } else {
                                                                                        String str6 = str3;
                                                                                        byte[] bArr31 = $$a;
                                                                                        Class<?> cls36 = Class.forName($$c((byte) (-bArr31[c5]), (short) 917, (byte) (bArr31[343] - 1)));
                                                                                        byte b59 = bArr31[1142];
                                                                                        int currentTimeMillis20 = (int) System.currentTimeMillis();
                                                                                        int i340 = -(-(b59 * (-279)));
                                                                                        int i341 = (((-141) | i340) << 1) - (i340 ^ (-141));
                                                                                        int i342 = ((b59 ^ currentTimeMillis20) | (b59 & currentTimeMillis20)) * 140;
                                                                                        int i343 = ((i341 | i342) << 1) - (i342 ^ i341);
                                                                                        int i344 = ~b59;
                                                                                        int i345 = ~currentTimeMillis20;
                                                                                        int i346 = ~((i345 & b59) | (i345 ^ b59));
                                                                                        int i347 = i343 + (((i344 & i346) | (i344 ^ i346)) * (-280));
                                                                                        int i348 = ~b59;
                                                                                        int i349 = ~(i348 | (i348 ^ (-1)));
                                                                                        int i350 = ~currentTimeMillis20;
                                                                                        int i351 = ~(i350 | (i350 ^ (-1)));
                                                                                        int i352 = (i349 & i351) | (i349 ^ i351);
                                                                                        int i353 = ~((b59 & currentTimeMillis20) | (b59 ^ currentTimeMillis20));
                                                                                        Method declaredMethod3 = cls36.getDeclaredMethod($$c((byte) ((i347 - (~(((i353 & i352) | (i352 ^ i353)) * 140))) - 1), (short) IronSourceError.ERROR_BN_LOAD_FAILED_NO_CANDIDATES, bArr31[159]), String.class);
                                                                                        try {
                                                                                            declaredMethod3.setAccessible(true);
                                                                                            cls2 = declaredMethod3.invoke(obj12, str6);
                                                                                        } catch (InvocationTargetException e7) {
                                                                                            try {
                                                                                                throw ((Exception) e7.getCause());
                                                                                            } catch (ClassNotFoundException unused6) {
                                                                                                cls2 = null;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (cls2 == null) {
                                                                                        break;
                                                                                    }
                                                                                    cls18 = cls2;
                                                                                    byte[] bArr32 = $$a;
                                                                                    str5 = $$c(bArr32[c2], (short) 1052, bArr32[214]);
                                                                                    Constructor declaredConstructor = cls18.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                    declaredConstructor.setAccessible(true);
                                                                                    if (z6) {
                                                                                        int i354 = 2 % 2;
                                                                                        z7 = false;
                                                                                    } else {
                                                                                        int i355 = $10;
                                                                                        int i356 = ((i355 | Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) << 1) - (i355 ^ Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                                                                                        $11 = i356 % 128;
                                                                                        int i357 = i356 % 2;
                                                                                        z7 = true;
                                                                                    }
                                                                                    i = declaredConstructor.newInstance(obj12, Boolean.valueOf(z7));
                                                                                    bArr18 = new byte[12790];
                                                                                    try {
                                                                                        short s8 = s2;
                                                                                        int i358 = 2 % 2;
                                                                                        try {
                                                                                            short s9 = (short) 499;
                                                                                            Object newInstance11 = Class.forName($$c((byte) (-bArr32[c5]), s9, (byte) (-bArr32[779]))).getDeclaredConstructor(Class.forName($$c((byte) (-bArr32[c5]), s8, bArr32[198]))).newInstance(Class.forName($$c((byte) (-bArr32[c5]), (short) 455, bArr32[987])).getDeclaredConstructor(Class.forName($$c((byte) (-bArr32[c5]), s8, bArr32[198]))).newInstance(zipFile.getInputStream(zipFile.getEntry($$c(bArr32[13], (short) 1084, bArr32[i141]).substring(1)))));
                                                                                            try {
                                                                                                Class.forName($$c((byte) (-bArr32[c5]), s9, (byte) (-bArr32[779]))).getMethod($$c((byte) (bArr32[1152] + 1), (short) 521, bArr32[159]), new Class[]{r35}).invoke(newInstance11, bArr18);
                                                                                                try {
                                                                                                    Class.forName($$c((byte) (-bArr32[c5]), s9, (byte) (-bArr32[779]))).getMethod($$c(bArr32[c2], (short) 372, bArr32[184]), null).invoke(newInstance11, null);
                                                                                                    i202 = Math.abs(i20);
                                                                                                    i203 = 12748;
                                                                                                    b32 = b4;
                                                                                                    clsArr4 = clsArr6;
                                                                                                    i4 = i8;
                                                                                                    clsArr5 = clsArr7;
                                                                                                    i5 = i9;
                                                                                                    z4 = z6;
                                                                                                    i6 = i12;
                                                                                                    r27 = 0;
                                                                                                    i19 = 4;
                                                                                                } catch (Throwable th50) {
                                                                                                    Throwable cause34 = th50.getCause();
                                                                                                    if (cause34 == null) {
                                                                                                        throw th50;
                                                                                                    }
                                                                                                    throw cause34;
                                                                                                }
                                                                                            } catch (Throwable th51) {
                                                                                                Throwable cause35 = th51.getCause();
                                                                                                if (cause35 == null) {
                                                                                                    throw th51;
                                                                                                }
                                                                                                throw cause35;
                                                                                            }
                                                                                        } catch (Throwable th52) {
                                                                                            Throwable cause36 = th52.getCause();
                                                                                            if (cause36 == null) {
                                                                                                throw th52;
                                                                                            }
                                                                                            throw cause36;
                                                                                        }
                                                                                    } catch (Throwable th53) {
                                                                                        Throwable cause37 = th53.getCause();
                                                                                        if (cause37 == null) {
                                                                                            throw th53;
                                                                                        }
                                                                                        throw cause37;
                                                                                    }
                                                                                } catch (Throwable th54) {
                                                                                    Throwable cause38 = th54.getCause();
                                                                                    if (cause38 == null) {
                                                                                        throw th54;
                                                                                    }
                                                                                    throw cause38;
                                                                                }
                                                                            } catch (Throwable th55) {
                                                                                th = th55;
                                                                                zArr6 = zArr6;
                                                                                i8 = i4;
                                                                                i9 = i5;
                                                                                i12 = i6;
                                                                                th = th;
                                                                                zArr6 = zArr6;
                                                                                zipFile.close();
                                                                                throw th;
                                                                            }
                                                                        }
                                                                    } catch (Throwable th56) {
                                                                        Throwable cause39 = th56.getCause();
                                                                        if (cause39 == null) {
                                                                            throw th56;
                                                                        }
                                                                        throw cause39;
                                                                    }
                                                                } catch (Throwable th57) {
                                                                    Throwable cause40 = th57.getCause();
                                                                    if (cause40 == null) {
                                                                        throw th57;
                                                                    }
                                                                    throw cause40;
                                                                }
                                                            } catch (Throwable th58) {
                                                                th = th58;
                                                                Throwable cause41 = th.getCause();
                                                                if (cause41 == null) {
                                                                    throw th;
                                                                }
                                                                throw cause41;
                                                            }
                                                        } catch (Throwable th59) {
                                                            th = th59;
                                                        }
                                                    } catch (Throwable th60) {
                                                        Throwable cause42 = th60.getCause();
                                                        if (cause42 == null) {
                                                            throw th60;
                                                        }
                                                        throw cause42;
                                                    }
                                                } catch (Throwable th61) {
                                                    th = th61;
                                                    zArr6 = zArr3;
                                                }
                                            } catch (Throwable th62) {
                                                Throwable cause43 = th62.getCause();
                                                if (cause43 == null) {
                                                    throw th62;
                                                }
                                                throw cause43;
                                            }
                                        } catch (Throwable th63) {
                                            Throwable cause44 = th63.getCause();
                                            if (cause44 == null) {
                                                throw th63;
                                            }
                                            throw cause44;
                                        }
                                    }
                                    i5 = i9;
                                    int i359 = ((i11 | (-109)) << 1) - (i11 ^ (-109));
                                    i6 = (i359 ^ 110) + ((i359 & 110) << 1);
                                    i26 = i7;
                                    clsArr9 = clsArr;
                                    i25 = i10;
                                    i27 = 1;
                                    cls3 = r35;
                                    objArr = objArr2;
                                    zArr2 = zArr5;
                                    zArr = zArr4;
                                    zArr3 = zArr6;
                                    i4 = i8;
                                    i2 = 5;
                                    i3 = 4;
                                    z2 = z3;
                                }
                                return;
                            }
                            invoke3 = null;
                            if (invoke == null) {
                            }
                            i2 = 5;
                            if (invoke3 == null) {
                            }
                            if (invoke2 == null) {
                                byte[] bArr52 = $$a;
                                Object[] objArr42 = new Object[2];
                                objArr42[1] = $$c(bArr52[c2], (short) 266, bArr52[417]);
                                objArr42[z ? 1 : 0] = invoke;
                                byte b142 = (byte) (-bArr52[c5]);
                                Class<?> cls62 = Class.forName($$c(b142, (short) ((b142 ^ 144) | (b142 & 144)), (byte) (-bArr52[c6])));
                                Class<?>[] clsArr102 = new Class[2];
                                byte b152 = (byte) (-bArr52[c5]);
                                clsArr102[z ? 1 : 0] = Class.forName($$c(b152, (short) (b152 | 144), (byte) (-bArr52[c6])));
                                clsArr102[1] = String.class;
                                invoke2 = cls62.getDeclaredConstructor(clsArr102).newInstance(objArr42);
                            }
                            byte[] bArr62 = $$a;
                            byte b162 = (byte) (-bArr62[c5]);
                            objArr = (Object[]) Array.newInstance(Class.forName($$c(b162, (short) ((b162 ^ 144) | (b162 & 144)), (byte) (-bArr62[c6]))), 7);
                            objArr[z ? 1 : 0] = null;
                            objArr[1] = invoke2;
                            objArr[2] = invoke;
                            objArr[3] = invoke3;
                            i3 = 4;
                            objArr[4] = invoke2;
                            objArr[5] = invoke;
                            objArr[6] = invoke3;
                            zArr = new boolean[]{false, true, true, true, true, true, true};
                            zArr2 = new boolean[]{false, false, false, false, true, true, true};
                            zArr3 = new boolean[7];
                            zArr3[z ? 1 : 0] = z;
                            zArr3[1] = z;
                            zArr3[2] = true;
                            zArr3[3] = true;
                            zArr3[4] = z;
                            zArr3[5] = true;
                            zArr3[6] = true;
                            Class<?> cls72 = Class.forName($$c(bArr62[62], (short) 275, bArr62[978]));
                            i24 = cls72.getDeclaredField($$c(bArr62[889], (short) 298, bArr62[843])).getInt(cls72);
                            if (i24 < 34) {
                            }
                            if (i24 != 29) {
                                zArr3[z ? 1 : 0] = (i24 != 29 && i24 >= 26) ? true : z ? 1 : 0;
                                if (i24 >= 21) {
                                }
                                zArr3[1] = z8;
                                zArr3[4] = i24 >= 21 ? true : z ? 1 : 0;
                                i5 = z ? 1 : 0;
                                i6 = i5;
                                z2 = z;
                                while (i5 == 0) {
                                    if (zArr3[i6]) {
                                    }
                                    i5 = i9;
                                    int i3592 = ((i11 | (-109)) << 1) - (i11 ^ (-109));
                                    i6 = (i3592 ^ 110) + ((i3592 & 110) << 1);
                                    i26 = i7;
                                    clsArr9 = clsArr;
                                    i25 = i10;
                                    i27 = 1;
                                    cls3 = r35;
                                    objArr = objArr2;
                                    zArr2 = zArr5;
                                    zArr = zArr4;
                                    zArr3 = zArr6;
                                    i4 = i8;
                                    i2 = 5;
                                    i3 = 4;
                                    z2 = z3;
                                }
                            }
                            zArr3[z ? 1 : 0] = (i24 != 29 && i24 >= 26) ? true : z ? 1 : 0;
                            if (i24 >= 21) {
                            }
                            zArr3[1] = z8;
                            zArr3[4] = i24 >= 21 ? true : z ? 1 : 0;
                            i5 = z ? 1 : 0;
                            i6 = i5;
                            z2 = z;
                            while (i5 == 0) {
                            }
                        }
                        invoke2 = null;
                        if (obj != null) {
                        }
                        invoke3 = null;
                        if (invoke == null) {
                        }
                        i2 = 5;
                        if (invoke3 == null) {
                        }
                        if (invoke2 == null) {
                        }
                        byte[] bArr622 = $$a;
                        byte b1622 = (byte) (-bArr622[c5]);
                        objArr = (Object[]) Array.newInstance(Class.forName($$c(b1622, (short) ((b1622 ^ 144) | (b1622 & 144)), (byte) (-bArr622[c6]))), 7);
                        objArr[z ? 1 : 0] = null;
                        objArr[1] = invoke2;
                        objArr[2] = invoke;
                        objArr[3] = invoke3;
                        i3 = 4;
                        objArr[4] = invoke2;
                        objArr[5] = invoke;
                        objArr[6] = invoke3;
                        zArr = new boolean[]{false, true, true, true, true, true, true};
                        zArr2 = new boolean[]{false, false, false, false, true, true, true};
                        zArr3 = new boolean[7];
                        zArr3[z ? 1 : 0] = z;
                        zArr3[1] = z;
                        zArr3[2] = true;
                        zArr3[3] = true;
                        zArr3[4] = z;
                        zArr3[5] = true;
                        zArr3[6] = true;
                        Class<?> cls722 = Class.forName($$c(bArr622[62], (short) 275, bArr622[978]));
                        i24 = cls722.getDeclaredField($$c(bArr622[889], (short) 298, bArr622[843])).getInt(cls722);
                        if (i24 < 34) {
                        }
                        zArr3[z ? 1 : 0] = (i24 != 29 && i24 >= 26) ? true : z ? 1 : 0;
                        if (i24 >= 21) {
                        }
                        zArr3[1] = z8;
                        zArr3[4] = i24 >= 21 ? true : z ? 1 : 0;
                        i5 = z ? 1 : 0;
                        i6 = i5;
                        z2 = z;
                        while (i5 == 0) {
                        }
                    }
                    invoke = null;
                    if (obj != null) {
                    }
                    invoke2 = null;
                    if (obj != null) {
                    }
                    invoke3 = null;
                    if (invoke == null) {
                    }
                    i2 = 5;
                    if (invoke3 == null) {
                    }
                    if (invoke2 == null) {
                    }
                    byte[] bArr6222 = $$a;
                    byte b16222 = (byte) (-bArr6222[c5]);
                    objArr = (Object[]) Array.newInstance(Class.forName($$c(b16222, (short) ((b16222 ^ 144) | (b16222 & 144)), (byte) (-bArr6222[c6]))), 7);
                    objArr[z ? 1 : 0] = null;
                    objArr[1] = invoke2;
                    objArr[2] = invoke;
                    objArr[3] = invoke3;
                    i3 = 4;
                    objArr[4] = invoke2;
                    objArr[5] = invoke;
                    objArr[6] = invoke3;
                    zArr = new boolean[]{false, true, true, true, true, true, true};
                    zArr2 = new boolean[]{false, false, false, false, true, true, true};
                    zArr3 = new boolean[7];
                    zArr3[z ? 1 : 0] = z;
                    zArr3[1] = z;
                    zArr3[2] = true;
                    zArr3[3] = true;
                    zArr3[4] = z;
                    zArr3[5] = true;
                    zArr3[6] = true;
                    Class<?> cls7222 = Class.forName($$c(bArr6222[62], (short) 275, bArr6222[978]));
                    i24 = cls7222.getDeclaredField($$c(bArr6222[889], (short) 298, bArr6222[843])).getInt(cls7222);
                    if (i24 < 34) {
                    }
                    zArr3[z ? 1 : 0] = (i24 != 29 && i24 >= 26) ? true : z ? 1 : 0;
                    if (i24 >= 21) {
                    }
                    zArr3[1] = z8;
                    zArr3[4] = i24 >= 21 ? true : z ? 1 : 0;
                    i5 = z ? 1 : 0;
                    i6 = i5;
                    z2 = z;
                    while (i5 == 0) {
                    }
                }
                byte[] bArr33 = $$a;
                Class<?> cls37 = Class.forName($$c(bArr33[62], (short) Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, bArr33[528]));
                byte b60 = (byte) 70;
                short s10 = (short) 153;
                byte b61 = bArr33[343];
                char c7 = 262;
                str2 = $$c;
                int currentTimeMillis21 = (int) System.currentTimeMillis();
                int i360 = -(-(b61 * 253));
                int i361 = ((-253) ^ i360) + (((-253) & i360) << 1);
                int i362 = ~b61;
                char c8 = 19;
                int i363 = ~i362;
                char c9 = 743;
                int i364 = ~currentTimeMillis21;
                int i365 = ~((i362 ^ i364) | (i362 & i364));
                int i366 = (i363 & i365) | (i363 ^ i365);
                int i367 = ((-1) ^ b61) | b61;
                int i368 = ~(i367 | currentTimeMillis21);
                int i369 = ((i366 & i368) | (i366 ^ i368)) * (-252);
                int i370 = (i361 ^ i369) + ((i361 & i369) << 1);
                int i371 = (i370 & 252) + (i370 | 252);
                int i372 = -(-((~((currentTimeMillis21 & i367) | (i367 ^ currentTimeMillis21))) * 252));
                Method method13 = cls37.getMethod($$c(b60, s10, (byte) (((i371 | i372) << 1) - (i371 ^ i372))), new Class[0]);
                obj = method13.invoke(null, null);
                int i373 = 2 % 2;
                c3 = c7;
                c2 = c8;
                c = c9;
                if (obj != null) {
                }
                invoke = null;
                if (obj != null) {
                }
                invoke2 = null;
                if (obj != null) {
                }
                invoke3 = null;
                if (invoke == null) {
                }
                i2 = 5;
                if (invoke3 == null) {
                }
                if (invoke2 == null) {
                }
                byte[] bArr62222 = $$a;
                byte b162222 = (byte) (-bArr62222[c5]);
                objArr = (Object[]) Array.newInstance(Class.forName($$c(b162222, (short) ((b162222 ^ 144) | (b162222 & 144)), (byte) (-bArr62222[c6]))), 7);
                objArr[z ? 1 : 0] = null;
                objArr[1] = invoke2;
                objArr[2] = invoke;
                objArr[3] = invoke3;
                i3 = 4;
                objArr[4] = invoke2;
                objArr[5] = invoke;
                objArr[6] = invoke3;
                zArr = new boolean[]{false, true, true, true, true, true, true};
                zArr2 = new boolean[]{false, false, false, false, true, true, true};
                zArr3 = new boolean[7];
                zArr3[z ? 1 : 0] = z;
                zArr3[1] = z;
                zArr3[2] = true;
                zArr3[3] = true;
                zArr3[4] = z;
                zArr3[5] = true;
                zArr3[6] = true;
                Class<?> cls72222 = Class.forName($$c(bArr62222[62], (short) 275, bArr62222[978]));
                i24 = cls72222.getDeclaredField($$c(bArr62222[889], (short) 298, bArr62222[843])).getInt(cls72222);
                if (i24 < 34) {
                }
                zArr3[z ? 1 : 0] = (i24 != 29 && i24 >= 26) ? true : z ? 1 : 0;
                if (i24 >= 21) {
                }
                zArr3[1] = z8;
                zArr3[4] = i24 >= 21 ? true : z ? 1 : 0;
                i5 = z ? 1 : 0;
                i6 = i5;
                z2 = z;
                while (i5 == 0) {
                }
            } catch (Exception e8) {
                throw new RuntimeException(e8);
            }
        } catch (Throwable th64) {
            Throwable cause45 = th64.getCause();
            if (cause45 == null) {
                throw th64;
            }
            throw cause45;
        }
    }

    public static int getCurrencyIso4217Code(int i2) {
        Object obj;
        int i3 = 2 % 2;
        int i4 = $10 + 13;
        int i5 = i4 % 128;
        $11 = i5;
        if (i4 % 2 == 0) {
            obj = i;
            int i6 = 44 / 0;
        } else {
            obj = i;
        }
        int i7 = (i5 & Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) + (i5 | Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
        int i8 = i7 % 128;
        $10 = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 25;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i2)};
            byte b = $$a[19];
            return ((Integer) Class.forName($$c(b, (short) ((b ^ Ascii.DLE) | (b & Ascii.DLE)), r0[214]), true, (ClassLoader) d).getMethod($$c(r0[915], (short) 1154, r0[113]), Integer.TYPE).invoke(obj, objArr)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int AFAdRevenueData(Object obj) {
        Object obj2;
        int i2 = 2 % 2;
        int i3 = $11;
        int i4 = (i3 & 25) + (i3 | 25);
        int i5 = i4 % 128;
        $10 = i5;
        if (i4 % 2 != 0) {
            obj2 = i;
            int i6 = 27 / 0;
        } else {
            obj2 = i;
        }
        int i7 = (i5 ^ 83) + ((i5 & 83) << 1);
        $11 = i7 % 128;
        int i8 = i7 % 2;
        try {
            byte b = $$a[19];
            int intValue = ((Integer) Class.forName($$c(b, (short) ((b ^ Ascii.DLE) | (b & Ascii.DLE)), r1[214]), true, (ClassLoader) d).getMethod($$c((byte) 70, (short) LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, r1[417]), Object.class).invoke(obj2, obj)).intValue();
            int i9 = $11 + 19;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object getMonetizationNetwork(int i2, int i3, char c) {
        int i4 = 2 % 2;
        int i5 = $11 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        int i6 = i5 % 128;
        $10 = i6;
        int i7 = i5 % 2;
        Object obj = i;
        int i8 = (i6 ^ 95) + ((i6 & 95) << 1);
        $11 = i8 % 128;
        int i9 = i8 % 2;
        int i10 = (i6 & 35) + (i6 | 35);
        $11 = i10 % 128;
        int i11 = i10 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(c)};
            byte b = $$a[19];
            Object invoke = Class.forName($$c(b, (short) ((b ^ Ascii.DLE) | (b & Ascii.DLE)), r8[214]), true, (ClassLoader) d).getMethod($$c((byte) 70, (short) LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, r8[417]), Integer.TYPE, Integer.TYPE, Character.TYPE).invoke(obj, objArr);
            int i12 = $10;
            int i13 = (i12 ^ 109) + ((i12 & 109) << 1);
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 54 / 0;
            }
            return invoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private AFa1gSDK() {
    }

    private static void getMediationNetwork(int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = $11;
        int i6 = (i5 & 77) + (i5 | 77);
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }
}
