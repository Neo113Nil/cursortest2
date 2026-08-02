package td0;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellView;
import ru.ozon.uni.android.cell.selection.checkbox.CheckboxTitleSubtitleCellView;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.controls.button.UncontainedButtonView;

/* renamed from: td0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9861a {
    public static final void a(@NotNull View view, @NotNull String locator) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(locator, "locator");
        view.setContentDescription(locator);
    }

    public static final void b(@NotNull TitleSubtitleCellView titleSubtitleCellView, @NotNull String baseLocator) {
        Intrinsics.checkNotNullParameter(titleSubtitleCellView, "<this>");
        Intrinsics.checkNotNullParameter(baseLocator, "baseLocator");
        a(titleSubtitleCellView.getMainView(), baseLocator + ".title");
        a(titleSubtitleCellView.getAddonView(), baseLocator + ".subtitle");
    }

    public static final void c(@NotNull CheckboxTitleSubtitleCellView checkboxTitleSubtitleCellView, @NotNull String baseLocator) {
        Intrinsics.checkNotNullParameter(checkboxTitleSubtitleCellView, "<this>");
        Intrinsics.checkNotNullParameter(baseLocator, "baseLocator");
        b(checkboxTitleSubtitleCellView.getMainView(), baseLocator);
        a(checkboxTitleSubtitleCellView.getAddonView(), baseLocator.concat(".checkbox"));
    }

    public static final void d(@NotNull TextFieldCellView textFieldCellView, @NotNull String baseLocator) {
        Intrinsics.checkNotNullParameter(textFieldCellView, "<this>");
        Intrinsics.checkNotNullParameter(baseLocator, "baseLocator");
        a(textFieldCellView.getAddonView(), baseLocator.concat(".label"));
    }

    public static final void e(@NotNull ButtonView buttonView, @NotNull String baseLocator) {
        Intrinsics.checkNotNullParameter(buttonView, "<this>");
        Intrinsics.checkNotNullParameter(baseLocator, "baseLocator");
        TitleSubtitleCellView mainView = buttonView.getMainView();
        a(mainView.getMainView(), baseLocator.concat(".title"));
        a(mainView.getAddonView(), baseLocator.concat(".subtitle"));
    }

    public static final void f(@NotNull UncontainedButtonView uncontainedButtonView, @NotNull String baseLocator) {
        Intrinsics.checkNotNullParameter(uncontainedButtonView, "<this>");
        Intrinsics.checkNotNullParameter(baseLocator, "baseLocator");
        TitleSubtitleCellView mainView = uncontainedButtonView.getMainView();
        a(mainView.getMainView(), baseLocator + ".title");
        a(mainView.getAddonView(), baseLocator + ".subtitle");
    }
}
