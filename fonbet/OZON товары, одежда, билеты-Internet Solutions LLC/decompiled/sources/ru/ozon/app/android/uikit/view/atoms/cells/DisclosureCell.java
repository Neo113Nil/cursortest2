package ru.ozon.app.android.uikit.view.atoms.cells;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.core.UniColors;

@InterfaceC3999a
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/cells/DisclosureCell;", "", "disclosureImageView", "Landroid/widget/ImageView;", "getDisclosureImageView", "()Landroid/widget/ImageView;", "hideDisclosure", "", "hide", "", "setDisclosureTintColor", "color", "", "Companion", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DisclosureCell {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/cells/DisclosureCell$Companion;", "", "<init>", "()V", "DEFAULT_DISCLOSURE_TINT_COLOR", "", "getDEFAULT_DISCLOSURE_TINT_COLOR", "()Ljava/lang/String;", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final String DEFAULT_DISCLOSURE_TINT_COLOR = UniColors.GRAPHIC_TERTIARY.getToken();

        private Companion() {
        }

        @NotNull
        public final String getDEFAULT_DISCLOSURE_TINT_COLOR() {
            return DEFAULT_DISCLOSURE_TINT_COLOR;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void hideDisclosure(@NotNull DisclosureCell disclosureCell, boolean z11) {
            disclosureCell.getDisclosureImageView().setVisibility(z11 ? 8 : 0);
        }

        public static void setDisclosureTintColor(@NotNull DisclosureCell disclosureCell, @NotNull String color) {
            Intrinsics.checkNotNullParameter(color, "color");
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = disclosureCell.getDisclosureImageView().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, color);
            if (parseColor != null) {
                ThemeExtKt.tint(disclosureCell.getDisclosureImageView(), Integer.valueOf(parseColor.intValue()));
            }
        }
    }

    @NotNull
    ImageView getDisclosureImageView();

    void hideDisclosure(boolean hide);

    void setDisclosureTintColor(@NotNull String color);
}
