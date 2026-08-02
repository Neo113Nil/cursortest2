package com.vk.qrcode;

import android.content.Context;
import android.net.Uri;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.zxing.client.result.ParsedResult;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.utils.dto.UtilsResolveScreenNameWithDataPlatformDto;
import com.vk.common.links.LaunchContext;
import com.vk.device.store.AppStore;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.UserProfile;
import com.vk.qrcode.QRStatsTracker;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Collections;
import java.util.List;
import kotlin.text.Regex;
import ru.ok.android.utils.Logger;
import xsna.bz60;
import xsna.c63;
import xsna.cqm0;
import xsna.drm0;
import xsna.e420;
import xsna.e43;
import xsna.epx;
import xsna.eqd;
import xsna.fz2;
import xsna.gj80;
import xsna.gmq;
import xsna.hl10;
import xsna.hq3;
import xsna.hz2;
import xsna.iu5;
import xsna.izs;
import xsna.jeq0;
import xsna.jns0;
import xsna.l140;
import xsna.laz;
import xsna.lgj0;
import xsna.maz;
import xsna.naz;
import xsna.ngj0;
import xsna.o25;
import xsna.oq80;
import xsna.oqt;
import xsna.peq0;
import xsna.po40;
import xsna.q76;
import xsna.quz;
import xsna.rl3;
import xsna.rsg0;
import xsna.rsr;
import xsna.sm0;
import xsna.smq;
import xsna.tj60;
import xsna.tmq;
import xsna.ttp0;
import xsna.v34;
import xsna.x34;
import xsna.xwk;
import xsna.xzs;
import xsna.yfb;
import xsna.z6u;
import xsna.zr;

/* compiled from: QRTypes.kt */
/* loaded from: classes5.dex */
public class c extends q76 {
    public final boolean c;
    public String d;
    public final QRTypes$SubType e;
    public final String f;

