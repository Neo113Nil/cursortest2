package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.cb;
import defpackage.dh0;
import defpackage.enn;
import defpackage.hqn;
import defpackage.rcb;
import defpackage.wt3;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbqo implements zzbqh {
    public static final Map d;
    public final com.google.android.gms.ads.internal.zzb a;
    public final zzbys b;
    public final zzbyz c;

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        dh0 dh0Var = new dh0(7);
        for (int i = 0; i < 7; i++) {
            dh0Var.put(strArr[i], numArr[i]);
        }
        d = Collections.unmodifiableMap(dh0Var);
    }

    public zzbqo(com.google.android.gms.ads.internal.zzb zzbVar, zzbys zzbysVar, zzbyz zzbyzVar) {
        this.a = zzbVar;
        this.b = zzbysVar;
        this.c = zzbyzVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0418 A[Catch: all -> 0x01bb, TryCatch #1 {all -> 0x01bb, blocks: (B:91:0x01b0, B:93:0x01b4, B:94:0x01b9, B:96:0x01be, B:98:0x01c6, B:99:0x01cb, B:101:0x01cd, B:103:0x01d7, B:104:0x01dc, B:106:0x01de, B:108:0x01e4, B:109:0x01e9, B:111:0x01eb, B:113:0x01f9, B:114:0x020a, B:116:0x0218, B:117:0x0229, B:119:0x0237, B:120:0x0248, B:122:0x0256, B:123:0x0267, B:125:0x0275, B:126:0x0283, B:128:0x0291, B:129:0x0293, B:131:0x0297, B:133:0x029b, B:135:0x02a1, B:138:0x02a9, B:141:0x02c9, B:146:0x02d9, B:149:0x0418, B:150:0x041d, B:152:0x041f, B:154:0x043c, B:156:0x0448, B:157:0x0481, B:162:0x04f1, B:163:0x054c, B:165:0x0564, B:166:0x0580, B:168:0x0588, B:169:0x058b, B:170:0x05b3, B:174:0x05b6, B:176:0x05e4, B:177:0x05f6, B:181:0x0502, B:184:0x0513, B:187:0x0522, B:190:0x0531, B:194:0x0542, B:195:0x0546, B:196:0x047e, B:197:0x05f8, B:198:0x05fd, B:200:0x02e7, B:202:0x02eb, B:206:0x0395, B:207:0x0373, B:210:0x03a2, B:212:0x03a6, B:214:0x03aa, B:218:0x03b8, B:219:0x03c7, B:222:0x03ef, B:225:0x03ff, B:226:0x03f5, B:228:0x03fd, B:229:0x03e6, B:231:0x03ec, B:235:0x0306, B:239:0x0323, B:240:0x034d, B:244:0x0343, B:247:0x035a, B:250:0x036c, B:253:0x0381, B:256:0x0404, B:258:0x040d, B:259:0x05ff, B:260:0x0604, B:262:0x0606, B:263:0x060b), top: B:90:0x01b0, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x041f A[Catch: all -> 0x01bb, TryCatch #1 {all -> 0x01bb, blocks: (B:91:0x01b0, B:93:0x01b4, B:94:0x01b9, B:96:0x01be, B:98:0x01c6, B:99:0x01cb, B:101:0x01cd, B:103:0x01d7, B:104:0x01dc, B:106:0x01de, B:108:0x01e4, B:109:0x01e9, B:111:0x01eb, B:113:0x01f9, B:114:0x020a, B:116:0x0218, B:117:0x0229, B:119:0x0237, B:120:0x0248, B:122:0x0256, B:123:0x0267, B:125:0x0275, B:126:0x0283, B:128:0x0291, B:129:0x0293, B:131:0x0297, B:133:0x029b, B:135:0x02a1, B:138:0x02a9, B:141:0x02c9, B:146:0x02d9, B:149:0x0418, B:150:0x041d, B:152:0x041f, B:154:0x043c, B:156:0x0448, B:157:0x0481, B:162:0x04f1, B:163:0x054c, B:165:0x0564, B:166:0x0580, B:168:0x0588, B:169:0x058b, B:170:0x05b3, B:174:0x05b6, B:176:0x05e4, B:177:0x05f6, B:181:0x0502, B:184:0x0513, B:187:0x0522, B:190:0x0531, B:194:0x0542, B:195:0x0546, B:196:0x047e, B:197:0x05f8, B:198:0x05fd, B:200:0x02e7, B:202:0x02eb, B:206:0x0395, B:207:0x0373, B:210:0x03a2, B:212:0x03a6, B:214:0x03aa, B:218:0x03b8, B:219:0x03c7, B:222:0x03ef, B:225:0x03ff, B:226:0x03f5, B:228:0x03fd, B:229:0x03e6, B:231:0x03ec, B:235:0x0306, B:239:0x0323, B:240:0x034d, B:244:0x0343, B:247:0x035a, B:250:0x036c, B:253:0x0381, B:256:0x0404, B:258:0x040d, B:259:0x05ff, B:260:0x0604, B:262:0x0606, B:263:0x060b), top: B:90:0x01b0, inners: #0 }] */
    @Override // com.google.android.gms.internal.ads.zzbqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Map map) {
        int i;
        int i2;
        int[] iArr;
        int i3;
        int B;
        int i4;
        int i5;
        int i6;
        int i7;
        zzclm zzclmVar = (zzclm) obj;
        int intValue = ((Integer) d.get((String) map.get("a"))).intValue();
        char c = 1;
        if (intValue != 5) {
            if (intValue != 7) {
                com.google.android.gms.ads.internal.zzb zzbVar = this.a;
                if (!zzbVar.zzb()) {
                    zzbVar.zzc(null);
                    return;
                }
                if (intValue == 1) {
                    zzbys zzbysVar = this.b;
                    synchronized (zzbysVar.k) {
                        try {
                            Activity activity = zzbysVar.m;
                            if (activity == null) {
                                zzbysVar.b("Not an activity context. Cannot resize.");
                                return;
                            }
                            zzclm zzclmVar2 = zzbysVar.l;
                            if (zzclmVar2.zzN() == null) {
                                zzbysVar.b("Webview is not yet available, size is not set.");
                                return;
                            }
                            if (zzclmVar2.zzN().b()) {
                                zzbysVar.b("Is interstitial. Cannot resize an interstitial.");
                                return;
                            }
                            if (zzclmVar2.d()) {
                                zzbysVar.b("Cannot resize an expanded banner.");
                                return;
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                                com.google.android.gms.ads.internal.zzt.zzc();
                                zzbysVar.j = com.google.android.gms.ads.internal.util.zzs.zzS((String) map.get("width"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                                com.google.android.gms.ads.internal.zzt.zzc();
                                zzbysVar.g = com.google.android.gms.ads.internal.util.zzs.zzS((String) map.get("height"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                                com.google.android.gms.ads.internal.zzt.zzc();
                                zzbysVar.h = com.google.android.gms.ads.internal.util.zzs.zzS((String) map.get("offsetX"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                                com.google.android.gms.ads.internal.zzt.zzc();
                                zzbysVar.i = com.google.android.gms.ads.internal.util.zzs.zzS((String) map.get("offsetY"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                                zzbysVar.d = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                            }
                            String str = (String) map.get("customClosePosition");
                            if (!TextUtils.isEmpty(str)) {
                                zzbysVar.c = str;
                            }
                            if (zzbysVar.j < 0 || zzbysVar.g < 0) {
                                zzbysVar.b("Invalid width and height options. Cannot resize.");
                                return;
                            }
                            Window window = activity.getWindow();
                            if (window != null && window.getDecorView() != null) {
                                com.google.android.gms.ads.internal.zzt.zzc();
                                int[] zzaa = com.google.android.gms.ads.internal.util.zzs.zzaa(activity);
                                com.google.android.gms.ads.internal.zzt.zzc();
                                int[] zzW = com.google.android.gms.ads.internal.util.zzs.zzW(activity);
                                int i8 = zzaa[0];
                                int i9 = zzaa[1];
                                int i10 = zzbysVar.j;
                                if (i10 < 50 || i10 > i8) {
                                    i = 0;
                                    i2 = 50;
                                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                                    zzo.zzi("Width is too small or too large.");
                                } else {
                                    int i12 = zzbysVar.g;
                                    if (i12 < 50 || i12 > i9) {
                                        i = 0;
                                        i2 = 50;
                                        int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                                        zzo.zzi("Height is too small or too large.");
                                    } else {
                                        if (i12 != i9 || i10 != i8) {
                                            boolean z = zzbysVar.d;
                                            if (z) {
                                                String str2 = zzbysVar.c;
                                                i2 = 50;
                                                switch (str2.hashCode()) {
                                                    case -1364013995:
                                                        i = 0;
                                                        if (str2.equals(TtmlNode.CENTER)) {
                                                            B = wt3.B(zzbysVar.e, zzbysVar.h, i10 >> 1, -25);
                                                            i4 = ((zzbysVar.f + zzbysVar.i) + (i12 >> 1)) - 25;
                                                            break;
                                                        }
                                                        B = wt3.B(zzbysVar.e, zzbysVar.h, i10, -50);
                                                        i5 = zzbysVar.f;
                                                        i4 = i5 + zzbysVar.i;
                                                        break;
                                                    case -1012429441:
                                                        i = 0;
                                                        if (str2.equals(U3.e.c)) {
                                                            B = zzbysVar.e + zzbysVar.h;
                                                            i5 = zzbysVar.f;
                                                            i4 = i5 + zzbysVar.i;
                                                            break;
                                                        }
                                                        B = wt3.B(zzbysVar.e, zzbysVar.h, i10, -50);
                                                        i5 = zzbysVar.f;
                                                        i4 = i5 + zzbysVar.i;
                                                    case -655373719:
                                                        i = 0;
                                                        if (str2.equals(U3.e.e)) {
                                                            i6 = zzbysVar.e + zzbysVar.h;
                                                            i7 = zzbysVar.f;
                                                            int i14 = i6;
                                                            i4 = wt3.B(i7, zzbysVar.i, i12, -50);
                                                            B = i14;
                                                            break;
                                                        }
                                                        B = wt3.B(zzbysVar.e, zzbysVar.h, i10, -50);
                                                        i5 = zzbysVar.f;
                                                        i4 = i5 + zzbysVar.i;
                                                        break;
                                                    case 1163912186:
                                                        i = 0;
                                                        if (str2.equals(U3.e.d)) {
                                                            i6 = wt3.B(zzbysVar.e, zzbysVar.h, i10, -50);
                                                            i7 = zzbysVar.f;
                                                            int i142 = i6;
                                                            i4 = wt3.B(i7, zzbysVar.i, i12, -50);
                                                            B = i142;
                                                            break;
                                                        }
                                                        B = wt3.B(zzbysVar.e, zzbysVar.h, i10, -50);
                                                        i5 = zzbysVar.f;
                                                        i4 = i5 + zzbysVar.i;
                                                        break;
                                                    case 1288627767:
                                                        i = 0;
                                                        if (str2.equals("bottom-center")) {
                                                            i6 = wt3.B(zzbysVar.e, zzbysVar.h, i10 >> 1, -25);
                                                            i7 = zzbysVar.f;
                                                            int i1422 = i6;
                                                            i4 = wt3.B(i7, zzbysVar.i, i12, -50);
                                                            B = i1422;
                                                            break;
                                                        }
                                                        B = wt3.B(zzbysVar.e, zzbysVar.h, i10, -50);
                                                        i5 = zzbysVar.f;
                                                        i4 = i5 + zzbysVar.i;
                                                        break;
                                                    case 1755462605:
                                                        if (str2.equals("top-center")) {
                                                            B = wt3.B(zzbysVar.e, zzbysVar.h, i10 >> 1, -25);
                                                            i4 = zzbysVar.f + zzbysVar.i;
                                                            i = 0;
                                                            break;
                                                        }
                                                    default:
                                                        i = 0;
                                                        B = wt3.B(zzbysVar.e, zzbysVar.h, i10, -50);
                                                        i5 = zzbysVar.f;
                                                        i4 = i5 + zzbysVar.i;
                                                        break;
                                                }
                                                if (B >= 0) {
                                                    if (B + 50 <= i8) {
                                                        if (i4 >= zzW[i]) {
                                                            if (i4 + 50 > zzW[1]) {
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                i = 0;
                                                i2 = 50;
                                            }
                                            if (z) {
                                                iArr = new int[]{zzbysVar.e + zzbysVar.h, zzbysVar.f + zzbysVar.i};
                                            } else {
                                                com.google.android.gms.ads.internal.zzt.zzc();
                                                int[] zzaa2 = com.google.android.gms.ads.internal.util.zzs.zzaa(activity);
                                                com.google.android.gms.ads.internal.zzt.zzc();
                                                int[] zzW2 = com.google.android.gms.ads.internal.util.zzs.zzW(activity);
                                                int i15 = zzaa2[i];
                                                int i16 = zzbysVar.e + zzbysVar.h;
                                                int i17 = zzbysVar.f + zzbysVar.i;
                                                if (i16 < 0) {
                                                    i3 = i;
                                                } else {
                                                    int i18 = zzbysVar.j;
                                                    i3 = i16 + i18 > i15 ? i15 - i18 : i16;
                                                }
                                                int i19 = zzW2[i];
                                                if (i17 < i19) {
                                                    i17 = i19;
                                                } else {
                                                    int i20 = zzbysVar.g;
                                                    int i21 = i17 + i20;
                                                    int i22 = zzW2[1];
                                                    if (i21 > i22) {
                                                        i17 = i22 - i20;
                                                    }
                                                }
                                                iArr = new int[]{i3, i17};
                                            }
                                            if (iArr != null) {
                                                zzbysVar.b("Resize location out of screen or close button is not visible.");
                                                return;
                                            }
                                            com.google.android.gms.ads.internal.client.zzay.zza();
                                            int zzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, zzbysVar.j);
                                            com.google.android.gms.ads.internal.client.zzay.zza();
                                            int zzE2 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, zzbysVar.g);
                                            ViewParent parent = ((View) zzclmVar2).getParent();
                                            if (!(parent instanceof ViewGroup)) {
                                                zzbysVar.b("Webview is detached, probably in the middle of a resize or expand.");
                                                return;
                                            }
                                            ViewGroup viewGroup = (ViewGroup) parent;
                                            viewGroup.removeView((View) zzclmVar2);
                                            PopupWindow popupWindow = zzbysVar.r;
                                            if (popupWindow == null) {
                                                zzbysVar.t = viewGroup;
                                                com.google.android.gms.ads.internal.zzt.zzc();
                                                ((View) zzclmVar2).setDrawingCacheEnabled(true);
                                                Bitmap createBitmap = Bitmap.createBitmap(((View) zzclmVar2).getDrawingCache());
                                                ((View) zzclmVar2).setDrawingCacheEnabled(i);
                                                ImageView imageView = new ImageView(activity);
                                                zzbysVar.o = imageView;
                                                imageView.setImageBitmap(createBitmap);
                                                zzbysVar.n = zzclmVar2.zzN();
                                                zzbysVar.t.addView(zzbysVar.o);
                                            } else {
                                                popupWindow.dismiss();
                                            }
                                            RelativeLayout relativeLayout = new RelativeLayout(activity);
                                            zzbysVar.s = relativeLayout;
                                            relativeLayout.setBackgroundColor(0);
                                            zzbysVar.s.setLayoutParams(new ViewGroup.LayoutParams(zzE, zzE2));
                                            com.google.android.gms.ads.internal.zzt.zzc();
                                            PopupWindow popupWindow2 = new PopupWindow((View) zzbysVar.s, zzE, zzE2, false);
                                            zzbysVar.r = popupWindow2;
                                            popupWindow2.setOutsideTouchable(false);
                                            zzbysVar.r.setTouchable(true);
                                            zzbysVar.r.setClippingEnabled(!zzbysVar.d);
                                            zzbysVar.s.addView((View) zzclmVar2, -1, -1);
                                            zzbysVar.p = new LinearLayout(activity);
                                            com.google.android.gms.ads.internal.client.zzay.zza();
                                            int i23 = i2;
                                            int zzE3 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, i23);
                                            com.google.android.gms.ads.internal.client.zzay.zza();
                                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(zzE3, com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, i23));
                                            String str3 = zzbysVar.c;
                                            switch (str3.hashCode()) {
                                                case -1364013995:
                                                    if (str3.equals(TtmlNode.CENTER)) {
                                                        layoutParams.addRule(13);
                                                        break;
                                                    }
                                                    layoutParams.addRule(10);
                                                    layoutParams.addRule(11);
                                                    break;
                                                case -1012429441:
                                                    if (str3.equals(U3.e.c)) {
                                                        layoutParams.addRule(10);
                                                        layoutParams.addRule(9);
                                                        break;
                                                    }
                                                    layoutParams.addRule(10);
                                                    layoutParams.addRule(11);
                                                    break;
                                                case -655373719:
                                                    if (str3.equals(U3.e.e)) {
                                                        layoutParams.addRule(12);
                                                        layoutParams.addRule(9);
                                                        break;
                                                    }
                                                    layoutParams.addRule(10);
                                                    layoutParams.addRule(11);
                                                    break;
                                                case 1163912186:
                                                    if (str3.equals(U3.e.d)) {
                                                        layoutParams.addRule(12);
                                                        layoutParams.addRule(11);
                                                        break;
                                                    }
                                                    layoutParams.addRule(10);
                                                    layoutParams.addRule(11);
                                                    break;
                                                case 1288627767:
                                                    if (str3.equals("bottom-center")) {
                                                        layoutParams.addRule(12);
                                                        layoutParams.addRule(14);
                                                        break;
                                                    }
                                                    layoutParams.addRule(10);
                                                    layoutParams.addRule(11);
                                                    break;
                                                case 1755462605:
                                                    if (str3.equals("top-center")) {
                                                        layoutParams.addRule(10);
                                                        layoutParams.addRule(14);
                                                        break;
                                                    }
                                                    layoutParams.addRule(10);
                                                    layoutParams.addRule(11);
                                                    break;
                                                default:
                                                    layoutParams.addRule(10);
                                                    layoutParams.addRule(11);
                                                    break;
                                            }
                                            zzbysVar.p.setOnClickListener(new cb(zzbysVar));
                                            zzbysVar.p.setContentDescription("Close button");
                                            zzbysVar.s.addView(zzbysVar.p, layoutParams);
                                            try {
                                                PopupWindow popupWindow3 = zzbysVar.r;
                                                View decorView = window.getDecorView();
                                                com.google.android.gms.ads.internal.client.zzay.zza();
                                                int zzE4 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, iArr[0]);
                                                com.google.android.gms.ads.internal.client.zzay.zza();
                                                popupWindow3.showAtLocation(decorView, 0, zzE4, com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, iArr[1]));
                                                int i24 = iArr[0];
                                                int i25 = iArr[1];
                                                zzbyz zzbyzVar = zzbysVar.q;
                                                if (zzbyzVar != null) {
                                                    zzbyzVar.zza();
                                                }
                                                zzbysVar.l.J(new zzcnw(1, zzE, zzE2));
                                                int i26 = iArr[0];
                                                int i27 = iArr[1];
                                                com.google.android.gms.ads.internal.zzt.zzc();
                                                zzbysVar.c(i26, i27 - com.google.android.gms.ads.internal.util.zzs.zzW(zzbysVar.m)[0], zzbysVar.j, zzbysVar.g);
                                                zzbysVar.d("resized");
                                                return;
                                            } catch (RuntimeException e) {
                                                String message = e.getMessage();
                                                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                                                sb.append("Cannot show popup window: ");
                                                sb.append(message);
                                                zzbysVar.b(sb.toString());
                                                RelativeLayout relativeLayout2 = zzbysVar.s;
                                                zzclm zzclmVar3 = zzbysVar.l;
                                                relativeLayout2.removeView((View) zzclmVar3);
                                                ViewGroup viewGroup2 = zzbysVar.t;
                                                if (viewGroup2 != null) {
                                                    viewGroup2.removeView(zzbysVar.o);
                                                    zzbysVar.t.addView((View) zzclmVar3);
                                                    zzclmVar3.J(zzbysVar.n);
                                                }
                                                return;
                                            }
                                        }
                                        int i28 = com.google.android.gms.ads.internal.util.zze.zza;
                                        zzo.zzi("Cannot resize to a full-screen ad.");
                                        i = 0;
                                        i2 = 50;
                                    }
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                            }
                            zzbysVar.b("Activity context is not ready, cannot get window or decor view.");
                            return;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (intValue == 3) {
                    zzbyv zzbyvVar = new zzbyv(zzclmVar, map);
                    Activity activity2 = zzbyvVar.c;
                    if (activity2 == null) {
                        zzbyvVar.b("Activity context is not available");
                        return;
                    }
                    com.google.android.gms.ads.internal.zzt.zzc();
                    if (!new zzbin(activity2).a()) {
                        zzbyvVar.b("Feature is not supported by the device.");
                        return;
                    }
                    String str4 = (String) map.get("iurl");
                    if (TextUtils.isEmpty(str4)) {
                        zzbyvVar.b("Image url cannot be empty.");
                        return;
                    }
                    if (!URLUtil.isValidUrl(str4)) {
                        zzbyvVar.b("Invalid image url: ".concat(String.valueOf(str4)));
                        return;
                    }
                    String lastPathSegment = Uri.parse(str4).getLastPathSegment();
                    com.google.android.gms.ads.internal.zzt.zzc();
                    if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                        zzbyvVar.b("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
                        return;
                    }
                    Resources c2 = com.google.android.gms.ads.internal.zzt.zzh().c();
                    com.google.android.gms.ads.internal.zzt.zzc();
                    AlertDialog.Builder zzN = com.google.android.gms.ads.internal.util.zzs.zzN(activity2);
                    zzN.setTitle(c2 != null ? c2.getString(R.string.s1) : "Save image");
                    zzN.setMessage(c2 != null ? c2.getString(R.string.s2) : "Allow Ad to store image in Picture gallery?");
                    zzN.setPositiveButton(c2 != null ? c2.getString(R.string.s3) : "Accept", new enn(c == true ? 1 : 0, zzbyvVar, str4, lastPathSegment));
                    zzN.setNegativeButton(c2 != null ? c2.getString(R.string.s4) : "Decline", new rcb(zzbyvVar, 2));
                    zzN.create().show();
                    return;
                }
                if (intValue == 4) {
                    zzbyp zzbypVar = new zzbyp(zzclmVar, map);
                    Activity activity3 = zzbypVar.d;
                    if (activity3 == null) {
                        zzbypVar.b("Activity context is not available.");
                        return;
                    }
                    com.google.android.gms.ads.internal.zzt.zzc();
                    if (!new zzbin(activity3).b(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"))) {
                        zzbypVar.b("This feature is not available on the device.");
                        return;
                    }
                    com.google.android.gms.ads.internal.zzt.zzc();
                    AlertDialog.Builder zzN2 = com.google.android.gms.ads.internal.util.zzs.zzN(activity3);
                    Resources c3 = com.google.android.gms.ads.internal.zzt.zzh().c();
                    zzN2.setTitle(c3 != null ? c3.getString(R.string.s5) : "Create calendar event");
                    zzN2.setMessage(c3 != null ? c3.getString(R.string.s6) : "Allow Ad to create a calendar event?");
                    zzN2.setPositiveButton(c3 != null ? c3.getString(R.string.s3) : "Accept", new hqn(zzbypVar, 0));
                    zzN2.setNegativeButton(c3 != null ? c3.getString(R.string.s4) : "Decline", new hqn(zzbypVar, 1));
                    zzN2.create().show();
                    return;
                }
                if (intValue != 5) {
                    if (intValue == 6) {
                        this.b.f(true);
                        return;
                    } else if (intValue != 7) {
                        int i29 = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzh("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.c.zzc();
            return;
        }
        String str5 = (String) map.get("forceOrientation");
        boolean parseBoolean = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzclmVar != null) {
            zzclmVar.Y(U3.i.D.equalsIgnoreCase(str5) ? 7 : U3.i.C.equalsIgnoreCase(str5) ? 6 : parseBoolean ? -1 : 14);
        } else {
            int i30 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("AdWebView is null");
        }
    }
}
