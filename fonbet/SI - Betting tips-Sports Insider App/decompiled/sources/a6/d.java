package a6;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.appcompat.widget.a0;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.material.card.MaterialCardViewHelper;
import d6.h;
import d6.i;
import e6.p;
import f7.m;
import f7.o;
import k7.k1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends y3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80b;

    public /* synthetic */ d(int i5) {
        this.f80b = i5;
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public d6.c e(Context context, Looper looper, a0 a0Var, Object obj, h hVar, i iVar) {
        switch (this.f80b) {
            case 7:
                return new k1(context, looper, 148, a0Var, hVar, iVar, 0);
            case 8:
            default:
                return super.e(context, looper, a0Var, obj, hVar, iVar);
            case 9:
                return new m(context, looper, a0Var, (s5.b) obj, (p) hVar, (p) iVar);
            case 10:
                return new x5.d(context, looper, a0Var, (GoogleSignInOptions) obj, (p) hVar, (p) iVar);
            case 11:
                a0Var.getClass();
                Integer num = (Integer) a0Var.f685g;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new u7.a(context, looper, a0Var, bundle, hVar, iVar);
            case 12:
                obj.getClass();
                throw new ClassCastException();
        }
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public d6.c f(Context context, Looper looper, a0 clientSettings, Object obj, p connectionCallbacks, p connectionFailedListener) {
        switch (this.f80b) {
            case 0:
                d6.a apiOptions = (d6.a) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(looper, "looper");
                Intrinsics.checkNotNullParameter(clientSettings, "commonSettings");
                Intrinsics.checkNotNullParameter(apiOptions, "apiOptions");
                Intrinsics.checkNotNullParameter(connectionCallbacks, "connectedListener");
                Intrinsics.checkNotNullParameter(connectionFailedListener, "connectionFailedListener");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(looper, "looper");
                Intrinsics.checkNotNullParameter(clientSettings, "clientSettings");
                Intrinsics.checkNotNullParameter(connectionCallbacks, "connectionCallbacks");
                Intrinsics.checkNotNullParameter(connectionFailedListener, "connectionFailedListener");
                return new g(context, looper, 381, clientSettings, connectionCallbacks, connectionFailedListener, 0);
            case 1:
                d6.a apiOptions2 = (d6.a) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(looper, "looper");
                Intrinsics.checkNotNullParameter(clientSettings, "commonSettings");
                Intrinsics.checkNotNullParameter(apiOptions2, "apiOptions");
                Intrinsics.checkNotNullParameter(connectionCallbacks, "connectedListener");
                Intrinsics.checkNotNullParameter(connectionFailedListener, "connectionFailedListener");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(looper, "looper");
                Intrinsics.checkNotNullParameter(clientSettings, "clientSettings");
                Intrinsics.checkNotNullParameter(connectionCallbacks, "connectionCallbacks");
                Intrinsics.checkNotNullParameter(connectionFailedListener, "connectionFailedListener");
                return new b7.d(context, looper, 352, clientSettings, connectionCallbacks, connectionFailedListener, 0);
            case 2:
                return new d7.b(context, looper, MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, clientSettings, connectionCallbacks, connectionFailedListener, 0);
            case 3:
                return new o(context, looper, clientSettings, connectionCallbacks, connectionFailedListener);
            case 4:
                return new f7.d(context, looper, clientSettings, connectionCallbacks, connectionFailedListener);
            case 5:
                return new i6.a(context, looper, 449, clientSettings, connectionCallbacks, connectionFailedListener, 0);
            case 6:
                return new i6.e(context, looper, clientSettings, (g6.i) obj, connectionCallbacks, connectionFailedListener);
            case 7:
            default:
                return super.f(context, looper, clientSettings, obj, connectionCallbacks, connectionFailedListener);
            case 8:
                return new m7.i(context, looper, clientSettings, connectionCallbacks, connectionFailedListener);
        }
    }
}
