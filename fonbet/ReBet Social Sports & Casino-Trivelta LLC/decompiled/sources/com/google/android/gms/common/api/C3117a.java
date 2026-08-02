package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.InterfaceC3128f;
import com.google.android.gms.common.api.internal.InterfaceC3146o;
import com.google.android.gms.common.internal.AbstractC3179c;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.C3180d;
import com.google.android.gms.common.internal.InterfaceC3184h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3117a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0488a f32286a;

    /* renamed from: b, reason: collision with root package name */
    public final g f32287b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32288c;

    /* renamed from: com.google.android.gms.common.api.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0488a extends e {
        @NonNull
        @Deprecated
        public f buildClient(@NonNull Context context, @NonNull Looper looper, @NonNull C3180d c3180d, @NonNull Object obj, @NonNull f.b bVar, @NonNull f.c cVar) {
            return buildClient(context, looper, c3180d, obj, (InterfaceC3128f) bVar, (InterfaceC3146o) cVar);
        }

        @NonNull
        public f buildClient(@NonNull Context context, @NonNull Looper looper, @NonNull C3180d c3180d, @NonNull Object obj, @NonNull InterfaceC3128f interfaceC3128f, @NonNull InterfaceC3146o interfaceC3146o) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    public interface b {
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    public static class c {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    public interface d {

        /* renamed from: J4, reason: collision with root package name */
        public static final b f32289J4 = new b(null);

        /* renamed from: com.google.android.gms.common.api.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC0489a extends d {
            Account getAccount();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        public static final class b implements d {
            public /* synthetic */ b(r rVar) {
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
    public static abstract class e {
        public static final int API_PRIORITY_GAMES = 1;
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        public static final int API_PRIORITY_PLUS = 2;

        @NonNull
        public List<Scope> getImpliedScopes(Object obj) {
            return Collections.EMPTY_LIST;
        }

        public int getPriority() {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$f */
    public interface f extends b {
        void connect(AbstractC3179c.InterfaceC0491c interfaceC0491c);

        void disconnect();

        void disconnect(String str);

        void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        Feature[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(InterfaceC3184h interfaceC3184h, Set set);

        Set getScopesForConnectionlessNonSignIn();

        Intent getSignInIntent();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(AbstractC3179c.e eVar);

        boolean providesSignIn();

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    public static final class g extends c {
    }

    public C3117a(String str, AbstractC0488a abstractC0488a, g gVar) {
        AbstractC3191o.n(abstractC0488a, "Cannot construct an Api with a null ClientBuilder");
        AbstractC3191o.n(gVar, "Cannot construct an Api with a null ClientKey");
        this.f32288c = str;
        this.f32286a = abstractC0488a;
        this.f32287b = gVar;
    }

    public final AbstractC0488a a() {
        return this.f32286a;
    }

    public final c b() {
        return this.f32287b;
    }

    public final e c() {
        return this.f32286a;
    }

    public final String d() {
        return this.f32288c;
    }
}
