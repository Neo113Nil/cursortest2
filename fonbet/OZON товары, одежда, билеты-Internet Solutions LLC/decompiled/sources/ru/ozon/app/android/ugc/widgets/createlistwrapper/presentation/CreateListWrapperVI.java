package ru.ozon.app.android.ugc.widgets.createlistwrapper.presentation;

import Tl.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010\u0010¨\u0006!"}, d2 = {"Lru/ozon/app/android/ugc/widgets/createlistwrapper/presentation/CreateListWrapperVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "button", "", "skus", "", "limit", "<init>", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/List;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Ljava/util/List;", "getSkus", "()Ljava/util/List;", "I", "getLimit", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CreateListWrapperVI implements c {

    @NotNull
    private final ButtonV3Atom.LargeButton button;
    private final long id;
    private final int limit;
    private final List<Long> skus;

    public CreateListWrapperVI(long j11, @NotNull ButtonV3Atom.LargeButton button, List<Long> list, int i11) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.button = button;
        this.skus = list;
        this.limit = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateListWrapperVI)) {
            return false;
        }
        CreateListWrapperVI createListWrapperVI = (CreateListWrapperVI) other;
        return this.id == createListWrapperVI.id && Intrinsics.d(this.button, createListWrapperVI.button) && Intrinsics.d(this.skus, createListWrapperVI.skus) && this.limit == createListWrapperVI.limit;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getLimit() {
        return this.limit;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final List<Long> getSkus() {
        return this.skus;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.button, Long.hashCode(this.id) * 31, 31);
        List<Long> list = this.skus;
        return Integer.hashCode(this.limit) + ((a11 + (list == null ? 0 : list.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonV3Atom.LargeButton largeButton = this.button;
        List<Long> list = this.skus;
        int i11 = this.limit;
        StringBuilder h11 = Bi.b.h("CreateListWrapperVI(id=", j11, ", button=", largeButton);
        h11.append(", skus=");
        h11.append(list);
        h11.append(", limit=");
        h11.append(i11);
        h11.append(")");
        return h11.toString();
    }
}
