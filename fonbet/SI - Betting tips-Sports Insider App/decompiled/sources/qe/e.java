package qe;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u0;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d2;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.u;
import androidx.recyclerview.widget.x0;
import bet.prediction.response.Prediction;
import com.sports.insider.ui.views.ArchiveTargetView;
import com.sports.insider.ui.views.LiveTargetRoiView;
import com.sports.insider.ui.views.TelegramBannerView;
import eg.c0;
import eg.t1;
import hc.f;
import hc.g;
import hc.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import oe.j;
import re.h;
import re.k;
import re.l;
import re.m;
import re.o;
import re.p;
import ve.a0;
import ve.f0;
import ve.q;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public List f22130a;

    /* renamed from: b, reason: collision with root package name */
    public Fragment f22131b;

    /* renamed from: c, reason: collision with root package name */
    public final ge.a f22132c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22133d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22134e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22135f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22136g;

    /* renamed from: h, reason: collision with root package name */
    public final int f22137h;

    /* renamed from: i, reason: collision with root package name */
    public final int f22138i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f22139k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f22140l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f22141m;

    /* renamed from: n, reason: collision with root package name */
    public t1 f22142n;

    public e() {
        e0 elements = e0.f19204a;
        ge.a diffCallBack = new ge.a(1);
        diffCallBack.f9958e = new ArrayList();
        diffCallBack.f9959f = new ArrayList();
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(diffCallBack, "diffCallBack");
        this.f22130a = elements;
        this.f22131b = null;
        this.f22132c = diffCallBack;
        this.f22133d = 8;
        this.f22134e = 9;
        this.f22135f = 10;
        this.f22136g = 4;
        this.f22137h = 5;
        this.f22138i = 6;
        this.j = 7;
        this.f22139k = 11;
        this.f22141m = new Rect();
    }

    public static void c(e eVar, RecyclerView recyclerView, z scope) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (eVar.f22140l) {
            return;
        }
        t1 t1Var = eVar.f22142n;
        Continuation continuation = null;
        if (t1Var != null) {
            t1Var.k(null);
        }
        eVar.f22142n = c0.t(scope, null, null, new j(recyclerView, eVar, continuation, 19), 3);
    }

    public final void e(List newList) {
        ge.a aVar = this.f22132c;
        Intrinsics.checkNotNullParameter(newList, "data");
        try {
            List oldList = this.f22130a;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(oldList, "oldList");
            Intrinsics.checkNotNullParameter(newList, "newList");
            aVar.f9958e = oldList;
            aVar.f9959f = newList;
            u c2 = androidx.recyclerview.widget.d.c(aVar, true);
            Intrinsics.checkNotNullExpressionValue(c2, "calculateDiff(...)");
            this.f22130a = newList;
            c2.f(new androidx.recyclerview.widget.c(this));
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.x0
    public final int getItemCount() {
        return this.f22130a.size();
    }

    @Override // androidx.recyclerview.widget.x0
    public final int getItemViewType(int i5) {
        f fVar = (f) this.f22130a.get(i5);
        if (fVar instanceof ja.c) {
            int i10 = ((ja.c) fVar).f18391d;
            if (i10 == 1) {
                return this.f22135f;
            }
            if (i10 == 2) {
                return this.f22134e;
            }
            if (i10 == 3) {
                return this.f22133d;
            }
        } else {
            if (fVar instanceof hc.e) {
                return this.f22137h;
            }
            if (fVar instanceof i) {
                return this.f22138i;
            }
            if (fVar instanceof hc.d) {
                return this.j;
            }
            if (fVar instanceof hc.a) {
                return 0;
            }
            if (fVar instanceof g) {
                return this.f22139k;
            }
        }
        return this.f22136g;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01af  */
    @Override // androidx.recyclerview.widget.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBindViewHolder(d2 holder, int i5) {
        boolean z5;
        int i10;
        int i11;
        long j;
        int i12;
        String str;
        int widthSize;
        int i13;
        long j6;
        String roi;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof o) {
            o oVar = (o) holder;
            TelegramBannerView telegramBannerView = oVar.f22493a;
            int widthSizeFt = telegramBannerView.getWidthSizeFt();
            int heightSizeFt = telegramBannerView.getHeightSizeFt();
            int widthSizeTg = telegramBannerView.getWidthSizeTg();
            int heightSizeTg = telegramBannerView.getHeightSizeTg();
            int widthSizeSi = telegramBannerView.getWidthSizeSi();
            int heightSizeSi = telegramBannerView.getHeightSizeSi();
            if (widthSizeTg <= 10 || heightSizeTg <= 10 || widthSizeSi <= 10 || heightSizeSi <= 10 || widthSizeFt <= 10 || heightSizeFt <= 10) {
                oVar.itemView.addOnLayoutChangeListener(new m(oVar, 0));
                oVar.itemView.addOnLayoutChangeListener(new m(oVar, 1));
                oVar.itemView.addOnLayoutChangeListener(new m(oVar, 2));
                return;
            }
            Context context = oVar.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            oVar.g(context, widthSizeTg, heightSizeTg);
            Context context2 = oVar.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            oVar.f(context2, widthSizeSi, heightSizeSi);
            Context context3 = oVar.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            oVar.e(context3, widthSizeFt, heightSizeFt);
            return;
        }
        if (holder instanceof h) {
            f fVar = (f) this.f22130a.get(i5);
            if (fVar instanceof hc.d) {
                h hVar = (h) holder;
                int i14 = hc.d.f10491b;
                int i15 = ((hc.d) fVar).f10493a;
                if (i14 == i15) {
                    roi = hc.d.f10492c;
                } else {
                    String str2 = "+" + i15 + '%';
                    Intrinsics.checkNotNullExpressionValue(str2, "toString(...)");
                    hc.d.f10492c = str2;
                    hc.d.f10491b = i15;
                    roi = str2;
                }
                Intrinsics.checkNotNullParameter(roi, "roi");
                View view = hVar.itemView;
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.sports.insider.ui.views.LiveTargetRoiView");
                ((LiveTargetRoiView) view).setROI(roi);
                return;
            }
            return;
        }
        if (holder instanceof k) {
            f fVar2 = (f) this.f22130a.get(i5);
            if (!(fVar2 instanceof ja.c)) {
                return;
            }
            k kVar = (k) holder;
            ja.c data = (ja.c) fVar2;
            int i16 = data.f18389b;
            f0 f0Var = kVar.f22482a;
            Intrinsics.checkNotNullParameter(data, "data");
            String str3 = data.f18392e;
            if (str3 != null) {
                int hashCode = str3.hashCode();
                if (hashCode != -1867169789) {
                    if (hashCode != -934396624) {
                        if (hashCode == 3135262 && str3.equals(Prediction.NOT_PASSED)) {
                            i12 = 0;
                        }
                    } else if (str3.equals(Prediction.RETURN)) {
                        i12 = -1;
                    }
                } else if (str3.equals("success")) {
                    i12 = 1;
                }
                kVar.f22484c = i12;
                kVar.f22485d = io.sentry.config.a.x(i16, "dd.MM");
                kVar.f22486e = io.sentry.config.a.x(i16, "HH:mm");
                String str4 = data.f18393f;
                kVar.f22487f = str4 != null ? str4 : "-";
                str = data.f18394g;
                if (str != null || str.length() == 0 || StringsKt.H(str)) {
                    str = null;
                }
                widthSize = f0Var.getWidthSize();
                int heightSize = f0Var.getHeightSize();
                if (widthSize > 100 || heightSize <= 100) {
                    f0Var.addOnLayoutChangeListener(new me.m(kVar, 2, str));
                } else {
                    Context context4 = f0Var.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    kVar.c(context4, str, widthSize, heightSize);
                }
                i13 = kVar.f22484c;
                if (-1 > i13 && i13 < 2) {
                    kVar.d(i13, kVar.f22485d, kVar.f22486e, kVar.f22487f);
                    return;
                }
                j6 = i16 * 1000;
                z5 = kVar.f22488g != j6;
                kVar.f22488g = j6;
                if (j6 >= 100000000) {
                    kVar.d(i13, kVar.f22485d, kVar.f22486e, kVar.f22487f);
                    return;
                }
                long currentTimeMillis = (j6 - System.currentTimeMillis()) / 1000;
                if (currentTimeMillis <= 0) {
                    kVar.d(kVar.f22484c, kVar.f22485d, kVar.f22486e, kVar.f22487f);
                    return;
                }
                kVar.f22482a.e(kVar.f22484c, kVar.f22485d, kVar.f22486e, kVar.f22487f, currentTimeMillis);
                CountDownTimer countDownTimer = kVar.f22483b;
                if (countDownTimer == null || z5) {
                    if (z5) {
                        if (countDownTimer != null) {
                            countDownTimer.cancel();
                        }
                        kVar.f22483b = null;
                    }
                    kVar.f22483b = new re.j(kVar, currentTimeMillis * 1000, 0);
                }
                CountDownTimer countDownTimer2 = kVar.f22483b;
                if (countDownTimer2 != null) {
                    countDownTimer2.start();
                    return;
                }
                return;
            }
            i12 = -2;
            kVar.f22484c = i12;
            kVar.f22485d = io.sentry.config.a.x(i16, "dd.MM");
            kVar.f22486e = io.sentry.config.a.x(i16, "HH:mm");
            String str42 = data.f18393f;
            kVar.f22487f = str42 != null ? str42 : "-";
            str = data.f18394g;
            if (str != null) {
            }
            str = null;
            widthSize = f0Var.getWidthSize();
            int heightSize2 = f0Var.getHeightSize();
            if (widthSize > 100) {
            }
            f0Var.addOnLayoutChangeListener(new me.m(kVar, 2, str));
            i13 = kVar.f22484c;
            if (-1 > i13) {
            }
            j6 = i16 * 1000;
            if (kVar.f22488g != j6) {
            }
            kVar.f22488g = j6;
            if (j6 >= 100000000) {
            }
        } else {
            if (!(holder instanceof re.c)) {
                String str5 = null;
                if (holder instanceof re.g) {
                    f fVar3 = (f) this.f22130a.get(i5);
                    if (fVar3 instanceof ja.c) {
                        re.g gVar = (re.g) holder;
                        ja.c data2 = (ja.c) fVar3;
                        int i17 = data2.f18389b;
                        ve.u uVar = gVar.f22477a;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        String x10 = io.sentry.config.a.x(i17, "dd.MM");
                        String str6 = data2.f18407v;
                        String str7 = data2.f18406u;
                        String x11 = io.sentry.config.a.x(i17, "HH:mm");
                        String str8 = data2.f18394g;
                        if (str8 == null || str8.length() == 0 || StringsKt.H(str8)) {
                            str8 = null;
                        }
                        int widthSize2 = uVar.getWidthSize();
                        int heightSize3 = uVar.getHeightSize();
                        if (widthSize2 <= 100 || heightSize3 <= 100) {
                            uVar.addOnLayoutChangeListener(new re.e(gVar, str8, 0));
                        } else {
                            Context context5 = uVar.getContext();
                            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                            gVar.c(context5, str8, widthSize2, heightSize3);
                        }
                        int widthHomeFlagSize = uVar.getWidthHomeFlagSize();
                        String str9 = data2.f18404s;
                        if (str9 == null || str9.length() == 0 || StringsKt.H(str9)) {
                            str9 = null;
                        }
                        String str10 = data2.f18405t;
                        if (str10 != null && str10.length() != 0 && !StringsKt.H(str10)) {
                            str5 = str10;
                        }
                        if (widthHomeFlagSize > 10) {
                            Context context6 = uVar.getContext();
                            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                            gVar.e(context6, widthHomeFlagSize, str9);
                        } else {
                            uVar.addOnLayoutChangeListener(new re.e(gVar, str9, 1));
                        }
                        if (widthHomeFlagSize > 10) {
                            Context context7 = uVar.getContext();
                            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                            gVar.d(context7, widthHomeFlagSize, str5);
                        } else {
                            uVar.addOnLayoutChangeListener(new re.e(gVar, str5, 2));
                        }
                        long j10 = i17 * 1000;
                        z5 = gVar.f22479c != j10;
                        gVar.f22479c = j10;
                        if (j10 < 100000000) {
                            gVar.h();
                            gVar.f22477a.f(x10, x11, data2.f18396i, data2.f18393f, 0L, data2.f18399m, data2.f18400n, data2.f18401o, data2.f18402p, str7 == null ? "" : str7, str6 == null ? "" : str6);
                            return;
                        }
                        long currentTimeMillis2 = (j10 - System.currentTimeMillis()) / 1000;
                        if (currentTimeMillis2 <= 0) {
                            gVar.h();
                            gVar.f22477a.f(x10, x11, data2.f18396i, data2.f18393f, 0L, data2.f18399m, data2.f18400n, data2.f18401o, data2.f18402p, str7 == null ? "" : str7, str6 == null ? "" : str6);
                            return;
                        }
                        gVar.f22477a.f(x10, x11, data2.f18396i, data2.f18393f, currentTimeMillis2, data2.f18399m, data2.f18400n, data2.f18401o, data2.f18402p, str7 == null ? "" : str7, str6 == null ? "" : str6);
                        if (gVar.f22478b == null || z5) {
                            if (z5) {
                                gVar.h();
                            }
                            re.f fVar4 = new re.f(gVar, currentTimeMillis2 * 1000, 0);
                            gVar.f22478b = fVar4;
                            fVar4.start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            f fVar5 = (f) this.f22130a.get(i5);
            if (!(fVar5 instanceof ja.c)) {
                return;
            }
            re.c cVar = (re.c) holder;
            ja.c data3 = (ja.c) fVar5;
            int i18 = data3.f18389b;
            Intrinsics.checkNotNullParameter(data3, "data");
            String str11 = data3.f18392e;
            if (str11 != null) {
                int hashCode2 = str11.hashCode();
                if (hashCode2 != -1867169789) {
                    if (hashCode2 != -934396624) {
                        if (hashCode2 == 3135262 && str11.equals(Prediction.NOT_PASSED)) {
                            i10 = 0;
                        }
                    } else if (str11.equals(Prediction.RETURN)) {
                        i10 = -1;
                    }
                } else if (str11.equals("success")) {
                    i10 = 1;
                }
                cVar.f22465c = i10;
                cVar.f22466d = io.sentry.config.a.x(i18, "dd.MM");
                String x12 = io.sentry.config.a.x(i18, "HH:mm");
                cVar.f22467e = x12;
                String str12 = data3.f18393f;
                String str13 = str12 != null ? str12 : "-";
                cVar.f22468f = str13;
                i11 = cVar.f22465c;
                if (-1 > i11 && i11 < 2) {
                    cVar.b(i11, cVar.f22466d, x12, str13);
                    return;
                }
                j = i18 * 1000;
                z5 = cVar.f22469g != j;
                cVar.f22469g = j;
                if (j >= 100000000) {
                    cVar.b(i11, cVar.f22466d, x12, str13);
                    return;
                }
                long currentTimeMillis3 = (j - System.currentTimeMillis()) / 1000;
                if (currentTimeMillis3 <= 0) {
                    cVar.b(cVar.f22465c, cVar.f22466d, cVar.f22467e, cVar.f22468f);
                    return;
                }
                cVar.f22463a.e(cVar.f22465c, cVar.f22466d, cVar.f22467e, cVar.f22468f, currentTimeMillis3);
                CountDownTimer countDownTimer3 = cVar.f22464b;
                if (countDownTimer3 == null || z5) {
                    if (z5) {
                        if (countDownTimer3 != null) {
                            countDownTimer3.cancel();
                        }
                        cVar.f22464b = null;
                    }
                    cVar.f22464b = new re.b(cVar, currentTimeMillis3 * 1000, 0);
                }
                CountDownTimer countDownTimer4 = cVar.f22464b;
                if (countDownTimer4 != null) {
                    countDownTimer4.start();
                    return;
                }
                return;
            }
            i10 = -2;
            cVar.f22465c = i10;
            cVar.f22466d = io.sentry.config.a.x(i18, "dd.MM");
            String x122 = io.sentry.config.a.x(i18, "HH:mm");
            cVar.f22467e = x122;
            String str122 = data3.f18393f;
            if (str122 != null) {
            }
            cVar.f22468f = str13;
            i11 = cVar.f22465c;
            if (-1 > i11) {
            }
            j = i18 * 1000;
            if (cVar.f22469g != j) {
            }
            cVar.f22469g = j;
            if (j >= 100000000) {
            }
        }
    }

    @Override // androidx.recyclerview.widget.x0
    public final d2 onCreateViewHolder(ViewGroup parent, int i5) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Continuation continuation = null;
        if (i5 == this.f22134e) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            f0 premiumHolderView = new f0(context);
            int i10 = (int) (premiumHolderView.Z0 * 16);
            l1 l1Var = new l1(-1, -2);
            l1Var.setMarginStart(i10);
            l1Var.setMarginEnd(i10);
            premiumHolderView.setLayoutParams(l1Var);
            a blockBold = new a(1, new zc.k(), zc.k.class, "arimoBold", "arimoBold()Landroid/graphics/Typeface;", 4, 2);
            a blockRegular = new a(1, new zc.k(), zc.k.class, "arimoRegular", "arimoRegular()Landroid/graphics/Typeface;", 4, 3);
            Intrinsics.checkNotNullParameter(blockBold, "blockBold");
            Intrinsics.checkNotNullParameter(blockRegular, "blockRegular");
            c0.t(premiumHolderView.Q1, null, null, new c1.g(premiumHolderView, blockBold, blockRegular, continuation, 9), 3);
            Intrinsics.checkNotNullParameter(premiumHolderView, "premiumHolderView");
            k kVar = new k(premiumHolderView);
            kVar.f22482a = premiumHolderView;
            kVar.f22484c = -3;
            kVar.f22485d = "__.__";
            kVar.f22486e = "--:--";
            kVar.f22487f = "5.00";
            return kVar;
        }
        if (i5 == this.f22133d) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            q expressHolderView = new q(context2);
            int i11 = (int) (expressHolderView.W0 * 16);
            l1 l1Var2 = new l1(-1, -2);
            l1Var2.setMarginStart(i11);
            l1Var2.setMarginEnd(i11);
            expressHolderView.setLayoutParams(l1Var2);
            a blockBold2 = new a(1, new zc.k(), zc.k.class, "arimoBold", "arimoBold()Landroid/graphics/Typeface;", 4, 4);
            a blockRegular2 = new a(1, new zc.k(), zc.k.class, "arimoRegular", "arimoRegular()Landroid/graphics/Typeface;", 4, 5);
            Intrinsics.checkNotNullParameter(blockBold2, "blockBold");
            Intrinsics.checkNotNullParameter(blockRegular2, "blockRegular");
            c0.t(expressHolderView.N1, null, null, new c1.g(expressHolderView, blockBold2, blockRegular2, continuation, 6), 3);
            Intrinsics.checkNotNullParameter(expressHolderView, "expressHolderView");
            re.c cVar = new re.c(expressHolderView);
            cVar.f22463a = expressHolderView;
            cVar.f22465c = -3;
            cVar.f22466d = "__.__";
            cVar.f22467e = "--:--";
            cVar.f22468f = "5.00";
            return cVar;
        }
        if (i5 == this.f22135f) {
            Context context3 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            ve.u freeHolderView = new ve.u(context3);
            int i12 = (int) (freeHolderView.f24860h1 * 16);
            l1 l1Var3 = new l1(-1, -2);
            l1Var3.setMarginStart(i12);
            l1Var3.setMarginEnd(i12);
            freeHolderView.setLayoutParams(l1Var3);
            a blockBold3 = new a(1, new zc.k(), zc.k.class, "arimoBold", "arimoBold()Landroid/graphics/Typeface;", 4, 6);
            a blockRegular3 = new a(1, new zc.k(), zc.k.class, "arimoRegular", "arimoRegular()Landroid/graphics/Typeface;", 4, 7);
            Intrinsics.checkNotNullParameter(blockBold3, "blockBold");
            Intrinsics.checkNotNullParameter(blockRegular3, "blockRegular");
            c0.t(freeHolderView.f24843b2, null, null, new c1.g(freeHolderView, blockBold3, blockRegular3, continuation, 7), 3);
            Intrinsics.checkNotNullParameter(freeHolderView, "freeHolderView");
            re.g gVar = new re.g(freeHolderView);
            gVar.f22477a = freeHolderView;
            return gVar;
        }
        if (i5 == this.f22136g) {
            View itemView = new View(parent.getContext());
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            return new re.a(itemView);
        }
        if (i5 == this.f22137h) {
            Context context4 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            a0 itemView2 = new a0(context4);
            int i13 = (int) (itemView2.f24568l * 16);
            l1 l1Var4 = new l1(-1, -2);
            l1Var4.setMarginStart(i13);
            l1Var4.setMarginEnd(i13);
            itemView2.setLayoutParams(l1Var4);
            a block = new a(1, new zc.k(), zc.k.class, "arimoBold", "arimoBold()Landroid/graphics/Typeface;", 4, 0);
            Intrinsics.checkNotNullParameter(block, "block");
            c0.t(itemView2.B, null, null, new u0(itemView2, block, continuation, 21), 3);
            Intrinsics.checkNotNullParameter(itemView2, "itemView");
            return new re.i(itemView2);
        }
        if (i5 == this.f22138i) {
            Context context5 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            ve.x0 itemView3 = new ve.x0(context5);
            int i14 = (int) (itemView3.f24927l * 16);
            l1 l1Var5 = new l1(-1, -2);
            l1Var5.setMarginStart(i14);
            l1Var5.setMarginEnd(i14);
            itemView3.setLayoutParams(l1Var5);
            a block2 = new a(1, new zc.k(), zc.k.class, "arimoBold", "arimoBold()Landroid/graphics/Typeface;", 4, 1);
            Intrinsics.checkNotNullParameter(block2, "block");
            c0.t(itemView3.B, null, null, new u0(itemView3, block2, continuation, 24), 3);
            Intrinsics.checkNotNullParameter(itemView3, "itemView");
            return new p(itemView3);
        }
        if (i5 == this.j) {
            Context context6 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            LiveTargetRoiView itemView4 = new LiveTargetRoiView(context6);
            int i15 = (int) (itemView4.f7675v0 * 16);
            l1 l1Var6 = new l1(-1, -2);
            l1Var6.setMarginStart(i15);
            l1Var6.setMarginEnd(i15);
            itemView4.setLayoutParams(l1Var6);
            me.d block3 = new me.d(1, new zc.k(), zc.k.class, "arimoBold", "arimoBold()Landroid/graphics/Typeface;", 4, 29);
            Intrinsics.checkNotNullParameter(block3, "block");
            c0.t(itemView4.X0, null, null, new u0(itemView4, block3, continuation, 20), 3);
            Intrinsics.checkNotNullParameter(itemView4, "itemView");
            return new h(itemView4);
        }
        if (i5 == 0) {
            Context context7 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            ArchiveTargetView itemView5 = new ArchiveTargetView(context7);
            int i16 = (int) (itemView5.f7138l * 24);
            l1 l1Var7 = new l1(-1, -2);
            ((ViewGroup.MarginLayoutParams) l1Var7).topMargin = i16;
            ((ViewGroup.MarginLayoutParams) l1Var7).bottomMargin = i16;
            itemView5.setLayoutParams(l1Var7);
            me.d block4 = new me.d(1, new zc.k(), zc.k.class, "arimoRegular", "arimoRegular()Landroid/graphics/Typeface;", 4, 28);
            Intrinsics.checkNotNullParameter(block4, "block");
            c0.t(itemView5.f7147p0, null, null, new u0(itemView5, block4, continuation, 17), 3);
            Intrinsics.checkNotNullParameter(itemView5, "itemView");
            return new re.a(itemView5);
        }
        if (i5 != this.f22139k) {
            View itemView6 = new View(parent.getContext());
            Intrinsics.checkNotNullParameter(itemView6, "itemView");
            return new re.a(itemView6);
        }
        Context context8 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        TelegramBannerView telegramBannerView = new TelegramBannerView(context8);
        int i17 = (int) (telegramBannerView.f7987b * 16);
        l1 l1Var8 = new l1(-1, -2);
        l1Var8.setMarginStart(i17);
        l1Var8.setMarginEnd(i17);
        telegramBannerView.setLayoutParams(l1Var8);
        zc.k kVar2 = new zc.k();
        int i18 = 0;
        int i19 = 0;
        k2.u uVar = new k2.u(i19, kVar2, zc.k.class, "arimoBold", "arimoBold()Landroid/graphics/Typeface;", i18, 2);
        k2.u uVar2 = new k2.u(i19, kVar2, zc.k.class, "arimoRegular", "arimoRegular()Landroid/graphics/Typeface;", i18, 3);
        b block0 = new b(1, uVar, Intrinsics.Kotlin.class, "suspendConversion0", "getTelegramBannerViewHolder$lambda$0$suspendConversion0(Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        c block1 = new c(1, uVar2, Intrinsics.Kotlin.class, "suspendConversion1", "getTelegramBannerViewHolder$lambda$0$suspendConversion1(Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        Intrinsics.checkNotNullParameter(block0, "block0");
        Intrinsics.checkNotNullParameter(block1, "block1");
        c0.t(telegramBannerView.E0, null, null, new u0(telegramBannerView, block0, block1, continuation, 23), 3);
        Intrinsics.checkNotNullParameter(telegramBannerView, "telegramBannerView");
        o oVar = new o(telegramBannerView);
        oVar.f22493a = telegramBannerView;
        return oVar;
    }

    @Override // androidx.recyclerview.widget.x0
    public final void onViewAttachedToWindow(d2 holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if ((holder instanceof h) || (holder instanceof p) || (holder instanceof re.i) || (holder instanceof o) || (holder instanceof re.g) || (holder instanceof k) || (holder instanceof re.c)) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            io.sentry.config.a.y(itemView, 600L, new fg.d(12, this, holder));
            if (holder instanceof re.g) {
                re.g gVar = (re.g) holder;
                if (gVar.f22478b == null) {
                    long currentTimeMillis = (gVar.f22479c - System.currentTimeMillis()) / 1000;
                    if (currentTimeMillis > 0) {
                        re.f fVar = new re.f(gVar, currentTimeMillis * 1000, 1);
                        gVar.f22478b = fVar;
                        fVar.start();
                    }
                }
                gVar.f22477a.setHolderListener(new d(this));
            }
            if (holder instanceof k) {
                k kVar = (k) holder;
                if (kVar.f22483b == null) {
                    long currentTimeMillis2 = (kVar.f22488g - System.currentTimeMillis()) / 1000;
                    if (currentTimeMillis2 > 0) {
                        re.j jVar = new re.j(kVar, currentTimeMillis2 * 1000, 2);
                        kVar.f22483b = jVar;
                        jVar.start();
                    }
                }
            }
            if (holder instanceof re.c) {
                re.c cVar = (re.c) holder;
                if (cVar.f22464b == null) {
                    long currentTimeMillis3 = (cVar.f22469g - System.currentTimeMillis()) / 1000;
                    if (currentTimeMillis3 <= 0) {
                        return;
                    }
                    re.b bVar = new re.b(cVar, currentTimeMillis3 * 1000, 2);
                    cVar.f22464b = bVar;
                    bVar.start();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.x0
    public final void onViewDetachedFromWindow(d2 holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        holder.itemView.setOnClickListener(null);
        if (holder instanceof k) {
            k kVar = (k) holder;
            CountDownTimer countDownTimer = kVar.f22483b;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            kVar.f22483b = null;
        }
        if (holder instanceof re.g) {
            re.g gVar = (re.g) holder;
            gVar.h();
            gVar.f22477a.f24838a.clear();
        }
        if (holder instanceof re.c) {
            re.c cVar = (re.c) holder;
            CountDownTimer countDownTimer2 = cVar.f22464b;
            if (countDownTimer2 != null) {
                countDownTimer2.cancel();
            }
            cVar.f22464b = null;
        }
    }

    @Override // androidx.recyclerview.widget.x0
    public final void onViewRecycled(d2 holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof o) {
            TelegramBannerView telegramBannerView = ((o) holder).f22493a;
            telegramBannerView.setBitmapFt(null);
            telegramBannerView.setBitmapTg(null);
            telegramBannerView.setBitmapSi(null);
        } else if (holder instanceof re.c) {
            re.c cVar = (re.c) holder;
            CountDownTimer countDownTimer = cVar.f22464b;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            cVar.f22464b = null;
        } else if (holder instanceof k) {
            k kVar = (k) holder;
            CountDownTimer countDownTimer2 = kVar.f22483b;
            if (countDownTimer2 != null) {
                countDownTimer2.cancel();
            }
            kVar.f22483b = null;
            kVar.f22482a.setBitmap(null);
        } else if (holder instanceof re.g) {
            re.g gVar = (re.g) holder;
            gVar.h();
            ve.u uVar = gVar.f22477a;
            uVar.setBitmap(null);
            uVar.setBitmapFlagHome(null);
            uVar.setBitmapFlagGuest(null);
        }
        super.onViewRecycled(holder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.x0
    public final void onBindViewHolder(d2 holder, int i5, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        Bundle bundle = null;
        if (payloads != null && !payloads.isEmpty()) {
            Object firstOrNull = CollectionsKt.firstOrNull(payloads);
            Bundle bundle2 = firstOrNull instanceof Bundle ? (Bundle) firstOrNull : null;
            if (bundle2 != null && !bundle2.isEmpty()) {
                bundle = bundle2;
            }
        }
        if (bundle == null) {
            super.onBindViewHolder(holder, i5, payloads);
        } else if (holder instanceof l) {
            ((l) holder).a(bundle);
        }
    }
}
