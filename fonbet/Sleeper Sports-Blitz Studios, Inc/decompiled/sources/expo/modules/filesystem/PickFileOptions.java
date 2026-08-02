package expo.modules.filesystem;

import android.net.Uri;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PickFileOptions.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J8\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0015\u0012\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lexpo/modules/filesystem/PickFileOptions;", "Lexpo/modules/kotlin/records/Record;", "initialUri", "Landroid/net/Uri;", "mimeTypes", "", "", "multipleFiles", "", "<init>", "(Landroid/net/Uri;Ljava/util/List;Ljava/lang/Boolean;)V", "getInitialUri$annotations", "()V", "getInitialUri", "()Landroid/net/Uri;", "getMimeTypes$annotations", "getMimeTypes", "()Ljava/util/List;", "getMultipleFiles$annotations", "getMultipleFiles", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Landroid/net/Uri;Ljava/util/List;Ljava/lang/Boolean;)Lexpo/modules/filesystem/PickFileOptions;", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PickFileOptions implements Record {
    private final Uri initialUri;
    private final List<String> mimeTypes;
    private final Boolean multipleFiles;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PickFileOptions copy$default(PickFileOptions pickFileOptions, Uri uri, List list, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = pickFileOptions.initialUri;
        }
        if ((i & 2) != 0) {
            list = pickFileOptions.mimeTypes;
        }
        if ((i & 4) != 0) {
            bool = pickFileOptions.multipleFiles;
        }
        return pickFileOptions.copy(uri, list, bool);
    }

    @Field
    public static /* synthetic */ void getInitialUri$annotations() {
    }

    @Field
    public static /* synthetic */ void getMimeTypes$annotations() {
    }

    @Field
    public static /* synthetic */ void getMultipleFiles$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final Uri getInitialUri() {
        return this.initialUri;
    }

    public final List<String> component2() {
        return this.mimeTypes;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getMultipleFiles() {
        return this.multipleFiles;
    }

    public final PickFileOptions copy(Uri initialUri, List<String> mimeTypes, Boolean multipleFiles) {
        return new PickFileOptions(initialUri, mimeTypes, multipleFiles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickFileOptions)) {
            return false;
        }
        PickFileOptions pickFileOptions = (PickFileOptions) other;
        return Intrinsics.areEqual(this.initialUri, pickFileOptions.initialUri) && Intrinsics.areEqual(this.mimeTypes, pickFileOptions.mimeTypes) && Intrinsics.areEqual(this.multipleFiles, pickFileOptions.multipleFiles);
    }

    public int hashCode() {
        Uri uri = this.initialUri;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        List<String> list = this.mimeTypes;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.multipleFiles;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "PickFileOptions(initialUri=" + this.initialUri + ", mimeTypes=" + this.mimeTypes + ", multipleFiles=" + this.multipleFiles + ")";
    }

    public PickFileOptions(Uri uri, List<String> list, Boolean bool) {
        this.initialUri = uri;
        this.mimeTypes = list;
        this.multipleFiles = bool;
    }

    public final Uri getInitialUri() {
        return this.initialUri;
    }

    public final List<String> getMimeTypes() {
        return this.mimeTypes;
    }

    public final Boolean getMultipleFiles() {
        return this.multipleFiles;
    }
}
