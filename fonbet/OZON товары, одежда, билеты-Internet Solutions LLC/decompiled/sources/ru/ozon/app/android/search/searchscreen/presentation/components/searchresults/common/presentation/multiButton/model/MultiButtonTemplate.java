package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.multiButton.model;

import B0.C2454a;
import G.g;
import J0.P;
import Xc.a;
import Xc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.view.atoms.buttons.addtocart.AddToCartButtonWithQuantityView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001d\u0010\u0010¨\u0006 "}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonTemplate;", "", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonTemplate$MultiButtonOrientation;", "orientation", "", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonModel;", "buttons", "", "secondButtonTopOffset", "containerBottomOffset", "<init>", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonTemplate$MultiButtonOrientation;Ljava/util/List;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonTemplate$MultiButtonOrientation;", "getOrientation", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonTemplate$MultiButtonOrientation;", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "I", "getSecondButtonTopOffset", "getContainerBottomOffset", "Companion", "MultiButtonOrientation", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MultiButtonTemplate {
    private static final int defaultFirstButtonMargin;
    private static final int sellerButtonOffset;

    @NotNull
    private final List<MultiButtonModel> buttons;
    private final int containerBottomOffset;

    @NotNull
    private final MultiButtonOrientation orientation;
    private final int secondButtonTopOffset;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonTemplate$Companion;", "", "<init>", "()V", "defaultFirstButtonMargin", "", "getDefaultFirstButtonMargin$search_prodGoogleAllVendorsRelease", "()I", "sellerButtonOffset", "getSellerButtonOffset", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDefaultFirstButtonMargin$search_prodGoogleAllVendorsRelease() {
            return MultiButtonTemplate.defaultFirstButtonMargin;
        }

        public final int getSellerButtonOffset() {
            return MultiButtonTemplate.sellerButtonOffset;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonTemplate$MultiButtonOrientation;", "", "<init>", "(Ljava/lang/String;I)V", "VERTICAL", "HORIZONTAL", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MultiButtonOrientation {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ MultiButtonOrientation[] $VALUES;
        public static final MultiButtonOrientation VERTICAL = new MultiButtonOrientation("VERTICAL", 0);
        public static final MultiButtonOrientation HORIZONTAL = new MultiButtonOrientation("HORIZONTAL", 1);

        private static final /* synthetic */ MultiButtonOrientation[] $values() {
            return new MultiButtonOrientation[]{VERTICAL, HORIZONTAL};
        }

        static {
            MultiButtonOrientation[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private MultiButtonOrientation(String str, int i11) {
        }

        public static MultiButtonOrientation valueOf(String str) {
            return (MultiButtonOrientation) Enum.valueOf(MultiButtonOrientation.class, str);
        }

        public static MultiButtonOrientation[] values() {
            return (MultiButtonOrientation[]) $VALUES.clone();
        }
    }

    static {
        int px = UiExtKt.toPx(8);
        defaultFirstButtonMargin = px;
        sellerButtonOffset = px - AddToCartButtonWithQuantityView.INSTANCE.getSELLER_ICON_OFFSET();
    }

    public MultiButtonTemplate(@NotNull MultiButtonOrientation orientation, @NotNull List<MultiButtonModel> buttons, int i11, int i12) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.orientation = orientation;
        this.buttons = buttons;
        this.secondButtonTopOffset = i11;
        this.containerBottomOffset = i12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiButtonTemplate)) {
            return false;
        }
        MultiButtonTemplate multiButtonTemplate = (MultiButtonTemplate) other;
        return this.orientation == multiButtonTemplate.orientation && Intrinsics.d(this.buttons, multiButtonTemplate.buttons) && this.secondButtonTopOffset == multiButtonTemplate.secondButtonTopOffset && this.containerBottomOffset == multiButtonTemplate.containerBottomOffset;
    }

    @NotNull
    public final List<MultiButtonModel> getButtons() {
        return this.buttons;
    }

    public final int getContainerBottomOffset() {
        return this.containerBottomOffset;
    }

    public final int getSecondButtonTopOffset() {
        return this.secondButtonTopOffset;
    }

    public int hashCode() {
        return Integer.hashCode(this.containerBottomOffset) + C2454a.a(this.secondButtonTopOffset, g.b(this.orientation.hashCode() * 31, 31, this.buttons), 31);
    }

    @NotNull
    public String toString() {
        MultiButtonOrientation multiButtonOrientation = this.orientation;
        List<MultiButtonModel> list = this.buttons;
        int i11 = this.secondButtonTopOffset;
        int i12 = this.containerBottomOffset;
        StringBuilder sb2 = new StringBuilder("MultiButtonTemplate(orientation=");
        sb2.append(multiButtonOrientation);
        sb2.append(", buttons=");
        sb2.append(list);
        sb2.append(", secondButtonTopOffset=");
        return P.a(i11, i12, ", containerBottomOffset=", ")", sb2);
    }
}
