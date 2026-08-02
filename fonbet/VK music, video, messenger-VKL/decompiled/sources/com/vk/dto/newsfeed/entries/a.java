package com.vk.dto.newsfeed.entries;

import android.util.ArrayMap;
import android.util.SparseArray;
import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.ads.PixelStats;
import com.vk.dto.badges.BadgeItem;
import com.vk.dto.common.AdsChoices;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.profile.CatchUpBanner;
import com.vk.dto.reactions.ReactionSet;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.feedback.ButtonsFeedback;
import com.vk.feed.core.models.feedback.Feedback;
import com.vk.feed.core.models.feedback.StarsFeedback;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.header.HeaderTitle;
import com.vk.feed.core.models.header.SourcePhoto;
import com.vk.feed.core.models.news.AdStubEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.YandexNativeAdEntry;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.statistic.DeprecatedStatisticUrl;
import com.vk.toggle.d;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.attachments.AdHideReason;
import com.vkontakte.android.attachments.AdSource;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.attachments.DisclaimerType;
import com.vkontakte.android.attachments.PrettyCardAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.a0a;
import xsna.ak90;
import xsna.bek0;
import xsna.bfm;
import xsna.bpn0;
import xsna.cqm0;
import xsna.dqa0;
import xsna.e0c0;
import xsna.epx;
import xsna.eqy;
import xsna.f370;
import xsna.gzs;
import xsna.hqa0;
import xsna.iah0;
import xsna.l5m;
import xsna.msy;
import xsna.n4c0;
import xsna.nm0;
import xsna.p4g;
import xsna.p6c0;
import xsna.pvo0;
import xsna.qfj;
import xsna.s3q0;
import xsna.ta50;
import xsna.tci;
import xsna.uij0;
import xsna.w8i;
import xsna.ydj0;
import xsna.yg5;

/* compiled from: NewsEntryFactory.kt */
/* loaded from: classes18.dex */
public final class a implements w8i {
    public final Object b;
    public final Object c;
    public final bpn0 d;
    public final bpn0 e;

