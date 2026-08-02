package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.actionhandler;

import Nh.a;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.di.MainDrawMajorScreenComponent;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.presentation.MainDrawMajorScreenViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/actionhandler/MainDrawMajorScreenProgressUpdateActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lxe/B0;", "job", "Lxe/B0;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "MainDrawMajorScreenDTO", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MainDrawMajorScreenProgressUpdateActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final ActionV2Repository actionV2Repository;
    private B0 job;
    public static final int $stable = 8;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/actionhandler/MainDrawMajorScreenProgressUpdateActionHandler$MainDrawMajorScreenDTO;", "", "percent", "", "text", "", "<init>", "(ILjava/lang/String;)V", "getPercent", "()I", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class MainDrawMajorScreenDTO {
        public static final int $stable = 0;
        private final int percent;

        @NotNull
        private final String text;

        public MainDrawMajorScreenDTO(int i11, @NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.percent = i11;
            this.text = text;
        }

        public static /* synthetic */ MainDrawMajorScreenDTO copy$default(MainDrawMajorScreenDTO mainDrawMajorScreenDTO, int i11, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = mainDrawMajorScreenDTO.percent;
            }
            if ((i12 & 2) != 0) {
                str = mainDrawMajorScreenDTO.text;
            }
            return mainDrawMajorScreenDTO.copy(i11, str);
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
        public final MainDrawMajorScreenDTO copy(int percent, @NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new MainDrawMajorScreenDTO(percent, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MainDrawMajorScreenDTO)) {
                return false;
            }
            MainDrawMajorScreenDTO mainDrawMajorScreenDTO = (MainDrawMajorScreenDTO) other;
            return this.percent == mainDrawMajorScreenDTO.percent && Intrinsics.d(this.text, mainDrawMajorScreenDTO.text);
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
            return a.c(this.percent, "MainDrawMajorScreenDTO(percent=", ", text=", this.text, ")");
        }
    }

    public MainDrawMajorScreenProgressUpdateActionHandler(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        this.actionId = "getMainDrawProgress";
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull final CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.ComposerAction) {
            MainDrawMajorScreenViewModel mainDrawMajorScreenViewModel = (MainDrawMajorScreenViewModel) new z0(handlerRefs.getRefs().getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.actionhandler.MainDrawMajorScreenProgressUpdateActionHandler$processAction$$inlined$viewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    MainDrawMajorScreenViewModel mainDrawMajorScreenViewModel2 = ((MainDrawMajorScreenComponent) CustomActionHandler.HandlerReferences.this.getRefs().getWidgetComponent(MainDrawMajorScreenComponent.class)).getMainDrawMajorScreenViewModel();
                    Intrinsics.g(mainDrawMajorScreenViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return mainDrawMajorScreenViewModel2;
                }
            }).a(MainDrawMajorScreenViewModel.class);
            B0 b02 = this.job;
            if (b02 != null) {
                b02.j(null);
            }
            this.job = C10727i.c(K.a(handlerRefs.getRefs().getContainer().g()), null, null, new MainDrawMajorScreenProgressUpdateActionHandler$processAction$1(this, action, mainDrawMajorScreenViewModel, handlerRefs, null), 3);
        }
    }
}
