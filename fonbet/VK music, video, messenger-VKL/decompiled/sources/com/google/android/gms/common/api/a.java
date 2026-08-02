package com.google.android.gms.common.api;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import xsna.exc0;
import xsna.i380;
import xsna.olc;
import xsna.rd6;
import xsna.x3j;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class a<O extends d> {
    public final AbstractC0111a a;
    public final g b;
    public final String c;

    /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
    /* renamed from: com.google.android.gms.common.api.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0111a<T extends f, O> extends e<T, O> {
        @NonNull
        @Deprecated
        public T buildClient(@NonNull Context context, @NonNull Looper looper, @NonNull olc olcVar, @NonNull O o, @NonNull c.b bVar, @NonNull c.InterfaceC0114c interfaceC0114c) {
            return buildClient(context, looper, olcVar, (olc) o, (x3j) bVar, (i380) interfaceC0114c);
        }

        @NonNull
        public T buildClient(@NonNull Context context, @NonNull Looper looper, @NonNull olc olcVar, @NonNull O o, @NonNull x3j x3jVar, @NonNull i380 i380Var) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
    public interface b {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
    public static class c<C extends b> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
    public interface d {

        @NonNull
        public static final c U6 = new c();

        /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
        /* renamed from: com.google.android.gms.common.api.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC0112a extends d, InterfaceC0113d {
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
        public interface b extends d {
            @Nullable
            GoogleSignInAccount f();
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
        public static final class c implements InterfaceC0113d {
            public c() {
                throw null;
            }
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
        /* renamed from: com.google.android.gms.common.api.a$d$d, reason: collision with other inner class name */
        public interface InterfaceC0113d extends d {
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
    public static abstract class e<T extends b, O> {
        public static final int API_PRIORITY_GAMES = 1;
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        public static final int API_PRIORITY_PLUS = 2;

        @NonNull
        public List<Scope> getImpliedScopes(@Nullable O o) {
            return Collections.EMPTY_LIST;
        }

        public int getPriority() {
            return Integer.MAX_VALUE;
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
    public interface f extends b {
        void connect(@NonNull rd6.c cVar);

        void disconnect();

        void disconnect(@NonNull String str);

        void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr);

        @NonNull
        Feature[] getAvailableFeatures();

        @NonNull
        String getEndpointPackageName();

        @Nullable
        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(@Nullable com.google.android.gms.common.internal.b bVar, @Nullable Set<Scope> set);

        @NonNull
        Set<Scope> getScopesForConnectionlessNonSignIn();

        @NonNull
        Intent getSignInIntent();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(@NonNull rd6.e eVar);

        boolean providesSignIn();

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> a(@NonNull String str, @NonNull AbstractC0111a<C, O> abstractC0111a, @NonNull g<C> gVar) {
        exc0.j(gVar, "Cannot construct an Api with a null ClientKey");
        this.c = str;
        this.a = abstractC0111a;
        this.b = gVar;
    }
}
