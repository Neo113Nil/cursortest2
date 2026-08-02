package ru.ozon.fintech.ui.textatomV20;

import B90.C2619v;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.Gravity;
import ru.ozon.fintech.ui.utils.WidgetState;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003J3\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lru/ozon/fintech/ui/textatomV20/TextAtomV20WrapperState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "Lru/ozon/fintech/ui/utils/WidgetState;", "common", "Lru/ozon/fintech/ui/utils/Common;", "textAtomDTO", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "gravity", "Lru/ozon/fintech/ui/utils/Gravity;", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "<init>", "(Lru/ozon/fintech/ui/utils/Common;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/fintech/ui/utils/Gravity;Landroid/text/TextUtils$TruncateAt;)V", "getCommon", "()Lru/ozon/fintech/ui/utils/Common;", "getTextAtomDTO", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getGravity", "()Lru/ozon/fintech/ui/utils/Gravity;", "getEllipsize", "()Landroid/text/TextUtils$TruncateAt;", "provideId", "", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TextAtomV20WrapperState implements RecyclerItem, WidgetState {

    @NotNull
    private final Common common;
    private final TextUtils.TruncateAt ellipsize;

    @NotNull
    private final Gravity gravity;

    @NotNull
    private final TextAtom textAtomDTO;

    public TextAtomV20WrapperState(@NotNull Common common, @NotNull TextAtom textAtomDTO, @NotNull Gravity gravity, TextUtils.TruncateAt truncateAt) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(textAtomDTO, "textAtomDTO");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        this.common = common;
        this.textAtomDTO = textAtomDTO;
        this.gravity = gravity;
        this.ellipsize = truncateAt;
    }

    public static /* synthetic */ TextAtomV20WrapperState copy$default(TextAtomV20WrapperState textAtomV20WrapperState, Common common, TextAtom textAtom, Gravity gravity, TextUtils.TruncateAt truncateAt, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            common = textAtomV20WrapperState.common;
        }
        if ((i11 & 2) != 0) {
            textAtom = textAtomV20WrapperState.textAtomDTO;
        }
        if ((i11 & 4) != 0) {
            gravity = textAtomV20WrapperState.gravity;
        }
        if ((i11 & 8) != 0) {
            truncateAt = textAtomV20WrapperState.ellipsize;
        }
        return textAtomV20WrapperState.copy(common, textAtom, gravity, truncateAt);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public boolean areContentsTheSame(@NotNull RecyclerItem recyclerItem) {
        return RecyclerItem.a.a(this, recyclerItem);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Common getCommon() {
        return this.common;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getTextAtomDTO() {
        return this.textAtomDTO;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Gravity getGravity() {
        return this.gravity;
    }

    /* renamed from: component4, reason: from getter */
    public final TextUtils.TruncateAt getEllipsize() {
        return this.ellipsize;
    }

    @NotNull
    public final TextAtomV20WrapperState copy(@NotNull Common common, @NotNull TextAtom textAtomDTO, @NotNull Gravity gravity, TextUtils.TruncateAt ellipsize) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(textAtomDTO, "textAtomDTO");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        return new TextAtomV20WrapperState(common, textAtomDTO, gravity, ellipsize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAtomV20WrapperState)) {
            return false;
        }
        TextAtomV20WrapperState textAtomV20WrapperState = (TextAtomV20WrapperState) other;
        return Intrinsics.d(this.common, textAtomV20WrapperState.common) && Intrinsics.d(this.textAtomDTO, textAtomV20WrapperState.textAtomDTO) && this.gravity == textAtomV20WrapperState.gravity && this.ellipsize == textAtomV20WrapperState.ellipsize;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetState
    @NotNull
    public Common getCommon() {
        return this.common;
    }

    public final TextUtils.TruncateAt getEllipsize() {
        return this.ellipsize;
    }

    @NotNull
    public final Gravity getGravity() {
        return this.gravity;
    }

    @NotNull
    public final TextAtom getTextAtomDTO() {
        return this.textAtomDTO;
    }

    public int hashCode() {
        int hashCode = (this.gravity.hashCode() + C2619v.b(this.common.hashCode() * 31, 31, this.textAtomDTO)) * 31;
        TextUtils.TruncateAt truncateAt = this.ellipsize;
        return hashCode + (truncateAt == null ? 0 : truncateAt.hashCode());
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return getCommon().getWidgetId();
    }

    @NotNull
    public String toString() {
        return "TextAtomV20WrapperState(common=" + this.common + ", textAtomDTO=" + this.textAtomDTO + ", gravity=" + this.gravity + ", ellipsize=" + this.ellipsize + ")";
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }
}