    /* compiled from: QRTypes.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QRTypes$SubType.values().length];
            try {
                iArr[QRTypes$SubType.LINK_USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QRTypes$SubType.LINK_GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QRTypes$SubType.LINK_VK_EVENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[QRTypes$SubType.LINK_VK_APP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v53, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, kotlin.Lazy] */
    public c(ParsedResult parsedResult, boolean z) {
        super(parsedResult);
        this.c = z;
        String p = cqm0.p(parsedResult.toString());
        this.d = p;
        QRTypes$SubType qRTypes$SubType = QRTypes$SubType.LINK_EXTERNAL;
        this.e = qRTypes$SubType;
        Uri parse = Uri.parse(p);
        if (parse == null || !naz.s(parse)) {
            return;
        }
        peq0 peq0Var = !drm0.E(parse.toString(), '#') ? new peq0(parse) : new peq0(parse, new String[]{jeq0.c(parse)});
        String q = peq0Var.q(0);
        this.f = q != null ? drm0.U(q, DomExceptionUtils.SEPARATOR) : null;
        if (peq0.p(peq0Var, (Regex) laz.y.getValue(), null, null, 14)) {
            qRTypes$SubType = QRTypes$SubType.LINK_VK_PAY;
        } else if (peq0.p(peq0Var, (Regex) laz.w.getValue(), null, null, 14)) {
            qRTypes$SubType = QRTypes$SubType.LINK_MONEY_TRANSFER;
        } else if (!peq0Var.k("vk.me") || !peq0.p(peq0Var, laz.g(), null, null, 14)) {
            if (peq0Var.k("vk.me") && !peq0.p(peq0Var, (Regex) laz.v.getValue(), null, null, 14)) {
                qRTypes$SubType = QRTypes$SubType.LINK_VK_ME;
            } else if (peq0.p(peq0Var, (Regex) laz.o.getValue(), null, null, 14)) {
                qRTypes$SubType = QRTypes$SubType.LINK_USER;
            } else if (peq0.p(peq0Var, (Regex) laz.q.getValue(), null, null, 14)) {
                qRTypes$SubType = QRTypes$SubType.LINK_VK_EVENT;
            } else if (peq0.p(peq0Var, (Regex) laz.p.getValue(), null, null, 14)) {
                qRTypes$SubType = QRTypes$SubType.LINK_GROUP;
            } else {
                boolean p2 = peq0.p(peq0Var, (Regex) laz.r.getValue(), null, null, 14);
                Uri uri = peq0Var.a;
                if (p2) {
                    qRTypes$SubType = !epx.f(uri.getQueryParameter("act"), "edit") ? QRTypes$SubType.LINK_POST : QRTypes$SubType.LINK_INNER;
                } else {
                    String queryParameter = uri.getQueryParameter(Logger.METHOD_W);
                    if (queryParameter == null || !((Regex) laz.x.getValue()).f(queryParameter)) {
                        Regex regex = Article.v;
                        qRTypes$SubType = Article.a.a(this.d) ? QRTypes$SubType.LINK_ARTICLE : peq0.p(peq0Var, (Regex) laz.s.getValue(), null, null, 14) ? QRTypes$SubType.LINK_VK_APP : peq0.p(peq0Var, (Regex) laz.B.getValue(), null, null, 14) ? QRTypes$SubType.LINK_CLIP : peq0.p(peq0Var, (Regex) laz.C.getValue(), null, null, 14) ? QRTypes$SubType.LINK_CLIPS_HASHTAG : peq0.p(peq0Var, (Regex) laz.D.getValue(), null, null, 14) ? QRTypes$SubType.LINK_QR_AUTH : naz.B(parse) ? QRTypes$SubType.LINK_QR_AUTH : QRTypes$SubType.LINK_INNER;
                    } else {
                        this.f = uri.getQueryParameter(Logger.METHOD_W);
                        qRTypes$SubType = QRTypes$SubType.LINK_POST;
                    }
                }
            }
        }
        this.e = qRTypes$SubType;
    }

    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.q76
    public <T> io.reactivex.rxjava3.core.q<T> a() {
        String str;
        List<String> b;
        List<String> b2;
        List<String> b3;
        String str2 = this.d;
        if (str2 != null && xwk.d().a().g(str2)) {
            if (o() == QRTypes$SubType.LINK_EXTERNAL || o() == QRTypes$SubType.LINK_INNER || o() == QRTypes$SubType.NONE || o() == QRTypes$SubType.LINK_VK_ME) {
                String a2 = naz.a(str2);
                if (o() == QRTypes$SubType.LINK_INNER || o() == QRTypes$SubType.LINK_VK_ME || naz.C(a2)) {
                    str = a2;
                } else {
                    ParsedResult parsedResult = (ParsedResult) this.b;
                    str = xwk.d().getBrowser().b(Uri.parse(a2), Collections.singletonMap("ref", "qr"), parsedResult instanceof iu5 ? ((iu5) parsedResult).a : null).toString();
                }
                AppStore.a aVar = AppStore.Companion;
                Uri parse = Uri.parse(a2);
                aVar.getClass();
                LaunchContext launchContext = new LaunchContext(false, false, false, null, null, null, null, null, null, null, null, AppStore.a.a(parse) != null, false, false, null, null, null, null, null, false, false, null, null, null, 67100671);
                maz e = xwk.d().e();
                c63 c63Var = c63.a;
                Context b4 = c63.b();
                if (b4 == null && (b4 = e43.a) == null) {
                    b4 = null;
                }
                maz.c(e, b4, str, launchContext, null, m(), 8);
                return null;
            }
            if (o() == QRTypes$SubType.LINK_POST) {
                return rsr.r().b((String) ((hl10.a) new Regex("([-0-9]+)_([0-9]+)").b(this.f).b()).get(0)).U(new v34(new l140(10), 27));
            }
            int i = 6;
            int i2 = 3;
            if (o() == QRTypes$SubType.LINK_ARTICLE) {
                return rsg0.y0(new hq3(r(), 6), null, null, 3).U(new x34(new quz(18), 26));
            }
            if (o() == QRTypes$SubType.LINK_MONEY_TRANSFER) {
                return io.reactivex.rxjava3.core.q.T(UserProfile.f0);
            }
            if (rl3.G(new QRTypes$SubType[]{QRTypes$SubType.LINK_USER, QRTypes$SubType.LINK_GROUP, QRTypes$SubType.LINK_VK_EVENT, QRTypes$SubType.LINK_VK_APP}, o())) {
                return rsg0.y0(yfb.x(po40.s(new po40(), this.f, UtilsResolveScreenNameWithDataPlatformDto.ANDROID, null, null, "", null, 92)), null, null, 3).U(new tj60(new gj80(this, 8), 5));
            }
            if (o() == QRTypes$SubType.LINK_CLIP) {
                ?? r3 = laz.B;
                hl10 b5 = ((Regex) r3.getValue()).b(str2);
                String str3 = (b5 == null || (b3 = b5.b()) == null) ? null : (String) ((hl10.a) b3).get(1);
                hl10 b6 = ((Regex) r3.getValue()).b(str2);
                String str4 = (b6 == null || (b2 = b6.b()) == null) ? null : (String) ((hl10.a) b2).get(2);
                if (str3 != null && str4 != null) {
                    return rsg0.y0(new jns0(new UserId(Long.parseLong(str3)), Integer.parseInt(str4)), null, null, 3);
                }
            } else {
                int i3 = 15;
                if (o() == QRTypes$SubType.LINK_CLIPS_HASHTAG) {
                    hl10 b7 = ((Regex) laz.C.getValue()).b(str2);
                    String str5 = (b7 == null || (b = b7.b()) == null) ? null : (String) ((hl10.a) b).get(1);
                    if (str5 != null) {
                        String concat = "#".concat(str5);
                        e420 e420Var = new e420(i3);
                        hz2 z = yfb.z(lgj0.a.l(new ngj0(), 0, null, zr.a("{\"tag\": \"", concat, "\"}"), null, null, null, null, null, null, null, null, null, 524282), new sm0(22));
                        if (!o25.a().b()) {
                            z.d = true;
                            z.c = true;
                        }
                        fz2 y = yfb.y(new ngj0().C(concat, null, null, null, null, e43.l(BaseUserGroupFieldsDto.VERIFIED.i(), BaseUserGroupFieldsDto.MEMBER_STATUS.i())), new eqd(e420Var, 21));
                        if (!o25.a().b()) {
                            y.d = true;
                            y.c = true;
                        }
                        return rsg0.y0(new oqt(z, y), null, null, 3);
                    }
                } else if (o() == QRTypes$SubType.LINK_QR_AUTH) {
                    String str6 = this.d;
                    return (str6 == null ? io.reactivex.rxjava3.core.q.T(Boolean.FALSE) : new io.reactivex.rxjava3.internal.operators.observable.q(new oq80(str6, i2))).U(new bz60(new z6u(i3), i));
                }
            }
        }
        return null;
    }

