package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.navigation.models;

import C.o0;
import N3.C3660k;
import Nh.a;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/navigation/models/NavigationViewFileData;", "", ImagesContract.URL, "", "base64", "mimeType", "fileName", "buttonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getBase64", "getMimeType", "getFileName", "getButtonText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NavigationViewFileData {
    private final String base64;
    private final String buttonText;
    private final String fileName;
    private final String mimeType;
    private final String url;

    public NavigationViewFileData(@i(name = "url") String str, @i(name = "base64") String str2, @i(name = "mimeType") String str3, @i(name = "fileName") String str4, @i(name = "buttonText") String str5) {
        this.url = str;
        this.base64 = str2;
        this.mimeType = str3;
        this.fileName = str4;
        this.buttonText = str5;
    }

    public static /* synthetic */ NavigationViewFileData copy$default(NavigationViewFileData navigationViewFileData, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = navigationViewFileData.url;
        }
        if ((i11 & 2) != 0) {
            str2 = navigationViewFileData.base64;
        }
        if ((i11 & 4) != 0) {
            str3 = navigationViewFileData.mimeType;
        }
        if ((i11 & 8) != 0) {
            str4 = navigationViewFileData.fileName;
        }
        if ((i11 & 16) != 0) {
            str5 = navigationViewFileData.buttonText;
        }
        String str6 = str5;
        String str7 = str3;
        return navigationViewFileData.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBase64() {
        return this.base64;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @NotNull
    public final NavigationViewFileData copy(@i(name = "url") String url, @i(name = "base64") String base64, @i(name = "mimeType") String mimeType, @i(name = "fileName") String fileName, @i(name = "buttonText") String buttonText) {
        return new NavigationViewFileData(url, base64, mimeType, fileName, buttonText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationViewFileData)) {
            return false;
        }
        NavigationViewFileData navigationViewFileData = (NavigationViewFileData) other;
        return Intrinsics.d(this.url, navigationViewFileData.url) && Intrinsics.d(this.base64, navigationViewFileData.base64) && Intrinsics.d(this.mimeType, navigationViewFileData.mimeType) && Intrinsics.d(this.fileName, navigationViewFileData.fileName) && Intrinsics.d(this.buttonText, navigationViewFileData.buttonText);
    }

    public final String getBase64() {
        return this.base64;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.base64;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mimeType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fileName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.buttonText;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.url;
        String str2 = this.base64;
        String str3 = this.mimeType;
        String str4 = this.fileName;
        String str5 = this.buttonText;
        StringBuilder d11 = C3660k.d("NavigationViewFileData(url=", str, ", base64=", str2, ", mimeType=");
        a.h(d11, str3, ", fileName=", str4, ", buttonText=");
        return o0.c(d11, str5, ")");
    }
}
