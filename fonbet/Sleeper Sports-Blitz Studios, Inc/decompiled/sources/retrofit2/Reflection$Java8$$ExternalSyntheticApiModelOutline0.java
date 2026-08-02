package retrofit2;

import android.content.Context;
import android.net.http.CallbackException;
import android.net.http.ConnectionMigrationOptions;
import android.net.http.DnsOptions;
import android.net.http.HttpEngine;
import android.net.http.InlineExecutionProhibitedException;
import android.net.http.QuicException;
import android.net.http.QuicOptions;
import java.lang.invoke.MethodHandles;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class Reflection$Java8$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ CallbackException m(Object obj) {
        return (CallbackException) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ ConnectionMigrationOptions.Builder m15644m() {
        return new ConnectionMigrationOptions.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ DnsOptions.Builder m15645m() {
        return new DnsOptions.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ DnsOptions.StaleDnsOptions.Builder m15646m() {
        return new DnsOptions.StaleDnsOptions.Builder();
    }

    public static /* synthetic */ HttpEngine.Builder m(Context context) {
        return new HttpEngine.Builder(context);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ android.net.http.HttpException m15647m(Object obj) {
        return (android.net.http.HttpException) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ QuicException m15648m(Object obj) {
        return (QuicException) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ QuicOptions.Builder m15649m() {
        return new QuicOptions.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m15650m() {
        return MethodHandles.Lookup.class;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ MethodHandles.Lookup m15655m(Object obj) {
        return (MethodHandles.Lookup) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m15657m() {
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m15661m(Object obj) {
        return obj instanceof QuicException;
    }

    public static /* bridge */ /* synthetic */ boolean m$1(Object obj) {
        return obj instanceof InlineExecutionProhibitedException;
    }

    public static /* bridge */ /* synthetic */ boolean m$2(Object obj) {
        return obj instanceof CallbackException;
    }

    public static /* bridge */ /* synthetic */ boolean m$3(Object obj) {
        return obj instanceof android.net.http.HttpException;
    }
}
