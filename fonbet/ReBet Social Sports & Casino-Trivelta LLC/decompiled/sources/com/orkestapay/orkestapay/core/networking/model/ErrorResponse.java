package com.orkestapay.orkestapay.core.networking.model;

import Zh.InterfaceC1901b;
import Zh.n;
import bi.f;
import ci.d;
import di.C4087f;
import di.F0;
import di.U0;
import di.Z0;
import ei.y;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@n
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBW\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJP\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b-\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b.\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b/\u0010\u001aR(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010\u001f¨\u00065"}, d2 = {"Lcom/orkestapay/orkestapay/core/networking/model/ErrorResponse;", "", "", "requestId", "category", "message", "error", "", "Lcom/orkestapay/orkestapay/core/networking/model/FieldError;", "validationErrors", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "write$Self", "(Lcom/orkestapay/orkestapay/core/networking/model/ErrorResponse;Lci/d;Lbi/f;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/orkestapay/orkestapay/core/networking/model/ErrorResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRequestId", "getRequestId$annotations", "()V", "getCategory", "getMessage", "getError", "Ljava/util/List;", "getValidationErrors", "getValidationErrors$annotations", "Companion", "$serializer", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ErrorResponse {

    @Nullable
    private final String category;

    @Nullable
    private final String error;

    @Nullable
    private final String message;

    @NotNull
    private final String requestId;

    @Nullable
    private final List<FieldError> validationErrors;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final InterfaceC1901b[] $childSerializers = {null, null, null, null, new C4087f(FieldError$$serializer.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/orkestapay/orkestapay/core/networking/model/ErrorResponse$Companion;", "", "<init>", "()V", "LZh/b;", "Lcom/orkestapay/orkestapay/core/networking/model/ErrorResponse;", "serializer", "()LZh/b;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return ErrorResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ErrorResponse(int i10, @y(names = {"request_id"}) String str, String str2, String str3, String str4, List list, U0 u02) {
        if (1 != (i10 & 1)) {
            F0.a(i10, 1, ErrorResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.requestId = str;
        if ((i10 & 2) == 0) {
            this.category = null;
        } else {
            this.category = str2;
        }
        if ((i10 & 4) == 0) {
            this.message = null;
        } else {
            this.message = str3;
        }
        if ((i10 & 8) == 0) {
            this.error = null;
        } else {
            this.error = str4;
        }
        if ((i10 & 16) == 0) {
            this.validationErrors = null;
        } else {
            this.validationErrors = list;
        }
    }

    public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, String str, String str2, String str3, String str4, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = errorResponse.requestId;
        }
        if ((i10 & 2) != 0) {
            str2 = errorResponse.category;
        }
        if ((i10 & 4) != 0) {
            str3 = errorResponse.message;
        }
        if ((i10 & 8) != 0) {
            str4 = errorResponse.error;
        }
        if ((i10 & 16) != 0) {
            list = errorResponse.validationErrors;
        }
        List list2 = list;
        String str5 = str3;
        return errorResponse.copy(str, str2, str5, str4, list2);
    }

    @y(names = {"request_id"})
    public static /* synthetic */ void getRequestId$annotations() {
    }

    public static /* synthetic */ void getValidationErrors$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(ErrorResponse self, d output, f serialDesc) {
        InterfaceC1901b[] interfaceC1901bArr = $childSerializers;
        output.G(serialDesc, 0, self.requestId);
        if (output.m(serialDesc, 1) || self.category != null) {
            output.C(serialDesc, 1, Z0.f45341a, self.category);
        }
        if (output.m(serialDesc, 2) || self.message != null) {
            output.C(serialDesc, 2, Z0.f45341a, self.message);
        }
        if (output.m(serialDesc, 3) || self.error != null) {
            output.C(serialDesc, 3, Z0.f45341a, self.error);
        }
        if (!output.m(serialDesc, 4) && self.validationErrors == null) {
            return;
        }
        output.C(serialDesc, 4, interfaceC1901bArr[4], self.validationErrors);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @Nullable
    public final List<FieldError> component5() {
        return this.validationErrors;
    }

    @NotNull
    public final ErrorResponse copy(@NotNull String requestId, @Nullable String category, @Nullable String message, @Nullable String error, @Nullable List<FieldError> validationErrors) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        return new ErrorResponse(requestId, category, message, error, validationErrors);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorResponse)) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) other;
        return Intrinsics.areEqual(this.requestId, errorResponse.requestId) && Intrinsics.areEqual(this.category, errorResponse.category) && Intrinsics.areEqual(this.message, errorResponse.message) && Intrinsics.areEqual(this.error, errorResponse.error) && Intrinsics.areEqual(this.validationErrors, errorResponse.validationErrors);
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final String getError() {
        return this.error;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getRequestId() {
        return this.requestId;
    }

    @Nullable
    public final List<FieldError> getValidationErrors() {
        return this.validationErrors;
    }

    public int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        String str = this.category;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.error;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<FieldError> list = this.validationErrors;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ErrorResponse(requestId=" + this.requestId + ", category=" + this.category + ", message=" + this.message + ", error=" + this.error + ", validationErrors=" + this.validationErrors + ')';
    }

    public ErrorResponse(@NotNull String requestId, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<FieldError> list) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.requestId = requestId;
        this.category = str;
        this.message = str2;
        this.error = str3;
        this.validationErrors = list;
    }

    public /* synthetic */ ErrorResponse(String str, String str2, String str3, String str4, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : list);
    }
}
