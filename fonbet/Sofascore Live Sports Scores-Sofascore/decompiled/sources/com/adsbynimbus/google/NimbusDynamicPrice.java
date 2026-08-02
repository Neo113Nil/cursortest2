package com.adsbynimbus.google;

import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.mbridge.msdk.foundation.controller.a;
import defpackage.cf5;
import defpackage.cjb;
import defpackage.cp;
import defpackage.iub;
import defpackage.l0g;
import defpackage.qcd;
import defpackage.u09;
import defpackage.wcd;
import defpackage.wx4;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001:\u0001-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010,\u001a\u0004\u0018\u00010\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/adsbynimbus/google/NimbusDynamicPrice;", "Ll0g;", "Lcom/google/android/gms/ads/admanager/AdManagerAdRequest$Builder;", "target", "Lcom/adsbynimbus/google/NimbusDynamicPrice$Listener;", "callback", "<init>", "(Lcom/google/android/gms/ads/admanager/AdManagerAdRequest$Builder;Lcom/adsbynimbus/google/NimbusDynamicPrice$Listener;)V", "Liub;", "mapping", "withMapping", "(Liub;)Lcom/adsbynimbus/google/NimbusDynamicPrice;", "listener", "withRequestListener", "(Ll0g;)Lcom/adsbynimbus/google/NimbusDynamicPrice;", "Lwcd;", "nimbusResponse", "", "onAdResponse", "(Lwcd;)V", "Lqcd;", "error", "onError", "(Lqcd;)V", "a", "Lcom/google/android/gms/ads/admanager/AdManagerAdRequest$Builder;", "getTarget", "()Lcom/google/android/gms/ads/admanager/AdManagerAdRequest$Builder;", "b", "Lcom/adsbynimbus/google/NimbusDynamicPrice$Listener;", "getCallback", "()Lcom/adsbynimbus/google/NimbusDynamicPrice$Listener;", a.q, "Liub;", "getMapping", "()Liub;", "setMapping", "(Liub;)V", "d", "Ll0g;", "getRequestListener", "()Ll0g;", "setRequestListener", "(Ll0g;)V", "requestListener", "Listener", "google_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@wx4
/* loaded from: classes.dex */
public final class NimbusDynamicPrice implements l0g {

    /* renamed from: a, reason: from kotlin metadata */
    public final AdManagerAdRequest.Builder target;

    /* renamed from: b, reason: from kotlin metadata */
    public final Listener callback;

    /* renamed from: c, reason: from kotlin metadata */
    public iub mapping;

    /* renamed from: d, reason: from kotlin metadata */
    public l0g requestListener;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/adsbynimbus/google/NimbusDynamicPrice$Listener;", "", "onDynamicPriceReady", "", "builder", "Lcom/google/android/gms/ads/admanager/AdManagerAdRequest$Builder;", "google_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Listener {
        void onDynamicPriceReady(@NotNull AdManagerAdRequest.Builder builder);
    }

    public NimbusDynamicPrice(@NotNull AdManagerAdRequest.Builder builder, @NotNull Listener listener) {
        builder.getClass();
        listener.getClass();
        this.target = builder;
        this.callback = listener;
    }

    @NotNull
    public final Listener getCallback() {
        return this.callback;
    }

    @Nullable
    public final iub getMapping() {
        return this.mapping;
    }

    @Nullable
    public final l0g getRequestListener() {
        return this.requestListener;
    }

    @NotNull
    public final AdManagerAdRequest.Builder getTarget() {
        return this.target;
    }

    @Override // defpackage.vcd
    public void onAdResponse(@NotNull wcd nimbusResponse) {
        nimbusResponse.getClass();
        l0g l0gVar = this.requestListener;
        if (l0gVar != null) {
            l0gVar.onAdResponse(nimbusResponse);
        }
        cjb.a("Applying Nimbus Dynamic Price targeting");
        iub iubVar = this.mapping;
        if (iubVar == null) {
            cp cpVar = cf5.a;
            iubVar = nimbusResponse.i() ? cf5.b : cf5.a;
        }
        AdManagerAdRequest.Builder builder = this.target;
        u09.a(builder, nimbusResponse, iubVar);
        this.callback.onDynamicPriceReady(builder);
    }

    @Override // defpackage.l0g, defpackage.pcd
    public void onError(@NotNull qcd error) {
        error.getClass();
        if (error.a == 2) {
            cjb.a("No bid for dynamic price request");
        }
        l0g l0gVar = this.requestListener;
        if (l0gVar != null) {
            l0gVar.onError(error);
        }
        this.callback.onDynamicPriceReady(this.target);
    }

    public final void setMapping(@Nullable iub iubVar) {
        this.mapping = iubVar;
    }

    public final void setRequestListener(@Nullable l0g l0gVar) {
        this.requestListener = l0gVar;
    }

    @NotNull
    public final NimbusDynamicPrice withMapping(@NotNull iub mapping) {
        mapping.getClass();
        this.mapping = mapping;
        return this;
    }

    @NotNull
    public final NimbusDynamicPrice withRequestListener(@NotNull l0g listener) {
        listener.getClass();
        this.requestListener = listener;
        return this;
    }
}
