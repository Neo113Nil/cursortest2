package ru.ozon.uni.android.ds.compose.component.input;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.android.ds.compose.modifier.Locator;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00000\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000bR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000bR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00000\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lru/ozon/uni/android/ds/compose/component/input/DsInputBaseLocator;", "Lru/ozon/uni/android/ds/compose/modifier/Locator;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "defaultTag", "", "<init>", "(Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/String;)V", "label", "Lkotlin/Function0;", "getLabel", "()Lkotlin/jvm/functions/Function0;", "caption", "getCaption", "textField", "getTextField", HammersV3BodyDTO.PLACEHOLDER, "getPlaceholder", "clearButton", "getClearButton", "copyButton", "getCopyButton", "errorIcon", "getErrorIcon", "successIcon", "getSuccessIcon", "readOnlyIcon", "getReadOnlyIcon", "loader", "getLoader", "firstIcon", "getFirstIcon", "secondIcon", "getSecondIcon", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DsInputBaseLocator extends Locator {

    @NotNull
    private final Function0<DsInputBaseLocator> caption;

    @NotNull
    private final Function0<DsInputBaseLocator> clearButton;

    @NotNull
    private final Function0<DsInputBaseLocator> copyButton;

    @NotNull
    private final Function0<DsInputBaseLocator> errorIcon;

    @NotNull
    private final Function0<DsInputBaseLocator> firstIcon;

    @NotNull
    private final Function0<DsInputBaseLocator> label;

    @NotNull
    private final Function0<DsInputBaseLocator> loader;

    @NotNull
    private final Function0<DsInputBaseLocator> placeholder;

    @NotNull
    private final Function0<DsInputBaseLocator> readOnlyIcon;

    @NotNull
    private final Function0<DsInputBaseLocator> secondIcon;

    @NotNull
    private final Function0<DsInputBaseLocator> successIcon;

    @NotNull
    private final Function0<DsInputBaseLocator> textField;

    public /* synthetic */ DsInputBaseLocator(TestInfo testInfo, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : testInfo, (i11 & 2) != 0 ? "inputBase" : str);
    }

    @NotNull
    public final Function0<DsInputBaseLocator> getCaption() {
        return this.caption;
    }

    @NotNull
    public final Function0<DsInputBaseLocator> getClearButton() {
        return this.clearButton;
    }

    @NotNull
    public final Function0<DsInputBaseLocator> getCopyButton() {
        return this.copyButton;
    }

    @NotNull
    public final Function0<DsInputBaseLocator> getErrorIcon() {
        return this.errorIcon;
    }

    @NotNull
    public final Function0<DsInputBaseLocator> getFirstIcon() {
        return this.firstIcon;
    }

    @NotNull
    public final Function0<DsInputBaseLocator> getLabel() {
        return this.label;
    }

    @NotNull
    public final Function0<DsInputBaseLocator> getLoader() {
        return this.loader;
    }

    @NotNull
    public final Function0<DsInputBaseLocator> getPlaceholder() {
        return this.placeholder;
    }

    @NotNull
    public final Function0<DsInputBaseLocator> getReadOnlyIcon() {
        return this.readOnlyIcon;
    }

    @NotNull
    public final Function0<DsInputBaseLocator> getSecondIcon() {
        return this.secondIcon;
    }

    @NotNull
    public final Function0<DsInputBaseLocator> getSuccessIcon() {
        return this.successIcon;
    }

    @NotNull
    public final Function0<DsInputBaseLocator> getTextField() {
        return this.textField;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsInputBaseLocator(TestInfo testInfo, @NotNull String defaultTag) {
        super(testInfo, defaultTag);
        Intrinsics.checkNotNullParameter(defaultTag, "defaultTag");
        this.label = new DsInputBaseLocator$label$1(this);
        this.caption = new DsInputBaseLocator$caption$1(this);
        this.textField = new DsInputBaseLocator$textField$1(this);
        this.placeholder = new DsInputBaseLocator$placeholder$1(this);
        this.clearButton = new DsInputBaseLocator$clearButton$1(this);
        this.copyButton = new DsInputBaseLocator$copyButton$1(this);
        this.errorIcon = new DsInputBaseLocator$errorIcon$1(this);
        this.successIcon = new DsInputBaseLocator$successIcon$1(this);
        this.readOnlyIcon = new DsInputBaseLocator$readOnlyIcon$1(this);
        this.loader = new DsInputBaseLocator$loader$1(this);
        this.firstIcon = new DsInputBaseLocator$firstIcon$1(this);
        this.secondIcon = new DsInputBaseLocator$secondIcon$1(this);
    }
}
