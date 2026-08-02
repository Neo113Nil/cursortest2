package ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.data.LayoutPaddings;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010\r¨\u0006!"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/presentation/CommonDisclaimerV2V0;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/data/LayoutPaddings;", "paddings", "", "backgroundColor", "<init>", "(JLru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/data/LayoutPaddings;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getDisclaimer", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/data/LayoutPaddings;", "getPaddings", "()Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/data/LayoutPaddings;", "Ljava/lang/String;", "getBackgroundColor", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CommonDisclaimerV2V0 implements c {
    public static final int $stable = DisclaimerDTO.$stable;
    private final String backgroundColor;

    @NotNull
    private final DisclaimerDTO disclaimer;
    private final long id;
    private final LayoutPaddings paddings;

    public CommonDisclaimerV2V0(long j11, @NotNull DisclaimerDTO disclaimer, LayoutPaddings layoutPaddings, String str) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.id = j11;
        this.disclaimer = disclaimer;
        this.paddings = layoutPaddings;
        this.backgroundColor = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonDisclaimerV2V0)) {
            return false;
        }
        CommonDisclaimerV2V0 commonDisclaimerV2V0 = (CommonDisclaimerV2V0) other;
        return this.id == commonDisclaimerV2V0.id && Intrinsics.d(this.disclaimer, commonDisclaimerV2V0.disclaimer) && Intrinsics.d(this.paddings, commonDisclaimerV2V0.paddings) && Intrinsics.d(this.backgroundColor, commonDisclaimerV2V0.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final LayoutPaddings getPaddings() {
        return this.paddings;
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
        int hashCode = (this.disclaimer.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        LayoutPaddings layoutPaddings = this.paddings;
        int hashCode2 = (hashCode + (layoutPaddings == null ? 0 : layoutPaddings.hashCode())) * 31;
        String str = this.backgroundColor;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CommonDisclaimerV2V0(id=" + this.id + ", disclaimer=" + this.disclaimer + ", paddings=" + this.paddings + ", backgroundColor=" + this.backgroundColor + ")";
    }
}
