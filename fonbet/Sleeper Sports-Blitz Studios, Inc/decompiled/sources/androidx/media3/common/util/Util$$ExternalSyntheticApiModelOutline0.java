package androidx.media3.common.util;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.slice.Slice;
import android.media.AudioFocusRequest;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import android.media.session.MediaSessionManager;
import android.net.http.HttpEngine;
import android.net.http.NetworkException;
import android.net.http.UrlResponseInfo;
import android.os.Bundle;
import android.service.credentials.Action;
import android.service.credentials.BeginGetCredentialOption;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.CredentialEntry;
import java.util.List;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class Util$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ ForegroundServiceStartNotAllowedException m(Object obj) {
        return (ForegroundServiceStartNotAllowedException) obj;
    }

    public static /* synthetic */ AudioFocusRequest.Builder m(int i) {
        return new AudioFocusRequest.Builder(i);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AudioFocusRequest m9344m(Object obj) {
        return (AudioFocusRequest) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ MediaRoute2Info m9345m(Object obj) {
        return (MediaRoute2Info) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ MediaRouter2 m9346m(Object obj) {
        return (MediaRouter2) obj;
    }

    public static /* synthetic */ RouteDiscoveryPreference.Builder m(List list, boolean z) {
        return new RouteDiscoveryPreference.Builder(list, z);
    }

    public static /* synthetic */ MediaSessionManager.RemoteUserInfo m(String str, int i, int i2) {
        return new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ HttpEngine m9348m(Object obj) {
        return (HttpEngine) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ NetworkException m9349m(Object obj) {
        return (NetworkException) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ UrlResponseInfo m9350m(Object obj) {
        return (UrlResponseInfo) obj;
    }

    public static /* synthetic */ Action m(Slice slice) {
        return new Action(slice);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Action m9351m(Object obj) {
        return (Action) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ BeginGetCredentialOption m9352m(Object obj) {
        return (BeginGetCredentialOption) obj;
    }

    public static /* synthetic */ BeginGetCredentialOption m(String str, String str2, Bundle bundle) {
        return new BeginGetCredentialOption(str, str2, bundle);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ BeginGetCredentialRequest.Builder m9353m() {
        return new BeginGetCredentialRequest.Builder();
    }

    public static /* synthetic */ CredentialEntry m(BeginGetCredentialOption beginGetCredentialOption, Slice slice) {
        return new CredentialEntry(beginGetCredentialOption, slice);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ CredentialEntry m9354m(Object obj) {
        return (CredentialEntry) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m9361m() {
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m9363m(Object obj) {
        return obj instanceof ForegroundServiceStartNotAllowedException;
    }

    public static /* synthetic */ void m$1() {
    }

    public static /* bridge */ /* synthetic */ boolean m$1(Object obj) {
        return obj instanceof NetworkException;
    }

    public static /* synthetic */ void m$2() {
    }

    public static /* synthetic */ void m$3() {
    }
}
