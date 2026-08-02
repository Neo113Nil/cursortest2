package ru.ozon.app.android.barcodecache.push;

import G.g;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010JN\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u0010¨\u0006#"}, d2 = {"Lru/ozon/app/android/barcodecache/push/BarcodePushExtra;", "", "hint", "", "code", "cacheLifetime", "", "teensHint", "teensCode", "teensCacheLifetime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getHint", "()Ljava/lang/String;", "getCode", "getCacheLifetime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTeensHint", "getTeensCode", "getTeensCacheLifetime", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lru/ozon/app/android/barcodecache/push/BarcodePushExtra;", "equals", "", "other", "hashCode", "", "toString", "barcodecache_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BarcodePushExtra {
    private final Long cacheLifetime;

    @NotNull
    private final String code;

    @NotNull
    private final String hint;
    private final Long teensCacheLifetime;

    @NotNull
    private final String teensCode;

    @NotNull
    private final String teensHint;

    public BarcodePushExtra(@NotNull String hint, @NotNull String code, Long l11, @NotNull String teensHint, @NotNull String teensCode, Long l12) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(teensHint, "teensHint");
        Intrinsics.checkNotNullParameter(teensCode, "teensCode");
        this.hint = hint;
        this.code = code;
        this.cacheLifetime = l11;
        this.teensHint = teensHint;
        this.teensCode = teensCode;
        this.teensCacheLifetime = l12;
    }

    public static /* synthetic */ BarcodePushExtra copy$default(BarcodePushExtra barcodePushExtra, String str, String str2, Long l11, String str3, String str4, Long l12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = barcodePushExtra.hint;
        }
        if ((i11 & 2) != 0) {
            str2 = barcodePushExtra.code;
        }
        if ((i11 & 4) != 0) {
            l11 = barcodePushExtra.cacheLifetime;
        }
        if ((i11 & 8) != 0) {
            str3 = barcodePushExtra.teensHint;
        }
        if ((i11 & 16) != 0) {
            str4 = barcodePushExtra.teensCode;
        }
        if ((i11 & 32) != 0) {
            l12 = barcodePushExtra.teensCacheLifetime;
        }
        String str5 = str4;
        Long l13 = l12;
        return barcodePushExtra.copy(str, str2, l11, str3, str5, l13);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getCacheLifetime() {
        return this.cacheLifetime;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTeensHint() {
        return this.teensHint;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getTeensCode() {
        return this.teensCode;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getTeensCacheLifetime() {
        return this.teensCacheLifetime;
    }

    @NotNull
    public final BarcodePushExtra copy(@NotNull String hint, @NotNull String code, Long cacheLifetime, @NotNull String teensHint, @NotNull String teensCode, Long teensCacheLifetime) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(teensHint, "teensHint");
        Intrinsics.checkNotNullParameter(teensCode, "teensCode");
        return new BarcodePushExtra(hint, code, cacheLifetime, teensHint, teensCode, teensCacheLifetime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarcodePushExtra)) {
            return false;
        }
        BarcodePushExtra barcodePushExtra = (BarcodePushExtra) other;
        return Intrinsics.d(this.hint, barcodePushExtra.hint) && Intrinsics.d(this.code, barcodePushExtra.code) && Intrinsics.d(this.cacheLifetime, barcodePushExtra.cacheLifetime) && Intrinsics.d(this.teensHint, barcodePushExtra.teensHint) && Intrinsics.d(this.teensCode, barcodePushExtra.teensCode) && Intrinsics.d(this.teensCacheLifetime, barcodePushExtra.teensCacheLifetime);
    }

    public final Long getCacheLifetime() {
        return this.cacheLifetime;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getHint() {
        return this.hint;
    }

    public final Long getTeensCacheLifetime() {
        return this.teensCacheLifetime;
    }

    @NotNull
    public final String getTeensCode() {
        return this.teensCode;
    }

    @NotNull
    public final String getTeensHint() {
        return this.teensHint;
    }

    public int hashCode() {
        int a11 = g.a(this.hint.hashCode() * 31, 31, this.code);
        Long l11 = this.cacheLifetime;
        int a12 = g.a(g.a((a11 + (l11 == null ? 0 : l11.hashCode())) * 31, 31, this.teensHint), 31, this.teensCode);
        Long l12 = this.teensCacheLifetime;
        return a12 + (l12 != null ? l12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.hint;
        String str2 = this.code;
        Long l11 = this.cacheLifetime;
        String str3 = this.teensHint;
        String str4 = this.teensCode;
        Long l12 = this.teensCacheLifetime;
        StringBuilder d11 = C3660k.d("BarcodePushExtra(hint=", str, ", code=", str2, ", cacheLifetime=");
        d11.append(l11);
        d11.append(", teensHint=");
        d11.append(str3);
        d11.append(", teensCode=");
        d11.append(str4);
        d11.append(", teensCacheLifetime=");
        d11.append(l12);
        d11.append(")");
        return d11.toString();
    }
}
