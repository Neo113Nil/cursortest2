package eb0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f62104a;

    public static final class a {
        public a() {
            Intrinsics.checkNotNullParameter("HostConfig.ResetConfigs.Dialog.PositiveButton", "positiveButtonLocator");
            Intrinsics.checkNotNullParameter("HostConfig.ResetConfigs.Dialog.NegativeButton", "negativeButtonLocator");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 684951132;
        }

        @NotNull
        public final String toString() {
            return "TestInfoVO(positiveButtonLocator=HostConfig.ResetConfigs.Dialog.PositiveButton, negativeButtonLocator=HostConfig.ResetConfigs.Dialog.NegativeButton)";
        }
    }

    public f(@NotNull a testInfo) {
        Intrinsics.checkNotNullParameter("Reset Configs", SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullParameter("Все выставленные пользовательские значения будут сброшены\nДля применения изменений потребуется перезапуск приложения", "text");
        Intrinsics.checkNotNullParameter("Ок", "positiveButtonText");
        Intrinsics.checkNotNullParameter("Отменить", "negativeButtonText");
        Intrinsics.checkNotNullParameter(testInfo, "testInfo");
        this.f62104a = testInfo;
    }

    @NotNull
    public final a a() {
        return this.f62104a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        fVar.getClass();
        return this.f62104a.equals(fVar.f62104a);
    }

    public final int hashCode() {
        return -1878532004;
    }

    @NotNull
    public final String toString() {
        return "ResetConfigDialogVO(title=Reset Configs, text=Все выставленные пользовательские значения будут сброшены\nДля применения изменений потребуется перезапуск приложения, positiveButtonText=Ок, negativeButtonText=Отменить, testInfo=" + this.f62104a + ")";
    }
}
