package ru.ozon.app.android.returns.creation.widgets.modal.presentation.viewObject;

import D3.h;
import G.g;
import Ns.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b&\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/modal/presentation/viewObject/ReturnCreationModalVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "atoms", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "horizontalButtons", "<init>", "(JLru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getAtoms", "()Ljava/util/List;", "getHorizontalButtons", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnCreationModalVO implements c {

    @NotNull
    private final List<AtomDTO> atoms;

    @NotNull
    private final List<ButtonV3DTO> horizontalButtons;
    private final long id;
    private final ImageDTO image;

    @NotNull
    private final TextDTO text;

    /* JADX WARN: Multi-variable type inference failed */
    public ReturnCreationModalVO(long j11, ImageDTO imageDTO, @NotNull TextDTO text, @NotNull List<? extends AtomDTO> atoms, @NotNull List<ButtonV3DTO> horizontalButtons) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(atoms, "atoms");
        Intrinsics.checkNotNullParameter(horizontalButtons, "horizontalButtons");
        this.id = j11;
        this.image = imageDTO;
        this.text = text;
        this.atoms = atoms;
        this.horizontalButtons = horizontalButtons;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnCreationModalVO)) {
            return false;
        }
        ReturnCreationModalVO returnCreationModalVO = (ReturnCreationModalVO) other;
        return this.id == returnCreationModalVO.id && Intrinsics.d(this.image, returnCreationModalVO.image) && Intrinsics.d(this.text, returnCreationModalVO.text) && Intrinsics.d(this.atoms, returnCreationModalVO.atoms) && Intrinsics.d(this.horizontalButtons, returnCreationModalVO.horizontalButtons);
    }

    @NotNull
    public final List<AtomDTO> getAtoms() {
        return this.atoms;
    }

    @NotNull
    public final List<ButtonV3DTO> getHorizontalButtons() {
        return this.horizontalButtons;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ImageDTO getImage() {
        return this.image;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        ImageDTO imageDTO = this.image;
        return this.horizontalButtons.hashCode() + g.b(b.a(this.text, (hashCode + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31, 31), 31, this.atoms);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ImageDTO imageDTO = this.image;
        TextDTO textDTO = this.text;
        List<AtomDTO> list = this.atoms;
        List<ButtonV3DTO> list2 = this.horizontalButtons;
        StringBuilder c11 = Nh.b.c("ReturnCreationModalVO(id=", j11, ", image=", imageDTO);
        c11.append(", text=");
        c11.append(textDTO);
        c11.append(", atoms=");
        c11.append(list);
        return h.c(c11, ", horizontalButtons=", list2, ")");
    }
}
