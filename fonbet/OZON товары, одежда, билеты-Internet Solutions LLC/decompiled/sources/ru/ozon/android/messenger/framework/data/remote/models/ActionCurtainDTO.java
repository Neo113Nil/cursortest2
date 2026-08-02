package ru.ozon.android.messenger.framework.data.remote.models;

import B90.C2618u;
import G.g;
import K1.G;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\""}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/ActionCurtainDTO;", "Landroid/os/Parcelable;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "cells", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "buttons", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCells", "()Ljava/util/List;", "getButtons", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActionCurtainDTO implements Parcelable {
    public static final int $stable = CellDTO.$stable;

    @NotNull
    public static final Parcelable.Creator<ActionCurtainDTO> CREATOR = new a();

    @NotNull
    private final List<ButtonV3DTO> buttons;

    @NotNull
    private final List<CellDTO> cells;

    @NotNull
    private final TextDTO title;

    public static final class a implements Parcelable.Creator<ActionCurtainDTO> {
        @Override // android.os.Parcelable.Creator
        public final ActionCurtainDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            TextDTO textDTO = (TextDTO) parcel.readParcelable(ActionCurtainDTO.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            int i12 = 0;
            while (i12 != readInt) {
                i12 = Bi.b.a(ActionCurtainDTO.class, parcel, arrayList, i12, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i11 != readInt2) {
                i11 = Bi.b.a(ActionCurtainDTO.class, parcel, arrayList2, i11, 1);
            }
            return new ActionCurtainDTO(textDTO, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final ActionCurtainDTO[] newArray(int i11) {
            return new ActionCurtainDTO[i11];
        }
    }

    public ActionCurtainDTO(@NotNull TextDTO title, @NotNull List<CellDTO> cells, @NotNull List<ButtonV3DTO> buttons) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.title = title;
        this.cells = cells;
        this.buttons = buttons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionCurtainDTO copy$default(ActionCurtainDTO actionCurtainDTO, TextDTO textDTO, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = actionCurtainDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = actionCurtainDTO.cells;
        }
        if ((i11 & 4) != 0) {
            list2 = actionCurtainDTO.buttons;
        }
        return actionCurtainDTO.copy(textDTO, list, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final List<CellDTO> component2() {
        return this.cells;
    }

    @NotNull
    public final List<ButtonV3DTO> component3() {
        return this.buttons;
    }

    @NotNull
    public final ActionCurtainDTO copy(@NotNull TextDTO title, @NotNull List<CellDTO> cells, @NotNull List<ButtonV3DTO> buttons) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new ActionCurtainDTO(title, cells, buttons);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionCurtainDTO)) {
            return false;
        }
        ActionCurtainDTO actionCurtainDTO = (ActionCurtainDTO) other;
        return Intrinsics.d(this.title, actionCurtainDTO.title) && Intrinsics.d(this.cells, actionCurtainDTO.cells) && Intrinsics.d(this.buttons, actionCurtainDTO.buttons);
    }

    @NotNull
    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    @NotNull
    public final List<CellDTO> getCells() {
        return this.cells;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.buttons.hashCode() + g.b(this.title.hashCode() * 31, 31, this.cells);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        List<CellDTO> list = this.cells;
        return C2618u.h(G.e("ActionCurtainDTO(title=", textDTO, ", cells=", list, ", buttons="), this.buttons, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.title, flags);
        Iterator c11 = Bi.a.c(this.cells, dest);
        while (c11.hasNext()) {
            dest.writeParcelable((Parcelable) c11.next(), flags);
        }
        Iterator c12 = Bi.a.c(this.buttons, dest);
        while (c12.hasNext()) {
            dest.writeParcelable((Parcelable) c12.next(), flags);
        }
    }
}
