package ru.ozon.app.android.domain.session.api.auth.models;

import C.o0;
import V.e;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002()B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\bHÆ\u0003Jn\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0003\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017¨\u0006*"}, d2 = {"Lru/ozon/app/android/domain/session/api/auth/models/Data;", "", "authToken", "isRegister", "", "biometry", "Lru/ozon/app/android/domain/session/api/auth/models/Data$Biometry;", "postData", "", "", "authMethod", "Lru/ozon/app/android/domain/session/api/auth/models/AuthMethod;", "trackingInfo", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/Object;Ljava/lang/Boolean;Lru/ozon/app/android/domain/session/api/auth/models/Data$Biometry;Ljava/util/Map;Lru/ozon/app/android/domain/session/api/auth/models/AuthMethod;Ljava/util/Map;)V", "getAuthToken", "()Ljava/lang/Object;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBiometry", "()Lru/ozon/app/android/domain/session/api/auth/models/Data$Biometry;", "getPostData", "()Ljava/util/Map;", "getAuthMethod", "()Lru/ozon/app/android/domain/session/api/auth/models/AuthMethod;", "getTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Object;Ljava/lang/Boolean;Lru/ozon/app/android/domain/session/api/auth/models/Data$Biometry;Ljava/util/Map;Lru/ozon/app/android/domain/session/api/auth/models/AuthMethod;Ljava/util/Map;)Lru/ozon/app/android/domain/session/api/auth/models/Data;", "equals", "other", "hashCode", "", "toString", "Biometry", "DialogBiometry", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Data {
    private final AuthMethod authMethod;
    private final Object authToken;
    private final Biometry biometry;
    private final Boolean isRegister;
    private final Map<String, Object> postData;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0002\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/domain/session/api/auth/models/Data$Biometry;", "", "isNeedToSetBiometry", "", "permission", "Lru/ozon/app/android/domain/session/api/auth/models/Data$Biometry$Permission;", "analyticTag", "", "clearDevicePublicKey", "<init>", "(Ljava/lang/Boolean;Lru/ozon/app/android/domain/session/api/auth/models/Data$Biometry$Permission;Ljava/lang/String;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPermission", "()Lru/ozon/app/android/domain/session/api/auth/models/Data$Biometry$Permission;", "getAnalyticTag", "()Ljava/lang/String;", "getClearDevicePublicKey", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Lru/ozon/app/android/domain/session/api/auth/models/Data$Biometry$Permission;Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/app/android/domain/session/api/auth/models/Data$Biometry;", "equals", "other", "hashCode", "", "toString", "Permission", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Biometry {
        private final String analyticTag;
        private final Boolean clearDevicePublicKey;
        private final Boolean isNeedToSetBiometry;
        private final Permission permission;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/domain/session/api/auth/models/Data$Biometry$Permission;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Permission {

            @NotNull
            private final String subtitle;

            @NotNull
            private final String title;

            public Permission(@NotNull String title, @NotNull String subtitle) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                this.title = title;
                this.subtitle = subtitle;
            }

            public static /* synthetic */ Permission copy$default(Permission permission, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = permission.title;
                }
                if ((i11 & 2) != 0) {
                    str2 = permission.subtitle;
                }
                return permission.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final Permission copy(@NotNull String title, @NotNull String subtitle) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                return new Permission(title, subtitle);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Permission)) {
                    return false;
                }
                Permission permission = (Permission) other;
                return Intrinsics.d(this.title, permission.title) && Intrinsics.d(this.subtitle, permission.subtitle);
            }

            @NotNull
            public final String getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.subtitle.hashCode() + (this.title.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return e.a("Permission(title=", this.title, ", subtitle=", this.subtitle, ")");
            }
        }

        public Biometry(Boolean bool, Permission permission, String str, Boolean bool2) {
            this.isNeedToSetBiometry = bool;
            this.permission = permission;
            this.analyticTag = str;
            this.clearDevicePublicKey = bool2;
        }

        public static /* synthetic */ Biometry copy$default(Biometry biometry, Boolean bool, Permission permission, String str, Boolean bool2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = biometry.isNeedToSetBiometry;
            }
            if ((i11 & 2) != 0) {
                permission = biometry.permission;
            }
            if ((i11 & 4) != 0) {
                str = biometry.analyticTag;
            }
            if ((i11 & 8) != 0) {
                bool2 = biometry.clearDevicePublicKey;
            }
            return biometry.copy(bool, permission, str, bool2);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getIsNeedToSetBiometry() {
            return this.isNeedToSetBiometry;
        }

        /* renamed from: component2, reason: from getter */
        public final Permission getPermission() {
            return this.permission;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAnalyticTag() {
            return this.analyticTag;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getClearDevicePublicKey() {
            return this.clearDevicePublicKey;
        }

        @NotNull
        public final Biometry copy(Boolean isNeedToSetBiometry, Permission permission, String analyticTag, Boolean clearDevicePublicKey) {
            return new Biometry(isNeedToSetBiometry, permission, analyticTag, clearDevicePublicKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Biometry)) {
                return false;
            }
            Biometry biometry = (Biometry) other;
            return Intrinsics.d(this.isNeedToSetBiometry, biometry.isNeedToSetBiometry) && Intrinsics.d(this.permission, biometry.permission) && Intrinsics.d(this.analyticTag, biometry.analyticTag) && Intrinsics.d(this.clearDevicePublicKey, biometry.clearDevicePublicKey);
        }

        public final String getAnalyticTag() {
            return this.analyticTag;
        }

        public final Boolean getClearDevicePublicKey() {
            return this.clearDevicePublicKey;
        }

        public final Permission getPermission() {
            return this.permission;
        }

        public int hashCode() {
            Boolean bool = this.isNeedToSetBiometry;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Permission permission = this.permission;
            int hashCode2 = (hashCode + (permission == null ? 0 : permission.hashCode())) * 31;
            String str = this.analyticTag;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool2 = this.clearDevicePublicKey;
            return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final Boolean isNeedToSetBiometry() {
            return this.isNeedToSetBiometry;
        }

        @NotNull
        public String toString() {
            return "Biometry(isNeedToSetBiometry=" + this.isNeedToSetBiometry + ", permission=" + this.permission + ", analyticTag=" + this.analyticTag + ", clearDevicePublicKey=" + this.clearDevicePublicKey + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/domain/session/api/auth/models/Data$DialogBiometry;", "", "isNeedToSetBiometry", "", "permission", "Lru/ozon/app/android/domain/session/api/auth/models/Data$Biometry$Permission;", "analyticTag", "", "<init>", "(ZLru/ozon/app/android/domain/session/api/auth/models/Data$Biometry$Permission;Ljava/lang/String;)V", "()Z", "getPermission", "()Lru/ozon/app/android/domain/session/api/auth/models/Data$Biometry$Permission;", "getAnalyticTag", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DialogBiometry {

        @NotNull
        private final String analyticTag;
        private final boolean isNeedToSetBiometry;

        @NotNull
        private final Biometry.Permission permission;

        public DialogBiometry(boolean z11, @NotNull Biometry.Permission permission, @NotNull String analyticTag) {
            Intrinsics.checkNotNullParameter(permission, "permission");
            Intrinsics.checkNotNullParameter(analyticTag, "analyticTag");
            this.isNeedToSetBiometry = z11;
            this.permission = permission;
            this.analyticTag = analyticTag;
        }

        public static /* synthetic */ DialogBiometry copy$default(DialogBiometry dialogBiometry, boolean z11, Biometry.Permission permission, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = dialogBiometry.isNeedToSetBiometry;
            }
            if ((i11 & 2) != 0) {
                permission = dialogBiometry.permission;
            }
            if ((i11 & 4) != 0) {
                str = dialogBiometry.analyticTag;
            }
            return dialogBiometry.copy(z11, permission, str);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsNeedToSetBiometry() {
            return this.isNeedToSetBiometry;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Biometry.Permission getPermission() {
            return this.permission;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getAnalyticTag() {
            return this.analyticTag;
        }

        @NotNull
        public final DialogBiometry copy(boolean isNeedToSetBiometry, @NotNull Biometry.Permission permission, @NotNull String analyticTag) {
            Intrinsics.checkNotNullParameter(permission, "permission");
            Intrinsics.checkNotNullParameter(analyticTag, "analyticTag");
            return new DialogBiometry(isNeedToSetBiometry, permission, analyticTag);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DialogBiometry)) {
                return false;
            }
            DialogBiometry dialogBiometry = (DialogBiometry) other;
            return this.isNeedToSetBiometry == dialogBiometry.isNeedToSetBiometry && Intrinsics.d(this.permission, dialogBiometry.permission) && Intrinsics.d(this.analyticTag, dialogBiometry.analyticTag);
        }

        @NotNull
        public final String getAnalyticTag() {
            return this.analyticTag;
        }

        @NotNull
        public final Biometry.Permission getPermission() {
            return this.permission;
        }

        public int hashCode() {
            return this.analyticTag.hashCode() + ((this.permission.hashCode() + (Boolean.hashCode(this.isNeedToSetBiometry) * 31)) * 31);
        }

        public final boolean isNeedToSetBiometry() {
            return this.isNeedToSetBiometry;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isNeedToSetBiometry;
            Biometry.Permission permission = this.permission;
            String str = this.analyticTag;
            StringBuilder sb2 = new StringBuilder("DialogBiometry(isNeedToSetBiometry=");
            sb2.append(z11);
            sb2.append(", permission=");
            sb2.append(permission);
            sb2.append(", analyticTag=");
            return o0.c(sb2, str, ")");
        }
    }

    public Data(Object obj, Boolean bool, Biometry biometry, Map<String, ? extends Object> map, AuthMethod authMethod, Map<String, TokenizedTrackingInfo> map2) {
        this.authToken = obj;
        this.isRegister = bool;
        this.biometry = biometry;
        this.postData = map;
        this.authMethod = authMethod;
        this.trackingInfo = map2;
    }

    public static /* synthetic */ Data copy$default(Data data, Object obj, Boolean bool, Biometry biometry, Map map, AuthMethod authMethod, Map map2, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = data.authToken;
        }
        if ((i11 & 2) != 0) {
            bool = data.isRegister;
        }
        if ((i11 & 4) != 0) {
            biometry = data.biometry;
        }
        if ((i11 & 8) != 0) {
            map = data.postData;
        }
        if ((i11 & 16) != 0) {
            authMethod = data.authMethod;
        }
        if ((i11 & 32) != 0) {
            map2 = data.trackingInfo;
        }
        AuthMethod authMethod2 = authMethod;
        Map map3 = map2;
        return data.copy(obj, bool, biometry, map, authMethod2, map3);
    }

    /* renamed from: component1, reason: from getter */
    public final Object getAuthToken() {
        return this.authToken;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsRegister() {
        return this.isRegister;
    }

    /* renamed from: component3, reason: from getter */
    public final Biometry getBiometry() {
        return this.biometry;
    }

    public final Map<String, Object> component4() {
        return this.postData;
    }

    /* renamed from: component5, reason: from getter */
    public final AuthMethod getAuthMethod() {
        return this.authMethod;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final Data copy(Object authToken, Boolean isRegister, Biometry biometry, Map<String, ? extends Object> postData, AuthMethod authMethod, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new Data(authToken, isRegister, biometry, postData, authMethod, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.d(this.authToken, data.authToken) && Intrinsics.d(this.isRegister, data.isRegister) && Intrinsics.d(this.biometry, data.biometry) && Intrinsics.d(this.postData, data.postData) && Intrinsics.d(this.authMethod, data.authMethod) && Intrinsics.d(this.trackingInfo, data.trackingInfo);
    }

    public final AuthMethod getAuthMethod() {
        return this.authMethod;
    }

    public final Object getAuthToken() {
        return this.authToken;
    }

    public final Biometry getBiometry() {
        return this.biometry;
    }

    public final Map<String, Object> getPostData() {
        return this.postData;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        Object obj = this.authToken;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Boolean bool = this.isRegister;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Biometry biometry = this.biometry;
        int hashCode3 = (hashCode2 + (biometry == null ? 0 : biometry.hashCode())) * 31;
        Map<String, Object> map = this.postData;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        AuthMethod authMethod = this.authMethod;
        int hashCode5 = (hashCode4 + (authMethod == null ? 0 : authMethod.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        return hashCode5 + (map2 != null ? map2.hashCode() : 0);
    }

    public final Boolean isRegister() {
        return this.isRegister;
    }

    @NotNull
    public String toString() {
        return "Data(authToken=" + this.authToken + ", isRegister=" + this.isRegister + ", biometry=" + this.biometry + ", postData=" + this.postData + ", authMethod=" + this.authMethod + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
