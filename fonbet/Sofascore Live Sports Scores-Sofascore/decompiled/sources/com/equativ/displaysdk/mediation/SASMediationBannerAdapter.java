package com.equativ.displaysdk.mediation;

import android.content.Context;
import com.ironsource.Nf;
import defpackage.oeg;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\u0014J5\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/equativ/displaysdk/mediation/SASMediationBannerAdapter;", "", "Landroid/content/Context;", "context", "", "serverSideParametersString", "", "clientSideParameters", "", "loadAd", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V", "onDestroy", "()V", "getSdkName", "()Ljava/lang/String;", "sdkName", "getSdkVersion", "sdkVersion", "getAdapterVersion", Nf.b, "Loeg;", "getAdapterListener", "()Loeg;", "setAdapterListener", "(Loeg;)V", "adapterListener", "smart-display-sdk_prodRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SASMediationBannerAdapter {
    @Nullable
    oeg getAdapterListener();

    @NotNull
    String getAdapterVersion();

    @NotNull
    String getSdkName();

    @NotNull
    String getSdkVersion();

    void loadAd(@NotNull Context context, @NotNull String serverSideParametersString, @Nullable Map<String, ? extends Object> clientSideParameters);

    void onDestroy();

    void setAdapterListener(@Nullable oeg oegVar);
}
