package ru.ozon.fintech.ui.screenstateV20;

import Kk.C3532b;
import Lh.a;
import android.content.Context;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.fintech.ui.button.large.FinLargeButtonState;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lru/ozon/fintech/ui/screenstateV20/ScreenStateV20;", "", "<init>", "()V", "Error", "Progress", "Empty", "Companion", "Lru/ozon/fintech/ui/screenstateV20/ScreenStateV20$Empty;", "Lru/ozon/fintech/ui/screenstateV20/ScreenStateV20$Error;", "Lru/ozon/fintech/ui/screenstateV20/ScreenStateV20$Progress;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ScreenStateV20 {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long DEFAULT_PROGRESS_DELAY = 300;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011J\u001c\u0010\u0012\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fJ,\u0010\u0013\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\u0014\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/fintech/ui/screenstateV20/ScreenStateV20$Companion;", "", "<init>", "()V", "DEFAULT_PROGRESS_DELAY", "", "getNetworkError", "Lru/ozon/fintech/ui/screenstateV20/ScreenStateV20$Error;", "buttAction", "Lkotlin/Function0;", "", "context", "Landroid/content/Context;", "getProgress", "Lru/ozon/fintech/ui/screenstateV20/ScreenStateV20$Progress;", "delay", "isAfterError", "", "getGeneralError", "getError", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Progress getProgress$default(Companion companion, long j11, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = 300;
            }
            return companion.getProgress(j11, z11);
        }

        @NotNull
        public final Error getError(@NotNull Function0<Unit> buttAction, @NotNull Context context, Exception e11) {
            Intrinsics.checkNotNullParameter(buttAction, "buttAction");
            Intrinsics.checkNotNullParameter(context, "context");
            return e11 instanceof IOException ? getNetworkError(buttAction, context) : getGeneralError(buttAction, context);
        }

        @NotNull
        public final Error getGeneralError(@NotNull Function0<Unit> buttAction, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(buttAction, "buttAction");
            Intrinsics.checkNotNullParameter(context, "context");
            Integer valueOf = Integer.valueOf(R.drawable.ic_unknown_error);
            String string = context.getString(R.string.fintech_ui_error_common_error_technical_error_title);
            String string2 = context.getString(R.string.fintech_ui_error_no_technical_error_description);
            String string3 = context.getString(R.string.fintech_ui_error_no_action_button);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return new Error(valueOf, string, string2, new FinLargeButtonState("state_butt", string3, buttAction, null, FinLargeButtonState.Type.PRIMARY, null, null, null, null, 488, null), false, null, 48, null);
        }

        @NotNull
        public final Error getNetworkError(@NotNull Function0<Unit> buttAction, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(buttAction, "buttAction");
            Intrinsics.checkNotNullParameter(context, "context");
            Integer valueOf = Integer.valueOf(R.drawable.ic_network_error);
            String string = context.getString(R.string.fintech_ui_error_no_connection_title);
            String string2 = context.getString(R.string.fintech_ui_error_no_connection_description);
            String string3 = context.getString(R.string.fintech_ui_error_no_update_button);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return new Error(valueOf, string, string2, new FinLargeButtonState("state_butt", string3, buttAction, null, FinLargeButtonState.Type.PRIMARY, null, null, null, null, 488, null), false, null, 48, null);
        }

        @NotNull
        public final Progress getProgress(long delay, boolean isAfterError) {
            return new Progress(delay, null, new FinLargeButtonState("state_butt", "", null, null, FinLargeButtonState.Type.PRIMARY, null, null, null, null, 492, null), isAfterError, 2, null);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J>\u0010\u0017\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/fintech/ui/screenstateV20/ScreenStateV20$Empty;", "Lru/ozon/fintech/ui/screenstateV20/ScreenStateV20;", "icon", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "description", "butt", "Lru/ozon/fintech/ui/button/large/FinLargeButtonState;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/ui/button/large/FinLargeButtonState;)V", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "()Ljava/lang/String;", "getDescription", "getButt", "()Lru/ozon/fintech/ui/button/large/FinLargeButtonState;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/ui/button/large/FinLargeButtonState;)Lru/ozon/fintech/ui/screenstateV20/ScreenStateV20$Empty;", "equals", "", "other", "", "hashCode", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Empty extends ScreenStateV20 {
        private final FinLargeButtonState butt;
        private final String description;
        private final Integer icon;
        private final String title;

        public Empty(Integer num, String str, String str2, FinLargeButtonState finLargeButtonState) {
            super(null);
            this.icon = num;
            this.title = str;
            this.description = str2;
            this.butt = finLargeButtonState;
        }

        public static /* synthetic */ Empty copy$default(Empty empty, Integer num, String str, String str2, FinLargeButtonState finLargeButtonState, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = empty.icon;
            }
            if ((i11 & 2) != 0) {
                str = empty.title;
            }
            if ((i11 & 4) != 0) {
                str2 = empty.description;
            }
            if ((i11 & 8) != 0) {
                finLargeButtonState = empty.butt;
            }
            return empty.copy(num, str, str2, finLargeButtonState);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final FinLargeButtonState getButt() {
            return this.butt;
        }

        @NotNull
        public final Empty copy(Integer icon, String title, String description, FinLargeButtonState butt) {
            return new Empty(icon, title, description, butt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Empty)) {
                return false;
            }
            Empty empty = (Empty) other;
            return Intrinsics.d(this.icon, empty.icon) && Intrinsics.d(this.title, empty.title) && Intrinsics.d(this.description, empty.description) && Intrinsics.d(this.butt, empty.butt);
        }

        public final FinLargeButtonState getButt() {
            return this.butt;
        }

        public final String getDescription() {
            return this.description;
        }

        public final Integer getIcon() {
            return this.icon;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            Integer num = this.icon;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.title;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            FinLargeButtonState finLargeButtonState = this.butt;
            return hashCode3 + (finLargeButtonState != null ? finLargeButtonState.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Empty(icon=" + this.icon + ", title=" + this.title + ", description=" + this.description + ", butt=" + this.butt + ")";
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JZ\u0010!\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0018R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lru/ozon/fintech/ui/screenstateV20/ScreenStateV20$Error;", "Lru/ozon/fintech/ui/screenstateV20/ScreenStateV20;", "icon", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "description", "butt", "Lru/ozon/fintech/ui/button/large/FinLargeButtonState;", "isClosable", "", "closeButtAction", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/ui/button/large/FinLargeButtonState;ZLkotlin/jvm/functions/Function0;)V", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "()Ljava/lang/String;", "getDescription", "getButt", "()Lru/ozon/fintech/ui/button/large/FinLargeButtonState;", "()Z", "getCloseButtAction", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/ui/button/large/FinLargeButtonState;ZLkotlin/jvm/functions/Function0;)Lru/ozon/fintech/ui/screenstateV20/ScreenStateV20$Error;", "equals", "other", "", "hashCode", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends ScreenStateV20 {
        private final FinLargeButtonState butt;
        private final Function0<Unit> closeButtAction;
        private final String description;
        private final Integer icon;
        private final boolean isClosable;
        private final String title;

        public /* synthetic */ Error(Integer num, String str, String str2, FinLargeButtonState finLargeButtonState, boolean z11, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, str, str2, finLargeButtonState, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? null : function0);
        }

        public static /* synthetic */ Error copy$default(Error error, Integer num, String str, String str2, FinLargeButtonState finLargeButtonState, boolean z11, Function0 function0, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = error.icon;
            }
            if ((i11 & 2) != 0) {
                str = error.title;
            }
            if ((i11 & 4) != 0) {
                str2 = error.description;
            }
            if ((i11 & 8) != 0) {
                finLargeButtonState = error.butt;
            }
            if ((i11 & 16) != 0) {
                z11 = error.isClosable;
            }
            if ((i11 & 32) != 0) {
                function0 = error.closeButtAction;
            }
            boolean z12 = z11;
            Function0 function02 = function0;
            return error.copy(num, str, str2, finLargeButtonState, z12, function02);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final FinLargeButtonState getButt() {
            return this.butt;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsClosable() {
            return this.isClosable;
        }

        public final Function0<Unit> component6() {
            return this.closeButtAction;
        }

        @NotNull
        public final Error copy(Integer icon, String title, String description, FinLargeButtonState butt, boolean isClosable, Function0<Unit> closeButtAction) {
            return new Error(icon, title, description, butt, isClosable, closeButtAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.d(this.icon, error.icon) && Intrinsics.d(this.title, error.title) && Intrinsics.d(this.description, error.description) && Intrinsics.d(this.butt, error.butt) && this.isClosable == error.isClosable && Intrinsics.d(this.closeButtAction, error.closeButtAction);
        }

        public final FinLargeButtonState getButt() {
            return this.butt;
        }

        public final Function0<Unit> getCloseButtAction() {
            return this.closeButtAction;
        }

        public final String getDescription() {
            return this.description;
        }

        public final Integer getIcon() {
            return this.icon;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            Integer num = this.icon;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.title;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            FinLargeButtonState finLargeButtonState = this.butt;
            int a11 = C3532b.a((hashCode3 + (finLargeButtonState == null ? 0 : finLargeButtonState.hashCode())) * 31, 31, this.isClosable);
            Function0<Unit> function0 = this.closeButtAction;
            return a11 + (function0 != null ? function0.hashCode() : 0);
        }

        public final boolean isClosable() {
            return this.isClosable;
        }

        @NotNull
        public String toString() {
            return "Error(icon=" + this.icon + ", title=" + this.title + ", description=" + this.description + ", butt=" + this.butt + ", isClosable=" + this.isClosable + ", closeButtAction=" + this.closeButtAction + ")";
        }

        public Error(Integer num, String str, String str2, FinLargeButtonState finLargeButtonState, boolean z11, Function0<Unit> function0) {
            super(null);
            this.icon = num;
            this.title = str;
            this.description = str2;
            this.butt = finLargeButtonState;
            this.isClosable = z11;
            this.closeButtAction = function0;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J8\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/fintech/ui/screenstateV20/ScreenStateV20$Progress;", "Lru/ozon/fintech/ui/screenstateV20/ScreenStateV20;", "delayedProgress", "", "color", "", "butt", "Lru/ozon/fintech/ui/button/large/FinLargeButtonState;", "isAfterError", "", "<init>", "(JLjava/lang/Integer;Lru/ozon/fintech/ui/button/large/FinLargeButtonState;Z)V", "getDelayedProgress", "()J", "getColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getButt", "()Lru/ozon/fintech/ui/button/large/FinLargeButtonState;", "()Z", "component1", "component2", "component3", "component4", "copy", "(JLjava/lang/Integer;Lru/ozon/fintech/ui/button/large/FinLargeButtonState;Z)Lru/ozon/fintech/ui/screenstateV20/ScreenStateV20$Progress;", "equals", "other", "", "hashCode", "toString", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Progress extends ScreenStateV20 {

        @NotNull
        private final FinLargeButtonState butt;
        private final Integer color;
        private final long delayedProgress;
        private final boolean isAfterError;

        public /* synthetic */ Progress(long j11, Integer num, FinLargeButtonState finLargeButtonState, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 300L : j11, (i11 & 2) != 0 ? null : num, finLargeButtonState, z11);
        }

        public static /* synthetic */ Progress copy$default(Progress progress, long j11, Integer num, FinLargeButtonState finLargeButtonState, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = progress.delayedProgress;
            }
            long j12 = j11;
            if ((i11 & 2) != 0) {
                num = progress.color;
            }
            Integer num2 = num;
            if ((i11 & 4) != 0) {
                finLargeButtonState = progress.butt;
            }
            FinLargeButtonState finLargeButtonState2 = finLargeButtonState;
            if ((i11 & 8) != 0) {
                z11 = progress.isAfterError;
            }
            return progress.copy(j12, num2, finLargeButtonState2, z11);
        }

        /* renamed from: component1, reason: from getter */
        public final long getDelayedProgress() {
            return this.delayedProgress;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getColor() {
            return this.color;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final FinLargeButtonState getButt() {
            return this.butt;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsAfterError() {
            return this.isAfterError;
        }

        @NotNull
        public final Progress copy(long delayedProgress, Integer color, @NotNull FinLargeButtonState butt, boolean isAfterError) {
            Intrinsics.checkNotNullParameter(butt, "butt");
            return new Progress(delayedProgress, color, butt, isAfterError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) other;
            return this.delayedProgress == progress.delayedProgress && Intrinsics.d(this.color, progress.color) && Intrinsics.d(this.butt, progress.butt) && this.isAfterError == progress.isAfterError;
        }

        @NotNull
        public final FinLargeButtonState getButt() {
            return this.butt;
        }

        public final Integer getColor() {
            return this.color;
        }

        public final long getDelayedProgress() {
            return this.delayedProgress;
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.delayedProgress) * 31;
            Integer num = this.color;
            return Boolean.hashCode(this.isAfterError) + ((this.butt.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31);
        }

        public final boolean isAfterError() {
            return this.isAfterError;
        }

        @NotNull
        public String toString() {
            long j11 = this.delayedProgress;
            Integer num = this.color;
            FinLargeButtonState finLargeButtonState = this.butt;
            boolean z11 = this.isAfterError;
            StringBuilder c11 = a.c("Progress(delayedProgress=", j11, ", color=", num);
            c11.append(", butt=");
            c11.append(finLargeButtonState);
            c11.append(", isAfterError=");
            c11.append(z11);
            c11.append(")");
            return c11.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Progress(long j11, Integer num, @NotNull FinLargeButtonState butt, boolean z11) {
            super(null);
            Intrinsics.checkNotNullParameter(butt, "butt");
            this.delayedProgress = j11;
            this.color = num;
            this.butt = butt;
            this.isAfterError = z11;
        }
    }

    public /* synthetic */ ScreenStateV20(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ScreenStateV20() {
    }
}
