package ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky;

import Tl.b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "", "id", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "stickyButton", "Lkotlin/Pair;", "", "dataForSend", "<init>", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lkotlin/Pair;)V", "copy", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lkotlin/Pair;)Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getStickyButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Lkotlin/Pair;", "getDataForSend", "()Lkotlin/Pair;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DeleteAccountDescriptionStickyVO implements c {
    public static final int $stable = ButtonV3Atom.LargeButton.$stable;

    @NotNull
    private final Pair<String, String> dataForSend;
    private final long id;

    @NotNull
    private final ButtonV3Atom.LargeButton stickyButton;

    public DeleteAccountDescriptionStickyVO(long j11, @NotNull ButtonV3Atom.LargeButton stickyButton, @NotNull Pair<String, String> dataForSend) {
        Intrinsics.checkNotNullParameter(stickyButton, "stickyButton");
        Intrinsics.checkNotNullParameter(dataForSend, "dataForSend");
        this.id = j11;
        this.stickyButton = stickyButton;
        this.dataForSend = dataForSend;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeleteAccountDescriptionStickyVO copy$default(DeleteAccountDescriptionStickyVO deleteAccountDescriptionStickyVO, long j11, ButtonV3Atom.LargeButton largeButton, Pair pair, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = deleteAccountDescriptionStickyVO.id;
        }
        if ((i11 & 2) != 0) {
            largeButton = deleteAccountDescriptionStickyVO.stickyButton;
        }
        if ((i11 & 4) != 0) {
            pair = deleteAccountDescriptionStickyVO.dataForSend;
        }
        return deleteAccountDescriptionStickyVO.copy(j11, largeButton, pair);
    }

    @NotNull
    public final DeleteAccountDescriptionStickyVO copy(long id2, @NotNull ButtonV3Atom.LargeButton stickyButton, @NotNull Pair<String, String> dataForSend) {
        Intrinsics.checkNotNullParameter(stickyButton, "stickyButton");
        Intrinsics.checkNotNullParameter(dataForSend, "dataForSend");
        return new DeleteAccountDescriptionStickyVO(id2, stickyButton, dataForSend);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteAccountDescriptionStickyVO)) {
            return false;
        }
        DeleteAccountDescriptionStickyVO deleteAccountDescriptionStickyVO = (DeleteAccountDescriptionStickyVO) other;
        return this.id == deleteAccountDescriptionStickyVO.id && Intrinsics.d(this.stickyButton, deleteAccountDescriptionStickyVO.stickyButton) && Intrinsics.d(this.dataForSend, deleteAccountDescriptionStickyVO.dataForSend);
    }

    @NotNull
    public Pair<String, String> getDataForSend() {
        return this.dataForSend;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getStickyButton() {
        return this.stickyButton;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.dataForSend.hashCode() + b.a(this.stickyButton, Long.hashCode(this.id) * 31, 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonV3Atom.LargeButton largeButton = this.stickyButton;
        Pair<String, String> pair = this.dataForSend;
        StringBuilder h11 = Bi.b.h("DeleteAccountDescriptionStickyVO(id=", j11, ", stickyButton=", largeButton);
        h11.append(", dataForSend=");
        h11.append(pair);
        h11.append(")");
        return h11.toString();
    }
}
