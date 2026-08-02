package ru.ozon.uni.android.atom.price.data;

import Am.C2438a;
import B0.C2454a;
import Ek.a;
import Kk.C3532b;
import android.graphics.Paint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0006\u0010\u0013\u0082\u0001\u0003\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/uni/android/atom/price/data/ComponentConfig;", "", "", "startIndex", "endIndex", "", "isOnBg", "<init>", "(IIZ)V", "", "charSequence", "length", "(Ljava/lang/CharSequence;)I", "height", "()I", "I", "getStartIndex", "getEndIndex", "Z", "()Z", "TextComponent", "SpaceComponent", "IconComponent", "Lru/ozon/uni/android/atom/price/data/ComponentConfig$IconComponent;", "Lru/ozon/uni/android/atom/price/data/ComponentConfig$SpaceComponent;", "Lru/ozon/uni/android/atom/price/data/ComponentConfig$TextComponent;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ComponentConfig {
    private final int endIndex;
    private final boolean isOnBg;
    private final int startIndex;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u0007\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/uni/android/atom/price/data/ComponentConfig$IconComponent;", "Lru/ozon/uni/android/atom/price/data/ComponentConfig;", "", "size", "startIndex", "endIndex", "", "isOnBg", "<init>", "(IIIZ)V", "", "charSequence", "length", "(Ljava/lang/CharSequence;)I", "height", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getSize", "getStartIndex", "getEndIndex", "Z", "()Z", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class IconComponent extends ComponentConfig {
        private final int endIndex;
        private final boolean isOnBg;
        private final int size;
        private final int startIndex;

        public IconComponent(int i11, int i12, int i13, boolean z11) {
            super(i12, i13, z11, null);
            this.size = i11;
            this.startIndex = i12;
            this.endIndex = i13;
            this.isOnBg = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconComponent)) {
                return false;
            }
            IconComponent iconComponent = (IconComponent) other;
            return this.size == iconComponent.size && this.startIndex == iconComponent.startIndex && this.endIndex == iconComponent.endIndex && this.isOnBg == iconComponent.isOnBg;
        }

        @Override // ru.ozon.uni.android.atom.price.data.ComponentConfig
        public int getStartIndex() {
            return this.startIndex;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isOnBg) + C2454a.a(this.endIndex, C2454a.a(this.startIndex, Integer.hashCode(this.size) * 31, 31), 31);
        }

        @Override // ru.ozon.uni.android.atom.price.data.ComponentConfig
        public int height() {
            return 0;
        }

        @Override // ru.ozon.uni.android.atom.price.data.ComponentConfig
        /* renamed from: isOnBg, reason: from getter */
        public boolean getIsOnBg() {
            return this.isOnBg;
        }

        @Override // ru.ozon.uni.android.atom.price.data.ComponentConfig
        public int length(@NotNull CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            return this.size;
        }

        @NotNull
        public String toString() {
            int i11 = this.size;
            int i12 = this.startIndex;
            int i13 = this.endIndex;
            boolean z11 = this.isOnBg;
            StringBuilder a11 = C2438a.a("IconComponent(size=", i11, ", startIndex=", ", endIndex=", i12);
            a11.append(i13);
            a11.append(", isOnBg=");
            a11.append(z11);
            a11.append(")");
            return a11.toString();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0005\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001e\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lru/ozon/uni/android/atom/price/data/ComponentConfig$SpaceComponent;", "Lru/ozon/uni/android/atom/price/data/ComponentConfig;", "", "space", "", "isBgPadding", "startIndex", "endIndex", "isOnBg", "<init>", "(IZIIZ)V", "", "charSequence", "length", "(Ljava/lang/CharSequence;)I", "height", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getSpace", "Z", "()Z", "getStartIndex", "getEndIndex", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SpaceComponent extends ComponentConfig {
        private final int endIndex;
        private final boolean isBgPadding;
        private final boolean isOnBg;
        private final int space;
        private final int startIndex;

        public SpaceComponent(int i11, boolean z11, int i12, int i13, boolean z12) {
            super(i12, i13, z12, null);
            this.space = i11;
            this.isBgPadding = z11;
            this.startIndex = i12;
            this.endIndex = i13;
            this.isOnBg = z12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpaceComponent)) {
                return false;
            }
            SpaceComponent spaceComponent = (SpaceComponent) other;
            return this.space == spaceComponent.space && this.isBgPadding == spaceComponent.isBgPadding && this.startIndex == spaceComponent.startIndex && this.endIndex == spaceComponent.endIndex && this.isOnBg == spaceComponent.isOnBg;
        }

        @Override // ru.ozon.uni.android.atom.price.data.ComponentConfig
        public int getStartIndex() {
            return this.startIndex;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isOnBg) + C2454a.a(this.endIndex, C2454a.a(this.startIndex, C3532b.a(Integer.hashCode(this.space) * 31, 31, this.isBgPadding), 31), 31);
        }

        @Override // ru.ozon.uni.android.atom.price.data.ComponentConfig
        public int height() {
            return 0;
        }

        /* renamed from: isBgPadding, reason: from getter */
        public final boolean getIsBgPadding() {
            return this.isBgPadding;
        }

        @Override // ru.ozon.uni.android.atom.price.data.ComponentConfig
        /* renamed from: isOnBg, reason: from getter */
        public boolean getIsOnBg() {
            return this.isOnBg;
        }

        @Override // ru.ozon.uni.android.atom.price.data.ComponentConfig
        public int length(@NotNull CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            return this.space;
        }

        @NotNull
        public String toString() {
            int i11 = this.space;
            boolean z11 = this.isBgPadding;
            int i12 = this.startIndex;
            int i13 = this.endIndex;
            boolean z12 = this.isOnBg;
            StringBuilder sb2 = new StringBuilder("SpaceComponent(space=");
            sb2.append(i11);
            sb2.append(", isBgPadding=");
            sb2.append(z11);
            sb2.append(", startIndex=");
            a.f(i12, i13, ", endIndex=", ", isOnBg=", sb2);
            return Pk0.a.a(")", sb2, z12);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010%R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\"\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010%R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b(\u0010\u0013R\u001a\u0010\n\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b)\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b\u000b\u0010!¨\u0006*"}, d2 = {"Lru/ozon/uni/android/atom/price/data/ComponentConfig$TextComponent;", "Lru/ozon/uni/android/atom/price/data/ComponentConfig;", "Landroid/graphics/Paint;", "paint", "", "canDrawWithGradient", "", "startX", "endX", "startIndex", "endIndex", "isOnBg", "<init>", "(Landroid/graphics/Paint;ZIIIIZ)V", "", "charSequence", "length", "(Ljava/lang/CharSequence;)I", "height", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "Z", "getCanDrawWithGradient", "()Z", "I", "getStartX", "setStartX", "(I)V", "getEndX", "setEndX", "getStartIndex", "getEndIndex", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextComponent extends ComponentConfig {
        private final boolean canDrawWithGradient;
        private final int endIndex;
        private int endX;
        private final boolean isOnBg;

        @NotNull
        private final Paint paint;
        private final int startIndex;
        private int startX;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ TextComponent(Paint paint, boolean z11, int i11, int i12, int i13, int i14, boolean z12, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this(paint, z11, i11, r6, r7, r8, r9);
            boolean z13;
            int i16;
            int i17;
            int i18;
            i11 = (i15 & 4) != 0 ? 0 : i11;
            if ((i15 & 8) != 0) {
                z13 = z12;
                i16 = i14;
                i17 = i13;
                i18 = 0;
            } else {
                z13 = z12;
                i16 = i14;
                i17 = i13;
                i18 = i12;
            }
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextComponent)) {
                return false;
            }
            TextComponent textComponent = (TextComponent) other;
            return Intrinsics.d(this.paint, textComponent.paint) && this.canDrawWithGradient == textComponent.canDrawWithGradient && this.startX == textComponent.startX && this.endX == textComponent.endX && this.startIndex == textComponent.startIndex && this.endIndex == textComponent.endIndex && this.isOnBg == textComponent.isOnBg;
        }

        public final boolean getCanDrawWithGradient() {
            return this.canDrawWithGradient;
        }

        public int getEndIndex() {
            return this.endIndex;
        }

        public final int getEndX() {
            return this.endX;
        }

        @NotNull
        public final Paint getPaint() {
            return this.paint;
        }

        @Override // ru.ozon.uni.android.atom.price.data.ComponentConfig
        public int getStartIndex() {
            return this.startIndex;
        }

        public final int getStartX() {
            return this.startX;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isOnBg) + C2454a.a(this.endIndex, C2454a.a(this.startIndex, C2454a.a(this.endX, C2454a.a(this.startX, C3532b.a(this.paint.hashCode() * 31, 31, this.canDrawWithGradient), 31), 31), 31), 31);
        }

        @Override // ru.ozon.uni.android.atom.price.data.ComponentConfig
        public int height() {
            return (int) this.paint.getFontSpacing();
        }

        @Override // ru.ozon.uni.android.atom.price.data.ComponentConfig
        /* renamed from: isOnBg, reason: from getter */
        public boolean getIsOnBg() {
            return this.isOnBg;
        }

        @Override // ru.ozon.uni.android.atom.price.data.ComponentConfig
        public int length(@NotNull CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            return (int) this.paint.measureText(charSequence, getStartIndex(), getEndIndex());
        }

        public final void setEndX(int i11) {
            this.endX = i11;
        }

        public final void setStartX(int i11) {
            this.startX = i11;
        }

        @NotNull
        public String toString() {
            Paint paint = this.paint;
            boolean z11 = this.canDrawWithGradient;
            int i11 = this.startX;
            int i12 = this.endX;
            int i13 = this.startIndex;
            int i14 = this.endIndex;
            boolean z12 = this.isOnBg;
            StringBuilder sb2 = new StringBuilder("TextComponent(paint=");
            sb2.append(paint);
            sb2.append(", canDrawWithGradient=");
            sb2.append(z11);
            sb2.append(", startX=");
            a.f(i11, i12, ", endX=", ", startIndex=", sb2);
            a.f(i13, i14, ", endIndex=", ", isOnBg=", sb2);
            return Pk0.a.a(")", sb2, z12);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextComponent(@NotNull Paint paint, boolean z11, int i11, int i12, int i13, int i14, boolean z12) {
            super(i13, i14, z12, null);
            Intrinsics.checkNotNullParameter(paint, "paint");
            this.paint = paint;
            this.canDrawWithGradient = z11;
            this.startX = i11;
            this.endX = i12;
            this.startIndex = i13;
            this.endIndex = i14;
            this.isOnBg = z12;
        }
    }

    public /* synthetic */ ComponentConfig(int i11, int i12, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, z11);
    }

    public int getStartIndex() {
        return this.startIndex;
    }

    public abstract int height();

    /* renamed from: isOnBg, reason: from getter */
    public boolean getIsOnBg() {
        return this.isOnBg;
    }

    public abstract int length(@NotNull CharSequence charSequence);

    private ComponentConfig(int i11, int i12, boolean z11) {
        this.startIndex = i11;
        this.endIndex = i12;
        this.isOnBg = z11;
    }
}
