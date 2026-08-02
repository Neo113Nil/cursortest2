package ru.ozon.app.android.returns.creation.widgets.methods.presentation.atom;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.methods.presentation.Paddings;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/methods/presentation/atom/AtomElementVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/returns/creation/widgets/methods/presentation/Paddings;", "paddings", "", "backgroundColor", "Lru/ozon/uni/atoms/data/AtomDTO;", "atom", "<init>", "(JLru/ozon/app/android/returns/creation/widgets/methods/presentation/Paddings;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomDTO;)V", "J", "getId", "()J", "Lru/ozon/app/android/returns/creation/widgets/methods/presentation/Paddings;", "getPaddings", "()Lru/ozon/app/android/returns/creation/widgets/methods/presentation/Paddings;", "Ljava/lang/String;", "getBackgroundColor", "()Ljava/lang/String;", "Lru/ozon/uni/atoms/data/AtomDTO;", "getAtom", "()Lru/ozon/uni/atoms/data/AtomDTO;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AtomElementVO implements c {
    public static final int $stable = AtomDTO.$stable;

    @NotNull
    private final AtomDTO atom;

    @NotNull
    private final String backgroundColor;
    private final long id;

    @NotNull
    private final Paddings paddings;

    public AtomElementVO(long j11, @NotNull Paddings paddings, @NotNull String backgroundColor, @NotNull AtomDTO atom) {
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(atom, "atom");
        this.id = j11;
        this.paddings = paddings;
        this.backgroundColor = backgroundColor;
        this.atom = atom;
    }

    @NotNull
    public final AtomDTO getAtom() {
        return this.atom;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final Paddings getPaddings() {
        return this.paddings;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }
}
