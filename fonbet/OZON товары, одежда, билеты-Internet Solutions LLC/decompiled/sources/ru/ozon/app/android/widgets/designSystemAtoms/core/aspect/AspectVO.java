package ru.ozon.app.android.widgets.designSystemAtoms.core.aspect;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/widgets/designSystemAtoms/core/aspect/AspectVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "aspectDTO", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTO", "<init>", "(JLru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getAspectDTO", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTextDTO", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AspectVO implements c {
    public static final int $stable = AspectDTO.$stable;

    @NotNull
    private final AspectDTO aspectDTO;
    private final long id;

    @NotNull
    private final TextDTO textDTO;

    public AspectVO(long j11, @NotNull AspectDTO aspectDTO, @NotNull TextDTO textDTO) {
        Intrinsics.checkNotNullParameter(aspectDTO, "aspectDTO");
        Intrinsics.checkNotNullParameter(textDTO, "textDTO");
        this.id = j11;
        this.aspectDTO = aspectDTO;
        this.textDTO = textDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AspectVO)) {
            return false;
        }
        AspectVO aspectVO = (AspectVO) other;
        return this.id == aspectVO.id && Intrinsics.d(this.aspectDTO, aspectVO.aspectDTO) && Intrinsics.d(this.textDTO, aspectVO.textDTO);
    }

    @NotNull
    public final AspectDTO getAspectDTO() {
        return this.aspectDTO;
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
    public final TextDTO getTextDTO() {
        return this.textDTO;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.textDTO.hashCode() + ((this.aspectDTO.hashCode() + (Long.hashCode(this.id) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "AspectVO(id=" + this.id + ", aspectDTO=" + this.aspectDTO + ", textDTO=" + this.textDTO + ")";
    }
}
