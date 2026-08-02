package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.util.CollectionUtils;
import com.ironsource.X3;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzbxo extends zzbxu {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcki zzj;
    private final Activity zzk;
    private zzcms zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbxv zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        CollectionUtils.setOf(X3.e.c, X3.e.b, "top-center", TtmlNode.CENTER, X3.e.e, X3.e.d, "bottom-center");
    }

    public zzbxo(zzcki zzckiVar, zzbxv zzbxvVar) {
        super(zzckiVar, n.g);
        this.zza = X3.e.b;
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzckiVar;
        this.zzk = zzckiVar.zzj();
        this.zzo = zzbxvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzf(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmj)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmk)).booleanValue()) {
            View view = (View) this.zzj;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzml)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.zzr;
                    zzcki zzckiVar = this.zzj;
                    viewGroup2.addView((View) zzckiVar);
                    zzckiVar.zzaf(this.zzl);
                } catch (IllegalStateException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to add webview back to view hierarchy.", e);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "MraidCallResizeHandler.collapseInternal");
                }
            } else {
                ViewGroup viewGroup3 = this.zzr;
                zzcki zzckiVar2 = this.zzj;
                viewGroup3.addView((View) zzckiVar2);
                zzckiVar2.zzaf(this.zzl);
            }
        }
        if (z) {
            zzk("default");
            zzbxv zzbxvVar = this.zzo;
            if (zzbxvVar != null) {
                zzbxvVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f5 A[Catch: all -> 0x0477, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0014, B:12:0x001c, B:13:0x0021, B:15:0x0023, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003a, B:23:0x003f, B:25:0x0041, B:27:0x0050, B:28:0x0062, B:30:0x0070, B:31:0x0081, B:33:0x008f, B:34:0x00a0, B:36:0x00ae, B:37:0x00bf, B:39:0x00cd, B:40:0x00db, B:42:0x00e9, B:43:0x00eb, B:45:0x00ef, B:47:0x00f3, B:49:0x00f9, B:52:0x0101, B:56:0x0125, B:62:0x0131, B:64:0x0269, B:65:0x026e, B:67:0x0270, B:69:0x028d, B:71:0x0299, B:72:0x02d2, B:103:0x0385, B:104:0x03b4, B:106:0x03cc, B:107:0x03e8, B:109:0x03f0, B:110:0x03f7, B:111:0x041d, B:115:0x0420, B:117:0x044e, B:118:0x0460, B:120:0x038c, B:121:0x0393, B:122:0x039a, B:123:0x03a1, B:124:0x03a7, B:125:0x03ae, B:126:0x02cf, B:127:0x0462, B:128:0x0467, B:130:0x013c, B:132:0x0140, B:145:0x0198, B:146:0x01e7, B:147:0x01f2, B:149:0x01f5, B:151:0x01f9, B:153:0x01fd, B:157:0x0208, B:158:0x0217, B:161:0x023f, B:164:0x024f, B:165:0x0245, B:167:0x024d, B:168:0x0236, B:170:0x023c, B:172:0x01a3, B:173:0x01b9, B:174:0x01c4, B:175:0x01ae, B:176:0x01bc, B:177:0x01c9, B:178:0x01dc, B:179:0x01ea, B:197:0x0254, B:198:0x025e, B:199:0x0469, B:200:0x046e, B:202:0x0470, B:203:0x0475), top: B:3:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0269 A[Catch: all -> 0x0477, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0014, B:12:0x001c, B:13:0x0021, B:15:0x0023, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003a, B:23:0x003f, B:25:0x0041, B:27:0x0050, B:28:0x0062, B:30:0x0070, B:31:0x0081, B:33:0x008f, B:34:0x00a0, B:36:0x00ae, B:37:0x00bf, B:39:0x00cd, B:40:0x00db, B:42:0x00e9, B:43:0x00eb, B:45:0x00ef, B:47:0x00f3, B:49:0x00f9, B:52:0x0101, B:56:0x0125, B:62:0x0131, B:64:0x0269, B:65:0x026e, B:67:0x0270, B:69:0x028d, B:71:0x0299, B:72:0x02d2, B:103:0x0385, B:104:0x03b4, B:106:0x03cc, B:107:0x03e8, B:109:0x03f0, B:110:0x03f7, B:111:0x041d, B:115:0x0420, B:117:0x044e, B:118:0x0460, B:120:0x038c, B:121:0x0393, B:122:0x039a, B:123:0x03a1, B:124:0x03a7, B:125:0x03ae, B:126:0x02cf, B:127:0x0462, B:128:0x0467, B:130:0x013c, B:132:0x0140, B:145:0x0198, B:146:0x01e7, B:147:0x01f2, B:149:0x01f5, B:151:0x01f9, B:153:0x01fd, B:157:0x0208, B:158:0x0217, B:161:0x023f, B:164:0x024f, B:165:0x0245, B:167:0x024d, B:168:0x0236, B:170:0x023c, B:172:0x01a3, B:173:0x01b9, B:174:0x01c4, B:175:0x01ae, B:176:0x01bc, B:177:0x01c9, B:178:0x01dc, B:179:0x01ea, B:197:0x0254, B:198:0x025e, B:199:0x0469, B:200:0x046e, B:202:0x0470, B:203:0x0475), top: B:3:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0270 A[Catch: all -> 0x0477, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0014, B:12:0x001c, B:13:0x0021, B:15:0x0023, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003a, B:23:0x003f, B:25:0x0041, B:27:0x0050, B:28:0x0062, B:30:0x0070, B:31:0x0081, B:33:0x008f, B:34:0x00a0, B:36:0x00ae, B:37:0x00bf, B:39:0x00cd, B:40:0x00db, B:42:0x00e9, B:43:0x00eb, B:45:0x00ef, B:47:0x00f3, B:49:0x00f9, B:52:0x0101, B:56:0x0125, B:62:0x0131, B:64:0x0269, B:65:0x026e, B:67:0x0270, B:69:0x028d, B:71:0x0299, B:72:0x02d2, B:103:0x0385, B:104:0x03b4, B:106:0x03cc, B:107:0x03e8, B:109:0x03f0, B:110:0x03f7, B:111:0x041d, B:115:0x0420, B:117:0x044e, B:118:0x0460, B:120:0x038c, B:121:0x0393, B:122:0x039a, B:123:0x03a1, B:124:0x03a7, B:125:0x03ae, B:126:0x02cf, B:127:0x0462, B:128:0x0467, B:130:0x013c, B:132:0x0140, B:145:0x0198, B:146:0x01e7, B:147:0x01f2, B:149:0x01f5, B:151:0x01f9, B:153:0x01fd, B:157:0x0208, B:158:0x0217, B:161:0x023f, B:164:0x024f, B:165:0x0245, B:167:0x024d, B:168:0x0236, B:170:0x023c, B:172:0x01a3, B:173:0x01b9, B:174:0x01c4, B:175:0x01ae, B:176:0x01bc, B:177:0x01c9, B:178:0x01dc, B:179:0x01ea, B:197:0x0254, B:198:0x025e, B:199:0x0469, B:200:0x046e, B:202:0x0470, B:203:0x0475), top: B:3:0x0009, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Map map) {
        int i;
        int i2;
        char c;
        int i3;
        int i4;
        int i5;
        int i6;
        synchronized (this.zzi) {
            Activity activity = this.zzk;
            if (activity == null) {
                zzg("Not an activity context. Cannot resize.");
                return;
            }
            zzcki zzckiVar = this.zzj;
            if (zzckiVar.zzN() == null) {
                zzg("Webview is not yet available, size is not set.");
                return;
            }
            if (zzckiVar.zzN().zzg()) {
                zzg("Is interstitial. Cannot resize an interstitial.");
                return;
            }
            if (zzckiVar.zzW()) {
                zzg("Cannot resize an expanded banner.");
                return;
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zzh = com.google.android.gms.ads.internal.util.zzs.zzS((String) map.get("width"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zze = com.google.android.gms.ads.internal.util.zzs.zzS((String) map.get("height"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zzf = com.google.android.gms.ads.internal.util.zzs.zzS((String) map.get("offsetX"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zzg = com.google.android.gms.ads.internal.util.zzs.zzS((String) map.get("offsetY"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                this.zzb = Boolean.parseBoolean((String) map.get("allowOffscreen"));
            }
            String str = (String) map.get("customClosePosition");
            if (!TextUtils.isEmpty(str)) {
                this.zza = str;
            }
            if (this.zzh < 0 || this.zze < 0) {
                zzg("Invalid width and height options. Cannot resize.");
                return;
            }
            Window window = activity.getWindow();
            if (window != null && window.getDecorView() != null) {
                com.google.android.gms.ads.internal.zzt.zzc();
                int[] zzaa = com.google.android.gms.ads.internal.util.zzs.zzaa(activity);
                com.google.android.gms.ads.internal.zzt.zzc();
                int[] zzW = com.google.android.gms.ads.internal.util.zzs.zzW(activity);
                int i7 = zzaa[0];
                int i8 = zzaa[1];
                int i9 = this.zzh;
                int[] iArr = null;
                if (i9 >= 50 && i9 <= i7) {
                    int i10 = this.zze;
                    if (i10 >= 50 && i10 <= i8) {
                        if (i10 == i8 && i9 == i7) {
                            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot resize to a full-screen ad.");
                            i = 50;
                        } else {
                            boolean z = this.zzb;
                            if (z) {
                                i = 50;
                                String str2 = this.zza;
                                switch (str2.hashCode()) {
                                    case -1364013995:
                                        if (str2.equals(TtmlNode.CENTER)) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1012429441:
                                        if (str2.equals(X3.e.c)) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -655373719:
                                        if (str2.equals(X3.e.e)) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1163912186:
                                        if (str2.equals(X3.e.d)) {
                                            c = 5;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1288627767:
                                        if (str2.equals("bottom-center")) {
                                            c = 4;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1755462605:
                                        if (str2.equals("top-center")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                if (c == 0) {
                                    i3 = this.zzc + this.zzf;
                                    i4 = this.zzd;
                                } else if (c != 1) {
                                    if (c != 2) {
                                        if (c == 3) {
                                            i3 = this.zzc + this.zzf;
                                            i6 = this.zzd;
                                        } else if (c == 4) {
                                            i3 = ((this.zzc + this.zzf) + (i9 >> 1)) - 25;
                                            i6 = this.zzd;
                                        } else if (c != 5) {
                                            i3 = ((this.zzc + this.zzf) + i9) - 50;
                                            i4 = this.zzd;
                                        } else {
                                            i3 = ((this.zzc + this.zzf) + i9) - 50;
                                            i6 = this.zzd;
                                        }
                                        i5 = ((i6 + this.zzg) + i10) - 50;
                                    } else {
                                        i3 = ((this.zzc + this.zzf) + (i9 >> 1)) - 25;
                                        i5 = ((this.zzd + this.zzg) + (i10 >> 1)) - 25;
                                    }
                                    if (i3 >= 0) {
                                        if (i3 + 50 <= i7) {
                                            if (i5 >= zzW[0]) {
                                                if (i5 + 50 <= zzW[1]) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    i3 = ((this.zzc + this.zzf) + (i9 >> 1)) - 25;
                                    i4 = this.zzd;
                                }
                                i5 = i4 + this.zzg;
                                if (i3 >= 0) {
                                }
                            } else {
                                i = 50;
                            }
                            if (z) {
                                iArr = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                            } else {
                                com.google.android.gms.ads.internal.zzt.zzc();
                                int[] zzaa2 = com.google.android.gms.ads.internal.util.zzs.zzaa(activity);
                                com.google.android.gms.ads.internal.zzt.zzc();
                                int[] zzW2 = com.google.android.gms.ads.internal.util.zzs.zzW(activity);
                                int i12 = zzaa2[0];
                                int i13 = this.zzc + this.zzf;
                                int i14 = this.zzd + this.zzg;
                                if (i13 < 0) {
                                    i2 = 0;
                                } else {
                                    int i15 = this.zzh;
                                    i2 = i13 + i15 > i12 ? i12 - i15 : i13;
                                }
                                int i16 = zzW2[0];
                                if (i14 < i16) {
                                    i14 = i16;
                                } else {
                                    int i17 = this.zze;
                                    int i18 = i14 + i17;
                                    int i19 = zzW2[1];
                                    if (i18 > i19) {
                                        i14 = i19 - i17;
                                    }
                                }
                                iArr = new int[]{i2, i14};
                            }
                        }
                        if (iArr == null) {
                            zzg("Resize location out of screen or close button is not visible.");
                            return;
                        }
                        com.google.android.gms.ads.internal.client.zzay.zza();
                        int zzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, this.zzh);
                        com.google.android.gms.ads.internal.client.zzay.zza();
                        int zzE2 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, this.zze);
                        ViewParent parent = ((View) zzckiVar).getParent();
                        if (!(parent instanceof ViewGroup)) {
                            zzg("Webview is detached, probably in the middle of a resize or expand.");
                            return;
                        }
                        ViewGroup viewGroup = (ViewGroup) parent;
                        viewGroup.removeView((View) zzckiVar);
                        PopupWindow popupWindow = this.zzp;
                        if (popupWindow == null) {
                            this.zzr = viewGroup;
                            com.google.android.gms.ads.internal.zzt.zzc();
                            ((View) zzckiVar).setDrawingCacheEnabled(true);
                            Bitmap createBitmap = Bitmap.createBitmap(((View) zzckiVar).getDrawingCache());
                            ((View) zzckiVar).setDrawingCacheEnabled(false);
                            ImageView imageView = new ImageView(activity);
                            this.zzm = imageView;
                            imageView.setImageBitmap(createBitmap);
                            this.zzl = zzckiVar.zzN();
                            this.zzr.addView(this.zzm);
                        } else {
                            popupWindow.dismiss();
                        }
                        RelativeLayout relativeLayout = new RelativeLayout(activity);
                        this.zzq = relativeLayout;
                        relativeLayout.setBackgroundColor(0);
                        this.zzq.setLayoutParams(new ViewGroup.LayoutParams(zzE, zzE2));
                        com.google.android.gms.ads.internal.zzt.zzc();
                        PopupWindow popupWindow2 = new PopupWindow((View) this.zzq, zzE, zzE2, false);
                        this.zzp = popupWindow2;
                        popupWindow2.setOutsideTouchable(false);
                        this.zzp.setTouchable(true);
                        this.zzp.setClippingEnabled(!this.zzb);
                        char c2 = 65535;
                        this.zzq.addView((View) zzckiVar, -1, -1);
                        this.zzn = new LinearLayout(activity);
                        com.google.android.gms.ads.internal.client.zzay.zza();
                        int i20 = i;
                        int zzE3 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, i20);
                        com.google.android.gms.ads.internal.client.zzay.zza();
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(zzE3, com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, i20));
                        String str3 = this.zza;
                        switch (str3.hashCode()) {
                            case -1364013995:
                                if (str3.equals(TtmlNode.CENTER)) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case -1012429441:
                                if (str3.equals(X3.e.c)) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case -655373719:
                                if (str3.equals(X3.e.e)) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 1163912186:
                                if (str3.equals(X3.e.d)) {
                                    c2 = 5;
                                    break;
                                }
                                break;
                            case 1288627767:
                                if (str3.equals("bottom-center")) {
                                    c2 = 4;
                                    break;
                                }
                                break;
                            case 1755462605:
                                if (str3.equals("top-center")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                        }
                        if (c2 == 0) {
                            layoutParams.addRule(10);
                            layoutParams.addRule(9);
                        } else if (c2 == 1) {
                            layoutParams.addRule(10);
                            layoutParams.addRule(14);
                        } else if (c2 == 2) {
                            layoutParams.addRule(13);
                        } else if (c2 == 3) {
                            layoutParams.addRule(12);
                            layoutParams.addRule(9);
                        } else if (c2 == 4) {
                            layoutParams.addRule(12);
                            layoutParams.addRule(14);
                        } else if (c2 != 5) {
                            layoutParams.addRule(10);
                            layoutParams.addRule(11);
                        } else {
                            layoutParams.addRule(12);
                            layoutParams.addRule(11);
                        }
                        this.zzn.setOnClickListener(new zzbxm(this));
                        this.zzn.setContentDescription("Close button");
                        this.zzq.addView(this.zzn, layoutParams);
                        try {
                            PopupWindow popupWindow3 = this.zzp;
                            View decorView = window.getDecorView();
                            com.google.android.gms.ads.internal.client.zzay.zza();
                            int zzE4 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, iArr[0]);
                            com.google.android.gms.ads.internal.client.zzay.zza();
                            popupWindow3.showAtLocation(decorView, 0, zzE4, com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, iArr[1]));
                            int i21 = iArr[0];
                            int i22 = iArr[1];
                            zzbxv zzbxvVar = this.zzo;
                            if (zzbxvVar != null) {
                                zzbxvVar.zza(i21, i22, this.zzh, this.zze);
                            }
                            this.zzj.zzaf(zzcms.zzc(zzE, zzE2));
                            int i23 = iArr[0];
                            int i24 = iArr[1];
                            com.google.android.gms.ads.internal.zzt.zzc();
                            zzi(i23, i24 - com.google.android.gms.ads.internal.util.zzs.zzW(this.zzk)[0], this.zzh, this.zze);
                            zzk("resized");
                            return;
                        } catch (RuntimeException e) {
                            String message = e.getMessage();
                            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                            sb.append("Cannot show popup window: ");
                            sb.append(message);
                            zzg(sb.toString());
                            RelativeLayout relativeLayout2 = this.zzq;
                            zzcki zzckiVar2 = this.zzj;
                            relativeLayout2.removeView((View) zzckiVar2);
                            ViewGroup viewGroup2 = this.zzr;
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(this.zzm);
                                this.zzr.addView((View) zzckiVar2);
                                zzckiVar2.zzaf(this.zzl);
                            }
                            return;
                        }
                    }
                    i = 50;
                    int i25 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Height is too small or too large.");
                    if (iArr == null) {
                    }
                }
                i = 50;
                int i26 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Width is too small or too large.");
                if (iArr == null) {
                }
            }
            zzg("Activity context is not ready, cannot get window or decor view.");
        }
    }

    public final void zzb(final boolean z) {
        synchronized (this.zzi) {
            if (this.zzp != null) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmi)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    zzf(z);
                } else {
                    zzcff.zzf.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbxn
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzbxo.this.zzf(z);
                        }
                    });
                }
            }
        }
    }

    public final void zzc(int i, int i2, boolean z) {
        synchronized (this.zzi) {
            this.zzc = i;
            this.zzd = i2;
        }
    }

    public final boolean zzd() {
        boolean z;
        synchronized (this.zzi) {
            z = this.zzp != null;
        }
        return z;
    }

    public final void zze(int i, int i2) {
        this.zzc = i;
        this.zzd = i2;
    }
}
