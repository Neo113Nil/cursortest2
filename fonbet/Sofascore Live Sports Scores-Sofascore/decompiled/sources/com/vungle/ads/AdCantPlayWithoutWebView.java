package com.vungle.ads;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.iab.omid.library.vungle.d;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/AdCantPlayWithoutWebView;", "Lcom/vungle/ads/VungleError;", PglCryptUtils.KEY_MESSAGE, "", "(Ljava/lang/String;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class AdCantPlayWithoutWebView extends VungleError {
    public AdCantPlayWithoutWebView(@Nullable String str) {
        super(Sdk.SDKError.Reason.WEBVIEW_ERROR, d.a("No WebView when playing ads. ", str), null);
    }

    public /* synthetic */ AdCantPlayWithoutWebView(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdCantPlayWithoutWebView() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
