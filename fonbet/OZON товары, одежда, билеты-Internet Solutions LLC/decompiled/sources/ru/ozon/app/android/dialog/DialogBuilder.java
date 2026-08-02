package ru.ozon.app.android.dialog;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.Style;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H&J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005J*\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0010\u0010\u0019\u001a\f\u0012\u0004\u0012\u00020\u001b0\u001aj\u0002`\u001cJ*\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0010\u0010\u0019\u001a\f\u0012\u0004\u0012\u00020\u001b0\u001aj\u0002`\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\"\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000b@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000b@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/dialog/DialogBuilder;", "", "<init>", "()V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", SelectionItemFormDTO.TITLE_FIELD_NAME, "getTitle", "()Ljava/lang/String;", "subtitle", "getSubtitle", "Lru/ozon/app/android/dialog/DialogBuilder$Button;", "submitButton", "getSubmitButton", "()Lru/ozon/app/android/dialog/DialogBuilder$Button;", "cancelButton", "getCancelButton", "build", "Lru/ozon/app/android/dialog/Dialog;", "setTitle", "setSubtitle", "setSubmitButton", "text", "style", "Lru/ozon/uni/atoms/data/controls/button/Style;", "onClick", "Lkotlin/Function0;", "", "Lru/ozon/app/android/dialog/OnClick;", "setCancelButton", "Button", "dialog_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class DialogBuilder {
    private Button cancelButton;
    private Button submitButton;
    private String subtitle;
    private String title;

    /* JADX INFO: Access modifiers changed from: protected */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/dialog/DialogBuilder$Button;", "", "text", "", "style", "Lru/ozon/uni/atoms/data/controls/button/Style;", "onClick", "Lkotlin/Function0;", "", "Lru/ozon/app/android/dialog/OnClick;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/Style;Lkotlin/jvm/functions/Function0;)V", "getText", "()Ljava/lang/String;", "getStyle", "()Lru/ozon/uni/atoms/data/controls/button/Style;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "dialog_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Button {

        @NotNull
        private final Function0<Unit> onClick;

        @NotNull
        private final Style style;

        @NotNull
        private final String text;

        public Button(@NotNull String text, @NotNull Style style, @NotNull Function0<Unit> onClick) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.text = text;
            this.style = style;
            this.onClick = onClick;
        }

        @NotNull
        public final Function0<Unit> getOnClick() {
            return this.onClick;
        }

        @NotNull
        public final Style getStyle() {
            return this.style;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }
    }

    public static /* synthetic */ DialogBuilder setCancelButton$default(DialogBuilder dialogBuilder, String str, Style style, Function0 function0, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCancelButton");
        }
        if ((i11 & 2) != 0) {
            style = Style.ACTION_SECONDARY;
        }
        return dialogBuilder.setCancelButton(str, style, function0);
    }

    public static /* synthetic */ DialogBuilder setSubmitButton$default(DialogBuilder dialogBuilder, String str, Style style, Function0 function0, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSubmitButton");
        }
        if ((i11 & 2) != 0) {
            style = Style.ACTION_PRIMARY;
        }
        return dialogBuilder.setSubmitButton(str, style, function0);
    }

    @NotNull
    public abstract Dialog build();

    protected final Button getCancelButton() {
        return this.cancelButton;
    }

    protected final Button getSubmitButton() {
        return this.submitButton;
    }

    protected final String getSubtitle() {
        return this.subtitle;
    }

    protected final String getTitle() {
        return this.title;
    }

    @NotNull
    public final DialogBuilder setCancelButton(@NotNull String text, @NotNull Style style, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.cancelButton = new Button(text, style, onClick);
        return this;
    }

    @NotNull
    public final DialogBuilder setSubmitButton(@NotNull String text, @NotNull Style style, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.submitButton = new Button(text, style, onClick);
        return this;
    }

    @NotNull
    public final DialogBuilder setSubtitle(@NotNull String subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.subtitle = subtitle;
        return this;
    }

    @NotNull
    public final DialogBuilder setTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        return this;
    }
}
