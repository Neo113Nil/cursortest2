package ru.ozon.fintech.ui.screenstate;

import Kk.C3532b;
import Lh.a;
import Pk0.f;
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
import ru.ozon.fintech.ui.button.small.FinSmallButtonState;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lru/ozon/fintech/ui/screenstate/ScreenState;", "", "<init>", "()V", "Error", "Progress", "Empty", "Companion", "Lru/ozon/fintech/ui/screenstate/ScreenState$Empty;", "Lru/ozon/fintech/ui/screenstate/ScreenState$Error;", "Lru/ozon/fintech/ui/screenstate/ScreenState$Progress;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ScreenState {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long DEFAULT_PROGRESS_DELAY = 300;

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fJ&\u0010\r\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ,\u0010\u0010\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\u0011\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013JF\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tJ\u000e\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016J\u001c\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lru/ozon/fintech/ui/screenstate/ScreenState$Companion;", "", "<init>", "()V", "DEFAULT_PROGRESS_DELAY", "", "getNetworkError", "Lru/ozon/fintech/ui/screenstate/ScreenState$Error;", "buttAction", "Lkotlin/Function0;", "", "context", "Landroid/content/Context;", "getGeneralError", "buttonType", "Lru/ozon/fintech/ui/button/small/FinSmallButtonState$Type;", "getError", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getPermissionError", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "description", "buttonTitle", "isClosable", "", "closeButtAction", "getPermissionNotDeclaredError", "getGeneralEmpty", "Lru/ozon/fintech/ui/screenstate/ScreenState$Empty;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Error getGeneralError$default(Companion companion, Function0 function0, Context context, FinSmallButtonState.Type type, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                type = FinSmallButtonState.Type.SECONDARY;
            }
            return companion.getGeneralError(function0, context, type);
        }

        public static /* synthetic */ Error getPermissionError$default(Companion companion, String str, String str2, String str3, boolean z11, Function0 function0, Function0 function02, int i11, Object obj) {
            if ((i11 & 32) != 0) {
                function02 = null;
            }
            return companion.getPermissionError(str, str2, str3, z11, function0, function02);
        }

        @NotNull
        public final Error getError(@NotNull Function0<Unit> buttAction, @NotNull Context context, Exception e11) {
            Intrinsics.checkNotNullParameter(buttAction, "buttAction");
            Intrinsics.checkNotNullParameter(context, "context");
            return e11 instanceof IOException ? getNetworkError(buttAction, context) : getGeneralError$default(this, buttAction, context, null, 4, null);
        }

        @NotNull
        public final Empty getGeneralEmpty(@NotNull Context context, @NotNull Function0<Unit> buttAction) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(buttAction, "buttAction");
            Integer valueOf = Integer.valueOf(R.drawable.fintech_ic_errors_state);
            String string = context.getString(R.string.fintech_general_empty);
            String string2 = context.getString(R.string.fintech_general_empty_description);
            String string3 = context.getString(R.string.fintech_ui_error_common_error_action_button);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return new Empty(valueOf, string, string2, new FinSmallButtonState("state_butt", string3, buttAction, null, FinSmallButtonState.Type.SECONDARY, null, 40, null));
        }

        @NotNull
        public final Error getGeneralError(@NotNull Function0<Unit> buttAction, @NotNull Context context, @NotNull FinSmallButtonState.Type buttonType) {
            Intrinsics.checkNotNullParameter(buttAction, "buttAction");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(buttonType, "buttonType");
            Integer valueOf = Integer.valueOf(R.drawable.fintech_ic_errors_state);
            String string = context.getString(R.string.fintech_ui_error_common_error_technical_error_title);
            String string2 = context.getString(R.string.fintech_ui_error_uikit_error_technical_error_description);
            String string3 = context.getString(R.string.fintech_ui_error_common_error_action_button);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return new Error(valueOf, string, string2, new FinSmallButtonState("state_butt", string3, buttAction, null, buttonType, null, 40, null), false, false, null, 112, null);
        }

        @NotNull
        public final Error getNetworkError(@NotNull Function0<Unit> buttAction, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(buttAction, "buttAction");
            Intrinsics.checkNotNullParameter(context, "context");
            Integer valueOf = Integer.valueOf(R.drawable.fintech_ic_no_network_state);
            String string = context.getString(R.string.fintech_ui_error_common_error_no_connection_title);
            String string2 = context.getString(R.string.fintech_ui_error_common_error_no_connection_description);
            String string3 = context.getString(R.string.fintech_ui_error_common_error_action_button);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return new Error(valueOf, string, string2, new FinSmallButtonState("state_butt", string3, buttAction, null, FinSmallButtonState.Type.SECONDARY, null, 40, null), false, false, null, 112, null);
        }

        @NotNull
        public final Error getPermissionError(@NotNull String title, @NotNull String description, @NotNull String buttonTitle, boolean isClosable, @NotNull Function0<Unit> buttAction, Function0<Unit> closeButtAction) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
            Intrinsics.checkNotNullParameter(buttAction, "buttAction");
            return new Error(Integer.valueOf(R.drawable.fintech_ic_errors_state), title, description, new FinSmallButtonState("state_butt", buttonTitle, buttAction, null, FinSmallButtonState.Type.SECONDARY, null, 40, null), isClosable, false, closeButtAction, 32, null);
        }

        @NotNull
        public final Error getPermissionNotDeclaredError(@NotNull String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Error(Integer.valueOf(R.drawable.fintech_ic_errors_state), title, "", null, false, false, null, 96, null);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J>\u0010\u0017\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/fintech/ui/screenstate/ScreenState$Empty;", "Lru/ozon/fintech/ui/screenstate/ScreenState;", "icon", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "description", "butt", "Lru/ozon/fintech/ui/button/small/FinSmallButtonState;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/ui/button/small/FinSmallButtonState;)V", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "()Ljava/lang/String;", "getDescription", "getButt", "()Lru/ozon/fintech/ui/button/small/FinSmallButtonState;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/ui/button/small/FinSmallButtonState;)Lru/ozon/fintech/ui/screenstate/ScreenState$Empty;", "equals", "", "other", "", "hashCode", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Empty extends ScreenState {
        private final FinSmallButtonState butt;
        private final String description;
        private final Integer icon;
        private final String title;

        public Empty(Integer num, String str, String str2, FinSmallButtonState finSmallButtonState) {
            super(null);
            this.icon = num;
            this.title = str;
            this.description = str2;
            this.butt = finSmallButtonState;
        }

        public static /* synthetic */ Empty copy$default(Empty empty, Integer num, String str, String str2, FinSmallButtonState finSmallButtonState, int i11, Object obj) {
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
                finSmallButtonState = empty.butt;
            }
            return empty.copy(num, str, str2, finSmallButtonState);
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
        public final FinSmallButtonState getButt() {
            return this.butt;
        }

        @NotNull
        public final Empty copy(Integer icon, String title, String description, FinSmallButtonState butt) {
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

        public final FinSmallButtonState getButt() {
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
            FinSmallButtonState finSmallButtonState = this.butt;
            return hashCode3 + (finSmallButtonState != null ? finSmallButtonState.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Empty(icon=" + this.icon + ", title=" + this.title + ", description=" + this.description + ", butt=" + this.butt + ")";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jd\u0010$\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lru/ozon/fintech/ui/screenstate/ScreenState$Error;", "Lru/ozon/fintech/ui/screenstate/ScreenState;", "icon", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "description", "butt", "Lru/ozon/fintech/ui/button/small/FinSmallButtonState;", "isClosable", "", "blackBack", "closeButtAction", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/ui/button/small/FinSmallButtonState;ZZLkotlin/jvm/functions/Function0;)V", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "()Ljava/lang/String;", "getDescription", "getButt", "()Lru/ozon/fintech/ui/button/small/FinSmallButtonState;", "()Z", "getBlackBack", "getCloseButtAction", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/ui/button/small/FinSmallButtonState;ZZLkotlin/jvm/functions/Function0;)Lru/ozon/fintech/ui/screenstate/ScreenState$Error;", "equals", "other", "", "hashCode", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends ScreenState {
        private final boolean blackBack;
        private final FinSmallButtonState butt;
        private final Function0<Unit> closeButtAction;
        private final String description;
        private final Integer icon;
        private final boolean isClosable;
        private final String title;

        public /* synthetic */ Error(Integer num, String str, String str2, FinSmallButtonState finSmallButtonState, boolean z11, boolean z12, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, str, str2, finSmallButtonState, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? false : z12, (i11 & 64) != 0 ? null : function0);
        }

        public static /* synthetic */ Error copy$default(Error error, Integer num, String str, String str2, FinSmallButtonState finSmallButtonState, boolean z11, boolean z12, Function0 function0, int i11, Object obj) {
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
                finSmallButtonState = error.butt;
            }
            if ((i11 & 16) != 0) {
                z11 = error.isClosable;
            }
            if ((i11 & 32) != 0) {
                z12 = error.blackBack;
            }
            if ((i11 & 64) != 0) {
                function0 = error.closeButtAction;
            }
            boolean z13 = z12;
            Function0 function02 = function0;
            boolean z14 = z11;
            String str3 = str2;
            return error.copy(num, str, str3, finSmallButtonState, z14, z13, function02);
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
        public final FinSmallButtonState getButt() {
            return this.butt;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsClosable() {
            return this.isClosable;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getBlackBack() {
            return this.blackBack;
        }

        public final Function0<Unit> component7() {
            return this.closeButtAction;
        }

        @NotNull
        public final Error copy(Integer icon, String title, String description, FinSmallButtonState butt, boolean isClosable, boolean blackBack, Function0<Unit> closeButtAction) {
            return new Error(icon, title, description, butt, isClosable, blackBack, closeButtAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.d(this.icon, error.icon) && Intrinsics.d(this.title, error.title) && Intrinsics.d(this.description, error.description) && Intrinsics.d(this.butt, error.butt) && this.isClosable == error.isClosable && this.blackBack == error.blackBack && Intrinsics.d(this.closeButtAction, error.closeButtAction);
        }

        public final boolean getBlackBack() {
            return this.blackBack;
        }

        public final FinSmallButtonState getButt() {
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
            FinSmallButtonState finSmallButtonState = this.butt;
            int a11 = C3532b.a(C3532b.a((hashCode3 + (finSmallButtonState == null ? 0 : finSmallButtonState.hashCode())) * 31, 31, this.isClosable), 31, this.blackBack);
            Function0<Unit> function0 = this.closeButtAction;
            return a11 + (function0 != null ? function0.hashCode() : 0);
        }

        public final boolean isClosable() {
            return this.isClosable;
        }

        @NotNull
        public String toString() {
            Integer num = this.icon;
            String str = this.title;
            String str2 = this.description;
            FinSmallButtonState finSmallButtonState = this.butt;
            boolean z11 = this.isClosable;
            boolean z12 = this.blackBack;
            Function0<Unit> function0 = this.closeButtAction;
            StringBuilder sb2 = new StringBuilder("Error(icon=");
            sb2.append(num);
            sb2.append(", title=");
            sb2.append(str);
            sb2.append(", description=");
            sb2.append(str2);
            sb2.append(", butt=");
            sb2.append(finSmallButtonState);
            sb2.append(", isClosable=");
            f.c(", blackBack=", ", closeButtAction=", sb2, z11, z12);
            sb2.append(function0);
            sb2.append(")");
            return sb2.toString();
        }

        public Error(Integer num, String str, String str2, FinSmallButtonState finSmallButtonState, boolean z11, boolean z12, Function0<Unit> function0) {
            super(null);
            this.icon = num;
            this.title = str;
            this.description = str2;
            this.butt = finSmallButtonState;
            this.isClosable = z11;
            this.blackBack = z12;
            this.closeButtAction = function0;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/fintech/ui/screenstate/ScreenState$Progress;", "Lru/ozon/fintech/ui/screenstate/ScreenState;", "delayedProgress", "", "color", "", "<init>", "(JLjava/lang/Integer;)V", "getDelayedProgress", "()J", "getColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(JLjava/lang/Integer;)Lru/ozon/fintech/ui/screenstate/ScreenState$Progress;", "equals", "", "other", "", "hashCode", "toString", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Progress extends ScreenState {
        private final Integer color;
        private final long delayedProgress;

        public Progress() {
            this(0L, null, 3, null);
        }

        public static /* synthetic */ Progress copy$default(Progress progress, long j11, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = progress.delayedProgress;
            }
            if ((i11 & 2) != 0) {
                num = progress.color;
            }
            return progress.copy(j11, num);
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
        public final Progress copy(long delayedProgress, Integer color) {
            return new Progress(delayedProgress, color);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) other;
            return this.delayedProgress == progress.delayedProgress && Intrinsics.d(this.color, progress.color);
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
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            StringBuilder c11 = a.c("Progress(delayedProgress=", this.delayedProgress, ", color=", this.color);
            c11.append(")");
            return c11.toString();
        }

        public /* synthetic */ Progress(long j11, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 300L : j11, (i11 & 2) != 0 ? null : num);
        }

        public Progress(long j11, Integer num) {
            super(null);
            this.delayedProgress = j11;
            this.color = num;
        }
    }

    public /* synthetic */ ScreenState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ScreenState() {
    }
}
