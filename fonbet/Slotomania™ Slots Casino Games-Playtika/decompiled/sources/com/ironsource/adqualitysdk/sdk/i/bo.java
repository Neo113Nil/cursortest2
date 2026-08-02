package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C;
import com.hyprmx.android.BuildConfig;
import com.hyprmx.android.sdk.activity.HyprMXBaseViewController;
import com.hyprmx.android.sdk.activity.HyprMXMraidViewController;
import com.hyprmx.android.sdk.activity.HyprMXNoOffersActivity;
import com.hyprmx.android.sdk.activity.HyprMXOfferViewerActivity;
import com.hyprmx.android.sdk.activity.HyprMXOfferWebViewController;
import com.hyprmx.android.sdk.activity.HyprMXRequiredInformationActivity;
import com.hyprmx.android.sdk.activity.HyprMXVastViewController;
import com.hyprmx.android.sdk.activity.HyprMXWebTrafficViewController;
import com.hyprmx.android.sdk.activity.HyprMXWebView;
import com.hyprmx.android.sdk.activity.HyprMXWebViewClient;
import com.hyprmx.android.sdk.activity.OfferViewerHandler;
import com.hyprmx.android.sdk.api.data.Ad;
import com.hyprmx.android.sdk.api.data.OfferCacheEntity;
import com.hyprmx.android.sdk.api.data.WebTrafficObject;
import com.hyprmx.android.sdk.core.DependencyHolder;
import com.hyprmx.android.sdk.core.HyprMX;
import com.hyprmx.android.sdk.core.HyprMXController;
import com.hyprmx.android.sdk.graphics.HyprMXLearnMoreController;
import com.hyprmx.android.sdk.graphics.HyprMXSkipController;
import com.hyprmx.android.sdk.graphics.HyprMXWebViewWithClosableNavBar;
import com.hyprmx.android.sdk.model.PreloadedVastData;
import com.hyprmx.android.sdk.overlay.HyprMXBrowserActivity;
import com.hyprmx.android.sdk.placement.PlacementController;
import com.hyprmx.android.sdk.placement.PlacementType;
import com.hyprmx.android.sdk.utility.HyprMXProperties;
import com.ironsource.adqualitysdk.sdk.i.be;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class bo extends be {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f957 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f958;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f959;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f960;

    static {
        char[] cArr = new char[1080];
        ByteBuffer.wrap("\u0000VàüÁ ¢x\u0082\u00adcÒD\u0018%P\u0005\u0086æÀÇw§¶\u0085\u001ee¥DV'0\u0007øæ¹Á8 \u0012\u0080£c\u009dB\u001e\"\u0097\u0000HàÀÁ\u0002¢Y\u0082©cÅ*¶Ê>ëü\u0088§¨WI;në\u000f\u009e/XÌ\u000bí¶\u008db¢>C÷`\u0085\u0000[\u0000PàÕÁ\u0013¢H\u0082\u0081cðD3%a\u0005¼æÕÇC§\u0083\u0088Éäj\u0004ö\u0000DàÜÁ\u0002¢N\u0082\u008acùD3%a\u0005«æøÇr§\u009c\u0088Ài\u0001J{*¥\u0000PàËÁ\u0017¢G\u0082\u008bcüD2%j\u0005¬æ×Ç[§\u0080\u0088Øi!J\u007f*£\u000bñÅ\r%\u0085\u0004Gg\u001cGì¦\u0080\u0081Cà8Àâ#´\u0002\u001abÄM\u009d¬I\u008f>ïá\u0000HàÀÁ\u0002¢Y\u0082©cÅD\u0001%j\u0005ªæ×ÇS§\u0096\u0088Ûi2Jw*£\u000bøì\nÍn\u00adÔ\u008e\u0007oLO\u00840ó\u0011=ò_Ò«³õ\u0094~t\u0094UÜË\u001c+©\n`izIó¨\u009b\u008fYî\u0002ÎÚ-\u0086\fklíC½¢~\u0081\u0013áÇÀ\u0086'R\u0006Sf·Eo¤9\u0084·û\u0087ÚU9\u000f\u0019Åx\u0094_*¿é\u009e¢ý6Ü\u0017<ß\u0013\u009drFQ6±\u009a\u0090^÷5×õ6\u0088\u0015Lt\tTÄK\u00adª(\u008aüé§ÈU/1\u000fËn\u0098MS¬\u001b\u008c¬ãbÂ\u0000\"ô\u0001ª`aG\u000b§Ã\u0000HàÀÁ\u0002¢Y\u0082©cÅD\u0018%`\u0005\u0087æçÇ\\§\u0096\u0088Þi\u0016J_*´\u000bäì Ít\u00adÒ\u008e\u0000oT\u0000càÖÁ\u001f¢\u0005\u0082\u008ccäD&%}\u0005¥æùÇ\u0014§\u0092\u0088Âi\u0001Jl*¸\u000bùì-Í,\u00adÈ\u008e\u0010oFOÈ0þ\u0011;òeÒ£³õ\u0094Ut\u0081U×6I\u0017h÷ Øâ¹9\u009aIzå[8<@\u001c§ýÇÞ<¿v\u009f¾\u0080öa\u007fA\u0094\"Ä\u0003\u0000äTÄ²¥à\u00864\u0000HàÀÁ\u0002¢Y\u0082©cÅD\u0019%i\u0005®æäÇH§¥\u0088Åi\u0000Ji*²\u000bâì\bÍa\u00adÏ\u008e\u001do[O\u008f0ë\u0011!\u0000càÖÁ\u001f¢\u0005\u0082\u008ccäD&%}\u0005¥æùÇ\u0014§\u0092\u0088Âi\u0001Jl*¸\u000bùì-Í,\u00adÈ\u008e\u0010oFOÈ0þ\u0011;òeÒ£³õ\u0094Ut\u0081U×6I\u0017h÷ Øâ¹9\u009aIzå[9<I\u001c\u008eýÄÞ(¿E\u009f¥\u0080àaIA\u0092\"Â\u0003(äAÄ¯¥ý\u0086;goGË(\u0001¾\u009f^\u0017\u007fÕ\u001c\u008e<~Ý\u0012úÓ\u009b½»nX#y\u0084\u0019V6\u001e×Öô\u0080\u0094nµ!Rñs§\u0013\u00010ÂÑ\u008eñX\u008e'¯áL\u0087l~\r *\u0082ÊTë\u0010\u0088Ä©\u008e\u0000càÖÁ\u001f¢\u0005\u0082\u008ccäD&%}\u0005¥æùÇ\u0014§\u0092\u0088Âi\u0001Jl*¸\u000bùì-Í,\u00adÈ\u008e\u0010oFOÈ0þ\u0011;òeÒ£³õ\u0094Ut\u0081U×6I\u0017h÷ Øâ¹9\u009aIzå[$<J\u001c\u0099ýÔÞ3¿a\u009f©\u0080áawA\u0099\"Ö\u0003\u0006äPÄ¶¥õ\u00869goGÐ(\u0016\tpé\u0089Ê×«5\u008ccl§Mó.9aû\u0081s ±Ãêã\u001a\u0002v%§DÝd\b\u0087W¦ßÆ)éz\b¡+îK\u000bjM\u008d\u008e¬ÃÌgï«\u000eò.0Q^¥#E«di\u00072'ÂÆ®ák\u0080\u0005 ÐC\u009eb\u0007\u0002ñ-¢Ìyï6\u008fÓ®\u0095IVh\u001b\b¿+sÊ*êè\u0095\u0086U´µ<\u0094þ÷¥×U69\u0011ýp\u0096PV³)\u0092´ònÝ6<ÿ\u001f\u008b\u007fH^:¹Ü\u0098\u009bø0ÛË:¾\u001ate\u0017DÖ§\u0082\u0087Zæ\u0013Á¥!{\u0000OàßÁ\u0014¢N\u0082\u0096cÞD7%l\u0005 æäÇ\u007f§\u009d\u0088Øi\fJj*®\u0000WàÜÁ\u0010¢\u007f\u0082\u0096cüD0%i\u0005¡æâÇu§\u0091\u0088Æi\u0000J}*£\u0000WàÜÁ\u0010¢\u007f\u0082\u0096cüD0%i\u0005¡æâÇo§¡\u0088à\u0000HàÀÁ\u0002¢Y\u0082©cÅD\u001a%j\u0005©æóÇT§¾\u0088Ãi\u0017J{*\u0094\u000bÿì'Ív\u00adÉ\u008e\u001boAO\u008a0ú\u0011*\u0000HàÀÁ\u0002¢Y\u0082©cÅD\u001b%}\u0005©æèÇ^§¥\u0088Åi\u0000Ji*\u0094\u000bÿì'Ív\u00adÉ\u008e\u001boAO\u008a0ú\u0011*\u0000HàÀÁ\u0002¢Y\u0082©cÅD\u0019%i\u0005®æäÇH§¤\u0088Éi\u0007JH*¾\u000bõì>ÍA\u00adÔ\u008e\u001aoYO\u00940ð\u00114ò}Ò¯³ñ\u0000HàÀÁ\u0002¢Y\u0082©cÅD\u0001%j\u0005ªæ×ÇS§\u0096\u0088Û\u0000HàÀÁ\u0002¢Y\u0082©cÅD\u0001%j\u0005ªæ×ÇS§\u0096\u0088Ûi&Jr*¾\u000bõì'ÍvÝð=x\u001cº\u007fá_\u0011¾}\u0099¡øÑØ\u0016;\\\u001aðz\u001dU}´¸\u0097Ñ÷\nÖZ1¹\u0010ÛpmS¨²ù\u0092;íUÊ\u009a*\n\u000bÁh\u009bHC©\u001e\u008eêï¿Ïj,1\r\u009dmnB\u0018£Þ\u0080¯ànÁ &î\u0007\u009bg\u0007DÒ¥\u008c\u0085Vú$Ûè8¶Qû±s\u0090±óêÓ\u001a2v\u0015¶t×T\u0012·B\u0096Êö/Ùq8¢\u001bß{\u000bZO½\u0096\u009cÔüz>/Þ§ÿe\u009c>¼Î]¢zb\u001b\u0003;ÆØ\u0096ù\u001e\u0099û¶¥Wvt\u000b\u0014ß5\u009bÒBó\u0000\u0093®°_Q#qò\u000e\u008c/ZÌ\u0018ìÈ\u008d\u0096Æ'&¯\u0007md6DÆ¥ª\u0082{ã\u0012ÃÈ \u0099\u0001&aùN±¯K\u008c\u0012ìÌÍ\u0096*P\u000b\u0004k Hbý\u0099\u001d,<å_ÿ\u007fv\u009e\u001e¹ÜØ\u0087ø_\u001b\u0003:îZhu8\u0094û·\u0096×Bö\u0003\u0011×0ÖP2sê\u0092¼²2Í\nìÔ\u000f\u008e/BN\u0015i§\u0089v¨zËÕê£\nS%\u001aDüg¦\u0087\u0005¦þÁºáe\u0000(#ÅB\u009bbw}\u001c\u009c°¼dß<þú\u0019¬9X\u0000gàÜÁ\u0006¢|\u0082\u0081cÿD\u0002%}\u0005©æçÇ\\§\u009a\u0088Ïi*J|*½\u000bõì*Ív\u00adî\u008e\u0006oAO\u0095\u0000gàÜÁ\u0006¢d\u0082\u0082cûD3%}\u0005\u008bæàÇY§\u009b\u0088Éi&Jr*¾\u000bóì\"ÍV\u00adÓ\u008e\u0006oBO\u00930ø\u00110òDÒ¸³ï¨;H\u0080iZ\n6*ÜË\u0095ìs\u008d#\u00adñ\u0000gàÜÁ\u0006¢{\u0082\u0088cüD5%j\u0005¥æäÇT§\u0087\u0088øi\u001cJn*²\u000bÕì'Íw\u00adÖZuºÎ\u009b\u0014ø}Ø\u00939ÿ\u001e!\u007fs_¾¼ö\u009dFý\u0082ÒÇ3?\u0010cp©Qæ¶>\u0097b÷àÔ\b5L\u0015\u0080jìK$¨`\u0088½\u0000gàÜÁ\u0006¢o\u0082\u008dcîD\"%}\u0005¡æãÇO§\u0087\u0088Ãi\u0017JW*³\u0000gàÜÁ\u0006¢{\u0082\u0088cüD5%j\u0005¥æäÇT§\u0087\u0088ïi\nJp*£\u000bâì&Ín\u00ad×\u008e\u0011o_\u0000gàÜÁ\u0006¢{\u0082\u0096cøD:%`\u0005©æåÇ_§\u0097\u0088èi\u0004Jj*¶\u0000gàÜÁ\u0006¢{\u0082\u0085cïD7%b\u0005\u00adæõÇ_§\u0081\u0088ß\u0000RàüÁ%¢j\u0082¶cÙD\u0013%K\u0098¶x\bYÙ:\u0091\u001aIû1Üý½¹\u009dc~7_\u0084?@\u0000Ià÷Á$¢j\u0082¨cÔD\u0012\u0000NàöÁ&¢t\u0082\u00adcÓD\u001f%[\u0005\u0081æÀÇv§º\u0088öi JZ".getBytes(C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, 1080);
        f958 = cArr;
        f959 = -4848253644317663047L;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ DependencyHolder m6586() {
        int i = 2 % 2;
        int i2 = f957 + 19;
        f960 = i2 % 128;
        int i3 = i2 % 2;
        DependencyHolder m6584 = m6584();
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        return m6584;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ List m6588(WebTrafficObject webTrafficObject) {
        int i = 2 % 2;
        int i2 = f960 + 45;
        f957 = i2 % 128;
        int i3 = i2 % 2;
        List<WebTrafficObject.WebTrafficURL> m6595 = m6595(webTrafficObject);
        int i4 = f957 + 29;
        f960 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return m6595;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m6589(PreloadedVastData preloadedVastData) {
        int i = 2 % 2;
        int i2 = f957 + 5;
        f960 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject m6596 = m6596(preloadedVastData);
        int i4 = f960 + 91;
        f957 = i4 % 128;
        int i5 = i4 % 2;
        return m6596;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ PreloadedVastData m6597(DependencyHolder dependencyHolder) {
        int i = 2 % 2;
        int i2 = f960 + 75;
        f957 = i2 % 128;
        int i3 = i2 % 2;
        PreloadedVastData m6587 = m6587(dependencyHolder);
        int i4 = f960 + 69;
        f957 = i4 % 128;
        int i5 = i4 % 2;
        return m6587;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m6598(Ad ad) {
        int i = 2 % 2;
        int i2 = f957 + 51;
        f960 = i2 % 128;
        if (i2 % 2 != 0) {
            m6592(ad);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String m6592 = m6592(ad);
        int i3 = f957 + 47;
        f960 = i3 % 128;
        int i4 = i3 % 2;
        return m6592;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ PlacementController m6599(HyprMXController hyprMXController) {
        int i = 2 % 2;
        int i2 = f957 + 49;
        f960 = i2 % 128;
        if (i2 % 2 == 0) {
            return m6590(hyprMXController);
        }
        m6590(hyprMXController);
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Object m6600(String str) {
        int i = 2 % 2;
        int i2 = f957 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f960 = i2 % 128;
        int i3 = i2 % 2;
        Object m6585 = m6585(str);
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        int i5 = f960 + 25;
        f957 = i5 % 128;
        int i6 = i5 % 2;
        return m6585;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m6601(OfferCacheEntity offerCacheEntity) {
        int i = 2 % 2;
        int i2 = f957 + 73;
        f960 = i2 % 128;
        if (i2 % 2 == 0) {
            return m6593(offerCacheEntity);
        }
        m6593(offerCacheEntity);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m6602(DependencyHolder dependencyHolder) {
        int i = 2 % 2;
        int i2 = f957 + 95;
        f960 = i2 % 128;
        int i3 = i2 % 2;
        String m6594 = m6594(dependencyHolder);
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
        return m6594;
    }

    public bo(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        int i = 2 % 2;
        int i2 = f960 + 73;
        f957 = i2 % 128;
        int i3 = i2 % 2;
        try {
            try {
                String str = (String) BuildConfig.class.getDeclaredField(m6591((char) (MotionEvent.axisFromString("") + 1), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, 12 - TextUtils.getTrimmedLength("")).intern()).get(null);
                int i4 = f957 + 69;
                f960 = i4 % 128;
                int i5 = i4 % 2;
                return str;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return id.m7937().m7939().m8046(BuildConfig.class, m6591((char) ((KeyEvent.getMaxKeyCode() >> 16) + 34112), ((Process.getThreadPriority(0) + 20) >> 6) + 12, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13).intern());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    final Class mo6356(String str) {
        char c;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -2118473762:
                if (str.equals(m6591((char) View.MeasureSpec.getSize(0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 24, TextUtils.indexOf("", "", 0, 0) + 6).intern())) {
                    int i2 = f960 + 49;
                    f957 = i2 % 128;
                    int i3 = i2 % 2;
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2115661176:
                if (str.equals(m6591((char) (22011 - TextUtils.indexOf((CharSequence) "", '0')), 508 - ExpandableListView.getPackedPositionGroup(0L), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30).intern())) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -2082076211:
                if (str.equals(m6591((char) (View.resolveSize(0, 0) + 15975), TextUtils.lastIndexOf("", '0') + 764, 28 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -2060981001:
                if (str.equals(m6591((char) ((Process.getThreadPriority(0) + 20) >> 6), View.getDefaultSize(0, 0) + 61, (-16777200) - Color.rgb(0, 0, 0)).intern())) {
                    int i4 = f957 + 81;
                    f960 = i4 % 128;
                    int i5 = i4 % 2;
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1783324338:
                if (str.equals(m6591((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 226 - TextUtils.getTrimmedLength(""), 54 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1711062568:
                if (str.equals(m6591((char) TextUtils.indexOf("", ""), 110 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 31 - Gravity.getAbsoluteGravity(0, 0)).intern())) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1632261541:
                if (str.equals(m6591((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 660 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 12 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern())) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1625751435:
                if (str.equals(m6591((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 395 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 65).intern())) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1429076201:
                if (str.equals(m6591((char) View.MeasureSpec.getSize(0), 633 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 28 - View.resolveSize(0, 0)).intern())) {
                    int i6 = f960 + 73;
                    f957 = i6 % 128;
                    int i7 = i6 % 2;
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1345825871:
                if (str.equals(m6591((char) ((Process.myPid() >> 22) + 50501), 94 - (ViewConfiguration.getJumpTapTimeout() >> 16), 17 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern())) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1289932600:
                if (str.equals(m6591((char) View.MeasureSpec.getSize(0), Color.rgb(0, 0, 0) + 16777770, 16 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -1102538544:
                if (str.equals(m6591((char) (TextUtils.indexOf((CharSequence) "", '0') + 51926), 717 - (ViewConfiguration.getLongPressTimeout() >> 16), 26 - KeyEvent.normalizeMetaState(0)).intern())) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -1056910325:
                if (str.equals(m6591((char) (52095 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 140, 63 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                    int i8 = f960 + 89;
                    f957 = i8 % 128;
                    int i9 = i8 % 2;
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -793729563:
                if (str.equals(m6591((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 203, 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                    int i10 = f957 + 67;
                    f960 = i10 % 128;
                    if (i10 % 2 == 0) {
                        c = '\t';
                        break;
                    } else {
                        c = 'U';
                        break;
                    }
                }
                c = 65535;
                break;
            case -684201479:
                if (str.equals(m6591((char) (20914 - TextUtils.lastIndexOf("", '0')), 743 - ExpandableListView.getPackedPositionGroup(0L), 20 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -411143178:
                if (str.equals(m6591((char) (Process.getGidForName("") + 1), TextUtils.getTrimmedLength("") + 305, View.combineMeasuredStates(0, 0) + 57).intern())) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -352824194:
                if (str.equals(m6591((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 77 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 17 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -58290677:
                if (str.equals(m6591((char) (Color.alpha(0) + 42347), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 483, 24 - TextUtils.indexOf("", "")).intern())) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -52302939:
                if (str.equals(m6591((char) (TextUtils.lastIndexOf("", '0') + 65019), 812 - View.MeasureSpec.getMode(0), Gravity.getAbsoluteGravity(0, 0) + 52).intern())) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -48720897:
                if (str.equals(m6591((char) (ViewConfiguration.getEdgeSlop() >> 16), 280 - (ViewConfiguration.getTouchSlop() >> 8), 26 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2115:
                if (str.equals(m6591((char) (View.MeasureSpec.getMode(0) + 58411), 59 - (Process.myPid() >> 22), 2 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                    int i11 = f960 + 69;
                    f957 = i11 % 128;
                    int i12 = i11 % 2;
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 5206681:
                if (str.equals(m6591((char) (TextUtils.getOffsetBefore("", 0) + 50799), 792 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 21).intern())) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 99044255:
                if (str.equals(m6591((char) TextUtils.indexOf("", ""), View.resolveSize(0, 0) + 46, (KeyEvent.getMaxKeyCode() >> 16) + 13).intern())) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 217655834:
                if (str.equals(m6591((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11006), Color.blue(0) + 30, 16 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 748493318:
                if (str.equals(m6591((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 674, 19 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 902272186:
                if (str.equals(m6591((char) (Process.myTid() >> 22), 608 - View.MeasureSpec.getMode(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 24).intern())) {
                    int i13 = f957 + 63;
                    f960 = i13 % 128;
                    int i14 = i13 % 2;
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1056638846:
                if (str.equals(m6591((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 48854), 362 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.getTrimmedLength("") + 33).intern())) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1527993897:
                if (str.equals(m6591((char) TextUtils.indexOf("", "", 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 538, 16 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1564846544:
                if (str.equals(m6591((char) (25010 - MotionEvent.axisFromString("")), 460 - Color.blue(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24).intern())) {
                    int i15 = f960 + 79;
                    f957 = i15 % 128;
                    int i16 = i15 % 2;
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1575934042:
                if (str.equals(m6591((char) (TextUtils.indexOf("", "", 0) + 56760), 692 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 24 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1775126662:
                if (str.equals(m6591((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 569, Color.rgb(0, 0, 0) + 16777229).intern())) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1872662391:
                if (str.equals(m6591((char) (ViewConfiguration.getEdgeSlop() >> 16), 583 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 24).intern())) {
                    c = 21;
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
                return HyprMX.class;
            case 1:
                return HyprMXController.class;
            case 2:
                return PlacementType.class;
            case 3:
                return Ad.class;
            case 4:
                return DependencyHolder.class;
            case 5:
                return PreloadedVastData.class;
            case 6:
                return HyprMXProperties.class;
            case 7:
            case '\b':
                return HyprMXWebViewWithClosableNavBar.class;
            case '\t':
            case '\n':
                return HyprMXNoOffersActivity.class;
            case 11:
            case '\f':
                return HyprMXOfferViewerActivity.class;
            case '\r':
            case 14:
                return HyprMXRequiredInformationActivity.class;
            case 15:
                return HyprMXBaseViewController.class;
            case 16:
                return HyprMXVastViewController.class;
            case 17:
                return HyprMXWebTrafficViewController.class;
            case 18:
                return OfferCacheEntity.class;
            case 19:
                return WebTrafficObject.class;
            case 20:
                return WebTrafficObject.WebTrafficURL.class;
            case 21:
                return HyprMXLearnMoreController.class;
            case 22:
                return HyprMXMraidViewController.class;
            case 23:
                return HyprMXOfferWebViewController.class;
            case 24:
                return HyprMXWebView.class;
            case 25:
                return HyprMXWebViewClient.class;
            case 26:
                return OfferViewerHandler.class;
            case 27:
                return OfferViewerHandler.OfferViewerHandlerListener.class;
            case 28:
                return HyprMXSkipController.class;
            case 29:
                return HyprMXSkipController.Listener.class;
            case 30:
            case 31:
                return HyprMXBrowserActivity.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put(m6591((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 863 - MotionEvent.axisFromString(""), ((Process.getThreadPriority(0) + 20) >> 6) + 23).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bo.m6588((WebTrafficObject) list.get(0));
            }
        });
        hashMap.put(m6591((char) (ViewConfiguration.getTouchSlop() >> 8), 887 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf("", "", 0, 0) + 28).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bo.m6601((OfferCacheEntity) list.get(0));
            }
        });
        hashMap.put(m6591((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43099), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 915, Drawable.resolveOpacity(0, 0) + 9).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bo.m6598((Ad) list.get(0));
            }
        });
        hashMap.put(m6591((char) (ViewConfiguration.getPressedStateDuration() >> 16), 924 - (ViewConfiguration.getPressedStateDuration() >> 16), 20 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bo.m6600((String) list.get(0));
            }
        });
        hashMap.put(m6591((char) (TextUtils.indexOf("", "", 0) + 23058), MotionEvent.axisFromString("") + 945, ((Process.getThreadPriority(0) + 20) >> 6) + 27).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bo.m6586();
            }
        });
        hashMap.put(m6591((char) ((Process.getThreadPriority(0) + 20) >> 6), 970 - TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.indexOf((CharSequence) "", '0') + 17).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bo.m6602((DependencyHolder) list.get(0));
            }
        });
        hashMap.put(m6591((char) TextUtils.getCapsMode("", 0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 986, 22 - Color.green(0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bo.m6599((HyprMXController) list.get(0));
            }
        });
        hashMap.put(m6591((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1009 - View.getDefaultSize(0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 15).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.9
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bo.m6597((DependencyHolder) list.get(0));
            }
        });
        hashMap.put(m6591((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1024, (Process.myPid() >> 22) + 13).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bo.m6589((PreloadedVastData) list.get(0));
            }
        });
        int i2 = f960 + 13;
        f957 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 19 / 0;
        }
        return hashMap;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static List<WebTrafficObject.WebTrafficURL> m6595(WebTrafficObject webTrafficObject) {
        int i = 2 % 2;
        int i2 = f960 + 55;
        f957 = i2 % 128;
        int i3 = i2 % 2;
        List<WebTrafficObject.WebTrafficURL> list = webTrafficObject.urls;
        int i4 = f960 + 23;
        f957 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m6593(OfferCacheEntity offerCacheEntity) {
        int i = 2 % 2;
        int i2 = f957 + 101;
        f960 = i2 % 128;
        int i3 = i2 % 2;
        String str = offerCacheEntity.clickThroughUrl;
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static PreloadedVastData m6587(DependencyHolder dependencyHolder) {
        int i = 2 % 2;
        int i2 = f960 + 107;
        f957 = i2 % 128;
        int i3 = i2 % 2;
        PreloadedVastData preloadedData = dependencyHolder.getPreloadedData();
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        return preloadedData;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static JSONObject m6596(PreloadedVastData preloadedVastData) {
        int i = 2 % 2;
        int i2 = f960 + 75;
        f957 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject parameters = preloadedVastData.getParameters();
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        return parameters;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m6592(Ad ad) {
        int i = 2 % 2;
        int i2 = f960 + 81;
        f957 = i2 % 128;
        int i3 = i2 % 2;
        String str = ad.type;
        if (i3 == 0) {
            throw null;
        }
        int i4 = f957 + 29;
        f960 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return str;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static Object m6585(String str) {
        int i = 2 % 2;
        char c = 65535;
        switch (str.hashCode()) {
            case -1617199657:
                if (str.equals(m6591((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + IronSourceError.ERROR_RV_EXPIRED_ADS, 7 - Drawable.resolveOpacity(0, 0)).intern())) {
                    int i2 = f960 + 51;
                    f957 = i2 % 128;
                    int i3 = i2 % 2;
                    c = 2;
                    break;
                }
                break;
            case -1372958932:
                if (str.equals(m6591((char) (39167 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 1046 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 12).intern())) {
                    c = 1;
                    break;
                }
                break;
            case -65580248:
                if (str.equals(m6591((char) ((-1) - ImageFormat.getBitsPerPixel(0)), Gravity.getAbsoluteGravity(0, 0) + 1065, 15 - TextUtils.indexOf("", "", 0)).intern())) {
                    c = 3;
                    break;
                }
                break;
            case 543046670:
                if (str.equals(m6591((char) View.resolveSizeAndState(0, 0, 0), TextUtils.getOffsetBefore("", 0) + IronSourceError.ERROR_RV_SHOW_EXCEPTION, 7 - ImageFormat.getBitsPerPixel(0)).intern())) {
                    int i4 = f957 + 43;
                    f960 = i4 % 128;
                    int i5 = i4 % 2;
                    c = 0;
                    break;
                }
                break;
        }
        if (c == 0) {
            return PlacementType.REWARDED;
        }
        if (c == 1) {
            return PlacementType.INTERSTITIAL;
        }
        if (c == 2) {
            return PlacementType.INVALID;
        }
        if (c != 3) {
            return null;
        }
        return PlacementType.NOT_INITIALIZED;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static DependencyHolder m6584() {
        int i = 2 % 2;
        int i2 = f960 + 99;
        f957 = i2 % 128;
        if (i2 % 2 == 0) {
            DependencyHolder dependencyHolder = DependencyHolder.INSTANCE;
            Object obj = null;
            super.hashCode();
            throw null;
        }
        DependencyHolder dependencyHolder2 = DependencyHolder.INSTANCE;
        int i3 = f957 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f960 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 49 / 0;
        }
        return dependencyHolder2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m6594(DependencyHolder dependencyHolder) {
        int i = 2 % 2;
        int i2 = f960 + 71;
        f957 = i2 % 128;
        if (i2 % 2 == 0) {
            dependencyHolder.getDistributorId();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String distributorId = dependencyHolder.getDistributorId();
        int i3 = f960 + 3;
        f957 = i3 % 128;
        int i4 = i3 % 2;
        return distributorId;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static PlacementController m6590(HyprMXController hyprMXController) {
        int i = 2 % 2;
        int i2 = f960 + 115;
        f957 = i2 % 128;
        int i3 = i2 % 2;
        PlacementController placementController = hyprMXController.getPlacementController();
        int i4 = f960 + 9;
        f957 = i4 % 128;
        int i5 = i4 % 2;
        return placementController;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m6591(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f958[c.f1198 + i] ^ (c.f1198 * f959)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
