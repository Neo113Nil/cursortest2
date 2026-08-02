package ru.ozon.uni.android.input.textinput.data;

import B0.C2454a;
import G.g;
import K00.b;
import Kk.C3532b;
import N3.C3660k;
import Ql.c;
import android.text.method.TransformationMethod;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0081\b\u0018\u00002\u00020\u0001:\u0001=B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b+\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b\u000b\u0010-R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b.\u0010-R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b3\u0010\u001cR\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b4\u0010*R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b5\u0010\u001eR\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b6\u0010-R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010:\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel;", "", "Lru/ozon/uni/android/input/textinput/data/TextInputStyle;", "style", "", "keyboardType", "keyboardAction", "", "borderSize", "borderColor", "", "isActive", "hasFocus", "", "inputText", "", "labelText", "inputAlpha", "textInputColor", "hasLockImage", "", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton;", "actionButtons", "Landroid/text/method/TransformationMethod;", "transformationMethod", "<init>", "(Lru/ozon/uni/android/input/textinput/data/TextInputStyle;IIFIZZLjava/lang/CharSequence;Ljava/lang/String;FIZLjava/util/List;Landroid/text/method/TransformationMethod;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/input/textinput/data/TextInputStyle;", "getStyle", "()Lru/ozon/uni/android/input/textinput/data/TextInputStyle;", "I", "getKeyboardType", "getKeyboardAction", "F", "getBorderSize", "()F", "getBorderColor", "Z", "()Z", "getHasFocus", "Ljava/lang/CharSequence;", "getInputText", "()Ljava/lang/CharSequence;", "Ljava/lang/String;", "getLabelText", "getInputAlpha", "getTextInputColor", "getHasLockImage", "Ljava/util/List;", "getActionButtons", "()Ljava/util/List;", "Landroid/text/method/TransformationMethod;", "getTransformationMethod", "()Landroid/text/method/TransformationMethod;", "ActionButton", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OzonTextInputUIModel {

    @NotNull
    private final List<ActionButton> actionButtons;
    private final int borderColor;
    private final float borderSize;
    private final boolean hasFocus;
    private final boolean hasLockImage;
    private final float inputAlpha;

    @NotNull
    private final CharSequence inputText;
    private final boolean isActive;
    private final int keyboardAction;
    private final int keyboardType;

    @NotNull
    private final String labelText;

    @NotNull
    private final TextInputStyle style;
    private final int textInputColor;

    @NotNull
    private final TransformationMethod transformationMethod;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00132\u00020\u0001:\u0006\u000e\u000f\u0010\u0011\u0012\u0013B#\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u0082\u0001\u0005\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton;", "", "icon", "", "sortingId", "", "tintColorResId", "<init>", "(Ljava/lang/String;II)V", "getIcon", "()Ljava/lang/String;", "getSortingId", "()I", "getTintColorResId", "Copy", "Password", "Info", "Reset", "Success", "Companion", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton$Copy;", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton$Info;", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton$Password;", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton$Reset;", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton$Success;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ActionButton {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String icon;
        private final int sortingId;
        private final int tintColorResId;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton$Companion;", "", "<init>", "()V", "createCopyButtonModel", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton$Copy;", "createHiddenPasswordState", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton$Password;", "createVisiblePasswordState", "createInfoButtonModel", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton$Info;", "createResetButtonModel", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton$Reset;", "createSuccessButtonModel", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton$Success;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Copy createCopyButtonModel() {
                return new Copy("ic_m_copy_filled", 2, 0, 4, null);
            }

            @NotNull
            public final Password createHiddenPasswordState() {
                return new Password("ic_m_visibility_filled", 3, 0, true, 4, null);
            }

            @NotNull
            public final Info createInfoButtonModel() {
                return new Info("ic_m_info_filled", 2, 0, 4, null);
            }

            @NotNull
            public final Reset createResetButtonModel() {
                return new Reset("ic_m_cross_compact", 1, 0, 4, null);
            }

            @NotNull
            public final Success createSuccessButtonModel() {
                return new Success("ic_m_check", 2, UniColors.GRAPHIC_POSITIVE_PRIMARY.getResId());
            }

            @NotNull
            public final Password createVisiblePasswordState() {
                return new Password("ic_m_non_visibility_filled", 3, 0, false, 4, null);
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton$Success;", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton;", "", "icon", "", "sortingId", "tintColorResId", "<init>", "(Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "I", "getSortingId", "getTintColorResId", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends ActionButton {

            @NotNull
            private final String icon;
            private final int sortingId;
            private final int tintColorResId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull String icon, int i11, int i12) {
                super(icon, i11, i12, null);
                Intrinsics.checkNotNullParameter(icon, "icon");
                this.icon = icon;
                this.sortingId = i11;
                this.tintColorResId = i12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.d(this.icon, success.icon) && this.sortingId == success.sortingId && this.tintColorResId == success.tintColorResId;
            }

            @Override // ru.ozon.uni.android.input.textinput.data.OzonTextInputUIModel.ActionButton
            @NotNull
            public String getIcon() {
                return this.icon;
            }

            @Override // ru.ozon.uni.android.input.textinput.data.OzonTextInputUIModel.ActionButton
            public int getSortingId() {
                return this.sortingId;
            }

            @Override // ru.ozon.uni.android.input.textinput.data.OzonTextInputUIModel.ActionButton
            public int getTintColorResId() {
                return this.tintColorResId;
            }

            public int hashCode() {
                return Integer.hashCode(this.tintColorResId) + C2454a.a(this.sortingId, this.icon.hashCode() * 31, 31);
            }

            @NotNull
            public String toString() {
                String str = this.icon;
                return b.e(this.tintColorResId, ")", C3660k.c(this.sortingId, "Success(icon=", str, ", sortingId=", ", tintColorResId="));
            }
        }

        public /* synthetic */ ActionButton(String str, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i11, i12);
        }

        @NotNull
        public String getIcon() {
            return this.icon;
        }

        public int getSortingId() {
            return this.sortingId;
        }

        public int getTintColorResId() {
            return this.tintColorResId;
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton$Copy;", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton;", "", "icon", "", "sortingId", "tintColorResId", "<init>", "(Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "I", "getSortingId", "getTintColorResId", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Copy extends ActionButton {

            @NotNull
            private final String icon;
            private final int sortingId;
            private final int tintColorResId;

            public /* synthetic */ Copy(String str, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i11, (i13 & 4) != 0 ? UniColors.GRAPHIC_TERTIARY.getResId() : i12);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Copy)) {
                    return false;
                }
                Copy copy = (Copy) other;
                return Intrinsics.d(this.icon, copy.icon) && this.sortingId == copy.sortingId && this.tintColorResId == copy.tintColorResId;
            }

            @Override // ru.ozon.uni.android.input.textinput.data.OzonTextInputUIModel.ActionButton
            @NotNull
            public String getIcon() {
                return this.icon;
            }

            @Override // ru.ozon.uni.android.input.textinput.data.OzonTextInputUIModel.ActionButton
            public int getSortingId() {
                return this.sortingId;
            }

            @Override // ru.ozon.uni.android.input.textinput.data.OzonTextInputUIModel.ActionButton
            public int getTintColorResId() {
                return this.tintColorResId;
            }

            public int hashCode() {
                return Integer.hashCode(this.tintColorResId) + C2454a.a(this.sortingId, this.icon.hashCode() * 31, 31);
            }

            @NotNull
            public String toString() {
                String str = this.icon;
                return b.e(this.tintColorResId, ")", C3660k.c(this.sortingId, "Copy(icon=", str, ", sortingId=", ", tintColorResId="));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Copy(@NotNull String icon, int i11, int i12) {
                super(icon, i11, i12, null);
                Intrinsics.checkNotNullParameter(icon, "icon");
                this.icon = icon;
                this.sortingId = i11;
                this.tintColorResId = i12;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton$Info;", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton;", "", "icon", "", "sortingId", "tintColorResId", "<init>", "(Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "I", "getSortingId", "getTintColorResId", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Info extends ActionButton {

            @NotNull
            private final String icon;
            private final int sortingId;
            private final int tintColorResId;

            public /* synthetic */ Info(String str, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i11, (i13 & 4) != 0 ? UniColors.GRAPHIC_TERTIARY.getResId() : i12);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Info)) {
                    return false;
                }
                Info info = (Info) other;
                return Intrinsics.d(this.icon, info.icon) && this.sortingId == info.sortingId && this.tintColorResId == info.tintColorResId;
            }

            @Override // ru.ozon.uni.android.input.textinput.data.OzonTextInputUIModel.ActionButton
            @NotNull
            public String getIcon() {
                return this.icon;
            }

            @Override // ru.ozon.uni.android.input.textinput.data.OzonTextInputUIModel.ActionButton
            public int getSortingId() {
                return this.sortingId;
            }

            @Override // ru.ozon.uni.android.input.textinput.data.OzonTextInputUIModel.ActionButton
            public int getTintColorResId() {
                return this.tintColorResId;
            }

            public int hashCode() {
                return Integer.hashCode(this.tintColorResId) + C2454a.a(this.sortingId, this.icon.hashCode() * 31, 31);
            }

            @NotNull
            public String toString() {
                String str = this.icon;
                return b.e(this.tintColorResId, ")", C3660k.c(this.sortingId, "Info(icon=", str, ", sortingId=", ", tintColorResId="));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Info(@NotNull String icon, int i11, int i12) {
                super(icon, i11, i12, null);
                Intrinsics.checkNotNullParameter(icon, "icon");
                this.icon = icon;
                this.sortingId = i11;
                this.tintColorResId = i12;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton$Password;", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton;", "", "icon", "", "sortingId", "tintColorResId", "", "hidePassword", "<init>", "(Ljava/lang/String;IIZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "I", "getSortingId", "getTintColorResId", "Z", "getHidePassword", "()Z", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Password extends ActionButton {
            private final boolean hidePassword;

            @NotNull
            private final String icon;
            private final int sortingId;
            private final int tintColorResId;

            public /* synthetic */ Password(String str, int i11, int i12, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i11, (i13 & 4) != 0 ? UniColors.GRAPHIC_TERTIARY.getResId() : i12, (i13 & 8) != 0 ? true : z11);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Password)) {
                    return false;
                }
                Password password = (Password) other;
                return Intrinsics.d(this.icon, password.icon) && this.sortingId == password.sortingId && this.tintColorResId == password.tintColorResId && this.hidePassword == password.hidePassword;
            }

            public final boolean getHidePassword() {
                return this.hidePassword;
            }

            @Override // ru.ozon.uni.android.input.textinput.data.OzonTextInputUIModel.ActionButton
            @NotNull
            public String getIcon() {
                return this.icon;
            }

            @Override // ru.ozon.uni.android.input.textinput.data.OzonTextInputUIModel.ActionButton
            public int getSortingId() {
                return this.sortingId;
            }

            @Override // ru.ozon.uni.android.input.textinput.data.OzonTextInputUIModel.ActionButton
            public int getTintColorResId() {
                return this.tintColorResId;
            }

            public int hashCode() {
                return Boolean.hashCode(this.hidePassword) + C2454a.a(this.tintColorResId, C2454a.a(this.sortingId, this.icon.hashCode() * 31, 31), 31);
            }

            @NotNull
            public String toString() {
                String str = this.icon;
                int i11 = this.sortingId;
                int i12 = this.tintColorResId;
                boolean z11 = this.hidePassword;
                StringBuilder c11 = C3660k.c(i11, "Password(icon=", str, ", sortingId=", ", tintColorResId=");
                c11.append(i12);
                c11.append(", hidePassword=");
                c11.append(z11);
                c11.append(")");
                return c11.toString();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Password(@NotNull String icon, int i11, int i12, boolean z11) {
                super(icon, i11, i12, null);
                Intrinsics.checkNotNullParameter(icon, "icon");
                this.icon = icon;
                this.sortingId = i11;
                this.tintColorResId = i12;
                this.hidePassword = z11;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton$Reset;", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton;", "", "icon", "", "sortingId", "tintColorResId", "<init>", "(Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "I", "getSortingId", "getTintColorResId", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Reset extends ActionButton {

            @NotNull
            private final String icon;
            private final int sortingId;
            private final int tintColorResId;

            public /* synthetic */ Reset(String str, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i11, (i13 & 4) != 0 ? UniColors.GRAPHIC_TERTIARY.getResId() : i12);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Reset)) {
                    return false;
                }
                Reset reset = (Reset) other;
                return Intrinsics.d(this.icon, reset.icon) && this.sortingId == reset.sortingId && this.tintColorResId == reset.tintColorResId;
            }

            @Override // ru.ozon.uni.android.input.textinput.data.OzonTextInputUIModel.ActionButton
            @NotNull
            public String getIcon() {
                return this.icon;
            }

            @Override // ru.ozon.uni.android.input.textinput.data.OzonTextInputUIModel.ActionButton
            public int getSortingId() {
                return this.sortingId;
            }

            @Override // ru.ozon.uni.android.input.textinput.data.OzonTextInputUIModel.ActionButton
            public int getTintColorResId() {
                return this.tintColorResId;
            }

            public int hashCode() {
                return Integer.hashCode(this.tintColorResId) + C2454a.a(this.sortingId, this.icon.hashCode() * 31, 31);
            }

            @NotNull
            public String toString() {
                String str = this.icon;
                return b.e(this.tintColorResId, ")", C3660k.c(this.sortingId, "Reset(icon=", str, ", sortingId=", ", tintColorResId="));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Reset(@NotNull String icon, int i11, int i12) {
                super(icon, i11, i12, null);
                Intrinsics.checkNotNullParameter(icon, "icon");
                this.icon = icon;
                this.sortingId = i11;
                this.tintColorResId = i12;
            }
        }

        private ActionButton(String str, int i11, int i12) {
            this.icon = str;
            this.sortingId = i11;
            this.tintColorResId = i12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OzonTextInputUIModel(@NotNull TextInputStyle style, int i11, int i12, float f7, int i13, boolean z11, boolean z12, @NotNull CharSequence inputText, @NotNull String labelText, float f11, int i14, boolean z13, @NotNull List<? extends ActionButton> actionButtons, @NotNull TransformationMethod transformationMethod) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        Intrinsics.checkNotNullParameter(labelText, "labelText");
        Intrinsics.checkNotNullParameter(actionButtons, "actionButtons");
        Intrinsics.checkNotNullParameter(transformationMethod, "transformationMethod");
        this.style = style;
        this.keyboardType = i11;
        this.keyboardAction = i12;
        this.borderSize = f7;
        this.borderColor = i13;
        this.isActive = z11;
        this.hasFocus = z12;
        this.inputText = inputText;
        this.labelText = labelText;
        this.inputAlpha = f11;
        this.textInputColor = i14;
        this.hasLockImage = z13;
        this.actionButtons = actionButtons;
        this.transformationMethod = transformationMethod;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OzonTextInputUIModel)) {
            return false;
        }
        OzonTextInputUIModel ozonTextInputUIModel = (OzonTextInputUIModel) other;
        return Intrinsics.d(this.style, ozonTextInputUIModel.style) && this.keyboardType == ozonTextInputUIModel.keyboardType && this.keyboardAction == ozonTextInputUIModel.keyboardAction && Float.compare(this.borderSize, ozonTextInputUIModel.borderSize) == 0 && this.borderColor == ozonTextInputUIModel.borderColor && this.isActive == ozonTextInputUIModel.isActive && this.hasFocus == ozonTextInputUIModel.hasFocus && Intrinsics.d(this.inputText, ozonTextInputUIModel.inputText) && Intrinsics.d(this.labelText, ozonTextInputUIModel.labelText) && Float.compare(this.inputAlpha, ozonTextInputUIModel.inputAlpha) == 0 && this.textInputColor == ozonTextInputUIModel.textInputColor && this.hasLockImage == ozonTextInputUIModel.hasLockImage && Intrinsics.d(this.actionButtons, ozonTextInputUIModel.actionButtons) && Intrinsics.d(this.transformationMethod, ozonTextInputUIModel.transformationMethod);
    }

    @NotNull
    public final List<ActionButton> getActionButtons() {
        return this.actionButtons;
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final float getBorderSize() {
        return this.borderSize;
    }

    public final boolean getHasFocus() {
        return this.hasFocus;
    }

    public final boolean getHasLockImage() {
        return this.hasLockImage;
    }

    public final float getInputAlpha() {
        return this.inputAlpha;
    }

    @NotNull
    public final CharSequence getInputText() {
        return this.inputText;
    }

    public final int getKeyboardAction() {
        return this.keyboardAction;
    }

    public final int getKeyboardType() {
        return this.keyboardType;
    }

    @NotNull
    public final String getLabelText() {
        return this.labelText;
    }

    @NotNull
    public final TextInputStyle getStyle() {
        return this.style;
    }

    public final int getTextInputColor() {
        return this.textInputColor;
    }

    @NotNull
    public final TransformationMethod getTransformationMethod() {
        return this.transformationMethod;
    }

    public int hashCode() {
        return this.transformationMethod.hashCode() + g.b(C3532b.a(C2454a.a(this.textInputColor, Pk0.b.a(this.inputAlpha, g.a((this.inputText.hashCode() + C3532b.a(C3532b.a(C2454a.a(this.borderColor, Pk0.b.a(this.borderSize, C2454a.a(this.keyboardAction, C2454a.a(this.keyboardType, this.style.hashCode() * 31, 31), 31), 31), 31), 31, this.isActive), 31, this.hasFocus)) * 31, 31, this.labelText), 31), 31), 31, this.hasLockImage), 31, this.actionButtons);
    }

    /* renamed from: isActive, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    @NotNull
    public String toString() {
        TextInputStyle textInputStyle = this.style;
        int i11 = this.keyboardType;
        int i12 = this.keyboardAction;
        float f7 = this.borderSize;
        int i13 = this.borderColor;
        boolean z11 = this.isActive;
        boolean z12 = this.hasFocus;
        CharSequence charSequence = this.inputText;
        String str = this.labelText;
        float f11 = this.inputAlpha;
        int i14 = this.textInputColor;
        boolean z13 = this.hasLockImage;
        List<ActionButton> list = this.actionButtons;
        TransformationMethod transformationMethod = this.transformationMethod;
        StringBuilder sb2 = new StringBuilder("OzonTextInputUIModel(style=");
        sb2.append(textInputStyle);
        sb2.append(", keyboardType=");
        sb2.append(i11);
        sb2.append(", keyboardAction=");
        sb2.append(i12);
        sb2.append(", borderSize=");
        sb2.append(f7);
        sb2.append(", borderColor=");
        c.d(sb2, i13, ", isActive=", z11, ", hasFocus=");
        sb2.append(z12);
        sb2.append(", inputText=");
        sb2.append((Object) charSequence);
        sb2.append(", labelText=");
        sb2.append(str);
        sb2.append(", inputAlpha=");
        sb2.append(f11);
        sb2.append(", textInputColor=");
        c.d(sb2, i14, ", hasLockImage=", z13, ", actionButtons=");
        sb2.append(list);
        sb2.append(", transformationMethod=");
        sb2.append(transformationMethod);
        sb2.append(")");
        return sb2.toString();
    }
}
