package ru.ozon.android.uikit.appearance;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.uikit.appearance.background.BackgroundAppearance;
import ru.ozon.android.uikit.appearance.dimensions.MarginAppearance;
import ru.ozon.android.uikit.appearance.dimensions.PaddingAppearance;
import ru.ozon.android.uikit.appearance.dimensions.SizeAppearance;
import ru.ozon.android.uikit.appearance.text.FontAppearance;
import ru.ozon.android.uikit.appearance.text.TextAppearance;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u0004*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/android/uikit/appearance/StyleAppearance;", "Landroid/view/View;", "T", "", "Companion", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface StyleAppearance<T extends View> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b\"\b\b\u0001\u0010\u0005*\u00020\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\u00020\b\"\b\b\u0001\u0010\u0005*\u00020\u000b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ?\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0001\u0010\u0005*\u00020\u000b2 \b\u0002\u0010\u000e\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\r\"\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/android/uikit/appearance/StyleAppearance$Companion;", "", "<init>", "()V", "Landroid/view/View;", "T", "", "Lru/ozon/android/uikit/appearance/StyleAppearance;", "", "addDefaultAppearances", "(Ljava/util/List;)V", "Landroid/widget/TextView;", "addTextAppearances", "", "appearances", "ofText", "([Lru/ozon/android/uikit/appearance/StyleAppearance;)Lru/ozon/android/uikit/appearance/StyleAppearance;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        private final <T extends View> void addDefaultAppearances(List<StyleAppearance<T>> list) {
            list.add(new MarginAppearance());
            list.add(new PaddingAppearance());
            list.add(new SizeAppearance());
            list.add(new BackgroundAppearance());
        }

        private final <T extends TextView> void addTextAppearances(List<StyleAppearance<T>> list) {
            list.add(new FontAppearance());
            list.add(new TextAppearance());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StyleAppearance ofText$default(Companion companion, StyleAppearance[] styleAppearanceArr, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                styleAppearanceArr = new StyleAppearance[0];
            }
            return companion.ofText(styleAppearanceArr);
        }

        @NotNull
        public final <T extends TextView> StyleAppearance<T> ofText(@NotNull StyleAppearance<T>... appearances) {
            Intrinsics.checkNotNullParameter(appearances, "appearances");
            ArrayList arrayList = new ArrayList();
            for (StyleAppearance<T> styleAppearance : appearances) {
                arrayList.add(styleAppearance);
            }
            addDefaultAppearances(arrayList);
            addTextAppearances(arrayList);
            return new ProxyAttributeAppearance(arrayList);
        }
    }
}
