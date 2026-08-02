package ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.group.viewObject;

import Ns.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.checkbox.RmsCheckbox;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/group/viewObject/DeliveryGroupVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "checkbox", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "<init>", "(JLru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "getCheckbox", "()Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeliveryGroupVO implements c {

    @NotNull
    private final RmsCheckbox checkbox;
    private final CommonControlSettings common;
    private final long id;

    @NotNull
    private final TextDTO title;

    public DeliveryGroupVO(long j11, @NotNull RmsCheckbox checkbox, @NotNull TextDTO title, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(checkbox, "checkbox");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.checkbox = checkbox;
        this.title = title;
        this.common = commonControlSettings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryGroupVO)) {
            return false;
        }
        DeliveryGroupVO deliveryGroupVO = (DeliveryGroupVO) other;
        return this.id == deliveryGroupVO.id && Intrinsics.d(this.checkbox, deliveryGroupVO.checkbox) && Intrinsics.d(this.title, deliveryGroupVO.title) && Intrinsics.d(this.common, deliveryGroupVO.common);
    }

    @NotNull
    public final RmsCheckbox getCheckbox() {
        return this.checkbox;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
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
    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.title, (this.checkbox.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31);
        CommonControlSettings commonControlSettings = this.common;
        return a11 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
    }

    @NotNull
    public String toString() {
        return "DeliveryGroupVO(id=" + this.id + ", checkbox=" + this.checkbox + ", title=" + this.title + ", common=" + this.common + ")";
    }
}
