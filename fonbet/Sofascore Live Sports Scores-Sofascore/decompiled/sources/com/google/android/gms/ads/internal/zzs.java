package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzcp;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbkb;
import com.google.android.gms.internal.ads.zzbkt;
import com.google.android.gms.internal.ads.zzcac;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzccn;
import defpackage.wt3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzs extends zzbt {
    public final VersionInfoParcel a;
    public final com.google.android.gms.ads.internal.client.zzr b;
    public final Context c;
    public final zzr d;
    public WebView e;
    public zzbh f;
    public AsyncTask g;

    public zzs(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, VersionInfoParcel versionInfoParcel) {
        this.c = context;
        this.a = versionInfoParcel;
        this.b = zzrVar;
        this.e = new WebView(context);
        this.d = new zzr(context, str);
        E4(0);
        this.e.setVerticalScrollBarEnabled(false);
        this.e.getSettings().setJavaScriptEnabled(true);
        this.e.setWebViewClient(new zzo(this));
        this.e.setOnTouchListener(new zzp());
    }

    public final void E4(int i) {
        if (this.e == null) {
            return;
        }
        this.e.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    public final String F4() {
        String zza = this.d.zza();
        if (true == TextUtils.isEmpty(zza)) {
            zza = "www.google.com";
        }
        String str = (String) zzbkt.d.c();
        return wt3.m("https://", zza, new StringBuilder(String.valueOf(zza).length() + 8 + String.valueOf(str).length()), str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzA() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB(zzccn zzccnVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final zzea zzE() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(zzfw zzfwVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzee zzeeVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzx zzxVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzbhc zzbhcVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final long zzT() {
        return 0L;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX(zzcp zzcpVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zza() throws RemoteException {
        Preconditions.e("getAdFrame must be called on the main UI thread.");
        return new ObjectWrapper(this.e);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzb() throws RemoteException {
        Preconditions.e("destroy must be called on the main UI thread.");
        this.g.cancel(true);
        this.e.destroy();
        this.e = null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzc() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzd(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        Preconditions.j(this.e, "This Search Ad has already been torn down");
        this.d.zzf(zzmVar, this.a);
        this.g = new zzq(this).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdU(zzcl zzclVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zze() throws RemoteException {
        Preconditions.e("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf() throws RemoteException {
        Preconditions.e("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(zzbh zzbhVar) throws RemoteException {
        this.f = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(zzby zzbyVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzj() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzk() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzr zzm() throws RemoteException {
        return this.b;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzn(com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(zzcac zzcacVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(zzcaf zzcafVar, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final String zzq() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final String zzr() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final zzdx zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzt() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcl zzu() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzv() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzw(zzbkb zzbkbVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx(zzbe zzbeVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzz() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(zzdq zzdqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(zzcs zzcsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(long j) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbk zzbkVar) {
    }
}
