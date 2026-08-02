package ru.ozon.app.android.pdp.widgets.galleryV4.presentation;

import Pk0.b;
import android.graphics.drawable.Drawable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J|\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R'\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b)\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b*\u0010\u001d¨\u0006+"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4Resources;", "", "Landroid/graphics/drawable/Drawable;", "bgRoundItems", "", "bgItemsCornerRadius", "bgRoundButtons", "paranja", "", "buttonsTint", "", "", "icons", "fgRoundWaveItem", "bgRoundWaveItems", "<init>", "(Landroid/graphics/drawable/Drawable;FLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/util/Map;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", "copy", "(Landroid/graphics/drawable/Drawable;FLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/util/Map;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4Resources;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/drawable/Drawable;", "getBgRoundItems", "()Landroid/graphics/drawable/Drawable;", "F", "getBgItemsCornerRadius", "()F", "getBgRoundButtons", "getParanja", "Ljava/lang/Integer;", "getButtonsTint", "()Ljava/lang/Integer;", "Ljava/util/Map;", "getIcons", "()Ljava/util/Map;", "getFgRoundWaveItem", "getBgRoundWaveItems", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GalleryV4Resources {
    private final float bgItemsCornerRadius;
    private final Drawable bgRoundButtons;
    private final Drawable bgRoundItems;
    private final Drawable bgRoundWaveItems;
    private final Integer buttonsTint;
    private final Drawable fgRoundWaveItem;
    private final Map<String, Drawable> icons;
    private final Drawable paranja;

    /* JADX WARN: Multi-variable type inference failed */
    public GalleryV4Resources(Drawable drawable, float f7, Drawable drawable2, Drawable drawable3, Integer num, Map<String, ? extends Drawable> map, Drawable drawable4, Drawable drawable5) {
        this.bgRoundItems = drawable;
        this.bgItemsCornerRadius = f7;
        this.bgRoundButtons = drawable2;
        this.paranja = drawable3;
        this.buttonsTint = num;
        this.icons = map;
        this.fgRoundWaveItem = drawable4;
        this.bgRoundWaveItems = drawable5;
    }

    public static /* synthetic */ GalleryV4Resources copy$default(GalleryV4Resources galleryV4Resources, Drawable drawable, float f7, Drawable drawable2, Drawable drawable3, Integer num, Map map, Drawable drawable4, Drawable drawable5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            drawable = galleryV4Resources.bgRoundItems;
        }
        if ((i11 & 2) != 0) {
            f7 = galleryV4Resources.bgItemsCornerRadius;
        }
        if ((i11 & 4) != 0) {
            drawable2 = galleryV4Resources.bgRoundButtons;
        }
        if ((i11 & 8) != 0) {
            drawable3 = galleryV4Resources.paranja;
        }
        if ((i11 & 16) != 0) {
            num = galleryV4Resources.buttonsTint;
        }
        if ((i11 & 32) != 0) {
            map = galleryV4Resources.icons;
        }
        if ((i11 & 64) != 0) {
            drawable4 = galleryV4Resources.fgRoundWaveItem;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            drawable5 = galleryV4Resources.bgRoundWaveItems;
        }
        Drawable drawable6 = drawable4;
        Drawable drawable7 = drawable5;
        Integer num2 = num;
        Map map2 = map;
        return galleryV4Resources.copy(drawable, f7, drawable2, drawable3, num2, map2, drawable6, drawable7);
    }

    @NotNull
    public final GalleryV4Resources copy(Drawable bgRoundItems, float bgItemsCornerRadius, Drawable bgRoundButtons, Drawable paranja, Integer buttonsTint, Map<String, ? extends Drawable> icons, Drawable fgRoundWaveItem, Drawable bgRoundWaveItems) {
        return new GalleryV4Resources(bgRoundItems, bgItemsCornerRadius, bgRoundButtons, paranja, buttonsTint, icons, fgRoundWaveItem, bgRoundWaveItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryV4Resources)) {
            return false;
        }
        GalleryV4Resources galleryV4Resources = (GalleryV4Resources) other;
        return Intrinsics.d(this.bgRoundItems, galleryV4Resources.bgRoundItems) && Float.compare(this.bgItemsCornerRadius, galleryV4Resources.bgItemsCornerRadius) == 0 && Intrinsics.d(this.bgRoundButtons, galleryV4Resources.bgRoundButtons) && Intrinsics.d(this.paranja, galleryV4Resources.paranja) && Intrinsics.d(this.buttonsTint, galleryV4Resources.buttonsTint) && Intrinsics.d(this.icons, galleryV4Resources.icons) && Intrinsics.d(this.fgRoundWaveItem, galleryV4Resources.fgRoundWaveItem) && Intrinsics.d(this.bgRoundWaveItems, galleryV4Resources.bgRoundWaveItems);
    }

    public final float getBgItemsCornerRadius() {
        return this.bgItemsCornerRadius;
    }

    public final Drawable getBgRoundButtons() {
        return this.bgRoundButtons;
    }

    public final Drawable getBgRoundItems() {
        return this.bgRoundItems;
    }

    public final Drawable getBgRoundWaveItems() {
        return this.bgRoundWaveItems;
    }

    public final Integer getButtonsTint() {
        return this.buttonsTint;
    }

    public final Drawable getFgRoundWaveItem() {
        return this.fgRoundWaveItem;
    }

    public final Drawable getParanja() {
        return this.paranja;
    }

    public int hashCode() {
        Drawable drawable = this.bgRoundItems;
        int a11 = b.a(this.bgItemsCornerRadius, (drawable == null ? 0 : drawable.hashCode()) * 31, 31);
        Drawable drawable2 = this.bgRoundButtons;
        int hashCode = (a11 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        Drawable drawable3 = this.paranja;
        int hashCode2 = (hashCode + (drawable3 == null ? 0 : drawable3.hashCode())) * 31;
        Integer num = this.buttonsTint;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, Drawable> map = this.icons;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Drawable drawable4 = this.fgRoundWaveItem;
        int hashCode5 = (hashCode4 + (drawable4 == null ? 0 : drawable4.hashCode())) * 31;
        Drawable drawable5 = this.bgRoundWaveItems;
        return hashCode5 + (drawable5 != null ? drawable5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GalleryV4Resources(bgRoundItems=" + this.bgRoundItems + ", bgItemsCornerRadius=" + this.bgItemsCornerRadius + ", bgRoundButtons=" + this.bgRoundButtons + ", paranja=" + this.paranja + ", buttonsTint=" + this.buttonsTint + ", icons=" + this.icons + ", fgRoundWaveItem=" + this.fgRoundWaveItem + ", bgRoundWaveItems=" + this.bgRoundWaveItems + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GalleryV4Resources(android.graphics.drawable.Drawable r10, float r11, android.graphics.drawable.Drawable r12, android.graphics.drawable.Drawable r13, java.lang.Integer r14, java.util.Map r15, android.graphics.drawable.Drawable r16, android.graphics.drawable.Drawable r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 2
            if (r1 == 0) goto L7
            r11 = 0
        L7:
            r2 = r11
            r11 = r0 & 16
            r1 = 0
            if (r11 == 0) goto Lf
            r5 = r1
            goto L10
        Lf:
            r5 = r14
        L10:
            r11 = r0 & 32
            if (r11 == 0) goto L16
            r6 = r1
            goto L17
        L16:
            r6 = r15
        L17:
            r11 = r0 & 64
            if (r11 == 0) goto L1d
            r7 = r1
            goto L1f
        L1d:
            r7 = r16
        L1f:
            r11 = r0 & 128(0x80, float:1.8E-43)
            if (r11 == 0) goto L29
            r8 = r1
            r0 = r9
            r3 = r12
            r4 = r13
            r1 = r10
            goto L2f
        L29:
            r8 = r17
            r0 = r9
            r1 = r10
            r3 = r12
            r4 = r13
        L2f:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4Resources.<init>(android.graphics.drawable.Drawable, float, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, java.lang.Integer, java.util.Map, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
