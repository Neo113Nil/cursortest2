package com.vk.qrcode;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.zxing.client.result.TextParsedResult;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.utils.dto.UtilsResolveScreenNameWithDataPlatformDto;
import com.vk.clips.design.view.QRSharingView;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.bottomsheet.internal.e;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.StaticMapView;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.deactivation.Deactivation;
import com.vk.log.L;
import com.vk.movika.sdk.base.ui.r0;
import com.vk.qrcode.QRStatsTracker;
import com.vk.qrcode.QRTypes$AddressBookQRAction;
import com.vk.qrcode.QRTypes$EmailQrAction;
import com.vk.qrcode.QRTypes$SmsQrAction;
import com.vk.qrcode.a;
import com.vk.qrcode.b;
import com.vk.qrcode.d;
import com.vkontakte.android.R;
import com.vkontakte.android.VKActivity;
import defpackage.e0;
import defpackage.q0;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.b0;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.utils.Logger;
import xsna.a31;
import xsna.a7v;
import xsna.a8v;
import xsna.a960;
import xsna.afs;
import xsna.aq3;
import xsna.av20;
import xsna.b410;
import xsna.b810;
import xsna.b8v;
import xsna.baf0;
import xsna.bcp;
import xsna.bdz;
import xsna.bqs;
import xsna.c4r;
import xsna.cc20;
import xsna.cme0;
import xsna.cn;
import xsna.cpo;
import xsna.cy0;
import xsna.dhr0;
import xsna.dqa;
import xsna.drm0;
import xsna.dw20;
import xsna.dy0;
import xsna.e370;
import xsna.e3m;
import xsna.eme0;
import xsna.epx;
import xsna.er90;
import xsna.fg1;
import xsna.fme0;
import xsna.fs00;
import xsna.g3a0;
import xsna.g86;
import xsna.ge0;
import xsna.gl30;
import xsna.go6;
import xsna.gz20;
import xsna.gzs;
import xsna.hg1;
import xsna.hpg;
import xsna.iah0;
import xsna.ifx0;
import xsna.ime0;
import xsna.irt;
import xsna.it8;
import xsna.izs;
import xsna.j5g;
import xsna.j6k0;
import xsna.jch;
import xsna.jh3;
import xsna.jl6;
import xsna.jme0;
import xsna.jno0;
import xsna.jy5;
import xsna.k7y;
import xsna.ki4;
import xsna.kl60;
import xsna.klw;
import xsna.kp5;
import xsna.lva0;
import xsna.lw30;
import xsna.m0i;
import xsna.m1r;
import xsna.m33;
import xsna.m330;
import xsna.m5y;
import xsna.m960;
import xsna.mme0;
import xsna.myc0;
import xsna.n1r;
import xsna.naz;
import xsna.nd;
import xsna.ns0;
import xsna.o25;
import xsna.oey;
import xsna.po40;
import xsna.q21;
import xsna.q76;
import xsna.qbc0;
import xsna.qbe0;
import xsna.qme0;
import xsna.qr;
import xsna.qw40;
import xsna.r9e;
import xsna.rkz;
import xsna.rl3;
import xsna.rme0;
import xsna.rs0;
import xsna.rsg0;
import xsna.s3q0;
import xsna.sf3;
import xsna.su80;
import xsna.sy0;
import xsna.t3v;
import xsna.tbe0;
import xsna.tk40;
import xsna.u210;
import xsna.ucp;
import xsna.uh3;
import xsna.uh40;
import xsna.ume0;
import xsna.uqm0;
import xsna.vme0;
import xsna.w250;
import xsna.w8i;
import xsna.wf9;
import xsna.wp40;
import xsna.x150;
import xsna.x1e0;
import xsna.xj50;
import xsna.xpt;
import xsna.xwk;
import xsna.xxh;
import xsna.yfb;
import xsna.ync;
import xsna.z57;
import xsna.zv;

/* compiled from: QRViewUtils.kt */
/* loaded from: classes5.dex */
public final class d implements w8i {
    public static final d b = new d();
    public static final int c = iah0.a(80);
    public static final float d = (int) iah0.y(14);
    public static final double e = iah0.f().widthPixels - iah0.a(48);
    public static final int f = iah0.a(12);
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static dw20 k;
    public static boolean l;

    /* compiled from: QRViewUtils.kt */
    public static final class a {
        public final String a;
        public final gzs<s3q0> b;
        public final boolean c;

