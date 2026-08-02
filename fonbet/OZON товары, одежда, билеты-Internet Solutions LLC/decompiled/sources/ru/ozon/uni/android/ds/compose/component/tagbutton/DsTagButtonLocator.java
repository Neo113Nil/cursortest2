package ru.ozon.uni.android.ds.compose.component.tagbutton;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.modifier.Locator;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonLocator;", "Lru/ozon/uni/android/ds/compose/modifier/Locator;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "defaultTag", "", "<init>", "(Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/String;)V", "icon", "Lkotlin/Function0;", "getIcon", "()Lkotlin/jvm/functions/Function0;", "image", "getImage", "text", "getText", "indicator", "getIndicator", "closeIcon", "getCloseIcon", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class DsTagButtonLocator extends Locator {

    @NotNull
    private final Function0<Locator> closeIcon;

    @NotNull
    private final Function0<Locator> icon;

    @NotNull
    private final Function0<Locator> image;

    @NotNull
    private final Function0<Locator> indicator;

    @NotNull
    private final Function0<Locator> text;

    public /* synthetic */ DsTagButtonLocator(TestInfo testInfo, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : testInfo, (i11 & 2) != 0 ? "tagButton" : str);
    }

    @NotNull
    public final Function0<Locator> getCloseIcon() {
        return this.closeIcon;
    }

    @NotNull
    public final Function0<Locator> getIcon() {
        return this.icon;
    }

    @NotNull
    public final Function0<Locator> getImage() {
        return this.image;
    }

    @NotNull
    public final Function0<Locator> getIndicator() {
        return this.indicator;
    }

    @NotNull
    public final Function0<Locator> getText() {
        return this.text;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsTagButtonLocator(TestInfo testInfo, @NotNull String defaultTag) {
        super(testInfo, defaultTag);
        Intrinsics.checkNotNullParameter(defaultTag, "defaultTag");
        this.icon = new DsTagButtonLocator$icon$1(this);
        this.image = new DsTagButtonLocator$image$1(this);
        this.text = new DsTagButtonLocator$text$1(this);
        this.indicator = new DsTagButtonLocator$indicator$1(this);
        this.closeIcon = new DsTagButtonLocator$closeIcon$1(this);
    }
}
