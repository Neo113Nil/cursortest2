package ru.ozon.app.android.storefront.core.socialAtoms.iconButton;

import Sc.o;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.Size;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialIconButtonView;", "Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialButtonView;", "Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialIconButtonDTO;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "iconView", "Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialIconButtonChildView;", "getIconView", "()Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialIconButtonChildView;", "setup", "", "dto", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SocialIconButtonView extends SocialButtonView<SocialIconButtonDTO> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Size.values().length];
            try {
                iArr[Size.SIZE_XL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Size.SIZE_L.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Size.SIZE_M.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Size.SIZE_S.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Size.SIZE_XS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SocialIconButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final SocialIconButtonChildView getIconView() {
        View socialIconButtonChildView;
        int childCount = getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                socialIconButtonChildView = new SocialIconButtonChildView(context, null, 0, 6, null);
                addView(socialIconButtonChildView);
                break;
            }
            socialIconButtonChildView = getChildAt(i11);
            if (socialIconButtonChildView instanceof SocialIconButtonChildView) {
                break;
            }
            i11++;
        }
        return (SocialIconButtonChildView) socialIconButtonChildView;
    }

    public void setup(@NotNull SocialIconButtonDTO dto) {
        int i11;
        Intrinsics.checkNotNullParameter(dto, "dto");
        SocialIconButtonChildView iconView = getIconView();
        int i12 = WhenMappings.$EnumSwitchMapping$0[dto.getSize().ordinal()];
        if (i12 == 1) {
            i11 = 24;
        } else if (i12 == 2) {
            i11 = 16;
        } else if (i12 == 3) {
            i11 = 10;
        } else if (i12 == 4) {
            i11 = 8;
        } else {
            if (i12 != 5) {
                throw new o();
            }
            i11 = 6;
        }
        SocialButtonView.decorate$default(this, iconView, 17, ResourceExtKt.toPx(i11), false, 4, null);
        iconView.setStyle(dto.getStyle(), dto.getCornerStyle(), dto.getSize());
        iconView.setSocialIcon(dto.getIcon());
        setStyle(dto.getStyle(), dto.getCornerStyle(), dto.getSize());
    }

    public /* synthetic */ SocialIconButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialIconButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
