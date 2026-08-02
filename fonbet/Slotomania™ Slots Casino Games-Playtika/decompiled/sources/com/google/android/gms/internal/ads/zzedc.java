package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzedc extends com.google.android.gms.ads.internal.client.zzds {
    final Map zza = new HashMap();
    private final Context zzb;
    private final WeakReference zzc;
    private final zzecq zzd;
    private final zzhbs zze;
    private zzecf zzf;

    zzedc(Context context, WeakReference weakReference, zzecq zzecqVar, zzede zzedeVar, zzhbs zzhbsVar) {
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzecqVar;
        this.zze = zzhbsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzg(String str) {
        try {
            zzhbi.zzr(this.zzf.zzn(str), new zzecx(this), this.zze);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzn();
        }
    }

    private final synchronized void zzk(String str) {
        try {
            zzhbi.zzr(this.zzf.zzn(str), new zzecy(this), this.zze);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "OutOfContextTester.setAdAsShown");
            this.zzd.zzn();
        }
    }

    private final Context zzl() {
        Context context = (Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzm(Object obj) {
        ResponseInfo responseInfo;
        com.google.android.gms.ads.internal.client.zzdx zzd;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzd = responseInfo.zzd()) == null) {
            return "";
        }
        try {
            return zzd.zzj();
        } catch (RemoteException unused) {
            return "";
        }
    }

    public final void zzb(zzecf zzecfVar) {
        this.zzf = zzecfVar;
    }

    public final synchronized void zzc(zzedd zzeddVar) {
        char c;
        String zzb = zzeddVar.zzb();
        switch (zzb.hashCode()) {
            case -1999289321:
                if (zzb.equals("NATIVE")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1372958932:
                if (zzb.equals("INTERSTITIAL")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -428325382:
                if (zzb.equals("APP_OPEN_AD")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (zzb.equals(BrandSafetyUtils.k)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1854800829:
                if (zzb.equals("REWARDED_INTERSTITIAL")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (zzb.equals("BANNER")) {
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
            String zza = zzeddVar.zza();
            AppOpenAd.load(zzl(), zza, zzeddVar.zzc(), new zzecr(this, zza));
            return;
        }
        if (c == 1) {
            String zza2 = zzeddVar.zza();
            zzbhv zzbhvVar = zzbie.zzkM;
            BaseAdView adManagerAdView = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue() && zzeddVar.zzg()) ? new AdManagerAdView(zzl()) : new AdView(zzl());
            adManagerAdView.setAdSize(zzeddVar.zzd());
            adManagerAdView.setAdUnitId(zza2);
            adManagerAdView.setAdListener(new zzecs(this, zza2, adManagerAdView));
            VideoOptions zzf = zzeddVar.zzf();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue() && zzeddVar.zzg() && zzf != null) {
                ((AdManagerAdView) adManagerAdView).setVideoOptions(zzf);
            }
            adManagerAdView.loadAd(zzeddVar.zzc());
            return;
        }
        if (c == 2) {
            String zza3 = zzeddVar.zza();
            InterstitialAd.load(zzl(), zza3, zzeddVar.zzc(), new zzect(this, zza3));
            return;
        }
        if (c != 3) {
            if (c == 4) {
                String zza4 = zzeddVar.zza();
                RewardedAd.load(zzl(), zza4, zzeddVar.zzc(), new zzecu(this, zza4));
                return;
            } else {
                if (c != 5) {
                    return;
                }
                String zza5 = zzeddVar.zza();
                RewardedInterstitialAd.load(zzl(), zza5, zzeddVar.zzc(), new zzecv(this, zza5));
                return;
            }
        }
        final String zza6 = zzeddVar.zza();
        AdLoader.Builder builder = new AdLoader.Builder(zzl(), zza6);
        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.google.android.gms.internal.ads.zzeda
            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public final /* synthetic */ void onNativeAdLoaded(NativeAd nativeAd) {
                zzedc.this.zzf(zza6, nativeAd);
            }
        });
        builder.withAdListener(new zzecw(this));
        NativeAdOptions zze = zzeddVar.zze();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkM)).booleanValue() && zze != null) {
            builder.withNativeAdOptions(zze);
        }
        builder.build().loadAd(zzeddVar.zzc());
    }

    public final synchronized void zzd(String str) {
        Map map;
        Object obj;
        Activity zzo = this.zzd.zzo();
        if (zzo != null && (obj = (map = this.zza).get(str)) != null) {
            zzbhv zzbhvVar = zzbie.zzkL;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue() || (obj instanceof AppOpenAd) || (obj instanceof InterstitialAd) || (obj instanceof RewardedAd) || (obj instanceof RewardedInterstitialAd)) {
                map.remove(str);
            }
            zzk(zzm(obj));
            if (obj instanceof AppOpenAd) {
                ((AppOpenAd) obj).show(zzo);
                return;
            }
            if (obj instanceof InterstitialAd) {
                ((InterstitialAd) obj).show(zzo);
                return;
            }
            if (obj instanceof RewardedAd) {
                ((RewardedAd) obj).show(zzo, zzedb.zza);
                return;
            }
            if (obj instanceof RewardedInterstitialAd) {
                ((RewardedInterstitialAd) obj).show(zzo, zzecz.zza);
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                Intent intent = new Intent();
                Context zzl = zzl();
                intent.setClassName(zzl, OutOfContextTestingActivity.CLASS_NAME);
                intent.putExtra("adUnit", str);
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzY(zzl, intent);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.unwrap(iObjectWrapper2);
        if (context == null || viewGroup == null) {
            return;
        }
        Map map = this.zza;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof AdView) {
            zzede.zza(context, viewGroup, (AdView) obj);
        } else if (obj instanceof NativeAd) {
            zzede.zzb(context, viewGroup, (NativeAd) obj);
        }
    }

    protected final synchronized void zzf(String str, Object obj) {
        this.zza.put(str, obj);
        zzg(zzm(obj));
    }

    final /* synthetic */ zzecq zzi() {
        return this.zzd;
    }
}
