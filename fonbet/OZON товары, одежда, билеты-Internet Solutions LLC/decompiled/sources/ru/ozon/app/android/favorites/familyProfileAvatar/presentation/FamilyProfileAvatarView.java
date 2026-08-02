package ru.ozon.app.android.favorites.familyProfileAvatar.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0016\u001a\u00020\u0010J\b\u0010\u0017\u001a\u00020\u0018H\u0002R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/favorites/familyProfileAvatar/presentation/FamilyProfileAvatarView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "avatar", "Lru/ozon/uni/android/atom/icon/IconView;", "getAvatar", "()Lru/ozon/uni/android/atom/icon/IconView;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitle", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "subtitle", "getSubtitle", "createAndGetSubtitle", "createLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FamilyProfileAvatarView extends LinearLayout {

    @NotNull
    private final IconView avatar;
    private TextAtomV2View subtitle;

    @NotNull
    private final TextAtomV2View title;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int DP_8 = UiExtKt.toPx(8);
    private static final int DP_16 = UiExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/favorites/familyProfileAvatar/presentation/FamilyProfileAvatarView$Companion;", "", "<init>", "()V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ FamilyProfileAvatarView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final LinearLayout.LayoutParams createLayoutParams() {
        return new LinearLayout.LayoutParams(-1, -2);
    }

    @NotNull
    public final TextAtomV2View createAndGetSubtitle() {
        TextAtomV2View textAtomV2View = this.subtitle;
        if (textAtomV2View != null) {
            return textAtomV2View;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        LinearLayout.LayoutParams createLayoutParams = createLayoutParams();
        int i11 = DP_16;
        createLayoutParams.setMargins(i11, DP_8, i11, 0);
        textAtomV2View2.setLayoutParams(createLayoutParams);
        addView(textAtomV2View2);
        this.subtitle = textAtomV2View2;
        return textAtomV2View2;
    }

    @NotNull
    public final IconView getAvatar() {
        return this.avatar;
    }

    public final TextAtomV2View getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtomV2View getTitle() {
        return this.title;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyProfileAvatarView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        IconView iconView = new IconView(context, null, 0, 6, null);
        LinearLayout.LayoutParams createLayoutParams = createLayoutParams();
        int i13 = DP_16;
        createLayoutParams.setMargins(0, 0, 0, i13);
        createLayoutParams.gravity = 1;
        iconView.setLayoutParams(createLayoutParams);
        this.avatar = iconView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        LinearLayout.LayoutParams createLayoutParams2 = createLayoutParams();
        createLayoutParams2.setMargins(i13, i13, i13, 0);
        textAtomV2View.setLayoutParams(createLayoutParams2);
        this.title = textAtomV2View;
        setOrientation(1);
        addView(iconView);
        addView(textAtomV2View);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
    }
}
