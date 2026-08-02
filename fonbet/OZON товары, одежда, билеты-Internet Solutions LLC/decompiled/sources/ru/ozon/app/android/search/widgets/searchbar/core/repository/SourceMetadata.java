package ru.ozon.app.android.search.widgets.searchbar.core.repository;

import Am.C2438a;
import B0.C2454a;
import C.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\r¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/core/repository/SourceMetadata;", "", "", "width", "height", "", "mimeType", "<init>", "(IILjava/lang/String;)V", "Lorg/json/JSONObject;", "toJsonObject", "()Lorg/json/JSONObject;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getWidth", "getHeight", "Ljava/lang/String;", "getMimeType", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SourceMetadata {
    private final int height;
    private final String mimeType;
    private final int width;

    public SourceMetadata(int i11, int i12, String str) {
        this.width = i11;
        this.height = i12;
        this.mimeType = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SourceMetadata)) {
            return false;
        }
        SourceMetadata sourceMetadata = (SourceMetadata) other;
        return this.width == sourceMetadata.width && this.height == sourceMetadata.height && Intrinsics.d(this.mimeType, sourceMetadata.mimeType);
    }

    public int hashCode() {
        int a11 = C2454a.a(this.height, Integer.hashCode(this.width) * 31, 31);
        String str = this.mimeType;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", this.width);
        jSONObject.put("height", this.height);
        String str = this.mimeType;
        if (str != null) {
            jSONObject.put("type", str);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        int i11 = this.width;
        int i12 = this.height;
        return o0.c(C2438a.a("SourceMetadata(width=", i11, ", height=", ", mimeType=", i12), this.mimeType, ")");
    }
}
