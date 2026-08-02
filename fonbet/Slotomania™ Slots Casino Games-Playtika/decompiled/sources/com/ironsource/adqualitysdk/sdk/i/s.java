package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
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
import com.google.android.exoplayer2.C;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.i.ar;
import com.ironsource.adqualitysdk.sdk.i.jm;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class s extends IronSourceAdQuality {

    /* renamed from: リ, reason: contains not printable characters */
    private static long f3102 = 0;

    /* renamed from: ヶ, reason: contains not printable characters */
    private static char[] f3103 = null;

    /* renamed from: 丫, reason: contains not printable characters */
    private static int f3104 = 1;

    /* renamed from: 乁, reason: contains not printable characters */
    private static int f3105;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static s f3106;

    /* renamed from: 爫, reason: contains not printable characters */
    private jh f3107;

    /* renamed from: ﬤ, reason: contains not printable characters */
    private aj f3108;

    /* renamed from: סּ, reason: contains not printable characters */
    private ak f3110;

    /* renamed from: ףּ, reason: contains not printable characters */
    private jm f3111;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private av f3112;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private jj f3113;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private ISAdQualityAdListener f3114;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private ai f3116;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private Context f3119;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private ISAdQualityConfig f3124;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final as f3123 = new as();

    /* renamed from: ﾒ, reason: contains not printable characters */
    private boolean f3125 = false;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean f3122 = false;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private boolean f3120 = false;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private boolean f3121 = false;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private boolean f3118 = false;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private ISAdQualityLogLevel f3117 = ISAdQualityLogLevel.INFO;

    /* renamed from: טּ, reason: contains not printable characters */
    private final Set<ISAdQualityInitListener> f3109 = new CopyOnWriteArraySet();

    /* renamed from: ﮉ, reason: contains not printable characters */
    private final al f3115 = new al();

    /* renamed from: ﻏ, reason: contains not printable characters */
    static void m8576() {
        char[] cArr = new char[1654];
        ByteBuffer.wrap("Ú\u009f¨I?\u000f\u0082Ö\u0011·ç_j\u007fù.LßÓ\u008e¡W4A»\u0002\u000eÁ\u009dÐcKöxE3Èú_\u009b-G°\u0006\u00077\u008aø\u0019\u0093ï\u001ar\rÁ=TèÛ¾©[<\u001a\u0083\"\u0016ºå¯k@þ\u0001M\u008aÐó§·5E¸\u000e\u000f\u008e\u0092ða£÷*z\u0011ÉÄ\\¶#®±w\u0004\u0002\u008bÃ\u001eÊí\u009fsaÆ\u0002UÓØ\u0098¯»=r\u00803\u0017\u0091\u009a£i¦ÿjB\"ÑÛ¤\u0085*K¹j\f+\u0093Ùf\u0094Xæ*\u000f½n\u0000¶\u0093öe7è\u0006{GÎ¾QØ#\u001b¶(Â °N'\u0015\u009a \t§ÿ?rBá\u0019TêË»¹r,F£\u001f\u0016Ö\u0085±{rî\u0003]BÐ\u009bG\u00895|¨\u007f\u001f\n\u0092Ó\u0001ã÷aj>Ù\u0013LÄÃ\u0090±y$<\u009b\u0010\u000e\u008fý¨sCæ\u0018UìÈ\u008b¿\u0087-q *\u0017è\u008aÂy\u009dïKbkÑþDÍ;Ï©O\u001c/\u0093ö\u0006ÿõ\u008akGÞ3\u0000Ir\u009fåÙX\u0000Ëa=\u0089°©#ø\u0096\t\tX{\u0081î\u0097aÔÔ\u0017G\u0006¹\u009d,®\u009få\u0012,\u0085M÷\u0091jÐÝáP.ÃE5Ì¨Ù\u001bè\u008e\"\u0001ys\u0089æÐYùÌl?{±\u0085$Ü\u0097\u0010\n-}p8ïJ9Ý\u007f`¦óÇ\u0005/\u0088\u000f\u001b^®¯1þC'ÖBYeì¾\u007fÅ\u0081r\u0014\u000f§D*\u0097½öÏ?R{åBh\u009bûü\r/\u0090>#O¶\u00939ÎK&Þ}aBôÊ\u0007Ý\u0089#\u001cx¯ú2\u008cE××fZoí¦p\u0087\u0083Õ\u0015\u000f\u0098z+·¾\u0082Á\u008aS\u0011æliºüã\u000f\u008e\u0091\u001d$h·©:ûÀª²D%\u001f\u0098ª\u000b\u00adý5pHã\u0013VàÉ±»x.L¡\u0015\u0014Ü\u0087»yxì\t_HÒ\u0091E\u00847Jª\u0014\u001d\u0005\u0090ì\u0003¼õdh=Û\u0004NÍÁ\u008c³!&\u000e\u0099-\fîÿÑqzä8WæÊ\u0081½\u008e/a¢0\u0015å\u0088É{\u0096íB`/Ó³±lÃ\u0082TÙélzk\u008có\u0001\u008e\u0092Õ'&¸wÊ¾_\u008aÐÓe\u001aö}\b¾\u009dÏ.ê£$4JF»ÛÂlÒá\u001arc\u0084ª\u0019ãªÒ?_°`Â\u0083WÐè\u008f}\u0014\u008e^\u0000¿\u0095÷&s»\tÌN^£Óïdwù\u0004\nM\u009cÓ\u0011â¢67\u001fHWÚ\u008eo«à*u`\u0086B\u0018\u0089\u00ad¯>*³sÄ\u0005\u0086kô\u0085cÞÞkMl»ô6\u0089¥Ò\u0010!\u008fpý¹h\u008dçÔR\u001dÁz?¹ªÈ\u0019\u0089\u0094P\u0003mq¨ìä[ëÖ\u0019Eq³ä.ó\u009dÍ\b\u0016\u0087\u0013õ´`¼ßÊJ\u0001¹\u00107¢¢í\u00118\u008c\fû\u001ci§äöSpÎ\t=U«\u0084&ô\u0095%\u0000F!vS Äæy?ê^\u001c¶\u0091\u0096\u0002Ç·6(gZ¾Ï¨@ëõ(f7\u0098¼\r\u009e¾À3G¤zÖ£KñüÒq\nâ{\u0014ª\u0089§:È¯\u0007 VR£ÇïxÐí\u0004\u001eI\u0090õ\u009c\u0088î^y\u0018ÄÁW ¡H,h¿9\nÈ\u0095\u0099ç@rVý\u0015HÖÛÉ%B°`\u0003>\u008e¹\u0019\u008bkTö\u000bA,Ìç_Á©D4\u0017\u0087,\u0012å\u009d´ïHz\u0019Å(P÷£¼-A¸Q\u000b\u0090\u0096©á»sNþMI×Ôà'´±y<I\u008fÁ\u001aîeí÷jB\rÍÄX\u0089«\u00ad5z\u0080\u0016\u0013Ã\u009e×ÇØµ\u000e\"H\u009f\u0091\fðú\u0018w8äiQ\u0098ÎÉ¼\u0010)u¦R\u0013\u0089\u0080ò~Eë&X|ÕºB\u00950\u0012\u00adE\u001al\u0097±\u0004Õò\u0012o^Ü{\u0000 rªåêX\u000bË]=Ü°\u0089#ð\u00961\tY{\u0099î¨aùÔ(GQ¹Ô,°\u009fà\u00129\u0085P÷\u0096jÓÝúP9\u0000sr©åêX\u0012ËU=\u008e\u0000sr¨åó\u0000s¹$Ëì\\\u0097á@r\u0013Þ\u0006¬Ö;\u0082\u0086|\u0015)ãè\u0000 r»åñX\u0010ËX=Ü°º#ñ\u0096\u0001\t_{\u0097îªaªÔ|\u0000Er¾åêX\u000bËB=Ü°»#ü\u0096\u0015\tX{\u008cî\u00adaþÔ;G\b¹\u0090,¯\u009fû\u00126{\f\t÷\u009e£#B°\u000bF\u0095ËòX¸í]r\u0011\u0000Ø\u0095ã\u001a¾¯5<\u0014ÂÎWìä·iXþ\t\u008c\u0099\u0000Cr\u00adåöXCËD=Ü°«#ü\u0096\u0001\tB{\u009fî¡a°Ô)G[¹\u0091,²\u009f¬\u00121\u0085@÷Ðj\u0091Ý¨P\u001dÃs5\u00ad¨Ü\u001bÕ\u008e%\u0001}s\u0084æÝYôÌ5?8±·$ô\u00977\nh}cï\u0081bßÕXH7»x-© Ü\u0013\u0010\u0086/ù{k¶Þ\u008a¨,ÚÖM\u0098ð1c(\u0095ü\u0018Î\u008b\u0095>5¡0ÓãFØÉ\u0091|@ï<\u0011í\u0084Ü7\u0083ºH-q_ÌÂ\u009au¼øEk\u0004\u009dì\u0000¬³\u009d&L©\u001dÛäNáñ¦d}\u0097&\u0019±\u008c§?l¢[Õ\u000eGçÊ¼}-àR\u0013\u0004\u0085Å\b±»h.[Q\u001eÃ\u008dvöùfl!\u009f\u001c\u0001Ï´²'|ª\u0018Ý\u0002OÀò\u009beTè%\u001bR\u0000Nr©åïXDËE=\u008f°\u00ad#æ\u0096@\tE{\u009cîäaóÔ=GF¹Ó,´\u009f¬\u0012:\u0085A÷ÐjÒÝýP8ÃL5Ì¨×\u001bö\u008ep\u0001ys\u0085æÄYôÌ5\u001d\u0085o^ø\nEëÖ¢ \u001d\u00ad(>!\u008bÓ\u0014\u0089fJó$|\u0019ÉØZÈ¤]1s\u0082l\u000fö\u0098\u0091ê\\w\u0010ÀfM´Þ°(@µ\u001d\u0006%\u0093ã\u001c¹n\bû\u0019D!Ñç\"½¬\u00049\u0003\u008aÉ\u0017ú`±ò\u0000\u007f\u0018È×U¤¦ 0}½\u001b\u000eÇ\u009b ä\u00adv8Ã\u0012LÑÙ\u0090*¡´p\u0001@\u0092Â\u001f\u0097hªú=G2ÐÝ]\u0098®¬8,\u0085-\u0016×c\u0095íN~(Ë\u001dTä¡Ì3L¼k\tp\u009aÕç»quÂdO\u001dØí%\u0085·\\\u0000\u0015\u008d<\u001eíkÀõ\u007fF<Ó\u000f\\¾C\u001d1Þ¦\u009d\u001bl\u0088$~éóÚ`\u008fÕ1J)8ë\u00adÍ\"Á\u0097W\u00045úæoÈ\u0000Er\u009eåÊX+Ëb=Ý°è#Í\u0096\u000f\tY{ßî¶aõÔ|G]¹\u0087,©\u009fâ\u0012?\u0085\u0004÷\u0084jÔÝíPtÃD5\u0089¨Þ\u001bå\u008e%\u0001ps\u009cæ\u0094YõÌ??}±\u0096$\u0090\u00975\n\f}4«\bÙÊNîó.`s\u0096»\u001b\u009d\u0088×=f¢gÐ¿E\u0089ÊÓ\u007fZì}\u0012§\u0087\u00944Ï¹^.v\\¹ÁºvÞû\u0013hu\u009e¹\u0003¾°Ã%VªOØ Mûò×g\u001f\u0094[\u001aâ\u008fã<)¡\u000bÖ@DæÉÃ~\u001aãB\u0010P\u0086\u0095\u000bü¸r-\u0003RKÀ\u009duêúvoo\u009c]\u0002\u0097·ô$j©jÞMLÖñóf\u001dëS\u0018B\u008e»3Ë #Õz[³È\u009a}Ëâf\u0017Y\u0085\u009a\n©¿\u0098ÅÇ·= s\u009d\u0088\u000e\u008eø+u\u0005æKS\u009aÌã¾\u0013+;¤b\u0011«\u0082Â|\u0013é~ZA×\u0082@ñ2N¯W\u0018e\u0095¯\u0006ÌðRmoÞ^KîÄë¶\u0005#\u0010\u009c>\u0000ar¨åéX;ËY=\u0092°¡#à\u0096?\tN{\u0094î«aò\u0000ir¢åìXJËC=\u0099°»#ç\u0096)\tH\u0000tr¾åùX\u0007ËU=\u009e°©#÷\u0096\u000b\t\u0002{\u0093î²a¾Ô8GJ¹Ú,¡\u009fâ\u00129\u0085H÷\u0089jÈÝáP7ÃS\u0018ëj;ýo@\u0091ÓÄ%\u0005¨};\u007f\u008e\u009d\u0011×c\u0012ö9y|Ìé_\u0084¡\r46\u0087u\n¬\u009dÅï\u001crMÅsH¿\u0000Cr\u00adåöXCËD=Ü°»#ñ\u0096\u0014\t\f{\u0091îªaäÔ9GZ¹\u009a,¡\u009fà\u0012x\u0085P÷\u0095jÏÝüPtÃM5\u0083¨Ü\u001bá\u008ep\u00011sÈæýYÓÌ\r?|±µ$Å\u0097\u001d\n$}}ï\u0094bÕÕXH\u0017»T-\u0097 \u0088\u0013\u0003\u0086!ù\u007fkøÞ×Q\u0018ÄI7|©°\u001cÏ\u008f\u001b\u0002Vu*\u00902âÆu\u0094Èo[o\u00adð Ò³\u009f\u0006?\u0099:ëé~Ïñ\u008aDQ×9)ê¼Ó\u000fÓ\u0082S\u0015>güú·M×ÀFS0¥÷8¢\u008bÛ\u001eM\u0091\u0006ãñv¤É\u008d\\V¯G!ò´¡\u0007j\u009aCí\u0002\u007fþò¿EnØA+\u0006½Í0°\u0083*\u0011vcµôëI\u0001ÚH,\u0082¡»2\u00ad\u0087\u001e\u0018Uj\u009bÿ¶péÅ?V\u0011¨\u0082=´\u008eï\u0003&\u0094\\æ\u0089{\u0085ÌÝA\u0002Òc$¯¹ê\nÁ\u009f\u001e\u0010Tb¼÷ëHÖÝ\u0015.H ¶5ã\u0000Fr\u00adåñX\bËU=\u0098°è#à\u0096\u000f\t\f{\u008aî¡a÷Ô5G[¹\u0080,¥\u009fþ\u0012x\u0085F÷\u0091jÈÝüP1ÃR5\u0095¨\u0098\u001bö\u008e5\u0001\u007fs\u008dæÝYöÌ)?j\u0000Cr\u00adåöXCËD=Ü°»#ñ\u0096\u0014\t\f{\u0099î a°Ô0GA¹\u0087,´\u009fé\u00126\u0085A÷\u0082j\u009cÝ¥PtÃi5¿¨ù\u001bà\u008e\u0001\u0001is\u0089æØYéÌ8?a±Ä$ã\u00978\n\u0003}4ï\u0097bÍÕ\u000bHd»c-´ Ý\u0013\u0000\u0086$ùck¯ÞÊQ^\u0000Cr\u00adåöXCËD=Ü°»#ñ\u0096\u000e\tH{Øî§aåÔ/G\\¹\u009b,\u00ad\u009f¬\u00125\u0085A÷\u0094jÕÝéP ÃI5\u0083¨Ö\u001b¤\u008e\"\u0001ys\u009eæÑYîÌ9?}±Ä$\u009d\u0097\\\n\u0001}Gï¡bÈÕ)H1»q-° Á\u0013\u0000\u00869ù,k\u008bÞàQ;Ä\u001c7\u007f©µ\u001cÓ\u008fL\u0002Kulç¥ZèÍ\f@[³w%¢\u0098¶¡ïÓ\u0001DZùïjè\u009cp\u0011\u0017\u0082]7¢¨äÚtO\u000bÀIu\u0083æð\u00187\u008d\u0001>\u0000³\u0099$íV8Ëy|Eñ\u008cbå\u0094/\tzº\b/\u008e ÕÒ2G}øBm\u0095\u009eÑ\u0010h\u008516ð«\u00adÜëN\rÃdt\u0085é\u009d\u001aÝ\u008c\u001c\u0001m²¬'\u0095X\u0080Ê'\u007fLð\u0097e°\u0096Í\b\u000b½,.®£ûÔÜF\\ûYlªáñ\u0012Ø\u0084\t9Uª¤ßõQ*Â\u0001w\\èâª?ØÑO\u008aò?a8\u0097 \u001aÇ\u0089\u008d<h£pÑ÷DÝË\u008b~Mí1\u0013æ\u0086È5Ð¸\t/x]ÅÀ\u0093wµúLi\r\u009få\u0002¥±\u0094$E«\u0014ÙíLèó¯ft\u0095/\u001b¸\u008e»=a G×HEïÈ¸\u007fqâL\u0011\b\u0087Ï\n£¹f,\u0012\u0000Cr\u00adåöXCËD=Ü°»#ñ\u0096\u0014\t\f{\u009bî«aþÔ:GA¹\u0093,à\u009f¡\u0012x\u0085m÷£jýÝìP\u0005ÃU5\u008d¨Ô\u001bí\u008e$\u0001esÈæçYÄÌ\u0007?8±\u0093$Ñ\u0097\u000f\nh}gï\u0088bÙÕ\fH »\u007f-« Æ\u0013Z\u0000Cr\u00adåöXCËD=Ü°»#ñ\u0096\u0014\t\f{\u009bî«aþÔ:GA¹\u0093,à\u009f¡\u0012x\u0085m÷£jýÝìP\u0005ÃU5\u008d¨Ô\u001bí\u008e$\u0001esÈæçYÄÌ\u0007?8±\u008d$Ã\u0097\\\n)}xï\u0092bÉÕ\u0019H »i-ü Á\u0013\u001a\u0086)ùxk±ÞÅQ\u001cÄU7r©±\u001cÄ\u008fB\u0000ir«åöX\u000bËB=\u0099°\u0097#ä\u0096\u0012\tI{§î\u00adaþÔ5G\\¹«,£\u009fã\u00126\u0085B÷\u0099jÛ".getBytes(C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, 1654);
        f3103 = cArr;
        f3102 = 3984190510676406988L;
    }

    /* renamed from: טּ, reason: contains not printable characters */
    static /* synthetic */ aj m8558(s sVar) {
        int i = 2 % 2;
        int i2 = f3105 + 11;
        f3104 = i2 % 128;
        int i3 = i2 % 2;
        aj ajVar = sVar.f3108;
        if (i3 != 0) {
            return ajVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: סּ, reason: contains not printable characters */
    static /* synthetic */ Set m8559(s sVar) {
        int i = 2 % 2;
        int i2 = f3104 + 23;
        f3105 = i2 % 128;
        int i3 = i2 % 2;
        Set<ISAdQualityInitListener> set = sVar.f3109;
        if (i3 == 0) {
            return set;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    static /* synthetic */ jm m8560(s sVar) {
        int i = 2 % 2;
        int i2 = f3104;
        int i3 = i2 + 1;
        f3105 = i3 % 128;
        int i4 = i3 % 2;
        jm jmVar = sVar.f3111;
        if (i4 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i5 = i2 + 77;
        f3105 = i5 % 128;
        int i6 = i5 % 2;
        return jmVar;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    static /* synthetic */ boolean m8562(s sVar) {
        int i = 2 % 2;
        int i2 = f3104 + 53;
        f3105 = i2 % 128;
        int i3 = i2 % 2;
        boolean m8567 = sVar.m8567();
        int i4 = f3105 + 33;
        f3104 = i4 % 128;
        int i5 = i4 % 2;
        return m8567;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    static /* synthetic */ void m8563(s sVar) {
        int i = 2 % 2;
        int i2 = f3105 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f3104 = i2 % 128;
        int i3 = i2 % 2;
        sVar.m8610(true);
        int i4 = f3104 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f3105 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    static /* synthetic */ void m8565(s sVar) {
        int i = 2 % 2;
        int i2 = f3105 + 101;
        f3104 = i2 % 128;
        int i3 = i2 % 2;
        sVar.m8582(false);
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    static /* synthetic */ ISAdQualityAdListener m8566(s sVar) {
        int i = 2 % 2;
        int i2 = f3104 + 67;
        f3105 = i2 % 128;
        int i3 = i2 % 2;
        ISAdQualityAdListener iSAdQualityAdListener = sVar.f3114;
        if (i3 == 0) {
            return iSAdQualityAdListener;
        }
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ Context m8568(s sVar) {
        int i = 2 % 2;
        int i2 = f3104 + 17;
        f3105 = i2 % 128;
        int i3 = i2 % 2;
        Context context = sVar.f3119;
        if (i3 == 0) {
            return context;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ void m8570(s sVar) {
        int i = 2 % 2;
        int i2 = f3105 + 73;
        f3104 = i2 % 128;
        int i3 = i2 % 2;
        sVar.m8564();
        if (i3 == 0) {
            throw null;
        }
        int i4 = f3104 + 85;
        f3105 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ jh m8571(s sVar) {
        int i = 2 % 2;
        int i2 = f3104 + 5;
        int i3 = i2 % 128;
        f3105 = i3;
        int i4 = i2 % 2;
        jh jhVar = sVar.f3107;
        int i5 = i3 + 63;
        f3104 = i5 % 128;
        if (i5 % 2 != 0) {
            return jhVar;
        }
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    static /* synthetic */ ai m8573(s sVar) {
        int i = 2 % 2;
        int i2 = f3104;
        int i3 = i2 + 65;
        f3105 = i3 % 128;
        int i4 = i3 % 2;
        ai aiVar = sVar.f3116;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 29;
        f3105 = i5 % 128;
        if (i5 % 2 == 0) {
            return aiVar;
        }
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    static /* synthetic */ av m8575(s sVar) {
        int i = 2 % 2;
        int i2 = f3105;
        int i3 = i2 + 47;
        f3104 = i3 % 128;
        int i4 = i3 % 2;
        av avVar = sVar.f3112;
        int i5 = i2 + 7;
        f3104 = i5 % 128;
        int i6 = i5 % 2;
        return avVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ as m8577(s sVar) {
        int i = 2 % 2;
        int i2 = f3105 + 25;
        f3104 = i2 % 128;
        if (i2 % 2 == 0) {
            sVar.m8574();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        as m8574 = sVar.m8574();
        int i3 = f3105 + 77;
        f3104 = i3 % 128;
        int i4 = i3 % 2;
        return m8574;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ av m8578(s sVar, av avVar) {
        int i = 2 % 2;
        int i2 = f3104 + 107;
        int i3 = i2 % 128;
        f3105 = i3;
        int i4 = i2 % 2;
        sVar.f3112 = avVar;
        int i5 = i3 + 57;
        f3104 = i5 % 128;
        int i6 = i5 % 2;
        return avVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ jh m8579(s sVar, jh jhVar) {
        int i = 2 % 2;
        int i2 = f3105 + 29;
        int i3 = i2 % 128;
        f3104 = i3;
        int i4 = i2 % 2;
        sVar.f3107 = jhVar;
        int i5 = i3 + 95;
        f3105 = i5 % 128;
        if (i5 % 2 == 0) {
            return jhVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ jj m8583(s sVar) {
        int i = 2 % 2;
        int i2 = f3104 + 71;
        int i3 = i2 % 128;
        f3105 = i3;
        int i4 = i2 % 2;
        jj jjVar = sVar.f3113;
        if (i4 != 0) {
            int i5 = 91 / 0;
        }
        int i6 = i3 + 7;
        f3104 = i6 % 128;
        int i7 = i6 % 2;
        return jjVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m8586(s sVar, Context context) {
        int i = 2 % 2;
        int i2 = f3105 + 83;
        f3104 = i2 % 128;
        int i3 = i2 % 2;
        sVar.m8581(context);
        int i4 = f3104 + 57;
        f3105 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m8587(s sVar, ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i = 2 % 2;
        int i2 = f3104 + 45;
        f3105 = i2 % 128;
        int i3 = i2 % 2;
        sVar.m8608(iSAdQualityLogLevel);
        int i4 = f3104 + 109;
        f3105 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ ai m8590(s sVar, ai aiVar) {
        int i = 2 % 2;
        int i2 = f3105;
        int i3 = i2 + 15;
        f3104 = i3 % 128;
        int i4 = i3 % 2;
        sVar.f3116 = aiVar;
        if (i4 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i5 = i2 + 67;
        f3104 = i5 % 128;
        int i6 = i5 % 2;
        return aiVar;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ aj m8591(s sVar, aj ajVar) {
        int i = 2 % 2;
        int i2 = f3105;
        int i3 = i2 + 53;
        f3104 = i3 % 128;
        int i4 = i3 % 2;
        sVar.f3108 = ajVar;
        int i5 = i2 + 69;
        f3104 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 8 / 0;
        }
        return ajVar;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m8595(s sVar, Context context) {
        int i = 2 % 2;
        int i2 = f3105 + 91;
        f3104 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        sVar.m8594(context);
        if (i3 == 0) {
            throw null;
        }
        int i4 = f3105 + 103;
        f3104 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m8596(s sVar, Context context, String str) {
        int i = 2 % 2;
        int i2 = f3104 + 67;
        f3105 = i2 % 128;
        int i3 = i2 % 2;
        sVar.m8607(context, str, true, false, true);
        int i4 = f3105 + 57;
        f3104 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m8597(s sVar, boolean z) {
        int i = 2 % 2;
        int i2 = f3105 + 1;
        f3104 = i2 % 128;
        int i3 = i2 % 2;
        sVar.m8589(z);
        int i4 = f3105 + 95;
        f3104 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ boolean m8599(s sVar) {
        int i = 2 % 2;
        int i2 = f3104 + 57;
        f3105 = i2 % 128;
        if (i2 % 2 == 0) {
            return sVar.m8569();
        }
        sVar.m8569();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ Context m8601(s sVar, Context context) {
        int i = 2 % 2;
        int i2 = f3104;
        int i3 = i2 + 113;
        f3105 = i3 % 128;
        int i4 = i3 % 2;
        sVar.f3119 = context;
        int i5 = i2 + 15;
        f3105 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
        return context;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ ak m8602(s sVar, ak akVar) {
        int i = 2 % 2;
        int i2 = f3104 + 71;
        int i3 = i2 % 128;
        f3105 = i3;
        int i4 = i2 % 2;
        sVar.f3110 = akVar;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 17;
        f3104 = i5 % 128;
        int i6 = i5 % 2;
        return akVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ al m8603(s sVar) {
        int i = 2 % 2;
        int i2 = f3105 + 81;
        int i3 = i2 % 128;
        f3104 = i3;
        int i4 = i2 % 2;
        al alVar = sVar.f3115;
        int i5 = i3 + 51;
        f3105 = i5 % 128;
        int i6 = i5 % 2;
        return alVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ jj m8604(s sVar, jj jjVar) {
        int i = 2 % 2;
        int i2 = f3104;
        int i3 = i2 + 79;
        f3105 = i3 % 128;
        int i4 = i3 % 2;
        sVar.f3113 = jjVar;
        int i5 = i2 + 103;
        f3105 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return jjVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ jm m8605(s sVar, jm jmVar) {
        int i = 2 % 2;
        int i2 = f3105 + 101;
        int i3 = i2 % 128;
        f3104 = i3;
        int i4 = i2 % 2;
        sVar.f3111 = jmVar;
        int i5 = i3 + 83;
        f3105 = i5 % 128;
        if (i5 % 2 == 0) {
            return jmVar;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m8609(s sVar, ISAdQualityInitError iSAdQualityInitError, String str) {
        int i = 2 % 2;
        int i2 = f3104 + 79;
        f3105 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        sVar.m8585(iSAdQualityInitError, str);
        if (i3 != 0) {
            super.hashCode();
            throw null;
        }
        int i4 = f3105 + 43;
        f3104 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m8612(s sVar) {
        int i = 2 % 2;
        int i2 = f3104 + 111;
        f3105 = i2 % 128;
        int i3 = i2 % 2;
        sVar.m8598(true);
        int i4 = f3104 + 39;
        f3105 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        m8576();
        f3106 = null;
        int i = f3105 + 41;
        f3104 = i % 128;
        int i2 = i % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static s m8592() {
        synchronized (s.class) {
            if (f3106 == null) {
                f3106 = new s();
            }
        }
        return f3106;
    }

    private s() {
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void initialize(Context context, String str) {
        int i = 2 % 2;
        int i2 = f3104 + 99;
        f3105 = i2 % 128;
        int i3 = i2 % 2;
        initialize(context, str, null);
        int i4 = f3104 + 45;
        f3105 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void initialize(Context context, String str, ISAdQualityConfig iSAdQualityConfig) {
        int i = 2 % 2;
        if (context instanceof Application) {
            int i2 = f3105 + 65;
            f3104 = i2 % 128;
            int i3 = i2 % 2;
            m8580((Application) context, str, iSAdQualityConfig);
            return;
        }
        if (context != null) {
            int i4 = f3104 + 3;
            f3105 = i4 % 128;
            int i5 = i4 % 2;
            if (context.getApplicationContext() instanceof Application) {
                m8580((Application) context.getApplicationContext(), str, iSAdQualityConfig);
                return;
            }
        }
        if (!(context instanceof Activity)) {
            String intern = m8584(74 - TextUtils.getCapsMode("", 0, 0), (char) (56023 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1).intern();
            m.m8523(m8584((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12, (char) (View.MeasureSpec.getMode(0) + 22695), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 73).intern(), intern);
            m8588(iSAdQualityConfig != null ? iSAdQualityConfig.getAdQualityInitListeners() : null, ISAdQualityInitError.EXCEPTION_ON_INIT, intern);
        } else {
            int i6 = f3104 + 11;
            f3105 = i6 % 128;
            int i7 = i6 % 2;
            m8593((Activity) context, str, iSAdQualityConfig);
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m8580(Application application, String str, ISAdQualityConfig iSAdQualityConfig) {
        int i = 2 % 2;
        int i2 = f3104 + 7;
        f3105 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        m8606(application, null, str, iSAdQualityConfig);
        if (i3 != 0) {
            super.hashCode();
            throw null;
        }
        int i4 = f3104 + 51;
        f3105 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m8593(Activity activity, String str, ISAdQualityConfig iSAdQualityConfig) {
        int i = 2 % 2;
        int i2 = f3104 + 59;
        f3105 = i2 % 128;
        if (i2 % 2 != 0) {
            m8606(activity.getApplication(), activity, str, iSAdQualityConfig);
            int i3 = 27 / 0;
        } else {
            m8606(activity.getApplication(), activity, str, iSAdQualityConfig);
        }
        int i4 = f3104 + 37;
        f3105 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.s$2, reason: invalid class name */
    final class AnonymousClass2 extends je {

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static int[] f3129 = {951121590, 1406521959, -1674111558, 924903031, 1377581660, 1160539848, 740110307, -1752901251, 1817856618, -1475255334, -1201399755, 487689473, -1228224990, 1572911387, 1624872791, 1580892665, -441520957, -1311937047};

        /* renamed from: ﻐ, reason: contains not printable characters */
        private /* synthetic */ Application f3130;

        /* renamed from: ｋ, reason: contains not printable characters */
        private /* synthetic */ String f3132;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private /* synthetic */ Activity f3133;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private /* synthetic */ ISAdQualityConfig f3134;

        AnonymousClass2(ISAdQualityConfig iSAdQualityConfig, String str, Application application, Activity activity) {
            this.f3134 = iSAdQualityConfig;
            this.f3132 = str;
            this.f3130 = application;
            this.f3133 = activity;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.je
        /* renamed from: ｋ */
        public final void mo5828() {
            try {
                String userId = this.f3134.getUserId();
                s.m8587(s.this, this.f3134.getLogLevel());
                m.m8538(m8618(new int[]{-2039703538, -1208580424, 1268545984, 1569156487, 399296249, -1341450236}, TextUtils.lastIndexOf("", '0', 0, 0) + 13).intern(), new StringBuilder().append(m8618(new int[]{788274760, 504485129, -1328563984, -459304288, -1123722315, -191710849, 1907611948, -2101635959, -1321369628, 152131366, 959075070, -696285303, -320810390, -753144244}, (-16777190) - Color.rgb(0, 0, 0)).intern()).append(this.f3132).toString());
                iu.m8114(this.f3130.getApplicationContext()).m8122();
                s.m8597(s.this, this.f3134.isTestMode());
                if (this.f3134.isTestMode()) {
                    m.m8523(m8618(new int[]{-2039703538, -1208580424, 1268545984, 1569156487, 399296249, -1341450236}, 12 - TextUtils.getOffsetBefore("", 0)).intern(), m8618(new int[]{1376368401, 941178184, -302841579, -485808365, 1073002864, -37772270, 174287157, -1579140353, -1412399883, 631253399, -2057185722, -818158955, -1946134951, -1314375310, 1849581639, -589798939, 738167630, 1073856040, 846590726, 1755031960, -810728570, -1866050861, 1784257406, 1136187594, 880520938, -1897797670, -1679595622, -290294933, 1631984758, 188510243, -1309438261, 923744146, -325266590, -1353819815, -1805189884, 1969158227, -1946134951, -1314375310, -376690764, -1431828342, 1163176756, 1186044377, 1998445015, -1522134537, 133041309, 861059467, 2029456642, -849939759}, 93 - TextUtils.lastIndexOf("", '0', 0)).intern());
                }
                try {
                    Class.forName(m8618(new int[]{-220098983, 1962089530, -1993692247, 974971678, 941940219, 436044073, 1470178724, -1029260694, 1965771871, 209770002}, 19 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
                } catch (Throwable unused) {
                }
                Activity activity = this.f3133;
                if (activity != null) {
                    kf.m8369(activity);
                } else {
                    kf.m8375(this.f3130);
                }
                s.m8577(s.this).m6125(this.f3132);
                s.m8577(s.this).m6121(this.f3134.getInitializationSource());
                s.m8577(s.this).m6119(this.f3134.getCoppa());
                s.m8577(s.this).m6124(this.f3134.getDeviceIdType());
                s.m8577(s.this).m6126(this.f3134.getMetaData());
                Context applicationContext = this.f3130.getApplicationContext();
                s.m8601(s.this, applicationContext);
                s.m8604(s.this, new jj(applicationContext));
                s sVar = s.this;
                s.m8603(s.this);
                s.m8605(sVar, new jm(applicationContext, al.m6001(), new String(new char[]{'B', '0', 'r', '1', GMTDateParser.SECONDS, 'W', '@', GMTDateParser.SECONDS, 'H', '3', 'r', 'e'})));
                ar.m6041().mo6066(applicationContext, s.m8583(s.this), s.m8603(s.this), new ar.c() { // from class: com.ironsource.adqualitysdk.sdk.i.s.2.1

                    /* renamed from: ﱟ, reason: contains not printable characters */
                    private static short[] f3135 = null;

                    /* renamed from: ﺙ, reason: contains not printable characters */
                    private static int f3136 = 1;

                    /* renamed from: ﻏ, reason: contains not printable characters */
                    private static int f3137 = 0;

                    /* renamed from: ﻐ, reason: contains not printable characters */
                    private static int f3138 = 13;

                    /* renamed from: ﻛ, reason: contains not printable characters */
                    private static byte[] f3139 = {102, -97, -109, 97, -99, 108, -51, 37, -102, 107, -102, -43, 32, 103, -102, 97, 102, -107, -38, 76, -98, 104, -86, 62, -100, -110, 100, -110, 117, -67, 116, -70, 119, -109, 69, -68, 79, -85, 68, 77, -70, 69, -74, -7, Ascii.SI, 67, -71, 66, -71, -75, 77, -12, Ascii.VT, -101, 0, 0};

                    /* renamed from: ﾇ, reason: contains not printable characters */
                    private static int f3140 = 1674427351;

                    /* renamed from: ﾒ, reason: contains not printable characters */
                    private static int f3141 = 1090558488;

                    @Override // com.ironsource.adqualitysdk.sdk.i.ar.c
                    /* renamed from: ﾇ */
                    public final void mo6080() {
                        int i = 2 % 2;
                        int i2 = f3136 + 95;
                        f3137 = i2 % 128;
                        int i3 = i2 % 2;
                        s.m8609(s.this, ISAdQualityInitError.CONFIG_LOAD_TIMEOUT, m8619((-1090558415) - (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.getOffsetBefore("", 0) - 1674427351, 21 - ((byte) KeyEvent.getModifierMetaStateMask()), (byte) ((-103) - KeyEvent.normalizeMetaState(0)), (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern());
                        int i4 = f3137 + 5;
                        f3136 = i4 % 128;
                        int i5 = i4 % 2;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.ar.c
                    /* renamed from: ｋ */
                    public final void mo6079() {
                        int i = 2 % 2;
                        int i2 = f3137 + 19;
                        f3136 = i2 % 128;
                        int i3 = i2 % 2;
                        s.m8609(s.this, ISAdQualityInitError.NO_NETWORK_CONNECTION, m8619((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 1090558410, (-1674427317) - ((Process.getThreadPriority(0) + 20) >> 6), 8 - (Process.myTid() >> 22), (byte) ((-69) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (short) (ViewConfiguration.getScrollBarSize() >> 8)).intern());
                        int i4 = f3136 + 19;
                        f3137 = i4 % 128;
                        if (i4 % 2 == 0) {
                            return;
                        }
                        Object obj = null;
                        super.hashCode();
                        throw null;
                    }

                    /* renamed from: ﾒ, reason: contains not printable characters */
                    private static String m8619(int i, int i2, int i3, byte b, short s) {
                        String obj;
                        synchronized (n.f3088) {
                            StringBuilder sb = new StringBuilder();
                            int i4 = f3138;
                            int i5 = i3 + i4;
                            int i6 = i5 == -1 ? 1 : 0;
                            if (i6 != 0) {
                                byte[] bArr = f3139;
                                if (bArr != null) {
                                    i5 = (byte) (bArr[f3140 + i2] + i4);
                                } else {
                                    i5 = (short) (f3135[f3140 + i2] + i4);
                                }
                            }
                            if (i5 > 0) {
                                n.f3090 = ((i2 + i5) - 2) + f3140 + i6;
                                n.f3091 = b;
                                n.f3092 = (char) (i + f3141);
                                sb.append(n.f3092);
                                n.f3093 = n.f3092;
                                n.f3089 = 1;
                                while (n.f3089 < i5) {
                                    byte[] bArr2 = f3139;
                                    if (bArr2 != null) {
                                        int i7 = n.f3090;
                                        n.f3090 = i7 - 1;
                                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                                    } else {
                                        short[] sArr = f3135;
                                        int i8 = n.f3090;
                                        n.f3090 = i8 - 1;
                                        n.f3092 = (char) (n.f3093 + (((short) (sArr[i8] + s)) ^ n.f3091));
                                    }
                                    sb.append(n.f3092);
                                    n.f3093 = n.f3092;
                                    n.f3089++;
                                }
                            }
                            obj = sb.toString();
                        }
                        return obj;
                    }
                }, s.m8599(s.this));
                s.m8579(s.this, new jh(applicationContext, s.m8583(s.this), s.m8603(s.this).m6006()));
                final String m8390 = kh.m8390(applicationContext);
                ar.m6041().mo6064(new ax() { // from class: com.ironsource.adqualitysdk.sdk.i.s.2.3

                    /* renamed from: ﻐ, reason: contains not printable characters */
                    private static int f3152 = 0;

                    /* renamed from: ｋ, reason: contains not printable characters */
                    private static long f3153 = 2401687394339677457L;

                    /* renamed from: ﾒ, reason: contains not printable characters */
                    private static int f3154 = 1;

                    @Override // com.ironsource.adqualitysdk.sdk.i.ax
                    /* renamed from: ﾇ */
                    public final void mo5878() {
                        int i = 2 % 2;
                        int i2 = f3152 + 97;
                        f3154 = i2 % 128;
                        int i3 = i2 % 2;
                        if (!ar.m6041().mo6070(m8621("敢Ç긌呗\uf399駭", (-16751175) - Color.rgb(0, 0, 0)).intern(), m8390)) {
                            s.m8612(s.this);
                        }
                        int i4 = f3154 + 41;
                        f3152 = i4 % 128;
                        int i5 = i4 % 2;
                    }

                    /* renamed from: ﾇ, reason: contains not printable characters */
                    private static String m8621(String str, int i) {
                        String str2;
                        char[] cArr = str;
                        if (str != null) {
                            cArr = str.toCharArray();
                        }
                        char[] cArr2 = cArr;
                        synchronized (i.f2454) {
                            i.f2455 = i;
                            char[] cArr3 = new char[cArr2.length];
                            i.f2453 = 0;
                            while (i.f2453 < cArr2.length) {
                                cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f3153);
                                i.f2453++;
                            }
                            str2 = new String(cArr3);
                        }
                        return str2;
                    }
                });
                ar.m6041().mo6073(new ax() { // from class: com.ironsource.adqualitysdk.sdk.i.s.2.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.ax
                    /* renamed from: ﾇ */
                    public final void mo5878() {
                        ar.m6041().mo6068(s.m8571(s.this));
                    }
                });
                s.m8595(s.this, applicationContext);
                s.m8590(s.this, new ai(applicationContext, s.m8577(s.this), s.m8603(s.this), this.f3133 != null, m8390, new r() { // from class: com.ironsource.adqualitysdk.sdk.i.s.2.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.r
                    public void onEvent(final String str) {
                        p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.s.2.2.1

                            /* renamed from: ﮐ, reason: contains not printable characters */
                            private static int f3145 = 1;

                            /* renamed from: ﱟ, reason: contains not printable characters */
                            private static int f3146 = 0;

                            /* renamed from: ﻛ, reason: contains not printable characters */
                            private static char f3147 = 35924;

                            /* renamed from: ﾇ, reason: contains not printable characters */
                            private static int f3148;

                            /* renamed from: ﾒ, reason: contains not printable characters */
                            private static long f3149;

                            @Override // com.ironsource.adqualitysdk.sdk.i.je
                            /* renamed from: ｋ */
                            public final void mo5828() {
                                int i = 2 % 2;
                                int i2 = f3146 + 97;
                                f3145 = i2 % 128;
                                int i3 = i2 % 2;
                                s.m8575(s.this).m6212(m8620("ꞁ壥\ued40ᆘ⯷㉅捹끉\uf2aa茀ꋢ烬∊롿뱶撘溜\uf7d8閳쵙袆玁ᑊ", (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "Ŷ⁴餲㚎", TextUtils.indexOf("", "", 0) + 840987649).intern(), Collections.singletonList(str));
                                int i4 = f3146 + 53;
                                f3145 = i4 % 128;
                                int i5 = i4 % 2;
                            }

                            /* renamed from: ﾒ, reason: contains not printable characters */
                            private static String m8620(String str2, char c, String str3, String str4, int i) {
                                String str5;
                                char[] cArr = str4;
                                if (str4 != null) {
                                    cArr = str4.toCharArray();
                                }
                                char[] cArr2 = cArr;
                                char[] cArr3 = str3;
                                if (str3 != null) {
                                    cArr3 = str3.toCharArray();
                                }
                                char[] cArr4 = cArr3;
                                char[] cArr5 = str2;
                                if (str2 != null) {
                                    cArr5 = str2.toCharArray();
                                }
                                char[] cArr6 = cArr5;
                                synchronized (f.f2042) {
                                    char[] cArr7 = (char[]) cArr2.clone();
                                    char[] cArr8 = (char[]) cArr4.clone();
                                    cArr7[0] = (char) (c ^ cArr7[0]);
                                    cArr8[2] = (char) (cArr8[2] + ((char) i));
                                    int length = cArr6.length;
                                    char[] cArr9 = new char[length];
                                    f.f2041 = 0;
                                    while (f.f2041 < length) {
                                        int i2 = (f.f2041 + 2) % 4;
                                        int i3 = (f.f2041 + 3) % 4;
                                        f.f2043 = (char) (((cArr7[f.f2041 % 4] * 32718) + cArr8[i2]) % 65535);
                                        cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                                        cArr7[i3] = f.f2043;
                                        cArr9[f.f2041] = (char) ((((cArr7[i3] ^ cArr6[f.f2041]) ^ f3149) ^ f3148) ^ f3147);
                                        f.f2041++;
                                    }
                                    str5 = new String(cArr9);
                                }
                                return str5;
                            }
                        });
                    }
                }));
                if (!this.f3134.isUserIdSet()) {
                    s.m8577(s.this).m6115();
                    userId = s.m8573(s.this).m5952();
                }
                if (s.this.m8615()) {
                    s.m8573(s.this).m5954(new ae() { // from class: com.ironsource.adqualitysdk.sdk.i.s.2.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.ae
                        public void onEventReceived(JSONObject jSONObject) {
                            ix.m8126(s.m8568(s.this), is.f2599, jSONObject, new Object[0]);
                        }
                    });
                }
                s.m8573(s.this).m5961(new jm.d() { // from class: com.ironsource.adqualitysdk.sdk.i.s.2.10
                    @Override // com.ironsource.adqualitysdk.sdk.i.jm.d
                    /* renamed from: ﾒ */
                    public final void mo8237() {
                        s.m8612(s.this);
                    }
                });
                s.m8578(s.this, new av(s.m8571(s.this), s.m8573(s.this), m8390, new ba(), new ISAdQualityInitListener() { // from class: com.ironsource.adqualitysdk.sdk.i.s.2.9
                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
                    public final void adQualitySdkInitSuccess() {
                        s.m8570(s.this);
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
                    public final void adQualitySdkInitFailed(ISAdQualityInitError iSAdQualityInitError, String str) {
                        s.m8609(s.this, iSAdQualityInitError, str);
                    }
                }));
                s.m8575(s.this).m6206(new ISAdQualityAdListener() { // from class: com.ironsource.adqualitysdk.sdk.i.s.2.7
                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
                    public final void adDisplayed(String str, ISAdQualityAdType iSAdQualityAdType) {
                        if (s.m8566(s.this) != null) {
                            s.m8566(s.this).adDisplayed(str, iSAdQualityAdType);
                        }
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
                    public final void adClosed(String str, ISAdQualityAdType iSAdQualityAdType) {
                        if (s.m8566(s.this) != null) {
                            s.m8566(s.this).adClosed(str, iSAdQualityAdType);
                        }
                    }
                });
                s.m8602(s.this, new ak(s.m8575(s.this)));
                s.m8591(s.this, new aj(s.m8573(s.this)));
                m.m8519(m8618(new int[]{-2039703538, -1208580424, 1268545984, 1569156487, 399296249, -1341450236}, 12 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), new StringBuilder().append(m8618(new int[]{688385454, -1094328388, -752122836, 821848283, -572773167, 736565876, -1567520102, -1623250767, -1554835937, -1950846443, 1996633543, -2109472075, 1837769608, 261264376, 151061031, -348373588, 336732150, 1534101878}, 33 - (ViewConfiguration.getScrollBarSize() >> 8)).intern()).append(s.m8603(s.this).m6007()).toString());
                s sVar2 = s.this;
                Context context = this.f3133;
                if (context == null) {
                    context = applicationContext;
                }
                s.m8596(sVar2, context, userId);
                s.m8586(s.this, applicationContext);
                s.m8563(s.this);
                s.m8565(s.this);
            } catch (Throwable th) {
                String intern = m8618(new int[]{789883811, -602661946, 1552796825, 568121068, -930305699, -25776735, 908814091, -973797079, 714690418, -1803635588, -236624700, -1799413470, -385177361, -509890424, 352855512, 1657613495, -2079979024, -287455445}, KeyEvent.keyCodeFromString("") + 34).intern();
                kl.m8459(m8618(new int[]{-2039703538, -1208580424, 1268545984, 1569156487, 399296249, -1341450236}, 12 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), intern, th, true, false, true);
                s.m8609(s.this, ISAdQualityInitError.EXCEPTION_ON_INIT, intern);
            }
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static String m8618(int[] iArr, int i) {
            String str;
            synchronized (a.f86) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f3129.clone();
                a.f83 = 0;
                while (a.f83 < iArr.length) {
                    cArr[0] = (char) (iArr[a.f83] >> 16);
                    cArr[1] = (char) iArr[a.f83];
                    cArr[2] = (char) (iArr[a.f83 + 1] >> 16);
                    cArr[3] = (char) iArr[a.f83 + 1];
                    a.f84 = (cArr[0] << 16) + cArr[1];
                    a.f85 = (cArr[2] << 16) + cArr[3];
                    a.m5773(iArr2);
                    for (int i2 = 0; i2 < 16; i2++) {
                        int i3 = a.f84 ^ iArr2[i2];
                        a.f84 = i3;
                        a.f85 = a.m5774(i3) ^ a.f85;
                        int i4 = a.f84;
                        a.f84 = a.f85;
                        a.f85 = i4;
                    }
                    int i5 = a.f84;
                    a.f84 = a.f85;
                    a.f85 = i5;
                    a.f85 = i5 ^ iArr2[16];
                    a.f84 ^= iArr2[17];
                    int i6 = a.f84;
                    int i7 = a.f85;
                    cArr[0] = (char) (a.f84 >>> 16);
                    cArr[1] = (char) a.f84;
                    cArr[2] = (char) (a.f85 >>> 16);
                    cArr[3] = (char) a.f85;
                    a.m5773(iArr2);
                    cArr2[a.f83 << 1] = cArr[0];
                    cArr2[(a.f83 << 1) + 1] = cArr[1];
                    cArr2[(a.f83 << 1) + 2] = cArr[2];
                    cArr2[(a.f83 << 1) + 3] = cArr[3];
                    a.f83 += 2;
                }
                str = new String(cArr2, 0, i);
            }
            return str;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m8606(Application application, Activity activity, String str, ISAdQualityConfig iSAdQualityConfig) {
        int i = 2 % 2;
        String intern = m8584(12 - Color.green(0), (char) (Gravity.getAbsoluteGravity(0, 0) + 22695), ExpandableListView.getPackedPositionChild(0L) + 75).intern();
        ISAdQualityConfig build = iSAdQualityConfig == null ? new ISAdQualityConfig.Builder().build() : iSAdQualityConfig;
        if (ay.m6246().isEmpty()) {
            int i2 = f3105 + 77;
            f3104 = i2 % 128;
            int i3 = i2 % 2;
            String intern2 = m8584((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 56, (char) (49891 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), Color.red(0) + 86).intern();
            m.m8519(intern, intern2);
            m8588(build.getAdQualityInitListeners(), ISAdQualityInitError.NO_AD_NETWORKS, intern2);
            return;
        }
        if (!m8611(build)) {
            build = ISAdQualityConfig.merge(this.f3124, build);
        }
        if (m8561()) {
            String intern3 = m8584((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40, (char) ((-1) - Process.getGidForName("")), 143 - (Process.myPid() >> 22)).intern();
            m.m8519(intern, intern3);
            m8588(build.getAdQualityInitListeners(), ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED, intern3);
            int i4 = f3104 + 7;
            f3105 = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        if (m8567()) {
            int i6 = f3105 + 95;
            f3104 = i6 % 128;
            int i7 = i6 % 2;
            String intern4 = m8584('k' - AndroidCharacter.getMirror('0'), (char) (14502 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 183).intern();
            m.m8519(intern, intern4);
            m8588(build.getAdQualityInitListeners(), ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED, intern4);
            return;
        }
        if (m8616()) {
            String intern5 = m8584((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 48, (char) (TextUtils.getOffsetAfter("", 0) + 49385), TextUtils.lastIndexOf("", '0', 0) + 243).intern();
            m.m8523(intern, intern5);
            m8588(build.getAdQualityInitListeners(), ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN, intern5);
            return;
        }
        if (!(!TextUtils.isEmpty(build.getUserId())) && build.isUserIdSet()) {
            int i8 = f3105 + 35;
            f3104 = i8 % 128;
            int i9 = i8 % 2;
            String intern6 = m8584(View.combineMeasuredStates(0, 0) + 60, (char) (Color.alpha(0) + 45359), 290 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern();
            m.m8523(intern, intern6);
            m8588(build.getAdQualityInitListeners(), ISAdQualityInitError.ILLEGAL_USER_ID, intern6);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            String intern7 = m8584((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 48, (char) (View.MeasureSpec.getSize(0) + 34344), ExpandableListView.getPackedPositionType(0L) + 350).intern();
            m.m8523(intern, intern7);
            m8588(build.getAdQualityInitListeners(), ISAdQualityInitError.ILLEGAL_APP_KEY, intern7);
        } else {
            this.f3109.addAll(build.getAdQualityInitListeners());
            m8582(true);
            jt.m8290().mo8293(application, activity);
            jo.m8248().m8254();
            jq.m8269().m8285();
            p.m8552(new AnonymousClass2(build, str, application, activity));
        }
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private synchronized as m8574() {
        as asVar;
        int i = 2 % 2;
        int i2 = f3105;
        int i3 = i2 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f3104 = i3 % 128;
        if (i3 % 2 == 0) {
            asVar = this.f3123;
            int i4 = 35 / 0;
        } else {
            asVar = this.f3123;
        }
        int i5 = i2 + 35;
        f3104 = i5 % 128;
        int i6 = i5 % 2;
        return asVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public synchronized void shutdown() {
        int i = 2 % 2;
        int i2 = f3105 + 15;
        f3104 = i2 % 128;
        int i3 = i2 % 2;
        m8598(false);
        int i4 = f3104 + 61;
        f3105 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    @Deprecated
    public void setUserConsent(boolean z) {
        int i = 2 % 2;
        int i2 = f3105 + 77;
        f3104 = i2 % 128;
        int i3 = i2 % 2;
        m8574().m6122(z);
        int i4 = f3105 + 7;
        f3104 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:15|(2:17|18)|19|20|(3:22|23|(8:25|26|27|28|(1:30)|31|32|33)(1:36))(1:38)|37|26|27|28|(0)|31|32|33) */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0195 A[Catch: Exception -> 0x026a, all -> 0x02b2, TryCatch #1 {Exception -> 0x026a, blocks: (B:7:0x0006, B:9:0x000f, B:11:0x0015, B:15:0x005a, B:17:0x0079, B:19:0x00a9, B:25:0x00c0, B:27:0x011d, B:28:0x013c, B:30:0x0195, B:31:0x01c7, B:36:0x00e0, B:37:0x00fa, B:38:0x00ff, B:39:0x0214), top: B:6:0x0006, outer: #0 }] */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void m8598(boolean z) {
        String m8584;
        String intern;
        String mo6071;
        int i = 2 % 2;
        try {
            if (m8616()) {
                m.m8523(m8584(TextUtils.getOffsetAfter("", 0) + 12, (char) (22695 - Color.red(0)), 74 - ExpandableListView.getPackedPositionType(0L)).intern(), m8584(37 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (8511 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (Process.myPid() >> 22) + 399).intern());
                int i2 = f3105 + 79;
                f3104 = i2 % 128;
                if (i2 % 2 != 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }
            if (!m8567()) {
                m.m8523(m8584(12 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (22695 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 73).intern(), m8584(KeyEvent.getDeadChar(0, 0) + 59, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 40128), ExpandableListView.getPackedPositionType(0L) + 435).intern());
                return;
            }
            String intern2 = m8584(28 - Color.blue(0), (char) (KeyEvent.normalizeMetaState(0) + 51089), 494 - Color.argb(0, 0, 0, 0)).intern();
            if (z) {
                intern2 = new StringBuilder().append(intern2).append(m8584((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24, (char) Gravity.getAbsoluteGravity(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 522).intern()).toString();
                int i3 = 2 % 2;
            }
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            if (!(!z)) {
                int i4 = f3105 + 5;
                f3104 = i4 % 128;
                if (i4 % 2 == 0) {
                    intern = m8584((-16777210) / Color.rgb(1, 0, 0), (char) (ViewConfiguration.getGlobalActionKeyTimeout() > 1L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 1L ? 0 : -1)), 27409 % (Process.myPid() + 10)).intern();
                    jsonObjectInit.put(m8584((ViewConfiguration.getLongPressTimeout() >> 16) + 1, (char) (ViewConfiguration.getEdgeSlop() >> 16), Color.green(0) + 555).intern(), intern);
                    this.f3116.m5959(m8584(5 - View.resolveSize(0, 0), (char) (47440 - TextUtils.getOffsetBefore("", 0)), 557 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), jsonObjectInit);
                    mo6071 = ar.m6041().mo6071(m8584((ViewConfiguration.getJumpTapTimeout() >> 16) + 6, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 56948), 561 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
                    if (!TextUtils.isEmpty(mo6071)) {
                        intern2 = new StringBuilder().append(intern2).append(m8584(ExpandableListView.getPackedPositionType(0L) + 14, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), ExpandableListView.getPackedPositionType(0L) + 567).intern()).append(mo6071).toString();
                    }
                    m.m8519(m8584(View.resolveSize(0, 0) + 12, (char) (22695 - (ViewConfiguration.getTapTimeout() >> 16)), 73 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), intern2);
                    m8585(ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN, intern2);
                    this.f3120 = true;
                    ar.m6041().mo6047();
                    iu.m8114(this.f3119).m8121();
                    this.f3112.m6210();
                    this.f3113.m8185();
                    this.f3116.m5957();
                    id.m7938();
                }
                m8584 = m8584((-16777210) - Color.rgb(0, 0, 0), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 546 - (Process.myPid() >> 22));
            } else {
                m8584 = m8584(3 - TextUtils.indexOf("", "", 0, 0), (char) (AndroidCharacter.getMirror('0') - '0'), TextUtils.indexOf((CharSequence) "", '0', 0) + 553);
            }
            intern = m8584.intern();
            jsonObjectInit.put(m8584((ViewConfiguration.getLongPressTimeout() >> 16) + 1, (char) (ViewConfiguration.getEdgeSlop() >> 16), Color.green(0) + 555).intern(), intern);
            this.f3116.m5959(m8584(5 - View.resolveSize(0, 0), (char) (47440 - TextUtils.getOffsetBefore("", 0)), 557 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), jsonObjectInit);
            mo6071 = ar.m6041().mo6071(m8584((ViewConfiguration.getJumpTapTimeout() >> 16) + 6, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 56948), 561 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
            if (!TextUtils.isEmpty(mo6071)) {
            }
            m.m8519(m8584(View.resolveSize(0, 0) + 12, (char) (22695 - (ViewConfiguration.getTapTimeout() >> 16)), 73 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), intern2);
            m8585(ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN, intern2);
            this.f3120 = true;
            ar.m6041().mo6047();
            iu.m8114(this.f3119).m8121();
            this.f3112.m6210();
            this.f3113.m8185();
            this.f3116.m5957();
            id.m7938();
        } catch (Exception e) {
            kl.m8459(m8584(11 - ImageFormat.getBitsPerPixel(0), (char) (22695 - (Process.myPid() >> 22)), 74 - View.MeasureSpec.getSize(0)).intern(), m8584(19 - (Process.myPid() >> 22), (char) (ImageFormat.getBitsPerPixel(0) + 1), 581 - TextUtils.indexOf("", "", 0)).intern(), (Throwable) e, true, false, true);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized boolean m8616() {
        int i = 2 % 2;
        int i2 = f3104 + 71;
        int i3 = i2 % 128;
        f3105 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.f3120;
        int i4 = i3 + 33;
        f3104 = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        int i5 = 34 / 0;
        return z;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void changeUserId(String str) {
        String str2;
        int i = 2 % 2;
        try {
            if (!m8600(str)) {
                int i2 = f3105 + 27;
                f3104 = i2 % 128;
                if (i2 % 2 != 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }
            boolean equals = str.equals(m8574().m6120());
            boolean z = !equals;
            boolean mo8292 = jt.m8290().mo8292();
            if (!equals) {
                int i3 = f3105 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f3104 = i3 % 128;
                int i4 = i3 % 2;
                if (mo8292) {
                    this.f3116.m5953();
                }
            }
            str2 = str;
            try {
                m8607(this.f3119, str2, z, true, mo8292);
            } catch (Exception e) {
                e = e;
                kl.m8459(m8584(12 - View.resolveSizeAndState(0, 0, 0), (char) (22695 - View.MeasureSpec.getSize(0)), 74 - ExpandableListView.getPackedPositionType(0L)).intern(), new StringBuilder().append(m8584(((Process.getThreadPriority(0) + 20) >> 6) + 21, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 31560), 600 - Color.red(0)).intern()).append(str2).toString(), (Throwable) e, true, false, true);
            }
        } catch (Exception e2) {
            e = e2;
            str2 = str;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean m8600(String str) {
        int i = 2 % 2;
        if (m8616()) {
            int i2 = f3105 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            f3104 = i2 % 128;
            int i3 = i2 % 2;
            m.m8523(m8584(Process.getGidForName("") + 13, (char) (22695 - (ViewConfiguration.getScrollBarSize() >> 8)), 73 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), m8584(52 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) Color.red(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 622).intern());
            return false;
        }
        if (!m8567()) {
            int i4 = f3104 + 49;
            f3105 = i4 % 128;
            int i5 = i4 % 2;
            m.m8523(m8584(12 - Color.argb(0, 0, 0, 0), (char) (22695 - (ViewConfiguration.getPressedStateDuration() >> 16)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 73).intern(), m8584(65 - ExpandableListView.getPackedPositionGroup(0L), (char) (43125 - Color.blue(0)), 673 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern());
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        int i6 = f3105 + 91;
        f3104 = i6 % 128;
        int i7 = i6 % 2;
        m.m8523(m8584(View.resolveSizeAndState(0, 0, 0) + 12, (char) (22696 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionType(0L) + 74).intern(), m8584((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 33, (char) Color.blue(0), TextUtils.lastIndexOf("", '0', 0, 0) + 739).intern());
        return false;
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.s$3, reason: invalid class name */
    final class AnonymousClass3 implements ax {

        /* renamed from: ﻐ, reason: contains not printable characters */
        final /* synthetic */ boolean f3162;

        /* renamed from: ﻛ, reason: contains not printable characters */
        final /* synthetic */ boolean f3163;

        /* renamed from: ｋ, reason: contains not printable characters */
        final /* synthetic */ String f3164;

        /* renamed from: ﾇ, reason: contains not printable characters */
        final /* synthetic */ Context f3165;

        /* renamed from: ﾒ, reason: contains not printable characters */
        final /* synthetic */ boolean f3166;

        AnonymousClass3(boolean z, Context context, boolean z2, String str, boolean z3) {
            this.f3163 = z;
            this.f3165 = context;
            this.f3166 = z2;
            this.f3164 = str;
            this.f3162 = z3;
        }

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.s$3$3, reason: invalid class name and collision with other inner class name */
        final class C02023 extends je {
            C02023() {
            }

            /* renamed from: com.ironsource.adqualitysdk.sdk.i.s$3$3$3, reason: invalid class name and collision with other inner class name */
            final class C02033 extends je {

                /* renamed from: ﮐ, reason: contains not printable characters */
                private static int f3168 = 0;

                /* renamed from: ﻏ, reason: contains not printable characters */
                private static int f3169 = 1;

                /* renamed from: ﻐ, reason: contains not printable characters */
                private static boolean f3170 = true;

                /* renamed from: ｋ, reason: contains not printable characters */
                private static int f3171 = 262;

                /* renamed from: ﾇ, reason: contains not printable characters */
                private static boolean f3172 = true;

                /* renamed from: ﾒ, reason: contains not printable characters */
                private static char[] f3173 = {364, 370, 359, 365, 308, 367, 376, 377, 378, 345, 363, 372};

                C02033() {
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* renamed from: ｋ */
                public final void mo5828() {
                    int i = 2 % 2;
                    Object obj = null;
                    s.m8560(s.this).m8228(m8622(null, null, KeyEvent.normalizeMetaState(0) + 127, "\u008c\u008b\u008b\u008a\u0089\u0088\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081").intern(), new jm.e() { // from class: com.ironsource.adqualitysdk.sdk.i.s.3.3.3.3

                        /* renamed from: ﻐ, reason: contains not printable characters */
                        private static int f3175 = 0;

                        /* renamed from: ﾇ, reason: contains not printable characters */
                        private static int f3176 = 192;

                        /* renamed from: ﾒ, reason: contains not printable characters */
                        private static int f3177 = 1;

                        /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
                        
                            if (r11 != false) goto L9;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
                        
                            if (r11 != false) goto L9;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
                        
                            r1 = com.ironsource.adqualitysdk.sdk.i.s.AnonymousClass3.C02023.C02033.C02043.f3175 + com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                            com.ironsource.adqualitysdk.sdk.i.s.AnonymousClass3.C02023.C02033.C02043.f3177 = r1 % 128;
                            r1 = r1 % 2;
                            com.ironsource.adqualitysdk.sdk.i.s.m8560(r10.f3178.f3174.f3167.f3161).m8236(m8623(15 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\uffef\u0001\u0001\n\u0002\b�\u0003ￊ\u0002\u0005\u000e\u000f\u0010", 292 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.view.KeyEvent.keyCodeFromString("") + 4, false).intern(), m8623((android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 4, "\ufff9\u0004\u000b�\ufffe", android.view.View.resolveSize(0, 0) + com.safedk.android.analytics.brandsafety.creatives.discoveries.l.f, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) + 3, false).intern(), null);
                            r1 = com.ironsource.adqualitysdk.sdk.i.s.AnonymousClass3.C02023.C02033.C02043.f3175 + com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                            com.ironsource.adqualitysdk.sdk.i.s.AnonymousClass3.C02023.C02033.C02043.f3177 = r1 % 128;
                            r1 = r1 % 2;
                         */
                        @Override // com.ironsource.adqualitysdk.sdk.i.jm.e
                        /* renamed from: ﻐ */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void mo8238(String str) {
                            final boolean isEmpty;
                            int i2 = 2 % 2;
                            int i3 = f3177 + 87;
                            f3175 = i3 % 128;
                            if (i3 % 2 != 0) {
                                isEmpty = TextUtils.isEmpty(str);
                                int i4 = 92 / 0;
                            } else {
                                isEmpty = TextUtils.isEmpty(str);
                            }
                            p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.s.3.3.3.3.4

                                /* renamed from: ﻐ, reason: contains not printable characters */
                                private static int f3179 = 1;

                                /* renamed from: ﻛ, reason: contains not printable characters */
                                private static int[] f3180 = {-765258145, 1176536816, -852058819, -2095207149, -397200914, 1283474195, 1020022731, 1850810316, 721330537, 2069886321, -147482880, 452016866, 458224045, -587712522, -1897439735, 835703309, 1883172268, -1440513445};

                                /* renamed from: ﾇ, reason: contains not printable characters */
                                private static int f3181;

                                /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
                                
                                    r3 = r8.f3183.f3178.f3174.f3167.f3164;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
                                
                                    if (r8.f3183.f3178.f3174.f3167.f3164 != null) goto L11;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:6:0x0060, code lost:
                                
                                    if (r8.f3183.f3178.f3174.f3167.f3164 != null) goto L11;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:7:0x007a, code lost:
                                
                                    r3 = m8624(new int[]{-1078739229, -2045194610}, android.widget.ExpandableListView.getPackedPositionType(0) + 4).intern();
                                 */
                                @Override // com.ironsource.adqualitysdk.sdk.i.je
                                /* renamed from: ｋ */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void mo5828() {
                                    String str2;
                                    int i5 = 2 % 2;
                                    int i6 = f3181 + 75;
                                    f3179 = i6 % 128;
                                    int i7 = i6 % 2;
                                    ai m8573 = s.m8573(s.this);
                                    String intern = m8624(new int[]{-491217882, -1343187667, -2117350090, 553593622}, 7 - (ViewConfiguration.getTouchSlop() >> 8)).intern();
                                    Object obj2 = null;
                                    if (AnonymousClass3.this.f3166) {
                                        int i8 = f3181 + 39;
                                        f3179 = i8 % 128;
                                        if (i8 % 2 == 0) {
                                            int i9 = 85 / 0;
                                        }
                                    } else {
                                        str2 = null;
                                    }
                                    av m8575 = s.m8575(s.this);
                                    new ha(s.m8568(s.this));
                                    s.m8568(s.this);
                                    m8573.m5959(intern, kb.m8333(str2, m8575, isEmpty, s.m8577(s.this)));
                                    if (AnonymousClass3.this.f3162) {
                                        s.m8573(s.this).m5956();
                                    }
                                    int i10 = f3179 + 91;
                                    f3181 = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        return;
                                    }
                                    super.hashCode();
                                    throw null;
                                }

                                /* renamed from: ﻛ, reason: contains not printable characters */
                                private static String m8624(int[] iArr, int i5) {
                                    String str2;
                                    synchronized (a.f86) {
                                        char[] cArr = new char[4];
                                        char[] cArr2 = new char[iArr.length << 1];
                                        int[] iArr2 = (int[]) f3180.clone();
                                        a.f83 = 0;
                                        while (a.f83 < iArr.length) {
                                            cArr[0] = (char) (iArr[a.f83] >> 16);
                                            cArr[1] = (char) iArr[a.f83];
                                            cArr[2] = (char) (iArr[a.f83 + 1] >> 16);
                                            cArr[3] = (char) iArr[a.f83 + 1];
                                            a.f84 = (cArr[0] << 16) + cArr[1];
                                            a.f85 = (cArr[2] << 16) + cArr[3];
                                            a.m5773(iArr2);
                                            for (int i6 = 0; i6 < 16; i6++) {
                                                int i7 = a.f84 ^ iArr2[i6];
                                                a.f84 = i7;
                                                a.f85 = a.m5774(i7) ^ a.f85;
                                                int i8 = a.f84;
                                                a.f84 = a.f85;
                                                a.f85 = i8;
                                            }
                                            int i9 = a.f84;
                                            a.f84 = a.f85;
                                            a.f85 = i9;
                                            a.f85 = i9 ^ iArr2[16];
                                            a.f84 ^= iArr2[17];
                                            int i10 = a.f84;
                                            int i11 = a.f85;
                                            cArr[0] = (char) (a.f84 >>> 16);
                                            cArr[1] = (char) a.f84;
                                            cArr[2] = (char) (a.f85 >>> 16);
                                            cArr[3] = (char) a.f85;
                                            a.m5773(iArr2);
                                            cArr2[a.f83 << 1] = cArr[0];
                                            cArr2[(a.f83 << 1) + 1] = cArr[1];
                                            cArr2[(a.f83 << 1) + 2] = cArr[2];
                                            cArr2[(a.f83 << 1) + 3] = cArr[3];
                                            a.f83 += 2;
                                        }
                                        str2 = new String(cArr2, 0, i5);
                                    }
                                    return str2;
                                }
                            });
                        }

                        /* renamed from: ｋ, reason: contains not printable characters */
                        private static String m8623(int i2, String str, int i3, int i4, boolean z) {
                            String str2;
                            char[] cArr = str;
                            if (str != null) {
                                cArr = str.toCharArray();
                            }
                            char[] cArr2 = cArr;
                            synchronized (d.f1644) {
                                char[] cArr3 = new char[i2];
                                d.f1641 = 0;
                                while (d.f1641 < i2) {
                                    d.f1643 = cArr2[d.f1641];
                                    cArr3[d.f1641] = (char) (d.f1643 + i3);
                                    int i5 = d.f1641;
                                    cArr3[i5] = (char) (cArr3[i5] - f3176);
                                    d.f1641++;
                                }
                                if (i4 > 0) {
                                    d.f1642 = i4;
                                    char[] cArr4 = new char[i2];
                                    System.arraycopy(cArr3, 0, cArr4, 0, i2);
                                    System.arraycopy(cArr4, 0, cArr3, i2 - d.f1642, d.f1642);
                                    System.arraycopy(cArr4, d.f1642, cArr3, 0, i2 - d.f1642);
                                }
                                if (z) {
                                    char[] cArr5 = new char[i2];
                                    d.f1641 = 0;
                                    while (d.f1641 < i2) {
                                        cArr5[d.f1641] = cArr3[(i2 - d.f1641) - 1];
                                        d.f1641++;
                                    }
                                    cArr3 = cArr5;
                                }
                                str2 = new String(cArr3);
                            }
                            return str2;
                        }
                    });
                    int i2 = f3169 + 19;
                    f3168 = i2 % 128;
                    if (i2 % 2 == 0) {
                        return;
                    }
                    super.hashCode();
                    throw null;
                }

                /* renamed from: ﾇ, reason: contains not printable characters */
                private static String m8622(int[] iArr, String str, int i, String str2) {
                    byte[] bArr = str2;
                    if (str2 != null) {
                        bArr = str2.getBytes(C.ISO88591_NAME);
                    }
                    byte[] bArr2 = bArr;
                    char[] cArr = str;
                    if (str != null) {
                        cArr = str.toCharArray();
                    }
                    char[] cArr2 = cArr;
                    synchronized (k.f2956) {
                        char[] cArr3 = f3173;
                        int i2 = f3171;
                        if (f3170) {
                            int length = bArr2.length;
                            k.f2955 = length;
                            char[] cArr4 = new char[length];
                            k.f2957 = 0;
                            while (k.f2957 < k.f2955) {
                                cArr4[k.f2957] = (char) (cArr3[bArr2[(k.f2955 - 1) - k.f2957] + i] - i2);
                                k.f2957++;
                            }
                            return new String(cArr4);
                        }
                        if (f3172) {
                            int length2 = cArr2.length;
                            k.f2955 = length2;
                            char[] cArr5 = new char[length2];
                            k.f2957 = 0;
                            while (k.f2957 < k.f2955) {
                                cArr5[k.f2957] = (char) (cArr3[cArr2[(k.f2955 - 1) - k.f2957] - i] - i2);
                                k.f2957++;
                            }
                            return new String(cArr5);
                        }
                        int length3 = iArr.length;
                        k.f2955 = length3;
                        char[] cArr6 = new char[length3];
                        k.f2957 = 0;
                        while (k.f2957 < k.f2955) {
                            cArr6[k.f2957] = (char) (cArr3[iArr[(k.f2955 - 1) - k.f2957] - i] - i2);
                            k.f2957++;
                        }
                        return new String(cArr6);
                    }
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                if (AnonymousClass3.this.f3163) {
                    s.m8575(s.this).m6208(AnonymousClass3.this.f3165, new C02033());
                }
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ax
        /* renamed from: ﾇ */
        public final void mo5878() {
            p.m8552(new C02023());
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m8607(Context context, String str, boolean z, boolean z2, boolean z3) {
        int i = 2 % 2;
        String m6120 = m8574().m6120();
        m8574().m6117(str);
        if (str != null) {
            if (str.equals(m8584(17 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (KeyEvent.getDeadChar(0, 0) + 17276), 865 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                m.m8523(m8584((KeyEvent.getMaxKeyCode() >> 16) + 12, (char) (22695 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 75 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), new StringBuilder().append(m8584(View.getDefaultSize(0, 0) + 40, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 882 - Color.blue(0)).intern()).append(str).append(m8584(View.MeasureSpec.makeMeasureSpec(0, 0) + 77, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 43814), 922 - ExpandableListView.getPackedPositionGroup(0L)).intern()).toString());
            } else {
                m.m8538(m8584(MotionEvent.axisFromString("") + 13, (char) (22695 - (ViewConfiguration.getLongPressTimeout() >> 16)), TextUtils.lastIndexOf("", '0') + 75).intern(), new StringBuilder().append(m8584(33 - Drawable.resolveOpacity(0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 50591), 999 - TextUtils.getOffsetAfter("", 0)).intern()).append(str).toString());
            }
        } else {
            int i2 = f3105 + 111;
            f3104 = i2 % 128;
            int i3 = i2 % 2;
            m.m8523(m8584((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22695), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 74).intern(), m8584((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 93, (char) (7616 - Color.argb(0, 0, 0, 0)), 772 - (ViewConfiguration.getScrollBarSize() >> 8)).intern());
        }
        ar.m6041().mo6067(new AnonymousClass3(z, context, z2, m6120, z3));
        JSONObject m8572 = m8572();
        if (m8572 != null) {
            ar.m6041().mo6065(m8572);
            return;
        }
        ar.m6041().mo6072(context, m8574(), true);
        int i4 = f3104 + 55;
        f3105 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private JSONObject m8572() {
        int i = 2 % 2;
        int i2 = f3105 + 11;
        f3104 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Map<String, String> m6113 = m8574().m6113();
            if (m6113 != null && m6113.containsKey(m8584(14 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (Process.myPid() >> 22), View.MeasureSpec.makeMeasureSpec(0, 0) + IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT).intern())) {
                try {
                    JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(m6113.get(m8584(13 - View.resolveSizeAndState(0, 0, 0), (char) Color.alpha(0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT).intern()));
                    int i3 = f3105 + 23;
                    f3104 = i3 % 128;
                    int i4 = i3 % 2;
                    return jsonObjectInit;
                } catch (JSONException unused) {
                }
            }
            return null;
        }
        m8574().m6113();
        super.hashCode();
        throw null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v14 java.lang.String, still in use, count: 2, list:
          (r1v14 java.lang.String) from 0x0033: INVOKE (r1v14 java.lang.String) STATIC call: android.text.TextUtils.isEmpty(java.lang.CharSequence):boolean A[MD:(java.lang.CharSequence):boolean (c), WRAPPED] (LINE:519)
          (r1v14 java.lang.String) from 0x005f: PHI (r1v6 java.lang.String) = (r1v5 java.lang.String), (r1v14 java.lang.String) binds: [B:10:0x005d, B:4:0x0037] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* renamed from: ｋ, reason: contains not printable characters */
    private void m8594(android.content.Context r11) {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.ironsource.adqualitysdk.sdk.i.s.f3104
            int r1 = r1 + 27
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.s.f3105 = r2
            int r1 = r1 % r0
            r2 = 1
            java.lang.String r3 = ""
            r4 = 0
            if (r1 == 0) goto L3a
            com.ironsource.adqualitysdk.sdk.i.jm r1 = r10.f3111
            r5 = 107(0x6b, float:1.5E-43)
            int r6 = android.view.MotionEvent.axisFromString(r3)
            int r5 = r5 % r6
            int r6 = android.graphics.Color.green(r2)
            char r6 = (char) r6
            r7 = 25660(0x643c, float:3.5957E-41)
            int r8 = android.view.KeyEvent.normalizeMetaState(r4)
            int r7 = r7 << r8
            java.lang.String r5 = m8584(r5, r6, r7)
            java.lang.String r5 = r5.intern()
            java.lang.String r1 = r1.m8233(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto Le2
            goto L5f
        L3a:
            com.ironsource.adqualitysdk.sdk.i.jm r1 = r10.f3111
            int r5 = android.view.MotionEvent.axisFromString(r3)
            int r5 = 9 - r5
            int r6 = android.graphics.Color.green(r4)
            char r6 = (char) r6
            int r7 = android.view.KeyEvent.normalizeMetaState(r4)
            int r7 = r7 + 1045
            java.lang.String r5 = m8584(r5, r6, r7)
            java.lang.String r5 = r5.intern()
            java.lang.String r1 = r1.m8233(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto Le2
        L5f:
            com.ironsource.adqualitysdk.sdk.i.jm r5 = new com.ironsource.adqualitysdk.sdk.i.jm
            long r6 = android.view.ViewConfiguration.getGlobalActionKeyTimeout()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            int r6 = r6 + 24
            r7 = 48
            int r8 = android.text.TextUtils.indexOf(r3, r7, r4)
            int r8 = r8 + r2
            char r2 = (char) r8
            r8 = 0
            float r9 = android.util.TypedValue.complexToFraction(r4, r8, r8)
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            int r8 = 1055 - r8
            java.lang.String r2 = m8584(r6, r2, r8)
            java.lang.String r2 = r2.intern()
            int r6 = android.view.KeyEvent.normalizeMetaState(r4)
            int r6 = r6 + 24
            int r8 = android.graphics.Color.red(r4)
            int r8 = r8 + 6296
            char r8 = (char) r8
            int r9 = android.view.MotionEvent.axisFromString(r3)
            int r9 = r9 + 1081
            java.lang.String r6 = m8584(r6, r8, r9)
            java.lang.String r6 = r6.intern()
            r5.<init>(r11, r2, r6)
            int r11 = android.view.View.getDefaultSize(r4, r4)
            int r11 = r11 + 10
            int r2 = android.view.ViewConfiguration.getLongPressTimeout()
            int r2 = r2 >> 16
            char r2 = (char) r2
            int r4 = android.graphics.Color.blue(r4)
            int r4 = r4 + 1045
            java.lang.String r11 = m8584(r11, r2, r4)
            java.lang.String r11 = r11.intern()
            r5.m8232(r11, r1)
            com.ironsource.adqualitysdk.sdk.i.jm r11 = r10.f3111
            int r1 = android.view.ViewConfiguration.getEdgeSlop()
            int r1 = r1 >> 16
            int r1 = 10 - r1
            int r2 = android.view.ViewConfiguration.getScrollBarFadeDuration()
            int r2 = r2 >> 16
            char r2 = (char) r2
            int r3 = android.text.TextUtils.indexOf(r3, r7)
            int r3 = 1044 - r3
            java.lang.String r1 = m8584(r1, r2, r3)
            java.lang.String r1 = r1.intern()
            r11.m8227(r1)
        Le2:
            int r11 = com.ironsource.adqualitysdk.sdk.i.s.f3105
            int r11 = r11 + 11
            int r1 = r11 % 128
            com.ironsource.adqualitysdk.sdk.i.s.f3104 = r1
            int r11 = r11 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.s.m8594(android.content.Context):void");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m8614() {
        int i = 2 % 2;
        int i2 = f3105 + 3;
        f3104 = i2 % 128;
        int i3 = i2 % 2;
        if (!(!m8616())) {
            m.m8523(m8584((ViewConfiguration.getJumpTapTimeout() >> 16) + 12, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22695), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 73).intern(), m8584((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 59, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 1103 - TextUtils.lastIndexOf("", '0', 0)).intern());
            return;
        }
        if (m8567()) {
            int i4 = f3104 + 89;
            f3105 = i4 % 128;
            int i5 = i4 % 2;
            m.m8523(m8584(TextUtils.getTrimmedLength("") + 12, (char) (22694 - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.indexOf("", "") + 74).intern(), m8584((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 47, (char) (36991 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 1163 - ExpandableListView.getPackedPositionChild(0L)).intern());
            return;
        }
        this.f3118 = true;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized boolean m8615() {
        boolean z;
        int i = 2 % 2;
        int i2 = f3104;
        int i3 = i2 + 29;
        f3105 = i3 % 128;
        int i4 = i3 % 2;
        z = this.f3118;
        int i5 = i2 + 7;
        f3105 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private synchronized void m8589(boolean z) {
        int i = 2 % 2;
        int i2 = f3104;
        int i3 = i2 + 101;
        f3105 = i3 % 128;
        if (i3 % 2 != 0) {
            this.f3121 = z;
            throw null;
        }
        this.f3121 = z;
        int i4 = i2 + 41;
        f3105 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized ISAdQualityLogLevel m8617() {
        ISAdQualityLogLevel iSAdQualityLogLevel;
        int i = 2 % 2;
        int i2 = f3104 + 41;
        int i3 = i2 % 128;
        f3105 = i3;
        if (i2 % 2 != 0) {
            iSAdQualityLogLevel = this.f3117;
            int i4 = 72 / 0;
        } else {
            iSAdQualityLogLevel = this.f3117;
        }
        int i5 = i3 + 71;
        f3104 = i5 % 128;
        int i6 = i5 % 2;
        return iSAdQualityLogLevel;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m8608(ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i = 2 % 2;
        int i2 = f3104 + 85;
        f3105 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f3117 = iSAdQualityLogLevel;
            Object obj = null;
            super.hashCode();
            throw null;
        }
        this.f3117 = iSAdQualityLogLevel;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private synchronized boolean m8569() {
        boolean z;
        int i = 2 % 2;
        int i2 = f3104 + 25;
        int i3 = i2 % 128;
        f3105 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        z = this.f3121;
        int i4 = i3 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f3104 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        return z;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final synchronized av m8613() {
        av avVar;
        int i = 2 % 2;
        int i2 = f3105 + 13;
        int i3 = i2 % 128;
        f3104 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        avVar = this.f3112;
        int i4 = i3 + 103;
        f3105 = i4 % 128;
        int i5 = i4 % 2;
        return avVar;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private synchronized boolean m8567() {
        boolean z;
        int i = 2 % 2;
        int i2 = f3105;
        int i3 = i2 + 53;
        f3104 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        z = this.f3125;
        int i4 = i2 + 113;
        f3104 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m8610(boolean z) {
        int i = 2 % 2;
        int i2 = f3105 + 21;
        int i3 = i2 % 128;
        f3104 = i3;
        if (i2 % 2 == 0) {
            this.f3125 = false;
        } else {
            this.f3125 = true;
        }
        int i4 = i3 + 3;
        f3105 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private synchronized boolean m8561() {
        boolean z;
        int i = 2 % 2;
        int i2 = f3104 + 85;
        int i3 = i2 % 128;
        f3105 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        z = this.f3122;
        int i4 = i3 + 87;
        f3104 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private synchronized void m8582(boolean z) {
        int i = 2 % 2;
        int i2 = f3105 + 107;
        int i3 = i2 % 128;
        f3104 = i3;
        int i4 = i2 % 2;
        this.f3122 = z;
        int i5 = i3 + 29;
        f3105 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m8581(Context context) {
        int i = 2 % 2;
        try {
            context.registerReceiver(new BroadcastReceiver() { // from class: com.ironsource.adqualitysdk.sdk.i.s.1
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
                    kf.m8371(intent);
                }
            }, new IntentFilter(m8584(37 - KeyEvent.keyCodeFromString(""), (char) (ExpandableListView.getPackedPositionGroup(0L) + 4375), Color.red(0) + 1212).intern()), null, p.m8550());
            int i2 = f3105 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            f3104 = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            m.m8530(m8584(12 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (22695 - (ViewConfiguration.getFadingEdgeLength() >> 16)), TextUtils.indexOf("", "") + 74).intern(), m8584(35 - View.MeasureSpec.getMode(0), (char) TextUtils.getCapsMode("", 0, 0), 1250 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), th);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setAdListener(ISAdQualityAdListener iSAdQualityAdListener) {
        int i = 2 % 2;
        int i2 = f3105 + 11;
        f3104 = i2 % 128;
        if (i2 % 2 == 0) {
            m8616();
            throw null;
        }
        if (m8616()) {
            m.m8523(m8584((KeyEvent.getMaxKeyCode() >> 16) + 12, (char) (22695 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 74).intern(), m8584(TextUtils.lastIndexOf("", '0') + 54, (char) TextUtils.getTrimmedLength(""), 1284 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern());
            return;
        }
        this.f3114 = iSAdQualityAdListener;
        int i3 = f3104 + 67;
        f3105 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void sendCustomMediationRevenue(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        int i = 2 % 2;
        int i2 = f3104 + 5;
        f3105 = i2 % 128;
        int i3 = i2 % 2;
        if (m8616()) {
            m.m8523(m8584((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 22695), 74 - TextUtils.getOffsetAfter("", 0)).intern(), m8584(67 - Color.red(0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 1336 - ImageFormat.getBitsPerPixel(0)).intern());
            return;
        }
        if (m8567()) {
            this.f3110.m5997(iSAdQualityCustomMediationRevenue);
            return;
        }
        m.m8523(m8584((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11, (char) (22695 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), ExpandableListView.getPackedPositionChild(0L) + 75).intern(), m8584(View.MeasureSpec.getSize(0) + 73, (char) (41388 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1404).intern());
        int i4 = f3105 + 35;
        f3104 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setSegment(final ISAdQualitySegment iSAdQualitySegment) {
        int i = 2 % 2;
        int i2 = f3104 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f3105 = i2 % 128;
        int i3 = i2 % 2;
        if (m8616()) {
            int i4 = f3104 + 103;
            f3105 = i4 % 128;
            int i5 = i4 % 2;
            m.m8523(m8584(12 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22694), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 73).intern(), m8584(50 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (TextUtils.indexOf("", "", 0) + 43644), 1476 - TextUtils.lastIndexOf("", '0', 0, 0)).intern());
            int i6 = f3105 + 23;
            f3104 = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            return;
        }
        p.m8552(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5

            /* renamed from: ﱟ, reason: contains not printable characters */
            private static int f3185 = 1;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static char f3186 = 5;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static char[] f3187 = {'A', GMTDateParser.DAY_OF_MONTH, 'Q', AbstractJsonLexerKt.UNICODE_ESC, 'a', 'l', 'i', 't', 'y', 'S', 'D', 'K', 'C', 'n', '\'', ' ', GMTDateParser.SECONDS, 'e', 'g', GMTDateParser.MINUTES, '-', 'I', 'o', GMTDateParser.ZONE, '.'};

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static int f3188;

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                int i7 = 2 % 2;
                if (!s.m8562(s.this)) {
                    m.m8523(m8625(12 - TextUtils.getCapsMode("", 0, 0), (byte) (59 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), "\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\u000b\f").intern(), m8625(TextUtils.getOffsetBefore("", 0) + 55, (byte) (62 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "\u000e\u0002\u000e\n\u0005\u0011\u0011\u0012\u0005\u0011\u0011\u0012\u0013\u000f\u0012\f\u0005\u0011\u0000\u0014\u0018\u0006\u0001\u0002\u0003\u0004\u0000\t\u0007\b\u0005\u0012\u0005\u000e\n\u0010\u000b\u0015\u0012\n\u0002\f\u0010\u0005\u000b\b\b\u0007\u0000\t\b\u0015\u0010\u0002k").intern());
                    return;
                }
                if (s.m8558(s.this) != null) {
                    int i8 = f3185 + 45;
                    f3188 = i8 % 128;
                    if (i8 % 2 != 0) {
                        s.m8558(s.this).m5985(iSAdQualitySegment);
                        throw null;
                    }
                    s.m8558(s.this).m5985(iSAdQualitySegment);
                    int i9 = f3188 + 9;
                    f3185 = i9 % 128;
                    int i10 = i9 % 2;
                }
            }

            /* renamed from: ｋ, reason: contains not printable characters */
            private static String m8625(int i7, byte b, String str) {
                String str2;
                char[] cArr = str;
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (j.f2674) {
                    char[] cArr3 = f3187;
                    char c = f3186;
                    char[] cArr4 = new char[i7];
                    if (i7 % 2 != 0) {
                        i7--;
                        cArr4[i7] = (char) (cArr2[i7] - b);
                    }
                    if (i7 > 1) {
                        j.f2681 = 0;
                        while (j.f2681 < i7) {
                            j.f2680 = cArr2[j.f2681];
                            j.f2677 = cArr2[j.f2681 + 1];
                            if (j.f2680 == j.f2677) {
                                cArr4[j.f2681] = (char) (j.f2680 - b);
                                cArr4[j.f2681 + 1] = (char) (j.f2677 - b);
                            } else {
                                j.f2679 = j.f2680 / c;
                                j.f2676 = j.f2680 % c;
                                j.f2678 = j.f2677 / c;
                                j.f2675 = j.f2677 % c;
                                if (j.f2676 == j.f2675) {
                                    j.f2679 = ((j.f2679 + c) - 1) % c;
                                    j.f2678 = ((j.f2678 + c) - 1) % c;
                                    int i8 = (j.f2679 * c) + j.f2676;
                                    int i9 = (j.f2678 * c) + j.f2675;
                                    cArr4[j.f2681] = cArr3[i8];
                                    cArr4[j.f2681 + 1] = cArr3[i9];
                                } else if (j.f2679 == j.f2678) {
                                    j.f2676 = ((j.f2676 + c) - 1) % c;
                                    j.f2675 = ((j.f2675 + c) - 1) % c;
                                    int i10 = (j.f2679 * c) + j.f2676;
                                    int i11 = (j.f2678 * c) + j.f2675;
                                    cArr4[j.f2681] = cArr3[i10];
                                    cArr4[j.f2681 + 1] = cArr3[i11];
                                } else {
                                    int i12 = (j.f2679 * c) + j.f2675;
                                    int i13 = (j.f2678 * c) + j.f2676;
                                    cArr4[j.f2681] = cArr3[i12];
                                    cArr4[j.f2681 + 1] = cArr3[i13];
                                }
                            }
                            j.f2681 += 2;
                        }
                    }
                    str2 = new String(cArr4);
                }
                return str2;
            }
        });
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setConfig(ISAdQualityConfig iSAdQualityConfig) {
        int i = 2 % 2;
        if (!m8616()) {
            if (!m8561()) {
                this.f3124 = iSAdQualityConfig;
                return;
            }
            int i2 = f3105 + 9;
            f3104 = i2 % 128;
            int i3 = i2 % 2;
            m.m8523(m8584(TextUtils.lastIndexOf("", '0') + 13, (char) (22695 - ((Process.getThreadPriority(0) + 20) >> 6)), TextUtils.indexOf("", "", 0, 0) + 74).intern(), m8584(Color.red(0) + 58, (char) Color.green(0), 1573 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
            return;
        }
        int i4 = f3105 + 111;
        f3104 = i4 % 128;
        int i5 = i4 % 2;
        m.m8523(m8584('<' - AndroidCharacter.getMirror('0'), (char) (22696 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.getOffsetBefore("", 0) + 74).intern(), m8584(48 - View.resolveSize(0, 0), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 1526).intern());
        int i6 = f3104 + 87;
        f3105 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private void m8564() {
        int i = 2 % 2;
        p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.s.4
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                for (ISAdQualityInitListener iSAdQualityInitListener : s.m8559(s.this)) {
                    if (iSAdQualityInitListener != null) {
                        iSAdQualityInitListener.adQualitySdkInitSuccess();
                    }
                }
                s.m8559(s.this).clear();
            }
        });
        int i2 = f3104 + 1;
        f3105 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 77 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m8585(ISAdQualityInitError iSAdQualityInitError, String str) {
        int i = 2 % 2;
        int i2 = f3105 + 13;
        f3104 = i2 % 128;
        int i3 = i2 % 2;
        m8588(this.f3109, iSAdQualityInitError, str);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0015, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.s.AnonymousClass10());
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r2 = r2 + com.vungle.ads.internal.protos.Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        com.ironsource.adqualitysdk.sdk.i.s.f3105 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if ((r2 % 2) != 0) goto L11;
     */
    /* renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m8588(final Set<ISAdQualityInitListener> set, final ISAdQualityInitError iSAdQualityInitError, final String str) {
        int i = 2 % 2;
        int i2 = f3105 + 47;
        int i3 = i2 % 128;
        f3104 = i3;
        if (i2 % 2 == 0) {
            int i4 = 62 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0050, code lost:
    
        if (android.text.TextUtils.isEmpty(r9) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0077, code lost:
    
        return com.safedk.android.internal.partials.IronSourceNetworkBridge.jsonObjectInit(r9).optBoolean(m8584((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 22, (char) android.text.TextUtils.indexOf("", "", 0, 0), android.os.Process.getGidForName("") + 1633).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001c, code lost:
    
        if (r8.f3124 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r8.f3124 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        r3 = r3 + 55;
        com.ironsource.adqualitysdk.sdk.i.s.f3105 = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r9 = r9.getMetaData().get(m8584(android.graphics.ImageFormat.getBitsPerPixel(0) + 14, (char) (android.os.Process.getGidForName("") + 1), 1032 - (android.os.Process.myPid() >> 22)).intern());
     */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m8611(ISAdQualityConfig iSAdQualityConfig) {
        int i = 2 % 2;
        int i2 = f3105 + 23;
        int i3 = i2 % 128;
        f3104 = i3;
        if (i2 % 2 == 0) {
            int i4 = 65 / 0;
        }
        return false;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m8584(int i, char c, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i];
            c.f1198 = 0;
            while (c.f1198 < i) {
                cArr[c.f1198] = (char) ((f3103[c.f1198 + i2] ^ (c.f1198 * f3102)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
