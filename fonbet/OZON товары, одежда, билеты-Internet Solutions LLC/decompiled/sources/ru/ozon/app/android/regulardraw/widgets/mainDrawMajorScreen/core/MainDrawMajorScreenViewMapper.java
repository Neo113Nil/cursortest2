package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.core;

import A00.a;
import android.view.View;
import com.squareup.moshi.j;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.regulardraw.R$layout;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenDTO;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.di.MainDrawMajorScreenComponent;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001,B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R&\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR<\u0010$\u001a$\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\"j\b\u0012\u0004\u0012\u00020\u0004`#0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/core/MainDrawMajorScreenViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/di/MainDrawMajorScreenComponent;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenDTO;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO;)Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/core/MainDrawMajorScreenViewMapper$MainDrawMajorScreenUpdateKey;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/core/MainDrawMajorScreenMapper;", "getMapper", "()Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/core/MainDrawMajorScreenMapper;", "mapper", "MainDrawMajorScreenUpdateKey", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MainDrawMajorScreenViewMapper extends WidgetViewMapper2<MainDrawMajorScreenComponent, MainDrawMajorScreenDTO, MainDrawMajorScreenVO> {
    private final int layout = R$layout.widget_main_draw_major_screen;

    @NotNull
    private final List<Class<MainDrawMajorScreenUpdateKey>> supportedUpdates = C7714v.a0(MainDrawMajorScreenUpdateKey.class);

    @NotNull
    private final Function2<View, ComposerReferences, k<MainDrawMajorScreenVO>> holderProducer = new MainDrawMajorScreenViewMapper$holderProducer$1(this);

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/core/MainDrawMajorScreenViewMapper$MainDrawMajorScreenUpdateKey;", "LA00/a$J$a;", "", "percent", "", "text", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/core/MainDrawMajorScreenViewMapper$MainDrawMajorScreenUpdateKey;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPercent", "Ljava/lang/String;", "getText", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MainDrawMajorScreenUpdateKey implements a.J.InterfaceC0007a {
        public static final int $stable = 0;
        private final int percent;

        @NotNull
        private final String text;

        public MainDrawMajorScreenUpdateKey(int i11, @NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.percent = i11;
            this.text = text;
        }

        public static /* synthetic */ MainDrawMajorScreenUpdateKey copy$default(MainDrawMajorScreenUpdateKey mainDrawMajorScreenUpdateKey, int i11, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = mainDrawMajorScreenUpdateKey.percent;
            }
            if ((i12 & 2) != 0) {
                str = mainDrawMajorScreenUpdateKey.text;
            }
            return mainDrawMajorScreenUpdateKey.copy(i11, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPercent() {
            return this.percent;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final MainDrawMajorScreenUpdateKey copy(int percent, @NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new MainDrawMajorScreenUpdateKey(percent, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MainDrawMajorScreenUpdateKey)) {
                return false;
            }
            MainDrawMajorScreenUpdateKey mainDrawMajorScreenUpdateKey = (MainDrawMajorScreenUpdateKey) other;
            return this.percent == mainDrawMajorScreenUpdateKey.percent && Intrinsics.d(this.text, mainDrawMajorScreenUpdateKey.text);
        }

        public final int getPercent() {
            return this.percent;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (Integer.hashCode(this.percent) * 31);
        }

        @NotNull
        public String toString() {
            return Nh.a.c(this.percent, "MainDrawMajorScreenUpdateKey(percent=", ", text=", this.text, ")");
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<MainDrawMajorScreenVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<MainDrawMajorScreenUpdateKey>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<MainDrawMajorScreenComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return MainDrawMajorScreenComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public MainDrawMajorScreenMapper getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public MainDrawMajorScreenVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull MainDrawMajorScreenVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof MainDrawMajorScreenUpdateKey)) {
            return oldItem;
        }
        MainDrawMajorScreenUpdateKey mainDrawMajorScreenUpdateKey = (MainDrawMajorScreenUpdateKey) update;
        return MainDrawMajorScreenVO.copy$default(oldItem, 0L, null, null, null, oldItem.getProgressBlock().updateProgressData(mainDrawMajorScreenUpdateKey.getPercent(), mainDrawMajorScreenUpdateKey.getText()), null, null, null, 239, null);
    }
}
