package ru.ozon.app.android.pdp.widgets.galleryV5.presentation;

import Pk0.b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.galleryV5.utils.GalleryV5Utils;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014Jp\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b&\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b'\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b(\u0010\"R'\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u0017\u0010,\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0018R\u0018\u0010/\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010 ¨\u00060"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5Resources;", "Lru/ozon/app/android/pdp/widgets/galleryV5/utils/GalleryV5Utils;", "Landroid/graphics/drawable/Drawable;", "bgRoundItems", "", "bgItemsCornerRadius", "bgRoundButtons", "bgOnboardingButtons", "paranja", "", "", "icons", "bgRoundWaveItems", "<init>", "(Landroid/graphics/drawable/Drawable;FLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/util/Map;Landroid/graphics/drawable/Drawable;)V", "Landroid/content/Context;", "context", "", "isSelect", "getOrCreateBgWaveItems", "(Landroid/content/Context;Z)Landroid/graphics/drawable/Drawable;", "copy", "(Landroid/graphics/drawable/Drawable;FLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/util/Map;Landroid/graphics/drawable/Drawable;)Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5Resources;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/drawable/Drawable;", "getBgRoundItems", "()Landroid/graphics/drawable/Drawable;", "F", "getBgItemsCornerRadius", "()F", "getBgRoundButtons", "getBgOnboardingButtons", "getParanja", "Ljava/util/Map;", "getIcons", "()Ljava/util/Map;", "defaultButtonsBg", "Ljava/lang/String;", "getDefaultButtonsBg", "_bgRoundWaveItems", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GalleryV5Resources implements GalleryV5Utils {
    private Drawable _bgRoundWaveItems;
    private final float bgItemsCornerRadius;
    private final Drawable bgOnboardingButtons;
    private final Drawable bgRoundButtons;
    private final Drawable bgRoundItems;
    private final Drawable bgRoundWaveItems;

    @NotNull
    private final String defaultButtonsBg;
    private final Map<String, Drawable> icons;
    private final Drawable paranja;

    /* JADX WARN: Multi-variable type inference failed */
    public GalleryV5Resources(Drawable drawable, float f7, Drawable drawable2, Drawable drawable3, Drawable drawable4, Map<String, ? extends Drawable> map, Drawable drawable5) {
        this.bgRoundItems = drawable;
        this.bgItemsCornerRadius = f7;
        this.bgRoundButtons = drawable2;
        this.bgOnboardingButtons = drawable3;
        this.paranja = drawable4;
        this.icons = map;
        this.bgRoundWaveItems = drawable5;
        this.defaultButtonsBg = UniTheme.INSTANCE.getColorTokens().getTextPrimaryOnDark().getId();
        this._bgRoundWaveItems = drawable5;
    }

    public static /* synthetic */ GalleryV5Resources copy$default(GalleryV5Resources galleryV5Resources, Drawable drawable, float f7, Drawable drawable2, Drawable drawable3, Drawable drawable4, Map map, Drawable drawable5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            drawable = galleryV5Resources.bgRoundItems;
        }
        if ((i11 & 2) != 0) {
            f7 = galleryV5Resources.bgItemsCornerRadius;
        }
        if ((i11 & 4) != 0) {
            drawable2 = galleryV5Resources.bgRoundButtons;
        }
        if ((i11 & 8) != 0) {
            drawable3 = galleryV5Resources.bgOnboardingButtons;
        }
        if ((i11 & 16) != 0) {
            drawable4 = galleryV5Resources.paranja;
        }
        if ((i11 & 32) != 0) {
            map = galleryV5Resources.icons;
        }
        if ((i11 & 64) != 0) {
            drawable5 = galleryV5Resources.bgRoundWaveItems;
        }
        Map map2 = map;
        Drawable drawable6 = drawable5;
        Drawable drawable7 = drawable4;
        Drawable drawable8 = drawable2;
        return galleryV5Resources.copy(drawable, f7, drawable8, drawable3, drawable7, map2, drawable6);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.utils.GalleryV5Utils
    public int calculateHeight(Double d11, @NotNull Context context, double d12) {
        return GalleryV5Utils.DefaultImpls.calculateHeight(this, d11, context, d12);
    }

    @NotNull
    public final GalleryV5Resources copy(Drawable bgRoundItems, float bgItemsCornerRadius, Drawable bgRoundButtons, Drawable bgOnboardingButtons, Drawable paranja, Map<String, ? extends Drawable> icons, Drawable bgRoundWaveItems) {
        return new GalleryV5Resources(bgRoundItems, bgItemsCornerRadius, bgRoundButtons, bgOnboardingButtons, paranja, icons, bgRoundWaveItems);
    }

    @NotNull
    public GradientDrawable createBgRoundItems(@NotNull Context context, boolean z11) {
        return GalleryV5Utils.DefaultImpls.createBgRoundItems(this, context, z11);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryV5Resources)) {
            return false;
        }
        GalleryV5Resources galleryV5Resources = (GalleryV5Resources) other;
        return Intrinsics.d(this.bgRoundItems, galleryV5Resources.bgRoundItems) && Float.compare(this.bgItemsCornerRadius, galleryV5Resources.bgItemsCornerRadius) == 0 && Intrinsics.d(this.bgRoundButtons, galleryV5Resources.bgRoundButtons) && Intrinsics.d(this.bgOnboardingButtons, galleryV5Resources.bgOnboardingButtons) && Intrinsics.d(this.paranja, galleryV5Resources.paranja) && Intrinsics.d(this.icons, galleryV5Resources.icons) && Intrinsics.d(this.bgRoundWaveItems, galleryV5Resources.bgRoundWaveItems);
    }

    public final float getBgItemsCornerRadius() {
        return this.bgItemsCornerRadius;
    }

    public final Drawable getBgOnboardingButtons() {
        return this.bgOnboardingButtons;
    }

    public final Drawable getBgRoundButtons() {
        return this.bgRoundButtons;
    }

    public final Drawable getBgRoundItems() {
        return this.bgRoundItems;
    }

    @NotNull
    public final String getDefaultButtonsBg() {
        return this.defaultButtonsBg;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getDefaultGalleryRatio() {
        return GalleryV5Utils.DefaultImpls.getDefaultGalleryRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getMaxRatio() {
        return GalleryV5Utils.DefaultImpls.getMaxRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getMaxVerticalStateRatio() {
        return GalleryV5Utils.DefaultImpls.getMaxVerticalStateRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getMinContainerRatio() {
        return GalleryV5Utils.DefaultImpls.getMinContainerRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getMinGalleryRatio() {
        return GalleryV5Utils.DefaultImpls.getMinGalleryRatio(this);
    }

    @NotNull
    public final Drawable getOrCreateBgWaveItems(@NotNull Context context, boolean isSelect) {
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable drawable = this._bgRoundWaveItems;
        if (drawable != null) {
            return drawable;
        }
        GradientDrawable createBgRoundItems = createBgRoundItems(context, isSelect);
        this._bgRoundWaveItems = createBgRoundItems;
        return createBgRoundItems;
    }

    public final Drawable getParanja() {
        return this.paranja;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public float getWavesAmount() {
        return GalleryV5Utils.DefaultImpls.getWavesAmount(this);
    }

    public int hashCode() {
        Drawable drawable = this.bgRoundItems;
        int a11 = b.a(this.bgItemsCornerRadius, (drawable == null ? 0 : drawable.hashCode()) * 31, 31);
        Drawable drawable2 = this.bgRoundButtons;
        int hashCode = (a11 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        Drawable drawable3 = this.bgOnboardingButtons;
        int hashCode2 = (hashCode + (drawable3 == null ? 0 : drawable3.hashCode())) * 31;
        Drawable drawable4 = this.paranja;
        int hashCode3 = (hashCode2 + (drawable4 == null ? 0 : drawable4.hashCode())) * 31;
        Map<String, Drawable> map = this.icons;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Drawable drawable5 = this.bgRoundWaveItems;
        return hashCode4 + (drawable5 != null ? drawable5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GalleryV5Resources(bgRoundItems=" + this.bgRoundItems + ", bgItemsCornerRadius=" + this.bgItemsCornerRadius + ", bgRoundButtons=" + this.bgRoundButtons + ", bgOnboardingButtons=" + this.bgOnboardingButtons + ", paranja=" + this.paranja + ", icons=" + this.icons + ", bgRoundWaveItems=" + this.bgRoundWaveItems + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GalleryV5Resources(android.graphics.drawable.Drawable r9, float r10, android.graphics.drawable.Drawable r11, android.graphics.drawable.Drawable r12, android.graphics.drawable.Drawable r13, java.util.Map r14, android.graphics.drawable.Drawable r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 2
            if (r0 == 0) goto L5
            r10 = 0
        L5:
            r2 = r10
            r10 = r16 & 32
            r0 = 0
            if (r10 == 0) goto Ld
            r6 = r0
            goto Le
        Ld:
            r6 = r14
        Le:
            r10 = r16 & 64
            if (r10 == 0) goto L19
            r7 = r0
            r1 = r9
            r3 = r11
            r4 = r12
            r5 = r13
            r0 = r8
            goto L1f
        L19:
            r7 = r15
            r0 = r8
            r1 = r9
            r3 = r11
            r4 = r12
            r5 = r13
        L1f:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5Resources.<init>(android.graphics.drawable.Drawable, float, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, java.util.Map, android.graphics.drawable.Drawable, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
