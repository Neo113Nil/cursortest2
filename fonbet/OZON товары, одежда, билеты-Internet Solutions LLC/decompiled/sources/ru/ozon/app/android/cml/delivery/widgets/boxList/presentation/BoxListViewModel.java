package ru.ozon.app.android.cml.delivery.widgets.boxList.presentation;

import android.os.Parcelable;
import androidx.lifecycle.w0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.data.PreorderParamsStore;
import ru.ozon.app.android.cml.delivery.molecules.boxCard.presentation.BoxCardVO;
import ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.model.BoxListVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR(\u0010\u001d\u001a\u0004\u0018\u00010\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010!\u001a\u0004\b\n\u0010\"\"\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010!¨\u0006-"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/BoxListViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "setInitiallySelectedBoxId", "onCleared", "Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/model/BoxListVO;", "item", "", "isEditMode", "init", "(Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/model/BoxListVO;Z)V", "Landroid/os/Parcelable;", "state", "saveScrollState", "(Landroid/os/Parcelable;)V", "", "id", "setSelectedBoxId", "(Ljava/lang/String;)V", "", "getLastSelectedBoxIndex", "()Ljava/lang/Integer;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "handleAction", "(Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/uni/atoms/af/AtomAction;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "scrollState", "Landroid/os/Parcelable;", "getScrollState", "()Landroid/os/Parcelable;", "Z", "()Z", "setEditMode", "(Z)V", "selectedBoxId", "Ljava/lang/String;", "", "Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardVO;", "boxCards", "Ljava/util/List;", "isViewModelInitialized", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BoxListViewModel extends w0 {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private List<BoxCardVO> boxCards = K.f71697a;
    private boolean isEditMode;
    private boolean isViewModelInitialized;
    private Parcelable scrollState;
    private String selectedBoxId;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/BoxListViewModel$Companion;", "", "<init>", "()V", "KEY_ID", "", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final void setInitiallySelectedBoxId() {
        Object obj;
        Object obj2;
        String str = null;
        if (this.isEditMode) {
            String selectedBoxId = PreorderParamsStore.INSTANCE.getSelectedBoxId();
            if (selectedBoxId == null) {
                Iterator<T> it = this.boxCards.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (((BoxCardVO) obj2).getIsSelected()) {
                            break;
                        }
                    }
                }
                BoxCardVO boxCardVO = (BoxCardVO) obj2;
                if (boxCardVO != null) {
                    str = boxCardVO.getId();
                }
            } else {
                str = selectedBoxId;
            }
        } else {
            Iterator<T> it2 = this.boxCards.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (((BoxCardVO) obj).getIsSelected()) {
                        break;
                    }
                }
            }
            BoxCardVO boxCardVO2 = (BoxCardVO) obj;
            if (boxCardVO2 != null) {
                str = boxCardVO2.getId();
            }
        }
        this.selectedBoxId = str;
    }

    public final Integer getLastSelectedBoxIndex() {
        Iterator<BoxCardVO> it = this.boxCards.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (Intrinsics.d(it.next().getId(), this.selectedBoxId)) {
                break;
            }
            i11++;
        }
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public final Parcelable getScrollState() {
        return this.scrollState;
    }

    @NotNull
    public final AtomAction handleAction(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof AtomAction.ComposerAction)) {
            return action;
        }
        AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
        Map<String, String> params = composerAction.getParams();
        LinkedHashMap u11 = params != null ? U.u(params) : new LinkedHashMap();
        String str = this.selectedBoxId;
        if (str != null) {
            u11.put("boxId", str);
        }
        return AtomAction.ComposerAction.copy$default(composerAction, null, null, u11, null, null, 27, null);
    }

    public final void init(@NotNull BoxListVO item, boolean isEditMode) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.boxCards = item.getBoxList();
        this.isEditMode = isEditMode;
        if (this.isViewModelInitialized) {
            return;
        }
        this.isViewModelInitialized = true;
        setInitiallySelectedBoxId();
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
    }

    public final void saveScrollState(Parcelable state) {
        this.scrollState = state;
    }

    public final void setSelectedBoxId(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.selectedBoxId = id2;
    }
}
