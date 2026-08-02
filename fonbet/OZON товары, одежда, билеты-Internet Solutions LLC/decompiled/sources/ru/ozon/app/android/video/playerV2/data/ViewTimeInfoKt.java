package ru.ozon.app.android.video.playerV2.data;

import Sc.InterfaceC4008j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LSc/j;", "Lru/ozon/app/android/video/playerV2/data/ViewTimeInfoCollector;", "", "resetIfInitialized", "(LSc/j;)V", "video_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ViewTimeInfoKt {
    public static final void resetIfInitialized(@NotNull InterfaceC4008j<ViewTimeInfoCollector> interfaceC4008j) {
        Intrinsics.checkNotNullParameter(interfaceC4008j, "<this>");
        if (interfaceC4008j.isInitialized()) {
            interfaceC4008j.getValue().resetData();
        }
    }
}
