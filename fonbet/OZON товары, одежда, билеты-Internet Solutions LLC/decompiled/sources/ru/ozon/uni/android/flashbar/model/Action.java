package ru.ozon.uni.android.flashbar.model;

import Kk.C3532b;
import Sc.InterfaceC3999a;
import Ve.C4636t5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@InterfaceC3999a
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/uni/android/flashbar/model/Action;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "closeAfterActionRequired", "Lkotlin/Function0;", "", "action", "<init>", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Z", "getCloseAfterActionRequired", "()Z", "Lkotlin/jvm/functions/Function0;", "getAction", "()Lkotlin/jvm/functions/Function0;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Action {

    @NotNull
    private final Function0<Unit> action;
    private final boolean closeAfterActionRequired;

    @NotNull
    private final String title;

    public Action(@NotNull String title, boolean z11, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.title = title;
        this.closeAfterActionRequired = z11;
        this.action = action;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Action)) {
            return false;
        }
        Action action = (Action) other;
        return Intrinsics.d(this.title, action.title) && this.closeAfterActionRequired == action.closeAfterActionRequired && Intrinsics.d(this.action, action.action);
    }

    @NotNull
    public final Function0<Unit> getAction() {
        return this.action;
    }

    public final boolean getCloseAfterActionRequired() {
        return this.closeAfterActionRequired;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.action.hashCode() + C3532b.a(this.title.hashCode() * 31, 31, this.closeAfterActionRequired);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        boolean z11 = this.closeAfterActionRequired;
        Function0<Unit> function0 = this.action;
        StringBuilder b11 = C4636t5.b("Action(title=", str, ", closeAfterActionRequired=", ", action=", z11);
        b11.append(function0);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ Action(String str, boolean z11, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? false : z11, function0);
    }
}
