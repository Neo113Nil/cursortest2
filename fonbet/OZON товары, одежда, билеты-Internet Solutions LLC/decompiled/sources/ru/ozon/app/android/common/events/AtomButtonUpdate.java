package ru.ozon.app.android.common.events;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/common/events/AtomButtonUpdate;", "LA00/a$J$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "id", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "atom", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "getAtom", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "events_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AtomButtonUpdate implements a.J.InterfaceC0007a {

    @NotNull
    private final ButtonV3Atom atom;

    @NotNull
    private final String id;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AtomButtonUpdate)) {
            return false;
        }
        AtomButtonUpdate atomButtonUpdate = (AtomButtonUpdate) other;
        return Intrinsics.d(this.id, atomButtonUpdate.id) && Intrinsics.d(this.atom, atomButtonUpdate.atom);
    }

    @NotNull
    public final ButtonV3Atom getAtom() {
        return this.atom;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.atom.hashCode() + (this.id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AtomButtonUpdate(id=" + this.id + ", atom=" + this.atom + ")";
    }
}
