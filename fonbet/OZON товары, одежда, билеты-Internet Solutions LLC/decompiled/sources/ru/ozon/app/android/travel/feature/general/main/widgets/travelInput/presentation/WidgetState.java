package ru.ozon.app.android.travel.feature.general.main.widgets.travelInput.presentation;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u001f\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelInput/presentation/WidgetState;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelInput/presentation/TravelInputVI;", "data", "", "inputText", "<init>", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelInput/presentation/TravelInputVI;Ljava/lang/String;)V", "copy", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelInput/presentation/TravelInputVI;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/main/widgets/travelInput/presentation/WidgetState;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelInput/presentation/TravelInputVI;", "getData", "()Lru/ozon/app/android/travel/feature/general/main/widgets/travelInput/presentation/TravelInputVI;", "Ljava/lang/String;", "getInputText", "Lkotlin/Pair;", "getCaptionNumbers", "()Lkotlin/Pair;", "captionNumbers", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class WidgetState {
    private final TravelInputVI data;

    @NotNull
    private final String inputText;

    /* JADX WARN: Multi-variable type inference failed */
    public WidgetState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WidgetState copy$default(WidgetState widgetState, TravelInputVI travelInputVI, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            travelInputVI = widgetState.data;
        }
        if ((i11 & 2) != 0) {
            str = widgetState.inputText;
        }
        return widgetState.copy(travelInputVI, str);
    }

    @NotNull
    public final WidgetState copy(TravelInputVI data, @NotNull String inputText) {
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        return new WidgetState(data, inputText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetState)) {
            return false;
        }
        WidgetState widgetState = (WidgetState) other;
        return Intrinsics.d(this.data, widgetState.data) && Intrinsics.d(this.inputText, widgetState.inputText);
    }

    public final Pair<Integer, Integer> getCaptionNumbers() {
        CommonInputV2VO.TextInputV2 input;
        CommonInputV2VO.TextInputV2 input2;
        TravelInputVI travelInputVI = this.data;
        Integer maxLength = (travelInputVI == null || (input2 = travelInputVI.getInput()) == null) ? null : input2.getMaxLength();
        TravelInputVI travelInputVI2 = this.data;
        boolean d11 = (travelInputVI2 == null || (input = travelInputVI2.getInput()) == null) ? false : Intrinsics.d(input.getShowMaxLengthCounter(), Boolean.TRUE);
        if (maxLength == null || !d11) {
            return null;
        }
        return new Pair<>(Integer.valueOf(this.inputText.length()), maxLength);
    }

    public final TravelInputVI getData() {
        return this.data;
    }

    @NotNull
    public final String getInputText() {
        return this.inputText;
    }

    public int hashCode() {
        TravelInputVI travelInputVI = this.data;
        return this.inputText.hashCode() + ((travelInputVI == null ? 0 : travelInputVI.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "WidgetState(data=" + this.data + ", inputText=" + this.inputText + ")";
    }

    public WidgetState(TravelInputVI travelInputVI, @NotNull String inputText) {
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        this.data = travelInputVI;
        this.inputText = inputText;
    }

    public /* synthetic */ WidgetState(TravelInputVI travelInputVI, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : travelInputVI, (i11 & 2) != 0 ? "" : str);
    }
}
