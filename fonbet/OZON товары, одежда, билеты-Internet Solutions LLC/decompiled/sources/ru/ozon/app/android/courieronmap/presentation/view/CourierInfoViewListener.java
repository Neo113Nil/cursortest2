package ru.ozon.app.android.courieronmap.presentation.view;

import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005H&J!\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/courieronmap/presentation/view/CourierInfoViewListener;", "", "getHeaderHeight", "", "getCallCourierContainerParams", "Lkotlin/Pair;", "setPositionToCourierContainer", "", "x", "", "y", "(Ljava/lang/Float;Ljava/lang/Float;)V", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CourierInfoViewListener {
    @NotNull
    Pair<Integer, Integer> getCallCourierContainerParams();

    int getHeaderHeight();

    void setPositionToCourierContainer(Float x11, Float y11);
}
