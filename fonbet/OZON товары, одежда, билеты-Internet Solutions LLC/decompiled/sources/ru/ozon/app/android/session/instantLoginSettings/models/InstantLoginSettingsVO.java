package ru.ozon.app.android.session.instantLoginSettings.models;

import Ve.C4598rp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/session/instantLoginSettings/models/InstantLoginSettingsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/af/AtomAction;", "actionTurnOn", "actionTurnOff", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "cell", "<init>", "(JLru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;)V", "copy", "(JLru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;)Lru/ozon/app/android/session/instantLoginSettings/models/InstantLoginSettingsVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/af/AtomAction;", "getActionTurnOn", "()Lru/ozon/uni/atoms/af/AtomAction;", "getActionTurnOff", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "getCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class InstantLoginSettingsVO implements c {

    @NotNull
    private final AtomAction actionTurnOff;

    @NotNull
    private final AtomAction actionTurnOn;

    @NotNull
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle cell;
    private final long id;

    public InstantLoginSettingsVO(long j11, @NotNull AtomAction actionTurnOn, @NotNull AtomAction actionTurnOff, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle cell) {
        Intrinsics.checkNotNullParameter(actionTurnOn, "actionTurnOn");
        Intrinsics.checkNotNullParameter(actionTurnOff, "actionTurnOff");
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.id = j11;
        this.actionTurnOn = actionTurnOn;
        this.actionTurnOff = actionTurnOff;
        this.cell = cell;
    }

    public static /* synthetic */ InstantLoginSettingsVO copy$default(InstantLoginSettingsVO instantLoginSettingsVO, long j11, AtomAction atomAction, AtomAction atomAction2, CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle cellWithSubtitleToggle, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = instantLoginSettingsVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            atomAction = instantLoginSettingsVO.actionTurnOn;
        }
        AtomAction atomAction3 = atomAction;
        if ((i11 & 4) != 0) {
            atomAction2 = instantLoginSettingsVO.actionTurnOff;
        }
        AtomAction atomAction4 = atomAction2;
        if ((i11 & 8) != 0) {
            cellWithSubtitleToggle = instantLoginSettingsVO.cell;
        }
        return instantLoginSettingsVO.copy(j12, atomAction3, atomAction4, cellWithSubtitleToggle);
    }

    @NotNull
    public final InstantLoginSettingsVO copy(long id2, @NotNull AtomAction actionTurnOn, @NotNull AtomAction actionTurnOff, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle cell) {
        Intrinsics.checkNotNullParameter(actionTurnOn, "actionTurnOn");
        Intrinsics.checkNotNullParameter(actionTurnOff, "actionTurnOff");
        Intrinsics.checkNotNullParameter(cell, "cell");
        return new InstantLoginSettingsVO(id2, actionTurnOn, actionTurnOff, cell);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstantLoginSettingsVO)) {
            return false;
        }
        InstantLoginSettingsVO instantLoginSettingsVO = (InstantLoginSettingsVO) other;
        return this.id == instantLoginSettingsVO.id && Intrinsics.d(this.actionTurnOn, instantLoginSettingsVO.actionTurnOn) && Intrinsics.d(this.actionTurnOff, instantLoginSettingsVO.actionTurnOff) && Intrinsics.d(this.cell, instantLoginSettingsVO.cell);
    }

    @NotNull
    public final AtomAction getActionTurnOff() {
        return this.actionTurnOff;
    }

    @NotNull
    public final AtomAction getActionTurnOn() {
        return this.actionTurnOn;
    }

    @NotNull
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle getCell() {
        return this.cell;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.cell.hashCode() + C4598rp.a(this.actionTurnOff, C4598rp.a(this.actionTurnOn, Long.hashCode(this.id) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "InstantLoginSettingsVO(id=" + this.id + ", actionTurnOn=" + this.actionTurnOn + ", actionTurnOff=" + this.actionTurnOff + ", cell=" + this.cell + ")";
    }
}
