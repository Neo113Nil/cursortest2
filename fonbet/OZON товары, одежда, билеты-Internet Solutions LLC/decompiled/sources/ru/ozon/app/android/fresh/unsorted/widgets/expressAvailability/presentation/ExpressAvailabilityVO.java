package ru.ozon.app.android.fresh.unsorted.widgets.expressAvailability.presentation;

import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/expressAvailability/presentation/ExpressAvailabilityVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "image", "description", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "changeCategoryButton", "changeAddressButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;LWZ/t;)V", "J", "getId", "()J", "Ljava/lang/String;", "getImage", "()Ljava/lang/String;", "getDescription", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getChangeCategoryButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getChangeAddressButton", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ExpressAvailabilityVO implements c {

    @NotNull
    private final ButtonV3Atom.LargeButton changeAddressButton;
    private final ButtonV3Atom.LargeButton changeCategoryButton;

    @NotNull
    private final String description;
    private final long id;

    @NotNull
    private final String image;
    private final t tokenizedEvent;

    public ExpressAvailabilityVO(long j11, @NotNull String image, @NotNull String description, ButtonV3Atom.LargeButton largeButton, @NotNull ButtonV3Atom.LargeButton changeAddressButton, t tVar) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(changeAddressButton, "changeAddressButton");
        this.id = j11;
        this.image = image;
        this.description = description;
        this.changeCategoryButton = largeButton;
        this.changeAddressButton = changeAddressButton;
        this.tokenizedEvent = tVar;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getChangeAddressButton() {
        return this.changeAddressButton;
    }

    public final ButtonV3Atom.LargeButton getChangeCategoryButton() {
        return this.changeCategoryButton;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }
}
