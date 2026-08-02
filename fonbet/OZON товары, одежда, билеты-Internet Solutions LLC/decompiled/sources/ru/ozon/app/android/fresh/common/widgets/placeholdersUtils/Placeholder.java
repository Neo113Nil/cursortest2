package ru.ozon.app.android.fresh.common.widgets.placeholdersUtils;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B!\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R!\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/Placeholder;", "", "", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObjects", "", "areContentsTheSame", "<init>", "(Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getViewObjects", "()Ljava/util/List;", "Z", "getAreContentsTheSame", "()Z", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Placeholder {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Placeholder EMPTY = new Placeholder(K.f71697a, false);
    private final boolean areContentsTheSame;

    @NotNull
    private final List<l> viewObjects;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/Placeholder$Companion;", "", "<init>", "()V", "EMPTY", "Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/Placeholder;", "getEMPTY", "()Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/Placeholder;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Placeholder getEMPTY() {
            return Placeholder.EMPTY;
        }

        private Companion() {
        }
    }

    public Placeholder(@NotNull List<l> viewObjects, boolean z11) {
        Intrinsics.checkNotNullParameter(viewObjects, "viewObjects");
        this.viewObjects = viewObjects;
        this.areContentsTheSame = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) other;
        return Intrinsics.d(this.viewObjects, placeholder.viewObjects) && this.areContentsTheSame == placeholder.areContentsTheSame;
    }

    public final boolean getAreContentsTheSame() {
        return this.areContentsTheSame;
    }

    @NotNull
    public final List<l> getViewObjects() {
        return this.viewObjects;
    }

    public int hashCode() {
        return Boolean.hashCode(this.areContentsTheSame) + (this.viewObjects.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "Placeholder(viewObjects=" + this.viewObjects + ", areContentsTheSame=" + this.areContentsTheSame + ")";
    }
}
