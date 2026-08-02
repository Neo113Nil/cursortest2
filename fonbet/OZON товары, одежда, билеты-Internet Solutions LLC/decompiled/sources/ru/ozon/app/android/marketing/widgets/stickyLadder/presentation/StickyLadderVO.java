package ru.ozon.app.android.marketing.widgets.stickyLadder.presentation;

import Ak.C2436a;
import Ns.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.seller.molecule.progressLadder.data.ProgressLadderDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "asyncData", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconRight", "Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO;", "progressLadder", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getAsyncData", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIconRight", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO;", "getProgressLadder", "()Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class StickyLadderVO implements c {
    private final String asyncData;

    @NotNull
    private final CommonControlSettings common;
    private final IconDTO iconRight;
    private final long id;

    @NotNull
    private final ProgressLadderDTO progressLadder;

    @NotNull
    private final TextDTO title;

    public StickyLadderVO(long j11, String str, @NotNull TextDTO title, IconDTO iconDTO, @NotNull ProgressLadderDTO progressLadder, @NotNull CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(progressLadder, "progressLadder");
        Intrinsics.checkNotNullParameter(common, "common");
        this.id = j11;
        this.asyncData = str;
        this.title = title;
        this.iconRight = iconDTO;
        this.progressLadder = progressLadder;
        this.common = common;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyLadderVO)) {
            return false;
        }
        StickyLadderVO stickyLadderVO = (StickyLadderVO) other;
        return this.id == stickyLadderVO.id && Intrinsics.d(this.asyncData, stickyLadderVO.asyncData) && Intrinsics.d(this.title, stickyLadderVO.title) && Intrinsics.d(this.iconRight, stickyLadderVO.iconRight) && Intrinsics.d(this.progressLadder, stickyLadderVO.progressLadder) && Intrinsics.d(this.common, stickyLadderVO.common);
    }

    public final String getAsyncData() {
        return this.asyncData;
    }

    @NotNull
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final IconDTO getIconRight() {
        return this.iconRight;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ProgressLadderDTO getProgressLadder() {
        return this.progressLadder;
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
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.asyncData;
        int a11 = b.a(this.title, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        IconDTO iconDTO = this.iconRight;
        return this.common.hashCode() + ((this.progressLadder.hashCode() + ((a11 + (iconDTO != null ? iconDTO.hashCode() : 0)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.asyncData;
        TextDTO textDTO = this.title;
        IconDTO iconDTO = this.iconRight;
        ProgressLadderDTO progressLadderDTO = this.progressLadder;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder c11 = C2436a.c(j11, "StickyLadderVO(id=", ", asyncData=", str);
        c11.append(", title=");
        c11.append(textDTO);
        c11.append(", iconRight=");
        c11.append(iconDTO);
        c11.append(", progressLadder=");
        c11.append(progressLadderDTO);
        c11.append(", common=");
        c11.append(commonControlSettings);
        c11.append(")");
        return c11.toString();
    }
}