    @Override // xsna.q76
    public final void c(Object obj, xzs xzsVar) {
        Context context = e43.a;
        Context context2 = context != null ? context : null;
        if (obj instanceof Group) {
            smq a2 = tmq.a();
            Group group = (Group) obj;
            ttp0.e(2, null);
            a2.c(context2, group, null, ttp0.e(1, xzsVar) ? (izs) xzsVar : null, null, "qr_popup", null);
        } else if (obj instanceof UserProfile) {
            smq a3 = tmq.a();
            UserProfile userProfile = (UserProfile) obj;
            ttp0.e(2, null);
            a3.b(context2, userProfile, null, ttp0.e(1, xzsVar) ? (izs) xzsVar : null, null, "qr_popup", null);
        } else if (obj instanceof Post) {
            smq a4 = tmq.a();
            gmq gmqVar = (gmq) obj;
            ttp0.e(2, null);
            smq.f(a4, context2, gmqVar, null, null, ttp0.e(1, xzsVar) ? (izs) xzsVar : null, false, null, null, 4);
        } else if (obj instanceof Article) {
            smq a5 = tmq.a();
            Article article = (Article) obj;
            ArticleAttachment articleAttachment = new ArticleAttachment(article);
            ttp0.e(2, null);
            smq.f(a5, context2, articleAttachment, null, null, ttp0.e(1, xzsVar) ? (izs) xzsVar : null, false, article.d, null, 4);
        } else if (obj instanceof VideoFile) {
            smq a6 = tmq.a();
            VideoFile videoFile = (VideoFile) obj;
            VideoAttachment videoAttachment = new VideoAttachment(videoFile);
            ttp0.e(2, null);
            smq.f(a6, context2, videoAttachment, null, null, ttp0.e(1, xzsVar) ? (izs) xzsVar : null, false, videoFile.C1(), null, 4);
        } else {
            String str = this.d;
            if (str != null) {
                smq a7 = tmq.a();
                ttp0.e(2, null);
                a7.o(context2, str, null, ttp0.e(1, xzsVar) ? (izs) xzsVar : null);
            }
        }
        QRStatsTracker qRStatsTracker = QRStatsTracker.a;
        QRStatsTracker.a(QRStatsTracker.Action.ADD_TO_FAVORITES);
    }

    @Override // xsna.q76
    public boolean i() {
        String k = xwk.d().a().k(this.d);
        if (k == null) {
            return false;
        }
        if (!xwk.d().a().g(k)) {
            k = null;
        }
        if (k == null) {
            return false;
        }
        this.d = k;
        return true;
    }

    @Override // xsna.q76
    public QRTypes$SubType o() {
        return this.e;
    }

    @Override // xsna.q76
    public QRTypes$Type q() {
        return QRTypes$Type.LINK;
    }

    public final String r() {
        String str = this.d;
        return str != null ? str : "";
    }
}
