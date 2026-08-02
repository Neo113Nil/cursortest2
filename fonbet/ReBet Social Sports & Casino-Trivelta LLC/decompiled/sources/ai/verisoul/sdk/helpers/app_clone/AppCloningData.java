package ai.verisoul.sdk.helpers.app_clone;

import Gb.c;
import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lai/verisoul/sdk/helpers/app_clone/AppCloningData;", "", "installedPackages", "", "Lai/verisoul/sdk/helpers/app_clone/PackageData;", "fileDirectory", "", "dotCountInFileDir", "", "errorMessage", "(Ljava/util/List;Ljava/lang/String;ILjava/lang/String;)V", "getDotCountInFileDir", "()I", "getErrorMessage", "()Ljava/lang/String;", "getFileDirectory", "getInstalledPackages", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AppCloningData {

    @c("dotCountInFileDir")
    private final int dotCountInFileDir;

    @c("errorMessage")
    @Nullable
    private final String errorMessage;

    @c("fileDirectory")
    @NotNull
    private final String fileDirectory;

    @c("installedPackages")
    @Nullable
    private final List<PackageData> installedPackages;

    public AppCloningData(@Nullable List<PackageData> list, @NotNull String fileDirectory, int i10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(fileDirectory, "fileDirectory");
        this.installedPackages = list;
        this.fileDirectory = fileDirectory;
        this.dotCountInFileDir = i10;
        this.errorMessage = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppCloningData copy$default(AppCloningData appCloningData, List list, String str, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = appCloningData.installedPackages;
        }
        if ((i11 & 2) != 0) {
            str = appCloningData.fileDirectory;
        }
        if ((i11 & 4) != 0) {
            i10 = appCloningData.dotCountInFileDir;
        }
        if ((i11 & 8) != 0) {
            str2 = appCloningData.errorMessage;
        }
        return appCloningData.copy(list, str, i10, str2);
    }

    @Nullable
    public final List<PackageData> component1() {
        return this.installedPackages;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFileDirectory() {
        return this.fileDirectory;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDotCountInFileDir() {
        return this.dotCountInFileDir;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final AppCloningData copy(@Nullable List<PackageData> installedPackages, @NotNull String fileDirectory, int dotCountInFileDir, @Nullable String errorMessage) {
        Intrinsics.checkNotNullParameter(fileDirectory, "fileDirectory");
        return new AppCloningData(installedPackages, fileDirectory, dotCountInFileDir, errorMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppCloningData)) {
            return false;
        }
        AppCloningData appCloningData = (AppCloningData) other;
        return Intrinsics.areEqual(this.installedPackages, appCloningData.installedPackages) && Intrinsics.areEqual(this.fileDirectory, appCloningData.fileDirectory) && this.dotCountInFileDir == appCloningData.dotCountInFileDir && Intrinsics.areEqual(this.errorMessage, appCloningData.errorMessage);
    }

    public final int getDotCountInFileDir() {
        return this.dotCountInFileDir;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final String getFileDirectory() {
        return this.fileDirectory;
    }

    @Nullable
    public final List<PackageData> getInstalledPackages() {
        return this.installedPackages;
    }

    public int hashCode() {
        List<PackageData> list = this.installedPackages;
        int hashCode = (((((list == null ? 0 : list.hashCode()) * 31) + this.fileDirectory.hashCode()) * 31) + Integer.hashCode(this.dotCountInFileDir)) * 31;
        String str = this.errorMessage;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AppCloningData(installedPackages=" + this.installedPackages + ", fileDirectory=" + this.fileDirectory + ", dotCountInFileDir=" + this.dotCountInFileDir + ", errorMessage=" + this.errorMessage + ")";
    }

    public /* synthetic */ AppCloningData(List list, String str, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, i10, (i11 & 8) != 0 ? null : str2);
    }
}
