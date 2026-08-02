package ru.ozon.android.composerCommonViewKit.plainText.pesentation;

import B0.A0;
import B0.C2454a;
import D3.h;
import Ns.b;
import TY.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010\u0015R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b)\u0010\u0015R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b*\u0010\u0015R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b+\u0010\u0015¨\u0006,"}, d2 = {"Lru/ozon/android/composerCommonViewKit/plainText/pesentation/PlainTextVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTO", "", "backgroundColor", "", "topIslandCornerRadius", "bottomIslandCornerRadius", "", "leftMargin", "topMargin", "rightMargin", "bottomMargin", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;FFIIII)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTextDTO", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getBackgroundColor", "F", "getTopIslandCornerRadius", "()F", "getBottomIslandCornerRadius", "I", "getLeftMargin", "getTopMargin", "getRightMargin", "getBottomMargin", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PlainTextVO implements c {
    private final String backgroundColor;
    private final float bottomIslandCornerRadius;
    private final int bottomMargin;
    private final long id;
    private final int leftMargin;
    private final int rightMargin;

    @NotNull
    private final TextDTO textDTO;
    private final float topIslandCornerRadius;
    private final int topMargin;

    public PlainTextVO(long j11, @NotNull TextDTO textDTO, String str, float f7, float f11, int i11, int i12, int i13, int i14) {
        Intrinsics.checkNotNullParameter(textDTO, "textDTO");
        this.id = j11;
        this.textDTO = textDTO;
        this.backgroundColor = str;
        this.topIslandCornerRadius = f7;
        this.bottomIslandCornerRadius = f11;
        this.leftMargin = i11;
        this.topMargin = i12;
        this.rightMargin = i13;
        this.bottomMargin = i14;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlainTextVO)) {
            return false;
        }
        PlainTextVO plainTextVO = (PlainTextVO) other;
        return this.id == plainTextVO.id && Intrinsics.d(this.textDTO, plainTextVO.textDTO) && Intrinsics.d(this.backgroundColor, plainTextVO.backgroundColor) && Float.compare(this.topIslandCornerRadius, plainTextVO.topIslandCornerRadius) == 0 && Float.compare(this.bottomIslandCornerRadius, plainTextVO.bottomIslandCornerRadius) == 0 && this.leftMargin == plainTextVO.leftMargin && this.topMargin == plainTextVO.topMargin && this.rightMargin == plainTextVO.rightMargin && this.bottomMargin == plainTextVO.bottomMargin;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final float getBottomIslandCornerRadius() {
        return this.bottomIslandCornerRadius;
    }

    public final int getBottomMargin() {
        return this.bottomMargin;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getLeftMargin() {
        return this.leftMargin;
    }

    public final int getRightMargin() {
        return this.rightMargin;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTextDTO() {
        return this.textDTO;
    }

    public final float getTopIslandCornerRadius() {
        return this.topIslandCornerRadius;
    }

    public final int getTopMargin() {
        return this.topMargin;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.textDTO, Long.hashCode(this.id) * 31, 31);
        String str = this.backgroundColor;
        return Integer.hashCode(this.bottomMargin) + C2454a.a(this.rightMargin, C2454a.a(this.topMargin, C2454a.a(this.leftMargin, Pk0.b.a(this.bottomIslandCornerRadius, Pk0.b.a(this.topIslandCornerRadius, (a11 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.textDTO;
        String str = this.backgroundColor;
        float f7 = this.topIslandCornerRadius;
        float f11 = this.bottomIslandCornerRadius;
        int i11 = this.leftMargin;
        int i12 = this.topMargin;
        int i13 = this.rightMargin;
        int i14 = this.bottomMargin;
        StringBuilder b11 = a.b("PlainTextVO(id=", j11, ", textDTO=", textDTO);
        b11.append(", backgroundColor=");
        b11.append(str);
        b11.append(", topIslandCornerRadius=");
        b11.append(f7);
        b11.append(", bottomIslandCornerRadius=");
        b11.append(f11);
        b11.append(", leftMargin=");
        b11.append(i11);
        A0.c(i12, i13, ", topMargin=", ", rightMargin=", b11);
        return h.b(b11, ", bottomMargin=", i14, ")");
    }
}
