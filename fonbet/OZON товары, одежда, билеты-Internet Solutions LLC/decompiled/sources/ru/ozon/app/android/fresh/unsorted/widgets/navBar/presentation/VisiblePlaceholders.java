package ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation;

import G.g;
import Pk0.a;
import Tl.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\b\u0002\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR!\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/VisiblePlaceholders;", "", "", "placeholderKey", "", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "placeholders", "", "areContentTheSame", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "copy", "(Ljava/lang/String;Ljava/util/List;Z)Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/VisiblePlaceholders;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlaceholderKey", "Ljava/util/List;", "getPlaceholders", "()Ljava/util/List;", "Z", "getAreContentTheSame", "()Z", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class VisiblePlaceholders {
    private final boolean areContentTheSame;

    @NotNull
    private final String placeholderKey;

    @NotNull
    private final List<l> placeholders;

    public VisiblePlaceholders(@NotNull String placeholderKey, @NotNull List<l> placeholders, boolean z11) {
        Intrinsics.checkNotNullParameter(placeholderKey, "placeholderKey");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        this.placeholderKey = placeholderKey;
        this.placeholders = placeholders;
        this.areContentTheSame = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VisiblePlaceholders copy$default(VisiblePlaceholders visiblePlaceholders, String str, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = visiblePlaceholders.placeholderKey;
        }
        if ((i11 & 2) != 0) {
            list = visiblePlaceholders.placeholders;
        }
        if ((i11 & 4) != 0) {
            z11 = visiblePlaceholders.areContentTheSame;
        }
        return visiblePlaceholders.copy(str, list, z11);
    }

    @NotNull
    public final VisiblePlaceholders copy(@NotNull String placeholderKey, @NotNull List<l> placeholders, boolean areContentTheSame) {
        Intrinsics.checkNotNullParameter(placeholderKey, "placeholderKey");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        return new VisiblePlaceholders(placeholderKey, placeholders, areContentTheSame);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisiblePlaceholders)) {
            return false;
        }
        VisiblePlaceholders visiblePlaceholders = (VisiblePlaceholders) other;
        return Intrinsics.d(this.placeholderKey, visiblePlaceholders.placeholderKey) && Intrinsics.d(this.placeholders, visiblePlaceholders.placeholders) && this.areContentTheSame == visiblePlaceholders.areContentTheSame;
    }

    public final boolean getAreContentTheSame() {
        return this.areContentTheSame;
    }

    @NotNull
    public final List<l> getPlaceholders() {
        return this.placeholders;
    }

    public int hashCode() {
        return Boolean.hashCode(this.areContentTheSame) + g.b(this.placeholderKey.hashCode() * 31, 31, this.placeholders);
    }

    @NotNull
    public String toString() {
        String str = this.placeholderKey;
        List<l> list = this.placeholders;
        return a.a(")", b.f("VisiblePlaceholders(placeholderKey=", str, ", placeholders=", ", areContentTheSame=", list), this.areContentTheSame);
    }
}
