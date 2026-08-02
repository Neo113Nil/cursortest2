package androidx.credentials.provider;

import android.app.slice.Slice;
import android.content.pm.SigningInfo;
import android.credentials.ClearCredentialStateException;
import android.credentials.ClearCredentialStateRequest;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialRequest;
import android.credentials.CreateCredentialResponse;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.credentials.PrepareGetCredentialResponse;
import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialResponse;
import android.service.credentials.BeginGetCredentialResponse;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class Action$Companion$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ SigningInfo m(Object obj) {
        return (SigningInfo) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ClearCredentialStateException m9202m(Object obj) {
        return (ClearCredentialStateException) obj;
    }

    public static /* synthetic */ ClearCredentialStateException m(String str, String str2) {
        return new ClearCredentialStateException(str, str2);
    }

    public static /* synthetic */ ClearCredentialStateRequest m(Bundle bundle) {
        return new ClearCredentialStateRequest(bundle);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ CreateCredentialException m9203m(Object obj) {
        return (CreateCredentialException) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ CreateCredentialException m9204m(String str, String str2) {
        return new CreateCredentialException(str, str2);
    }

    public static /* synthetic */ CreateCredentialRequest.Builder m(String str, Bundle bundle, Bundle bundle2) {
        return new CreateCredentialRequest.Builder(str, bundle, bundle2);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ CreateCredentialResponse m9205m(Object obj) {
        return (CreateCredentialResponse) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ CredentialManager m9206m(Object obj) {
        return (CredentialManager) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ CredentialOption.Builder m9207m(String str, Bundle bundle, Bundle bundle2) {
        return new CredentialOption.Builder(str, bundle, bundle2);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ CredentialOption m9208m(Object obj) {
        return (CredentialOption) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ GetCredentialException m9209m(Object obj) {
        return (GetCredentialException) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ GetCredentialException m9210m(String str, String str2) {
        return new GetCredentialException(str, str2);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ GetCredentialRequest.Builder m9211m(Bundle bundle) {
        return new GetCredentialRequest.Builder(bundle);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ GetCredentialResponse m9212m(Object obj) {
        return (GetCredentialResponse) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ PrepareGetCredentialResponse m9213m(Object obj) {
        return (PrepareGetCredentialResponse) obj;
    }

    public static /* synthetic */ android.service.credentials.BeginCreateCredentialRequest m(String str, Bundle bundle, android.service.credentials.CallingAppInfo callingAppInfo) {
        return new android.service.credentials.BeginCreateCredentialRequest(str, bundle, callingAppInfo);
    }

    public static /* synthetic */ BeginCreateCredentialResponse.Builder m() {
        return new BeginCreateCredentialResponse.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ BeginGetCredentialResponse.Builder m9214m() {
        return new BeginGetCredentialResponse.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ android.service.credentials.BeginGetCredentialResponse m9215m(Object obj) {
        return (android.service.credentials.BeginGetCredentialResponse) obj;
    }

    public static /* synthetic */ android.service.credentials.CallingAppInfo m(String str, SigningInfo signingInfo, String str2) {
        return new android.service.credentials.CallingAppInfo(str, signingInfo, str2);
    }

    public static /* synthetic */ android.service.credentials.CreateEntry m(Slice slice) {
        return new android.service.credentials.CreateEntry(slice);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ android.service.credentials.CreateEntry m9217m(Object obj) {
        return (android.service.credentials.CreateEntry) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ android.service.credentials.RemoteEntry m9218m(Slice slice) {
        return new android.service.credentials.RemoteEntry(slice);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m9219m() {
        return GetCredentialResponse.class;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m9229m() {
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return android.service.credentials.BeginGetCredentialResponse.class;
    }

    /* renamed from: m$1, reason: collision with other method in class */
    public static /* synthetic */ void m9234m$1() {
    }

    public static /* bridge */ /* synthetic */ Class m$2() {
        return CreateCredentialException.class;
    }

    /* renamed from: m$2, reason: collision with other method in class */
    public static /* synthetic */ void m9236m$2() {
    }

    public static /* bridge */ /* synthetic */ Class m$3() {
        return GetCredentialException.class;
    }

    /* renamed from: m$3, reason: collision with other method in class */
    public static /* synthetic */ void m9237m$3() {
    }

    public static /* bridge */ /* synthetic */ Class m$4() {
        return CreateCredentialResponse.class;
    }

    /* renamed from: m$4, reason: collision with other method in class */
    public static /* synthetic */ void m9238m$4() {
    }

    public static /* synthetic */ void m$5() {
    }

    public static /* synthetic */ void m$6() {
    }

    public static /* synthetic */ void m$7() {
    }

    public static /* synthetic */ void m$8() {
    }

    public static /* synthetic */ void m$9() {
    }
}
