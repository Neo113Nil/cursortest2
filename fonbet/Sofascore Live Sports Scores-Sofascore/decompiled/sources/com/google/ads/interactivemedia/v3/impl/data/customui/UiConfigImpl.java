package com.google.ads.interactivemedia.v3.impl.data.customui;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.b2p;
import defpackage.b9k;
import defpackage.d9k;
import defpackage.g9k;
import defpackage.i9k;
import defpackage.j9k;
import defpackage.l9k;
import defpackage.u1p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class UiConfigImpl {
    private b2p adTitle;
    private b2p attribution;
    private b2p authorIcon;
    private b2p authorName;
    private b2p callToAction;
    private b2p icons;
    private b2p skip;
    private b2p videoOverlay;

    public UiConfigImpl(b2p b2pVar, b2p b2pVar2, b2p b2pVar3, b2p b2pVar4, b2p b2pVar5, b2p b2pVar6, b2p b2pVar7, b2p b2pVar8) {
        u1p u1pVar = u1p.a;
        this.videoOverlay = b2pVar;
        this.callToAction = b2pVar2;
        this.attribution = b2pVar3;
        this.skip = b2pVar4;
        this.icons = b2pVar5;
        this.adTitle = b2pVar6;
        this.authorIcon = b2pVar7;
        this.authorName = b2pVar8;
    }

    @NonNull
    public static UiConfigImpl createFromJavaScriptMessage(@NonNull JavaScriptUiConfigData javaScriptUiConfigData) {
        return new UiConfigImpl(b2p.l(javaScriptUiConfigData.videoOverlay()).j(zzc.zza), b2p.l(javaScriptUiConfigData.callToAction()).j(zza.zza), b2p.l(javaScriptUiConfigData.attribution()).j(zze.zza), b2p.l(javaScriptUiConfigData.skip()).j(zzh.zza), b2p.l(javaScriptUiConfigData.icons()).j(zzb.zza), b2p.l(javaScriptUiConfigData.adTitle()).j(zzg.zza), b2p.l(javaScriptUiConfigData.authorIcon()).j(zzd.zza), b2p.l(javaScriptUiConfigData.authorName()).j(zzf.zza));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$createFromJavaScriptMessage$0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(UiVastIconImpl.createFromJavaScriptMessage((JavaScriptUiVastIconData) it.next()));
        }
        return arrayList;
    }

    @Nullable
    public j9k getAdTitle() {
        return (j9k) this.adTitle.i();
    }

    @Nullable
    public i9k getAttribution() {
        return (i9k) this.attribution.i();
    }

    @Nullable
    public g9k getAuthorIcon() {
        return (g9k) this.authorIcon.i();
    }

    @Nullable
    public j9k getAuthorName() {
        return (j9k) this.authorName.i();
    }

    @Nullable
    public b9k getCallToAction() {
        return (b9k) this.callToAction.i();
    }

    @Nullable
    public List<Object> getIcons() {
        return (List) this.icons.i();
    }

    @Nullable
    public l9k getSkip() {
        return (l9k) this.skip.i();
    }

    @Nullable
    public d9k getVideoOverlay() {
        return (d9k) this.videoOverlay.i();
    }

    public void setAdTitle(@NonNull j9k j9kVar) {
        this.adTitle = b2p.k(j9kVar);
    }

    public void setAttribution(@NonNull i9k i9kVar) {
        this.attribution = b2p.k(i9kVar);
    }

    public void setAuthorIcon(@NonNull g9k g9kVar) {
        this.authorIcon = b2p.k(g9kVar);
    }

    public void setAuthorName(@NonNull j9k j9kVar) {
        this.authorName = b2p.k(j9kVar);
    }

    public void setCallToAction(@NonNull b9k b9kVar) {
        this.callToAction = b2p.k(b9kVar);
    }

    public void setIcons(@NonNull List<Object> list) {
        this.icons = b2p.k(list);
    }

    public void setSkip(@NonNull l9k l9kVar) {
        this.skip = b2p.k(l9kVar);
    }

    public void setVideoOverlay(@NonNull d9k d9kVar) {
        this.videoOverlay = b2p.k(d9kVar);
    }
}
