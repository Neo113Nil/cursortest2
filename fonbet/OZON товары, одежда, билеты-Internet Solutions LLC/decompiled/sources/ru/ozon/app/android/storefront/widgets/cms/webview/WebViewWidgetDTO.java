package ru.ozon.app.android.storefront.widgets.cms.webview;

import C.o0;
import Kk.c;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J0\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/webview/WebViewWidgetDTO;", "", "width", "", "height", "code", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeight", "getCode", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lru/ozon/app/android/storefront/widgets/cms/webview/WebViewWidgetDTO;", "equals", "", "other", "hashCode", "toString", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WebViewWidgetDTO {
    public static final int $stable = 0;

    @NotNull
    private final String code;
    private final Integer height;
    private final Integer width;

    public WebViewWidgetDTO(Integer num, Integer num2, @NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.width = num;
        this.height = num2;
        this.code = code;
    }

    public static /* synthetic */ WebViewWidgetDTO copy$default(WebViewWidgetDTO webViewWidgetDTO, Integer num, Integer num2, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = webViewWidgetDTO.width;
        }
        if ((i11 & 2) != 0) {
            num2 = webViewWidgetDTO.height;
        }
        if ((i11 & 4) != 0) {
            str = webViewWidgetDTO.code;
        }
        return webViewWidgetDTO.copy(num, num2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final WebViewWidgetDTO copy(Integer width, Integer height, @NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return new WebViewWidgetDTO(width, height, code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebViewWidgetDTO)) {
            return false;
        }
        WebViewWidgetDTO webViewWidgetDTO = (WebViewWidgetDTO) other;
        return Intrinsics.d(this.width, webViewWidgetDTO.width) && Intrinsics.d(this.height, webViewWidgetDTO.height) && Intrinsics.d(this.code, webViewWidgetDTO.code);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        Integer num = this.width;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.height;
        return this.code.hashCode() + ((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        Integer num = this.width;
        Integer num2 = this.height;
        return o0.c(c.f("WebViewWidgetDTO(width=", ", height=", num, num2, ", code="), this.code, ")");
    }

    public /* synthetic */ WebViewWidgetDTO(Integer num, Integer num2, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, str);
    }
}
