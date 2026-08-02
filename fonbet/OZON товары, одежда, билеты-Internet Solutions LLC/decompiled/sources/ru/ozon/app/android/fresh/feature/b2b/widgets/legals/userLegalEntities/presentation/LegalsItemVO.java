package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEntities.presentation;

import D3.g;
import Ns.b;
import TY.a;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEntities.data.Remove;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001)BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\"\u0010 R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/presentation/LegalsItemVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "payprops", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "", "Lru/ozon/uni/atoms/data/AtomDTO;", "controls", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/presentation/LegalsItemVO$RemoveVO;", ProductAction.ACTION_REMOVE, "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/presentation/LegalsItemVO$RemoveVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPayprops", "getAddress", "Ljava/util/List;", "getControls", "()Ljava/util/List;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/presentation/LegalsItemVO$RemoveVO;", "getRemove", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/presentation/LegalsItemVO$RemoveVO;", "RemoveVO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LegalsItemVO implements c {
    private final TextDTO address;
    private final List<AtomDTO> controls;
    private final long id;
    private final TextDTO payprops;
    private final RemoveVO remove;

    @NotNull
    private final TextDTO title;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/presentation/LegalsItemVO$RemoveVO;", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "button", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/data/Remove$Confirmation;", "confirmation", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/data/Remove$Confirmation;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/data/Remove$Confirmation;", "getConfirmation", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/data/Remove$Confirmation;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RemoveVO {
        public static final int $stable = ButtonV3Atom.SmallIconButton.$stable;

        @NotNull
        private final ButtonV3Atom.SmallIconButton button;

        @NotNull
        private final Remove.Confirmation confirmation;

        public RemoveVO(@NotNull ButtonV3Atom.SmallIconButton button, @NotNull Remove.Confirmation confirmation) {
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(confirmation, "confirmation");
            this.button = button;
            this.confirmation = confirmation;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RemoveVO)) {
                return false;
            }
            RemoveVO removeVO = (RemoveVO) other;
            return Intrinsics.d(this.button, removeVO.button) && Intrinsics.d(this.confirmation, removeVO.confirmation);
        }

        @NotNull
        public final ButtonV3Atom.SmallIconButton getButton() {
            return this.button;
        }

        @NotNull
        public final Remove.Confirmation getConfirmation() {
            return this.confirmation;
        }

        public int hashCode() {
            return this.confirmation.hashCode() + (this.button.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "RemoveVO(button=" + this.button + ", confirmation=" + this.confirmation + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LegalsItemVO(long j11, @NotNull TextDTO title, TextDTO textDTO, TextDTO textDTO2, List<? extends AtomDTO> list, RemoveVO removeVO) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.title = title;
        this.payprops = textDTO;
        this.address = textDTO2;
        this.controls = list;
        this.remove = removeVO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegalsItemVO)) {
            return false;
        }
        LegalsItemVO legalsItemVO = (LegalsItemVO) other;
        return this.id == legalsItemVO.id && Intrinsics.d(this.title, legalsItemVO.title) && Intrinsics.d(this.payprops, legalsItemVO.payprops) && Intrinsics.d(this.address, legalsItemVO.address) && Intrinsics.d(this.controls, legalsItemVO.controls) && Intrinsics.d(this.remove, legalsItemVO.remove);
    }

    public final TextDTO getAddress() {
        return this.address;
    }

    public final List<AtomDTO> getControls() {
        return this.controls;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final TextDTO getPayprops() {
        return this.payprops;
    }

    public final RemoveVO getRemove() {
        return this.remove;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.title, Long.hashCode(this.id) * 31, 31);
        TextDTO textDTO = this.payprops;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.address;
        int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        List<AtomDTO> list = this.controls;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        RemoveVO removeVO = this.remove;
        return hashCode3 + (removeVO != null ? removeVO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.payprops;
        TextDTO textDTO3 = this.address;
        List<AtomDTO> list = this.controls;
        RemoveVO removeVO = this.remove;
        StringBuilder b11 = a.b("LegalsItemVO(id=", j11, ", title=", textDTO);
        g.i(", payprops=", ", address=", b11, textDTO2, textDTO3);
        b11.append(", controls=");
        b11.append(list);
        b11.append(", remove=");
        b11.append(removeVO);
        b11.append(")");
        return b11.toString();
    }
}
