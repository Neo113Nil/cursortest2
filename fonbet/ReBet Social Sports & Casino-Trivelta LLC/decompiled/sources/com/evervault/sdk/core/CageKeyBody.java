package com.evervault.sdk.core;

import Zh.InterfaceC1901b;
import Zh.n;
import bi.f;
import ci.d;
import di.F0;
import di.U0;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@n
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0083\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0015¨\u0006%"}, d2 = {"Lcom/evervault/sdk/core/CageKeyBody;", "", "", "ecdhP256Key", "ecdhP256KeyUncompressed", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "write$Self", "(Lcom/evervault/sdk/core/CageKeyBody;Lci/d;Lbi/f;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/evervault/sdk/core/CageKeyBody;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEcdhP256Key", "getEcdhP256KeyUncompressed", "Companion", "$serializer", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class CageKeyBody {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String ecdhP256Key;

    @NotNull
    private final String ecdhP256KeyUncompressed;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/evervault/sdk/core/CageKeyBody$Companion;", "", "<init>", "()V", "LZh/b;", "Lcom/evervault/sdk/core/CageKeyBody;", "serializer", "()LZh/b;", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return CageKeyBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ CageKeyBody(int i10, String str, String str2, U0 u02) {
        if (3 != (i10 & 3)) {
            F0.a(i10, 3, CageKeyBody$$serializer.INSTANCE.getDescriptor());
        }
        this.ecdhP256Key = str;
        this.ecdhP256KeyUncompressed = str2;
    }

    public static /* synthetic */ CageKeyBody copy$default(CageKeyBody cageKeyBody, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cageKeyBody.ecdhP256Key;
        }
        if ((i10 & 2) != 0) {
            str2 = cageKeyBody.ecdhP256KeyUncompressed;
        }
        return cageKeyBody.copy(str, str2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(CageKeyBody self, d output, f serialDesc) {
        output.G(serialDesc, 0, self.ecdhP256Key);
        output.G(serialDesc, 1, self.ecdhP256KeyUncompressed);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEcdhP256Key() {
        return this.ecdhP256Key;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getEcdhP256KeyUncompressed() {
        return this.ecdhP256KeyUncompressed;
    }

    @NotNull
    public final CageKeyBody copy(@NotNull String ecdhP256Key, @NotNull String ecdhP256KeyUncompressed) {
        Intrinsics.checkNotNullParameter(ecdhP256Key, "ecdhP256Key");
        Intrinsics.checkNotNullParameter(ecdhP256KeyUncompressed, "ecdhP256KeyUncompressed");
        return new CageKeyBody(ecdhP256Key, ecdhP256KeyUncompressed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CageKeyBody)) {
            return false;
        }
        CageKeyBody cageKeyBody = (CageKeyBody) other;
        return Intrinsics.areEqual(this.ecdhP256Key, cageKeyBody.ecdhP256Key) && Intrinsics.areEqual(this.ecdhP256KeyUncompressed, cageKeyBody.ecdhP256KeyUncompressed);
    }

    @NotNull
    public final String getEcdhP256Key() {
        return this.ecdhP256Key;
    }

    @NotNull
    public final String getEcdhP256KeyUncompressed() {
        return this.ecdhP256KeyUncompressed;
    }

    public int hashCode() {
        return (this.ecdhP256Key.hashCode() * 31) + this.ecdhP256KeyUncompressed.hashCode();
    }

    @NotNull
    public String toString() {
        return "CageKeyBody(ecdhP256Key=" + this.ecdhP256Key + ", ecdhP256KeyUncompressed=" + this.ecdhP256KeyUncompressed + ")";
    }

    public CageKeyBody(@NotNull String ecdhP256Key, @NotNull String ecdhP256KeyUncompressed) {
        Intrinsics.checkNotNullParameter(ecdhP256Key, "ecdhP256Key");
        Intrinsics.checkNotNullParameter(ecdhP256KeyUncompressed, "ecdhP256KeyUncompressed");
        this.ecdhP256Key = ecdhP256Key;
        this.ecdhP256KeyUncompressed = ecdhP256KeyUncompressed;
    }
}
