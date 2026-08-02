package ru.ozon.fintech.auth.network.dto;

import Tl.b;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002!\"B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f¨\u0006#"}, d2 = {"Lru/ozon/fintech/auth/network/dto/AuthLoginResponseErrorDto;", "", "", "message", "", "path", "Lru/ozon/fintech/auth/network/dto/AuthLoginResponseErrorDto$Extensions;", "extensions", "<init>", "(Ljava/lang/String;Ljava/util/List;Lru/ozon/fintech/auth/network/dto/AuthLoginResponseErrorDto$Extensions;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lru/ozon/fintech/auth/network/dto/AuthLoginResponseErrorDto$Extensions;", "copy", "(Ljava/lang/String;Ljava/util/List;Lru/ozon/fintech/auth/network/dto/AuthLoginResponseErrorDto$Extensions;)Lru/ozon/fintech/auth/network/dto/AuthLoginResponseErrorDto;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Ljava/util/List;", "getPath", "Lru/ozon/fintech/auth/network/dto/AuthLoginResponseErrorDto$Extensions;", "getExtensions", "Companion", "a", "Extensions", "fintech-auth_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AuthLoginResponseErrorDto {

    @NotNull
    public static final String DBO_BLOCKED_NEED_CHANGE_PIN_CODE = "DBO_BLOCKED_NEED_CHANGE_PIN_CODE";

    @NotNull
    public static final String EMPTY_BANK_PHONE = "EMPTY_BANK_PHONE";

    @NotNull
    public static final String INCORRECT_PIN_CODE = "INCORRECT_PIN_CODE";

    @NotNull
    public static final String LOGIN_THROTTLED = "LOGIN_THROTTLED";

    @NotNull
    public static final String NEED_USE_PASSWORD = "NEED_USE_PASSWORD";

    @NotNull
    public static final String WRONG_PASSWORD = "WRONG_PASSWORD";

    @i(name = "extensions")
    private final Extensions extensions;

    @i(name = "message")
    private final String message;

    @i(name = "path")
    private final List<String> path;

    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/fintech/auth/network/dto/AuthLoginResponseErrorDto$Extensions;", "", "type", "", "statusCode", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getType", "()Ljava/lang/String;", "getStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/fintech/auth/network/dto/AuthLoginResponseErrorDto$Extensions;", "equals", "", "other", "hashCode", "toString", "fintech-auth_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Extensions {

        @i(name = "statusCode")
        private final Integer statusCode;

        @i(name = "type")
        private final String type;

        public Extensions(String str, Integer num) {
            this.type = str;
            this.statusCode = num;
        }

        public static /* synthetic */ Extensions copy$default(Extensions extensions, String str, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = extensions.type;
            }
            if ((i11 & 2) != 0) {
                num = extensions.statusCode;
            }
            return extensions.copy(str, num);
        }

        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getStatusCode() {
            return this.statusCode;
        }

        @NotNull
        public final Extensions copy(String type, Integer statusCode) {
            return new Extensions(type, statusCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Extensions)) {
                return false;
            }
            Extensions extensions = (Extensions) other;
            return Intrinsics.d(this.type, extensions.type) && Intrinsics.d(this.statusCode, extensions.statusCode);
        }

        public final Integer getStatusCode() {
            return this.statusCode;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.type;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.statusCode;
            return hashCode + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Extensions(type=" + this.type + ", statusCode=" + this.statusCode + ")";
        }
    }

    public AuthLoginResponseErrorDto(String str, List<String> list, Extensions extensions) {
        this.message = str;
        this.path = list;
        this.extensions = extensions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthLoginResponseErrorDto copy$default(AuthLoginResponseErrorDto authLoginResponseErrorDto, String str, List list, Extensions extensions, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = authLoginResponseErrorDto.message;
        }
        if ((i11 & 2) != 0) {
            list = authLoginResponseErrorDto.path;
        }
        if ((i11 & 4) != 0) {
            extensions = authLoginResponseErrorDto.extensions;
        }
        return authLoginResponseErrorDto.copy(str, list, extensions);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final List<String> component2() {
        return this.path;
    }

    /* renamed from: component3, reason: from getter */
    public final Extensions getExtensions() {
        return this.extensions;
    }

    @NotNull
    public final AuthLoginResponseErrorDto copy(String message, List<String> path, Extensions extensions) {
        return new AuthLoginResponseErrorDto(message, path, extensions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthLoginResponseErrorDto)) {
            return false;
        }
        AuthLoginResponseErrorDto authLoginResponseErrorDto = (AuthLoginResponseErrorDto) other;
        return Intrinsics.d(this.message, authLoginResponseErrorDto.message) && Intrinsics.d(this.path, authLoginResponseErrorDto.path) && Intrinsics.d(this.extensions, authLoginResponseErrorDto.extensions);
    }

    public final Extensions getExtensions() {
        return this.extensions;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<String> getPath() {
        return this.path;
    }

    public int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.path;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Extensions extensions = this.extensions;
        return hashCode2 + (extensions != null ? extensions.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.message;
        List<String> list = this.path;
        Extensions extensions = this.extensions;
        StringBuilder f7 = b.f("AuthLoginResponseErrorDto(message=", str, ", path=", ", extensions=", list);
        f7.append(extensions);
        f7.append(")");
        return f7.toString();
    }
}
