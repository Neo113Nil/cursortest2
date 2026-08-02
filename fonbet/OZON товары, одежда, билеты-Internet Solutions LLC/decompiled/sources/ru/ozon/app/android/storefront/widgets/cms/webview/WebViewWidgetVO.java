package ru.ozon.app.android.storefront.widgets.cms.webview;

import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/webview/WebViewWidgetVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "ratio", "", "code", "<init>", "(JLjava/lang/Float;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/Float;", "getRatio", "()Ljava/lang/Float;", "Ljava/lang/String;", "getCode", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WebViewWidgetVO implements c {

    @NotNull
    private final String code;
    private final long id;
    private final Float ratio;

    public WebViewWidgetVO(long j11, Float f7, @NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.id = j11;
        this.ratio = f7;
        this.code = code;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebViewWidgetVO)) {
            return false;
        }
        WebViewWidgetVO webViewWidgetVO = (WebViewWidgetVO) other;
        return this.id == webViewWidgetVO.id && Intrinsics.d(this.ratio, webViewWidgetVO.ratio) && Intrinsics.d(this.code, webViewWidgetVO.code);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Float getRatio() {
        return this.ratio;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Float f7 = this.ratio;
        return this.code.hashCode() + ((hashCode + (f7 == null ? 0 : f7.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Float f7 = this.ratio;
        String str = this.code;
        StringBuilder sb2 = new StringBuilder("WebViewWidgetVO(id=");
        sb2.append(j11);
        sb2.append(", ratio=");
        sb2.append(f7);
        return C6594f.a(", code=", str, ")", sb2);
    }
}
