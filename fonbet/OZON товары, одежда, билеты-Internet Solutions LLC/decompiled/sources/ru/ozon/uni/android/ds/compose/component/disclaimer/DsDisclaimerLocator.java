package ru.ozon.uni.android.ds.compose.component.disclaimer;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.ds.compose.modifier.Locator;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/disclaimer/DsDisclaimerLocator;", "Lru/ozon/uni/android/ds/compose/modifier/Locator;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "defaultTag", "", "<init>", "(Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/String;)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lkotlin/Function0;", "getTitle", "()Lkotlin/jvm/functions/Function0;", "subtitle", "getSubtitle", "icon", "getIcon", "closeButton", "getCloseButton", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DsDisclaimerLocator extends Locator {

    @NotNull
    private final Function0<Locator> closeButton;

    @NotNull
    private final Function0<Locator> icon;

    @NotNull
    private final Function0<Locator> subtitle;

    @NotNull
    private final Function0<Locator> title;

    public /* synthetic */ DsDisclaimerLocator(TestInfo testInfo, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : testInfo, (i11 & 2) != 0 ? SelectionItemFormDTO.DISCLAIMER_FIELD_NAME : str);
    }

    @NotNull
    public final Function0<Locator> getCloseButton() {
        return this.closeButton;
    }

    @NotNull
    public final Function0<Locator> getIcon() {
        return this.icon;
    }

    @NotNull
    public final Function0<Locator> getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final Function0<Locator> getTitle() {
        return this.title;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsDisclaimerLocator(TestInfo testInfo, @NotNull String defaultTag) {
        super(testInfo, defaultTag);
        Intrinsics.checkNotNullParameter(defaultTag, "defaultTag");
        this.title = new DsDisclaimerLocator$title$1(this);
        this.subtitle = new DsDisclaimerLocator$subtitle$1(this);
        this.icon = new DsDisclaimerLocator$icon$1(this);
        this.closeButton = new DsDisclaimerLocator$closeButton$1(this);
    }
}
