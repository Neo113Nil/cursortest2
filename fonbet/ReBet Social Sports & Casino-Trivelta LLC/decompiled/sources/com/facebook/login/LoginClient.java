package com.facebook.login;

import T7.C1665e;
import T7.Y;
import T7.Z;
import X9.m;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.gifdecoder.e;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CustomTabMainActivity;
import com.google.android.material.shape.i;
import com.twilio.voice.EventKeys;
import d8.EnumC4025a;
import d8.EnumC4028d;
import d8.n;
import d8.t;
import d8.w;
import d8.y;
import g6.C4331C;
import g6.C4357q;
import i3.C4527h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import z6.AbstractC6935e;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 22\u00020\u0001:\u0007\u0011&4\u0081\u0001\u0082\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00132\u0018\u0010\u001a\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJM\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0018\u0010\u001a\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\t¢\u0006\u0004\b&\u0010\u000bJ\u000f\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b(\u0010)J'\u0010/\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\n\u0012\u0004\u0012\u00020'\u0018\u0001012\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u000f¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\t¢\u0006\u0004\b6\u0010\u000bJ\r\u00107\u001a\u00020\u000f¢\u0006\u0004\b7\u00105J\u0015\u00108\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b8\u0010\u0016J\u0015\u00109\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b9\u0010\u0016J\u0015\u0010;\u001a\u00020*2\u0006\u0010:\u001a\u00020\f¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\u00020\t2\u0006\u0010=\u001a\u00020\u0013¢\u0006\u0004\b>\u0010\u0016J\r\u0010?\u001a\u00020\t¢\u0006\u0004\b?\u0010\u000bJ\r\u0010@\u001a\u00020\t¢\u0006\u0004\b@\u0010\u000bJ\u000f\u0010A\u001a\u00020*H\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010E\u001a\u00020\t2\u0006\u0010C\u001a\u00020\u00062\u0006\u0010D\u001a\u00020*H\u0016¢\u0006\u0004\bE\u0010FR*\u0010G\u001a\n\u0012\u0004\u0012\u00020'\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0016\u0010N\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010MR.\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010\u0005R$\u0010Y\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010`\u001a\u0004\u0018\u00010Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010d\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010@\u001a\u0004\ba\u00105\"\u0004\bb\u0010cR$\u0010i\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010$R0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010j8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR0\u0010r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010j8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010k\u001a\u0004\bp\u0010m\"\u0004\bq\u0010oR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010w\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010MR\u0016\u0010x\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010MR\u0014\u0010{\u001a\u00020s8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0013\u0010~\u001a\u0004\u0018\u00010|8F¢\u0006\u0006\u001a\u0004\bt\u0010}R\u0012\u0010\u0080\u0001\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u007f\u00105¨\u0006\u0083\u0001"}, d2 = {"Lcom/facebook/login/LoginClient;", "Landroid/os/Parcelable;", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Landroidx/fragment/app/Fragment;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", C4527h.f48087o, "()V", "", "key", EventKeys.VALUE_KEY, "", "accumulate", "a", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/facebook/login/LoginClient$Result;", "outcome", "a0", "(Lcom/facebook/login/LoginClient$Result;)V", "method", "result", "", "loggingExtras", "O", "(Ljava/lang/String;Lcom/facebook/login/LoginClient$Result;Ljava/util/Map;)V", "errorMessage", "errorCode", "U", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/facebook/login/LoginClient$Request;", "request", "h0", "(Lcom/facebook/login/LoginClient$Request;)V", com.google.crypto.tink.integration.android.b.f37029b, "c", "Lcom/facebook/login/LoginMethodHandler;", "j", "()Lcom/facebook/login/LoginMethodHandler;", "", "requestCode", "resultCode", "Landroid/content/Intent;", EventKeys.DATA, "d0", "(IILandroid/content/Intent;)Z", "", "l", "(Lcom/facebook/login/LoginClient$Request;)[Lcom/facebook/login/LoginMethodHandler;", W9.d.f13160a, "()Z", "j0", "i0", "g", "f", "permission", e.f29601m, "(Ljava/lang/String;)I", "pendingResult", "k0", "Y", "Z", "describeContents", "()I", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "handlersToTry", "[Lcom/facebook/login/LoginMethodHandler;", "getHandlersToTry", "()[Lcom/facebook/login/LoginMethodHandler;", "setHandlersToTry", "([Lcom/facebook/login/LoginMethodHandler;)V", "I", "currentHandler", "Landroidx/fragment/app/Fragment;", "k", "()Landroidx/fragment/app/Fragment;", "f0", "Lcom/facebook/login/LoginClient$d;", "Lcom/facebook/login/LoginClient$d;", "getOnCompletedListener", "()Lcom/facebook/login/LoginClient$d;", "g0", "(Lcom/facebook/login/LoginClient$d;)V", "onCompletedListener", "Lcom/facebook/login/LoginClient$a;", "Lcom/facebook/login/LoginClient$a;", "getBackgroundProcessingListener", "()Lcom/facebook/login/LoginClient$a;", "e0", "(Lcom/facebook/login/LoginClient$a;)V", "backgroundProcessingListener", "getCheckedInternetPermission", "setCheckedInternetPermission", "(Z)V", "checkedInternetPermission", "Lcom/facebook/login/LoginClient$Request;", "N", "()Lcom/facebook/login/LoginClient$Request;", "setPendingRequest", "pendingRequest", "", "Ljava/util/Map;", "getLoggingExtras", "()Ljava/util/Map;", "setLoggingExtras", "(Ljava/util/Map;)V", "getExtraData", "setExtraData", "extraData", "Ld8/t;", i.f35755A, "Ld8/t;", "loginLogger", "numActivitiesReturned", "numTotalIntentsFired", "J", "()Ld8/t;", "logger", "Landroidx/fragment/app/s;", "()Landroidx/fragment/app/s;", "activity", m.f13664a, "inProgress", "Request", "Result", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public class LoginClient implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int currentHandler;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Fragment fragment;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public d onCompletedListener;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public a backgroundProcessingListener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean checkedInternetPermission;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Request pendingRequest;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public Map loggingExtras;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public Map extraData;

    @Nullable
    private LoginMethodHandler[] handlersToTry;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public t loginLogger;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int numActivitiesReturned;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public int numTotalIntentsFired;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<LoginClient> CREATOR = new b();

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b>\u0018\u0000 ]2\u00020\u0001:\u0001+B}\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0011\b\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010\u001aJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020 H\u0016¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b'\u00107R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00106\u001a\u0004\b+\u00107\"\u0004\b9\u0010:R\"\u0010>\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b<\u0010\u001a\"\u0004\b=\u0010\u001eR$\u0010A\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00106\u001a\u0004\b?\u00107\"\u0004\b@\u0010:R\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u00106\u001a\u0004\b1\u00107\"\u0004\bC\u0010:R$\u0010E\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00106\u001a\u0004\bB\u00107\"\u0004\bD\u0010:R$\u0010H\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u00106\u001a\u0004\bF\u00107\"\u0004\bG\u0010:R\"\u0010L\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010<\u001a\u0004\bJ\u0010\u001a\"\u0004\bK\u0010\u001eR\u0017\u0010O\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bF\u0010M\u001a\u0004\bI\u0010NR\"\u0010S\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010<\u001a\u0004\bQ\u0010\u001a\"\u0004\bR\u0010\u001eR\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010<R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bU\u00106\u001a\u0004\bP\u00107R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bV\u00106\u001a\u0004\b;\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bW\u00106\u001a\u0004\b5\u00107R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\b8\u0010ZR\u0011\u0010\\\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b[\u0010\u001a¨\u0006^"}, d2 = {"Lcom/facebook/login/LoginClient$Request;", "Landroid/os/Parcelable;", "Ld8/n;", "loginBehavior", "", "", "permissions", "Ld8/d;", "defaultAudience", "authType", "applicationId", "authId", "Ld8/y;", "targetApp", "nonce", "codeVerifier", "codeChallenge", "Ld8/a;", "codeChallengeMethod", "<init>", "(Ld8/n;Ljava/util/Set;Ld8/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ld8/y;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ld8/a;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "j0", "()Z", "shouldSkipAccountDeduplication", "", "i0", "(Z)V", "O", "", "describeContents", "()I", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ld8/n;", "j", "()Ld8/n;", com.google.crypto.tink.integration.android.b.f37029b, "Ljava/util/Set;", "J", "()Ljava/util/Set;", "f0", "(Ljava/util/Set;)V", "c", "Ld8/d;", "g", "()Ld8/d;", W9.d.f13160a, "Ljava/lang/String;", "()Ljava/lang/String;", e.f29601m, "a0", "(Ljava/lang/String;)V", "f", "Z", "g0", "isRerequest", i.f35755A, "setDeviceRedirectUriString", "deviceRedirectUriString", C4527h.f48087o, "setAuthType", "setDeviceAuthTargetUserId", "deviceAuthTargetUserId", "l", "e0", "messengerPageId", "k", "N", "h0", "resetMessengerState", "Ld8/y;", "()Ld8/y;", "loginTargetApp", m.f13664a, "U", "d0", "isFamilyLogin", "n", "o", "p", "q", "r", "Ld8/a;", "()Ld8/a;", "Y", "isInstagramLogin", "s", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Request implements Parcelable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final n loginBehavior;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public Set permissions;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final EnumC4028d defaultAudience;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final String applicationId;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        public String authId;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        public boolean isRerequest;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        public String deviceRedirectUriString;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        public String authType;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        public String deviceAuthTargetUserId;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        public String messengerPageId;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        public boolean resetMessengerState;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        public final y loginTargetApp;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        public boolean isFamilyLogin;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        public boolean shouldSkipAccountDeduplication;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        public final String nonce;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        public final String codeVerifier;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        public final String codeChallenge;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        public final EnumC4025a codeChallengeMethod;

        @JvmField
        @NotNull
        public static final Parcelable.Creator<Request> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Request createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new Request(source, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Request[] newArray(int i10) {
                return new Request[i10];
            }
        }

        public /* synthetic */ Request(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        /* renamed from: J, reason: from getter */
        public final Set getPermissions() {
            return this.permissions;
        }

        /* renamed from: N, reason: from getter */
        public final boolean getResetMessengerState() {
            return this.resetMessengerState;
        }

        public final boolean O() {
            Iterator it = this.permissions.iterator();
            while (it.hasNext()) {
                if (w.f45121j.e((String) it.next())) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: U, reason: from getter */
        public final boolean getIsFamilyLogin() {
            return this.isFamilyLogin;
        }

        public final boolean Y() {
            return this.loginTargetApp == y.INSTAGRAM;
        }

        /* renamed from: Z, reason: from getter */
        public final boolean getIsRerequest() {
            return this.isRerequest;
        }

        /* renamed from: a, reason: from getter */
        public final String getApplicationId() {
            return this.applicationId;
        }

        public final void a0(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.authId = str;
        }

        /* renamed from: b, reason: from getter */
        public final String getAuthId() {
            return this.authId;
        }

        /* renamed from: c, reason: from getter */
        public final String getAuthType() {
            return this.authType;
        }

        /* renamed from: d, reason: from getter */
        public final String getCodeChallenge() {
            return this.codeChallenge;
        }

        public final void d0(boolean z10) {
            this.isFamilyLogin = z10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: e, reason: from getter */
        public final EnumC4025a getCodeChallengeMethod() {
            return this.codeChallengeMethod;
        }

        public final void e0(String str) {
            this.messengerPageId = str;
        }

        /* renamed from: f, reason: from getter */
        public final String getCodeVerifier() {
            return this.codeVerifier;
        }

        public final void f0(Set set) {
            Intrinsics.checkNotNullParameter(set, "<set-?>");
            this.permissions = set;
        }

        /* renamed from: g, reason: from getter */
        public final EnumC4028d getDefaultAudience() {
            return this.defaultAudience;
        }

        public final void g0(boolean z10) {
            this.isRerequest = z10;
        }

        /* renamed from: h, reason: from getter */
        public final String getDeviceAuthTargetUserId() {
            return this.deviceAuthTargetUserId;
        }

        public final void h0(boolean z10) {
            this.resetMessengerState = z10;
        }

        /* renamed from: i, reason: from getter */
        public final String getDeviceRedirectUriString() {
            return this.deviceRedirectUriString;
        }

        public final void i0(boolean shouldSkipAccountDeduplication) {
            this.shouldSkipAccountDeduplication = shouldSkipAccountDeduplication;
        }

        /* renamed from: j, reason: from getter */
        public final n getLoginBehavior() {
            return this.loginBehavior;
        }

        /* renamed from: j0, reason: from getter */
        public final boolean getShouldSkipAccountDeduplication() {
            return this.shouldSkipAccountDeduplication;
        }

        /* renamed from: k, reason: from getter */
        public final y getLoginTargetApp() {
            return this.loginTargetApp;
        }

        /* renamed from: l, reason: from getter */
        public final String getMessengerPageId() {
            return this.messengerPageId;
        }

        /* renamed from: m, reason: from getter */
        public final String getNonce() {
            return this.nonce;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.loginBehavior.name());
            dest.writeStringList(new ArrayList(this.permissions));
            dest.writeString(this.defaultAudience.name());
            dest.writeString(this.applicationId);
            dest.writeString(this.authId);
            dest.writeByte(this.isRerequest ? (byte) 1 : (byte) 0);
            dest.writeString(this.deviceRedirectUriString);
            dest.writeString(this.authType);
            dest.writeString(this.deviceAuthTargetUserId);
            dest.writeString(this.messengerPageId);
            dest.writeByte(this.resetMessengerState ? (byte) 1 : (byte) 0);
            dest.writeString(this.loginTargetApp.name());
            dest.writeByte(this.isFamilyLogin ? (byte) 1 : (byte) 0);
            dest.writeByte(this.shouldSkipAccountDeduplication ? (byte) 1 : (byte) 0);
            dest.writeString(this.nonce);
            dest.writeString(this.codeVerifier);
            dest.writeString(this.codeChallenge);
            EnumC4025a enumC4025a = this.codeChallengeMethod;
            dest.writeString(enumC4025a == null ? null : enumC4025a.name());
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Request(d8.n r15, java.util.Set r16, d8.EnumC4028d r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, d8.y r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, d8.EnumC4025a r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
            /*
                r14 = this;
                r0 = r26
                r1 = r0 & 64
                if (r1 == 0) goto La
                d8.y r1 = d8.y.FACEBOOK
                r9 = r1
                goto Lc
            La:
                r9 = r21
            Lc:
                r1 = r0 & 128(0x80, float:1.8E-43)
                r2 = 0
                if (r1 == 0) goto L13
                r10 = r2
                goto L15
            L13:
                r10 = r22
            L15:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L1b
                r11 = r2
                goto L1d
            L1b:
                r11 = r23
            L1d:
                r1 = r0 & 512(0x200, float:7.17E-43)
                if (r1 == 0) goto L23
                r12 = r2
                goto L25
            L23:
                r12 = r24
            L25:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L37
                r13 = r2
                r3 = r15
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
                r2 = r14
                goto L45
            L37:
                r13 = r25
                r2 = r14
                r3 = r15
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
            L45:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.Request.<init>(d8.n, java.util.Set, d8.d, java.lang.String, java.lang.String, java.lang.String, d8.y, java.lang.String, java.lang.String, java.lang.String, d8.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public Request(n loginBehavior, Set set, EnumC4028d defaultAudience, String authType, String applicationId, String authId, y yVar, String str, String str2, String str3, EnumC4025a enumC4025a) {
            Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            Intrinsics.checkNotNullParameter(authType, "authType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(authId, "authId");
            this.loginBehavior = loginBehavior;
            this.permissions = set == null ? new HashSet() : set;
            this.defaultAudience = defaultAudience;
            this.authType = authType;
            this.applicationId = applicationId;
            this.authId = authId;
            this.loginTargetApp = yVar == null ? y.FACEBOOK : yVar;
            if (str != null && str.length() != 0) {
                this.nonce = str;
            } else {
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
                this.nonce = uuid;
            }
            this.codeVerifier = str2;
            this.codeChallenge = str3;
            this.codeChallengeMethod = enumC4025a;
        }

        public Request(Parcel parcel) {
            EnumC4028d enumC4028d;
            y yVar;
            Z z10 = Z.f11052a;
            this.loginBehavior = n.valueOf(Z.n(parcel.readString(), "loginBehavior"));
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.permissions = new HashSet(arrayList);
            String readString = parcel.readString();
            if (readString != null) {
                enumC4028d = EnumC4028d.valueOf(readString);
            } else {
                enumC4028d = EnumC4028d.NONE;
            }
            this.defaultAudience = enumC4028d;
            this.applicationId = Z.n(parcel.readString(), "applicationId");
            this.authId = Z.n(parcel.readString(), "authId");
            this.isRerequest = parcel.readByte() != 0;
            this.deviceRedirectUriString = parcel.readString();
            this.authType = Z.n(parcel.readString(), "authType");
            this.deviceAuthTargetUserId = parcel.readString();
            this.messengerPageId = parcel.readString();
            this.resetMessengerState = parcel.readByte() != 0;
            String readString2 = parcel.readString();
            if (readString2 != null) {
                yVar = y.valueOf(readString2);
            } else {
                yVar = y.FACEBOOK;
            }
            this.loginTargetApp = yVar;
            this.isFamilyLogin = parcel.readByte() != 0;
            this.shouldSkipAccountDeduplication = parcel.readByte() != 0;
            this.nonce = Z.n(parcel.readString(), "nonce");
            this.codeVerifier = parcel.readString();
            this.codeChallenge = parcel.readString();
            String readString3 = parcel.readString();
            this.codeChallengeMethod = readString3 == null ? null : EnumC4025a.valueOf(readString3);
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002\u001c B9\b\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBC\b\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\u0010B\u0011\b\u0012\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000b\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010'8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010)R$\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010'8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010)¨\u0006."}, d2 = {"Lcom/facebook/login/LoginClient$Result;", "Landroid/os/Parcelable;", "Lcom/facebook/login/LoginClient$Request;", "request", "Lcom/facebook/login/LoginClient$Result$a;", EventKeys.ERROR_CODE, "Lcom/facebook/AccessToken;", "token", "", "errorMessage", "errorCode", "<init>", "(Lcom/facebook/login/LoginClient$Request;Lcom/facebook/login/LoginClient$Result$a;Lcom/facebook/AccessToken;Ljava/lang/String;Ljava/lang/String;)V", "accessToken", "Lcom/facebook/AuthenticationToken;", "authenticationToken", "(Lcom/facebook/login/LoginClient$Request;Lcom/facebook/login/LoginClient$Result$a;Lcom/facebook/AccessToken;Lcom/facebook/AuthenticationToken;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/facebook/login/LoginClient$Result$a;", com.google.crypto.tink.integration.android.b.f37029b, "Lcom/facebook/AccessToken;", "c", "Lcom/facebook/AuthenticationToken;", W9.d.f13160a, "Ljava/lang/String;", e.f29601m, "f", "Lcom/facebook/login/LoginClient$Request;", "", "g", "Ljava/util/Map;", "loggingExtras", C4527h.f48087o, "extraData", i.f35755A, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Result implements Parcelable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final a code;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final AccessToken token;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final AuthenticationToken authenticationToken;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final String errorMessage;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final String errorCode;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final Request request;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        public Map loggingExtras;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        public Map extraData;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        @NotNull
        public static final Parcelable.Creator<Result> CREATOR = new b();

        public enum a {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");


            /* renamed from: a, reason: collision with root package name */
            public final String f31042a;

            a(String str) {
                this.f31042a = str;
            }

            /* renamed from: values, reason: to resolve conflict with enum method */
            public static a[] valuesCustom() {
                a[] valuesCustom = values();
                return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
            }

            public final String b() {
                return this.f31042a;
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Result createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new Result(source, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Result[] newArray(int i10) {
                return new Result[i10];
            }
        }

        /* renamed from: com.facebook.login.LoginClient$Result$c, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ Result d(Companion companion, Request request, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 8) != 0) {
                    str3 = null;
                }
                return companion.c(request, str, str2, str3);
            }

            public final Result a(Request request, String str) {
                return new Result(request, a.CANCEL, null, str, null);
            }

            public final Result b(Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
                return new Result(request, a.SUCCESS, accessToken, authenticationToken, null, null);
            }

            public final Result c(Request request, String str, String str2, String str3) {
                ArrayList arrayList = new ArrayList();
                if (str != null) {
                    arrayList.add(str);
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                return new Result(request, a.ERROR, null, TextUtils.join(": ", arrayList), str3);
            }

            public final Result e(Request request, AccessToken token) {
                Intrinsics.checkNotNullParameter(token, "token");
                return new Result(request, a.SUCCESS, token, null, null);
            }

            public Companion() {
            }
        }

        public /* synthetic */ Result(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.code.name());
            dest.writeParcelable(this.token, flags);
            dest.writeParcelable(this.authenticationToken, flags);
            dest.writeString(this.errorMessage);
            dest.writeString(this.errorCode);
            dest.writeParcelable(this.request, flags);
            Y y10 = Y.f11042a;
            Y.K0(dest, this.loggingExtras);
            Y.K0(dest, this.extraData);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Result(Request request, a code, AccessToken accessToken, String str, String str2) {
            this(request, code, accessToken, null, str, str2);
            Intrinsics.checkNotNullParameter(code, "code");
        }

        public Result(Request request, a code, AccessToken accessToken, AuthenticationToken authenticationToken, String str, String str2) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.request = request;
            this.token = accessToken;
            this.authenticationToken = authenticationToken;
            this.errorMessage = str;
            this.code = code;
            this.errorCode = str2;
        }

        public Result(Parcel parcel) {
            String readString = parcel.readString();
            this.code = a.valueOf(readString == null ? "error" : readString);
            this.token = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.authenticationToken = (AuthenticationToken) parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.errorMessage = parcel.readString();
            this.errorCode = parcel.readString();
            this.request = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.loggingExtras = Y.u0(parcel);
            this.extraData = Y.u0(parcel);
        }
    }

    public interface a {
        void a();

        void b();
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoginClient createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new LoginClient(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public LoginClient[] newArray(int i10) {
            return new LoginClient[i10];
        }
    }

    /* renamed from: com.facebook.login.LoginClient$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("init", System.currentTimeMillis());
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "e2e.toString()");
            return jSONObject2;
        }

        public final int b() {
            return C1665e.c.Login.b();
        }

        public Companion() {
        }
    }

    public interface d {
        void a(Result result);
    }

    public LoginClient(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.currentHandler = -1;
        f0(fragment);
    }

    public final t J() {
        t tVar = this.loginLogger;
        if (tVar != null) {
            String b10 = tVar.b();
            Request request = this.pendingRequest;
            if (Intrinsics.areEqual(b10, request == null ? null : request.getApplicationId())) {
                return tVar;
            }
        }
        Context i10 = i();
        if (i10 == null) {
            i10 = C4331C.l();
        }
        Request request2 = this.pendingRequest;
        t tVar2 = new t(i10, request2 == null ? C4331C.m() : request2.getApplicationId());
        this.loginLogger = tVar2;
        return tVar2;
    }

    /* renamed from: N, reason: from getter */
    public final Request getPendingRequest() {
        return this.pendingRequest;
    }

    public final void O(String method, Result result, Map loggingExtras) {
        U(method, result.code.b(), result.errorMessage, result.errorCode, loggingExtras);
    }

    public final void U(String method, String result, String errorMessage, String errorCode, Map loggingExtras) {
        Request request = this.pendingRequest;
        if (request == null) {
            J().j("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", method);
        } else {
            J().c(request.getAuthId(), method, result, errorMessage, errorCode, loggingExtras, request.getIsFamilyLogin() ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete");
        }
    }

    public final void Y() {
        a aVar = this.backgroundProcessingListener;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    public final void Z() {
        a aVar = this.backgroundProcessingListener;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    public final void a(String key, String value, boolean accumulate) {
        Map map = this.loggingExtras;
        if (map == null) {
            map = new HashMap();
        }
        if (this.loggingExtras == null) {
            this.loggingExtras = map;
        }
        if (map.containsKey(key) && accumulate) {
            value = map.get(key) + ',' + value;
        }
        map.put(key, value);
    }

    public final void a0(Result outcome) {
        d dVar = this.onCompletedListener;
        if (dVar == null) {
            return;
        }
        dVar.a(outcome);
    }

    public final void b(Request request) {
        if (request == null) {
            return;
        }
        if (this.pendingRequest != null) {
            throw new C4357q("Attempted to authorize while a request is pending.");
        }
        if (!AccessToken.INSTANCE.g() || d()) {
            this.pendingRequest = request;
            this.handlersToTry = l(request);
            j0();
        }
    }

    public final void c() {
        LoginMethodHandler j10 = j();
        if (j10 == null) {
            return;
        }
        j10.b();
    }

    public final boolean d() {
        if (this.checkedInternetPermission) {
            return true;
        }
        if (e("android.permission.INTERNET") == 0) {
            this.checkedInternetPermission = true;
            return true;
        }
        AbstractActivityC2168s i10 = i();
        f(Result.Companion.d(Result.INSTANCE, this.pendingRequest, i10 == null ? null : i10.getString(AbstractC6935e.f68612c), i10 != null ? i10.getString(AbstractC6935e.f68611b) : null, null, 8, null));
        return false;
    }

    public final boolean d0(int requestCode, int resultCode, Intent data) {
        this.numActivitiesReturned++;
        if (this.pendingRequest != null) {
            if (data != null && data.getBooleanExtra(CustomTabMainActivity.f30284j, false)) {
                j0();
                return false;
            }
            LoginMethodHandler j10 = j();
            if (j10 != null && (!j10.J() || data != null || this.numActivitiesReturned >= this.numTotalIntentsFired)) {
                return j10.j(requestCode, resultCode, data);
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e(String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        AbstractActivityC2168s i10 = i();
        if (i10 == null) {
            return -1;
        }
        return i10.checkCallingOrSelfPermission(permission);
    }

    public final void e0(a aVar) {
        this.backgroundProcessingListener = aVar;
    }

    public final void f(Result outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        LoginMethodHandler j10 = j();
        if (j10 != null) {
            O(j10.getNameForLogging(), outcome, j10.getMethodLoggingExtras());
        }
        Map map = this.loggingExtras;
        if (map != null) {
            outcome.loggingExtras = map;
        }
        Map map2 = this.extraData;
        if (map2 != null) {
            outcome.extraData = map2;
        }
        this.handlersToTry = null;
        this.currentHandler = -1;
        this.pendingRequest = null;
        this.loggingExtras = null;
        this.numActivitiesReturned = 0;
        this.numTotalIntentsFired = 0;
        a0(outcome);
    }

    public final void f0(Fragment fragment) {
        if (this.fragment != null) {
            throw new C4357q("Can't set fragment once it is already set.");
        }
        this.fragment = fragment;
    }

    public final void g(Result outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        if (outcome.token == null || !AccessToken.INSTANCE.g()) {
            f(outcome);
        } else {
            k0(outcome);
        }
    }

    public final void g0(d dVar) {
        this.onCompletedListener = dVar;
    }

    public final void h() {
        f(Result.Companion.d(Result.INSTANCE, this.pendingRequest, "Login attempt failed.", null, null, 8, null));
    }

    public final void h0(Request request) {
        if (m()) {
            return;
        }
        b(request);
    }

    public final AbstractActivityC2168s i() {
        Fragment fragment = this.fragment;
        if (fragment == null) {
            return null;
        }
        return fragment.getActivity();
    }

    public final boolean i0() {
        LoginMethodHandler j10 = j();
        if (j10 == null) {
            return false;
        }
        if (j10.i() && !d()) {
            a("no_internet_permission", "1", false);
            return false;
        }
        Request request = this.pendingRequest;
        if (request == null) {
            return false;
        }
        int N10 = j10.N(request);
        this.numActivitiesReturned = 0;
        if (N10 > 0) {
            J().e(request.getAuthId(), j10.getNameForLogging(), request.getIsFamilyLogin() ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start");
            this.numTotalIntentsFired = N10;
        } else {
            J().d(request.getAuthId(), j10.getNameForLogging(), request.getIsFamilyLogin() ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried");
            a("not_tried", j10.getNameForLogging(), true);
        }
        return N10 > 0;
    }

    public final LoginMethodHandler j() {
        LoginMethodHandler[] loginMethodHandlerArr;
        int i10 = this.currentHandler;
        if (i10 < 0 || (loginMethodHandlerArr = this.handlersToTry) == null) {
            return null;
        }
        return loginMethodHandlerArr[i10];
    }

    public final void j0() {
        LoginClient loginClient;
        LoginMethodHandler j10 = j();
        if (j10 != null) {
            loginClient = this;
            loginClient.U(j10.getNameForLogging(), "skipped", null, null, j10.getMethodLoggingExtras());
        } else {
            loginClient = this;
        }
        LoginMethodHandler[] loginMethodHandlerArr = loginClient.handlersToTry;
        while (loginMethodHandlerArr != null) {
            int i10 = loginClient.currentHandler;
            if (i10 >= loginMethodHandlerArr.length - 1) {
                break;
            }
            loginClient.currentHandler = i10 + 1;
            if (i0()) {
                return;
            }
        }
        if (loginClient.pendingRequest != null) {
            h();
        }
    }

    /* renamed from: k, reason: from getter */
    public final Fragment getFragment() {
        return this.fragment;
    }

    public final void k0(Result pendingResult) {
        Result b10;
        Intrinsics.checkNotNullParameter(pendingResult, "pendingResult");
        if (pendingResult.token == null) {
            throw new C4357q("Can't validate without a token");
        }
        AccessToken e10 = AccessToken.INSTANCE.e();
        AccessToken accessToken = pendingResult.token;
        if (e10 != null) {
            try {
                if (Intrinsics.areEqual(e10.getUserId(), accessToken.getUserId())) {
                    b10 = Result.INSTANCE.b(this.pendingRequest, pendingResult.token, pendingResult.authenticationToken);
                    f(b10);
                }
            } catch (Exception e11) {
                f(Result.Companion.d(Result.INSTANCE, this.pendingRequest, "Caught exception", e11.getMessage(), null, 8, null));
                return;
            }
        }
        b10 = Result.Companion.d(Result.INSTANCE, this.pendingRequest, "User logged in as different Facebook user.", null, null, 8, null);
        f(b10);
    }

    public LoginMethodHandler[] l(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ArrayList arrayList = new ArrayList();
        n loginBehavior = request.getLoginBehavior();
        if (!request.Y()) {
            if (loginBehavior.d()) {
                arrayList.add(new GetTokenLoginMethodHandler(this));
            }
            if (!C4331C.f46939s && loginBehavior.f()) {
                arrayList.add(new KatanaProxyLoginMethodHandler(this));
            }
        } else if (!C4331C.f46939s && loginBehavior.e()) {
            arrayList.add(new InstagramAppLoginMethodHandler(this));
        }
        if (loginBehavior.b()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (loginBehavior.g()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (!request.Y() && loginBehavior.c()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
        if (array != null) {
            return (LoginMethodHandler[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final boolean m() {
        return this.pendingRequest != null && this.currentHandler >= 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelableArray(this.handlersToTry, flags);
        dest.writeInt(this.currentHandler);
        dest.writeParcelable(this.pendingRequest, flags);
        Y y10 = Y.f11042a;
        Y.K0(dest, this.loggingExtras);
        Y.K0(dest, this.extraData);
    }

    public LoginClient(Parcel source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.currentHandler = -1;
        Parcelable[] readParcelableArray = source.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        readParcelableArray = readParcelableArray == null ? new Parcelable[0] : readParcelableArray;
        ArrayList arrayList = new ArrayList();
        int length = readParcelableArray.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Parcelable parcelable = readParcelableArray[i10];
            LoginMethodHandler loginMethodHandler = parcelable instanceof LoginMethodHandler ? (LoginMethodHandler) parcelable : null;
            if (loginMethodHandler != null) {
                loginMethodHandler.m(this);
            }
            if (loginMethodHandler != null) {
                arrayList.add(loginMethodHandler);
            }
            i10++;
        }
        Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
        if (array != null) {
            this.handlersToTry = (LoginMethodHandler[]) array;
            this.currentHandler = source.readInt();
            this.pendingRequest = (Request) source.readParcelable(Request.class.getClassLoader());
            Map u02 = Y.u0(source);
            this.loggingExtras = u02 == null ? null : MapsKt.toMutableMap(u02);
            Map u03 = Y.u0(source);
            this.extraData = u03 != null ? MapsKt.toMutableMap(u03) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
