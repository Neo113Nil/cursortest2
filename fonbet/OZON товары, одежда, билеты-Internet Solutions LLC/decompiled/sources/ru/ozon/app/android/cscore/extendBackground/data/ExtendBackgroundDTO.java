package ru.ozon.app.android.cscore.extendBackground.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cscore/extendBackground/data/ExtendBackgroundDTO;", "", "colorToken", "", "<init>", "(Ljava/lang/String;)V", "getColorToken", "()Ljava/lang/String;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExtendBackgroundDTO {
    public static final int $stable = 0;
    private final String colorToken;

    /* JADX WARN: Multi-variable type inference failed */
    public ExtendBackgroundDTO() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String getColorToken() {
        return this.colorToken;
    }

    public ExtendBackgroundDTO(String str) {
        this.colorToken = str;
    }

    public /* synthetic */ ExtendBackgroundDTO(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str);
    }
}
