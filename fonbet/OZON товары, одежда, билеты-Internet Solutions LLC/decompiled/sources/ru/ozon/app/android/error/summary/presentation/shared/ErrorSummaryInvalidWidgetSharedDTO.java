package ru.ozon.app.android.error.summary.presentation.shared;

import I0.C3173b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/error/summary/presentation/shared/ErrorSummaryInvalidWidgetSharedDTO;", "", "widgetKey", "", "isWidgetSupported", "", "step", "throwable", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getWidgetKey", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStep", "getThrowable", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/error/summary/presentation/shared/ErrorSummaryInvalidWidgetSharedDTO;", "equals", "other", "hashCode", "", "toString", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ErrorSummaryInvalidWidgetSharedDTO {
    private final Boolean isWidgetSupported;
    private final String step;
    private final String throwable;
    private final String widgetKey;

    public ErrorSummaryInvalidWidgetSharedDTO(@i(name = "widget_key") String str, @i(name = "is_widget_supported") Boolean bool, @i(name = "step") String str2, @i(name = "error") String str3) {
        this.widgetKey = str;
        this.isWidgetSupported = bool;
        this.step = str2;
        this.throwable = str3;
    }

    public static /* synthetic */ ErrorSummaryInvalidWidgetSharedDTO copy$default(ErrorSummaryInvalidWidgetSharedDTO errorSummaryInvalidWidgetSharedDTO, String str, Boolean bool, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = errorSummaryInvalidWidgetSharedDTO.widgetKey;
        }
        if ((i11 & 2) != 0) {
            bool = errorSummaryInvalidWidgetSharedDTO.isWidgetSupported;
        }
        if ((i11 & 4) != 0) {
            str2 = errorSummaryInvalidWidgetSharedDTO.step;
        }
        if ((i11 & 8) != 0) {
            str3 = errorSummaryInvalidWidgetSharedDTO.throwable;
        }
        return errorSummaryInvalidWidgetSharedDTO.copy(str, bool, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetKey() {
        return this.widgetKey;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsWidgetSupported() {
        return this.isWidgetSupported;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStep() {
        return this.step;
    }

    /* renamed from: component4, reason: from getter */
    public final String getThrowable() {
        return this.throwable;
    }

    @NotNull
    public final ErrorSummaryInvalidWidgetSharedDTO copy(@i(name = "widget_key") String widgetKey, @i(name = "is_widget_supported") Boolean isWidgetSupported, @i(name = "step") String step, @i(name = "error") String throwable) {
        return new ErrorSummaryInvalidWidgetSharedDTO(widgetKey, isWidgetSupported, step, throwable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorSummaryInvalidWidgetSharedDTO)) {
            return false;
        }
        ErrorSummaryInvalidWidgetSharedDTO errorSummaryInvalidWidgetSharedDTO = (ErrorSummaryInvalidWidgetSharedDTO) other;
        return Intrinsics.d(this.widgetKey, errorSummaryInvalidWidgetSharedDTO.widgetKey) && Intrinsics.d(this.isWidgetSupported, errorSummaryInvalidWidgetSharedDTO.isWidgetSupported) && Intrinsics.d(this.step, errorSummaryInvalidWidgetSharedDTO.step) && Intrinsics.d(this.throwable, errorSummaryInvalidWidgetSharedDTO.throwable);
    }

    public final String getStep() {
        return this.step;
    }

    public final String getThrowable() {
        return this.throwable;
    }

    public final String getWidgetKey() {
        return this.widgetKey;
    }

    public int hashCode() {
        String str = this.widgetKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isWidgetSupported;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.step;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.throwable;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Boolean isWidgetSupported() {
        return this.isWidgetSupported;
    }

    @NotNull
    public String toString() {
        String str = this.widgetKey;
        Boolean bool = this.isWidgetSupported;
        String str2 = this.step;
        String str3 = this.throwable;
        StringBuilder sb2 = new StringBuilder("ErrorSummaryInvalidWidgetSharedDTO(widgetKey=");
        sb2.append(str);
        sb2.append(", isWidgetSupported=");
        sb2.append(bool);
        sb2.append(", step=");
        return C3173b.c(sb2, str2, ", throwable=", str3, ")");
    }

    public /* synthetic */ ErrorSummaryInvalidWidgetSharedDTO(String str, Boolean bool, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3);
    }
}
