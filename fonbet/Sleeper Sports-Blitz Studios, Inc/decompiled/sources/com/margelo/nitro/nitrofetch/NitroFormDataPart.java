package com.margelo.nitro.nitrofetch;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroFormDataPart.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/margelo/nitro/nitrofetch/NitroFormDataPart;", "", "name", "", "value", "fileUri", "fileName", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getValue", "getFileUri", "getFileName", "getMimeType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class NitroFormDataPart {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String fileName;
    private final String fileUri;
    private final String mimeType;
    private final String name;
    private final String value;

    public static /* synthetic */ NitroFormDataPart copy$default(NitroFormDataPart nitroFormDataPart, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nitroFormDataPart.name;
        }
        if ((i & 2) != 0) {
            str2 = nitroFormDataPart.value;
        }
        if ((i & 4) != 0) {
            str3 = nitroFormDataPart.fileUri;
        }
        if ((i & 8) != 0) {
            str4 = nitroFormDataPart.fileName;
        }
        if ((i & 16) != 0) {
            str5 = nitroFormDataPart.mimeType;
        }
        String str6 = str5;
        String str7 = str3;
        return nitroFormDataPart.copy(str, str2, str7, str4, str6);
    }

    @JvmStatic
    private static final NitroFormDataPart fromCpp(String str, String str2, String str3, String str4, String str5) {
        return INSTANCE.fromCpp(str, str2, str3, str4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFileUri() {
        return this.fileUri;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    public final NitroFormDataPart copy(String name, String value, String fileUri, String fileName, String mimeType) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new NitroFormDataPart(name, value, fileUri, fileName, mimeType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroFormDataPart)) {
            return false;
        }
        NitroFormDataPart nitroFormDataPart = (NitroFormDataPart) other;
        return Intrinsics.areEqual(this.name, nitroFormDataPart.name) && Intrinsics.areEqual(this.value, nitroFormDataPart.value) && Intrinsics.areEqual(this.fileUri, nitroFormDataPart.fileUri) && Intrinsics.areEqual(this.fileName, nitroFormDataPart.fileName) && Intrinsics.areEqual(this.mimeType, nitroFormDataPart.mimeType);
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.value;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fileUri;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fileName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mimeType;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "NitroFormDataPart(name=" + this.name + ", value=" + this.value + ", fileUri=" + this.fileUri + ", fileName=" + this.fileName + ", mimeType=" + this.mimeType + ")";
    }

    public NitroFormDataPart(String name, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.value = str;
        this.fileUri = str2;
        this.fileName = str3;
        this.mimeType = str4;
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getFileUri() {
        return this.fileUri;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    /* compiled from: NitroFormDataPart.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0003¨\u0006\f"}, d2 = {"Lcom/margelo/nitro/nitrofetch/NitroFormDataPart$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/nitrofetch/NitroFormDataPart;", "name", "", "value", "fileUri", "fileName", "mimeType", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroFormDataPart fromCpp(String name, String value, String fileUri, String fileName, String mimeType) {
            return new NitroFormDataPart(name, value, fileUri, fileName, mimeType);
        }
    }
}
