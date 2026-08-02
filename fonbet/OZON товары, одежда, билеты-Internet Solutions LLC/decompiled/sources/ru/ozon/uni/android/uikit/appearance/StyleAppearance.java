package ru.ozon.uni.android.uikit.appearance;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.appearance.background.BackgroundAppearance;
import ru.ozon.uni.android.uikit.appearance.dimensions.MarginAppearance;
import ru.ozon.uni.android.uikit.appearance.dimensions.PaddingAppearance;
import ru.ozon.uni.android.uikit.appearance.dimensions.SizeAppearance;
import ru.ozon.uni.android.uikit.appearance.text.FontAppearance;
import ru.ozon.uni.android.uikit.appearance.text.TextAppearance;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u0000 \r*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\rJ\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH&J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "T", "Landroid/view/View;", "", "read", "", "context", "Landroid/content/Context;", "resId", "", "apply", "view", "(Landroid/view/View;)V", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface StyleAppearance<T extends View> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010!\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0001\u0010\u0006*\u00020\u00072 \b\u0002\u0010\b\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\t\"\b\u0012\u0004\u0012\u0002H\u00060\u0005¢\u0006\u0002\u0010\nJ=\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0001\u0010\u0006*\u00020\f2 \b\u0002\u0010\b\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\t\"\b\u0012\u0004\u0012\u0002H\u00060\u0005¢\u0006\u0002\u0010\nJ\"\u0010\r\u001a\u00020\u000e\"\b\b\u0001\u0010\u0006*\u00020\u0007*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\u000fH\u0002J\"\u0010\u0010\u001a\u00020\u000e\"\b\b\u0001\u0010\u0006*\u00020\f*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\u000fH\u0002¨\u0006\u0011"}, d2 = {"Lru/ozon/uni/android/uikit/appearance/StyleAppearance$Companion;", "", "<init>", "()V", "of", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "T", "Landroid/view/View;", "appearances", "", "([Lru/ozon/uni/android/uikit/appearance/StyleAppearance;)Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "ofText", "Landroid/widget/TextView;", "addDefaultAppearances", "", "", "addTextAppearances", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        public final <T extends View> StyleAppearance<T> of(@NotNull StyleAppearance<T>... appearances) {
            Intrinsics.checkNotNullParameter(appearances, "appearances");
            ArrayList arrayList = new ArrayList();
            for (StyleAppearance<T> styleAppearance : appearances) {
                arrayList.add(styleAppearance);
            }
            addDefaultAppearances(arrayList);
            return new ProxyAttributeAppearance(arrayList);
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

    void apply(@NotNull T view);

    void read(@NotNull Context context, int resId);
}
