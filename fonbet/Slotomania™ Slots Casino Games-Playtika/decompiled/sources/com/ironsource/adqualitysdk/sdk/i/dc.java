package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.exoplayer2.C;
import com.ironsource.B5;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class dc implements ch {

    /* renamed from: טּ, reason: contains not printable characters */
    private static int f1660 = 0;

    /* renamed from: סּ, reason: contains not printable characters */
    private static int f1661 = 1;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static char[] f1662;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static long f1663;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final cy f1674 = new cy();

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final df f1672 = new df();

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final cv f1675 = new cv();

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final cx f1676 = new cx();

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final da f1673 = new da();

    /* renamed from: ﻏ, reason: contains not printable characters */
    private final de f1671 = new de();

    /* renamed from: ﮐ, reason: contains not printable characters */
    private final cz f1667 = new cz();

    /* renamed from: ﱡ, reason: contains not printable characters */
    private final cr f1669 = new cr();

    /* renamed from: ﺙ, reason: contains not printable characters */
    private final cu f1670 = new cu();

    /* renamed from: ﱟ, reason: contains not printable characters */
    private final cs f1668 = new cs();

    /* renamed from: ﮉ, reason: contains not printable characters */
    private final db f1666 = new db();

    /* renamed from: ﭴ, reason: contains not printable characters */
    private final co f1664 = new co();

    /* renamed from: ﭸ, reason: contains not printable characters */
    private final ct f1665 = new ct();

    static {
        char[] cArr = new char[2078];
        ByteBuffer.wrap("\u0000c\u001a\n4ºOViÞ\u0083\u008a\u009e1¸\u00adÓmíã\u0007\u0086\"%<ÕWDqõ´â®\u008b\u0080;û×Ý_7\u000b*°\f,gæYn³\u0019\u0096³\u0088^ãÔÇ\u008eÝéóW\u0088\u0085®\bDbYÅ\u007fO\u0014¯*\u0010ÀQåÍû:\u0090¦a[{(U\u0096.D\bÉâ£ÿ\u0004Ù\u008e²n\u008cÑf\u0090C\f]û6g\u0088(\u0092O¼ñÇ!á¿\u000bá\u0016t0î[1e«\u008fØªo´µß\u001cù¦\u0003É.^H\u0099S!}Y\u0087Ý¢oÌ\u0095×%\u0000i\u001a\u00164\u009cOFiñ\u0083\u008e\u009e\b¸ªÓ[íä\u0007\u0090\";<Ù>ÿ$\u0098\n&qáWe½\u0004 ±E¢_Åq{\n©,>ÆRÛïýc\u0096\u0083¨<Bagûy\u001c\u0012\u0093\u008e¯\u0094ÈºvÁ¡ç5\rT\u0010ú6o0\u0088*ï\u0004Q\u007f\u0086Y\u0012³s®Ý\u0088Hã´\u0000g\u001a\u00004¾Oiiý\u0083\u008b\u009e-¸·Óníä\u0007\u0097\";<ØWnqà\u008b¿¦)ÀÅÛ\u007f\u0000g\u001a\u00004¾Oiiý\u0083\u008b\u009e-¸·Óníä\u0007\u0097\";<ØWvqï\u008b\u009f¦8ÀåÛhõ\u001a\u000f\u0082* DÖÌ\u0002ÖvøÎ\u0083/¥\u0081OýRytË\u001f,!\u0080Ë÷îrð¸\u009b&½¥GÿjX\f¸\u0017\u001f9{Ã÷Â-ØJöô\u008d(«»AÇ\\|zæ\u0011\u0006}Óg´I\n2Ö\u0014Eþ9ã\u0082Å\u0018®ø\u0090J\u0000c\u001a\u00174¯ONià\u0083\u009c\u009e\u0013¸¦Ó\\íå\u0007\u009d\"3<øWDqà\u008b©¦%ÀÜÛvõ\u001b\u000f\u0081*;\tº\u0013Ý=cF´` \u008aV\u0097ð±jÚ¦ä$\u000e]+ã5\u000f^\u009b\u0000c\u001a\u00174¯ONià\u0083\u009c\u009e\r¸¦ÓIíÿ\u0007\u0091\"?<øWDqà\u008b©¦%ÀÜÛvõ\u001b\u000f\u0081*;¤\u0010¾w\u0090Éë\u0017Í\u0081'ä:L\u001c×w+\u0000g\u001a\u00004¾O`iö\u0083\u0093\u009e;¸ Ó\\íþ\u0000g\u001a\u00004¾O`iö\u0083\u0093\u009e;¸ Ó\\íË\u0007\u009b\"2<ÐWE\u0000g\u001a\u00004¾O`iö\u0083\u0093\u009e;¸ Ó\\íÛ\u0007\u0093\";<ÉWD\u0000g\u001a\u00004¾O`iö\u0083\u0093\u009e;¸ Ó\\íË\u0007\u009b\"2<ÐWEqõ\u0000g\u001a\u00004¾O`iö\u0083\u0093\u009e;¸ Ó\\íÛ\u0007\u0093\";<ÉWDqõ\u001f \u0005Ç+cP\u008dv!\u009c_\u0081í§aÌ«ò/\u0018W=å#\u001cHµn5\u0094^¹þß\u001cÄºK\u0000Qv\u007fÎ\u0004*\"\u008bÈàÕFóö\u00981¦\u0096Lôi@w¸\u001c2K*QM\u007fó\u0004#\"µÈØÕ@óú\u0098\u0017¦©LÑi}w\u0082\f\u0083\u0016ä8ZC\u008ae\u001c\u008fq\u0092è´Bß«á\f\u000bn.þ09[±}\u0001\u0087gªÑÌ\"\u009e\u0087\u0084àª^Ñ\u0089÷\u001d\u001dk\u0000Í&WM\u009as\b\u0099u¼Ò¢$É\u008cï\u0007\u0015\u007f8Ó^=\u0000i\u001a\u00164\u008dOuiý\u0083\u0089\u009e\u001d¸¬ÓEíý\u0007\u0080\"2<ÏWRqã\u008b\u008f¦\u0003ÀÁÛhõ\u0016\u000f\u008a*.\u0000d\u001a\u00004©O@iù\u0083\u0089\u009e,¸¦Ó[íþ\u0007µ\"\r<ÕWQqÕ\u008b\u009f¦\"ÀÜÛtõ\u0018¸R¢&\u008c\u009e÷\u007fÑÑ;\u00ad&)\u0000\u0080kxUÑ¿¦\u009a*\u0084äïcÉÃ3¿\u001e\u000fxácY\u0000s\u001a\u00004¾OZiä\u0083¿\u009e,¸¢ÓEíè\u0007¾\"><ÏWUqã\u008b\u0085¦5ÀÇGd]\u0016s±\bV.ôÄ\u008aÙ\u000eÿ§\u0094_ªö@\u0081e\r{Ã\u0010D6äÌ\u0098á(\u0087Æ\u009c~\u0000r\u001a\u00004ºOCiõ\u0083\u009a\u009e;¸\u008cÓFíÎ\u0007\u009e\"><ßWJqÊ\u008b\u0082¦#ÀÁÛ\u007fõ\u0011\u000f\u0081*;\u0000c\u001a\u00174¯ONià\u0083\u009c\u009e\b¸ªÓMíú\u0007½\"9<ÿWMqï\u008b\u0088¦;ÀùÛsõ\f\u000f\u0090*,DÀ_vy\n\u0000r\u001a\u00004ºOCiõ\u0083\u009a\u009e;¸\u008cÓFíÙ\u0007\u009d\"\"<ßWIqÊ\u008b\u0082¦#ÀÁÛ\u007fõ\u0011\u000f\u0081*;\u0000c\u001a\u00174¯ONià\u0083\u009c\u009e\b¸ªÓMíú\u0007½\"9<èWNqó\u008b\u0088¦8ÀùÛsõ\f\u000f\u0090*,DÀ_vy\n\u0014\u0091\u000eö H[\u0096}\f\u0097L\u008aÄ¬\\Ç½ù\u0010\u0013H6È(9C£e\u0015\u009fs²ÃÔ1\u0002~\u0018\u00196§Mykã\u0081´\u009c(º¯ÑRïü\u0005§ '>ÖULsú\u0089\u009c¤,ÂÞ\u0000c\u001a\u00174¯ONià\u0083\u009c\u009e\u0013¸¦ÓLíä\u0007\u0093\"\u0007<ÐW@qÿ\u008b\u008e¦\"ÀúÛtõ/\u000f\u0096*,DÞ_ry\n\u0093¸®&Èëãeý\u0002\u0017¢2^LÎg`\u0081\u0018\u0081~\u009b\nµ²ÎSèý\u0002\u0081\u001f\u000e9»RQlù\u0086\u008e£\u001a½ÍÖ]ðâ\n\u0093'?AçZit+\u008e\u0097«2ÅÜÞBø\f\u0012³/+Ißb\u007f|\t\u0096¹\u0000c\u001a\u00174¯ONià\u0083\u009c\u009e\u0013¸¦ÓLíä\u0007\u0093\"\u0007<ÐW@qÿ\u008b\u008e¦\"ÀúÛtõ<\u000f\u008b*$DÞ_\u007fy\u001d\u0093©®+ÈÈãbý=\u0017¿2HLÔg`\u0081\u0004\u009bª¶Fn\u0085tñZI!¨\u0007\u0006ízðõÖ@½ª\u0083\u0002iuLáR69¦\u001f\u0019åhÈÄ®\u001cµ\u0092\u009bÊagDÊ*#1¶\u0017ñýVÀÔ¦-\u008d\u008f\u0093ãyU\\\u0091\"/\t\u0090ïøõLØ¼¾\u001a\u0084j\u0000c\u001a\u00174¯ONià\u0083\u009c\u009e\u0011¸\u00adÓdíì\u0007\u008b\"8<ÉWUqÅ\u008b\u0083¦1ÀÛÛ}õ\u001a\u000f¨* DÝ_gy\u001d\u0093³®'ÈÕôµîÁÀy»\u0098\u009d6wJjÇL{'¿\u0019/óPÖàÈ\t£\u009f\u0085\u0003\u007fIRç4\u0017/©\u0001êûZÞþ°\u0016«¢\u008dËgGZý<\u0002\u0017®\tÂãnÆ\u0088¸\u0004\u0000r\u001a\u00004ºOCiõ\u0083\u009a\u009e;¸\u008cÓFíÞ\u0007\u0097\"2<×Wbqé\u008b\u0086¦ ÀÙÛ\u007fõ\u000b\u000f\u0081*\u0005DÇ_`y\f\u0093¸®,ÈÂã~aô{\u0086U<.Å\bsâ\u001cÿ½Ù\n²À\u008cFf\u0011Cµ]S6Æ\u0010Pê\u001fÇ³¡Cºý\u0094\u008bn\u0007K«%d>ü\u0018\u008dò/Ï¡©O\u0082ï\u009c\u0085\u0000r\u001a\u00004ºOCiõ\u0083\u009a\u009e;¸\u008cÓFíÀ\u0007\u0097\"3<ÕW@qÏ\u008b\u0085¦6ÀÚÛVõ\u0016\u000f\u0097*=DË_}y\u001d\u0093¯\u0000r\u001a\u00004ºOCiõ\u0083\u009a\u009e;¸\u008cÓFíÀ\u0007\u0097\"3<ÕW@qÅ\u008b\u0084¦=ÀÅÛvõ\u001a\u000f\u0090* DÁ_}y4\u0093´®1ÈÓãiý\u001f\u0017³2I\u00adu·\u0012\u0099¬âyÄã.\u00883#\u0015£~[@ëª\u0085\u008f!\u0091íúRÜø&\u0095\u000b mÆvkX\u0006\u0089I\u0093=½\u0085ÆdàÊ\n¶\u001761\u009bZmdÆ\u008e¼«\u001eµ÷ÞxøØ\u0002\u0093/\u001fIüRU|<\u0086¸£\u0006Íö\u000b\u0018\u0011l?ÔD5b\u009b\u0088ç\u0095q³úØ\u001fæ\u009f\fú)X7¢\\4z\u0098\u0080â\u0000i\u001a\u00164\u008bOKiÅ\u0083\u008c\u009e?¸¯ÓAíù\u0007\u008b\"\u0007<ÎWNqþ\u008b\u0092¦\u001cÀÜÛiõ\u000b\u000f\u0081*'DË_a.J4>\u001a\u0086agGÉ\u00adµ° \u0096\u008fýcÃò)²\f\u001b\u0012âyD_Æ¥±\u0088\rîùõ]Û3!¿\u0001r\u001b\u00015¿Nyhð\u0082\u009a\u009f\t¹«ÒLìû\u0006°#:=ÔVEpé\u008a\u009e¸«¢Ø\u008cf÷ Ñ);C&Å\u0000sk\u0082U:¿G\u009aê\u0084'ï\u0095É73V\u001eæx\u0019\u0000g\u001a\u00004¾Oxiñ\u0083\u009b\u009e\b¸ªÓMíú\u0007±\";<ÕWDqè\u008b\u009f\u0000g\u001a\u00004¾Oxiñ\u0083\u009b\u009e\u001d¸«ÓZíâ\u0007\u009f\"2<ÿWMqï\u008b\u008e¦>ÀÁ\u0012ã\b\u0090&4]Û{A\u0091\u001b\u008c¼ª<ÁÊ\u0000s\u001a\u00004¤OKiÞ\u0083\u008a\u009e1¸\u00adÓmíû\u0007\u0097\"9<È\u0000a\u001a\u00014®Ojiâ\u0083\u009c\u009e0¸·Ómíõ\u0007\u0082\"6<ÒWEqã\u008b\u0099/\u00175p\u001bÎ`\u001cF\u008b¬ç±@\u0097Öü;Â\u0089(í\rU\u0000g\u001a\u00004¾Oliû\u0083\u0097\u009e*¸¦ÓPíù~Úd½J\u00031Æ\u0017@ý)à\u0086<W&0\b\u008esSUÅ¿º¢\u001a\u0084§ïwÑÈ;¡\u001e\u000f\u0000g\u001a\u00004¾Ociõ\u0083\u008a\u009e*¸\u0097ÓGíø\u0007\u0091\"?<èWHqë\u008b\u008e\u0000g\u001a\u00004¾Oliá\u0083\u008b\u009e,¸¦ÓFíù\u0007³\"4<ÈWHqð\u008b\u0082¦$ÀÌ\u0000c\u001a\u00174¯ONià\u0083\u009c\u009e\u001d¸±ÓMíì\u0007\u0086\"><ÊWDqÏ\u008b\u0085¦6ÀÚ/A55\u001b\u008d`lFÂ¬¾±=\u0097\u0085ü|ÂÊ(¢\r\u0001\u0013÷xp^Á¤»\u0089;ïùô^Ú2\t\u0000\u0013t=ÌF-`\u0083\u008aÿ\u0097~±ÒÚ.ä\u008f\u000eå+]5©^'x¬\u0082ì¯@\u0000c\u001a\u00174¯ONià\u0083\u009c\u009e\u0013¸¦ÓLíä\u0007\u0093\"#<ÕWNqè\u008b¯¦1ÀÁÛ{×\u001fÍxãÆ\u0098\u0004¾\u0088TêIpoÞ\u0004\":\u0086Ðãõ@ëª\u0000g\u001a\u00004¾Oiiá\u0083\u0095\u009e2¸\u0090ÓLíæ\u0007¤\"2<ÎWRqï\u008b\u0084¦>\u0000g\u001a\u00004¾O|iû\u0083\u0096\u009e3¸¯ÓIíÞ\u0007\u0096\"<<êWDqô\u008b\u0098¦9ÀÚÛt\u0000g\u001a\u00004¾Onió\u0083\u009c\u009e0¸·Ózíè\u0007\u009f\"8<ÈWDqÅ\u008b\u0084¦>ÀÓÛsõ\u00189\f#x\rÀv!P\u008fºó§u\u0081Éê!Ô\u0083>è\u001bT\u0005§n\u000bH\u009f²á\u009fQù®â?Ìc6ä\u0013HX\u009bBülB\u0017\u00901\u0007ÛkÆÌàZ\u008b·µ\u0005_azÙd\u0016\u000f¸)\bÓdþÅ\u0098&\u0083\u0088ø\u0018â~ÌÙ·\u001e\u0091\u0096{èfD@Ã\u0000i\u001a\u00164\u0099OKiÿ\u0083°\u009e0¸\u0097ÓMíþ\u0007\u0086\"\u001a<ÓWEqã\u001e¶\u0004Ñ*oQ¿w!\u009d|\u0080ö¦bÍ\u009có\u0018\u0019F<õ\"\u000eI\u0082o>\u0095J¸õÞ\rÅ¤ëÀr:h]Fã=1\u001b¼ñÖìqÊû¡\u001b\u009f¤uìPeN\u008f%\u0012\u0003¾ùÕÔy²\u0087©5\u0087l}ØXy6\u0096Y\u0088CïmQ\u0016\u00830\u000eÚdÇÃáI\u008a©´\u0016^Q{Ñe \u000eº(\fÒjÿÚ\u0099(\u0082»¬ñVfsÃ\u0000i\u001a\u00164\u0089O@iú\u0083\u009f\u009e7¸¤Óníâ\u0007\u0080\"4<ÙWrqã\u008b\u0085¦4ÀðÛtõ\u001e\u000f\u0086*%DË_w\u0000g\u001a\u00004¾Oliû\u0083\u0097\u009e8¸ªÓOíÃ\u0007\u009d\"\u001e<ÑWQqÃ\u008b\u0093¦$ÀÇÛ{õ:\u000f\u0092*,DÀ_gy(\u0093¸®0ÈÄãiý\u001f\u0017¢s·iÂGp<\u009b\u001a%ðOíêËe \u0089\u009e\u001dtQQçO\u0007$\u0080\u001fZ\u0005=+\u0083PWvÑ\u009c´\u0081\u0006§\u008cÌ|òÝ\u0018ª=\u0004#õH_nÔ\u0094¸¹\u000bßáÄ@\"l8\u000b\u0016µmaKç¡\u0082¼0\u009aºñJÏë%\u009c\u00002\u001eÃu\u007fSþ©\u0085\u0084)âêù~×\u001f-\u008a\b,\u0000g\u001a\u00004¾Ojiì\u0083\u0089\u009e;¸±ÓAíà\u0007\u0097\"9<ÈWuqô\u008b\u008a¦9ÀÁÛivnl\tB·9c\u001fåõ\u0080è2Î¸¥H\u009béq\u009eT0JÁ!|\u0007ýý\u0083Ð0¶È:Å «\u000e\u0016\u0000c\u001a\r4«O]dZ~,P\u0083+u\rÖç\u0096ú\u001cÜ\u0088·vð¾êÖÄq¿\u009b\u0099&s\\nÇHs#\u008a\u001d\u0011÷FÒòÌ\u0005§\u009f\u00813\u0000c\u001a\u00174¯ONià\u0083\u009c\u009e\f¸¶ÓFíã\u0007\u0093\"5<ÐWDÂ/ØMöù\u008d=«§Aé\\bz÷\u0011\u001b/\u0084ÅÇàxþ\u0084\u0095\u001d³¿È\u009bÒáüR\u0087°¡0K|VøpI\u001bª%\bÏMêÔô%\u009f¯¹\fCd\u0000p\u001a\n4¹O[iÐ\u0083\u009c\u009e2¸¢ÓQíè\u0007\u0096\"\u0018<ÒWlqç\u008b\u0082¦>ÀáÛrõ\r\u000f\u0081*(DÊ\u0000r\u001a\u00104¤O`iú\u0083º\u009e1¸\u00adÓFíè\u0007\u0091\"#<ÓWSqÒ\u008b\u0083¦\"ÀÐÛ{õ\u001b«è±\u0092\u009f!äÃÂC(\u000f5\u0085\u00134xÞF{¬\u000f\u0089¬\u0097PüÖÚl '\r k_pç^\u0086¤\u0018\u001d\u009b\u0007á)RR°t;\u009ew\u0083Ù¥IÎºð\u0003\u001a}?ó!9J\u0089l\u0002\u0096n»ÕÝ;Æ\u0092èà\u0012`7ÐY\u0011B\u0090dá\u008eS³ÈÕ(O®UÉ{w\u0000ª&2ÌSÑö÷f\u009c£¢6HTmÿs\u0011\u0018\u008b>.ÄQéí\u008f1\u0094²ºØ@Leç\u000b\u0002\u0010¨6øÜzáø\u0087\u001a¬¤²ÖX|}\u0097\u0000r\u001a\u00004\u00adOFiç\u0083\u008d\u009e;¸±Ójíÿ\u0007\u009d\"6<ØWBqç\u008b\u0098¦$ÀçÛ\u007fõ\u001c\u000f\u0081* DØ_vy\n\u0000u\u001a\u000b4¸OJió\u0083\u0090\u009e-¸·ÓMíÿ\u0007°\"%<ÓW@qâ\u008b\u0088¦1ÀÆÛnõ-\u000f\u0081**DË_zy\u000e\u0093¸®05\u008d/ê\u0001Tz\u0095\\\u001f¶z«Æ\u008doæ«Ø\u00152k\u0017É\t\u0019b©D\u0006¾d\u0093Ùõ+\u0000g\u001a\u00004¾O\u007fiõ\u0083\u0090\u009e,¸\u0090ÓMíî\u0007\u009d\"9<ØWnqä\u008b\u0081¦5ÀÖÛnCÅY¢w\u001c\fÀ*SÀ?Ý\u0095û\u0000\u0090Ú®CD1a\u008c\u007f{\u0014ñLòV\u0095x+\u0003þ%dÏ\u001aÒ¢ô5\u009fØ¡MK\u0017n\u0096p@\u001bÙ=vÇ7ê«\u008cm\u0097æ¹\u0086C\u0018f¯*á0\u0088\u001e6Á\u0000ÛlõÞ\u008e\f¨\u0093Bü_P\u0000f\u001a\f4¦O[iñ\u0083\u008b\u0000S\u001a\n4¥OBiø\u0083\u0098\u009e\u001c¸±ÓAíé\u0007\u0095\"2JÿP\u00ad~\u0002\u0005ú#\\ÉcÔ\u0093ò\u0011\u0099û§[M-hÍvc\u001dã;YÁ2ì\u009f\u008a{\u0091É¿«E9`Ó\u000eG\u0015Æ3\u00adÙ\nä\u0094\u0082|©ô·¹]\u0005xå\u0006}-ÚËðÑ\u0018üë\u009aW ,O¶U\u0016p·".getBytes(C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, 2078);
        f1662 = cArr;
        f1663 = -1994825982510163355L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x01d6, code lost:
    
        if (r29.equals(m7438((char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 1714 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 14 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern()) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0225, code lost:
    
        if (r29.equals(m7438((char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 15 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)).intern()) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0852, code lost:
    
        if (r29.equals(m7438((char) (43928 - (android.os.Process.myTid() >> 22)), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1802, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 21).intern()) != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0d17, code lost:
    
        if (r29.equals(m7438((char) (android.view.KeyEvent.getMaxKeyCode() >> 16), 81 - android.text.TextUtils.getCapsMode("", 0, 0), android.os.Process.getGidForName("") + 14).intern()) != false) goto L259;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.ch
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6381(cl clVar, String str, List<Object> list, ck ckVar, ee eeVar) {
        long j;
        char c;
        int i = 2 % 2;
        try {
            c = '0';
            j = 0;
        } catch (Exception e) {
            e = e;
            j = 0;
        }
        try {
            switch (str.hashCode()) {
                case -2004702861:
                    if (str.equals(m7438((char) TextUtils.indexOf("", "", 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 598, 25 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                        c = '%';
                        break;
                    }
                    c = 65535;
                    break;
                case -2004586504:
                    if (str.equals(m7438((char) TextUtils.getOffsetAfter("", 0), 862 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 29 - TextUtils.getOffsetAfter("", 0)).intern())) {
                        c = '.';
                        break;
                    }
                    c = 65535;
                    break;
                case -1940880443:
                    if (str.equals(m7438((char) Color.green(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 290, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15).intern())) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case -1935452010:
                    if (str.equals(m7438((char) TextUtils.indexOf("", "", 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 431, 22 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case -1926335428:
                    if (str.equals(m7438((char) (ViewConfiguration.getEdgeSlop() >> 16), Color.blue(0) + 305, 14 - TextUtils.getTrimmedLength("")).intern())) {
                        c = 21;
                        break;
                    } else {
                        c = 65535;
                        break;
                    }
                case -1862527602:
                    if (str.equals(m7438((char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1116, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15).intern())) {
                        c = '9';
                        break;
                    }
                    c = 65535;
                    break;
                case -1811057601:
                    if (str.equals(m7438((char) (24872 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (Process.myPid() >> 22) + 43, View.resolveSize(0, 0) + 14).intern())) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1784213698:
                    if (str.equals(m7438((char) (Gravity.getAbsoluteGravity(0, 0) + 537), 641 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), KeyEvent.getDeadChar(0, 0) + 18).intern())) {
                        c = '\'';
                        break;
                    }
                    c = 65535;
                    break;
                case -1759122910:
                    if (str.equals(m7438((char) (TextUtils.indexOf("", "", 0) + 24966), 891 - (Process.myPid() >> 22), View.MeasureSpec.getMode(0) + 30).intern())) {
                        c = FileSystemKt.UnixPathSeparator;
                        break;
                    }
                    c = 65535;
                    break;
                case -1673354837:
                    if (str.equals(m7438((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 2526), (ViewConfiguration.getJumpTapTimeout() >> 16) + 236, 14 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern())) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case -1654145783:
                    if (str.equals(m7438((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 7889), 1471 - (ViewConfiguration.getScrollBarSize() >> 8), 'D' - AndroidCharacter.getMirror('0')).intern())) {
                        c = 'P';
                        break;
                    }
                    c = 65535;
                    break;
                case -1475737971:
                    if (str.equals(m7438((char) (TextUtils.getOffsetBefore("", 0) + 49757), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1728, TextUtils.getOffsetBefore("", 0) + 15).intern())) {
                        c = '_';
                        break;
                    }
                    c = 65535;
                    break;
                case -1424907981:
                    if (str.equals(m7438((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 25659), KeyEvent.keyCodeFromString("") + 1690, 9 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                        int i2 = f1660 + 73;
                        f1661 = i2 % 128;
                        int i3 = i2 % 2;
                        c = '\\';
                        break;
                    }
                    c = 65535;
                    break;
                case -1412269250:
                    if (str.equals(m7438((char) (2939 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), KeyEvent.normalizeMetaState(0) + 1022, 16 - View.resolveSize(0, 0)).intern())) {
                        c = '4';
                        break;
                    }
                    c = 65535;
                    break;
                case -1333092465:
                    if (str.equals(m7438((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 8135), 348 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 19 - View.MeasureSpec.getMode(0)).intern())) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case -1296960936:
                    if (str.equals(m7438((char) (40672 - TextUtils.getOffsetBefore("", 0)), (ViewConfiguration.getTapTimeout() >> 16) + 413, TextUtils.lastIndexOf("", '0', 0) + 19).intern())) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case -1296887564:
                    if (str.equals(m7438((char) ((-1) - TextUtils.lastIndexOf("", '0')), TextUtils.indexOf("", "", 0) + 1908, 26 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern())) {
                        c = 'g';
                        break;
                    }
                    c = 65535;
                    break;
                case -1274492040:
                    if (str.equals(m7438((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 2018 - (ViewConfiguration.getPressedStateDuration() >> 16), 6 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern())) {
                        c = 'n';
                        break;
                    }
                    c = 65535;
                    break;
                case -1253789331:
                    if (str.equals(m7438((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1883, ((Process.getThreadPriority(0) + 20) >> 6) + 25).intern())) {
                        c = 'f';
                        break;
                    }
                    c = 65535;
                    break;
                case -1242814655:
                    if (str.equals(m7438((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 22780), 1429 - View.resolveSizeAndState(0, 0, 0), 18 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                        c = GMTDateParser.MONTH;
                        break;
                    }
                    c = 65535;
                    break;
                case -1214823651:
                    if (str.equals(m7438((char) (18198 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 510 - Color.argb(0, 0, 0, 0), 19 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case -1198560170:
                    if (str.equals(m7438((char) (7659 - KeyEvent.getDeadChar(0, 0)), 1823 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29).intern())) {
                        c = GMTDateParser.DAY_OF_MONTH;
                        break;
                    }
                    c = 65535;
                    break;
                case -1145074375:
                    if (str.equals(m7438((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 659, 35 - (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
                        c = '(';
                        break;
                    }
                    c = 65535;
                    break;
                case -1124602405:
                    if (str.equals(m7438((char) (TextUtils.lastIndexOf("", '0') + 30218), 1665 - (ViewConfiguration.getTapTimeout() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 19).intern())) {
                        c = GMTDateParser.YEAR;
                        break;
                    }
                    c = 65535;
                    break;
                case -1071201617:
                    if (str.equals(m7438((char) (17313 - TextUtils.lastIndexOf("", '0', 0, 0)), 1972 - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15).intern())) {
                        c = 'j';
                        break;
                    } else {
                        c = 65535;
                        break;
                    }
                case -1029444991:
                    if (str.equals(m7438((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "") + 947, 32 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                        int i4 = f1661 + 55;
                        f1660 = i4 % 128;
                        if (i4 % 2 == 0) {
                            c = '1';
                            break;
                        }
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1029356152:
                    if (str.equals(m7438((char) (17862 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 101 - (ViewConfiguration.getTouchSlop() >> 8), 14 - View.MeasureSpec.getMode(0)).intern())) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1013936139:
                    if (str.equals(m7438((char) (29277 - Color.red(0)), 1491 - (ViewConfiguration.getJumpTapTimeout() >> 16), 23 - Gravity.getAbsoluteGravity(0, 0)).intern())) {
                        int i5 = f1661 + 59;
                        f1660 = i5 % 128;
                        int i6 = i5 % 2;
                        c = 'Q';
                        break;
                    }
                    c = 65535;
                    break;
                case -997695964:
                    if (!str.equals(m7438((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), View.combineMeasuredStates(0, 0) + 1759, 23 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                        c = 65535;
                        break;
                    } else {
                        c = 'a';
                        break;
                    }
                case -992018155:
                    if (str.equals(m7438((char) (TextUtils.getTrimmedLength("") + 7997), 1604 - TextUtils.lastIndexOf("", '0', 0, 0), 18 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern())) {
                        c = 'V';
                        break;
                    }
                    c = 65535;
                    break;
                case -952854909:
                    break;
                case -924373867:
                    if (str.equals(m7438((char) (12065 - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.getCapsMode("", 0, 0) + 1282, 20 - ExpandableListView.getPackedPositionType(0L)).intern())) {
                        c = 'E';
                        break;
                    }
                    c = 65535;
                    break;
                case -899502102:
                    if (str.equals(m7438((char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 1160, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 13).intern())) {
                        c = Typography.less;
                        break;
                    } else {
                        c = 65535;
                        break;
                    }
                case -834290483:
                    if (str.equals(m7438((char) (28391 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 762, View.MeasureSpec.getSize(0) + 39).intern())) {
                        c = '+';
                        break;
                    }
                    c = 65535;
                    break;
                case -788426345:
                    if (str.equals(m7438((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 19277), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 382, TextUtils.getTrimmedLength("") + 13).intern())) {
                        int i7 = f1661 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                        f1660 = i7 % 128;
                        if (i7 % 2 == 0) {
                            c = 26;
                            break;
                        }
                        c = '^';
                        break;
                    }
                    c = 65535;
                    break;
                case -764989270:
                    if (str.equals(m7438((char) (AndroidCharacter.getMirror('0') + 33005), 693 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 31 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                        int i8 = f1661 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                        f1660 = i8 % 128;
                        int i9 = i8 % 2;
                        c = ')';
                        break;
                    }
                    c = 65535;
                    break;
                case -678635926:
                    if (str.equals(m7438((char) ((Process.myTid() >> 22) + 49510), KeyEvent.keyCodeFromString("") + 2011, 7 - TextUtils.indexOf("", "", 0, 0)).intern())) {
                        int i10 = f1660 + 65;
                        f1661 = i10 % 128;
                        if (i10 % 2 != 0) {
                            c = GMTDateParser.MINUTES;
                            break;
                        }
                        c = 'c';
                        break;
                    }
                    c = 65535;
                    break;
                case -633198692:
                    if (str.equals(m7438((char) (61650 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getTouchSlop() >> 8) + 1699, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14).intern())) {
                        c = AbstractJsonLexerKt.END_LIST;
                        break;
                    }
                    c = 65535;
                    break;
                case -622788386:
                    if (str.equals(m7438((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 281 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getWindowTouchSlop() >> 8) + 10).intern())) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case -588814953:
                    if (str.equals(m7438((char) (12144 - (ViewConfiguration.getLongPressTimeout() >> 16)), 1188 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 12 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                        c = Typography.greater;
                        break;
                    }
                    c = 65535;
                    break;
                case -525192167:
                    if (str.equals(m7438((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1264 - ExpandableListView.getPackedPositionType(0L), 18 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                        c = 'D';
                        break;
                    }
                    c = 65535;
                    break;
                case -502936072:
                    if (str.equals(m7438((char) Color.alpha(0), 1646 - (ViewConfiguration.getEdgeSlop() >> 16), 19 - View.getDefaultSize(0, 0)).intern())) {
                        c = 'X';
                        break;
                    }
                    c = 65535;
                    break;
                case -429121350:
                    if (str.equals(m7438((char) (Process.myTid() >> 22), View.combineMeasuredStates(0, 0) + ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22).intern())) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case -264400535:
                    if (str.equals(m7438((char) Color.red(0), 528 - TextUtils.lastIndexOf("", '0', 0), 22 - Color.blue(0)).intern())) {
                        c = '\"';
                        break;
                    }
                    c = 65535;
                    break;
                case -100132040:
                    if (str.equals(m7438((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), MotionEvent.axisFromString("") + 152, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 22).intern())) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -75121853:
                    if (str.equals(m7438((char) (TextUtils.getOffsetBefore("", 0) + 32445), 1211 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 7).intern())) {
                        c = '@';
                        break;
                    }
                    c = 65535;
                    break;
                case -75062501:
                    if (str.equals(m7438((char) (Color.argb(0, 0, 0, 0) + 16024), 94 - (ViewConfiguration.getLongPressTimeout() >> 16), 7 - Drawable.resolveOpacity(0, 0)).intern())) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -39321397:
                    if (str.equals(m7438((char) (51177 - (ViewConfiguration.getTapTimeout() >> 16)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 28, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14).intern())) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -37751474:
                    if (str.equals(m7438((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 319 - View.resolveSizeAndState(0, 0, 0), 15 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case -20195056:
                    if (str.equals(m7438((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), View.MeasureSpec.getSize(0) + IronSourceError.ERROR_RV_SHOW_EXCEPTION, 24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                        c = '5';
                        break;
                    }
                    c = 65535;
                    break;
                case 107868:
                    if (str.equals(m7438((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10892), 2008 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getScrollBarSize() >> 8) + 3).intern())) {
                        c = 'l';
                        break;
                    }
                    c = 65535;
                    break;
                case 108960:
                    if (str.equals(m7438((char) (ExpandableListView.getPackedPositionType(0L) + 15019), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1682, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3).intern())) {
                        c = 'Z';
                        break;
                    }
                    c = 65535;
                    break;
                case 1820707:
                    if (str.equals(m7438((char) (ViewConfiguration.getLongPressTimeout() >> 16), 1352 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (Process.myPid() >> 22) + 17).intern())) {
                        c = 'I';
                        break;
                    }
                    c = 65535;
                    break;
                case 2656096:
                    if (str.equals(m7438((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 4752), TextUtils.getOffsetAfter("", 0) + 1151, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 9).intern())) {
                        int i11 = f1660 + 63;
                        f1661 = i11 % 128;
                        int i12 = i11 % 2;
                        c = ';';
                        break;
                    }
                    c = 65535;
                    break;
                case 3052374:
                    if (str.equals(m7438((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1686 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 3 - TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                        int i13 = f1660 + 41;
                        f1661 = i13 % 128;
                        int i14 = i13 % 2;
                        c = AbstractJsonLexerKt.BEGIN_LIST;
                        break;
                    }
                    c = 65535;
                    break;
                case 15484010:
                    if (str.equals(m7438((char) TextUtils.indexOf("", "", 0), 1456 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14).intern())) {
                        c = 'O';
                        break;
                    }
                    c = 65535;
                    break;
                case 134176114:
                    if (str.equals(m7438((char) Color.alpha(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1245, TextUtils.lastIndexOf("", '0', 0, 0) + 19).intern())) {
                        c = 'C';
                        break;
                    }
                    c = 65535;
                    break;
                case 151150886:
                    if (str.equals(m7438((char) (Process.myTid() >> 22), 1319 - ((Process.getThreadPriority(0) + 20) >> 6), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19).intern())) {
                        c = 'G';
                        break;
                    }
                    c = 65535;
                    break;
                case 171861489:
                    if (str.equals(m7438((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 132 - ExpandableListView.getPackedPositionType(0L), (Process.myTid() >> 22) + 19).intern())) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 186649624:
                    break;
                case 190032796:
                    if (str.equals(m7438((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 46209), 14 - Process.getGidForName(""), 14 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 317728381:
                    if (str.equals(m7438((char) (14702 - MotionEvent.axisFromString("")), Color.green(0) + 1407, TextUtils.lastIndexOf("", '0', 0, 0) + 23).intern())) {
                        c = 'L';
                        break;
                    }
                    c = 65535;
                    break;
                case 370758723:
                    if (str.equals(m7438((char) (ViewConfiguration.getEdgeSlop() >> 16), 1954 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 20).intern())) {
                        c = 'i';
                        break;
                    }
                    c = 65535;
                    break;
                case 383897184:
                    if (str.equals(m7438((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 1172 - TextUtils.lastIndexOf("", '0', 0), 15 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                        c = B5.U;
                        break;
                    }
                    c = 65535;
                    break;
                case 386145701:
                    if (str.equals(m7438((char) (47153 - ((Process.getThreadPriority(0) + 20) >> 6)), (ViewConfiguration.getScrollBarSize() >> 8) + 473, 19 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case 398700013:
                    if (str.equals(m7438((char) (2403 - Color.alpha(0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1302, 17 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern())) {
                        c = 'F';
                        break;
                    }
                    c = 65535;
                    break;
                case 404330675:
                    if (str.equals(m7438((char) Gravity.getAbsoluteGravity(0, 0), Color.alpha(0) + Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, View.combineMeasuredStates(0, 0) + 22).intern())) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 413143991:
                    if (str.equals(m7438((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 334 - View.getDefaultSize(0, 0), 15 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 421306799:
                    if (str.equals(m7438((char) (Color.argb(0, 0, 0, 0) + 12527), 122 - MotionEvent.axisFromString(""), 9 - View.MeasureSpec.getMode(0)).intern())) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 449440345:
                    if (str.equals(m7438((char) (TextUtils.getTrimmedLength("") + 29653), 1590 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.lastIndexOf("", '0', 0) + 15).intern())) {
                        c = 'U';
                        break;
                    }
                    c = 65535;
                    break;
                case 451302467:
                    if (str.equals(m7438((char) (Process.myTid() >> 22), ((byte) KeyEvent.getModifierMetaStateMask()) + 1369, 19 - Color.argb(0, 0, 0, 0)).intern())) {
                        c = 'J';
                        break;
                    }
                    c = 65535;
                    break;
                case 468780064:
                    if (str.equals(m7438((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 575 - Process.getGidForName(""), 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern())) {
                        c = Typography.dollar;
                        break;
                    }
                    c = 65535;
                    break;
                case 496987426:
                    if (str.equals(m7438((char) (51435 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 1743 - (ViewConfiguration.getLongPressTimeout() >> 16), KeyEvent.keyCodeFromString("") + 16).intern())) {
                        int i15 = f1661 + 11;
                        f1660 = i15 % 128;
                        int i16 = i15 % 2;
                        c = '`';
                        break;
                    }
                    c = 65535;
                    break;
                case 502192375:
                    if (str.equals(m7438((char) (3348 - AndroidCharacter.getMirror('0')), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 394, 18 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 518569412:
                    if (str.equals(m7438((char) TextUtils.indexOf("", "", 0, 0), 492 - (ViewConfiguration.getFadingEdgeLength() >> 16), KeyEvent.normalizeMetaState(0) + 18).intern())) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case 526577620:
                    if (str.equals(m7438((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 52321), 173 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0) + 21).intern())) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 600996866:
                    if (str.equals(m7438((char) (257 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 1082 - TextUtils.lastIndexOf("", '0'), 16 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                        c = '7';
                        break;
                    }
                    c = 65535;
                    break;
                case 618460119:
                    if (str.equals(m7438((char) (49737 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 195 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getScrollBarSize() >> 8) + 9).intern())) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 622025239:
                    if (str.equals(m7438((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 1387 - (ViewConfiguration.getScrollDefaultDelay() >> 16), ImageFormat.getBitsPerPixel(0) + 21).intern())) {
                        c = 'K';
                        break;
                    }
                    c = 65535;
                    break;
                case 660677592:
                    if (str.equals(m7438((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 726 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 38 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())) {
                        c = GMTDateParser.ANY;
                        break;
                    }
                    c = 65535;
                    break;
                case 672646709:
                    if (str.equals(m7438((char) (42102 - ImageFormat.getBitsPerPixel(0)), 271 - TextUtils.lastIndexOf("", '0', 0), 9 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 675563679:
                    if (str.equals(m7438((char) (13802 - View.MeasureSpec.getMode(0)), View.combineMeasuredStates(0, 0) + 1935, 18 - (Process.myPid() >> 22)).intern())) {
                        c = GMTDateParser.HOURS;
                        break;
                    }
                    c = 65535;
                    break;
                case 759503924:
                    if (str.equals(m7438((char) (KeyEvent.keyCodeFromString("") + 35114), (ViewConfiguration.getLongPressTimeout() >> 16) + 999, 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                        c = '3';
                        break;
                    }
                    c = 65535;
                    break;
                case 776628755:
                    if (str.equals(m7438((char) View.combineMeasuredStates(0, 0), 922 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), View.MeasureSpec.getMode(0) + 26).intern())) {
                        break;
                    }
                    c = 65535;
                    break;
                case 791624502:
                    if (str.equals(m7438((char) (20425 - TextUtils.getOffsetBefore("", 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1851, 32 - View.MeasureSpec.getMode(0)).intern())) {
                        c = 'e';
                        break;
                    }
                    c = 65535;
                    break;
                case 861400366:
                    if (str.equals(m7438((char) (AndroidCharacter.getMirror('0') - '0'), 453 - View.resolveSizeAndState(0, 0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 19).intern())) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case 956170787:
                    if (str.equals(m7438((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), View.resolveSize(0, 0) + 1133, Drawable.resolveOpacity(0, 0) + 18).intern())) {
                        c = AbstractJsonLexerKt.COLON;
                        break;
                    }
                    c = 65535;
                    break;
                case 1057201549:
                    if (str.equals(m7438((char) (Color.rgb(0, 0, 0) + 16777216), 1782 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 20 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                        c = 'b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1076958445:
                    if (str.equals(m7438((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 19318), Color.green(0) + 368, 14 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 1107904233:
                    if (str.equals(m7438((char) TextUtils.indexOf("", "", 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 802, 28 - View.MeasureSpec.getSize(0)).intern())) {
                        c = AbstractJsonLexerKt.COMMA;
                        break;
                    }
                    c = 65535;
                    break;
                case 1125810632:
                    if (str.equals(m7438((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1560 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.getTrimmedLength("") + 31).intern())) {
                        c = 'T';
                        break;
                    }
                    c = 65535;
                    break;
                case 1414080697:
                    if (str.equals(m7438((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 34896), TextUtils.lastIndexOf("", '0', 0) + 58, View.MeasureSpec.getMode(0) + 24).intern())) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1444942133:
                    if (str.equals(m7438((char) (62677 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 829 - View.resolveSize(0, 0), 33 - Gravity.getAbsoluteGravity(0, 0)).intern())) {
                        c = '-';
                        break;
                    }
                    c = 65535;
                    break;
                case 1521072706:
                    if (str.equals(m7438((char) ((Process.myPid() >> 22) + 23023), 1514 - KeyEvent.keyCodeFromString(""), 22 - Color.green(0)).intern())) {
                        c = 'R';
                        break;
                    }
                    c = 65535;
                    break;
                case 1525623361:
                    if (str.equals(m7438((char) (Color.alpha(0) + 19605), 1987 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 22).intern())) {
                        c = 'k';
                        break;
                    }
                    c = 65535;
                    break;
                case 1546196954:
                    if (str.equals(m7438((char) View.MeasureSpec.getSize(0), Process.getGidForName("") + 1537, View.MeasureSpec.getSize(0) + 24).intern())) {
                        c = 'S';
                        break;
                    }
                    c = 65535;
                    break;
                case 1557083836:
                    if (str.equals(m7438((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 551, 24 - TextUtils.lastIndexOf("", '0')).intern())) {
                        c = '#';
                        break;
                    }
                    c = 65535;
                    break;
                case 1590874683:
                    if (str.equals(m7438((char) (Drawable.resolveOpacity(0, 0) + 8715), Color.green(0) + 1624, 21 - TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                        c = 'W';
                        break;
                    }
                    c = 65535;
                    break;
                case 1622498214:
                    if (str.equals(m7438((char) (TextUtils.lastIndexOf("", '0') + 44307), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 979, TextUtils.lastIndexOf("", '0') + 21).intern())) {
                        c = '2';
                        break;
                    }
                    c = 65535;
                    break;
                case 1664124883:
                    break;
                case 1746583808:
                    if (str.equals(m7438((char) View.MeasureSpec.getMode(0), 1231 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 16 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                        c = 'B';
                        break;
                    }
                    c = 65535;
                    break;
                case 1751981113:
                    break;
                case 1777572999:
                    if (str.equals(m7438((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 5366), 622 - ((byte) KeyEvent.getModifierMetaStateMask()), 18 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                        c = Typography.amp;
                        break;
                    }
                    c = 65535;
                    break;
                case 1825714001:
                    if (str.equals(m7438((char) (11818 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 1063, 20 - TextUtils.lastIndexOf("", '0', 0)).intern())) {
                        c = '6';
                        break;
                    }
                    c = 65535;
                    break;
                case 1876204439:
                    if (str.equals(m7438((char) (47320 - View.combineMeasuredStates(0, 0)), 1099 - View.combineMeasuredStates(0, 0), 18 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                        c = '8';
                        break;
                    }
                    c = 65535;
                    break;
                case 1953253188:
                    if (str.equals(m7438((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36552), TextUtils.lastIndexOf("", '0', 0, 0) + 116, View.MeasureSpec.getSize(0) + 8).intern())) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1988391289:
                    if (str.equals(m7438((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1201 - Color.alpha(0), 10 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                        c = '?';
                        break;
                    }
                    c = 65535;
                    break;
                case 1989757366:
                    if (str.equals(m7438((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 63603), (Process.myTid() >> 22) + 1448, 9 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())) {
                        c = 'N';
                        break;
                    }
                    c = 65535;
                    break;
                case 1992394620:
                    if (str.equals(m7438((char) ((-16745036) - Color.rgb(0, 0, 0)), 204 - View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.getTrimmedLength("") + 10).intern())) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 1993407379:
                    if (str.equals(m7438((char) (TextUtils.indexOf("", "", 0) + 15408), 1217 - ExpandableListView.getPackedPositionChild(0L), Gravity.getAbsoluteGravity(0, 0) + 12).intern())) {
                        c = 'A';
                        break;
                    }
                    c = 65535;
                    break;
                case 2034588468:
                    if (str.equals(m7438((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 55160), 1338 - Color.blue(0), 13 - View.getDefaultSize(0, 0)).intern())) {
                        int i17 = f1661 + 85;
                        f1660 = i17 % 128;
                        if (i17 % 2 == 0) {
                            c = 'H';
                            break;
                        }
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return cy.m7370(list);
                case 1:
                    return cy.m7372(list);
                case 2:
                    return cy.m7369(clVar);
                case 3:
                    return cy.m7371(clVar, list);
                case 4:
                    return df.m7472(list);
                case 5:
                    return Boolean.valueOf(df.m7470(list));
                case 6:
                    return df.m7469(list);
                case 7:
                    return df.m7471(list);
                case '\b':
                    return cv.m7358(list);
                case '\t':
                    return cv.m7357(list);
                case '\n':
                    return cv.m7359(list);
                case 11:
                    return cv.m7361(list);
                case '\f':
                    return cv.m7360();
                case '\r':
                    return cx.m7367(list);
                case 14:
                    return cx.m7366(list);
                case 15:
                    return cx.m7368();
                case 16:
                    return da.m7419(list);
                case 17:
                    return da.m7421(list);
                case 18:
                    return da.m7423(list);
                case 19:
                    return da.m7422(list);
                case 20:
                    return this.f1673.m7424(eeVar, clVar, list);
                case 21:
                    return this.f1673.m7427(eeVar, clVar, list);
                case 22:
                    return this.f1673.m7425(eeVar, clVar, list);
                case 23:
                    return this.f1673.m7426(eeVar, clVar, list);
                case 24:
                    return da.m7420(list);
                case 25:
                    return Integer.valueOf(de.m7464(list));
                case 26:
                    return de.m7465(list);
                case 27:
                    return de.m7466(list);
                case 28:
                    return de.m7468(list);
                case 29:
                    return Boolean.valueOf(de.m7467(list));
                case 30:
                    return de.m7463(list);
                case 31:
                    return this.f1667.m7405(clVar, list, eeVar);
                case ' ':
                    return cz.m7381(list);
                case '!':
                    return cz.m7386(list);
                case '\"':
                    return this.f1667.m7400(list);
                case '#':
                    return this.f1667.m7402(clVar, list, eeVar);
                case '$':
                    return this.f1667.m7404(list);
                case '%':
                    return this.f1667.m7403(clVar, list, eeVar);
                case '&':
                    return cz.m7384(list);
                case '\'':
                    return cz.m7380(list);
                case '(':
                    return this.f1667.m7398(clVar, list, eeVar);
                case ')':
                    return this.f1667.m7399(clVar, list, eeVar);
                case '*':
                    return this.f1667.m7389(clVar, list, eeVar);
                case '+':
                    return this.f1667.m7393(clVar, list, eeVar);
                case ',':
                    return this.f1667.m7395(clVar, list, eeVar);
                case '-':
                    return this.f1667.m7391(clVar, list, eeVar);
                case '.':
                    return this.f1667.m7394(list);
                case '/':
                    return this.f1667.m7390(list);
                case '0':
                    return this.f1667.m7397(list);
                case '1':
                    return this.f1667.m7392(list);
                case '2':
                    return cz.m7379(list);
                case '3':
                    return this.f1667.m7396(clVar, list, eeVar);
                case '4':
                    return this.f1667.m7401(clVar, list);
                case '5':
                    return Boolean.valueOf(cz.m7375(list));
                case '6':
                    return cz.m7376(list);
                case '7':
                    return cz.m7378(list);
                case AD_VISIBILITY_VALUE:
                    return cz.m7377(list);
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    return cz.m7373(list);
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    return cz.m7374(list);
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    return cr.m7314(clVar, list);
                case '<':
                    return cu.m7341(clVar, list);
                case '=':
                    return this.f1670.m7356(clVar, list, eeVar);
                case '>':
                    return cu.m7352(clVar);
                case '?':
                    return cu.m7349(clVar);
                case '@':
                    return Long.valueOf(cu.m7348());
                case 'A':
                    return cu.m7354();
                case 'B':
                    return Long.valueOf(cu.m7345());
                case 'C':
                    return cu.m7350();
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    return cu.m7340();
                case NATIVE_AD_DISPLAY_DURATION_VALUE:
                    return cu.m7337();
                case ASSET_DOWNLOAD_RETRY_STATUS_VALUE:
                    return cu.m7339();
                case 'G':
                    return cu.m7335();
                case 'H':
                    return cu.m7342(clVar);
                case 'I':
                    return cu.m7351(clVar);
                case 'J':
                    return cu.m7334();
                case 'K':
                    return cu.m7333();
                case Base64.mimeLineLength /* 76 */:
                    return cu.m7347(clVar);
                case 'M':
                    return cu.m7338(clVar);
                case 'N':
                    return cu.m7346(list);
                case 'O':
                    return Boolean.valueOf(cu.m7331());
                case 'P':
                    return cu.m7343(list);
                case 'Q':
                    return cu.m7332(clVar);
                case 'R':
                    return cu.m7336(clVar);
                case 'S':
                    return Boolean.valueOf(cu.m7328());
                case 'T':
                    return Double.valueOf(cu.m7330());
                case 'U':
                    return this.f1670.m7355(list);
                case 'V':
                    return cu.m7329();
                case 'W':
                    return cu.m7327();
                case 'X':
                    return cu.m7326();
                case 'Y':
                    return cu.m7353(list);
                case 'Z':
                    return cs.m7319(clVar, list);
                case '[':
                    return Character.valueOf(cs.m7316(list));
                case '\\':
                    return cs.m7318(list);
                case ']':
                    return Boolean.valueOf(cs.m7320(list));
                case com.safedk.android.analytics.brandsafety.creatives.discoveries.l.e /* 94 */:
                    return this.f1666.m7437(clVar, list, eeVar);
                case '_':
                    return this.f1666.m7433(clVar, list, eeVar);
                case '`':
                    return this.f1666.m7435(clVar, list, eeVar);
                case 'a':
                    return this.f1666.m7434(clVar, list, eeVar);
                case 'b':
                    return this.f1666.m7436(clVar, list, eeVar);
                case 'c':
                    return this.f1666.m7432(clVar, list, eeVar);
                case 'd':
                    return this.f1666.m7431(clVar, list, eeVar);
                case 'e':
                    return co.m7277(list);
                case 'f':
                    return co.m7279(list);
                case 'g':
                    return co.m7280(list);
                case 'h':
                    return co.m7275(list);
                case 'i':
                    return co.m7278(list);
                case 'j':
                    return co.m7274(list);
                case 'k':
                    return Long.valueOf(co.m7276());
                case 'l':
                    return this.f1665.m7322(clVar, list);
                case 'm':
                    return this.f1665.m7324(clVar, list);
                case 'n':
                    return this.f1665.m7323(clVar, list);
                default:
                    new ds(clVar, eeVar, m7438((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2024, View.combineMeasuredStates(0, 0) + 12).intern(), str).m7593(clVar.m7203());
                    return null;
            }
        } catch (Exception e2) {
            e = e2;
            cn.m7268(clVar.m7203(), new StringBuilder().append(m7438((char) (19130 - ExpandableListView.getPackedPositionType(j)), 2036 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 43 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1))).intern()).append(str).toString(), e);
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7438(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f1662[c.f1198 + i] ^ (c.f1198 * f1663)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
