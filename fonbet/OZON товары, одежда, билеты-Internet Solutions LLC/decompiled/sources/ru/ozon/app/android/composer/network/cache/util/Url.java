package ru.ozon.app.android.composer.network.cache.util;

import B0.A0;
import We.A;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0007\u0092\u0001\u00020\u0006¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/composer/network/cache/util/Url;", "", "LWe/A;", "httpUrl", "constructor-impl", "(LWe/A;)Ljava/lang/String;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "(Ljava/lang/String;)Ljava/lang/String;", "toString-impl", "toString", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Url {

    @NotNull
    private final String value;

    private /* synthetic */ Url(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Url m663boximpl(String str) {
        return new Url(str);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m665constructorimpl(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m666equalsimpl(String str, Object obj) {
        return (obj instanceof Url) && Intrinsics.d(str, ((Url) obj).getValue());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m667hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m668toStringimpl(String str) {
        return A0.b("Url(value=", str, ")");
    }

    public boolean equals(Object obj) {
        return m666equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m667hashCodeimpl(this.value);
    }

    public String toString() {
        return m668toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ String getValue() {
        return this.value;
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m664constructorimpl(@NotNull A httpUrl) {
        Intrinsics.checkNotNullParameter(httpUrl, "httpUrl");
        return m665constructorimpl(httpUrl.toString());
    }
}