    /* compiled from: NewsEntryFactory.kt */
    /* renamed from: com.vk.dto.newsfeed.entries.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0913a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((ShitAttachment) this.receiver).Ib();
            return s3q0.a;
        }
    }

    /* compiled from: NewsEntryFactory.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            DeprecatedStatisticInterface.a aVar = ((PromoPost) this.receiver).v;
            Iterator it = aVar.b("load").iterator();
            while (it.hasNext()) {
                com.vkontakte.android.data.b.p((DeprecatedStatisticUrl) it.next());
            }
            Iterator it2 = aVar.b("viewability_measurable").iterator();
            while (it2.hasNext()) {
                com.vkontakte.android.data.b.p((DeprecatedStatisticUrl) it2.next());
            }
            Iterator it3 = aVar.b("render").iterator();
            while (it3.hasNext()) {
                com.vkontakte.android.data.b.p((DeprecatedStatisticUrl) it3.next());
            }
            return s3q0.a;
        }
    }

    /* compiled from: NewsEntryFactory.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((Html5Entry) this.receiver).Gb();
            return s3q0.a;
        }
    }

    public a() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.b = msy.a(lazyThreadSafetyMode, new bfm(this, 24));
        this.c = msy.a(lazyThreadSafetyMode, new qfj(this, 28));
        this.d = new bpn0(new ta50(1));
        this.e = new bpn0(new nm0(23));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsEntry b(a aVar, String str, JSONObject jSONObject, ArrayMap arrayMap, SparseArray sparseArray, Map map, boolean z, ak90 ak90Var, int i) {
        if ((i & 4) != 0) {
            arrayMap = null;
        }
        if ((i & 8) != 0) {
            sparseArray = null;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        if ((i & 64) != 0) {
            ak90Var = ak90.a.a.getSTUB();
        }
        return aVar.a(str, jSONObject, arrayMap, sparseArray, map, z, ak90Var);
    }

    public static NewsEntry c(a aVar, JSONObject jSONObject, ArrayMap arrayMap, SparseArray sparseArray, Map map, boolean z, int i) {
        if ((i & 16) != 0) {
            z = false;
        }
        return aVar.a(jSONObject.optString("type"), jSONObject, arrayMap, sparseArray, map, z, ak90.a.a.getSTUB());
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [T, com.vk.dto.newsfeed.entries.Post] */
    public static final void d(Ref$ObjectRef ref$ObjectRef, Ref$IntRef ref$IntRef, ArrayList arrayList, int i) {
        int size = arrayList.size();
        while (i < size) {
            if (arrayList.get(i) instanceof Post) {
                ref$ObjectRef.element = (Post) arrayList.get(i);
                ref$IntRef.element = i;
                return;
            }
            i++;
        }
        ref$ObjectRef.element = null;
        ref$IntRef.element = -1;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v6 com.vk.feed.core.models.feedback.FeedbackPoll, still in use, count: 2, list:
          (r0v6 com.vk.feed.core.models.feedback.FeedbackPoll) from 0x0edc: MOVE (r66v1 com.vk.feed.core.models.feedback.FeedbackPoll) = (r0v6 com.vk.feed.core.models.feedback.FeedbackPoll)
          (r0v6 com.vk.feed.core.models.feedback.FeedbackPoll) from 0x0d75: MOVE (r66v3 com.vk.feed.core.models.feedback.FeedbackPoll) = (r0v6 com.vk.feed.core.models.feedback.FeedbackPoll)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v41, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26, types: [java.lang.String, xsna.zcl] */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v80 */
    /* JADX WARN: Type inference failed for: r3v81, types: [com.vk.dto.common.LinkButton] */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r3v92 */
    /* JADX WARN: Type inference failed for: r5v50, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v16, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.util.ArrayList] */
    public final com.vk.feed.core.models.news.NewsEntry a(java.lang.String r61, org.json.JSONObject r62, android.util.ArrayMap<java.lang.String, com.vk.dto.reactions.ReactionSet> r63, android.util.SparseArray<com.vk.dto.badges.BadgeItem> r64, java.util.Map<com.vk.dto.common.id.UserId, com.vk.dto.newsfeed.Owner> r65, boolean r66, xsna.ak90 r67) {
        /*
            Method dump skipped, instructions count: 4466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.dto.newsfeed.entries.a.a(java.lang.String, org.json.JSONObject, android.util.ArrayMap, android.util.SparseArray, java.util.Map, boolean, xsna.ak90):com.vk.feed.core.models.news.NewsEntry");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    public final String e(Post post) {
        boolean z = post.nc() || post.dc();
        Owner owner = post.Q;
        if (z && owner != null) {
            return ((n4c0) this.c.getValue()).a(owner, post.n);
        }
        return "https://" + a0a.d + '/' + post.Ab();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e5, code lost:
    
        if (r9 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e7, code lost:
    
        r14 = r9.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e9, code lost:
    
        if (r14 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01eb, code lost:
    
        r14 = r14.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f1, code lost:
    
        r15 = new com.vk.feed.core.models.header.SourcePhoto(r11, r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f6, code lost:
    
        if (r9 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f8, code lost:
    
        r11 = r9.a.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01fc, code lost:
    
        if (r11 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01fe, code lost:
    
        r24 = java.util.Collections.singletonList(new com.vk.feed.core.models.Text(r11, null, 2, false ? 1 : 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x020e, code lost:
    
        r22 = new com.vk.feed.core.models.header.HeaderTitle(null, r24, null, new com.vk.dto.common.VerifyInfo(false, false, false, false, false, false, 63, null), false, false, false, 96, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0238, code lost:
    
        if (r9 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x023a, code lost:
    
        r7 = r9.a.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0240, code lost:
    
        r7 = com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry.a.a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0244, code lost:
    
        if (r9 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0246, code lost:
    
        r11 = r9.a.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x024c, code lost:
    
        r11 = com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry.a.a(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0250, code lost:
    
        if (r9 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0252, code lost:
    
        r9 = r9.a.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0256, code lost:
    
        if (r9 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x025c, code lost:
    
        if (xsna.myc0.f(r9) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0260, code lost:
    
        r22 = new com.vk.feed.core.models.header.EntryHeader(r15, r22, null, xsna.rl3.I(new com.vk.feed.core.models.Description[]{r7, r11, com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry.a.a(r9)}), null, null, null, null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0284, code lost:
    
        if (r2 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0286, code lost:
    
        r7 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0288, code lost:
    
        if (r7 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x028a, code lost:
    
        r7 = r7.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x028c, code lost:
    
        if (r7 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x028e, code lost:
    
        r9 = com.vk.dto.common.Image.CREATOR;
        r7 = r7.a;
        r9 = new com.vkontakte.android.attachments.PhotoAttachment(new com.vk.dto.photo.Photo(com.vk.dto.common.Image.b.c(r7.a, r7.b, r7.c, com.vk.dto.common.ImageSizeKey.SIZE_KEY_UNDEFINED)));
        r9.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02af, code lost:
    
        if (xsna.epx.f(r6, "static") == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02b1, code lost:
    
        r48 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02b6, code lost:
    
        if (r2 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02b8, code lost:
    
        r7 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02ba, code lost:
    
        if (r7 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02bc, code lost:
    
        r7 = r7.a.b0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02c0, code lost:
    
        if (r7 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02c2, code lost:
    
        r9 = new java.util.ArrayList((java.util.ArrayList) r7.c);
        r11 = 10;
        r7 = new java.util.ArrayList(xsna.c5g.u(r9, 10));
        r9 = r9.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02de, code lost:
    
        if (r9.hasNext() == false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02e0, code lost:
    
        r13 = (xsna.xmx) r9.next();
        r24 = r13.w();
        r25 = r13.getText();
        r14 = com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry.CREATOR;
        r15 = "multiple_answers";
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02fa, code lost:
    
        if (xsna.epx.f(r13.a0(), "multiple_answers") == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02fc, code lost:
    
        r26 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0302, code lost:
    
        r14 = r13.b0();
        r42 = r5;
        r15 = new java.util.ArrayList(xsna.c5g.u(r14, r11));
        r5 = r14.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0319, code lost:
    
        if (r5.hasNext() == false) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x031b, code lost:
    
        r14 = (xsna.wmx) r5.next();
        r11 = r14.getId();
        r16 = com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry.CREATOR;
        r85 = r5;
        r5 = r14.getType();
        r86 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x032f, code lost:
    
        if (r5 == 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0332, code lost:
    
        if (r5 == 1) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0335, code lost:
    
        if (r5 == 2) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0339, code lost:
    
        r5 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x033c, code lost:
    
        r9 = r14.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0340, code lost:
    
        if (r9 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0342, code lost:
    
        r9 = r9;
        r16 = r13;
        r18 = r14;
        r13 = new java.util.ArrayList(xsna.c5g.u(r9, 10));
        r0 = r9.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x035b, code lost:
    
        if (r0.hasNext() == false) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x035d, code lost:
    
        r9 = (xsna.ehx) r0.next();
        r14 = com.vk.dto.common.Image.CREATOR;
        r13.add(com.vk.dto.common.Image.b.c(r9.getUrl(), r9.getWidth(), r9.getHeight(), com.vk.dto.common.ImageSizeKey.SIZE_KEY_UNDEFINED));
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0387, code lost:
    
        r15.add(new com.vk.feed.core.models.MyTargetBrandLiftSurvey.Answer(r11, r5, r13, r18.getText()));
        r5 = r85;
        r9 = r86;
        r13 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0381, code lost:
    
        r16 = r13;
        r18 = r14;
        r13 = kotlin.collections.EmptyList.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x033b, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0337, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03a1, code lost:
    
        r86 = r9;
        r0 = r13.Z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x03a9, code lost:
    
        if (r0 == null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x03ab, code lost:
    
        r0 = r0;
        r14 = 10;
        r1 = new java.util.ArrayList(xsna.c5g.u(r0, 10));
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03c0, code lost:
    
        if (r0.hasNext() == false) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03c2, code lost:
    
        r5 = (xsna.ehx) r0.next();
        r9 = com.vk.dto.common.Image.CREATOR;
        r1.add(com.vk.dto.common.Image.b.c(r5.getUrl(), r5.getWidth(), r5.getHeight(), com.vk.dto.common.ImageSizeKey.SIZE_KEY_UNDEFINED));
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x03e0, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03ec, code lost:
    
        r7.add(new com.vk.feed.core.models.MyTargetBrandLiftSurvey.Question(r24, r25, r26, r15, r1));
        r9 = r86;
        r11 = r14;
        r5 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x03e5, code lost:
    
        r14 = 10;
        r1 = kotlin.collections.EmptyList.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02ff, code lost:
    
        r15 = "one_answer";
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0403, code lost:
    
        r42 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0409, code lost:
    
        if (r7.isEmpty() != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x040c, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x040d, code lost:
    
        if (r7 == null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x040f, code lost:
    
        r0 = new com.vk.feed.core.models.MyTargetBrandLiftSurvey(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x041a, code lost:
    
        if (r0 == null) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0420, code lost:
    
        if (xsna.epx.f(r6, "bls") == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0422, code lost:
    
        r50 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0427, code lost:
    
        if (r2 == null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0429, code lost:
    
        r0 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x042b, code lost:
    
        if (r0 == null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x042d, code lost:
    
        r0 = r0.a.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0433, code lost:
    
        if (r0 == null) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0435, code lost:
    
        r51 = xsna.ej90.a.a(r0, new xsna.ej90.b(null, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, xsna.uij0.c.a, xsna.o25.a().i().U, null, 0, 0, null, null, 499), new xsna.ej90.c(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0469, code lost:
    
        r0 = r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0470, code lost:
    
        if (r0 == (-892481938)) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0475, code lost:
    
        if (r0 == 2908512) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x047a, code lost:
    
        if (r0 == 112202875) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0481, code lost:
    
        if (r6.equals("video") != false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0496, code lost:
    
        r0 = com.vk.dto.newsfeed.entries.DisclaimerContent.TEXT_WITH_CONTENT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0493, code lost:
    
        r46 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0499, code lost:
    
        if (r2 == null) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x049b, code lost:
    
        r0 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x049d, code lost:
    
        if (r0 == null) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x049f, code lost:
    
        r0 = r0.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x04a5, code lost:
    
        if (r0 == null) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x04a7, code lost:
    
        r1 = 0.07f;
        r3 = 80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x04ae, code lost:
    
        switch(r0.a) {
            case 6: goto L220;
            case 7: goto L214;
            case 8: goto L220;
            case 9: goto L219;
            case 10: goto L214;
            case 11: goto L217;
            case 12: goto L216;
            case 13: goto L215;
            default: goto L214;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x04b1, code lost:
    
        r1 = 0.0f;
        r0 = null;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x04cf, code lost:
    
        if (r0 == null) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x04d1, code lost:
    
        r45 = new com.vkontakte.android.attachments.DisclaimerData(r0, r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x04db, code lost:
    
        if (r2 == null) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x04dd, code lost:
    
        r0 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x04df, code lost:
    
        if (r0 == null) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x04e1, code lost:
    
        r0 = r0.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x04e5, code lost:
    
        if (r0 == null) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x04e7, code lost:
    
        r57 = r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x04ee, code lost:
    
        if (r22 != null) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04f0, code lost:
    
        r22 = xsna.pwu.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x04f4, code lost:
    
        r36 = new com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry(r37, r38, r39, r40, r41, r42, r6, r44, r45, r46, r22, r48, null, r50, r51, false, r53, null, null, r2, r57, 397312, null);
        r1 = r50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0510, code lost:
    
        if (r1 == null) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0512, code lost:
    
        r1 = (com.vk.feed.core.models.MyTargetBrandLiftSurvey.Question) xsna.j5g.a0(r1.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x051c, code lost:
    
        if (r1 == null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x051e, code lost:
    
        r1 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0523, code lost:
    
        r2 = new com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry.b(r1, new java.util.LinkedHashMap(), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x052e, code lost:
    
        r36.E = r2;
        r1 = r82;
        r7 = r36;
        r8 = "track_code";
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0521, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x052d, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x04ec, code lost:
    
        r57 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x04b8, code lost:
    
        r0 = com.vkontakte.android.attachments.DisclaimerType.ENERGETICS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04bb, code lost:
    
        r0 = com.vkontakte.android.attachments.DisclaimerType.BANKRUPTCY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x04be, code lost:
    
        r0 = com.vkontakte.android.attachments.DisclaimerType.CREDITS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x04c0, code lost:
    
        r1 = 0.1f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x04c3, code lost:
    
        r0 = com.vkontakte.android.attachments.DisclaimerType.SUPPLEMENT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x04c6, code lost:
    
        r0 = com.vkontakte.android.attachments.DisclaimerType.DRUG;
        r1 = 0.05f;
        r3 = 40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x04d9, code lost:
    
        r45 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x04a4, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0491, code lost:
    
        r0 = com.vk.dto.newsfeed.entries.DisclaimerContent.UNSUPPORTED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0488, code lost:
    
        if (r6.equals("carousel") == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x048f, code lost:
    
        if (r6.equals("static") != false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0467, code lost:
    
        r51 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0432, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0425, code lost:
    
        r50 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0415, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0417, code lost:
    
        r42 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x02b4, code lost:
    
        r48 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x025f, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x024b, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x023f, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x020c, code lost:
    
        r24 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x01f0, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x01e4, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x01ce, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0282, code lost:
    
        r22 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x017f, code lost:
    
        r53 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0172, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x015f, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x014c, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0131, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0117, code lost:
    
        if (r2 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0119, code lost:
    
        r2 = r2.b(r5, "VK_NEWS_FEED_INA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x010b, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x00f0, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0094, code lost:
    
        if (r5.equals("site_sdk") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0852, code lost:
    
        if (r5.equals("clip") != false) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0854, code lost:
    
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0861, code lost:
    
        if (r5.equals(com.mbridge.msdk.MBridgeConstans.DYNAMIC_VIEW_WX_APP) == false) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0082, code lost:
    
        if (r5.equals("app_slider") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (r5.equals("mob_sdk") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0097, code lost:
    
        r2 = com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry.CREATOR;
        r2 = (xsna.bjx) r0.e.getValue();
        r3 = r1.getJSONArray(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS).getJSONObject(0);
        r37 = r3.optString("bannerID");
        r38 = r3.optString("pattern_type");
        r39 = r3.optString("template_id");
        r40 = r3.optString("pattern");
        r5 = r3.optString("sdk_source");
        r44 = r3.optString("type");
        r6 = r3.optString("format");
        r41 = r3.optString("ad_data");
        r7 = xsna.epx.f(r6, "static");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e2, code lost:
    
        if (xsna.epx.f(r6, "video") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ec, code lost:
    
        if (com.vk.toggle.b.A.a(com.vk.toggle.features.FeedFeatures.ADS_SDK_INTERNAL_NATIVE_AD_VIDEO) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ee, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f1, code lost:
    
        r11 = xsna.epx.f(r6, "carousel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0b5b, code lost:
    
        if (r5.equals("site_slider_special") == false) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0b69, code lost:
    
        if (r5.equals("site_slider") == false) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fd, code lost:
    
        if (xsna.epx.f(r6, "bls") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0107, code lost:
    
        if (com.vk.toggle.b.A.a(com.vk.toggle.features.FeedFeatures.ADS_SDK_INTERNAL_NATIVE_AD_BLS) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0109, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010c, code lost:
    
        if (r7 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010e, code lost:
    
        if (r9 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0110, code lost:
    
        if (r11 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0112, code lost:
    
        if (r13 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0115, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0123, code lost:
    
        if (xsna.epx.f(r6, "static") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012d, code lost:
    
        if (com.vk.toggle.b.A.a(com.vk.toggle.features.FeedFeatures.ADS_SDK_INTERNAL_NATIVE_AD_STATIC_MULTIPART_HOLDER) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012f, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0136, code lost:
    
        if (xsna.epx.f(r6, "video") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0138, code lost:
    
        r9 = com.vk.toggle.b.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0140, code lost:
    
        if (r9.a(com.vk.toggle.features.FeedFeatures.ADS_SDK_INTERNAL_NATIVE_AD_VIDEO) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0148, code lost:
    
        if (r9.a(com.vk.toggle.features.FeedFeatures.ADS_SDK_INTERNAL_NATIVE_AD_VIDEO_MULTIPART_HOLDER) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014a, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0151, code lost:
    
        if (xsna.epx.f(r6, "carousel") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015b, code lost:
    
        if (com.vk.toggle.b.A.a(com.vk.toggle.features.FeedFeatures.ADS_SDK_INTERNAL_NATIVE_AD_CAROUSEL_MULTIPART_HOLDER) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015d, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0164, code lost:
    
        if (xsna.epx.f(r6, "bls") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0073, code lost:
    
        if (r5.equals("app_video") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016e, code lost:
    
        if (com.vk.toggle.b.A.a(com.vk.toggle.features.FeedFeatures.ADS_SDK_INTERNAL_NATIVE_AD_BLS) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0170, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0173, code lost:
    
        if (r7 != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0175, code lost:
    
        if (r9 != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0177, code lost:
    
        if (r11 != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0179, code lost:
    
        if (r13 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x017c, code lost:
    
        r53 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0183, code lost:
    
        if (r53 == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0185, code lost:
    
        if (r2 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0187, code lost:
    
        r9 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0189, code lost:
    
        if (r9 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018b, code lost:
    
        r11 = r9.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x018d, code lost:
    
        if (r11 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x018f, code lost:
    
        r11 = java.util.Collections.singletonList(new com.vk.dto.newsfeed.Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, r11.a.a, false, 3145727, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01cf, code lost:
    
        if (r9 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d1, code lost:
    
        r13 = r9.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d3, code lost:
    
        if (r13 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d5, code lost:
    
        r14 = com.vk.dto.common.Image.CREATOR;
        r13 = r13.a;
        r13 = com.vk.dto.common.Image.b.c(r13.a, r13.b, r13.c, com.vk.dto.common.ImageSizeKey.SIZE_KEY_UNDEFINED);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0066. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0bd4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0c56  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0b95  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0a66  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0ad8  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0adf  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0aa7  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x09f5  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0975  */
    /* JADX WARN: Type inference failed for: r13v30, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r13v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v33, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.vk.feed.core.models.news.AdStubEntry] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v85 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final NewsEntry f(JSONObject jSONObject, Map<UserId, Owner> map, boolean z, ArrayMap<String, ReactionSet> arrayMap, SparseArray<BadgeItem> sparseArray) {
        ?? r7;
        JSONObject optJSONObject;
        NewsEntry yandexNativeAdEntry;
        boolean z2;
        String str;
        ArrayList arrayList;
        EntryHeader entryHeader;
        JSONArray jSONArray;
        ArrayList arrayList2;
        dqa0 dqa0Var;
        String str2;
        Image image;
        ArrayList arrayList3;
        String str3;
        String str4;
        String str5;
        CatchUpBanner catchUpBanner;
        String str6;
        ArrayList arrayList4;
        JSONObject optJSONObject2;
        DisclaimerData disclaimerData;
        Iterator it;
        boolean z3;
        DisclaimerContent disclaimerContent;
        Iterator<EntryAttachment> it2;
        yg5 yg5Var;
        Iterator it3;
        Enum r72;
        DisclaimerData disclaimerData2;
        ArrayList arrayList5;
        String str7;
        String str8;
        String str9;
        Feedback feedback;
        a aVar = this;
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.getJSONArray(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS).getJSONObject(0).optString("type");
        String str10 = "track_code";
        if (optString != null) {
            String str11 = "icon";
            String str12 = "name";
            String str13 = "id";
            switch (optString.hashCode()) {
                case -1417336615:
                    z2 = z;
                    str10 = "track_code";
                    break;
                case -893900973:
                    z2 = z;
                    str10 = "track_code";
                    break;
                case -338115944:
                    String str14 = str12;
                    String str15 = str11;
                    if (optString.equals("html5_ad")) {
                        JSONArray jSONArray2 = jSONObject2.getJSONArray(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
                        if (jSONArray2.length() == 0) {
                            str10 = "track_code";
                            dqa0Var = null;
                        } else {
                            int i = jSONObject2.getInt("ads_id1");
                            int i2 = jSONObject2.getInt("ads_id2");
                            String optString2 = jSONObject2.optString("ads_title");
                            JSONObject jSONObject3 = jSONArray2.getJSONObject(0);
                            String optString3 = jSONObject2.optString("advertiser_info_url");
                            String optString4 = jSONObject2.optString("ad_marker");
                            int optInt = jSONObject3.optInt("time_to_live");
                            if (optInt != 0 && optInt < 2592000) {
                                optInt += pvo0.a();
                            }
                            int i3 = optInt;
                            JSONObject optJSONObject3 = jSONObject2.optJSONObject("header");
                            EntryHeader n = optJSONObject3 != null ? tci.n(optJSONObject3, map) : null;
                            AdSource.a aVar2 = AdSource.Companion;
                            String optString5 = jSONObject2.optString("ad_source");
                            aVar2.getClass();
                            AdSource a = AdSource.a.a(optString5);
                            JSONObject optJSONObject4 = jSONObject2.optJSONObject("hide_reasons");
                            if (optJSONObject4 != null) {
                                JSONArray optJSONArray = optJSONObject4.optJSONArray("items");
                                if (optJSONArray != null) {
                                    arrayList3 = new ArrayList(optJSONArray.length());
                                    int length = optJSONArray.length();
                                    int i4 = 0;
                                    while (i4 < length) {
                                        JSONObject optJSONObject5 = optJSONArray.optJSONObject(i4);
                                        if (optJSONObject5 != null) {
                                            str4 = str14;
                                            str3 = str15;
                                            arrayList3.add(new AdHideReason(optJSONObject5.getInt(str13), optJSONObject5.optString(str4), optJSONObject5.optString(str3)));
                                        } else {
                                            str3 = str15;
                                            str4 = str14;
                                        }
                                        i4++;
                                        str14 = str4;
                                        str15 = str3;
                                    }
                                } else {
                                    arrayList3 = null;
                                }
                                str = str14;
                                if (arrayList3 != null) {
                                    ArrayList arrayList6 = new ArrayList();
                                    for (Object obj : arrayList3) {
                                        String str16 = ((AdHideReason) obj).c;
                                        if (str16 != null && str16.length() != 0) {
                                            arrayList6.add(obj);
                                        }
                                    }
                                    arrayList = arrayList6;
                                    String optString6 = jSONObject2.optString("recommendation_info");
                                    String optString7 = jSONObject2.optString("ad_url");
                                    JSONObject optJSONObject6 = jSONObject2.optJSONObject("ad_choices");
                                    AdsChoices adsChoices = optJSONObject6 == null ? (AdsChoices) AdsChoices.g.a(optJSONObject6) : null;
                                    String string = jSONObject3.getString("title");
                                    String string2 = jSONObject3.getString("description");
                                    String optString8 = jSONObject3.optString("disclaimer");
                                    if (n != null) {
                                        int i5 = 2;
                                        Image image2 = new Image(jSONObject3.getJSONArray("photo_icon"), null, i5, false ? 1 : 0);
                                        Serializer.c<Owner> cVar = Owner.CREATOR;
                                        entryHeader = new EntryHeader(new SourcePhoto(null, image2, Owner.a.a(iah0.a(40), image2)), new HeaderTitle(null, Collections.singletonList(new Text(cqm0.a(jSONObject3.optString("title")), false ? 1 : 0, i5, false ? 1 : 0)), null, new VerifyInfo(false, false, false, false, false, false, 63, null), false, false, false), null, null, null, null, null, null, null);
                                    } else {
                                        entryHeader = n;
                                    }
                                    String string3 = jSONObject3.getString("link_url_target");
                                    String string4 = jSONObject3.getString("link_url");
                                    String optString9 = jSONObject3.optString("age_restriction");
                                    int i6 = 2;
                                    Image image3 = new Image(jSONObject3.getJSONArray("photo_icon"), null, i6, false ? 1 : 0);
                                    Image image4 = new Image(jSONObject3.getJSONArray("photo_main"), false ? 1 : 0, i6, false ? 1 : 0);
                                    String str17 = "action";
                                    JSONObject jSONObject4 = jSONObject3.getJSONObject("action");
                                    Action.b bVar = Action.b;
                                    Action a2 = Action.a.a(jSONObject4);
                                    JSONObject jSONObject5 = jSONObject3.getJSONObject("html5_app");
                                    str10 = "track_code";
                                    String string5 = jSONObject5.getString(str10);
                                    String string6 = jSONObject5.getString("launch_button_text");
                                    boolean optBoolean = jSONObject5.optBoolean("autolaunch", false);
                                    String string7 = jSONObject5.getString("source_url");
                                    float f = (float) jSONObject5.getDouble("viewport_ratio");
                                    Image image5 = new Image(jSONObject5.getJSONArray("teaser_photo"), null, 2, false ? 1 : 0);
                                    jSONArray = jSONObject5.getJSONArray("inapp_actions");
                                    if (jSONArray == null) {
                                        ArrayList arrayList7 = new ArrayList(jSONArray.length());
                                        int length2 = jSONArray.length();
                                        int i7 = 0;
                                        while (i7 < length2) {
                                            JSONObject optJSONObject7 = jSONArray.optJSONObject(i7);
                                            if (optJSONObject7 != null) {
                                                image = image3;
                                                String string8 = optJSONObject7.getString(str);
                                                JSONObject optJSONObject8 = optJSONObject7.optJSONObject(str17);
                                                Action.b bVar2 = Action.b;
                                                str2 = str17;
                                                arrayList7.add(new Html5Action(string8, Action.a.a(optJSONObject8)));
                                            } else {
                                                str2 = str17;
                                                image = image3;
                                            }
                                            i7++;
                                            str17 = str2;
                                            image3 = image;
                                        }
                                        arrayList2 = arrayList7;
                                    } else {
                                        arrayList2 = null;
                                    }
                                    Html5Entry html5Entry = new Html5Entry(i, i2, i3, optString2, optString9, string, string2, optString8, entryHeader, string3, string4, image3, image4, a2, new Html5Entry.Html5App(string5, string6, optBoolean, string7, f, image5, arrayList2), jSONObject3.getString("ad_data"), null, new NewsEntry.TrackData(jSONObject3.optString(str10), 0, 0L, false, false, null, null, 0, 254, null), null, optString3, optString4, arrayList == null ? p4g.q(arrayList) : null, a, null, optString6, optString7, adsChoices, 8650752, null);
                                    ydj0.c(jSONObject2.optJSONArray("ads_statistics"), html5Entry, html5Entry, i, i2);
                                    Serializer.c<PixelStats> cVar2 = PixelStats.CREATOR;
                                    AdsItemBlockAdStatPixelDto.TypeDto typeDto = AdsItemBlockAdStatPixelDto.TypeDto.IMPRESSION;
                                    html5Entry.F.c = new PixelStats(jSONObject3.getString("ad_data_impression"), typeDto, PixelStats.a.a(typeDto, i, i2, 0, 24));
                                    html5Entry.y = new DeprecatedStatisticUrl(jSONObject3.getString("ad_data_impression"), "impression", i, i2, -1, html5Entry);
                                    dqa0Var = html5Entry;
                                }
                            } else {
                                str = str14;
                            }
                            arrayList = null;
                            String optString62 = jSONObject2.optString("recommendation_info");
                            String optString72 = jSONObject2.optString("ad_url");
                            JSONObject optJSONObject62 = jSONObject2.optJSONObject("ad_choices");
                            if (optJSONObject62 == null) {
                            }
                            String string9 = jSONObject3.getString("title");
                            String string22 = jSONObject3.getString("description");
                            String optString82 = jSONObject3.optString("disclaimer");
                            if (n != null) {
                            }
                            String string32 = jSONObject3.getString("link_url_target");
                            String string42 = jSONObject3.getString("link_url");
                            String optString92 = jSONObject3.optString("age_restriction");
                            int i62 = 2;
                            Image image32 = new Image(jSONObject3.getJSONArray("photo_icon"), null, i62, false ? 1 : 0);
                            Image image42 = new Image(jSONObject3.getJSONArray("photo_main"), false ? 1 : 0, i62, false ? 1 : 0);
                            String str172 = "action";
                            JSONObject jSONObject42 = jSONObject3.getJSONObject("action");
                            Action.b bVar3 = Action.b;
                            Action a22 = Action.a.a(jSONObject42);
                            JSONObject jSONObject52 = jSONObject3.getJSONObject("html5_app");
                            str10 = "track_code";
                            String string52 = jSONObject52.getString(str10);
                            String string62 = jSONObject52.getString("launch_button_text");
                            boolean optBoolean2 = jSONObject52.optBoolean("autolaunch", false);
                            String string72 = jSONObject52.getString("source_url");
                            float f2 = (float) jSONObject52.getDouble("viewport_ratio");
                            Image image52 = new Image(jSONObject52.getJSONArray("teaser_photo"), null, 2, false ? 1 : 0);
                            jSONArray = jSONObject52.getJSONArray("inapp_actions");
                            if (jSONArray == null) {
                            }
                            Html5Entry html5Entry2 = new Html5Entry(i, i2, i3, optString2, optString92, string9, string22, optString82, entryHeader, string32, string42, image32, image42, a22, new Html5Entry.Html5App(string52, string62, optBoolean2, string72, f2, image52, arrayList2), jSONObject3.getString("ad_data"), null, new NewsEntry.TrackData(jSONObject3.optString(str10), 0, 0L, false, false, null, null, 0, 254, null), null, optString3, optString4, arrayList == null ? p4g.q(arrayList) : null, a, null, optString62, optString72, adsChoices, 8650752, null);
                            ydj0.c(jSONObject2.optJSONArray("ads_statistics"), html5Entry2, html5Entry2, i, i2);
                            Serializer.c<PixelStats> cVar22 = PixelStats.CREATOR;
                            AdsItemBlockAdStatPixelDto.TypeDto typeDto2 = AdsItemBlockAdStatPixelDto.TypeDto.IMPRESSION;
                            html5Entry2.F.c = new PixelStats(jSONObject3.getString("ad_data_impression"), typeDto2, PixelStats.a.a(typeDto2, i, i2, 0, 24));
                            html5Entry2.y = new DeprecatedStatisticUrl(jSONObject3.getString("ad_data_impression"), "impression", i, i2, -1, html5Entry2);
                            dqa0Var = html5Entry2;
                        }
                        if (dqa0Var != null) {
                            g(dqa0Var, z, new c(0, dqa0Var, Html5Entry.class, "trackLoaded", "trackLoaded()V", 0));
                            r7 = dqa0Var;
                            break;
                        } else {
                            break;
                        }
                    } else {
                        str10 = "track_code";
                        break;
                    }
                    break;
                case 96801:
                    z2 = z;
                    str5 = "track_code";
                    break;
                case 3056464:
                    z2 = z;
                    str5 = "track_code";
                    break;
                case 3446944:
                    if (optString.equals("post")) {
                        Serializer.c<PromoPost> cVar3 = PromoPost.CREATOR;
                        jSONObject2 = jSONObject;
                        JSONArray jSONArray3 = jSONObject2.getJSONArray(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
                        if (jSONArray3.length() != 0) {
                            int i8 = jSONObject2.getInt("ads_id1");
                            int i9 = jSONObject2.getInt("ads_id2");
                            String optString10 = jSONObject2.optString("ads_title");
                            String optString11 = jSONObject2.optString("ads_debug");
                            JSONObject jSONObject6 = jSONArray3.getJSONObject(0);
                            String optString12 = jSONObject2.optString("advertiser_info_url");
                            String optString13 = jSONObject2.optString("ad_marker");
                            int optInt2 = jSONObject6.optInt("time_to_live");
                            if (optInt2 != 0 && optInt2 <= 2592000) {
                                optInt2 += pvo0.a();
                            } else if (optInt2 == 0) {
                                optInt2 = Integer.MAX_VALUE;
                            }
                            int i10 = optInt2;
                            String optString14 = jSONObject6.optString("ad_data");
                            String optString15 = jSONObject6.optString("age_restriction");
                            String optString16 = jSONObject6.optString("disclaimer");
                            JSONObject optJSONObject9 = jSONObject2.optJSONObject("header");
                            EntryHeader n2 = optJSONObject9 != null ? tci.n(optJSONObject9, map) : null;
                            JSONObject optJSONObject10 = jSONObject6.optJSONObject("post");
                            if (optJSONObject10 != null) {
                                Post a3 = p6c0.a(optJSONObject10, arrayMap, sparseArray, map, uij0.c.a);
                                if (a3 != null) {
                                    JSONObject optJSONObject11 = optJSONObject10.optJSONObject("feedback");
                                    if (optJSONObject11 != null) {
                                        String optString17 = optJSONObject11.optString("type");
                                        if (epx.f(optString17, "stars")) {
                                            Serializer.c<StarsFeedback> cVar4 = StarsFeedback.CREATOR;
                                            feedback = StarsFeedback.a.a(optJSONObject11);
                                        } else if (epx.f(optString17, "buttons")) {
                                            Serializer.c<ButtonsFeedback> cVar5 = ButtonsFeedback.CREATOR;
                                            feedback = ButtonsFeedback.a.a(optJSONObject11);
                                        }
                                        a3.g = feedback;
                                    }
                                    feedback = null;
                                    a3.g = feedback;
                                }
                                if (a3 != null) {
                                    ArrayList<EntryAttachment> arrayList8 = a3.z;
                                    JSONObject optJSONObject12 = jSONObject6.optJSONObject("header_catch_up_link");
                                    if (optJSONObject12 != null) {
                                        Serializer.c<CatchUpBanner> cVar6 = CatchUpBanner.CREATOR;
                                        catchUpBanner = CatchUpBanner.a.a(optJSONObject12);
                                    } else {
                                        catchUpBanner = null;
                                    }
                                    String optString18 = jSONObject2.optString("recommendation_info");
                                    String optString19 = jSONObject2.optString("ad_url");
                                    AdSource.a aVar3 = AdSource.Companion;
                                    String optString20 = jSONObject2.optString("ad_source");
                                    aVar3.getClass();
                                    AdSource a4 = AdSource.a.a(optString20);
                                    JSONObject optJSONObject13 = jSONObject2.optJSONObject("hide_reasons");
                                    if (optJSONObject13 != null) {
                                        JSONArray optJSONArray2 = optJSONObject13.optJSONArray("items");
                                        if (optJSONArray2 != null) {
                                            arrayList5 = new ArrayList(optJSONArray2.length());
                                            int length3 = optJSONArray2.length();
                                            int i11 = 0;
                                            while (i11 < length3) {
                                                JSONObject optJSONObject14 = optJSONArray2.optJSONObject(i11);
                                                if (optJSONObject14 != null) {
                                                    str9 = str13;
                                                    str8 = str12;
                                                    str7 = str11;
                                                    arrayList5.add(new AdHideReason(optJSONObject14.getInt(str9), optJSONObject14.optString(str8), optJSONObject14.optString(str7)));
                                                } else {
                                                    str7 = str11;
                                                    str8 = str12;
                                                    str9 = str13;
                                                }
                                                i11++;
                                                str13 = str9;
                                                str12 = str8;
                                                str11 = str7;
                                            }
                                        } else {
                                            arrayList5 = null;
                                        }
                                        str6 = str13;
                                        if (arrayList5 != null) {
                                            arrayList4 = new ArrayList();
                                            for (Object obj2 : arrayList5) {
                                                String str18 = ((AdHideReason) obj2).c;
                                                if (str18 != null && str18.length() != 0) {
                                                    arrayList4.add(obj2);
                                                }
                                            }
                                            optJSONObject2 = jSONObject6.optJSONObject("disclaimer_img");
                                            if (optJSONObject2 == null) {
                                                String optString21 = optJSONObject2.optString(str6);
                                                if (optString21 != null) {
                                                    try {
                                                        r72 = Enum.valueOf(DisclaimerType.class, optString21.toUpperCase(Locale.US));
                                                    } catch (IllegalArgumentException unused) {
                                                        r72 = null;
                                                    }
                                                    DisclaimerType disclaimerType = (DisclaimerType) r72;
                                                    if (disclaimerType != null) {
                                                        Float u = f370.u("image_ratio", optJSONObject2);
                                                        disclaimerData2 = new DisclaimerData(disclaimerType, u != null ? u.floatValue() : 0.1f, optJSONObject2.optInt("min_height"));
                                                        disclaimerData = disclaimerData2;
                                                    }
                                                }
                                                disclaimerData2 = null;
                                                disclaimerData = disclaimerData2;
                                            } else {
                                                disclaimerData = null;
                                            }
                                            if (arrayList8 != null || !arrayList8.isEmpty()) {
                                                it = arrayList8.iterator();
                                                while (it.hasNext()) {
                                                    int Ab = ((EntryAttachment) it.next()).b.Ab();
                                                    z3 = true;
                                                    if (Ab == 1 || Ab == 0 || Ab == 6) {
                                                        disclaimerContent = DisclaimerContent.TEXT_WITH_CONTENT;
                                                        DisclaimerContent disclaimerContent2 = disclaimerContent;
                                                        JSONObject optJSONObject15 = jSONObject2.optJSONObject("ad_choices");
                                                        AdsChoices adsChoices2 = optJSONObject15 == null ? (AdsChoices) AdsChoices.g.a(optJSONObject15) : null;
                                                        str5 = "track_code";
                                                        String optString22 = jSONObject6.optString(str5);
                                                        JSONObject optJSONObject16 = jSONObject6.optJSONObject("post_ads_info");
                                                        PromoPost promoPost = new PromoPost(i8, i9, optString10, optString14, i10, a3, n2, optString15, optString16, optString11, catchUpBanner, null, a3.L, null, optString12, optString13, arrayList4 == null ? p4g.q(arrayList4) : null, a4, disclaimerData, null, optString18, optString19, adsChoices2, disclaimerContent2, optString22, optJSONObject16 == null ? new e0c0(optJSONObject16.optBoolean("has_cta_button")) : null, 534528, null);
                                                        ydj0.c(jSONObject2.optJSONArray("ads_statistics"), promoPost, promoPost, i8, i9);
                                                        ydj0.c(jSONObject6.optJSONArray("statistics"), promoPost, promoPost, i8, i9);
                                                        it2 = arrayList8.iterator();
                                                        while (it2.hasNext()) {
                                                            Attachment attachment = it2.next().b;
                                                            if ((attachment instanceof VideoAttachment) && (yg5Var = ((VideoAttachment) attachment).i) != null) {
                                                                Serializer.c<ShitAttachment> cVar7 = ShitAttachment.CREATOR;
                                                                ShitAttachment.a.a(promoPost, yg5Var);
                                                                Serializer.c<PromoPost> cVar8 = PromoPost.CREATOR;
                                                                eqy<bek0> eqyVar = d.a;
                                                                FeedFeatures feedFeatures = FeedFeatures.FEED_PROMO_POST_VIDEO_AUTOPLAY_ADS_TAG;
                                                                feedFeatures.getClass();
                                                                if (com.vk.toggle.b.A.a(feedFeatures)) {
                                                                    yg5Var.Q((a3.dc() || a3.F) ? z3 : false);
                                                                }
                                                            }
                                                        }
                                                        String optString23 = jSONObject6.optString("ad_data_impression");
                                                        Serializer.c<PixelStats> cVar9 = PixelStats.CREATOR;
                                                        AdsItemBlockAdStatPixelDto.TypeDto typeDto3 = AdsItemBlockAdStatPixelDto.TypeDto.IMPRESSION;
                                                        promoPost.B.c = new PixelStats(optString23, typeDto3, PixelStats.a.a(typeDto3, i8, i9, 0, 24));
                                                        promoPost.t = new DeprecatedStatisticUrl(optString23, "impression", i8, i9, -1, promoPost);
                                                        dqa0Var = promoPost;
                                                        if (dqa0Var != null) {
                                                            g(dqa0Var, z, new b(0, dqa0Var, PromoPost.class, "trackLoaded", "trackLoaded()V", 0));
                                                            str10 = str5;
                                                            r7 = dqa0Var;
                                                            break;
                                                        } else {
                                                            str10 = str5;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            z3 = true;
                                            if (arrayList8 != null || !arrayList8.isEmpty()) {
                                                it3 = arrayList8.iterator();
                                                while (it3.hasNext()) {
                                                    if (((EntryAttachment) it3.next()).b instanceof PrettyCardAttachment) {
                                                        disclaimerContent = DisclaimerContent.CARDS;
                                                        DisclaimerContent disclaimerContent22 = disclaimerContent;
                                                        JSONObject optJSONObject152 = jSONObject2.optJSONObject("ad_choices");
                                                        if (optJSONObject152 == null) {
                                                        }
                                                        str5 = "track_code";
                                                        String optString222 = jSONObject6.optString(str5);
                                                        JSONObject optJSONObject162 = jSONObject6.optJSONObject("post_ads_info");
                                                        if (optJSONObject162 == null) {
                                                        }
                                                        PromoPost promoPost2 = new PromoPost(i8, i9, optString10, optString14, i10, a3, n2, optString15, optString16, optString11, catchUpBanner, null, a3.L, null, optString12, optString13, arrayList4 == null ? p4g.q(arrayList4) : null, a4, disclaimerData, null, optString18, optString19, adsChoices2, disclaimerContent22, optString222, optJSONObject162 == null ? new e0c0(optJSONObject162.optBoolean("has_cta_button")) : null, 534528, null);
                                                        ydj0.c(jSONObject2.optJSONArray("ads_statistics"), promoPost2, promoPost2, i8, i9);
                                                        ydj0.c(jSONObject6.optJSONArray("statistics"), promoPost2, promoPost2, i8, i9);
                                                        it2 = arrayList8.iterator();
                                                        while (it2.hasNext()) {
                                                        }
                                                        String optString232 = jSONObject6.optString("ad_data_impression");
                                                        Serializer.c<PixelStats> cVar92 = PixelStats.CREATOR;
                                                        AdsItemBlockAdStatPixelDto.TypeDto typeDto32 = AdsItemBlockAdStatPixelDto.TypeDto.IMPRESSION;
                                                        promoPost2.B.c = new PixelStats(optString232, typeDto32, PixelStats.a.a(typeDto32, i8, i9, 0, 24));
                                                        promoPost2.t = new DeprecatedStatisticUrl(optString232, "impression", i8, i9, -1, promoPost2);
                                                        dqa0Var = promoPost2;
                                                        if (dqa0Var != null) {
                                                        }
                                                    }
                                                }
                                            }
                                            disclaimerContent = DisclaimerContent.TEXT;
                                            DisclaimerContent disclaimerContent222 = disclaimerContent;
                                            JSONObject optJSONObject1522 = jSONObject2.optJSONObject("ad_choices");
                                            if (optJSONObject1522 == null) {
                                            }
                                            str5 = "track_code";
                                            String optString2222 = jSONObject6.optString(str5);
                                            JSONObject optJSONObject1622 = jSONObject6.optJSONObject("post_ads_info");
                                            if (optJSONObject1622 == null) {
                                            }
                                            PromoPost promoPost22 = new PromoPost(i8, i9, optString10, optString14, i10, a3, n2, optString15, optString16, optString11, catchUpBanner, null, a3.L, null, optString12, optString13, arrayList4 == null ? p4g.q(arrayList4) : null, a4, disclaimerData, null, optString18, optString19, adsChoices2, disclaimerContent222, optString2222, optJSONObject1622 == null ? new e0c0(optJSONObject1622.optBoolean("has_cta_button")) : null, 534528, null);
                                            ydj0.c(jSONObject2.optJSONArray("ads_statistics"), promoPost22, promoPost22, i8, i9);
                                            ydj0.c(jSONObject6.optJSONArray("statistics"), promoPost22, promoPost22, i8, i9);
                                            it2 = arrayList8.iterator();
                                            while (it2.hasNext()) {
                                            }
                                            String optString2322 = jSONObject6.optString("ad_data_impression");
                                            Serializer.c<PixelStats> cVar922 = PixelStats.CREATOR;
                                            AdsItemBlockAdStatPixelDto.TypeDto typeDto322 = AdsItemBlockAdStatPixelDto.TypeDto.IMPRESSION;
                                            promoPost22.B.c = new PixelStats(optString2322, typeDto322, PixelStats.a.a(typeDto322, i8, i9, 0, 24));
                                            promoPost22.t = new DeprecatedStatisticUrl(optString2322, "impression", i8, i9, -1, promoPost22);
                                            dqa0Var = promoPost22;
                                            if (dqa0Var != null) {
                                            }
                                        }
                                    } else {
                                        str6 = str13;
                                    }
                                    arrayList4 = null;
                                    optJSONObject2 = jSONObject6.optJSONObject("disclaimer_img");
                                    if (optJSONObject2 == null) {
                                    }
                                    if (arrayList8 != null) {
                                    }
                                    it = arrayList8.iterator();
                                    while (it.hasNext()) {
                                    }
                                    z3 = true;
                                    if (arrayList8 != null) {
                                    }
                                    it3 = arrayList8.iterator();
                                    while (it3.hasNext()) {
                                    }
                                    disclaimerContent = DisclaimerContent.TEXT;
                                    DisclaimerContent disclaimerContent2222 = disclaimerContent;
                                    JSONObject optJSONObject15222 = jSONObject2.optJSONObject("ad_choices");
                                    if (optJSONObject15222 == null) {
                                    }
                                    str5 = "track_code";
                                    String optString22222 = jSONObject6.optString(str5);
                                    JSONObject optJSONObject16222 = jSONObject6.optJSONObject("post_ads_info");
                                    if (optJSONObject16222 == null) {
                                    }
                                    PromoPost promoPost222 = new PromoPost(i8, i9, optString10, optString14, i10, a3, n2, optString15, optString16, optString11, catchUpBanner, null, a3.L, null, optString12, optString13, arrayList4 == null ? p4g.q(arrayList4) : null, a4, disclaimerData, null, optString18, optString19, adsChoices2, disclaimerContent2222, optString22222, optJSONObject16222 == null ? new e0c0(optJSONObject16222.optBoolean("has_cta_button")) : null, 534528, null);
                                    ydj0.c(jSONObject2.optJSONArray("ads_statistics"), promoPost222, promoPost222, i8, i9);
                                    ydj0.c(jSONObject6.optJSONArray("statistics"), promoPost222, promoPost222, i8, i9);
                                    it2 = arrayList8.iterator();
                                    while (it2.hasNext()) {
                                    }
                                    String optString23222 = jSONObject6.optString("ad_data_impression");
                                    Serializer.c<PixelStats> cVar9222 = PixelStats.CREATOR;
                                    AdsItemBlockAdStatPixelDto.TypeDto typeDto3222 = AdsItemBlockAdStatPixelDto.TypeDto.IMPRESSION;
                                    promoPost222.B.c = new PixelStats(optString23222, typeDto3222, PixelStats.a.a(typeDto3222, i8, i9, 0, 24));
                                    promoPost222.t = new DeprecatedStatisticUrl(optString23222, "impression", i8, i9, -1, promoPost222);
                                    dqa0Var = promoPost222;
                                    if (dqa0Var != null) {
                                    }
                                }
                            }
                        }
                        str5 = "track_code";
                        dqa0Var = null;
                        if (dqa0Var != null) {
                        }
                    }
                    jSONObject2 = jSONObject;
                    str10 = "track_code";
                    break;
                case 3530567:
                    if (optString.equals("site")) {
                        aVar = this;
                        jSONObject2 = jSONObject;
                        z2 = z;
                        str10 = "track_code";
                        dqa0Var = ydj0.a(jSONObject2, map, ((Boolean) aVar.d.getValue()).booleanValue());
                        if (dqa0Var != null) {
                            aVar.g(dqa0Var, z2, new C0913a(0, dqa0Var, ShitAttachment.class, "trackLoaded", "trackLoaded()V", 0));
                            r7 = dqa0Var;
                            break;
                        }
                    }
                    jSONObject2 = jSONObject;
                    str10 = "track_code";
                    break;
                case 675532610:
                    break;
                case 1224938107:
                    break;
                case 1276675263:
                    break;
                case 1844974813:
                    break;
                default:
                    str10 = "track_code";
                    break;
            }
            if (r7 == 0) {
                Serializer.c<AdStubEntry> cVar10 = AdStubEntry.CREATOR;
                JSONArray optJSONArray3 = jSONObject2.optJSONArray(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
                r7 = new AdStubEntry(new NewsEntry.TrackData((optJSONArray3 == null || (optJSONObject = optJSONArray3.optJSONObject(0)) == null) ? null : optJSONObject.optString(str10), 0, 0L, false, false, null, null, 0, 254, null));
            }
            PromoPost promoPost3 = r7;
            if (!jSONObject2.optBoolean("try_applovin")) {
                String str19 = promoPost3 instanceof PromoPost ? promoPost3.G : promoPost3.Cb().b;
                l5m l5mVar = new l5m(null, null, 3);
                l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.FEED_APPLOVIN_TRACKCODE.h(), null, str19, null, "applovin_ad_parsed", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -22, 3, null);
                l5mVar.q();
                yandexNativeAdEntry = new OptionalNativeAdEntry(promoPost3, str19, null, null, null, null, 60, null);
            } else {
                if (!jSONObject2.optBoolean("try_yandex")) {
                    return promoPost3;
                }
                yandexNativeAdEntry = new YandexNativeAdEntry(promoPost3, promoPost3 instanceof PromoPost ? promoPost3.G : promoPost3.Cb().b, null, null, null, 28, null);
            }
            return yandexNativeAdEntry;
        }
        r7 = 0;
        if (r7 == 0) {
        }
        PromoPost promoPost32 = r7;
        if (!jSONObject2.optBoolean("try_applovin")) {
        }
        return yandexNativeAdEntry;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void g(dqa0 dqa0Var, boolean z, gzs<s3q0> gzsVar) {
        ArrayList<ShitAttachment.Card> arrayList;
        if (!z) {
            gzsVar.invoke();
            return;
        }
        ?? r4 = this.b;
        ((hqa0) r4.getValue()).a(dqa0Var.u6(AdsItemBlockAdStatPixelDto.TypeDto.LOAD));
        if (!(dqa0Var instanceof ShitAttachment) || (arrayList = ((ShitAttachment) dqa0Var).K) == null) {
            return;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            ((hqa0) r4.getValue()).a(((ShitAttachment.Card) it.next()).q.u6(AdsItemBlockAdStatPixelDto.TypeDto.LOAD));
        }
    }
}
