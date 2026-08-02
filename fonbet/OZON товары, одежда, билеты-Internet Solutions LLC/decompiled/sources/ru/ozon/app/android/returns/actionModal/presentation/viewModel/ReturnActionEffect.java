package ru.ozon.app.android.returns.actionModal.presentation.viewModel;

import B0.A0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.actionModal.data.dto.processReturnAction.ProcessReturnActionResponseDto;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/returns/actionModal/presentation/viewModel/ReturnActionEffect;", "", "<init>", "()V", "RequiredFields", "ShowError", "ExecuteAction", "Lru/ozon/app/android/returns/actionModal/presentation/viewModel/ReturnActionEffect$ExecuteAction;", "Lru/ozon/app/android/returns/actionModal/presentation/viewModel/ReturnActionEffect$RequiredFields;", "Lru/ozon/app/android/returns/actionModal/presentation/viewModel/ReturnActionEffect$ShowError;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ReturnActionEffect {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/returns/actionModal/presentation/viewModel/ReturnActionEffect$ExecuteAction;", "Lru/ozon/app/android/returns/actionModal/presentation/viewModel/ReturnActionEffect;", "Lru/ozon/app/android/returns/actionModal/data/dto/processReturnAction/ProcessReturnActionResponseDto;", "dto", "<init>", "(Lru/ozon/app/android/returns/actionModal/data/dto/processReturnAction/ProcessReturnActionResponseDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/returns/actionModal/data/dto/processReturnAction/ProcessReturnActionResponseDto;", "getDto", "()Lru/ozon/app/android/returns/actionModal/data/dto/processReturnAction/ProcessReturnActionResponseDto;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ExecuteAction extends ReturnActionEffect {

        @NotNull
        private final ProcessReturnActionResponseDto dto;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExecuteAction(@NotNull ProcessReturnActionResponseDto dto) {
            super(null);
            Intrinsics.checkNotNullParameter(dto, "dto");
            this.dto = dto;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExecuteAction) && Intrinsics.d(this.dto, ((ExecuteAction) other).dto);
        }

        @NotNull
        public final ProcessReturnActionResponseDto getDto() {
            return this.dto;
        }

        public int hashCode() {
            return this.dto.hashCode();
        }

        @NotNull
        public String toString() {
            return "ExecuteAction(dto=" + this.dto + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/returns/actionModal/presentation/viewModel/ReturnActionEffect$RequiredFields;", "Lru/ozon/app/android/returns/actionModal/presentation/viewModel/ReturnActionEffect;", "", "", "keys", "<init>", "(Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Set;", "getKeys", "()Ljava/util/Set;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RequiredFields extends ReturnActionEffect {

        @NotNull
        private final Set<String> keys;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequiredFields(@NotNull Set<String> keys) {
            super(null);
            Intrinsics.checkNotNullParameter(keys, "keys");
            this.keys = keys;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RequiredFields) && Intrinsics.d(this.keys, ((RequiredFields) other).keys);
        }

        @NotNull
        public final Set<String> getKeys() {
            return this.keys;
        }

        public int hashCode() {
            return this.keys.hashCode();
        }

        @NotNull
        public String toString() {
            return "RequiredFields(keys=" + this.keys + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/returns/actionModal/presentation/viewModel/ReturnActionEffect$ShowError;", "Lru/ozon/app/android/returns/actionModal/presentation/viewModel/ReturnActionEffect;", "", "error", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getError", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowError extends ReturnActionEffect {
        private final String error;

        public ShowError(String str) {
            super(null);
            this.error = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowError) && Intrinsics.d(this.error, ((ShowError) other).error);
        }

        public final String getError() {
            return this.error;
        }

        public int hashCode() {
            String str = this.error;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("ShowError(error=", this.error, ")");
        }
    }

    public /* synthetic */ ReturnActionEffect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ReturnActionEffect() {
    }
}
