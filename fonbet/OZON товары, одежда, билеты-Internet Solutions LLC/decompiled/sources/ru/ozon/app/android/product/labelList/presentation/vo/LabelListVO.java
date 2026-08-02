package ru.ozon.app.android.product.labelList.presentation.vo;

import B0.C2454a;
import G.g;
import K00.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001a\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO;", "", "", "Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO$LabelItemVO;", "items", "", "topOffset", "bottomOffset", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(Ljava/util/List;IILru/ozon/uni/atoms/data/TestInfo;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "I", "getTopOffset", "getBottomOffset", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "LabelItemVO", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class LabelListVO {
    private final int bottomOffset;

    @NotNull
    private final List<LabelItemVO> items;
    private final TestInfo testInfo;
    private final int topOffset;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO$LabelItemVO;", "", "Text", "Icon", "Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO$LabelItemVO$Icon;", "Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO$LabelItemVO$Text;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface LabelItemVO {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0018\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO$LabelItemVO$Icon;", "Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO$LabelItemVO;", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "icon", "", "iconSizePx", "leftOffsetPx", "<init>", "(Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "I", "getIconSizePx", "getLeftOffsetPx", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Icon implements LabelItemVO {

            @NotNull
            private final CommonAtomIconDTO icon;
            private final int iconSizePx;
            private final int leftOffsetPx;

            public Icon(@NotNull CommonAtomIconDTO icon, int i11, int i12) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                this.icon = icon;
                this.iconSizePx = i11;
                this.leftOffsetPx = i12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) other;
                return Intrinsics.d(this.icon, icon.icon) && this.iconSizePx == icon.iconSizePx && this.leftOffsetPx == icon.leftOffsetPx;
            }

            @NotNull
            public final CommonAtomIconDTO getIcon() {
                return this.icon;
            }

            public final int getIconSizePx() {
                return this.iconSizePx;
            }

            public int getLeftOffsetPx() {
                return this.leftOffsetPx;
            }

            public int hashCode() {
                return Integer.hashCode(this.leftOffsetPx) + C2454a.a(this.iconSizePx, this.icon.hashCode() * 31, 31);
            }

            @NotNull
            public String toString() {
                CommonAtomIconDTO commonAtomIconDTO = this.icon;
                int i11 = this.iconSizePx;
                int i12 = this.leftOffsetPx;
                StringBuilder sb2 = new StringBuilder("Icon(icon=");
                sb2.append(commonAtomIconDTO);
                sb2.append(", iconSizePx=");
                sb2.append(i11);
                sb2.append(", leftOffsetPx=");
                return b.e(i12, ")", sb2);
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0019\u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u000e¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO$LabelItemVO$Text;", "Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO$LabelItemVO;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "text", "", "textColor", "typographyToken", "", "leftOffsetPx", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Ljava/lang/String;", "getTextColor", "getTypographyToken", "I", "getLeftOffsetPx", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Text implements LabelItemVO {
            private final int leftOffsetPx;

            @NotNull
            private final OzonSpannableString text;

            @NotNull
            private final String textColor;

            @NotNull
            private final String typographyToken;

            public Text(@NotNull OzonSpannableString text, @NotNull String textColor, @NotNull String typographyToken, int i11) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(textColor, "textColor");
                Intrinsics.checkNotNullParameter(typographyToken, "typographyToken");
                this.text = text;
                this.textColor = textColor;
                this.typographyToken = typographyToken;
                this.leftOffsetPx = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Text)) {
                    return false;
                }
                Text text = (Text) other;
                return Intrinsics.d(this.text, text.text) && Intrinsics.d(this.textColor, text.textColor) && Intrinsics.d(this.typographyToken, text.typographyToken) && this.leftOffsetPx == text.leftOffsetPx;
            }

            public int getLeftOffsetPx() {
                return this.leftOffsetPx;
            }

            @NotNull
            public final OzonSpannableString getText() {
                return this.text;
            }

            @NotNull
            public final String getTextColor() {
                return this.textColor;
            }

            @NotNull
            public final String getTypographyToken() {
                return this.typographyToken;
            }

            public int hashCode() {
                return Integer.hashCode(this.leftOffsetPx) + g.a(g.a(this.text.hashCode() * 31, 31, this.textColor), 31, this.typographyToken);
            }

            @NotNull
            public String toString() {
                OzonSpannableString ozonSpannableString = this.text;
                String str = this.textColor;
                String str2 = this.typographyToken;
                int i11 = this.leftOffsetPx;
                StringBuilder f7 = GR.b.f("Text(text=", ozonSpannableString, ", textColor=", str, ", typographyToken=");
                f7.append(str2);
                f7.append(", leftOffsetPx=");
                f7.append(i11);
                f7.append(")");
                return f7.toString();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LabelListVO(@NotNull List<? extends LabelItemVO> items, int i11, int i12, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.topOffset = i11;
        this.bottomOffset = i12;
        this.testInfo = testInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabelListVO)) {
            return false;
        }
        LabelListVO labelListVO = (LabelListVO) other;
        return Intrinsics.d(this.items, labelListVO.items) && this.topOffset == labelListVO.topOffset && this.bottomOffset == labelListVO.bottomOffset && Intrinsics.d(this.testInfo, labelListVO.testInfo);
    }

    public final int getBottomOffset() {
        return this.bottomOffset;
    }

    @NotNull
    public final List<LabelItemVO> getItems() {
        return this.items;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final int getTopOffset() {
        return this.topOffset;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.bottomOffset, C2454a.a(this.topOffset, this.items.hashCode() * 31, 31), 31);
        TestInfo testInfo = this.testInfo;
        return a11 + (testInfo == null ? 0 : testInfo.hashCode());
    }

    @NotNull
    public String toString() {
        return "LabelListVO(items=" + this.items + ", topOffset=" + this.topOffset + ", bottomOffset=" + this.bottomOffset + ", testInfo=" + this.testInfo + ")";
    }
}
