package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.google.common.net.HttpHeaders;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes7.dex */
public class zzckt extends WebViewClient implements zzcmg {
    public static final /* synthetic */ int zzc = 0;
    private zzdyz zzA;
    private zzdbb zzB;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private boolean zzF;
    private final zzekf zzH;
    private View.OnAttachStateChangeListener zzI;
    protected final zzcki zza;
    protected zzcdb zzb;
    private final zzbhd zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzr zzh;
    private zzcme zzi;
    private zzcmf zzj;
    private zzbnu zzk;
    private zzbnw zzl;
    private zzdkm zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private com.google.android.gms.ads.internal.overlay.zzad zzw;
    private zzbxt zzx;
    private com.google.android.gms.ads.internal.zzb zzy;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbxo zzz = null;
    private final HashSet zzG = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgH)).split(",")));

    public zzckt(zzcki zzckiVar, zzbhd zzbhdVar, boolean z, zzbxt zzbxtVar, zzbxo zzbxoVar, zzekf zzekfVar) {
        this.zzd = zzbhdVar;
        this.zza = zzckiVar;
        this.zzs = z;
        this.zzx = zzbxtVar;
        this.zzH = zzekfVar;
    }

    private final void zzac(final View view, final zzcdb zzcdbVar, final int i) {
        if (!zzcdbVar.zzc() || i <= 0) {
            return;
        }
        zzcdbVar.zzd(view);
        if (zzcdbVar.zzc()) {
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzckt.this.zzU(view, zzcdbVar, i);
                }
            }, 100L);
        }
    }

    private final void zzad() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzI;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zza).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    private static WebResourceResponse zzae() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbv)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzaf(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection;
        WebResourceResponse webResourceResponse;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                int i2 = zzfzb.zzb;
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                httpURLConnection = (HttpURLConnection) openConnection;
                com.google.android.gms.ads.internal.util.zzs zzc2 = com.google.android.gms.ads.internal.zzt.zzc();
                try {
                    zzcki zzckiVar = this.zza;
                    zzc2.zzb(zzckiVar.getContext(), zzckiVar.zzs().afmaVersion, false, httpURLConnection, false, 60000);
                    webResourceResponse = null;
                    com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                    zzlVar.zza(httpURLConnection, null);
                    int httpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                    zzlVar.zzc(httpURLConnection, httpUrlConnectionGetResponseCode);
                    if (httpUrlConnectionGetResponseCode < 300 || httpUrlConnectionGetResponseCode >= 400) {
                        break;
                    }
                    String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                    if (headerField == null) {
                        throw new IOException("Missing Location header in redirect");
                    }
                    if (headerField.startsWith("tel:")) {
                        break;
                    }
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (protocol == null) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Protocol is null");
                        webResourceResponse = zzae();
                        break;
                    }
                    if (!protocol.equals("http") && !protocol.equals("https")) {
                        StringBuilder sb = new StringBuilder(protocol.length() + 20);
                        sb.append("Unsupported scheme: ");
                        sb.append(protocol);
                        String sb2 = sb.toString();
                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                        webResourceResponse = zzae();
                        break;
                    }
                    StringBuilder sb3 = new StringBuilder(headerField.length() + 15);
                    sb3.append("Redirecting to ");
                    sb3.append(headerField);
                    String sb4 = sb3.toString();
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd(sb4);
                    AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                    url = url2;
                } catch (Throwable th) {
                    th = th;
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.zzt.zzc();
            String contentType = httpURLConnection.getContentType();
            String str2 = "";
            String trim = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
            com.google.android.gms.ads.internal.zzt.zzc();
            String contentType2 = httpURLConnection.getContentType();
            if (!TextUtils.isEmpty(contentType2)) {
                String[] split = contentType2.split(";");
                if (split.length != 1) {
                    int i6 = 1;
                    while (true) {
                        if (i6 >= split.length) {
                            break;
                        }
                        if (split[i6].trim().startsWith("charset")) {
                            String[] split2 = split[i6].trim().split("=");
                            if (split2.length > 1) {
                                str2 = split2[1].trim();
                                break;
                            }
                        }
                        i6++;
                    }
                }
            }
            String str3 = str2;
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            HashMap hashMap = new HashMap(headerFields.size());
            for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                    hashMap.put(entry2.getKey(), entry2.getValue().get(0));
                }
            }
            webResourceResponse = com.google.android.gms.ads.internal.zzt.zzf().zzc(trim, str3, AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection), httpURLConnection.getResponseMessage(), hashMap, AdMobNetworkBridge.urlConnectionGetInputStream(httpURLConnection));
            TrafficStats.clearThreadStatsTag();
            return webResourceResponse;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzag, reason: merged with bridge method [inline-methods] */
    public final void zzaa(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbpe) it.next()).zza(this.zza, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzah, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzY(boolean z, long j) {
        this.zza.zzu(z, j);
    }

    private static final boolean zzai(zzcki zzckiVar) {
        return zzckiVar.zzC() != null && zzckiVar.zzC().zzb();
    }

    private static final boolean zzaj(boolean z, zzcki zzckiVar) {
        return (!z || zzckiVar.zzN().zzg() || zzckiVar.zzO().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzckt;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(h.h, webView, str);
        safedk_zzckt_onLoadResource_751d7217ac7359d6afcf49a2c8da16dc(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            zzcki zzckiVar = this.zza;
            if (zzckiVar.zzX()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                zzckiVar.zzY();
                return;
            }
            this.zzC = true;
            zzcmf zzcmfVar = this.zzj;
            if (zzcmfVar != null) {
                zzcmfVar.zza();
                this.zzj = null;
            }
            zzu();
            zzcki zzckiVar2 = this.zza;
            if (zzckiVar2.zzL() != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznq)).booleanValue()) {
                    zzckiVar2.zzL().zzz(str);
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(h.h, view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzckt;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.h, webView, i, str, str2);
        safedk_zzckt_onReceivedError_d1341e8c14f30eed888eafa10c4ea7ce(webView, i, str, str2);
    }

    public void safedk_zzckt_onLoadResource_751d7217ac7359d6afcf49a2c8da16dc(WebView p0, String p1) {
        String.valueOf(p1);
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(p1)));
        Uri parse = Uri.parse(p1);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzQ(parse);
        }
    }

    public void safedk_zzckt_onReceivedError_d1341e8c14f30eed888eafa10c4ea7ce(WebView p0, int p1, String p2, String p3) {
        this.zzo = true;
        this.zzp = p1;
        this.zzq = p2;
        this.zzr = p3;
    }

    public WebResourceResponse safedk_zzckt_shouldInterceptRequest_053fe1086c21bfcb1ea787c90bdaa293(WebView p0, String p1) {
        return zzL(p1, Collections.emptyMap());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean safedk_zzckt_shouldOverrideUrlLoading_01ec883d39b107b976ba944c5c7e6e11(WebView p0, String p1) {
        String.valueOf(p1);
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(p1)));
        Uri parse = Uri.parse(p1);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzQ(parse);
        } else {
            if (this.zzn && p0 == this.zza.zzD()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzcdb zzcdbVar = this.zzb;
                        if (zzcdbVar != null) {
                            zzcdbVar.zzb(p1);
                        }
                        this.zzg = null;
                    }
                    zzdkm zzdkmVar = this.zzm;
                    if (zzdkmVar != null) {
                        zzdkmVar.zzdu();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(p0, p1);
                }
            }
            zzcki zzckiVar = this.zza;
            if (zzckiVar.zzD().willNotDraw()) {
                String.valueOf(p1);
                com.google.android.gms.ads.internal.util.client.zzo.zzi("AdWebView unable to handle URL: ".concat(String.valueOf(p1)));
            } else {
                try {
                    zzbai zzS = zzckiVar.zzS();
                    zzfkq zzT = zzckiVar.zzT();
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznu)).booleanValue() || zzT == null) {
                        if (zzS != null && zzS.zza(parse)) {
                            parse = zzS.zzd(parse, zzckiVar.getContext(), (View) zzckiVar, zzckiVar.zzj());
                        }
                    } else if (zzS != null && zzS.zza(parse)) {
                        parse = zzT.zza(parse, zzckiVar.getContext(), (View) zzckiVar, zzckiVar.zzj());
                    }
                } catch (zzbaj unused) {
                    String.valueOf(p1);
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to append parameter to URL: ".concat(String.valueOf(p1)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzy;
                if (zzbVar == null || zzbVar.zzb()) {
                    com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null);
                    zzcki zzckiVar2 = this.zza;
                    zzv(zzcVar, true, false, zzckiVar2 != null ? zzckiVar2.zzn() : "");
                } else {
                    zzbVar.zzc(p1);
                }
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzckt;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(h.h, webView, str, safedk_zzckt_shouldInterceptRequest_053fe1086c21bfcb1ea787c90bdaa293(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzckt;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_zzckt_shouldOverrideUrlLoading_01ec883d39b107b976ba944c5c7e6e11 = safedk_zzckt_shouldOverrideUrlLoading_01ec883d39b107b976ba944c5c7e6e11(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.h, webView, str, safedk_zzckt_shouldOverrideUrlLoading_01ec883d39b107b976ba944c5c7e6e11);
        return safedk_zzckt_shouldOverrideUrlLoading_01ec883d39b107b976ba944c5c7e6e11;
    }

    public final void zzA(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbxo zzbxoVar = this.zzz;
        boolean zzd = zzbxoVar != null ? zzbxoVar.zzd() : false;
        com.google.android.gms.ads.internal.zzt.zzb();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zza.getContext(), adOverlayInfoParcel, !zzd, this.zzA);
        zzcdb zzcdbVar = this.zzb;
        if (zzcdbVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzcdbVar.zzb(str);
        }
    }

    public final void zzB(String str, zzbpe zzbpeVar) {
        synchronized (this.zzf) {
            HashMap hashMap = this.zze;
            List list = (List) hashMap.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                hashMap.put(str, list);
            }
            list.add(zzbpeVar);
        }
    }

    public final void zzC(String str, zzbpe zzbpeVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbpeVar);
        }
    }

    public final void zzD(String str) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.clear();
        }
    }

    public final void zzE(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzbpe> list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzbpe zzbpeVar : list) {
                if (predicate.apply(zzbpeVar)) {
                    arrayList.add(zzbpeVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final void zzF() {
        zzcdb zzcdbVar = this.zzb;
        if (zzcdbVar != null) {
            zzcdbVar.zzf();
            this.zzb = null;
        }
        zzad();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzs = false;
            this.zzt = false;
            this.zzu = false;
            this.zzw = null;
            this.zzy = null;
            this.zzx = null;
            zzbxo zzbxoVar = this.zzz;
            if (zzbxoVar != null) {
                zzbxoVar.zzb(true);
                this.zzz = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmg
    public final void zzG(zzcme zzcmeVar) {
        this.zzi = zzcmeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmg
    public final void zzH(zzcmf zzcmfVar) {
        this.zzj = zzcmfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmg
    public final zzdyz zzI() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzcmg
    public final void zzJ(zzdbb zzdbbVar) {
        this.zzB = zzdbbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmg
    public final zzdbb zzK() {
        return this.zzB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2 A[Catch: Exception | NoClassDefFoundError -> 0x02e5, Exception -> 0x02e7, TRY_ENTER, TryCatch #12 {Exception | NoClassDefFoundError -> 0x02e5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:11:0x0036, B:13:0x0044, B:15:0x0060, B:17:0x0079, B:19:0x0090, B:20:0x0093, B:21:0x0096, B:24:0x00b2, B:26:0x00c6, B:28:0x00df, B:45:0x01b0, B:46:0x016f, B:49:0x02bb, B:51:0x02cb, B:53:0x02d1, B:55:0x02df, B:70:0x0238, B:71:0x026b, B:64:0x0206, B:66:0x013e, B:86:0x00d3, B:87:0x026c, B:89:0x0276, B:91:0x027c, B:93:0x02af), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02bb A[Catch: Exception | NoClassDefFoundError -> 0x02e5, Exception -> 0x02e7, TryCatch #12 {Exception | NoClassDefFoundError -> 0x02e5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:11:0x0036, B:13:0x0044, B:15:0x0060, B:17:0x0079, B:19:0x0090, B:20:0x0093, B:21:0x0096, B:24:0x00b2, B:26:0x00c6, B:28:0x00df, B:45:0x01b0, B:46:0x016f, B:49:0x02bb, B:51:0x02cb, B:53:0x02d1, B:55:0x02df, B:70:0x0238, B:71:0x026b, B:64:0x0206, B:66:0x013e, B:86:0x00d3, B:87:0x026c, B:89:0x0276, B:91:0x027c, B:93:0x02af), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02d1 A[Catch: Exception | NoClassDefFoundError -> 0x02e5, Exception -> 0x02e7, TryCatch #12 {Exception | NoClassDefFoundError -> 0x02e5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:11:0x0036, B:13:0x0044, B:15:0x0060, B:17:0x0079, B:19:0x0090, B:20:0x0093, B:21:0x0096, B:24:0x00b2, B:26:0x00c6, B:28:0x00df, B:45:0x01b0, B:46:0x016f, B:49:0x02bb, B:51:0x02cb, B:53:0x02d1, B:55:0x02df, B:70:0x0238, B:71:0x026b, B:64:0x0206, B:66:0x013e, B:86:0x00d3, B:87:0x026c, B:89:0x0276, B:91:0x027c, B:93:0x02af), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fb A[Catch: all -> 0x01e1, TryCatch #3 {all -> 0x01e1, blocks: (B:41:0x018c, B:43:0x019e, B:44:0x01a5, B:60:0x01e9, B:62:0x01fb, B:63:0x0202), top: B:27:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x026c A[Catch: Exception | NoClassDefFoundError -> 0x02e5, Exception -> 0x02e7, TryCatch #12 {Exception | NoClassDefFoundError -> 0x02e5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:11:0x0036, B:13:0x0044, B:15:0x0060, B:17:0x0079, B:19:0x0090, B:20:0x0093, B:21:0x0096, B:24:0x00b2, B:26:0x00c6, B:28:0x00df, B:45:0x01b0, B:46:0x016f, B:49:0x02bb, B:51:0x02cb, B:53:0x02d1, B:55:0x02df, B:70:0x0238, B:71:0x026b, B:64:0x0206, B:66:0x013e, B:86:0x00d3, B:87:0x026c, B:89:0x0276, B:91:0x027c, B:93:0x02af), top: B:2:0x000c }] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final WebResourceResponse zzL(String str, Map map) {
        WebResourceResponse webResourceResponse;
        int i;
        InputStream inputStream;
        InputStream zzb;
        final boolean z;
        final boolean z2;
        String sb;
        try {
            Map hashMap = new HashMap();
            zzcki zzckiVar = this.zza;
            if (zzckiVar.zzC() != null) {
                hashMap = zzckiVar.zzC().zzaw;
            }
            String zza = zzcdp.zza(str, zzckiVar.getContext(), this.zzF, hashMap);
            if (!zza.equals(str)) {
                return zzaf(zza, map);
            }
            Parcelable.Creator<zzbgp> creator = zzbgp.CREATOR;
            zzbgp zza2 = zzbgp.zza(Uri.parse(str));
            if (zza2 != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
                Uri parse = Uri.parse(str);
                if (parse.getQueryParameterNames().contains("range")) {
                    List zze = zzgtl.zza(zzgsk.zzc('-')).zze(parse.getQueryParameter("range"));
                    if (zze.size() == 2) {
                        int parseInt = Integer.parseInt((String) zze.get(0));
                        int parseInt2 = Integer.parseInt((String) zze.get(1)) + 1;
                        if (parseInt > 0) {
                            zza2.zzh = parseInt;
                        }
                        i = parseInt2 - parseInt;
                        final boolean z3 = "X-Afma-Gcache-CachedBytes";
                        webResourceResponse = null;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfk)).booleanValue()) {
                            zzbgm zzc2 = com.google.android.gms.ads.internal.zzt.zzj().zzc(zza2);
                            if (zzc2 == null || !zzc2.zza()) {
                                inputStream = null;
                                if (inputStream != null) {
                                    return new WebResourceResponse("", "", 200, "OK", hashMap2, inputStream);
                                }
                            } else {
                                hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzc2.zzd()));
                                hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzc2.zzg()));
                                hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzc2.zze()));
                                hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(zzc2.zzf()));
                                zzb = zzc2.zzb();
                                if (i != -1) {
                                    zzb = zzgyz.zzb(zzb, i);
                                }
                            }
                        } else {
                            zza2.zzi = zzgtn.zza(zzckiVar.zzn());
                            zza2.zzj = zzckiVar.zzp();
                            try {
                                long longValue = (zza2.zzg ? (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfm) : (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfl)).longValue();
                                long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                                com.google.android.gms.ads.internal.zzt.zzz();
                                Future zza3 = zzbha.zza(zzckiVar.getContext(), zza2);
                                try {
                                    zzbhb zzbhbVar = (zzbhb) zza3.get(longValue, TimeUnit.MILLISECONDS);
                                    try {
                                        try {
                                            hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbhbVar.zzc()));
                                            hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbhbVar.zzd()));
                                            hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbhbVar.zzf()));
                                            hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbhbVar.zze()));
                                            zzb = zzbhbVar.zzb();
                                            if (i != -1) {
                                                try {
                                                    zzb = zzgyz.zzb(zzb, i);
                                                } catch (InterruptedException e) {
                                                    e = e;
                                                    z2 = true;
                                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfp)).booleanValue()) {
                                                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewClient.interceptRequest.gcache");
                                                    }
                                                    zza3.cancel(true);
                                                    Thread.currentThread().interrupt();
                                                    final long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckn
                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            zzckt.this.zzX(z2, elapsedRealtime2);
                                                        }
                                                    });
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(elapsedRealtime2).length() + 24);
                                                    sb2.append("Cache connection took ");
                                                    sb2.append(elapsedRealtime2);
                                                    sb2.append("ms");
                                                    sb = sb2.toString();
                                                    com.google.android.gms.ads.internal.util.zze.zza(sb);
                                                    inputStream = zzb;
                                                    if (inputStream != null) {
                                                    }
                                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                                    }
                                                } catch (ExecutionException e2) {
                                                    e = e2;
                                                    z = true;
                                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfp)).booleanValue()) {
                                                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewClient.interceptRequest.gcache");
                                                    }
                                                    zza3.cancel(true);
                                                    final long elapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckm
                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            zzckt.this.zzW(z, elapsedRealtime3);
                                                        }
                                                    });
                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(elapsedRealtime3).length() + 24);
                                                    sb3.append("Cache connection took ");
                                                    sb3.append(elapsedRealtime3);
                                                    sb3.append("ms");
                                                    sb = sb3.toString();
                                                    com.google.android.gms.ads.internal.util.zze.zza(sb);
                                                    inputStream = zzb;
                                                    if (inputStream != null) {
                                                    }
                                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                                    }
                                                } catch (TimeoutException e3) {
                                                    e = e3;
                                                    z = true;
                                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfp)).booleanValue()) {
                                                    }
                                                    zza3.cancel(true);
                                                    final long elapsedRealtime32 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckm
                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            zzckt.this.zzW(z, elapsedRealtime32);
                                                        }
                                                    });
                                                    StringBuilder sb32 = new StringBuilder(String.valueOf(elapsedRealtime32).length() + 24);
                                                    sb32.append("Cache connection took ");
                                                    sb32.append(elapsedRealtime32);
                                                    sb32.append("ms");
                                                    sb = sb32.toString();
                                                    com.google.android.gms.ads.internal.util.zze.zza(sb);
                                                    inputStream = zzb;
                                                    if (inputStream != null) {
                                                    }
                                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                                    }
                                                }
                                            }
                                            final long elapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                            final boolean z4 = true;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(z4, elapsedRealtime4) { // from class: com.google.android.gms.internal.ads.zzckl
                                                private final /* synthetic */ long zzb;

                                                {
                                                    this.zzb = elapsedRealtime4;
                                                }

                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    zzckt.this.zzV(true, this.zzb);
                                                }
                                            });
                                            StringBuilder sb4 = new StringBuilder(String.valueOf(elapsedRealtime4).length() + 24);
                                            sb4.append("Cache connection took ");
                                            sb4.append(elapsedRealtime4);
                                            sb4.append("ms");
                                            sb = sb4.toString();
                                        } catch (Throwable th) {
                                            th = th;
                                            z3 = 1;
                                            final long elapsedRealtime5 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcko
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    zzckt.this.zzY(z3, elapsedRealtime5);
                                                }
                                            });
                                            StringBuilder sb5 = new StringBuilder(String.valueOf(elapsedRealtime5).length() + 24);
                                            sb5.append("Cache connection took ");
                                            sb5.append(elapsedRealtime5);
                                            sb5.append("ms");
                                            com.google.android.gms.ads.internal.util.zze.zza(sb5.toString());
                                            throw th;
                                        }
                                    } catch (InterruptedException e4) {
                                        e = e4;
                                        zzb = null;
                                    } catch (ExecutionException e5) {
                                        e = e5;
                                        zzb = null;
                                        z = true;
                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfp)).booleanValue()) {
                                        }
                                        zza3.cancel(true);
                                        final long elapsedRealtime322 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckm
                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                zzckt.this.zzW(z, elapsedRealtime322);
                                            }
                                        });
                                        StringBuilder sb322 = new StringBuilder(String.valueOf(elapsedRealtime322).length() + 24);
                                        sb322.append("Cache connection took ");
                                        sb322.append(elapsedRealtime322);
                                        sb322.append("ms");
                                        sb = sb322.toString();
                                        com.google.android.gms.ads.internal.util.zze.zza(sb);
                                        inputStream = zzb;
                                        if (inputStream != null) {
                                        }
                                        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                        }
                                    } catch (TimeoutException e6) {
                                        e = e6;
                                        zzb = null;
                                        z = true;
                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfp)).booleanValue()) {
                                        }
                                        zza3.cancel(true);
                                        final long elapsedRealtime3222 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckm
                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                zzckt.this.zzW(z, elapsedRealtime3222);
                                            }
                                        });
                                        StringBuilder sb3222 = new StringBuilder(String.valueOf(elapsedRealtime3222).length() + 24);
                                        sb3222.append("Cache connection took ");
                                        sb3222.append(elapsedRealtime3222);
                                        sb3222.append("ms");
                                        sb = sb3222.toString();
                                        com.google.android.gms.ads.internal.util.zze.zza(sb);
                                        inputStream = zzb;
                                        if (inputStream != null) {
                                        }
                                        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                        }
                                    }
                                } catch (InterruptedException e7) {
                                    e = e7;
                                    zzb = null;
                                    z2 = false;
                                } catch (ExecutionException e8) {
                                    e = e8;
                                    zzb = null;
                                    z = false;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfp)).booleanValue()) {
                                    }
                                    zza3.cancel(true);
                                    final long elapsedRealtime32222 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckm
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            zzckt.this.zzW(z, elapsedRealtime32222);
                                        }
                                    });
                                    StringBuilder sb32222 = new StringBuilder(String.valueOf(elapsedRealtime32222).length() + 24);
                                    sb32222.append("Cache connection took ");
                                    sb32222.append(elapsedRealtime32222);
                                    sb32222.append("ms");
                                    sb = sb32222.toString();
                                    com.google.android.gms.ads.internal.util.zze.zza(sb);
                                    inputStream = zzb;
                                    if (inputStream != null) {
                                    }
                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                    }
                                } catch (TimeoutException e9) {
                                    e = e9;
                                    zzb = null;
                                    z = false;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfp)).booleanValue()) {
                                    }
                                    zza3.cancel(true);
                                    final long elapsedRealtime322222 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckm
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            zzckt.this.zzW(z, elapsedRealtime322222);
                                        }
                                    });
                                    StringBuilder sb322222 = new StringBuilder(String.valueOf(elapsedRealtime322222).length() + 24);
                                    sb322222.append("Cache connection took ");
                                    sb322222.append(elapsedRealtime322222);
                                    sb322222.append("ms");
                                    sb = sb322222.toString();
                                    com.google.android.gms.ads.internal.util.zze.zza(sb);
                                    inputStream = zzb;
                                    if (inputStream != null) {
                                    }
                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    z3 = 0;
                                }
                                com.google.android.gms.ads.internal.util.zze.zza(sb);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        inputStream = zzb;
                        if (inputStream != null) {
                        }
                    }
                }
                i = -1;
                final boolean z32 = "X-Afma-Gcache-CachedBytes";
                webResourceResponse = null;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfk)).booleanValue()) {
                }
                inputStream = zzb;
                if (inputStream != null) {
                }
            } else {
                webResourceResponse = null;
            }
            return (com.google.android.gms.ads.internal.util.client.zzl.zzj() || !((Boolean) zzbka.zzb.zze()).booleanValue()) ? webResourceResponse : zzaf(str, map);
        } catch (Exception | NoClassDefFoundError e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdWebViewClient.interceptRequest");
            return zzae();
        }
    }

    public final void zzM(boolean z) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcmg
    public final void zzN() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcff.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcki zzckiVar = zzckt.this.zza;
                    zzckiVar.zzah();
                    com.google.android.gms.ads.internal.overlay.zzm zzL = zzckiVar.zzL();
                    if (zzL != null) {
                        zzL.zzv();
                    }
                }
            });
        }
    }

    public final void zzO(boolean z) {
        this.zzF = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcmg
    public final void zzP(int i, int i2) {
        zzbxo zzbxoVar = this.zzz;
        if (zzbxoVar != null) {
            zzbxoVar.zze(i, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmg
    public final void zzQ(Uri uri) {
        String valueOf = String.valueOf(uri);
        String.valueOf(valueOf);
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(String.valueOf(valueOf)));
        HashMap hashMap = this.zze;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path == null || list == null) {
            String valueOf2 = String.valueOf(uri);
            String.valueOf(valueOf2);
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(valueOf2)));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhH)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzh().zza() == null) {
                return;
            }
            final String substring = (path == null || path.length() < 2) ? AbstractJsonLexerKt.NULL : path.substring(1);
            zzcff.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i = zzckt.zzc;
                    com.google.android.gms.ads.internal.zzt.zzh().zza().zze(substring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgG)).booleanValue() && this.zzG.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgI)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzhbi.zzr(com.google.android.gms.ads.internal.zzt.zzc().zzf(uri), new zzckk(this, list, path, uri), zzcff.zzf);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        zzaa(com.google.android.gms.ads.internal.util.zzs.zzT(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzcmg
    public final void zzR(boolean z) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmg
    public final void zzS(boolean z) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmg
    public final void zzT(boolean z) {
        synchronized (this.zzf) {
            this.zzv = z;
        }
    }

    final /* synthetic */ void zzU(View view, zzcdb zzcdbVar, int i) {
        zzac(view, zzcdbVar, i - 1);
    }

    final /* synthetic */ void zzV(boolean z, long j) {
        zzY(true, j);
    }

    final /* synthetic */ void zzZ(View view, zzcdb zzcdbVar, int i) {
        zzac(view, zzcdbVar, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzcmg
    public final void zza(int i, int i2, boolean z) {
        zzbxt zzbxtVar = this.zzx;
        if (zzbxtVar != null) {
            zzbxtVar.zzb(i, i2);
        }
        zzbxo zzbxoVar = this.zzz;
        if (zzbxoVar != null) {
            zzbxoVar.zzc(i, i2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmg
    public final void zzab(com.google.android.gms.ads.internal.client.zza zzaVar, zzbnu zzbnuVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbnw zzbnwVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, boolean z, zzbph zzbphVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbxv zzbxvVar, zzcdb zzcdbVar, zzeju zzejuVar, zzfro zzfroVar, zzdyz zzdyzVar, zzbpz zzbpzVar, zzdkm zzdkmVar, zzbpy zzbpyVar, zzbps zzbpsVar, zzbpf zzbpfVar, zzcsx zzcsxVar, zzeac zzeacVar, zzdbg zzdbgVar, zzdbb zzdbbVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zza.getContext(), zzcdbVar, null) : zzbVar;
        zzcki zzckiVar = this.zza;
        this.zzz = new zzbxo(zzckiVar, zzbxvVar);
        this.zzb = zzcdbVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbE)).booleanValue()) {
            zzB("/adMetadata", new zzbnt(zzbnuVar));
        }
        if (zzbnwVar != null) {
            zzB("/appEvent", new zzbnv(zzbnwVar));
        }
        zzB("/backButton", zzbpd.zzj);
        zzB("/refresh", zzbpd.zzk);
        zzB("/canOpenApp", zzbpd.zzb);
        zzB("/canOpenURLs", zzbpd.zza);
        zzB("/canOpenIntents", zzbpd.zzc);
        zzB("/close", zzbpd.zzd);
        zzB("/customClose", zzbpd.zze);
        zzB("/instrument", zzbpd.zzn);
        zzB("/delayPageLoaded", zzbpd.zzp);
        zzB("/delayPageClosed", zzbpd.zzq);
        zzB("/getLocationInfo", zzbpd.zzr);
        zzB("/log", zzbpd.zzg);
        zzB("/mraid", new zzbpl(zzbVar2, this.zzz, zzbxvVar));
        zzbxt zzbxtVar = this.zzx;
        if (zzbxtVar != null) {
            zzB("/mraidLoaded", zzbxtVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzB("/open", new zzbpr(zzbVar3, this.zzz, zzejuVar, zzdyzVar, zzcsxVar, zzdbgVar));
        zzB("/precache", new zzcip());
        zzB("/touch", zzbpd.zzi);
        zzB("/video", zzbpd.zzl);
        zzB("/videoMeta", zzbpd.zzm);
        if (zzejuVar == null || zzfroVar == null) {
            zzB("/click", zzbpd.zzb(zzdkmVar, zzcsxVar));
            zzB("/httpTrack", zzbpd.zzf);
        } else {
            zzB("/click", zzfkx.zza(zzejuVar, zzfroVar, zzcsxVar, zzdkmVar));
            zzB("/httpTrack", zzfkx.zzb(zzejuVar, zzfroVar));
        }
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzckiVar.getContext())) {
            Map hashMap = new HashMap();
            if (zzckiVar.zzC() != null) {
                hashMap = zzckiVar.zzC().zzaw;
            }
            zzB("/logScionEvent", new zzbpk(zzckiVar.getContext(), hashMap));
        }
        if (zzbphVar != null) {
            zzB("/setInterstitialProperties", new zzbpg(zzbphVar));
        }
        if (zzbpzVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkm)).booleanValue()) {
                zzB("/inspectorNetworkExtras", zzbpzVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkF)).booleanValue() && zzbpyVar != null) {
            zzB("/shareSheet", zzbpyVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziK)).booleanValue() && zzeacVar != null) {
            zzB("/onDeviceStorageEvent", new zzbpm(zzeacVar));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkK)).booleanValue() && zzbpsVar != null) {
            zzB("/inspectorOutOfContextTest", zzbpsVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkP)).booleanValue() && zzbpfVar != null) {
            zzB("/inspectorStorage", zzbpfVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmV)).booleanValue()) {
            zzB("/bindPlayStoreOverlay", zzbpd.zzu);
            zzB("/presentPlayStoreOverlay", zzbpd.zzv);
            zzB("/expandPlayStoreOverlay", zzbpd.zzw);
            zzB("/collapsePlayStoreOverlay", zzbpd.zzx);
            zzB("/closePlayStoreOverlay", zzbpd.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzej)).booleanValue()) {
            zzB("/setPAIDPersonalizationEnabled", zzbpd.zzA);
            zzB("/resetPAID", zzbpd.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznp)).booleanValue() && zzckiVar.zzC() != null && zzckiVar.zzC().zzar) {
            zzB("/writeToLocalStorage", zzbpd.zzB);
            zzB("/clearLocalStorageKeys", zzbpd.zzC);
        }
        this.zzg = zzaVar;
        this.zzh = zzrVar;
        this.zzk = zzbnuVar;
        this.zzl = zzbnwVar;
        this.zzw = zzadVar;
        this.zzy = zzbVar3;
        this.zzm = zzdkmVar;
        this.zzA = zzdyzVar;
        this.zzB = zzdbbVar;
        this.zzn = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcmg
    public final void zzb(zzfjt zzfjtVar) {
        zzcki zzckiVar = this.zza;
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzckiVar.getContext())) {
            zzD("/logScionEvent");
            new HashMap();
            zzB("/logScionEvent", new zzbpk(zzckiVar.getContext(), zzfjtVar.zzaw));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmg
    public final void zzc(zzcsx zzcsxVar) {
        zzD("/click");
        zzB("/click", zzbpd.zzb(this.zzm, zzcsxVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcmg
    public final void zzd(zzcsx zzcsxVar, zzeju zzejuVar, zzfro zzfroVar) {
        zzD("/click");
        if (zzejuVar == null || zzfroVar == null) {
            zzB("/click", zzbpd.zzb(this.zzm, zzcsxVar));
        } else {
            zzB("/click", zzfkx.zza(zzejuVar, zzfroVar, zzcsxVar, this.zzm));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final void zzdR() {
        zzdkm zzdkmVar = this.zzm;
        if (zzdkmVar != null) {
            zzdkmVar.zzdR();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final void zzdu() {
        zzdkm zzdkmVar = this.zzm;
        if (zzdkmVar != null) {
            zzdkmVar.zzdu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmg
    public final void zze(zzcsx zzcsxVar, zzeju zzejuVar, zzdyz zzdyzVar) {
        zzD("/open");
        zzB("/open", new zzbpr(this.zzy, this.zzz, zzejuVar, zzdyzVar, zzcsxVar, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcmg
    public final com.google.android.gms.ads.internal.zzb zzh() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzcmg
    public final void zzi(com.google.android.gms.ads.internal.zzb zzbVar) {
        this.zzy = zzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmg
    public final void zzj(zzcdb zzcdbVar) {
        this.zzb = zzcdbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmg
    public final boolean zzk() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzs;
        }
        return z;
    }

    public final boolean zzl() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzt;
        }
        return z;
    }

    public final boolean zzm() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzu;
        }
        return z;
    }

    public final boolean zzn() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzv;
        }
        return z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zzo() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzp() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzcmg
    public final void zzq() {
        zzcdb zzcdbVar = this.zzb;
        if (zzcdbVar != null) {
            zzcki zzckiVar = this.zza;
            WebView zzD = zzckiVar.zzD();
            if (ViewCompat.isAttachedToWindow(zzD)) {
                zzac(zzD, zzcdbVar, 10);
                return;
            }
            zzad();
            zzckj zzckjVar = new zzckj(this, zzcdbVar);
            this.zzI = zzckjVar;
            ((View) zzckiVar).addOnAttachStateChangeListener(zzckjVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmg
    public final void zzr() {
        synchronized (this.zzf) {
        }
        this.zzE++;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcmg
    public final void zzs() {
        this.zzE--;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcmg
    public final void zzt() {
        zzbhd zzbhdVar = this.zzd;
        if (zzbhdVar != null) {
            zzbhdVar.zzc(10005);
        }
        this.zzD = true;
        this.zzp = GamesActivityResultCodes.RESULT_APP_MISCONFIGURED;
        this.zzq = "Page loaded delay cancel.";
        zzu();
        this.zza.destroy();
    }

    public final void zzu() {
        if (this.zzi != null && ((this.zzC && this.zzE <= 0) || this.zzD || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcB)).booleanValue()) {
                zzcki zzckiVar = this.zza;
                if (zzckiVar.zzq() != null) {
                    zzbil.zza(zzckiVar.zzq().zzc(), zzckiVar.zzi(), "awfllc");
                }
            }
            this.zzi.zza((this.zzD || this.zzo) ? false : true, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zza.zzap();
    }

    public final void zzv(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, String str) {
        boolean z3;
        zzcki zzckiVar = this.zza;
        boolean zzW = zzckiVar.zzW();
        boolean z4 = false;
        boolean z5 = zzaj(zzW, zzckiVar) || z2;
        if (z5 || !z) {
            z3 = zzW;
            z4 = true;
        } else {
            z3 = zzW;
        }
        zzA(new AdOverlayInfoParcel(zzcVar, z5 ? null : this.zzg, z3 ? null : this.zzh, this.zzw, zzckiVar.zzs(), zzckiVar, z4 ? null : this.zzm, str));
    }

    public final void zzw(String str, String str2, int i) {
        zzekf zzekfVar = this.zzH;
        zzcki zzckiVar = this.zza;
        zzA(new AdOverlayInfoParcel(zzckiVar, zzckiVar.zzs(), str, str2, 14, zzekfVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.gms.internal.ads.zzbyi] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public final void zzx(boolean z, int i, boolean z2) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzdkm zzdkmVar;
        ?? r9;
        int i2;
        com.google.android.gms.ads.internal.client.zza zzaVar2;
        boolean z3;
        zzcki zzckiVar = this.zza;
        boolean zzaj = zzaj(zzckiVar.zzW(), zzckiVar);
        boolean z4 = true;
        if (!zzaj && z2) {
            z4 = false;
        }
        if (zzaj) {
            zzaVar = null;
            zzdkmVar = null;
        } else {
            zzaVar = this.zzg;
            zzdkmVar = null;
        }
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzh;
        zzdkm zzdkmVar2 = zzdkmVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel zzs = zzckiVar.zzs();
        zzdkm zzdkmVar3 = z4 ? zzdkmVar2 : this.zzm;
        if (zzai(zzckiVar)) {
            r9 = this.zzH;
            z3 = z;
            i2 = i;
            zzaVar2 = zzaVar;
        } else {
            r9 = zzdkmVar2;
            i2 = i;
            zzaVar2 = zzaVar;
            z3 = z;
        }
        zzA(new AdOverlayInfoParcel(zzaVar2, zzrVar, zzadVar, zzckiVar, z3, i2, zzs, zzdkmVar3, r9));
    }

    public final void zzy(boolean z, int i, String str, boolean z2, boolean z3) {
        zzcki zzckiVar = this.zza;
        boolean zzW = zzckiVar.zzW();
        boolean zzaj = zzaj(zzW, zzckiVar);
        boolean z4 = true;
        if (!zzaj && z2) {
            z4 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzaj ? null : this.zzg;
        zzcks zzcksVar = zzW ? null : new zzcks(zzckiVar, this.zzh);
        zzbnu zzbnuVar = this.zzk;
        zzekf zzekfVar = null;
        zzbnw zzbnwVar = this.zzl;
        boolean z5 = z4;
        zzcks zzcksVar2 = zzcksVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel zzs = zzckiVar.zzs();
        zzdkm zzdkmVar = z5 ? null : this.zzm;
        if (zzai(zzckiVar)) {
            zzekfVar = this.zzH;
        }
        zzA(new AdOverlayInfoParcel(zzaVar, zzcksVar2, zzbnuVar, zzbnwVar, zzadVar, zzckiVar, z, i, str, zzs, zzdkmVar, zzekfVar, z3));
    }

    public final void zzz(boolean z, int i, String str, String str2, boolean z2) {
        zzcki zzckiVar = this.zza;
        boolean zzW = zzckiVar.zzW();
        boolean zzaj = zzaj(zzW, zzckiVar);
        boolean z3 = true;
        if (!zzaj && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzaj ? null : this.zzg;
        zzcks zzcksVar = zzW ? null : new zzcks(zzckiVar, this.zzh);
        zzbnu zzbnuVar = this.zzk;
        zzekf zzekfVar = null;
        zzbnw zzbnwVar = this.zzl;
        boolean z4 = z3;
        zzcks zzcksVar2 = zzcksVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel zzs = zzckiVar.zzs();
        zzdkm zzdkmVar = z4 ? null : this.zzm;
        if (zzai(zzckiVar)) {
            zzekfVar = this.zzH;
        }
        zzA(new AdOverlayInfoParcel(zzaVar, zzcksVar2, zzbnuVar, zzbnwVar, zzadVar, zzckiVar, z, i, str, str2, zzs, zzdkmVar, zzekfVar));
    }
}