        public a(String str, gzs<s3q0> gzsVar, boolean z) {
            this.a = str;
            this.b = gzsVar;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + sf3.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("QRSecondaryAction(buttonText=");
            sb.append(this.a);
            sb.append(", buttonAction=");
            sb.append(this.b);
            sb.append(", doNotClosePopup=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: QRViewUtils.kt */
    public static final class b {
        public final qme0 a;
        public final C1753d b;

        public b(qme0 qme0Var, C1753d c1753d) {
            this.a = qme0Var;
            this.b = c1753d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return equals(bVar.a) && this.b.equals(bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (hashCode() * 31);
        }

        public final String toString() {
            return "QRViewListeners(onDismissListener=" + this.a + ", onCancelListener=" + this.b + ')';
        }
    }

    /* compiled from: QRViewUtils.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[QRTypes$Type.values().length];
            try {
                iArr[QRTypes$Type.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QRTypes$Type.LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QRTypes$Type.CHECK_BACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[QRTypes$Type.WIFI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[QRTypes$Type.VC_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[QRTypes$Type.ME_CARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[QRTypes$Type.EVENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[QRTypes$Type.GEO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[QRTypes$Type.TEL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[QRTypes$Type.SMS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[QRTypes$Type.EMAIL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[QRTypes$Type.TEXT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[QRTypes$Type.BRAND.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[QRTypes$SubType.values().length];
            try {
                iArr2[QRTypes$SubType.LINK_EXTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[QRTypes$SubType.LINK_INNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[QRTypes$SubType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[QRTypes$SubType.LINK_USER.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[QRTypes$SubType.LINK_GROUP.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[QRTypes$SubType.LINK_VK_EVENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[QRTypes$SubType.LINK_VK_APP.ordinal()] = 7;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[QRTypes$SubType.LINK_VK_ME.ordinal()] = 8;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[QRTypes$SubType.LINK_VK_PAY.ordinal()] = 9;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[QRTypes$SubType.LINK_MONEY_TRANSFER.ordinal()] = 10;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[QRTypes$SubType.LINK_GROUP_CHAT.ordinal()] = 11;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[QRTypes$SubType.LINK_CHANNEL.ordinal()] = 12;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[QRTypes$SubType.LINK_POST.ordinal()] = 13;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[QRTypes$SubType.LINK_ARTICLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[QRTypes$SubType.LINK_CLIP.ordinal()] = 15;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[QRTypes$SubType.LINK_CLIPS_HASHTAG.ordinal()] = 16;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[QRTypes$SubType.LINK_QR_AUTH.ordinal()] = 17;
            } catch (NoSuchFieldError unused30) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: QRViewUtils.kt */
    /* renamed from: com.vk.qrcode.d$d, reason: collision with other inner class name */
    public static final class C1753d implements gz20 {
        @Override // xsna.gz20
        public final void onCancel() {
            QRStatsTracker qRStatsTracker = QRStatsTracker.a;
            QRStatsTracker.a(QRStatsTracker.Action.DECLINE);
        }
    }

    static {
        float f2 = 16;
        g = iah0.a(f2);
        float f3 = 2;
        h = iah0.a(f3);
        i = iah0.a(f3);
        j = iah0.a(f2);
    }

    public static void a(cme0 cme0Var) {
        dw20 dw20Var = k;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        izs<Boolean, s3q0> izsVar = cme0Var.c;
        if (izsVar != null) {
            izsVar.invoke(Boolean.FALSE);
        }
    }

    public static void d(Activity activity, com.vk.qrcode.c cVar, b bVar, cme0 cme0Var) {
        io.reactivex.rxjava3.disposables.c subscribe;
        io.reactivex.rxjava3.core.q a2 = cVar.a();
        if (a2 == null || (subscribe = n(hg1.m(a2, activity, 0L, false, 62)).subscribe(new afs(new jl6(activity, cVar, bVar, cme0Var), 20))) == null) {
            return;
        }
        m(activity, subscribe);
    }

    @SuppressLint({"StringFormatInvalid"})
    public static String h(Context context, q76 q76Var) {
        int i2 = c.$EnumSwitchMapping$0[q76Var.q().ordinal()];
        if (i2 != 2) {
            return i2 != 8 ? i2 != 12 ? i2 != 4 ? i2 != 5 ? context.getResources().getString(R.string.qr_default_title) : context.getString(R.string.qr_action_new_contact) : context.getString(R.string.qr_action_connect_to_wifi, q76Var.g()) : context.getString(R.string.text) : context.getString(R.string.address);
        }
        switch (c.$EnumSwitchMapping$1[q76Var.o().ordinal()]) {
            case 1:
                return context.getString(R.string.qr_action_external_link);
            case 2:
                return context.getString(R.string.qr_action_vk_link);
            case 3:
                return new String();
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return q76Var.p();
            case 13:
                return context.getString(R.string.wall_view);
            case 14:
                return context.getString(R.string.article);
            case 15:
                return context.getString(R.string.clip);
            case 16:
                return q76Var.g();
            case 17:
                return q76Var.p();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static void i(Activity activity, com.vk.qrcode.c cVar, b bVar, cme0 cme0Var) {
        l = true;
        b0 n = n(hg1.m(rsg0.y0(yfb.x(po40.s(new po40(), cVar.f, UtilsResolveScreenNameWithDataPlatformDto.ANDROID, null, null, cVar.r(), null, 92)), null, null, 3), activity, 0L, false, 62));
        bdz bdzVar = new bdz(new kp5(22, cVar, cme0Var), 17);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        m(activity, n.E(bdzVar, lVar, kVar, kVar).subscribe(new m1r(new com.vk.video.ui.discovery.minimizable.related_videos.j(activity, cVar, bVar, cme0Var), 19), new n1r(new r9e(activity, cVar, bVar, cme0Var), 18)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:235:0x087f, code lost:
    
        if (r4 != null) goto L228;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v37, types: [T, xsna.dw20] */
    /* JADX WARN: Type inference failed for: r1v68, types: [T, xsna.dw20] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.DialogInterface$OnDismissListener, xsna.qme0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j(Context context, final cme0 cme0Var, q76 q76Var, gzs gzsVar) {
        com.vk.qrcode.c cVar;
        io.reactivex.rxjava3.core.q a2;
        io.reactivex.rxjava3.disposables.c subscribe;
        io.reactivex.rxjava3.disposables.c subscribe2;
        String str;
        boolean z;
        String str2;
        io.reactivex.rxjava3.disposables.c subscribe3;
        io.reactivex.rxjava3.disposables.c subscribe4;
        io.reactivex.rxjava3.disposables.c subscribe5;
        String str3;
        Integer num;
        View view;
        Object obj;
        String h2;
        String str4;
        String str5;
        List<Address> fromLocation;
        Address address;
        int i2;
        int L;
        io.reactivex.rxjava3.disposables.c subscribe6;
        ?? r3 = new DialogInterface.OnDismissListener() { // from class: xsna.qme0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                cme0 cme0Var2 = cme0.this;
                if (cme0Var2.l.length() > 0) {
                    cme0Var2.m.put(cme0Var2.l, Long.valueOf(System.currentTimeMillis()));
                }
                com.vk.qrcode.d.k = null;
            }
        };
        C1753d c1753d = new C1753d();
        final b bVar = new b(r3, c1753d);
        final Activity h3 = e3m.h(context);
        if (h3 != null) {
            int i3 = c.$EnumSwitchMapping$0[q76Var.q().ordinal()];
            int i4 = 16;
            int i5 = 3;
            int i6 = 4;
            int i7 = 7;
            int i8 = 2;
            d dVar = b;
            switch (i3) {
                case 1:
                    L.G("type isn't supported yet!");
                    return;
                case 2:
                    QRTypes$SubType qRTypes$SubType = QRTypes$SubType.LINK_EXTERNAL;
                    QRTypes$SubType qRTypes$SubType2 = QRTypes$SubType.LINK_INNER;
                    QRTypes$SubType qRTypes$SubType3 = QRTypes$SubType.LINK_POST;
                    if (rl3.G(new QRTypes$SubType[]{qRTypes$SubType, qRTypes$SubType2, qRTypes$SubType3}, q76Var.o()) || !((str3 = ((com.vk.qrcode.c) q76Var).f) == null || drm0.N(str3))) {
                        com.vk.qrcode.c cVar2 = (com.vk.qrcode.c) q76Var;
                        if (!drm0.N(cVar2.r())) {
                            if (cVar2.o() == QRTypes$SubType.LINK_ARTICLE) {
                                io.reactivex.rxjava3.core.q a3 = cVar2.a();
                                if (a3 != null && (subscribe5 = n(hg1.m(a3, h3, 0L, false, 62)).subscribe(new m5y(new ync(h3, cVar2, bVar, cme0Var), 21))) != null) {
                                    m(h3, subscribe5);
                                }
                            } else if (cVar2.o() == qRTypes$SubType3) {
                                io.reactivex.rxjava3.core.q a4 = cVar2.a();
                                if (a4 != null) {
                                    b0 n = n(hg1.m(a4, h3, 0L, false, 62));
                                    int i9 = 21;
                                    io.reactivex.rxjava3.disposables.c subscribe7 = n.subscribe(new rkz(new it8(h3, cVar2, bVar, cme0Var), i9), new bqs(new c4r(28), i9));
                                    if (subscribe7 != null) {
                                        m(h3, subscribe7);
                                    }
                                }
                            } else {
                                int i10 = 14;
                                if (cVar2.o() == QRTypes$SubType.LINK_USER) {
                                    io.reactivex.rxjava3.core.q a5 = cVar2.a();
                                    if (a5 != null && (subscribe4 = n(hg1.m(a5, h3, 0L, false, 62)).subscribe(new w250(new xxh(h3, cVar2, bVar, cme0Var), 12), new a8v(new g86(19, h3, gzsVar), i10))) != null) {
                                        m(h3, subscribe4);
                                    }
                                } else if (cVar2.o() == QRTypes$SubType.LINK_GROUP) {
                                    d(h3, cVar2, bVar, cme0Var);
                                } else if (cVar2.o() == QRTypes$SubType.LINK_VK_EVENT) {
                                    d(h3, cVar2, bVar, cme0Var);
                                } else if (cVar2.o() == QRTypes$SubType.LINK_VK_APP) {
                                    io.reactivex.rxjava3.core.q a6 = cVar2.a();
                                    if (a6 != null && (subscribe3 = n(hg1.m(a6, h3, 0L, false, 62)).subscribe(new tk40(new jh3(h3, cVar2, bVar, cme0Var), i10))) != null) {
                                        m(h3, subscribe3);
                                    }
                                } else {
                                    if (cVar2.o() != QRTypes$SubType.LINK_VK_ME) {
                                        if (cVar2.o() == qRTypes$SubType2) {
                                            Uri parse = Uri.parse(cVar2.r());
                                            List<String> pathSegments = parse.getPathSegments();
                                            if (!pathSegments.isEmpty() && "fest".equals(pathSegments.get(0))) {
                                                try {
                                                    str = parse.getQueryParameter("publish_photo");
                                                } catch (Exception unused) {
                                                    str = null;
                                                }
                                                if (str != null) {
                                                    String concat = "-86529522_".concat(str);
                                                    int a7 = e3m.a(R.dimen.modal_bottom_sheet_image_size, h3);
                                                    cn o = o25.a().o();
                                                    Image D = o25.a().D();
                                                    if (D != null) {
                                                        z = false;
                                                        ImageSize Cb = D.Cb(a7, true, false);
                                                        if (Cb != null) {
                                                            str2 = Cb.d.d;
                                                            break;
                                                        }
                                                    } else {
                                                        z = false;
                                                    }
                                                    str2 = o.c;
                                                    k(dVar, h3, bVar, null, str2, null, null, null, h3.getString(R.string.qr_fest_publish_title), null, h3.getString(R.string.qr_fest_publish_message), 0, null, new Pair(h3.getString(R.string.qr_fest_publish), new jch(i5, o, h3, concat)), null, null, null, null, null, 2059240);
                                                    cVar = cVar2;
                                                }
                                            }
                                            if (Uri.parse(cVar2.r()).getQueryParameterNames().isEmpty()) {
                                                cVar = cVar2;
                                                i(h3, cVar, bVar, cme0Var);
                                            } else {
                                                cVar = cVar2;
                                                dVar.e(h3, cVar, bVar);
                                            }
                                        } else {
                                            cVar = cVar2;
                                            if (cVar.o() != QRTypes$SubType.LINK_MONEY_TRANSFER) {
                                                if (cVar.o() == QRTypes$SubType.LINK_VK_PAY) {
                                                    io.reactivex.rxjava3.core.q a8 = cVar.a();
                                                    if (a8 != null && (subscribe2 = hg1.m(a8, h3, 0L, false, 62).subscribe(new m330(new m0i(h3, cVar, bVar, cme0Var), 17), new gl30(new xpt(21), 18))) != null) {
                                                        m(h3, subscribe2);
                                                    }
                                                } else if (cVar.o() == qRTypes$SubType) {
                                                    dVar.e(h3, cVar, bVar);
                                                } else if (cVar.o() == QRTypes$SubType.LINK_CLIP) {
                                                    io.reactivex.rxjava3.core.q a9 = cVar.a();
                                                    if (a9 != null) {
                                                        b0 n2 = n(hg1.m(a9, h3, 0L, false, 62));
                                                        go6 go6Var = new go6(h3, cVar, bVar, cme0Var);
                                                        int i11 = 9;
                                                        io.reactivex.rxjava3.disposables.c subscribe8 = n2.subscribe(new lw30(go6Var, i11), new qw40(new h(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), i11));
                                                        if (subscribe8 != null) {
                                                            m(h3, subscribe8);
                                                        }
                                                    }
                                                } else if (cVar.o() == QRTypes$SubType.LINK_CLIPS_HASHTAG) {
                                                    io.reactivex.rxjava3.core.q a10 = cVar.a();
                                                    if (a10 != null && (subscribe = n(hg1.m(a10, h3, 0L, false, 62)).subscribe(new fs00(new ki4(h3, cVar, bVar, cme0Var), 15), new b8v(new j(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 22))) != null) {
                                                        m(h3, subscribe);
                                                    }
                                                } else if (cVar.o() == QRTypes$SubType.LINK_QR_AUTH && (a2 = cVar.a()) != null) {
                                                    a2.subscribe(new a960(new b810(cme0Var, 20), 13));
                                                }
                                            }
                                        }
                                        if (cVar.o() != QRTypes$SubType.LINK_INNER || cVar.o() == QRTypes$SubType.LINK_GROUP) {
                                            return;
                                        }
                                        QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                                        QRStatsTracker.g(cVar.q(), cVar.o(), false);
                                        return;
                                    }
                                    i(h3, cVar2, bVar, cme0Var);
                                }
                            }
                        }
                        cVar = cVar2;
                        if (cVar.o() != QRTypes$SubType.LINK_INNER) {
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                case 3:
                    fme0 fme0Var = (fme0) q76Var;
                    io.reactivex.rxjava3.disposables.c subscribe9 = n(hg1.m(fme0Var.a(), h3, 0L, false, 62)).subscribe(new cc20(new jy5(h3, cme0Var, fme0Var, bVar), 19));
                    if (subscribe9 != null) {
                        m(h3, subscribe9);
                        return;
                    }
                    return;
                case 4:
                    rme0 rme0Var = new rme0(q76Var, 0);
                    mme0 mme0Var = (mme0) q76Var;
                    boolean z2 = mme0Var.g;
                    String str6 = mme0Var.f;
                    boolean f2 = myc0.f(str6);
                    int i12 = z2 ? f2 ? R.string.connecting_to_wifi_by_user_with_password : R.string.connecting_to_wifi_by_user_without_password : R.string.connecting_to_wifi;
                    int i13 = z2 ? R.string.connecting_to_wifi_open_settings : R.string.connect;
                    if (z2 && f2) {
                        num = null;
                        View inflate = LayoutInflater.from(h3).inflate(R.layout.qr_wifi_copy, (ViewGroup) null, false);
                        ((TextView) inflate.findViewById(R.id.password_text)).setText(str6);
                        ((ImageView) inflate.findViewById(R.id.password_copy)).setOnClickListener(new hpg(i8, h3, mme0Var));
                        view = inflate;
                    } else {
                        num = null;
                        view = null;
                    }
                    k(dVar, h3, bVar, dhr0.t.b(R.drawable.vk_icon_wifi_outline_56, R.attr.vk_ui_icon_accent), null, null, null, null, h(h3, q76Var), null, h3.getString(i12), 0, view, new Pair(h3.getString(i13), rme0Var), null, null, null, null, view != null ? Integer.valueOf(iah0.a(12)) : num, 994288);
                    return;
                case 5:
                case 6:
                    QRTypes$AddressBookQRAction qRTypes$AddressBookQRAction = (QRTypes$AddressBookQRAction) q76Var;
                    QRTypes$AddressBookQRAction.b bVar2 = qRTypes$AddressBookQRAction.d;
                    boolean z3 = bVar2.a().size() == 1 && ((QRTypes$AddressBookQRAction.a) j5g.Y(bVar2.a())).c == QRTypes$AddressBookQRAction.FieldType.PHONE;
                    if (z3) {
                        h2 = h(h3, qRTypes$AddressBookQRAction);
                    } else {
                        if (bVar2.a().size() <= 1) {
                            return;
                        }
                        Iterator<T> it = bVar2.a().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (((QRTypes$AddressBookQRAction.a) obj).c == QRTypes$AddressBookQRAction.FieldType.NAME) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        QRTypes$AddressBookQRAction.a aVar = (QRTypes$AddressBookQRAction.a) obj;
                        h2 = (aVar == null || (str4 = aVar.a) == null) ? h(h3, qRTypes$AddressBookQRAction) : str4;
                    }
                    g gVar = new g(new a31(h3, cme0Var, bVar2, 4));
                    if (z3) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bVar2.d.a);
                        spannableStringBuilder.setSpan(new vme0(dhr0.t.c(R.attr.vk_ui_text_link_themed), new sy0(h3, spannableStringBuilder, cme0Var, 1)), 0, spannableStringBuilder.length(), 0);
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        dw20.b bVar3 = new dw20.b(h3, null);
                        bVar3.w0(h2);
                        dw20.a.R(bVar3, spannableStringBuilder, 0, 0, 6);
                        dw20.a.k0(bVar3, h3.getString(R.string.qr_action_save_contact), gVar, null, null, 12);
                        bVar3.f0(new uh40(ref$ObjectRef, i4));
                        ?? I0 = bVar3.I0(null);
                        ref$ObjectRef.element = I0;
                        k = I0;
                        return;
                    }
                    dw20.b bVar4 = new dw20.b(h3, null);
                    bVar4.c(new cpo(false, 0, 7));
                    bVar4.w0(h2);
                    bVar4.l0(new a7v());
                    av20.a aVar2 = new av20.a();
                    aVar2.d(R.layout.qr_contact_item, LayoutInflater.from(h3));
                    aVar2.d = new ns0();
                    aVar2.e = new f(h3, cme0Var);
                    ArrayList arrayList = new ArrayList(bVar2.a());
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (((QRTypes$AddressBookQRAction.a) it2.next()).c == QRTypes$AddressBookQRAction.FieldType.NAME) {
                            it2.remove();
                        }
                    }
                    aVar2.f = arrayList;
                    bVar4.Y(c1753d);
                    dw20.a.k(bVar4, aVar2.b(), 6);
                    bVar4.i0(R.string.qr_action_save_contact, gVar);
                    k = bVar4.I0(null);
                    return;
                case 7:
                    a.C1752a c1752a = ((com.vk.qrcode.a) q76Var).c;
                    k(dVar, h3, bVar, dhr0.t.b(R.drawable.vk_icon_event_outline_56, R.attr.vk_ui_icon_accent), null, null, null, null, h3.getString(R.string.qr_action_calendar_time, new SimpleDateFormat("dd MMMM", Locale.getDefault()).format(c1752a.b), new SimpleDateFormat("hh:mm", Locale.getDefault()).format(c1752a.b)), null, c1752a.a, 0, null, new Pair(h3.getString(R.string.qr_action_save_in_calendar), new cy0(25, h3, c1752a)), null, null, null, null, null, 2059248);
                    return;
                case 8:
                    com.vk.qrcode.b bVar5 = (com.vk.qrcode.b) q76Var;
                    b.a aVar3 = bVar5.c;
                    r0 r0Var = new r0(21, bVar5, h3);
                    try {
                        fromLocation = new Geocoder(h3).getFromLocation(aVar3.a, aVar3.b, 1);
                    } catch (Throwable unused2) {
                        str5 = new String();
                    }
                    if (fromLocation != null && (address = fromLocation.get(0)) != null) {
                        str5 = address.getAddressLine(0);
                        if (str5 != null) {
                            String str7 = str5;
                            String h4 = h(h3, bVar5);
                            FrameLayout frameLayout = new FrameLayout(h3);
                            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                            e3m.a aVar4 = e3m.a;
                            frameLayout.setForeground(m33.a(R.drawable.ic_map_pin_centered, h3));
                            frameLayout.setForegroundGravity(17);
                            StaticMapView staticMapView = new StaticMapView(h3, null);
                            staticMapView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                            staticMapView.setAspectRatio(2.08f);
                            staticMapView.setCornerRadius(iah0.a(4));
                            staticMapView.setEnableInternalClickListener(false);
                            staticMapView.e(aVar3.a, aVar3.b);
                            frameLayout.addView(staticMapView);
                            k(dVar, h3, bVar, null, null, null, null, null, h4, null, str7, 0, frameLayout, new Pair(h3.getString(R.string.qr_action_open_map), r0Var), null, null, null, null, null, 2042872);
                            return;
                        }
                    }
                    str5 = "";
                    String str72 = str5;
                    String h42 = h(h3, bVar5);
                    FrameLayout frameLayout2 = new FrameLayout(h3);
                    frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    e3m.a aVar42 = e3m.a;
                    frameLayout2.setForeground(m33.a(R.drawable.ic_map_pin_centered, h3));
                    frameLayout2.setForegroundGravity(17);
                    StaticMapView staticMapView2 = new StaticMapView(h3, null);
                    staticMapView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    staticMapView2.setAspectRatio(2.08f);
                    staticMapView2.setCornerRadius(iah0.a(4));
                    staticMapView2.setEnableInternalClickListener(false);
                    staticMapView2.e(aVar3.a, aVar3.b);
                    frameLayout2.addView(staticMapView2);
                    k(dVar, h3, bVar, null, null, null, null, null, h42, null, str72, 0, frameLayout2, new Pair(h3.getString(R.string.qr_action_open_map), r0Var), null, null, null, null, null, 2042872);
                    return;
                case 9:
                    ime0 ime0Var = (ime0) q76Var;
                    k(dVar, h3, bVar, dhr0.t.b(R.drawable.calls_outline_96, R.attr.vk_ui_icon_accent), null, null, null, null, new g3a0().a(ime0Var.c.getNumber()), null, null, 0, null, new Pair(h3.getString(R.string.qr_tel_dial), new q21(h3, ime0Var, cme0Var, i5)), new Pair(h3.getString(R.string.qr_tel_save), new aq3(h3, cme0Var, ime0Var, 4)), null, null, null, null, 1997808);
                    return;
                case 10:
                    QRTypes$SmsQrAction qRTypes$SmsQrAction = (QRTypes$SmsQrAction) q76Var;
                    dw20.b l0 = ((dw20.b) dw20.a.k0(new dw20.b(h3, null).c(new cpo(false, 0, 7)).w0(h3.getString(R.string.qr_sms_title)).Y(c1753d), h3.getString(R.string.qr_sms_send), new n(qRTypes$SmsQrAction, h3, cme0Var), null, null, 12)).l0(new a7v());
                    av20.a aVar5 = new av20.a();
                    aVar5.d(R.layout.qr_contact_item, LayoutInflater.from(h3));
                    aVar5.d = new j6k0();
                    aVar5.e = new o(h3, cme0Var);
                    QRTypes$SmsQrAction.a aVar6 = qRTypes$SmsQrAction.c;
                    if (aVar6 == null) {
                        aVar6 = null;
                    }
                    aVar5.f = (List) aVar6.c.getValue();
                    dw20.a.k(l0, aVar5.b(), 6).I0(null);
                    return;
                case 11:
                    QRTypes$EmailQrAction qRTypes$EmailQrAction = (QRTypes$EmailQrAction) q76Var;
                    dw20.b l02 = ((dw20.b) dw20.a.k0(new dw20.b(h3, null).c(new cpo(false, 0, 7)).w0(h3.getString(R.string.qr_email_title)).Y(c1753d), h3.getString(R.string.qr_email_send), new l(qRTypes$EmailQrAction, h3, cme0Var), null, null, 12)).l0(new a7v());
                    av20.a aVar7 = new av20.a();
                    aVar7.d(R.layout.qr_contact_item, LayoutInflater.from(h3));
                    aVar7.d = new bcp();
                    aVar7.e = new m(h3, cme0Var);
                    QRTypes$EmailQrAction.a aVar8 = qRTypes$EmailQrAction.c;
                    if (aVar8 == null) {
                        aVar8 = null;
                    }
                    aVar7.f = (List) aVar8.d.getValue();
                    dw20.a.k(l02, aVar7.b(), 6).I0(null);
                    return;
                case 12:
                    jme0 jme0Var = (jme0) q76Var;
                    TextParsedResult textParsedResult = jme0Var.c;
                    String text = textParsedResult.getText();
                    int i14 = 0;
                    for (int i15 = 0; i15 < text.length(); i15++) {
                        i14 += text.charAt(i15) == '\n' ? 1 : 0;
                    }
                    if (i14 <= 8) {
                        Rect rect = new Rect();
                        Paint paint = new Paint();
                        paint.setTextSize(d);
                        paint.getTextBounds(text, 0, text.length(), rect);
                        i14 = (int) Math.ceil(rect.width() / e);
                    }
                    ucp ucpVar = ucp.a;
                    CharSequence i16 = ucp.i(textParsedResult.getText());
                    p pVar = new p(h3, cme0Var);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(i16);
                    Matcher matcher = er90.a.matcher(i16);
                    int i17 = 0;
                    while (matcher.find()) {
                        if (matcher.start() <= 0 || spannableStringBuilder2.charAt((matcher.start() - 1) - i17) != '@') {
                            String group = matcher.group();
                            Object obj2 = naz.a;
                            if (URLUtil.isNetworkUrl(group)) {
                                L = drm0.L(group, '/', i7, i6);
                                i2 = 0;
                            } else {
                                i2 = 0;
                                L = drm0.L(group, '/', 0, 6);
                            }
                            String concat2 = (L == -1 || group.length() - L <= 30) ? group : group.substring(i2, L + 30).concat("...");
                            vme0 vme0Var = new vme0(dhr0.t.c(R.attr.vk_ui_text_link_themed), new fg1(23, pVar, group));
                            spannableStringBuilder2 = spannableStringBuilder2.replace(matcher.start() - i17, matcher.end() - i17, (CharSequence) concat2);
                            spannableStringBuilder2.setSpan(vme0Var, matcher.start() - i17, concat2.length() + (matcher.start() - i17), 0);
                            i17 += (matcher.end() - matcher.start()) - concat2.length();
                            i6 = 4;
                            i7 = 7;
                        }
                    }
                    String k2 = xwk.d().a().k(i16);
                    if (k2 != null && !drm0.N(k2)) {
                        Object obj3 = naz.a;
                        if (!URLUtil.isNetworkUrl(k2)) {
                            k2 = "https://".concat(k2);
                        }
                    }
                    Pair pair = new Pair(spannableStringBuilder2, k2);
                    CharSequence charSequence = (CharSequence) pair.d();
                    String str8 = (String) pair.g();
                    q qVar = new q(str8, new dy0(25, jme0Var, cme0Var), h3, cme0Var);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    dw20.b bVar6 = new dw20.b(h3, null);
                    bVar6.w0(h(h3, jme0Var));
                    bVar6.M0();
                    bVar6.U(R.string.copy_text, qVar);
                    if (str8 != null && !drm0.N(str8)) {
                        dw20.a.k0(bVar6, h3.getString(R.string.qr_action_open_vk_app, Uri.parse(str8).getHost()), qVar, null, null, 12);
                    }
                    if (i14 <= 8) {
                        dw20.a.R(bVar6, charSequence, 0, 0, 6);
                    } else {
                        bVar6.c(new cpo(false, 0, 7));
                        TextView textView = new TextView(h3);
                        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        int i18 = g;
                        int i19 = h;
                        textView.setPadding(i18, i19, i18, i19);
                        textView.setGravity(8388611);
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                        jno0.c(textView, R.attr.vk_ui_text_subhead);
                        textView.setTextSize(14.0f);
                        textView.setLineSpacing(i, 1.0f);
                        textView.setText(charSequence);
                    }
                    bVar6.Z(r3);
                    bVar6.Y(c1753d);
                    ?? I02 = bVar6.I0(null);
                    ref$ObjectRef2.element = I02;
                    k = I02;
                    return;
                case 13:
                    final eme0 eme0Var = (eme0) q76Var;
                    int i20 = c.$EnumSwitchMapping$1[eme0Var.e.ordinal()];
                    if (i20 == 1 || i20 == 2 || i20 == 3) {
                        dVar.b(h3, eme0Var, null, bVar);
                        return;
                    }
                    io.reactivex.rxjava3.core.q a11 = eme0Var.a();
                    if (a11 == null || (subscribe6 = hg1.m(a11, h3, 0L, false, 62).subscribe(new io.reactivex.rxjava3.functions.f(h3, cme0Var, eme0Var, bVar) { // from class: xsna.tme0
                        public final /* synthetic */ Activity b;
                        public final /* synthetic */ eme0 c;
                        public final /* synthetic */ d.b d;

                        {
                            this.c = eme0Var;
                            this.d = bVar;
                        }

                        @Override // io.reactivex.rxjava3.functions.f
                        public final void accept(Object obj4) {
                            if (obj4 != null) {
                                com.vk.qrcode.d.b.b(this.b, this.c, obj4, this.d);
                            }
                        }
                    }, new xj50(new t3v(i4), 11))) == null) {
                        return;
                    }
                    m(h3, subscribe6);
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static void k(d dVar, Activity activity, b bVar, baf0 baf0Var, String str, Integer num, gzs gzsVar, Drawable drawable, CharSequence charSequence, String str2, CharSequence charSequence2, int i2, View view, Pair pair, Pair pair2, a aVar, a aVar2, izs izsVar, Integer num2, int i3) {
        boolean z;
        Integer num3;
        Pair pair3;
        boolean z2;
        dw20.b bVar2;
        e eVar;
        baf0 baf0Var2 = (i3 & 8) != 0 ? null : baf0Var;
        String str3 = (i3 & 16) != 0 ? null : str;
        Integer num4 = (i3 & 32) != 0 ? null : num;
        gzs gzsVar2 = (i3 & 128) != 0 ? null : gzsVar;
        Drawable drawable2 = (i3 & 256) != 0 ? null : drawable;
        boolean z3 = (i3 & 512) == 0;
        String str4 = (i3 & 2048) != 0 ? null : str2;
        CharSequence charSequence3 = (i3 & 4096) != 0 ? null : charSequence2;
        int i4 = (i3 & 8192) != 0 ? -1 : i2;
        View view2 = (i3 & 16384) != 0 ? null : view;
        Pair pair4 = (i3 & 65536) != 0 ? null : pair2;
        a aVar3 = (i3 & 131072) != 0 ? null : aVar;
        a aVar4 = (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : aVar2;
        Integer num5 = num4;
        izs izsVar2 = (i3 & 524288) != 0 ? null : izsVar;
        if ((i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
            z = z3;
            num3 = null;
        } else {
            z = z3;
            num3 = num2;
        }
        dVar.getClass();
        e eVar2 = (pair == null && pair4 == null) ? null : new e(pair, aVar3, pair4, aVar4);
        dw20.b bVar3 = new dw20.b(activity, null);
        if (baf0Var2 != null) {
            bVar3.N(baf0Var2);
        }
        b410 b410Var = new b410(gzsVar2, 20);
        e.a aVar5 = bVar3.d;
        if (str3 != null) {
            ifx0 ifx0Var = e370.c;
            if (ifx0Var == null) {
                ifx0Var = null;
            }
            pair3 = pair4;
            klw klwVar = new klw(ifx0Var.b().create(activity), str3);
            m960 m960Var = new m960(b410Var, 20);
            aVar5.H = klwVar;
            z2 = true;
            aVar5.J = true;
            aVar5.B0 = m960Var;
        } else {
            pair3 = pair4;
            z2 = true;
        }
        if (num5 != null) {
            int intValue = num5.intValue();
            tbe0 tbe0Var = new tbe0(b410Var, 1);
            aVar5.I = Integer.valueOf(intValue);
            aVar5.J = z2;
            aVar5.B0 = tbe0Var;
        }
        aVar5.M = z2;
        if (drawable2 != null) {
            aVar5.K = drawable2;
        }
        bVar3.w0(charSequence);
        if (str4 != null) {
            bVar3.s0(str4);
        }
        if (charSequence3 != null) {
        }
        if (view2 != null) {
            aVar5.D = view2;
        }
        bVar3.M0();
        if (pair != null) {
            e eVar3 = eVar2;
            dw20.a k0 = dw20.a.k0(bVar3, (String) pair.d(), eVar3, null, null, 12);
            bVar2 = bVar3;
            eVar = eVar3;
        } else {
            bVar2 = bVar3;
            eVar = eVar2;
        }
        if (aVar3 != null) {
            String str5 = aVar3.a;
            boolean z4 = aVar3.c;
            aVar5.L0 = str5;
            aVar5.M0 = eVar;
            aVar5.N0 = z4;
        }
        if (pair3 != null) {
            bVar2.W((String) pair3.d(), eVar);
        }
        if (aVar4 != null) {
            String str6 = aVar4.a;
            boolean z5 = aVar4.c;
            aVar5.R0 = str6;
            aVar5.S0 = eVar;
            aVar5.T0 = z5;
        }
        if (izsVar2 != null) {
            bVar2.e0(new r(izsVar2));
        }
        aVar5.F = num3;
        bVar2.Z(bVar.a);
        bVar2.Y(bVar.b);
        aVar5.L = z;
        k = bVar2.I0(null);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [T, xsna.dw20] */
    public static void l(Context context, String str, String str2, String str3, String str4) {
        QRSharingView qRSharingView = new QRSharingView(context);
        qRSharingView.c(str, str3, false);
        qRSharingView.b = str4;
        qRSharingView.c = false;
        qRSharingView.b("open");
        Activity h2 = e3m.h(context);
        if (h2 != null) {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            dw20.b bVar = new dw20.b(h2, null);
            bVar.w0(str2);
            bVar.D0(qRSharingView, false);
            bVar.m(R.attr.vk_ui_background);
            cpo cpoVar = new cpo(false, 0, 7);
            cpoVar.d = 1.0f;
            bVar.c(cpoVar);
            ref$ObjectRef.element = bVar.I0(null);
            qRSharingView.setCloseListener(new nd(ref$ObjectRef, 1));
        }
    }

    public static void m(Context context, io.reactivex.rxjava3.disposables.c cVar) {
        VKActivity vKActivity = context instanceof VKActivity ? (VKActivity) context : null;
        if (vKActivity != null) {
            vKActivity.p.b(cVar);
        }
    }

    public static b0 n(io.reactivex.rxjava3.core.q qVar) {
        return qVar.F(new x150(new irt(16), 9));
    }

    public final void b(Activity activity, eme0 eme0Var, Object obj, b bVar) {
        k(this, activity, bVar, null, null, null, null, null, eme0Var.g, null, eme0Var.h, 0, null, new Pair(eme0Var.i, new wf9(eme0Var, obj, activity, 6)), null, null, null, new kl60(13), null, 1534968);
    }

    public final void c(Activity activity, com.vk.qrcode.c cVar, Group group, b bVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(group.d);
        VerifyInfo verifyInfo = group.y;
        Pair pair = null;
        boolean z = false;
        if (verifyInfo.Cb()) {
            spannableStringBuilder.append((char) 160);
            spannableStringBuilder.append((char) 160);
            spannableStringBuilder.setSpan(new dqa(VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, activity, null, 28)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        boolean z2 = group.p == 1;
        boolean z3 = cVar.o() == QRTypes$SubType.LINK_VK_ME;
        boolean C = group.C();
        boolean n = group.n();
        boolean z4 = group.p == 1;
        boolean z5 = z4 && n;
        CharSequence i2 = z4 ? uqm0.i(group.v, R.plurals.community_members, R.string.community_members_formatted, true) : uqm0.i(group.v, R.plurals.community_subscribers, R.string.community_subscribers_formatted, true);
        if (group.J != null) {
            i2 = activity.getString(R.string.blacklisted_group);
        } else if (epx.f(group.o, "banned")) {
            i2 = activity.getString(R.string.qr_community_blocked);
        } else if (epx.f(group.o, "deleted")) {
            i2 = activity.getString(R.string.qr_community_deleted);
        } else if (n && !group.j) {
            i2 = activity.getString(R.string.qr_community_closed);
        } else if (C && !group.j) {
            i2 = activity.getString(R.string.qr_community_private_descr);
        } else if (!z5 || group.j) {
            String str = group.B;
            if (str != null && !drm0.N(str)) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(group.B);
                SpannableString spannableString = new SpannableString("\n\n");
                spannableString.setSpan(new AbsoluteSizeSpan(8, true), 0, spannableString.length(), 0);
                spannableStringBuilder2.append((CharSequence) spannableString);
                spannableStringBuilder2.append(i2);
                i2 = spannableStringBuilder2;
            }
        } else {
            i2 = null;
        }
        zv zvVar = new zv(16, activity, group);
        int i3 = BuildInfo.t() ? R.string.qr_action_open_page : z2 ? R.string.group_event_open : R.string.qr_action_open_group;
        boolean n2 = group.n();
        boolean z6 = group.C == 4;
        if (z3 && group.t) {
            i3 = R.string.qr_send_message;
        } else if (!group.j && group.C()) {
            i3 = R.string.close;
        } else if (!group.j && group.J == null && !z6) {
            int i4 = group.p;
            i3 = i4 != 0 ? i4 != 1 ? R.string.join_page : R.string.group_inv_event_join : n2 ? R.string.join_group_closed : R.string.join_group;
        }
        Pair pair2 = !group.o() ? new Pair(activity.getString(i3), (z3 && group.t) ? new com.vk.movika.sdk.android.defaultplayer.container.e(23, activity, group) : (group.j || !group.C()) ? (group.j || group.J != null || (group.C == 4)) ? new wp40(zvVar, 18) : new qbc0(group, 5) : new qbe0(1)) : null;
        boolean n3 = group.n();
        if (group.p == 1 && n3) {
            z = true;
        }
        if (!group.o() && (((group.u() && !z) || group.j) && (!z3 || !group.t))) {
            pair = new Pair(activity.getString(R.string.favorites_add), new ge0(14, group, cVar));
        }
        k(this, activity, bVar, null, group.e, null, zvVar, null, spannableStringBuilder, null, i2, 0, null, pair2, group.k ? new Pair(activity.getString(R.string.qr_action_go_to_faves), new u210(activity, 19)) : pair, null, null, null, null, 1993576);
    }

    public final void e(Activity activity, com.vk.qrcode.c cVar, b bVar) {
        Pair pair = new Pair(Integer.valueOf(cVar.o() == QRTypes$SubType.LINK_EXTERNAL ? R.string.qr_action_open_link : R.string.open), new lva0(cVar, 10));
        int intValue = ((Number) pair.d()).intValue();
        gzs gzsVar = (gzs) pair.g();
        su80 su80Var = new su80(cVar, 13);
        k(this, activity, bVar, null, null, null, null, null, h(activity, cVar), null, cVar.r(), 1, null, new Pair(activity.getString(intValue), gzsVar), new Pair(activity.getString(R.string.favorites_add), su80Var), null, new a(activity.getString(R.string.qr_action_go_to_faves), new z57(activity, 1), false), new oey(21), null, 1199096);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0130, code lost:
    
        if (r9 == false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Activity activity, com.vk.qrcode.c cVar, UserProfile userProfile, b bVar) {
        CharSequence i2;
        boolean z;
        int i3;
        a aVar;
        Pair pair;
        a aVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(userProfile.e);
        VerifyInfo verifyInfo = userProfile.B;
        int i4 = 28;
        int i5 = 1;
        if (verifyInfo.Cb()) {
            for (int i6 = 0; i6 < 2; i6++) {
                spannableStringBuilder.append((char) 160);
            }
            spannableStringBuilder.setSpan(new dqa(VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, activity, null, 28)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        Deactivation deactivation = userProfile.D;
        Deactivation.Reason reason = deactivation != null ? deactivation.getReason() : null;
        Deactivation.Reason reason2 = Deactivation.Reason.Banned;
        if (reason == reason2) {
            i2 = activity.getString(R.string.qr_user_blocked);
        } else {
            Deactivation deactivation2 = userProfile.D;
            if ((deactivation2 != null ? deactivation2.getReason() : null) == Deactivation.Reason.Deleted) {
                i2 = activity.getString(R.string.qr_user_deleted);
            } else {
                ucp ucpVar = ucp.a;
                i2 = ucp.i(userProfile.M);
            }
        }
        CharSequence charSequence = i2;
        uh3 uh3Var = new uh3(24, activity, userProfile);
        Pair pair2 = new Pair(Integer.valueOf(R.string.profile_add_friend), new x1e0(userProfile, i5));
        Pair pair3 = new Pair(Integer.valueOf(R.string.qr_action_open_profile), new k7y(uh3Var, i4));
        Pair pair4 = new Pair(activity.getString(R.string.favorites_add), new e0(21, cVar, userProfile));
        Pair pair5 = new Pair(activity.getString(R.string.qr_action_favorites_remove), new rs0(17, cVar, userProfile));
        boolean f2 = qr.f(userProfile.c);
        boolean z2 = cVar.o() == QRTypes$SubType.LINK_VK_ME;
        boolean f3 = qr.f(userProfile.c);
        int i7 = userProfile.v;
        boolean z3 = (i7 == 3 || i7 == 1 || userProfile.G || userProfile.G() || f3) ? false : true;
        Deactivation deactivation3 = userProfile.D;
        if ((deactivation3 != null ? deactivation3.getReason() : null) != reason2) {
            Deactivation deactivation4 = userProfile.D;
            if ((deactivation4 != null ? deactivation4.getReason() : null) != Deactivation.Reason.Deleted) {
                z = true;
                if (!f2) {
                    if (z2 && userProfile.d()) {
                        pair2 = new Pair(Integer.valueOf(R.string.qr_send_message), new com.vk.movika.sdk.base.flow.binding.j(24, activity, userProfile));
                    } else if (!z2) {
                    }
                    Pair pair6 = new Pair(activity.getString(((Number) pair2.d()).intValue()), (gzs) pair2.g());
                    if (z3) {
                        i3 = 0;
                        aVar = new a(activity.getString(((Number) pair3.i()).intValue()), (gzs) pair3.j(), false);
                    } else {
                        i3 = 0;
                        aVar = null;
                    }
                    if (!f2 && !z2) {
                        if (!userProfile.d()) {
                            pair = new Pair(activity.getString(R.string.write_a_message), new ume0(i3, activity, userProfile));
                        } else if (z) {
                            pair = userProfile.k ? pair5 : pair4;
                        }
                        if (f2 && !userProfile.d() && z) {
                            if (!userProfile.k) {
                                pair4 = pair5;
                            }
                            aVar2 = new a((String) pair4.i(), (gzs) pair4.j(), true);
                        } else {
                            aVar2 = null;
                        }
                        k(this, activity, bVar, null, userProfile.h, null, uh3Var, null, spannableStringBuilder, null, charSequence, 0, null, pair6, pair, aVar, aVar2, null, null, 1600360);
                    }
                    pair = null;
                    if (f2) {
                    }
                    aVar2 = null;
                    k(this, activity, bVar, null, userProfile.h, null, uh3Var, null, spannableStringBuilder, null, charSequence, 0, null, pair6, pair, aVar, aVar2, null, null, 1600360);
                }
                pair2 = pair3;
                Pair pair62 = new Pair(activity.getString(((Number) pair2.d()).intValue()), (gzs) pair2.g());
                if (z3) {
                }
                if (!f2) {
                    if (!userProfile.d()) {
                    }
                    if (f2) {
                    }
                    aVar2 = null;
                    k(this, activity, bVar, null, userProfile.h, null, uh3Var, null, spannableStringBuilder, null, charSequence, 0, null, pair62, pair, aVar, aVar2, null, null, 1600360);
                }
                pair = null;
                if (f2) {
                }
                aVar2 = null;
                k(this, activity, bVar, null, userProfile.h, null, uh3Var, null, spannableStringBuilder, null, charSequence, 0, null, pair62, pair, aVar, aVar2, null, null, 1600360);
            }
        }
        z = false;
        if (!f2) {
        }
        pair2 = pair3;
        Pair pair622 = new Pair(activity.getString(((Number) pair2.d()).intValue()), (gzs) pair2.g());
        if (z3) {
        }
        if (!f2) {
        }
        pair = null;
        if (f2) {
        }
        aVar2 = null;
        k(this, activity, bVar, null, userProfile.h, null, uh3Var, null, spannableStringBuilder, null, charSequence, 0, null, pair622, pair, aVar, aVar2, null, null, 1600360);
    }

    public final void g(Activity activity, com.vk.qrcode.c cVar, ApiApplication apiApplication, b bVar) {
        com.vk.movika.sdk.base.ui.l lVar = new com.vk.movika.sdk.base.ui.l(19, activity, cVar);
        String str = apiApplication.d.Fb(c, false).d.d;
        String str2 = apiApplication.c;
        k(this, activity, bVar, null, str, null, null, null, str2, null, apiApplication.g, 3, null, new Pair(activity.getString(R.string.qr_action_open_vk_app, str2), lVar), null, null, null, null, null, 2051048);
    }
}
